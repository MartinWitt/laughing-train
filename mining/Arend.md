# Arend 
 
# Bad smells
I found 1858 bad smells with 53 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 695 | false |
| AssignmentToMethodParameter | 323 | false |
| BoundedWildcard | 309 | false |
| PatternVariableCanBeUsed | 74 | false |
| SystemOutErr | 69 | false |
| EnhancedSwitchMigration | 41 | false |
| MissortedModifiers | 39 | false |
| AssignmentToForLoopParameter | 39 | false |
| UNUSED_IMPORT | 29 | false |
| RedundantFieldInitialization | 26 | false |
| ClassCanBeRecord | 25 | false |
| NonProtectedConstructorInAbstractClass | 20 | true |
| UtilityClassWithoutPrivateConstructor | 16 | true |
| EqualsAndHashcode | 14 | false |
| KeySetIterationMayUseEntrySet | 12 | false |
| SizeReplaceableByIsEmpty | 12 | true |
| RedundantMethodOverride | 12 | false |
| ObsoleteCollection | 10 | false |
| EmptyMethod | 8 | false |
| CommentedOutCode | 7 | false |
| ZeroLengthArrayInitialization | 7 | false |
| ClassNameSameAsAncestorName | 6 | false |
| ConstantValue | 5 | false |
| SimplifyStreamApiCallChains | 5 | false |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| EnumSwitchStatementWhichMissesCases | 4 | false |
| RedundantImplements | 4 | false |
| RedundantSuppression | 4 | false |
| AbstractClassNeverImplemented | 3 | false |
| NestedAssignment | 3 | false |
| SynchronizeOnThis | 3 | false |
| DataFlowIssue | 3 | false |
| NonStrictComparisonCanBeEquality | 3 | true |
| StaticCallOnSubclass | 2 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| NullableProblems | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| NonShortCircuitBoolean | 1 | false |
| SuspiciousListRemoveInLoop | 1 | false |
| TextBlockMigration | 1 | false |
| ConstantMathCall | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| IOResource | 1 | false |
| MismatchedJavadocCode | 1 | false |
| UnnecessaryFullyQualifiedName | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| AssignmentToLambdaParameter | 1 | false |
## RuleId[id=EnumSwitchStatementWhichMissesCases]
### EnumSwitchStatementWhichMissesCases
`switch (def.getKind()) { case FUNC -> myBuilder.append("\\func "); case FUNC_COCLAUSE ->...` statement on enum type 'org.arend.ext.concrete.definition.FunctionKind' misses cases: 'SFUNC', 'AXIOM', and 'CONS'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  public Void visitFunction(final Concrete.BaseFunctionDefinition def, Void ignored) {
    printIndent();
    switch (def.getKind()) {
      case FUNC -> myBuilder.append("\\func ");
      case FUNC_COCLAUSE -> myBuilder.append("| ");
      case CLASS_COCLAUSE -> myBuilder.append("\\default ");
      case TYPE -> myBuilder.append("\\type ");
      case LEMMA -> myBuilder.append("\\lemma ");
      case LEVEL -> myBuilder.append("\\use \\level ");
      case COERCE -> myBuilder.append("\\use \\coerce ");
      case INSTANCE -> myBuilder.append("\\instance ");
    }

    prettyPrintNameWithPrecedence(def.getData());
```

### EnumSwitchStatementWhichMissesCases
`switch (processDefCall(expression, param)) { case STOP: return true; case SKIP: retu...` statement on enum type 'org.arend.ext.core.expr.CoreExpression.FindAction' misses case 'CONTINUE'
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
    while (true) {
      expression = (ConCallExpression) it;
      switch (processDefCall(expression, param)) {
        case STOP: return true;
        case SKIP: return false;
      }

      for (Expression arg : expression.getDataTypeArguments()) {
```

### EnumSwitchStatementWhichMissesCases
`switch (processDefCall(expression, param)) { case STOP: return true; case SKIP: return f...` statement on enum type 'org.arend.ext.core.expr.CoreExpression.FindAction' misses case 'CONTINUE'
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitClassCall(ClassCallExpression expression, P param) {
    switch (processDefCall(expression, param)) {
      case STOP: return true;
      case SKIP: return false;
    }

    for (Expression impl : expression.getImplementedHere().values()) {
```

### EnumSwitchStatementWhichMissesCases
`switch (processDefCall(expression, param)) { case STOP: return true; case SKIP: brea...` statement on enum type 'org.arend.ext.core.expr.CoreExpression.FindAction' misses case 'CONTINUE'
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
    List<ConCallExpression> stack = new ArrayList<>();
    while (true) {
      switch (processDefCall(expression, param)) {
        case STOP: return true;
        case SKIP: break;
      }

      for (Expression arg : expression.getDataTypeArguments()) {
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `rToChar()` declared in class 'org.arend.typechecking.termination.BaseCallMatrix' but referenced via subclass 'org.arend.typechecking.termination.CallMatrix'
in `base/src/main/java/org/arend/typechecking/termination/RecursiveBehavior.java`
#### Snippet
```java
      labels.append(' ').append(label);
      CallMatrix.R r = behavior.get(i);
      values.append(StringFormat.rightPad(label.length() + 1, CallMatrix.rToChar(r)));
    }
    return labels.toString() + '\n' + values.toString();
```

### StaticCallOnSubclass
Static method `rleq()` declared in class 'org.arend.typechecking.termination.BaseCallMatrix' but referenced via subclass 'org.arend.typechecking.termination.CallMatrix'
in `base/src/main/java/org/arend/typechecking/termination/RecursiveBehavior.java`
#### Snippet
```java
    if (getLength() != r.getLength()) throw new IllegalArgumentException();
    for (int i = 0; i < getLength(); i++)
      if (!CallMatrix.rleq(behavior.get(i), r.behavior.get(i)))
        return false;
    return !this.equals(r) || initialCallMatrix.getCompositeLength() <= r.initialCallMatrix.getCompositeLength();
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `myGroup` from instance context
in `base/src/main/java/org/arend/prelude/PreludeLibrary.java`
#### Snippet
```java
      throw new IllegalStateException();
    }
    myGroup = group;
    myScope = CachingScope.make(LexicalScope.opened(group));
  }
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `myScope` from instance context
in `base/src/main/java/org/arend/prelude/PreludeLibrary.java`
#### Snippet
```java
    }
    myGroup = group;
    myScope = CachingScope.make(LexicalScope.opened(group));
  }

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `cli/src/main/java/org/arend/frontend/repl/action/LoadLibraryCommand.java`
#### Snippet
```java
  @Override
  public final void invoke(@NotNull String line, @NotNull CommonCliRepl api, @NotNull Supplier<@NotNull String> scanner) {
/*
    if (!FileUtils.isLibraryName(line)) {
      api.eprintln("[ERROR] `" + line + "` is not a valid library name.");
```

### CommentedOutCode
Commented out code (2 lines)
in `cli/src/main/java/org/arend/frontend/repl/CommonCliRepl.java`
#### Snippet
```java
    parser.removeErrorListeners();
    parser.addErrorListener(errorListener);
    // parser.addErrorListener(new DiagnosticErrorListener());
    // parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
    return parser;
```

### CommentedOutCode
Commented out code (11 lines)
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public LetExpression visitLet(LetExpression letExpression, Void params) {
    throw new IllegalStateException();
    /*
    List<LetClause> newClauses = new ArrayList<>(letExpression.getClauses().size());
    for (LetClause clause : letExpression.getClauses()) {
```

### CommentedOutCode
Commented out code (19 lines)
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  }

  /*
  private boolean compareIsoArgs(List<? extends Expression> list1, List<? extends Expression> list2, ExprSubstitution substitution) {
    DependentLink link = Prelude.ISO.getParameters();
```

### CommentedOutCode
Commented out code (104 lines)
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  /*
  private void visitWhere(Collection<? extends LegacyAbstract.Statement> statements) {
    myBuilder.append(" \\where {\n");
```

### CommentedOutCode
Commented out code (74 lines)
in `base/src/main/java/org/arend/typechecking/visitor/FindLevelParameters.java`
#### Snippet
```java
  }

  /*
  @Override
  public Boolean visitLam(LamExpression expression, Void param) {
```

### CommentedOutCode
Commented out code (6 lines)
in `base/src/main/java/org/arend/typechecking/visitor/SyntacticDesugarVisitor.java`
#### Snippet
```java
    else if (expression instanceof Concrete.NewExpression)
      convertNewAppHoles((Concrete.NewExpression) expression, parameters);
/*
    else if (expression instanceof Concrete.CaseExpression)
      convertCaseAppHoles((Concrete.CaseExpression) expression, parameters);
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `cli/src/main/java/org/arend/frontend/library/TimedLibraryManager.java`
#### Snippet
```java

public class TimedLibraryManager extends LibraryManager {
  private final Stack<Long> times = new Stack<>();

  public TimedLibraryManager(LibraryResolver libraryResolver, @Nullable InstanceProviderSet instanceProviderSet, ErrorReporter typecheckingErrorReporter, ErrorReporter libraryErrorReporter, DefinitionRequester definitionRequester) {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `cli/src/main/java/org/arend/frontend/library/TimedLibraryManager.java`
#### Snippet
```java

public class TimedLibraryManager extends LibraryManager {
  private final Stack<Long> times = new Stack<>();

  public TimedLibraryManager(LibraryResolver libraryResolver, @Nullable InstanceProviderSet instanceProviderSet, ErrorReporter typecheckingErrorReporter, ErrorReporter libraryErrorReporter, DefinitionRequester definitionRequester) {
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `base/src/main/java/org/arend/typechecking/order/BellmanFord.java`
#### Snippet
```java

  private int myIndex = 0;
  private final Stack<T> myStack = new Stack<>();
  private final Map<T, DefState> myVertices = new HashMap<>();

```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `base/src/main/java/org/arend/typechecking/order/BellmanFord.java`
#### Snippet
```java

  private int myIndex = 0;
  private final Stack<T> myStack = new Stack<>();
  private final Map<T, DefState> myVertices = new HashMap<>();

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `base/src/main/java/org/arend/typechecking/order/dependency/DependencyCollector.java`
#### Snippet
```java

    Set<TCReferable> updated = new HashSet<>();
    Stack<TCReferable> stack = new Stack<>();
    stack.push(definition);

```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `base/src/main/java/org/arend/typechecking/order/dependency/DependencyCollector.java`
#### Snippet
```java

    Set<TCReferable> updated = new HashSet<>();
    Stack<TCReferable> stack = new Stack<>();
    stack.push(definition);

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java

    if (!unBasedSet.isEmpty()) {
      Stack<InferenceLevelVariable> stack = new Stack<>();
      for (InferenceLevelVariable var : unBasedSet) {
        stack.push(var);
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java

    if (!unBasedSet.isEmpty()) {
      Stack<InferenceLevelVariable> stack = new Stack<>();
      for (InferenceLevelVariable var : unBasedSet) {
        stack.push(var);
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
      }
    } else {
      myContext = new Stack<>();
      myCoreClauses = nonIntervalClauses;
      elimTree = clausesToElimTree(nonIntervalClauses, 0, 0);
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  private final int myActualLevelSub;
  private boolean myOK;
  private Stack<Util.ClauseElem> myContext;
  private List<Pair<List<Util.ClauseElem>, Boolean>> myMissingClauses;
  private final List<? extends Concrete.FunctionClause> myClauses;
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `previewLoader.myLoadedModules.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/source/SourceLoader.java`
#### Snippet
```java
    myModuleScopeProvider = previewLoader.myModuleScopeProvider;

    for (ModulePath module : previewLoader.myLoadedModules.keySet())
      if (previewLoader.myLoadedModules.get(module) != SourceType.BINARY_FAIL)
        myLoadedModules.put(module, SourceType.RAW);
```

### KeySetIterationMayUseEntrySet
Iteration over `m1.matrixMap.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
    myWidth = m2.myWidth;

    for (Integer i : m1.matrixMap.keySet()) {
      HashMap<Integer, BaseCallMatrix.R> m1map = m1.matrixMap.get(i);
      for (Integer j : m1map.keySet()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `m1map.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
    for (Integer i : m1.matrixMap.keySet()) {
      HashMap<Integer, BaseCallMatrix.R> m1map = m1.matrixMap.get(i);
      for (Integer j : m1map.keySet()) {
        HashMap<Integer, BaseCallMatrix.R> m2map = m2.matrixMap.get(j);
        if (m2map != null) for (Map.Entry<Integer, R> e : m2map.entrySet()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `matrixMap.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
      if (this.equals(cm)) return R.Equal;
      if (this.getDomain() != cm.getDomain() || this.getCodomain() != cm.getCodomain()) throw new IllegalArgumentException();
      for (Integer i : matrixMap.keySet()) {
        HashMap<Integer, R> map = matrixMap.get(i);
        for (Integer j : map.keySet()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
      for (Integer i : matrixMap.keySet()) {
        HashMap<Integer, R> map = matrixMap.get(i);
        for (Integer j : map.keySet()) {
          R my = map.get(j);
          R theirs = cm.getValue(i, j);
```

### KeySetIterationMayUseEntrySet
Iteration over `oldGraph.keySet()` may be replaced with 'values()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
      newGraph = new HashMap<>();

      for (T vDom : oldGraph.keySet()) {
        HashMap<T, HashSet<BaseCallMatrix<T>>> outboundArrows = oldGraph.get(vDom);
        for (T vCodom : outboundArrows.keySet()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `outboundArrows.keySet()` may be replaced with 'values()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
      for (T vDom : oldGraph.keySet()) {
        HashMap<T, HashSet<BaseCallMatrix<T>>> outboundArrows = oldGraph.get(vDom);
        for (T vCodom : outboundArrows.keySet()) {
          for (BaseCallMatrix<T> edge : outboundArrows.get(vCodom)) {
            append(edge, newGraph);
```

### KeySetIterationMayUseEntrySet
Iteration over `oldGraph.keySet()` may be replaced with 'values()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
      }

      for (T vDom : oldGraph.keySet()) {
        HashMap<T, HashSet<BaseCallMatrix<T>>> outboundEdges = oldGraph.get(vDom);
        for (T vCodom : outboundEdges.keySet()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `outboundEdges.keySet()` may be replaced with 'values()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
      for (T vDom : oldGraph.keySet()) {
        HashMap<T, HashSet<BaseCallMatrix<T>>> outboundEdges = oldGraph.get(vDom);
        for (T vCodom : outboundEdges.keySet()) {
          for (BaseCallMatrix<T> arrow : outboundEdges.get(vCodom)) {
            HashMap<T, HashSet<BaseCallMatrix<T>>> outboundEdges2 = oldGraph.get(arrow.getCodomain());
```

### KeySetIterationMayUseEntrySet
Iteration over `myGraph.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
  public String toTestScenario(String edgeSetName) {
    StringBuilder result = new StringBuilder();
    for (T v : myGraph.keySet()) {
      String label = getLabel(v);
      String[] parameterLabels = null;
```

### KeySetIterationMayUseEntrySet
Iteration over `myGraph.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java

    Integer counter = 0;
    for (T v : myGraph.keySet()) {
      String domLabel = getLabel(v);
      for (T v2 : myGraph.get(v).keySet())
```

### KeySetIterationMayUseEntrySet
Iteration over `myGraph.keySet()` may be replaced with 'entrySet()' iteration
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (T vDom : myGraph.keySet()) {
      for (T vCodom : myGraph.get(vDom).keySet()) {
        result.append(getLabel(vDom)).append(" -> ").append(getLabel(vCodom)).append("\n ");
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`subPatterns.size() == 0` can be replaced with 'subPatterns.isEmpty()'
in `base/src/main/java/org/arend/core/pattern/Pattern.java`
#### Snippet
```java
    Definition def = getDefinition();
    List<? extends Pattern> subPatterns = getSubPatterns();
    return def == Prelude.ARRAY_CONS && subPatterns.size() == 2 ? def.getParameters().getNext().getNext() : def == Prelude.EMPTY_ARRAY && subPatterns.size() == 0 || def == Prelude.ARRAY_CONS && subPatterns.size() == 3 ? def.getParameters().getNext() : def != null ? def.getParameters() : EmptyDependentLink.getInstance();
  }

```

### SizeReplaceableByIsEmpty
`l.size() > 0` can be replaced with '!l.isEmpty()'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
    public void doPrettyPrint(PrettyPrintVisitor pp, List<? extends E> l, boolean disabled){
      if (disabled) {
        if (l.size() > 0) {
          printListElement(pp, l.get(0));
        }
```

### SizeReplaceableByIsEmpty
`rhs_strings.size() > 0` can be replaced with '!rhs_strings.isEmpty()'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

    boolean increaseIndent(List<String> rhs_strings) {
      return !(rhs_strings.size() > 0 && spacesCount(rhs_strings.get(0)) > 0 || rhs_strings.size() > 1 && spacesCount(rhs_strings.get(1)) > 0);
    }

```

### SizeReplaceableByIsEmpty
`def.getParameters().size() > 0` can be replaced with '!def.getParameters().isEmpty()'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
      @Override
      boolean printSpaceBefore() {
        return def.getParameters().size() > 0;
      }

```

### SizeReplaceableByIsEmpty
`def.getParameters().size() > 0` can be replaced with '!def.getParameters().isEmpty()'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
      @Override
      boolean printSpaceBefore() {
        return def.getParameters().size() > 0;
      }

```

### SizeReplaceableByIsEmpty
`tailBuilder.length() != 0` can be replaced with '!tailBuilder.isEmpty()'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
        boolean leftParamIsRecursive = explicitIndex == constructor.getRecursiveParameter();
        prec = visitBinOp(leftParamIsRecursive ? null : args.get(args.size() - 2).getExpression(), (Concrete.ReferenceExpression) expr.getFunction(), args.subList(0, args.size() - 2), leftParamIsRecursive ? args.get(args.size() - 1).getExpression() : null, prec, tailBuilder);
        if (tailBuilder.length() != 0) {
          if (tail == null) {
            tail = new ArrayList<>();
```

### SizeReplaceableByIsEmpty
`myBuilder.length() != 0` can be replaced with '!myBuilder.isEmpty()'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

  private void printClosingBrace() {
    if (myBuilder.length() != 0 && myBuilder.charAt(myBuilder.length() - 1) == '-') {
      myBuilder.append(' ');
    }
```

### SizeReplaceableByIsEmpty
`myBuilder.length() != 0` can be replaced with '!myBuilder.isEmpty()'
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
        }
      }
      if (!name.isEmpty() && name.charAt(0) == '-' && myBuilder.length() != 0 && myBuilder.charAt(myBuilder.length() - 1) == '{') {
        myBuilder.append(' ');
      }
```

### SizeReplaceableByIsEmpty
`patterns.size() > 0` can be replaced with '!patterns.isEmpty()'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    public UnparsedConstructorPattern(@Nullable Object data, boolean isExplicit, @NotNull List<BinOpSequenceElem<Pattern>> patterns, @Nullable TypedReferable asReferable) {
      super(data, asReferable);
      assert patterns.size() > 0;
      myUnparsedPatterns = List.copyOf(patterns);
      setExplicit(isExplicit);
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
            result.append(", '-'");
          }
          if (result.length() > 0) result.append(", ");
          if (value == R.Equal) result.append("'='"); else if (value == R.LessThan) result.append("'<'");
          result.append(", ").append(j);
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java

      if (!found) {
        if (result.length() > 0) result.append(", ");
        result.append("'?'");
      }
```

### SizeReplaceableByIsEmpty
`parameters.size() == 0` can be replaced with 'parameters.isEmpty()'
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  @Override
  public @NotNull CoreExpression makeLambda(@NotNull List<? extends CoreParameter> parameters, @NotNull CoreExpression body, @NotNull ConcreteSourceNode marker) {
    if (parameters.size() == 0) return body;
    if (!(body instanceof Expression && marker instanceof Concrete.SourceNode)) {
      throw new IllegalArgumentException();
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `myOnlySolveVars |= skipBoxed && link != null && link.getNextTyped(null).isProperty()`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      boolean oldVarsValue = myOnlySolveVars;
      try {
        myOnlySolveVars |= skipBoxed && link != null && link.getNextTyped(null).isProperty();
        boolean ok;
        if (link == null) {
```

## RuleId[id=SuspiciousListRemoveInLoop]
### SuspiciousListRemoveInLoop
Suspicious 'List.remove()' in loop
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
        if (shorterBehavior != null) {
          List<Integer> shorterIndices = new LinkedList<>(indices);
          shorterIndices.remove(i);
          List<Integer> termOrder = findTerminationOrder(shorterBehavior, shorterIndices);
          if (termOrder != null) {
```

## RuleId[id=TextBlockMigration]
### TextBlockMigration
Concatenation can be replaced with text block
in `base/src/main/java/org/arend/repl/action/NormalizeCommand.java`
#### Snippet
```java
  @Override
  public @Nls @NotNull String help(@NotNull Repl api) {
    return "Modify the normalization level of printed expressions.\n" +
        "Available options (case insensitive) are:\n" +
        " NULL (do not normalize)\n" +
```

## RuleId[id=ConstantMathCall]
### ConstantMathCall
Constant call to `round()` can be simplified
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
      if (ratio > 1.0) ratio = 1/ratio;

      int myMaxLen = (ratio > SMALL_RATIO) ? MAX_LEN : Math.round(MAX_LEN * (1 + SMALL_RATIO));

      return (leftLen + rightLen + getOpText().trim().length() + 1 > myMaxLen);
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `BaseCoreExpressionVisitor` has no concrete subclass
in `api/src/main/java/org/arend/ext/core/expr/BaseCoreExpressionVisitor.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public abstract class BaseCoreExpressionVisitor<P, R> implements CoreExpressionVisitor<P, R> {
  abstract protected R visit(CoreExpression expression, P param);

```

### AbstractClassNeverImplemented
Abstract class `SerializableKey` has no concrete subclass
in `api/src/main/java/org/arend/ext/serialization/SerializableKey.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public abstract class SerializableKey<T> extends Key<T> {
  protected SerializableKey(@NotNull String name) {
    super(name);
```

### AbstractClassNeverImplemented
Abstract class `SourceNodeImpl` has no concrete subclass
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java
  }

  public static abstract class SourceNodeImpl implements SourceNode {
    @NotNull
    @Override
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends ArendExtension`
in `api/src/main/java/org/arend/ext/DefaultArendExtension.java`
#### Snippet
```java

  @Override
  public void setDependencies(@NotNull Map<String, ArendExtension> dependencies) {
    this.dependencies = dependencies;
  }
```

### BoundedWildcard
Can generalize to `? super ArendRef`
in `api/src/main/java/org/arend/ext/error/LocalError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    if (definition != null) {
      consumer.accept(definition, this);
```

### BoundedWildcard
Can generalize to `? super GeneralError`
in `api/src/main/java/org/arend/ext/error/LocalError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    if (definition != null) {
      consumer.accept(definition, this);
```

### BoundedWildcard
Can generalize to `? super ArendRef`
in `api/src/main/java/org/arend/ext/error/GeneralError.java`
#### Snippet
```java
  }

  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    Object cause = getCause();
    if (cause instanceof ArendRef) {
```

### BoundedWildcard
Can generalize to `? super GeneralError`
in `api/src/main/java/org/arend/ext/error/GeneralError.java`
#### Snippet
```java
  }

  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    Object cause = getCause();
    if (cause instanceof ArendRef) {
```

### BoundedWildcard
Can generalize to `? extends @NotNull List`
in `cli/src/main/java/org/arend/frontend/repl/jline/ScopeCompleter.java`
#### Snippet
```java
  private final @NotNull Supplier<@NotNull List<Referable>> scopeSupplier;

  public ScopeCompleter(@NotNull Supplier<@NotNull List<Referable>> scopeSupplier) {
    this.scopeSupplier = scopeSupplier;
  }
```

### BoundedWildcard
Can generalize to `? extends Stream`
in `cli/src/main/java/org/arend/frontend/repl/jline/ImportCompleter.java`
#### Snippet
```java
  private final Supplier<Stream<String>> moduleSupplier;

  public ImportCompleter(@NotNull Supplier<Stream<String>> moduleSupplier) {
    this.moduleSupplier = moduleSupplier;
  }
```

### BoundedWildcard
Can generalize to `? super ArendRef`
in `cli/src/main/java/org/arend/frontend/parser/ParserError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    consumer.accept(new ModuleReferable(position.module), this);
  }
```

### BoundedWildcard
Can generalize to `? super GeneralError`
in `cli/src/main/java/org/arend/frontend/parser/ParserError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    consumer.accept(new ModuleReferable(position.module), this);
  }
```

### BoundedWildcard
Can generalize to `? extends SimpleNameRenaming`
in `cli/src/main/java/org/arend/frontend/group/SimpleNamespaceCommand.java`
#### Snippet
```java
  private final ChildGroup myParent;

  public SimpleNamespaceCommand(Position position, Kind kind, List<String> path, boolean isUsing, List<SimpleNameRenaming> openedReferences, List<Referable> hiddenReferences, ChildGroup parent) {
    myPosition = position;
    myKind = kind;
```

### BoundedWildcard
Can generalize to `? extends Referable`
in `cli/src/main/java/org/arend/frontend/group/SimpleNamespaceCommand.java`
#### Snippet
```java
  private final ChildGroup myParent;

  public SimpleNamespaceCommand(Position position, Kind kind, List<String> path, boolean isUsing, List<SimpleNameRenaming> openedReferences, List<Referable> hiddenReferences, ChildGroup parent) {
    myPosition = position;
    myKind = kind;
```

### BoundedWildcard
Can generalize to `? extends Path`
in `cli/src/main/java/org/arend/frontend/repl/jline/Completers.java`
#### Snippet
```java
    }

    public DirectoriesCompleter(Supplier<Path> currentDir, boolean forceSlash) {
      this.currentDir = currentDir;
      this.forceSlash = forceSlash;
```

### BoundedWildcard
Can generalize to `? extends Path`
in `cli/src/main/java/org/arend/frontend/repl/jline/Completers.java`
#### Snippet
```java
    }

    public FilesCompleter(Supplier<Path> currentDir, boolean forceSlash) {
      this.currentDir = currentDir;
      this.forceSlash = forceSlash;
```

### BoundedWildcard
Can generalize to `? extends @NotNull ModulePath`
in `cli/src/main/java/org/arend/frontend/repl/CommonCliRepl.java`
#### Snippet
```java
  }

  public final void loadModules(Collection<@NotNull ModulePath> modulePaths) {
    if (myModules.addAll(modulePaths))
      myLibraryManager.unloadLibrary(myReplLibrary);
```

### BoundedWildcard
Can generalize to `? super Constructor`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  }

  private static boolean addConstructor(Expression expr, Constructor constructor, GraphClosure<Constructor> closure) {
    if (expr == null) {
      return true;
```

### BoundedWildcard
Can generalize to `? super DependentLink`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  }

  public Expression getLamParameters(List<DependentLink> params) {
    Expression body = this;
    for (LamExpression lamBody = body.cast(LamExpression.class); lamBody != null; lamBody = body.cast(LamExpression.class)) {
```

### BoundedWildcard
Can generalize to `? super Expression`
in `base/src/main/java/org/arend/core/expr/AppExpression.java`
#### Snippet
```java

  @Override
  public Expression getArguments(List<Expression> args) {
    assert args.isEmpty();
    AppExpression app = this;
```

### BoundedWildcard
Can generalize to `? extends LetClausePattern`
in `base/src/main/java/org/arend/core/expr/let/TupleLetClausePattern.java`
#### Snippet
```java
  private final List<LetClausePattern> myPatterns;

  public TupleLetClausePattern(List<LetClausePattern> patterns) {
    myPatterns = patterns;
  }
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/core/expr/let/RecordLetClausePattern.java`
#### Snippet
```java
  private final List<ClassField> myFields;

  public RecordLetClausePattern(List<ClassField> fields, List<LetClausePattern> patterns) {
    super(patterns);
    myFields = fields;
```

### BoundedWildcard
Can generalize to `? super ConCallExpression`
in `base/src/main/java/org/arend/core/expr/DataCallExpression.java`
#### Snippet
```java
  }

  public boolean getMatchedConCall(Constructor constructor, List<ConCallExpression> conCalls) {
    if (constructor.getDataType() != getDefinition()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/core/expr/visitor/FieldsCollector.java`
#### Snippet
```java
  private final Map<FunctionDefinition, ClassField> myFunctions;

  private FieldsCollector(Binding thisParameter, Set<? extends ClassField> fields, Map<FunctionDefinition, ClassField> functions, Set<ClassField> result) {
    myThisBinding = thisParameter;
    myFields = fields;
```

### BoundedWildcard
Can generalize to `? super Expression`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  }

  private boolean visitDefCallArguments(List<? extends Expression> args, List<Expression> result) {
    for (Expression arg : args) {
      Expression newArg = acceptSelf(arg, true);
```

### BoundedWildcard
Can generalize to `? extends Level`
in `base/src/main/java/org/arend/core/subst/ListLevels.java`
#### Snippet
```java
  private final List<Level> myLevels;

  public ListLevels(List<Level> levels) {
    myLevels = levels;
  }
```

### BoundedWildcard
Can generalize to `? super Variable`
in `base/src/main/java/org/arend/core/subst/UnfoldVisitor.java`
#### Snippet
```java
  public enum UnfoldFields { ALL_FIELDS, ONLY_PARAMETERS, ONLY_SPECIFIED }

  public UnfoldVisitor(Set<? extends Variable> variables, Set<Variable> unfolded, boolean unfoldLet, UnfoldFields unfoldFields) {
    super(new ExprSubstitution(), LevelSubstitution.EMPTY);
    myVariables = variables;
```

### BoundedWildcard
Can generalize to `? extends K`
in `base/src/main/java/org/arend/core/context/Utils.java`
#### Snippet
```java
    private final Set<K> myOriginalSet;

    public SetContextSaver(Set<K> set) {
      mySet = set;
      myOriginalSet = new HashSet<>(mySet);
```

### BoundedWildcard
Can generalize to `? super String`
in `base/src/main/java/org/arend/core/context/param/TypedSingleDependentLink.java`
#### Snippet
```java

  @Override
  public TypedSingleDependentLink getNextTyped(List<String> names) {
    if (names != null) {
      names.add(getName());
```

### BoundedWildcard
Can generalize to `? super String`
in `base/src/main/java/org/arend/core/context/param/TypedDependentLink.java`
#### Snippet
```java

  @Override
  public TypedDependentLink getNextTyped(List<String> names) {
    if (names != null) {
      names.add(myName);
```

### BoundedWildcard
Can generalize to `? super String`
in `base/src/main/java/org/arend/core/context/param/UntypedDependentLink.java`
#### Snippet
```java

  @Override
  public TypedDependentLink getNextTyped(List<String> names) {
    DependentLink link = this;
    for (; link instanceof UntypedDependentLink; link = link.getNext()) {
```

### BoundedWildcard
Can generalize to `? super LevelVariable`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
  }

  private boolean matchLevels(Levels paramLevels, Levels argLevels, Map<LevelVariable, Level> levelMap) {
    List<? extends Level> paramList = paramLevels.toList();
    List<? extends Level> argList = argLevels.toList();
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
    }

    public static ExprSubstitution toSubstitution(List<DependentLink> links, List<? extends Expression> expressions) {
      ExprSubstitution result = new ExprSubstitution();
      for (int i = 0; i < Math.min(links.size(), expressions.size()); ++i) {
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
    }

    public static List<DependentLink> subst(List<DependentLink> links, ExprSubstitution exprSubst, LevelSubstitution levelSubst) {
      List<DependentLink> newLinks = new ArrayList<>();
      int i = 0;
```

### BoundedWildcard
Can generalize to `? extends CoreParameter`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java

  @Override
  default @NotNull CoreParameter insertParameters(@NotNull Map<CoreParameter, CoreParameter> map) {
    if (map.isEmpty()) return this;
    LinkList list = new LinkList();
```

### BoundedWildcard
Can generalize to `? super Pattern`
in `base/src/main/java/org/arend/core/pattern/BindingPattern.java`
#### Snippet
```java

  @Override
  public DependentLink replaceBindings(DependentLink link, List<Pattern> result) {
    result.add(new BindingPattern(link));
    return link.getNext();
```

### BoundedWildcard
Can generalize to `? super Expression`
in `base/src/main/java/org/arend/core/pattern/BindingPattern.java`
#### Snippet
```java

  @Override
  public Decision match(Expression expression, List<Expression> result) {
    if (result != null) {
      result.add(expression);
```

### BoundedWildcard
Can generalize to `? extends Concrete.Pattern`
in `base/src/main/java/org/arend/core/pattern/BindingPattern.java`
#### Snippet
```java

  @Override
  public Concrete.Pattern toConcrete(Object data, boolean isExplicit, Object constructorData, Map<DependentLink, Concrete.Pattern> subPatterns) {
    Concrete.Pattern subPattern = subPatterns.get(myBinding);
    if (subPattern != null && subPattern.isExplicit() != isExplicit) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionPattern`
in `base/src/main/java/org/arend/core/pattern/BindingPattern.java`
#### Snippet
```java

  @Override
  public ExpressionPattern subst(ExprSubstitution exprSubst, LevelSubstitution levelSubst, Map<DependentLink, ExpressionPattern> patternSubst) {
    if (patternSubst == null) {
      return this;
```

### BoundedWildcard
Can generalize to `? super Pattern`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java

      @Override
      public DependentLink replaceBindings(DependentLink link, List<Pattern> result) {
        List<Pattern> subPatterns = new ArrayList<>();
        result.add(make(data, subPatterns));
```

### BoundedWildcard
Can generalize to `? extends ExpressionPattern`
in `base/src/main/java/org/arend/core/pattern/EmptyPattern.java`
#### Snippet
```java

  @Override
  public ExpressionPattern subst(ExprSubstitution exprSubst, LevelSubstitution levelSubst, Map<DependentLink, ExpressionPattern> patternSubst) {
    if (patternSubst == null) {
      return this;
```

### BoundedWildcard
Can generalize to `? super Pattern`
in `base/src/main/java/org/arend/core/pattern/EmptyPattern.java`
#### Snippet
```java

  @Override
  public DependentLink replaceBindings(DependentLink link, List<Pattern> result) {
    result.add(new EmptyPattern(link));
    return link.getNext();
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/core/definition/ClassField.java`
#### Snippet
```java

  @Override
  public Expression getDefCall(Levels levels, List<Expression> args) {
    return FieldCallExpression.make(this, args.get(0));
  }
```

### BoundedWildcard
Can generalize to `? extends LevelVariable`
in `base/src/main/java/org/arend/core/definition/TopLevelDefinition.java`
#### Snippet
```java
  }

  public void setLevelParameters(List<LevelVariable> parameters) {
    myLevelParameters = parameters;
  }
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `base/src/main/java/org/arend/core/definition/TopLevelDefinition.java`
#### Snippet
```java
  }

  public void setParametersOriginalDefinitions(List<Pair<TCDefReferable,Integer>> definitions) {
    myParametersOriginalDefinitions = definitions;
  }
```

### BoundedWildcard
Can generalize to `? extends TopLevelDefinition`
in `base/src/main/java/org/arend/core/definition/DataDefinition.java`
#### Snippet
```java
  }

  public void setRecursiveDefinitions(Set<TopLevelDefinition> recursiveDefinitions) {
    myRecursiveDefinitions = recursiveDefinitions;
  }
```

### BoundedWildcard
Can generalize to `? extends ElimClause`
in `base/src/main/java/org/arend/core/elimtree/ElimBody.java`
#### Snippet
```java
  private final ElimTree myElimTree;

  public ElimBody(List<ElimClause<Pattern>> clauses, ElimTree elimTree) {
    myElimTree = elimTree;
    myClauses = clauses;
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/core/elimtree/ElimBody.java`
#### Snippet
```java
  }

  private static void computeRefinedPatterns(ElimTree elimTree, List<DependentLink> params, ExprSubstitution substitution, List<Util.ClauseElem> clauseElems, List<List<CorePattern>> result, LinkList linkList) {
    if (elimTree.getSkip() - 1 >= params.size()) {
      throw new IllegalArgumentException();
```

### BoundedWildcard
Can generalize to `? super List`
in `base/src/main/java/org/arend/core/elimtree/ElimBody.java`
#### Snippet
```java
  }

  private static void computeRefinedPatterns(ElimTree elimTree, List<DependentLink> params, ExprSubstitution substitution, List<Util.ClauseElem> clauseElems, List<List<CorePattern>> result, LinkList linkList) {
    if (elimTree.getSkip() - 1 >= params.size()) {
      throw new IllegalArgumentException();
```

### BoundedWildcard
Can generalize to `? super Pattern`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java

  @Override
  public DependentLink replaceBindings(DependentLink link, List<Pattern> result) {
    List<ExpressionPattern> subPatterns = new ArrayList<>();
    result.add(new ConstructorExpressionPattern(data, subPatterns));
```

### BoundedWildcard
Can generalize to `? extends TopLevelDefinition`
in `base/src/main/java/org/arend/core/definition/FunctionDefinition.java`
#### Snippet
```java
  }

  public void setRecursiveDefinitions(Set<TopLevelDefinition> recursiveDefinitions) {
    myRecursiveDefinitions = recursiveDefinitions;
  }
```

### BoundedWildcard
Can generalize to `? super TypecheckingResult`
in `base/src/main/java/org/arend/repl/Repl.java`
#### Snippet
```java
   * @see Repl#preprocessExpr(String)
   */
  public void checkExpr(@NotNull Concrete.Expression expr, @Nullable Expression expectedType, @NotNull Consumer<TypecheckingResult> continuation) {
    expr = DesugarVisitor.desugar(expr, myErrorReporter);
    if (checkErrors()) return;
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  }

  public void setGoodThisFields(Set<ClassField> goodThisFields) {
    myGoodThisFields = goodThisFields;
  }
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  }

  public void setTypeClassFields(Set<ClassField> typeClassFields) {
    myTypeClassParameters = typeClassFields;
  }
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  }

  public Integer getUseLevel(Map<ClassField,Expression> implemented, Binding thisBinding, boolean isStrict) {
    loop:
    for (ParametersLevel parametersLevel : myParametersLevels.getList()) {
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  }

  public Integer getUseLevel(Map<ClassField,Expression> implemented, Binding thisBinding, boolean isStrict) {
    loop:
    for (ParametersLevel parametersLevel : myParametersLevels.getList()) {
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  }

  public void addDefaultImplDependencies(ClassField field, Set<ClassField> dependencies) {
    myDefaultImplDependencies.computeIfAbsent(field, k -> new HashSet<>()).addAll(dependencies);
  }
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  }

  public void addDefaultDependencies(ClassField field, Set<ClassField> dependencies) {
    myDefaultDependencies.computeIfAbsent(field, k -> new HashSet<>()).addAll(dependencies);
  }
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
    }

    private boolean checkExpressionsTypesStrict(List<Expression> expressions) {
      if (strictList == null || expressions.size() != strictList.size()) {
        return false;
```

### BoundedWildcard
Can generalize to `? extends Statement`
in `base/src/main/java/org/arend/term/group/StaticGroup.java`
#### Snippet
```java
  private final ChildGroup myParent;

  public StaticGroup(LocatedReferable referable, List<Statement> statements, List<ParameterReferable> externalParameters, ChildGroup parent) {
    myReferable = referable;
    myStatements = statements;
```

### BoundedWildcard
Can generalize to `? extends ParameterReferable`
in `base/src/main/java/org/arend/term/group/StaticGroup.java`
#### Snippet
```java
  private final ChildGroup myParent;

  public StaticGroup(LocatedReferable referable, List<Statement> statements, List<ParameterReferable> externalParameters, ChildGroup parent) {
    myReferable = referable;
    myStatements = statements;
```

### BoundedWildcard
Can generalize to `? extends Concrete.LevelExpression`
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java
  }

  private void binLevelParameters(SubstConcreteVisitor subst, @Nullable List<Concrete.LevelExpression> levels, List<? extends LevelReferable> levelParameters) {
    if (levelParameters != null && levels != null) {
      for (int i = 0; i < levelParameters.size() && i < levels.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.Parameter`
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java
  public Concrete.@Nullable Expression body;

  public DefinableMetaDefinition(MetaReferable referable, Concrete.LevelParameters pLevelParameters, Concrete.LevelParameters hLevelParameters, List<Concrete.Parameter> parameters, Concrete.@Nullable Expression body) {
    myReferable = referable;
    this.pLevelParameters = pLevelParameters;
```

### BoundedWildcard
Can generalize to `? extends Concrete.FunctionClause`
in `base/src/main/java/org/arend/term/concrete/ReplaceDataVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.FunctionClause> visitFunctionClauses(List<Concrete.FunctionClause> clauses) {
    List<Concrete.FunctionClause> result = new ArrayList<>(clauses.size());
    for (Concrete.FunctionClause clause : clauses) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/term/concrete/FindLevelVariablesVisitor.java`
#### Snippet
```java
  private final Set<Referable> myReferables;

  public FindLevelVariablesVisitor(Set<Referable> referables) {
    myReferables = referables;
  }
```

### BoundedWildcard
Can generalize to `? super Concrete.ClassElement`
in `base/src/main/java/org/arend/term/abs/ConcreteBuilder.java`
#### Snippet
```java
  }

  public void buildClassParameters(Collection<? extends Abstract.FieldParameter> absParameters, Concrete.ClassDefinition classDef, List<Concrete.ClassElement> elements) {
    for (Abstract.FieldParameter absParameter : absParameters) {
      Concrete.Parameter parameter = buildParameter(absParameter, false, false);
```

### BoundedWildcard
Can generalize to `? super Expression`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
  }

  private ElimTree updateStack(Deque<Expression> stack, List<Expression> argList, BranchElimTree branchElimTree) {
    Expression argument = TypeConstructorExpression.unfoldExpression(stack.pop());
    ArrayExpression array = argument instanceof ArrayExpression ? (ArrayExpression) argument : null;
```

### BoundedWildcard
Can generalize to `? super Expression`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
  }

  private Expression addSucs(Expression arg1, List<Expression> defCallArgs, Expression result) {
    ConCallExpression conCall1 = arg1.cast(ConCallExpression.class);
    while (conCall1 != null && conCall1.getDefinition() == Prelude.SUC) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.ClassFieldImpl`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean compareImplementStatements(List<Concrete.ClassFieldImpl> implStats1, List<Concrete.ClassFieldImpl> implStats2) {
    if (implStats1.size() != implStats2.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.ClassFieldImpl`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean compareImplementStatements(List<Concrete.ClassFieldImpl> implStats1, List<Concrete.ClassFieldImpl> implStats2) {
    if (implStats1.size() != implStats2.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.Pattern`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean comparePatterns(List<Concrete.Pattern> patterns1, List<Concrete.Pattern> patterns2) {
    if (patterns1.size() != patterns2.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.Pattern`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean comparePatterns(List<Concrete.Pattern> patterns1, List<Concrete.Pattern> patterns2) {
    if (patterns1.size() != patterns2.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.LevelExpression`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean compareLevels(List<Concrete.LevelExpression> levels1, List<Concrete.LevelExpression> levels2) {
    if (levels1 == null) return levels2 == null;
    if (levels1.size() != levels2.size()) return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.LevelExpression`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean compareLevels(List<Concrete.LevelExpression> levels1, List<Concrete.LevelExpression> levels2) {
    if (levels1 == null) return levels2 == null;
    if (levels1.size() != levels2.size()) return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.CoClauseElement`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean compareCoClauseElements(List<Concrete.CoClauseElement> elements1, List<Concrete.CoClauseElement> elements2) {
    if (elements1.size() != elements2.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.CoClauseElement`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
  }

  private boolean compareCoClauseElements(List<Concrete.CoClauseElement> elements1, List<Concrete.CoClauseElement> elements2) {
    if (elements1.size() != elements2.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.Pattern`
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java
  }

  private @NotNull List<Concrete.Pattern> visitPatterns(List<Concrete.Pattern> patterns) {
    return patterns.stream().map(this::visitPattern).collect(Collectors.toList());
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java
  }

  public <T extends Concrete.Parameter> List<T> visitParameters(List<T> parameters) {
    return parameters.stream().map(this::visitParameter).collect(Collectors.toList());
  }
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java
  private final Object myData;

  public SubstConcreteVisitor(@NotNull Map<Referable, Concrete.Expression> substitution, Object data) {
    mySubstitution = substitution;
    myData = data;
```

### BoundedWildcard
Can generalize to `? extends Concrete.LevelExpression`
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.LevelExpression> visitLevels(List<Concrete.LevelExpression> levels) {
    if (levels == null) return null;
    List<Concrete.LevelExpression> result = new ArrayList<>(levels.size());
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/term/prettyprint/FreeVariableCollectorConcrete.java`
#### Snippet
```java
  private final Set<Referable> myReferables;

  public FreeVariableCollectorConcrete(Set<Referable> referables) {
    myReferables = referables;
  }
```

### BoundedWildcard
Can generalize to `? extends Variable`
in `base/src/main/java/org/arend/term/prettyprint/CollectFreeVariablesVisitor.java`
#### Snippet
```java
  }

  private void addFreeVariables(Binding binding, Set<Variable> variables) {
    if (!variables.isEmpty()) {
      myFreeVariables.computeIfAbsent(binding, k -> new HashSet<>()).addAll(variables);
```

### BoundedWildcard
Can generalize to `? extends Referable`
in `base/src/main/java/org/arend/term/concrete/ConcreteExpressionFactory.java`
#### Snippet
```java
  }

  public static Concrete.TelescopeParameter cTele(List<Referable> referableList, Concrete.Expression type) {
    return new Concrete.TelescopeParameter(null, true, referableList, type, false);
  }
```

### BoundedWildcard
Can generalize to `? super V`
in `base/src/main/java/org/arend/util/GraphClosure.java`
#### Snippet
```java
  }

  private boolean isReachable(V start, V end, Set<V> visited) {
    if (!visited.add(start)) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends GeneralError`
in `base/src/main/java/org/arend/term/prettyprint/MinimizedRepresentation.java`
#### Snippet
```java
    private final ConcreteFactory myFactory;

    public ErrorFixingConcreteExpressionVisitor(List<GeneralError> myErrors, ConcreteFactory myFactory) {
        this.myErrors = myErrors;
        this.myFactory = myFactory;
```

### BoundedWildcard
Can generalize to `? super GeneralError`
in `base/src/main/java/org/arend/term/prettyprint/MinimizedRepresentation.java`
#### Snippet
```java
    }

    private static CheckTypeVisitor generateTypechecker(InstanceProvider instanceProvider, List<GeneralError> errorsCollector) {
        var checkTypeVisitor = new CheckTypeVisitor(error -> {
            if (!(error instanceof GoalError)) {
```

### BoundedWildcard
Can generalize to `? super ModulePath`
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
  }

  public static void getModules(Path path, String ext, Collection<ModulePath> modules, ErrorReporter errorReporter) {
    try {
      Files.walkFileTree(path, new SimpleFileVisitor<>() {
```

### BoundedWildcard
Can generalize to `? super ArendRef`
in `base/src/main/java/org/arend/module/error/ExceptionError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    if (affectedReferable != null) {
      consumer.accept(affectedReferable, this);
```

### BoundedWildcard
Can generalize to `? super GeneralError`
in `base/src/main/java/org/arend/module/error/ExceptionError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    if (affectedReferable != null) {
      consumer.accept(affectedReferable, this);
```

### BoundedWildcard
Can generalize to `? extends TeleContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.TypeParameter> visitTeles(List<TeleContext> teles, boolean isDefinition) {
    List<Concrete.TypeParameter> parameters = new ArrayList<>(teles.size());
    for (TeleContext tele : teles) {
```

### BoundedWildcard
Can generalize to `? extends ClassFieldOrImplContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitInstanceStatements(List<ClassFieldOrImplContext> ctx, List<Concrete.ClassElement> elements, Concrete.ClassDefinition parentClass) {
    for (ClassFieldOrImplContext statCtx : ctx) {
      if (statCtx != null) {
```

### BoundedWildcard
Can generalize to `? super TCDefReferable`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void collectUsedDefinitions(Group group, List<TCDefReferable> usedDefinitions) {
    if (group.getReferable() instanceof ConcreteLocatedReferable ref) {
      Concrete.ReferableDefinition def = ref.getDefinition();
```

### BoundedWildcard
Can generalize to `? extends StatementContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitStatementList(List<StatementContext> statementCtxs, List<Statement> statements, ChildGroup parent, TCDefReferable enclosingClass) {
    for (StatementContext statementCtx : statementCtxs) {
      try {
```

### BoundedWildcard
Can generalize to `? super Statement`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitStatementList(List<StatementContext> statementCtxs, List<Statement> statements, ChildGroup parent, TCDefReferable enclosingClass) {
    for (StatementContext statementCtx : statementCtxs) {
      try {
```

### BoundedWildcard
Can generalize to `? super Concrete.ClassElement`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitInstanceStatement(ClassFieldOrImplContext ctx, List<Concrete.ClassElement> elements, Concrete.ClassDefinition parentClass) {
    if (ctx instanceof ClassFieldContext) {
      elements.add(visitClassFieldDef(((ClassFieldContext) ctx).classFieldDef(), ClassFieldKind.ANY, parentClass));
```

### BoundedWildcard
Can generalize to `? extends ArgumentContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private Concrete.Expression visitApp(AppPrefixContext prefixCtx, AppExprContext appCtx, ImplementStatementsContext implCtx, List<ArgumentContext> argumentCtxs, WithBodyContext body) {
    Concrete.Expression expr = visitNew(prefixCtx, appCtx, implCtx);
    if (!argumentCtxs.isEmpty() || body != null) {
```

### BoundedWildcard
Can generalize to `? extends LocalCoClauseContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.ClassFieldImpl> visitLocalCoClauses(List<LocalCoClauseContext> contexts) {
    List<Concrete.ClassFieldImpl> result = new ArrayList<>();
    for (LocalCoClauseContext context : contexts) {
```

### BoundedWildcard
Can generalize to `? super ParsedLocalReferable`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private boolean getVars(ExprContext expr, List<ParsedLocalReferable> vars) {
    if (!(expr instanceof AppContext appExpr)) {
      return false;
```

### BoundedWildcard
Can generalize to `? extends FieldTeleContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitFieldTeles(List<FieldTeleContext> teles, Concrete.ClassDefinition classDef, List<Concrete.ClassElement> fields) {
    for (FieldTeleContext tele : teles) {
      boolean explicit;
```

### BoundedWildcard
Can generalize to `? super Concrete.ClassElement`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitFieldTeles(List<FieldTeleContext> teles, Concrete.ClassDefinition classDef, List<Concrete.ClassElement> fields) {
    for (FieldTeleContext tele : teles) {
      boolean explicit;
```

### BoundedWildcard
Can generalize to `? extends TeleContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.Parameter> visitLamTeles(List<TeleContext> tele, boolean isDefinition) {
    List<Concrete.Parameter> arguments = new ArrayList<>();
    for (TeleContext arg : tele) {
```

### BoundedWildcard
Can generalize to `? extends ConstructorContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.Constructor> visitConstructors(List<ConstructorContext> conContexts, Concrete.DataDefinition def, List<InternalConcreteLocatedReferable> constructors) {
    List<Concrete.Constructor> result = new ArrayList<>(conContexts.size());
    for (ConstructorContext conCtx : conContexts) {
```

### BoundedWildcard
Can generalize to `? super InternalConcreteLocatedReferable`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.Constructor> visitConstructors(List<ConstructorContext> conContexts, Concrete.DataDefinition def, List<InternalConcreteLocatedReferable> constructors) {
    List<Concrete.Constructor> result = new ArrayList<>(conContexts.size());
    for (ConstructorContext conCtx : conContexts) {
```

### BoundedWildcard
Can generalize to `? extends LamParamContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.Pattern> visitLamParams(List<LamParamContext> list, List<Concrete.Parameter> parameters) {
    List<Concrete.Pattern> patterns = Collections.emptyList();
    for (LamParamContext ctx : list) {
```

### BoundedWildcard
Can generalize to `? extends ClassStatContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitInstanceStatements(List<ClassStatContext> ctx, List<Concrete.ClassElement> elements, List<? super Group> statements, Concrete.ClassDefinition parentClass, ChildGroup parent) {
    for (ClassStatContext statementCtx : ctx) {
      if (statementCtx == null) {
```

### BoundedWildcard
Can generalize to `? extends TerminalNode`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private Object parseLevelParameters(Token token, List<TerminalNode> ids, LocatedReferable parent, boolean isPLevels) {
    if (ids.isEmpty()) return parent == null ? new Concrete.LevelParameters(tokenPosition(token), Collections.emptyList(), true) : new Concrete.LevelsDefinition(tokenPosition(token), Collections.emptyList(), true, isPLevels);
    if (ids.size() % 2 == 0) {
```

### BoundedWildcard
Can generalize to `? extends CoClauseContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitCoClauses(List<CoClauseContext> coClausesCtx, List<? super EmptyGroup> statements, ChildGroup parentGroup, TCDefReferable enclosingDefinition, TCDefReferable enclosingClass, List<Concrete.CoClauseElement> result) {
    for (CoClauseContext coClause : coClausesCtx) {
      result.add(visitCoClause(coClause, statements, parentGroup, enclosingClass, enclosingDefinition, false));
```

### BoundedWildcard
Can generalize to `? super Concrete.CoClauseElement`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private void visitCoClauses(List<CoClauseContext> coClausesCtx, List<? super EmptyGroup> statements, ChildGroup parentGroup, TCDefReferable enclosingDefinition, TCDefReferable enclosingClass, List<Concrete.CoClauseElement> result) {
    for (CoClauseContext coClause : coClausesCtx) {
      result.add(visitCoClause(coClause, statements, parentGroup, enclosingClass, enclosingDefinition, false));
```

### BoundedWildcard
Can generalize to `? extends TupleExprContext`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private Concrete.Expression visitTupleExprs(List<TupleExprContext> exprs, List<TerminalNode> commas, ParserRuleContext parentCtx) {
    if (exprs.size() == 1 && commas.isEmpty()) {
      return visitTupleExpr(exprs.get(0));
```

### BoundedWildcard
Can generalize to `? extends TerminalNode`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private Concrete.Expression visitTupleExprs(List<TupleExprContext> exprs, List<TerminalNode> commas, ParserRuleContext parentCtx) {
    if (exprs.size() == 1 && commas.isEmpty()) {
      return visitTupleExpr(exprs.get(0));
```

### BoundedWildcard
Can generalize to `? extends T`
in `base/src/main/java/org/arend/term/prettyprint/BiConcreteVisitor.java`
#### Snippet
```java
  }

  private <T extends Concrete.ClassElement> List<T> visitClassElements(List<T> elements, List<T> wideElements) {
    List<T> classElements = new ArrayList<>();
    for (int i = 0; i < elements.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `base/src/main/java/org/arend/term/prettyprint/BiConcreteVisitor.java`
#### Snippet
```java
  }

  private <T extends Concrete.ClassElement> List<T> visitClassElements(List<T> elements, List<T> wideElements) {
    List<T> classElements = new ArrayList<>();
    for (int i = 0; i < elements.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.FunctionClause`
in `base/src/main/java/org/arend/term/prettyprint/BiConcreteVisitor.java`
#### Snippet
```java


  public List<Concrete.FunctionClause> visitClauses(List<? extends Concrete.FunctionClause> clauses, List<Concrete.FunctionClause> wideClauses) {
    List<Concrete.FunctionClause> newClauses = new ArrayList<>();
    for (int i = 0; i < clauses.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends @NotNull Pair`
in `base/src/main/java/org/arend/naming/binOp/ExpressionBinOpEngine.java`
#### Snippet
```java

  @Override
  public @NotNull Concrete.Expression wrapSequence(Object data, Concrete.@NotNull Expression base, List<@NotNull Pair<? extends Concrete.Expression, Boolean>> explicitComponents) {
    return Concrete.AppExpression.make(data, base, explicitComponents.stream().map((pair) -> new Concrete.Argument(pair.proj1, pair.proj2)).collect(Collectors.toList()));
  }
```

### BoundedWildcard
Can generalize to `? extends Variable`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
  }

  private LocalReferable makeLocalReference(Binding var, Set<Variable> freeVars, boolean genName) {
    return !genName && !freeVars.contains(var) ? null : myRenamer.generateFreshReferable(var, freeVars);
  }
```

### BoundedWildcard
Can generalize to `? super Concrete.Argument`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
  }

  private void visitArgument(Expression arg, boolean isExplicit, List<Concrete.Argument> arguments, boolean genGoal, boolean alwaysShow) {
    ReferenceExpression refExpr = arg.cast(ReferenceExpression.class);
    if (refExpr != null && refExpr.getBinding().isHidden()) {
```

### BoundedWildcard
Can generalize to `? super Concrete.Pattern`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
  }

  private void visitElimPattern(Pattern pattern, boolean isExplicit, List<Concrete.Pattern> patterns) {
    if (pattern instanceof BindingPattern) {
      DependentLink link = pattern.getFirstBinding();
```

### BoundedWildcard
Can generalize to `? extends Level`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
  }

  private List<Concrete.LevelExpression> visitLevelsNull(List<Level> levels, boolean showStdVar) {
    if (levels.size() == 1) {
      Concrete.LevelExpression result = visitLevelNull(levels.get(0), showStdVar);
```

### BoundedWildcard
Can generalize to `? extends @NotNull Pair`
in `base/src/main/java/org/arend/naming/binOp/PatternBinOpEngine.java`
#### Snippet
```java

  @Override
  public @NotNull Concrete.Pattern wrapSequence(Object data, Concrete.@NotNull Pattern base, List<@NotNull Pair<? extends Concrete.Pattern, Boolean>> explicitComponents) {
    if (base instanceof Concrete.ConstructorPattern conBase) {
      ArrayList<Concrete.Pattern> newPatterns = new ArrayList<>(base.getPatterns());
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  }

  private Expression addLamParameters(LamExpression lamExpr1, List<DependentLink> params1, Expression body1, List<DependentLink> params2) {
    if (params2.size() > params1.size()) {
      params1 = new ArrayList<>(params1);
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  }

  private DependentLink replaceParameter(List<DependentLink> params, Expression type, ExprSubstitution subst) {
    LinkList list = new LinkList();
    for (DependentLink param : params) {
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  }

  private void restoreConCalls(List<Pair<ConCallExpression, ConCallExpression>> stack) {
    if (stack == null) return;
    for (int i = stack.size() - 1; i >= 0; i--) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `base/src/main/java/org/arend/module/serialization/DefinitionDeserialization.java`
#### Snippet
```java
  }

  private <T extends Definition> Set<T> readDefinitions(List<Integer> protos, Class<T> clazz) throws DeserializationException {
    Set<T> result = new HashSet<>();
    for (Integer index : protos) {
```

### BoundedWildcard
Can generalize to `? extends Scope`
in `base/src/main/java/org/arend/naming/scope/LazyScope.java`
#### Snippet
```java
  private final Supplier<Scope> mySupplier;

  public LazyScope(Supplier<Scope> supplier) {
    mySupplier = supplier;
  }
```

### BoundedWildcard
Can generalize to `? extends Concrete.BinOpSequenceElem`
in `base/src/main/java/org/arend/naming/binOp/BinOpParser.java`
#### Snippet
```java
  }

  @NotNull T parse(@NotNull List<Concrete.BinOpSequenceElem<T>> sequence) {
    for (Concrete.BinOpSequenceElem<T> elem : sequence) {
      Referable referable = myEngine.getReferable(elem.getComponent());
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/ListScope.java`
#### Snippet
```java

  @Override
  public Referable find(Predicate<Referable> pred) {
    for (int i = myContext.size() - 1; i >= 0; i--) {
      if (pred.test(myContext.get(i))) {
```

### BoundedWildcard
Can generalize to `? super Concrete.Expression`
in `base/src/main/java/org/arend/naming/binOp/MetaBinOpParser.java`
#### Snippet
```java
  }

  public void resetReference(Concrete.BinOpSequenceElem<Concrete.Expression> elem, MetaBinOpParser.ResolvedReference resolvedReference) {
    if (resolvedReference != null && resolvedReference.originalReference != null) {
      resolvedReference.originalReference.reset();
```

### BoundedWildcard
Can generalize to `? extends Concrete.BinOpSequenceElem`
in `base/src/main/java/org/arend/naming/binOp/MetaBinOpParser.java`
#### Snippet
```java
  }

  private static List<Concrete.Argument> binOpSeqToArgs(List<Concrete.BinOpSequenceElem<Concrete.Expression>> sequence, int start, int end) {
    List<Concrete.Argument> args = new ArrayList<>();
    for (int i = start; i < end; i++) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/CachingScope.java`
#### Snippet
```java

  @Override
  public @Nullable Referable find(Predicate<Referable> pred) {
    for (Map<String, Referable> map : myElements.values()) {
      for (Referable ref : map.values()) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/SingletonScope.java`
#### Snippet
```java
  @Nullable
  @Override
  public Referable find(Predicate<Referable> pred) {
    return pred.test(myReferable) ? myReferable : null;
  }
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/Scope.java`
#### Snippet
```java
  }

  static void traverse(Scope scope, Consumer<Referable> consumer) {
    if (scope == null) return;
    for (Referable ref : scope.getElements()) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/Scope.java`
#### Snippet
```java
// Minimal definition: (find or getElements) and resolveNamespace
public interface Scope {
  default @Nullable Referable find(Predicate<Referable> pred) {
    for (Referable referable : getElements(null)) {
      if (pred.test(referable)) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/ImportedScope.java`
#### Snippet
```java
  @Nullable
  @Override
  public Referable find(Predicate<Referable> pred) {
    for (Triple triple : myExpectedNamesTree.map.values()) {
      if (triple.scope != null && pred.test(triple.referable)) {
```

### BoundedWildcard
Can generalize to `? extends Scope`
in `base/src/main/java/org/arend/naming/scope/MergeScope.java`
#### Snippet
```java
  }

  public MergeScope(boolean mergeNamespaces, Collection<Scope> scopes) {
    myScopes = scopes;
    myMergeNamespaces = mergeNamespaces;
```

### BoundedWildcard
Can generalize to `? extends Scope`
in `base/src/main/java/org/arend/naming/scope/MergeScope.java`
#### Snippet
```java
  private final boolean myMergeNamespaces;

  public MergeScope(Collection<Scope> scopes) {
    myScopes = scopes;
    myMergeNamespaces = false;
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/ClassFieldImplScope.java`
#### Snippet
```java
  @Nullable
  @Override
  public Referable find(Predicate<Referable> pred) {
    Set<ClassReferable> visitedClasses = new HashSet<>();
    Deque<ClassReferable> toVisit = new ArrayDeque<>();
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/local/LocalListScope.java`
#### Snippet
```java
  }

  private Referable findHere(Predicate<Referable> pred) {
    for (int i = myReferables.size() - 1; i >= 0; i--) {
      ArendRef referable = myReferables.get(i);
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/local/LetScope.java`
#### Snippet
```java
  }

  private Referable find(Abstract.Pattern pattern, Predicate<Referable> pred) {
    Referable ref = pattern.getSingleReferable();
    if (ref != null) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.ReferenceExpression`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  private void prettyPrintClassDefinitionHeader(Concrete.Definition def, List<Concrete.ReferenceExpression> superClasses) {
    myBuilder.append("\\class ").append(def.getData().textRepresentation());
    if (!superClasses.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.LevelExpression`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  private void printLevels(List<Concrete.LevelExpression> levels) {
    if (levels != null) {
      if (levels.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  private Precedence visitBinOp(Concrete.Expression left, Concrete.ReferenceExpression infix, List<Concrete.Argument> implicitArgs, Concrete.Expression right, Precedence prec, StringBuilder builder) {
    Precedence infixPrec = ((GlobalReferable) infix.getReferent()).getRepresentablePrecedence();
    boolean needParens = prec.priority > infixPrec.priority || prec.priority == infixPrec.priority && (prec.associativity != infixPrec.associativity || prec.associativity == Precedence.Associativity.NON_ASSOC);
```

### BoundedWildcard
Can generalize to `? extends BinOpSequenceElem`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  private AbstractLayout createBinOpLayout(List<BinOpSequenceElem<Expression>> elems) {
    Concrete.Expression lhs = elems.get(0).getComponent();
    if (lhs instanceof Concrete.AppExpression && elems.size() > 1) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  static public void printArguments(PrettyPrintVisitor pp, List<Concrete.Argument> args, boolean noIndent) {
    new ListLayout<Concrete.Argument>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  private boolean isInfix(List<Concrete.Argument> args) {
    for (int i = 0; i < args.size(); i++) {
      if (args.get(i).isExplicit()) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/local/TelescopeScope.java`
#### Snippet
```java
  }

  private Referable findHere(Predicate<Referable> pred) {
    for (int i = myParameters.size() - 1; i >= 0; i--) {
      List<? extends Referable> referables = myParameters.get(i).getReferableList();
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/local/PatternScope.java`
#### Snippet
```java
  }

  private Referable find(List<? extends Abstract.Pattern> args, Predicate<Referable> pred) {
    Scope globalScope = null;
    for (int i = args.size() - 1; i >= 0; i--) {
```

### BoundedWildcard
Can generalize to `? super String`
in `base/src/main/java/org/arend/naming/reference/LocatedReferable.java`
#### Snippet
```java

  class Helper {
    public static ModuleLocation getLocation(LocatedReferable referable, List<String> fullName) {
      LocatedReferable parent = referable.getLocatedReferableParent();
      if (parent == null) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/scope/LexicalScope.java`
#### Snippet
```java
  }

  private Referable checkReferable(Referable referable, Predicate<Referable> pred) {
    String name = referable.textRepresentation();
    if (!name.isEmpty() && !"_".equals(name)) {
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `base/src/main/java/org/arend/naming/reference/ClassReferableImpl.java`
#### Snippet
```java
  private final List<GlobalReferable> myDynamicReferables;

  public ClassReferableImpl(Precedence precedence, String name, boolean isRecord, List<ClassReferable> superClassReferences, List<Boolean> superLevels, List<? extends TCFieldReferable> fieldReferables, List<GlobalReferable> dynamicReferables, LocatedReferable parent) {
    super(precedence, name, parent, Kind.CLASS);
    myRecord = isRecord;
```

### BoundedWildcard
Can generalize to `? extends GlobalReferable`
in `base/src/main/java/org/arend/naming/reference/ClassReferableImpl.java`
#### Snippet
```java
  private final List<GlobalReferable> myDynamicReferables;

  public ClassReferableImpl(Precedence precedence, String name, boolean isRecord, List<ClassReferable> superClassReferences, List<Boolean> superLevels, List<? extends TCFieldReferable> fieldReferables, List<GlobalReferable> dynamicReferables, LocatedReferable parent) {
    super(precedence, name, parent, Kind.CLASS);
    myRecord = isRecord;
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/reference/NamedUnresolvedReference.java`
#### Snippet
```java
  @NotNull
  @Override
  public Referable resolve(Scope scope, @Nullable List<Referable> resolvedRefs, RefKind kind) {
    if (resolved != null) {
      return resolved;
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/reference/NamedUnresolvedReference.java`
#### Snippet
```java
  @Nullable
  @Override
  public Referable tryResolve(Scope scope, List<Referable> resolvedRefs) {
    if (resolved != null) {
      return resolved;
```

### BoundedWildcard
Can generalize to `? extends Set`
in `base/src/main/java/org/arend/naming/reference/ClassReferable.java`
#### Snippet
```java
    }

    private static void removeImplemented(ClassReferable classDef, Set<FieldReferable> result, HashMap<ClassReferable, Set<FieldReferable>> superClassesFields) {
      Deque<ClassReferable> toVisit = new ArrayDeque<>();
      Set<ClassReferable> visitedClasses = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? super ClassReferable`
in `base/src/main/java/org/arend/naming/reference/ClassReferable.java`
#### Snippet
```java
    }

    private static Set<FieldReferable> getAllFields(ClassReferable classDef, Set<ClassReferable> visited, HashMap<ClassReferable, Set<FieldReferable>> superClassesFields) {
      if (!visited.add(classDef)) {
        Set<FieldReferable> fieldSet = superClassesFields.get(classDef);
```

### BoundedWildcard
Can generalize to `? super ClassReferable`
in `base/src/main/java/org/arend/naming/reference/ClassReferable.java`
#### Snippet
```java
    }

    private static Set<FieldReferable> getAllFields(ClassReferable classDef, Set<ClassReferable> visited, HashMap<ClassReferable, Set<FieldReferable>> superClassesFields) {
      if (!visited.add(classDef)) {
        Set<FieldReferable> fieldSet = superClassesFields.get(classDef);
```

### BoundedWildcard
Can generalize to `? super Binding`
in `base/src/main/java/org/arend/extImpl/AbstractedExpressionImpl.java`
#### Snippet
```java
  }

  public static Expression getExpression(AbstractedExpression abstracted, List<Binding> bindings) {
    if (abstracted instanceof Expression) {
      return (Expression) abstracted;
```

### BoundedWildcard
Can generalize to `? extends T`
in `base/src/main/java/org/arend/extImpl/ui/DelegateQuery.java`
#### Snippet
```java
  private ArendQuery<T> myDelegate;

  public void setDelegate(ArendQuery<T> delegate) {
    myDelegate = delegate;
  }
```

### BoundedWildcard
Can generalize to `? super ClassReferable`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
  }

  public static Scope forSourceNode(Scope parentScope, Abstract.SourceNode sourceNode, Scope importElements, Function<ClassReferable, Scope> classFieldImplScope) {
    if (sourceNode == null) {
      return parentScope;
```

### BoundedWildcard
Can generalize to `? extends Scope`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
  }

  public static Scope forSourceNode(Scope parentScope, Abstract.SourceNode sourceNode, Scope importElements, Function<ClassReferable, Scope> classFieldImplScope) {
    if (sourceNode == null) {
      return parentScope;
```

### BoundedWildcard
Can generalize to `? super Library`
in `base/src/main/java/org/arend/library/LibraryManager.java`
#### Snippet
```java
   * @return the library with the given name.
   */
  public Library getRegisteredLibrary(Predicate<Library> pred) {
    for (Library library : getRegisteredLibraries()) {
      if (pred.test(library)) {
```

### BoundedWildcard
Can generalize to `? extends Library`
in `base/src/main/java/org/arend/library/LibraryManager.java`
#### Snippet
```java
  }

  private void reloadLibraries(List<Library> libraries, Supplier<TypecheckingOrderingListener> supplier, boolean reloadExternal) {
    if (!myLoadingLibraries.isEmpty()) {
      myLibraryErrorReporter.report(LibraryError.unloadDuringLoading(myLoadingLibraries.stream().map(Library::getName)));
```

### BoundedWildcard
Can generalize to `? extends TypecheckingOrderingListener`
in `base/src/main/java/org/arend/library/LibraryManager.java`
#### Snippet
```java
  }

  private void reloadLibraries(List<Library> libraries, Supplier<TypecheckingOrderingListener> supplier, boolean reloadExternal) {
    if (!myLoadingLibraries.isEmpty()) {
      myLibraryErrorReporter.report(LibraryError.unloadDuringLoading(myLoadingLibraries.stream().map(Library::getName)));
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
  }

  private Referable resolve(Scope scope, List<Referable> resolvedRefs, boolean onlyTry, RefKind kind) {
    if (resolved != null) {
      return resolved;
```

### BoundedWildcard
Can generalize to `? super Version`
in `base/src/main/java/org/arend/library/error/LibraryError.java`
#### Snippet
```java
  }

  public static LibraryError incorrectVersion(String libraryName, Range<Version> range) {
    return new LibraryError("Library supports language version " + range.checkRange(Prelude.VERSION) + ", but current language version is " + Prelude.VERSION, Stream.of(libraryName));
  }
```

### BoundedWildcard
Can generalize to `? super ArendRef`
in `base/src/main/java/org/arend/typechecking/error/CycleError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    Object causeData = cause != null ? cause.getData() : null;
    if (causeData instanceof GlobalReferable) {
```

### BoundedWildcard
Can generalize to `? super GeneralError`
in `base/src/main/java/org/arend/typechecking/error/CycleError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    Object causeData = cause != null ? cause.getData() : null;
    if (causeData instanceof GlobalReferable) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
  }

  private void addNotEliminatedParameters(List<? extends Concrete.Parameter> parameters, List<? extends Concrete.ReferenceExpression> eliminated, List<Referable> context) {
    if (eliminated.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? super String`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
  }

  private void checkReference(LocatedReferable newRef, Map<String, LocatedReferable> referables, boolean isInternal) {
    String name = newRef.textRepresentation();
    if (name.isEmpty() || "_".equals(name)) {
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
  }

  private void checkField(LocatedReferable field, Map<String, Pair<LocatedReferable, ClassReferable>> fields) {
    if (field == null || fields.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? super Definition`
in `base/src/main/java/org/arend/prelude/Prelude.java`
#### Snippet
```java
  }

  public static void forEach(Consumer<Definition> consumer) {
    consumer.accept(NAT);
    consumer.accept(PLUS);
```

### BoundedWildcard
Can generalize to `? super ArendRef`
in `base/src/main/java/org/arend/typechecking/error/local/CoerceCycleError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    for (Concrete.UseDefinition def : cycle) {
      consumer.accept(def.getData(), new CoerceCycleError(cycle, def.getData()));
```

### BoundedWildcard
Can generalize to `? super GeneralError`
in `base/src/main/java/org/arend/typechecking/error/local/CoerceCycleError.java`
#### Snippet
```java

  @Override
  public void forAffectedDefinitions(BiConsumer<ArendRef, GeneralError> consumer) {
    for (Concrete.UseDefinition def : cycle) {
      consumer.accept(def.getData(), new CoerceCycleError(cycle, def.getData()));
```

### BoundedWildcard
Can generalize to `? super Doc`
in `base/src/main/java/org/arend/typechecking/error/local/inference/RecursiveInstanceInferenceError.java`
#### Snippet
```java

  @Override
  public void addAdditionalDocs(List<Doc> docs, PrettyPrinterConfig ppConfig) {
    if (holeExpression != null) {
      for (int i = holeExpression.recursiveData.size() - 1; i >= 0; i--) {
```

### BoundedWildcard
Can generalize to `? super TCDefReferable`
in `base/src/main/java/org/arend/typechecking/order/DefinitionComparator.java`
#### Snippet
```java
  private final PartialComparator<TCDefReferable> myComparator;

  DefinitionComparator(PartialComparator<TCDefReferable> comparator) {
    myComparator = comparator;
  }
```

### BoundedWildcard
Can generalize to `? extends CaseArgument`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    public int level = -2; // the level of the result type; -2 means not truncated

    public CaseExpression(Object data, boolean isSCase, List<CaseArgument> arguments, Expression resultType, Expression resultTypeLevel, List<FunctionClause> clauses) {
      super(data);
      mySCase = isSCase;
```

### BoundedWildcard
Can generalize to `? extends TCLevelReferable`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    private final boolean myPLevels;

    public LevelsDefinition(Object data, List<TCLevelReferable> referables, boolean isIncreasing, boolean isPLevels) {
      super(data);
      myReferables = referables;
```

### BoundedWildcard
Can generalize to `? extends Concrete.ResolvableDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java

  @Override
  public void cycleFound(List<Concrete.ResolvableDefinition> definitions) {
    myElements.add(new MyDefinitions(definitions, MyDefinitions.Kind.CYCLE));
  }
```

### BoundedWildcard
Can generalize to `? extends Concrete.ResolvableDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java

  @Override
  public void preBodiesFound(List<Concrete.ResolvableDefinition> definitions) {
    myElements.add(new MyDefinitions(definitions, MyDefinitions.Kind.PRE_BODIES));
  }
```

### BoundedWildcard
Can generalize to `? extends Concrete.ResolvableDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java

  @Override
  public void bodiesFound(List<Concrete.ResolvableDefinition> bodies) {
    myElements.add(new MyDefinitions(bodies, MyDefinitions.Kind.BODIES));
  }
```

### BoundedWildcard
Can generalize to `? extends Concrete.UseDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java

  @Override
  public void useFound(List<Concrete.UseDefinition> definitions) {
    myElements.add(new MyDefinitions(definitions, MyDefinitions.Kind.USE));
  }
```

### BoundedWildcard
Can generalize to `? super Definition`
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
  }

  private static void typecheckCoerce(Concrete.UseDefinition def, FunctionDefinition typedDef, ErrorReporter errorReporter, Map<Definition, List<Pair<Expression,FunctionDefinition>>> fromMap, Map<Definition, List<Pair<Expression,FunctionDefinition>>> toMap) {
    Definition useParent = def.getUseParent().getTypechecked();
    if ((useParent instanceof DataDefinition || useParent instanceof ClassDefinition) && !def.getParameters().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super Definition`
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
  }

  private static void typecheckCoerce(Concrete.UseDefinition def, FunctionDefinition typedDef, ErrorReporter errorReporter, Map<Definition, List<Pair<Expression,FunctionDefinition>>> fromMap, Map<Definition, List<Pair<Expression,FunctionDefinition>>> toMap) {
    Definition useParent = def.getUseParent().getTypechecked();
    if ((useParent instanceof DataDefinition || useParent instanceof ClassDefinition) && !def.getParameters().isEmpty()) {
```

### BoundedWildcard
Can generalize to `? extends Definition`
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
  }

  private static void registerCoerce(Map<Definition, List<Pair<Expression,FunctionDefinition>>> depMap, boolean isFrom, ErrorReporter errorReporter, List<Concrete.UseDefinition> definitions) {
    if (depMap.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends List`>
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
  }

  private static void registerCoerce(Map<Definition, List<Pair<Expression,FunctionDefinition>>> depMap, boolean isFrom, ErrorReporter errorReporter, List<Concrete.UseDefinition> definitions) {
    if (depMap.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends Concrete.UseDefinition`
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
  }

  private static void registerCoerce(Map<Definition, List<Pair<Expression,FunctionDefinition>>> depMap, boolean isFrom, ErrorReporter errorReporter, List<Concrete.UseDefinition> definitions) {
    if (depMap.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends Concrete.Pattern`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
   */
  private static @Nullable DependentLink visitPattern(
      Object data, Iterator<? extends Pattern> corePatterns, Iterator<Concrete.Pattern> patterns) {
    findBinding:
    while (corePatterns.hasNext() && patterns.hasNext()) {
```

### BoundedWildcard
Can generalize to `? super HaveClause`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
      Concrete.LetExpression expr,
      LetExpression let,
      BiFunction<HaveClause, Concrete.LetClause, @Nullable T> function
  ) {
    List<Concrete.LetClause> exprClauses = expr.getClauses();
```

### BoundedWildcard
Can generalize to `? super Concrete.LetClause`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
      Concrete.LetExpression expr,
      LetExpression let,
      BiFunction<HaveClause, Concrete.LetClause, @Nullable T> function
  ) {
    List<Concrete.LetClause> exprClauses = expr.getClauses();
```

### BoundedWildcard
Can generalize to `? super DependentLink`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
      DependentLink core,
      Referable referable,
      Function<DependentLink, DependentLink> next,
      List<? extends Concrete.Parameter> parameters
  ) {
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
      DependentLink core,
      Referable referable,
      Function<DependentLink, DependentLink> next,
      List<? extends Concrete.Parameter> parameters
  ) {
```

### BoundedWildcard
Can generalize to `? super Concrete.ResolvableDefinition`
in `base/src/main/java/org/arend/typechecking/order/Ordering.java`
#### Snippet
```java

  @Override
  protected boolean forDependencies(Concrete.ResolvableDefinition definition, Consumer<Concrete.ResolvableDefinition> consumer) {
    Set<TCReferable> dependencies = new LinkedHashSet<>();
    CollectDefCallsVisitor visitor = new CollectDefCallsVisitor(dependencies, myStage.ordinal() < Stage.WITHOUT_BODIES.ordinal());
```

### BoundedWildcard
Can generalize to `? extends CoreClassDefinition`
in `base/src/main/java/org/arend/typechecking/visitor/ClassFieldChecker.java`
#### Snippet
```java
  private int myClassCallNumber;

  ClassFieldChecker(Referable thisParameter, Set<TCDefReferable> recursiveDefs, TCDefReferable classReferable, Collection<CoreClassDefinition> superClasses, Set<? extends LocatedReferable> fields, Set<TCDefReferable> futureFields, ErrorReporter errorReporter) {
    myThisParameter = thisParameter;
    myRecursiveDefs = recursiveDefs;
```

### BoundedWildcard
Can generalize to `? extends List`
in `base/src/main/java/org/arend/typechecking/visitor/WhereVarsFixVisitor.java`
#### Snippet
```java
  private final Map<ParameterReferable, Referable> myReferableMap = new HashMap<>();

  private WhereVarsFixVisitor(Concrete.Definition definition, Map<TCDefReferable, List<Concrete.Argument>> selfArgs) {
    myDefinition = definition;
    mySelfArgs = selfArgs;
```

### BoundedWildcard
Can generalize to `? extends Concrete.ClassFieldImpl`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java

  private  @Nullable Pair<@NotNull Expression, Concrete.@NotNull Expression>
  visitStatements(Map<ClassField, Expression> implementedHere, List<Concrete.ClassFieldImpl> statements) {
    for (Concrete.ClassFieldImpl statement : statements) {
      var field = visitStatement(implementedHere, statement);
```

### BoundedWildcard
Can generalize to `? super ElimClause`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
    @NotNull List<? extends Concrete.Clause> clauses,
    @NotNull List<? extends ElimClause<Pattern>> coreClauses,
    BiFunction<ElimClause<Pattern>, Concrete.Clause, @Nullable T> function
  ) {
    // Interval pattern matching are stored in a special way,
```

### BoundedWildcard
Can generalize to `? super Concrete.Clause`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
    @NotNull List<? extends Concrete.Clause> clauses,
    @NotNull List<? extends ElimClause<Pattern>> coreClauses,
    BiFunction<ElimClause<Pattern>, Concrete.Clause, @Nullable T> function
  ) {
    // Interval pattern matching are stored in a special way,
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
  private @Nullable Pair<@NotNull Expression, Concrete.@NotNull Expression>
  visitNonClassCallDefCallArguments(@NotNull DefCallExpression expression,
                                    @NotNull List<Concrete.Argument> argumentList) {
    Iterator<? extends Expression> defCallArgs = expression.getDefCallArguments().iterator();
    var arguments = argumentList.iterator();
```

### BoundedWildcard
Can generalize to `? extends ClassField`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java

  @Nullable Pair<@NotNull Expression, Concrete.@NotNull Expression>
  visitStatement(@NotNull Map<ClassField, Expression> implementedHere, @NotNull Concrete.ClassFieldImpl statement) {
    Referable implementedField = statement.getImplementedField();
    if (implementedField == null) return nullWithError(new SubExprError(SubExprError.Kind.MissingImplementationField));
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java

  @Nullable Pair<@NotNull Expression, Concrete.@NotNull Expression>
  visitStatement(@NotNull Map<ClassField, Expression> implementedHere, @NotNull Concrete.ClassFieldImpl statement) {
    Referable implementedField = statement.getImplementedField();
    if (implementedField == null) return nullWithError(new SubExprError(SubExprError.Kind.MissingImplementationField));
```

### BoundedWildcard
Can generalize to `? extends Concrete.FunctionClause`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java

  @Nullable Pair<@NotNull Expression, Concrete.@NotNull Expression> visitElimTree(
      List<Concrete.FunctionClause> clauses,
      List<? extends ElimClause<Pattern>> coreClauses
  ) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
  private @Nullable Pair<@NotNull Expression, Concrete.@NotNull Expression>
  visitClassCallArguments(@NotNull ClassCallExpression coreClassCall,
                          @NotNull Iterator<Concrete.Argument> arguments) {
    Map<ClassField, Expression> implementedHere = coreClassCall.getImplementedHere();
    Concrete.Argument argument = arguments.next();
```

### BoundedWildcard
Can generalize to `? super CoreExpression`
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  private final Function<CoreExpression, CoreExpression.FindAction> myFunction;

  public FindSubexpressionVisitor(Function<CoreExpression, CoreExpression.FindAction> function) {
    myFunction = function;
  }
```

### BoundedWildcard
Can generalize to `? extends Referable`
in `base/src/main/java/org/arend/typechecking/visitor/ReplaceVarConcreteVisitor.java`
#### Snippet
```java
  private final Map<Referable, Referable> myOriginalRefs = new HashMap<>();

  public ReplaceVarConcreteVisitor(Set<Referable> globalVars) {
    myGlobalVars = globalVars;
    myVars = new HashSet<>(myGlobalVars);
```

### BoundedWildcard
Can generalize to `? super TCReferable`
in `base/src/main/java/org/arend/typechecking/visitor/CollectDefCallsVisitor.java`
#### Snippet
```java
  private Set<TCReferable> myExcluded;

  public CollectDefCallsVisitor(Collection<TCReferable> dependencies, boolean withBodies) {
    myDependencies = dependencies;
    myWithBodies = withBodies;
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/typechecking/visitor/BaseDefinitionTypechecker.java`
#### Snippet
```java
  }

  protected void getCovariantParameters(DataDefinition dataDefinition, Set<DependentLink> parameters) {
    if (parameters.isEmpty()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends Concrete.ResolvableDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java

  @Override
  public void preBodiesFound(List<Concrete.ResolvableDefinition> definitions) {
    List<Concrete.Definition> newDefs = new ArrayList<>(definitions.size());
    for (Concrete.ResolvableDefinition definition : definitions) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.ResolvableDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java

  @Override
  public void cycleFound(List<Concrete.ResolvableDefinition> definitions) {
    List<TCReferable> cycle = new ArrayList<>();
    for (Concrete.ResolvableDefinition definition : definitions) {
```

### BoundedWildcard
Can generalize to `? extends Definition`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java
  }

  private void findAxiomsAndGoals(List<? extends Concrete.ResolvableDefinition> definitions, Set<Definition> newDefs) {
    Set<FunctionDefinition> axioms = new HashSet<>();
    Set<Definition> goals = new HashSet<>();
```

### BoundedWildcard
Can generalize to `? extends Concrete.UseDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java

  @Override
  public void useFound(List<Concrete.UseDefinition> definitions) {
    myCurrentDefinitions = new ArrayList<>();
    List<Concrete.UseDefinition> newDefs = new ArrayList<>(definitions.size());
```

### BoundedWildcard
Can generalize to `? extends Concrete.ResolvableDefinition`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java

  @Override
  public void bodiesFound(List<Concrete.ResolvableDefinition> definitions) {
    Map<FunctionDefinition,Concrete.Definition> functionDefinitions = new HashMap<>();
    Map<FunctionDefinition, List<? extends ElimClause<ExpressionPattern>>> clausesMap = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? super TCDefReferable`
in `base/src/main/java/org/arend/typechecking/instance/provider/SimpleInstanceProvider.java`
#### Snippet
```java

  @Override
  public TCDefReferable findInstance(Predicate<TCDefReferable> pred) {
    for (int i = myInstances.size() - 1; i >= 0; i--) {
      if (pred.test(myInstances.get(i))) {
```

### BoundedWildcard
Can generalize to `? extends DataDefinition`
in `base/src/main/java/org/arend/typechecking/covariance/RecursiveDataChecker.java`
#### Snippet
```java
  private final Concrete.Parameter myParameter;

  public RecursiveDataChecker(Set<DataDefinition> dataDefinitions, ErrorReporter errorReporter, Concrete.Constructor constructor, Concrete.Parameter parameter) {
    myDataDefinitions = dataDefinitions;
    myErrorReporter = errorReporter;
```

### BoundedWildcard
Can generalize to `? super Concrete.Parameter`
in `base/src/main/java/org/arend/typechecking/visitor/SyntacticDesugarVisitor.java`
#### Snippet
```java
  }

  private static Concrete.ReferenceExpression createAppHoleRef(List<Concrete.Parameter> parameters, Object data) {
    LocalReferable ref = new LocalReferable("p" + parameters.size());
    parameters.add(new Concrete.NameParameter(data, true, ref));
```

### BoundedWildcard
Can generalize to `? extends T`
in `base/src/main/java/org/arend/typechecking/computation/ComputationRunner.java`
#### Snippet
```java
  }

  public T run(CancellationIndicator cancellationIndicator, Supplier<T> runnable) {
    lock(cancellationIndicator);
    try {
```

### BoundedWildcard
Can generalize to `? super TCDefReferable`
in `base/src/main/java/org/arend/typechecking/visitor/DesugarVisitor.java`
#### Snippet
```java
  }

  private void getFields(TCDefReferable ref, Set<TCDefReferable> result) {
    Definition def = ref.getTypechecked();
    if (def instanceof ClassDefinition) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.LevelExpression`
in `base/src/main/java/org/arend/typechecking/visitor/DesugarVisitor.java`
#### Snippet
```java
  }

  private void visitLevelExpressions(List<Concrete.LevelExpression> exprs) {
    if (exprs == null) return;
    for (Concrete.LevelExpression expr : exprs) {
```

### BoundedWildcard
Can generalize to `? super Referable`
in `base/src/main/java/org/arend/typechecking/visitor/DesugarVisitor.java`
#### Snippet
```java
  }

  private static void collectRefs(Concrete.Pattern pattern, Set<Referable> refs) {
    if (pattern instanceof Concrete.NamePattern) {
      Referable ref = ((Concrete.NamePattern) pattern).getRef();
```

### BoundedWildcard
Can generalize to `? extends LevelDefinition`
in `base/src/main/java/org/arend/typechecking/visitor/DesugarVisitor.java`
#### Snippet
```java
  }

  private static void processLevelDefinitions(Concrete.Definition def, Set<LevelDefinition> defs, ErrorReporter errorReporter, String kind) {
    if (defs.size() > 1) {
      errorReporter.report(new TypecheckingError("Definition refers to different " + kind + "-levels", def));
```

### BoundedWildcard
Can generalize to `? super DependentLink`
in `base/src/main/java/org/arend/typechecking/termination/CallMatrix.java`
#### Snippet
```java
    }

    private static int initIndexRanges(DependentLink parameter, @Nullable HashMap<DependentLink, Pair<Integer, Integer>> indexRanges, int currIndex) {
      int length = 1;
      if (!(parameter instanceof EmptyDependentLink)) {
```

### BoundedWildcard
Can generalize to `? super Pair`
in `base/src/main/java/org/arend/typechecking/termination/CallMatrix.java`
#### Snippet
```java
    }

    private static int initIndexRanges(DependentLink parameter, @Nullable HashMap<DependentLink, Pair<Integer, Integer>> indexRanges, int currIndex) {
      int length = 1;
      if (!(parameter instanceof EmptyDependentLink)) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionPattern`
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
  }

  public void collect(ElimClause<ExpressionPattern> clause) {
    if (clause.getExpression() != null) {
      myPatterns = clause.getPatterns();
```

### BoundedWildcard
Can generalize to `? super Var`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquations.java`
#### Snippet
```java
  }

  public List<LevelEquation<Var>> solve(Map<Var, Integer> solution) {
    Map<Var, List<LevelEquation<Var>>> paths = new HashMap<>();

```

### BoundedWildcard
Can generalize to `? extends BaseCallMatrix`
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
    }

    private RecursiveBehaviors(Set<BaseCallMatrix<T>> callMatrices) {
      if (callMatrices != null)
        for (BaseCallMatrix<T> m : callMatrices) myBehaviors.add(new RecursiveBehavior<>(m));
```

### BoundedWildcard
Can generalize to `? extends HashMap`>>
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
    private RecursiveBehaviors<T> myBestRbAttained = null;

    private RecursiveBehaviors(HashMap<T, HashMap<T, HashSet<BaseCallMatrix<T>>>> graph, T v) {
      this(graph.get(v).get(v));
      myBasepoint = v;
```

### BoundedWildcard
Can generalize to `? extends BaseCallMatrix`
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
  }

  public void add(Set<BaseCallMatrix<T>> set) {
    for (BaseCallMatrix<T> cm : set) {
      append(cm, myGraph);
```

### BoundedWildcard
Can generalize to `? super T`
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
  }

  private static <T> boolean append(BaseCallMatrix<T> cm, HashMap<T, HashMap<T, HashSet<BaseCallMatrix<T>>>> graph) {
    HashSet<BaseCallMatrix<T>> set;
    HashMap<T, HashSet<BaseCallMatrix<T>>> map;
```

### BoundedWildcard
Can generalize to `? super ClassDefinition`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreDefinitionChecker.java`
#### Snippet
```java
  }

  private boolean visitClass(ClassDefinition classDef, Set<ClassDefinition> stack, Set<ClassDefinition> visited, List<ClassField> fields) {
    if (!visited.add(classDef)) {
      return true;
```

### BoundedWildcard
Can generalize to `? super ClassDefinition`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreDefinitionChecker.java`
#### Snippet
```java
  }

  private boolean visitClass(ClassDefinition classDef, Set<ClassDefinition> stack, Set<ClassDefinition> visited, List<ClassField> fields) {
    if (!visited.add(classDef)) {
      return true;
```

### BoundedWildcard
Can generalize to `? super ClassField`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreDefinitionChecker.java`
#### Snippet
```java
  }

  private boolean visitClass(ClassDefinition classDef, Set<ClassDefinition> stack, Set<ClassDefinition> visited, List<ClassField> fields) {
    if (!visited.add(classDef)) {
      return true;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java
  private final boolean myHBased;

  public LevelEquationsSolver(List<LevelEquation<LevelVariable>> levelEquations, List<InferenceLevelVariable> variables, List<Pair<InferenceLevelVariable, InferenceLevelVariable>> boundVariables, ErrorReporter errorReporter, boolean pBased, boolean hBased) {
    myPBased = pBased;
    myHBased = hBased;
```

### BoundedWildcard
Can generalize to `? extends LevelEquation`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java
  }

  private void reportCycle(List<LevelEquation<InferenceLevelVariable>> cycle, Set<InferenceLevelVariable> unBased) {
    Set<LevelEquation<? extends LevelVariable>> basedCycle = new LinkedHashSet<>();
    for (LevelEquation<InferenceLevelVariable> equation : cycle) {
```

### BoundedWildcard
Can generalize to `? extends InferenceLevelVariable`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java
  }

  private void calculateUnBased(LevelEquations<InferenceLevelVariable> basedEquations, Set<InferenceLevelVariable> unBased, Map<InferenceLevelVariable, Integer> basedSolution) {
    Set<InferenceLevelVariable> unBasedSet = new HashSet<>();
    if (!myConstantUpperBounds.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super InferenceLevelVariable`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java
  }

  private void calculateUnBased(LevelEquations<InferenceLevelVariable> basedEquations, Set<InferenceLevelVariable> unBased, Map<InferenceLevelVariable, Integer> basedSolution) {
    Set<InferenceLevelVariable> unBasedSet = new HashSet<>();
    if (!myConstantUpperBounds.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super String`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
  }

  private void addReferable(Referable referable, Concrete.Expression type, Map<String, Referable> usedNames) {
    if (referable == null) {
      return;
```

### BoundedWildcard
Can generalize to `? extends Concrete.ClassFieldImpl`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
  }

  void visitClassFieldImpls(List<Concrete.ClassFieldImpl> classFieldImpls, ClassReferable classDef) {
    for (Concrete.ClassFieldImpl impl : classFieldImpls) {
      visitClassFieldImpl(impl, classDef);
```

### BoundedWildcard
Can generalize to `? extends Concrete.Parameter`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
  }

  private void visitPatterns(List<Concrete.Pattern> patterns, List<Concrete.Parameter> parameters, Map<String, Referable> usedNames, boolean resolvePatterns) {
    int j = 0;
    for (int i = 0; i < patterns.size(); i++) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
  }

  private Concrete.Expression visitArguments(Concrete.Expression function, List<Concrete.Argument> arguments) {
    for (Concrete.Argument argument : arguments) {
      function = Concrete.AppExpression.make(function.getData(), function, argument.expression.accept(this, null), argument.isExplicit());
```

### BoundedWildcard
Can generalize to `? extends ExpressionPattern`
in `base/src/main/java/org/arend/typechecking/patternmatching/Util.java`
#### Snippet
```java

    @Override
    public ConstructorExpressionPattern getPattern(List<ExpressionPattern> subPatterns) {
      return new ConstructorExpressionPattern(new ConCallExpression(constructor, levels, dataArguments, Collections.emptyList()), subPatterns);
    }
```

### BoundedWildcard
Can generalize to `? extends ExpressionPattern`
in `base/src/main/java/org/arend/typechecking/patternmatching/Util.java`
#### Snippet
```java

    @Override
    public ConstructorExpressionPattern getPattern(List<ExpressionPattern> subPatterns) {
      return new ConstructorExpressionPattern(new FunCallExpression(myConstructor, myConstructor.makeIdLevels(), myLength, myElementsType), myThisBinding, myEmpty, subPatterns);
    }
```

### BoundedWildcard
Can generalize to `? super ExpressionPattern`
in `base/src/main/java/org/arend/typechecking/patternmatching/Util.java`
#### Snippet
```java
  }

  static void addArguments(List<ExpressionPattern> patterns, DependentLink parameters) {
    for (DependentLink link = DependentLink.Helper.get(parameters, patterns.size()); link.hasNext(); link = link.getNext()) {
      patterns.add(new BindingPattern(link));
```

### BoundedWildcard
Can generalize to `? extends ExpressionPattern`
in `base/src/main/java/org/arend/typechecking/patternmatching/Util.java`
#### Snippet
```java

    @Override
    public ConstructorExpressionPattern getPattern(List<ExpressionPattern> subPatterns) {
      return new ConstructorExpressionPattern(pattern, subPatterns);
    }
```

### BoundedWildcard
Can generalize to `? super Wrapper`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
  }

  private void calculateBoundsOfVariable(InferenceVariable variable, Set<Wrapper> result, Map<InferenceVariable,Set<Wrapper>> bounds, Set<InferenceVariable> visited) {
    if (!visited.add(variable)) {
      return;
```

### BoundedWildcard
Can generalize to `? extends Set`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
  }

  private void calculateBoundsOfVariable(InferenceVariable variable, Set<Wrapper> result, Map<InferenceVariable,Set<Wrapper>> bounds, Set<InferenceVariable> visited) {
    if (!visited.add(variable)) {
      return;
```

### BoundedWildcard
Can generalize to `? super InferenceVariable`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
  }

  private void calculateBoundsOfVariable(InferenceVariable variable, Set<Wrapper> result, Map<InferenceVariable,Set<Wrapper>> bounds, Set<InferenceVariable> visited) {
    if (!visited.add(variable)) {
      return;
```

### BoundedWildcard
Can generalize to `? extends ClassCallExpression`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
  }

  private void reportBoundsError(InferenceVariable var, List<ClassCallExpression> bounds, CMP cmp) {
    List<Equation> equations = new ArrayList<>();
    Expression infRefExpr = new InferenceReferenceExpression(var, null);
```

### BoundedWildcard
Can generalize to `? extends Pair`>
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
  }

  private boolean solveClassCallLowerBounds(List<Pair<InferenceVariable, List<ClassCallExpression>>> list, boolean allOK, boolean solved, CMP cmp, boolean useWrapper) {
    loop:
    for (Pair<InferenceVariable, List<ClassCallExpression>> pair : list) {
```

### BoundedWildcard
Can generalize to `? super Binding`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
  }

  public static @Nullable ConCallExpression computeMatchingPatterns(DataCallExpression dataCall, Constructor constructor, @Nullable ExprSubstitution substitution, Map<Binding, ExpressionPattern> result) {
    List<MatchResult> matchResults = new ArrayList<>();
    if (computeMatchingExpressions(dataCall, constructor, false, matchResults) == null) {
```

### BoundedWildcard
Can generalize to `? extends @NotNull TypecheckingResult`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  }

  private static Expression generateAppExpressionByArguments(Expression rootFunction, List<@NotNull TypecheckingResult> argumentResults, List<Concrete.@NotNull Argument> arguments) {
    assert argumentResults.size() == arguments.size();
    Expression actualFunction;
```

### BoundedWildcard
Can generalize to `? extends Concrete.@NotNull Argument`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  }

  private static Expression generateAppExpressionByArguments(Expression rootFunction, List<@NotNull TypecheckingResult> argumentResults, List<Concrete.@NotNull Argument> arguments) {
    assert argumentResults.size() == arguments.size();
    Expression actualFunction;
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  }

  private TResult checkArrayCons(DefCallResult defCallResult, List<Concrete.Argument> arguments, Expression expectedType, Concrete.Expression fun) {
    int index = 0;
    Expression length = null;
```

### BoundedWildcard
Can generalize to `? extends @NotNull TypecheckingResult`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  }

  private PiExpression generatePiExpressionByArguments(@NotNull Expression codomain,  List<@NotNull TypecheckingResult> argumentResults, List<Concrete.@NotNull Argument> arguments, Concrete.SourceNode node) {
    Expression actualCodomain;
    if (argumentResults.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.@NotNull Argument`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  }

  private PiExpression generatePiExpressionByArguments(@NotNull Expression codomain,  List<@NotNull TypecheckingResult> argumentResults, List<Concrete.@NotNull Argument> arguments, Concrete.SourceNode node) {
    Expression actualCodomain;
    if (argumentResults.size() == 1) {
```

### BoundedWildcard
Can generalize to `? extends InferenceVariable`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  }

  private void typecheckDeferredArgument(Pair<InferenceVariable, Concrete.Expression> pair, TResult result) {
    TypecheckingResult argResult = myVisitor.checkArgument(pair.proj2, pair.proj1.getType(), result, pair.proj1);
    Expression argResultExpr = argResult == null ? new ErrorExpression() : argResult.expression;
```

### BoundedWildcard
Can generalize to `? extends Concrete.Expression`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  }

  private void typecheckDeferredArgument(Pair<InferenceVariable, Concrete.Expression> pair, TResult result) {
    TypecheckingResult argResult = myVisitor.checkArgument(pair.proj2, pair.proj1.getType(), result, pair.proj1);
    Expression argResultExpr = argResult == null ? new ErrorExpression() : argResult.expression;
```

### BoundedWildcard
Can generalize to `? super ExpressionPattern`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
  }

  private boolean checkElimPatterns(DependentLink parameters, List<? extends Pattern> patterns, ExprSubstitution substitution, List<Binding> newBindings, ExprSubstitution idpSubst, ExprSubstitution patternSubst, ExprSubstitution reversePatternSubst, Expression errorExpr, List<ExpressionPattern> exprPatterns) {
    boolean noEmpty = true;
    for (Pattern pattern : patterns) {
```

### BoundedWildcard
Can generalize to `? super Binding`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
  private boolean myCheckLevelVariables;

  public CoreExpressionChecker(Set<Binding> context, Equations equations, Concrete.SourceNode sourceNode) {
    myContext = context;
    myEquations = equations;
```

### BoundedWildcard
Can generalize to `? extends ExtElimClause`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  public boolean check(List<ExtElimClause> clauses, List<? extends Concrete.FunctionClause> cClauses, ElimBody elimBody) {
    assert cClauses == null || clauses.size() <= cClauses.size();

```

### BoundedWildcard
Can generalize to `? extends ExpressionPattern`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private static void collectPaths(List<ExpressionPattern> patterns, ExprSubstitution substitution) {
    for (ExpressionPattern pattern : patterns) {
      if (pattern instanceof ConstructorExpressionPattern conPattern && conPattern.getDefinition() == Prelude.PATH_CON) {
```

### BoundedWildcard
Can generalize to `? extends ExprSubstitution`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private boolean checkCondition(Expression expr, Pair<List<Expression>, ExprSubstitution> pair, Expression evaluatedExpr1, ExtElimClause clause, CallableDefinition definition, Concrete.SourceNode sourceNode, ErrorReporter errorReporter) {
    Expression evaluatedExpr2 = expr.subst(pair.proj2);
    if (evaluatedExpr1 == null || !CompareVisitor.compare(myEquations, CMP.EQ, evaluatedExpr1, evaluatedExpr2, null, sourceNode)) {
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private boolean checkIntervalCondition(Pair<Expression, Expression> pair1, Pair<Expression, Expression> pair2, boolean isLeft1, boolean isLeft2, DependentLink link1, DependentLink link2, CallableDefinition definition) {
    Expression case1 = isLeft1 ? pair1.proj1 : pair1.proj2;
    Expression case2 = isLeft2 ? pair2.proj1 : pair2.proj2;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private boolean checkIntervalCondition(Pair<Expression, Expression> pair1, Pair<Expression, Expression> pair2, boolean isLeft1, boolean isLeft2, DependentLink link1, DependentLink link2, CallableDefinition definition) {
    Expression case1 = isLeft1 ? pair1.proj1 : pair1.proj2;
    Expression case2 = isLeft2 ? pair2.proj1 : pair2.proj2;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private boolean checkIntervalCondition(Pair<Expression, Expression> pair1, Pair<Expression, Expression> pair2, boolean isLeft1, boolean isLeft2, DependentLink link1, DependentLink link2, CallableDefinition definition) {
    Expression case1 = isLeft1 ? pair1.proj1 : pair1.proj2;
    Expression case2 = isLeft2 ? pair2.proj1 : pair2.proj2;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private boolean checkIntervalCondition(Pair<Expression, Expression> pair1, Pair<Expression, Expression> pair2, boolean isLeft1, boolean isLeft2, DependentLink link1, DependentLink link2, CallableDefinition definition) {
    Expression case1 = isLeft1 ? pair1.proj1 : pair1.proj2;
    Expression case2 = isLeft2 ? pair2.proj1 : pair2.proj2;
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private boolean checkIntervalClauseCondition(Pair<Expression, Expression> pair, boolean isLeft, int index, ElimClause<ExpressionPattern> clause, Concrete.SourceNode sourceNode, CallableDefinition definition) {
    Expression expr = isLeft ? pair.proj1 : pair.proj2;
    if (expr == null || clause.getExpression() == null) {
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  private boolean checkIntervalClauseCondition(Pair<Expression, Expression> pair, boolean isLeft, int index, ElimClause<ExpressionPattern> clause, Concrete.SourceNode sourceNode, CallableDefinition definition) {
    Expression expr = isLeft ? pair.proj1 : pair.proj2;
    if (expr == null || clause.getExpression() == null) {
```

### BoundedWildcard
Can generalize to `? extends ExtElimClause`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
  }

  public boolean check(Body body, List<ExtElimClause> clauses, List<? extends Concrete.FunctionClause> cClauses, CallableDefinition definition) {
    assert cClauses == null || clauses.size() <= cClauses.size();

```

### BoundedWildcard
Can generalize to `? super DependentLink`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> computeParamSpec(DependentLink param, DataCallExpression dataCall, List<DependentLink> elimParams, Map<DependentLink, List<ConCallExpression>> paramSpec2, DependentLink parameters) {
    if (myErrorReporter == null) return null;
    Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> paramSpec = new HashMap<>();
```

### BoundedWildcard
Can generalize to `? extends ExtElimClause`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private ElimTree clausesToElimTree(List<ExtElimClause> clauses, int argsStackSize, int numberOfIntervals) {
    try (Utils.ContextSaver ignored = new Utils.ContextSaver(myContext)) {
      int index = 0;
```

### BoundedWildcard
Can generalize to `? extends DependentLink`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private static List<List<ExpressionPattern>> generateMissingClauses(List<DependentLink> elimParams, int i, ExprSubstitution substitution, Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> paramSpec, Map<DependentLink, List<ConCallExpression>> paramSpec2) {
    if (i == elimParams.size()) {
      List<List<ExpressionPattern>> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends List`>>
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private static List<List<ExpressionPattern>> generateMissingClauses(List<DependentLink> elimParams, int i, ExprSubstitution substitution, Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> paramSpec, Map<DependentLink, List<ConCallExpression>> paramSpec2) {
    if (i == elimParams.size()) {
      List<List<ExpressionPattern>> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? extends List`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private static List<List<ExpressionPattern>> generateMissingClauses(List<DependentLink> elimParams, int i, ExprSubstitution substitution, Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> paramSpec, Map<DependentLink, List<ConCallExpression>> paramSpec2) {
    if (i == elimParams.size()) {
      List<List<ExpressionPattern>> result = new ArrayList<>();
```

### BoundedWildcard
Can generalize to `? super Constructor`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private void collectConstructors(DataDefinition dataDef, Body body, Set<Constructor> result) {
    if (body == null) {
      return;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private void collectClauseIndices(ElimTree elimTree, Set<Integer> indices) {
    if (elimTree instanceof LeafElimTree) {
      indices.add(((LeafElimTree) elimTree).getClauseIndex());
```

### BoundedWildcard
Can generalize to `? super DependentLink`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private ExpressionPattern checkDConstructor(Expression expr, Set<DependentLink> usedVars, Concrete.SourceNode sourceNode) {
    if (expr instanceof ReferenceExpression && ((ReferenceExpression) expr).getBinding() instanceof DependentLink var) {
      if (!usedVars.add(var)) {
```

### BoundedWildcard
Can generalize to `? super Concrete.ReferenceExpression`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private void getCovariantDefinitions(Concrete.Expression expr, List<Concrete.ReferenceExpression> result) {
    if (expr instanceof Concrete.PiExpression) {
      getCovariantDefinitions(((Concrete.PiExpression) expr).getCodomain(), result);
```

### BoundedWildcard
Can generalize to `? super ClassDefinition`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private ClassField findClassifyingField(ClassDefinition superClass, ClassDefinition classDef, Set<ClassDefinition> visited) {
    if (!visited.add(superClass)) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private List<Concrete.Argument> getArguments(Definition def, List<Concrete.Argument> args) {
    List<Concrete.Argument> result = new ArrayList<>();
    int i = 0;
```

### BoundedWildcard
Can generalize to `? extends LocalInstance`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private void addLocalInstances(List<LocalInstance> localInstances, Binding thisParam, ClassDefinition classDef, boolean useClassDef, LocalInstancePool localInstancePool) {
    if (localInstances.isEmpty() && !useClassDef) {
      return;
```

### BoundedWildcard
Can generalize to `? super FieldReferable`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private static boolean implementField(ClassField classField, AbsExpression implementation, ClassDefinition classDef, List<FieldReferable> alreadyImplemented) {
    AbsExpression oldImpl = classDef.implementField(classField, implementation);
    if (oldImpl == null) return true;
```

### BoundedWildcard
Can generalize to `? super Binding`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private void getFreeVariablesClosure(Expression expression, Set<Binding> freeVars) {
    for (Binding var : FreeVariablesCollector.getFreeVariables(expression)) {
      if (freeVars.add(var)) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.CoClauseElement`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private Pair<Expression,ClassCallExpression> typecheckCoClauses(FunctionDefinition typedDef, Concrete.BaseFunctionDefinition def, FunctionKind kind, List<Concrete.CoClauseElement> elements) {
    List<Concrete.Argument> arguments = new ArrayList<>();
    for (Concrete.Parameter parameter : def.getParameters()) {
```

### BoundedWildcard
Can generalize to `? super LocalInstance`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private static void addFieldInstance(ClassField field, ClassDefinition classDef, List<LocalInstance> instances, boolean onlyOverridden) {
    PiExpression overriddenType = classDef.getOverriddenType(field);
    if (onlyOverridden && overriddenType == null) return;
```

### BoundedWildcard
Can generalize to `? super Boolean`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private Pair<Sort,Expression> typecheckParameters(Concrete.GeneralDefinition def, Definition typedDef, LinkList list, LocalInstancePool localInstancePool, Sort expectedSort, DependentLink oldParameters, ClassField implementedField, List<Boolean> typedParameters) {
    Sort sort = Sort.PROP;

```

### BoundedWildcard
Can generalize to `? super LevelVariable`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private boolean typecheckLevelParameters(Concrete.LevelParameters params, LevelVariable base, List<LevelVariable> parameters, Map<LevelReferable, ParamLevelVariable> variables) {
    if (params == null) {
      parameters.add(base);
```

### BoundedWildcard
Can generalize to `? super LevelReferable`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private boolean typecheckLevelParameters(Concrete.LevelParameters params, LevelVariable base, List<LevelVariable> parameters, Map<LevelReferable, ParamLevelVariable> variables) {
    if (params == null) {
      parameters.add(base);
```

### BoundedWildcard
Can generalize to `? super ParamLevelVariable`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private boolean typecheckLevelParameters(Concrete.LevelParameters params, LevelVariable base, List<LevelVariable> parameters, Map<LevelReferable, ParamLevelVariable> variables) {
    if (params == null) {
      parameters.add(base);
```

### BoundedWildcard
Can generalize to `? extends Concrete.FunctionClause`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  }

  public List<ExtElimClause> typecheckClauses(List<Concrete.FunctionClause> clauses, List<? extends Concrete.Parameter> abstractParameters, DependentLink parameters, Expression expectedType, FunctionDefinition definition) {
    this.clausesParameters = parameters;

```

### BoundedWildcard
Can generalize to `? super Binding`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  }

  private int getIntervalBindings(List<? extends ExpressionPattern> patterns, int index, List<Binding> result) {
    for (ExpressionPattern pattern : patterns) {
      index = getIntervalBindings(pattern.getSubPatterns(), index, result);
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  }

  private Expression evalBody(ExprSubstitution substitution, ElimBody body, List<Expression> args) {
    List<Expression> substArgs = new ArrayList<>(args.size());
    for (Expression arg : args) {
```

### BoundedWildcard
Can generalize to `? extends Expression`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  }

  private Expression makeFunCall(FunctionDefinition definition, List<Expression> args, ExprSubstitution substitution, Concrete.SourceNode sourceNode) {
    List<Expression> newArgs = new ArrayList<>(args.size());
    for (Expression arg : args) {
```

### BoundedWildcard
Can generalize to `? extends Concrete.Argument`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private Concrete.Expression desugarClassApp(Concrete.ReferenceExpression fun, List<Concrete.Argument> arguments, Concrete.Expression expr, List<SingleDependentLink> expectedParams, boolean inferTailImplicits, Set<ClassField> implemented) {
    Referable ref = fun.getReferent();
    if (!(ref instanceof TCDefReferable)) {
```

### BoundedWildcard
Can generalize to `? extends SingleDependentLink`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private Concrete.Expression desugarClassApp(Concrete.ReferenceExpression fun, List<Concrete.Argument> arguments, Concrete.Expression expr, List<SingleDependentLink> expectedParams, boolean inferTailImplicits, Set<ClassField> implemented) {
    Referable ref = fun.getReferent();
    if (!(ref instanceof TCDefReferable)) {
```

### BoundedWildcard
Can generalize to `? extends Sort`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private static Sort generateUniqueUpperBound(List<Sort> sorts) {
    LevelVariable pVar = null;
    LevelVariable hVar = null;
```

### BoundedWildcard
Can generalize to `? super ExpressionTypechecker`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

  @Override
  public <T> T withFreeBindings(@NotNull FreeBindingsModifier modifier, @NotNull Function<ExpressionTypechecker, T> action) {
    if (modifier.commands.isEmpty()) {
      return action.apply(this);
```

### BoundedWildcard
Can generalize to `? super Level`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private void generateLevel(LevelVariable param, LevelSubstitution defaultLevels, boolean useMinAsDefault, boolean isUniverseLike, Concrete.SourceNode sourceNode, List<Level> result) {
    if (defaultLevels != null) {
      Level level = (Level) defaultLevels.get(param);
```

### BoundedWildcard
Can generalize to `? super Sort`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private boolean visitParameter(Concrete.Parameter arg, Expression expectedType, List<Sort> resultSorts, LinkList list) {
    Type result = checkType(arg.getType(), expectedType == null ? Type.OMEGA : expectedType);
    if (result == null) return false;
```

### BoundedWildcard
Can generalize to `? super ParametersProvider`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

    @Override
    public <T> @Nullable Pair<TypecheckingResult,T> coerce(Function<ParametersProvider, Pair<Expression,T>> checker) {
      return expression instanceof FunCallExpression && ((FunCallExpression) expression).getDefinition().getKind() == CoreFunctionDefinition.Kind.TYPE
        ? coerceToType(expression, t -> checker.apply(new ExpressionParametersProvider(t))) : null;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

    @Override
    public <T> @Nullable Pair<TypecheckingResult,T> coerce(Function<ParametersProvider, Pair<Expression,T>> checker) {
      return expression instanceof FunCallExpression && ((FunCallExpression) expression).getDefinition().getKind() == CoreFunctionDefinition.Kind.TYPE
        ? coerceToType(expression, t -> checker.apply(new ExpressionParametersProvider(t))) : null;
```

### BoundedWildcard
Can generalize to `? extends Referable`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  public void addBindings(Map<Referable, Binding> bindings) {
    context.putAll(bindings);
  }
```

### BoundedWildcard
Can generalize to `? extends Binding`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  public void addBindings(Map<Referable, Binding> bindings) {
    context.putAll(bindings);
  }
```

### BoundedWildcard
Can generalize to `? super ExpressionTypechecker`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

  @Override
  public <T> T withErrorReporter(@NotNull ErrorReporter errorReporter, @NotNull Function<ExpressionTypechecker, T> action) {
    MyErrorReporter originalErrorReport = this.errorReporter;
    this.errorReporter = new MyErrorReporter(errorReporter);
```

### BoundedWildcard
Can generalize to `? extends SubstitutionPair`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

  @Override
  public @Nullable Expression substitute(@NotNull CoreExpression expression, @NotNull LevelSubstitution levelSubst, @NotNull List<SubstitutionPair> substPairs) {
    if (!(expression instanceof Expression)) throw new IllegalArgumentException();
    if (substPairs.isEmpty()) {
```

### BoundedWildcard
Can generalize to `? super TypedExpression`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

  @Override
  public @Nullable Pair<AbstractedExpression,TypedExpression> typecheckAbstracted(@NotNull ConcreteExpression expression, @Nullable CoreExpression expectedType, int abstracted, @Nullable Function<TypedExpression,TypedExpression> transform) {
    TypecheckingResult result = typecheck(expression, expectedType);
    if (result == null) return null;
```

### BoundedWildcard
Can generalize to `? extends TypedExpression`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

  @Override
  public @Nullable Pair<AbstractedExpression,TypedExpression> typecheckAbstracted(@NotNull ConcreteExpression expression, @Nullable CoreExpression expectedType, int abstracted, @Nullable Function<TypedExpression,TypedExpression> transform) {
    TypecheckingResult result = typecheck(expression, expectedType);
    if (result == null) return null;
```

### BoundedWildcard
Can generalize to `? super Expression`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private static <T> Pair<TypecheckingResult,T> coerceToType(Expression expectedType, Function<Expression, Pair<Expression,T>> checker) {
    List<TypeConstructorExpression> stack = new ArrayList<>();
    Expression curType = expectedType;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private static <T> Pair<TypecheckingResult,T> coerceToType(Expression expectedType, Function<Expression, Pair<Expression,T>> checker) {
    List<TypeConstructorExpression> stack = new ArrayList<>();
    Expression curType = expectedType;
```

### BoundedWildcard
Can generalize to `? super ExpressionTypechecker`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

  @Override
  public <T> T withCurrentState(@NotNull Function<ExpressionTypechecker, T> action) {
    saveState();
    try {
```

### BoundedWildcard
Can generalize to `? super ClassField`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private TypecheckingResult typecheckClassExt(List<? extends Concrete.ClassFieldImpl> classFieldImpls, Expression expectedType, Expression renewExpr, ClassCallExpression classCallExpr, Set<ClassField> pseudoImplemented, Concrete.Expression expr, boolean useDefaults) {
    ClassDefinition baseClass = classCallExpr.getDefinition();
    Map<ClassField, Expression> fieldSet = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? super Binding`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private LetClausePattern typecheckLetClausePattern(Concrete.Pattern pattern, Expression expression, Expression type, Set<Binding> bindings) {
    if (pattern instanceof Concrete.NamePattern) {
      Referable referable = ((Concrete.NamePattern) pattern).getRef();
```

### BoundedWildcard
Can generalize to `? super Sort`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private boolean visitSigmaParameter(Concrete.TypeParameter arg, Expression expectedType, List<Sort> resultSorts, LinkList list) {
    Type result = checkType(arg.getType(), expectedType == null ? Type.OMEGA : expectedType);
    if (result == null) return false;
```

### BoundedWildcard
Can generalize to `? extends Concrete.LevelExpression`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private void typecheckLevels(List<Concrete.LevelExpression> levels, List<? extends LevelVariable> params, LevelSubstitution defaultLevels, boolean useMinAsDefault, boolean isUniverseLike, Concrete.SourceNode sourceNode, List<Level> result) {
    int s = result.size();
    if (levels == null) {
```

### BoundedWildcard
Can generalize to `? super Sort`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  }

  private SingleDependentLink visitTypeParameter(Concrete.TypeParameter param, List<Sort> sorts, Type expectedType) {
    Type argResult = checkType(param.getType(), Type.OMEGA);
    if (argResult == null) return null;
```

## RuleId[id=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `api/src/main/java/org/arend/ext/serialization/SerializableKey.java`
#### Snippet
```java
  public abstract @NotNull byte[] serialize(@NotNull ArendSerializer serializer, T object);

  public abstract @NotNull T deserialize(@NotNull ArendDeserializer deserializer, @NotNull byte[] data) throws DeserializationException;
}

```

### NullableProblems
Primitive type members cannot be annotated
in `api/src/main/java/org/arend/ext/serialization/SerializableKey.java`
#### Snippet
```java
  }

  public abstract @NotNull byte[] serialize(@NotNull ArendSerializer serializer, T object);

  public abstract @NotNull T deserialize(@NotNull ArendDeserializer deserializer, @NotNull byte[] data) throws DeserializationException;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `abstract protected`
in `api/src/main/java/org/arend/ext/core/expr/BaseCoreExpressionVisitor.java`
#### Snippet
```java

public abstract class BaseCoreExpressionVisitor<P, R> implements CoreExpressionVisitor<P, R> {
  abstract protected R visit(CoreExpression expression, P param);

  @Override
```

### MissortedModifiers
Missorted modifiers `final private`
in `api/src/main/java/org/arend/ext/error/ListErrorReporter.java`
#### Snippet
```java

public class ListErrorReporter implements ErrorReporter {
  final private List<GeneralError> myErrorList;

  public ListErrorReporter() {
```

### MissortedModifiers
Missorted modifiers `final static`
in `api/src/main/java/org/arend/ext/prettyprinting/doc/HangDoc.java`
#### Snippet
```java

  public final static int INDENT = 2;
  public final static int MAX_INDENT = 6;

  HangDoc(Doc top, Doc bottom) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `api/src/main/java/org/arend/ext/prettyprinting/doc/HangDoc.java`
#### Snippet
```java
  private final Doc bottom;

  public final static int INDENT = 2;
  public final static int MAX_INDENT = 6;

```

### MissortedModifiers
Missorted modifiers `final static`
in `cli/src/main/java/org/arend/frontend/PositionComparator.java`
#### Snippet
```java

public class PositionComparator implements PartialComparator<TCDefReferable> {
  public final static PositionComparator INSTANCE = new PositionComparator();

  private PositionComparator() {}
```

### MissortedModifiers
Missorted modifiers `final static`
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
  private final static String FALSE_VALUE = "no";

  private final static class Request {
    public final String message;
    public final Object data;
```

### MissortedModifiers
Missorted modifiers `final static`
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
public class CliSession extends BaseSession {
  private final static String TRUE_VALUE = "yes";
  private final static String FALSE_VALUE = "no";

  private final static class Request {
```

### MissortedModifiers
Missorted modifiers `final static`
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java

public class CliSession extends BaseSession {
  private final static String TRUE_VALUE = "yes";
  private final static String FALSE_VALUE = "no";

```

### MissortedModifiers
Missorted modifiers `volatile static`
in `cli/src/main/java/org/arend/frontend/repl/action/LoadModuleCommand.java`
#### Snippet
```java
    }

    private volatile static @Nullable ModulePath lastModulePath = null;

    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/core/expr/SmallIntegerExpression.java`
#### Snippet
```java

public class SmallIntegerExpression extends IntegerExpression {
  private final static int MAX_VALUE_TO_MULTIPLY = 45000;

  private final int myInteger;
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/core/context/param/EmptyDependentLink.java`
#### Snippet
```java

public class EmptyDependentLink implements SingleDependentLink {
  private final static EmptyDependentLink INSTANCE = new EmptyDependentLink();

  private EmptyDependentLink() {}
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
  public final static GetTypeVisitor INSTANCE = new GetTypeVisitor(true, false);
  public final static GetTypeVisitor NN_INSTANCE = new GetTypeVisitor(false, false);
  public final static GetTypeVisitor MIN_INSTANCE = new GetTypeVisitor(true, true);

  private final boolean myNormalizing;
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java

public class GetTypeVisitor implements ExpressionVisitor<Void, Expression> {
  public final static GetTypeVisitor INSTANCE = new GetTypeVisitor(true, false);
  public final static GetTypeVisitor NN_INSTANCE = new GetTypeVisitor(false, false);
  public final static GetTypeVisitor MIN_INSTANCE = new GetTypeVisitor(true, true);
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
public class GetTypeVisitor implements ExpressionVisitor<Void, Expression> {
  public final static GetTypeVisitor INSTANCE = new GetTypeVisitor(true, false);
  public final static GetTypeVisitor NN_INSTANCE = new GetTypeVisitor(false, false);
  public final static GetTypeVisitor MIN_INSTANCE = new GetTypeVisitor(true, true);

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java
  }

  public static abstract class SourceNodeImpl implements SourceNode {
    @NotNull
    @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintWithSubexprVisitor.java`
#### Snippet
```java

public class PrettyPrintWithSubexprVisitor extends PrettyPrintVisitor {
  public final static Character MAGIC = '⁀';

  public PrettyPrintWithSubexprVisitor(StringBuilder builder, int indent, boolean doIndent) {
```

### MissortedModifiers
Missorted modifiers `final public`
in `base/src/main/java/org/arend/term/prettyprint/MinimizedRepresentation.java`
#### Snippet
```java
import java.util.stream.Collectors;

final public class MinimizedRepresentation {
    private MinimizedRepresentation() {
    }
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/module/scopeprovider/EmptyModuleScopeProvider.java`
#### Snippet
```java

public class EmptyModuleScopeProvider implements ModuleScopeProvider {
  public final static EmptyModuleScopeProvider INSTANCE = new EmptyModuleScopeProvider();

  private EmptyModuleScopeProvider() {}
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/module/scopeprovider/CachingModuleScopeProvider.java`
#### Snippet
```java
  private final Map<ModulePath, Scope> myScopes = new HashMap<>();

  private final static Scope NULL_SCOPE = new Scope() {};

  public CachingModuleScopeProvider(ModuleScopeProvider moduleScopeProvider) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/naming/scope/CachingScope.java`
#### Snippet
```java
  private final Map<String, Scope> myOnlyInternalNamespaces = new HashMap<>();
  private final Scope myScope;
  private final static Scope EMPTY_SCOPE = new Scope() {};

  private CachingScope(Scope scope) {
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/naming/scope/EmptyScope.java`
#### Snippet
```java

public class EmptyScope implements Scope {
  public final static EmptyScope INSTANCE = new EmptyScope();

  private EmptyScope() {}
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  public static abstract class BinOpLayout implements AbstractLayout {
    abstract void printLeft(PrettyPrintVisitor pp);
    abstract void printRight(PrettyPrintVisitor pp);
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  public static abstract class ListLayout<E> {
    abstract void printListElement(PrettyPrintVisitor ppv, E e);

```

### MissortedModifiers
Missorted modifiers `static public`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
  }

  static public void printArguments(PrettyPrintVisitor pp, List<Concrete.Argument> args, boolean noIndent) {
    new ListLayout<Concrete.Argument>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java

public class Renamer implements VariableRenamer {
  public final static String UNNAMED = "_x";
  private String myUnnamed = UNNAMED;
  private int myBase = 1;
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/extImpl/DefinitionProviderImpl.java`
#### Snippet
```java

public class DefinitionProviderImpl implements DefinitionProvider {
  public final static DefinitionProvider INSTANCE = new DefinitionProviderImpl();

  private DefinitionProviderImpl() {}
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class Pattern extends SourceNodeImpl implements ConcretePattern {
    public static final byte PREC = 11;
    private boolean myExplicit;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class Definition extends ResolvableDefinition implements ReferableDefinition, ConcreteDefinition {
    private final TCDefReferable myReferable;
    public TCDefReferable enclosingClass;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  // Parameters

  public static abstract class Parameter extends SourceNodeImpl implements org.arend.naming.reference.Parameter, ConcreteParameter {
    private boolean myExplicit;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class SourceNodeImpl implements SourceNode {
    private Object myData;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class FunctionBody extends SourceNodeImpl implements ConcreteFunctionBody {
    FunctionBody(Object data) {
      super(data);
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  // Level expressions

  public static abstract class LevelExpression extends SourceNodeImpl implements ConcreteLevel {
    LevelExpression(Object data) {
      super(data);
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class ReferableDefinitionBase implements ReferableDefinition {
    @Override
    public String toString() {
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  // Expressions

  public static abstract class Expression extends SourceNodeImpl implements ConcreteExpression {
    public static final byte PREC = -12;

```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java

  public static class NumberPattern extends Pattern implements ConcreteNumberPattern {
    public final static int MAX_VALUE = 100;
    private final int myNumber;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class Clause extends SourceNodeImpl implements PatternHolder {
    private final List<Pattern> myPatterns;

```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class BaseFunctionDefinition extends Definition {
    private final List<Parameter> myParameters;
    private Expression myResultType;
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static abstract class ResolvableDefinition implements GeneralDefinition {
    Stage stage = Stage.TYPE_CLASS_REFERENCES_RESOLVED;
    private Status myStatus = Status.NO_ERRORS;
```

### MissortedModifiers
Missorted modifiers `final static`
in `base/src/main/java/org/arend/typechecking/provider/EmptyConcreteProvider.java`
#### Snippet
```java

public class EmptyConcreteProvider implements ConcreteProvider {
  public final static EmptyConcreteProvider INSTANCE = new EmptyConcreteProvider();

  private EmptyConcreteProvider() {}
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `CasePair` is the same as one of its superclass' names
in `base/src/main/java/org/arend/core/elimtree/IntervalElim.java`
#### Snippet
```java
  }

  public static class CasePair extends Pair<Expression, Expression> implements CoreIntervalElim.CasePair {
    public CasePair(Expression proj1, Expression proj2) {
      super(proj1, proj2);
```

### ClassNameSameAsAncestorName
Class name `ParametersLevel` is the same as one of its superclass' names
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  }

  public static class ParametersLevel extends org.arend.core.definition.ParametersLevel {
    public final List<ClassField> fields;
    public final List<Pair<ClassDefinition,Set<ClassField>>> strictList;
```

### ClassNameSameAsAncestorName
Class name `Parameter` is the same as one of its superclass' names
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java
  }

  public interface Parameter extends LamParameter, org.arend.naming.reference.Parameter {
    @Nullable Expression getType();
    boolean isStrict();
```

### ClassNameSameAsAncestorName
Class name `Reference` is the same as one of its superclass' names
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java
  }

  public interface Reference extends org.arend.naming.reference.Reference, SourceNode {
  }

```

### ClassNameSameAsAncestorName
Class name `Parameter` is the same as one of its superclass' names
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  // Parameters

  public static abstract class Parameter extends SourceNodeImpl implements org.arend.naming.reference.Parameter, ConcreteParameter {
    private boolean myExplicit;

```

### ClassNameSameAsAncestorName
Class name `LevelParameters` is the same as one of its superclass' names
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static class LevelParameters extends SourceNodeImpl implements Abstract.LevelParameters, ConcreteLevelParameters {
    public final List<? extends LevelReferable> referables;
    public final boolean isIncreasing;
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitInteger()` is identical to its super method
in `base/src/main/java/org/arend/core/expr/visitor/NormalizingFindBindingVisitor.java`
#### Snippet
```java

  @Override
  public Boolean visitInteger(IntegerExpression expr, Void params) {
    return false;
  }
```

### RedundantMethodOverride
Method `visitError()` is identical to its super method
in `base/src/main/java/org/arend/core/expr/visitor/NormalizingFindBindingVisitor.java`
#### Snippet
```java

  @Override
  public Boolean visitError(ErrorExpression expr, Void params) {
    return false;
  }
```

### RedundantMethodOverride
Method `visitUniverse()` is identical to its super method
in `base/src/main/java/org/arend/core/expr/visitor/NormalizingFindBindingVisitor.java`
#### Snippet
```java

  @Override
  public Boolean visitUniverse(UniverseExpression expr, Void params) {
    return false;
  }
```

### RedundantMethodOverride
Method `prettyPrint()` is identical to its super method
in `base/src/main/java/org/arend/core/pattern/ExpressionPattern.java`
#### Snippet
```java

  @Override
  default LineDoc prettyPrint(PrettyPrinterConfig ppConfig) {
    return DocFactory.pattern(this, ppConfig);
  }
```

### RedundantMethodOverride
Method `getHLevelParameters()` is identical to its super method
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java
  }

  public Concrete.LevelParameters getHLevelParameters() {
    return hLevelParameters;
  }
```

### RedundantMethodOverride
Method `getPLevelParameters()` is identical to its super method
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java
  }

  public Concrete.LevelParameters getPLevelParameters() {
    return pLevelParameters;
  }
```

### RedundantMethodOverride
Method `visitThis()` is identical to its super method
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java

  @Override
  public Concrete.Expression visitThis(Concrete.ThisExpression expr, Void ignored) {
    return expr;
  }
```

### RedundantMethodOverride
Method `printSpaceBefore()` is identical to its super method
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

      @Override
      boolean printSpaceBefore() { return true; }

      @Override
```

### RedundantMethodOverride
Method `printSpaceBefore()` is identical to its super method
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

      @Override
      boolean printSpaceBefore() { return true;}

      @Override
```

### RedundantMethodOverride
Method `getTypecheckable()` is identical to its super method
in `base/src/main/java/org/arend/naming/reference/TCLevelReferable.java`
#### Snippet
```java

  @Override
  public @NotNull TCReferable getTypecheckable() {
    return this;
  }
```

### RedundantMethodOverride
Method `visitApplyHole()` is identical to its super method
in `base/src/main/java/org/arend/typechecking/visitor/SyntacticDesugarVisitor.java`
#### Snippet
```java

  @Override
  public Concrete.Expression visitApplyHole(Concrete.ApplyHoleExpression expr, Void params) {
    return expr;
  }
```

### RedundantMethodOverride
Method `visitPattern()` only delegates to its super method
in `base/src/main/java/org/arend/typechecking/visitor/SyntacticDesugarVisitor.java`
#### Snippet
```java

  @Override
  protected void visitPattern(Concrete.Pattern pattern, Void params) {
    super.visitPattern(pattern, params);
  }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          }
        }
        return super.visitDefCall(expr, params);
      }
    }, null);
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreSort;`
in `api/src/main/java/org/arend/ext/core/expr/CoreArrayExpression.java`
#### Snippet
```java

import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreSort;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreLevel;`
in `api/src/main/java/org/arend/ext/core/expr/CoreDefCallExpression.java`
#### Snippet
```java

import org.arend.ext.core.definition.CoreDefinition;
import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreLevels;
import org.arend.ext.core.level.CoreSort;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreLevels;`
in `api/src/main/java/org/arend/ext/core/expr/CoreDefCallExpression.java`
#### Snippet
```java
import org.arend.ext.core.definition.CoreDefinition;
import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreLevels;
import org.arend.ext.core.level.CoreSort;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.level.CoreSort;`
in `api/src/main/java/org/arend/ext/core/expr/CoreDefCallExpression.java`
#### Snippet
```java
import org.arend.ext.core.level.CoreLevel;
import org.arend.ext.core.level.CoreLevels;
import org.arend.ext.core.level.CoreSort;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import java.util.Iterator;`
in `api/src/main/java/org/arend/ext/error/GeneralError.java`
#### Snippet
```java

import java.util.Collection;
import java.util.Iterator;
import java.util.function.BiConsumer;

```

### UNUSED_IMPORT
Unused import `import org.arend.ext.typechecking.TypedExpression;`
in `api/src/main/java/org/arend/ext/instance/InstanceSearchParameters.java`
#### Snippet
```java
import org.arend.ext.core.definition.CoreFunctionDefinition;
import org.arend.ext.core.expr.CoreExpression;
import org.arend.ext.typechecking.TypedExpression;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import org.arend.ext.concrete.ConcreteClause;`
in `api/src/main/java/org/arend/ext/typechecking/ContextData.java`
#### Snippet
```java
package org.arend.ext.typechecking;

import org.arend.ext.concrete.ConcreteClause;
import org.arend.ext.concrete.expr.*;
import org.arend.ext.core.expr.CoreExpression;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.expr.CoreExpression;`
in `api/src/main/java/org/arend/ext/typechecking/ContextData.java`
#### Snippet
```java
import org.arend.ext.concrete.ConcreteClause;
import org.arend.ext.concrete.expr.*;
import org.arend.ext.core.expr.CoreExpression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.Nullable;`
in `api/src/main/java/org/arend/ext/variable/Variable.java`
#### Snippet
```java
package org.arend.ext.variable;

import org.jetbrains.annotations.Nullable;

public interface Variable {
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.typechecking.MetaDefinition;`
in `base/src/main/java/org/arend/core/context/binding/inference/MetaInferenceVariable.java`
#### Snippet
```java
import org.arend.ext.error.TypeMismatchError;
import org.arend.ext.error.TypecheckingError;
import org.arend.ext.typechecking.MetaDefinition;
import org.arend.term.concrete.Concrete;

```

### UNUSED_IMPORT
Unused import `import org.arend.core.subst.LevelPair;`
in `base/src/main/java/org/arend/core/expr/AbsExpression.java`
#### Snippet
```java
import org.arend.core.context.binding.Binding;
import org.arend.core.subst.ExprSubstitution;
import org.arend.core.subst.LevelPair;
import org.arend.ext.core.expr.CoreAbsExpression;
import org.arend.ext.core.level.LevelSubstitution;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.Nullable;`
in `base/src/main/java/org/arend/core/expr/PathExpression.java`
#### Snippet
```java
import org.arend.util.Decision;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PathExpression extends Expression implements CorePathExpression {
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.concrete.ConcreteClause;`
in `base/src/main/java/org/arend/extImpl/ContextDataImpl.java`
#### Snippet
```java

import org.arend.core.expr.Expression;
import org.arend.ext.concrete.ConcreteClause;
import org.arend.ext.concrete.expr.ConcreteArgument;
import org.arend.ext.concrete.expr.ConcreteClauses;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.core.expr.CoreExpression;`
in `base/src/main/java/org/arend/extImpl/ContextDataImpl.java`
#### Snippet
```java
import org.arend.ext.concrete.expr.ConcreteCoclauses;
import org.arend.ext.concrete.expr.ConcreteExpression;
import org.arend.ext.core.expr.CoreExpression;
import org.arend.ext.typechecking.ContextData;
import org.arend.term.concrete.Concrete;
```

### UNUSED_IMPORT
Unused import `import org.arend.naming.reference.converter.IdReferableConverter;`
in `base/src/main/java/org/arend/library/PersistableSourceLibrary.java`
#### Snippet
```java
import org.arend.ext.error.ErrorReporter;
import org.arend.ext.module.ModulePath;
import org.arend.naming.reference.converter.IdReferableConverter;
import org.arend.term.group.ChildGroup;
import org.jetbrains.annotations.Nullable;
```

### UNUSED_IMPORT
Unused import `import org.arend.naming.scope.local.LocalListScope;`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
import org.arend.naming.reference.*;
import org.arend.naming.resolving.visitor.ExpressionResolveNameVisitor;
import org.arend.naming.scope.local.LocalListScope;
import org.arend.naming.scope.local.*;
import org.arend.prelude.Prelude;
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `base/src/main/java/org/arend/naming/scope/local/PatternScope.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `base/src/main/java/org/arend/naming/scope/local/PatternScope.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.concrete.definition.ClassFieldKind;`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
import org.arend.ext.util.Pair;
import org.arend.naming.reference.*;
import org.arend.ext.concrete.definition.ClassFieldKind;
import org.arend.term.Fixity;
import org.arend.term.abs.Abstract;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `base/src/main/java/org/arend/term/concrete/FreeReferablesVisitor.java`
#### Snippet
```java
import org.arend.naming.reference.TCReferable;

import java.util.List;
import java.util.Set;

```

### UNUSED_IMPORT
Unused import `import static org.arend.ext.prettyprinting.doc.DocFactory.text;`
in `base/src/main/java/org/arend/typechecking/error/local/HigherConstructorMatchingError.java`
#### Snippet
```java

import static org.arend.ext.prettyprinting.doc.DocFactory.*;
import static org.arend.ext.prettyprinting.doc.DocFactory.text;

public class HigherConstructorMatchingError extends TypecheckingError {
```

### UNUSED_IMPORT
Unused import `import static org.arend.ext.prettyprinting.doc.DocFactory.text;`
in `base/src/main/java/org/arend/typechecking/error/local/SuperLevelsMismatchError.java`
#### Snippet
```java

import static org.arend.ext.prettyprinting.doc.DocFactory.*;
import static org.arend.ext.prettyprinting.doc.DocFactory.text;

public class SuperLevelsMismatchError extends TypecheckingError {
```

### UNUSED_IMPORT
Unused import `import org.arend.ext.error.ArgInferenceError;`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
import org.arend.typechecking.error.ErrorReporterCounter;
import org.arend.typechecking.error.local.*;
import org.arend.ext.error.ArgInferenceError;
import org.arend.typechecking.error.local.inference.RecursiveInstanceInferenceError;
import org.arend.typechecking.implicitargs.ImplicitArgsInference;
```

### UNUSED_IMPORT
Unused import `import java.nio.file.FileSystems;`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
```

### UNUSED_IMPORT
Unused import `import org.arend.term.abs.Abstract;`
in `cli/src/main/java/org/arend/frontend/group/SimpleNamespaceCommand.java`
#### Snippet
```java
import org.arend.term.NameRenaming;
import org.arend.term.NamespaceCommand;
import org.arend.term.abs.Abstract;
import org.arend.term.group.ChildGroup;
import org.arend.term.group.Group;
```

### UNUSED_IMPORT
Unused import `import org.arend.term.group.Group;`
in `cli/src/main/java/org/arend/frontend/group/SimpleNamespaceCommand.java`
#### Snippet
```java
import org.arend.term.abs.Abstract;
import org.arend.term.group.ChildGroup;
import org.arend.term.group.Group;
import org.arend.term.group.Statement;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import org.arend.naming.reference.InternalConcreteLocatedReferable;`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
import org.arend.frontend.reference.*;
import org.arend.module.ModuleLocation;
import org.arend.naming.reference.InternalConcreteLocatedReferable;
import org.arend.naming.reference.*;
import org.arend.naming.resolving.visitor.TypeClassReferenceExtractVisitor;
```

### UNUSED_IMPORT
Unused import `import org.arend.util.FileUtils;`
in `cli/src/main/java/org/arend/frontend/repl/action/LoadLibraryCommand.java`
#### Snippet
```java
import org.arend.library.Library;
import org.arend.repl.action.DirectoryArgumentCommand;
import org.arend.util.FileUtils;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import org.jline.reader.impl.DefaultParser;`
in `cli/src/main/java/org/arend/frontend/repl/jline/JLineCliRepl.java`
#### Snippet
```java
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.reader.impl.DefaultParser;
import org.jline.reader.impl.completer.AggregateCompleter;
import org.jline.reader.impl.completer.StringsCompleter;
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `base/src/main/java/org/arend/typechecking/visitor/FindLevelParameters.java`
#### Snippet
```java
          continue;
        } else {
          hasPLevels = hasHLevels = true;
          return true;
        }
```

### NestedAssignment
Result of assignment expression used
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      Pair<Expression, ExprSubstitution> pair = reverseSubstitution(expr1);
      if (pair != null) {
        origExpr1 = expr1 = pair.proj1;
        SubstVisitor substVisitor = new SubstVisitor(pair.proj2, LevelSubstitution.EMPTY, false);
        expr2 = expr2.accept(substVisitor, null);
```

### NestedAssignment
Result of assignment expression used
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      Pair<Expression, ExprSubstitution> pair = reverseSubstitution(expr2);
      if (pair != null) {
        origExpr2 = expr2 = pair.proj1;
        SubstVisitor substVisitor = new SubstVisitor(pair.proj2, LevelSubstitution.EMPTY, false);
        expr1 = expr1.accept(substVisitor, null);
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`myBinariesDir = myBinariesDir + "/"` could be simplified to 'myBinariesDir += "/"'
in `cli/src/main/java/org/arend/frontend/library/ZipSourceLibrary.java`
#### Snippet
```java
      myBinariesDir = myBinariesDir.replace('\\', '/');
      if (!myBinariesDir.endsWith("/")) {
        myBinariesDir = myBinariesDir + "/";
      }
    }
```

### ReplaceAssignmentWithOperatorAssignment
`dotPrefix = dotPrefix + "."` could be simplified to 'dotPrefix += "."'
in `base/src/main/java/org/arend/typechecking/termination/CallMatrix.java`
#### Snippet
```java
      if (parameterName == null) parameterName = String.valueOf(parameterIndex);
      String dotPrefix = namePrefix;
      if (!dotPrefix.isEmpty()) dotPrefix = dotPrefix + ".";

      int length = 1;
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `api/src/main/java/org/arend/ext/concrete/ConcreteClause.java`
#### Snippet
```java

public interface ConcreteClause extends ConcreteSourceNode {
  @NotNull List<? extends ConcretePattern> getPatterns();
  @Nullable ConcreteExpression getExpression();
}
```

### EmptyMethod
The method is empty
in `base/src/main/java/org/arend/library/SourceLibrary.java`
#### Snippet
```java
  }

  protected void loadGeneratedModules() {}

  @Override
```

### EmptyMethod
All implementations of this method are empty
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java

  public interface ParametersHolder extends SourceNode {
    @NotNull List<? extends Parameter> getParameters();
  }

```

### EmptyMethod
All implementations of this method are empty
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java

  public interface EliminatedExpressionsHolder extends ParametersHolder {
    @Nullable Collection<? extends Reference> getEliminatedExpressions();
  }

```

### EmptyMethod
All implementations of this method are empty
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java
  public interface ClassReferenceHolder extends SourceNode {
    @Nullable ClassReferable getClassReference();
    @NotNull Collection<? extends CoClauseElement> getCoClauseElements();
  }

```

### EmptyMethod
All implementations of this method are empty
in `base/src/main/java/org/arend/term/abs/Abstract.java`
#### Snippet
```java

  public interface ReferableDefinition extends SourceNode {
    /* @NotNull */ @Nullable LocatedReferable getReferable();

    @Override
```

### EmptyMethod
All implementations of this method are empty
in `base/src/main/java/org/arend/typechecking/TypecheckedReporter.java`
#### Snippet
```java

public interface TypecheckedReporter {
  void typecheckingFinished(Definition definition);

  TypecheckedReporter DUMMY = definition -> {};
```

### EmptyMethod
The method is empty
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
  }

  protected void addCommandOptions(Options cmdOptions) {}

  private Pair<ModulePath, LongName> parseFullName(String fullName) {
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `cli/src/main/java/org/arend/frontend/repl/action/LoadModuleCommand.java`
#### Snippet
```java
    }

    private volatile static @Nullable ModulePath lastModulePath = null;

    @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `cli/src/main/java/org/arend/frontend/source/StreamRawSource.java`
#### Snippet
```java
  private final boolean myInTests;
  private FileGroup myGroup;
  private byte myPass = 0;

  protected StreamRawSource(ModulePath modulePath, boolean inTests) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

  // Status information
  private boolean myExitWithError = false;
  private final ErrorReporter mySystemErrErrorReporter = error -> {
    System.err.println(error);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
  private final Map<ModulePath, GeneralError.Level> myModuleResults = new LinkedHashMap<>();
  private final DependencyListener myDependencyCollector = new MetaDependencyCollector();
  private Map<TCDefReferable, Pair<Long,Long>> myTimes = null;
  private Map<TCDefReferable, Integer> mySizes = null;
  private ModulePath myPrintModule;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
  private final DependencyListener myDependencyCollector = new MetaDependencyCollector();
  private Map<TCDefReferable, Pair<Long,Long>> myTimes = null;
  private Map<TCDefReferable, Integer> mySizes = null;
  private ModulePath myPrintModule;
  private LongName myPrintDefinition;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/core/expr/visitor/FindMissingBindingVisitor.java`
#### Snippet
```java
public class FindMissingBindingVisitor extends SearchVisitor<Void> {
  private final Set<Binding> myBindings;
  private Variable myResult = null;

  public FindMissingBindingVisitor(Set<Binding> binding) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/core/expr/visitor/FindBindingVisitor.java`
#### Snippet
```java
  private final Set<Binding> myAllowedBindings = new HashSet<>();
  private final boolean myNormalizeClassCallBindings;
  private Variable myResult = null;

  public FindBindingVisitor(Set<? extends Variable> binding, boolean normalizeClassCallBindings) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  private final FindMissingBindingVisitor myKeepVisitor;
  private final FindBindingVisitor myElimVisitor;
  private Variable myFoundVariable = null;

  private ElimBindingVisitor(Set<Binding> bindings, boolean keep) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  private ClassField myCoercingField;
  private Sort mySort = Sort.PROP;
  private boolean myRecord = false;
  private final CoerceData myCoerce = new CoerceData(this);
  private Set<ClassField> myGoodThisFields = Collections.emptySet();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `base/src/main/java/org/arend/error/CountingErrorReporter.java`
#### Snippet
```java

public class CountingErrorReporter implements ErrorReporter {
  private int myCounter = 0;
  private final GeneralError.Level myLevel;
  private final Class<? extends GeneralError> myError;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  private CMP myCMP;
  private boolean myNormalCompare = true;
  private boolean myOnlySolveVars = false;
  private boolean myAllowEquations = true;
  private boolean myNormalize = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java
  private boolean myForceTypeSCName = false;

  private Definition recursiveData = null;
  private String recursiveParameterName = "";

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java
  private String myUnnamed = UNNAMED;
  private int myBase = 1;
  private boolean myForceTypeSCName = false;

  private Definition recursiveData = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/naming/reference/ConcreteClassReferable.java`
#### Snippet
```java
  private ChildGroup myGroup;
  private final List<? extends Reference> myUnresolvedSuperClasses;
  private boolean myResolved = false;

  public ConcreteClassReferable(Object data, @NotNull String name, Precedence precedence, @Nullable String aliasName, Precedence aliasPrecedence, List<ConcreteClassFieldReferable> fields, List<? extends Reference> superClasses, LocatedReferable parent) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/library/PersistableSourceLibrary.java`
#### Snippet
```java
 */
public abstract class PersistableSourceLibrary extends UnmodifiableSourceLibrary {
  private boolean myExternal = false;
  private final Set<ModulePath> myUpdatedModules = new LinkedHashSet<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/library/BaseLibrary.java`
#### Snippet
```java
 */
public abstract class BaseLibrary implements Library {
  private boolean myLoaded = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/prelude/PreludeTypecheckingLibrary.java`
#### Snippet
```java
 */
public abstract class PreludeTypecheckingLibrary extends PreludeLibrary {
  private boolean myTypechecked = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `base/src/main/java/org/arend/typechecking/error/ErrorReporterCounter.java`
#### Snippet
```java

public class ErrorReporterCounter implements ErrorReporter {
  private int myCount = 0;
  private final GeneralError.Level myLevel;
  private final ErrorReporter myErrorReporter;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `base/src/main/java/org/arend/typechecking/order/BellmanFord.java`
#### Snippet
```java
  }

  private int myIndex = 0;
  private final Stack<T> myStack = new Stack<>();
  private final Map<T, DefState> myVertices = new HashMap<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/typechecking/instance/provider/InstanceProviderSet.java`
#### Snippet
```java
    private final ReferableConverter referableConverter;
    private SimpleInstanceProvider instanceProvider;
    private boolean used = false;

    private MyPredicate(ReferableConverter referableConverter) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/typechecking/computation/DefinitionCancellationIndicator.java`
#### Snippet
```java

public class DefinitionCancellationIndicator implements CancellationIndicator {
  private boolean myCancelled = false;
  private final TCDefReferable myTarget;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `base/src/main/java/org/arend/typechecking/computation/BooleanCancellationIndicator.java`
#### Snippet
```java

public class BooleanCancellationIndicator implements CancellationIndicator {
    public boolean isCancelled = false;

    @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
    Expression finalClassifyingExpression = normClassifyingExpression;
    class MyPredicate implements Predicate<TCDefReferable> {
      private FunctionDefinition instanceDef = null;

      @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java

  private static class RecursiveBehaviors<T> {
    private T myBasepoint = null;
    private final Set<RecursiveBehavior<T>> myBehaviors = new HashSet<>();
    private int myLength = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
    private final Set<RecursiveBehavior<T>> myBehaviors = new HashSet<>();
    private int myLength = -1;
    private RecursiveBehaviors<T> myBestRbAttained = null;

    private RecursiveBehaviors(HashMap<T, HashMap<T, HashSet<BaseCallMatrix<T>>>> graph, T v) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  private boolean myTypecheckOtherClauses = true;

  private DependentLink clausesParameters = null;

  public enum Mode {
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
import java.util.function.Function;

public abstract class Expression implements Body, CoreExpression {
  public abstract <P, R> R accept(ExpressionVisitor<? super P, ? extends R> visitor, P params);

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/sort/Sort.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class Sort implements CoreSort {
  private final Level myPLevel;
  private final Level myHLevel;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/subst/LevelPair.java`
#### Snippet
```java
import java.util.List;

public class LevelPair implements LevelSubstitution, Levels {
  public static final LevelPair STD = new LevelPair(new Level(LevelVariable.PVAR), new Level(LevelVariable.HVAR));
  public static final LevelPair PROP = new LevelPair(new Level(0), new Level(-1));
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/sort/Level.java`
#### Snippet
```java
import org.arend.typechecking.implicitargs.equations.Equations;

public class Level implements CoreLevel {
  private final int myConstant;
  private final LevelVariable myVar;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/subst/ListLevels.java`
#### Snippet
```java
import java.util.List;

public class ListLevels implements Levels {
  private final List<Level> myLevels;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/context/binding/LevelVariable.java`
#### Snippet
```java
  }

  LevelVariable PVAR = new LevelVariable() {
    @Override
    public LvlType getType() {
      return LvlType.PLVL;
    }

    @Override
    public LevelVariable max(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : other;
    }

    @Override
    public LevelVariable min(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : this;
    }

    @Override
    public boolean compare(LevelVariable other, CMP cmp) {
      return this == other || other instanceof ParamLevelVariable && other.getType() == LvlType.PLVL && (cmp == CMP.LE || ((ParamLevelVariable) other).getSize() == 0);
    }

    @Override
    public String toString() {
      return "\\lp";
    }

    @Override
    public boolean equals(Object o) {
      return o instanceof LevelVariable && compare((LevelVariable) o, CMP.EQ);
    }
  };

  LevelVariable HVAR = new LevelVariable() {
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/context/binding/LevelVariable.java`
#### Snippet
```java
  };

  LevelVariable HVAR = new LevelVariable() {
    @Override
    public LvlType getType() {
      return LvlType.HLVL;
    }

    @Override
    public LevelVariable max(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : other;
    }

    @Override
    public LevelVariable min(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : this;
    }

    @Override
    public boolean compare(LevelVariable other, CMP cmp) {
      return this == other || other instanceof ParamLevelVariable && other.getType() == LvlType.HLVL && (cmp == CMP.LE || ((ParamLevelVariable) other).getSize() == 0);
    }

    @Override
    public String toString() {
      return "\\lh";
    }

    @Override
    public boolean equals(Object o) {
      return o instanceof LevelVariable && compare((LevelVariable) o, CMP.EQ);
    }
  };
}

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/core/elimtree/ElimBody.java`
#### Snippet
```java
import java.util.List;

public class ElimBody implements Body, CoreElimBody {
  private final List<ElimClause<Pattern>> myClauses;
  private final ElimTree myElimTree;
```

### EqualsAndHashcode
Class has `hashCode()` defined but does not define `equals()`
in `base/src/main/java/org/arend/util/SingletonList.java`
#### Snippet
```java

// Singleton list that supports set
public class SingletonList<E> extends AbstractList<E> implements RandomAccess {
  public E element;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/naming/reference/TypedRedirectingReferable.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class TypedRedirectingReferable implements RedirectingReferable, TypedReferable {
  private final Referable myOriginalReferable;
  private final ClassReferable myTypeClassReference;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/naming/reference/AliasReferable.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class AliasReferable implements RedirectingReferable {
  private final GlobalReferable myReferable;

```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/naming/reference/RedirectingReferableImpl.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class RedirectingReferableImpl implements RedirectingReferable {
  private final Referable myOriginalReferable;
  private final Precedence myPrecedence;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/typechecking/termination/RecursiveBehavior.java`
#### Snippet
```java
import java.util.List;

public class RecursiveBehavior<T> {
  public final List<BaseCallMatrix.R> behavior;
  public final List<String> labels;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `base/src/main/java/org/arend/typechecking/patternmatching/Condition.java`
#### Snippet
```java
import static org.arend.ext.prettyprinting.doc.DocFactory.*;

public class Condition extends SubstitutionData {
  public final Expression result;

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Referable`
in `cli/src/main/java/org/arend/frontend/reference/ParsedLocalReferable.java`
#### Snippet
```java
import org.arend.naming.reference.Referable;

public class ParsedLocalReferable extends LocalReferable implements Referable, SourceInfo {
  private final Position myPosition;

```

### RedundantImplements
Redundant interface declaration `ReplCommand`
in `base/src/main/java/org/arend/repl/action/ShowTypeCommand.java`
#### Snippet
```java
import java.util.function.Supplier;

public final class ShowTypeCommand implements ReplCommand, ExpressionArgumentCommand {
  public static final @NotNull ShowTypeCommand INSTANCE = new ShowTypeCommand();

```

### RedundantImplements
Redundant interface declaration `DataContainer`
in `base/src/main/java/org/arend/naming/reference/ConcreteLocatedReferable.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class ConcreteLocatedReferable extends LocatedReferableImpl implements DataContainer, TypedReferable {
  private final Object myData;
  private final String myAliasName;
```

### RedundantImplements
Redundant interface declaration `ClassReferable`
in `base/src/main/java/org/arend/naming/reference/ConcreteClassReferable.java`
#### Snippet
```java
import java.util.List;

public class ConcreteClassReferable extends ConcreteResolvedClassReferable implements ClassReferable {
  private ChildGroup myGroup;
  private final List<? extends Reference> myUnresolvedSuperClasses;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `base/src/main/java/org/arend/prelude/PreludeResourceLibrary.java`
#### Snippet
```java
  @Override
  public boolean load(LibraryManager libraryManager, TypecheckingOrderingListener typechecking) {
    synchronized (PreludeLibrary.class) {
      if (getPreludeScope() == null) {
        if (super.load(libraryManager, typechecking)) {
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `base/src/main/java/org/arend/prelude/PreludeTypecheckingLibrary.java`
#### Snippet
```java
  @Override
  public boolean load(LibraryManager libraryManager, TypecheckingOrderingListener typechecking) {
    synchronized (PreludeLibrary.class) {
      if (getPreludeScope() == null) {
        return super.load(libraryManager, typechecking);
```

### SynchronizeOnThis
Lock operations on a class may have unforeseen side-effects
in `base/src/main/java/org/arend/prelude/PreludeTypecheckingLibrary.java`
#### Snippet
```java

    if (super.orderModules(ordering)) {
      synchronized (PreludeLibrary.class) {
        if (!Prelude.isInitialized()) {
          Prelude.initialize(getPreludeScope());
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/src/main/java/org/arend/ext/error/InstanceInferenceError.java`
#### Snippet
```java

  public InstanceInferenceError(ArendRef classRef, CoreExpression classifyingExpression, ConcreteSourceNode cause) {
    this(classRef, null, null, classifyingExpression, cause, new CoreExpression[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `api/src/main/java/org/arend/ext/module/LongName.java`
#### Snippet
```java

  public String[] toArray() {
    return path.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `base/src/main/java/org/arend/term/prettyprint/BiConcreteVisitor.java`
#### Snippet
```java
      newFields.add(expr.getFields().get(i).accept(this, wideExpr.getFields().get(i)));
    }
    return (Concrete.Expression) myFactory.tuple(newFields.toArray(new Concrete.Expression[0]));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `base/src/main/java/org/arend/typechecking/error/local/inference/RecursiveInstanceInferenceError.java`
#### Snippet
```java

  public RecursiveInstanceInferenceError(ArendRef classRef, CoreExpression classifyingExpression, ConcreteSourceNode cause, RecursiveInstanceHoleExpression holeExpr) {
    this(classRef, null, null, classifyingExpression, cause, holeExpr, new CoreExpression[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
              Expression instance;
              if (instanceResult == null) {
                ArgInferenceError error = new RecursiveInstanceInferenceError(classDef.getReferable(), expr, holeExpr, new Expression[0]);
                myVisitor.getErrorReporter().report(error);
                instance = new ErrorExpression(error);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        TypecheckingResult instance = myInstancePool.findInstance(null, type, new SubclassSearchParameters(classDef), implBody, holeExpr, myDefinition);
        if (instance == null) {
          ArgInferenceError error = new RecursiveInstanceInferenceError(classDef.getReferable(), implBody, holeExpr, new Expression[0]);
          errorReporter.report(error);
          result = new TypecheckingResult(new ErrorExpression(error), type);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      return new TypecheckingResult(InferenceReferenceExpression.make(myArgsInference.newInferenceVariable(expectedType, expr), getEquations()), expectedType);
    } else {
      errorReporter.report(new ArgInferenceError(expression(), expr, new Expression[0]));
      return null;
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `fKind` is always 'null'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      case FUNCTION -> {
        var fKind = defProto.getFunction().getKind();
        return fKind == DefinitionProtos.Definition.FunctionKind.INSTANCE ? GlobalReferable.Kind.INSTANCE : fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE || fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE_LEMMA ? GlobalReferable.Kind.COCLAUSE_FUNCTION : GlobalReferable.Kind.FUNCTION;
      }
      case CONSTRUCTOR -> {
```

### ConstantValue
Value `fKind` is always 'null'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      case FUNCTION -> {
        var fKind = defProto.getFunction().getKind();
        return fKind == DefinitionProtos.Definition.FunctionKind.INSTANCE ? GlobalReferable.Kind.INSTANCE : fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE || fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE_LEMMA ? GlobalReferable.Kind.COCLAUSE_FUNCTION : GlobalReferable.Kind.FUNCTION;
      }
      case CONSTRUCTOR -> {
```

### ConstantValue
Value `fKind` is always 'null'
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      case FUNCTION -> {
        var fKind = defProto.getFunction().getKind();
        return fKind == DefinitionProtos.Definition.FunctionKind.INSTANCE ? GlobalReferable.Kind.INSTANCE : fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE || fKind == DefinitionProtos.Definition.FunctionKind.COCLAUSE_LEMMA ? GlobalReferable.Kind.COCLAUSE_FUNCTION : GlobalReferable.Kind.FUNCTION;
      }
      case CONSTRUCTOR -> {
```

### ConstantValue
Value `isExplicit` is always 'true'
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
        Concrete.Expression mappedExpression = myRenamer.getConcreteExpression(refExpr.getBinding());
        if (mappedExpression != null) {
          arguments.add(new Concrete.Argument(mappedExpression, isExplicit));
          return;
        }
```

### ConstantValue
Condition `term != null` is always `true`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
        }
      }
      return term != null && coreBody instanceof Expression ? term.accept(visitor, (Expression) coreBody) : null;
    } else if (body instanceof Concrete.ElimFunctionBody && coreBody instanceof ElimBody) {
      // Assume they have the same order.
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `fromString()` tries to override a static method of a superclass
in `api/src/main/java/org/arend/ext/module/ModulePath.java`
#### Snippet
```java
  }

  public static ModulePath fromString(String path) {
    return new ModulePath(path.split("\\."));
  }
```

## RuleId[id=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java

  public void runRepl(@NotNull InputStream inputStream) {
    var scanner = new Scanner(inputStream);
    print(prompt());
    while (scanner.hasNext()) {
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `DocFactory` has only 'static' members, and lacks a 'private' constructor
in `api/src/main/java/org/arend/ext/prettyprinting/doc/DocFactory.java`
#### Snippet
```java
import java.util.*;

public class DocFactory {
  public static ReferenceDoc refDoc(ArendRef ref) {
    return new ReferenceDoc(ref);
```

### UtilityClassWithoutPrivateConstructor
Class `PreludeBinaryGenerator` has only 'static' members, and lacks a 'private' constructor
in `cli/src/main/java/org/arend/frontend/PreludeBinaryGenerator.java`
#### Snippet
```java
import java.nio.file.Paths;

public class PreludeBinaryGenerator {
  public static void main(String[] args) {
    PreludeFileLibrary library = new PreludeFileLibrary(Paths.get(args[0]));
```

### UtilityClassWithoutPrivateConstructor
Class `ExpressionFactory` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/core/expr/ExpressionFactory.java`
#### Snippet
```java
import java.util.List;

public class ExpressionFactory {
  public static Expression FieldCall(ClassField definition, Expression thisExpr) {
    return FieldCallExpression.make(definition, thisExpr);
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/core/context/Utils.java`
#### Snippet
```java
import java.util.*;

public class Utils {
  public static void trimToSize(List<?> list, int size) {
    if (size < list.size()) {
```

### UtilityClassWithoutPrivateConstructor
Class `Helper` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
  }

  class Helper {
    public static void freeSubsts(DependentLink link, ExprSubstitution substitution) {
      for (; link.hasNext(); link = link.getNext()) {
```

### UtilityClassWithoutPrivateConstructor
Class `ConcreteExpressionFactory` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/term/concrete/ConcreteExpressionFactory.java`
#### Snippet
```java
import java.util.List;

public class ConcreteExpressionFactory {
  public static Concrete.LamExpression cLam(List<Concrete.Parameter> arguments, Concrete.Expression body) {
    return new Concrete.LamExpression(null, arguments, body);
```

### UtilityClassWithoutPrivateConstructor
Class `StringFormat` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/util/StringFormat.java`
#### Snippet
```java
package org.arend.util;

public class StringFormat {
  // We use this hack as String.format is not emulated in GWT
  public static String rightPad(int width, String s) {
```

### UtilityClassWithoutPrivateConstructor
Class `StringEscapeUtils` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/util/StringEscapeUtils.java`
#### Snippet
```java
 * <a href="https://github.com/JetBrains/intellij-community/blob/master/platform/util/src/com/intellij/openapi/util/text/StringUtil.java">reference</a>.
 */
public class StringEscapeUtils {
  @Contract(pure = true)
  public static boolean isHexDigit(char c) {
```

### UtilityClassWithoutPrivateConstructor
Class `FileUtils` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
import java.util.regex.Pattern;

public class FileUtils {
  public static final String EXTENSION = ".ard";
  public static final String SERIALIZED_EXTENSION = ".arc";
```

### UtilityClassWithoutPrivateConstructor
Class `Helper` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/naming/reference/LocatedReferable.java`
#### Snippet
```java
  }

  class Helper {
    public static ModuleLocation getLocation(LocatedReferable referable, List<String> fullName) {
      LocatedReferable parent = referable.getLocatedReferableParent();
```

### UtilityClassWithoutPrivateConstructor
Class `Helper` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/naming/reference/ClassReferable.java`
#### Snippet
```java
  }

  class Helper {
    public static Set<FieldReferable> getNotImplementedFields(ClassReferable classDef) {
      Set<FieldReferable> result = getAllFields(classDef, new HashSet<>(), new HashMap<>());
```

### UtilityClassWithoutPrivateConstructor
Class `ScopeFactory` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
import java.util.function.Function;

public class ScopeFactory {
  public static @NotNull Scope forGroup(@Nullable Group group, @NotNull ModuleScopeProvider moduleScopeProvider) {
    return forGroup(group, moduleScopeProvider, true, LexicalScope.Extent.EXTERNAL_AND_FIELDS);
```

### UtilityClassWithoutPrivateConstructor
Class `UseTypechecking` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
import java.util.*;

public class UseTypechecking {
  public static void typecheck(List<Concrete.UseDefinition> definitions, ErrorReporter errorReporter) {
    Map<Definition, List<Pair<Expression,FunctionDefinition>>> fromMap = new HashMap<>();
```

### UtilityClassWithoutPrivateConstructor
Class `FindBinding` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
import java.util.function.Function;

public class FindBinding {
  public static @Nullable DependentLink visitLam(
      Referable referable, Concrete.LamExpression expr, LamExpression lam) {
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/typechecking/patternmatching/Util.java`
#### Snippet
```java
import java.util.*;

public class Util {
  public interface ClauseElem {
  }
```

### UtilityClassWithoutPrivateConstructor
Class `ExpressionMatcher` has only 'static' members, and lacks a 'private' constructor
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
import java.util.*;

public class ExpressionMatcher {
  private static Expression replaceMatchingExpressionArguments(ConstructorExpressionPattern pattern, Expression expression, List<Expression> newArgs) {
    Expression data = pattern.getDataExpression();
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method `clausesToElimTree` is too complex to analyze by data flow algorithm
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  }

  private ElimTree clausesToElimTree(List<ExtElimClause> clauses, int argsStackSize, int numberOfIntervals) {
    try (Utils.ContextSaver ignored = new Utils.ContextSaver(myContext)) {
      int index = 0;
```

### DataFlowIssue
Method `typecheckFunctionBody` is too complex to analyze by data flow algorithm
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private List<ExtElimClause> typecheckFunctionBody(FunctionDefinition typedDef, Concrete.BaseFunctionDefinition def) {
    UniverseKind universeKind = typedDef.getUniverseKind();
    if (myNewDef) {
```

### DataFlowIssue
Method `doTypechecking` is too complex to analyze by data flow algorithm
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  }

  private Result doTypechecking(List<Concrete.Pattern> patterns, DependentLink parameters, ExprSubstitution paramsSubst, ExprSubstitution totalSubst, ConcreteSourceNode sourceNode, boolean withElim, int addIntervalVars) {
    List<ExpressionPattern> result = new ArrayList<>();
    List<Expression> exprs = new ArrayList<>();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `cli/src/main/java/org/arend/frontend/repl/jline/ImportCompleter.java`
#### Snippet
```java
    if (!Objects.equals("\\import", line.words().get(0))) return;
    if (line.wordIndex() == 1)
      candidates.addAll(moduleSupplier.get().map(Candidate::new).collect(Collectors.toList()));
  }
}
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `cli/src/main/java/org/arend/frontend/repl/jline/ArendReplParser.java`
#### Snippet
```java
      .limit(tokensRaw.size() - 1)
      .filter(token -> token.getChannel() != Token.HIDDEN_CHANNEL)
      .collect(Collectors.toList());
    var wordOpt = tokens.stream().filter(token ->
      token.getStartIndex() <= cursor && token.getStopIndex() + 1 >= cursor
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `base/src/main/java/org/arend/repl/CommandHandler.java`
#### Snippet
```java
    if (replCommand != null) replCommand.invoke(command.proj2, api, lineSupplier);
    else {
      var suitableCommands = determineEntries(command.proj1).collect(Collectors.toList());
      if (suitableCommands.isEmpty())
        api.eprintln("[ERROR] Unrecognized command: " + command.proj1 + ".");
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `base/src/main/java/org/arend/term/prettyprint/FreeVariableCollectorConcrete.java`
#### Snippet
```java

  private void removeParameters(List<? extends Concrete.Parameter> parameters) {
    parameters.stream().flatMap(a -> a.getRefList().stream()).collect(Collectors.toList()).forEach(myReferables::remove);
  }

```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `base/src/main/java/org/arend/term/prettyprint/MinimizedRepresentation.java`
#### Snippet
```java
    @Override
    public Concrete.Expression visitReference(Concrete.ReferenceExpression expr, Concrete.SourceNode params) {
        var errorList = myErrors.stream().filter(err -> err.getCauseSourceNode() == expr).collect(Collectors.toList());
        if (!errorList.isEmpty()) {
            var verboseExpr = (Concrete.Expression) params;
```

## RuleId[id=PatternVariableCanBeUsed]
### PatternVariableCanBeUsed
Variable 'p1' can be replaced with pattern variable
in `cli/src/main/java/org/arend/frontend/PositionComparator.java`
#### Snippet
```java
    }

    Position p1 = (Position) d1;
    Position p2 = (Position) d2;
    if (!p1.module.equals(p2.module)) {
```

### PatternVariableCanBeUsed
Variable 'p2' can be replaced with pattern variable
in `cli/src/main/java/org/arend/frontend/PositionComparator.java`
#### Snippet
```java

    Position p1 = (Position) d1;
    Position p2 = (Position) d2;
    if (!p1.module.equals(p2.module)) {
      return Result.UNCOMPARABLE;
```

### PatternVariableCanBeUsed
Variable 'list' can be replaced with pattern variable
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
      Object defaultValue = request.defaultValue;
      if (request.data instanceof List) {
        List<?> list = (List<?>) request.data;
        for (int i = 0; i < list.size(); i++) {
          System.out.println(i + ") " + list.get(i));
```

### PatternVariableCanBeUsed
Variable 'list' can be replaced with pattern variable
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
        Object result = null;
        if (request.data instanceof List) {
          List<?> list = (List<?>) request.data;
          if (line.isEmpty()) {
            result = defaultValue;
```

### PatternVariableCanBeUsed
Variable 'let' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/SubstExpression.java`
#### Snippet
```java
    if (myExpression instanceof LetExpression) {
      ExprSubstitution substitution = new ExprSubstitution(mySubstitution);
      LetExpression let = (LetExpression) myExpression;
      if (let.isStrict()) {
        for (HaveClause letClause : let.getClauses()) {
```

### PatternVariableCanBeUsed
Variable 'piCod' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/PiExpression.java`
#### Snippet
```java
    Expression cod = this;
    while (cod instanceof PiExpression) {
      PiExpression piCod = (PiExpression) cod;
      if (implicitOnly) {
        if (piCod.getParameters().isExplicit()) {
```

### PatternVariableCanBeUsed
Variable 'funCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java
    Expression typeNorm = type.normalize(NormalizationMode.WHNF);
    while (typeNorm instanceof FunCallExpression && ((FunCallExpression) typeNorm).getDefinition().getKind() == CoreFunctionDefinition.Kind.TYPE) {
      FunCallExpression funCall = (FunCallExpression) typeNorm;
      Expression next = match(funCall, null);
      if (next == null) break;
```

### PatternVariableCanBeUsed
Variable 'array' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/FieldCallExpression.java`
#### Snippet
```java
      return new FieldCallExpression(definition, ((ErrorExpression) thisExpr).replaceExpression(null));
    } else if (definition == Prelude.ARRAY_LENGTH && thisExpr instanceof ArrayExpression) {
      ArrayExpression array = (ArrayExpression) thisExpr;
      if (array.getTail() == null) {
        return new SmallIntegerExpression(array.getElements().size());
```

### PatternVariableCanBeUsed
Variable 'newExpr' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java
          boolean ok = arg instanceof ReferenceExpression && ((ReferenceExpression) arg).getBinding() == thisBindings;
          if (!ok && arg instanceof NewExpression) {
            NewExpression newExpr = (NewExpression) arg;
            if (newExpr.getRenewExpression() != null && newExpr.getClassCall().getImplementedHere().isEmpty()) {
              ReferenceExpression refExpr = newExpr.getRenewExpression().cast(ReferenceExpression.class);
```

### PatternVariableCanBeUsed
Variable 'classCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java
            type = type.normalize(NormalizationMode.WHNF);
            if (type instanceof ClassCallExpression && getDefinition().isSubClassOf(((ClassCallExpression) type).getDefinition())) {
              ClassCallExpression classCall = (ClassCallExpression) type;
              Map<ClassField, Expression> subImplementations = new LinkedHashMap<>(classCall.getImplementedHere());
              for (ClassField field : classCall.getDefinition().getFields()) {
```

### PatternVariableCanBeUsed
Variable 'lamExpr' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/AppExpression.java`
#### Snippet
```java
    function = function.getUnderlyingExpression();
    if (function instanceof LamExpression) {
      LamExpression lamExpr = (LamExpression) function;
      SingleDependentLink var = lamExpr.getParameters();
      SingleDependentLink next = var.getNext();
```

### PatternVariableCanBeUsed
Variable 'expr1' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/FunCallExpression.java`
#### Snippet
```java
  public static Expression make(FunctionDefinition definition, Levels levels, List<Expression> arguments) {
    if ((definition == Prelude.PLUS || definition == Prelude.MUL || definition == Prelude.MINUS || definition == Prelude.DIV || definition == Prelude.MOD || definition == Prelude.DIV_MOD) && arguments.size() == 2 && arguments.get(0) instanceof IntegerExpression && arguments.get(1) instanceof IntegerExpression) {
      IntegerExpression expr1 = (IntegerExpression) arguments.get(0);
      IntegerExpression expr2 = (IntegerExpression) arguments.get(1);
      return definition == Prelude.PLUS ? expr1.plus(expr2)
```

### PatternVariableCanBeUsed
Variable 'expr2' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/FunCallExpression.java`
#### Snippet
```java
    if ((definition == Prelude.PLUS || definition == Prelude.MUL || definition == Prelude.MINUS || definition == Prelude.DIV || definition == Prelude.MOD || definition == Prelude.DIV_MOD) && arguments.size() == 2 && arguments.get(0) instanceof IntegerExpression && arguments.get(1) instanceof IntegerExpression) {
      IntegerExpression expr1 = (IntegerExpression) arguments.get(0);
      IntegerExpression expr2 = (IntegerExpression) arguments.get(1);
      return definition == Prelude.PLUS ? expr1.plus(expr2)
        : definition == Prelude.MUL ? expr1.mul(expr2)
```

### PatternVariableCanBeUsed
Variable 'binding' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/expr/visitor/SizeExpressionVisitor.java`
#### Snippet
```java
    mySize++;
    if (expr.getBinding() instanceof PersistentEvaluatingBinding) {
      PersistentEvaluatingBinding binding = (PersistentEvaluatingBinding) expr.getBinding();
      if (myVisited.add(binding)) {
        binding.getExpression().accept(this, null);
```

### PatternVariableCanBeUsed
Variable 'constructor' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
  public ConstructorExpressionPattern toExpressionPattern(Expression type) {
    if (type instanceof DataCallExpression && getDefinition() instanceof Constructor) {
      Constructor constructor = (Constructor) getDefinition();
      DataCallExpression dataCall = (DataCallExpression) type;

```

### PatternVariableCanBeUsed
Variable 'dataCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
    if (type instanceof DataCallExpression && getDefinition() instanceof Constructor) {
      Constructor constructor = (Constructor) getDefinition();
      DataCallExpression dataCall = (DataCallExpression) type;

      List<Expression> args = constructor.matchDataTypeArguments(dataCall.getDefCallArguments());
```

### PatternVariableCanBeUsed
Variable 'classCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      return new ConstructorExpressionPattern(FunCallExpression.makeFunCall(Prelude.IDP, equality.getLevels(), Arrays.asList(equality.getDefCallArguments().get(0), equality.getDefCallArguments().get(1))), Collections.emptyList());
    } else if (type instanceof ClassCallExpression) {
      ClassCallExpression classCall = (ClassCallExpression) type;
      if (classCall.getDefinition() == Prelude.DEP_ARRAY) {
        Definition def = getDefinition();
```

### PatternVariableCanBeUsed
Variable 'sigma' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      return new ConstructorExpressionPattern(classCall, subPatterns);
    } else if (type instanceof SigmaExpression) {
      SigmaExpression sigma = (SigmaExpression) type;
      List<ExpressionPattern> subPatterns = Pattern.toExpressionPatterns(mySubPatterns, sigma.getParameters());
      if (subPatterns == null) {
```

### PatternVariableCanBeUsed
Variable 'conPattern' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
    }

    ConstructorPattern<?> conPattern = (ConstructorPattern<?>) pattern;
    List<Expression> args = new ArrayList<>();
    for (Pattern subPattern : conPattern.getSubPatterns()) {
```

### PatternVariableCanBeUsed
Variable 'tuple' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
    } else if (singleConstructor instanceof TupleConstructor) {
      if (argument instanceof TupleExpression) {
        TupleExpression tuple = (TupleExpression) argument;
        List<Expression> args = new ArrayList<>();
        args.addAll(tuple.getFields());
```

### PatternVariableCanBeUsed
Variable 'conCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      }
    } else if (argument instanceof ConCallExpression) {
      ConCallExpression conCall = (ConCallExpression) argument;
      ElimTree elimTree = myChildren.get(conCall.getDefinition());
      if (elimTree != null) {
```

### PatternVariableCanBeUsed
Variable 'intExpr' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      }
    } else if (argument instanceof IntegerExpression) {
      IntegerExpression intExpr = (IntegerExpression) argument;
      boolean isZero = intExpr.isZero();
      ElimTree elimTree = myChildren.get(isZero ? Prelude.ZERO : Prelude.SUC);
```

### PatternVariableCanBeUsed
Variable 'array' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      }
    } else if (argument instanceof ArrayExpression) {
      ArrayExpression array = (ArrayExpression) argument;
      ElimTree elimTree = myChildren.get(new ArrayConstructor(array.getElements().isEmpty(), true, true));
      if (elimTree != null) {
```

### PatternVariableCanBeUsed
Variable 'conCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      argument = argument.getUnderlyingExpression();
      if (argument instanceof ConCallExpression) {
        ConCallExpression conCall = (ConCallExpression) argument;
        ElimTree elimTree = myChildren.get(conCall.getDefinition());
        if (elimTree != null) {
```

### PatternVariableCanBeUsed
Variable 'intExpr' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
        }
      } else if (argument instanceof IntegerExpression) {
        IntegerExpression intExpr = (IntegerExpression) argument;
        boolean isZero = intExpr.isZero();
        ElimTree elimTree = myChildren.get(isZero ? Prelude.ZERO : Prelude.SUC);
```

### PatternVariableCanBeUsed
Variable 'array' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
        }
      } else if (argument instanceof ArrayExpression) {
        ArrayExpression array = (ArrayExpression) argument;
        ElimTree elimTree = myChildren.get(new ArrayConstructor(array.getElements().isEmpty(), true, true));
        if (elimTree != null) {
```

### PatternVariableCanBeUsed
Variable 'con' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/constructor/ClassConstructor.java`
#### Snippet
```java
    }

    ClassConstructor con = (ClassConstructor) other;
    if (myClassDef != con.myClassDef || !myImplementedFields.equals(con.myImplementedFields)) {
      return false;
```

### PatternVariableCanBeUsed
Variable 'dataCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/ElimBody.java`
#### Snippet
```java
            continue;
          }
          DataCallExpression dataCall = (DataCallExpression) type;
          conPattern = new ConstructorExpressionPattern(new ConCallExpression(constructor, dataCall.getLevels(), dataCall.getDefCallArguments(), Collections.emptyList()), Collections.emptyList());
          clauseElems.add(new Util.ConstructorClauseElem(constructor, dataCall.getLevels(), dataCall.getDefCallArguments()));
```

### PatternVariableCanBeUsed
Variable 'classCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/core/elimtree/ElimBody.java`
#### Snippet
```java
            throw new IllegalArgumentException();
          }
          ClassCallExpression classCall = (ClassCallExpression) type;
          var elem = new Util.ArrayClauseElem(((ArrayConstructor) key).getConstructor(), classCall.getLevels().toLevelPair(), classCall.getAbsImplementationHere(Prelude.ARRAY_LENGTH), classCall.getThisBinding(), classCall.getAbsImplementationHere(Prelude.ARRAY_ELEMENTS_TYPE), ConstructorExpressionPattern.isArrayEmpty(classCall));
          conPattern = elem.getPattern(Collections.emptyList());
```

### PatternVariableCanBeUsed
Variable 'field' can be replaced with pattern variable
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
    for (Concrete.ClassElement element : elements) {
      if (element instanceof Concrete.ClassField) {
        Concrete.ClassField field = (Concrete.ClassField) element;
        R result = visitParameters(field.getParameters(), params);
        if (result != null) return null;
```

### PatternVariableCanBeUsed
Variable 'field' can be replaced with pattern variable
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        return visitClassFieldImpl((Concrete.ClassFieldImpl) element, params);
      } else if (element instanceof Concrete.OverriddenField) {
        Concrete.OverriddenField field = (Concrete.OverriddenField) element;
        R result = visitParameters(field.getParameters(), params);
        if (result != null) return null;
```

### PatternVariableCanBeUsed
Variable 'namePattern' can be replaced with pattern variable
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java

    if (pattern instanceof Concrete.NamePattern) {
      Concrete.NamePattern namePattern = (Concrete.NamePattern) pattern;
      return namePattern.type != null ? namePattern.type.accept(this, params) : null;
    }
```

### PatternVariableCanBeUsed
Variable 'namePattern' can be replaced with pattern variable
in `base/src/main/java/org/arend/term/concrete/BaseConcreteExpressionVisitor.java`
#### Snippet
```java
  protected void visitPattern(Concrete.Pattern pattern, P params) {
    if (pattern instanceof Concrete.NamePattern) {
      Concrete.NamePattern namePattern = (Concrete.NamePattern) pattern;
      if (namePattern.type != null) {
        namePattern.type = namePattern.type.accept(this, params);
```

### PatternVariableCanBeUsed
Variable 'field' can be replaced with pattern variable
in `base/src/main/java/org/arend/term/concrete/BaseConcreteExpressionVisitor.java`
#### Snippet
```java
      visitClassFieldImpl((Concrete.ClassFieldImpl) element, params);
    } else if (element instanceof Concrete.OverriddenField) {
      Concrete.OverriddenField field = (Concrete.OverriddenField) element;
      visitParameters(field.getParameters(), params);
      field.setResultType(field.getResultType().accept(this, params));
```

### PatternVariableCanBeUsed
Variable 'function' can be replaced with pattern variable
in `base/src/main/java/org/arend/naming/reference/ConcreteLocatedReferable.java`
#### Snippet
```java
  public @Nullable Referable getBodyReference(TypeClassReferenceExtractVisitor visitor) {
    if (myDefinition instanceof Concrete.FunctionDefinition) {
      Concrete.FunctionDefinition function = (Concrete.FunctionDefinition) myDefinition;
      if (function.getBody() instanceof Concrete.TermFunctionBody) {
        return visitor.getTypeReference(function.getBody().getTerm(), false);
```

### PatternVariableCanBeUsed
Variable 'abs' can be replaced with pattern variable
in `base/src/main/java/org/arend/extImpl/AbstractedExpressionImpl.java`
#### Snippet
```java
    }
    if (abstracted instanceof AbstractedDependentLinkType) {
      AbstractedDependentLinkType abs = (AbstractedDependentLinkType) abstracted;
      DependentLink link = abs.getParameters();
      for (int i = 0; i < abs.getSize(); i++) {
```

### PatternVariableCanBeUsed
Variable 'abs' can be replaced with pattern variable
in `base/src/main/java/org/arend/extImpl/AbstractedExpressionImpl.java`
#### Snippet
```java
      throw new IllegalArgumentException();
    }
    AbstractedExpressionImpl abs = (AbstractedExpressionImpl) abstracted;
    bindings.addAll(abs.myParameters);
    return getExpression(abs.myExpression, bindings);
```

### PatternVariableCanBeUsed
Variable 'abs' can be replaced with pattern variable
in `base/src/main/java/org/arend/extImpl/AbstractedExpressionImpl.java`
#### Snippet
```java
    }
    if (expression instanceof AbstractedDependentLinkType) {
      AbstractedDependentLinkType abs = (AbstractedDependentLinkType) expression;
      return AbstractedExpressionImpl.make(abs.getParameters().subst(visitor, abs.getSize(), false), DependentLink.Helper.get(abs.getParameters(), abs.getSize()).getTypeExpr().accept(visitor, null));
    }
```

### PatternVariableCanBeUsed
Variable 'abs' can be replaced with pattern variable
in `base/src/main/java/org/arend/extImpl/AbstractedExpressionImpl.java`
#### Snippet
```java
      throw new IllegalArgumentException();
    }
    AbstractedExpressionImpl abs = (AbstractedExpressionImpl) expression;
    List<Binding> newBindings = new ArrayList<>(abs.myParameters.size());
    for (Binding binding : abs.myParameters) {
```

### PatternVariableCanBeUsed
Variable 'def' can be replaced with pattern variable
in `base/src/main/java/org/arend/extImpl/DefinitionContributorImpl.java`
#### Snippet
```java
    }

    Concrete.Definition def = (Concrete.Definition) definition;
    List<String> longName = new ArrayList<>();
    ModulePath module = LocatedReferable.Helper.getLocation(def.getData(), longName).getModulePath();
```

### PatternVariableCanBeUsed
Variable 'ref' can be replaced with pattern variable
in `base/src/main/java/org/arend/extImpl/definitionRenamer/ScopeDefinitionRenamer.java`
#### Snippet
```java
    }

    LocatedReferable ref = (LocatedReferable) arendRef;
    List<String> list = new ArrayList<>();
    list.add(ref.getRepresentableName());
```

### PatternVariableCanBeUsed
Variable 'useDefinition' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
      }

      FunctionDefinition useDefinition = (FunctionDefinition) typedDefinition;
      ErrorReporter localErrorReporter = new LocalErrorReporter(definition.getData(), errorReporter);
      if (definition.getKind() == FunctionKind.LEVEL && !useDefinition.getResultType().isError()) {
```

### PatternVariableCanBeUsed
Variable 'dataDef' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
  private static void registerParametersLevel(FunctionDefinition useDefinition, Definition useParent, ParametersLevel parametersLevel) {
    if (useParent instanceof DataDefinition) {
      DataDefinition dataDef = (DataDefinition) useParent;
      if (parametersLevel.parameters == null) {
        Sort newSort = parametersLevel.level == -1 ? Sort.PROP : new Sort(dataDef.getSort().getPLevel(), new Level(parametersLevel.level));
```

### PatternVariableCanBeUsed
Variable 'concrete' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
    for (Concrete.ClassElement concreteRaw : def.getElements())
      if (concreteRaw instanceof Concrete.ClassField) {
        var concrete = (Concrete.ClassField) concreteRaw;
        TCFieldReferable referable = concrete.getData();
        Optional<Expression> field = coreDef.getFields()
```

### PatternVariableCanBeUsed
Variable 'concrete' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
        if (accept != null) return accept;
      } else if (concreteRaw instanceof Concrete.ClassFieldImpl) {
        var concrete = (Concrete.ClassFieldImpl) concreteRaw;
        Referable implementedField = concrete.getImplementedField();
        Optional<AbsExpression> field = coreDef.getFields()
```

### PatternVariableCanBeUsed
Variable 'coreLamExpr' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
    for (Concrete.Parameter parameter : expr.getParameters()) {
      if (body instanceof LamExpression) {
        var coreLamExpr = (LamExpression) body;
        Concrete.Expression type = parameter.getType();
        if (type != null) {
```

### PatternVariableCanBeUsed
Variable 'namePattern' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/visitor/ReplaceVarConcreteVisitor.java`
#### Snippet
```java
  protected void visitPattern(Concrete.Pattern pattern, Void params) {
    if (pattern instanceof Concrete.NamePattern) {
      Concrete.NamePattern namePattern = (Concrete.NamePattern) pattern;
      if (namePattern.type != null) {
        namePattern.type = namePattern.type.accept(this, params);
```

### PatternVariableCanBeUsed
Variable 'leveled' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/visitor/FixLevelParameters.java`
#### Snippet
```java
  private void processDefCall(DefCallExpression defCall) {
    if (!(defCall instanceof LeveledDefCallExpression)) return;
    LeveledDefCallExpression leveled = (LeveledDefCallExpression) defCall;
    if (myDefinitions == null) {
      List<? extends LevelVariable> params = leveled.getDefinition().getLevelParameters();
```

### PatternVariableCanBeUsed
Variable 'instancePi' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
    } else if (instanceExpr instanceof PiExpression) {
      if (!(inferredExpr instanceof PiExpression)) return false;
      PiExpression instancePi = (PiExpression) instanceExpr;
      PiExpression inferredPi = (PiExpression) inferredExpr;
      if (DependentLink.Helper.size(instancePi.getParameters()) != DependentLink.Helper.size(inferredPi.getParameters())) return false;
```

### PatternVariableCanBeUsed
Variable 'inferredPi' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
      if (!(inferredExpr instanceof PiExpression)) return false;
      PiExpression instancePi = (PiExpression) instanceExpr;
      PiExpression inferredPi = (PiExpression) inferredExpr;
      if (DependentLink.Helper.size(instancePi.getParameters()) != DependentLink.Helper.size(inferredPi.getParameters())) return false;
      for (DependentLink instanceParams = instancePi.getParameters(), inferredParams = inferredPi.getParameters(); instanceParams.hasNext(); instanceParams = instanceParams.getNext(), inferredParams = inferredParams.getNext()) {
```

### PatternVariableCanBeUsed
Variable 'instanceIntExpr' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
      return compareClassifying(instancePi.getCodomain(), inferredPi.getCodomain(), false);
    } else if (instanceExpr instanceof IntegerExpression) {
      IntegerExpression instanceIntExpr = (IntegerExpression) instanceExpr;
      return inferredExpr instanceof IntegerExpression && instanceIntExpr.isEqual((IntegerExpression) inferredExpr) || inferredExpr instanceof ConCallExpression && instanceIntExpr.match(((ConCallExpression) inferredExpr).getDefinition());
    } else if (instanceExpr instanceof DefCallExpression && !(instanceExpr instanceof FieldCallExpression)) {
```

### PatternVariableCanBeUsed
Variable 'instanceDefCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
    } else if (instanceExpr instanceof DefCallExpression && !(instanceExpr instanceof FieldCallExpression)) {
      if (!(inferredExpr instanceof DefCallExpression)) return false;
      DefCallExpression instanceDefCall = (DefCallExpression) instanceExpr;
      DefCallExpression inferredDefCall = (DefCallExpression) inferredExpr;
      if (instanceDefCall.getDefinition() != inferredDefCall.getDefinition()) return false;
```

### PatternVariableCanBeUsed
Variable 'inferredDefCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
      if (!(inferredExpr instanceof DefCallExpression)) return false;
      DefCallExpression instanceDefCall = (DefCallExpression) instanceExpr;
      DefCallExpression inferredDefCall = (DefCallExpression) inferredExpr;
      if (instanceDefCall.getDefinition() != inferredDefCall.getDefinition()) return false;
      for (int i = 0; i < instanceDefCall.getDefCallArguments().size(); i++) {
```

### PatternVariableCanBeUsed
Variable 'instanceConCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
      }
      if (instanceDefCall instanceof ConCallExpression) {
        ConCallExpression instanceConCall = (ConCallExpression) instanceDefCall;
        for (int i = 0; i < instanceConCall.getDataTypeArguments().size(); i++) {
          if (!compareClassifying(instanceConCall.getDataTypeArguments().get(i), ((ConCallExpression) inferredDefCall).getDataTypeArguments().get(i), false)) return false;
```

### PatternVariableCanBeUsed
Variable 'classCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
        }

        ClassCallExpression classCall = (ClassCallExpression) instanceDef.getResultType();
        if (finalClassifyingExpression == null || classCall.getDefinition().getClassifyingField() == null) {
          return true;
```

### PatternVariableCanBeUsed
Variable 'rb2' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/termination/RecursiveBehavior.java`
#### Snippet
```java
  public boolean equals(Object o) {
    if (o instanceof RecursiveBehavior) {
      RecursiveBehavior<?> rb2 = (RecursiveBehavior<?>) o;
      return behavior.equals(rb2.behavior) && labels.equals(rb2.labels);
    }
```

### PatternVariableCanBeUsed
Variable 'conPattern' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
  private static BaseCallMatrix.R isLess(Expression expr1, ExpressionPattern pattern2) {
    if (pattern2 instanceof ConstructorExpressionPattern) {
      ConstructorExpressionPattern conPattern = (ConstructorExpressionPattern) pattern2;

      List<? extends Expression> exprArguments = conPattern.getMatchingExpressionArguments(expr1, false);
```

### PatternVariableCanBeUsed
Variable 'elim' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
    Body body = def.getReallyActualBody();
    if (body instanceof IntervalElim) {
      IntervalElim elim = (IntervalElim) body;
      List<ExpressionPattern> patternList = new ArrayList<>();
      for (DependentLink link = myDefinition.getParameters(); link.hasNext(); link = link.getNext()) {
```

### PatternVariableCanBeUsed
Variable 'cm' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
  public BaseCallMatrix.R compare(Object object) {
    if (object instanceof BaseCallMatrix) {
      BaseCallMatrix<?> cm = (BaseCallMatrix<?>) object;
      if (this.equals(cm)) return R.Equal;
      if (this.getDomain() != cm.getDomain() || this.getCodomain() != cm.getCodomain()) throw new IllegalArgumentException();
```

### PatternVariableCanBeUsed
Variable 'cm' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
  public final boolean equals(Object object) {
    if (object instanceof BaseCallMatrix) {
      BaseCallMatrix<?> cm = (BaseCallMatrix<?>) object;
      if (getCodomain() != cm.getCodomain() || getDomain() != cm.getDomain()) return false;
      return cm.matrixMap.equals(this.matrixMap);
```

### PatternVariableCanBeUsed
Variable 'condition' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/patternmatching/Condition.java`
#### Snippet
```java
    }

    Condition condition = (Condition) obj;
    CompareVisitor visitor = new CompareVisitor(DummyEquations.getInstance(), CMP.EQ, null);
    if (!(substitution == null && condition.substitution == null || substitution != null && condition.substitution != null && substitution.size() == condition.substitution.size())) {
```

### PatternVariableCanBeUsed
Variable 'var' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java
      return false;
    }
    InferenceLevelVariable var = (InferenceLevelVariable) level.getVar();
    Level oldLevel = myConstantUpperBounds.get(var);
    if (oldLevel != null && (oldLevel.isProp() || level.getConstant() < 0 && oldLevel.isClosed() && oldLevel.getConstant() == 0)) {
```

### PatternVariableCanBeUsed
Variable 'actualClassCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        actualType = result.getType().normalize(NormalizationMode.WHNF);
        if (actualType instanceof ClassCallExpression && expectedType instanceof ClassCallExpression) {
          ClassCallExpression actualClassCall = (ClassCallExpression) actualType;
          ClassCallExpression expectedClassCall = (ClassCallExpression) expectedType;
          /* I don't know if this is necessary or not
```

### PatternVariableCanBeUsed
Variable 'expectedClassCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        if (actualType instanceof ClassCallExpression && expectedType instanceof ClassCallExpression) {
          ClassCallExpression actualClassCall = (ClassCallExpression) actualType;
          ClassCallExpression expectedClassCall = (ClassCallExpression) expectedType;
          /* I don't know if this is necessary or not
          if (var.compareClassCallsExactly()) {
```

### PatternVariableCanBeUsed
Variable 'funCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java

    if (data instanceof FunCallExpression) {
      FunCallExpression funCall = (FunCallExpression) data;
      newArgs.addAll(0, funCall.getDefCallArguments());
      return funCall.getDefinition() == Prelude.IDP ? expression : FunCallExpression.make(funCall.getDefinition(), funCall.getLevels(), newArgs);
```

### PatternVariableCanBeUsed
Variable 'conCall' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java

    if (data instanceof ConCallExpression && ((ConCallExpression) data).getDefinition() != Prelude.SUC) {
      ConCallExpression conCall = (ConCallExpression) data;
      return ConCallExpression.make(conCall.getDefinition(), conCall.getLevels(), conCall.getDataTypeArguments(), newArgs);
    }
```

### PatternVariableCanBeUsed
Variable 'conPattern' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
    }

    ConstructorExpressionPattern conPattern = (ConstructorExpressionPattern) pattern;
    List<? extends Expression> args = conPattern.getMatchingExpressionArguments(expr, true);
    if (args == null) {
```

### PatternVariableCanBeUsed
Variable 'pi' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        return null;
      }
      PiExpression pi = (PiExpression) type;
      type = pi.getCodomain();
      SingleDependentLink param = pi.getParameters();
```

### PatternVariableCanBeUsed
Variable 'pi' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      }

      PiExpression pi = (PiExpression) type;
      piTypes.add(pi);
      type = pi.getCodomain();
```

### PatternVariableCanBeUsed
Variable 'defCallResult' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    if (isExplicit) {
      if (result instanceof DefCallResult && ((DefCallResult) result).getDefinition() == Prelude.PATH_CON) {
        DefCallResult defCallResult = (DefCallResult) result;
        SingleDependentLink lamParam = new TypedSingleDependentLink(true, "i", Interval());
        Sort sort0 = Sort.STD.subst(defCallResult.getLevels().toLevelPair());
```

### PatternVariableCanBeUsed
Variable 'defCallResult' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java

    if (result instanceof DefCallResult && !isExplicit && ((DefCallResult) result).getDefinition() instanceof ClassField) {
      DefCallResult defCallResult = (DefCallResult) result;
      ClassField field = (ClassField) defCallResult.getDefinition();
      ClassCallExpression classCall = argResult.type.normalize(NormalizationMode.WHNF).cast(ClassCallExpression.class);
```

### PatternVariableCanBeUsed
Variable 'defCallResult' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      // If result is defCall, then try to infer class instances.
      if (result instanceof DefCallResult) {
        DefCallResult defCallResult = (DefCallResult) result;
        ClassDefinition classDef = getClassRefFromDefCall(defCallResult.getDefinition(), i);
        if (classDef != null && !classDef.isRecord()) {
```

### PatternVariableCanBeUsed
Variable 'refExpr' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    Concrete.Expression fun = expr.getFunction();
    if (fun instanceof Concrete.ReferenceExpression) {
      Concrete.ReferenceExpression refExpr = (Concrete.ReferenceExpression) fun;
      if (!expr.getArguments().get(0).isExplicit() && (refExpr.getReferent() == Prelude.ZERO.getRef() || refExpr.getReferent() == Prelude.SUC.getRef())) {
        TypecheckingResult argResult = myVisitor.checkExpr(expr.getArguments().get(0).getExpression(), Nat());
```

### PatternVariableCanBeUsed
Variable 'defCallResult' can be replaced with pattern variable
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java

    if (result instanceof DefCallResult && expr.getArguments().get(0).isExplicit() && expectedType != null) {
      DefCallResult defCallResult = (DefCallResult) result;
      if (defCallResult.getDefinition() instanceof Constructor && defCallResult.getArguments().size() < DependentLink.Helper.size(((Constructor) defCallResult.getDefinition()).getDataTypeParameters())) {
        DataCallExpression dataCall = TypeConstructorExpression.unfoldType(expectedType).cast(DataCallExpression.class);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'error' in a Serializable class
in `api/src/main/java/org/arend/ext/error/MetaException.java`
#### Snippet
```java
 */
public class MetaException extends RuntimeException {
  public final TypecheckingError error;

  public MetaException(TypecheckingError error) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'error' in a Serializable class
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreException.java`
#### Snippet
```java

public class CoreException extends RuntimeException {
  public final GeneralError error;

  public CoreException(GeneralError error) {
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is array
in `api/src/main/java/org/arend/ext/typechecking/MetaDefinition.java`
#### Snippet
```java

  /**
   * @return the list of indices of arguments that should be desugared, or {@code null} if all arguments should be desugared.
   */
  default int @Nullable [] desugarArguments(@NotNull List<? extends ConcreteArgument> arguments) {
```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `api/src/main/java/org/arend/ext/error/ArgInferenceError.java`
#### Snippet
```java
      return "th";
    }
    switch (n % 10) {
      case 1:
        return "st";
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      return ' ';
    }
    switch (result) {
      case GOAL:
        return '\u25ef';
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
    boolean recompile = recompileString == null && cmdLine.hasOption("r");
    if (cmdLine.hasOption("i")) {
      switch (replKind.toLowerCase()) {
        default:
          System.err.println("[ERROR] Unrecognized repl type: " + replKind);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/repl/action/NormalizeCommand.java`
#### Snippet
```java
  @Override
  public void invoke(@NotNull String line, @NotNull Repl api, @NotNull Supplier<@NotNull String> scanner) {
    switch (line.toUpperCase()) {
      default:
        api.eprintln("[ERROR] Unrecognized normalization level `" + line + "`, see `:? normalize`");
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/term/NamespaceCommand.java`
#### Snippet
```java

    List<LineDoc> docs = new ArrayList<>();
    switch (getKind()) {
      case OPEN: docs.add(text("\\open")); break;
      case IMPORT: docs.add(text("\\import")); break;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/util/Version.java`
#### Snippet
```java
    String[] split = version.trim().split("\\.");
    try {
      switch (split.length) {
        case 0: throw new IllegalArgumentException("Invalid version: " + version);
        case 1: return new Version(new BigInteger(split[0]), BigInteger.ZERO, BigInteger.ZERO, "");
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/util/StringEscapeUtils.java`
#### Snippet
```java
    for (int idx = 0; idx < length; idx++) {
      var ch = str.charAt(idx);
      switch (ch) {
        case '\b':
          buffer.append("\\b");
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/naming/reference/GlobalReferable.java`
#### Snippet
```java

  static Kind kindFromFunction(FunctionKind kind) {
    switch (kind) {
      case FUNC_COCLAUSE: case CLASS_COCLAUSE: return Kind.COCLAUSE_FUNCTION;
      case CONS: return Kind.DEFINED_CONSTRUCTOR;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/prelude/Prelude.java`
#### Snippet
```java

  public static void update(Definition definition) {
    switch (definition.getReferable().textRepresentation()) {
      case "Nat":
        NAT = (DataDefinition) definition;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/subexpr/SubExprError.java`
#### Snippet
```java
  @Override
  public @NotNull @Nls String toString() {
    switch (getKind()) {
      case MetaRef:
        return "trying to match a tactic: " + errorExpr;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitTypeDestructor(TypeDestructorExpression expr, Void param) {
    switch (myFunction.apply(expr)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitTuple(TupleExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitTypeConstructor(TypeConstructorExpression expr, Void param) {
    switch (myFunction.apply(expr)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitLet(LetExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitApp(AppExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitCase(CaseExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitSigma(SigmaExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitBox(BoxExpression expr, Void params) {
    switch (myFunction.apply(expr)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitUniverse(UniverseExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitPi(PiExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitArray(ArrayExpression expr, Void params) {
    switch (myFunction.apply(expr)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitPEval(PEvalExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitProj(ProjExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitOfType(OfTypeExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitInteger(IntegerExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitReference(ReferenceExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitInferenceReference(InferenceReferenceExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitNew(NewExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitLam(LamExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitSubst(SubstExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitPath(PathExpression expr, Void param) {
    switch (myFunction.apply(expr)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitError(ErrorExpression expression, Void param) {
    switch (myFunction.apply(expression)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/FindSubexpressionVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitAt(AtExpression expr, Void params) {
    switch (myFunction.apply(expr)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
    while (true) {
      expression = (ConCallExpression) it;
      switch (processDefCall(expression, param)) {
        case STOP: return true;
        case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
  @Override
  public Boolean visitClassCall(ClassCallExpression expression, P param) {
    switch (processDefCall(expression, param)) {
      case STOP: return true;
      case SKIP: return false;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java

  static char rToChar(R r) {
    switch (r) {
      case Equal:
        return '=';
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java

  static boolean rleq(BaseCallMatrix.R a, BaseCallMatrix.R b) {
    switch (a) {
      case LessThan:
        return (b == BaseCallMatrix.R.LessThan);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java

  private static BaseCallMatrix.R rmul(BaseCallMatrix.R a, BaseCallMatrix.R b) {
    switch (a) {
      case Equal:
        switch (b) {
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
    switch (a) {
      case Equal:
        switch (b) {
          case Equal:
            return BaseCallMatrix.R.Equal;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallMatrix.java`
#### Snippet
```java
        }
      case LessThan:
        switch (b) {
          case Equal:
          case LessThan:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
      RecursiveBehaviors<T> result = new RecursiveBehaviors<>();
      for (RecursiveBehavior<T> rb : myBehaviors) {
        switch (rb.behavior.get(i)) {
          case LessThan:
            continue;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/FindMissingBindingVisitor.java`
#### Snippet
```java
      }

      for (; link != link1; link = link.getNext()) {
        myBindings.add(link);
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java

      if (myKeepVisitor != null) {
        for (; link != link1; link = link.getNext()) {
          myKeepVisitor.getBindings().add(link);
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `param`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
    Sort maxSort = Sort.PROP;
    for (DependentLink param = expr.getParameters(); param.hasNext(); param = param.getNext()) {
      param = param.getNextTyped(null);
      Sort sort = param.getTypeExpr().accept(this, null).toSort();
      maxSort = sort == null ? null : maxSort.max(sort);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link1`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
    DependentLink link = DependentLink.Helper.subst(parameters, substitution);
    for (DependentLink link1 = link; link1.hasNext(); link1 = link1.getNext()) {
      link1 = link1.getNextTyped(null);
      link1.setType(link1.getType().normalize(mode));
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link1`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
    SingleDependentLink link = DependentLink.Helper.subst(parameters, substitution);
    for (DependentLink link1 = link; link1.hasNext(); link1 = link1.getNext()) {
      link1 = link1.getNextTyped(null);
      link1.setType(link1.getType().normalize(mode));
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/util/Range.java`
#### Snippet
```java
      } else if (text.charAt(i) == '<' && i + 1 < text.length() && text.charAt(i + 1) == '=') {
        newToken = new Pair<>(TokenType.LEQ, "<=");
        i++;
      } else if (text.charAt(i) == '>' && i + 1 < text.length() && text.charAt(i + 1) == '=') {
        newToken = new Pair<>(TokenType.GEQ, ">=");
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/util/Range.java`
#### Snippet
```java
      } else if (text.charAt(i) == '>' && i + 1 < text.length() && text.charAt(i + 1) == '=') {
        newToken = new Pair<>(TokenType.GEQ, ">=");
        i++;
      } else {
        continue;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `idx`
in `base/src/main/java/org/arend/util/StringEscapeUtils.java`
#### Snippet
```java
              try {
                int code = Integer.parseInt(s.substring(idx + 1, idx + 5), 16);
                idx += 4;
                buffer.append((char) code);
              } catch (NumberFormatException e) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `idx`
in `base/src/main/java/org/arend/util/StringEscapeUtils.java`
#### Snippet
```java
              // ^ shouldn't happen
            }
            idx = escapeEnd - 1;
            break;

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java
        args.add(null);
        last = true;
        i--;
      } else {
        args.add(readExpr(protos.get(i)));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      DependentLink link1 = link.getNextTyped(null);
      Set<Variable> freeVars = myFreeVariablesCollector.getFreeVariables(link1);
      for (; link != link1; link = link.getNext()) {
        referableList.add(makeLocalReference(link, freeVars, genName || !link.isExplicit()));
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `param`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      ok = true;
      for (DependentLink param = ((FunCallExpression) argument).getDefinition().getParameters(); param.hasNext(); param = param.getNext()) {
        param = param.getNextTyped(null);
        if (param.isExplicit() || hasFlag(PrettyPrinterFlag.SHOW_IMPLICIT_ARGS)) {
          ok = false;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
        typedParam = typedParam.getNext();
      }
      i += names.size();
      SingleDependentLink newParam = new TypedSingleDependentLink(typedParam.isExplicit(), typedParam.getName(), typedParam.getType().subst(new SubstVisitor(subst, LevelSubstitution.EMPTY)));
      subst.add(typedParam, new ReferenceExpression(newParam));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
              recursiveArg++;
            } else {
              link = link.getNext();
              recursiveParam++;
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/extImpl/AbstractedDependentLinkType.java`
#### Snippet
```java
      while (!(link instanceof TypedDependentLink)) {
        link = link.getNext();
        i++;
      }
      if (i >= mySize) break;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
          myLocalErrorReporter.report(new NameResolverError("Expected a class", superClass));
        }
        def.getSuperClasses().remove(i--);
      } else {
        superClass.setReferent(ref);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/typechecking/visitor/WhereVarsFixVisitor.java`
#### Snippet
```java
            List<Referable> referables = new ArrayList<>(param.getReferableList());
            while (i + 1 < newParams.size() && param.getType() == newParams.get(i + 1).getType() && param.isExplicit() == newParams.get(i + 1).isExplicit()) {
              i++;
              referables.addAll(newParams.get(i).getReferableList());
            }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link1`
in `base/src/main/java/org/arend/typechecking/visitor/BaseDefinitionTypechecker.java`
#### Snippet
```java
      }
      for (DependentLink link1 = constructor.getParameters(); link1.hasNext(); link1 = link1.getNext()) {
        link1 = link1.getNextTyped(null);
        checker.check(link1.getTypeExpr());
        if (parameters.isEmpty()) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java
      definitionCallGraph.add(entry.getKey(), functionClauses == null ? Collections.emptyList() : functionClauses, definitions.keySet());
      for (DependentLink link = entry.getKey().getParameters(); link.hasNext(); link = link.getNext()) {
        link = link.getNextTyped(null);
        if (FindDefCallVisitor.findDefinition(link.getTypeExpr(), definitions.keySet()) != null) {
          myErrorReporter.report(new TypecheckingError("Mutually recursive functions are not allowed in parameters", entry.getValue()).withDefinition(entry.getKey().getReferable()));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/typechecking/covariance/CovarianceChecker.java`
#### Snippet
```java
    if (expr instanceof PiExpression) {
      for (DependentLink link = ((PiExpression) expr).getParameters(); link.hasNext(); link = link.getNext()) {
        link = link.getNextTyped(null);
        if (checkNonCovariant(link.getTypeExpr())) {
          return true;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/typechecking/covariance/CovarianceChecker.java`
#### Snippet
```java
    if (expr instanceof SigmaExpression) {
      for (DependentLink link = ((SigmaExpression) expr).getParameters(); link.hasNext(); link = link.getNext()) {
        link = link.getNextTyped(null);
        if (check(link.getTypeExpr())) {
          return true;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      Equation equation = myEquations.get(i);
      if (equation.expr1 instanceof DataCallExpression && equation.expr2 instanceof DataCallExpression && ((DataCallExpression) equation.expr1).getDefinition() == Prelude.FIN && ((DataCallExpression) equation.expr2).getDefinition() == Prelude.FIN) {
        myEquations.remove(i--);
        Expression arg1 = ((DataCallExpression) equation.expr1).getDefCallArguments().get(0);
        Expression arg2 = ((DataCallExpression) equation.expr2).getDefCallArguments().get(0);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
      for (int j = i + 1; j < missingClauses.size(); j++) {
        if (ExpressionPattern.compare(missingClauses.get(i), missingClauses.get(j))) {
          missingClauses.remove(j--);
        }
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
            intervalClauses.add(clause);
          }
          clauses.remove(i--);
        }
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
      if (elimParams.isEmpty()) {
        for (DependentLink link = parameters; link.hasNext(); link = link.getNext()) {
          link = link.getNextTyped(null);
          List<ConCallExpression> conCalls = getMatchedConstructors(TypeConstructorExpression.unfoldType(link.getTypeExpr()));
          if (conCalls != null && conCalls.isEmpty()) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      int i = 0;
      for (DependentLink link = list.getFirst(); link.hasNext(); link = link.getNext(), i++) {
        link = link.getNextTyped(null);
        if (new RecursiveDataChecker(dataDefinitions, errorReporter, def, def.getParameters().get(i)).check(link.getTypeExpr())) {
          if (constructor != null) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link2`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        if (link.getTypeExpr() instanceof DataCallExpression && dataDefinitions.contains(((DataCallExpression) link.getTypeExpr()).getDefinition())) {
          for (DependentLink link2 = link.getNext(); link2.hasNext(); link2 = link2.getNext()) {
            link2 = link2.getNextTyped(null);
            if (link2.getTypeExpr().findFreeBinding(link)) {
              continue loop;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        for (Constructor constructor : dataDefinition.getConstructors()) {
          for (DependentLink link = constructor.getParameters(); link.hasNext(); link = link.getNext()) {
            link = link.getNextTyped(null);
            universeKind = universeKind.max(new UniverseKindChecker(def.getRecursiveDefinitions()).getUniverseKind(link.getTypeExpr()));
            if (universeKind == UniverseKind.WITH_UNIVERSES) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `param`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

      for (DependentLink param = getExprParameters(expr2); param.hasNext(); param = param.getNext()) {
        param = param.getNextTyped(null);
        if (compareExpressions(expr1, param.getTypeExpr(), Type.OMEGA) != 1) {
          return -1;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      int start = index;
      while (!(link instanceof TypedDependentLink)) {
        link = link.getNext();
        index++;
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `k`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        newPattern.setExplicit(pattern.isExplicit());
        if (newPattern instanceof Concrete.NamePattern) {
          patterns.set(k--, newPattern);
          continue;
        } else {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `k`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            }

            patterns.set(k--, constructor.getPattern().toConcrete(conPattern.getData(), conPattern.isExplicit(), conPattern.getConstructorData(), concretePatterns));
            continue;
          }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `param`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        myPathPatterns.add(new Pair<>(resultPattern, conResult.addedIntervalVars));
        for (DependentLink param = parameters.getNext(); param.hasNext(); param = param.getNext()) {
          param = param.getNextTyped(null);
          if (param.getTypeExpr().findBinding(parameters)) {
            myErrorReporter.report(new TypecheckingError("Partially applied constructor is not allowed because parameter '" + param.getName() + "' depends on '" + parameters.getName() + "'", conPattern));
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        errorReporter.report(new ArgumentExplicitnessError(true, arguments.get(i).expression));
        while (i < arguments.size() && !arguments.get(i).isExplicit()) {
          i++;
        }
        if (i == arguments.size()) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      } else {
        classFieldImpls.add(new Concrete.ClassFieldImpl(argument.getData(), field.getReferable(), new Concrete.HoleExpression(argument.getData()), null));
        i--;
      }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
              piParam = newProvider.nextParameter();
              actualLink = actualLink.getNext();
              i++;
            }
            if (piParam == null) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        if (isExplicit && i >= arguments.size()) {
          int c = 1;
          for (j++; j < typedParameters.size(); j++) {
            if (typedParameters.get(j)) c++;
          }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `j`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        if (isExplicit && i >= arguments.size()) {
          int c = 1;
          for (j++; j < typedParameters.size(); j++) {
            if (typedParameters.get(j)) c++;
          }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        pathArgs.add(expr);
        pathArgs.add(new ReferenceExpression(link));
        i++;
        if (i >= parameters.size()) {
          ok = false;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `base/src/main/java/org/arend/library/error/LibraryError.java`
#### Snippet
```java

  public static LibraryError incorrectExtensionClass(String libraryName) {
    return new LibraryError("Extension main class does not implement " + ArendExtension.class.toString(), Stream.of(libraryName));
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `base/src/main/java/org/arend/typechecking/termination/RecursiveBehavior.java`
#### Snippet
```java
      values.append(StringFormat.rightPad(label.length() + 1, CallMatrix.rToChar(r)));
    }
    return labels.toString() + '\n' + values.toString();
  }
}
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      if (classCall1.getDefinition() != classCall2.getDefinition()) {
        fields = new HashSet<>(fields);
        //noinspection SuspiciousMethodCalls
        fields.retainAll(classCall2.getDefinition().getFields());
      }
```

### RedundantSuppression
Redundant suppression
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java

      if (myLevel != null && !branchKeys.isEmpty() && !(branchKeys.get(0) instanceof SingleConstructor)) {
        //noinspection ConstantConditions
        branchKeys.removeIf(key -> numberOfIntervals + (key.getBody() instanceof IntervalElim ? ((IntervalElim) key.getBody()).getNumberOfTotalElim() : 0) > myLevel);
      }
```

### RedundantSuppression
Redundant suppression
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    Set<Binding> freeBindings = FreeVariablesCollector.getFreeVariables(expr);
    int size = freeBindings.size();
    //noinspection SuspiciousMethodCalls
    freeBindings.removeAll(bindings);
    if (!alwaysCheckBindings && freeBindings.size() == size) {
```

### RedundantSuppression
Redundant suppression
in `base/src/main/java/org/arend/typechecking/visitor/FindDefCallVisitor.java`
#### Snippet
```java

  private boolean checkDefinition(Definition definition) {
    //noinspection SuspiciousMethodCalls
    if (myDefinitions.contains(definition)) {
      //noinspection unchecked
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `base/src/main/java/org/arend/typechecking/order/Ordering.java`
#### Snippet
```java
      }
      if (definition instanceof Concrete.UseDefinition && ((Concrete.UseDefinition) definition).getKind() != FunctionKind.FUNC_COCLAUSE) {
        if (myStage.ordinal() >= Stage.WITHOUT_USE.ordinal()) {
          myOrderingListener.cycleFound(scc);
          return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java

    // _ <= max(-c, -d), _ <= max(l - c, -d) // 6
    if (!(var2 instanceof InferenceLevelVariable) && maxConstant < 0 && (constant < 0 || constant == 0 && var2 != null && var2.getType() == LevelVariable.LvlType.HLVL && var1 == null) && !(var2 == null && var1 instanceof InferenceLevelVariable && var1.getType() == LevelVariable.LvlType.HLVL && constant >= -1 && maxConstant >= -1)) {
      myVisitor.getErrorReporter().report(new SolveLevelEquationsError(Collections.singletonList(new LevelEquation<>(var1, var2, constant)), sourceNode));
      return;
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java

    // _ <= max(-c, -d), _ <= max(l - c, -d) // 6
    if (!(var2 instanceof InferenceLevelVariable) && maxConstant < 0 && (constant < 0 || constant == 0 && var2 != null && var2.getType() == LevelVariable.LvlType.HLVL && var1 == null) && !(var2 == null && var1 instanceof InferenceLevelVariable && var1.getType() == LevelVariable.LvlType.HLVL && constant >= -1 && maxConstant >= -1)) {
      myVisitor.getErrorReporter().report(new SolveLevelEquationsError(Collections.singletonList(new LevelEquation<>(var1, var2, constant)), sourceNode));
      return;
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/ArendCliUI.java`
#### Snippet
```java
  @Override
  public void showErrorMessage(@Nullable String title, @NotNull String message) {
    System.err.println((title == null ? "" : title + ": ") + message);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/ArendCliUI.java`
#### Snippet
```java
  @Override
  public void showMessage(@Nullable String title, @NotNull String message) {
    System.out.println((title == null ? "" : title + ": ") + message);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/ArendCliUI.java`
#### Snippet
```java
  @Override
  public void println(@NotNull Doc doc) {
    System.out.println(DocStringBuilder.build(doc));
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/PreludeBinaryGenerator.java`
#### Snippet
```java
      assert rawSource != null;
      if (rawSource.getTimeStamp() < binarySource.getTimeStamp()) {
        System.out.println("Prelude is up to date");
        return;
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/PreludeBinaryGenerator.java`
#### Snippet
```java
    }

    LibraryManager manager = new LibraryManager((lib,name) -> { throw new IllegalStateException(); }, new InstanceProviderSet(), System.err::println, System.err::println, DefinitionRequester.INSTANCE, null);
    if (manager.loadLibrary(library, null)) {
      if (new Prelude.PreludeTypechecking(manager.getInstanceProviderSet(), ConcreteReferableProvider.INSTANCE, IdReferableConverter.INSTANCE, PositionComparator.INSTANCE).typecheckLibrary(library)) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/PreludeBinaryGenerator.java`
#### Snippet
```java
    }

    LibraryManager manager = new LibraryManager((lib,name) -> { throw new IllegalStateException(); }, new InstanceProviderSet(), System.err::println, System.err::println, DefinitionRequester.INSTANCE, null);
    if (manager.loadLibrary(library, null)) {
      if (new Prelude.PreludeTypechecking(manager.getInstanceProviderSet(), ConcreteReferableProvider.INSTANCE, IdReferableConverter.INSTANCE, PositionComparator.INSTANCE).typecheckLibrary(library)) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/PreludeBinaryGenerator.java`
#### Snippet
```java
    if (manager.loadLibrary(library, null)) {
      if (new Prelude.PreludeTypechecking(manager.getInstanceProviderSet(), ConcreteReferableProvider.INSTANCE, IdReferableConverter.INSTANCE, PositionComparator.INSTANCE).typecheckLibrary(library)) {
        library.persistModule(Prelude.MODULE_PATH, IdReferableConverter.INSTANCE, System.err::println);
      }
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  @Override
  public void println() {
    System.out.println();
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  @Override
  public void printlnOpt(Object anything, boolean toError) {
    (toError ? System.err : System.out).println(anything);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  @Override
  public void printlnOpt(Object anything, boolean toError) {
    (toError ? System.err : System.out).println(anything);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java

    if (description != null) {
      System.out.println(description);
    }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java

      if (request.message != null) {
        System.out.println(request.message);
      }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
        List<?> list = (List<?>) request.data;
        for (int i = 0; i < list.size(); i++) {
          System.out.println(i + ") " + list.get(i));
        }
        if (defaultValue != null) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
        }
      } else if (request.data instanceof Boolean) {
        System.out.print("("  + TRUE_VALUE + "/" + FALSE_VALUE + ")");
        if (defaultValue != null) {
          System.out.print(" ");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
        System.out.print("("  + TRUE_VALUE + "/" + FALSE_VALUE + ")");
        if (defaultValue != null) {
          System.out.print(" ");
          printDefault(defaultValue == Boolean.TRUE ? TRUE_VALUE : FALSE_VALUE);
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  @Override
  public void print(Object anything) {
    System.out.print(anything);
    System.out.flush();
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  public void print(Object anything) {
    System.out.print(anything);
    System.out.flush();
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
          }
          if (result == null) {
            System.out.println("Enter a number between 1 and " + list.size());
          }
        } else if (request.data instanceof Boolean) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  @Override
  public void eprintln(Object anything) {
    System.err.println(anything);
    System.err.flush();
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  public void eprintln(Object anything) {
    System.err.println(anything);
    System.err.flush();
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
            result = defaultValue;
          } else {
            System.out.println("Enter \"" + TRUE_VALUE + "\" or \"" + FALSE_VALUE + "\"");
          }
        } else if (request.data instanceof String) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/PlainCliRepl.java`
#### Snippet
```java
  @Override
  public void println(Object anything) {
    System.out.println(anything);
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
          }
          if (result == null) {
            System.out.println("Enter a number");
          }
        } else {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java

  private String readLine(BufferedReader reader) {
    System.out.print(": ");
    System.out.flush();
    try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
  private String readLine(BufferedReader reader) {
    System.out.print(": ");
    System.out.flush();
    try {
      String line = reader.readLine();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java

  private void printDefault(Object defaultValue) {
    System.out.print("[default: " + defaultValue + "]");
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/repl/jline/JLineCliRepl.java`
#### Snippet
```java
        .build();
    } catch (IOException e) {
      System.err.println("[FATAL] Failed to create terminal: " + e.getLocalizedMessage());
      System.exit(1);
      return;
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/library/TimedLibraryManager.java`
#### Snippet
```java
  @Override
  protected void beforeLibraryLoading(@NotNull Library library) {
    System.out.println("[INFO] Loading library " + library.getName());
    times.push(System.currentTimeMillis());
  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/library/TimedLibraryManager.java`
#### Snippet
```java
  protected void afterLibraryLoading(@NotNull Library library, boolean successful) {
    long time = System.currentTimeMillis() - times.pop();
    System.err.flush();
    System.out.println("[INFO] " + (successful ? "Loaded " : "Failed loading ") + "library " + library.getName() + (successful ? " (" + timeToString(time) + ")" : ""));
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/library/TimedLibraryManager.java`
#### Snippet
```java
    long time = System.currentTimeMillis() - times.pop();
    System.err.flush();
    System.out.println("[INFO] " + (successful ? "Loaded " : "Failed loading ") + "library " + library.getName() + (successful ? " (" + timeToString(time) + ")" : ""));
  }
}
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

  private void reportTypeCheckResult(ModulePath modulePath, GeneralError.Level result) {
    System.out.println("[" + resultChar(result) + "]" + " " + modulePath);
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      longName = LongName.fromString(fullName.substring(index + 1));
      if (!FileUtils.isCorrectDefinitionName(longName)) {
        System.err.println(FileUtils.illegalDefinitionName(longName.toString()));
        longName = null;
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
    modulePath = ModulePath.fromString(fullName);
    if (!FileUtils.isCorrectModulePath(modulePath)) {
      System.err.println(FileUtils.illegalModuleName(modulePath.toString()));
      modulePath = null;
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
  private boolean myExitWithError = false;
  private final ErrorReporter mySystemErrErrorReporter = error -> {
    System.err.println(error);
    System.err.flush();
    myExitWithError = true;
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
  private final ErrorReporter mySystemErrErrorReporter = error -> {
    System.err.println(error);
    System.err.flush();
    myExitWithError = true;
  };
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

      if (error.isSevere()) {
        System.err.println(errorText);
        System.err.flush();
      } else {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      if (error.isSevere()) {
        System.err.println(errorText);
        System.err.flush();
      } else {
        System.out.println(errorText);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        System.err.flush();
      } else {
        System.out.println(errorText);
        System.out.flush();
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      } else {
        System.out.println(errorText);
        System.out.flush();
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      } else if (!Objects.equals(defaultLibrariesRoot, libDir)) {
        myExitWithError = true;
        System.err.println("[ERROR] " + libDir + " is not a directory");
      }
    }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      switch (replKind.toLowerCase()) {
        default:
          System.err.println("[ERROR] Unrecognized repl type: " + replKind);
          break;
        case "plain":
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        } else {
          myExitWithError = true;
          System.err.println(LibraryError.illegalName(libString));
        }
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        }
      } else {
        System.out.println("Nothing to load");
        return cmdLine;
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          }
          if (scope == null) {
            System.err.println("[ERROR] Cannot find module '" + recompileModule + "' in library '" + library.getName() + "'");
          } else {
            Referable ref = Scope.resolveName(scope, recompileDef.toList());
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
            Referable ref = Scope.resolveName(scope, recompileDef.toList());
            if (!(ref instanceof TCDefReferable)) {
              System.err.println("[ERROR] Cannot find definition '" + recompileDef + "' in module '" + recompileModule + "' in library '" + library.getName() + "'");
            } else {
              forcedRefs.add((TCDefReferable) ref);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          }
          if (group == null) {
            System.err.println("[ERROR] Cannot find module '" + recompileModule + "' in library '" + library.getName() + "'");
          } else {
            group.traverseGroup(g -> {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      int numWithErrors = 0;
      if (!modules.isEmpty() || forcedDefs != null) {
        System.out.println();
        System.out.println("--- Typechecking " + library.getName() + " ---");
        long time = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      if (!modules.isEmpty() || forcedDefs != null) {
        System.out.println();
        System.out.println("--- Typechecking " + library.getName() + " ---");
        long time = System.currentTimeMillis();
        try {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          if (numWithErrors > 0) {
            myExitWithError = true;
            System.out.println("Number of modules with errors: " + numWithErrors);
          }
          if (numWithGoals > 0) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          }
          if (numWithGoals > 0) {
            System.out.println("Number of modules with goals: " + numWithGoals);
          }
          System.out.println("--- Done (" + timeToString(time) + ") ---");
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
            System.out.println("Number of modules with goals: " + numWithGoals);
          }
          System.out.println("--- Done (" + timeToString(time) + ") ---");
        }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

      if (myTimes != null && !myTimes.isEmpty()) {
        System.out.println();
        List<Pair<TCDefReferable,Long>> list = new ArrayList<>(myTimes.size());
        for (Map.Entry<TCDefReferable, Pair<Long, Long>> entry : myTimes.entrySet()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        list.sort((o1, o2) -> Long.compare(o2.proj2, o1.proj2));
        for (Pair<TCDefReferable, Long> pair : list) {
          System.out.println(pair.proj1.getRefLongName() + ": " + timeToString(pair.proj2));
        }
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

      if (mySizes != null && !mySizes.isEmpty()) {
        System.out.println();
        List<Pair<TCDefReferable,Integer>> list = new ArrayList<>(mySizes.size());
        for (Map.Entry<TCDefReferable, Integer> entry : mySizes.entrySet()) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        list.sort((o1, o2) -> Long.compare(o2.proj2, o1.proj2));
        for (Pair<TCDefReferable, Integer> pair : list) {
          System.out.println(pair.proj1.getRefLongName() + ": " + pair.proj2);
        }
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

      for (Definition definition : myPrintDefinitions) {
        System.out.println();
        StringBuilder builder = new StringBuilder();
        ToAbstractVisitor.convert(definition, PrettyPrinterConfig.DEFAULT).prettyPrint(builder, PrettyPrinterConfig.DEFAULT);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        StringBuilder builder = new StringBuilder();
        ToAbstractVisitor.convert(definition, PrettyPrinterConfig.DEFAULT).prettyPrint(builder, PrettyPrinterConfig.DEFAULT);
        System.out.println(builder);
      }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

      if (doubleCheck && numWithErrors == 0) {
        System.out.println();
        System.out.println("--- Checking " + library.getName() + " ---");
        long time = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      if (doubleCheck && numWithErrors == 0) {
        System.out.println();
        System.out.println("--- Checking " + library.getName() + " ---");
        long time = System.currentTimeMillis();

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          time = System.currentTimeMillis() - time;
          flushErrors();
          System.out.println("--- Done (" + timeToString(time) + ") ---");
        }
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        }

        System.out.println("[INFO] Loading tests for " + library.getName());
        long time = System.currentTimeMillis();
        boolean loaded = library.loadTests(myLibraryManager);
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        time = System.currentTimeMillis() - time;
        if (!loaded) {
          System.out.println("[INFO] Failed loading tests for " + library.getName());
          continue;
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          continue;
        }
        System.out.println("[INFO] Loaded tests for " + library.getName() + " (" + timeToString(time) + ")");

        System.out.println();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        System.out.println("[INFO] Loaded tests for " + library.getName() + " (" + timeToString(time) + ")");

        System.out.println();
        System.out.println("--- Running tests in " + library.getName() + " ---");
        typechecking.clear();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

        System.out.println();
        System.out.println("--- Running tests in " + library.getName() + " ---");
        typechecking.clear();
        time = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          time = System.currentTimeMillis() - time;
          flushErrors();
          System.out.println("Tests completed: " + typechecking.total + ", Failed: " + typechecking.failed);
          System.out.println("--- Done (" + timeToString(time) + ") ---");
        }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          flushErrors();
          System.out.println("Tests completed: " + typechecking.total + ", Failed: " + typechecking.failed);
          System.out.println("--- Done (" + timeToString(time) + ") ---");
        }
      }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

      if (cmdLine.hasOption("v")) {
        System.out.println("Arend " + Prelude.VERSION);
        return null;
      }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
    } catch (ParseException e) {
      myExitWithError = true;
      System.err.println(e.getMessage());
      return null;
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/src/main/java/org/arend/ext/prettyprinting/doc/CachingDoc.java`
#### Snippet
```java
  public List<? extends String> getText() {
    if (text == null) {
      text = Arrays.asList(getString().split("\\n"));
    }
    return text;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `api/src/main/java/org/arend/ext/prettyprinting/doc/DocFactory.java`
#### Snippet
```java
    }

    String[] lines = string.split("\\n");
    if (lines.length == 0) {
      return nullDoc();
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
        printListElement(ppv, e);

        String[] strs = sb.toString().split("[\\r\\n]+");
        int sz = strs.length;

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java


      List<String> lhs_strings = new ArrayList<>(); Collections.addAll(lhs_strings, lhs.toString().split("[\\r\\n]+"));
      List<String> rhs_strings = new ArrayList<>(); Collections.addAll(rhs_strings, rhs.toString().split("[\\r\\n]+"));

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

      List<String> lhs_strings = new ArrayList<>(); Collections.addAll(lhs_strings, lhs.toString().split("[\\r\\n]+"));
      List<String> rhs_strings = new ArrayList<>(); Collections.addAll(rhs_strings, rhs.toString().split("[\\r\\n]+"));

      int lhs_sz = lhs_strings.size();
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.arend.term.concrete` is unnecessary and can be removed
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java

/**
 * @see org.arend.term.concrete.BaseConcreteExpressionVisitor
 */
public class SubstConcreteVisitor extends BaseConcreteExpressionVisitor<Void> implements DataContainer, ConcreteLevelExpressionVisitor<Void, Concrete.LevelExpression> {
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        Files.createDirectories(outDir);
      } catch (IOException e) {
        e.printStackTrace();
        outDir = null;
      }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `DefCallExpression()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/expr/DefCallExpression.java`
#### Snippet
```java
  private final CallableDefinition myDefinition;

  public DefCallExpression(CallableDefinition definition) {
    myDefinition = definition;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `CommonCliRepl()` of an abstract class should not be declared 'public'
in `cli/src/main/java/org/arend/frontend/repl/CommonCliRepl.java`
#### Snippet
```java
  }

  public CommonCliRepl() {
    this(new TreeSet<>(), new ListErrorReporter(new ArrayList<>()));
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `LeveledDefCallExpression()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/expr/LeveledDefCallExpression.java`
#### Snippet
```java
  private Levels myLevels;

  public LeveledDefCallExpression(CallableDefinition definition, Levels levels) {
    super(definition);
    assert definition.status().needsTypeChecking() || (definition.getLevelParameters() == null) == (levels instanceof LevelPair);
```

### NonProtectedConstructorInAbstractClass
Constructor `NamedBinding()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/context/binding/NamedBinding.java`
#### Snippet
```java
  private final String myName;

  public NamedBinding(String name) {
    myName = name;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `InferenceVariable()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/context/binding/inference/InferenceVariable.java`
#### Snippet
```java
  private List<InferenceVariableListener> myListeners;

  public InferenceVariable(String name, Expression type, Concrete.SourceNode sourceNode, Set<Binding> bounds) {
    myName = name == null || name.isEmpty() ? Renamer.UNNAMED : name;
    myType = type;
```

### NonProtectedConstructorInAbstractClass
Constructor `ElimTree()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/elimtree/ElimTree.java`
#### Snippet
```java
  private final int mySkip;

  public ElimTree(int skip) {
    mySkip = skip;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Definition()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java
  private TypeCheckingStatus myStatus;

  public Definition(TCDefReferable referable, TypeCheckingStatus status) {
    myReferable = referable;
    myStatus = status;
```

### NonProtectedConstructorInAbstractClass
Constructor `TopLevelDefinition()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/definition/TopLevelDefinition.java`
#### Snippet
```java
  private Set<? extends Definition> myGoals = Collections.emptySet();

  public TopLevelDefinition(TCDefReferable referable, TypeCheckingStatus status) {
    super(referable, status);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `CallableDefinition()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/core/definition/CallableDefinition.java`
#### Snippet
```java

public abstract class CallableDefinition extends Definition {
  public CallableDefinition(TCDefReferable referable, TypeCheckingStatus status) {
    super(referable, status);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Repl()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/repl/Repl.java`
#### Snippet
```java
  protected final @NotNull LibraryManager myLibraryManager;

  public Repl(@NotNull ListErrorReporter listErrorReporter,
              @NotNull LibraryManager libraryManager,
              @NotNull TypecheckingOrderingListener typecheckingOrderingListener) {
```

### NonProtectedConstructorInAbstractClass
Constructor `BiConcreteVisitor()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/prettyprint/BiConcreteVisitor.java`
#### Snippet
```java
  final ConcreteFactoryImpl myFactory;

  public BiConcreteVisitor() {
    myFactory = new ConcreteFactoryImpl(null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `DelegateScope()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/naming/scope/DelegateScope.java`
#### Snippet
```java
  protected final Scope parent;

  public DelegateScope(Scope parent) {
    this.parent = parent;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseContextDataImpl()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/extImpl/BaseContextDataImpl.java`
#### Snippet
```java
  protected Expression myExpectedType;

  public BaseContextDataImpl(Expression expectedType) {
    myExpectedType = expectedType;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Parameter()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    private boolean myExplicit;

    public Parameter(Object data, boolean explicit) {
      super(data);
      myExplicit = explicit;
```

### NonProtectedConstructorInAbstractClass
Constructor `Pattern()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    private TypedReferable myAsReferable;

    public Pattern(Object data, TypedReferable asReferable) {
      super(data);
      myExplicit = true;
```

### NonProtectedConstructorInAbstractClass
Constructor `Clause()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    private final List<Pattern> myPatterns;

    public Clause(Object data, List<Pattern> patterns) {
      super(data);
      myPatterns = patterns;
```

### NonProtectedConstructorInAbstractClass
Constructor `BaseFunctionDefinition()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    private final FunctionBody myBody;

    public BaseFunctionDefinition(TCDefReferable referable, LevelParameters pParams, LevelParameters hParams, List<Parameter> parameters, Expression resultType, Expression resultTypeLevel, FunctionBody body) {
      super(referable, pParams, hParams);
      stage = Stage.NOT_RESOLVED;
```

### NonProtectedConstructorInAbstractClass
Constructor `Expression()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    public static final byte PREC = -12;

    public Expression(Object data) {
      super(data);
    }
```

### NonProtectedConstructorInAbstractClass
Constructor `Definition()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    }

    public Definition(TCDefReferable referable) {
      myReferable = referable;
      pLevelParameters = null;
```

### NonProtectedConstructorInAbstractClass
Constructor `Definition()` of an abstract class should not be declared 'public'
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    private List<Pair<TCDefReferable,Integer>> myParametersOriginalDefinitions = Collections.emptyList();

    public Definition(TCDefReferable referable, LevelParameters pParams, LevelParameters hParams) {
      myReferable = referable;
      pLevelParameters = pParams;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `data`
in `api/src/main/java/org/arend/ext/error/SourceInfo.java`
#### Snippet
```java
      if (data instanceof SourceInfo) return (SourceInfo) data;
      if (!(data instanceof DataContainer)) return null;
      data = ((DataContainer) data).getData();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `indentFirst`
in `api/src/main/java/org/arend/ext/prettyprinting/doc/VListDoc.java`
#### Snippet
```java
      List<LineDoc> docs = doc.linearize(indent, indentFirst);
      if (!docs.isEmpty()) {
        indentFirst = true;
      }
      result.addAll(docs);
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `cli/src/main/java/org/arend/frontend/repl/action/LoadModuleCommand.java`
#### Snippet
```java
    try {
      if (line.endsWith(FileUtils.EXTENSION)) {
        line = line.substring(0, line.length() - FileUtils.EXTENSION.length());
        var paths = StreamSupport
          .stream(Paths.get(line).normalize().spliterator(), false)
```

### AssignmentToMethodParameter
Assignment to method parameter `line`
in `cli/src/main/java/org/arend/frontend/repl/action/LoadModuleCommand.java`
#### Snippet
```java
          .collect(Collectors.toList());
        if (Objects.equals(paths.get(0), ".")) paths.remove(0);
        line = String.join(".", paths);
      }
      loadModule(api, ModulePath.fromString(line));
```

### AssignmentToMethodParameter
Assignment to method parameter `fullName`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
        longName = null;
      }
      fullName = fullName.substring(0, index);
    }
    modulePath = ModulePath.fromString(fullName);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/ExpressionFactory.java`
#### Snippet
```java
  public static Expression add(Expression expr, int n) {
    for (int i = 0; i < n; i++) {
      expr = Suc(expr);
    }
    return expr;
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/core/expr/OfTypeExpression.java`
#### Snippet
```java

    while (expression instanceof OfTypeExpression) {
      expression = ((OfTypeExpression) expression).myExpression;
    }
    return new OfTypeExpression(expression, expectedType);
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java

  public static Expression unfoldType(Expression type) {
    type = type.normalize(NormalizationMode.WHNF);
    while (type instanceof FunCallExpression && ((FunCallExpression) type).getDefinition().getKind() == CoreFunctionDefinition.Kind.TYPE) {
      Expression next = match((FunCallExpression) type, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java
      Expression next = match((FunCallExpression) type, null);
      if (next == null) return type;
      type = ((TypeConstructorExpression) next).getArgumentType().normalize(NormalizationMode.WHNF);
    }
    return type;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java

  public static Expression unfoldExpression(Expression expr) {
    expr = expr.normalize(NormalizationMode.WHNF);
    while (expr instanceof TypeConstructorExpression) {
      expr = ((TypeConstructorExpression) expr).getArgument().normalize(NormalizationMode.WHNF);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java
    expr = expr.normalize(NormalizationMode.WHNF);
    while (expr instanceof TypeConstructorExpression) {
      expr = ((TypeConstructorExpression) expr).getArgument().normalize(NormalizationMode.WHNF);
    }
    return expr;
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/core/expr/LetExpression.java`
#### Snippet
```java

  public static Expression normalizeClauseExpression(LetClausePattern pattern, Expression expression) {
    expression = expression.normalize(NormalizationMode.WHNF);
    if (!pattern.isMatching()) {
      return expression;
```

### AssignmentToMethodParameter
Assignment to method parameter `thisExpr`
in `base/src/main/java/org/arend/core/expr/FieldCallExpression.java`
#### Snippet
```java
    }

    thisExpr = thisExpr.getUnderlyingExpression();
    if (thisExpr instanceof NewExpression) {
      Expression impl = ((NewExpression) thisExpr).getImplementation(definition);
```

### AssignmentToMethodParameter
Assignment to method parameter `params`
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java
            Expression newArg = makeNewExpression(arg, params.getTypeExpr());
            newArgs.add(newArg != null ? newArg : arg.accept(this, null));
            params = params.getNext();
          }
          return newArgs;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java

  private static void checkImplementation(CoreClassField field, Expression type) {
    type = type.normalize(NormalizationMode.WHNF);
    if (!(type instanceof CoreClassCallExpression && ((CoreClassCallExpression) type).getDefinition().isSubClassOf(field.getParentClass()))) {
      throw new IllegalArgumentException("Expected an expression of type '" + field.getParentClass().getName() + "'");
```

### AssignmentToMethodParameter
Assignment to method parameter `arg`
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java
      Expression type = piExpr.getCodomain().accept(new SubstVisitor(new ExprSubstitution(thisBindings, newExpr), LevelSubstitution.EMPTY) {
        private Expression makeNewExpression(Expression arg, Expression type) {
          arg = arg.getUnderlyingExpression();
          boolean ok = arg instanceof ReferenceExpression && ((ReferenceExpression) arg).getBinding() == thisBindings;
          if (!ok && arg instanceof NewExpression) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java
          }
          if (ok) {
            type = type.normalize(NormalizationMode.WHNF);
            if (type instanceof ClassCallExpression && getDefinition().isSubClassOf(((ClassCallExpression) type).getDefinition())) {
              ClassCallExpression classCall = (ClassCallExpression) type;
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
      while (n > 0 && link.hasNext()) {
        link = link.getNext();
        n--;
      }
      if (n == 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  public boolean areDisjointConstructors(@NotNull UncheckedExpression expr2) {
    Expression expr1 = normalize(NormalizationMode.WHNF);
    expr2 = UncheckedExpressionImpl.extract(expr2).normalize(NormalizationMode.WHNF);
    if (expr1 instanceof IntegerExpression) {
      return checkInteger(((IntegerExpression) expr1).getBigInteger(), expr2);
```

### AssignmentToMethodParameter
Assignment to method parameter `function`
in `base/src/main/java/org/arend/core/expr/AppExpression.java`
#### Snippet
```java

  public static Expression make(Expression function, Expression argument, boolean isExplicit) {
    function = function.getUnderlyingExpression();
    if (function instanceof LamExpression) {
      LamExpression lamExpr = (LamExpression) function;
```

### AssignmentToMethodParameter
Assignment to method parameter `constructor`
in `base/src/main/java/org/arend/core/expr/ConCallExpression.java`
#### Snippet
```java
    }
    if (constructor == Prelude.FIN_SUC) {
      constructor = Prelude.SUC;
      dataTypeArguments = Collections.emptyList();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `dataTypeArguments`
in `base/src/main/java/org/arend/core/expr/ConCallExpression.java`
#### Snippet
```java
    if (constructor == Prelude.FIN_SUC) {
      constructor = Prelude.SUC;
      dataTypeArguments = Collections.emptyList();
    }
    if (constructor == Prelude.SUC && !arguments.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/FindMissingBindingVisitor.java`
#### Snippet
```java

  void freeParameters(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      myBindings.remove(link);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/core/expr/visitor/FindMissingBindingVisitor.java`
#### Snippet
```java
      DependentLink link1 = link.getNextTyped(null);
      if (link1.getTypeExpr().accept(this, null)) {
        for (; parameters != link; parameters = parameters.getNext()) {
          myBindings.remove(parameters);
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `arg`
in `base/src/main/java/org/arend/core/expr/visitor/GoodThisParametersVisitor.java`
#### Snippet
```java

  private void visitArgument(Expression arg, Boolean goodParameter) {
    arg = arg.getUnderlyingExpression();
    if (arg instanceof FieldCallExpression && goodParameter) {
      visitDefCall((FieldCallExpression) arg, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/visitor/GoodThisParametersVisitor.java`
#### Snippet
```java
    boolean goodParam = false;
    do {
      expr = (ConCallExpression) it;

      visitArguments(expr.getDataTypeArguments(), expr.getDefinition().getDataType().getGoodThisParameters());
```

### AssignmentToMethodParameter
Assignment to method parameter `body`
in `base/src/main/java/org/arend/core/expr/visitor/VoidExpressionVisitor.java`
#### Snippet
```java
        }
      }
      body = ((IntervalElim) body).getOtherwise();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/VoidExpressionVisitor.java`
#### Snippet
```java

  public void visitParameters(DependentLink link, P params) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      link.getTypeExpr().accept(this, params);
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/VoidExpressionVisitor.java`
#### Snippet
```java
  public void visitParameters(DependentLink link, P params) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      link.getTypeExpr().accept(this, params);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/visitor/VoidExpressionVisitor.java`
#### Snippet
```java
    Expression it = expr;
    do {
      expr = (ConCallExpression) it;
      processConCall(expr, params);

```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
      }

      expr = (ConCallExpression) rec;
      recursiveParam = expr.getDefinition().getRecursiveParameter();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java

    for (int i = argStack.size() - 1; i >= 0; i--) {
      expr = argStack.get(i);
      ConCallExpression result = resultStack.get(i);
      for (int j = expr.getDefinition().getRecursiveParameter() + 1; j < expr.getDefCallArguments().size(); j++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/StripVisitor.java`
#### Snippet
```java

  public void visitParameters(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      DependentLink link1 = link.getNextTyped(null);
      link1.setType(link1.getType().strip(this));
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/FindBindingVisitor.java`
#### Snippet
```java
  @Override
  protected boolean visitDependentLink(DependentLink link, Void param) {
    for (; link.hasNext(); link = link.getNext()) {
      if (link instanceof TypedDependentLink && link.getTypeExpr().accept(this, param)) {
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/FindBindingVisitor.java`
#### Snippet
```java

  private void freeDependentLink(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      myAllowedBindings.remove(link);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `param`
in `base/src/main/java/org/arend/core/expr/visitor/FreeVariablesCollector.java`
#### Snippet
```java

  private void freeParams(DependentLink param) {
    for (; param.hasNext(); param = param.getNext()) {
      myResult.remove(param);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizingFindBindingVisitor.java`
#### Snippet
```java

  private boolean visitDependentLink(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      if (findBinding(link.getTypeExpr(), true)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizingFindBindingVisitor.java`
#### Snippet
```java
  private boolean visitDependentLink(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      if (findBinding(link.getTypeExpr(), true)) {
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/FieldsCollector.java`
#### Snippet
```java
    for (Expression argument : arguments) {
      checkArgument(argument, link.getTypeExpr());
      link = link.getNext();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/visitor/FieldsCollector.java`
#### Snippet
```java
    Expression type = null;
    do {
      expr = (ConCallExpression) it;

      checkArguments(expr.getDefinition().getDataTypeParameters(), expr.getDataTypeArguments());
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/subst/InPlaceLevelSubstVisitor.java`
#### Snippet
```java
  @Override
  public void visitParameters(DependentLink link, Void params) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      link.getType().subst(this);
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/subst/InPlaceLevelSubstVisitor.java`
#### Snippet
```java
  public void visitParameters(DependentLink link, Void params) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      link.getType().subst(this);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    }

    expression = expression.normalize(NormalizationMode.WHNF);
    if (removeImplementations) {
      ClassCallExpression classCall = expression.cast(ClassCallExpression.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      if (type == null) {
        if (myKeepVisitor != null) {
          for (; parameters != link; parameters = parameters.getNext()) {
            myKeepVisitor.getBindings().remove(parameters);
          }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/subst/ExprSubstitution.java`
#### Snippet
```java
      }
      mySubstExprs.put(link, arg);
      link = link.getNext();
    }
    return this;
```

### AssignmentToMethodParameter
Assignment to method parameter `paramType`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
    while (paramType instanceof PiExpression) {
      skip += DependentLink.Helper.size(((PiExpression) paramType).getParameters());
      paramType = ((PiExpression) paramType).getCodomain();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `argType`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java

    if (paramType instanceof UniverseExpression) {
      argType = argType.dropPiParameter(skip);
      argType = argType == null ? null : argType.normalize(NormalizationMode.WHNF);
      if (!(argType instanceof UniverseExpression)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `argType`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
    if (paramType instanceof UniverseExpression) {
      argType = argType.dropPiParameter(skip);
      argType = argType == null ? null : argType.normalize(NormalizationMode.WHNF);
      if (!(argType instanceof UniverseExpression)) {
        return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `argType`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
      return matchLevels(new LevelPair(paramSort.getPLevel(), paramSort.getHLevel()), new LevelPair(argSort.getPLevel(), argSort.getHLevel()), levelMap);
    } else if (paramType instanceof SigmaExpression) {
      argType = argType.dropPiParameter(skip);
      argType = argType == null ? null : argType.normalize(NormalizationMode.WHNF);
      if (!(argType instanceof SigmaExpression)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `argType`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
    } else if (paramType instanceof SigmaExpression) {
      argType = argType.dropPiParameter(skip);
      argType = argType == null ? null : argType.normalize(NormalizationMode.WHNF);
      if (!(argType instanceof SigmaExpression)) {
        return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `argType`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
      return !(paramParam.hasNext() || argParam.hasNext());
    } else if (paramType instanceof ClassCallExpression paramClassCall) {
      argType = argType.dropPiParameter(skip);
      argType = argType == null ? null : argType.normalize(NormalizationMode.WHNF);
      if (!(argType instanceof ClassCallExpression argClassCall)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `argType`
in `base/src/main/java/org/arend/core/expr/visitor/GetTypeVisitor.java`
#### Snippet
```java
    } else if (paramType instanceof ClassCallExpression paramClassCall) {
      argType = argType.dropPiParameter(skip);
      argType = argType == null ? null : argType.normalize(NormalizationMode.WHNF);
      if (!(argType instanceof ClassCallExpression argClassCall)) {
        return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
      for (Expression expression : expressions) {
        result.add(link, expression);
        link = link.getNext();
      }
      return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
    public static int size(DependentLink link) {
      int result = 0;
      for (; link.hasNext(); link = link.getNext()) {
        result++;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
    public static List<DependentLink> toList(DependentLink link) {
      List<DependentLink> result = new ArrayList<>();
      for (; link.hasNext(); link = link.getNext()) {
        result.add(link);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
    public static DependentLink getLast(DependentLink link) {
      DependentLink last = link;
      for (; link.hasNext(); link = link.getNext()) {
        last = link;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
  class Helper {
    public static void freeSubsts(DependentLink link, ExprSubstitution substitution) {
      for (; link.hasNext(); link = link.getNext()) {
        substitution.remove(link);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/context/param/DependentLink.java`
#### Snippet
```java
          return EmptyDependentLink.getInstance();
        }
        link = link.getNext();
      }
      return link;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/pattern/Pattern.java`
#### Snippet
```java
      substitution.add(link, exprPattern.toExpression());
      result.add(exprPattern);
      link = link.getNext();
    }
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/pattern/Pattern.java`
#### Snippet
```java
    List<Pattern> result = new ArrayList<>();
    for (Pattern pattern : patterns) {
      link = pattern.replaceBindings(link, result);
    }
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
        result.add(make(data, subPatterns));
        for (Pattern pattern : getSubPatterns()) {
          link = pattern.replaceBindings(link, subPatterns);
        }
        return link;
```

### AssignmentToMethodParameter
Assignment to method parameter `argument`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      }
    } else {
      argument = argument.getUnderlyingExpression();
      if (argument instanceof ConCallExpression) {
        ConCallExpression conCall = (ConCallExpression) argument;
```

### AssignmentToMethodParameter
Assignment to method parameter `argument`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java

  private static BranchKey getBranchKey(Expression argument) {
    argument = argument.getUnderlyingExpression();
    if (argument instanceof ConCallExpression) {
      return ((ConCallExpression) argument).getDefinition();
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
      if (def instanceof ClassField) {
        Expression resultExpr = FieldCallExpression.make((ClassField) def, result.expression);
        result = new TypecheckingResult(resultExpr, resultExpr.getType());
      } else if (def instanceof FunctionDefinition || def instanceof Constructor) {
        List<Expression> arguments = new ArrayList<>();
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
        substitution.add(link, result.expression);
        if (def instanceof FunctionDefinition) {
          result = new TypecheckingResult(FunCallExpression.make((FunctionDefinition) def, levels, arguments), ((FunctionDefinition) def).getResultType().subst(substitution, levels.makeSubstitution(def)).normalize(NormalizationMode.WHNF));
        } else {
          Expression resultExpr = ConCallExpression.make((Constructor) def, levels, dataArgs, arguments);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
        } else {
          Expression resultExpr = ConCallExpression.make((Constructor) def, levels, dataArgs, arguments);
          result = new TypecheckingResult(resultExpr, resultExpr.computeType().normalize(NormalizationMode.WHNF));
        }
      } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `argument`
in `base/src/main/java/org/arend/core/constructor/IdpConstructor.java`
#### Snippet
```java
  @Override
  public List<Expression> getMatchedArguments(Expression argument, boolean normalizing) {
    argument = argument.getUnderlyingExpression();
    if (argument instanceof FunCallExpression) {
      return ((FunCallExpression) argument).getDefinition() == Prelude.IDP ? Collections.emptyList() : null;
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  public static Boolean isEqualToZero(Expression length) {
    if (length == null) return null;
    length = length.normalize(NormalizationMode.WHNF);
    return length instanceof IntegerExpression ? (Boolean) ((IntegerExpression) length).isZero() : length instanceof ConCallExpression && ((ConCallExpression) length).getDefinition() == Prelude.SUC ? false : null;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
    for (ExpressionPattern pattern : getSubPatterns()) {
      //noinspection unchecked
      link = pattern.replaceBindings(link, (List<Pattern>) (List<?>) subPatterns);
    }
    return link;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java

  public static Boolean isArrayEmpty(Expression type) {
    type = type.normalize(NormalizationMode.WHNF);
    return type instanceof ClassCallExpression && ((ClassCallExpression) type).getDefinition() == Prelude.DEP_ARRAY ? isEqualToZero(((ClassCallExpression) type).getAbsImplementationHere(Prelude.ARRAY_LENGTH)) : null;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  public Decision match(Expression expression, List<Expression> result) {
    Expression dataExpr = getDataExpression();
    expression = expression.normalize(NormalizationMode.WHNF);
    List<? extends Expression> arguments = getMatchingExpressionArguments(expression, true);
    if (arguments != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
    if (dataExpr instanceof FunCallExpression) {
      FunctionDefinition function = ((FunCallExpression) dataExpr).getDefinition();
      expression = expression.getUnderlyingExpression();
      if (function == Prelude.EMPTY_ARRAY) {
        if (expression instanceof ArrayExpression array && array.getElements().isEmpty() && array.getTail() == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/repl/Repl.java`
#### Snippet
```java
   */
  public void checkExpr(@NotNull Concrete.Expression expr, @Nullable Expression expectedType, @NotNull Consumer<TypecheckingResult> continuation) {
    expr = DesugarVisitor.desugar(expr, myErrorReporter);
    if (checkErrors()) return;
    var typechecker = new CheckTypeVisitor(myErrorReporter, null, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `resultTypeLevel`
in `base/src/main/java/org/arend/term/abs/ConcreteBuilder.java`
#### Snippet
```java
    }

    resultTypeLevel = checkResultTypeLevel(resultType, resultTypeLevel);
    Concrete.Expression result = new Concrete.CaseExpression(data, isSFunc, concreteCaseArgs, resultType == null ? null : resultType.accept(this, null), resultTypeLevel == null ? null : resultTypeLevel.accept(this, null), buildClauses(clauses));
    return evalKind == Abstract.EvalKind.BOX ? new Concrete.BoxExpression(data, result) : evalKind != null ? new Concrete.EvalExpression(data, evalKind == Abstract.EvalKind.PEVAL, result) : result;
```

### AssignmentToMethodParameter
Assignment to method parameter `hLevel`
in `base/src/main/java/org/arend/term/abs/ConcreteBuilder.java`
#### Snippet
```java
  public Concrete.UniverseExpression visitUniverse(@Nullable Object data, @Nullable Integer pLevelNum, @Nullable Integer hLevelNum, @Nullable Abstract.LevelExpression pLevel, @Nullable Abstract.LevelExpression hLevel, Void params) {
    if (pLevelNum != null && hLevel == null) {
      hLevel = pLevel;
      pLevel = null;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `pLevel`
in `base/src/main/java/org/arend/term/abs/ConcreteBuilder.java`
#### Snippet
```java
    if (pLevelNum != null && hLevel == null) {
      hLevel = pLevel;
      pLevel = null;
    }
    if (pLevelNum != null && pLevel != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `body`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        }
      }
      body = elim.getOtherwise();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `defCallArgs`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        normDefCalls.add(definition.isStrict(i) ? defCallArgs.get(i).accept(this, NormalizationMode.WHNF) : defCallArgs.get(i));
      }
      defCallArgs = normDefCalls;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
    ConCallExpression conCall1 = arg1.cast(ConCallExpression.class);
    while (conCall1 != null && conCall1.getDefinition() == Prelude.SUC) {
      result = Suc(result);
      arg1 = conCall1.getDefCallArguments().get(0).accept(this, NormalizationMode.WHNF);
      conCall1 = arg1.cast(ConCallExpression.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `arg1`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
    while (conCall1 != null && conCall1.getDefinition() == Prelude.SUC) {
      result = Suc(result);
      arg1 = conCall1.getDefCallArguments().get(0).accept(this, NormalizationMode.WHNF);
      conCall1 = arg1.cast(ConCallExpression.class);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `arg`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
    }

    arg = arg.normalize(NormalizationMode.WHNF);
    Expression type = arg.getType();
    Expression normType = type == null ? null : type.accept(this, NormalizationMode.WHNF);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
      }
      for (int j = 0; j < sucs; j++) {
        result = Suc(result);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
          substitution.add(link, argList.get(leafElimTree.getArgumentIndex(i)));
        }
        resultExpr = Objects.requireNonNull(clause.getExpression());

        if (mode == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
              }
            }
            resultExpr = let.getExpression();
          } else if (mode != NormalizationMode.WHNF && resultExpr instanceof ConCallExpression conCall) {
            if (conCall.getDefinition() == Prelude.SUC) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
            if (conCall.getDefinition() == Prelude.SUC) {
              sucs++;
              resultExpr = conCall.getDefCallArguments().get(0);
            } else if (conCall.getDefinition().getRecursiveParameter() >= 0) {
              int recParam = conCall.getDefinition().getRecursiveParameter();
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
              conArgs = newConArgs;
              recursiveParam = recParam;
              resultExpr = conArgs.get(recursiveParam);
            } else {
              break;
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
            }
          } else if (resultExpr instanceof FunCallExpression funCall && ((FunCallExpression) resultExpr).getDefinition().getBody() instanceof Expression) {
            resultExpr = Objects.requireNonNull((Expression) funCall.getDefinition().getBody()).subst(addArguments(new ExprSubstitution(), funCall.getDefCallArguments(), funCall.getDefinition()), funCall.getLevelSubstitution());
          } else if (resultExpr instanceof ReferenceExpression && ((ReferenceExpression) resultExpr).getBinding() instanceof EvaluatingBinding) {
            resultExpr = ((EvaluatingBinding) ((ReferenceExpression) resultExpr).getBinding()).getExpression();
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
            resultExpr = Objects.requireNonNull((Expression) funCall.getDefinition().getBody()).subst(addArguments(new ExprSubstitution(), funCall.getDefCallArguments(), funCall.getDefinition()), funCall.getLevelSubstitution());
          } else if (resultExpr instanceof ReferenceExpression && ((ReferenceExpression) resultExpr).getBinding() instanceof EvaluatingBinding) {
            resultExpr = ((EvaluatingBinding) ((ReferenceExpression) resultExpr).getBinding()).getExpression();
          } else if (resultExpr instanceof SubstExpression) {
            Expression expr = ((SubstExpression) resultExpr).eval();
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
              break;
            }
            resultExpr = expr;
          } else if (resultExpr instanceof ReferenceExpression) {
            Binding binding = ((ReferenceExpression) resultExpr).getBinding();
```

### AssignmentToMethodParameter
Assignment to method parameter `substitution`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
            Expression expr = substitution.get(binding);
            if (!substitution.isEmpty()) {
              substitution = new ExprSubstitution();
            }
            levelSubstitution = LevelSubstitution.EMPTY;
```

### AssignmentToMethodParameter
Assignment to method parameter `levelSubstitution`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
              substitution = new ExprSubstitution();
            }
            levelSubstitution = LevelSubstitution.EMPTY;
            if (expr != null) {
              resultExpr = expr;
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
            levelSubstitution = LevelSubstitution.EMPTY;
            if (expr != null) {
              resultExpr = expr;
            } else {
              break;
```

### AssignmentToMethodParameter
Assignment to method parameter `elimBody`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        if (resultExpr instanceof FunCallExpression && ((FunCallExpression) resultExpr).getDefinition().getBody() instanceof ElimBody && !isBlocked(((FunCallExpression) resultExpr).getDefinition()) || resultExpr instanceof CaseExpression && !((CaseExpression) resultExpr).isSCase()) {
          FunCallExpression funCall = resultExpr instanceof FunCallExpression ? (FunCallExpression) resultExpr : null;
          elimBody = funCall != null ? (ElimBody) funCall.getDefinition().getBody() : ((CaseExpression) resultExpr).getElimBody();
          assert elimBody != null;
          elimTree = elimBody.getElimTree();
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
            stack.push(resultExpr instanceof CaseExpression ? args.get(j).subst(substitution, levelSubstitution) : funCall.getDefinition().isStrict(j) ? args.get(j).subst(substitution, levelSubstitution).accept(this, NormalizationMode.WHNF) : SubstExpression.make(args.get(j), substitution, levelSubstitution));
          }
          resultExpr = SubstExpression.make(resultExpr, substitution, levelSubstitution);
          if (funCall != null) {
            substitution = new ExprSubstitution();
```

### AssignmentToMethodParameter
Assignment to method parameter `substitution`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
          resultExpr = SubstExpression.make(resultExpr, substitution, levelSubstitution);
          if (funCall != null) {
            substitution = new ExprSubstitution();
            levelSubstitution = funCall.getLevelSubstitution().subst(levelSubstitution);
          }
```

### AssignmentToMethodParameter
Assignment to method parameter `levelSubstitution`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
          if (funCall != null) {
            substitution = new ExprSubstitution();
            levelSubstitution = funCall.getLevelSubstitution().subst(levelSubstitution);
          }
          continue;
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        }

        resultExpr = resultExpr.subst(substitution, levelSubstitution);
        if (result == null) {
          result = resultExpr;
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
      if (elimTree == null) {
        if (resultExpr instanceof SubstExpression) {
          resultExpr = ((SubstExpression) resultExpr).eval();
        }
        if (mode == NormalizationMode.WHNF && resultExpr instanceof FunCallExpression funCall && ((FunCallExpression) resultExpr).getDefinition().getBody() instanceof ElimBody) {
```

### AssignmentToMethodParameter
Assignment to method parameter `resultExpr`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        if (mode == NormalizationMode.WHNF && resultExpr instanceof FunCallExpression funCall && ((FunCallExpression) resultExpr).getDefinition().getBody() instanceof ElimBody) {
          List<Expression> newArgs = ((ElimBody) Objects.requireNonNull(funCall.getDefinition().getBody())).getElimTree().normalizeArguments(funCall.getDefCallArguments());
          resultExpr = FunCallExpression.make(funCall.getDefinition(), funCall.getLevels(), newArgs);
        }
        if (result == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `elimTree`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
      }

      elimTree = updateStack(stack, null, (BranchElimTree) elimTree);
      if (elimTree == null) {
        if (!might) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
    }
    if (expr1 instanceof Concrete.BinOpSequenceExpression && ((Concrete.BinOpSequenceExpression) expr1).getSequence().size() == 1) {
      expr1 = ((Concrete.BinOpSequenceExpression) expr1).getSequence().get(0).getComponent();
    }
    if (expr2 instanceof Concrete.BinOpSequenceExpression && ((Concrete.BinOpSequenceExpression) expr2).getSequence().size() == 1) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/term/concrete/ConcreteCompareVisitor.java`
#### Snippet
```java
    }
    if (expr2 instanceof Concrete.BinOpSequenceExpression && ((Concrete.BinOpSequenceExpression) expr2).getSequence().size() == 1) {
      expr2 = ((Concrete.BinOpSequenceExpression) expr2).getSequence().get(0).getComponent();
    }
    return expr1.accept(this, expr2);
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/term/prettyprint/ArgumentMappingIterator.java`
#### Snippet
```java
        while (link.hasNext()) {
            list.add(link);
            link = link.getNext();
        }
        return list;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/term/prettyprint/CollectFreeVariablesVisitor.java`
#### Snippet
```java
    addFreeVariables(link1, newSet);

    for (; link != link1; link = link.getNext()) {
      newSet.remove(link);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `path`
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
        return null;
      }
      path = path.resolveSibling(fileName.substring(0, fileName.length() - ext.length()));
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `file`
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
          if (file.getFileName().toString().endsWith(ext)) {
            file = path.relativize(file);
            ModulePath modulePath = FileUtils.modulePath(file, ext);
            if (modulePath == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `parent`
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
      Referable referable1 = scope.resolveName(callTargetTree.getName(), null);
      if (referable1 == null) {
        if (parent == null) parent = convertReferable(parentScope.resolveName(parentName));
        if (parent instanceof TCDefReferable) {
          Definition parentDef = ((TCDefReferable) parent).getTypechecked();
```

### AssignmentToMethodParameter
Assignment to method parameter `last`
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java
      if (!last && i == recursiveParam) {
        args.add(null);
        last = true;
        i--;
      } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `param`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java

  protected boolean convertParameters(DependentLink param) {
    for (; param.hasNext(); param = param.getNext()) {
      param = param.getNextTyped(null);
      if (convertSubexpr(param.getTypeExpr())) {
```

### AssignmentToMethodParameter
Assignment to method parameter `param`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
  protected boolean convertParameters(DependentLink param) {
    for (; param.hasNext(); param = param.getNext()) {
      param = param.getNextTyped(null);
      if (convertSubexpr(param.getTypeExpr())) {
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    for (Pattern pattern : patterns) {
      visitElimPattern(pattern, parameters.isExplicit(), result);
      parameters = parameters.getNext();
    }
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    List<Object> list = new ArrayList<>();
    while (true) {
      expr = expr.getUnderlyingExpression();
      if (expr instanceof ProjExpression) {
        list.add(((ProjExpression) expr).getField());
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      if (expr instanceof ProjExpression) {
        list.add(((ProjExpression) expr).getField());
        expr = ((ProjExpression) expr).getExpression();
      } else if (expr instanceof FieldCallExpression) {
        list.add(((FieldCallExpression) expr).getDefinition());
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      } else if (expr instanceof FieldCallExpression) {
        list.add(((FieldCallExpression) expr).getDefinition());
        expr = ((FieldCallExpression) expr).getArgument();
      } else {
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `lamExpr`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    List<Concrete.Parameter> parameters = new ArrayList<>();
    Expression expr = lamExpr;
    for (; lamExpr != null; lamExpr = expr.cast(LamExpression.class)) {
      if (hasFlag(PrettyPrinterFlag.SHOW_TYPES_IN_LAM) || shouldBeVerbose(lamExpr.getParameters()) || convertParameters(lamExpr.getParameters())) {
        visitDependentLink(lamExpr.getParameters(), parameters, true);
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    NormalizationMode mode = config.getNormalizationMode();
    if (mode != null && subexpr == null) {
      expression = expression.normalize(mode);
    }
    expression.accept(collector, variables);
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      visitArgument(arg, parameters.isExplicit(), concreteArguments, genGoal, (parentVerboseLevel >= implicitArgumentsCounter));
      if (parameters.hasNext()) {
        parameters = parameters.getNext();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `piExpr`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    List<List<Concrete.TypeParameter>> parameters = new ArrayList<>();
    Expression expr = piExpr;
    for (; piExpr != null; piExpr = expr.cast(PiExpression.class)) {
      List<Concrete.TypeParameter> params = new ArrayList<>();
      visitDependentLink(piExpr.getParameters(), params, false);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    boolean concreteExplicit = true;
    do {
      expr = (ConCallExpression) it;
      boolean showImplicitArgs = hasFlag(PrettyPrinterFlag.SHOW_BIN_OP_IMPLICIT_ARGS) || !expr.getDefinition().getReferable().getPrecedence().isInfix;

```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      if (substitution != null && link != null && link.hasNext()) {
        substitution.add(link, (myCMP == CMP.LE ? list2 : list1).get(i));
        link = link.getNext();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      }
      if (myNormalize) {
        expr1 = ExpressionFactory.Fin(pair1.proj1 instanceof IntegerExpression ? new BigIntegerExpression(pair1.proj2) : ExpressionFactory.add(pair1.proj1, pair1.proj2.intValueExact()));
        expr2 = ExpressionFactory.Fin(pair2.proj1 instanceof IntegerExpression ? new BigIntegerExpression(pair2.proj2) : ExpressionFactory.add(pair2.proj1, pair2.proj2.intValueExact()));
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      if (myNormalize) {
        expr1 = ExpressionFactory.Fin(pair1.proj1 instanceof IntegerExpression ? new BigIntegerExpression(pair1.proj2) : ExpressionFactory.add(pair1.proj1, pair1.proj2.intValueExact()));
        expr2 = ExpressionFactory.Fin(pair2.proj1 instanceof IntegerExpression ? new BigIntegerExpression(pair2.proj2) : ExpressionFactory.add(pair2.proj1, pair2.proj2.intValueExact()));
      }
      return myEquations.addEquation((correctOrder ? expr1 : expr2), substitute(correctOrder ? expr2 : expr1), Type.OMEGA, myCMP, (stuckVar1 != null ? stuckVar1 : stuckVar2).getSourceNode(), stuckVar1, stuckVar2);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java

  public Boolean compare(Expression expr1, Expression expr2, Expression type, boolean useType) {
    expr1 = expr1.getUnderlyingExpression();
    expr2 = expr2.getUnderlyingExpression();
    if (expr1 == expr2) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  public Boolean compare(Expression expr1, Expression expr2, Expression type, boolean useType) {
    expr1 = expr1.getUnderlyingExpression();
    expr2 = expr2.getUnderlyingExpression();
    if (expr1 == expr2) {
      return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
    }

    type = type == null ? null : type.dropPiParameter(Math.max(params1.size(), params2.size()));
    Boolean result = compare(correctOrder ? body1 : body2, correctOrder ? body2 : body1, type, true);
    for (int i = 0; i < params1.size() && i < params2.size(); i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `params1`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  private Expression addLamParameters(LamExpression lamExpr1, List<DependentLink> params1, Expression body1, List<DependentLink> params2) {
    if (params2.size() > params1.size()) {
      params1 = new ArrayList<>(params1);
      params1.addAll(params2);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
        return expr instanceof IntegerExpression ? new Pair<>(new SmallIntegerExpression(0), ((IntegerExpression) expr).plus(sucs).getBigInteger()) : new Pair<>(expr, BigInteger.valueOf(sucs));
      }
      expr = ((ConCallExpression) expr).getDefCallArguments().get(0);
      expr = myNormalize ? expr.normalize(NormalizationMode.WHNF) : expr.getUnderlyingExpression();
      sucs++;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      }
      expr = ((ConCallExpression) expr).getDefCallArguments().get(0);
      expr = myNormalize ? expr.normalize(NormalizationMode.WHNF) : expr.getUnderlyingExpression();
      sucs++;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
    List<Pair<ConCallExpression, ConCallExpression>> stack = null;
    while (true) {
      expr1 = (ConCallExpression) it;
      if (expr2 instanceof IntegerExpression) {
        return visitInteger((IntegerExpression) expr2, expr1) || myOnlySolveVars;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java

      it = expr1.getDefCallArguments().get(recursiveParam).getUnderlyingExpression();
      expr2 = conCall2.getDefCallArguments().get(recursiveParam).getUnderlyingExpression();
      if (it == expr2) {
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      }
      it = it.normalize(NormalizationMode.WHNF);
      expr2 = expr2.normalize(NormalizationMode.WHNF);
      if (!(it instanceof ConCallExpression)) {
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      }
      if (!(fun instanceof AppExpression)) return null;
      expr1 = (AppExpression) fun;
    }
    if (infExpr.getVariable() == null) return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
    SubstVisitor substVisitor = new SubstVisitor(substitution, LevelSubstitution.EMPTY, false);
    if (!substVisitor.isEmpty()) {
      expr2 = expr2.accept(substVisitor, null);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java

  public boolean nonNormalizingCompare(Expression expr1, Expression expr2, Expression type) {
    expr1 = expr1.getUnderlyingExpression();
    expr2 = expr2.getUnderlyingExpression();

```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  public boolean nonNormalizingCompare(Expression expr1, Expression expr2, Expression type) {
    expr1 = expr1.getUnderlyingExpression();
    expr2 = expr2.getUnderlyingExpression();

    // Optimization for let clause calls
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/module/serialization/ExpressionSerialization.java`
#### Snippet
```java
    tBuilder.setType(writeType(typed.getType()));
    tBuilder.setIsProperty(typed.isProperty());
    for (; link != typed; link = link.getNext()) {
      registerBinding(link);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/module/serialization/ExpressionSerialization.java`
#### Snippet
```java
  List<ExpressionProtos.Telescope> writeParameters(DependentLink link) {
    List<ExpressionProtos.Telescope> out = new ArrayList<>();
    for (; link.hasNext(); link = link.getNext()) {
      out.add(writeSingleParameter(link));
      link = link.getNextTyped(null);
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/module/serialization/ExpressionSerialization.java`
#### Snippet
```java
    for (; link.hasNext(); link = link.getNext()) {
      out.add(writeSingleParameter(link));
      link = link.getNextTyped(null);
    }
    return out;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/module/serialization/ExpressionSerialization.java`
#### Snippet
```java
            recursiveParam = -1;
          } else {
            expr = (ConCallExpression) arg;
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `base/src/main/java/org/arend/naming/scope/Scope.java`
#### Snippet
```java
        return scope.resolveName(path.get(i));
      } else {
        scope = scope.resolveNamespace(path.get(i), i < path.size() - 2);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `parentScope`
in `base/src/main/java/org/arend/naming/scope/NamespaceCommandNamespace.java`
#### Snippet
```java
      return EmptyScope.INSTANCE;
    }
    parentScope = parentScope == null ? null : parentScope.resolveNamespace(path);
    return parentScope == null ? EmptyScope.INSTANCE : new NamespaceCommandNamespace(parentScope, cmd);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
    Concrete.Expression it = expr;
    do {
      expr = (Concrete.AppExpression) it;
      TCDefReferable tcRef = expr.getFunction() instanceof Concrete.ReferenceExpression && ((ReferenceExpression) expr.getFunction()).getReferent() instanceof TCDefReferable ? (TCDefReferable) ((ReferenceExpression) expr.getFunction()).getReferent() : null;
      Constructor constructor = tcRef == null ? null : tcRef.getTypechecked() instanceof Constructor ? (Constructor) tcRef.getTypechecked() : null;
```

### AssignmentToMethodParameter
Assignment to method parameter `prec`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
        StringBuilder tailBuilder = new StringBuilder();
        boolean leftParamIsRecursive = explicitIndex == constructor.getRecursiveParameter();
        prec = visitBinOp(leftParamIsRecursive ? null : args.get(args.size() - 2).getExpression(), (Concrete.ReferenceExpression) expr.getFunction(), args.subList(0, args.size() - 2), leftParamIsRecursive ? args.get(args.size() - 1).getExpression() : null, prec, tailBuilder);
        if (tailBuilder.length() != 0) {
          if (tail == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `prec`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
        }
        it = args.get(recursiveArg).getExpression();
        prec = args.get(recursiveArg).isExplicit() ? new Precedence((byte) (Concrete.AppExpression.PREC + 1)) : new Precedence(Concrete.Expression.PREC);
      }
    } while (it instanceof Concrete.AppExpression);
```

### AssignmentToMethodParameter
Assignment to method parameter `leftLen`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

    boolean doHyphenation(int leftLen, int rightLen) {
      if (leftLen == 0) leftLen = 1; if (leftLen > MAX_LEN) leftLen = MAX_LEN;
      if (rightLen == 0) rightLen = 1; if (rightLen > MAX_LEN) rightLen = MAX_LEN;
      double ratio = ((double) rightLen) / leftLen;
```

### AssignmentToMethodParameter
Assignment to method parameter `leftLen`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java

    boolean doHyphenation(int leftLen, int rightLen) {
      if (leftLen == 0) leftLen = 1; if (leftLen > MAX_LEN) leftLen = MAX_LEN;
      if (rightLen == 0) rightLen = 1; if (rightLen > MAX_LEN) rightLen = MAX_LEN;
      double ratio = ((double) rightLen) / leftLen;
```

### AssignmentToMethodParameter
Assignment to method parameter `rightLen`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
    boolean doHyphenation(int leftLen, int rightLen) {
      if (leftLen == 0) leftLen = 1; if (leftLen > MAX_LEN) leftLen = MAX_LEN;
      if (rightLen == 0) rightLen = 1; if (rightLen > MAX_LEN) rightLen = MAX_LEN;
      double ratio = ((double) rightLen) / leftLen;
      if (ratio > 1.0) ratio = 1/ratio;
```

### AssignmentToMethodParameter
Assignment to method parameter `rightLen`
in `base/src/main/java/org/arend/term/prettyprint/PrettyPrintVisitor.java`
#### Snippet
```java
    boolean doHyphenation(int leftLen, int rightLen) {
      if (leftLen == 0) leftLen = 1; if (leftLen > MAX_LEN) leftLen = MAX_LEN;
      if (rightLen == 0) rightLen = 1; if (rightLen > MAX_LEN) rightLen = MAX_LEN;
      double ratio = ((double) rightLen) / leftLen;
      if (ratio > 1.0) ratio = 1/ratio;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java

    String name;
    type = type.getUnderlyingExpression();
    while (type instanceof AppExpression) {
      type = type.getFunction().getUnderlyingExpression();
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java
    type = type.getUnderlyingExpression();
    while (type instanceof AppExpression) {
      type = type.getFunction().getUnderlyingExpression();
    }
    if (type instanceof DefCallExpression) {
```

### AssignmentToMethodParameter
Assignment to method parameter `ref`
in `base/src/main/java/org/arend/naming/reference/RedirectingReferable.java`
#### Snippet
```java
  static Referable getOriginalReferable(Referable ref) {
    while (ref instanceof RedirectingReferable) {
      ref = ((RedirectingReferable) ref).getOriginalReferable();
    }
    return ref;
```

### AssignmentToMethodParameter
Assignment to method parameter `referent`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
      }

      referent = ref;
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
            }
          }
          expr = ((Concrete.PiExpression) expr).getCodomain();
        } else if (expr instanceof Concrete.ClassExtExpression) {
          expr = ((Concrete.ClassExtExpression) expr).getBaseClassExpression();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
          expr = ((Concrete.PiExpression) expr).getCodomain();
        } else if (expr instanceof Concrete.ClassExtExpression) {
          expr = ((Concrete.ClassExtExpression) expr).getBaseClassExpression();
        } else {
          break;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
      while (true) {
        if (expr instanceof Concrete.LamExpression) {
          expr = ((Concrete.LamExpression) expr).getBody();
        } else if (expr instanceof Concrete.ClassExtExpression) {
          expr = ((Concrete.ClassExtExpression) expr).getBaseClassExpression();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
          expr = ((Concrete.LamExpression) expr).getBody();
        } else if (expr instanceof Concrete.ClassExtExpression) {
          expr = ((Concrete.ClassExtExpression) expr).getBaseClassExpression();
        } else {
          break;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
        }
        if (index == -1) {
          expr = binOpSeq.get(0).getComponent();
        } else {
          for (int i = index + 1; i < binOpSeq.size(); i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
            }
          }
          expr = binOpSeq.get(index).getComponent();
        }
      } else if (expr instanceof Concrete.AppExpression) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
        }
      } else if (expr instanceof Concrete.AppExpression) {
        expr = ((Concrete.AppExpression) expr).getFunction();
      } else {
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `sourceNode`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
      Abstract.SourceNode parentSourceNode = sourceNode.getParentSourceNode();
      if (parentSourceNode instanceof Abstract.Expression && sourceNode instanceof Abstract.Reference) {
        sourceNode = parentSourceNode;
        parentSourceNode = sourceNode.getParentSourceNode();
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `sourceNode`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
      }

      sourceNode = parentSourceNode;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `prelude`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
          NamespaceCommand cmd = statement.getNamespaceCommand();
          if (cmd != null && cmd.getKind() == NamespaceCommand.Kind.IMPORT && cmd.getPath().equals(Prelude.MODULE_PATH.toList())) {
            prelude = false;
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `sourceNode`
in `base/src/main/java/org/arend/naming/scope/ScopeFactory.java`
#### Snippet
```java
    Abstract.SourceNode parentSourceNode = sourceNode.getParentSourceNode();
    if (parentSourceNode instanceof Abstract.Expression && sourceNode instanceof Abstract.Reference) {
      sourceNode = parentSourceNode;
      parentSourceNode = sourceNode.getParentSourceNode();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
        resolvedRefs.add(resolved);
      }
      i = 0;
    } else {
      resolved = resolvedRefs != null ? resolvedRefs.get(i) : scope.resolveName(myPath.get(i));
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
      boolean wasResolved = resolved != null;
      if (wasResolved) {
        i++;
      }
      resolved = new ErrorReference(data, make(data, myPath.subList(0, i)), i, myPath.get(i));
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
    Object data = getData();
    Concrete.Expression result = new Concrete.ReferenceExpression(data, getReferable());
    for (i++; i < myPath.size(); i++) {
      resolved = new ClassFieldImplScope(classRef, ClassFieldImplScope.Extent.WITH_DYNAMIC).resolveName(myPath.get(i));
      if (resolved == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
    Object data = getData();
    Concrete.Expression result = new Concrete.ReferenceExpression(data, getReferable());
    for (i++; i < myPath.size(); i++) {
      resolved = new ClassFieldImplScope(classRef, ClassFieldImplScope.Extent.WITH_DYNAMIC).resolveName(myPath.get(i));
      if (resolved == null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java

      prevScope = scope;
      scope = nextScope;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
    }

    for (i++; i < myPath.size(); i++) {
      ref = new ClassFieldImplScope(classRef, ClassFieldImplScope.Extent.WITH_DYNAMIC).resolveName(myPath.get(i));
      classRef = ref instanceof TypedReferable ? ((TypedReferable) ref).getTypeClassReference() : null;
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
    }

    for (i++; i < myPath.size(); i++) {
      ref = new ClassFieldImplScope(classRef, ClassFieldImplScope.Extent.WITH_DYNAMIC).resolveName(myPath.get(i));
      classRef = ref instanceof TypedReferable ? ((TypedReferable) ref).getTypeClassReference() : null;
```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java

    for (int i = 0; i < myPath.size(); i++) {
      scope = scope.resolveNamespace(myPath.get(i), true);
      if (scope == null) {
        Object data = getData();
```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
      }
      prevScope = scope;
      scope = nextScope;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
      ClassReferable classRef = ((TypedReferable) ref).getTypeClassReference();
      if (classRef != null) {
        scope = new MergeScope(scope, new ClassFieldImplScope(classRef, ClassFieldImplScope.Extent.WITH_DYNAMIC));
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `scope`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
        resolvedRefs.add(scope.resolveName(myPath.get(i)));
      }
      scope = scope.resolveNamespace(myPath.get(i), i < myPath.size() - 2);
      if (scope == null) {
        if (!onlyTry) {
```

### AssignmentToMethodParameter
Assignment to method parameter `parentGroup`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
    do {
      groups.add(parentGroup);
      parentGroup = parentGroup.getParentGroup();
    } while (parentGroup != null);

```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
      while (expr instanceof Concrete.PiExpression) {
        exprVisitor.updateScope(((Concrete.PiExpression) expr).getParameters());
        expr = ((Concrete.PiExpression) expr).getCodomain();
      }
    } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
      while (expr instanceof Concrete.LamExpression) {
        exprVisitor.updateScope(((Concrete.LamExpression) expr).getParameters());
        expr = ((Concrete.LamExpression) expr).getBody();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
    while (true) {
      if (expr instanceof Concrete.AppExpression) {
        expr = ((Concrete.AppExpression) expr).getFunction();
      } else if (expr instanceof Concrete.ClassExtExpression) {
        expr = ((Concrete.ClassExtExpression) expr).getBaseClassExpression();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
        expr = ((Concrete.AppExpression) expr).getFunction();
      } else if (expr instanceof Concrete.ClassExtExpression) {
        expr = ((Concrete.ClassExtExpression) expr).getBaseClassExpression();
      } else {
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `base/src/main/java/org/arend/extImpl/ConcreteFactoryImpl.java`
#### Snippet
```java
  @Override
  public ConcretePattern numberPattern(int number) {
    if (number > Concrete.NumberPattern.MAX_VALUE) number = Concrete.NumberPattern.MAX_VALUE;
    if (number < -Concrete.NumberPattern.MAX_VALUE) number = -Concrete.NumberPattern.MAX_VALUE;
    return new Concrete.NumberPattern(myData, number, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `number`
in `base/src/main/java/org/arend/extImpl/ConcreteFactoryImpl.java`
#### Snippet
```java
  public ConcretePattern numberPattern(int number) {
    if (number > Concrete.NumberPattern.MAX_VALUE) number = Concrete.NumberPattern.MAX_VALUE;
    if (number < -Concrete.NumberPattern.MAX_VALUE) number = -Concrete.NumberPattern.MAX_VALUE;
    return new Concrete.NumberPattern(myData, number, null);
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `unit`
in `base/src/main/java/org/arend/typechecking/order/BellmanFord.java`
#### Snippet
```java
      List<T> scc = new ArrayList<>();
      do {
        unit = myStack.pop();
        myVertices.get(unit).onStack = false;
        scc.add(unit);
```

### AssignmentToMethodParameter
Assignment to method parameter `apps`
in `base/src/main/java/org/arend/typechecking/visitor/CheckForUniversesVisitor.java`
#### Snippet
```java
          SingleDependentLink param = lam.getParameters();
          for (; param.hasNext() && apps > 0; param = param.getNext()) {
            apps--;
          }
          result = param.hasNext() ? new LamExpression(lam.getResultSort(), param, lam.getBody()) : lam.getBody();
```

### AssignmentToMethodParameter
Assignment to method parameter `core`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
        if (Referable.getUnderlyingReferable(ref) == referable) return core;
        if (concrete.isExplicit() != core.isExplicit()) continue;
        core = next.apply(core);
        if (core == null) return null;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/FreeVariablesClassifier.java`
#### Snippet
```java

  private Result visitParameters(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      Result result = link.getTypeExpr().accept(this, false);
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/FreeVariablesClassifier.java`
#### Snippet
```java
  private Result visitParameters(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      Result result = link.getTypeExpr().accept(this, false);
      if (result != Result.NONE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/visitor/FreeVariablesClassifier.java`
#### Snippet
```java

    do {
      expr = (ConCallExpression) it;
      goodArg = good && expr.getDefinition().getBody() == null;
      result = visitList(expr.getDataTypeArguments(), goodArg);
```

### AssignmentToMethodParameter
Assignment to method parameter `referable`
in `base/src/main/java/org/arend/typechecking/visitor/WhereVarsFixVisitor.java`
#### Snippet
```java
      }
      level++;
      referable = parent;
    }
    return level;
```

### AssignmentToMethodParameter
Assignment to method parameter `corePi`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
      Expression corePiCodomain = corePi.getCodomain();
      if (corePiCodomain instanceof PiExpression)
        corePi = (PiExpression) corePiCodomain;
      else return codomain.accept(this, corePiCodomain);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `sig`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
      var expression = visitParameter(parameter, sig);
      if (expression != null) return expression;
      sig = sig.getNextTyped(null).getNext();
    }
    return nullWithError(new SubExprError(SubExprError.Kind.Telescope));
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `base/src/main/java/org/arend/typechecking/visitor/BaseDefinitionTypechecker.java`
#### Snippet
```java
  public static int checkNumberInPattern(int n, ErrorReporter errorReporter, Concrete.SourceNode sourceNode) {
    if (n < 0) {
      n = -n;
    }
    if (n > Concrete.NumberPattern.MAX_VALUE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `n`
in `base/src/main/java/org/arend/typechecking/visitor/BaseDefinitionTypechecker.java`
#### Snippet
```java
    }
    if (n > Concrete.NumberPattern.MAX_VALUE) {
      n = Concrete.NumberPattern.MAX_VALUE;
    }
    if (n == Concrete.NumberPattern.MAX_VALUE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
    Expression it = expression;
    while (true) {
      expression = (ConCallExpression) it;
      switch (processDefCall(expression, param)) {
        case STOP: return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java

  protected boolean visitDependentLink(DependentLink link, P param) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      if (link.getTypeExpr().accept(this, param)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
  protected boolean visitDependentLink(DependentLink link, P param) {
    for (; link.hasNext(); link = link.getNext()) {
      link = link.getNextTyped(null);
      if (link.getTypeExpr().accept(this, param)) {
        return true;
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java
      }

      expression = (ConCallExpression) rec;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/typechecking/visitor/SearchVisitor.java`
#### Snippet
```java

    for (int i = stack.size() - 1; i >= 0; i--) {
      expression = stack.get(i);
      for (int j = expression.getDefinition().getRecursiveParameter() + 1; j < expression.getDefCallArguments().size(); j++) {
        if (visitConCallArgument(expression.getDefCallArguments().get(j), param)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `definition`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java
  public void headerFound(Concrete.ResolvableDefinition definition) {
    Concrete.ResolvableDefinition newDef = myDesugaredDefinitions.get(definition.getData());
    if (newDef != null) definition = newDef;
    myCurrentDefinitions = Collections.singletonList(definition.getData());
    typecheckingHeaderStarted(definition.getData());
```

### AssignmentToMethodParameter
Assignment to method parameter `definition`
in `base/src/main/java/org/arend/typechecking/order/listener/TypecheckingOrderingListener.java`
#### Snippet
```java
    CheckTypeVisitor checkTypeVisitor = new CheckTypeVisitor(new LocalErrorReporter(definition.getData(), myErrorReporter), null, extension);
    checkTypeVisitor.setInstancePool(new GlobalInstancePool(myInstanceProviderSet.get(definition.getData()), checkTypeVisitor));
    definition = definition.accept(new ReplaceDataVisitor(), null);
    if (definition instanceof Concrete.FunctionDefinition funDef && funDef.getKind().isUse()) {
      myDesugaredDefinitions.put(funDef.getData(), funDef);
```

### AssignmentToMethodParameter
Assignment to method parameter `parentScope`
in `base/src/main/java/org/arend/typechecking/instance/provider/InstanceProviderSet.java`
#### Snippet
```java
    }

    parentScope = CachingScope.make(LexicalScope.insideOf(group, parentScope));
    List<Group> subgroups = new ArrayList<>();
    for (Statement statement : statements) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/covariance/ParametersCovarianceChecker.java`
#### Snippet
```java
          return true;
        }
        expr = expr.getFunction();
      } else if (expr instanceof ProjExpression) {
        expr = ((ProjExpression) expr).getExpression();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/covariance/ParametersCovarianceChecker.java`
#### Snippet
```java
        expr = expr.getFunction();
      } else if (expr instanceof ProjExpression) {
        expr = ((ProjExpression) expr).getExpression();
      } else if (expr instanceof FieldCallExpression) {
        expr = ((FieldCallExpression) expr).getArgument();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/covariance/ParametersCovarianceChecker.java`
#### Snippet
```java
        expr = ((ProjExpression) expr).getExpression();
      } else if (expr instanceof FieldCallExpression) {
        expr = ((FieldCallExpression) expr).getArgument();
      } else if (expr instanceof AtExpression) {
        if (checkNonCovariant(((AtExpression) expr).getIntervalArgument())) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/covariance/ParametersCovarianceChecker.java`
#### Snippet
```java
          return true;
        }
        expr = ((AtExpression) expr).getPathArgument();
      } else if (expr instanceof ReferenceExpression) {
        return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/covariance/CovarianceChecker.java`
#### Snippet
```java

  private boolean checkConstructor(Expression expr) {
    expr = expr.getUnderlyingExpression();

    if (expr instanceof LamExpression) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/covariance/CovarianceChecker.java`
#### Snippet
```java
      return false;
    }
    expr = expr.getUnderlyingExpression();

    if (expr instanceof UniverseExpression) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
          if (classCall != null) {
            myCheckTypeVisitor.fixClassExtSort(classCall, sourceNode);
            expectedType = classCall;
          }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
        if (((ReferenceExpression) expr1).getBinding() == binding2) return BaseCallMatrix.R.Equal;
      } else {
        expr1 = removeArgs(expr1);
        if (expr1 instanceof ReferenceExpression && ((ReferenceExpression) expr1).getBinding() == binding2)
          return BaseCallMatrix.R.LessThan; // ensures that "e x < e"
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
    while (true) {
      if (expr instanceof AppExpression) {
        expr = expr.getFunction();
      } else if (expr instanceof ProjExpression) {
        expr = ((ProjExpression) expr).getExpression();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
        expr = expr.getFunction();
      } else if (expr instanceof ProjExpression) {
        expr = ((ProjExpression) expr).getExpression();
      } else if (expr instanceof AtExpression) {
        expr = ((AtExpression) expr).getPathArgument();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
        expr = ((ProjExpression) expr).getExpression();
      } else if (expr instanceof AtExpression) {
        expr = ((AtExpression) expr).getPathArgument();
      } else if (expr instanceof FieldCallExpression) {
        expr = ((FieldCallExpression) expr).getArgument();
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
        expr = ((AtExpression) expr).getPathArgument();
      } else if (expr instanceof FieldCallExpression) {
        expr = ((FieldCallExpression) expr).getArgument();
      } else {
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `patternIndex`
in `base/src/main/java/org/arend/typechecking/termination/CollectCallVisitor.java`
#### Snippet
```java
        argIndex = argIndex.getNext();
      }
      patternIndex = patternIndex.getNext();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `arguments`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
      List<Concrete.Argument> newArgs = new ArrayList<>(((Concrete.AppExpression) function).getArguments());
      newArgs.addAll(arguments);
      arguments = newArgs;
    } else if (function instanceof Concrete.ReferenceExpression) {
      refExpr = (Concrete.ReferenceExpression) function;
```

### AssignmentToMethodParameter
Assignment to method parameter `arg`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java

  private void convertArgument(Concrete.Expression arg) {
    for (; arg instanceof Concrete.AppExpression; arg = ((Concrete.AppExpression) arg).getArguments().get(0).expression) {
      convertExpr((Concrete.ReferenceExpression) ((Concrete.AppExpression) arg).getFunction());
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `referable`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java

  public static Referable tryResolve(Referable referable, Scope scope, List<Referable> resolvedRefs) {
    referable = RedirectingReferable.getOriginalReferable(referable);
    if (referable instanceof UnresolvedReference) {
      referable = RedirectingReferable.getOriginalReferable(((UnresolvedReference) referable).tryResolve(scope, resolvedRefs));
```

### AssignmentToMethodParameter
Assignment to method parameter `referable`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
    referable = RedirectingReferable.getOriginalReferable(referable);
    if (referable instanceof UnresolvedReference) {
      referable = RedirectingReferable.getOriginalReferable(((UnresolvedReference) referable).tryResolve(scope, resolvedRefs));
    }
    return referable;
```

### AssignmentToMethodParameter
Assignment to method parameter `ref`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
  public static MetaResolver getMetaResolver(Referable ref) {
    while (ref instanceof RedirectingReferable) {
      ref = ((RedirectingReferable) ref).getOriginalReferable();
    }
    return ref instanceof MetaReferable ? ((MetaReferable) ref).getResolver() : null;
```

### AssignmentToMethodParameter
Assignment to method parameter `referable`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java

  public static Referable resolve(Referable referable, Scope scope, boolean withArg, List<Referable> resolvedRefs, @Nullable Referable.RefKind kind) {
    referable = RedirectingReferable.getOriginalReferable(referable);
    if (referable instanceof UnresolvedReference) {
      if (withArg) {
```

### AssignmentToMethodParameter
Assignment to method parameter `referable`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
        ((UnresolvedReference) referable).resolveArgument(scope, resolvedRefs);
      }
      referable = RedirectingReferable.getOriginalReferable(((UnresolvedReference) referable).resolve(scope, withArg ? null : resolvedRefs, kind));
    }
    return referable;
```

### AssignmentToMethodParameter
Assignment to method parameter `function`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
  private Concrete.Expression visitArguments(Concrete.Expression function, List<Concrete.Argument> arguments) {
    for (Concrete.Argument argument : arguments) {
      function = Concrete.AppExpression.make(function.getData(), function, argument.expression.accept(this, null), argument.isExplicit());
    }
    return function;
```

### AssignmentToMethodParameter
Assignment to method parameter `origExpr1`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
  @Override
  public boolean addEquation(Expression origExpr1, Expression origExpr2, Expression type, CMP cmp, Concrete.SourceNode sourceNode, InferenceVariable stuckVar1, InferenceVariable stuckVar2, boolean normalize) {
    origExpr1 = origExpr1.accept(new UnfoldVisitor(Collections.emptySet(), null, false, UnfoldVisitor.UnfoldFields.ONLY_PARAMETERS), null);
    origExpr2 = origExpr2.accept(new UnfoldVisitor(Collections.emptySet(), null, false, UnfoldVisitor.UnfoldFields.ONLY_PARAMETERS), null);
    Expression expr1 = normalize ? origExpr1.normalize(NormalizationMode.WHNF) : origExpr1;
```

### AssignmentToMethodParameter
Assignment to method parameter `origExpr2`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
  public boolean addEquation(Expression origExpr1, Expression origExpr2, Expression type, CMP cmp, Concrete.SourceNode sourceNode, InferenceVariable stuckVar1, InferenceVariable stuckVar2, boolean normalize) {
    origExpr1 = origExpr1.accept(new UnfoldVisitor(Collections.emptySet(), null, false, UnfoldVisitor.UnfoldFields.ONLY_PARAMETERS), null);
    origExpr2 = origExpr2.accept(new UnfoldVisitor(Collections.emptySet(), null, false, UnfoldVisitor.UnfoldFields.ONLY_PARAMETERS), null);
    Expression expr1 = normalize ? origExpr1.normalize(NormalizationMode.WHNF) : origExpr1;
    Expression expr2 = normalize ? origExpr2.normalize(NormalizationMode.WHNF) : origExpr2;
```

### AssignmentToMethodParameter
Assignment to method parameter `origExpr1`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      Pair<Expression, ExprSubstitution> pair = reverseSubstitution(expr1);
      if (pair != null) {
        origExpr1 = expr1 = pair.proj1;
        SubstVisitor substVisitor = new SubstVisitor(pair.proj2, LevelSubstitution.EMPTY, false);
        expr2 = expr2.accept(substVisitor, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `origExpr2`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        SubstVisitor substVisitor = new SubstVisitor(pair.proj2, LevelSubstitution.EMPTY, false);
        expr2 = expr2.accept(substVisitor, null);
        origExpr2 = normalize ? origExpr2.accept(substVisitor, null) : expr2;
      }
    } else if (expr2 instanceof SubstExpression && !(expr1 instanceof SubstExpression)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `origExpr2`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      Pair<Expression, ExprSubstitution> pair = reverseSubstitution(expr2);
      if (pair != null) {
        origExpr2 = expr2 = pair.proj1;
        SubstVisitor substVisitor = new SubstVisitor(pair.proj2, LevelSubstitution.EMPTY, false);
        expr1 = expr1.accept(substVisitor, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `origExpr1`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        SubstVisitor substVisitor = new SubstVisitor(pair.proj2, LevelSubstitution.EMPTY, false);
        expr1 = expr1.accept(substVisitor, null);
        origExpr1 = normalize ? origExpr1.accept(substVisitor, null) : expr1;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `cmp`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java

      if (inf1 != null) {
        cmp = cmp.not();
      }

```

### AssignmentToMethodParameter
Assignment to method parameter `cmp`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      // cType /= Pi, cType /= Type, cType /= Class, cType /= stuck on ?X
      if (!(cType instanceof PiExpression) && !(cType instanceof UniverseExpression) && (!(cType instanceof ClassCallExpression) || cmp == CMP.GE && ((ClassCallExpression) cType).getNumberOfNotImplementedFields() == 0) && cType.getStuckInferenceVariable() == null) {
        cmp = CMP.EQ;
      }

```

### AssignmentToMethodParameter
Assignment to method parameter `cmp`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
          return true;
        } else {
          cmp = CMP.EQ;
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `cmp`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        }
        if (!(cod instanceof ClassCallExpression) && !(cod instanceof UniverseExpression) && cod.getStuckInferenceVariable() == null) {
          cmp = CMP.EQ;
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        }
      }
      expr = ((SubstExpression) expr).getExpression();
      totalSubst.addSubst(reversedSubst);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `solved`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
          solve(pair.proj1, pair.proj2.get(0), true);
        }
        solved = true;
        continue;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `allOK`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      ClassDefinition classDef = checkClasses(pair.proj1, pair.proj2, cmp);
      if (classDef == null) {
        allOK = false;
        continue;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `allOK`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        if (!pair.proj2.get(0).getLevels().compare(levels, CMP.LE, this, pair.proj1.getSourceNode())) {
          reportBoundsError(pair.proj1, pair.proj2, CMP.GE);
          allOK = false;
          continue;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `allOK`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
          if (!new CompareVisitor(this, CMP.LE, pair.proj1.getSourceNode()).compareClassCallLevels(lowerBound, solution)) {
            reportBoundsError(pair.proj1, pair.proj2, CMP.GE);
            allOK = false;
            continue loop;
          }
```

### AssignmentToMethodParameter
Assignment to method parameter `allOK`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
            if (!ok) {
              reportBoundsError(pair.proj1, pair.proj2, CMP.LE);
              allOK = false;
              continue loop;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `allOK`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
            if (other == null || !CompareVisitor.compare(this, CMP.EQ, entry.getValue(), other, solution.getDefinition().getFieldType(entry.getKey(), solution.getLevels(entry.getKey().getParentClass()), thisExpr), pair.proj1.getSourceNode())) {
              reportBoundsError(pair.proj1, pair.proj2, CMP.LE);
              allOK = false;
              continue loop;
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `solved`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java

      solve(pair.proj1, solution, true);
      solved = true;
    }
    return allOK && solved;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
    }

    expr = expr.normalize(NormalizationMode.WHNF);
    if (!(pattern instanceof ConstructorExpressionPattern)) {
      if (expr instanceof TupleExpression) {
```

### AssignmentToMethodParameter
Assignment to method parameter `defCallResult`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    }

    defCallResult = result instanceof DefCallResult ? (DefCallResult) result : null;
    if (definition == Prelude.ARRAY_CONS && defCallResult != null && defCallResult.getArguments().isEmpty() && index2 < arguments.size()) {
      InferenceVariable var = null;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java

    if (expectedParamsNumber != actualParams.size()) {
      result = fixImplicitArgs(result, actualParams.subList(0, actualParams.size() - expectedParamsNumber), expr, expectedType == null || expectedType instanceof Type && ((Type) expectedType).isOmega(), null);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      }

      expectedType = piParam.hasNext() ? new PiExpression(piExpr.getResultSort(), piParam, piExpr.getCodomain()) : piExpr.getCodomain();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      }
      PiExpression pi = (PiExpression) type;
      type = pi.getCodomain();
      SingleDependentLink param = pi.getParameters();
      loop:
```

### AssignmentToMethodParameter
Assignment to method parameter `i`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      SingleDependentLink param = pi.getParameters();
      loop:
      for (; param.hasNext() && i < arguments.size(); param = param.getNext(), i++) {
        while (param.isExplicit() != arguments.get(i).isExplicit()) {
          param = param.getNext();
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    loop:
    while (true) {
      type = type.normalize(NormalizationMode.WHNF);
      if (!(type instanceof PiExpression)) {
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      PiExpression pi = (PiExpression) type;
      piTypes.add(pi);
      type = pi.getCodomain();
      SingleDependentLink link = pi.getParameters();
      for (; i < arguments.size() && link.hasNext(); link = link.getNext()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          ok = link.isExplicit();
        } else {
          type = type.normalize(NormalizationMode.WHNF);
          if (type instanceof PiExpression) {
            ok = ((PiExpression) type).getParameters().isExplicit();
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        if (defCallResult.getArguments().isEmpty()) {
          Expression binding = InferenceReferenceExpression.make(new FunctionInferenceVariable(Prelude.PATH_CON, Prelude.PATH_CON.getDataTypeParameters(), 1, new UniverseExpression(sort0), fun, myVisitor.getAllBindings()), myVisitor.getEquations());
          result = result.applyExpression(new LamExpression(sort, lamParam, binding), true, myVisitor, fun);
          argResult = myVisitor.checkArgument(arg, new PiExpression(sort, lamParam, binding), result, null);
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      }

      result = fixImplicitArgs(result, result.getImplicitParameters(), fun, false, null);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      TResult coercedResult = CheckTypeVisitor.coerceFromType((TypecheckingResult) result);
      if (coercedResult != null) {
        result = coercedResult;
        if (isExplicit) {
          result = fixImplicitArgs(result, result.getImplicitParameters(), fun, false, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        result = coercedResult;
        if (isExplicit) {
          result = fixImplicitArgs(result, result.getImplicitParameters(), fun, false, null);
        }
        param = result.getParameter();
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      if (!param.hasNext()) {
        TypecheckingResult tcResult = ((TypecheckingResult) result).normalizeType();
        result = tcResult;
        if (tcResult.type instanceof DataCallExpression && ((DataCallExpression) tcResult.type).getDefinition() == Prelude.PATH) {
          List<Expression> args = ((DataCallExpression) tcResult.type).getDefCallArguments();
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        if (tcResult.type instanceof DataCallExpression && ((DataCallExpression) tcResult.type).getDefinition() == Prelude.PATH) {
          List<Expression> args = ((DataCallExpression) tcResult.type).getDefCallArguments();
          result = DefCallResult.makeTResult(new Concrete.ReferenceExpression(fun.getData(), Prelude.AT.getRef()), Prelude.AT, ((DataCallExpression) tcResult.type).getLevels())
            .applyExpression(args.get(0), false, myVisitor, fun)
            .applyExpression(args.get(1), false, myVisitor, fun)
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          coercedResult = CoerceData.coerceToKey(tcResult, new CoerceData.PiKey(), fun, myVisitor);
          if (coercedResult != null) {
            result = coercedResult;
            if (isExplicit) {
              result = fixImplicitArgs(result, result.getImplicitParameters(), fun, false, null);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
            result = coercedResult;
            if (isExplicit) {
              result = fixImplicitArgs(result, result.getImplicitParameters(), fun, false, null);
            }
            param = result.getParameter();
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
                instance = instanceResult.expression;
              }
              result = result.applyExpression(instance, defCallResult.getParameter().isExplicit(), myVisitor, expr);
              substitution.add(parameter, instance);
              i++;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        argument = InferenceReferenceExpression.make(infVar, myVisitor.getEquations());
      }
      result = result.applyExpression(argument, parameter.isExplicit(), myVisitor, expr);
      substitution.add(parameter, argument);
      i++;
```

### AssignmentToMethodParameter
Assignment to method parameter `elementsType`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    if (elementsType == null) return null;
    if (elementsType instanceof LamExpression) {
      elementsType = ((LamExpression) elementsType).getBody().normalize(NormalizationMode.WHNF);
      if (elementsType instanceof AppExpression && ((AppExpression) elementsType).isExplicit()) {
        elementsType = elementsType.getFunction().normalize(NormalizationMode.WHNF);
```

### AssignmentToMethodParameter
Assignment to method parameter `elementsType`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      elementsType = ((LamExpression) elementsType).getBody().normalize(NormalizationMode.WHNF);
      if (elementsType instanceof AppExpression && ((AppExpression) elementsType).isExplicit()) {
        elementsType = elementsType.getFunction().normalize(NormalizationMode.WHNF);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
      DefCallExpression defCall = type.cast(DefCallExpression.class);
      if (defCall != null) {
        level = defCall.getUseLevel();
      } else {
        defCall = type.getPiParameters(null, false).cast(DefCallExpression.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `level`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
        defCall = type.getPiParameters(null, false).cast(DefCallExpression.class);
        if (defCall != null) {
          level = defCall.getUseLevel();
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
      args.add(new ReferenceExpression(params.get(i)));
      args.add(new ReferenceExpression(params.get(i + 1)));
      type = FunCallExpression.make(Prelude.PATH_INFIX, LevelPair.PROP, args);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
          throw new CoreException(CoreErrorWrapper.make(new TypecheckingError("", mySourceNode), errorExpr));
        }
        link = link.getNext();
      } else if (pattern instanceof ConstructorPattern) {
        link = checkStitchedPatterns(pattern.getSubPatterns(), link, errorExpr);
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
        link = link.getNext();
      } else if (pattern instanceof ConstructorPattern) {
        link = checkStitchedPatterns(pattern.getSubPatterns(), link, errorExpr);
      } else {
        throw new IllegalStateException();
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
      arg.accept(this, parameters.getTypeExpr().subst(substitution, levelSubst));
      substitution.add(parameters, arg);
      parameters = parameters.getNext();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java

  void addDependentLink(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      addBinding(link, null);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
        substitution.add(parameters, expression);
      }
      parameters = parameters.getNext();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
  Sort checkDependentLinkWithResult(DependentLink link, Expression type, Expression expr) {
    Sort result = Sort.PROP;
    for (; link.hasNext(); link = link.getNext()) {
      addBinding(link, expr);
      if (link instanceof TypedDependentLink) {
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java

  void freeDependentLink(DependentLink link) {
    for (; link.hasNext(); link = link.getNext()) {
      if (myContext != null) myContext.remove(link);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
  Sort checkDependentLink(DependentLink link, Expression expr) {
    Sort result = Sort.PROP;
    for (; link.hasNext(); link = link.getNext()) {
      addBinding(link, expr);
      if (link instanceof TypedDependentLink) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
          substitution.add(link, arg);
        } else {
          expectedType = link.getTypeExpr().subst(substitution, levelSubst);
        }
        link = link.getNext();
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java

  void checkDependentLink(DependentLink link, Expression type, Expression expr) {
    for (; link.hasNext(); link = link.getNext()) {
      addBinding(link, expr);
      if (link instanceof TypedDependentLink) {
```

### AssignmentToMethodParameter
Assignment to method parameter `elimBody`
in `base/src/main/java/org/arend/typechecking/patternmatching/ConditionsChecking.java`
#### Snippet
```java
      Body body = ((Function) definition).getBody();
      if (body instanceof ElimBody) {
        elimBody = (ElimBody) body;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `actualLevel`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
      Sort pathSort = pathType.getSortOfType();
      if (pathSort != null && !pathSort.getHLevel().isInfinity()) {
        actualLevel = pathSort.getHLevel();
        if (!actualLevel.isInfinity() && actualLevel.isClosed() && actualLevel.getConstant() - actualLevelSub < -1) {
          actualLevelSub = actualLevel.getConstant() + 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `clauses`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
              if (definition == Prelude.LEFT || definition == Prelude.RIGHT) {
                final int finalIndex = index;
                clauses = clauses.stream().filter(clauseData1 -> clauseData1.getPatterns().get(finalIndex) instanceof BindingPattern).collect(Collectors.toList());
                continue loop;
              }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  private Expression addAts(Expression expression, DependentLink param, Expression type) {
    while (type instanceof DataCallExpression && ((DataCallExpression) type).getDefinition() == Prelude.PATH) {
      expression = AtExpression.make(expression, new ReferenceExpression(param), false);
      type = ((LamExpression) ((DataCallExpression) type).getDefCallArguments().get(0)).getBody();
      param = param.getNext();
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
    while (type instanceof DataCallExpression && ((DataCallExpression) type).getDefinition() == Prelude.PATH) {
      expression = AtExpression.make(expression, new ReferenceExpression(param), false);
      type = ((LamExpression) ((DataCallExpression) type).getDefCallArguments().get(0)).getBody();
      param = param.getNext();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `param`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      expression = AtExpression.make(expression, new ReferenceExpression(param), false);
      type = ((LamExpression) ((DataCallExpression) type).getDefCallArguments().get(0)).getBody();
      param = param.getNext();
    }
    return expression;
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

  private Expression normalizePathExpression(Expression type, Constructor constructor, Concrete.SourceNode sourceNode) {
    type = type.normalize(NormalizationMode.WHNF);
    if (type instanceof DataCallExpression && ((DataCallExpression) type).getDefinition() == Prelude.PATH) {
      List<Expression> pathArgs = ((DataCallExpression) type).getDefCallArguments();
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        }
      } else {
        type = null;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      return 1;
    }
    expr1 = expr1.normalize(NormalizationMode.WHNF);

    while (expr2 instanceof LamExpression) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr2`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

    while (expr2 instanceof LamExpression) {
      expr2 = ((LamExpression) expr2).getBody();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `expr1`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

    while (expr1 instanceof FieldCallExpression && !(expr2 instanceof FieldCallExpression && ((FieldCallExpression) expr2).getDefinition() == ((FieldCallExpression) expr1).getDefinition())) {
      expr1 = ((FieldCallExpression) expr1).getArgument();
    }
    return Expression.compare(expr1, expr2, type, CMP.EQ) ? 0 : 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `oldParameters`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
            if (oldParameters.hasNext()) {
              typechecker.addBinding(referableList.get(i), oldParameters);
              oldParameters = oldParameters.getNext();
            } else {
              oldParametersOK = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `oldParameters`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
          if (oldParameters.hasNext()) {
            typechecker.addBinding(parameter instanceof Concrete.NameParameter ? ((Concrete.NameParameter) parameter).getReferable() : null, oldParameters);
            oldParameters = oldParameters.getNext();
          } else {
            oldParametersOK = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
    }

    expectedType = expectedType.copy();
    Type type = typecheckType(asPattern.type, expectedType);
    if (asPattern.referable != null) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        }
      }
      expectedType = expectedType.subst(substitution);

      GlobalInstancePool globalInstancePool = myVisitor.getInstancePool();
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  private int getIntervalBindings(List<? extends ExpressionPattern> patterns, int index, List<Binding> result) {
    for (ExpressionPattern pattern : patterns) {
      index = getIntervalBindings(pattern.getSubPatterns(), index, result);
      if (pattern == myPathPatterns.get(index).proj1) {
        List<? extends ExpressionPattern> subPatterns = pattern.getSubPatterns();
```

### AssignmentToMethodParameter
Assignment to method parameter `index`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          result.add(((BindingPattern) subPatterns.get(subPatterns.size() - 1 - i)).getBinding());
        }
        if (++index >= myPathPatterns.size()) {
          break;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            }
            addBinding(null, newParam);
            parameters = parameters.getNext();
            if (!parameters.hasNext()) {
              if (k == patterns.size()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        }
        addBinding(referable, newParam);
        parameters = parameters.getNext();
        continue;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          }

          parameters = parameters.getNext();
          continue;
        } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          }

          parameters = parameters.getNext();
          continue;
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        exprs = null;
        typecheckAsPattern(pattern.getAsReferable(), null, null);
        parameters = parameters.getNext();
        continue;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        paramsSubst.add(parameters, newConCall);
      }
      parameters = parameters.getNext();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          exprs.add(new ReferenceExpression(newParam));
        }
        parameters = parameters.getNext();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `parameters`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
      int size = DependentLink.Helper.size(parameters);
      if (ok) {
        for (; parameters.hasNext() && addedIntervalVars < addIntervalVars; parameters = parameters.getNext()) {
          Expression paramType = parameters.getTypeExpr().normalize(NormalizationMode.WHNF);
          if (paramType instanceof DataCallExpression && ((DataCallExpression) paramType).getDefinition() == Prelude.INTERVAL) {
```

### AssignmentToMethodParameter
Assignment to method parameter `patterns`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        patterns1.add(index < 0 || index >= patterns.size() ? (i < params.size() ? new Concrete.NamePattern(params.get(i).proj1, true, params.get(i).proj2, null) : null) : patterns.get(index));
      }
      patterns = patterns1;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      }

      expectedType = expectedType.normalize(NormalizationMode.WHNF);
      Expression type = expectedType;
      ClassCallExpression classCall = expectedType.cast(ClassCallExpression.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  private TypecheckingResult tResultToResult(Expression expectedType, TResult result, Concrete.Expression expr) {
    if (result != null) {
      result = myArgsInference.inferTail(result, expectedType, expr);
    }
    return result == null ? null : checkResult(expectedType, result.toResult(this), expr);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  static void setCaseLevel(Concrete.Expression expr, int level, boolean setSCase) {
    while (expr instanceof Concrete.LamExpression) {
      expr = ((Concrete.LamExpression) expr).getBody();
    }
    if (expr instanceof Concrete.CaseExpression caseExpr) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    boolean isOmega = expectedType instanceof Type && ((Type) expectedType).isOmega();
    if (!isOmega) {
      expectedType = expectedType.normalize(NormalizationMode.WHNF);
      if (expectedType.getStuckInferenceVariable() != null) {
        expectedType1 = Type.OMEGA;
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

    result.type = result.type.normalize(NormalizationMode.WHNF);
    expectedType = expectedType.normalize(NormalizationMode.WHNF);

    if (result.expression instanceof FunCallExpression idp && ((FunCallExpression) result.expression).getDefinition() == Prelude.IDP) {
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (baseClassExpr instanceof Concrete.ClassExtExpression classExt) {
      classExt.getStatements().addAll(expr.getStatements());
      expr = classExt;
      baseClassExpr = classExt.getBaseClassExpression();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      List<SingleDependentLink> params = expectedType == null ? null : new ArrayList<>();
      if (expectedType != null) {
        expectedType = expectedType.normalizePi(params);
      }
      Concrete.Expression dExpr = desugarClassApp(refExpr, expr.getArguments(), expr, params, inferTailImplicits, Collections.emptySet());
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

      if (expression instanceof AbstractedDependentLinkType abs) {
        expression = AbstractedDependentLinkType.make(DependentLink.Helper.get(abs.getParameters(), drop), abs.getSize() - drop);
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      AbstractedExpressionImpl abs = (AbstractedExpressionImpl) expression;
      if (j < bindings.size()) {
        expression = AbstractedExpressionImpl.make(bindings.subList(j, bindings.size()), abs.getExpression());
        break;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        break;
      }
      expression = abs.getExpression();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `exprResult`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      TypecheckingResult coercedResult = CoerceData.coerceToKey(exprResult, new CoerceData.SigmaKey(), expr, this);
      if (coercedResult != null) {
        exprResult = coercedResult;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      List<SingleDependentLink> parameters = expectedType == null ? null : new ArrayList<>();
      if (expectedType != null) {
        expectedType = expectedType.normalizePi(parameters);
      }
      Concrete.Expression dExpr = desugarClassApp(expr, Collections.emptyList(), expr, parameters, inferTailImplicits, Collections.emptySet());
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

    if (Prelude.ZERO != null && expr.getReferent() == Prelude.ZERO.getRef() && expectedType != null) {
      expectedType = expectedType.normalize(NormalizationMode.WHNF);
      if (expectedType instanceof DataCallExpression && ((DataCallExpression) expectedType).getDefinition() == Prelude.FIN) {
        return checkResult(expectedType, new TypecheckingResult(new SmallIntegerExpression(0), DataCallExpression.make(Prelude.FIN, Levels.EMPTY, new SingletonList<>(new SmallIntegerExpression(1)))), expr);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    }

    expr = expr.accept(new SubstVisitor(new ExprSubstitution(), LevelSubstitution.EMPTY) {
      @Override
      public boolean isEmpty() {
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    }

    type = type.normalize(NormalizationMode.WHNF);
    SigmaExpression sigma = type.cast(SigmaExpression.class);
    ClassCallExpression classCall = type.cast(ClassCallExpression.class);
```

### AssignmentToMethodParameter
Assignment to method parameter `implBody`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

    if (addImplicitLambdas) {
      implBody = addImplicitLamParams(implBody, type);
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `binding`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      } else {
        if (binding == null) {
          binding = myClassCallBindings.get(myClassCallBindings.size() - 1 - skipLastClassCallBindings);
        }
        tResult = new TypecheckingResult(new ReferenceExpression(binding), binding.getTypeExpr());
```

### AssignmentToMethodParameter
Assignment to method parameter `expectedType`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      Expression ty;
      if (expectedType != null) {
        expectedType = expectedType.normalize(NormalizationMode.WHNF);
      }
      if (expectedType instanceof DataCallExpression && ((DataCallExpression) expectedType).getDefinition() == Prelude.FIN) {
```

### AssignmentToMethodParameter
Assignment to method parameter `arguments`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (def != null && def.getParameters().hasNext()) {
      ExprSubstitution substitution = new ExprSubstitution();
      arguments = new ArrayList<>(arguments);
      int i = 0;
      List<? extends Boolean> typedParameters = def.getTypedParameters();
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (ok) {
      List<DependentLink> parameters = new ArrayList<>();
      for (; link.hasNext(); link = link.getNext()) {
        parameters.add(link);
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      Expression resultType = type == null ? null : type.getPiParameters(parameters, false);
      for (int i = 0; i < parameters.size(); i++) {
        link = parameters.get(i);
        if (link instanceof TypedDependentLink) {
          if (!CompareVisitor.compare(equations, CMP.EQ, link.getTypeExpr(), expr, Type.OMEGA, sourceNode)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `link`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          break;
        }
        link = parameters.get(i);
        if (!CompareVisitor.compare(equations, CMP.EQ, link.getTypeExpr(), expr, Type.OMEGA, sourceNode)) {
          ok = false;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

        pathArgs.add(new ReferenceExpression(link));
        expr = FunCallExpression.make(Prelude.PATH_INFIX, LevelPair.STD, pathArgs);
        level++;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `type`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

    if (!ok || level < -1) {
      type = type == null ? null : type.normalize(NormalizationMode.WHNF);
      if (!(type instanceof ErrorExpression && ((ErrorExpression) type).isGoal())) {
        errorReporter.report(new TypecheckingError("\\level has wrong format", sourceNode));
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/core/level/LevelSubstitution.java`
#### Snippet
```java
    @Override
    public CoreLevel get(Variable variable) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/core/body/CorePattern.java`
#### Snippet
```java
  default String getBindingName() {
    CoreBinding binding = getBinding();
    if (binding == null) return null;
    String name = binding.getName();
    return name == null ? "_x" : name;
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/error/NameResolverError.java`
#### Snippet
```java
  @Override
  public ConcreteSourceNode getCauseSourceNode() {
    return cause instanceof ConcreteSourceNode ? (ConcreteSourceNode) cause : null;
  }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/error/SourceInfo.java`
#### Snippet
```java
    while (true) {
      if (data instanceof SourceInfo) return (SourceInfo) data;
      if (!(data instanceof DataContainer)) return null;
      data = ((DataContainer) data).getData();
    }
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/error/GeneralError.java`
#### Snippet
```java

    ConcreteSourceNode sourceNode = getCauseSourceNode();
    return sourceNode != null ? sourceNode.prettyPrint(ppConfig) : null;
  }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/error/GeneralError.java`
#### Snippet
```java

  public ConcreteSourceNode getCauseSourceNode() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/error/GeneralError.java`
#### Snippet
```java
  public Object getCause() {
    ConcreteSourceNode sourceNode = getCauseSourceNode();
    return sourceNode != null ? sourceNode.getData() : null;
  }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/module/LongName.java`
#### Snippet
```java
  }
  public String getLastName() {
    return path.isEmpty() ? null : path.get(path.size() - 1);
  }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/module/LongName.java`
#### Snippet
```java

  public String getFirstName() {
    return path.isEmpty() ? null : path.get(0);
  }
  public String getLastName() {
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/typechecking/ContextData.java`
#### Snippet
```java
  default ConcreteReferenceExpression getReferenceExpression() {
    ConcreteExpression marker = getMarker();
    return marker instanceof ConcreteReferenceExpression ? (ConcreteReferenceExpression) marker : null;
  }

```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/prettyprinting/doc/TermDoc.java`
#### Snippet
```java
  protected LineDoc getLineDoc(@Nullable String indent, String text, boolean isFirst) {
    if (isFirst && text.isEmpty()) {
      return null;
    }
    TermTextDoc termDoc = new TermTextDoc(text, term, isFirst);
```

### ReturnNull
Return of `null`
in `api/src/main/java/org/arend/ext/typechecking/ListDefinitionListener.java`
#### Snippet
```java
      if (listener != null) result.add(listener);
    }
    return result.isEmpty() ? null : result.size() == 1 ? result.get(0) : new ListDefinitionListener(result);
  }
}
```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/ui/CliSession.java`
#### Snippet
```java
    } catch (IOException e) {
      callback.accept(false);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/FileLibraryResolver.java`
#### Snippet
```java
          config.setName(fileName.toString());
        } else {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/FileLibraryResolver.java`
#### Snippet
```java
    } catch (IOException e) {
      myErrorReporter.report(new LibraryIOError(headerFile.toString(), "Failed to read header file", e.getLocalizedMessage()));
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/FileLibraryResolver.java`
#### Snippet
```java
      library = Files.exists(yaml) ? getLibrary(yaml) : null;
    }
    return library != null && library.getName().equals(libName) ? library : null;
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/FileLibraryResolver.java`
#### Snippet
```java

    if (library == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/FileLibraryResolver.java`
#### Snippet
```java
        libraries.add(library.getName() + " (" + library.getFullName() + ")");
        myErrorReporter.report(new MultipleLibraries(library.getName(), libraries));
        return null;
      } else {
        return prevLibrary;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/SmallIntegerExpression.java`
#### Snippet
```java
  @Override
  public IntegerExpression pred() {
    return myInteger > 0 ? new SmallIntegerExpression(myInteger - 1) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/PEvalExpression.java`
#### Snippet
```java
      return ((FunCallExpression) myExpression).getDefinition().getActualBody();
    } else {
      return myExpression instanceof CaseExpression ? ((CaseExpression) myExpression).getElimBody() : null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/SubstExpression.java`
#### Snippet
```java
  @Override
  public <T extends Expression> T cast(Class<T> clazz) {
    return clazz.isInstance(this) ? clazz.cast(this) : isInferenceVariable() ? null : getSubstExpression().cast(clazz);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/TypeDestructorExpression.java`
#### Snippet
```java

  public static Expression match(FunCallExpression funCall, Expression argument) {
    if (funCall.getDefinition().getKind() != CoreFunctionDefinition.Kind.TYPE) return null;
    if (funCall.getDefinition().getActualBody() instanceof Expression) {
      return make(funCall.getDefinition(), argument);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/TypeDestructorExpression.java`
#### Snippet
```java
      return make(funCall.getDefinition(), argument);
    }
    if (!(funCall.getDefinition().getActualBody() instanceof ElimBody)) return null;

    List<? extends ElimClause<Pattern>> clauses = ((ElimBody) funCall.getDefinition().getActualBody()).getClauses();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/TypeDestructorExpression.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/PiExpression.java`
#### Snippet
```java
        for (SingleDependentLink link = piCod.getParameters(); link.hasNext(); link = link.getNext()) {
          if (link.isExplicit()) {
            return null;
          }
          if (params != null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/InferenceReferenceExpression.java`
#### Snippet
```java
  @Override
  public InferenceVariable getVariable() {
    return mySubstExpression == null ? myVar : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/InferenceReferenceExpression.java`
#### Snippet
```java
  @Override
  public <T extends Expression> T cast(Class<T> clazz) {
    return clazz.isInstance(this) ? clazz.cast(this) : mySubstExpression != null ? mySubstExpression.cast(clazz) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/InferenceReferenceExpression.java`
#### Snippet
```java
      return new NewExpression(null, (ClassCallExpression) type);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/DefCallExpression.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
    CommandLine cmdLine = parseArgs(args);
    if (cmdLine == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
          break;
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java

    if (!myLibraryManager.loadLibrary(new PreludeResourceLibrary(), null)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      if (cmdLine.hasOption("h")) {
        new HelpFormatter().printHelp("arend [FILES]", cmdOptions);
        return null;
      }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      if (cmdLine.hasOption("v")) {
        System.out.println("Arend " + Prelude.VERSION);
        return null;
      }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/BaseCliFrontend.java`
#### Snippet
```java
      myExitWithError = true;
      System.err.println(e.getMessage());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/ErrorExpression.java`
#### Snippet
```java
  @Override
  public <T extends Expression> T cast(Class<T> clazz) {
    return clazz.isInstance(this) ? clazz.cast(this) : myUseExpression ? myExpression.cast(clazz) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/BigIntegerExpression.java`
#### Snippet
```java
  @Override
  public IntegerExpression pred() {
    return myInteger.compareTo(BigInteger.ZERO) > 0 ? new BigIntegerExpression(myInteger.subtract(BigInteger.ONE)) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java

  public static Expression match(FunCallExpression funCall, Expression argument) {
    if (funCall.getDefinition().getKind() != CoreFunctionDefinition.Kind.TYPE) return null;
    if (funCall.getDefinition().getActualBody() instanceof Expression) {
      return make(funCall.getDefinition(), funCall.getLevels(), -1, new ArrayList<>(funCall.getDefCallArguments()), argument);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java
      return make(funCall.getDefinition(), funCall.getLevels(), -1, new ArrayList<>(funCall.getDefCallArguments()), argument);
    }
    if (!(funCall.getDefinition().getActualBody() instanceof ElimBody)) return null;

    List<? extends ElimClause<Pattern>> clauses = ((ElimBody) funCall.getDefinition().getActualBody()).getClauses();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/TypeConstructorExpression.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java
            param = param.getNext();
          }
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/ClassCallExpression.java`
#### Snippet
```java
            }
          }
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  public Variable findBinding(Set<? extends Variable> bindings) {
    FindBindingVisitor visitor = new FindBindingVisitor(bindings);
    return accept(visitor, null) ? visitor.getResult() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  public Sort getSortOfType() {
    Expression type = getType();
    return type == null ? null : type.toSort();
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java

  public Expression pred() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java

  public <T extends Expression> T cast(Class<T> clazz) {
    return clazz.isInstance(this) ? clazz.cast(this) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  public Sort toSort() {
    UniverseExpression universe = normalize(NormalizationMode.WHNF).cast(UniverseExpression.class);
    return universe == null ? null : universe.getSort();
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
      expr = expr.cast(InferenceReferenceExpression.class);
      if (expr == null) {
        return null;
      }
      InferenceVariable var = ((InferenceReferenceExpression) expr).getVariable();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
      expr = ((InferenceReferenceExpression) expr).getSubstExpression();
      if (expr == null) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  public InferenceVariable getStuckInferenceVariable() {
    Expression stuck = getStuckExpression();
    return stuck instanceof InferenceReferenceExpression && ((InferenceReferenceExpression) stuck).getVariable() != null ? ((InferenceReferenceExpression) stuck).getVariable() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  public Expression applyExpression(Expression expression, boolean normalizing) {
    Expression normExpr = (normalizing ? normalize(NormalizationMode.WHNF) : this).getUnderlyingExpression();
    return normExpr instanceof ErrorExpression ? normExpr : normExpr instanceof PiExpression ? normExpr.applyExpression(expression, normalizing) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/Expression.java`
#### Snippet
```java
  @Override
  public Expression getStuckExpression(List<? extends Expression> arguments, Expression expression) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/let/NameLetClausePattern.java`
#### Snippet
```java
  @Override
  public List<? extends LetClausePattern> getPatterns() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/let/TupleLetClausePattern.java`
#### Snippet
```java
  @Override
  public List<? extends ClassField> getFields() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/let/TupleLetClausePattern.java`
#### Snippet
```java
  @Override
  public String getName() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/ConCallExpression.java`
#### Snippet
```java
  @Override
  public Expression pred() {
    return getDefinition() == Prelude.SUC ? myArguments.get(0) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/DataCallExpression.java`
#### Snippet
```java
    for (Constructor constructor : definition.getConstructors()) {
      if (!getMatchedConCall(constructor, result)) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
    while (true) {
      List<Expression> dataTypeArgs = visitDataTypeArguments(expr.getDataTypeArguments(), params);
      if (dataTypeArgs == null) return null;
      List<Expression> args = new ArrayList<>();
      ConCallExpression result = makeConCall(expr.getDefinition(), expr.getLevels(), dataTypeArgs, args);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
        Expression newArg = visit(expr.getDefCallArguments().get(i), params);
        if (newArg == null) {
          return null;
        }
        args.add(newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
        Expression newArg = visit(rec, params);
        if (newArg == null) {
          return null;
        }
        args.add(newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
        Expression newArg = visit(expr.getDefCallArguments().get(j), params);
        if (newArg == null) {
          return null;
        }
        result.getDefCallArguments().add(newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java

  protected Expression preVisitConCall(ConCallExpression expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
      Expression newArg = visitDataTypeArgument(arg, params);
      if (newArg == null) {
        return null;
      }
      dataTypeArgs.add(newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
        it = visit(it, params);
        if (it == null) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java

      List<Expression> dataTypeArgs = visitDataTypeArguments(conCall.getDataTypeArguments(), params);
      if (dataTypeArgs == null) return null;
      it = makeConCall(conCall.getDefinition(), conCall.getLevels(), dataTypeArgs, new ArrayList<>());
      if (prevConCall != null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
          Expression newArg = visit(arg, params);
          if (newArg == null) {
            return null;
          }
          prevConCall.getDefCallArguments().add(newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
          Expression newArg = visit(conCall.getDefCallArguments().get(i), params);
          if (newArg == null) {
            return null;
          }
          prevConCall.getDefCallArguments().add(newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java
      if (useStack((ConCallExpression) it)) {
        Expression newArg = visitConCallWithStack((ConCallExpression) it, params);
        if (newArg == null) return null;
        prevConCall.getDefCallArguments().set(recursiveParam, newArg);
        return result;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ExpressionTransformer.java`
#### Snippet
```java

    Expression newArg = visit(it, params);
    if (newArg == null) return null;
    prevConCall.getDefCallArguments().set(recursiveParam, newArg);
    prevConCall.fixBoxes();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/sort/Sort.java`
#### Snippet
```java
    Level pLevel = myPLevel.max(sort.myPLevel);
    Level hLevel = myHLevel.max(sort.myHLevel);
    return pLevel == null || hLevel == null ? null : new Sort(pLevel, hLevel);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/sort/Level.java`
#### Snippet
```java
        return new Level(var, Math.max(myConstant, level.myConstant), Math.max(myMaxConstant, level.myMaxConstant));
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/subst/LevelPair.java`
#### Snippet
```java
  @Override
  public Level get(Variable variable) {
    return LevelVariable.PVAR.equals(variable) ? myPLevel : LevelVariable.HVAR.equals(variable) ? myHLevel : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    SingleDependentLink parameters = DependentLink.Helper.subst(expr.getParameters(), substitution);
    if (!visitDependentLink(parameters)) {
      return null;
    }
    Expression codomain = acceptSelf(expr.getCodomain().subst(substitution), true);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    }
    if (codomain == null) {
      return null;
    }
    return new PiExpression(expr.getResultSort(), parameters, codomain);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitArray(ArrayExpression expr, Void params) {
    Expression elementsType = acceptSelf(expr.getElementsType(), true);
    if (elementsType == null) return null;
    List<Expression> elements = visitDefCallArguments(expr.getElements());
    if (elements == null) return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    if (elementsType == null) return null;
    List<Expression> elements = visitDefCallArguments(expr.getElements());
    if (elements == null) return null;
    Expression tail;
    if (expr.getTail() != null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    if (expr.getTail() != null) {
      tail = acceptSelf(expr.getTail(), true);
      if (tail == null) return null;
    } else {
      tail = null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    Expression result = acceptSelf(expr.getFunction(), false);
    if (result == null) {
      return null;
    }
    Expression arg = acceptSelf(expr.getArgument(), true);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    Expression arg = acceptSelf(expr.getArgument(), true);
    if (arg == null) {
      return null;
    }
    return AppExpression.make(result, arg, expr.isExplicit());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      for (Map.Entry<Binding, Expression> entry : expr.getSubstitution().getEntries()) {
        Expression value = acceptSelf(entry.getValue(), true);
        if (value == null) return null;
        substitution.add(entry.getKey(), value);
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      }
      Expression result = acceptSelf(expr.getExpression(), true);
      if (result == null) return null;
      return SubstExpression.make(result, substitution, expr.getLevelSubstitution());
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    assert expr instanceof LeveledDefCallExpression;
    List<Expression> newArgs = visitDefCallArguments(expr.getDefCallArguments());
    return newArgs == null ? null : expr.getDefinition().getDefCall(((LeveledDefCallExpression) expr).getLevels(), newArgs);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitAt(AtExpression expr, Void params) {
    Expression pathArg = acceptSelf(expr.getPathArgument(), true);
    if (pathArg == null) return null;
    Expression intervalArg = acceptSelf(expr.getIntervalArgument(), true);
    return intervalArg == null ? null : AtExpression.make(pathArg, intervalArg, false);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    if (pathArg == null) return null;
    Expression intervalArg = acceptSelf(expr.getIntervalArgument(), true);
    return intervalArg == null ? null : AtExpression.make(pathArg, intervalArg, false);
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      Expression newField = acceptSelf(field, true);
      if (newField == null) {
        return null;
      }
      newFields.add(newField);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java

    SigmaExpression sigmaExpr = (SigmaExpression) acceptSelf(expr.getSigmaType(), false);
    return sigmaExpr == null ? null : new TupleExpression(newFields, sigmaExpr);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      SingleDependentLink parameters = DependentLink.Helper.subst(oldParameters, substitution);
      if (!visitDependentLink(parameters)) {
        return null;
      }
      body = acceptSelf(expr.getBody().subst(substitution), true);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      }
      if (body == null) {
        return null;
      }
      body = new LamExpression(expr.getResultSort(), parameters, body);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      body = acceptSelf(expr.getBody(), true);
      if (body == null) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  private List<Expression> visitDefCallArguments(List<? extends Expression> args) {
    List<Expression> result = new ArrayList<>(args.size());
    return visitDefCallArguments(args, result) ? result : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitBox(BoxExpression expr, Void params) {
    Expression result = expr.getExpression().accept(this, null);
    return result != null ? BoxExpression.make(result) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitFieldCall(FieldCallExpression expr, Void params) {
    Expression newExpr = acceptSelf(expr.getArgument(), false);
    return newExpr == null ? null : FieldCallExpression.make(expr.getDefinition(), newExpr);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public static Expression elimLamBinding(LamExpression expr) {
    if (expr == null) {
      return null;
    }
    Expression result = expr.getParameters().getNext().hasNext() ? new LamExpression(expr.getResultSort(), expr.getParameters().getNext(), expr.getBody()) : expr.getBody();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      Expression newArg = acceptSelf(argument, true);
      if (newArg == null) {
        return null;
      }
      newArgs.add(newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    DependentLink parameters = DependentLink.Helper.subst(expr.getParameters(), substitution);
    if (!visitDependentLink(parameters)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    Expression newType = acceptSelf(expr.getResultType().subst(substitution), true);
    if (newType == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      newTypeLevel = acceptSelf(expr.getResultTypeLevel().subst(substitution), true);
      if (newTypeLevel == null) {
        return null;
      }
    } else {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      DependentLink clauseParams = DependentLink.Helper.subst(Pattern.getFirstBinding(clause.getPatterns()), clauseSubst);
      if (!visitDependentLink(clauseParams)) {
        return null;
      }
      Expression newExpr;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
        newExpr = acceptSelf(clause.getExpression(), true);
        if (newExpr == null) {
          return null;
        }
      } else {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    Expression newExpr = acceptSelf(expr.getExpression(), true);
    if (newExpr == null) {
      return null;
    }
    Expression newType = acceptSelf(expr.getTypeOf(), true);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    }
    Expression newType = acceptSelf(expr.getTypeOf(), true);
    return newType == null ? null : new OfTypeExpression(newExpr, newType);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      return new SigmaExpression(expr.getSort(), parameters);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
      }
      myFoundVariable = expr.getBinding();
      return null;
    } else {
      return expr;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
            myKeepVisitor.getBindings().remove(expr.getThisBinding());
          }
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitPath(PathExpression expr, Void params) {
    Expression argumentType = acceptSelf(expr.getArgumentType(), true);
    if (argumentType == null) return null;
    Expression argument = acceptSelf(expr.getArgument(), true);
    return argument == null ? null : new PathExpression(expr.getLevels(), argumentType, argument);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    if (argumentType == null) return null;
    Expression argument = acceptSelf(expr.getArgument(), true);
    return argument == null ? null : new PathExpression(expr.getLevels(), argumentType, argument);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    ClassCallExpression classCall = visitClassCall(expr.getClassCall(), false);
    if (classCall == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    renew = acceptSelf(renew, true);
    if (renew == null) {
      return null;
    }
    return new NewExpression(renew, classCall);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitPEval(PEvalExpression expr, Void params) {
    Expression result = expr.getExpression().accept(this, null);
    return result != null ? new PEvalExpression(result) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitTypeDestructor(TypeDestructorExpression expr, Void params) {
    Expression newArg = acceptSelf(expr.getArgument(), true);
    return newArg == null ? null : TypeDestructorExpression.make(expr.getDefinition(), newArg);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitTypeConstructor(TypeConstructorExpression expr, Void params) {
    List<Expression> newArgs = visitDefCallArguments(expr.getClauseArguments());
    if (newArgs == null) return null;
    Expression newArg = acceptSelf(expr.getArgument(), true);
    return newArg == null ? null : TypeConstructorExpression.make(expr.getDefinition(), expr.getLevels(), expr.getClauseIndex(), newArgs, newArg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
    if (newArgs == null) return null;
    Expression newArg = acceptSelf(expr.getArgument(), true);
    return newArg == null ? null : TypeConstructorExpression.make(expr.getDefinition(), expr.getLevels(), expr.getClauseIndex(), newArgs, newArg);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/ElimBindingVisitor.java`
#### Snippet
```java
  public Expression visitProj(ProjExpression expr, Void params) {
    Expression newExpr = acceptSelf(expr.getExpression(), false);
    return newExpr == null ? null : ProjExpression.make(newExpr, expr.getField(), expr.isBoxed());
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/Binding.java`
#### Snippet
```java
    if (type instanceof Type) return (Type) type;
    Sort sort = type.getSortOfType();
    return sort == null ? null : new TypeExpression(type, sort);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/ParamLevelVariable.java`
#### Snippet
```java
  @Override
  public LevelVariable min(LevelVariable other) {
    return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : !(other instanceof ParamLevelVariable) || mySize <= ((ParamLevelVariable) other).mySize ? this : other;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/ParamLevelVariable.java`
#### Snippet
```java
  @Override
  public LevelVariable max(LevelVariable other) {
    return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : !(other instanceof ParamLevelVariable) || mySize >= ((ParamLevelVariable) other).mySize ? this : other;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/LevelVariable.java`
#### Snippet
```java
    @Override
    public LevelVariable max(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : other;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/LevelVariable.java`
#### Snippet
```java
    @Override
    public LevelVariable min(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : this;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/LevelVariable.java`
#### Snippet
```java
    @Override
    public LevelVariable max(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : other;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/LevelVariable.java`
#### Snippet
```java
    @Override
    public LevelVariable min(LevelVariable other) {
      return other instanceof InferenceLevelVariable || getType() != other.getType() ? null : this;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/inference/InferenceLevelVariable.java`
#### Snippet
```java
  @Override
  public LevelVariable max(LevelVariable other) {
    return this == other ? this : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/inference/InferenceLevelVariable.java`
#### Snippet
```java
  @Override
  public LevelVariable min(LevelVariable other) {
    return this == other ? this : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/inference/TypeClassInferenceVariable.java`
#### Snippet
```java
      myClassifyingExpression = classifyingExpression;
    }
    return result == null ? null : result.expression;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/context/binding/inference/InferenceVariable.java`
#### Snippet
```java

  public Expression getSolution() {
    return myReference == null ? null : myReference.getSubstExpression();
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/Pattern.java`
#### Snippet
```java
  default String getBindingName() {
    Binding binding = getBinding();
    if (binding == null) return null;
    String name = binding.getName();
    return name == null ? Renamer.getNameFromType(binding.getTypeExpr(), null) : name;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/Pattern.java`
#### Snippet
```java
        exprPattern = pattern.toExpressionPattern(TypeConstructorExpression.unfoldType(link.getTypeExpr().subst(substitution)));
        if (exprPattern == null) {
          return null;
        }
      } else {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/BindingPattern.java`
#### Snippet
```java
  @Override
  public Definition getDefinition() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      List<Expression> args = constructor.matchDataTypeArguments(dataCall.getDefCallArguments());
      if (args == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      List<ExpressionPattern> subPatterns = Pattern.toExpressionPatterns(mySubPatterns, DependentLink.Helper.subst(constructor.getParameters(), new ExprSubstitution().add(constructor.getDataTypeParameters(), args)));
      if (subPatterns == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      FunCallExpression equality = type.toEquality();
      if (equality == null) {
        return null;
      }
      return new ConstructorExpressionPattern(FunCallExpression.makeFunCall(Prelude.IDP, equality.getLevels(), Arrays.asList(equality.getDefCallArguments().get(0), equality.getDefCallArguments().get(1))), Collections.emptyList());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      List<ExpressionPattern> subPatterns = Pattern.toExpressionPatterns(mySubPatterns, classCall.getClassFieldParameters());
      if (subPatterns == null) {
        return null;
      }
      return new ConstructorExpressionPattern(classCall, subPatterns);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      List<ExpressionPattern> subPatterns = Pattern.toExpressionPatterns(mySubPatterns, sigma.getParameters());
      if (subPatterns == null) {
        return null;
      }
      return new ConstructorExpressionPattern(sigma, subPatterns);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorPattern.java`
#### Snippet
```java
      return new ConstructorExpressionPattern(sigma, subPatterns);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/EmptyPattern.java`
#### Snippet
```java
  @Override
  public Definition getDefinition() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/LeafElimTree.java`
#### Snippet
```java
  @Override
  public Expression getStuckExpression(List<? extends Expression> arguments, Expression expression) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/IntervalElim.java`
#### Snippet
```java
      ConCallExpression conCall = arguments.get(offset + i).cast(ConCallExpression.class);
      if (conCall != null && (conCall.getDefinition() == Prelude.LEFT && myCases.get(i).proj1 != null || conCall.getDefinition() == Prelude.RIGHT && myCases.get(i).proj2 != null)) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/MetaTopDefinition.java`
#### Snippet
```java
  public Expression getTypeWithParams(List<? super DependentLink> params, Levels levels) {
    if (!status().headerIsOK()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/MetaTopDefinition.java`
#### Snippet
```java
    LevelSubstitution levelSubst = levels.makeSubstitution(this);
    params.addAll(DependentLink.Helper.toList(DependentLink.Helper.subst(myParameters, subst, levelSubst)));
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/MetaTopDefinition.java`
#### Snippet
```java
  @Override
  public TopLevelDefinition getTopLevelDefinition() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java

  public CoerceData getCoerceData() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java

  public List<Integer> getParametersTypecheckingOrder() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java

  public TCReferable getHLevelsParent() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java
      DependentLink parameters = getParameters();
      if (!parameters.hasNext()) {
        return null;
      }
      Expression type = parameters.getTypeExpr();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java
      }
      Expression type = parameters.getTypeExpr();
      return type instanceof ClassCallExpression ? ((ClassCallExpression) type).getDefinition() : null;
    } else {
      return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java
      return type instanceof ClassCallExpression ? ((ClassCallExpression) type).getDefinition() : null;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Definition.java`
#### Snippet
```java

  public TCReferable getPLevelsParent() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      newArguments = singleConstructor.getMatchedArguments(argument, false);
      if (newArguments == null) {
        return null;
      }
      if (index + 1 < arguments.size()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      return new ArrayConstructor(((ArrayExpression) argument).getElements().isEmpty(), true, true);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
    if (myChildren.size() == 1) {
      Map.Entry<BranchKey, ElimTree> entry = myChildren.entrySet().iterator().next();
      return entry.getKey() instanceof SingleConstructor ? (SingleConstructor) entry.getKey() : null;
    } else {
      return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      return entry.getKey() instanceof SingleConstructor ? (SingleConstructor) entry.getKey() : null;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
    if (myChildren.size() == 1) {
      Map.Entry<BranchKey, ElimTree> entry = myChildren.entrySet().iterator().next();
      return entry.getKey() instanceof SingleConstructor ? entry.getValue() : null;
    } else {
      return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/elimtree/BranchElimTree.java`
#### Snippet
```java
      return entry.getKey() instanceof SingleConstructor ? entry.getValue() : null;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/Constructor.java`
#### Snippet
```java
    } else {
      List<Expression> result = new ArrayList<>();
      return ExpressionPattern.match(myPatterns, arguments, result) == Decision.YES ? result : null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    Key key = getKey(type);
    if (key instanceof DefinitionKey && ((DefinitionKey) key).definition == myDefinition) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    }
    addTransitiveClosureTo(key, coercingDefinition);
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    CoerceData coerceData = result.type instanceof DefCallExpression ? ((DefCallExpression) result.type).getDefinition().getCoerceData() : null;
    if (coerceData == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java

    List<Definition> defs = coerceData.myMapTo.get(key);
    return defs != null ? coerceResult(result, defs, null, sourceNode, visitor, false, false) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    DefCallExpression expectedDefCall = expectedType.cast(DefCallExpression.class);
    if (actualDefCall != null && expectedDefCall != null && (actualDefCall.getDefinition() == expectedDefCall.getDefinition() || actualDefCall.getDefinition() instanceof ClassDefinition && expectedDefCall.getDefinition() instanceof ClassDefinition && ((ClassDefinition) actualDefCall.getDefinition()).isSubClassOf((ClassDefinition) expectedDefCall.getDefinition()))) {
      return null;
    }
    CoerceData actualCoerceData = actualDefCall != null ? actualDefCall.getDefinition().getCoerceData() : null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    if (classCall != null && classCall.getDefinition().getClassifyingField() == null) classCall = null;
    if (actualCoerceData == null && expectedCoerceData == null && classCall == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java

    // Can't coerce
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    Key key = getKey(type);
    if (key instanceof DefinitionKey && ((DefinitionKey) key).definition == myDefinition) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    }
    addTransitiveClosureFrom(key, coercingDefinition);
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
        if (!visitor.checkCoerceResult(link.getTypeExpr().subst(substitution, levels.makeSubstitution(def)), result, sourceNode, argStrict)) {
          if (argStrict) {
            return null;
          }
          result.expression = new ErrorExpression(result.expression);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
    if (expectedType != null && !visitor.checkCoerceResult(expectedType, result, sourceNode, resultStrict)) {
      if (resultStrict) {
        return null;
      }
      result.expression = new ErrorExpression(result.expression);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/DataDefinition.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/DataDefinition.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/DataDefinition.java`
#### Snippet
```java
  public Expression getTypeWithParams(List<? super DependentLink> params, Levels levels) {
    if (!status().headerIsOK()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/constructor/IdpConstructor.java`
#### Snippet
```java
    argument = argument.getUnderlyingExpression();
    if (argument instanceof FunCallExpression) {
      return ((FunCallExpression) argument).getDefinition() == Prelude.IDP ? Collections.emptyList() : null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/constructor/IdpConstructor.java`
#### Snippet
```java

    if (!normalizing || !(argument instanceof PathExpression)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/constructor/IdpConstructor.java`
#### Snippet
```java
    LamExpression lamExpr = ((PathExpression) argument).getArgument().normalize(NormalizationMode.WHNF).cast(LamExpression.class);
    if (lamExpr == null) {
      return null;
    }
    Expression body = lamExpr.getParameters().getNext().hasNext() ? new LamExpression(lamExpr.getResultSort(), lamExpr.getParameters().getNext(), lamExpr.getBody()) : lamExpr.getBody();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/constructor/IdpConstructor.java`
#### Snippet
```java
    }
    Expression body = lamExpr.getParameters().getNext().hasNext() ? new LamExpression(lamExpr.getResultSort(), lamExpr.getParameters().getNext(), lamExpr.getBody()) : lamExpr.getBody();
    return lamExpr.getParameters() == UnusedIntervalDependentLink.INSTANCE || !NormalizingFindBindingVisitor.findBinding(body, lamExpr.getParameters()) ? Collections.emptyList() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/constructor/SingleConstructor.java`
#### Snippet
```java
  @Override
  public Body getBody() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  @Override
  public Definition getDefinition() {
    return data instanceof DefCallExpression ? ((DefCallExpression) data).getDefinition() : data instanceof SmallIntegerExpression ? Prelude.ZERO : data instanceof ArrayData ? ((ArrayData) data).funCall.getDefinition() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java

  public static Boolean isEqualToZero(Expression length) {
    if (length == null) return null;
    length = length.normalize(NormalizationMode.WHNF);
    return length instanceof IntegerExpression ? (Boolean) ((IntegerExpression) length).isZero() : length instanceof ConCallExpression && ((ConCallExpression) length).getDefinition() == Prelude.SUC ? false : null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
    if (length == null) return null;
    length = length.normalize(NormalizationMode.WHNF);
    return length instanceof IntegerExpression ? (Boolean) ((IntegerExpression) length).isZero() : length instanceof ConCallExpression && ((ConCallExpression) length).getDefinition() == Prelude.SUC ? false : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  public static Boolean isArrayEmpty(Expression type) {
    type = type.normalize(NormalizationMode.WHNF);
    return type instanceof ClassCallExpression && ((ClassCallExpression) type).getDefinition() == Prelude.DEP_ARRAY ? isEqualToZero(((ClassCallExpression) type).getAbsImplementationHere(Prelude.ARRAY_LENGTH)) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
    if (dataExpr instanceof SigmaExpression) {
      TupleExpression tuple = expression.cast(TupleExpression.class);
      return tuple == null ? null : tuple.getFields();
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
          }
        }
        return null;
      }
      if (function == Prelude.ARRAY_CONS) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
          }
        }
        return null;
      }
      if (function != Prelude.IDP) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
      }
      if (function != Prelude.IDP) {
        return null;
      }
      if (expression instanceof FunCallExpression && ((FunCallExpression) expression).getDefinition() == Prelude.IDP) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
      }
      if (!(expression instanceof PathExpression)) {
        return null;
      }
      Expression arg = ((PathExpression) expression).getArgument();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
      LamExpression lamExpr = arg.cast(LamExpression.class);
      if (lamExpr == null) {
        return null;
      }
      Expression body = lamExpr.getParameters().getNext().hasNext() ? new LamExpression(lamExpr.getResultSort(), lamExpr.getParameters().getNext(), lamExpr.getBody()) : lamExpr.getBody();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
      }
      Expression body = lamExpr.getParameters().getNext().hasNext() ? new LamExpression(lamExpr.getResultSort(), lamExpr.getParameters().getNext(), lamExpr.getBody()) : lamExpr.getBody();
      return NormalizingFindBindingVisitor.findBinding(body, lamExpr.getParameters()) ? null : Collections.emptyList();
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
            : myConstructor == Prelude.SUC && !intExpr.isZero()
              ? Collections.singletonList(intExpr.pred())
              : null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
      }
      if (conCall == null || conCall.getDefinition() != myConstructor) {
        return null;
      }
      return conCall.getDefCallArguments();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
    NewExpression newExpr = expression.cast(NewExpression.class);
    if (newExpr == null) {
      return null;
    }
    List<Expression> arguments = new ArrayList<>();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java

  public Boolean isArrayEmpty() {
    return data instanceof ArrayData ? ((ArrayData) data).isEmpty : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java

  public Binding getArrayThisBinding() {
    return data instanceof ArrayData ? ((ArrayData) data).thisBinding : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  public Expression getArrayLength() {
    Expression dataExpr = getDataExpression();
    return dataExpr instanceof FunCallExpression funCall && funCall.getDefinition() == Prelude.ARRAY_CONS && funCall.getDefCallArguments().size() >= 1 ? funCall.getDefCallArguments().get(0) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  public Levels getLevels() {
    Expression dataExpr = getDataExpression();
    return dataExpr instanceof LeveledDefCallExpression ? ((LeveledDefCallExpression) dataExpr).getLevels() : dataExpr instanceof SmallIntegerExpression ? Levels.EMPTY : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
      Expression argument = pattern.toPatternExpression();
      if (argument == null) {
        return null;
      }
      arguments.add(argument);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  public Expression getArrayElementsType() {
    Expression dataExpr = getDataExpression();
    if (!(dataExpr instanceof FunCallExpression funCall)) return null;
    Definition def = funCall.getDefinition();
    return def == Prelude.EMPTY_ARRAY && funCall.getDefCallArguments().size() >= 1 ? funCall.getDefCallArguments().get(0) :
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
    Definition def = funCall.getDefinition();
    return def == Prelude.EMPTY_ARRAY && funCall.getDefCallArguments().size() >= 1 ? funCall.getDefCallArguments().get(0) :
           def == Prelude.ARRAY_CONS  && funCall.getDefCallArguments().size() >= 2 ? funCall.getDefCallArguments().get(1) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/FunctionDefinition.java`
#### Snippet
```java
  public Expression getTypeWithParams(List<? super DependentLink> params, Levels levels) {
    if (!status().headerIsOK()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  public PiExpression getOverriddenType(ClassField field, Levels levels) {
    PiExpression type = myOverridden.get(field);
    return type == null ? null : (PiExpression) new SubstVisitor(new ExprSubstitution(), castLevels(field.getParentClass(), levels).makeSubstitution(field)).visitPi(type, null);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  public AbsExpression getDefault(@NotNull ClassField field) {
    Pair<AbsExpression, Boolean> pair = myDefaults.get(field);
    return pair == null ? null : pair.proj1;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  public AbsExpression addDefaultIfAbsent(ClassField field, AbsExpression impl, boolean isFunc) {
    Pair<AbsExpression, Boolean> pair = myDefaults.putIfAbsent(field, new Pair<>(impl, isFunc));
    return pair == null ? null : pair.proj1;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/definition/ClassDefinition.java`
#### Snippet
```java
  public AbsExpression addDefault(ClassField field, AbsExpression impl, boolean isFunc) {
    Pair<AbsExpression, Boolean> pair = myDefaults.put(field, new Pair<>(impl, isFunc));
    return pair == null ? null : pair.proj1;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/group/Statement.java`
#### Snippet
```java

  default Abstract.LevelParameters getPLevelsDefinition() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/group/Statement.java`
#### Snippet
```java

  default Abstract.LevelParameters getHLevelsDefinition() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/group/Statement.java`
#### Snippet
```java
public interface Statement {
  default Group getGroup() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/group/Statement.java`
#### Snippet
```java

  default NamespaceCommand getNamespaceCommand() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/FreeReferablesVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/FreeReferablesVisitor.java`
#### Snippet
```java
  public TCReferable visitReference(Concrete.ReferenceExpression expr, Void params) {
    Referable ref = expr.getReferent();
    return ref instanceof TCReferable && myReferables.contains(ref) ? (TCReferable) ref : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  public R visitClause(Concrete.Clause clause, P params) {
    R result = clause.getPatterns() == null ? null : visitPatterns(clause.getPatterns(), params);
    return result != null ? result : clause.getExpression() != null ? clause.getExpression().accept(this, params) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        Concrete.ClassField field = (Concrete.ClassField) element;
        R result = visitParameters(field.getParameters(), params);
        if (result != null) return null;
        result = field.getResultType().accept(this, params);
        if (result != null) return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        if (result != null) return null;
        result = field.getResultType().accept(this, params);
        if (result != null) return null;
        if (field.getResultTypeLevel() != null) {
          result = field.getResultTypeLevel().accept(this, params);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        if (field.getResultTypeLevel() != null) {
          result = field.getResultTypeLevel().accept(this, params);
          if (result != null) return null;
        }
      } else if (element instanceof Concrete.ClassFieldImpl) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        Concrete.OverriddenField field = (Concrete.OverriddenField) element;
        R result = visitParameters(field.getParameters(), params);
        if (result != null) return null;
        result = field.getResultType().accept(this, params);
        if (result != null) return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        if (result != null) return null;
        result = field.getResultType().accept(this, params);
        if (result != null) return null;
        if (field.getResultTypeLevel() != null) {
          result = field.getResultTypeLevel().accept(this, params);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
        if (field.getResultTypeLevel() != null) {
          result = field.getResultTypeLevel().accept(this, params);
          if (result != null) return null;
        }
      } else {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java

  public R visitParameter(Concrete.Parameter parameter, P params) {
    return parameter.getType() == null ? null : parameter.getType().accept(this, params);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      if (result != null) return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitReference(Concrete.ReferenceExpression expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      if (result != null) return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitUniverse(Concrete.UniverseExpression expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitStringLiteral(Concrete.StringLiteral expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitNumericLiteral(Concrete.NumericLiteral expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      if (result != null) return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitApplyHole(Concrete.ApplyHoleExpression expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitThis(Concrete.ThisExpression expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      if (result != null) return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitHole(Concrete.HoleExpression expr, P params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
    if (pattern instanceof Concrete.NamePattern) {
      Concrete.NamePattern namePattern = (Concrete.NamePattern) pattern;
      return namePattern.type != null ? namePattern.type.accept(this, params) : null;
    }
    if (pattern instanceof Concrete.ConstructorPattern) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      return visitPatterns(((Concrete.TuplePattern) pattern).getPatterns(), params);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
      if (result != null) return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SearchConcreteVisitor.java`
#### Snippet
```java
  @Override
  public R visitGoal(Concrete.GoalExpression expr, P params) {
    return expr.expression != null ? expr.expression.accept(this, params) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java

  public List<? extends LevelReferable> getHLevelParametersList() {
    return hLevelParameters == null ? null : hLevelParameters.getReferables();
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/DefinableMetaDefinition.java`
#### Snippet
```java

  public List<? extends LevelReferable> getPLevelParametersList() {
    return pLevelParameters == null ? null : pLevelParameters.getReferables();
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/ReplaceDataVisitor.java`
#### Snippet
```java

  private List<Concrete.LevelExpression> visitLevels(List<? extends Concrete.LevelExpression> levels) {
    if (levels == null) return null;
    List<Concrete.LevelExpression> result = new ArrayList<>(levels.size());
    for (Concrete.LevelExpression level : levels) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/ReplaceDataVisitor.java`
#### Snippet
```java

  private Concrete.Coclauses visitCoclauses(Concrete.Coclauses coclauses) {
    if (coclauses == null) return null;
    List<Concrete.ClassFieldImpl> result = new ArrayList<>(coclauses.getCoclauseList().size());
    for (Concrete.ClassFieldImpl coclause : coclauses.getCoclauseList()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/ReplaceDataVisitor.java`
#### Snippet
```java

  private List<Concrete.ReferenceExpression> visitReferenceExpressions(List<? extends Concrete.ReferenceExpression> expressions) {
    if (expressions == null) return null;
    List<Concrete.ReferenceExpression> result = new ArrayList<>(expressions.size());
    for (Concrete.ReferenceExpression expression : expressions) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/ReplaceDataVisitor.java`
#### Snippet
```java

  private List<Concrete.Pattern> visitPatterns(List<? extends Concrete.Pattern> patterns) {
    if (patterns == null) return null;
    List<Concrete.Pattern> result = new ArrayList<>(patterns.size());
    for (Concrete.Pattern pattern : patterns) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/abs/ConcreteBuilder.java`
#### Snippet
```java
    if (resultType == null && resultTypeLevel != null) {
      myErrorReporter.report(new AbstractExpressionError(GeneralError.Level.ERROR, "The level of a type can be specified only if the type is also specified", resultTypeLevel));
      return null;
    } else {
      return resultTypeLevel;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/abs/ConcreteBuilder.java`
#### Snippet
```java

  private Concrete.LevelParameters visitLevelParameters(Abstract.LevelParameters params, boolean isPLevels) {
    if (params == null) return null;
    Boolean increasing = null;
    for (Abstract.Comparison comparison : params.getComparisonList()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/abs/ConcreteBuilder.java`
#### Snippet
```java

  private List<Concrete.LevelExpression> visitLevels(Collection<? extends Abstract.LevelExpression> levels, LevelVariable base) {
    if (levels == null) return null;
    List<Concrete.LevelExpression> result = new ArrayList<>(levels.size());
    for (Abstract.LevelExpression level : levels) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        SingleConstructor singleConstructor = branchElimTree.getSingleConstructorKey();
        if (singleConstructor == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        args = singleConstructor.getMatchedArguments(argument, true);
        if (args == null) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java

    if (body == null || body instanceof Expression && (mode == NormalizationMode.RNF)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        return absImpl.getExpression().subst(new ExprSubstitution(absImpl.getBinding(), arg).add(funCall.getDefinition().getParameters(), funCall.getDefCallArguments()), classCall.getLevelSubstitution().subst(funCall.getLevelSubstitution()));
      } else if (funCall.getDefinition().getBody() == null) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
    Expression type = arg.getType();
    Expression normType = type == null ? null : type.accept(this, NormalizationMode.WHNF);
    return normType instanceof ClassCallExpression ? ((ClassCallExpression) normType).getImplementation(field, arg) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
        return eval((ElimBody) body, defCall.getDefCallArguments(), new ExprSubstitution(), defCall.getLevelSubstitution(), expr, null);
      } else {
        return null;
      }
    } else if (expr instanceof CaseExpression) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
      return eval(((CaseExpression) expr).getElimBody(), ((CaseExpression) expr).getArguments(), new ExprSubstitution(), LevelSubstitution.EMPTY, expr, null);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/NormalizeVisitor.java`
#### Snippet
```java
          conArgs.set(recursiveParam, resultExpr);
        }
        return result == null ? null : addSucs(result, sucs).accept(this, mode);
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java

  private Concrete.TypedReferable visitTypedReferable(Concrete.TypedReferable asReferable) {
    return asReferable == null ? null : new Concrete.TypedReferable(myData != null ? myData : asReferable.getData(), asReferable.referable, asReferable.type.accept(this, null));
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java

  protected Concrete.Pattern visitPattern(Concrete.Pattern pattern) {
    if (pattern == null) return null;
    var data = myData != null ? myData : pattern.getData();
    if (pattern instanceof Concrete.NamePattern namePattern) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/SubstConcreteVisitor.java`
#### Snippet
```java

  private List<Concrete.LevelExpression> visitLevels(List<Concrete.LevelExpression> levels) {
    if (levels == null) return null;
    List<Concrete.LevelExpression> result = new ArrayList<>(levels.size());
    for (Concrete.LevelExpression level : levels) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/Version.java`
#### Snippet
```java

  public static Version fromString(String version) {
    if (version == null) return null;
    String[] split = version.trim().split("\\.");
    try {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/Version.java`
#### Snippet
```java
      }
    } catch (NumberFormatException ignored) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/SingletonList.java`
#### Snippet
```java
      @Override
      public Spliterator<E> trySplit() {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/VersionRange.java`
#### Snippet
```java
  public static VersionRange parseVersionRange(String text) {
    Range<String> stringRange = parseRange(text);
    if (stringRange == null) return null;
    Version from = Version.fromString(stringRange.proj1);
    Version to = Version.fromString(stringRange.proj2);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/VersionRange.java`
#### Snippet
```java
    Version from = Version.fromString(stringRange.proj1);
    Version to = Version.fromString(stringRange.proj2);
    return from == null && stringRange.proj1 != null || to == null && stringRange.proj2 != null ? null : new VersionRange(from, to);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/MinimizedRepresentation.java`
#### Snippet
```java
                    return getBindingDeep((ProjExpression) proj.getExpression());
                } else {
                    return null;
                }
            }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/MinimizedRepresentation.java`
#### Snippet
```java
            return minimizedConcrete.accept(new ErrorFixingConcreteExpressionVisitor(errorsCollector, factory), completeConcrete);
        } else {
            return null;
        }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/Range.java`
#### Snippet
```java

    if (tokens.size() == 1) {
      return tokens.get(0).proj1 == TokenType.TEXT ? new Range<>(tokens.get(0).proj2, tokens.get(0).proj2) : null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/Range.java`
#### Snippet
```java

    if (tokens.size() != 5 || tokens.get(2).proj1 != TokenType.COMMA) {
      return null;
    }
    if (tokens.get(3).proj1 == TokenType.LEQ && tokens.get(4).proj1 == TokenType.TEXT) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/Range.java`
#### Snippet
```java
    }

    return lowerBound == null || upperBound == null ? null : new Range<>(lowerBound, upperBound);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/error/ParsingError.java`
#### Snippet
```java
  @Override
  public Concrete.SourceNode getCauseSourceNode() {
    return cause instanceof Concrete.SourceNode ? (Concrete.SourceNode) cause : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
      String fileName = path.getFileName().toString();
      if (!fileName.endsWith(ext) || fileName.length() == ext.length()) {
        return null;
      }
      path = path.resolveSibling(fileName.substring(0, fileName.length() - ext.length()));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
      String name = elem.toString();
      if (!MODULE_NAME_REGEX.matcher(name).matches()) {
        return null;
      }
      names.add(name);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/util/FileUtils.java`
#### Snippet
```java
    for (String name : modulePath.toList()) {
      if (!MODULE_NAME_REGEX.matcher(name).matches()) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/module/error/ModuleNotFoundError.java`
#### Snippet
```java
  @Override
  public ModuleReferable getCause() {
    return currentModule == null ? null : new ModuleReferable(currentModule);
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java

  private Referable visitIdOrUnknown(IdOrUnknownContext ctx) {
    return ctx instanceof IuIdContext ? new ParsedLocalReferable(tokenPosition(ctx.start), ((IuIdContext) ctx).ID().getText()) : null;
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  @Override
  public Concrete.LevelParameters visitPlevelParams(PlevelParamsContext ctx) {
    return ctx == null ? null : (Concrete.LevelParameters) parseLevelParameters(ctx.start, ctx.ID(), null, true);
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  private String getVar(AtomFieldsAccContext ctx) {
    if (!ctx.NUMBER().isEmpty() || !(ctx.atom() instanceof AtomLiteralContext)) {
      return null;
    }
    LiteralContext literal = ((AtomLiteralContext) ctx.atom()).literal();
```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
    if (ids.size() % 2 == 0) {
      myErrorReporter.report(new ParserError(tokenPosition(ids.get(0).getSymbol()), "Cannot parse level parameters"));
      return null;
    }
    boolean linear = true;
```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
        if (inc == null) {
          myErrorReporter.report(new ParserError(tokenPosition(ids.get(i).getSymbol()), "Expected either '<=' or '>='"));
          return null;
        }
        if (increasing == null) {
```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  @Override
  public Concrete.LevelExpression visitWithoutLevelAtom(WithoutLevelAtomContext ctx) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  public List<Concrete.LevelExpression> visitSingleLevel(SingleLevelContext ctx) {
    MaybeLevelAtomContext level = ctx.maybeLevelAtom();
    return level instanceof WithoutLevelAtomContext ? null : new SingletonList<>(visitLevel(level));
  }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  private Concrete.LevelExpression getLevelExpression(Position position, String text, MaybeLevelAtomContext maybeLevelAtomCtx) {
    if (text.isEmpty()) {
      return maybeLevelAtomCtx == null ? null : visitLevel(maybeLevelAtomCtx);
    }

```

### ReturnNull
Return of `null`
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  @Override
  public Concrete.LevelParameters visitHlevelParams(HlevelParamsContext ctx) {
    return ctx == null ? null : (Concrete.LevelParameters) parseLevelParameters(ctx.start, ctx.ID(), null, false);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/BiConcreteVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/module/serialization/ModuleSerialization.java`
#### Snippet
```java
      if (targetModuleLocation == null || longName.isEmpty()) {
        myErrorReporter.report(LocationError.definition(targetReferable, modulePath));
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
  private TCReferable convertReferable(Referable ref) {
    return myReferableConverter == null
      ? (ref instanceof TCReferable ? (TCReferable) ref : null)
      : (ref instanceof LocatedReferable ? myReferableConverter.toDataLocatedReferable((LocatedReferable) ref) : null);
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java
    return myReferableConverter == null
      ? (ref instanceof TCReferable ? (TCReferable) ref : null)
      : (ref instanceof LocatedReferable ? myReferableConverter.toDataLocatedReferable((LocatedReferable) ref) : null);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/module/serialization/ModuleDeserialization.java`
#### Snippet
```java

  private List<LevelVariable> readLevelParameters(List<DefinitionProtos.Definition.LevelParameter> parameters, boolean isStd) {
    if (isStd) return null;
    List<LevelVariable> result = new ArrayList<>(parameters.size());
    for (DefinitionProtos.Definition.LevelParameter parameter : parameters) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java
  Binding readBindingRef(int index) throws DeserializationException {
    if (index == 0) {
      return null;
    } else {
      Binding binding = myBindings.get(index - 1);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/module/serialization/ExpressionDeserialization.java`
#### Snippet
```java

  private String validName(String name) {
    return name.isEmpty() ? null : name;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      return elim.getOtherwise() == null ? new ArrayList<>() : visitElimBody(parameters, elim.getOtherwise());
    } else if (body == null) {
      return null;
    } else {
      throw new IllegalStateException();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java

  private Concrete.Pattern makeLetClausePattern(LetClausePattern pattern) {
    if (pattern == null) return null;
    if (pattern.getName() != null) {
      return new Concrete.NamePattern(null, true, new LocalReferable(pattern.getName()), null);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    }
    List<? extends LetClausePattern> patterns = pattern.getPatterns();
    if (patterns == null) return null;
    List<Concrete.Pattern> cPatterns = new ArrayList<>(patterns.size());
    for (LetClausePattern subpattern : patterns) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    for (LetClausePattern subpattern : patterns) {
      Concrete.Pattern cSubpattern = makeLetClausePattern(subpattern);
      if (cSubpattern == null) return null;
      cPatterns.add(cSubpattern);
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java

  private List<Concrete.Pattern> visitPatterns(DependentLink parameters, List<? extends Pattern> patterns) {
    if (patterns == null) return null;
    List<Concrete.Pattern> result = new ArrayList<>();
    for (Pattern pattern : patterns) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      LetClausePattern pattern = ((HaveClause) ((ReferenceExpression) expr).getBinding()).getPattern();
      for (int i = list.size() - 1; i >= 0; i--) {
        if (pattern == null) return null;
        int index;
        if (list.get(i) instanceof Integer) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
          index = (int) list.get(i);
        } else if (list.get(i) instanceof ClassField field) {
          if (pattern.getFields() == null) return null;
          index = pattern.getFields().indexOf(field);
        } else return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
          if (pattern.getFields() == null) return null;
          index = pattern.getFields().indexOf(field);
        } else return null;
        List<? extends LetClausePattern> patterns = pattern.getPatterns();
        if (patterns == null || index < 0 || index >= patterns.size()) return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
        } else return null;
        List<? extends LetClausePattern> patterns = pattern.getPatterns();
        if (patterns == null || index < 0 || index >= patterns.size()) return null;
        pattern = patterns.get(index);
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java

  private Concrete.LevelExpression visitLevelNull(Level level, boolean showStdVar) {
    return level != null && (showStdVar || level.isClosed() || (!level.isVarOnly() || level.getVar() != LevelVariable.PVAR && level.getVar() != LevelVariable.HVAR) && hasFlag(PrettyPrinterFlag.SHOW_LEVELS)) ? visitLevel(level) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java

  private LocalReferable makeLocalReference(Binding var, Set<Variable> freeVars, boolean genName) {
    return !genName && !freeVars.contains(var) ? null : myRenamer.generateFreshReferable(var, freeVars);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    } else {
      if (!hasFlag(PrettyPrinterFlag.SHOW_LEVELS)) {
        return null;
      }
      result = new Concrete.VarLevelExpression(null, new LocalReferable(level.getVar().getName()), level.getVar() instanceof InferenceLevelVariable, level.getVar().getType());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
  private Concrete.Expression checkPath(DataCallExpression expr) {
    if (expr.getDefinition() != Prelude.PATH || hasFlag(PrettyPrinterFlag.SHOW_PREFIX_PATH)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
  public static Concrete.LevelParameters visitLevelParameters(List<? extends LevelVariable> parameters, boolean isPLevels) {
    if (parameters.size() == 1 && parameters.get(0).equals(parameters.get(0).getStd())) {
      return null;
    }
    List<LevelReferable> refs = new ArrayList<>(parameters.size());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/prettyprint/ToAbstractVisitor.java`
#### Snippet
```java
    if (levels.size() == 1) {
      Concrete.LevelExpression result = visitLevelNull(levels.get(0), showStdVar);
      return result == null ? null : new SingletonList<>(result);
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/binOp/PatternBinOpEngine.java`
#### Snippet
```java

  private Referable getReferableInner(Concrete.Pattern pattern) {
    return pattern instanceof Concrete.NamePattern ? ((Concrete.NamePattern) pattern).getReferable() : pattern instanceof Concrete.ConstructorPattern ? ((Concrete.ConstructorPattern) pattern).getConstructor() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      }
    }, null);
    return found[0] ? null : expr.accept(new SubstVisitor(substitution, LevelSubstitution.EMPTY, false), null);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
    while (true) {
      ReferenceExpression arg = expr1.getArgument().cast(ReferenceExpression.class);
      if (arg == null) return null;
      bindings.add(new Pair<>(arg.getBinding(), expr1.isExplicit()));
      Expression fun = myNormalCompare ? expr1.getFunction().normalize(NormalizationMode.WHNF) : expr1.getFunction().getUnderlyingExpression();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
        break;
      }
      if (!(fun instanceof AppExpression)) return null;
      expr1 = (AppExpression) fun;
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      expr1 = (AppExpression) fun;
    }
    if (infExpr.getVariable() == null) return null;

    ExprSubstitution substitution = getSubstitution(correctOrder);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      Pair<Binding, Boolean> pair = bindings.get(i);
      Type type = pair.proj1.getType();
      if (type == null) return null;
      if (!substVisitor.isEmpty()) {
        type = type.subst(substVisitor);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      if (!paramSubst.isEmpty()) {
        Expression typeExpr = checkedSubst(type.getExpr(), paramSubst, allowedBindings, null);
        if (typeExpr == null) return null;
        type = typeExpr instanceof Type ? (Type) typeExpr : new TypeExpression(typeExpr, type.getSortOfType());
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
    Expression bodyType = result == null ? null : result.getType();
    Sort bodySort = bodyType == null ? null : bodyType.getSortOfType();
    if (bodySort == null) return null;
    if (!correctOrder) {
      infExpr.getVariable().getBounds().removeAll(mySubstitution.keySet());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
  private Boolean checkDefCallAndApp(Expression expr1, Expression expr2, boolean correctOrder) {
    LeveledDefCallExpression defCall1 = expr1.cast(LeveledDefCallExpression.class);
    if (!(defCall1 instanceof DataCallExpression || defCall1 instanceof ClassCallExpression || defCall1 instanceof FunCallExpression && ((FunCallExpression) defCall1).getDefinition().getKind() == CoreFunctionDefinition.Kind.TYPE)) return null;
    AppExpression app2 = expr2.cast(AppExpression.class);
    if (app2 == null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
    AppExpression app2 = expr2.cast(AppExpression.class);
    if (app2 == null) {
      return null;
    }
    ClassCallExpression classCall1 = defCall1 instanceof ClassCallExpression ? (ClassCallExpression) defCall1 : null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      }
      if (variable == null || classCall1 == null && args.size() > defCall1.getDefCallArguments().size() || classCall1 != null && args.size() > classCall1.getDefinition().getNumberOfNotImplementedFields()) {
        return null;
      }
      Collections.reverse(args);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
        }
        if (args.size() > classArgs.size() || classCall1.getImplementedHere().size() > classArgs.size() && !(correctOrder && myCMP == CMP.LE || !correctOrder && myCMP == CMP.GE)) {
          return null;
        }
        dataParams = new ClassCallExpression(classCall1.getDefinition(), classCall1.getLevels(), new LinkedHashMap<>(), classCall1.getDefinition().getSort(), classCall1.getDefinition().getUniverseKind()).getClassFieldParameters();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
        return visitor.compare(finalExpr1, finalExpr2, null, true);
      } else {
        return myNormalCompare && myEquations.addEquation(finalExpr1, finalExpr2, null, myCMP, variable.getSourceNode(), correctOrder ? null : variable, correctOrder ? variable : null) ? true : null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      n2++;
    }
    if (!(n1 == n2 && e1 instanceof FieldCallExpression fieldCall1 && e2 instanceof FieldCallExpression fieldCall2)) return null;
    if (fieldCall1.getDefinition() == fieldCall2.getDefinition() && (fieldCall1.getArgument().getInferenceVariable() != null && isInstance(fieldCall2) || fieldCall2.getArgument().getInferenceVariable() != null && isInstance(fieldCall1))) {
      if (!e1.accept(this, e2, type)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/core/expr/visitor/CompareVisitor.java`
#### Snippet
```java
      return true;
    }
    else return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/ListScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/Scope.java`
#### Snippet
```java
    for (int i = 0; i < path.size(); i++) {
      if (scope == null) {
        return null;
      }
      if (withFields && i == path.size() - 2) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/Scope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/local/LocalListScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/local/LetScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/local/LetScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java
  public static Character getTypeStartingCharacter(Expression type) {
    if (type == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java
      name = ((ReferenceExpression) type).getBinding().getName();
    } else {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java
    }

    return name == null || name.isEmpty() ? null : (Character.isLetter(name.charAt(0)) ? Character.toLowerCase(name.charAt(0)) : null);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/renamer/Renamer.java`
#### Snippet
```java
    }

    return name == null || name.isEmpty() ? null : (Character.isLetter(name.charAt(0)) ? Character.toLowerCase(name.charAt(0)) : null);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/local/TelescopeScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/DataLocalReferable.java`
#### Snippet
```java
  public String positionTextRepresentation() {
    SourceInfo sourceInfo = SourceInfo.getSourceInfo(myData);
    return sourceInfo != null ? sourceInfo.positionTextRepresentation() : null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/DataLocalReferable.java`
#### Snippet
```java
  public String moduleTextRepresentation() {
    SourceInfo sourceInfo = SourceInfo.getSourceInfo(myData);
    return sourceInfo != null ? sourceInfo.moduleTextRepresentation() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/DataLocalReferable.java`
#### Snippet
```java

  public static DataLocalReferable make(Referable referable) {
    return referable == null ? null : new DataLocalReferable(referable, referable.getRefName());
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/local/PatternScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LocatedReferable.java`
#### Snippet
```java
      } else {
        Scope scope = resolveNamespace(parent, moduleScopeProvider);
        return scope == null ? null : scope.resolveName(locatedReferable.textRepresentation());
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LocatedReferable.java`
#### Snippet
```java
        ModuleLocation moduleLocation = locatedReferable.getLocation();
        if (moduleLocation == null) {
          return null;
        }
        return moduleScopeProvider.forModule(moduleLocation.getModulePath());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LocatedReferable.java`
#### Snippet
```java
      } else {
        Scope scope = resolveNamespace(parent, moduleScopeProvider);
        return scope == null ? null : scope.resolveNamespace(locatedReferable.textRepresentation(), true);
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/MetaReferable.java`
#### Snippet
```java
  @Override
  public Concrete.ResolvableDefinition getDefaultConcrete() {
    return myDefinition instanceof DefinableMetaDefinition ? (DefinableMetaDefinition) myDefinition : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/Referable.java`
#### Snippet
```java

  static Referable getUnderlyingReferable(Referable ref) {
    return ref == null ? null : ref.getUnderlyingReferable();
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/TCDefReferable.java`
#### Snippet
```java
    @Override
    public Definition getTypechecked() {
      return null;
    }
  };
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/LexicalScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/LexicalScope.java`
#### Snippet
```java
  private Object resolve(String name, ResolveType resolveType, Referable.RefKind refKind) {
    if (name.isEmpty() || "_".equals(name)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/LexicalScope.java`
#### Snippet
```java
    } else {
      Referable referable = new ClassFieldImplScope((ClassReferable) group.getReferable(), ClassFieldImplScope.Extent.WITH_SUPER_DYNAMIC).resolveName(name);
      return referable instanceof GlobalReferable ? (GlobalReferable) referable : null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/LexicalScope.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/LexicalScope.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/scope/LexicalScope.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/GlobalReferable.java`
#### Snippet
```java

  default Concrete.ResolvableDefinition getDefaultConcrete() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/converter/IdReferableConverter.java`
#### Snippet
```java
  @Override
  public TCReferable toDataLocatedReferable(LocatedReferable referable) {
    return referable instanceof TCReferable ? (TCReferable) referable : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
      }
      if (!(underlyingRef instanceof TypedReferable)) {
        return null;
      }
      Referable ref = ((TypedReferable) underlyingRef).getBodyReference(this);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
      Referable ref = ((TypedReferable) underlyingRef).getBodyReference(this);
      if (!(ref instanceof GlobalReferable)) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
      }
      if (!visited.add(underlyingRef)) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
  public Referable getTypeReference(Concrete.Expression expr, boolean isType) {
    Concrete.ReferenceExpression refExpr = getTypeReferenceExpression(expr, isType);
    return refExpr == null ? null : RedirectingReferable.getOriginalReferable(refExpr.getReferent());
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
  @Override
  public ClassReferable visitData(Concrete.DataDefinition def, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
  @Override
  public ClassReferable visitClass(Concrete.ClassDefinition def, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java

  public ClassReferable getTypeClassReference(Concrete.Expression type) {
    return type == null ? null : findClassReference(getTypeReference(type, true));
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
          for (Concrete.TypeParameter parameter : ((Concrete.PiExpression) expr).getParameters()) {
            if (parameter.isExplicit()) {
              return null;
            }
          }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
            } else {
              if (prec.priority == minPrec.priority && (prec.associativity != minPrec.associativity || prec.associativity == Precedence.Associativity.NON_ASSOC)) {
                return null;
              }
              if (prec.priority < minPrec.priority || prec.priority == minPrec.priority && prec.associativity == Precedence.Associativity.LEFT_ASSOC) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java

    if (!(expr instanceof Concrete.ReferenceExpression)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/TypeClassReferenceExtractVisitor.java`
#### Snippet
```java
  @Override
  public ClassReferable visitConstructor(Concrete.Constructor def, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/extImpl/ContextDataImpl.java`
#### Snippet
```java
  @Override
  public Concrete.ReferenceExpression getReferenceExpression() {
    return myExpression instanceof Concrete.ReferenceExpression ? (Concrete.ReferenceExpression) myExpression : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/extImpl/DefinitionContributorImpl.java`
#### Snippet
```java
    if (!FileUtils.isCorrectModulePath(module)) {
      myErrorReporter.report(FileUtils.illegalModuleName(module.toString()));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/extImpl/DefinitionContributorImpl.java`
#### Snippet
```java
    if (!FileUtils.isCorrectDefinitionName(longName)) {
      myErrorReporter.report(FileUtils.illegalDefinitionName(longName.toString()));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/extImpl/DefinitionContributorImpl.java`
#### Snippet
```java
        if (ref != null) {
          myErrorReporter.report(LibraryError.duplicateExtensionDefinition(myLibrary.getName(), module, longName));
          return null;
        }
        T curRef = cont.apply(locationRef, prevRef, name);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/extImpl/DefinitionContributorImpl.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/LibraryHeader.java`
#### Snippet
```java
      if (version == null) {
        errorReporter.report(new LibraryIOError(fileName, "Cannot parse version: " + config.getVersion()));
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/LibraryHeader.java`
#### Snippet
```java
      if (languageVersion == null) {
        errorReporter.report(new LibraryIOError(fileName, "Cannot parse language version: " + config.getLangVersion()));
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/classLoader/FileClassLoaderDelegate.java`
#### Snippet
```java
    Path file = myRoot.resolve(name.replace('.', File.separatorChar) + ".class");
    try {
      return Files.isRegularFile(file) ? Files.readAllBytes(file) : null;
    } catch (IOException e) {
      throw new ClassNotFoundException("An exception happened during loading of class " + name, e);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/LibraryManager.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/LibraryManager.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/LibraryManager.java`
#### Snippet
```java
      if (dependency == null) {
        showLibraryNotFoundError(dependencyName);
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/LibraryManager.java`
#### Snippet
```java
    }

    return loadLibrary(dependency, typechecking) ? dependency : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java

  public static UnresolvedReference make(Object data, @NotNull List<String> path) {
    return path.isEmpty() ? null : path.size() == 1 ? new NamedUnresolvedReference(data, path.get(0)) : new LongUnresolvedReference(data, path);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
      if (onlyTry) {
        resolved = null;
        return null;
      }
      Object data = getData();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
        }
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
      resolved = new ClassFieldImplScope(classRef, ClassFieldImplScope.Extent.WITH_DYNAMIC).resolveName(myPath.get(i));
      if (resolved == null) {
        if (onlyTry) return null;
        resolved = new ErrorReference(data, classRef, i, myPath.get(i));
        if (resolvedRefs != null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
        if (onlyTry) {
          resolved = null;
          return null;
        }
        resolved = new ErrorReference(data, make(data, myPath.subList(0, i + 1)), i + 1, myPath.get(i + 1));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
          resolvedRefs.add(resolved);
        }
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
  private Concrete.Expression resolveArgument(Scope scope, boolean onlyTry, List<Referable> resolvedRefs) {
    if (resolved != null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
    if (resolved == null) {
      if (myPath.size() == 1) {
        if (onlyTry) return null;
        resolved = new ErrorReference(getData(), name);
      } else {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java

  public ErrorReference getErrorReference() {
    return resolved instanceof ErrorReference ? (ErrorReference) resolved : null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
  public Scope resolveNamespace(Scope scope) {
    if (resolved instanceof ErrorReference) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/reference/LongUnresolvedReference.java`
#### Snippet
```java
        Object data = getData();
        resolved = new ErrorReference(data, make(data, myPath.subList(0, i)), i, myPath.get(i));
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/library/classLoader/ZipClassLoaderDelegate.java`
#### Snippet
```java
    ZipEntry entry = zipFile.getEntry(myPrefix + name.replace('.', '/') + ".class");
    if (entry == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/FieldDFS.java`
#### Snippet
```java
    Boolean prevState = state.putIfAbsent(field, false);
    if (Boolean.TRUE.equals(prevState)) {
      return null;
    }
    if (Boolean.FALSE.equals(prevState)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/FieldDFS.java`
#### Snippet
```java

    state.put(field, true);
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/FieldDFS.java`
#### Snippet
```java
    }
    references.computeIfAbsent(field, f -> new HashSet<>()).addAll(dependencies);
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java

  private static Scope makeScope(Group group, Scope parentScope, LexicalScope.Extent extent) {
    return parentScope == null ? null : LexicalScope.insideOf(group, parentScope, extent);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
  private ExpressionResolveNameVisitor resolveDataHeader(Concrete.DataDefinition def, Scope scope) {
     if (myResolveTypeClassReferences || def.getStage().ordinal() >= Concrete.Stage.HEADER_RESOLVED.ordinal()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
  private ExpressionResolveNameVisitor resolveFunctionHeader(Concrete.BaseFunctionDefinition def, Scope scope) {
    if (def.getStage().ordinal() >= Concrete.Stage.HEADER_RESOLVED.ordinal()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/DefinitionResolveNameVisitor.java`
#### Snippet
```java
      }
      def.setTypeClassReferencesResolved();
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/extImpl/ConcreteFactoryImpl.java`
#### Snippet
```java

  private List<Concrete.LevelExpression> makeLevels(List<? extends ConcreteLevel> levels) {
    if (levels == null) return null;
    List<Concrete.LevelExpression> result = new ArrayList<>(levels.size());
    for (ConcreteLevel level : levels) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/extImpl/ConcreteFactoryImpl.java`
#### Snippet
```java

  private List<Concrete.Pattern> patterns(Collection<? extends ConcretePattern> patterns) {
    if (patterns == null) return null;
    List<Concrete.Pattern> result = new ArrayList<>(patterns.size());
    for (ConcretePattern pattern : patterns) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/order/DFS.java`
#### Snippet
```java

  protected R getVisitedValue(T unit, boolean cycle) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    @Override
    public Abstract.LevelParameters getPLevelsDefinition() {
      return myPLevels ? this : null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
        return expr instanceof ReferenceExpression && ((ReferenceExpression) expr).getReferent() instanceof GlobalReferable ? ((GlobalReferable) ((ReferenceExpression) expr).getReferent()).getPrecedence() : Precedence.DEFAULT;
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
      return parameters;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java

    public LocalError getError() {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    public Referable getUnderlyingReferable() {
      ReferenceExpression expr = getUnderlyingReferenceExpression();
      return expr == null ? null : expr.getReferent();
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java

    public static List<LevelReferable> getLevelParametersRefs(Abstract.LevelParameters params, boolean isPLevels) {
      if (params == null) return null;
      List<LevelReferable> result = new ArrayList<>();
      for (Referable ref : params.getReferables()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java

    public TCDefReferable getEnclosingClass() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
        }
      }
      return expr instanceof ReferenceExpression ? (ReferenceExpression) expr : null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java

    public TCDefReferable getUseParent() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
    @Override
    public Abstract.LevelParameters getHLevelsDefinition() {
      return myPLevels ? null : this;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
  public static ParametersLevel typecheckLevel(Concrete.UseDefinition def, FunctionDefinition typedDef, Definition useParent, ErrorReporter errorReporter) {
    if (!(useParent instanceof DataDefinition || useParent instanceof ClassDefinition || useParent instanceof FunctionDefinition)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/UseTypechecking.java`
#### Snippet
```java
    Integer level = CheckTypeVisitor.getExpressionLevel(link, resultType, ok ? type : null, DummyEquations.getInstance(), def, errorReporter);
    if (level == null) {
      return null;
    }
    if (def != null && useParent instanceof DataDefinition && parameters == null && Level.compare(((DataDefinition) useParent).getSort().getHLevel(), new Level(level), CMP.LE, DummyEquations.getInstance(), def)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
    DataDefinition coreDef;
    if (params instanceof DataDefinition) coreDef = (DataDefinition) params;
    else return null;
    return def.getConstructorClauses()
      .stream()
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
      .map(cons -> {
        Constructor coreC = coreDef.getConstructor(cons.getData());
        if (coreC == null) return null;
        return visitor.visitSigmaParameters(cons.getParameters(), coreC.getParameters());
      })
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
    ClassDefinition coreDef;
    if (params instanceof ClassDefinition) coreDef = (ClassDefinition) params;
    else return null;
    var desugared = def.getStage().ordinal() >= Concrete.Stage.DESUGARIZED.ordinal();
    for (Concrete.ClassElement concreteRaw : def.getElements())
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
        if (accept != null) return accept;
      }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
    if (params instanceof FunctionDefinition)
      coreDef = (FunctionDefinition) params;
    else return null;
    Concrete.Expression resultType = def.getResultType();
    Expression coreResultType = coreDef.getResultType();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubDefVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/FindDefCallVisitor.java`
#### Snippet
```java
  public T getFoundDefinition() {
    Iterator<T> it = myFoundDefinitions.iterator();
    return it.hasNext() ? it.next() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
      if (next instanceof EmptyDependentLink) {
        lambda = lambda.getBody().cast(LamExpression.class);
        if (lambda == null) return null;
        return lambda.getParameters();
      } else return next;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/FindBinding.java`
#### Snippet
```java
        if (next instanceof EmptyDependentLink) {
          piExpr = piExpr.getCodomain().cast(PiExpression.class);
          if (piExpr == null) return null;
          return piExpr.getBinding();
        } else return next;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitAt(AtExpression expr, Void params) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitTuple(TupleExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitProj(ProjExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitPEval(PEvalExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitApp(AppExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitArray(ArrayExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitCase(CaseExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitError(ErrorExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitTypeConstructor(TypeConstructorExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitInferenceReference(InferenceReferenceExpression expr, Void params) {
    return expr.getSubstExpression() == null ? null : expr.getSubstExpression().accept(this, null);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitBox(BoxExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitNew(NewExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitPath(PathExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitInteger(IntegerExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
    if (expr.getResultSort().isProp()) return expr;
    Type dom = visit(expr.getParameters().getTypeExpr());
    if (dom == null) return null;
    Type cod = visit(expr.getCodomain());
    if (cod == null) return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
    if (dom == null) return null;
    Type cod = visit(expr.getCodomain());
    if (cod == null) return null;
    Sort sort = new Sort(dom.getSortOfType().getPLevel().max(cod.getSortOfType().getPLevel()), cod.getSortOfType().getHLevel());
    if (sort.equals(expr.getResultSort()) || !sort.isLessOrEquals(expr.getResultSort())) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitDefCall(DefCallExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
    if (type != null) return type;
    Sort sort = expr.getSortOfType();
    return sort == null ? null : new TypeExpression(expr, sort);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitTypeDestructor(TypeDestructorExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitLam(LamExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
  @Override
  public Type visitReference(ReferenceExpression expr, Void params) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/MinimizeLevelVisitor.java`
#### Snippet
```java
      if (param instanceof TypedDependentLink) {
        Type type = visit(param.getTypeExpr());
        if (type == null) return null;
        sort = sort.max(type.getSortOfType());
        if (sort.equals(expr.getSort()) || !sort.isLessOrEquals(expr.getSort())) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/order/Ordering.java`
#### Snippet
```java
  public Definition getTypechecked(TCReferable definition) {
    Definition typechecked = definition instanceof TCDefReferable ? ((TCDefReferable) definition).getTypechecked() : null;
    return typechecked == null || typechecked.status().needsTypeChecking() ? null : typechecked;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
      return nullWithError(new SubExprError(SubExprError.Kind.MetaRef, coreExpr));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/subexpr/CorrespondedSubExprVisitor.java`
#### Snippet
```java
    if (matchesSubExpr(expr)) return new Pair<>(coreExpr, expr);
    var coreCaseExpr = coreExpr.cast(CaseExpression.class);
    if (coreCaseExpr == null) return null;
    var expression = visitExprs(coreCaseExpr.getArguments(), expr
        .getArguments()
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/LocalInstancePool.java`
#### Snippet
```java
  public Expression addLocalInstance(Expression classifyingExpression, ClassDefinition classDef, Expression instance) {
    myPool.add(new InstanceData(classifyingExpression, classDef, instance));
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/LocalInstancePool.java`
#### Snippet
```java
  private Expression findInstance(Expression classifyingExpression, InstanceSearchParameters parameters, Definition currentDef, FieldSearchParameters fieldSearch) {
    if (!parameters.searchLocal()) {
      return null;
    }
    for (int i = myPool.size() - 1; i >= 0; i--) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/LocalInstancePool.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/LocalInstancePool.java`
#### Snippet
```java
  Concrete.Expression findInstance(Expression classifyingExpression, InstanceSearchParameters parameters, Concrete.SourceNode sourceNode, Definition currentDef, FieldSearchParameters fieldSearch) {
    Expression result = findInstance(classifyingExpression, parameters, currentDef, fieldSearch);
    return result == null ? null : new Concrete.ReferenceExpression(sourceNode, new CoreReferable(null, new TypecheckingResult(result, null)));
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/LocalInstancePool.java`
#### Snippet
```java
    Expression result = findInstance(classifyingExpression, parameters, currentDef, fieldSearch);
    if (result == null) {
      return null;
    }
    if (expectedType == null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/provider/SimpleInstanceProvider.java`
#### Snippet
```java
      }
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/provider/EmptyInstanceProvider.java`
#### Snippet
```java
  @Override
  public TCDefReferable findInstance(Predicate<TCDefReferable> pred) {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/provider/InstanceProviderSet.java`
#### Snippet
```java

  public InstanceProvider get(TCReferable referable) {
    return referable instanceof TCDefReferable ? myProviders.get(referable) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/computation/ComputationRunner.java`
#### Snippet
```java

  protected T computationInterrupted() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
  private Pair<Concrete.Expression, ClassDefinition> getInstancePair(Expression classifyingExpression, InstanceSearchParameters parameters, Concrete.SourceNode sourceNode, RecursiveInstanceHoleExpression recursiveHoleExpression, Definition currentDef) {
    if (!parameters.searchGlobal()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
      }
      if (!(normClassifyingExpression instanceof DefCallExpression || normClassifyingExpression instanceof SigmaExpression || normClassifyingExpression instanceof PiExpression || normClassifyingExpression instanceof UniverseExpression || normClassifyingExpression instanceof IntegerExpression)) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
    TCDefReferable instance = myInstanceProvider.findInstance(predicate);
    if (instance == null || predicate.instanceDef == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
    }

    return parameters.testGlobalInstance(instanceExpr) ? new Pair<>(instanceExpr, actualClass) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java

    Pair<Concrete.Expression, ClassDefinition> pair = myInstanceProvider == null ? null : getInstancePair(classifyingExpression, parameters, sourceNode, recursiveHoleExpression, currentDef);
    return pair != null ? pair.proj1 : myInstancePool != null && !(currentDef instanceof ClassDefinition) ? myInstancePool.findInstance(classifyingExpression, parameters, sourceNode, currentDef, LocalInstancePool.FieldSearchParameters.FIELDS_ONLY) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/instance/pool/GlobalInstancePool.java`
#### Snippet
```java
    }

    return myInstancePool != null && !(currentDef instanceof ClassDefinition) ? myInstancePool.findInstance(classifyingExpression, expectedType, parameters, sourceNode, currentDef, LocalInstancePool.FieldSearchParameters.FIELDS_ONLY) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DesugarVisitor.java`
#### Snippet
```java
      return thisParameter;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/termination/CallMatrix.java`
#### Snippet
```java
      return calculateLabel(parameter.getNext(), queriedIndex - length, parameterIndex + 1, namePrefix, data);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/DummyEquations.java`
#### Snippet
```java
  @Override
  public Boolean solveInstance(TypeClassInferenceVariable variable, FieldCallExpression fieldCall, Expression expr) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/DummyEquations.java`
#### Snippet
```java
  @Override
  public LevelEquationsSolver makeLevelEquationsSolver() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquations.java`
#### Snippet
```java

    solution.remove(null);
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
            continue;
          case Unknown:
            return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
    private List<String> findTerminationOrderAnnotated() {
      List<Integer> to = findTerminationOrder();
      if (to == null) return null;
      if (!myBehaviors.isEmpty()) {
        RecursiveBehavior<T> rb = myBehaviors.iterator().next();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java

      if (recBehaviors.myBehaviors.isEmpty()) return indices;
      if (recBehaviors.myLength == 0) return null;

      if (myBestRbAttained == null || myBestRbAttained.myLength > recBehaviors.myLength)
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/termination/BaseCallGraph.java`
#### Snippet
```java
      }

      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java
      for (LevelVariable lowerBound : lowerBounds) {
        if (!(lowerBound instanceof InferenceLevelVariable)) {
          return null;
        }
        toVisit.add((InferenceLevelVariable) lowerBound);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/LevelEquationsSolver.java`
#### Snippet
```java

    Map<InferenceLevelVariable, Integer> solution = new HashMap<>();
    return myHLevelEquations.solve(solution) == null ? solution.get(var) : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
      Referable referable = namePattern.getReferable();
      if (referable == null || referable instanceof GlobalReferable) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
      if (parsedPattern instanceof Concrete.UnparsedConstructorPattern) {
        myErrorReporter.report(new NameResolverError("Cannot parse pattern", pattern));
        return null;
      }
    } else if (!(pattern instanceof Concrete.NumberPattern)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
    MetaResolver metaDef = refExpr == null ? null : getMetaResolver(refExpr.getReferent());
    if (metaDef == null) {
      return null;
    }
    myErrorReporter.resetErrorsNumber();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/naming/resolving/visitor/ExpressionResolveNameVisitor.java`
#### Snippet
```java
      ref = ((RedirectingReferable) ref).getOriginalReferable();
    }
    return ref instanceof MetaReferable ? ((MetaReferable) ref).getResolver() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
          } else {
            reportBoundsError(var, bounds, cmp);
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
        if (classDef != classCall.getDefinition()) {
          reportBoundsError(var, bounds, cmp);
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
          reversedSubst.add(((ReferenceExpression) entry.getValue()).getBinding(), new ReferenceExpression(entry.getKey()));
        } else {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
    ClassDefinition classDef = variable.getClassDefinition();
    if (classDef == null) {
      return null;
    }
    if (classDef.getClassifyingField() == fieldCall.getDefinition() && expr.getStuckInferenceVariable() == null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
    if (classDef.getClassifyingField() == fieldCall.getDefinition() && expr.getStuckInferenceVariable() == null) {
      Expression result = variable.getInstance(myVisitor.getInstancePool(), expr, null, variable.getSourceNode());
      return result == null ? null : solve(variable, result.normalize(NormalizationMode.WHNF), false) != SolveResult.SOLVED;
    }
    return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/equations/TwoStageEquations.java`
#### Snippet
```java
      return result == null ? null : solve(variable, result.normalize(NormalizationMode.WHNF), false) != SolveResult.SOLVED;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
    }
    if (pattern.isAbsurd()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java

    if (!(pattern instanceof ConstructorPattern)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
    if (!(pattern instanceof ConstructorExpressionPattern)) {
      if (expr instanceof TupleExpression) {
        return matchExpressions(((TupleExpression) expr).getFields(), pattern.getSubPatterns(), false, result) != null ? expr : null;
      }
      if (expr instanceof ConCallExpression && pattern.getDefinition() == ((ConCallExpression) expr).getDefinition()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
      }
      if (expr instanceof ConCallExpression && pattern.getDefinition() == ((ConCallExpression) expr).getDefinition()) {
        return matchExpressions(((ConCallExpression) expr).getDefCallArguments(), pattern.getSubPatterns(), false, result) != null ? expr : null;
      }
      result.add(new MatchResult(expr, pattern, new TypedBinding(Renamer.UNNAMED, expr.computeType())));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java

    List<Expression> newArgs = matchExpressions(args, pattern.getSubPatterns(), computeData, result);
    return newArgs == null ? null : computeData ? replaceMatchingExpressionArguments(conPattern, expr, newArgs) : expr;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
      Expression newExpr = matchExpression(exprs.get(i), patterns.get(i), computeData, result);
      if (newExpr == null) {
        return null;
      }
      if (computeData) newExprs.add(newExpr);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    if (definition == Prelude.ARRAY_CONS && !arguments.isEmpty() && !arguments.get(0).isExplicit()) {
      TypecheckingResult result = myVisitor.checkExpr(arguments.get(0).expression, Nat());
      if (result == null) return null;
      length = result.expression;
      index++;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    if (index < arguments.size() && !arguments.get(index).isExplicit()) {
      TypecheckingResult result = myVisitor.checkExpr(arguments.get(index).expression, definition == Prelude.EMPTY_ARRAY ? new PiExpression(sort.succ(), new TypedSingleDependentLink(true, null, Fin(Zero())), new UniverseExpression(sort)) : length == null ? null : new PiExpression(sort.succ(), new TypedSingleDependentLink(true, null, Fin(Suc(length))), new UniverseExpression(sort)));
      if (result == null) return null;
      elementsType = result.expression;
      index++;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        if (expectedClassCall.getDefinition() != Prelude.DEP_ARRAY || !expectedClassCall.getLevels().compare(defCallResult.getLevels(), CMP.LE, myVisitor.getEquations(), fun)) {
          myVisitor.getErrorReporter().report(new TypeMismatchError(expectedClassCall, refDoc(Prelude.DEP_ARRAY.getRef()), fun));
          return null;
        }
        if (elementsType == null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      }
      TypecheckingResult result2 = myVisitor.checkExpr(arguments.get(index2).expression, argClassCall);
      if (result2 == null) return null;
      ClassCallExpression classCall = result2.type.normalize(NormalizationMode.WHNF).cast(ClassCallExpression.class);
      if (classCall != null && classCall.getDefinition() != Prelude.DEP_ARRAY) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      if (classCall != null && classCall.getDefinition() != Prelude.DEP_ARRAY) {
        myVisitor.getErrorReporter().report(new TypeMismatchError(refDoc(Prelude.DEP_ARRAY.getRef()), result2.type, arguments.get(index2).expression));
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        if (constType != null && constType.getInferenceVariable() == null) {
          result1 = myVisitor.checkExpr(arguments.get(index).expression, constType);
          if (result1 == null) return null;
          checked = true;
          if (length == null) length = classCall == null ? null : classCall.getAbsImplementationHere(Prelude.ARRAY_LENGTH);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      if (!checked) {
        result1 = myVisitor.checkExpr(arguments.get(index).expression, null);
        if (result1 == null) return null;

        if (var != null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          if (!new CompareVisitor(myVisitor.getEquations(), CMP.LE, fun).normalizedCompare(result1.type, expected1, null, false)) {
            myVisitor.getErrorReporter().report(new TypeMismatchError(expected1, result1.type, arguments.get(index).expression));
            return null;
          }
          Map<ClassField, Expression> impls = new LinkedHashMap<>();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          if (!new CompareVisitor(myVisitor.getEquations(), CMP.LE, fun).normalizedCompare(result2.type, expected2, null, false)) {
            myVisitor.getErrorReporter().report(new TypeMismatchError(expected2, result2.type, arguments.get(index2).expression));
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    } else if (definition == Prelude.ARRAY_CONS && elementsType == null && index2 == arguments.size() && index < arguments.size() && defCallResult != null && defCallResult.getArguments().isEmpty()) {
      TypecheckingResult result1 = myVisitor.checkExpr(arguments.get(index).expression, null);
      if (result1 == null) return null;
      Sort sort1 = result1.type.getSortOfType();
      if (sort1 == null) return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      if (result1 == null) return null;
      Sort sort1 = result1.type.getSortOfType();
      if (sort1 == null) return null;
      if (!Sort.compare(sort1, sort, CMP.LE, myVisitor.getEquations(), arguments.get(index).expression)) {
        return null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      if (sort1 == null) return null;
      if (!Sort.compare(sort1, sort, CMP.LE, myVisitor.getEquations(), arguments.get(index).expression)) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          myVisitor.getErrorReporter().report(new TypeMismatchError(expectedType, result1.type, expr));
        }
        return null;
      }
      expectedParamsNumber = expectedParams.size();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  private Expression dropPiParameters(Definition definition, List<? extends ConcreteArgument> arguments, Expression expectedType) {
    if (expectedType == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      }
      if (!param.hasNext()) {
        return null;
      }
      if (argument.isExplicit() == param.isExplicit()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      PiExpression piExpr = expectedType.normalize(NormalizationMode.WHNF).cast(PiExpression.class);
      if (piExpr == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      for (; piParam.hasNext() && param.hasNext(); piParam = piParam.getNext(), param = param.getNext()) {
        if (param.isExplicit() != piParam.isExplicit()) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    while (i < arguments.size()) {
      if (!(type instanceof PiExpression)) {
        return null;
      }
      PiExpression pi = (PiExpression) type;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    if (result == null) {
      myVisitor.checkExpr(arg, null);
      return null;
    }
    if (arg == null || result instanceof TypecheckingResult && ((TypecheckingResult) result).expression.reportIfError(myVisitor.getErrorReporter(), fun)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          argResult = myVisitor.checkArgument(arg, new PiExpression(sort, lamParam, AppExpression.make(defCallResult.getArguments().get(0), new ReferenceExpression(lamParam), true)), result, null);
        }
        return argResult == null ? null : ((DefCallResult) result).applyPathArgument(argResult.expression, myVisitor, arg);
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    TypecheckingResult argResult = myVisitor.checkArgument(arg, param.hasNext() ? param.getTypeExpr() : null, result, null);
    if (argResult == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        myVisitor.getErrorReporter().report(new NotPiType(argResult.expression, result1.type, fun));
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
    if (param.isExplicit() != isExplicit) {
      myVisitor.getErrorReporter().report(new ArgumentExplicitnessError(param.isExplicit(), arg));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          if (!CompareVisitor.compare(myVisitor.getEquations(), CMP.LE, classCall, expectedClassCall, Type.OMEGA, arg)) {
            myVisitor.getErrorReporter().report(new TypeMismatchError(expectedClassCall, classCall, arg));
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
  private static ClassDefinition getClassRefFromDefCall(Definition definition, int paramIndex) {
    if (definition instanceof ClassField) {
      return paramIndex == 0 ? ((ClassField) definition).getParentClass() : null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java

    if (!link.hasNext()) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java

    ClassCallExpression type = link.getTypeExpr().cast(ClassCallExpression.class);
    return type != null ? type.getDefinition() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        TypecheckingResult argResult = myVisitor.checkExpr(expr.getArguments().get(0).getExpression(), Nat());
        if (argResult == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          if (expr.getArguments().size() > 1) {
            myVisitor.getErrorReporter().report(new NotPiType(argResult.expression, result.getType(), fun));
            return null;
          }
          return result;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        TypecheckingResult arg2Result = myVisitor.checkExpr(expr.getArguments().get(1).getExpression(), Fin(argResult.expression));
        if (arg2Result == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        if (expr.getArguments().size() > 2) {
          myVisitor.getErrorReporter().report(new NotPiType(arg2Result.expression, result.getType(), fun));
          return null;
        }
        return result;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
        myVisitor.checkExpr(argument.expression, null);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          if (((Constructor) defCallResult.getDefinition()).getDataType() != dataCall.getDefinition()) {
            myVisitor.getErrorReporter().report(new TypeMismatchError(dataCall, refDoc(((Constructor) defCallResult.getDefinition()).getDataType().getReferable()), fun));
            return null;
          }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
            if (!ok) {
              myVisitor.getErrorReporter().report(new TypeMismatchError(dataCall, DataCallExpression.make(dataCall.getDefinition(), defCallResult.getLevels(), args1), fun));
              return null;
            }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          if (parameter.isExplicit() != argument.isExplicit()) {
            myVisitor.getErrorReporter().report(new ArgumentExplicitnessError(parameter.isExplicit(), argument.getExpression()));
            return null;
          }
          InferenceVariable var = new ExpressionInferenceVariable(parameter.getTypeExpr(), argument.getExpression(), myVisitor.getAllBindings(), false);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
          result = inferArg(result, argument.expression, argument.isExplicit(), fun);
          if (result == null) {
            return null;
          }
          current++;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java

        if (result == null) {
          return null;
        }
        if (i < arguments.size()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java

  private InferenceVariable getInferenceVariableFromElementsType(Expression elementsType) {
    if (elementsType == null) return null;
    if (elementsType instanceof LamExpression) {
      elementsType = ((LamExpression) elementsType).getBody().normalize(NormalizationMode.WHNF);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/implicitargs/StdImplicitArgsInference.java`
#### Snippet
```java
      }
    }
    return elementsType instanceof InferenceReferenceExpression ? elementsType.getInferenceVariable() : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java

  private Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> computeParamSpec(DependentLink param, DataCallExpression dataCall, List<DependentLink> elimParams, Map<DependentLink, List<ConCallExpression>> paramSpec2, DependentLink parameters) {
    if (myErrorReporter == null) return null;
    Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> paramSpec = new HashMap<>();

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
            if (!(entry.getValue() instanceof BindingPattern) && !elimParams.isEmpty() && !elimParams.contains(key)) {
              myErrorReporter.report(new ImpossibleEliminationError(dataCall, mySourceNode, null, parameters, param, elimParams, null));
              return null;
            }
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(entry.getValue());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
            errorReporter.report(new NotEnoughPatternsError(expectedNumberOfPatterns - clause.getPatterns().size(), clause));
          }
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
        if (!elimParams.isEmpty() && elimParam == link) {
          errorReporter.report(new TypecheckingError("Duplicated eliminated parameter", expr));
          return null;
        }
        while (elimParam != link) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
            }
            errorReporter.report(new TypecheckingError(link == elimParam ? "Variable elimination must be in the order of variable introduction" : "Only parameters can be eliminated", expr));
            return null;
          }
          link = link.getNext();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
            if (myErrorReporter != null) myErrorReporter.report(new ImpossibleEliminationError(dataCall, getClause(conClause.index, someConPattern), null, null, null, null, null));
            myOK = false;
            return null;
          }
          branchKeys = new ArrayList<>(conCalls.size());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
        if (myErrorReporter != null) myErrorReporter.report(new TypecheckingError("Pattern matching on the interval is not allowed here", getClause(conClause.index, someConPattern)));
        myOK = false;
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java

  private DependentLink reportNoClauses(DependentLink parameters, List<DependentLink> elimParams) {
    if (myErrorReporter == null) return null;
    if (parameters.hasNext() && !parameters.getNext().hasNext()) {
      DataCallExpression dataCall = parameters.getTypeExpr().cast(DataCallExpression.class);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
      if (dataCall != null && dataCall.getDefinition() == Prelude.INTERVAL) {
        myErrorReporter.report(new TypecheckingError("Pattern matching on the interval is not allowed here", mySourceNode));
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
        Map<DependentLink, List<Pair<ExpressionPattern, Map<DependentLink, Constructor>>>> newParamSpec = computeParamSpec(param, dataCall, elimParams, paramSpec2, parameters);
        if (newParamSpec == null) {
          return null;
        }
        if (!newParamSpec.isEmpty()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
    if (allVars) {
      myErrorReporter.report(new CertainTypecheckingError(CertainTypecheckingError.Kind.BODY_REQUIRED, mySourceNode));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java

    myErrorReporter.report(new MissingClausesError(missingClauses, parameters, elimParams, true, mySourceNode));
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
  private static List<ConCallExpression> getMatchedConstructors(Expression expr) {
    DataCallExpression dataCall = expr.normalize(NormalizationMode.WHNF).cast(DataCallExpression.class);
    return dataCall == null ? null : dataCall.getMatchedConstructors();
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
    Integer level2 = !l2.isInfinity() && l2.isClosed() ? l2.getConstant() : null;
    Integer result = level1 != null && level2 != null ? Integer.valueOf(Math.min(level1, level2 - sub)) : level2 != null ? Integer.valueOf(level2 - sub) : level1;
    return result == null ? null : result + 1;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/ElimTypechecking.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      if (!usedVars.add(var)) {
        errorReporter.report(new TypecheckingError("Variable '" + var.getName() + "' occurs multiple times in the body of \\cons", sourceNode));
        return null;
      }
      return new BindingPattern(var);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        errorReporter.report(new TypecheckingError("\\cons must contain only constructors and variables", sourceNode));
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      ExpressionPattern pattern = checkDConstructor(argument, usedVars, sourceNode);
      if (pattern == null) {
        return null;
      }
      patterns.add(pattern);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
    ExpressionPattern pattern = constructor.getPattern();
    if (pattern == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      typecheckDataBody(definition, def, Collections.singleton(definition));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

  private TCLevelReferable getFirstLevelParameter(Concrete.LevelParameters levelParameters) {
    if (levelParameters == null || levelParameters.referables.isEmpty()) return null;
    LevelReferable ref = levelParameters.referables.get(0);
    return ref instanceof TCLevelReferable ? (TCLevelReferable) ref : null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
    if (levelParameters == null || levelParameters.referables.isEmpty()) return null;
    LevelReferable ref = levelParameters.referables.get(0);
    return ref instanceof TCLevelReferable ? (TCLevelReferable) ref : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  private ClassField findClassifyingField(ClassDefinition superClass, ClassDefinition classDef, Set<ClassDefinition> visited) {
    if (!visited.add(superClass)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
    ClassField field = superClass.getClassifyingField();
    if (field == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      typedDef = typechecker.referableToClassField(((Concrete.OverriddenField) def).getOverriddenField(), def);
      if (typedDef == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      if (typedDef.getParentClass() == parentClass || !parentClass.getFields().contains(typedDef)) {
        errorReporter.report(new TypecheckingError("Overridden field must belong to a super class", def));
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      }
      if (!ok) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

    if (!newDef) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        Expression newType = normalizePathExpression(((LamExpression) lamExpr).getBody(), constructor, sourceNode);
        if (newType == null) {
          return null;
        } else {
          List<Expression> args = new ArrayList<>(3);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
    if (type == null || !CompareVisitor.compare(typechecker.getEquations(), CMP.EQ, type, expectedType, Type.OMEGA, sourceNode)) {
      errorReporter.report(new TypecheckingError("Expected an iterated path type in " + expectedType, sourceNode));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        ExpressionPattern pattern = checkDConstructor(expr.getImplementation(field), usedVars, sourceNode);
        if (pattern == null) {
          return null;
        }
        patterns.add(pattern);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  private Integer checkResultTypeLevel(TypecheckingResult result, LevelMismatchError.TargetKind kind, Expression resultType, FunctionDefinition funDef, ClassField classField, boolean isOverridden, Concrete.SourceNode sourceNode) {
    if (result == null || resultType == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        }
        if (kind == LevelMismatchError.TargetKind.PROPERTY) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      errorReporter.report(new TypecheckingError("A class cannot be recursive", def));
      if (typechecked != null) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      typecheckClass(def, definition);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      throw new IllegalStateException();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

  private List<LevelVariable> typecheckLevelParameters(Concrete.ResolvableDefinition def) {
    if (def.getPLevelParameters() == null && def.getHLevelParameters() == null) return null;
    List<LevelVariable> parameters = new ArrayList<>();
    Map<LevelReferable, ParamLevelVariable> variables = new HashMap<>();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

  private Integer typecheckResultTypeLevel(Concrete.Expression resultTypeLevel, LevelMismatchError.TargetKind kind, Expression resultType, FunctionDefinition funDef, ClassField classField, boolean isOverridden) {
    if (resultTypeLevel == null) return null;
    if (kind != null) {
      Sort sort;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
        UntypedSingleDependentLink x = new UntypedSingleDependentLink("x", y);
        TypecheckingResult result = typechecker.finalCheckExpr(resultTypeLevel, new PiExpression(sort, x, FunCallExpression.make(Prelude.PATH_INFIX, new LevelPair(sort.getPLevel(), sort.getHLevel()), Arrays.asList(resultType, new ReferenceExpression(x), new ReferenceExpression(y)))));
        if (result == null) return null;
        if (myNewDef) {
          if (funDef != null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java

  private static DependentLink getExprParameters(Expression expr) {
    return expr instanceof SigmaExpression ? ((SigmaExpression) expr).getParameters() : expr instanceof PiExpression ? ((PiExpression) expr).getParameters() : null;
  }
}
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
            def.setTypechecked();
          }
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      myNewDef = typechecked == null;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  private Concrete.LevelParameters levelVariablesToParameters(Object data, List<? extends LevelVariable> levelVars, boolean isPLevels) {
    if (levelVars.size() == 1 && (levelVars.get(0) == LevelVariable.PVAR || levelVars.get(0) == LevelVariable.HVAR)) {
      return null;
    }
    List<LevelReferable> levelRefs = new ArrayList<>(levelVars.size());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      TypecheckingResult typeResult = typechecker.finalCheckExpr(resultType, Type.OMEGA);
      if (typeResult == null || !(typeResult.expression instanceof ClassCallExpression type)) {
        return null;
      }
      Set<ClassField> pseudoImplemented = new HashSet<>();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      Set<ClassField> pseudoImplemented = new HashSet<>();
      TypecheckingResult result = typechecker.finalize(typechecker.typecheckClassExt(classFieldImpls, Type.OMEGA, type, pseudoImplemented, resultType, true), def, false);
      if (result == null) return null;

      Expression resultExpr = result.expression.normalize(NormalizationMode.WHNF);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      if (!(resultExpr instanceof ClassCallExpression classCall)) {
        errorReporter.report(new TypeMismatchError(DocFactory.text("a classCall"), resultExpr, def.getResultType()));
        return null;
      }
      typechecker.checkAllImplemented(classCall, pseudoImplemented, def, resultType);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      assert resultType != null;
      TypecheckingResult result = typechecker.finalCheckExpr(new Concrete.NewExpression(def.getData(), Concrete.ClassExtExpression.make(resultType.getData(), typechecker.desugarClassApp(resultType, true, implemented), new Concrete.Coclauses(def.getData(), classFieldImpls))), null);
      if (result == null) return null;
      if (!(result.type instanceof ClassCallExpression)) {
        throw new IllegalStateException();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
      if (!oldParametersOK) {
        errorReporter.report(new TypecheckingError("Cannot typecheck definition. Try to clear cache", parameter));
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
    for (Concrete.FunctionClause clause : clauses) {
      if (!myTypecheckOtherClauses) {
        return null;
      }
      if (!typecheckClause(clause, abstractParameters, parameters, expectedType, result, definition)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
      }
    }
    return ok ? result : null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
  private Type typecheckType(Concrete.Expression cType, Expression expectedType) {
    if (cType == null || myVisitor == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
    if (type != null && !expectedType.isLessOrEquals(type.getExpr(), myVisitor.getEquations(), cType)) {
      myErrorReporter.report(new TypeMismatchError(type.getExpr(), expectedType, cType));
      return null;
    }
    return type;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        }
        myErrorReporter.report(new CertainTypecheckingError(CertainTypecheckingError.Kind.TOO_MANY_PATTERNS, pattern == null ? sourceNode : pattern));
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
              }
              myErrorReporter.report(new CertainTypecheckingError(CertainTypecheckingError.Kind.TOO_MANY_PATTERNS, pattern == null ? sourceNode : pattern));
              return null;
            }
          }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          if (parameters.isExplicit()) {
            myErrorReporter.report(new CertainTypecheckingError(CertainTypecheckingError.Kind.EXPECTED_EXPLICIT_PATTERN, pattern));
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        var newPattern = translateNumberPatterns((Concrete.NumberPattern) pattern, expr);
        if (newPattern == null) {
          return null;
        }
        newPattern.setExplicit(pattern.isExplicit());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          Result conResult = doTypechecking(patternArgs, newParameters, paramsSubst, totalSubst, pattern, false, 0);
          if (conResult == null) {
            return null;
          }
          varSubst.addSubst(conResult.varSubst);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
              myErrorReporter.report(new TypeMismatchError(DocFactory.text("a sigma type or a class"), expr, pattern));
            }
            return null;
          }
          if (!expr.isInstance(DataCallExpression.class)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
              myErrorReporter.report(new TypeMismatchError(DocFactory.text("a data type, a sigma type, or a class"), expr, pattern));
            }
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        if (def instanceof DConstructor constructor && def != Prelude.EMPTY_ARRAY && def != Prelude.ARRAY_CONS) {
          if (myVisitor == null || ((DConstructor) def).getPattern() == null) {
            return null;
          }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            if (!myMode.allowIdp()) {
              myErrorReporter.report(new TypecheckingError("Pattern matching on idp is not allowed here", pattern));
              return null;
            }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            if (type == null) {
              myErrorReporter.report(new TypeMismatchError(expr, constructor.getResultType().subst(substitution), conPattern));
              return null;
            }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            if (refExpr1 == null && refExpr2 == null) {
              myErrorReporter.report(new IdpPatternError(IdpPatternError.noVariable(), dataCall, conPattern));
              return null;
            }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            if (num == 0) {
              myErrorReporter.report(new IdpPatternError(IdpPatternError.noParameter(), dataCall, conPattern));
              return null;
            }
            Binding substVar = num == 1 ? refExpr1.getBinding() : refExpr2.getBinding();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            if (otherExpr == null) {
              myErrorReporter.report(new IdpPatternError(IdpPatternError.variable(substVar.getName()), dataCall, conPattern));
              return null;
            }
            Expression otherExpr2 = ElimBindingVisitor.elimBinding(num == 1 ? dataCall.getDefCallArguments().get(1) : dataCall.getDefCallArguments().get(2), substVar);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
              if (banVar != null && paramLink.getTypeExpr().findBinding(substVar)) {
                myErrorReporter.report(new IdpPatternError(IdpPatternError.subst(substVar.getName(), paramLink.getName(), banVar.getName()), null, conPattern));
                return null;
              }
              assert paramLink != null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
            if (!CompareVisitor.compare(myVisitor.getEquations(), CMP.EQ, actualType, expr, Type.OMEGA, conPattern)) {
              myErrorReporter.report(new TypeMismatchError(expr, actualType, conPattern));
              return null;
            }
            myVisitor.getEquations().solveEquations();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          Result conResult = doTypechecking(conPattern.getPatterns(), DependentLink.Helper.subst(link, substitution, levelSolution), paramsSubst, totalSubst, conPattern, false, 0);
          if (conResult == null) {
            return null;
          }
          varSubst.addSubst(conResult.varSubst);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          myErrorReporter.report(new TypeMismatchError(DocFactory.text("a data type"), expr, pattern));
        }
        return null;
      }
      if (!myMode.allowInterval() && dataCall != null && dataCall.getDefinition() == Prelude.INTERVAL) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
      if (!myMode.allowInterval() && dataCall != null && dataCall.getDefinition() == Prelude.INTERVAL) {
        myErrorReporter.report(new TypecheckingError("Pattern matching on the interval is not allowed here", pattern));
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          if (conCalls == null) {
            myErrorReporter.report(new ImpossibleEliminationError(dataCall, pattern, paramsSubst, clausesParameters, parameters, myElimParams, myCaseArguments));
            return null;
          }
          constructors = DataTypeNotEmptyError.getConstructors(conCalls);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        if (!constructors.isEmpty()) {
          myErrorReporter.report(new DataTypeNotEmptyError(dataCall, constructors, pattern));
          return null;
        }
        DependentLink newParam = parameters.subst(new SubstVisitor(paramsSubst, LevelSubstitution.EMPTY), 1, false);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          myErrorReporter.report(new ExpectedConstructorError((GlobalReferable) conRef, dataCall != null ? dataCall : classCall, parameters, conPattern, myCaseArguments, myLinkList.getFirst(), clausesParameters));
        }
        return null;
      }
      ConCallExpression conCall = dataCall != null ? conCalls.get(0) : null;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        myErrorReporter.report(new ImpossibleEliminationError(classCall, pattern));
        myTypecheckOtherClauses = false;
        return null;
      }
      Expression length1 = length == null || constructor == Prelude.EMPTY_ARRAY ? null : length.normalize(NormalizationMode.WHNF).pred();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
      Result conResult = doTypechecking(conPattern.getPatterns(), newParameters, paramsSubst, totalSubst, conPattern, false, body instanceof IntervalElim ? ((IntervalElim) body).getCases().size() : 0);
      if (conResult == null) {
        return null;
      }
      varSubst.addSubst(conResult.varSubst);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        if (conCall.getDefinition().getBody() instanceof IntervalElim) {
          myErrorReporter.report(new TypecheckingError("Pattern matching on a constructor with interval conditions is not allowed here", conPattern));
          return null;
        }
        if (conCall.getDefinition().getBody() instanceof ElimBody && NormalizeVisitor.INSTANCE.doesEvaluate(((ElimBody) conCall.getDefinition().getBody()).getElimTree(), conResult.exprs, true)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
        if (conCall.getDefinition().getBody() instanceof ElimBody && NormalizeVisitor.INSTANCE.doesEvaluate(((ElimBody) conCall.getDefinition().getBody()).getElimTree(), conResult.exprs, true)) {
          myErrorReporter.report(new TypecheckingError("Pattern matching on a constructor with conditions is allowed only when patterns cannot evaluate", conPattern));
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
          if (param.getTypeExpr().findBinding(parameters)) {
            myErrorReporter.report(new TypecheckingError("Partially applied constructor is not allowed because parameter '" + param.getName() + "' depends on '" + parameters.getName() + "'", conPattern));
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
      if (!ok || parameters.hasNext()) {
        myErrorReporter.report(new NotEnoughPatternsError(size > addedIntervalVars ? size - addedIntervalVars : size, sourceNode));
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
      Expression paramType = param.getTypeExpr().subst(paramSubst, levelSubst);
      if (!CompareVisitor.compare(myVisitor.getEquations(), CMP.LE, arg.getType(), paramType, Type.OMEGA, sourceNode)) {
        return null;
      }
      paramSubst.add(param, arg);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
    myLinkList.clear();
    Result result = doTypechecking(patterns, parameters, paramSubst, totalSubst, sourceNode, !myElimParams.isEmpty(), 0);
    if (result == null) return null;
    if (myFinal) {
      new StripVisitor(myErrorReporter).visitParameters(Pattern.getFirstBinding(result.patterns));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/patternmatching/PatternTypechecking.java`
#### Snippet
```java
    myLinkList.clear();
    Result result = doTypechecking(patterns, parameters, new ExprSubstitution(), null, sourceNode, withElim, 0);
    return result == null ? null : new Pair<>(result.patterns, result.exprs == null ? null : myContext);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
              }
              if (!visitParameter((Concrete.Parameter) param, null, null, list)) {
                return null;
              }
            }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  private TypecheckingResult bodyToLam(SingleDependentLink params, TypecheckingResult bodyResult, Concrete.SourceNode sourceNode) {
    if (bodyResult == null) {
      return null;
    }
    Sort sort = PiExpression.generateUpperBound(params.getType().getSortOfType(), getSortOfType(bodyResult.type, sourceNode), myEquations, sourceNode);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    Definition definition = referableToDefinition(referable, sourceNode);
    if (definition == null) {
      return null;
    }
    if (clazz.isInstance(definition)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      errorReporter.report(new WrongReferable(errorMsg, referable, sourceNode));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      for (Concrete.TypeParameter parameter : parameters) {
        if (!visitSigmaParameter(parameter, expectedType, resultSorts, list)) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          Expression resultType = FunCallExpression.make(Prelude.PATH_INFIX, idp.getLevels(), Arrays.asList(idp.getDefCallArguments().get(0), idp.getDefCallArguments().get(1), idp.getDefCallArguments().get(1)));
          errorReporter.report(new TypeMismatchWithSubexprError(new CompareVisitor.Result(resultType, equality, resultType, equality, idp.getLevels(), equality.getLevels()), expr));
          return null;
        }
        if (!visitor.compare(idp.getDefCallArguments().get(0), equality.getDefCallArguments().get(0), Type.OMEGA, false)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          Expression resultType = FunCallExpression.make(Prelude.PATH_INFIX, idp.getLevels(), Arrays.asList(idp.getDefCallArguments().get(0), idp.getDefCallArguments().get(1), idp.getDefCallArguments().get(1)));
          errorReporter.report(new TypeMismatchWithSubexprError(new CompareVisitor.Result(resultType, equality, idp.getDefCallArguments().get(0), equality.getDefCallArguments().get(0), null, null), expr));
          return null;
        }
        visitor.setCMP(CMP.EQ);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        if (!(visitor.compare(idpArg, left, type, true) && visitor.compare(idpArg, right, type, true))) {
          errorReporter.report(isNotEqualError ? new NotEqualExpressionsError(left, right, expr) : new TypeMismatchError(equality, result.type, expr));
          return null;
        }
        if (left instanceof ArrayExpression) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    } else if (ref instanceof AbstractedReferable) {
      Expression core = (Expression) substituteAbstractedExpression(((AbstractedReferable) ref).expression, LevelSubstitution.EMPTY, ((AbstractedReferable) ref).arguments, expr);
      return core == null ? null : new TypecheckingResult(core, core.getType());
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  public Type finalCheckType(Concrete.Expression expr, Expression expectedType, boolean propIfPossible) {
    Type result = checkType(expr, expectedType);
    if (result == null) return null;
    invokeDeferredMetas(null, null, false);
    LevelEquationsSolver levelSolver = myEquations.makeLevelEquationsSolver();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

    errorReporter.report(new GeneralError(GeneralError.Level.ERROR, "`StringTypechecker` not found!"));
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    Function<Expression, Pair<Expression,Boolean>> checker = type -> {
      if (!(type instanceof SigmaExpression)) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    Pair<Expression,Boolean> pair = checker.apply(expectedTypeNorm);
    if (pair != null) {
      return pair.proj1 == null ? null : new TypecheckingResult(pair.proj1, expectedType);
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    for (int i = 0; i < expr.getFields().size(); i++) {
      TypecheckingResult result = checkExpr(expr.getFields().get(i), null);
      if (result == null) return null;
      fields.add(result.expression);
      Sort sort = getSortOfType(result.type, expr);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    }
    if (typeCheckedBaseClass == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (classCall == null) {
      errorReporter.report(new TypecheckingError("Expected a class", expr.getBaseClassExpression()));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    List<Sort> sorts = new ArrayList<>(expr.getParameters().size());
    DependentLink args = visitSigmaParameters(expr.getParameters(), expectedType, sorts);
    if (args == null || !args.hasNext()) return null;
    Sort sort = generateUpperBound(sorts, expr);
    return checkResult(expectedType, new TypecheckingResult(new SigmaExpression(sort, args), new UniverseExpression(sort)), expr);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      TypecheckingResult result = typecheckLetClause(clause.getParameters(), clause, true);
      if (result == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        errorReporter.report(new TypeMismatchError(DocFactory.text("A sigma type"), exprResult.type, expr));
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (projExpr.getField() < 0) {
      errorReporter.report(new TypecheckingError("Index " + (projExpr.getField() +1) + " is too small; the lower bound of projection index is 1", projExpr));
      return null;
    }
    DependentLink fieldLink = DependentLink.Helper.get(sigmaParams, projExpr.getField());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (!fieldLink.hasNext()) {
      errorReporter.report(new TypecheckingError("Index " + (projExpr.getField() + 1) + " is out of range; the number of parameters is " + DependentLink.Helper.size(sigmaParams), projExpr));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    var pair2 = provider.coerce(newProvider -> {
      SingleDependentLink newPiParam = newProvider.nextParameter();
      if (newPiParam == null) return null;
      var pair = checker.apply(new Pair<>(newProvider, newPiParam));
      return new Pair<>(pair.proj1 == null ? null : pair.proj1.expression, pair.proj2);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    TResult result = visitReference(expr);
    if (result == null || !checkPath(result, expr)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  private TResult getLocalVar(Referable ref, Concrete.SourceNode sourceNode) {
    if (ref instanceof ErrorReference || !checkUnresolved(ref, sourceNode)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (def == null) {
      errorReporter.report(new IncorrectReferenceError(ref, sourceNode));
      return null;
    }
    Expression type = def.getTypeExpr();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (type == null) {
      errorReporter.report(new ReferenceTypeError(ref));
      return null;
    } else {
      return new TypecheckingResult(def instanceof TypedEvaluatingBinding ? ((TypedEvaluatingBinding) def).getExpression() : new ReferenceExpression(def), type);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  private Definition referableToDefinition(Referable referable, Concrete.SourceNode sourceNode) {
    if (referable == null || referable instanceof ErrorReference) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        errorReporter.report(new WrongReferable("Expected a definition", referable, sourceNode));
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (!stack.isEmpty()) {
      Pair<Expression,T> pair = checker.apply(curType);
      if (pair == null) return null;
      Expression curExpr = pair.proj1;
      if (curExpr == null) return new Pair<>(null, pair.proj2);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      return new Pair<>(new TypecheckingResult(stack.get(0), expectedType), pair.proj2);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
            }
            errorReporter.report(new FieldDependencyError(field, found, sourceNode));
            return null;
          }
          fieldSet.put(field, FieldCallExpression.make(field, renewExpr));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
                  if (classCall.getDefinition().getUniverseKind() != UniverseKind.NO_UNIVERSES && resultClassCall.getDefinition().getUniverseKind() != UniverseKind.NO_UNIVERSES && !resultClassCall.getLevels(classDef).compare(classCall.getLevels(classDef), CMP.EQ, myEquations, pair.proj2.implementation)) {
                    errorReporter.report(new TypeMismatchError(new ClassCallExpression(classDef, resultClassCall.getLevels(classDef)), classCall, pair.proj2.implementation));
                    return null;
                  }
                  for (ClassField field : classDef.getFields()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (sigma == null && classCall == null || sigma != null && DependentLink.Helper.size(sigma.getParameters()) != numberOfPatterns || notImplementedFields != null && notImplementedFields.size() != numberOfPatterns) {
      errorReporter.report(new TypeMismatchError("Cannot match an expression with the pattern", DocFactory.text(sigma == null && classCall == null ? "A sigma type or a record" : sigma != null ? "A sigma type with " + numberOfPatterns + " fields" : "A records with " + numberOfPatterns + " not implemented fields"), type, pattern));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      LetClausePattern letClausePattern = typecheckLetClausePattern(subPattern, unfolded.expression, unfolded.type, bindings);
      if (letClausePattern == null) {
        return null;
      }
      patterns.add(letClausePattern);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          Pair<HaveClause, Expression> pair = typecheckLetClause(clause, expr.isHave());
          if (pair == null) {
            return null;
          }
          if (clause.getPattern() instanceof Concrete.NamePattern) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
            LetClausePattern pattern = typecheckLetClausePattern(clause.getPattern(), new ReferenceExpression(pair.proj1), pair.proj2, definedBindings);
            if (pattern == null) {
              return null;
            }
            pair.proj1.setPattern(pattern);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        TypecheckingResult result = checkExpr(expr.getExpression(), expectedType);
        if (result == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
            if (binding != null) {
              errorReporter.report(new TypecheckingError("\\have bindings occur freely in the result type", expr));
              return null;
            }
            resultType = result.type;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

  private TypecheckingResult makeNew(TypecheckingResult result, Concrete.NewExpression expr, Expression expectedType, Set<ClassField> pseudoImplemented) {
    if (result == null) return null;
    Expression normExpr = result.expression.normalize(NormalizationMode.WHNF);
    ClassCallExpression classCallExpr = normExpr.cast(ClassCallExpression.class);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      return checkResult(expectedType, new TypecheckingResult(new NewExpression(null, classCallExpr), classCallExpr), expr);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        if (baseExpr instanceof Concrete.HoleExpression && !(unfoldedType instanceof ClassCallExpression)) {
          errorReporter.report(new TypecheckingError("Cannot infer an expression", baseExpr));
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          if (!ok) {
            errorReporter.report(new TypeMismatchError(unfoldedType, baseExpr, baseExpr));
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        exprResult = typecheckClassExt(classExpr instanceof Concrete.ClassExtExpression ? ((Concrete.ClassExtExpression) classExpr).getStatements() : Collections.emptyList(), null, expectedClassCall, pseudoImplemented, classExpr, true);
        if (exprResult == null) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
            : checkExpr(baseClassExpr, null);
      if (typeCheckedBaseClass == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        if (classCall == null) {
          errorReporter.report(new TypecheckingError("Expected a class or a class instance", baseClassExpr));
          return null;
        }
        renewExpr = typeCheckedBaseClass.expression;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (meta == null) {
      errorReporter.report(new TypecheckingError("Meta '" + refExpr.getReferent().getRefName() + "' is empty", refExpr));
      return null;
    }
    MetaTopDefinition def = metaRef.getTypechecked();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          }
          errorReporter.report(new TypecheckingError("Not enough arguments. Expected " + c + " more.", refExpr));
          return null;
        } else if (isExplicit && !arguments.get(i).isExplicit()) {
          errorReporter.report(new ArgumentExplicitnessError(true, refExpr));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          if (isTyped) {
            TypecheckingResult argResult = checkExpr(arguments.get(i).getExpression(), param.getTypeExpr().subst(substitution, levelSubst));
            if (argResult == null) return null;
            substitution.add(param, argResult.expression);
            arguments.set(i, new Concrete.Argument(new Concrete.ReferenceExpression(refExpr.getData(), new CoreReferable(null, argResult)), true));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    ContextData contextData = new ContextDataImpl(refExpr, arguments, coclauses, null, expectedType, null);
    if (!meta.checkContextData(contextData, errorReporter)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      errorReporter.report(new TypecheckingError("Meta '" + refExpr.getReferent().getRefName() + "' failed", refExpr));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      if (!(type instanceof ErrorExpression && ((ErrorExpression) type).isGoal())) {
        errorReporter.report(new TypecheckingError("\\level has wrong format", sourceNode));
        return null;
      }
      return -1;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        } else {
          pVar = pVar.max(sort.getPLevel().getVar());
          if (pVar == null) return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        } else {
          hVar = hVar.max(sort.getHLevel().getVar());
          if (hVar == null) return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    Expression curType = result.type;
    if (!(curType instanceof FunCallExpression && ((FunCallExpression) curType).getDefinition().getKind() == CoreFunctionDefinition.Kind.TYPE)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      curExpr = TypeDestructorExpression.match((FunCallExpression) curType, curExpr);
      if (curExpr == null) {
        return null;
      }
      curType = curExpr.getType().normalize(NormalizationMode.WHNF);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        SingleDependentLink link = visitTypeParameter(arg, sorts, null);
        if (link == null) {
          return null;
        }
        list.add(link);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java

      Type result = checkType(expr.getCodomain(), Type.OMEGA);
      if (result == null) return null;
      Sort codSort = result.getSortOfType();

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      result = myArgsInference.inferTail(result, expectedType, expr);
    }
    return result == null ? null : checkResult(expectedType, result.toResult(this), expr);
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      errorReporter.report(compareResult == null ? new TypeMismatchError(expectedType, result.type, expr) : new TypeMismatchWithSubexprError(compareResult, expr));
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  public TypecheckingResult visitBox(Concrete.BoxExpression expr, Expression expectedType) {
    TypecheckingResult result = checkExpr(expr.getExpression(), expectedType);
    if (result == null) return null;
    Expression typeType = result.type.getType();
    Expression expectedTypeType = new UniverseExpression(Sort.PROP);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      Sort sort = typeType.toSort();
      errorReporter.report(sort != null ? new TypecheckingError("The type of the expression should live in \\Prop, but lives in " + sort, expr) : new TypeMismatchError("The type of the expression does not live in \\Prop", expectedTypeType, typeType, expr));
      return null;
    }
    return new TypecheckingResult(BoxExpression.make(result.expression), result.type);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      assert false;
      errorReporter.report(new LocalError(GeneralError.Level.ERROR, "Incomplete expression"));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    }
    if (result == null) {
      return null;
    }
    if (result.expression instanceof Type) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
          errorReporter.report(new TypeMismatchError(DocFactory.text("\\Type"), type, expr));
        }
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  public TypecheckingResult visitThis(Concrete.ThisExpression expr, Expression expectedType) {
    errorReporter.report(new TypecheckingError("\\this expressions are allowed only in appropriate arguments of definitions and class extensions", expr));
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    boolean isOmega = expectedType instanceof Type && ((Type) expectedType).isOmega();
    if (expr.isErrorHole()) {
      return expectedType != null && !isOmega ? new TypecheckingResult(new ErrorExpression(expr.getError()), expectedType) : null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    } else {
      errorReporter.report(new ArgInferenceError(expression(), expr, new Expression[0]));
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        }
        if (!visitParameter((Concrete.TypeParameter) parameter, expectedType, resultSorts, list)) {
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      TypecheckingResult arg2 = checkExpr(expr.getArguments().get(1).getExpression(), ExpressionFactory.Nat());
      if (arg1 == null || arg2 == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    TResult result = myArgsInference.infer(expr, expectedType);
    if (result == null || !checkPath(result, expr)) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        Type type = checkType(letResult, Type.OMEGA);
        if (type == null) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    } else if (param instanceof Concrete.TypeParameter) {
      SingleDependentLink link = visitTypeParameter((Concrete.TypeParameter) param, null, null);
      return link == null ? null : bodyToLam(link, typecheckLetClause(parameters.subList(1, parameters.size()), letClause, false), letClause);
    } else {
      throw new IllegalStateException();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  public TypecheckingResult finalize(TypecheckingResult result, Concrete.SourceNode sourceNode, boolean propIfPossible) {
    if (result == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (expectedType == null && expr.getResultType() == null) {
      errorReporter.report(new CertainTypecheckingError(CertainTypecheckingError.Kind.CASE_RESULT_TYPE, expr));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        Expression argTypeExpr = argType == null ? null : argType.getExpr().subst(substitution);
        TypecheckingResult exprResult = checkExpr(caseArg.expression, argTypeExpr);
        if (exprResult == null) return null;
        if (caseArg.isElim && !(exprResult.expression instanceof ReferenceExpression)) {
          errorReporter.report(new TypecheckingError("Expected a variable", caseArg.expression));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        if (caseArg.isElim && !(exprResult.expression instanceof ReferenceExpression)) {
          errorReporter.report(new TypecheckingError("Expected a variable", caseArg.expression));
          return null;
        }
        if (argType == null && Prelude.ARRAY_CONS != null) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
            if (!CompareVisitor.compare(myEquations, CMP.EQ, actualArgType, argTypeExpr, Type.OMEGA, caseArg.type)) {
              errorReporter.report(new TypeMismatchError(actualArgType, argTypeExpr, caseArg.expression));
              return null;
            }
          }
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
            replaceWithReferables(notEliminated, context);
            errorReporter.report(new ElimSubstError(asRef, notEliminated, caseArg.expression));
            return null;
          }
          allowedBindings.add(origBinding);
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
      }
      if (resultType == null && expectedType == null) {
        return null;
      }
      resultExpr = resultType != null ? resultType.getExpr() : !(expectedType instanceof Type && ((Type) expectedType).isOmega()) ? checkedSubst(expectedType, elimSubst, allowedBindings, expr.getResultType() != null ? expr.getResultType() : expr) : new UniverseExpression(Sort.generateInferVars(myEquations, false, expr));
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    }
    if (clauses == null) {
      return null;
    }
    ElimBody elimBody = new ElimTypechecking(errorReporter, myEquations, resultExpr, PatternTypechecking.Mode.CASE, level, actualLevel, expr.isSCase(), expr.getClauses(), expr).typecheckElim(clauses, list.getFirst());
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    ElimBody elimBody = new ElimTypechecking(errorReporter, myEquations, resultExpr, PatternTypechecking.Mode.CASE, level, actualLevel, expr.isSCase(), expr.getClauses(), expr).typecheckElim(clauses, list.getFirst());
    if (elimBody == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    TypecheckingResult result = fieldSetClass.getDefinition().isGoodField(field) ? checkArgument(implBody, type, null, null) : checkExpr(implBody, type);
    if (result == null) {
      return null;
    }
    result.type = type;
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    TypecheckingResult result = checkExpr(expr.getExpression(), expr.isPEval() ? null : expectedType);
    if (result == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
        caseExpr != null ? "Expected an \\scase expression" :
          "Expected a function or an \\scase expression", expr.getExpression()));
      return null;
    }
    if (funCall != null && !(funCall.getDefinition().getActualBody() instanceof ElimBody || funCall.getDefinition().getActualBody() instanceof Expression)) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (funCall != null && !(funCall.getDefinition().getActualBody() instanceof ElimBody || funCall.getDefinition().getActualBody() instanceof Expression)) {
      errorReporter.report(new FunctionWithoutBodyError(funCall.getDefinition(), expr.getExpression()));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (normExpr == null) {
      errorReporter.report(new TypecheckingError("Expression does not evaluate", expr.getExpression()));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (typeType == null) {
      errorReporter.report(new TypecheckingError("Cannot infer the universe of the type of the expression", expr.getExpression()));
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  public TypecheckingResult visitApplyHole(Concrete.ApplyHoleExpression expr, Expression params) {
    errorReporter.report(new TypecheckingError("`__` not allowed here", expr));
    return null;
  }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    CallableDefinition definition = getTypeCheckedDefinition(resolvedDefinition, expr);
    if (definition == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  private SingleDependentLink visitTypeParameter(Concrete.TypeParameter param, List<Sort> sorts, Type expectedType) {
    Type argResult = checkType(param.getType(), Type.OMEGA);
    if (argResult == null) return null;
    if (expectedType != null) {
      Expression expected = expectedType.getExpr().normalize(NormalizationMode.WHNF).getUnderlyingExpression();
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (!(typeCheckedDefinition instanceof CallableDefinition)) {
      errorReporter.report(new IncorrectReferenceError(definition, expr));
      return null;
    }
    if (!typeCheckedDefinition.status().headerIsOK()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
    if (!typeCheckedDefinition.status().headerIsOK()) {
      errorReporter.report(new HasErrors(GeneralError.Level.ERROR, definition, expr));
      return null;
    } else {
      if (typeCheckedDefinition.status().hasDepErrors()) {
```

### ReturnNull
Return of `null`
in `base/src/main/java/org/arend/typechecking/visitor/CheckTypeVisitor.java`
#### Snippet
```java
  public TypecheckingResult visitProj(Concrete.ProjExpression expr, Expression expectedType) {
    TypecheckingResult exprResult = checkExpr(expr.expression, null);
    if (exprResult == null) return null;
    exprResult.type = exprResult.type.normalize(NormalizationMode.WHNF);

```

## RuleId[id=AssignmentToLambdaParameter]
### AssignmentToLambdaParameter
Assignment to lambda parameter `map`
in `base/src/main/java/org/arend/naming/scope/CachingScope.java`
#### Snippet
```java
    scope.find(ref -> {
      myElements.compute(ref.getRefKind(), (k, map) -> {
        if (map == null) map = new LinkedHashMap<>();
        map.putIfAbsent(ref instanceof ModuleReferable ? ((ModuleReferable) ref).path.getLastName() : ref.textRepresentation(), ref);
        return map;
```

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `api/src/main/java/org/arend/ext/core/ops/SubstitutionPair.java`
#### Snippet
```java
import org.arend.ext.core.context.CoreBinding;

public class SubstitutionPair {
  public final CoreBinding binding;
  public final ConcreteExpression expression;
```

### ClassCanBeRecord
Class can be a record
in `api/src/main/java/org/arend/ext/error/quickFix/RemoveErrorQuickFix.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class RemoveErrorQuickFix implements ErrorQuickFix {
  private final String message;

```

### ClassCanBeRecord
Class can be a record
in `api/src/main/java/org/arend/ext/instance/SubclassSearchParameters.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class SubclassSearchParameters implements InstanceSearchParameters {
  public final CoreClassDefinition classDefinition;

```

### ClassCanBeRecord
Class can be a record
in `api/src/main/java/org/arend/ext/typechecking/GoalSolver.java`
#### Snippet
```java
 */
public interface GoalSolver {
  class CheckGoalResult {
    public final @Nullable ConcreteExpression concreteExpression;
    public final @Nullable TypedExpression typedExpression;
```

### ClassCanBeRecord
Class can be a record
in `cli/src/main/java/org/arend/frontend/repl/jline/ArendReplParser.java`
#### Snippet
```java

public class ArendReplParser implements Parser {
  public static final class ArendParsedLine implements CompletingParsedLine {
    private final int wordCursor;
    private final @NotNull List<@NotNull String> words;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/core/definition/CoerceData.java`
#### Snippet
```java
  public interface Key {}

  public static class DefinitionKey implements Key {
    public final Definition definition;

```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/core/pattern/ConstructorExpressionPattern.java`
#### Snippet
```java
  }

  private static class ArrayData {
    final FunCallExpression funCall;
    final Boolean isEmpty;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/util/Version.java`
#### Snippet
```java
import java.util.Objects;

public class Version implements Comparable<Version> {
  public final BigInteger major;
  public final BigInteger minor;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/util/Wrapper.java`
#### Snippet
```java
package org.arend.util;

public class Wrapper<T> {
  public final T element;

```

### ClassCanBeRecord
Class can be a record
in `cli/src/main/java/org/arend/frontend/parser/BuildVisitor.java`
#### Snippet
```java
  }

  private static class PrecedenceWithoutPriority {
    private final Precedence.Associativity associativity;
    private final boolean isInfix;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/naming/binOp/MetaBinOpParser.java`
#### Snippet
```java
 */
public class MetaBinOpParser {
  public static final class ResolvedReference {
    public final Concrete.ReferenceExpression refExpr;
    public final UnresolvedReference originalReference;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/naming/reference/AbstractedReferable.java`
#### Snippet
```java
import java.util.List;

public class AbstractedReferable implements Referable {
  public final AbstractedExpression expression;
  public final List<? extends ConcreteExpression> arguments;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/library/LibraryDependency.java`
#### Snippet
```java
import java.util.Objects;

public class LibraryDependency implements Comparable<LibraryDependency> {
  public final @NotNull String name;

```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/TypecheckingContext.java`
#### Snippet
```java
import java.util.Map;

public class TypecheckingContext {
  public final Map<Referable, Binding> localContext;
  public final GlobalInstancePool instancePool;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/term/concrete/Concrete.java`
#### Snippet
```java
  }

  public static class ExternalParameters {
    public final List<? extends Concrete.Parameter> parameters;
    public final LevelParameters pLevelParameters;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java
  }

  private static class MyHeader implements Element {
    final Concrete.ResolvableDefinition definition;

```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java
  }

  private static class MyUnit implements Element {
    final Concrete.ResolvableDefinition definition;
    final boolean withLoops;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java
  }

  private static class MyClass implements Element {
    private final Concrete.ClassDefinition definition;

```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/order/listener/CollectingOrderingListener.java`
#### Snippet
```java
  }

  private static class MyDefinitions implements Element {
    enum Kind { CYCLE, PRE_BODIES, BODIES, USE }

```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/instance/pool/RecursiveInstanceData.java`
#### Snippet
```java
import org.arend.naming.reference.TCDefReferable;

public class RecursiveInstanceData {
  public final TCDefReferable instanceRef;
  public final TCDefReferable classRef;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/instance/pool/LocalInstancePool.java`
#### Snippet
```java

public class LocalInstancePool implements InstancePool {
  static class InstanceData {
    final Expression key;
    final ClassDefinition classDef;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/patternmatching/Util.java`
#### Snippet
```java
  }

  public static class PatternClauseElem implements ClauseElem {
    public final ExpressionPattern pattern;

```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/patternmatching/ExpressionMatcher.java`
#### Snippet
```java
  }

  public static class MatchResult {
    public final Expression expression;
    public final Pattern pattern;
```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/doubleChecker/CoreExpressionChecker.java`
#### Snippet
```java
  }

  private static class MyErrorReporter implements ErrorReporter {
    final Expression errorExpr;

```

### ClassCanBeRecord
Class can be a record
in `base/src/main/java/org/arend/typechecking/visitor/DefinitionTypechecker.java`
#### Snippet
```java
  }

  private static class LocalInstance {
    final ClassCallExpression classCall;
    final ClassField instanceField;
```

