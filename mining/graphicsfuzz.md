# graphicsfuzz 
 
# Bad smells
I found 620 bad smells with 79 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 55 | false |
| OptionalUsedAsFieldOrParameterType | 54 | false |
| DataFlowIssue | 42 | false |
| UtilityClassWithoutPrivateConstructor | 39 | true |
| Convert2MethodRef | 37 | false |
| RedundantFieldInitialization | 34 | false |
| OptionalGetWithoutIsPresent | 31 | false |
| StringConcatenationInsideStringBufferAppend | 25 | false |
| ConstantValue | 20 | false |
| SystemOutErr | 19 | false |
| ReturnNull | 18 | false |
| ThrowablePrintStackTrace | 17 | false |
| ZeroLengthArrayInitialization | 13 | false |
| RedundantSuppression | 13 | false |
| SizeReplaceableByIsEmpty | 12 | true |
| SimplifyStreamApiCallChains | 12 | false |
| UnnecessaryToStringCall | 12 | true |
| DynamicRegexReplaceableByCompiledPattern | 12 | false |
| UnusedAssignment | 8 | false |
| OptionalIsPresent | 8 | false |
| NonProtectedConstructorInAbstractClass | 8 | true |
| UnnecessaryLocalVariable | 8 | true |
| CommentedOutCode | 7 | false |
| RefusedBequest | 7 | false |
| FieldMayBeStatic | 7 | false |
| AssignmentToMethodParameter | 7 | false |
| UnnecessaryCallToStringValueOf | 6 | false |
| NonShortCircuitBoolean | 5 | false |
| OptionalContainsCollection | 5 | false |
| KeySetIterationMayUseEntrySet | 4 | false |
| NestedAssignment | 4 | false |
| StringOperationCanBeSimplified | 4 | false |
| WrapperTypeMayBePrimitive | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| IgnoreResultOfCall | 3 | false |
| FuseStreamOperations | 3 | false |
| UnnecessaryBoxing | 3 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| UnnecessaryTemporaryOnConversionToString | 3 | false |
| UseBulkOperation | 3 | false |
| StaticCallOnSubclass | 2 | false |
| FinalPrivateMethod | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| UnnecessaryUnboxing | 2 | false |
| AccessStaticViaInstance | 2 | false |
| GroovyUnusedAssignment | 2 | false |
| IOResource | 2 | false |
| SocketResource | 2 | false |
| DeprecatedIsStillUsed | 2 | false |
| NonSerializableFieldInSerializableClass | 2 | false |
| MismatchedJavadocCode | 2 | false |
| AssignmentToForLoopParameter | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| MissingDeprecatedAnnotation | 2 | false |
| RedundantFileCreation | 2 | false |
| RedundantMethodOverride | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| InstanceofCatchParameter | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| DuplicateThrows | 1 | false |
| NonFinalFieldOfException | 1 | false |
| ComparatorCombinators | 1 | false |
| RedundantCollectionOperation | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| Convert2Lambda | 1 | false |
| UnnecessaryContinue | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `common/src/main/java/com/graphicsfuzz/common/util/MakeArrayAccessesInBounds.java`
#### Snippet
```java
      return false;
    }
    Integer indexValue;
    if (index instanceof IntConstantExpr) {
      indexValue = ((IntConstantExpr) index).getNumericValue();
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/SplitForLoopMutation.java`
#### Snippet
```java
      return Optional.empty();
    }
    final Integer startValue = maybeStartValue.get();

    // At this point, we have a name, an initial value, and a direction.  We move on to analyse
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/SplitForLoopMutation.java`
#### Snippet
```java
    // We now work out the end value, and whether the test has the form
    // VARIABLE OP LITERAL or LITERAL OP VARIABLE
    Integer endValue;
    boolean variableBeforeLiteral;
    Optional<String> lhsAsString = maybeGetName(test.getLhs());
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `isDeadCodeInjection()` declared in class 'com.graphicsfuzz.reducer.reductionopportunities.InjectionTrackingVisitor' but referenced via subclass 'com.graphicsfuzz.reducer.reductionopportunities.ReductionOpportunitiesBase'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/NotReferencedFromLiveContext.java`
#### Snippet
```java
  public void visitBlockStmt(BlockStmt stmt) {
    for (Stmt child : stmt.getStmts()) {
      if (ReductionOpportunitiesBase.isDeadCodeInjection(child)) {
        injectionTracker.enterDeadCodeInjection();
      }
```

