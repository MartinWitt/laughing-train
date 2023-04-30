# NullAway 
 
# Bad smells
I found 281 bad smells with 62 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 32 | false |
| AssignmentToMethodParameter | 28 | false |
| SizeReplaceableByIsEmpty | 19 | true |
| UtilityClassWithoutPrivateConstructor | 19 | true |
| EmptyMethod | 14 | false |
| MissortedModifiers | 12 | false |
| RedundantFieldInitialization | 10 | false |
| UnnecessaryToStringCall | 10 | true |
| DataFlowIssue | 8 | false |
| DynamicRegexReplaceableByCompiledPattern | 8 | false |
| UnnecessaryFullyQualifiedName | 8 | false |
| SystemOutErr | 7 | false |
| RedundantSuppression | 6 | false |
| ReturnNull | 6 | false |
| NullableProblems | 5 | false |
| ConstantValue | 5 | false |
| UnnecessaryLocalVariable | 5 | true |
| AbstractClassNeverImplemented | 4 | false |
| CodeBlock2Expr | 4 | true |
| OptionalIsPresent | 4 | false |
| StringOperationCanBeSimplified | 4 | false |
| Convert2MethodRef | 4 | false |
| DuplicateBranchesInSwitch | 3 | false |
| OptionalAssignedToNull | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| UnnecessaryModifier | 2 | true |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| RegExpRedundantEscape | 2 | false |
| StaticPseudoFunctionalStyleMethod | 2 | false |
| KeySetIterationMayUseEntrySet | 2 | false |
| DuplicateExpressions | 2 | false |
| IgnoreResultOfCall | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| NestedAssignment | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| IOResource | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| AbstractMethodCallInConstructor | 2 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| NonProtectedConstructorInAbstractClass | 2 | true |
| UnnecessaryContinue | 2 | false |
| NonShortCircuitBoolean | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| GroovyUnusedAssignment | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| StringEqualsEmptyString | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| UseCompareMethod | 1 | false |
| PointlessBooleanExpression | 1 | true |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
   */
  public interface SubNodeValues {
    public Nullness valueOfSubNode(Node node);
  }

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `nullaway/src/main/java/com/uber/nullaway/handlers/Handler.java`
#### Snippet
```java
   * their knowledge of the method return nullability to the rest of NullAway.
   */
  public enum NullnessHint {
    /**
     * No new information about return nullability, defer to the core algorithm and other handlers.
```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `DEBUG` from instance context
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
      boolean vbs)
      throws IOException, ClassHierarchyException {
    DEBUG = dbg;
    VERBOSE = vbs;
    this.annotateBytecode = annotateBytecode;
```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `VERBOSE` from instance context
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
      throws IOException, ClassHierarchyException {
    DEBUG = dbg;
    VERBOSE = vbs;
    this.annotateBytecode = annotateBytecode;
    this.stripJarSignatures = stripJarSignatures;
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `c`
in `nullaway/src/main/java/com/uber/nullaway/handlers/ApacheThriftIsSetHandler.java`
#### Snippet
```java
  private static String decapitalize(String str) {
    // assumes str is non-null and non-empty
    char c[] = str.toCharArray();
    c[0] = Character.toLowerCase(c[0]);
    return new String(c);
```

### CStyleArrayDeclaration
C-style array declaration of parameter `arg`
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Toys.java`
#### Snippet
```java
  }

  public static void main(String arg[]) throws java.io.IOException {
    String s = "test string...";
    Foo f = new Foo("let's");
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\$` in RegExp
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
      "(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?";
  private static final String DIGEST_ENTRY_PATTERN =
      "Name: [A-Za-z0-9/\\$\\n\\s\\-\\.]+[A-Za-z0-9]\\nSHA-256-Digest: " + BASE64_PATTERN;

  private static boolean annotationsShouldBeVisible(String nullableDesc) {
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
      "(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?";
  private static final String DIGEST_ENTRY_PATTERN =
      "Name: [A-Za-z0-9/\\$\\n\\s\\-\\.]+[A-Za-z0-9]\\nSHA-256-Digest: " + BASE64_PATTERN;

  private static boolean annotationsShouldBeVisible(String nullableDesc) {
```

## RuleId[id=StaticPseudoFunctionalStyleMethod]
### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
      final String replacement =
          "@SuppressWarnings({"
              + Joiner.on(',').join(Iterables.transform(suppressions, s -> '"' + s + '"'))
              + "}) "
              + config.getAutofixSuppressionComment();
```

### StaticPseudoFunctionalStyleMethod
Pseudo functional style code
in `nullaway/src/main/java/com/uber/nullaway/AbstractConfig.java`
#### Snippet
```java
    String choiceRegexp =
        Joiner.on("|")
            .join(Iterables.transform(packagePrefixes, input -> input.replaceAll("\\.", "\\\\.")));
    return Pattern.compile("^(?:" + choiceRegexp + ")(?:\\..*)?");
  }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `contents.keySet()` may be replaced with 'entrySet()' iteration
in `nullaway/src/main/java/com/uber/nullaway/dataflow/NullnessStore.java`
#### Snippet
```java
      Map<LocalVariableNode, LocalVariableNode> localVarTranslations) {
    NullnessStore.Builder nullnessBuilder = NullnessStore.empty().toBuilder();
    for (AccessPath ap : contents.keySet()) {
      Element element = ap.getRoot();
      if (element == null) {
```

### KeySetIterationMayUseEntrySet
Iteration over `localVarTranslations.keySet()` may be replaced with 'entrySet()' iteration
in `nullaway/src/main/java/com/uber/nullaway/dataflow/NullnessStore.java`
#### Snippet
```java
        continue;
      }
      for (LocalVariableNode fromVar : localVarTranslations.keySet()) {
        if (element.equals(fromVar.getElement())) {
          LocalVariableNode toVar = localVarTranslations.get(fromVar);
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `nullaway/src/main/java/com/uber/nullaway/Nullness.java`
#### Snippet
```java
        return NULLABLE;
      case NONNULL:
        return NULLABLE;
      case NULL:
        return NONNULL;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
        break;
      case WRONG_OVERRIDE_RETURN:
        builder = addSuppressWarningsFix(suggestTree, builder, suppressionName);
        break;
      case WRONG_OVERRIDE_PARAM:
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
        break;
      case WRONG_OVERRIDE_PARAM:
        builder = addSuppressWarningsFix(suggestTree, builder, suppressionName);
        break;
      case METHOD_NO_INIT:
```

## RuleId[id=DuplicateExpressions]
### DuplicateExpressions
Multiple occurrences of `Paths.get(uri)`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
    if ("jimfs".equals(uri.getScheme())) {
      // In NullAway unit tests, files are stored in memory and have this scheme.
      return Paths.get(uri);
    }
    if (!"file".equals(uri.getScheme())) {
```

### DuplicateExpressions
Multiple occurrences of `Paths.get(uri)`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
      return null;
    }
    Path path = Paths.get(uri);
    try {
      return path.toRealPath();
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `sample/src/main/java/org/utilities/StringUtils.java`
#### Snippet
```java

  public static boolean isEmptyOrNull(@Nullable final CharSequence value) {
    return value == null || value.length() == 0;
  }
}
```

### SizeReplaceableByIsEmpty
`str.length() > 0` can be replaced with '!str.isEmpty()'
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Foo.java`
#### Snippet
```java

  public boolean run(@ExpectNonnull String str) {
    if (str.length() > 0) {
      return str.equals(foo);
    }
```

### SizeReplaceableByIsEmpty
`symbol.getParameters().length() == 0` can be replaced with 'symbol.getParameters().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/handlers/ApacheThriftIsSetHandler.java`
#### Snippet
```java
        && symbol.getSimpleName().toString().startsWith("isSet")
        // weeds out the isSet() method in TBase itself
        && symbol.getParameters().length() == 0
        && types.isSubtype(symbol.owner.type, tbaseType.get());
  }
```

### SizeReplaceableByIsEmpty
`capPropName.length() > 0` can be replaced with '!capPropName.isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/handlers/ApacheThriftIsSetHandler.java`
#### Snippet
```java
      // remove "isSet"
      String capPropName = methodName.substring(5);
      if (capPropName.length() > 0) {
        // build access paths for the getter and the field access, and
        // make them nonnull in the thenUpdates
```

### SizeReplaceableByIsEmpty
`((ExecutableElement) element).getParameters().size() != 0` can be replaced with '!((ExecutableElement) element).getParameters().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/handlers/StreamNullabilityPropagator.java`
#### Snippet
```java
            continue;
          }
          if (((ExecutableElement) element).getParameters().size() != 0) {
            // Methods that take parameters might have return values that don't depend only on this
            // and the AP
```

### SizeReplaceableByIsEmpty
`symbol.getParameters().length() == 0` can be replaced with 'symbol.getParameters().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/handlers/OptionalEmptinessHandler.java`
#### Snippet
```java
    Preconditions.checkNotNull(optionalTypes);
    if (!(symbol.getSimpleName().toString().equals(methodName)
        && symbol.getParameters().length() == 0)) {
      return false;
    }
```

### SizeReplaceableByIsEmpty
`((ClassTree) tree).getSimpleName().length() != 0` can be replaced with '!((ClassTree) tree).getSimpleName().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
  private static boolean canHaveSuppressWarningsAnnotation(Tree tree) {
    return tree instanceof MethodTree
        || (tree instanceof ClassTree && ((ClassTree) tree).getSimpleName().length() != 0)
        || tree instanceof VariableTree;
  }
```

### SizeReplaceableByIsEmpty
`invocation.getArguments().size() == 0` can be replaced with 'invocation.getArguments().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java`
#### Snippet
```java
      AccessPathElement accessPathElement;
      MethodAccessNode accessNode = invocation.getTarget();
      if (invocation.getArguments().size() == 0) {
        Symbol.MethodSymbol symbol = ASTHelpers.getSymbol(invocation.getTree());
        if (symbol.isStatic()) {
```

### SizeReplaceableByIsEmpty
`autofixSuppressionComment.trim().length() > 0` can be replaced with '!autofixSuppressionComment.trim().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/AbstractConfig.java`
#### Snippet
```java
  @Override
  public String getAutofixSuppressionComment() {
    if (autofixSuppressionComment.trim().length() > 0) {
      return "/* " + autofixSuppressionComment + " */ ";
    } else {
```

### SizeReplaceableByIsEmpty
`lhsTypeArgument.getTypeArguments().length() > 0` can be replaced with '!lhsTypeArgument.getTypeArguments().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
      }
      // nested generics
      if (lhsTypeArgument.getTypeArguments().length() > 0) {
        if (!compareNullabilityAnnotations(
            (Type.ClassType) lhsTypeArgument, (Type.ClassType) rhsTypeArgument)) {
```

### SizeReplaceableByIsEmpty
`varargsElementType.getTypeArguments().size() > 0` can be replaced with '!varargsElementType.getTypeArguments().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
          (Type.ArrayType) formalParams.get(formalParams.size() - 1).type;
      Type varargsElementType = varargsArrayType.elemtype;
      if (varargsElementType.getTypeArguments().size() > 0) {
        for (int i = formalParams.size() - 1; i < actualParams.size(); i++) {
          Type actualParameter = getTreeType(actualParams.get(i));
```

### SizeReplaceableByIsEmpty
`typeArguments.size() == 0` can be replaced with 'typeArguments.isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
    }
    List<? extends Tree> typeArguments = tree.getTypeArguments();
    if (typeArguments.size() == 0) {
      return;
    }
```

### SizeReplaceableByIsEmpty
`currentTypeArgType.getTypeArguments().size() > 0` can be replaced with '!currentTypeArgType.getTypeArguments().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
          new TypeMetadata(new TypeMetadata.Annotations(nullableAnnotationCompound));
      Type currentTypeArgType = castToNonNull(ASTHelpers.getType(curTypeArg));
      if (currentTypeArgType.getTypeArguments().size() > 0) {
        // nested generic type; recursively preserve its nullability type argument annotations
        currentTypeArgType = typeWithPreservedAnnotations((ParameterizedTypeTree) curTypeArg);
```

### SizeReplaceableByIsEmpty
`tryTree.getCatches().size() == 0` can be replaced with 'tryTree.getCatches().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
      if (stmt.getKind().equals(Tree.Kind.TRY)) {
        TryTree tryTree = (TryTree) stmt;
        if (tryTree.getCatches().size() == 0) {
          if (tryTree.getBlock() != null) {
            result.addAll(getSafeInitMethods(tryTree.getBlock(), classSymbol, state));
```

### SizeReplaceableByIsEmpty
`statements.size() > 0` can be replaced with '!statements.isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
    BlockTree body = constructor.getBody();
    List<? extends StatementTree> statements = body.getStatements();
    if (statements.size() > 0) {
      StatementTree statementTree = statements.get(0);
      if (isThisCall(statementTree, state)) {
```

### SizeReplaceableByIsEmpty
`constructor.getParameters().size() == 0` can be replaced with 'constructor.getParameters().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
        continue;
      }
      if (constructor.getParameters().size() == 0
          && (isExternalInitClass
              || symbolHasExternalInitAnnotation(ASTHelpers.getSymbol(constructor)))) {
```

### SizeReplaceableByIsEmpty
`actualParams.size() > 0` can be replaced with '!actualParams.isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
    }
    List<? extends ExpressionTree> actualParams = tree.getArguments();
    if (tree.getClassBody() != null && actualParams.size() > 0) {
      // passing parameters to constructor of anonymous class
      // this constructor just invokes the constructor of the superclass, and
```

### SizeReplaceableByIsEmpty
`tryTree.getCatches().size() == 0` can be replaced with 'tryTree.getCatches().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
          // ToDo: Should we check initialization inside tryTree.getResources ? What is the scope of
          // that initialization?
          if (tryTree.getCatches().size() == 0) {
            if (tryTree.getBlock() != null) {
              resultBuilder.addAll(
```

### SizeReplaceableByIsEmpty
`lhsType.getTypeArguments().length() > 0` can be replaced with '!lhsType.getTypeArguments().isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
    }
    // generics check
    if (lhsType != null && lhsType.getTypeArguments().length() > 0) {
      new GenericsChecks(state, config, this).checkTypeParameterNullnessForAssignability(tree);
    }
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `shouldFilter |= h.includeApInfoInSavedContext(accessPath, state)`
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
    boolean shouldFilter = false;
    for (Handler h : handlers) {
      shouldFilter |= h.includeApInfoInSavedContext(accessPath, state);
    }
    return shouldFilter;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `MethodClassAndName` has no concrete subclass
in `nullaway/src/main/java/com/uber/nullaway/AbstractConfig.java`
#### Snippet
```java

  @AutoValue
  abstract static class MethodClassAndName {

    static MethodClassAndName create(String enclosingClass, String methodName) {
```

### AbstractClassNeverImplemented
Abstract class `AnalysisParams` has no concrete subclass
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java

  @AutoValue
  abstract static class AnalysisParams {

    private static AnalysisParams create(
```

### AbstractClassNeverImplemented
Abstract class `CfgParams` has no concrete subclass
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java

  @AutoValue
  abstract static class CfgParams {
    // Should not be used for hashCode or equals
    private @Nullable ProcessingEnvironment environment;
```

### AbstractClassNeverImplemented
Abstract class `FieldInitEntities` has no concrete subclass
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java

  @AutoValue
  abstract static class FieldInitEntities {

    static FieldInitEntities create(
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Size`
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
  }

  static void testSort(List<Integer> intList, List<Size> sizeList) {
    Collections.sort(
        intList,
```

### BoundedWildcard
Can generalize to `? extends LocalVariableNode`
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractNullnessStoreInitializer.java`
#### Snippet
```java
  public NullnessStore getInitialStore(
      UnderlyingAST underlyingAST,
      List<LocalVariableNode> parameters,
      Handler handler,
      Context context,
```

### BoundedWildcard
Can generalize to `? extends MaplikeMethodRecord`
in `nullaway/src/main/java/com/uber/nullaway/handlers/stream/StreamTypeRecord.java`
#### Snippet
```java
      ImmutableSet<String> filterMethodSigs,
      ImmutableSet<String> filterMethodSimpleNames,
      ImmutableMap<String, MaplikeMethodRecord> mapMethodSigToRecord,
      ImmutableMap<String, MaplikeMethodRecord> mapMethodSimpleNameToRecord,
      ImmutableSet<String> passthroughMethodSigs,
```

### BoundedWildcard
Can generalize to `? extends MaplikeMethodRecord`
in `nullaway/src/main/java/com/uber/nullaway/handlers/stream/StreamTypeRecord.java`
#### Snippet
```java
      ImmutableSet<String> filterMethodSimpleNames,
      ImmutableMap<String, MaplikeMethodRecord> mapMethodSigToRecord,
      ImmutableMap<String, MaplikeMethodRecord> mapMethodSimpleNameToRecord,
      ImmutableSet<String> passthroughMethodSigs,
      ImmutableSet<String> passthroughMethodSimpleNames) {
```

### BoundedWildcard
Can generalize to `? extends StreamTypeRecord`
in `nullaway/src/main/java/com/uber/nullaway/handlers/StreamNullabilityPropagator.java`
#### Snippet
```java
  private final ImmutableList<StreamTypeRecord> models;

  StreamNullabilityPropagator(ImmutableList<StreamTypeRecord> models) {
    super();
    this.models = models;
```

### BoundedWildcard
Can generalize to `? super Node`
in `nullaway/src/main/java/com/uber/nullaway/handlers/OptionalEmptinessHandler.java`
#### Snippet
```java

  private void handleBooleanAssertionOnMethod(
      Consumer<Node> nonNullMarker,
      Types types,
      MethodInvocationNode node,
```

### BoundedWildcard
Can generalize to `? super Integer`
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParams.java`
#### Snippet
```java

  private void checkForUseOfParams(
      Set<Integer> derefedParamList, int numParam, int firstParamIndex, ISSABasicBlock node) {
    if (!node.isEntryBlock() && !node.isExitBlock()) { // entry and exit are dummy basic blocks
      LOG(DEBUG, "DEBUG", ">> bb: " + node.getNumber());
```

### BoundedWildcard
Can generalize to `? extends AnnotationNode`
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
  }

  private static boolean listHasNullnessAnnotations(List<AnnotationNode> annotationList) {
    if (annotationList != null) {
      for (AnnotationNode node : annotationList) {
```

### BoundedWildcard
Can generalize to `? extends LocalVariableNode`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/NullnessStore.java`
#### Snippet
```java
   */
  public NullnessStore uprootAccessPaths(
      Map<LocalVariableNode, LocalVariableNode> localVarTranslations) {
    NullnessStore.Builder nullnessBuilder = NullnessStore.empty().toBuilder();
    for (AccessPath ap : contents.keySet()) {
```

### BoundedWildcard
Can generalize to `? extends LocalVariableNode`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/NullnessStore.java`
#### Snippet
```java
   */
  public NullnessStore uprootAccessPaths(
      Map<LocalVariableNode, LocalVariableNode> localVarTranslations) {
    NullnessStore.Builder nullnessBuilder = NullnessStore.empty().toBuilder();
    for (AccessPath ap : contents.keySet()) {
```

### BoundedWildcard
Can generalize to `? super AccessPath`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/NullnessStore.java`
#### Snippet
```java
   * @return NullnessStore containing only AccessPaths that pass the predicate
   */
  public NullnessStore filterAccessPaths(Predicate<AccessPath> pred) {
    return new NullnessStore(
        contents.entrySet().stream()
```

### BoundedWildcard
Can generalize to `? extends Handler`
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
  private final List<Handler> handlers;

  CompositeHandler(ImmutableList<Handler> handlers) {
    // Attach default handlers
    this.handlers = handlers;
```

### BoundedWildcard
Can generalize to `? extends Symbol`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
      VisitorState state,
      Description.Builder descriptionBuilder,
      ImmutableList<Symbol> nonNullFields) {
    // Check needed here, despite check in hasPathSuppression because initialization
    // checking happens at the class-level (meaning state.getPath() might not include the
```

### BoundedWildcard
Can generalize to `? super MethodRef`
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java

    private <T> NameIndexedMap<T> makeOptimizedLookup(
        Names names, Set<MethodRef> refs, Function<MethodRef, T> getValForRef) {
      Map<Name, Map<MethodRef, T>> nameMapping = new LinkedHashMap<>();
      for (MethodRef ref : refs) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java

    private <T> NameIndexedMap<T> makeOptimizedLookup(
        Names names, Set<MethodRef> refs, Function<MethodRef, T> getValForRef) {
      Map<Name, Map<MethodRef, T>> nameMapping = new LinkedHashMap<>();
      for (MethodRef ref : refs) {
```

### BoundedWildcard
Can generalize to `? extends ImmutableSet`
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java

    private ImmutableSet<Integer> lookupImmutableSet(
        Symbol.MethodSymbol symbol, NameIndexedMap<ImmutableSet<Integer>> lookup) {
      ImmutableSet<Integer> result = lookup.get(symbol);
      return (result == null) ? ImmutableSet.of() : result;
```

### BoundedWildcard
Can generalize to `? extends Node`
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
  private static Iterable<AccessPath> accessPathsAtIndexes(
      Set<Integer> indexes,
      List<Node> arguments,
      VisitorState state,
      AccessPath.AccessPathContext apContext) {
```

### BoundedWildcard
Can generalize to `? extends Map`
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
      private final Map<Name, Map<MethodRef, T>> state;

      NameIndexedMap(Map<Name, Map<MethodRef, T>> state) {
        this.state = state;
      }
```

### BoundedWildcard
Can generalize to `? extends JavaFileObject`
in `jmh/src/main/java/com/uber/nullaway/jmh/NullawayJavac.java`
#### Snippet
```java
   */
  private NullawayJavac(
      List<JavaFileObject> compilationUnits,
      String annotatedPackages,
      @Nullable String classpath,
```

### BoundedWildcard
Can generalize to `? extends T`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/XMLUtil.java`
#### Snippet
```java
    final Class<T> klass;

    DefaultXMLValueProvider(@Nullable Object value, Class<T> klass) {
      this.klass = klass;
      if (value == null) {
```

### BoundedWildcard
Can generalize to `? extends NullnessStore`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
  Nullness returnValueNullness(
      MethodInvocationNode node,
      TransferInput<Nullness, NullnessStore> input,
      NullnessHint returnValueNullnessHint) {
    // NULLABLE is our default
```

### BoundedWildcard
Can generalize to `? extends Type`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
  private boolean isCallToMethod(
      MethodInvocationNode invocationNode,
      Supplier<Type> containingTypeSupplier,
      String methodName) {
    Symbol.MethodSymbol symbol = ASTHelpers.getSymbol(invocationNode.getTree());
```

### BoundedWildcard
Can generalize to `? extends NullnessStore`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java

  private TransferResult<Nullness, NullnessStore> updateRegularStore(
      Nullness value, TransferInput<Nullness, NullnessStore> input, ReadableUpdates updates) {
    ResultingStore newStore = updateStore(input.getRegularStore(), updates);
    return new RegularTransferResult<>(value, newStore.store, newStore.storeChanged);
```

### BoundedWildcard
Can generalize to `? extends NullnessStore`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java

  private TransferResult<Nullness, NullnessStore> noStoreChanges(
      Nullness value, TransferInput<Nullness, NullnessStore> input) {
    return new RegularTransferResult<>(value, input.getRegularStore());
  }
```

### BoundedWildcard
Can generalize to `? extends NullnessStore`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
      LocalVariableNode lhs,
      Node rhs,
      TransferInput<Nullness, NullnessStore> input,
      ReadableUpdates updates) {
    if (isEnhancedForIteratorVariable(lhs)) {
```

### BoundedWildcard
Can generalize to `? extends Node`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
      MethodInvocationNode node,
      Symbol.MethodSymbol callee,
      List<Node> arguments,
      AccessPathNullnessPropagation.SubNodeValues inputs,
      AccessPathNullnessPropagation.Updates thenUpdates,
```

### BoundedWildcard
Can generalize to `? super MethodInvocationNode`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
  public AccessPathNullnessPropagation(
      Nullness defaultAssumption,
      Predicate<MethodInvocationNode> methodReturnsNonNull,
      VisitorState state,
      AccessPath.AccessPathContext apContext,
```

### BoundedWildcard
Can generalize to `? extends Symbol.VarSymbol`
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
   */
  public void compareGenericTypeParameterNullabilityForCall(
      List<Symbol.VarSymbol> formalParams,
      List<? extends ExpressionTree> actualParams,
      boolean isVarArgs) {
```

### BoundedWildcard
Can generalize to `? extends Symbol`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
   */
  private Set<Symbol> notAssignedInAnyInitializer(
      FieldInitEntities entities, Set<Symbol> notInitializedInConstructors, VisitorState state) {
    Trees trees = getTreesInstance(state);
    Symbol.ClassSymbol classSymbol = entities.classSymbol();
```

### BoundedWildcard
Can generalize to `? extends VarSymbol`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
   */
  private Description checkParamOverriding(
      List<VarSymbol> overridingParamSymbols,
      Symbol.MethodSymbol overriddenMethod,
      @Nullable LambdaExpressionTree lambdaExpressionTree,
```

### BoundedWildcard
Can generalize to `? extends Element`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
      VisitorState state,
      Trees trees,
      Set<Element> safeInitMethods,
      AccessPathNullnessAnalysis nullnessAnalysis,
      ImmutableSet.Builder<Element> guaranteedNonNullBuilder) {
```

### BoundedWildcard
Can generalize to `? super Element`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
      Set<Element> safeInitMethods,
      AccessPathNullnessAnalysis nullnessAnalysis,
      ImmutableSet.Builder<Element> guaranteedNonNullBuilder) {
    for (Element invoked : safeInitMethods) {
      Tree invokedTree = trees.getTree(invoked);
```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `test-java-lib/src/main/java/com/uber/lib/CFNullableStuff.java`
#### Snippet
```java
  }

  public @Nullable Object f;
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.checkerframework.checker.nullness.qual.Nullable'
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedGenericContainer.java`
#### Snippet
```java
public class RestrictivelyAnnotatedGenericContainer<T> {

  public @Nullable T field;

  public RestrictivelyAnnotatedGenericContainer() {}
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/out/ClassAndMemberInfo.java`
#### Snippet
```java
  @Nullable private Symbol.ClassSymbol clazz;

  public ClassAndMemberInfo(TreePath path) {
    Preconditions.checkNotNull(path);
    this.path = path;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `test-java-lib-lombok/src/main/java/com/uber/lombok/LombokDTO.java`
#### Snippet
```java
  private String field;
  @Builder.Default private String fieldWithDefault = "Default";
  @Nullable private String nullableField;
}

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `jmh/src/main/java/com/uber/nullaway/jmh/NullawayJavac.java`
#### Snippet
```java
  private List<JavaFileObject> compilationUnits;
  private JavaCompiler compiler;
  @Nullable private DiagnosticListener<JavaFileObject> diagnosticListener;
  private StandardJavaFileManager fileManager;
  private List<String> options;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `public static @RecentlyNullable`
in `test-java-lib/src/main/java/com/uber/lib/unannotated/AndroidRecentlyAnnotatedClass.java`
#### Snippet
```java
public class AndroidRecentlyAnnotatedClass {

  public static @RecentlyNullable Object returnsNull() {
    return null;
  }
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/handlers/stream/StreamModelBuilder.java`
#### Snippet
```java

  private final List<StreamTypeRecord> typeRecords = new ArrayList<>();
  private @Nullable TypePredicate tp = null;
  private ImmutableSet.Builder<String> filterMethodSigs;
  private ImmutableSet.Builder<String> filterMethodSimpleNames;
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractHandler.java`
#### Snippet
```java
  // Cached on visiting the top-level class and used for onCFGBuildPhase1AfterVisitMethodInvocation,
  // where no VisitorState is otherwise available.
  private @Nullable VisitorState storedVisitorState;

  private @Nullable TypeMirror runtimeExceptionType;
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractHandler.java`
#### Snippet
```java
  private final Config config;

  private @Nullable NullAway analysis;

  // Cached on visiting the top-level class and used for onCFGBuildPhase1AfterVisitMethodInvocation,
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractHandler.java`
#### Snippet
```java
  private @Nullable VisitorState storedVisitorState;

  private @Nullable TypeMirror runtimeExceptionType;

  public ContractHandler(Config config) {
```

### MissortedModifiers
Missorted modifiers `public @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathElement.java`
#### Snippet
```java
  }

  public @Nullable ImmutableList<String> getConstantArguments() {
    return this.constantArguments;
  }
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/handlers/OptionalEmptinessHandler.java`
#### Snippet
```java

  @Nullable private ImmutableSet<Type> optionalTypes;
  private @Nullable NullAway analysis;

  private final Config config;
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/NullabilityUtil.java`
#### Snippet
```java
   *     annotation is not present.
   */
  public static @Nullable Set<String> getAnnotationValueArray(
      Symbol.MethodSymbol methodSymbol, String annotName, boolean exactMatch) {
    AnnotationMirror annot = null;
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/NullabilityUtil.java`
#### Snippet
```java
   *     present.
   */
  public static @Nullable String getAnnotationValue(
      Symbol.MethodSymbol methodSymbol, String annotName) {
    AnnotationMirror annot =
```

### MissortedModifiers
Missorted modifiers `public static @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/handlers/AbstractFieldContractHandler.java`
#### Snippet
```java
   * @return The field with the given name, or {@code null} if the field cannot be found
   */
  public static @Nullable VariableElement getInstanceFieldOfClass(
      Symbol.ClassSymbol classSymbol, String name) {
    Preconditions.checkNotNull(classSymbol);
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
  }

  private @Nullable <
          A extends AbstractValue<A>, S extends Store<S>, T extends ForwardTransferFunction<A, S>>
      AnalysisResult<A, S> resultFor(TreePath exprPath, Context context, T transfer) {
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
  abstract static class CfgParams {
    // Should not be used for hashCode or equals
    private @Nullable ProcessingEnvironment environment;

    private static CfgParams create(TreePath codePath, ProcessingEnvironment environment) {
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractCheckHandler.java`
#### Snippet
```java
      for (int i = 0; i < antecedent.length; ++i) {
        String valueConstraint = antecedent[i].trim();
        if (!(valueConstraint.equals("_")
            || valueConstraint.equals("!null")
            || valueConstraint.equals("null"))) {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    }
    if (!this.annotateBytecode) {
      new File(outPath).getParentFile().mkdirs();
      if (outPath.endsWith(".astubx")) {
        writeModel(new DataOutputStream(new FileOutputStream(outPath)));
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    LOG(DEBUG, "DEBUG", "Writing Annotations to " + outFile);

    new File(outFile).getParentFile().mkdirs();
    if (inPath.endsWith(".jar")) {
      JarFile jar = new JarFile(inPath);
```

## RuleId[id=OptionalAssignedToNull]
### OptionalAssignedToNull
Optional value is compared with null
in `nullaway/src/main/java/com/uber/nullaway/handlers/ApacheThriftIsSetHandler.java`
#### Snippet
```java
  public void onMatchTopLevelClass(
      NullAway analysis, ClassTree tree, VisitorState state, Symbol.ClassSymbol classSymbol) {
    if (tbaseType == null) {
      tbaseType =
          Optional.ofNullable(TBASE_TYPE_SUPPLIER.get(state)).map(state.getTypes()::erasure);
```

### OptionalAssignedToNull
Optional value is compared with null
in `nullaway/src/main/java/com/uber/nullaway/handlers/GrpcHandler.java`
#### Snippet
```java
  public void onMatchTopLevelClass(
      NullAway analysis, ClassTree tree, VisitorState state, Symbol.ClassSymbol classSymbol) {
    if (grpcMetadataType == null || grpcKeyType == null) {
      grpcMetadataType =
          Optional.ofNullable(GRPC_METADATA_TYPE_SUPPLIER.get(state))
```

### OptionalAssignedToNull
Optional value is compared with null
in `nullaway/src/main/java/com/uber/nullaway/handlers/GrpcHandler.java`
#### Snippet
```java
  public void onMatchTopLevelClass(
      NullAway analysis, ClassTree tree, VisitorState state, Symbol.ClassSymbol classSymbol) {
    if (grpcMetadataType == null || grpcKeyType == null) {
      grpcMetadataType =
          Optional.ofNullable(GRPC_METADATA_TYPE_SUPPLIER.get(state))
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/ErrorProneCLIFlagsConfig.java`
#### Snippet
```java

  ErrorProneCLIFlagsConfig(ErrorProneFlags flags) {
    if (!flags.get(FL_ANNOTATED_PACKAGES).isPresent()) {
      throw new IllegalStateException(
          "DO NOT report an issue to Error Prone for this crash!  NullAway configuration is "
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/ErrorProneCLIFlagsConfig.java`
#### Snippet
```java
    serializationActivationFlag = flags.getBoolean(FL_FIX_SERIALIZATION).orElse(false);
    Optional<String> fixSerializationConfigPath = flags.get(FL_FIX_SERIALIZATION_CONFIG_PATH);
    if (serializationActivationFlag && !fixSerializationConfigPath.isPresent()) {
      throw new IllegalStateException(
          "DO NOT report an issue to Error Prone for this crash!  NullAway Fix Serialization configuration is "
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `jmh/src/main/java/com/uber/nullaway/jmh/DataFlowMicroBenchmarkCompiler.java`
#### Snippet
```java
        new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
      String line;
      while ((line = br.readLine()) != null) {
        result.append(line).append("\n");
      }
```

### NestedAssignment
Result of assignment expression used
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
      BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
      String currentLine;
      while ((currentLine = br.readLine()) != null) {
        stringBuilder.append(currentLine + "\n");
      }
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`row = row + "\n"` could be simplified to 'row += "\\n"'
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
      return;
    }
    row = row + "\n";
    try (OutputStream os = new FileOutputStream(path.toFile(), true)) {
      os.write(row.getBytes(Charset.defaultCharset()), 0, row.length());
```

### ReplaceAssignmentWithOperatorAssignment
`n = n - 1` could be simplified to 'n -= 1'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
      // If the last argument is var args, don't check it now, it will be checked against
      // all remaining actual arguments in the next loop.
      n = n - 1;
    }
    for (int i = 0; i < n - 1; i++) {
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
  static Comparator<Integer> testLambdaExpressionsAreNotNull() {
    return (a, b) -> {
      return (b - a);
    };
  }
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
        intList,
        (a, b) -> {
          return (b - a);
        });
    Collections.sort(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
        intList,
        (a, b) -> {
          return a;
        });
    Collections.sort(
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
    RetNullableFunction p =
        () -> {
          return null;
        };
    p.getVal();
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Methods.java`
#### Snippet
```java
public class Methods {
  @NullMarked
  public static void foo(Object o) {}

  public static void unchecked(Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Methods.java`
#### Snippet
```java
  public static void foo(Object o) {}

  public static void unchecked(Object o) {}

  public static class ExtendMe {
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Methods.java`
#### Snippet
```java
  @NullMarked
  public static class Marked {
    public static void foo(Object o) {}

    @NullUnmarked
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Methods.java`
#### Snippet
```java

    @NullUnmarked
    public static void unchecked(Object o) {}
  }
}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Outer.java`
#### Snippet
```java
  }

  public static void unchecked(Object o) {}
}

```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/AndroidRecentlyAnnotatedClass.java`
#### Snippet
```java
  }

  public static void consumesObjectNonNull(@RecentlyNonNull Object o) {}

  public static void consumesObjectUnannotated(Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/AndroidRecentlyAnnotatedClass.java`
#### Snippet
```java
  public static void consumesObjectNonNull(@RecentlyNonNull Object o) {}

  public static void consumesObjectUnannotated(Object o) {}
}

```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedClass.java`
#### Snippet
```java
  }

  public static void consumesObjectNonNull(@NonNull Object o) {}

  public static void consumesObjectNotNull(@NotNull Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedClass.java`
#### Snippet
```java
  public static void consumesObjectNonNull(@NonNull Object o) {}

  public static void consumesObjectNotNull(@NotNull Object o) {}

  public static void consumesObjectUnannotated(Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedClass.java`
#### Snippet
```java
  public static void consumesObjectNotNull(@NotNull Object o) {}

  public static void consumesObjectUnannotated(Object o) {}

  public void acceptsNonNull(@NonNull Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedClass.java`
#### Snippet
```java
  public static void consumesObjectUnannotated(Object o) {}

  public void acceptsNonNull(@NonNull Object o) {}

  public void acceptsNonNull2(@NonNull Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedClass.java`
#### Snippet
```java
  public void acceptsNonNull(@NonNull Object o) {}

  public void acceptsNonNull2(@NonNull Object o) {}

  public void acceptsNullable(@Nullable Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedClass.java`
#### Snippet
```java
  public void acceptsNonNull2(@NonNull Object o) {}

  public void acceptsNullable(@Nullable Object o) {}

  public void acceptsNullable2(@Nullable Object o) {}
```

### EmptyMethod
The method is empty
in `test-java-lib/src/main/java/com/uber/lib/unannotated/RestrictivelyAnnotatedClass.java`
#### Snippet
```java
  public void acceptsNullable(@Nullable Object o) {}

  public void acceptsNullable2(@Nullable Object o) {}

  public @NonNull Object returnsNonNull() {
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `code-coverage-report/build.gradle`
#### Snippet
```java

// Task to gather code coverage from multiple subprojects
def codeCoverageReport = tasks.register('codeCoverageReport', JacocoReport) {
    additionalClassDirs(configurations.runtimeClasspath.filter{it.path.contains(rootProject.name)  })
    additionalSourceDirs(sourcesPath.incoming.artifactView { lenient(true) }.files)
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `null` is redundant
in `nullaway/src/main/java/com/uber/nullaway/handlers/stream/StreamModelBuilder.java`
#### Snippet
```java

  private final List<StreamTypeRecord> typeRecords = new ArrayList<>();
  private @Nullable TypePredicate tp = null;
  private ImmutableSet.Builder<String> filterMethodSigs;
  private ImmutableSet.Builder<String> filterMethodSimpleNames;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
/** Annotates the given methods and method parameters with the specified annotations using ASM. */
public final class BytecodeAnnotator {
  private static boolean debug = false;

  private static void LOG(boolean cond, String tag, String msg) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
public class InferredJARModelsHandler extends BaseNoOpHandler {
  private static boolean DEBUG = false;
  private static boolean VERBOSE = false;

  private static void LOG(boolean cond, String tag, String msg) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
/** This handler loads inferred nullability model from stubs for methods in unannotated packages. */
public class InferredJARModelsHandler extends BaseNoOpHandler {
  private static boolean DEBUG = false;
  private static boolean VERBOSE = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
public class DefinitelyDerefedParamsDriver {
  private static boolean DEBUG = false;
  private static boolean VERBOSE = false;

  private static void LOG(boolean cond, String tag, String msg) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java

  String lastOutPath = "";
  private long analyzedBytes = 0;
  private long analysisStartTime = 0;
  private MethodParamAnnotations nonnullParams = new MethodParamAnnotations();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
/** Driver for running {@link DefinitelyDerefedParams} */
public class DefinitelyDerefedParamsDriver {
  private static boolean DEBUG = false;
  private static boolean VERBOSE = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
  private MethodReturnAnnotations nullableReturns = new MethodReturnAnnotations();

  private boolean annotateBytecode = false;
  private boolean stripJarSignatures = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java

  private boolean annotateBytecode = false;
  private boolean stripJarSignatures = false;

  private static final String DEFAULT_ASTUBX_LOCATION = "META-INF/nullaway/jarinfer.astubx";
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
  String lastOutPath = "";
  private long analyzedBytes = 0;
  private long analysisStartTime = 0;
  private MethodParamAnnotations nonnullParams = new MethodParamAnnotations();
  private MethodReturnAnnotations nullableReturns = new MethodReturnAnnotations();
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractUtils.java`
#### Snippet
```java
    String[] parts = clause.split("->");

    String[] antecedent = parts[0].trim().isEmpty() ? new String[0] : parts[0].split(",");

    if (antecedent.length != numOfArguments) {
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'JCTree.JCFunctionalExpression' type conflicts with preceding 'instanceof LambdaExpressionTree' check
in `nullaway/src/main/java/com/uber/nullaway/NullabilityUtil.java`
#### Snippet
```java
    Preconditions.checkArgument(
        (tree instanceof LambdaExpressionTree) || (tree instanceof MemberReferenceTree));
    Type funcInterfaceType = ((JCTree.JCFunctionalExpression) tree).type;
    return (Symbol.MethodSymbol) types.findDescriptorSymbol(funcInterfaceType.tsym);
  }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `argAntecedentNullness != null` is always `true`
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractHandler.java`
#### Snippet
```java
      }
      Preconditions.checkState(
          argAntecedentNullness != null, "argAntecedentNullness should have been set");
      // The nullness of one argument is all that matters for the antecedent, let's negate the
      // consequent to fix the nullness of this argument.
```

### ConstantValue
Condition `i >= 0` is always `true`
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
    for (Integer i : indexes) {
      Preconditions.checkArgument(i >= 0 && i < arguments.size(), "Invalid argument index: " + i);
      if (i >= 0 && i < arguments.size()) {
        Node argument = arguments.get(i);
        AccessPath ap = AccessPath.getAccessPathForNode(argument, state, apContext);
```

### ConstantValue
Condition `i >= 0 && i < arguments.size()` is always `true`
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
    for (Integer i : indexes) {
      Preconditions.checkArgument(i >= 0 && i < arguments.size(), "Invalid argument index: " + i);
      if (i >= 0 && i < arguments.size()) {
        Node argument = arguments.get(i);
        AccessPath ap = AccessPath.getAccessPathForNode(argument, state, apContext);
```

### ConstantValue
Condition `i < arguments.size()` is always `true` when reached
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
    for (Integer i : indexes) {
      Preconditions.checkArgument(i >= 0 && i < arguments.size(), "Invalid argument index: " + i);
      if (i >= 0 && i < arguments.size()) {
        Node argument = arguments.get(i);
        AccessPath ap = AccessPath.getAccessPathForNode(argument, state, apContext);
```

### ConstantValue
Value `rhsType` is always 'null'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
    // NullAway
    if (rhsType == null) {
      throw new RuntimeException("Did not find supertype of " + rhsType + " matching " + lhsType);
    }
    List<Type> lhsTypeArguments = lhsType.getTypeArguments();
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
      String currentLine;
      while ((currentLine = br.readLine()) != null) {
        stringBuilder.append(currentLine + "\n");
      }
      String manifestText = stringBuilder.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
      while (it.hasNext()) {
        uninitField = it.next();
        message.append(
            uninitField.toString() + " (line " + getLineNumForElement(uninitField, state) + ")");
        if (it.hasNext()) {
```

## RuleId[id=IOResource]
### IOResource
'DataInputStream' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
      throws IOException {
    String[] strings;
    DataInputStream in = new DataInputStream(stubxInputStream);
    // Read and check the magic version number
    if (in.readInt() != VERSION_0_FILE_MAGIC_NUMBER) {
```

### IOResource
'ZipFile' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
      jarIS = new FileInputStream(libPath);
    } else if (libPath.endsWith(".aar")) {
      ZipFile aar = new ZipFile(libPath);
      ZipEntry jarEntry = aar.getEntry("classes.jar");
      jarIS = (jarEntry == null ? null : aar.getInputStream(jarEntry));
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `nullaway/src/main/java/com/uber/nullaway/ErrorProneCLIFlagsConfig.java`
#### Snippet
```java
  private static ImmutableSet<String> getFlagStringSet(ErrorProneFlags flags, String flagName) {
    Optional<String> flagValue = flags.get(flagName);
    if (flagValue.isPresent()) {
      return ImmutableSet.copyOf(flagValue.get().split(DELIMITER));
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `nullaway/src/main/java/com/uber/nullaway/ErrorProneCLIFlagsConfig.java`
#### Snippet
```java
    Set<String> combined = new LinkedHashSet<>(defaults);
    Optional<String> flagValue = flags.get(flagName);
    if (flagValue.isPresent()) {
      Collections.addAll(combined, flagValue.get().split(DELIMITER));
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `nullaway/src/main/java/com/uber/nullaway/handlers/OptionalEmptinessHandler.java`
#### Snippet
```java
              .map(n -> (MethodInvocationNode) n)
              .findFirst();
      if (assertedOnMethod.isPresent()) {
        handleBooleanAssertionOnMethod(
            nonNullMarker,
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `nullaway/src/main/java/com/uber/nullaway/handlers/OptionalEmptinessHandler.java`
#### Snippet
```java
              .map(n -> (MethodInvocationNode) n)
              .map(this::maybeUnwrapBooleanValueOf);
      if (wrappedMethod.isPresent()) {
        handleBooleanAssertionOnMethod(
            nonNullMarker, state.getTypes(), wrappedMethod.get(), isTrueMethod, isFalseMethod);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `AndroidRecentlyAnnotatedClass` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib/src/main/java/com/uber/lib/unannotated/AndroidRecentlyAnnotatedClass.java`
#### Snippet
```java
import androidx.annotation.RecentlyNullable;

public class AndroidRecentlyAnnotatedClass {

  public static @RecentlyNullable Object returnsNull() {
```

### UtilityClassWithoutPrivateConstructor
Class `StringUtils` has only 'static' members, and lacks a 'private' constructor
in `sample/src/main/java/org/utilities/StringUtils.java`
#### Snippet
```java
import javax.annotation.Nullable;

public class StringUtils {

  public static boolean isEmptyOrNull(@Nullable final CharSequence value) {
```

### UtilityClassWithoutPrivateConstructor
Class `MyClass` has only 'static' members, and lacks a 'private' constructor
in `sample/src/main/java/com/uber/mylib/MyClass.java`
#### Snippet
```java

/** A sample class. */
public class MyClass {

  static void log(@Nullable Object x) {
```

### UtilityClassWithoutPrivateConstructor
Class `Lambdas` has only 'static' members, and lacks a 'private' constructor
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
/** Code that uses Java 8 lambdas */
@SuppressWarnings("UnusedVariable") // This is sample code
public class Lambdas {

  @FunctionalInterface
```

### UtilityClassWithoutPrivateConstructor
Class `Utils` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib/src/main/java/com/example/jspecify/annotatedpackage/Utils.java`
#### Snippet
```java
import org.jspecify.annotations.Nullable;

public class Utils {

  public static String toStringOrDefault(@Nullable Object o1, String s) {
```

### UtilityClassWithoutPrivateConstructor
Class `TopLevel` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/TopLevel.java`
#### Snippet
```java

@NullMarked
public class TopLevel {
  public static String foo(String s) {
    return s;
```

### UtilityClassWithoutPrivateConstructor
Class `ContractUtils` has only 'static' members, and lacks a 'private' constructor
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractUtils.java`
#### Snippet
```java

/** An utility class for {@link ContractHandler} and {@link ContractCheckHandler}. */
public class ContractUtils {

  private static final String[] EMPTY_STRING_ARRAY = new String[0];
```

### UtilityClassWithoutPrivateConstructor
Class `Marked` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Methods.java`
#### Snippet
```java

  @NullMarked
  public static class Marked {
    public static void foo(Object o) {}

```

### UtilityClassWithoutPrivateConstructor
Class `Methods` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Methods.java`
#### Snippet
```java
import org.jspecify.annotations.NullUnmarked;

public class Methods {
  @NullMarked
  public static void foo(Object o) {}
```

### UtilityClassWithoutPrivateConstructor
Class `Outer` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Outer.java`
#### Snippet
```java
import org.jspecify.annotations.NullMarked;

public class Outer {
  @NullMarked
  public static class Inner {
```

### UtilityClassWithoutPrivateConstructor
Class `Inner` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Outer.java`
#### Snippet
```java
public class Outer {
  @NullMarked
  public static class Inner {
    public static String foo(String s) {
      return s;
```

### UtilityClassWithoutPrivateConstructor
Class `UsesDTO` has only 'static' members, and lacks a 'private' constructor
in `test-java-lib-lombok/src/main/java/com/uber/lombok/UsesDTO.java`
#### Snippet
```java
import javax.annotation.Nullable;

class UsesDTO {

  public static LombokDTO getDTOInstance(@Nullable String s1, String s2) {
```

### UtilityClassWithoutPrivateConstructor
Class `JarInfer` has only 'static' members, and lacks a 'private' constructor
in `jar-infer/jar-infer-cli/src/main/java/com/uber/nullaway/jarinfer/JarInfer.java`
#### Snippet
```java

/** CLI interface for running the jarinfer analysis. {@link DefinitelyDerefedParamsDriver} */
public class JarInfer {
  private static final String appName = JarInfer.class.getName();

```

### UtilityClassWithoutPrivateConstructor
Class `BytecodeAnnotator` has only 'static' members, and lacks a 'private' constructor
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java

/** Annotates the given methods and method parameters with the specified annotations using ASM. */
public final class BytecodeAnnotator {
  private static boolean debug = false;

```

### UtilityClassWithoutPrivateConstructor
Class `StubxWriter` has only 'static' members, and lacks a 'private' constructor
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/StubxWriter.java`
#### Snippet
```java

/** Simple writer for the astubx format. */
final class StubxWriter {
  /**
   * The file magic number for version 0 .astubx files. It should be the first four bytes of any
```

### UtilityClassWithoutPrivateConstructor
Class `XMLUtil` has only 'static' members, and lacks a 'private' constructor
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/XMLUtil.java`
#### Snippet
```java

/** Helper for class for parsing/writing xml files. */
public class XMLUtil {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `SerializationService` has only 'static' members, and lacks a 'private' constructor
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/SerializationService.java`
#### Snippet
```java

/** A facade class to interact with fix serialization package. */
public class SerializationService {

  /** Special characters that need to be escaped in TSV files. */
```

### UtilityClassWithoutPrivateConstructor
Class `StreamNullabilityPropagatorFactory` has only 'static' members, and lacks a 'private' constructor
in `nullaway/src/main/java/com/uber/nullaway/handlers/StreamNullabilityPropagatorFactory.java`
#### Snippet
```java
import com.uber.nullaway.handlers.stream.StreamTypeRecord;

public class StreamNullabilityPropagatorFactory {
  public static StreamNullabilityPropagator getJavaStreamNullabilityPropagator() {
    ImmutableList<StreamTypeRecord> streamModels =
```

### UtilityClassWithoutPrivateConstructor
Class `Toys` has only 'static' members, and lacks a 'private' constructor
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Toys.java`
#### Snippet
```java
import javax.annotation.Nonnull;

public class Toys {

  @ExpectNullable
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `config.outputDirectory` might be null
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
  private void initializeOutputFiles(FixSerializationConfig config) {
    try {
      Files.createDirectories(Paths.get(config.outputDirectory));
      if (config.suggestEnabled) {
        initializeFile(suggestedFixesOutputPath, SuggestedNullableFixInfo.header());
```

### DataFlowIssue
Argument `outputDirectory` might be null
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
  public Serializer(FixSerializationConfig config, SerializationAdapter serializationAdapter) {
    String outputDirectory = config.outputDirectory;
    this.errorOutputPath = Paths.get(outputDirectory, "errors.tsv");
    this.suggestedFixesOutputPath = Paths.get(outputDirectory, "fixes.tsv");
    this.fieldInitializationOutputPath = Paths.get(outputDirectory, "field_init.tsv");
```

### DataFlowIssue
Argument `outputDirectory` might be null
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
   */
  private void serializeVersion(@Nullable String outputDirectory) {
    Path versionOutputPath = Paths.get(outputDirectory).resolve("serialization_version.txt");
    try (Writer fileWriter =
        Files.newBufferedWriter(versionOutputPath.toFile().toPath(), Charset.defaultCharset())) {
```

### DataFlowIssue
Unboxing of `NULL_TEST_APIS.get(sign)` may produce `NullPointerException`
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParams.java`
#### Snippet
```java
            // All supported Null testing APIs are static methods
            if (NULL_TEST_APIS.containsKey(sign)) {
              derefValueNumber = callInst.getUse(NULL_TEST_APIS.get(sign));
            }
          } else {
```

### DataFlowIssue
Casting `cursor` to `Symbol.MethodSymbol` may produce `ClassCastException`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/location/MethodParameterLocation.java`
#### Snippet
```java
    }
    Preconditions.checkNotNull(cursor);
    this.enclosingMethod = (Symbol.MethodSymbol) cursor;
    int i;
    for (i = 0; i < this.enclosingMethod.getParameters().size(); i++) {
```

### DataFlowIssue
Method invocation `getQualifiedName` may produce `NullPointerException`
in `nullaway/src/main/java/com/uber/nullaway/AbstractConfig.java`
#### Snippet
```java
    MethodClassAndName classAndName =
        MethodClassAndName.create(
            enclosingClass.getQualifiedName().toString(), methodSymbol.getSimpleName().toString());
    return knownInitializers.contains(classAndName);
  }
```

### DataFlowIssue
Casting `symbol` to `Symbol.MethodSymbol` may produce `ClassCastException`
in `nullaway/src/main/java/com/uber/nullaway/CodeAnnotationInfo.java`
#### Snippet
```java
    if (symbol.getKind().equals(ElementKind.METHOD)
        || symbol.getKind().equals(ElementKind.CONSTRUCTOR)) {
      return !classCacheRecord.isMethodNullnessAnnotated((Symbol.MethodSymbol) symbol);
    } else {
      return !inAnnotatedClass;
```

### DataFlowIssue
Casting `curTypeArg` to `ParameterizedTypeTree` may produce `ClassCastException`
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
      if (currentTypeArgType.getTypeArguments().size() > 0) {
        // nested generic type; recursively preserve its nullability type argument annotations
        currentTypeArgType = typeWithPreservedAnnotations((ParameterizedTypeTree) curTypeArg);
      }
      Type.ClassType newTypeArgType =
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
    }
    // all the initializer blocks have run before any code inside a constructor
    constructors.stream().forEach((c) -> builder.putAll(c, initThusFar));
    Symbol.ClassSymbol classSymbol = ASTHelpers.getSymbol(enclosingClass);
    FieldInitEntities entities = castToNonNull(class2Entities.get(classSymbol));
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java

  static void testBuiltIn() {
    java.util.function.Function<String, String> foo = (x) -> x.toString();
    BiFunction<String, Object, String> bar = (x, y) -> x.toString() + y.toString();
    Function<String, Object> foo2 = (x) -> null;
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
  static void testBuiltIn() {
    java.util.function.Function<String, String> foo = (x) -> x.toString();
    BiFunction<String, Object, String> bar = (x, y) -> x.toString() + y.toString();
    Function<String, Object> foo2 = (x) -> null;
  }
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `test-java-lib-lombok/src/main/java/com/uber/lombok/UsesDTO.java`
#### Snippet
```java
  public static String foo(LombokDTO ldto) {
    String s = "";
    s += ldto.getField().toString();
    s += " ";
    // Removing this nullness check produces a NullAway error
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `test-java-lib-lombok/src/main/java/com/uber/lombok/UsesDTO.java`
#### Snippet
```java
    s += " ";
    // Removing this nullness check produces a NullAway error
    s += (ldto.getNullableField() == null ? "" : ldto.getNullableField().toString());
    return s;
  }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java

  static void testNonNullParam() {
    NonNullParamFunction n = (x) -> x.toString();
    NonNullParamFunction n2 = (@Nullable Object x) -> (x == null) ? "null" : x.toString();
    NullableParamFunction n3 = (@Nullable Object x) -> (x == null) ? "null" : x.toString();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java

  static void testBuiltIn() {
    java.util.function.Function<String, String> foo = (x) -> x.toString();
    BiFunction<String, Object, String> bar = (x, y) -> x.toString() + y.toString();
    Function<String, Object> foo2 = (x) -> null;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
    return StreamSupport.stream(treePath.spliterator(), false)
        .filter(ErrorBuilder::canHaveSuppressWarningsAnnotation)
        .map(tree -> ASTHelpers.getSymbol(tree))
        .filter(symbol -> symbol != null)
        .anyMatch(
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
        .filter(ErrorBuilder::canHaveSuppressWarningsAnnotation)
        .map(tree -> ASTHelpers.getSymbol(tree))
        .filter(symbol -> symbol != null)
        .anyMatch(
            symbol ->
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'errorBuilder' in a Serializable class
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
  private final Config config;

  private final ErrorBuilder errorBuilder;

  /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'codeAnnotationInfo' in a Serializable class
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
  // always be called before the field gets dereferenced
  @SuppressWarnings("NullAway.Init")
  private CodeAnnotationInfo codeAnnotationInfo;

  private final Config config;
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `getAnnotatedPackages()` during object construction
in `jmh/src/main/java/com/uber/nullaway/jmh/AbstractBenchmarkCompiler.java`
#### Snippet
```java
        NullawayJavac.create(
            getSourceFileNames(),
            getAnnotatedPackages(),
            getClasspath(),
            getExtraErrorProneArgs(),
```

### AbstractMethodCallInConstructor
Call to 'abstract' method `getClasspath()` during object construction
in `jmh/src/main/java/com/uber/nullaway/jmh/AbstractBenchmarkCompiler.java`
#### Snippet
```java
            getSourceFileNames(),
            getAnnotatedPackages(),
            getClasspath(),
            getExtraErrorProneArgs(),
            getExtraProcessorPath());
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
  private static String getAstubxSignature(IMethod mtd) {
    String classType =
        mtd.getDeclaringClass().getName().toString().replaceAll("/", "\\.").substring(1);
    classType = classType.replaceAll("\\$", "\\."); // handle inner class
    String returnType = mtd.isInit() ? null : getSimpleTypeName(mtd.getReturnType());
```

### RedundantEscapeInRegexReplacement
Redundant escape of '.'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    String classType =
        mtd.getDeclaringClass().getName().toString().replaceAll("/", "\\.").substring(1);
    classType = classType.replaceAll("\\$", "\\."); // handle inner class
    String returnType = mtd.isInit() ? null : getSimpleTypeName(mtd.getReturnType());
    String strArgTypes = "";
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `sample/src/main/java/com/uber/mylib/MyClass.java`
#### Snippet
```java
      return;
    }
    System.out.println(x.toString());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParams.java`
#### Snippet
```java
          continue;
        }
        LOG(DEBUG, "DEBUG", "\tinst: " + instr.toString());
        int derefValueNumber = -1;
        if (instr instanceof SSAGetInstruction && !((SSAGetInstruction) instr).isStatic()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParams.java`
#### Snippet
```java
    // Get Post-dominator Tree
    Graph<ISSABasicBlock> pdomTree = GraphInverter.invert(domTree);
    LOG(DEBUG, "DEBUG", "post-dominator tree:" + pdomTree.toString());
    // Note: WALA creates a single dummy exit node. Multiple exits points will never post-dominate
    // this exit node. (?)
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
    }
    if (!jiNonNullParams.isEmpty()) {
      LOG(DEBUG, "DEBUG", "Nonnull params: " + jiNonNullParams.toString() + " for " + methodSign);
    }
    return argumentPositionNullness;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
            + className
            + " -- "
            + methodArgAnnotations.toString());
    return methodArgAnnotations;
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
                          DEBUG,
                          "DEBUG",
                          "Inferred Nonnull param for method: " + sign + " = " + result.toString());
                    }
                  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
              + ASTHelpers.enclosingClass(overriddenMethod)
              + "."
              + overriddenMethod.toString()
              + " is @Nullable";
      return errorBuilder.createErrorDescription(
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
                + ASTHelpers.enclosingClass(overriddenMethod)
                + "."
                + overriddenMethod.toString()
                + " is @Nullable";
        Tree errorTree;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
                  + ASTHelpers.enclosingClass(overriddenMethod)
                  + "."
                  + overriddenMethod.toString()
                  + " returns @NonNull";

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
                  + ASTHelpers.enclosingClass(overriddenMethod)
                  + "."
                  + overriddenMethod.toString()
                  + " returns @NonNull";
        }
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
    // that the analysis is finished, we cannot open a single stream and flush it within a finalize
    // method. Must open and close a new stream everytime we are appending a new line to a file.
    if (row == null || row.equals("")) {
      return;
    }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `nullaway/src/main/java/com/uber/nullaway/AbstractConfig.java`
#### Snippet
```java

  protected static Pattern getPackagePattern(ImmutableSet<String> packagePrefixes) {
    // noinspection ConstantConditions
    String choiceRegexp =
        Joiner.on("|")
```

### RedundantSuppression
Redundant suppression
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
              : ((VariableTree) suggestTree).getModifiers();
      final List<? extends AnnotationTree> annotations = modifiers.getAnnotations();
      // noinspection ConstantConditions
      com.google.common.base.Optional<? extends AnnotationTree> suppressWarningsAnnot =
          Iterables.tryFind(
```

### RedundantSuppression
Redundant suppression
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
                  final ForwardTransferFunction<?, ?> transfer = key.transferFunction();

                  @SuppressWarnings({"unchecked", "rawtypes"})
                  final Analysis<?, ?, ?> analysis = new ForwardAnalysisImpl<>(transfer);
                  analysis.performAnalysis(cfg);
                  return analysis;
```

### RedundantSuppression
Redundant suppression
in `nullaway/src/main/java/com/uber/nullaway/handlers/ApacheThriftIsSetHandler.java`
#### Snippet
```java
  private boolean thriftIsSetCall(Symbol.MethodSymbol symbol, Types types) {
    Preconditions.checkNotNull(tbaseType);
    // noinspection ConstantConditions
    return tbaseType.isPresent()
        && symbol.getSimpleName().toString().startsWith("isSet")
```

### RedundantSuppression
Redundant suppression
in `nullaway/src/main/java/com/uber/nullaway/handlers/GrpcHandler.java`
#### Snippet
```java
    Preconditions.checkNotNull(grpcMetadataType);
    Preconditions.checkNotNull(grpcKeyType);
    // noinspection ConstantConditions
    return grpcMetadataType.isPresent()
        && grpcKeyType.isPresent()
```

### RedundantSuppression
Redundant suppression
in `nullaway/src/main/java/com/uber/nullaway/handlers/GrpcHandler.java`
#### Snippet
```java
    Preconditions.checkNotNull(grpcMetadataType);
    Preconditions.checkNotNull(grpcKeyType);
    // noinspection ConstantConditions
    return grpcMetadataType.isPresent()
        && grpcKeyType.isPresent()
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'tbaseType'
in `nullaway/src/main/java/com/uber/nullaway/handlers/ApacheThriftIsSetHandler.java`
#### Snippet
```java
  private static final Supplier<Type> TBASE_TYPE_SUPPLIER = Suppliers.typeFromString(TBASE_NAME);

  @Nullable private Optional<Type> tbaseType;

  @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'grpcKeyType'
in `nullaway/src/main/java/com/uber/nullaway/handlers/GrpcHandler.java`
#### Snippet
```java

  @Nullable private Optional<Type> grpcMetadataType;
  @Nullable private Optional<Type> grpcKeyType;

  @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'grpcMetadataType'
in `nullaway/src/main/java/com/uber/nullaway/handlers/GrpcHandler.java`
#### Snippet
```java
      Suppliers.typeFromString(GRPC_METADATA_KEY_TNAME);

  @Nullable private Optional<Type> grpcMetadataType;
  @Nullable private Optional<Type> grpcKeyType;

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
      // Read full file
      StringBuilder stringBuilder = new StringBuilder();
      BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
      String currentLine;
      while ((currentLine = br.readLine()) != null) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
      }
      jarOS.putNextEntry(new ZipEntry(jarEntry.getName()));
      jarOS.write(manifestMinusDigests.getBytes("UTF-8"));
    } else if (entryName.startsWith("META-INF/")
        && (entryName.endsWith(".DSA")
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `sample/src/main/java/com/uber/mylib/MyClass.java`
#### Snippet
```java
      return;
    }
    System.out.println(x.toString());
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jar-infer/jar-infer-cli/src/main/java/com/uber/nullaway/jarinfer/JarInfer.java`
#### Snippet
```java
          jarPath, pkgName, outPath, annotateBytecode, stripJarSignatures, false, debug, verbose);
      if (!new File(outPath).exists()) {
        System.out.println("Could not write jar file: " + outPath);
      }
    } catch (ParseException pe) {
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParams.java`
#### Snippet
```java
  private static void LOG(boolean cond, String tag, String msg) {
    if (cond) {
      System.out.println("[JI " + tag + "] " + msg);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
  private static void LOG(boolean cond, String tag, String msg) {
    if (cond) {
      System.out.println("[" + tag + "] " + msg);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
  private static void LOG(boolean cond, String tag, String msg) {
    if (cond) {
      System.out.println("[JI " + tag + "] " + msg);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
  private static void LOG(boolean cond, String tag, String msg) {
    if (cond) {
      System.out.println("[JI " + tag + "] " + msg);
    }
  }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Toys.java`
#### Snippet
```java
      test(s, f, b);
    } catch (Error e) {
      System.out.println(e.getMessage());
    }
  }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'condition == null' covered by subsequent condition '!(condition instanceof NotEqualNode)'
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
    Node condition = assertionErrorNode.getCondition();

    if (condition == null
        || !(condition instanceof NotEqualNode)
        || !(((NotEqualNode) condition).getRightOperand() instanceof NullLiteralNode)) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractNullnessStoreInitializer.java`
#### Snippet
```java

    String[] clauses = contractString.split(";");
    String[] parts = clauses[0].split("->");
    String[] antecedent = parts[0].split(",");

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractUtils.java`
#### Snippet
```java
      int numOfArguments) {

    String[] parts = clause.split("->");

    String[] antecedent = parts[0].trim().isEmpty() ? new String[0] : parts[0].split(",");
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractUtils.java`
#### Snippet
```java
      String clause, Tree tree, NullAway analysis, VisitorState state, Symbol callee) {

    String[] parts = clause.split("->");
    if (parts.length != 2) {
      String message =
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jar-infer/jar-infer-cli/src/main/java/com/uber/nullaway/jarinfer/JarInfer.java`
#### Snippet
```java
      boolean verbose = line.hasOption('v');
      if (!pkgName.isEmpty()) {
        pkgName = "L" + pkgName.replaceAll("\\.", "/");
      }
      DefinitelyDerefedParamsDriver driver = new DefinitelyDerefedParamsDriver();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/BytecodeAnnotator.java`
#### Snippet
```java
      // Check for evidence of jar signing, note that lines can be split if too long so regex
      // matching line by line will have false negatives.
      String manifestMinusDigests = manifestText.replaceAll(DIGEST_ENTRY_PATTERN, "");
      if (!manifestText.equals(manifestMinusDigests) && !stripJarSignatures) {
        throw new SignedJarException(SIGNED_JAR_ERROR_MESSAGE);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
  private static String getAstubxSignature(IMethod mtd) {
    String classType =
        mtd.getDeclaringClass().getName().toString().replaceAll("/", "\\.").substring(1);
    classType = classType.replaceAll("\\$", "\\."); // handle inner class
    String returnType = mtd.isInit() ? null : getSimpleTypeName(mtd.getReturnType());
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    String classType =
        mtd.getDeclaringClass().getName().toString().replaceAll("/", "\\.").substring(1);
    classType = classType.replaceAll("\\$", "\\."); // handle inner class
    String returnType = mtd.isInit() ? null : getSimpleTypeName(mtd.getReturnType());
    String strArgTypes = "";
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `nullaway/src/main/java/com/uber/nullaway/AbstractConfig.java`
#### Snippet
```java
    String choiceRegexp =
        Joiner.on("|")
            .join(Iterables.transform(packagePrefixes, input -> input.replaceAll("\\.", "\\\\.")));
    return Pattern.compile("^(?:" + choiceRegexp + ")(?:\\..*)?");
  }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util.function` is unnecessary and can be removed
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java

  static void testBuiltIn() {
    java.util.function.Function<String, String> foo = (x) -> x.toString();
    BiFunction<String, Object, String> bar = (x, y) -> x.toString() + y.toString();
    Function<String, Object> foo2 = (x) -> null;
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.nullaway.handlers` is unnecessary and can be removed
in `nullaway/src/main/java/com/uber/nullaway/handlers/MethodNameUtil.java`
#### Snippet
```java
/**
 * A utility class that holds the names from the Table. Currently, {@link
 * com.uber.nullaway.handlers.AssertionHandler} requires it, while {@link
 * com.uber.nullaway.handlers.OptionalEmptinessHandler} uses it only when AssertionHandler is
 * enabled.
```

### UnnecessaryFullyQualifiedName
Qualifier `com.uber.nullaway.handlers` is unnecessary and can be removed
in `nullaway/src/main/java/com/uber/nullaway/handlers/MethodNameUtil.java`
#### Snippet
```java
 * A utility class that holds the names from the Table. Currently, {@link
 * com.uber.nullaway.handlers.AssertionHandler} requires it, while {@link
 * com.uber.nullaway.handlers.OptionalEmptinessHandler} uses it only when AssertionHandler is
 * enabled.
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.common.base` is unnecessary, and can be replaced with an import
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
      final List<? extends AnnotationTree> annotations = modifiers.getAnnotations();
      // noinspection ConstantConditions
      com.google.common.base.Optional<? extends AnnotationTree> suppressWarningsAnnot =
          Iterables.tryFind(
              annotations,
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Toys.java`
#### Snippet
```java
  }

  public static void main(String arg[]) throws java.io.IOException {
    String s = "test string...";
    Foo f = new Foo("let's");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.checkerframework.nullaway.dataflow.analysis` is unnecessary and can be removed
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java

/**
 * Provides a wrapper around {@link org.checkerframework.nullaway.dataflow.analysis.Analysis}.
 *
 * <p>Modified from Error Prone code for more aggressive caching, and to avoid static state. See
```

### UnnecessaryFullyQualifiedName
Qualifier `com.google.errorprone.util` is unnecessary and can be removed
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
   *
   * <p>This method is required because in some cases, the type returned by {@link
   * com.google.errorprone.util.ASTHelpers#getType(Tree)} fails to preserve type use annotations,
   * particularly when dealing with {@link com.sun.source.tree.NewClassTree} (e.g., {@code new
   * Foo<@Nullable A>}).
```

### UnnecessaryFullyQualifiedName
Qualifier `com.sun.source.tree` is unnecessary and can be removed
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
   * <p>This method is required because in some cases, the type returned by {@link
   * com.google.errorprone.util.ASTHelpers#getType(Tree)} fails to preserve type use annotations,
   * particularly when dealing with {@link com.sun.source.tree.NewClassTree} (e.g., {@code new
   * Foo<@Nullable A>}).
   *
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
'compare()' parameter `b` is not used
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
    Collections.sort(
        intList,
        (a, b) -> {
          return a;
        });
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractSymbolLocation()` of an abstract class should not be declared 'public'
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/location/AbstractSymbolLocation.java`
#### Snippet
```java
  protected final Symbol.ClassSymbol enclosingClass;

  public AbstractSymbolLocation(ElementKind type, Symbol target) {
    Preconditions.checkArgument(
        type.equals(target.getKind()),
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractBenchmarkCompiler()` of an abstract class should not be declared 'public'
in `jmh/src/main/java/com/uber/nullaway/jmh/AbstractBenchmarkCompiler.java`
#### Snippet
```java
  private final NullawayJavac nullawayJavac;

  public AbstractBenchmarkCompiler() throws IOException {
    nullawayJavac =
        NullawayJavac.create(
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `str`
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Foo.java`
#### Snippet
```java
  public Foo(String str) {
    if (str == null) {
      str = "foo";
    }
    this.foo = str;
```

### AssignmentToMethodParameter
Assignment to method parameter `overridingFieldNames`
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/fieldcontract/EnsuresNonNullHandler.java`
#### Snippet
```java
    }
    if (overridingFieldNames == null) {
      overridingFieldNames = Collections.emptySet();
    }
    if (overridingFieldNames.containsAll(overriddenFieldNames)) {
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Bar.java`
#### Snippet
```java
  public Bar(String str) {
    if (str == null) {
      str = "bar";
    }
    this.bar = str;
```

### AssignmentToMethodParameter
Assignment to method parameter `row`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
      return;
    }
    row = row + "\n";
    try (OutputStream os = new FileOutputStream(path.toFile(), true)) {
      os.write(row.getBytes(Charset.defaultCharset()), 0, row.length());
```

### AssignmentToMethodParameter
Assignment to method parameter `header`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java
    }
    try (OutputStream os = new FileOutputStream(path.toFile())) {
      header += "\n";
      os.write(header.getBytes(Charset.defaultCharset()), 0, header.length());
      os.flush();
```

### AssignmentToMethodParameter
Assignment to method parameter `exprMayBeNull`
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
      boolean exprMayBeNull) {
    for (Handler h : handlers) {
      exprMayBeNull = h.onOverrideMayBeNullExpr(analysis, expr, exprSymbol, state, exprMayBeNull);
    }
    return exprMayBeNull;
```

### AssignmentToMethodParameter
Assignment to method parameter `previousArgumentPosition`
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
      @Nullable Integer previousArgumentPosition) {
    for (Handler h : handlers) {
      previousArgumentPosition =
          h.castToNonNullArgumentPositionsForMethod(
              analysis, state, methodSymbol, actualParams, previousArgumentPosition);
```

### AssignmentToMethodParameter
Assignment to method parameter `argumentPositionNullness`
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
      Nullness[] argumentPositionNullness) {
    for (Handler h : handlers) {
      argumentPositionNullness =
          h.onOverrideMethodInvocationParametersNullability(
              context, methodSymbol, isAnnotated, argumentPositionNullness);
```

### AssignmentToMethodParameter
Assignment to method parameter `returnNullness`
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
      Nullness returnNullness) {
    for (Handler h : handlers) {
      returnNullness =
          h.onOverrideMethodInvocationReturnNullability(
              methodSymbol, state, isAnnotated, returnNullness);
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
      NullnessStore.Builder result) {
    for (Handler h : handlers) {
      result = h.onDataflowInitialStore(underlyingAST, parameters, result);
    }
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
      case SWITCH_EXPRESSION_NULLABLE:
        if (config.getCastToNonNullMethod() != null) {
          builder = addCastToNonNullFix(suggestTree, builder);
        } else {
          builder = addSuppressWarningsFix(suggestTree, builder, suppressionName);
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
          builder = addCastToNonNullFix(suggestTree, builder);
        } else {
          builder = addSuppressWarningsFix(suggestTree, builder, suppressionName);
        }
        break;
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
        break;
      case CAST_TO_NONNULL_ARG_NONNULL:
        builder = removeCastToNonNullFix(suggestTree, builder);
        break;
      case WRONG_OVERRIDE_RETURN:
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
        break;
      case WRONG_OVERRIDE_RETURN:
        builder = addSuppressWarningsFix(suggestTree, builder, suppressionName);
        break;
      case WRONG_OVERRIDE_PARAM:
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
        break;
      case WRONG_OVERRIDE_PARAM:
        builder = addSuppressWarningsFix(suggestTree, builder, suppressionName);
        break;
      case METHOD_NO_INIT:
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
      case METHOD_NO_INIT:
      case FIELD_NO_INIT:
        builder = addSuppressWarningsFix(suggestTree, builder, INITIALIZATION_CHECK_NAME);
        break;
      case ANNOTATION_VALUE_INVALID:
```

### AssignmentToMethodParameter
Assignment to method parameter `builder`
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
        break;
      default:
        builder = addSuppressWarningsFix(suggestTree, builder, suppressionName);
    }
    return builder;
```

### AssignmentToMethodParameter
Assignment to method parameter `analysisDriver`
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    if (!mtd.getReturnType().isPrimitiveType()) {
      if (analysisDriver == null) {
        analysisDriver = getAnalysisDriver(mtd, options, cache);
      }
      if (analysisDriver.analyzeReturnType() == DefinitelyDerefedParams.NullnessHint.NULLABLE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `sign`
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
      if (analysisDriver.analyzeReturnType() == DefinitelyDerefedParams.NullnessHint.NULLABLE) {
        if (sign.isEmpty()) {
          sign = getSignature(mtd);
        }
        nullableReturns.add(sign);
```

### AssignmentToMethodParameter
Assignment to method parameter `argument`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java`
#### Snippet
```java
    // Required to have Node type match Tree type in some instances.
    if (argument instanceof WideningConversionNode) {
      argument = ((WideningConversionNode) argument).getOperand();
    }
    // A switch at the Tree level should be faster than multiple if checks at the Node level.
```

### AssignmentToMethodParameter
Assignment to method parameter `node`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java`
#### Snippet
```java
  private static Node stripCasts(Node node) {
    while (node instanceof TypeCastNode) {
      node = ((TypeCastNode) node).getOperand();
    }
    return node;
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/SerializationService.java`
#### Snippet
```java
    // therefore we need four "\".
    // escape existing backslashes
    str = str.replaceAll(Pattern.quote("\\"), Matcher.quoteReplacement("\\\\"));
    // escape special characters
    for (Map.Entry<Character, Character> entry : escapes.entrySet()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/SerializationService.java`
#### Snippet
```java
    // escape special characters
    for (Map.Entry<Character, Character> entry : escapes.entrySet()) {
      str =
          str.replaceAll(
              String.valueOf(entry.getKey()), Matcher.quoteReplacement("\\" + entry.getValue()));
```

### AssignmentToMethodParameter
Assignment to method parameter `rhsType`
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
    // The base type of rhsType may be a subtype of lhsType's base type.  In such cases, we must
    // compare lhsType against the supertype of rhsType with a matching base type.
    rhsType = (Type.ClassType) types.asSuper(rhsType, lhsType.tsym);
    // This is impossible, considering the fact that standard Java subtyping succeeds before running
    // NullAway
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
      someChange = false;
      if (expr.getKind().equals(PARENTHESIZED)) {
        expr = ((ParenthesizedTree) expr).getExpression();
        someChange = true;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
      }
      if (expr.getKind().equals(TYPE_CAST)) {
        expr = ((TypeCastTree) expr).getExpression();
        someChange = true;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
      // Strips Nullchk operator
      if (expr.getKind().equals(OTHER) && expr instanceof JCTree.JCUnary) {
        expr = ((JCTree.JCUnary) expr).getExpression();
        someChange = true;
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java

  private boolean mayBeNullExpr(VisitorState state, ExpressionTree expr) {
    expr = stripParensAndCasts(expr);
    if (ASTHelpers.constValue(expr) != null) {
      // This should include literals such as "true" or a string
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractHandler.java`
#### Snippet
```java
        String valueConstraint = antecedent[i].trim();
        if (valueConstraint.equals("_")) {
          continue;
        } else if (valueConstraint.equals("false") || valueConstraint.equals("true")) {
          // We handle boolean constraints in the case that the boolean argument is the result
```

### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `nullaway/src/main/java/com/uber/nullaway/handlers/contract/ContractHandler.java`
#### Snippet
```java
          // We already know this argument can't be null, so we can treat it as not part of the
          // clause for the purpose of deciding the non-nullness of the other arguments.
          continue;
        } else if (valueConstraint.equals("null") || valueConstraint.equals("!null")) {
          if (arg != null) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `test-java-lib/src/main/java/com/uber/lib/unannotated/UnannotatedWithModels.java`
#### Snippet
```java

  public Object returnsNullUnannotated() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `test-java-lib/src/main/java/com/uber/lib/unannotated/UnannotatedWithModels.java`
#### Snippet
```java

  public Object returnsNullUnannotated2() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
    java.util.function.Function<String, String> foo = (x) -> x.toString();
    BiFunction<String, Object, String> bar = (x, y) -> x.toString() + y.toString();
    Function<String, Object> foo2 = (x) -> null;
  }

```

### ReturnNull
Return of `null`
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Foo.java`
#### Snippet
```java
  public static String expectNullable(int x, String str) {
    if (x < 10) {
      return null;
    }
    return str;
```

### ReturnNull
Return of `null`
in `test-java-lib/src/main/java/com/example/jspecify/unannotatedpackage/Methods.java`
#### Snippet
```java

    public Object unchecked(Object o) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Toys.java`
#### Snippet
```java
  public static String getString(boolean flag, String str) {
    if (flag) {
      return null;
    }
    return str;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `phase3result` is redundant
in `nullaway/src/main/java/com/uber/nullaway/dataflow/cfg/NullAwayCFGBuilder.java`
#### Snippet
```java
    PhaseOneResult phase1result = phase1translator.process(bodyPath, underlyingAST);
    ControlFlowGraph phase2result = CFGTranslationPhaseTwo.process(phase1result);
    ControlFlowGraph phase3result = CFGTranslationPhaseThree.process(phase2result);
    return phase3result;
  }
```

### UnnecessaryLocalVariable
Local variable `realSourceFileNames` is redundant
in `jmh/src/main/java/com/uber/nullaway/jmh/CaffeineCompiler.java`
#### Snippet
```java
  protected List<String> getSourceFileNames() throws IOException {
    String caffeineSourceDir = getSourceDirectory();
    List<String> realSourceFileNames =
        SOURCE_FILE_NAMES.stream()
            .map(s -> caffeineSourceDir + File.separator + s.replace("/", File.separator))
```

### UnnecessaryLocalVariable
Local variable `sourceFileNames` is redundant
in `jmh/src/main/java/com/uber/nullaway/jmh/AbstractBenchmarkCompiler.java`
#### Snippet
```java
        Files.find(
            Paths.get(sourceDir), 100, (p, bfa) -> p.getFileName().toString().endsWith(".java"))) {
      List<String> sourceFileNames =
          stream.map(p -> p.toFile().getAbsolutePath()).collect(Collectors.toList());
      return sourceFileNames;
```

### UnnecessaryLocalVariable
Local variable `ap` is redundant
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
    private static AnalysisParams create(
        ForwardTransferFunction<?, ?> transferFunction, ControlFlowGraph cfg) {
      AnalysisParams ap = new AutoValue_DataFlow_AnalysisParams(transferFunction, cfg);
      return ap;
    }
```

### UnnecessaryLocalVariable
Local variable `finalType` is redundant
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
      newTypeArgs.add(newTypeArgType);
    }
    Type.ClassType finalType =
        new Type.ClassType(
            type.getEnclosingType(), com.sun.tools.javac.util.List.from(newTypeArgs), type.tsym);
```

## RuleId[id=RegExpUnnecessaryNonCapturingGroup]
### RegExpUnnecessaryNonCapturingGroup
Unnecessary non-capturing group `(?:missingValue)`
in `nullaway/src/main/java/com/uber/nullaway/AbstractConfig.java`
#### Snippet
```java
        Joiner.on("|")
            .join(Iterables.transform(packagePrefixes, input -> input.replaceAll("\\.", "\\\\.")));
    return Pattern.compile("^(?:" + choiceRegexp + ")(?:\\..*)?");
  }

```

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `sample/src/main/java/com/uber/mylib/Lambdas.java`
#### Snippet
```java
          int aPixels = a.height * a.width;
          int bPixels = b.height * b.width;
          if (bPixels < aPixels) {
            return -1;
          }
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`checkSuperTypes == false` can be simplified to '!checkSuperTypes'
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
        return symbol;
      }
      if (checkSuperTypes == false) {
        // Consider only a model on the exact class and method, used when checking annotated code
        return null;
```