### StaticCallOnSubclass
Static method `isDeadCodeInjection()` declared in class 'com.graphicsfuzz.reducer.reductionopportunities.InjectionTrackingVisitor' but referenced via subclass 'com.graphicsfuzz.reducer.reductionopportunities.ReductionOpportunitiesBase'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/NotReferencedFromLiveContext.java`
#### Snippet
```java
      }
      visit(child);
      if (ReductionOpportunitiesBase.isDeadCodeInjection(child)) {
        injectionTracker.exitDeadCodeInjection();
      }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/ArrayIndexExpr.java`
#### Snippet
```java
  public ArrayIndexExpr(Expr array, Expr index) {
    // Motivation for this exception:
    // vec2 v;
    // v[0]; // fine
    // v + vec2(0.0)[0]; // not fine - the following was probably intended:
```

### CommentedOutCode
Commented out code (34 lines)
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/ValidatorErrorShaderFileJudge.java`
#### Snippet
```java
    throw new RuntimeException();

    /*
    // 1. Shader file validates.

```

### CommentedOutCode
Commented out code (38 lines)
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/FuzzingFileJudge.java`
#### Snippet
```java
  ) {
    throw new RuntimeException();
    /*
    try {
      ExecResult res = ToolHelper.runValidatorOnShader(ExecHelper.RedirectType.TO_LOG, file);
```

### CommentedOutCode
Commented out code (3 lines)
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
    final OutputStream outputStream = socket.getOutputStream();
    // Header is composed of
    // uint64_t size;
    // uint32_t seed;
    // uint8_t isFragment;
```

### CommentedOutCode
Commented out code (3 lines)
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Generate.java`
#### Snippet
```java
    final StatsVisitor statsVisitor = new StatsVisitor(tu);

    // WebGL:
    //final int minNodes = 3000;
    //final int maxNodes = 20000;
```

### CommentedOutCode
Commented out code (3 lines)
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/WorkQueue.java`
#### Snippet
```java
    }

//    if(startWorker) {
//      executor.execute(myWorker);
//    }
```

### CommentedOutCode
Commented out code (2 lines)
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateCodeTransformation.java`
#### Snippet
```java
    // instance, the output colour variable of a donated fragment shader will change from:
    //   layout(location = 0) out vec4 name;
    // to:
    //   vec4 name;
    for (VariablesDeclaration variablesDeclarationWithQualifiers :
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/ParameterDecl.java`
#### Snippet
```java

  @Override
  public ParameterDecl clone() {
    return new ParameterDecl(name, type.clone(), arrayInfo == null ? null : arrayInfo.clone());
  }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/Initializer.java`
#### Snippet
```java

  @Override
  public Initializer clone() {
    return new Initializer(expr.clone());
  }
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/VariableDeclInfo.java`
#### Snippet
```java

  @Override
  public VariableDeclInfo clone() {
    return new VariableDeclInfo(name, arrayInfo == null ? null : arrayInfo.clone(),
        initializer == null ? null : initializer.clone());
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/ArrayInfo.java`
#### Snippet
```java

  @Override
  public ArrayInfo clone() {
    return new ArrayInfo(constantSizes, sizeExprs
        .stream()
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java

  @Override
  public TranslationUnit clone() {
    return new TranslationUnit(shaderKind, shadingLanguageVersion,
        topLevelDeclarations.stream().map(x -> x.clone()).collect(Collectors.toList()));
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/GlslShaderJob.java`
#### Snippet
```java

  @Override
  public GlslShaderJob clone() {
    return new GlslShaderJob(
        getLicense(),
```

### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `common/src/main/java/com/graphicsfuzz/common/util/PipelineInfo.java`
#### Snippet
```java

  @Override
  public PipelineInfo clone() {
    return new PipelineInfo(toString());
  }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `varDeclMapping.keySet()` may be replaced with 'entrySet()' iteration
in `common/src/main/java/com/graphicsfuzz/common/util/Obfuscator.java`
#### Snippet
```java
      this.typer = new Typer(tu);
      visit(tu);
      for (VariableDeclInfo declInfo : varDeclMapping.keySet()) {
        assert varDeclMapping.containsKey(declInfo);
        declInfo.setName(varDeclMapping.get(declInfo));
```

### KeySetIterationMayUseEntrySet
Iteration over `paramDeclMapping.keySet()` may be replaced with 'entrySet()' iteration
in `common/src/main/java/com/graphicsfuzz/common/util/Obfuscator.java`
#### Snippet
```java
        declInfo.setName(varDeclMapping.get(declInfo));
      }
      for (ParameterDecl parameterDecl : paramDeclMapping.keySet()) {
        assert paramDeclMapping.containsKey(parameterDecl);
        parameterDecl.setName(paramDeclMapping.get(parameterDecl));
```

### KeySetIterationMayUseEntrySet
Iteration over `callsIndirectly.keySet()` may be replaced with 'values()' iteration
in `reducer/src/main/java/com/graphicsfuzz/reducer/CheckAstFeatureVisitor.java`
#### Snippet
```java
      return;
    }
    for (String function : callsIndirectly.keySet()) {
      if (callsIndirectly.get(function).contains(enclosingFunctionName)) {
        callsIndirectly.get(function).addAll(callsIndirectly
```

### KeySetIterationMayUseEntrySet
Iteration over `functionsToUnusedParameters.keySet()` may be replaced with 'entrySet()' iteration
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveUnusedParameterReductionOpportunities.java`
#### Snippet
```java
        .map(item -> item.getPrototype().getName())
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    for (FunctionDefinition funDef : functionsToUnusedParameters.keySet()) {
      if (functionNameToCount.get(funDef.getPrototype().getName()) > 1) {
        // The function is overloaded, so do not consider removing its unused parameters.
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/UnOp.java`
#### Snippet
```java
        return "++";
      case PRE_DEC:
        return "--";
      default:
      assert this == PRE_INC : "Unknown unary operator: " + this;
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
        return "red";
      case EXCEPTION:
        return "red";
      default:
        return "red";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
          return;
        case MINUS:
          findFoldPlusMinusZeroOpportunities(parent, child, arg);
          return;
        default:
          return;
```

## RuleId[id=FinalPrivateMethod]
### FinalPrivateMethod
'private' method declared `final`
in `third_party/alphanum-comparator/src/main/java/com/graphicsfuzz/alphanumcomparator/AlphanumComparator.java`
#### Snippet
```java

  // Length of string is passed in for improved efficiency (only need to calculate it once)
  private final String getChunk(String str, int slength, int marker) {
    StringBuilder chunk = new StringBuilder();
    char ch = str.charAt(marker);
```

### FinalPrivateMethod
'private' method declared `final`
in `third_party/alphanum-comparator/src/main/java/com/graphicsfuzz/alphanumcomparator/AlphanumComparator.java`
#### Snippet
```java
 */
public class AlphanumComparator implements Comparator<String> {
  private final boolean isDigit(char ch) {
    return ((ch >= 48) && (ch <= 57));
  }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`matches.size() == 0` can be replaced with 'matches.isEmpty()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/Inliner.java`
#### Snippet
```java
              .filter(this::functionMatches)
              .collect(Collectors.toList());
    if (matches.size() == 0) {
      throw new CannotInlineCallException("No matching call");
    }
```

### SizeReplaceableByIsEmpty
`name.length() == 0` can be replaced with 'name.isEmpty()'
in `common/src/main/java/com/graphicsfuzz/common/util/PipelineInfo.java`
#### Snippet
```java

  private static boolean isLegalUniformName(String name) {
    if (name.length() == 0) {
      return false;
    }
```

### SizeReplaceableByIsEmpty
`tempDir.toString().length() > 0` can be replaced with '!tempDir.toString().isEmpty()'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java

    File tempDir = getParent(shaderJobFileTemp);
    if (tempDir.toString().length() > 0) {
      mkdir(tempDir);
    }
```

### SizeReplaceableByIsEmpty
`workers.size() == 0` can be replaced with 'workers.isEmpty()'
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java

    htmlAppendLn("<h4 class='ui dividing header'>Workers</h4>");
    if (workers.size() == 0) {
      htmlAppendLn("<p>No connected worker</p>");
    } else {
```

### SizeReplaceableByIsEmpty
`shaderFamilies.size() == 0` can be replaced with 'shaderFamilies.isEmpty()'
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java

    htmlAppendLn("<h4 class='ui dividing header'>Shader families</h4>");
    if (shaderFamilies.size() == 0) {
      htmlAppendLn("<p>No shader families detected</p>");
    } else {
```

### SizeReplaceableByIsEmpty
`commands.size() > 0` can be replaced with '!commands.isEmpty()'
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
      if (worker.getWorkerName().equals(workerName)) {
        List<CommandInfo> commands = worker.getCommandQueue();
        if (commands.size() > 0) {
          atLeastOne = true;
          htmlAppendLn("<button class='ui black basic button'onclick='toggleDiv(this)'",
```

### SizeReplaceableByIsEmpty
`shaderFamilies.size() > 0` can be replaced with '!shaderFamilies.isEmpty()'
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
        "<div class='ui middle aligned selection animated celled list'>\n");
    List<File> shaderFamilies = getAllShaderFamilies(request, response);
    if (shaderFamilies.size() > 0) {
      for (File file : shaderFamilies) {
        ShaderFamily shaderFamily = new ShaderFamily(file.getName());
```

### SizeReplaceableByIsEmpty
`seed.length() > 0` can be replaced with '!seed.isEmpty()'
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    }
    final String seed = request.getParameter("seed");
    if (seed != null && seed.length() > 0) {
      args.add("--seed");
      args.add(seed);
```

### SizeReplaceableByIsEmpty
`swizzle.length() > 0` can be replaced with '!swizzle.isEmpty()'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java

  private static int getOffsetFromSwizzle(String swizzle) {
    assert swizzle.length() > 0;
    assert swizzle.length() <= 4;
    if (!Pattern.compile("(x|y|z|w|r|g|b|a|s|t|p|q)+").matcher(swizzle).matches()) {
```

### SizeReplaceableByIsEmpty
`options.size() > 0` can be replaced with '!options.isEmpty()'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateDeadCodeTransformation.java`
#### Snippet
```java
            !donationContext.getDeclaredVariableNames().contains(x)).collect(Collectors.toList());

        if (options.size() > 0) {
          substitution.put(name, options.get(generator.nextInt(options.size())));
          dealtWithFreeVariable = true;
```

### SizeReplaceableByIsEmpty
`applicableTemplates.size() == 0` can be replaced with 'applicableTemplates.isEmpty()'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
      }

      if (applicableTemplates.size() == 0) {
        throw new FuzzedIntoACornerException();
      }
```

### SizeReplaceableByIsEmpty
`session.jobQueue.size() == 0` can be replaced with 'session.jobQueue.isEmpty()'
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java

        while (true) {
          if (session.jobQueue.size() == 0) {
            LOGGER.info("no job");
            return new Job().setJobId(0).setNoJob(new NoJob());
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("enabledDead: " + isEnabledDead() + "\n");
    sb.append("enabledJump: " + isEnabledJump() + "\n");
```

### StringBufferReplaceableByString
`StringBuilder sb` can be replaced with 'String'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
  @Override
  public final String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("small: " + small + "\n");
    sb.append("allowLongLoops: " + allowLongLoops + "\n");
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `anotherRoundWorthwhile |= !getCurrentPass().reachedMinimumGranularity()`
in `reducer/src/main/java/com/graphicsfuzz/reducer/glslreducers/SystematicReductionPassManager.java`
#### Snippet
```java
      // another round of passes: this pass might fare better when applied in a more fine-grained
      // fashion.
      anotherRoundWorthwhile |= !getCurrentPass().reachedMinimumGranularity();
      if (passIndex < currentPasses.size() - 1) {
        LOGGER.info("Moving on to the next pass");
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `shaderExists |= new File(shaderJobFileNoExtension + ".frag").isFile()`
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    boolean shaderExists = false;
    //noinspection ConstantConditions
    shaderExists |= new File(shaderJobFileNoExtension + ".frag").isFile();
    shaderExists |= new File(shaderJobFileNoExtension + ".vert").isFile();
    shaderExists |= new File(shaderJobFileNoExtension + ".comp").isFile();
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `shaderExists |= new File(shaderJobFileNoExtension + ".vert").isFile()`
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    //noinspection ConstantConditions
    shaderExists |= new File(shaderJobFileNoExtension + ".frag").isFile();
    shaderExists |= new File(shaderJobFileNoExtension + ".vert").isFile();
    shaderExists |= new File(shaderJobFileNoExtension + ".comp").isFile();

```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `shaderExists |= new File(shaderJobFileNoExtension + ".comp").isFile()`
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    shaderExists |= new File(shaderJobFileNoExtension + ".frag").isFile();
    shaderExists |= new File(shaderJobFileNoExtension + ".vert").isFile();
    shaderExists |= new File(shaderJobFileNoExtension + ".comp").isFile();

    if (!shaderExists) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `isUsed |= isComponentAccess(memberLookupExpr, getCurrentScope())`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
      public void visitMemberLookupExpr(MemberLookupExpr memberLookupExpr) {
        super.visitMemberLookupExpr(memberLookupExpr);
        isUsed |= isComponentAccess(memberLookupExpr, getCurrentScope());
      }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Expr`
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/Expr.java`
#### Snippet
```java
  public abstract boolean hasChild(IAstNode child);

  public static void checkNoTopLevelCommaExpression(List<Expr> args) {
    for (Expr arg : args) {
      if (arg instanceof BinaryExpr && ((BinaryExpr) arg).getOp() == BinOp.COMMA) {
```

### BoundedWildcard
Can generalize to `? extends VariableDeclInfo`
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/VariablesDeclaration.java`
#### Snippet
```java

  public VariablesDeclaration(Type baseType,
                              List<VariableDeclInfo> declInfos) {
    assert baseType != null;
    this.baseType = baseType;
```

### BoundedWildcard
Can generalize to `? extends FunctionPrototype`
in `ast/src/main/java/com/graphicsfuzz/common/ast/AstUtil.java`
#### Snippet
```java
  }

  private static List<String> getFunctionNames(List<FunctionPrototype> prototypes) {
    return prototypes.stream().map(y -> y.getName()).collect(Collectors.toList());
  }
```

### BoundedWildcard
Can generalize to `? extends ParameterDecl`
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/FunctionPrototype.java`
#### Snippet
```java
  private List<ParameterDecl> parameters;

  public FunctionPrototype(String name, Type returnType, List<ParameterDecl> parameters) {
    assert name != null;
    assert returnType != null;
```

### BoundedWildcard
Can generalize to `? extends Stmt`
in `ast/src/main/java/com/graphicsfuzz/common/ast/stmt/BlockStmt.java`
#### Snippet
```java
  }

  public void setStmts(List<Stmt> stmts) {
    this.stmts = new ArrayList<>();
    this.stmts.addAll(stmts);
```

### BoundedWildcard
Can generalize to `? extends Declaration`
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
  public TranslationUnit(ShaderKind shaderKind,
                         Optional<ShadingLanguageVersion> shadingLanguageVersion,
                         List<Declaration> topLevelDeclarations) {
    this.shaderKind = shaderKind;
    this.shadingLanguageVersion = shadingLanguageVersion;
```

### BoundedWildcard
Can generalize to `? extends TypeQualifier`
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
  }

  private boolean noDuplicateQualifiers(List<TypeQualifier> qualifiers) {
    Set<TypeQualifier> qualifierSet = new HashSet<>();
    qualifierSet.addAll(qualifiers);
```

### BoundedWildcard
Can generalize to `? extends List`
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
      }

      private List<Stmt> regionStackToStmts(List<List<Stmt>> regionStack) {
        if (regionStack.size() == 1) {
          return regionStack.get(0);
```

### BoundedWildcard
Can generalize to `? extends List`
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
      }

      private void addToCurrentRegion(List<List<Stmt>> regionStack, Stmt stmt) {
        regionStack.get(regionStack.size() - 1).add(stmt);
      }
```

### BoundedWildcard
Can generalize to `? extends T`
in `ast/src/main/java/com/graphicsfuzz/common/util/ListConcat.java`
#### Snippet
```java
  }

  public static <T> List<T> concatenate(List<T> first, List<T> second) {
    List<T> result = new ArrayList<>();
    result.addAll(first);
```

### BoundedWildcard
Can generalize to `? extends T`
in `ast/src/main/java/com/graphicsfuzz/common/util/ListConcat.java`
#### Snippet
```java
  }

  public static <T> List<T> concatenate(List<T> first, List<T> second) {
    List<T> result = new ArrayList<>();
    result.addAll(first);
```

### BoundedWildcard
Can generalize to `? extends ParameterDecl`
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  private final Optional<InterfaceBlock> interfaceBlock;

  private ScopeEntry(Type type, Optional<ParameterDecl> parameterDecl,
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
```

### BoundedWildcard
Can generalize to `? extends VariableDeclInfo`
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java

  private ScopeEntry(Type type, Optional<ParameterDecl> parameterDecl,
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
                     Optional<InterfaceBlock> interfaceBlock) {
```

### BoundedWildcard
Can generalize to `? extends VariablesDeclaration`
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  private ScopeEntry(Type type, Optional<ParameterDecl> parameterDecl,
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
                     Optional<InterfaceBlock> interfaceBlock) {
    this.type = type;
```

### BoundedWildcard
Can generalize to `? extends InterfaceBlock`
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
                     Optional<InterfaceBlock> interfaceBlock) {
    this.type = type;
    this.parameterDecl = parameterDecl;
```

### BoundedWildcard
Can generalize to `? extends FunctionPrototype`
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java

  private Optional<Type> lookForMatchingFunction(FunctionCallExpr functionCallExpr,
                                                 Collection<FunctionPrototype> candidateFunctions) {
    if (candidateFunctions != null) {
      for (FunctionPrototype prototype : candidateFunctions) {
```

### BoundedWildcard
Can generalize to `? super String`
in `util/src/main/java/com/graphicsfuzz/util/ExecHelper.java`
#### Snippet
```java
  }

  public static void addToPath(Map<String, String> envVars, String pathToAdd) {
    if (!envVars.containsKey(pathVar)) {
      envVars.put(pathVar, pathToAdd);
```

### BoundedWildcard
Can generalize to `? extends T`
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
  }

  private <T> Expr handleBinary(List<T> operands, List<Token> operators,
      Function<T, Expr> childVisitor) {
    assert operands.size() == operators.size() + 1;
```

### BoundedWildcard
Can generalize to `? extends Token`
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
  }

  private <T> Expr handleBinary(List<T> operands, List<Token> operators,
      Function<T, Expr> childVisitor) {
    assert operands.size() == operators.size() + 1;
```

### BoundedWildcard
Can generalize to `? super T`
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java

  private <T> Expr handleBinary(List<T> operands, List<Token> operators,
      Function<T, Expr> childVisitor) {
    assert operands.size() == operators.size() + 1;
    assert operands.size() >= 1;
```

### BoundedWildcard
Can generalize to `? extends Expr`
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java

  private <T> Expr handleBinary(List<T> operands, List<Token> operators,
      Function<T, Expr> childVisitor) {
    assert operands.size() == operators.size() + 1;
    assert operands.size() >= 1;
```

### BoundedWildcard
Can generalize to `? super String`
in `common/src/main/java/com/graphicsfuzz/common/util/StripUnusedFunctions.java`
#### Snippet
```java
  }

  private Set<String> computeCallable(String functionName, Set<String> previouslySeen) {
    if (previouslySeen.contains(functionName)) {
      return new HashSet<>();
```

### BoundedWildcard
Can generalize to `? super ThresholdConfiguration`
in `common/src/main/java/com/graphicsfuzz/common/util/FuzzyImageComparison.java`
#### Snippet
```java
   * @param configurations some default configurations will be added to this list
   */
  public static void addDefaultConfigurations(List<ThresholdConfiguration> configurations) {
    configurations.add(
        new ThresholdConfiguration(
```

### BoundedWildcard
Can generalize to `? extends UniformValueSupplier`
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
                              boolean emitGraphicsFuzzDefines,
                              Optional<String> license,
                              Optional<UniformValueSupplier> uniformValues) {
    this.out = out;
    this.indentationWidth = indentationWidth;
```

### BoundedWildcard
Can generalize to `? extends MergedVariablesComponentData`
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/MergeSet.java`
#### Snippet
```java
   * @return Mangled name for the merge set
   */
  private static String getMergedName(List<MergedVariablesComponentData> components) {
    return GLF_MERGED_PREFIX
        + components.size() + "_"
```

### BoundedWildcard
Can generalize to `? extends Supplier`
in `reducer/src/main/java/com/graphicsfuzz/reducer/CheckAstFeaturesFileJudge.java`
#### Snippet
```java

  public CheckAstFeaturesFileJudge(
      List<Supplier<CheckAstFeatureVisitor>> visitorSuppliers,
      ShaderKind shaderKind,
      ShaderJobFileOperations fileOps) {
```

### BoundedWildcard
Can generalize to `? extends Expr`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/OutlinedStatementReductionOpportunity.java`
#### Snippet
```java
   * Returns a subsituted expression, and may mutate the argument expression in the process.
   */
  private Expr applySubstitutionDestructive(Expr expr, Map<String, Expr> paramReplacement) {
    assert !paramReplacement.values().contains(null);
    if (expr instanceof VariableIdentifierExpr
```

### BoundedWildcard
Can generalize to `? super Stmt`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FlattenLoopReductionOpportunity.java`
#### Snippet
```java
  }

  void addLoopBody(List<Stmt> newStmts) {
    if (loopStmt.getBody() instanceof BlockStmt) {
      newStmts.addAll(((BlockStmt) loopStmt.getBody()).getStmts());
```

### BoundedWildcard
Can generalize to `? extends IReductionPass`
in `reducer/src/main/java/com/graphicsfuzz/reducer/glslreducers/SystematicReductionPassManager.java`
#### Snippet
```java
  }

  private void startNewRound(List<IReductionPass> passes) {
    passIndex = 0;
    anotherRoundWorthwhile = false;
```

### BoundedWildcard
Can generalize to `? extends SsboFieldData`
in `common/src/main/java/com/graphicsfuzz/common/util/PipelineInfo.java`
#### Snippet
```java
  public void addComputeInfo(int numGroupsX, int numGroupsY, int numGroupsZ,
                             int ssboBinding,
                             List<SsboFieldData> ssboFields) {
    assert !dictionary.has(Constants.COMPUTE_DATA_KEY);
    final JsonObject buffer = new JsonObject();
```

### BoundedWildcard
Can generalize to `? super Class`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/Compatibility.java`
#### Snippet
```java
  private static boolean matchesEitherDirection(Class<? extends IReductionOpportunity> first,
      Class<? extends IReductionOpportunity> second,
      Predicate<Class<? extends IReductionOpportunity>> pred1,
      Predicate<Class<? extends IReductionOpportunity>> pred2) {
    return (pred1.test(first) && pred2.test(second))
```

### BoundedWildcard
Can generalize to `? super Class`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/Compatibility.java`
#### Snippet
```java
      Class<? extends IReductionOpportunity> second,
      Predicate<Class<? extends IReductionOpportunity>> pred1,
      Predicate<Class<? extends IReductionOpportunity>> pred2) {
    return (pred1.test(first) && pred2.test(second))
        || (pred2.test(first) && pred1.test(second));
```

### BoundedWildcard
Can generalize to `? super Class`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/Compatibility.java`
#### Snippet
```java
  private static boolean bothMatch(Class<? extends IReductionOpportunity> first,
      Class<? extends IReductionOpportunity> second,
      Predicate<Class<? extends IReductionOpportunity>> pred) {
    return pred.test(first) && pred.test(second);
  }
```

### BoundedWildcard
Can generalize to `? extends Initializer`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunity.java`
#### Snippet
```java
  private Optional<StructifiedVariableInfo> findOriginalVariableInfo(
      StructNameType type,
      Optional<Initializer> initializer) {

    final StructDefinitionType structDefinitionType = tu.getStructDefinition(type);
```

### BoundedWildcard
Can generalize to `? super String`
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
  }

  private static void addBuiltin(Map<String, List<FunctionPrototype>> builtinsForVersion,
      String name, Type resultType, Type... args) {
    if (!builtinsForVersion.containsKey(name)) {
```

### BoundedWildcard
Can generalize to `? super Float`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
                                                         Expr lhs,
                                                         Expr rhs,
                                                         BinaryOperator<Float> op) {
    if (isFpConstant(lhs) && isFpVectorConstant(rhs)) {
      final TypeConstructorExpr typeConstructorExpr = (TypeConstructorExpr) rhs;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java

  private void findFoldUintBinaryOpportunities(IAstNode parent, Expr child, Expr lhs, Expr rhs,
                                              BinaryOperator<Integer> op) {
    if (isUintConstant(lhs) && isUintConstant(rhs)) {
      addReplaceWithExpr(parent, child, new UIntConstantExpr(
```

### BoundedWildcard
Can generalize to `? super Float`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java

  private void findFoldFpBinaryOpportunities(IAstNode parent, Expr child, Expr lhs, Expr rhs,
                                             BinaryOperator<Float> op) {
    if (isFpConstant(lhs) && isFpConstant(rhs)) {
      addReplaceWithExpr(parent, child, new FloatConstantExpr(
```

### BoundedWildcard
Can generalize to `? super Integer`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java

  private void findFoldIntBinaryOpportunities(IAstNode parent, Expr child, Expr lhs, Expr rhs,
                                             BinaryOperator<Integer> op) {
    if (isIntConstant(lhs) && isIntConstant(rhs)) {
      addReplaceWithExpr(parent, child, new IntConstantExpr(
```

### BoundedWildcard
Can generalize to `? super Stmt`
in `generator/src/main/java/com/graphicsfuzz/generator/util/RemoveStatements.java`
#### Snippet
```java
  private final Function<Stmt, Stmt> replaceWith;

  public RemoveStatements(Predicate<Stmt> shouldRemove,
      Function<Stmt, Stmt> replaceWith, IAstNode node) {
    this.shouldRemove = shouldRemove;
```

### BoundedWildcard
Can generalize to `? super Stmt`
in `generator/src/main/java/com/graphicsfuzz/generator/util/RemoveStatements.java`
#### Snippet
```java

  public RemoveStatements(Predicate<Stmt> shouldRemove,
      Function<Stmt, Stmt> replaceWith, IAstNode node) {
    this.shouldRemove = shouldRemove;
    this.replaceWith = replaceWith;
```

### BoundedWildcard
Can generalize to `? extends Stmt`
in `generator/src/main/java/com/graphicsfuzz/generator/util/RemoveStatements.java`
#### Snippet
```java

  public RemoveStatements(Predicate<Stmt> shouldRemove,
      Function<Stmt, Stmt> replaceWith, IAstNode node) {
    this.shouldRemove = shouldRemove;
    this.replaceWith = replaceWith;
```

### BoundedWildcard
Can generalize to `? extends ConstantExpr`
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/templates/ConstantExprTemplate.java`
#### Snippet
```java
  }

  private Expr makeTypeConstructor(BasicType type, Supplier<ConstantExpr> supplier, int width) {
    List<Expr> args = new ArrayList<>();
    for (int i = 0; i < width; i++) {
```

### BoundedWildcard
Can generalize to `? extends NodeT`
in `generator/src/main/java/com/graphicsfuzz/generator/mutateapi/Node2NodeMutation.java`
#### Snippet
```java
   * @param replacement A supplier for the replacement node.
   */
  protected Node2NodeMutation(IAstNode parent, NodeT original, Supplier<NodeT> replacement) {
    assert parent.hasChild(original);
    this.parent = parent;
```

### BoundedWildcard
Can generalize to `? super IRandom`
in `generator/src/main/java/com/graphicsfuzz/generator/mutateapi/MutationFinder.java`
#### Snippet
```java
   * @return Randomly filtered list of mutations.
   */
  default List<MutationT> findMutations(Function<IRandom, Boolean> probabilities,
                                       IRandom generator) {
    return findMutations().stream().filter(item -> probabilities.apply(generator))
```

### BoundedWildcard
Can generalize to `? extends Type`
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/donation/DonationContext.java`
#### Snippet
```java
  private final FunctionDefinition enclosingFunction;

  public DonationContext(Stmt donorFragment, Map<String, Type> freeVariables,
      List<StructDefinitionType> availableStructs,
      FunctionDefinition enclosingFunction) {
```

### BoundedWildcard
Can generalize to `? extends StructDefinitionType`
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/donation/DonationContext.java`
#### Snippet
```java

  public DonationContext(Stmt donorFragment, Map<String, Type> freeVariables,
      List<StructDefinitionType> availableStructs,
      FunctionDefinition enclosingFunction) {
    this.donorFragment = donorFragment;
```

### BoundedWildcard
Can generalize to `? super IRandom`
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/injection/InjectionPoints.java`
#### Snippet
```java
  }

  public List<IInjectionPoint> getInjectionPoints(Function<IRandom, Boolean> choiceFunction) {
    return injectionPoints.stream().filter(injectionPoint ->
          choiceFunction.apply(generator)).collect(Collectors.toList());
```

### BoundedWildcard
Can generalize to `? super IInjectionPoint`
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/injection/InjectionPoints.java`
#### Snippet
```java

  public InjectionPoints(TranslationUnit tu, IRandom generator,
        Predicate<IInjectionPoint> suitable) {
    this.injectionPoints = new ArrayList<>();
    this.currentFunction = null;
```

### BoundedWildcard
Can generalize to `? super IExprTemplate`
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Templates.java`
#### Snippet
```java
  }

  private static void addTemplate(List<IExprTemplate> templates, IExprTemplate template) {
    templates.add(template);
  }
```

### BoundedWildcard
Can generalize to `? super Type`
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/InterchangeExprMutationFinder.java`
#### Snippet
```java
   * Increments 'typeCounts' at 'type', or sets it to 1 if not present.
   */
  private void countType(Map<Type, Integer> typeCounts, Type type) {
    if (typeCounts.containsKey(type)) {
      typeCounts.put(type,
```

### BoundedWildcard
Can generalize to `? extends Type`
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/InterchangeExprMutationFinder.java`
#### Snippet
```java
   * of one another.
   */
  private boolean compatibleArguments(IExprTemplate template, List<Type> argumentTypes) {
    if (template.getNumArguments() != argumentTypes.size()) {
      return false;
```

### BoundedWildcard
Can generalize to `? super IInjectionPoint`
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/InjectionPointMutationFinder.java`
#### Snippet
```java
      TranslationUnit tu, IRandom random,
      Predicate<IInjectionPoint> isSuitableInjectionPoint,
      Function<IInjectionPoint, MutationT> mutateAtInjectionPoint) {
    this.tu = tu;
    this.random = random;
```

### BoundedWildcard
Can generalize to `? extends MutationT`
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/InjectionPointMutationFinder.java`
#### Snippet
```java
      TranslationUnit tu, IRandom random,
      Predicate<IInjectionPoint> isSuitableInjectionPoint,
      Function<IInjectionPoint, MutationT> mutateAtInjectionPoint) {
    this.tu = tu;
    this.random = random;
```

### BoundedWildcard
Can generalize to `? super Integer`
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddSwitchMutation.java`
#### Snippet
```java
  }

  private Integer getCaseLabel(List<Integer> usedLabels, IRandom generator) {
    Integer caseLabel;
    do {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/FuzzingFileJudge.java`
#### Snippet
```java
  private void recordCrash(File file) throws IOException {
    if (!this.crashes.isDirectory()) {
      this.crashes.mkdirs();
    }
    String hash = Hex.encodeHexString(this.sha1(FileUtils.readFileToByteArray(file)));
```

### IgnoreResultOfCall
Result of `File.renameTo()` is ignored
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    } else {
      //Attempt to rename
      workerDir.renameTo(newWorkerDir);
      if (!newWorkerDir.exists()) {
        msg = "Renaming failed!";
```

### IgnoreResultOfCall
Result of `InputStream.read()` is ignored
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
      // Read the shader.
      byte[] inputShaderBuff = new byte[(int) shaderSize];
      socket.getInputStream().read(inputShaderBuff, 0, inputShaderBuff.length);
      final String inputShader = new String(inputShaderBuff);

```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `server/src/main/java/com/graphicsfuzz/server/webui/AccessFileInfo.java`
#### Snippet
```java
        + "/" + WebUiConstants.WORKER_INFO_FILE);
    if (workerInfoMap.containsKey(workerName)
        && workerInfoFile.lastModified() == workerInfoLastModified.get(workerName).longValue()) {
      return workerInfoMap.get(workerName);
    } else {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `server/src/main/java/com/graphicsfuzz/server/webui/AccessFileInfo.java`
#### Snippet
```java
    String resultPath = resultInfoFile.getPath();
    if (resultInfoMap.containsKey(resultPath)
        && resultInfoFile.lastModified() == resultInfoLastModified.get(resultPath).longValue()) {
      return resultInfoMap.get(resultPath);
    } else {
```

## RuleId[id=AccessStaticViaInstance]
### AccessStaticViaInstance
Static member 'com.graphicsfuzz.common.ast.type.BasicType.FLOAT' accessed via instance reference
in `common/src/main/java/com/graphicsfuzz/common/util/SsboFieldData.java`
#### Snippet
```java
  public SsboFieldData(BasicType baseType, List<? extends Number> data) {
    assert !data.isEmpty();
    assert (baseType.getElementType() == baseType.FLOAT && data.get(0) instanceof Float)
        || (baseType.getElementType() == baseType.INT && data.get(0) instanceof Integer);
    this.baseType = baseType;
```

### AccessStaticViaInstance
Static member 'com.graphicsfuzz.common.ast.type.BasicType.INT' accessed via instance reference
in `common/src/main/java/com/graphicsfuzz/common/util/SsboFieldData.java`
#### Snippet
```java
    assert !data.isEmpty();
    assert (baseType.getElementType() == baseType.FLOAT && data.get(0) instanceof Float)
        || (baseType.getElementType() == baseType.INT && data.get(0) instanceof Integer);
    this.baseType = baseType;
    this.data = new ArrayList<>();
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `visitFunctionPrototype()` only delegates to its super method
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveUnusedParameterReductionOpportunities.java`
#### Snippet
```java

  @Override
  public void visitFunctionPrototype(FunctionPrototype functionPrototype) {
    super.visitFunctionPrototype(functionPrototype);
  }
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `ast/src/main/java/com/graphicsfuzz/common/util/ParseHelper.java`
#### Snippet
```java
      boolean passedEndOfGraphicsFuzzDefines = false;
      String line;
      while ((line = br.readLine()) != null) {
        if (passedEndOfGraphicsFuzzDefines
            || isVersion(line)
```

### NestedAssignment
Result of assignment expression used
in `ast/src/main/java/com/graphicsfuzz/common/util/ParseHelper.java`
#### Snippet
```java
    try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
      String line;
      while ((line = br.readLine()) != null) {
        if (line.trim().startsWith(END_OF_GRAPHICSFUZZ_DEFINES)) {
          result = true;
```

### NestedAssignment
Result of assignment expression used
in `util/src/main/java/com/graphicsfuzz/util/StreamGobbler.java`
#### Snippet
```java
      BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
      String line;
      while ((line = br.readLine()) != null) {
        handleLine(line);
      }
```

### NestedAssignment
Result of assignment expression used
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    byte[] buffer = new byte[1024];
    int bytesRead;
    while ((bytesRead = input.read(buffer)) != -1) {
      output.write(buffer, 0, bytesRead);
    }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `interfaceBlocks` are updated, but never queried
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java

  // The interface blocks observed so far during type-checking.
  private final List<InterfaceBlock> interfaceBlocks;

  public Typer(TranslationUnit tu) {
```

## RuleId[id=GroovyUnusedAssignment]
### GroovyUnusedAssignment
Assignment is not used
in `gles-worker/core/build.gradle`
#### Snippet
```java
}

sourceCompatibility = 1.6
[compileJava, compileTestJava]*.options*.encoding = 'UTF-8'

```

### GroovyUnusedAssignment
Assignment is not used
in `gles-worker/ios/build.gradle`
#### Snippet
```java
sourceSets.main.java.srcDirs = [ "src/" ]

sourceCompatibility = '1.7'
[compileJava, compileTestJava]*.options*.encoding = 'UTF-8'

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/ast/stmt/LoopStmt.java`
#### Snippet
```java
    }

    private int nestingDepth = 0;

    public boolean check() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/Inliner.java`
#### Snippet
```java

    new StandardVisitor() {
      private BlockStmt currentBlockStmt = null;
      private int currentIndex;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
  private int numReturnStmts(Stmt stmt) {
    return new StandardVisitor() {
      private int returnCount = 0;

      @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/util/StatsVisitor.java`
#### Snippet
```java
public class StatsVisitor extends StandardVisitor {

  private int statements = 0;
  private int nodes = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/util/StatsVisitor.java`
#### Snippet
```java

  private int statements = 0;
  private int nodes = 0;

  public StatsVisitor(IAstNode node) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/util/StructUtils.java`
#### Snippet
```java
    return new StandardVisitor() {

      private int counter = 0;

      @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/GloballyTruncateLoops.java`
#### Snippet
```java
        // whether we need to add global declarations for the loop limiter (we don't if there is no
        // truncation).
        private boolean appliedAtLeastOneTruncation = false;

        // Converts loop condition from "x" to "(x) && (lc<lb)".
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
    // Analyse the shader for used features (can't use anonymous class due to member access)
    class FragmentBuiltinUsageAnalysis extends StandardVisitor {
      private boolean usesFragCoord = false;
      private boolean usesFragDepth = false;
      private boolean usesDiscard = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
      private boolean usesFragCoord = false;
      private boolean usesFragDepth = false;
      private boolean usesDiscard = false;

      public boolean getUsesDiscard() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
    class FragmentBuiltinUsageAnalysis extends StandardVisitor {
      private boolean usesFragCoord = false;
      private boolean usesFragDepth = false;
      private boolean usesDiscard = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/PruneUniforms.java`
#### Snippet
```java
    // sampler was added.
    final boolean useOfCanonicalSamplerWasAdded = new ScopeTrackingVisitor() {
      private boolean madeReplacement = false;

      @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/FuzzyImageComparison.java`
#### Snippet
```java
    public List<ThresholdConfiguration> configurations;

    public static int EXIT_STATUS_SIMILAR = 0;
    public static int EXIT_STATUS_DIFFERENT = 1;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
  private final Supplier<String> newLineSupplier;
  private final int indentationWidth;
  private int indentationCount = 0;
  private final PrintStream out;
  private boolean inFunctionDefinition = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
  private int indentationCount = 0;
  private final PrintStream out;
  private boolean inFunctionDefinition = false;
  private final boolean emitGraphicsFuzzDefines;
  private final Optional<String> license;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java

  // Allows different formatting of a declaration when part of the header of a for statement.
  private boolean insideForStatementHeader = false;

  public PrettyPrinterVisitor(PrintStream out) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/ReductionDriver.java`
#### Snippet
```java
  private final File workDir;

  private int numSuccessfulReductions = 0;

  private final Set<String> failHashCache;
```

### RedundantFieldInitialization
Field initialization to `0.0` is redundant
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    public ImageDifferenceResult histogram = null;
    public ImageDifferenceResult fuzzy = null;
    public double histogramDistance = 0.0;
  }

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    public ImageDifferenceResult summary = null;
    public ImageDifferenceResult histogram = null;
    public ImageDifferenceResult fuzzy = null;
    public double histogramDistance = 0.0;
  }
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
  private static final class ImageDifferenceResultSet {
    public ImageDifferenceResult summary = null;
    public ImageDifferenceResult histogram = null;
    public ImageDifferenceResult fuzzy = null;
    public double histogramDistance = 0.0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java

  private static final class ImageDifferenceResultSet {
    public ImageDifferenceResult summary = null;
    public ImageDifferenceResult histogram = null;
    public ImageDifferenceResult fuzzy = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunity.java`
#### Snippet
```java
      private Stmt stmtOfInterest;
      private boolean inStmtOfInterest = false;
      private boolean found = false;

      @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunity.java`
#### Snippet
```java

      private Stmt stmtOfInterest;
      private boolean inStmtOfInterest = false;
      private boolean found = false;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/ShadowChecker.java`
#### Snippet
```java
  private final String nameOfInterest;

  private boolean inBlock = false;
  private ScopeEntry possiblyShadowedScopeEntry = null;
  private boolean ok = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/ShadowChecker.java`
#### Snippet
```java

  private boolean inBlock = false;
  private ScopeEntry possiblyShadowedScopeEntry = null;
  private boolean ok = true;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunity.java`
#### Snippet
```java
          .getVariablesDeclaration().getDeclInfo(0);
    return new ScopeTrackingVisitor() {
      private boolean found = false;
      @Override
      public void visitVariableIdentifierExpr(VariableIdentifierExpr variableIdentifierExpr) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
    return
      new ScopeTrackingVisitor() {
        private boolean vectorUsedDirectly = false;
        @Override
        public void visitVariableIdentifierExpr(VariableIdentifierExpr variableIdentifierExpr) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
  private boolean componentIsUsed() {
    return new ScopeTrackingVisitor() {
      private boolean isUsed = false;

      @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/FuzzingContext.java`
#### Snippet
```java
  private int enclosingLoops;

  private FunctionPrototype enclosingFunction = null;

  public FuzzingContext(Scope currentScope) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/donation/DonationContext.java`
#### Snippet
```java
    return new ScopeTrackingVisitor() {

      private boolean found = false;

      private int arrayIndexDepth = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/donation/DonationContext.java`
#### Snippet
```java
      private boolean found = false;

      private int arrayIndexDepth = 0;

      @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/SplitForLoopMutation.java`
#### Snippet
```java
    return new StandardVisitor() {

      private boolean foundModification = false;

      @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/VectorizeMutation.java`
#### Snippet
```java
  private class VectorizerVisitor extends ScopeTrackingVisitor {

    private boolean inDeclarationOfTargetVariable = false;
    private final ScopeEntry currentComponent;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/WorkQueue.java`
#### Snippet
```java
  private final MyWorker myWorker = new MyWorker();
  private boolean running;
  private Future future = null;
  private final int timeLimit = 60;
  private final int consecutiveFailureLimit = 5;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateCodeTransformation.java`
#### Snippet
```java
      // This gives us access to the base type of the group of variable declarations we are
      // currently visiting, if any.
      private VariablesDeclaration currentVariablesDeclaration = null;

      @Override
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `exception`
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GenerateShaderFamily.java`
#### Snippet
```java
      // defunct shader family, then re-throw the exception.
      LOGGER.info("Shader family generation aborting due to "
          + (exception instanceof ParseTimeoutException
          ? "parsing timing out"
          : "a shader failing to parse") + ".");
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer sb` may be declared as 'StringBuilder'
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/WorkQueue.java`
#### Snippet
```java

  public String queueToString() {
    StringBuffer sb = new StringBuffer();
    for (String s : queueToStringList()) {
      sb.append(s);
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `third_party/gif-sequence-writer/src/main/java/com/graphicsfuzz/gifsequencewriter/GifSequenceWriter.java`
#### Snippet
```java
      int imageType,
      int timeBetweenFramesMs,
      boolean loopContinuously) throws IIOException, IOException {
    // my method to create a writer
    gifWriter = getWriter();
```

## RuleId[id=FuseStreamOperations]
### FuseStreamOperations
Stream may be extended replacing 'sort'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Templates.java`
#### Snippet
```java
      Map<String, List<FunctionPrototype>> builtins = TyperHelper.getBuiltins(
          shadingLanguageVersion, isWgslCompatible, shaderKind);
      List<String> keys = builtins.keySet().stream().collect(Collectors.toList());
      keys.sort(String::compareTo);
      for (String key : keys) {
```

### FuseStreamOperations
Stream may be extended replacing 'sort'
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddOutputWriteMutation.java`
#### Snippet
```java
    assert !availableOutVars.isEmpty();

    final List<String> keys = availableOutVars.keySet().stream().collect(Collectors.toList());
    keys.sort(String::compareTo);
    final int index = random.nextInt(keys.size());
```

### FuseStreamOperations
Stream may be extended replacing HashSet
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateCodeTransformation.java`
#### Snippet
```java
        final Set<String> basicTypeNames = new HashSet<>(BasicType.allBasicTypes()
            .stream()
            .map(BasicType::toString).collect(Collectors.toSet()));
        // Add alternative names for square matrices.
        basicTypeNames.add("mat2x2");
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `util/src/main/java/com/graphicsfuzz/util/ToolHelper.java`
#### Snippet
```java
          null,
          false,
          command.toArray(new String[]{}));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `util/src/main/java/com/graphicsfuzz/util/ToolHelper.java`
#### Snippet
```java
          null,
          false,
          command.toArray(new String[]{}));
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/com/graphicsfuzz/server/GraphicsFuzzServerCommandDispatcher.java`
#### Snippet
```java
      case "run_shader_family":
        RunShaderFamily.mainHelper(
              command.subList(1, command.size()).toArray(new String[0]),
              fuzzerServiceManager
        );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/com/graphicsfuzz/server/GraphicsFuzzServerCommandDispatcher.java`
#### Snippet
```java
      case "glsl-reduce":
        GlslReduce.mainHelper(
              command.subList(1, command.size()).toArray(new String[0]),
              fuzzerServiceManager
        );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/CustomFileJudge.java`
#### Snippet
```java
          null,
          true,
          scriptPlusShaderArg.toArray(new String[0])
      );
      LOGGER.info("Custom file judge result: " + execResult.res);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    byte[] vertexData = isFile(vertexShaderFile)
        ? readFileToByteArray(vertexShaderFile)
        : new byte[0];
    byte[] fragmentData = isFile(fragmentShaderFile)
        ? readFileToByteArray(fragmentShaderFile)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    byte[] fragmentData = isFile(fragmentShaderFile)
        ? readFileToByteArray(fragmentShaderFile)
        : new byte[0];
    byte[] computeData = isFile(computeShaderFile)
        ? readFileToByteArray(computeShaderFile)
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    byte[] computeData = isFile(computeShaderFile)
        ? readFileToByteArray(computeShaderFile)
        : new byte[0];
    //  This metadata is required in order to distinguish between shader jobs
    //  with identical shaders but different pipeline information.
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    byte[] metaData = isFile(shaderJobFile)
        ? readFileToByteArray(shaderJobFile)
        : new byte[0];
    byte[] combinedData =
        new byte[vertexData.length + fragmentData.length + computeData.length + metaData.length ];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
      // If no variant shader job files are found, the array reference will be null; set it to an
      // empty array so that we can render a table with references only.
      variantShaderJobFiles = new File[0];
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GlslGenerate.java`
#### Snippet
```java
      }
      try {
        GenerateShaderFamily.mainHelper(generateShaderFamilyArgs.toArray(new String[0]));
      } catch (ReferencePreparationException referencePreparationException) {
        LOGGER.info("Generation of shader family was aborted due to problems preparing the "
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/PublicServerCommandDispatcher.java`
#### Snippet
```java
      case "run_shader_family":
        RunShaderFamily.mainHelper(
              command.subList(1, command.size()).toArray(new String[0]),
              fuzzerServiceManager
        );
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
                  null,
                  true,
                  command.toArray(new String[0])
            );

```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `name` of exception class
in `ast/src/main/java/com/graphicsfuzz/common/typing/DuplicateVariableException.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  private String name;

  DuplicateVariableException(String name) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `fval` initializer `0` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
          int lval = ((IntConstantExpr) lexpr).getNumericValue();
          int rval = ((IntConstantExpr) rexpr).getNumericValue();
          int fval = 0;
          switch (bexpr.getOp()) {
            case MOD:
```

### UnusedAssignment
Variable `reductionKind` initializer `null` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/GlslReduce.java`
#### Snippet
```java
      }

      ReductionKind reductionKind = null;
      try {
        reductionKind = ReductionKind.valueOf(((String) ns.get("reduction_kind")).toUpperCase());
```

### UnusedAssignment
Variable `metric` initializer `null` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/GlslReduce.java`
#### Snippet
```java
      }

      ImageComparisonMetric metric = null;
      try {
        metric = ImageComparisonMetric.valueOf(((String) ns.get("metric")).toUpperCase());
```

### UnusedAssignment
Variable `value` initializer `null` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/util/TransformationProbabilities.java`
#### Snippet
```java
        continue;
      }
      Object value = null;
      try {
        value = field.get(this);
```

### UnusedAssignment
Variable `result` initializer `0` is redundant
in `third_party/alphanum-comparator/src/main/java/com/graphicsfuzz/alphanumcomparator/AlphanumComparator.java`
#### Snippet
```java

      // If both chunks contain numeric characters, sort them numerically
      int result = 0;
      if (isDigit(thisChunk.charAt(0)) && isDigit(thatChunk.charAt(0))) {
        // Simple chunk comparison by length.
```

### UnusedAssignment
Variable `file` initializer `null` is redundant
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FileDownloadServlet.java`
#### Snippet
```java
    }
    pathInfo = pathInfo.substring(1);
    File file = null;
    String worker = request.getParameter(DOWNLOAD_FIELD_NAME_WORKER);
    try {
```

### UnusedAssignment
Variable `worker` initializer `null` is redundant
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
  public GetWorkerNameResult getWorkerName(String platformInfo, String oldWorker)
      throws TException {
    String worker = null;

    final String clientJsonFilename = "client.json";
```

### UnusedAssignment
Variable `clientInfoString` initializer `""` is redundant
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java

    // Write JSON platform info to a String.
    String clientInfoString = "";
    {
      CharArrayWriter fw = new CharArrayWriter();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `operands.size() >= 1` is always `true`
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      Function<T, Expr> childVisitor) {
    assert operands.size() == operators.size() + 1;
    assert operands.size() >= 1;
    Expr result = childVisitor.apply(operands.get(0));
    for (int i = 0; i < operators.size(); i++) {
```

### ConstantValue
Condition `(i % 2) == 1` is always `true`
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
    Expr result = argsInOrder.get(argsInOrder.size() - 1);
    for (int i = argsInOrder.size() - 2; i >= 0; i -= 2) {
      assert (i % 2) == 1;
      final Expr thenExpr = argsInOrder.get(i);
      result = new TernaryExpr(argsInOrder.get(i - 1), thenExpr, result);
```

### ConstantValue
Condition `workers != null` is always `true`
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
        "<div class='disconnected-workers invisible ui selection animated celled list'>");
    List<File> workerFiles = getAllWorkers(request, response);
    if (workers != null) {
      for (File worker : workerFiles) {
        if (!workers.contains(worker.getName())) {
```

### ConstantValue
Condition `lhsType == BasicType.MAT3X3 && rhsType == BasicType.MAT3X3` is always `false`
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
      return BasicType.MAT2X3;
    }
    if (lhsType == BasicType.MAT3X3 && rhsType == BasicType.MAT3X3) {
      return BasicType.MAT3X3;
    }
```

### ConstantValue
Condition `rhsType == BasicType.MAT3X3` is always `false` when reached
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
      return BasicType.MAT2X3;
    }
    if (lhsType == BasicType.MAT3X3 && rhsType == BasicType.MAT3X3) {
      return BasicType.MAT3X3;
    }
```

### ConstantValue
Condition `lhsType == BasicType.MAT4X4 && rhsType == BasicType.MAT4X4` is always `false`
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
      return BasicType.MAT3X4;
    }
    if (lhsType == BasicType.MAT4X4 && rhsType == BasicType.MAT4X4) {
      return BasicType.MAT4X4;
    }
```

### ConstantValue
Condition `rhsType == BasicType.MAT4X4` is always `false` when reached
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
      return BasicType.MAT3X4;
    }
    if (lhsType == BasicType.MAT4X4 && rhsType == BasicType.MAT4X4) {
      return BasicType.MAT4X4;
    }
```

### ConstantValue
Value `constContext` is always 'true'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
    final int newDepth = depth + 1;
    if (constContext) {
      return recursivelyMakeOpaqueBooleanScalar(value, constContext, fuzzer, newDepth);
    }
    final int numTypesOfBool = generationParams.getShaderKind() == ShaderKind.FRAGMENT ? 4 : 2;
```

### ConstantValue
Value `constContext` is always 'false'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
        case 0:
          // Make an opaque boolean value recursively and apply an identity function to it
          return recursivelyMakeOpaqueBooleanScalar(value, constContext, fuzzer, newDepth);
        case 1: {
          if (!generationParams.getInjectionSwitchIsAvailable()) {
```

### ConstantValue
Value `constContext` is always 'false'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
          assert generationParams.getShaderKind() == ShaderKind.FRAGMENT;
          return makeOpaqueBooleanScalarFromExpr(value,
              compareWithGlFragCoord(value, constContext, fuzzer, newDepth, "x"));
        }
        case 3: {
```

### ConstantValue
Value `constContext` is always 'false'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
          assert generationParams.getShaderKind() == ShaderKind.FRAGMENT;
          return makeOpaqueBooleanScalarFromExpr(value,
              compareWithGlFragCoord(value, constContext, fuzzer, newDepth, "y"));
        }
        default:
```

### ConstantValue
Value `constContext` is always 'false'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
        // We're in a diagonal, so the value depends on if we're making an opaque zero or one.
        assert !modifiableArgs.contains(i);
        matrixConstructorArgs.add(makeOpaqueZeroOrOne(isZero, type, constContext, depth, fuzzer));
        nextDiagonalMatrixIndex += matrixDimension + 1;
      } else if (modifiableArgs.contains(i)) {
```

### ConstantValue
Value `constContext` is always 'false'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
        // We're in a modifiable index - the value doesn't matter for the determinant.
        matrixConstructorArgs.add(makeOpaqueZeroOrOne(
            generator.nextBoolean(), type, constContext, depth, fuzzer));
      } else {
        // We're in a non-modifiable index - we need zero or we'll violate the triangular
```

### ConstantValue
Value `constContext` is always 'false'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
        // We're in a non-modifiable index - we need zero or we'll violate the triangular
        // property of the matrix.
        matrixConstructorArgs.add(makeOpaqueZero(type, constContext, depth, fuzzer));
      }
    }
```

### ConstantValue
Condition `elseBranchCanBeTransformed` is always `true` when reached
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddSwitchMutation.java`
#### Snippet
```java
      return;
    }
    assert thenBranchCanBeTransformed && elseBranchCanBeTransformed;
    while (true) {
      boolean transformedOne = false;
```

### ConstantValue
Result of `(loop >> 8) & 0xFF` is always '0'
in `third_party/gif-sequence-writer/src/main/java/com/graphicsfuzz/gifsequencewriter/GifSequenceWriter.java`
#### Snippet
```java

    child.setUserObject(new byte[]{ 0x1, (byte) (loop & 0xFF), (byte)
        ((loop >> 8) & 0xFF)});
    appEntensionsNode.appendChild(child);

```

### ConstantValue
Result of `loop >> 8` is always '0'
in `third_party/gif-sequence-writer/src/main/java/com/graphicsfuzz/gifsequencewriter/GifSequenceWriter.java`
#### Snippet
```java

    child.setUserObject(new byte[]{ 0x1, (byte) (loop & 0xFF), (byte)
        ((loop >> 8) & 0xFF)});
    appEntensionsNode.appendChild(child);

```

### ConstantValue
Condition `oldWorker.isEmpty()` is always `false`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
    if (oldWorker != null) {

      if (oldWorker.isEmpty()
          || !validWorkerNamePattern.matcher(oldWorker).matches()) {
        LOGGER.error("Invalid worker name provided: {}", oldWorker);
```

### ConstantValue
Condition `oldClientInfoString.isEmpty() || clientInfoString .equals(oldClientInfoString)` is always `true` when reached
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
    }

    if (oldWorker != null && (oldClientInfoString.isEmpty() || clientInfoString
        .equals(oldClientInfoString))) {
      LOGGER.info("Using provided worker name.");
      sessions.putIfAbsent(oldWorker, new Session(oldWorker, platformInfo, executorService));
```

### ConstantValue
Condition `clientInfoString .equals(oldClientInfoString)` is always `true` when reached
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
    }

    if (oldWorker != null && (oldClientInfoString.isEmpty() || clientInfoString
        .equals(oldClientInfoString))) {
      LOGGER.info("Using provided worker name.");
      sessions.putIfAbsent(oldWorker, new Session(oldWorker, platformInfo, executorService));
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/ArrayInfo.java`
#### Snippet
```java
   */
  public Expr getSizeExpr(int dimension) {
    return sizeExprs.get(dimension).get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/ArrayInfo.java`
#### Snippet
```java
  public Integer getConstantSize(int dimension) {
    if (hasConstantSize(dimension)) {
      return constantSizes.get(dimension).get();
    }
    throw new UnsupportedOperationException("Not a constant expression");
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/InterfaceBlock.java`
#### Snippet
```java

  public String getInstanceName() {
    return instanceName.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/InterfaceBlock.java`
#### Snippet
```java
  public LayoutQualifierSequence getLayoutQualifierSequence() {
    assert hasLayoutQualifierSequence();
    return layoutQualifier.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
        .filter(item -> item.hasStructNameType() && item.getStructNameType().equals(type))
        .findAny()
        .get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
            variablesDeclaration.getBaseType().hasQualifier(TypeQualifier.UNIFORM)
                && variablesDeclaration.getDeclInfos().stream()
                .anyMatch(variableDecl -> variableDecl.getName().equals(name))).findAny().get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
  public ShadingLanguageVersion getShadingLanguageVersion() {
    if (hasShadingLanguageVersion()) {
      return shadingLanguageVersion.get();
    }
    return ShadingLanguageVersion.ESSL_100;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
    return getFunctionDefinitions().filter(TranslationUnit::isMain)
        .findAny()
        .get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/Inliner.java`
#### Snippet
```java
          inlinedStmts.add(new ExprStmt(
                new BinaryExpr(
                      new VariableIdentifierExpr(returnVariableName.get()),
                      (((ReturnStmt) stmt).getExpr()),
                      BinOp.ASSIGN)));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java

  public InterfaceBlock getInterfaceBlock() {
    return interfaceBlock.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java

  public ParameterDecl getParameterDecl() {
    return parameterDecl.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java

  public VariablesDeclaration getVariablesDeclaration() {
    return variablesDeclaration.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java

  public VariableDeclInfo getVariableDeclInfo() {
    return variableDeclInfo.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/StructDefinitionType.java`
#### Snippet
```java
  public StructNameType getStructNameType() {
    assert hasStructNameType();
    return structNameType.get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/glslversion/ShadingLanguageVersion.java`
#### Snippet
```java
        .stream()
        .filter(item -> item.getVersionString().equals(versionString))
        .findAny().get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
  public static ShaderJob convertShaderJob(ShaderJob sj) throws Exception {
    // Get the current fragment shader and change it to vertex shader
    TranslationUnit vertexShader = sj.getFragmentShader().get();
    vertexShader.setShaderKind(ShaderKind.VERTEX);

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
  private void emitKnownUniformDefines(String knownUniformArrayName, String prefix) {
    final Optional<List<String>> values =
        uniformValues.get().getValues(knownUniformArrayName);
    if (values.isPresent()) {
      int index = 0;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/Simplifier.java`
#### Snippet
```java
    new PrettyPrinterVisitor(ps, PrettyPrinterVisitor.DEFAULT_INDENTATION_WIDTH,
        PrettyPrinterVisitor.DEFAULT_NEWLINE_SUPPLIER, true,
        Optional.empty(), Optional.empty()).visit(shaderJob.getFragmentShader().get());
    ps.flush();
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunities.java`
#### Snippet
```java
          .findFirst()
          .map(vdi -> vdi.getVariablesDeclaration().getDeclInfos()
            .stream().map(item -> item.getName()).findFirst().get());
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunity.java`
#### Snippet
```java
        Optional.ofNullable(declaration.getVariablesDeclaration()
            .getDeclInfo(0).getInitializer()))
        .get();
  }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunity.java`
#### Snippet
```java
  private boolean referencesBackup(Stmt stmt) {
    final VariableDeclInfo backupVdi =
          ((DeclarationStmt) block.getStmt(indexOfBackupDeclaration().get()))
          .getVariablesDeclaration().getDeclInfo(0);
    return new ScopeTrackingVisitor() {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunity.java`
#### Snippet
```java
    List<Stmt> newStmts = new ArrayList<>();
    for (int i = 0; i < block.getNumStmts(); i++) {
      if (i == indexOfBackupDeclaration().get()) {
        continue;
      }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunity.java`
#### Snippet
```java
        continue;
      }
      if (i >= indexOfAssignmentToBackup().get() && i <= indexOfRestorationFromBackup().get()) {
        continue;
      }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunity.java`
#### Snippet
```java
        continue;
      }
      if (i >= indexOfAssignmentToBackup().get() && i <= indexOfRestorationFromBackup().get()) {
        continue;
      }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java
    this.outputVariableName = outputVariableName;
    this.generationParams = generationParams;
    this.shadingLanguageVersion = shaderJob.getFragmentShader().get().getShadingLanguageVersion();
    this.probabilityOfAddingNewWrite = probabilityOfAddingNewWrite;
  }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java

  private void addInitialWrite() {
    if (!shaderJob.getFragmentShader().get().hasMainFunction()) {
      throw new RuntimeException("Fragment shader must have a main function.");
    }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java
  private void addNewWrites() {
    for (IInjectionPoint injectionPoint : new InjectionPoints(
        shaderJob.getFragmentShader().get(), generator, item -> true)
        .getInjectionPoints(item -> item.nextFloat() < probabilityOfAddingNewWrite)) {
      final Scope scope = injectionPoint.scopeAtInjectionPoint();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java
  private boolean adaptExistingWrites() {

    final Typer typer = new Typer(shaderJob.getFragmentShader().get());

    return new ScopeTrackingVisitor() {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/LiteralFuzzer.java`
#### Snippet
```java
      final List<Expr> args = new ArrayList<>();
      for (int i = 0; i < ((BasicType) type).getNumElements(); i++) {
        args.add(fuzz(((BasicType) type).getElementType()).get());
      }
      return Optional.of(new TypeConstructorExpr(type.toString(), args));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/ReplaceBlockStmtsWithSwitchMutationFinder.java`
#### Snippet
```java
        .forEach(candidateVariables::add);
    if (candidateVariables.isEmpty()) {
      return new LiteralFuzzer(generator).fuzz(BasicType.INT).get();
    }
    return new VariableIdentifierExpr(candidateVariables.get(
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/SplitForLoopMutation.java`
#### Snippet
```java

    ForStmt original = (ForStmt) injectionPoint.getNextStmt();
    LoopSplitInfo loopSplitInfo = maybeGetLoopSplitInfo(original).get();

    String newLoopCounter = Constants.SPLIT_LOOP_COUNTER_PREFIX
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("enabledDead: " + isEnabledDead() + "\n");
    sb.append("enabledJump: " + isEnabledJump() + "\n");
    sb.append("enabledLive: " + isEnabledLive() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    sb.append("enabledDead: " + isEnabledDead() + "\n");
    sb.append("enabledJump: " + isEnabledJump() + "\n");
    sb.append("enabledLive: " + isEnabledLive() + "\n");
    sb.append("enabledMutate: " + isEnabledMutate() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledDead: " + isEnabledDead() + "\n");
    sb.append("enabledJump: " + isEnabledJump() + "\n");
    sb.append("enabledLive: " + isEnabledLive() + "\n");
    sb.append("enabledMutate: " + isEnabledMutate() + "\n");
    sb.append("enabledOutline: " + isEnabledOutline() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledJump: " + isEnabledJump() + "\n");
    sb.append("enabledLive: " + isEnabledLive() + "\n");
    sb.append("enabledMutate: " + isEnabledMutate() + "\n");
    sb.append("enabledOutline: " + isEnabledOutline() + "\n");
    sb.append("enabledSplit: " + isEnabledSplit() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledLive: " + isEnabledLive() + "\n");
    sb.append("enabledMutate: " + isEnabledMutate() + "\n");
    sb.append("enabledOutline: " + isEnabledOutline() + "\n");
    sb.append("enabledSplit: " + isEnabledSplit() + "\n");
    sb.append("enabledStruct: " + isEnabledStruct() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledMutate: " + isEnabledMutate() + "\n");
    sb.append("enabledOutline: " + isEnabledOutline() + "\n");
    sb.append("enabledSplit: " + isEnabledSplit() + "\n");
    sb.append("enabledStruct: " + isEnabledStruct() + "\n");
    sb.append("enabledSwitch: " + isEnabledSwitch() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledOutline: " + isEnabledOutline() + "\n");
    sb.append("enabledSplit: " + isEnabledSplit() + "\n");
    sb.append("enabledStruct: " + isEnabledStruct() + "\n");
    sb.append("enabledSwitch: " + isEnabledSwitch() + "\n");
    sb.append("enabledVec: " + isEnabledVec() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledSplit: " + isEnabledSplit() + "\n");
    sb.append("enabledStruct: " + isEnabledStruct() + "\n");
    sb.append("enabledSwitch: " + isEnabledSwitch() + "\n");
    sb.append("enabledVec: " + isEnabledVec() + "\n");
    sb.append("enabledWrap: " + isEnabledWrap() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledStruct: " + isEnabledStruct() + "\n");
    sb.append("enabledSwitch: " + isEnabledSwitch() + "\n");
    sb.append("enabledVec: " + isEnabledVec() + "\n");
    sb.append("enabledWrap: " + isEnabledWrap() + "\n");
    sb.append("enabledDeadFragColorWrites: " + isEnabledDeadFragColorWrites() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledSwitch: " + isEnabledSwitch() + "\n");
    sb.append("enabledVec: " + isEnabledVec() + "\n");
    sb.append("enabledWrap: " + isEnabledWrap() + "\n");
    sb.append("enabledDeadFragColorWrites: " + isEnabledDeadFragColorWrites() + "\n");
    sb.append("enabledLiveFragColorWrites: " + isEnabledLiveFragColorWrites() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledVec: " + isEnabledVec() + "\n");
    sb.append("enabledWrap: " + isEnabledWrap() + "\n");
    sb.append("enabledDeadFragColorWrites: " + isEnabledDeadFragColorWrites() + "\n");
    sb.append("enabledLiveFragColorWrites: " + isEnabledLiveFragColorWrites() + "\n");
    sb.append("enabledDeadBarriers: " + isEnabledDeadBarriers() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledWrap: " + isEnabledWrap() + "\n");
    sb.append("enabledDeadFragColorWrites: " + isEnabledDeadFragColorWrites() + "\n");
    sb.append("enabledLiveFragColorWrites: " + isEnabledLiveFragColorWrites() + "\n");
    sb.append("enabledDeadBarriers: " + isEnabledDeadBarriers() + "\n");
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
    sb.append("enabledDeadFragColorWrites: " + isEnabledDeadFragColorWrites() + "\n");
    sb.append("enabledLiveFragColorWrites: " + isEnabledLiveFragColorWrites() + "\n");
    sb.append("enabledDeadBarriers: " + isEnabledDeadBarriers() + "\n");
    return sb.toString();
  }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
  public final String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("small: " + small + "\n");
    sb.append("allowLongLoops: " + allowLongLoops + "\n");
    sb.append("singlePass: " + singlePass + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder();
    sb.append("small: " + small + "\n");
    sb.append("allowLongLoops: " + allowLongLoops + "\n");
    sb.append("singlePass: " + singlePass + "\n");
    sb.append("aggressivelyComplicateControlFlow: " + aggressivelyComplicateControlFlow + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("small: " + small + "\n");
    sb.append("allowLongLoops: " + allowLongLoops + "\n");
    sb.append("singlePass: " + singlePass + "\n");
    sb.append("aggressivelyComplicateControlFlow: " + aggressivelyComplicateControlFlow + "\n");
    sb.append("donorsFolder: " + donorsFolder.getName() + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("allowLongLoops: " + allowLongLoops + "\n");
    sb.append("singlePass: " + singlePass + "\n");
    sb.append("aggressivelyComplicateControlFlow: " + aggressivelyComplicateControlFlow + "\n");
    sb.append("donorsFolder: " + donorsFolder.getName() + "\n");
    sb.append("isVulkan: " + isVulkan + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("singlePass: " + singlePass + "\n");
    sb.append("aggressivelyComplicateControlFlow: " + aggressivelyComplicateControlFlow + "\n");
    sb.append("donorsFolder: " + donorsFolder.getName() + "\n");
    sb.append("isVulkan: " + isVulkan + "\n");
    sb.append("maxUniforms: " + (limitUniforms() ? "-" : maxUniforms) + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("aggressivelyComplicateControlFlow: " + aggressivelyComplicateControlFlow + "\n");
    sb.append("donorsFolder: " + donorsFolder.getName() + "\n");
    sb.append("isVulkan: " + isVulkan + "\n");
    sb.append("maxUniforms: " + (limitUniforms() ? "-" : maxUniforms) + "\n");
    sb.append("enabledTransformations: " + enabledTransformations + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("donorsFolder: " + donorsFolder.getName() + "\n");
    sb.append("isVulkan: " + isVulkan + "\n");
    sb.append("maxUniforms: " + (limitUniforms() ? "-" : maxUniforms) + "\n");
    sb.append("enabledTransformations: " + enabledTransformations + "\n");
    sb.append("addInjectionSwitch: " + addInjectionSwitch + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("isVulkan: " + isVulkan + "\n");
    sb.append("maxUniforms: " + (limitUniforms() ? "-" : maxUniforms) + "\n");
    sb.append("enabledTransformations: " + enabledTransformations + "\n");
    sb.append("addInjectionSwitch: " + addInjectionSwitch + "\n");
    sb.append("pushConstantProbability: " + pushConstantProbability + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("maxUniforms: " + (limitUniforms() ? "-" : maxUniforms) + "\n");
    sb.append("enabledTransformations: " + enabledTransformations + "\n");
    sb.append("addInjectionSwitch: " + addInjectionSwitch + "\n");
    sb.append("pushConstantProbability: " + pushConstantProbability + "\n");
    sb.append("isWgslCompatible: " + isWgslCompatible + "\n");
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("enabledTransformations: " + enabledTransformations + "\n");
    sb.append("addInjectionSwitch: " + addInjectionSwitch + "\n");
    sb.append("pushConstantProbability: " + pushConstantProbability + "\n");
    sb.append("isWgslCompatible: " + isWgslCompatible + "\n");
    return sb.toString();
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
    sb.append("addInjectionSwitch: " + addInjectionSwitch + "\n");
    sb.append("pushConstantProbability: " + pushConstantProbability + "\n");
    sb.append("isWgslCompatible: " + isWgslCompatible + "\n");
    return sb.toString();
  }
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
          }
          StringBuilder logmsg = new StringBuilder();
          logmsg.append("getJob(): worker '" + worker
              + "' gets job " + res.getJobId());
          if (res.isSetSkipJob()) {
```

## RuleId[id=IOResource]
### IOResource
'Scanner' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
  private String getResourceContent(String resourceName) throws IOException {
    InputStream is = this.getClass().getResourceAsStream("/private/" + resourceName);
    java.util.Scanner scanner = new java.util.Scanner(is, "UTF-8").useDelimiter("\\A");
    return scanner.hasNext() ? scanner.next() : "";
  }
```

### IOResource
'ServerSocket' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
  private static void runServer(int port) throws IOException {
    LOGGER.info("Listening on port: " + port);
    final ServerSocket serverSocket = new ServerSocket(port);
    final Socket socket = serverSocket.accept();
    final InputStream inputStream = socket.getInputStream();
```

## RuleId[id=SocketResource]
### SocketResource
'ServerSocket' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
  private static void runServer(int port) throws IOException {
    LOGGER.info("Listening on port: " + port);
    final ServerSocket serverSocket = new ServerSocket(port);
    final Socket socket = serverSocket.accept();
    final InputStream inputStream = socket.getInputStream();
```

### SocketResource
'Socket' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
    LOGGER.info("Listening on port: " + port);
    final ServerSocket serverSocket = new ServerSocket(port);
    final Socket socket = serverSocket.accept();
    final InputStream inputStream = socket.getInputStream();
    final OutputStream outputStream = socket.getOutputStream();
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
      }
    }
    if (existingLayoutQualifierSequence.isPresent()) {
      qualifiers.remove(existingLayoutQualifierSequence.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `common/src/main/java/com/graphicsfuzz/common/util/StripUnusedFunctions.java`
#### Snippet
```java
  public void visitFunctionCallExpr(FunctionCallExpr functionCallExpr) {
    super.visitFunctionCallExpr(functionCallExpr);
    if (enclosingFunction.isPresent()) {
      addCallGraphEdge(enclosingFunction.get().getPrototype().getName(),
          functionCallExpr.getCallee());
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderToShaderJob.java`
#### Snippet
```java
    }

    if (vertexShader.isPresent()) {
      shaders.add(vertexShader.get());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunities.java`
#### Snippet
```java
    super.visitBlockStmt(block);
    final Optional<String> backupName = containsOutVariableBackup(block);
    if (backupName.isPresent()) {
      addOpportunity(new LiveOutputVariableWriteReductionOpportunity(block,
          backupName.get(),
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
        Optional<Integer> maybeInteger =
            tryGetFloatConstantAsInteger(maybeTypeConstructorExpr.get().getArg(0));
        if (maybeInteger.isPresent()) {
          addReplaceWithExpr(parent, child, new IntConstantExpr(
              String.valueOf(maybeInteger.get())));
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
        Optional<Integer> maybeInteger =
            tryGetFloatConstantAsInteger(maybeTypeConstructorExpr.get().getArg(0));
        if (maybeInteger.isPresent()) {
          addReplaceWithExpr(parent, child, new UIntConstantExpr(maybeInteger.get() + "u"));
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java

    Optional<ParenExpr> maybeParen = asParenExpr(child);
    if (maybeParen.isPresent()) {
      findRemoveParenOpportunities(parent, child, maybeParen.get().getExpr());
    }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java

    Optional<MemberLookupExpr> maybeMemberLookup = asMemberLookupExpr(child);
    if (maybeMemberLookup.isPresent()) {
      findReplaceTypeConstructorWithElementOpportunities(parent, child,
          maybeMemberLookup.get());
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `processingDir` may be 'static'
in `server/src/main/java/com/graphicsfuzz/server/FuzzerServer.java`
#### Snippet
```java
  private final String workingDir;
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";

  private final ExecutorService executorService = Executors.newCachedThreadPool();
```

### FieldMayBeStatic
Field `shaderSetsDir` may be 'static'
in `server/src/main/java/com/graphicsfuzz/server/FuzzerServer.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(FuzzerServer.class);
  private final String workingDir;
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";

```

### FieldMayBeStatic
Field `consecutiveFailureLimit` may be 'static'
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/WorkQueue.java`
#### Snippet
```java
  private Future future = null;
  private final int timeLimit = 60;
  private final int consecutiveFailureLimit = 5;

  public WorkQueue(ExecutorService executor, String name) {
```

### FieldMayBeStatic
Field `timeLimit` may be 'static'
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/WorkQueue.java`
#### Snippet
```java
  private boolean running;
  private Future future = null;
  private final int timeLimit = 60;
  private final int consecutiveFailureLimit = 5;

```

### FieldMayBeStatic
Field `shaderSetsDir` may be 'static'
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/FuzzerServer.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(FuzzerServer.class);
  private final String workingDir = "";
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";

```

### FieldMayBeStatic
Field `processingDir` may be 'static'
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/FuzzerServer.java`
#### Snippet
```java
  private final String workingDir = "";
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";

  private final ExecutorService executorService = Executors.newCachedThreadPool();
```

### FieldMayBeStatic
Field `workingDir` may be 'static'
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/FuzzerServer.java`
#### Snippet
```java

  private static final Logger LOGGER = LoggerFactory.getLogger(FuzzerServer.class);
  private final String workingDir = "";
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ReportShaderSize` has only 'static' members, and lacks a 'private' constructor
in `ast/src/main/java/com/graphicsfuzz/common/tool/ReportShaderSize.java`
#### Snippet
```java
import java.io.IOException;

public class ReportShaderSize {


```

### UtilityClassWithoutPrivateConstructor
Class `MacroNames` has only 'static' members, and lacks a 'private' constructor
in `ast/src/main/java/com/graphicsfuzz/common/util/MacroNames.java`
#### Snippet
```java
import com.graphicsfuzz.util.Constants;

public class MacroNames {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `SupportedTypes` has only 'static' members, and lacks a 'private' constructor
in `ast/src/main/java/com/graphicsfuzz/common/typing/SupportedTypes.java`
#### Snippet
```java
import com.graphicsfuzz.common.glslversion.ShadingLanguageVersion;

public class SupportedTypes {

  public static boolean supported(BasicType type, ShadingLanguageVersion shadingLanguageVersion) {
```

### UtilityClassWithoutPrivateConstructor
Class `PrettyPrint` has only 'static' members, and lacks a 'private' constructor
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrint.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

class PrettyPrint {

  private static Namespace parse(String[] args) throws ArgumentParserException {
```

### UtilityClassWithoutPrivateConstructor
Class `ParseHelper` has only 'static' members, and lacks a 'private' constructor
in `ast/src/main/java/com/graphicsfuzz/common/util/ParseHelper.java`
#### Snippet
```java
import org.apache.commons.io.FilenameUtils;

public class ParseHelper {

  public static final String END_OF_GRAPHICSFUZZ_DEFINES = "// END OF GENERATED HEADER";
```

### UtilityClassWithoutPrivateConstructor
Class `FuzzyImageComparisonTool` has only 'static' members, and lacks a 'private' constructor
in `tool/src/main/java/com/graphicsfuzz/tool/FuzzyImageComparisonTool.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.ArgumentParserException;

public class FuzzyImageComparisonTool {

  public static void main(String[] args) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `ArgsUtil` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/com/graphicsfuzz/util/ArgsUtil.java`
#### Snippet
```java
import org.apache.commons.rng.simple.internal.SeedFactory;

public final class ArgsUtil {
  public static long getSeedArgument(Namespace ns) {
    String seed = ns.getString("seed");
```

### UtilityClassWithoutPrivateConstructor
Class `ToolHelper` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/com/graphicsfuzz/util/ToolHelper.java`
#### Snippet
```java
import java.util.List;

public class ToolHelper {

  public static ExecResult runValidatorOnShader(ExecHelper.RedirectType redirectType, File file)
```

### UtilityClassWithoutPrivateConstructor
Class `ToolPaths` has only 'static' members, and lacks a 'private' constructor
in `util/src/main/java/com/graphicsfuzz/util/ToolPaths.java`
#### Snippet
```java
import java.nio.file.Paths;

public class ToolPaths {

  public static String glslangValidator() {
```

### UtilityClassWithoutPrivateConstructor
Class `AddInitializers` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/AddInitializers.java`
#### Snippet
```java
import com.graphicsfuzz.common.typing.ScopeTrackingVisitor;

public class AddInitializers {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `JsonHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/JsonHelper.java`
#### Snippet
```java
import com.google.gson.JsonObject;

public class JsonHelper {

  public static String jsonToString(JsonObject infoJson) {
```

### UtilityClassWithoutPrivateConstructor
Class `ImageColorComponents` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/ImageColorComponents.java`
#### Snippet
```java
import java.util.List;

public class ImageColorComponents {

  public static final int R_OFFSET = 16;
```

### UtilityClassWithoutPrivateConstructor
Class `SideEffectChecker` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/SideEffectChecker.java`
#### Snippet
```java
import com.graphicsfuzz.common.typing.TyperHelper;

public class SideEffectChecker {

  private static boolean isSideEffectFreeVisitor(IAstNode node,
```

### UtilityClassWithoutPrivateConstructor
Class `ImageUtil` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/ImageUtil.java`
#### Snippet
```java
import org.bytedeco.javacpp.opencv_imgproc;

public class ImageUtil {

  public static opencv_core.Mat getImage(File file) throws FileNotFoundException {
```

### UtilityClassWithoutPrivateConstructor
Class `GloballyTruncateLoops` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/GloballyTruncateLoops.java`
#### Snippet
```java
import java.util.Collections;

public class GloballyTruncateLoops {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `FragmentShaderJobToVertexShaderJob` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

public final class FragmentShaderJobToVertexShaderJob {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `FileHelper` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/FileHelper.java`
#### Snippet
```java
import org.apache.commons.io.FilenameUtils;

public class FileHelper {

  public static String removeEnd(String file, String endsWith) {
```

### UtilityClassWithoutPrivateConstructor
Class `CheckColorComponents` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/imagetools/CheckColorComponents.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

public class CheckColorComponents {

  public static void main(String[] args) throws ArgumentParserException, IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `ComparePsnr` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/imagetools/ComparePsnr.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

public class ComparePsnr {

  public static void main(String[] args) throws ArgumentParserException, FileNotFoundException {
```

### UtilityClassWithoutPrivateConstructor
Class `CompareHistograms` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/imagetools/CompareHistograms.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

public class CompareHistograms {

  public static void main(String[] args) throws ArgumentParserException, FileNotFoundException {
```

### UtilityClassWithoutPrivateConstructor
Class `RunShaderFamily` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/shadersets/RunShaderFamily.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class RunShaderFamily {

  private static final Logger LOGGER = LoggerFactory.getLogger(RunShaderFamily.class);
```

### UtilityClassWithoutPrivateConstructor
Class `FuzzyImageComparison` has only 'static' members, and lacks a 'private' constructor
in `common/src/main/java/com/graphicsfuzz/common/util/FuzzyImageComparison.java`
#### Snippet
```java
@SuppressWarnings({"Duplicates", "BooleanMethodIsAlwaysInverted", "WeakerAccess",
    "SameParameterValue"})
public class FuzzyImageComparison {

  private static final int GOOD_PIXEL_VALUE = 0;
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `server/src/main/java/com/graphicsfuzz/server/Main.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

public class Main {
  public static void main(String[] args) throws Exception {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("Fuzzer server")
```

### UtilityClassWithoutPrivateConstructor
Class `ReductionFilesHelper` has only 'static' members, and lacks a 'private' constructor
in `server/src/main/java/com/graphicsfuzz/server/webui/ReductionFilesHelper.java`
#### Snippet
```java
import java.util.Optional;

public class ReductionFilesHelper {

  static File getReductionDir(String worker, String shaderSet, String variant) {
```

### UtilityClassWithoutPrivateConstructor
Class `Simplifier` has only 'static' members, and lacks a 'private' constructor
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/Simplifier.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class Simplifier {

  private static final Logger LOGGER = LoggerFactory.getLogger(Simplifier.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Simplify` has only 'static' members, and lacks a 'private' constructor
in `reducer/src/main/java/com/graphicsfuzz/reducer/util/Simplify.java`
#### Snippet
```java
import com.graphicsfuzz.reducer.glslreducers.EliminateGraphicsFuzzDefines;

public class Simplify {

  public static TranslationUnit simplify(TranslationUnit tu) {
```

### UtilityClassWithoutPrivateConstructor
Class `GlslReduce` has only 'static' members, and lacks a 'private' constructor
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/GlslReduce.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class GlslReduce {

  private static final Logger LOGGER = LoggerFactory.getLogger(GlslReduce.class);
```

### UtilityClassWithoutPrivateConstructor
Class `GlobalPrecisionDeclarationReductionOpportunities` has only 'static' members, and lacks a 'private' constructor
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/GlobalPrecisionDeclarationReductionOpportunities.java`
#### Snippet
```java
import java.util.Set;

public class GlobalPrecisionDeclarationReductionOpportunities {

  private static List<GlobalPrecisionDeclarationReductionOpportunity> findOpportunitiesForShader(
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/Util.java`
#### Snippet
```java
import com.graphicsfuzz.util.Constants;

class Util {

  static boolean isStructifiedDeclaration(DeclarationStmt declarationStmt) {
```

### UtilityClassWithoutPrivateConstructor
Class `PrepareReference` has only 'static' members, and lacks a 'private' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/tool/PrepareReference.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

public final class PrepareReference {

  private static Namespace parse(String[] args) throws ArgumentParserException {
```

### UtilityClassWithoutPrivateConstructor
Class `GlslGenerate` has only 'static' members, and lacks a 'private' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GlslGenerate.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class GlslGenerate {

  private static final Logger LOGGER = LoggerFactory.getLogger(GlslGenerate.class);
```

### UtilityClassWithoutPrivateConstructor
Class `CustomMutatorServer` has only 'static' members, and lacks a 'private' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
 * Server that can accept shaders from a libFuzzer custom mutator and send back a mutated shader.
 */
public class CustomMutatorServer {

  private static final Logger LOGGER = LoggerFactory.getLogger(CustomMutatorServer.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Mutate` has only 'static' members, and lacks a 'private' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Mutate.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class Mutate {

  private static final Logger LOGGER = LoggerFactory.getLogger(Mutate.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Fragment2Compute` has only 'static' members, and lacks a 'private' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Fragment2Compute.java`
#### Snippet
```java
 * mechanism to get a source of compute shaders.
 */
public class Fragment2Compute {

  private static final Logger LOGGER = LoggerFactory.getLogger(Fragment2Compute.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Generate` has only 'static' members, and lacks a 'private' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Generate.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class Generate {

  private static final Logger LOGGER = LoggerFactory.getLogger(Generate.class);
```

### UtilityClassWithoutPrivateConstructor
Class `GenerateShaderFamily` has only 'static' members, and lacks a 'private' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GenerateShaderFamily.java`
#### Snippet
```java
import org.slf4j.LoggerFactory;

public class GenerateShaderFamily {

  private static final Logger LOGGER = LoggerFactory.getLogger(GenerateShaderFamily.class);
```

### UtilityClassWithoutPrivateConstructor
Class `CheckUtilityClass` has only 'static' members, and lacks a 'private' constructor
in `test-util/src/main/java/com/graphicsfuzz/common/util/CheckUtilityClass.java`
#### Snippet
```java
import java.lang.reflect.Modifier;

public class CheckUtilityClass {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `CompareAsts` has only 'static' members, and lacks a 'private' constructor
in `compare-asts/src/main/java/com/graphicsfuzz/common/util/CompareAsts.java`
#### Snippet
```java
import java.io.IOException;

public class CompareAsts {

  public static void assertEqualAsts(String first, String second)
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/Main.java`
#### Snippet
```java
import net.sourceforge.argparse4j.inf.Namespace;

public class Main {
  public static void main(String[] args) throws Exception {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("Fuzzer server")
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `remove` may produce `NullPointerException`
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
    }
    if (hasParent()) {
      return parent.remove(name);
    }
    return null;
```

### DataFlowIssue
Method invocation `shallowClone` may produce `NullPointerException`
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
   */
  public Scope shallowClone() {
    Scope result = hasParent() ? new Scope(parent.shallowClone()) : new Scope();
    for (Entry<String, ScopeEntry> entry : variableMapping.entrySet()) {
      result.variableMapping.put(entry.getKey(), entry.getValue());
```

### DataFlowIssue
Switch label `"in"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
  public TypeQualifier visitInterface_qualifier(Interface_qualifierContext ctx) {
    switch (ctx.getText()) {
      case "in":
        return TypeQualifier.SHADER_INPUT;
      case "out":
```

### DataFlowIssue
Switch label `"out"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "in":
        return TypeQualifier.SHADER_INPUT;
      case "out":
        return TypeQualifier.SHADER_OUTPUT;
      case "uniform":
```

### DataFlowIssue
Switch label `"uniform"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "out":
        return TypeQualifier.SHADER_OUTPUT;
      case "uniform":
        return TypeQualifier.UNIFORM;
      case "buffer":
```

### DataFlowIssue
Switch label `"buffer"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "uniform":
        return TypeQualifier.UNIFORM;
      case "buffer":
        return TypeQualifier.BUFFER;
      case "coherent":
```

### DataFlowIssue
Switch label `"coherent"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "buffer":
        return TypeQualifier.BUFFER;
      case "coherent":
        return TypeQualifier.COHERENT;
      case "volatile":
```

### DataFlowIssue
Switch label `"volatile"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "coherent":
        return TypeQualifier.COHERENT;
      case "volatile":
        return TypeQualifier.VOLATILE;
      case "restrict":
```

### DataFlowIssue
Switch label `"restrict"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "volatile":
        return TypeQualifier.VOLATILE;
      case "restrict":
        return TypeQualifier.RESTRICT;
      case "readonly":
```

### DataFlowIssue
Switch label `"readonly"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "restrict":
        return TypeQualifier.RESTRICT;
      case "readonly":
        return TypeQualifier.READONLY;
      case "writeonly":
```

### DataFlowIssue
Switch label `"writeonly"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
      case "readonly":
        return TypeQualifier.READONLY;
      case "writeonly":
        return TypeQualifier.WRITEONLY;
      default:
```

### DataFlowIssue
Switch label `"binding"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
          Integer.parseInt(layoutQualifierId.integer_constant().getText());
      switch (layoutQualifierId.IDENTIFIER().getText()) {
        case "binding":
          return new BindingLayoutQualifier(associatedValue);
        case "local_size_x":
```

### DataFlowIssue
Switch label `"local_size_x"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
        case "binding":
          return new BindingLayoutQualifier(associatedValue);
        case "local_size_x":
          return new LocalSizeLayoutQualifier("x", associatedValue);
        case "local_size_y":
```

### DataFlowIssue
Switch label `"local_size_y"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
        case "local_size_x":
          return new LocalSizeLayoutQualifier("x", associatedValue);
        case "local_size_y":
          return new LocalSizeLayoutQualifier("y", associatedValue);
        case "local_size_z":
```

### DataFlowIssue
Switch label `"local_size_z"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
        case "local_size_y":
          return new LocalSizeLayoutQualifier("y", associatedValue);
        case "local_size_z":
          return new LocalSizeLayoutQualifier("z", associatedValue);
        case "location":
```

### DataFlowIssue
Switch label `"location"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
        case "local_size_z":
          return new LocalSizeLayoutQualifier("z", associatedValue);
        case "location":
          return new LocationLayoutQualifier(associatedValue);
        case "set":
```

### DataFlowIssue
Switch label `"set"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
        case "location":
          return new LocationLayoutQualifier(associatedValue);
        case "set":
          return new SetLayoutQualifier(associatedValue);
        default:
```

### DataFlowIssue
Switch label `"std430"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
    if (layoutQualifierId.IDENTIFIER() != null) {
      switch (layoutQualifierId.IDENTIFIER().getText()) {
        case "std430":
          return new Std430LayoutQualifier();
        case "std140":
```

### DataFlowIssue
Switch label `"std140"` is unreachable
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
        case "std430":
          return new Std430LayoutQualifier();
        case "std140":
          return new Std140LayoutQualifier();
        default:
```

### DataFlowIssue
Argument `Thread.currentThread().getContextClassLoader().getResourceAsStream("nondet.png")` might be null
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      try {
        BufferedImage nondetImg = ImageIO.read(
            Thread.currentThread().getContextClassLoader().getResourceAsStream("nondet.png"));
        BufferedImage img1 = ImageIO.read(
            new ByteArrayInputStream(shaderResult.getPNG()));
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VariableDeclReductionOpportunities.java`
#### Snippet
```java
  private void addReferencedScopeEntry(ScopeEntry scopeEntry) {
    assert scopeEntry != null;
    referencedScopeEntries.peek().add(scopeEntry);
  }

```

### DataFlowIssue
Method invocation `contains` may produce `NullPointerException`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VariableDeclReductionOpportunities.java`
#### Snippet
```java
    for (String name : getCurrentScope().keys()) {
      ScopeEntry entry = getCurrentScope().lookupScopeEntry(name);
      if (entry.hasVariableDeclInfo() && !referencedScopeEntries.peek().contains(entry)) {
        if (allowedToReduceLocalDecl(entry.getVariableDeclInfo())) {
          addOpportunity(
```

### DataFlowIssue
Dereference of `getAllWorkers(request, response)` may produce `NullPointerException`
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java

    int dataNum = 0;
    for (File workerFile: getAllWorkers(request, response)) {
      htmlAppendLn("<div class='ui field'>",
          "<div class='ui checkbox'>",
```

### DataFlowIssue
Dereference of `workerDirs` may produce `NullPointerException`
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    File[] workerDirs = new File(WebUiConstants.WORKER_DIR).listFiles();
    List<String> workerList = new ArrayList<String>();
    for (File workerDir : workerDirs) {
      File expResult = new File(workerDir, shaderFamily);
      if (expResult.isDirectory()) {
```

### DataFlowIssue
Dereference of `shaderFamilyFiles` may produce `NullPointerException`
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    }
    File[] shaderFamilyFiles = shaderFamiliesDir.listFiles();
    for (File shaderFamily : shaderFamilyFiles) {
      if (shaderFamily.isDirectory()) {
        shaderFamilies.add(shaderFamily);
```

### DataFlowIssue
Argument `shaderFamilies` might be null
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    //Iterate through files in workerDir - get experiment results
    File[] shaderFamilies = workerDir.listFiles(File::isDirectory);
    Arrays.sort(shaderFamilies,
        (f1, f2) -> new AlphanumComparator().compare(f1.getName(), f2.getName()));
    String[] workers = new String[1];
```

### DataFlowIssue
Argument `shaderFamilies` might be null
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java

    File[] shaderFamilies = workerDir.listFiles(File::isDirectory);
    Arrays.sort(shaderFamilies,
        (f1, f2) -> new AlphanumComparator().compare(f1.getName(), f2.getName()));
    for (File shaderFamilyFile : shaderFamilies) {
```

### DataFlowIssue
Dereference of `workerFiles` may produce `NullPointerException`
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    List<File> workerFiles = getAllWorkers(request, response);
    if (workers != null) {
      for (File worker : workerFiles) {
        if (!workers.contains(worker.getName())) {
          htmlAppendLn("<a class='item' href='/webui/worker/", worker.getName(), "'>",
```

### DataFlowIssue
Argument `is` might be null
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
  private String getResourceContent(String resourceName) throws IOException {
    InputStream is = this.getClass().getResourceAsStream("/private/" + resourceName);
    java.util.Scanner scanner = new java.util.Scanner(is, "UTF-8").useDelimiter("\\A");
    return scanner.hasNext() ? scanner.next() : "";
  }
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java

      // Set variant counters
      for (File file : dir.listFiles()) {
        if (file.getName().startsWith("variant") && file.getName().endsWith(".info.json")) {
          nbVariantDone++;
```

### DataFlowIssue
Switch label `0` is unreachable
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    // Watch out, diff exits with 1 if there is a difference.
    switch (commandResult.getExitCode()) {
      case 0:
        // files are the same! That's suspicious
        htmlAppendLn("<p>The reduced variant is the same as the reduced reference! ",
```

### DataFlowIssue
Switch label `1` is unreachable
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
            "(diff returns 0)</p>");
        break;
      case 1:
        // files differ
        htmlAppendLn("<p>Differences in reduced shader:</p>",
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
    dotProductExpr = new FunctionCallExpr("dot",
        new TypeConstructorExpr(
            BasicType.makeVectorType(type, vectorWidth).toString(), firstVectorArgs),
        new TypeConstructorExpr(
            BasicType.makeVectorType(type, vectorWidth).toString(), secondVectorArgs));
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
            BasicType.makeVectorType(type, vectorWidth).toString(), firstVectorArgs),
        new TypeConstructorExpr(
            BasicType.makeVectorType(type, vectorWidth).toString(), secondVectorArgs));
    return Optional.of(
        identityConstructor(
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
              new TypeConstructorExpr(
                  BasicType.makeVectorType(BasicType.BOOL, type.getNumElements())
                      .toString(), aElements)));
    }

```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
        new FunctionCallExpr("determinant",
            new TypeConstructorExpr(
                BasicType.makeMatrixType(matrixDimension, matrixDimension).toString(),
                matrixConstructorArgs)));
  }
```

### DataFlowIssue
Condition `declInfo.getInitializer() instanceof Initializer` is redundant and can be replaced with a null check
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/SplitForLoopMutation.java`
#### Snippet
```java

    // Now we grab the initial value, which needs to be an integer.
    if (!(declInfo.getInitializer() instanceof Initializer)) {
      return Optional.empty();
    }
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
      service.getSessionMap().lockSessionAndExecute(
          worker, session -> {
            session.workQueue.add(new CommandRunnable(
                name,
                command,
```

### DataFlowIssue
Method invocation `getQueueAsCommandInfoList` may produce `NullPointerException`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
                new WorkerInfo()
                      .setWorkerName(worker)
                      .setCommandQueue(session.workQueue.getQueueAsCommandInfoList())
                      .setJobQueue(getJobQueueAsJobInfoList(session.jobQueue))
                      .setLive(session.isLive())
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
      oldWorker = oldWorker.trim();
    }
    if (oldWorker.isEmpty()) {
      oldWorker = null;
    }
```

### DataFlowIssue
Method invocation `finishJob` may produce `NullPointerException`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java

        // Execute finish job on the server job and see if it should be removed.
        boolean remove = serverJob.finishJob(job);

        LOGGER.info("Returned from finishJob. Removing job? {}", remove);
```

### DataFlowIssue
Argument `donorsDirectory.listFiles( pathname -> pathname.getName().endsWith("." + generat...` might be null
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateCodeTransformation.java`
#### Snippet
```java
    assert donorsDirectory.exists();
    this.donorFiles = new ArrayList<>();
    this.donorFiles.addAll(Arrays.asList(donorsDirectory.listFiles(
        pathname -> pathname.getName().endsWith("."
            + generationParams.getShaderKind().getFileExtension()))));
    this.donorFiles.sort(Comparator.naturalOrder());
    this.usedDonorFiles = new ArrayList<>();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
Can be replaced with 'java.util.HashSet' constructor
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
  public int hashCode() {
    // TODO revisit if we end up storing large sets of types
    Set<TypeQualifier> qualifiersSet = qualifiers.stream().collect(Collectors.toSet());
    return qualifiersSet.hashCode() + targetType.hashCode();
  }
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.HashSet' constructor
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
    }
    QualifiedType thatQualifiedType = (QualifiedType) that;
    Set<TypeQualifier> thisQualifiers = this.qualifiers.stream().collect(Collectors.toSet());
    Set<TypeQualifier> thatQualifiers = thatQualifiedType.qualifiers.stream()
        .collect(Collectors.toSet());
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.HashSet' constructor
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
    QualifiedType thatQualifiedType = (QualifiedType) that;
    Set<TypeQualifier> thisQualifiers = this.qualifiers.stream().collect(Collectors.toSet());
    Set<TypeQualifier> thatQualifiers = thatQualifiedType.qualifiers.stream()
        .collect(Collectors.toSet());
    return thisQualifiers.equals(thatQualifiers) && this.targetType
        .equals(thatQualifiedType.targetType);
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/MergeSet.java`
#### Snippet
```java
        + String.join("_", components.stream().map(component ->
            component.getOffset() + "_" + component.getWidth() + "_" + component.getName().length())
            .collect(Collectors.toList()))
        + String.join("", components.stream().map(component -> component.getName())
            .collect(Collectors.toList()));
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/MergeSet.java`
#### Snippet
```java
            .collect(Collectors.toList()))
        + String.join("", components.stream().map(component -> component.getName())
            .collect(Collectors.toList()));
  }

```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `reducer/src/main/java/com/graphicsfuzz/reducer/glslreducers/RandomizedReductionPass.java`
#### Snippet
```java
          getPossibleInitialOpportunities(initialReductionOpportunities);

    assert !history.stream().anyMatch(item -> initialOptionIndices.contains(item));

    if (initialOptionIndices.isEmpty()) {
```

### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/EnabledTransformations.java`
#### Snippet
```java
  public static List<Class<? extends ITransformation>> namesToList(String commaSeparatedNames) {
    return Arrays.asList(commaSeparatedNames.split(","))
        .stream()
        .map(EnabledTransformations::nameToClass)
        .collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
      for (int i = 0; i < template.getNumArguments(); i++) {
        List<? extends Type> possibleArgTypes = template.getArgumentTypes().get(i);
        Type argType = possibleArgTypes.stream().collect(Collectors.toList())
              .get(generator.nextInt(possibleArgTypes.size()));
        args.add(makeExpr(argType, template.requiresLValueForArgument(i), constContext,
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Templates.java`
#### Snippet
```java
      Map<String, List<FunctionPrototype>> builtins = TyperHelper.getBuiltins(
          shadingLanguageVersion, isWgslCompatible, shaderKind);
      List<String> keys = builtins.keySet().stream().collect(Collectors.toList());
      keys.sort(String::compareTo);
      for (String key : keys) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/StructificationMutation.java`
#### Snippet
```java
      Map<String, StructDefinitionType> structFields = getStructFields(currentStruct);
      if (!structFields.keySet().isEmpty() && generator.nextBoolean()) {
        String fieldName = structFields.keySet().stream().collect(Collectors.toList())
              .get(generator.nextInt(structFields.size()));
        result = new MemberLookupExpr(result, fieldName);
```

### SimplifyStreamApiCallChains
Can be replaced with 'java.util.ArrayList' constructor
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddOutputWriteMutation.java`
#### Snippet
```java
    assert !availableOutVars.isEmpty();

    final List<String> keys = availableOutVars.keySet().stream().collect(Collectors.toList());
    keys.sort(String::compareTo);
    final int index = random.nextInt(keys.size());
```

### SimplifyStreamApiCallChains
Can be replaced with 'Collectors.joining'
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/VectorizeMutation.java`
#### Snippet
```java
  private String getSwizzle(String name) {
    return String.join("", mergeSet.getIndices(name).stream().map(index ->
        (new String[]{"x", "y", "z", "w"})[index]).collect(Collectors.toList()));
  }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/PruneUniforms.java`
#### Snippet
```java
          .collect(Collectors.toList());
    } else if (baseType.getElementType() == BasicType.FLOAT) {
      argExprs = args.stream().map(item -> new FloatConstantExpr(item.toString()))
          .collect(Collectors.toList());
    } else if (baseType.getElementType() == BasicType.UINT) {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/PruneUniforms.java`
#### Snippet
```java
          .collect(Collectors.toList());
    } else if (baseType.getElementType() == BasicType.UINT) {
      argExprs = args.stream().map(item -> new UIntConstantExpr(item.toString() + "u"))
          .collect(Collectors.toList());
    } else {
```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/PruneUniforms.java`
#### Snippet
```java
          .collect(Collectors.toList());
    } else {
      argExprs = args.stream().map(item -> new IntConstantExpr(item.toString()))
          .collect(Collectors.toList());
    }
```

### StringOperationCanBeSimplified
`new String()` is redundant
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
    }

    final String worker = new String(queueName);

    if (!service.getSessionMap().containsWorker(worker)) {
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getUnderlyingShaderFile' is still used
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
   *
   */
  public File getUnderlyingShaderFile(
      File shaderJobFile,
      ShaderKind shaderKind) {
```

### DeprecatedIsStillUsed
Deprecated member 'writeAdditionalInfo' is still used
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
   * @deprecated Should probably be avoided, but useful for now.
   */
  public void writeAdditionalInfo(
      File shaderJobFile,
      String outputFileExtension,
```

## RuleId[id=OptionalContainsCollection]
### OptionalContainsCollection
'Optional' contains collection `List`
in `ast/src/main/java/com/graphicsfuzz/common/tool/UniformValueSupplier.java`
#### Snippet
```java

public interface UniformValueSupplier {
  Optional<List<String>> getValues(String name);
}

```

### OptionalContainsCollection
'Optional' contains collection `List`
in `common/src/main/java/com/graphicsfuzz/common/util/PipelineUniformValueSupplier.java`
#### Snippet
```java

  @Override
  public Optional<List<String>> getValues(String name) {
    if (pipelineInfo.hasUniform(name)) {
      return Optional.of(this.pipelineInfo.getArgs(name));
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java

  private void emitKnownUniformDefines(String knownUniformArrayName, String prefix) {
    final Optional<List<String>> values =
        uniformValues.get().getValues(knownUniformArrayName);
    if (values.isPresent()) {
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
      // Emit a comment per known uniform.
      for (VariableDeclInfo knownUniform : knownUniforms) {
        final Optional<List<String>> values = uniformValues.get().getValues(knownUniform.getName());
        values.ifPresent(item -> {
          out.append("// Contents of ")
```

### OptionalContainsCollection
'Optional' contains collection `List`
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
      final String memberName = interfaceBlock.getMemberNames().get(0);
      if (uniformValues.isPresent()) {
        final Optional<List<String>> values = uniformValues.get().getValues(memberName);
        values.ifPresent(item -> {
          out.append("// Contents of ")
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/VariablesDeclaration.java`
#### Snippet
```java
  public VariablesDeclaration clone() {
    return new VariablesDeclaration(baseType.clone(),
        declInfos.stream().map(x -> x.clone()).collect(Collectors.toList()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/AstUtil.java`
#### Snippet
```java
    // Grab all prototypes associated with function definitions
    List<FunctionPrototype> result =
        getFunctionDefinitions(decls).map(x -> x.getPrototype()).collect(Collectors.toList());
    // Add any additional prototypes
    // TODO: we only check whether a function definition with a matching name is present;
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/AstUtil.java`
#### Snippet
```java

  private static List<String> getFunctionNames(List<FunctionPrototype> prototypes) {
    return prototypes.stream().map(y -> y.getName()).collect(Collectors.toList());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/FunctionPrototype.java`
#### Snippet
```java
  public FunctionPrototype clone() {
    return new FunctionPrototype(name, returnType.clone(),
        parameters.stream().map(x -> x.clone()).collect(Collectors.toList()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/TypeConstructorExpr.java`
#### Snippet
```java
  public TypeConstructorExpr clone() {
    return new TypeConstructorExpr(type,
        args.stream().map(x -> x.clone()).collect(Collectors.toList()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/FunctionCallExpr.java`
#### Snippet
```java
  public FunctionCallExpr clone() {
    return new FunctionCallExpr(callee,
        args.stream().map(x -> x.clone()).collect(Collectors.toList()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/stmt/BlockStmt.java`
#### Snippet
```java
  @Override
  public BlockStmt clone() {
    return new BlockStmt(stmts.stream().map(x -> x.clone()).collect(Collectors.toList()),
        introducesNewScope);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
  public TranslationUnit clone() {
    return new TranslationUnit(shaderKind, shadingLanguageVersion,
        topLevelDeclarations.stream().map(x -> x.clone()).collect(Collectors.toList()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/util/StructUtils.java`
#### Snippet
```java
    return StructUtils.getStructDefinitions(variablesDeclaration)
        .stream()
        .filter(item -> item.hasStructNameType())
        .map(item -> item.getStructNameType())
        .anyMatch(item -> countStructReferences(tu, item) > 1);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/util/StructUtils.java`
#### Snippet
```java
        .stream()
        .filter(item -> item.hasStructNameType())
        .map(item -> item.getStructNameType())
        .anyMatch(item -> countStructReferences(tu, item) > 1);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/StructDefinitionType.java`
#### Snippet
```java
    return new StructDefinitionType(structNameType.map(StructNameType::clone),
        fieldNames,
        fieldTypes.stream().map(item -> item.clone()).collect(Collectors.toList()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `ast/src/main/java/com/graphicsfuzz/common/glslversion/ShadingLanguageVersion.java`
#### Snippet
```java

  static boolean isWebGlCompatible(String versionString) {
    return allWebGlSlVersions().stream().map(item -> item.getVersionString())
        .anyMatch(item -> item.equals(versionString));
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/MergeSet.java`
#### Snippet
```java

  private static List<String> getComponentNames(String name) {
    return getComponentData(name).stream().map(item -> item.getName()).collect(Collectors.toList());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/MergeSet.java`
#### Snippet
```java
  private int currentWidth() {
    return entries.stream()
        .map(this::getWidth).reduce(0, (first, second) -> first + second);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/MergeSet.java`
#### Snippet
```java
    componentData = componentData.substring(1);
    List<Integer> componentIntegerData = Arrays.stream(componentData.split("_"))
        .map(item -> Integer.parseInt(item))
        .collect(Collectors.toList());
    String nameData = matcher.group("names");
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/MergeSet.java`
#### Snippet
```java
            component.getOffset() + "_" + component.getWidth() + "_" + component.getName().length())
            .collect(Collectors.toList()))
        + String.join("", components.stream().map(component -> component.getName())
            .collect(Collectors.toList()));
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/glslreducers/RandomizedReductionPass.java`
#### Snippet
```java
          getPossibleInitialOpportunities(initialReductionOpportunities);

    assert !history.stream().anyMatch(item -> initialOptionIndices.contains(item));

    if (initialOptionIndices.isEmpty()) {
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LoopMergeReductionOpportunities.java`
#### Snippet
```java
    return shaderJob.getShaders()
        .stream()
        .map(item -> findOpportunitiesForShader(item))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `common/src/main/java/com/graphicsfuzz/common/util/PipelineInfo.java`
#### Snippet
```java
    return dictionary.entrySet()
        .stream()
        .map(item -> item.getKey())
        .filter(PipelineInfo::isLegalUniformName)
        .sorted()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/UnwrapReductionOpportunity.java`
#### Snippet
```java
        .reduce(Collections.emptyList(), ListConcat::concatenate)
        .stream()
        .map(item -> item.getName())
        .collect(Collectors.toSet());
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunities.java`
#### Snippet
```java
          .findFirst()
          .map(vdi -> vdi.getVariablesDeclaration().getDeclInfos()
            .stream().map(item -> item.getName()).findFirst().get());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveStructFieldReductionOpportunities.java`
#### Snippet
```java
    return shaderJob.getShaders()
        .stream()
        .map(item -> findOpportunitiesForShader(item))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunity.java`
#### Snippet
```java
          .filter(item -> item instanceof DeclarationStmt)
          .map(item -> (DeclarationStmt) item)
          .map(item -> item.getVariablesDeclaration())
          .map(item -> item.getDeclInfos())
          .reduce(Arrays.asList(), ListConcat::concatenate)
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunity.java`
#### Snippet
```java
          .map(item -> (DeclarationStmt) item)
          .map(item -> item.getVariablesDeclaration())
          .map(item -> item.getDeclInfos())
          .reduce(Arrays.asList(), ListConcat::concatenate)
          .stream()
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InlineStructifiedFieldReductionOpportunities.java`
#### Snippet
```java
    return shaderJob.getShaders()
        .stream()
        .map(item -> findOpportunitiesForShader(item))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
          .filter(item -> item instanceof DeclarationStmt)
          .map(item -> (DeclarationStmt) item)
          .map(item -> item.getVariablesDeclaration())
          .map(item -> item.getDeclInfos())
          .reduce(Arrays.asList(), ListConcat::concatenate);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
          .map(item -> (DeclarationStmt) item)
          .map(item -> item.getVariablesDeclaration())
          .map(item -> item.getDeclInfos())
          .reduce(Arrays.asList(), ListConcat::concatenate);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
          .filter(item -> item instanceof DeclarationStmt)
          .map(item -> (DeclarationStmt) item)
          .map(item -> item.getVariablesDeclaration())
          .collect(Collectors.toList())) {
      final Type actualType = variablesDeclaration.getBaseType().getWithoutQualifiers();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Compound2BodyMutationFinder.java`
#### Snippet
```java
    super.visitDoStmt(doStmt);
    addMutation(
          new Stmt2StmtMutation(parentMap.getParent(doStmt), doStmt, () -> doStmt.getBody()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Compound2BodyMutationFinder.java`
#### Snippet
```java
    super.visitIfStmt(ifStmt);
    addMutation(new Stmt2StmtMutation(parentMap.getParent(ifStmt), ifStmt,
        () -> ifStmt.getThenStmt()));
    if (ifStmt.hasElseStmt()) {
      addMutation(new Stmt2StmtMutation(parentMap.getParent(ifStmt), ifStmt,
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Compound2BodyMutationFinder.java`
#### Snippet
```java
    if (ifStmt.hasElseStmt()) {
      addMutation(new Stmt2StmtMutation(parentMap.getParent(ifStmt), ifStmt,
          () -> ifStmt.getElseStmt()));
    }
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Compound2BodyMutationFinder.java`
#### Snippet
```java
    addMutation(
          new Stmt2StmtMutation(parentMap.getParent(whileStmt), whileStmt,
              () -> whileStmt.getBody()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
    candidates.addAll(fuzzingContext.getStructDeclarations()
        .stream()
        .map(item -> item.getStructNameType())
        .collect(Collectors.toList()));
    return candidates.get(generator.nextInt(candidates.size()));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
            .filter(item -> item.getResultType().equals(targetType)).collect(Collectors.toList());
      if (isLValue) {
        applicableTemplates = applicableTemplates.stream().filter(item -> item.isLValue())
              .collect(Collectors.toList());
      }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
      }
      if (constContext) {
        applicableTemplates = applicableTemplates.stream().filter(item -> item.isConst())
              .collect(Collectors.toList());
      }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/If2DiscardMutationFinder.java`
#### Snippet
```java
  public void visitIfStmt(IfStmt ifStmt) {
    super.visitIfStmt(ifStmt);
    addMutation(new Stmt2StmtMutation(ifStmt, ifStmt.getThenStmt(), () -> new DiscardStmt()));
    if (ifStmt.hasElseStmt()) {
      addMutation(new Stmt2StmtMutation(ifStmt, ifStmt.getElseStmt(), () -> new DiscardStmt()));
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/If2DiscardMutationFinder.java`
#### Snippet
```java
    addMutation(new Stmt2StmtMutation(ifStmt, ifStmt.getThenStmt(), () -> new DiscardStmt()));
    if (ifStmt.hasElseStmt()) {
      addMutation(new Stmt2StmtMutation(ifStmt, ifStmt.getElseStmt(), () -> new DiscardStmt()));
    } else {
      addMutation(new Stmt2StmtMutation(parentMap.getParent(ifStmt), ifStmt,
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/templates/ConstantExprTemplate.java`
#### Snippet
```java
  private UIntConstantExpr randomUintLiteral(IRandom generator) {
    final int maxValue = 200000;
    return new UIntConstantExpr(String.valueOf(generator.nextInt(maxValue)) + "u");
  }

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/templates/ConstantExprTemplate.java`
#### Snippet
```java
        break;
      }
      sb.append(String.valueOf(candidate));
    }
    sb.append(".");
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/templates/ConstantExprTemplate.java`
#### Snippet
```java
    sb.append(".");
    for (int i = 0; i < digitsBefore; i++) {
      sb.append(String.valueOf(generator.nextInt(10)));
    }
    return new FloatConstantExpr(sb.toString());
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/LiteralFuzzer.java`
#### Snippet
```java
        break;
      }
      sb.append(String.valueOf(candidate));
    }
    sb.append(".");
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/LiteralFuzzer.java`
#### Snippet
```java
    sb.append(".");
    for (int i = 0; i < digitsBefore; i++) {
      sb.append(String.valueOf(generator.nextInt(10)));
    }
    return sb.toString();
```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/LiteralFuzzer.java`
#### Snippet
```java
    if (type == BasicType.UINT) {
      return Optional.of(new UIntConstantExpr(
          String.valueOf(Math.abs(generator.nextInt(INT_MAX - INT_MIN) + INT_MIN) + "u")));
    }
    if (type == BasicType.FLOAT) {
```

## RuleId[id=ComparatorCombinators]
### ComparatorCombinators
Can be replaced with 'Comparator.comparing'
in `reducer/src/main/java/com/graphicsfuzz/reducer/glslreducers/RandomizedReductionPass.java`
#### Snippet
```java
        getFinder().findOpportunities(shaderJob, getReducerContext());

    initialReductionOpportunities.sort((first, second) -> first.depth().compareTo(second.depth()));
    return initialReductionOpportunities;
  }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'fileOps' in a Serializable class
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
  }

  private final ShaderJobFileOperations fileOps;
  private final FuzzerServiceManager.Iface fuzzerServiceManagerProxy;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'accessFileInfo' in a Serializable class
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
  private final StringBuilder html;
  private long startTime;
  private final AccessFileInfo accessFileInfo;

  private static final String WARNING_CLASS_WRONG_RESULT = "wrongresult";
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsValue()'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/OutlinedStatementReductionOpportunity.java`
#### Snippet
```java
   */
  private Expr applySubstitutionDestructive(Expr expr, Map<String, Expr> paramReplacement) {
    assert !paramReplacement.values().contains(null);
    if (expr instanceof VariableIdentifierExpr
        && paramReplacement.containsKey(((VariableIdentifierExpr) expr).getName())) {
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `ast/src/main/java/com/graphicsfuzz/common/ast/AstUtil.java`
#### Snippet
```java
   *
   * @param decls A list of declarations
   * @return set of prototypes for all functions declared fully or via prototypes in the declaration
   *         list
   */
```

### MismatchedJavadocCode
Method is specified to return set but the return type is list
in `ast/src/main/java/com/graphicsfuzz/common/ast/AstUtil.java`
#### Snippet
```java
   *
   * @param shader A shader from which function prototypes should be extracted
   * @return set of prototypes for all functions declared fully or via prototypes in the shader
   */
  public static List<FunctionPrototype> getFunctionPrototypesFromShader(TranslationUnit shader) {
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `zip-helper/src/main/java/com/graphicsfuzz/zip/ZipFromZip.java`
#### Snippet
```java
      for (int i = 1; i < args.length; ++i) {
        final File inZip = new File(args[i]);
        ++i;
        Pattern regexIn = Pattern.compile(args[i]);
        ++i;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `zip-helper/src/main/java/com/graphicsfuzz/zip/ZipFromZip.java`
#### Snippet
```java
        ++i;
        Pattern regexIn = Pattern.compile(args[i]);
        ++i;
        String matchOut = args[i];

```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/BasicType.java`
#### Snippet
```java
    if (!this.isMatrix()) {
      throw new UnsupportedOperationException(
          "Type" + this.toString() + " does not have columns");
    }
    if (Arrays.asList(BasicType.MAT2X2, BasicType.MAT2X3, BasicType.MAT2X4).contains(this)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/BasicType.java`
#### Snippet
```java
    if (!this.isMatrix()) {
      throw new UnsupportedOperationException(
          "Type" + this.toString() + " does not have rows");
    }
    if (Arrays.asList(BasicType.MAT2X2, BasicType.MAT3X2, BasicType.MAT4X2).contains(this)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/BasicType.java`
#### Snippet
```java
    if (!this.isMatrix()) {
      throw new UnsupportedOperationException(
          "Type" + this.toString() + " does not have a column type");
    }
    if (Arrays.asList(BasicType.MAT2X2, BasicType.MAT3X2, BasicType.MAT4X2).contains(this)) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      imageJobResult
          .setStatus(JobStatus.SUCCESS)
          .setLog("\n" + res.stdout.toString());
    } else {
      ResultConstant resultConstant = ResultConstant.ERROR;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      imageJobResult
          .setStatus(status)
          .setLog(resultConstant + "\n" + res.stdout.toString());
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      InterruptedException {
    final String[] execArgs = new String[driverArgs.length + 1];
    execArgs[0] = Paths.get(ToolPaths.getPythonDriversDir(), driverName).toString()
        + (System.getProperty("os.name").startsWith("Windows") ? ".bat" : "");
    System.arraycopy(driverArgs, 0, execArgs, 1, driverArgs.length);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
        msg.append("Shader running on ").append(worker).append("\\n");
      }
      javascript += "\nwindow.onload = goBack('" + msg.toString() + "', 2);";
    } else {
      javascript += "\nwindow.onload = goBack('Please select a worker', 1);";
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
            metricResults.histogram != null
                ? (
                metricResults.histogram.toString()
                    + " (distance: " + metricResults.histogramDistance + ")"
            )
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
      exception.printStackTrace();
      throw new ServletException(
          "GET method failed, request was: " + request.toString(),
          exception);
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ServletException("POST method failed, request was: " + request.toString());
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Generate.java`
#### Snippet
```java
    final File donors = ns.get("donors");
    if (!donors.isDirectory()) {
      throw new RuntimeException("Donors directory '" + donors.toString() + "' does not exist.");
    }
    ShaderKind shaderStage = ns.get("shader_stage");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `zip-helper/src/main/java/com/graphicsfuzz/zip/ZipFromZip.java`
#### Snippet
```java
                for (int p = 1; p < path.getNameCount(); ++p) {
                  // 0..p, exclusive (every subpath, except the full path)
                  String subpath = path.subpath(0, p).toString() + "/";
                  if (!directoriesAdded.contains(subpath)) {
                    directoriesAdded.add(subpath);
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/GlslShaderJob.java`
#### Snippet
```java
    this.pipelineInfo = pipelineInfo;
    this.shaders = new ArrayList<>();
    final Set<ShaderKind> stagesSoFar = new HashSet<>();
    for (TranslationUnit tu : shaders) {
      if (stagesSoFar.contains(tu.getShaderKind())) {
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map\>' may not contain keys of type 'String'
in `common/src/main/java/com/graphicsfuzz/common/util/Obfuscator.java`
#### Snippet
```java
      }
      final StructNameType structType = (StructNameType) type;
      assert structFieldRenaming.containsKey(structType.getName());
      final Map<String, String> fieldRenaming = structFieldRenaming.get(structType.getName());
      assert fieldRenaming.containsKey(memberLookupExpr.getMember());
```

### SuspiciousMethodCalls
'Map\>' may not contain keys of type 'String'
in `common/src/main/java/com/graphicsfuzz/common/util/Obfuscator.java`
#### Snippet
```java
      final StructNameType structType = (StructNameType) type;
      assert structFieldRenaming.containsKey(structType.getName());
      final Map<String, String> fieldRenaming = structFieldRenaming.get(structType.getName());
      assert fieldRenaming.containsKey(memberLookupExpr.getMember());
      memberLookupExpr.setMember(fieldRenaming
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      File variantShaderResultFile) throws IOException {

    //noinspection deprecation: OK in this class.
    File reference = getUnderlyingImageFileFromShaderJobResultFile(referenceShaderResultFile);
    //noinspection deprecation: OK in this class.
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    //noinspection deprecation: OK in this class.
    File reference = getUnderlyingImageFileFromShaderJobResultFile(referenceShaderResultFile);
    //noinspection deprecation: OK in this class.
    File variant = getUnderlyingImageFileFromShaderJobResultFile(variantShaderResultFile);

```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java


    //noinspection deprecation: OK in this class.
    File reference = getUnderlyingImageFileFromShaderJobResultFile(referenceShaderResultFile);
    //noinspection deprecation: OK in this class.
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    //noinspection deprecation: OK in this class.
    File reference = getUnderlyingImageFileFromShaderJobResultFile(referenceShaderResultFile);
    //noinspection deprecation: OK in this class.
    File variant = getUnderlyingImageFileFromShaderJobResultFile(variantShaderResultFile);

```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      throws IOException, InterruptedException {
    for (ShaderKind shaderKind : ShaderKind.values()) {
      //noinspection deprecation: OK from within this class.
      final File shaderFile = getUnderlyingShaderFile(shaderJobFile, shaderKind);
      if (shaderFile.isFile() && !shaderIsValid(shaderFile, throwExceptionOnInvalid, isVulkan)) {
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      throws IOException, InterruptedException {
    for (ShaderKind shaderKind : ShaderKind.values()) {
      //noinspection deprecation: OK from within this class.
      final File shaderFile = getUnderlyingShaderFile(shaderJobFile, shaderKind);
      if (shaderFile.isFile()) {
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java

  public boolean doesShaderExist(File shaderJobFile, ShaderKind shaderKind) {
    //noinspection deprecation: OK from within this class.
    File shaderFile = getUnderlyingShaderFile(shaderJobFile, shaderKind);
    return shaderFile.isFile();
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      throws IOException {

    //noinspection deprecation: OK from within this class.
    File shaderFile = getUnderlyingShaderFile(shaderJobFile, shaderKind);

```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      ShaderKind shaderKind) throws IOException {

    //noinspection deprecation: OK from within this class.
    File shaderFile = getUnderlyingShaderFile(shaderJobFile, shaderKind);

```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
  public long getShaderLength(File shaderJobFile, ShaderKind shaderKind) {
    assertIsShaderJobFile(shaderJobFile);
    //noinspection deprecation: Fine in this class.
    return getUnderlyingShaderFile(shaderJobFile, shaderKind).length();
  }
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java

    final File infoFile = new File(shaderFileNoExtension + ".json");
    //noinspection deprecation: fine inside this class.
    final File fragmentFile = getUnderlyingShaderFile(shaderJobFile, ShaderKind.FRAGMENT);
    //noinspection deprecation: fine inside this class.
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    //noinspection deprecation: fine inside this class.
    final File fragmentFile = getUnderlyingShaderFile(shaderJobFile, ShaderKind.FRAGMENT);
    //noinspection deprecation: fine inside this class.
    final File vertexFile = getUnderlyingShaderFile(shaderJobFile, ShaderKind.VERTEX);
    final File primitivesFile = new File(shaderFileNoExtension + ".primitives");
```

### RedundantSuppression
Redundant suppression
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
    }

    //noinspection deprecation: OK for use inside this class.
    writeAdditionalInfo(
        outputShaderJobFile,
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `server/src/main/java/com/graphicsfuzz/server/webui/AccessFileInfo.java`
#### Snippet
```java
      JsonObject workerInfo = readWorkerInfoFromFile(workerInfoFile);
      workerInfoMap.put(workerName, workerInfo);
      workerInfoLastModified.put(workerName, new Long(workerInfoFile.lastModified()));
      return workerInfo;
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `server/src/main/java/com/graphicsfuzz/server/webui/AccessFileInfo.java`
#### Snippet
```java
      JsonObject resultInfo = readResultInfoFromFile(resultInfoFile);
      resultInfoMap.put(resultPath, resultInfo);
      resultInfoLastModified.put(resultPath, new Long(resultInfoFile.lastModified()));
      return resultInfo;
    }
```

### UnnecessaryBoxing
Unnecessary boxing
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Generate.java`
#### Snippet
```java
            + "floating point 0..1. Defaults to 0.5. "
            + "Ignored if shader language version doesn't support push constants.")
        .setDefault(new Float(0.5))
        .type(Float.class);

```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'instanceName'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/InterfaceBlock.java`
#### Snippet
```java
  private final List<String> memberNames;
  private final Map<String, Type> memberTypes;
  private final Optional<String> instanceName;

  public InterfaceBlock(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'layoutQualifier'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/InterfaceBlock.java`
#### Snippet
```java

  public InterfaceBlock(
      Optional<LayoutQualifierSequence> layoutQualifier,
      List<TypeQualifier> interfaceQualifiers,
      String structName,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'instanceName'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/InterfaceBlock.java`
#### Snippet
```java
      List<String> memberNames,
      List<Type> memberTypes,
      Optional<String> instanceName) {
    // Check that there are no repeated qualifiers
    assert interfaceQualifiers.size() == new HashSet<>(interfaceQualifiers).size() : "Interface "
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'layoutQualifier'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/InterfaceBlock.java`
#### Snippet
```java
public class InterfaceBlock extends Declaration {

  private final Optional<LayoutQualifierSequence> layoutQualifier;
  private final List<TypeQualifier> interfaceQualifiers;
  private final String structName;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'shadingLanguageVersion'
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java

  private ShaderKind shaderKind;
  private Optional<ShadingLanguageVersion> shadingLanguageVersion;
  private List<Declaration> topLevelDeclarations;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'shadingLanguageVersion'
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
   */
  public TranslationUnit(ShaderKind shaderKind,
                         Optional<ShadingLanguageVersion> shadingLanguageVersion,
                         List<Declaration> topLevelDeclarations) {
    this.shaderKind = shaderKind;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'shadingLanguageVersion'
in `ast/src/main/java/com/graphicsfuzz/common/ast/TranslationUnit.java`
#### Snippet
```java
   * @param topLevelDeclarations The content of the shader.
   */
  public TranslationUnit(Optional<ShadingLanguageVersion> shadingLanguageVersion,
                         List<Declaration> topLevelDeclarations) {
    this(ShaderKind.FRAGMENT, shadingLanguageVersion, topLevelDeclarations);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'returnVariableName'
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/Inliner.java`
#### Snippet
```java

  private List<Stmt> getInlinedStmts(FunctionDefinition functionDefinition,
        Optional<String> returnVariableName) {
    final List<Stmt> inlinedStmts = new ArrayList<>();
    for (int i = 0; i < functionDefinition.getPrototype().getNumParameters(); i++) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'variableDeclInfo'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  // such object (e.g. because the variable came from a parameter, or was made up for purposes of
  // fuzzing, or some such, the optional is empty.
  private final Optional<VariableDeclInfo> variableDeclInfo;

  // Represents the list of variable declarations that this variable came from, if one exists.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'parameterDecl'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  // Represents the ParameterDecl that this variable came from, if one exists. If there is no such
  // object, the optional is empty.
  private final Optional<ParameterDecl> parameterDecl;

  // Represents the VariableDeclInfo that this variable came from, if one exists.  If there is no
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parameterDecl'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  private final Optional<InterfaceBlock> interfaceBlock;

  private ScopeEntry(Type type, Optional<ParameterDecl> parameterDecl,
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'variableDeclInfo'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java

  private ScopeEntry(Type type, Optional<ParameterDecl> parameterDecl,
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
                     Optional<InterfaceBlock> interfaceBlock) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'variablesDecl'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  private ScopeEntry(Type type, Optional<ParameterDecl> parameterDecl,
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
                     Optional<InterfaceBlock> interfaceBlock) {
    this.type = type;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'interfaceBlock'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
                     Optional<VariableDeclInfo> variableDeclInfo,
                     Optional<VariablesDeclaration> variablesDecl,
                     Optional<InterfaceBlock> interfaceBlock) {
    this.type = type;
    this.parameterDecl = parameterDecl;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'interfaceBlock'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  // Represents the interface block that this variable is part of, if one exists. If there is no
  // such object, the optional is empty.
  private final Optional<InterfaceBlock> interfaceBlock;

  private ScopeEntry(Type type, Optional<ParameterDecl> parameterDecl,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'variablesDeclaration'
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeEntry.java`
#### Snippet
```java
  // Represents the list of variable declarations that this variable came from, if one exists.
  // If there is no such object, the optional is empty.
  private final Optional<VariablesDeclaration> variablesDeclaration;

  // Represents the interface block that this variable is part of, if one exists. If there is no
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'structNameType'
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/StructDefinitionType.java`
#### Snippet
```java
public class StructDefinitionType extends UnqualifiedType {

  private Optional<StructNameType> structNameType;
  private final List<String> fieldNames;
  private final List<Type> fieldTypes;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'structNameType'
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/StructDefinitionType.java`
#### Snippet
```java
  private final List<Type> fieldTypes;

  public StructDefinitionType(Optional<StructNameType> structNameType,
                               List<String> fieldNames,
                               List<Type> fieldTypes) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'parameterDecl'
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java

  private void checkNameTypeAndParam(String name, Type type,
        Optional<ParameterDecl> parameterDecl) {
    if (type == null) {
      throw new RuntimeException("Attempt to register a variable '" + name + "' with null type");
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'structNameType'
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
  }

  private StructDefinitionType makeStructDefinition(Optional<StructNameType> structNameType,
                                                    Member_listContext memberListContext) {
    final Pair<List<String>, List<Type>> members = getMembers(memberListContext);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'enclosingFunction'
in `common/src/main/java/com/graphicsfuzz/common/util/StripUnusedFunctions.java`
#### Snippet
```java
public class StripUnusedFunctions extends StandardVisitor {

  private Optional<FunctionDefinition> enclosingFunction;
  private Map<String, Set<String>> callGraphEdges;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pushConstant'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/ShaderJob.java`
#### Snippet
```java
  Optional<String> getLicense();

  void makeUniformBindings(Optional<String> pushConstant);

  void removeUniformBindings();
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'referenceShaderResult'
in `common/src/main/java/com/graphicsfuzz/shadersets/RunShaderFamily.java`
#### Snippet
```java
      File shaderJobFile,
      IShaderDispatcher imageGenerator,
      Optional<File> referenceShaderResult,
      ShaderJobFileOperations fileOps)
      throws ShaderDispatchException, InterruptedException, IOException {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'license'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java

  public static void emitShader(TranslationUnit shader,
                                Optional<String> license,
                                PrintStream stream,
                                int indentationWidth,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'uniformValues'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
  private final boolean emitGraphicsFuzzDefines;
  private final Optional<String> license;
  private final Optional<UniformValueSupplier> uniformValues;

  // Allows different formatting of a declaration when part of the header of a for statement.
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'license'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
  private boolean inFunctionDefinition = false;
  private final boolean emitGraphicsFuzzDefines;
  private final Optional<String> license;
  private final Optional<UniformValueSupplier> uniformValues;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'license'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java

  public static void emitShader(TranslationUnit shader,
                                Optional<String> license,
                                PrintStream stream,
                                int indentationWidth,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'uniformValueSupplier'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
                                int indentationWidth,
                                Supplier<String> newlineSupplier,
                                Optional<UniformValueSupplier> uniformValueSupplier) {
    final boolean usesGraphicsFuzzDefines = new CheckPredicateVisitor() {
      @Override
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'license'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
                              Supplier<String> newLineSupplier,
                              boolean emitGraphicsFuzzDefines,
                              Optional<String> license,
                              Optional<UniformValueSupplier> uniformValues) {
    this.out = out;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'uniformValues'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
                              boolean emitGraphicsFuzzDefines,
                              Optional<String> license,
                              Optional<UniformValueSupplier> uniformValues) {
    this.out = out;
    this.indentationWidth = indentationWidth;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'triggerFunction'
in `reducer/src/main/java/com/graphicsfuzz/reducer/CheckAstFeatureVisitor.java`
#### Snippet
```java
public abstract class CheckAstFeatureVisitor extends ScopeTrackingVisitor {

  private Optional<FunctionDefinition> triggerFunction = Optional.empty();
  private Map<String, Set<String>> callsIndirectly = new HashMap<String, Set<String>>();

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pushConstant'
in `reducer/src/main/java/com/graphicsfuzz/reducer/ReductionDriver.java`
#### Snippet
```java
  private boolean isInteresting(ShaderJob state,
                                boolean requiresUniformBindings,
                                Optional<String> pushConstant,
                                boolean addGlobalLoopLimiters,
                                boolean makeArrayAccessesInBounds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'successIndicator'
in `reducer/src/main/java/com/graphicsfuzz/reducer/ReductionDriver.java`
#### Snippet
```java
  public static String getReductionStepShaderJobShortName(String variantPrefix,
                                                          int currentReductionAttempt,
                                                          Optional<String> successIndicator) {
    return variantPrefix + "_reduced_" + String.format("%04d", currentReductionAttempt)
          + successIndicator
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pushConstant'
in `reducer/src/main/java/com/graphicsfuzz/reducer/ReductionDriver.java`
#### Snippet
```java
  private void writeState(ShaderJob state, File shaderJobFileOutput,
                          boolean requiresUniformBindings,
                          Optional<String> pushConstant,
                          boolean addGlobalLoopLimiters,
                          boolean makeArrayAccessesInBounds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pushConstant'
in `reducer/src/main/java/com/graphicsfuzz/reducer/ReductionDriver.java`
#### Snippet
```java
  private boolean isInterestingWithCache(ShaderJob state,
                                boolean requiresUniformBindings,
                                Optional<String> pushConstant,
                                boolean addGlobalLoopLimiters,
                                boolean makeArrayAccessesInBounds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'pushConstant'
in `reducer/src/main/java/com/graphicsfuzz/reducer/ReductionDriver.java`
#### Snippet
```java
  private boolean isInterestingNoCache(ShaderJob state,
                                boolean requiresUniformBindings,
                                Optional<String> pushConstant,
                                boolean addGlobalLoopLimiters,
                                boolean makeArrayAccessesInBounds,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'license'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/GlslShaderJob.java`
#### Snippet
```java
  private final List<TranslationUnit> shaders;

  public GlslShaderJob(Optional<String> license,
                       PipelineInfo pipelineInfo,
                       List<TranslationUnit> shaders) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'license'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/GlslShaderJob.java`
#### Snippet
```java
public class GlslShaderJob implements ShaderJob {

  private final Optional<String> license;
  private final PipelineInfo pipelineInfo;
  private final List<TranslationUnit> shaders;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'license'
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/GlslShaderJob.java`
#### Snippet
```java
  }

  public GlslShaderJob(Optional<String> license,
                       PipelineInfo pipelineInfo,
                       TranslationUnit... shaders) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'arrayCount'
in `common/src/main/java/com/graphicsfuzz/common/util/PipelineInfo.java`
#### Snippet
```java
   */
  public void addUniform(String name, BasicType basicType,
                         Optional<Integer> arrayCount, List<? extends Number> values) {
    assert isLegalUniformName(name);
    if (uniformAlreadyExists(name, PipelineInfo.getGlUniformFunctionName(basicType,
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'license'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
  private static void writeShader(
      TranslationUnit tu,
      Optional<String> license,
      File outputFile,
      Optional<UniformValueSupplier> uniformValues
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'uniformValues'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      Optional<String> license,
      File outputFile,
      Optional<UniformValueSupplier> uniformValues
  ) throws FileNotFoundException {
    try (PrintStream stream = ps(outputFile)) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'referenceImage'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      ImageJobResult res,
      File outputImage,
      Optional<ImageData> referenceImage) throws IOException {
    JsonObject infoJson = new JsonObject();
    if (res.isSetTimingInfo()) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'referenceShaderResultFile'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      ImageJobResult shaderResult,
      File shaderResultFile,
      Optional<File> referenceShaderResultFile) throws InterruptedException, IOException {

    writeShaderResultToFileHelper(
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'uniformValues'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      final ShaderJob shaderJob,
      final File outputShaderJobFile,
      final Optional<UniformValueSupplier> uniformValues) throws FileNotFoundException {

    assertIsShaderJobFile(outputShaderJobFile);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'referenceShaderResultFile'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
      File shaderJobResultFile,
      ShaderJobFileOperations fileOps,
      Optional<File> referenceShaderResultFile) throws InterruptedException, IOException {

    assertIsShaderJobResultFile(shaderJobResultFile);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'initializer'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StructifiedVariableInfo.java`
#### Snippet
```java
  private final Optional<Initializer> initializer;

  StructifiedVariableInfo(String name, Type type, Optional<Initializer> initializer) {
    this.name = name;
    this.type = type;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'initializer'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StructifiedVariableInfo.java`
#### Snippet
```java
  private final String name;
  private final Type type;
  private final Optional<Initializer> initializer;

  StructifiedVariableInfo(String name, Type type, Optional<Initializer> initializer) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'initializer'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunity.java`
#### Snippet
```java
  private Optional<StructifiedVariableInfo> findOriginalVariableInfo(
      StructNameType type,
      Optional<Initializer> initializer) {

    final StructDefinitionType structDefinitionType = tu.getStructDefinition(type);
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'onlyFuzzShaderStage'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
        EnabledTransformations enabledTransformations,
        boolean addInjectionSwitch,
        Optional<ShaderKind> onlyFuzzShaderStage,
        float pushConstantProbability,
        boolean isWgslCompatible) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'onlyFuzzShaderStage'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GeneratorArguments.java`
#### Snippet
```java
  private final EnabledTransformations enabledTransformations;
  private final boolean addInjectionSwitch;
  private final Optional<ShaderKind> onlyFuzzShaderStage;
  private final float pushConstantProbability;
  private final boolean isWgslCompatible;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'currentVariablesDeclaration'
in `generator/src/main/java/com/graphicsfuzz/generator/util/ConstCleaner.java`
#### Snippet
```java

  private boolean atGlobalScope;
  private Optional<VariablesDeclaration> currentVariablesDeclaration;
  private final List<VariablesDeclaration> globalsToBeReInitialized;
  private final ShadingLanguageVersion shadingLanguageVersion;
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maxFactor'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GenerateShaderFamily.java`
#### Snippet
```java
                                                  File preparedReferenceShaderJobFile,
                                                  File variantShaderJobFile,
                                                  Optional<Float> maxFactor,
                                                  Optional<Integer> maxBytes,
                                                  boolean verbose) {
```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'maxBytes'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GenerateShaderFamily.java`
#### Snippet
```java
                                                  File variantShaderJobFile,
                                                  Optional<Float> maxFactor,
                                                  Optional<Integer> maxBytes,
                                                  boolean verbose) {
    // Go through all the shader kinds.
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ast/src/main/java/com/graphicsfuzz/common/tool/ReportShaderSize.java`
#### Snippet
```java
      InterruptedException, GlslParserException {
    if (args.length != 1) {
      System.err.println("Usage: ReportShaderSize <file>");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `ast/src/main/java/com/graphicsfuzz/common/tool/ReportShaderSize.java`
#### Snippet
```java
    StatsVisitor sv = new StatsVisitor(tu);

    System.out.printf(
        "{ \"num_bytes\": %d, \"num_nodes\": %d, \"num_statements\": %d }",
        inputFile.length(),
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrint.java`
#### Snippet
```java
      prettyPrintShader(ns, tu);

      System.err.println("Time for parsing: " + (endTime - startTime));
    } catch (Throwable exception) {
      exception.printStackTrace();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `tool/src/main/java/com/graphicsfuzz/tool/FuzzyImageComparisonTool.java`
#### Snippet
```java
    try {
      FuzzyImageComparison.MainResult result = FuzzyImageComparison.mainHelper(args);
      System.out.println(result.outputsString());
      System.exit(result.exitStatus);

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tool/src/main/java/com/graphicsfuzz/tool/FuzzyImageComparisonTool.java`
#### Snippet
```java

    } catch (ArgumentParserException exception) {
      System.err.println(exception.getMessage());
      exception.getParser().printHelp(new PrintWriter(System.err, true));
      System.exit(3);
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tool/src/main/java/com/graphicsfuzz/tool/FuzzyImageComparisonTool.java`
#### Snippet
```java
    } catch (ArgumentParserException exception) {
      System.err.println(exception.getMessage());
      exception.getParser().printHelp(new PrintWriter(System.err, true));
      System.exit(3);
    } catch (Throwable throwable) {
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java
      TranslationUnit tu = ParseHelper.parse(new File(ns.getString("shader")));
      long endTime = System.currentTimeMillis();
      System.err.println("Time for parsing: " + (endTime - startTime));

      startTime = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java
      upgrade(tu, ShadingLanguageVersion.ESSL_320, ns.getBoolean("norename"));
      endTime = System.currentTimeMillis();
      System.err.println("Time for upgrading: " + (endTime - startTime));

      // After upgrading, pretty print the shader for output
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
      final ShaderJob input = fileOperations.readShaderJobFile(new File(ns.getString("shader")));
      long endTime = System.currentTimeMillis();
      System.err.println("Time for parsing: " + (endTime - startTime));

      startTime = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
      final ShaderJob result = convertShaderJob(input);
      endTime = System.currentTimeMillis();
      System.err.println("Time for converting shader job: " + (endTime - startTime));

      fileOperations.writeShaderJobFile(result, new File(ns.getString("output")));
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java

    if (fragmentBuiltinUsage.getUsesDiscard()) {
      System.err.println(
          "Warning: discard instruction found while converting from fragment shader to vertex "
              + "shader.\nDiscard is signaled to the new fragment shader, but the vertex shader "
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderToShaderJob.java`
#### Snippet
```java
      final TranslationUnit tu = ParseHelper.parse(new File(ns.getString("shader")));
      long endTime = System.currentTimeMillis();
      System.err.println("Time for parsing: " + (endTime - startTime));

      startTime = System.currentTimeMillis();
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderToShaderJob.java`
#### Snippet
```java
      final ShaderJob result = createShaderJob(tu, new RandomWrapper(ArgsUtil.getSeedArgument(ns)));
      endTime = System.currentTimeMillis();
      System.err.println("Time for creating shader job: " + (endTime - startTime));

      final ShaderJobFileOperations fileOperations = new ShaderJobFileOperations();
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/imagetools/ComparePsnr.java`
#### Snippet
```java
    final Namespace ns = parser.parseArgs(args);

    System.out.println(ImageUtil.comparePsnr(ns.get("image1"), ns.get("image2")));

  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/imagetools/CheckColorComponents.java`
#### Snippet
```java

    if (components.stream().anyMatch(item -> item < 0 || item > 255)) {
      System.err.println("Error: given component list " + components + " includes elements not "
          + "in range 0..255.");
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/imagetools/CompareHistograms.java`
#### Snippet
```java
    final Namespace ns = parser.parseArgs(args);

    System.out.println(ImageUtil.compareHistograms((File) ns.get("image1"), ns.get("image2")));

  }
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/Simplifier.java`
#### Snippet
```java
      InterruptedException, GlslParserException {
    if (args.length != 1) {
      System.err.println("Usage: Simplifier <file>.json");
      System.exit(1);
    }
```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java

  public PrintStream getStdOut() {
    return System.out;
  }

```

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java

    for (IExprTemplate t : templates) {
      System.out.println(t);
    }
  }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'structureType == null' covered by subsequent condition '!(structureType instanceof BasicType)'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
    }
    final Type structureType = typer.lookupType(memberLookupExpr.getStructure());
    if (structureType == null || !(structureType instanceof BasicType)) {
      return;
    }
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
   *
   */
  public File getUnderlyingShaderFile(
      File shaderJobFile,
      ShaderKind shaderKind) {
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
   * @deprecated Should probably be avoided, but useful for now.
   */
  public void writeAdditionalInfo(
      File shaderJobFile,
      String outputFileExtension,
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
      int index = ((IntConstantExpr) arrayIndexExpr.getIndex()).getNumericValue();
      List<String> values = uniformValues.get().getValues(knownUniformArrayName).get();
      out.append("_").append(prefix).append("_").append(values.get(index).replace(".", "_"));
      return true;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
      for (String value : values.get()) {
        out.append("#define").append(" ").append("_").append(prefix).append("_")
            .append(value.replace(".", "_"))
            .append(" ").append(knownUniformArrayName)
            .append("[").append(String.valueOf(index)).append("]");
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
              "<a href='/webui/result/",
              refHref,
              "'>", refStatus.replace("_", " "), " ",
              "</a>\n");
        }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
        "<pre id='metric_hints' style='font-size: 10px'>Comparison metric hints ",
        "(from `glsl-reduce -h`):\n\n",
        GlslReduce.METRICS_HELP_SHARED.replaceAll("\n\n", "\n"),
        "\n\n",
        "</pre>",
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    JsonObject info = accessFileInfo.getResultInfo(variantInfoFile);
    String status = info.get("status").getAsString();
    String cellHref = "/webui/result/" + variantInfoFile.getPath().replace(".info.json", "");

    if (status.contentEquals("SUCCESS")) {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
              "<img class='" + warningClass + " ui centered tiny image' "
                  + "src='/webui/file/",
              variantInfoFile.getPath().replace(".info.json", ".png"),
              "'></a>\n",
              "<div class='ui tiny ", reductionLabelColor(reductionStatus), " label'>",
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
          "'>",
          "<img class='ui centered tiny image' src='/webui/file/",
          variantInfoFile.getPath().replace(".info.json", ".gif"),
          "'></a>\n",
          "<div class='ui tiny ", reductionLabelColor(reductionStatus), " label'>",
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
          "<a href='",
          cellHref,
          "'>", status.replace("_", " "), " ",
          "</a>\n",
          "<div class='ui tiny ", reductionLabelColor(reductionStatus), " label'>",
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
            "<p>Here are the second-to-last and last renderings:</p>\n",
            "<img src='/webui/file/",
            gifPath.replace(".gif", "_nondet2.png"),
            "'> ",
            "<img src='/webui/file/",
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
            "'> ",
            "<img src='/webui/file/",
            gifPath.replace(".gif", "_nondet1.png"),
            "'> ");
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GlslGenerate.java`
#### Snippet
```java
        continue;
      }
      final String replacementArg = arg.replace("_", "-");
      if (ns.get(arg) instanceof Boolean) {
        if (ns.getBoolean(arg)) {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/ClasspathFileServlet.java`
#### Snippet
```java
    pathInfo = "/" + pathInfo.substring(1);
    pathInfo = Paths.get(pathInfo).normalize().toString();
    pathInfo = pathInfo.replaceAll("\\\\", "/");

    if (!pathInfo.startsWith("/") || pathInfo.contains("/../")) {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
  private String getResourceContent(String resourceName) throws IOException {
    InputStream is = this.getClass().getResourceAsStream("/private/" + resourceName);
    java.util.Scanner scanner = new java.util.Scanner(is, "UTF-8").useDelimiter("\\A");
    return scanner.hasNext() ? scanner.next() : "";
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
  private String getResourceContent(String resourceName) throws IOException {
    InputStream is = this.getClass().getResourceAsStream("/private/" + resourceName);
    java.util.Scanner scanner = new java.util.Scanner(is, "UTF-8").useDelimiter("\\A");
    return scanner.hasNext() ? scanner.next() : "";
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `generator/src/main/java/com/graphicsfuzz/generator/util/TransformationProbabilities.java`
#### Snippet
```java
    String result = "";
    for (Field field : this.getClass().getDeclaredFields()) {
      if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
        continue;
      }
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
    assert swizzle.length() > 0;
    assert swizzle.length() <= 4;
    if (!Pattern.compile("(x|y|z|w|r|g|b|a|s|t|p|q)+").matcher(swizzle).matches()) {
      throw new FailedReductionException("Ill-formed swizzle: " + swizzle);
    }
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrint.java`
#### Snippet
```java
      System.err.println("Time for parsing: " + (endTime - startTime));
    } catch (Throwable exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `tool/src/main/java/com/graphicsfuzz/tool/FuzzyImageComparisonTool.java`
#### Snippet
```java
      System.exit(3);
    } catch (Throwable throwable) {
      throwable.printStackTrace();
      System.exit(2);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java
      prettyPrintShader(ns, tu);
    } catch (Throwable exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
      fileOperations.writeShaderJobFile(result, new File(ns.getString("output")));
    } catch (Throwable exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderToShaderJob.java`
#### Snippet
```java
      fileOperations.writeShaderJobFile(result, new File(ns.getString("output")));
    } catch (Throwable exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/shadersets/RunShaderFamily.java`
#### Snippet
```java
      System.exit(1);
    } catch (Exception ex) {
      ex.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `common/src/main/java/com/graphicsfuzz/shadersets/RunShaderFamily.java`
#### Snippet
```java
        } catch (Exception err) {
          LOGGER.error("runShader() raise exception on {}", variant);
          err.printStackTrace();
        }
        ++numShadersRun;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/GlslReduce.java`
#### Snippet
```java
      System.exit(1);
    } catch (Throwable ex) {
      ex.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
      }
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ServletException(
          "GET method failed, request was: " + request.toString(),
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
      }
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new ServletException("POST method failed, request was: " + request.toString());
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `generator/src/main/java/com/graphicsfuzz/generator/tool/PrepareReference.java`
#### Snippet
```java
    } catch (IOException | ParseTimeoutException | InterruptedException
        | GlslParserException exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GlslGenerate.java`
#### Snippet
```java
      System.exit(1);
    } catch (Throwable ex) {
      ex.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
        | IOException
        | InterruptedException exception) {
      exception.printStackTrace();
      LOGGER.error("Failed to mutate:\n" + inputShader, exception);
      return null;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Mutate.java`
#### Snippet
```java
    } catch (IOException | ParseTimeoutException | InterruptedException
        | GlslParserException exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GenerateShaderFamily.java`
#### Snippet
```java
      System.exit(1);
    } catch (Throwable ex) {
      ex.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java

    } catch (Throwable throwable) {
      throwable.printStackTrace();
      System.exit(1);
    }
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `zip-helper/src/main/java/com/graphicsfuzz/zip/ZipFromZip.java`
#### Snippet
```java
      mainHelper(args);
    } catch (Exception exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `CheckPredicateVisitor()` of an abstract class should not be declared 'public'
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/CheckPredicateVisitor.java`
#### Snippet
```java
  private boolean predicateHolds;

  public CheckPredicateVisitor() {
    this.predicateHolds = false;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `StandardVisitor()` of an abstract class should not be declared 'public'
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/StandardVisitor.java`
#### Snippet
```java
  private int currentDepth;

  public StandardVisitor() {
    currentDepth = 0;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `StreamGobbler()` of an abstract class should not be declared 'public'
in `util/src/main/java/com/graphicsfuzz/util/StreamGobbler.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(StreamGobbler.class);

  public StreamGobbler(InputStream inputStream) {
    this.inputStream = inputStream;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ReductionOpportunitiesBase()` of an abstract class should not be declared 'public'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/ReductionOpportunitiesBase.java`
#### Snippet
```java
   *                only to reverse transformations
   */
  public ReductionOpportunitiesBase(TranslationUnit tu, ReducerContext context) {
    super(tu);
    this.opportunities = new ArrayList<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `RemoveStatements()` of an abstract class should not be declared 'public'
in `generator/src/main/java/com/graphicsfuzz/generator/util/RemoveStatements.java`
#### Snippet
```java
  private final Function<Stmt, Stmt> replaceWith;

  public RemoveStatements(Predicate<Stmt> shouldRemove,
      Function<Stmt, Stmt> replaceWith, IAstNode node) {
    this.shouldRemove = shouldRemove;
```

### NonProtectedConstructorInAbstractClass
Constructor `Expr2ExprMutationFinder()` of an abstract class should not be declared 'public'
in `generator/src/main/java/com/graphicsfuzz/generator/mutateapi/Expr2ExprMutationFinder.java`
#### Snippet
```java
  protected final IParentMap parentMap;

  public Expr2ExprMutationFinder(TranslationUnit tu) {
    super(tu);
    this.typer = new Typer(tu);
```

### NonProtectedConstructorInAbstractClass
Constructor `MutationFinderBase()` of an abstract class should not be declared 'public'
in `generator/src/main/java/com/graphicsfuzz/generator/mutateapi/MutationFinderBase.java`
#### Snippet
```java
  protected boolean underForLoopHeader;

  public MutationFinderBase(TranslationUnit tu) {
    this.tu = tu;
    this.mutations = new ArrayList<>();
```

### NonProtectedConstructorInAbstractClass
Constructor `DonateCodeTransformation()` of an abstract class should not be declared 'public'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateCodeTransformation.java`
#### Snippet
```java
  private int translationUnitCount;

  public DonateCodeTransformation(Function<IRandom, Boolean> probabilityOfDonation,
                                  File donorsDirectory, GenerationParams generationParams) {
    this.probabilityOfDonation = probabilityOfDonation;
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
        false,
        ShaderKind.fromExtension(args[1])));
    Collections.sort(templates, new Comparator<IExprTemplate>() {
      @Override
      public int compare(IExprTemplate t1, IExprTemplate t2) {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `lhs`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunities.java`
#### Snippet
```java
    while (lhs instanceof MemberLookupExpr || lhs instanceof ArrayIndexExpr) {
      if (lhs instanceof MemberLookupExpr) {
        lhs = ((MemberLookupExpr) lhs).getStructure();
      } else {
        lhs = ((ArrayIndexExpr) lhs).getArray();
```

### AssignmentToMethodParameter
Assignment to method parameter `lhs`
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunities.java`
#### Snippet
```java
        lhs = ((MemberLookupExpr) lhs).getStructure();
      } else {
        lhs = ((ArrayIndexExpr) lhs).getArray();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `marker`
in `third_party/alphanum-comparator/src/main/java/com/graphicsfuzz/alphanumcomparator/AlphanumComparator.java`
#### Snippet
```java
    char ch = str.charAt(marker);
    chunk.append(ch);
    marker++;
    if (isDigit(ch)) {
      while (marker < slength) {
```

### AssignmentToMethodParameter
Assignment to method parameter `marker`
in `third_party/alphanum-comparator/src/main/java/com/graphicsfuzz/alphanumcomparator/AlphanumComparator.java`
#### Snippet
```java
        }
        chunk.append(ch);
        marker++;
      }
    } else {
```

### AssignmentToMethodParameter
Assignment to method parameter `marker`
in `third_party/alphanum-comparator/src/main/java/com/graphicsfuzz/alphanumcomparator/AlphanumComparator.java`
#### Snippet
```java
        }
        chunk.append(ch);
        marker++;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `oldWorker`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
    // Trim worker name
    if (oldWorker != null) {
      oldWorker = oldWorker.trim();
    }
    if (oldWorker.isEmpty()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `oldWorker`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
    }
    if (oldWorker.isEmpty()) {
      oldWorker = null;
    }

```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
      } catch (FuzzedIntoACornerException exception) {
        // Do nothing; try again;
        continue;
      }
    }
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/BasicType.java`
#### Snippet
```java
        // Should not be reachable.
        assert false;
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/BasicType.java`
#### Snippet
```java
    // Should not be reachable.
    assert false;
    return null;
  }

```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
      return parent.remove(name);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
      return getParent().lookupStructName(structName);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
      return parent.lookupScopeEntry(name);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
    ScopeEntry entry = lookupScopeEntry(name);
    if (entry == null) {
      return null;
    }
    return entry.getType();
```

### ReturnNull
Return of `null`
in `util/src/main/java/com/graphicsfuzz/util/StreamGobblerLogger.java`
#### Snippet
```java

  public StringBuffer getResult() {
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/AstBuilder.java`
#### Snippet
```java
  public Initializer visitInitializer(InitializerContext ctx) {
    if (ctx == null) {
      return null;
    }
    if (ctx.assignment_expression() != null) {
```

### ReturnNull
Return of `null`
in `reducer/src/main/java/com/graphicsfuzz/reducer/ReductionDriver.java`
#### Snippet
```java
            LOGGER.info("Tried " + NUM_INITIAL_TRIES + " times; stopping.");
            fileOps.createFile(new File(workDir, "NOT_INTERESTING"));
            return null;
          }
        }
```

### ReturnNull
Return of `null`
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    if (!workerDir.isDirectory()) {
      err404(request, response);
      return null;
    }
    File[] workerCandidates = workerDir.listFiles();
```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
    }
    assert false : "Unreachable";
    return null;
  }

```

### ReturnNull
Return of `null`
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
    }
    assert false : "Unreachable";
    return null;
  }

```

### ReturnNull
Return of `null`
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
      exception.printStackTrace();
      LOGGER.error("Failed to mutate:\n" + inputShader, exception);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
        }
      }, jobIdCounter, retryLimit));
      return null;
    });

```

### ReturnNull
Return of `null`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
                this,
                commandDispatcher));
            return null;
          });
    } catch (Exception ex) {
```

### ReturnNull
Return of `null`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
          );

          return null;
        });
      }
```

### ReturnNull
Return of `null`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
          session.jobQueue.remove();
        }
        return null;
      } catch (ServerJobException exception) {
        throw new TException(exception);
```

### ReturnNull
Return of `null`
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateCodeTransformation.java`
#### Snippet
```java
      }
      // We simply make do without an initializer, as we didn't manage to fuzz one.
      return null;
    }
  }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `newScope` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/typing/ScopeTrackingVisitor.java`
#### Snippet
```java
   */
  protected void pushScope() {
    Scope newScope = new Scope(currentScope);
    currentScope = newScope;
  }
```

### UnnecessaryLocalVariable
Local variable `file` is redundant
in `util/src/main/java/com/graphicsfuzz/util/ToolPaths.java`
#### Snippet
```java
  public static File getJarDirectory() {
    try {
      File file = new File(ToolPaths.class.getProtectionDomain()
            .getCodeSource()
            .getLocation()
```

### UnnecessaryLocalVariable
Local variable `json` is redundant
in `server/src/main/java/com/graphicsfuzz/server/webui/AccessFileInfo.java`
#### Snippet
```java

  private JsonObject readWorkerInfoFromFile(File workerInfoFile) throws FileNotFoundException {
    JsonObject json = gson
        .fromJson(new FileReader(workerInfoFile), JsonObject.class)
        .getAsJsonObject("platform_info");
```

### UnnecessaryLocalVariable
Local variable `relatedFiles` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
        FilenameUtils.removeExtension(shaderJobFile.toString());

    File[] relatedFiles =
        Stream.of(".json", ".vert", ".frag", ".comp", ".primitives", ".prob", ".license")
            .map(ext -> new File(fileNoExtension + ext))
```

### UnnecessaryLocalVariable
Local variable `relatedFiles` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java
        FileHelper.removeEnd(shaderResultFile.toString(), ".info.json");

    File[] relatedFiles =
        Stream.of(".info.json", ".txt", ".png")
            .map(ext -> new File(fileNoExtension + ext))
```

### UnnecessaryLocalVariable
Local variable `outputShader` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
            PrettyPrinterVisitor.DEFAULT_NEWLINE_SUPPLIER);
      }
      final String outputShader =
          new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
      return outputShader;
```

### UnnecessaryLocalVariable
Local variable `newScope` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/FuzzingContext.java`
#### Snippet
```java

  public void enterScope() {
    Scope newScope = new Scope(currentScope);
    currentScope = newScope;
  }
```

### UnnecessaryLocalVariable
Local variable `zeroIfInf` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java
    final FunctionCallExpr zeroIfNan = new FunctionCallExpr("mix", expr,
        opaqueZero(scope, basicType), isNan);
    final FunctionCallExpr zeroIfInf = new FunctionCallExpr("mix", zeroIfNan,
        opaqueZero(scope, basicType),
        isInf);
```

## RuleId[id=UnnecessaryTemporaryOnConversionToString]
### UnnecessaryTemporaryOnConversionToString
Unnecessary temporary object in conversion to 'String'
in `common/src/main/java/com/graphicsfuzz/common/util/GloballyTruncateLoops.java`
#### Snippet
```java
        tu.addDeclarationBefore(new VariablesDeclaration(new QualifiedType(BasicType.INT,
                Arrays.asList(TypeQualifier.CONST)), new VariableDeclInfo(loopBoundName, null,
                new Initializer(new IntConstantExpr(new Integer(loopLimit).toString())))),
            firstNonPrecisionDeclaration);
        // Add loop count variable.
```

### UnnecessaryTemporaryOnConversionToString
Unnecessary temporary object in conversion to 'String'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java

  private String freshId() {
    return new Integer(nextId++).toString();
  }

```

### UnnecessaryTemporaryOnConversionToString
Unnecessary temporary object in conversion to 'String'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
        Expr index = type.isVector()
            ? new ArrayIndexExpr(
            new ParenExpr(expr).clone(), new IntConstantExpr(new Integer(i).toString()))
            : expr.clone();

```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrint.java`
#### Snippet
```java
      throws FileNotFoundException {
    try (PrintStream stream =
             new PrintStream(new FileOutputStream(new File(ns.getString("output"))))) {
      PrettyPrinterVisitor ppv = new PrettyPrinterVisitor(stream);
      ppv.visit(tu);
```

### RedundantFileCreation
`new File` is redundant
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java
      throws FileNotFoundException {
    try (PrintStream stream =
             new PrintStream(new FileOutputStream(new File(ns.getString("output"))))) {
      PrettyPrinterVisitor ppv = new PrettyPrinterVisitor(stream);
      ppv.visit(tu);
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
    List<TypeQualifier> newQualifiers = new ArrayList<>();
    for (TypeQualifier q : qualifiers) {
      newQualifiers.add(q);
    }
    return new QualifiedType(targetType.clone(), newQualifiers);
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
    Scope result = hasParent() ? new Scope(parent.shallowClone()) : new Scope();
    for (Entry<String, ScopeEntry> entry : variableMapping.entrySet()) {
      result.variableMapping.put(entry.getKey(), entry.getValue());
    }
    for (Entry<String, StructDefinitionType> entry : structMapping.entrySet()) {
```

### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java
    }
    for (Entry<String, StructDefinitionType> entry : structMapping.entrySet()) {
      result.structMapping.put(entry.getKey(), entry.getValue());
    }
    return result;
```

