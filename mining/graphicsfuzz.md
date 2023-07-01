# graphicsfuzz 
 
# Bad smells
I found 538 bad smells with 20 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 66 | false |
| ArraysAsListWithZeroOrOneArgument | 60 | false |
| OptionalUsedAsFieldOrParameterType | 54 | false |
| DataFlowIssue | 42 | false |
| OptionalGetWithoutIsPresent | 31 | false |
| TrivialIf | 29 | false |
| SuspiciousMethodCalls | 26 | false |
| StringConcatenationInsideStringBufferAppend | 25 | false |
| Deprecation | 23 | false |
| ConstantValue | 20 | false |
| DuplicatedCode | 13 | false |
| SimplifyStreamApiCallChains | 12 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 12 | false |
| UnnecessaryToStringCall | 12 | true |
| FieldCanBeLocal | 11 | false |
| OptionalIsPresent | 8 | false |
| UnnecessaryLocalVariable | 8 | true |
| UnusedAssignment | 8 | false |
| CommentedOutCode | 7 | false |
| RefusedBequest | 7 | false |
| UnnecessaryCallToStringValueOf | 6 | false |
| StringConcatenationInLoops | 6 | false |
| StringOperationCanBeSimplified | 4 | false |
| WrapperTypeMayBePrimitive | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| IOStreamConstructor | 3 | false |
| IgnoreResultOfCall | 3 | false |
| RedundantCast | 3 | false |
| FuseStreamOperations | 3 | false |
| UnnecessaryTemporaryOnConversionToString | 3 | false |
| UseBulkOperation | 3 | false |
| DeprecatedIsStillUsed | 2 | false |
| FinalMethodInFinalClass | 2 | false |
| FinalPrivateMethod | 2 | false |
| MismatchedJavadocCode | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| AccessStaticViaInstance | 2 | false |
| RedundantFileCreation | 2 | false |
| SwitchStatementWithTooFewBranches | 1 | false |
| RedundantCollectionOperation | 1 | false |
| ReassignedToPlainText | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| AutoCloseableResource | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryContinue | 1 | false |
| DuplicateThrows | 1 | false |
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
Method invocation `finishJob` may produce `NullPointerException`
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java

        // Execute finish job on the server job and see if it should be removed.
        boolean remove = serverJob.finishJob(job);

        LOGGER.info("Returned from finishJob. Removing job? {}", remove);
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

## RuleId[id=SimplifyStreamApiCallChains]
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

## RuleId[id=RefusedBequest]
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
in `common/src/main/java/com/graphicsfuzz/common/util/PipelineInfo.java`
#### Snippet
```java

  @Override
  public PipelineInfo clone() {
    return new PipelineInfo(toString());
  }
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/StructNameType.java`
#### Snippet
```java

  @Override
  public final boolean hasCanonicalConstant(Scope scope) {
    if (scope.lookupStructName(name) == null) {
      throw new RuntimeException("Attempt to check whether a struct has a canonical constant when"
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/StructNameType.java`
#### Snippet
```java

  @Override
  public final Expr getCanonicalConstant(Scope scope) {
    return scope.lookupStructName(name).getCanonicalConstant(scope);
  }
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

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/PublicServerCommandDispatcher.java`
#### Snippet
```java
  public void dispatchCommand(List<String> command, FuzzerServiceManager.Iface fuzzerServiceManager)
        throws ShaderDispatchException, ArgumentParserException, InterruptedException, IOException {
    switch (command.get(0)) {
      case "run_shader_family":
        RunShaderFamily.mainHelper(
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

## RuleId[id=FinalPrivateMethod]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/BasicType.java`
#### Snippet
```java
    if (elementType == FLOAT) {
      switch (numElements) {
        case 1:
          return FLOAT;
        case 2:
          return VEC2;
        case 3:
          return VEC3;
        default:
          assert numElements == 4;
          return VEC4;
      }
    }
    if (elementType == INT) {
      switch (numElements) {
        case 1:
          return INT;
        case 2:
          return IVEC2;
        case 3:
          return IVEC3;
        default:
          assert numElements == 4;
          return IVEC4;
      }
    }
```

### DuplicatedCode
Duplicated code
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrinterVisitor.java`
#### Snippet
```java
          if (item.size() > 1) {
            out.append("[");
          }
          out.append(item.stream().map(Object::toString)
              .reduce((item1, item2) -> item1 + ", " + item2).orElse(""));
          if (item.size() > 1) {
            out.append("]");
          }
```

### DuplicatedCode
Duplicated code
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
    if (rhsType == BasicType.FLOAT || rhsType == BasicType.INT || rhsType == BasicType.UINT) {
      assert lhsType instanceof BasicType;
      return lhsType;
    }
    if (lhsType == BasicType.FLOAT || lhsType == BasicType.INT || lhsType == BasicType.UINT) {
      assert rhsType instanceof BasicType;
      return rhsType;
    }
```

### DuplicatedCode
Duplicated code
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
      for (int i = 0; i < bgenVectors.size(); i++) {
        addBuiltin(builtinsForVersion, name, bgenVectors.get(i), genVectors.get(i),
            genVectors.get(i));
        addBuiltin(builtinsForVersion, name, bgenVectors.get(i), igenVectors.get(i),
            igenVectors.get(i));
        if (supportsUnsigned) {
          addBuiltin(builtinsForVersion, name, bgenVectors.get(i), ugenVectors.get(i),
              ugenVectors.get(i));
        }
      }
```

### DuplicatedCode
Duplicated code
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
      for (int i = 0; i < bgenVectors.size(); i++) {
        addBuiltin(builtinsForVersion, name, bgenVectors.get(i), genVectors.get(i),
            genVectors.get(i));
        addBuiltin(builtinsForVersion, name, bgenVectors.get(i), igenVectors.get(i),
            igenVectors.get(i));
        if (supportsUnsigned) {
          addBuiltin(builtinsForVersion, name, bgenVectors.get(i), ugenVectors.get(i),
              ugenVectors.get(i));
        }
        addBuiltin(builtinsForVersion, name, bgenVectors.get(i), bgenVectors.get(i),
            bgenVectors.get(i));
      }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
          if (vdi.hasArrayInfo()) {
            for (int i = 0; i < vdi.getArrayInfo().getDimensionality(); i++) {
              visit(vdi.getArrayInfo().getSizeExpr(i));
            }
          } else if (baseType instanceof ArrayType) {
            final ArrayInfo arrayInfo = ((ArrayType) baseType).getArrayInfo();
            assert arrayInfo.getDimensionality() == 1;
            visit(arrayInfo.getSizeExpr(0));
          }
```

### DuplicatedCode
Duplicated code
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
    ArgumentParser parser = ArgumentParsers.newArgumentParser("FragmentShaderToShaderJob")
        .defaultHelp(true)
        .description("Turns a fragment shader into a shader job with randomized uniforms and "
            + "(if needed) a suitable vertex shader.");

    // Required arguments
    parser.addArgument("shader")
        .help("Path of .frag shader to be turned into a shader job.")
        .type(File.class);

    parser.addArgument("output")
        .help("Target shader job .json file.")
        .type(String.class);

    parser.addArgument("--seed")
        .help("Seed (unsigned 64 bit long integer) for the random number generator.")
        .type(String.class);

    return parser.parseArgs(args);
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/templates/ConstantExprTemplate.java`
#### Snippet
```java
    final int maxDigitsEitherSide = 5;
    StringBuilder sb = new StringBuilder();
    sb.append(generator.nextBoolean() ? "-" : "");
    int digitsBefore = Math.max(1, generator.nextInt(maxDigitsEitherSide));
    for (int i = 0; i < digitsBefore; i++) {
      int candidate;
      while (true) {
        candidate = generator.nextInt(10);
        if (candidate == 0 && i == 0 && digitsBefore > 1) {
          continue;
        }
        break;
      }
      sb.append(String.valueOf(candidate));
    }
    sb.append(".");
    for (int i = 0; i < digitsBefore; i++) {
      sb.append(String.valueOf(generator.nextInt(10)));
    }
```

### DuplicatedCode
Duplicated code
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Mutate.java`
#### Snippet
```java
    try {
      mainHelper(args);
    } catch (ArgumentParserException exception) {
      exception.getParser().handleError(exception);
      System.exit(1);
    } catch (IOException | ParseTimeoutException | InterruptedException
        | GlslParserException exception) {
      exception.printStackTrace();
      System.exit(1);
    }
```

### DuplicatedCode
Duplicated code
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
    if (isZeroFloat(thisHandSide)) {
      addReplaceWithExpr(parent, child, thatHandSide);
    }
    final Type childType = typer.lookupType(child);
    final Type thatHandSideType = typer.lookupType(thatHandSide);
    if (childType != null && thatHandSideType != null
        && childType.getWithoutQualifiers().equals(thatHandSideType.getWithoutQualifiers())) {
      if (isZeroFloatVecOrSquareMat(thisHandSide)) {
        addReplaceWithExpr(parent, child, thatHandSide);
      }
    }
```

### DuplicatedCode
Duplicated code
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/FuzzerServer.java`
#### Snippet
```java
    FuzzerServiceManager.Processor managerProcessor =
        new FuzzerServiceManager.Processor<FuzzerServiceManager.Iface>(fuzzerServiceManager);

    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/");

    {
      ServletHolder sh = new ServletHolder();
      sh.setServlet(new TServlet(processor, new TBinaryProtocol.Factory()));
      context.addServlet(sh, "/request");
    }
    {
      ServletHolder serveltHolderJson = new ServletHolder();
      serveltHolderJson.setServlet(new TServlet(processor, new TJSONProtocol.Factory()));
      context.addServlet(serveltHolderJson, "/requestJSON");
    }

    {
      ServletHolder shManager = new ServletHolder();
      shManager.setServlet(new TServlet(managerProcessor, new TBinaryProtocol.Factory()));
      context.addServlet(shManager, "/manageAPI");
    }
```

### DuplicatedCode
Duplicated code
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/FuzzerServer.java`
#### Snippet
```java
    final String staticDir = ToolPaths.getStaticDir();
    context.addServlet(
          new ServletHolder(
                new FileDownloadServlet(
                    (pathInfo, worker) -> Paths.get(staticDir, pathInfo).toFile(), staticDir)),
          "/static/*");

    HandlerList handlerList = new HandlerList();
    handlerList.addHandler(context);

    GzipHandler gzipHandler = new GzipHandler();
    gzipHandler.setHandler(handlerList);

    Server server = new Server(port);

    server.setHandler(gzipHandler);
    server.start();
    server.join();
```

### DuplicatedCode
Duplicated code
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
    String[] path = request.getPathInfo().split("/");
    StringBuilder shaderPath = new StringBuilder();
    shaderPath.append(path[2]);
    for (int i = 3; i < path.length; i++) {
      shaderPath.append("/").append(path[i]);
    }
```

## RuleId[id=MismatchedJavadocCode]
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

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrint.java`
#### Snippet
```java
      throws FileNotFoundException {
    try (PrintStream stream =
             new PrintStream(new FileOutputStream(new File(ns.getString("output"))))) {
      PrettyPrinterVisitor ppv = new PrettyPrinterVisitor(stream);
      ppv.visit(tu);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java
      throws FileNotFoundException {
    try (PrintStream stream =
             new PrintStream(new FileOutputStream(new File(ns.getString("output"))))) {
      PrettyPrinterVisitor ppv = new PrettyPrinterVisitor(stream);
      ppv.visit(tu);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `common/src/main/java/com/graphicsfuzz/common/util/ShaderJobFileOperations.java`
#### Snippet
```java

  private static PrintStream ps(File file) throws FileNotFoundException {
    return new PrintStream(new FileOutputStream(file));
  }

```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
  private boolean noDuplicateQualifiers(List<TypeQualifier> qualifiers) {
    Set<TypeQualifier> qualifierSet = new HashSet<>();
    qualifierSet.addAll(qualifiers);
    return qualifiers.size() == qualifierSet.size();
  }
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
        }
        final List<Stmt> result = new ArrayList<>();
        result.addAll(regionStack.get(0));

        // Check that the remainder actually contains some statements
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `ast/src/main/java/com/graphicsfuzz/common/util/TruncateLoops.java`
#### Snippet
```java
    } else {
      final List<Stmt> newStmts = new ArrayList<>();
      newStmts.addAll(limitCheckAndIncrement);
      newStmts.add(loopStmt.getBody());
      loopStmt.setBody(new BlockStmt(newStmts, loopStmt instanceof DoStmt));
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/StandardVisitor.java`
#### Snippet
```java
    visitChildFromParent(variablesDeclaration.getBaseType(), variablesDeclaration);
    List<VariableDeclInfo> children = new ArrayList<>();
    children.addAll(variablesDeclaration.getDeclInfos());
    for (VariableDeclInfo vd : children) {
      visitChildFromParent(vd, variablesDeclaration);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `ast/src/main/java/com/graphicsfuzz/common/ast/visitors/StandardVisitor.java`
#### Snippet
```java
    // visitor to potentially add or remove children of the original block statement.
    List<Stmt> children = new ArrayList<>();
    children.addAll(stmt.getStmts());
    for (Stmt child : children) {
      visitChildFromParent(child, stmt);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `common/src/main/java/com/graphicsfuzz/common/util/StripUnusedGlobals.java`
#### Snippet
```java
  private void sweep(TranslationUnit tu) {
    final List<Declaration> oldTopLevelDecls = new ArrayList<>();
    oldTopLevelDecls.addAll(tu.getTopLevelDeclarations());
    for (Declaration decl : oldTopLevelDecls) {
      if (!(decl instanceof VariablesDeclaration)) {
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java
        super.visitFunctionCallExpr(functionCallExpr);
        Set<String> acceptableFunctionNames = new HashSet<>();
        acceptableFunctionNames.addAll(TyperHelper.getBuiltins(shadingLanguageVersion,
            false,
            ShaderKind.FRAGMENT).keySet());
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateDeadCodeTransformation.java`
#### Snippet
```java
  private List<String> asSortedList(Set<String> keys) {
    final List<String> sortedKeys = new ArrayList<>();
    sortedKeys.addAll(keys);
    sortedKeys.sort(String::compareTo);
    return sortedKeys;
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/AddArrayMutationFinder.java`
#### Snippet
```java
      final List<BasicType> baseTypes = new ArrayList<>();
      // TODO: add more types if the translation unit's shading languge allows it.
      baseTypes.addAll(BasicType.allGenTypes());
      baseTypes.add(BasicType.INT);
      baseTypes.addAll(BasicType.allSquareMatrixTypes());
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
    // Call this from main to produce a list of templates
    List<IExprTemplate> templates = new ArrayList<>();
    templates.addAll(Templates.get(ShadingLanguageVersion.fromVersionString(args[0]),
        false,
        ShaderKind.fromExtension(args[1])));
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
  List<OpaqueZeroOneFactory> waysToMakeZero() {
    List<OpaqueZeroOneFactory> opaqueZeroFactories = new ArrayList<>();
    opaqueZeroFactories.addAll(waysToMakeZeroOrOne());
    opaqueZeroFactories.add(this::opaqueZeroSin);
    opaqueZeroFactories.add(this::opaqueZeroLogarithm);
```

### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
  List<OpaqueZeroOneFactory> waysToMakeOne() {
    List<OpaqueZeroOneFactory> opaqueOneFactories = new ArrayList<>();
    opaqueOneFactories.addAll(waysToMakeZeroOrOne());
    opaqueOneFactories.add(this::opaqueOneExponential);
    opaqueOneFactories.add(this::opaqueOneCosine);
```

## RuleId[id=StringBufferReplaceableByString]
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

## RuleId[id=Deprecation]
### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `ast/src/main/java/com/graphicsfuzz/common/tool/PrettyPrint.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("PrettyPrint")
        .defaultHelp(true)
        .description("Pretty print a shader.");
```

### Deprecation
'org.antlr.v4.runtime.ANTLRInputStream' is deprecated
in `ast/src/main/java/com/graphicsfuzz/common/util/ParseHelper.java`
#### Snippet
```java
        ParseTreeListener listener) throws IOException {

    ANTLRInputStream input = new ANTLRInputStream(inputStream);
    GLSLLexer lexer = new GLSLLexer(input);
    PredictionContextCache cache = new PredictionContextCache();
```

### Deprecation
'org.antlr.v4.runtime.ANTLRInputStream' is deprecated
in `ast/src/main/java/com/graphicsfuzz/common/util/ParseHelper.java`
#### Snippet
```java
        ParseTreeListener listener) throws IOException {

    ANTLRInputStream input = new ANTLRInputStream(inputStream);
    GLSLLexer lexer = new GLSLLexer(input);
    PredictionContextCache cache = new PredictionContextCache();
```

### Deprecation
'create(org.apache.commons.rng.simple.RandomSource, java.lang.Object, java.lang.Object...)' is deprecated
in `common/src/main/java/com/graphicsfuzz/common/util/RandomWrapper.java`
#### Snippet
```java
  public RandomWrapper(long seed) {
    this.seed = seed;
    this.provider = RandomSource.create(RandomSource.ISAAC, seed);
  }

```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("UpgradeShadingLanguageVersion")
        .defaultHelp(true)
        .description("Upgrade shading language version.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("FragmentShaderToShaderJob")
        .defaultHelp(true)
        .description("Turns a fragment shader into a shader job with randomized uniforms and "
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderToShaderJob.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("FragmentShaderToShaderJob")
        .defaultHelp(true)
        .description("Turns a fragment shader into a shader job with randomized uniforms and "
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/imagetools/CheckColorComponents.java`
#### Snippet
```java
  public static void main(String[] args) throws ArgumentParserException, IOException {

    final ArgumentParser parser = ArgumentParsers.newArgumentParser("CheckColorComponents")
        .defaultHelp(true)
        .description("Exits with code 0 if and only if the given image uses only the given color "
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/imagetools/ComparePsnr.java`
#### Snippet
```java
  public static void main(String[] args) throws ArgumentParserException, FileNotFoundException {

    final ArgumentParser parser = ArgumentParsers.newArgumentParser("ComparePsnr")
        .defaultHelp(true)
        .description("Print PSNR for two images.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/imagetools/CompareHistograms.java`
#### Snippet
```java
  public static void main(String[] args) throws ArgumentParserException, FileNotFoundException {

    final ArgumentParser parser = ArgumentParsers.newArgumentParser("CompareHistograms")
        .defaultHelp(true)
        .description("Print chi-squared distance between the histograms of two given images.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/common/util/FuzzyImageComparison.java`
#### Snippet
```java
    // See FuzzyImageComparisonTool for main.

    ArgumentParser parser = ArgumentParsers.newArgumentParser("FuzzyImageComparison")
        .description("Compare two images using a fuzzy pixel comparison. The exit status is "
            + MainResult.EXIT_STATUS_SIMILAR + " if the images are similar, "
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `common/src/main/java/com/graphicsfuzz/shadersets/RunShaderFamily.java`
#### Snippet
```java
      throws ShaderDispatchException, InterruptedException, IOException, ArgumentParserException {

    ArgumentParser parser = ArgumentParsers.newArgumentParser("RunShaderFamily")
        .defaultHelp(true)
        .description("Get images for all shaders in a shader family.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `server/src/main/java/com/graphicsfuzz/server/Main.java`
#### Snippet
```java
public class Main {
  public static void main(String[] args) throws Exception {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("Fuzzer server")
        .defaultHelp(true);

```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `reducer/src/main/java/com/graphicsfuzz/reducer/tool/GlslReduce.java`
#### Snippet
```java
  private static ArgumentParser getParser() {

    ArgumentParser parser = ArgumentParsers.newArgumentParser("glsl-reduce")
        .defaultHelp(true)
        .description("glsl-reduce takes a shader job `SHADER_JOB.json` "
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `generator/src/main/java/com/graphicsfuzz/generator/tool/PrepareReference.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("PrepareReference")
        .defaultHelp(true)
        .description("Prepare a reference shader job to work with GraphicsFuzz.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Fragment2Compute.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("Fragment2Compute")
        .defaultHelp(true)
        .description("Turn a fragment shader into a compute shader.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Mutate.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("Mutate")
        .defaultHelp(true)
        .description("Takes a shader, gives back a mutated shader.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GlslGenerate.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("GlslGenerate")
        .defaultHelp(true)
        .description("Generate a set of shader families.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `generator/src/main/java/com/graphicsfuzz/generator/tool/GenerateShaderFamily.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("GenerateShaderFamily")
        .defaultHelp(true)
        .description("Generate a family of equivalent shader jobs from a reference shader job.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Generate.java`
#### Snippet
```java

  private static Namespace parse(String[] args) throws ArgumentParserException {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("Generate")
        .defaultHelp(true)
        .description("Generate a shader.");
```

### Deprecation
'newArgumentParser(java.lang.String)' is deprecated
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/Main.java`
#### Snippet
```java
public class Main {
  public static void main(String[] args) throws Exception {
    ArgumentParser parser = ArgumentParsers.newArgumentParser("Fuzzer server")
        .defaultHelp(true);

```

### Deprecation
'JsonParser()' is deprecated
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
    // Check and store provided platform info JSON object.
    JsonObject info = new JsonObject();
    JsonElement pie = new JsonParser().parse(platformInfo);
    if (!pie.isJsonObject()) {
      LOGGER.error("Platform info is not valid JSON");
```

### Deprecation
'parse(java.lang.String)' is deprecated
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
    // Check and store provided platform info JSON object.
    JsonObject info = new JsonObject();
    JsonElement pie = new JsonParser().parse(platformInfo);
    if (!pie.isJsonObject()) {
      LOGGER.error("Platform info is not valid JSON");
```

## RuleId[id=UnnecessaryToStringCall]
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
          "Type" + this.toString() + " does not have columns");
    }
    if (Arrays.asList(BasicType.MAT2X2, BasicType.MAT2X3, BasicType.MAT2X4).contains(this)) {
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

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/ArrayConstructorExpr.java`
#### Snippet
```java
  @Override
  public boolean hasChild(IAstNode candidateChild) {
    return args.contains(candidateChild);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/TypeConstructorExpr.java`
#### Snippet
```java
  @Override
  public boolean hasChild(IAstNode candidateChild) {
    return args.contains(candidateChild);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/FunctionCallExpr.java`
#### Snippet
```java
  @Override
  public boolean hasChild(IAstNode candidateChild) {
    return args.contains(candidateChild);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/ast/stmt/BlockStmt.java`
#### Snippet
```java
  @Override
  public boolean hasChild(IAstNode candidateChild) {
    return stmts.contains(candidateChild);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java
    // The structure type is either a builtin, like a vector, or an actual struct

    if (BasicType.allVectorTypes().contains(structureType.getWithoutQualifiers())) {
      BasicType vecType = (BasicType) structureType.getWithoutQualifiers();
      // It is a swizzle, so lookups must be xyzw, rgba or stpq
```

### SuspiciousMethodCalls
Suspicious call to 'Map.get()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java
    if (structureType.getWithoutQualifiers() instanceof StructNameType) {
      types.put(memberLookupExpr,
          structDeclarationMap.get(structureType.getWithoutQualifiers())
              .getFieldType(memberLookupExpr.getMember()));
    }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java
    final Type arrayType = lookupType(arrayIndexExpr.getArray()).getWithoutQualifiers();
    Type elementType;
    if (BasicType.allVectorTypes().contains(arrayType)) {
      elementType = ((BasicType) arrayType).getElementType();
    } else if (BasicType.allMatrixTypes().contains(arrayType)) {
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java
    if (BasicType.allVectorTypes().contains(arrayType)) {
      elementType = ((BasicType) arrayType).getElementType();
    } else if (BasicType.allMatrixTypes().contains(arrayType)) {
      elementType = ((BasicType) arrayType).getColumnType();
    } else {
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java
    super.visitLengthExpr(lengthExpr);
    final Type receiverType = types.get(lengthExpr.getReceiver()).getWithoutQualifiers();
    assert BasicType.allVectorTypes().contains(receiverType)
        || BasicType.allMatrixTypes().contains(receiverType)
        || receiverType instanceof ArrayType;
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/Typer.java`
#### Snippet
```java
    final Type receiverType = types.get(lengthExpr.getReceiver()).getWithoutQualifiers();
    assert BasicType.allVectorTypes().contains(receiverType)
        || BasicType.allMatrixTypes().contains(receiverType)
        || receiverType instanceof ArrayType;
    types.put(lengthExpr, BasicType.INT);
```

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

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `common/src/main/java/com/graphicsfuzz/common/util/MakeArrayAccessesInBounds.java`
#### Snippet
```java
  private static boolean isArrayVectorOrMatrix(Type type) {
    return type instanceof ArrayType
          || BasicType.allMatrixTypes().contains(type)
          || BasicType.allVectorTypes().contains(type);
  }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `common/src/main/java/com/graphicsfuzz/common/util/MakeArrayAccessesInBounds.java`
#### Snippet
```java
    return type instanceof ArrayType
          || BasicType.allMatrixTypes().contains(type)
          || BasicType.allVectorTypes().contains(type);
  }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `common/src/main/java/com/graphicsfuzz/common/util/MakeArrayAccessesInBounds.java`
#### Snippet
```java
      return ((ArrayType) type).getArrayInfo().getConstantSize(0);
    }
    if (BasicType.allVectorTypes().contains(type)) {
      return ((BasicType) type).getNumElements();
    }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
    // we'll just cache them to reduce cruft.
    final List<Type> genVectors = genType().stream().filter(
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
    final List<Type> igenVectors = igenType().stream().filter(
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
    final List<Type> igenVectors = igenType().stream().filter(
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
    final List<Type> ugenVectors = ugenType().stream().filter(
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
    final List<Type> ugenVectors = ugenType().stream().filter(
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
    final List<Type> bgenVectors = bgenType().stream().filter(
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
    final List<Type> bgenVectors = bgenType().stream().filter(
        item -> !BasicType.allScalarTypes().contains(item)).collect(Collectors.toList());
    final boolean supportsUnsigned = shadingLanguageVersion.supportedUnsigned();

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
      final String name = "matrixCompMult";
      for (Type t : BasicType.allMatrixTypes()) {
        if (BasicType.allSquareMatrixTypes().contains(t)
            || shadingLanguageVersion.supportedMatrixCompMultNonSquare()) {
          addBuiltin(builtinsForVersion, name, t, t, t);
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
    final Type exprType = typer.lookupType(expr);
    if (!Arrays.asList(BasicType.MAT2X2, BasicType.MAT3X3, BasicType.MAT4X4)
        .contains(exprType)) {
      return false;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
    }
    if (!Arrays.asList(BasicType.VEC2, BasicType.VEC3, BasicType.VEC4,
        BasicType.MAT2X2, BasicType.MAT3X3, BasicType.MAT4X4).contains(typer.lookupType(expr))) {
      return false;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
    }
    if (!Arrays.asList(BasicType.VEC2, BasicType.VEC3, BasicType.VEC4)
        .contains(typer.lookupType(expr))) {
      return false;
    }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java
        }
        assert type.getWithoutQualifiers() instanceof BasicType;
        assert BasicType.allGenTypes().contains(type.getWithoutQualifiers());
        return (BasicType) type.getWithoutQualifiers();
      }
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Expr2BinaryMutationFinder.java`
#### Snippet
```java

    if (BasicType.allNumericTypesExceptNonSquareMatrices()
          .contains(type)) {
      candidates.add(BinOp.ADD);
      candidates.add(BinOp.DIV);
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/LiteralFuzzer.java`
#### Snippet
```java
    }
    if (type == BasicType.VEC2 || type == BasicType.VEC3 || type == BasicType.VEC4
        || BasicType.allMatrixTypes().contains(type)) {
      final List<Expr> args = new ArrayList<>();
      for (int i = 0; i < ((BasicType) type).getNumElements(); i++) {
```

## RuleId[id=ReassignedToPlainText]
### ReassignedToPlainText
This file was explicitly re-assigned to plain text
in `graphicsfuzz/src/main/scripts/LICENSE.TXT`
#### Snippet
```java

                                 Apache License
                           Version 2.0, January 2004
                        http://www.apache.org/licenses/

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `server/src/main/java/com/graphicsfuzz/server/webui/WebUi.java`
#### Snippet
```java
 * send back as a response.
 *
 * <p>Routes from http://example.org/webui :
 * /file/ : serve a file content from filesystem, rooted at the working dir of the server process
 * /other/thing/not/matched/by/dispatch : serve a resource file from resources/public/
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
  private final FunctionDefinition fd;
  private final ShadingLanguageVersion shadingLanguageVersion;
  private final IParentMap parentMap;
  private boolean removedAReturn;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
  private final ShadingLanguageVersion shadingLanguageVersion;
  private final IParentMap parentMap;
  private boolean removedAReturn;

  private ReturnRemover(FunctionDefinition fd, ShadingLanguageVersion shadingLanguageVersion) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `reducer/src/main/java/com/graphicsfuzz/reducer/CheckAstFeaturesFileJudge.java`
#### Snippet
```java

  private final List<Supplier<CheckAstFeatureVisitor>> visitorSuppliers;
  private final ShaderKind shaderKind;
  private final ShaderJobFileOperations fileOps;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/ValidatorErrorShaderFileJudge.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorErrorShaderFileJudge.class);

  private String errorString;

  public ValidatorErrorShaderFileJudge(String errorString) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/FuzzingFileJudge.java`
#### Snippet
```java

  private final File crashes;
  private final IShaderDispatcher imageGenerator;

  private int canonicalHash = 256;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server/src/main/java/com/graphicsfuzz/server/FuzzerServer.java`
#### Snippet
```java
  private final String workingDir;
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";

  private final ExecutorService executorService = Executors.newCachedThreadPool();
```

### FieldCanBeLocal
Field can be converted to a local variable
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/CheckValidReductionOpportunityDecorator.java`
#### Snippet
```java
  private final IReductionOpportunity delegate;
  private final ShaderJob shaderJob;
  private final ShadingLanguageVersion shadingLanguageVersion;
  private final ShaderJobFileOperations fileOps;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/CommandRunnable.java`
#### Snippet
```java
  private final String name;
  private final List<String> command;
  private final String queueName;
  private final String logFile;
  private final FuzzerServiceManager.Iface fuzzerServiceManager;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/ClasspathFileServlet.java`
#### Snippet
```java
public class ClasspathFileServlet extends HttpServlet {

  private String directory = "ogltestingstatic";

  @Override
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/FuzzerServer.java`
#### Snippet
```java

  private static final Logger LOGGER = LoggerFactory.getLogger(FuzzerServer.class);
  private final String workingDir = "";
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";
```

### FieldCanBeLocal
Field can be converted to a local variable
in `server-public/src/main/java/com/graphicsfuzz/serverpublic/FuzzerServer.java`
#### Snippet
```java
  private final String workingDir = "";
  private final String shaderSetsDir = "shaderfamilies";
  private final String processingDir = "processing";

  private final ExecutorService executorService = Executors.newCachedThreadPool();
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/ArrayType.java`
#### Snippet
```java
      return false;
    }
    if (this.arrayInfo.hasConstantSize(0)
        && !this.arrayInfo.getConstantSize(0)
        .equals(thatArrayType.arrayInfo.getConstantSize(0))) {
```

### TrivialIf
`if` statement can be simplified
in `ast/src/main/java/com/graphicsfuzz/common/typing/SupportedTypes.java`
#### Snippet
```java
      return false;
    }
    if (type.isMatrix() && !BasicType.allSquareMatrixTypes().contains(type)
        && !shadingLanguageVersion.supportedNonSquareMatrices()) {
      return false;
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/UnwrapReductionOpportunity.java`
#### Snippet
```java
      // the names declared inside the block being unwrapped, because it is only these sets of names
      // that can have been affected by applying other reduction opportunities.
      if (!Collections.disjoint(getNamesDeclaredDirectlyByBlock((BlockStmt) parentOfWrapper),
          getNamesDeclaredByStmtList(wrapees))) {
        return false;
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/CompoundExprToSubExprReductionOpportunities.java`
#### Snippet
```java
      // they enclose a use of the comma operator; e.g. we don't want to turn sin((a, b)) into
      // sin(a, b).
      if (child.getExpr()
          instanceof BinaryExpr && ((BinaryExpr) child.getExpr()).getOp() == BinOp.COMMA) {
        return false;
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/Compatibility.java`
#### Snippet
```java
    }

    if (matchesEitherDirection(first, second,
        StmtReductionOpportunity.class::equals,
        OutlinedStatementReductionOpportunity.class::equals)) {
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InlineStructifiedFieldReductionOpportunity.java`
#### Snippet
```java
  @Override
  public boolean preconditionHolds() {
    if (!outerStruct.hasField(fieldToInline)) {
      // The field has been reduced away.
      return false;
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunity.java`
#### Snippet
```java
    }

    if (replacementVariableMightShadowExistingVariable()) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LoopMergeReductionOpportunity.java`
#### Snippet
```java
      return false;
    }
    if (!(((UnaryExpr) firstLoop.getIncrement()).getExpr() instanceof VariableIdentifierExpr)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/SimplifyExprReductionOpportunity.java`
#### Snippet
```java
  @Override
  public boolean preconditionHolds() {
    if (!parent.hasChild(originalChild)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InlineInitializerReductionOpportunities.java`
#### Snippet
```java
      return false;
    }
    if (Constants.isLiveInjectedVariableName(variableDeclInfo.getName())) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveSwizzleReductionOpportunity.java`
#### Snippet
```java
    }
    final BasicType basicType = (BasicType) structureType;
    if (!BasicType.allVectorTypes().contains(basicType)
        && !BasicType.allScalarTypes().contains(basicType)) {
      return false;
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveSwizzleReductionOpportunity.java`
#### Snippet
```java
    }
    final int largestSwizzleComponent = getLargestSwizzleComponent(parent);
    if (largestSwizzleComponent >= newChildBasicType.getNumElements()) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunities.java`
#### Snippet
```java
    // We deal separately with removal of declarations
    if (stmt instanceof DeclarationStmt) {
      if (isEmptyAndUnreferencedDeclaration((DeclarationStmt) stmt)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/ShortenSwizzleReductionOpportunity.java`
#### Snippet
```java
      return false;
    }
    if (RemoveSwizzleReductionOpportunity.getLargestSwizzleComponent(parentSwizzle)
        >= newChildLength) {
      return false;
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunity.java`
#### Snippet
```java
    }

    if (removalCouldLeadToLackOfReturnFromNonVoidFunction(translationUnit, enclosingFunction,
        blockStmt,
        childOfBlockStmt)) {
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunity.java`
#### Snippet
```java
      return false;
    }
    if (functionEndsWithReturn(enclosingFunction) && !isLastStatementInFunction(enclosingFunction,
        childOfBlockStmt)) {
      return false;
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/IdentityMutationReductionOpportunity.java`
#### Snippet
```java
  @Override
  public boolean preconditionHolds() {
    if (!parent.hasChild(childToReduce)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/SimplifyExprReductionOpportunities.java`
#### Snippet
```java
    }

    if (inLiveInjectedStmtOrDeclaration && !inLoopLimiterVariableDeclInfo
        && !loopLimiterImpactChecker.referencesNonRedundantLoopLimiter(child, getCurrentScope())) {
      // We can simplify expressions in live code, so long as they do not reference
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
    //     reduce in this scenario.  If other transformations have manipulated the vector
    //     then they need to be reversed first.
    if (vectorIsUsedWithoutFieldLookup()) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunity.java`
#### Snippet
```java
      return false;
    }
    if (!isVariable(binaryExpr.getRhs(), rhsName)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/templates/VariableIdentifierExprTemplate.java`
#### Snippet
```java
      return false;
    }
    if (type.hasQualifier(TypeQualifier.UNIFORM)) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/util/RestrictFragmentShaderColors.java`
#### Snippet
```java
      return false;
    }
    if (!type.hasQualifier(TypeQualifier.SHADER_OUTPUT)) {
      // It does not have the "out" qualifier, so cannot be the output variable.
      return false;
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddSwitchMutation.java`
#### Snippet
```java
    }

    if (nextStmt instanceof LoopStmt
        && isBlockWithoutTopLevelBreaks(((LoopStmt) nextStmt).getBody())) {
      return true;
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/DonateCodeTransformation.java`
#### Snippet
```java
    if (shadingLanguageVersion.isWebGl()) {
      // TODO: revisit in case this was just a WebGL 1 restriction; maybe it is OK in WebGL 2
      if (donationContext.indexesArrayUsingFreeVariable()) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/IdentityMutationFinder.java`
#### Snippet
```java
        return true;
      }
      if (atGlobalScope()) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/SplitForLoopMutation.java`
#### Snippet
```java
    }
    if (variableBeforeLiteral) {
      if (!operatorsIfVariableBeforeLiteral.contains(comparison)) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/SplitForLoopMutation.java`
#### Snippet
```java
      }
    } else {
      if (!operatorsIfVariableAfterLiteral.contains(comparison)) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddWrappingConditionalMutation.java`
#### Snippet
```java
      return false;
    }
    if (containsTopLevelBreakOrContinue(injectionPoint.getNextStmt())) {
      return false;
    }
```

### TrivialIf
`if` statement can be simplified
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/VectorizeMutationFinder.java`
#### Snippet
```java
      return false;
    }
    if (basicType.isBoolean()) {
      return false;
    }
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
in `ast/src/main/java/com/graphicsfuzz/common/typing/Scope.java`
#### Snippet
```java

  private void checkNameTypeAndParam(String name, Type type,
        Optional<ParameterDecl> parameterDecl) {
    if (type == null) {
      throw new RuntimeException("Attempt to register a variable '" + name + "' with null type");
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

  public static void emitShader(TranslationUnit shader,
                                Optional<String> license,
                                PrintStream stream,
                                int indentationWidth,
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
in `common/src/main/java/com/graphicsfuzz/common/transformreduce/GlslShaderJob.java`
#### Snippet
```java
  }

  public GlslShaderJob(Optional<String> license,
                       PipelineInfo pipelineInfo,
                       TranslationUnit... shaders) {
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
  private final List<TranslationUnit> shaders;

  public GlslShaderJob(Optional<String> license,
                       PipelineInfo pipelineInfo,
                       List<TranslationUnit> shaders) {
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
  private boolean isInterestingNoCache(ShaderJob state,
                                boolean requiresUniformBindings,
                                Optional<String> pushConstant,
                                boolean addGlobalLoopLimiters,
                                boolean makeArrayAccessesInBounds,
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
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StructifiedVariableInfo.java`
#### Snippet
```java
  private final Optional<Initializer> initializer;

  StructifiedVariableInfo(String name, Type type, Optional<Initializer> initializer) {
    this.name = name;
    this.type = type;
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ServerSocket' used without 'try'-with-resources statement
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
  private static void runServer(int port) throws IOException {
    LOGGER.info("Listening on port: " + port);
    final ServerSocket serverSocket = new ServerSocket(port);
    final Socket socket = serverSocket.accept();
    final InputStream inputStream = socket.getInputStream();
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `getReducerContext().getRandom().nextInt(...)` to `double` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/glslreducers/RandomizedReductionPass.java`
#### Snippet
```java
    final int maximum = options.size();
    final int index =
          (maximum - 1) - (int) Math.sqrt(Math.pow((double) getReducerContext()
                .getRandom().nextInt(maximum), 2.0));
    assert index >= 0;
```

### RedundantCast
Casting `expr` to `IntConstantExpr` is redundant
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/UnswitchifyReductionOpportunity.java`
#### Snippet
```java
  private boolean isZero(Expr expr) {
    return expr instanceof IntConstantExpr
        && ((IntConstantExpr) expr).getText().equals("0");
  }

```

### RedundantCast
Casting `outputShader.length()` to `long` is redundant
in `generator/src/main/java/com/graphicsfuzz/generator/tool/CustomMutatorServer.java`
#### Snippet
```java
      final ByteBuffer lengthByteBuffer = ByteBuffer.allocate(Long.BYTES);
      lengthByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      lengthByteBuffer.putLong((long) outputShader.length());
      final byte[] length = new byte[Long.BYTES];
      lengthByteBuffer.position(0);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `text` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/PrecisionDeclaration.java`
#### Snippet
```java
public class PrecisionDeclaration extends Declaration {

  private String text;

  public PrecisionDeclaration(String text) {
```

### FieldMayBeFinal
Field `prototype` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/FunctionDefinition.java`
#### Snippet
```java
public class FunctionDefinition extends Declaration {

  private FunctionPrototype prototype;
  private BlockStmt body;

```

### FieldMayBeFinal
Field `body` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/FunctionDefinition.java`
#### Snippet
```java

  private FunctionPrototype prototype;
  private BlockStmt body;

  public FunctionDefinition(FunctionPrototype prototype, BlockStmt body) {
```

### FieldMayBeFinal
Field `arrayInfo` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/VariableDeclInfo.java`
#### Snippet
```java

  private String name;
  private ArrayInfo arrayInfo;
  private Initializer initializer;

```

### FieldMayBeFinal
Field `layoutQualifierSequence` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/DefaultLayout.java`
#### Snippet
```java
public class DefaultLayout extends Declaration {

  private LayoutQualifierSequence layoutQualifierSequence;
  private TypeQualifier typeQualifier;

```

### FieldMayBeFinal
Field `typeQualifier` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/DefaultLayout.java`
#### Snippet
```java

  private LayoutQualifierSequence layoutQualifierSequence;
  private TypeQualifier typeQualifier;

  public DefaultLayout(LayoutQualifierSequence layoutQualifierSequence,
```

### FieldMayBeFinal
Field `arrayInfo` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/ParameterDecl.java`
#### Snippet
```java
  private String name;
  private Type type;
  private ArrayInfo arrayInfo;

  public ParameterDecl(String name, Type type, ArrayInfo arrayInfo) {
```

### FieldMayBeFinal
Field `childToParent` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/ParentMap.java`
#### Snippet
```java
class ParentMap extends StandardVisitor implements IParentMap {

  private Map<IAstNode, IAstNode> childToParent;

  ParentMap(IAstNode root) {
```

### FieldMayBeFinal
Field `declInfos` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/VariablesDeclaration.java`
#### Snippet
```java

  private Type baseType;
  private List<VariableDeclInfo> declInfos;

  public VariablesDeclaration(Type baseType,
```

### FieldMayBeFinal
Field `parameters` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/FunctionPrototype.java`
#### Snippet
```java
  private String name;
  private Type returnType;
  private List<ParameterDecl> parameters;

  public FunctionPrototype(String name, Type returnType, List<ParameterDecl> parameters) {
```

### FieldMayBeFinal
Field `returnType` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/FunctionPrototype.java`
#### Snippet
```java

  private String name;
  private Type returnType;
  private List<ParameterDecl> parameters;

```

### FieldMayBeFinal
Field `op` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/UnaryExpr.java`
#### Snippet
```java

  private Expr expr;
  private UnOp op;

  public UnaryExpr(Expr expr, UnOp op) {
```

### FieldMayBeFinal
Field `sizeExprs` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/ArrayInfo.java`
#### Snippet
```java
   * Original size expression per dimension before folding, for pretty printing.
   */
  private List<Optional<Expr>> sizeExprs;

  /**
```

### FieldMayBeFinal
Field `constantSizes` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/ArrayInfo.java`
#### Snippet
```java
   * Size per dimension, set after folding.
   */
  private List<Optional<Integer>> constantSizes;
  /**
   * Original size expression per dimension before folding, for pretty printing.
```

### FieldMayBeFinal
Field `value` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/UIntConstantExpr.java`
#### Snippet
```java
public class UIntConstantExpr extends ConstantExpr {

  private String value;

  public UIntConstantExpr(String text) {
```

### FieldMayBeFinal
Field `op` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/BinaryExpr.java`
#### Snippet
```java
  private Expr lhs;
  private Expr rhs;
  private BinOp op;

  /**
```

### FieldMayBeFinal
Field `value` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/FloatConstantExpr.java`
#### Snippet
```java
public class FloatConstantExpr extends ConstantExpr {

  private String value;

  public FloatConstantExpr(String text) {
```

### FieldMayBeFinal
Field `args` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/TypeConstructorExpr.java`
#### Snippet
```java

  private String type;
  private List<Expr> args;

  /**
```

### FieldMayBeFinal
Field `variablesDeclaration` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/stmt/DeclarationStmt.java`
#### Snippet
```java
public class DeclarationStmt extends Stmt {

  private VariablesDeclaration variablesDeclaration;

  public DeclarationStmt(VariablesDeclaration variablesDeclaration) {
```

### FieldMayBeFinal
Field `args` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/expr/FunctionCallExpr.java`
#### Snippet
```java

  private String callee;
  private List<Expr> args;

  public FunctionCallExpr(String callee, List<Expr> args) {
```

### FieldMayBeFinal
Field `baseType` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/ArrayType.java`
#### Snippet
```java
public class ArrayType extends UnqualifiedType {

  private Type baseType;
  private ArrayInfo arrayInfo;

```

### FieldMayBeFinal
Field `arrayInfo` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/ArrayType.java`
#### Snippet
```java

  private Type baseType;
  private ArrayInfo arrayInfo;

  public ArrayType(Type baseType, ArrayInfo arrayInfo) {
```

### FieldMayBeFinal
Field `structNameType` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/StructDefinitionType.java`
#### Snippet
```java
public class StructDefinitionType extends UnqualifiedType {

  private Optional<StructNameType> structNameType;
  private final List<String> fieldNames;
  private final List<Type> fieldTypes;
```

### FieldMayBeFinal
Field `qualifiers` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java

  private Type targetType;
  private List<TypeQualifier> qualifiers;

  public QualifiedType(Type targetType, List<TypeQualifier> qualifiers) {
```

### FieldMayBeFinal
Field `removedAReturn` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
  private final ShadingLanguageVersion shadingLanguageVersion;
  private final IParentMap parentMap;
  private boolean removedAReturn;

  private ReturnRemover(FunctionDefinition fd, ShadingLanguageVersion shadingLanguageVersion) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/typing/DuplicateVariableException.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  private String name;

  DuplicateVariableException(String name) {
```

### FieldMayBeFinal
Field `substitution` may be 'final'
in `common/src/main/java/com/graphicsfuzz/common/util/ApplySubstitution.java`
#### Snippet
```java
public class ApplySubstitution extends ScopeTrackingVisitor {

  private Map<String, String> substitution;

  public ApplySubstitution(Map<String, String> substitution, IAstNode node) {
```

### FieldMayBeFinal
Field `idPool` may be 'final'
in `common/src/main/java/com/graphicsfuzz/common/util/Obfuscator.java`
#### Snippet
```java

  private static final int POOL_INITIAL_SIZE = 1000;
  private List<Integer> idPool;
  private int maxIdUsed;
  private final IRandom generator;
```

### FieldMayBeFinal
Field `renameUserDefined` may be 'final'
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java

  // Flag whether to rename user defined variables and functions.
  private boolean renameUserDefined;

  /*
```

### FieldMayBeFinal
Field `globalVariableInitializers` may be 'final'
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java
   *   foo = vec2(1.0, 0.0);
   */
  private List<Stmt> globalVariableInitializers = new ArrayList<>();

  // Variable name renaming map. Maps original names with new names.
```

### FieldMayBeFinal
Field `variableRename` may be 'final'
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java

  // Variable name renaming map. Maps original names with new names.
  private Map<String, String> variableRename = new HashMap<>();

  // Function name renaming map. Maps original names with new names.
```

### FieldMayBeFinal
Field `functionRename` may be 'final'
in `common/src/main/java/com/graphicsfuzz/common/util/UpgradeShadingLanguageVersion.java`
#### Snippet
```java

  // Function name renaming map. Maps original names with new names.
  private Map<String, String> functionRename = new HashMap<>();

  /**
```

### FieldMayBeFinal
Field `callGraphEdges` may be 'final'
in `common/src/main/java/com/graphicsfuzz/common/util/StripUnusedFunctions.java`
#### Snippet
```java

  private Optional<FunctionDefinition> enclosingFunction;
  private Map<String, Set<String>> callGraphEdges;

  private StripUnusedFunctions() {
```

### FieldMayBeFinal
Field `builtins` may be 'final'
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
  // builtin names to builtin function prototypes.
  private static ConcurrentMap<ShadingLanguageVersionAndKind, Map<String,
      List<FunctionPrototype>>> builtins =
      new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `callsIndirectly` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/CheckAstFeatureVisitor.java`
#### Snippet
```java

  private Optional<FunctionDefinition> triggerFunction = Optional.empty();
  private Map<String, Set<String>> callsIndirectly = new HashMap<String, Set<String>>();

  @Override
```

### FieldMayBeFinal
Field `errorString` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/ValidatorErrorShaderFileJudge.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(ValidatorErrorShaderFileJudge.class);

  private String errorString;

  public ValidatorErrorShaderFileJudge(String errorString) {
```

### FieldMayBeFinal
Field `canonicalHash` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/FuzzingFileJudge.java`
#### Snippet
```java
  private final IShaderDispatcher imageGenerator;

  private int canonicalHash = 256;

  public FuzzingFileJudge(File corpus, IShaderDispatcher imageGenerator) {
```

### FieldMayBeFinal
Field `imageGenerator` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/ImageGenErrorShaderFileJudge.java`
#### Snippet
```java

  private String errorString;
  private IShaderDispatcher imageGenerator;
  private final boolean skipRender;
  private final boolean throwExceptionOnValidationError;
```

### FieldMayBeFinal
Field `errorString` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/ImageGenErrorShaderFileJudge.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(ImageGenErrorShaderFileJudge.class);

  private String errorString;
  private IShaderDispatcher imageGenerator;
  private final boolean skipRender;
```

### FieldMayBeFinal
Field `imageGenerator` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/filejudge/ImageShaderFileJudge.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(ImageShaderFileJudge.class);

  private IShaderDispatcher imageGenerator;
  private final boolean throwExceptionOnValidationError;
  private final ShaderJobFileOperations fileOps;
```

### FieldMayBeFinal
Field `opportunities` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/OutlinedStatementReductionOpportunities.java`
#### Snippet
```java
  private final TranslationUnit tu;

  private List<OutlinedStatementReductionOpportunity> opportunities;

  private OutlinedStatementReductionOpportunities(TranslationUnit tu) {
```

### FieldMayBeFinal
Field `tu` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FunctionReductionOpportunity.java`
#### Snippet
```java
class FunctionReductionOpportunity extends AbstractReductionOpportunity {

  private TranslationUnit tu;
  private Declaration functionDefinitionOrPrototype;

```

### FieldMayBeFinal
Field `functionDefinitionOrPrototype` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FunctionReductionOpportunity.java`
#### Snippet
```java

  private TranslationUnit tu;
  private Declaration functionDefinitionOrPrototype;

  // This tracks the number of nodes that will be removed by applying the opportunity at its
```

### FieldMayBeFinal
Field `switchStmts` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InjectionTracker.java`
#### Snippet
```java
  // the stack entry indicates where traversal of the switch statement's case labels is in relation
  // to the original code that the switch statement wraps.
  private Deque<Optional<SwitchTraversalStatus>> switchStmts;

  InjectionTracker() {
```

### FieldMayBeFinal
Field `functionsToUnusedParameters` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveUnusedParameterReductionOpportunities.java`
#### Snippet
```java
   * Maps each function definition to the set of parameters that it does not reference.
   */
  private Map<FunctionDefinition, List<ParameterDecl>> functionsToUnusedParameters;

  /**
```

### FieldMayBeFinal
Field `parent` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/IdentityMutationReductionOpportunity.java`
#### Snippet
```java
public final class IdentityMutationReductionOpportunity extends AbstractReductionOpportunity {

  private IAstNode parent;
  private Expr childToReduce;
  private OpaqueFunctionType function;
```

### FieldMayBeFinal
Field `childToReduce` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/IdentityMutationReductionOpportunity.java`
#### Snippet
```java

  private IAstNode parent;
  private Expr childToReduce;
  private OpaqueFunctionType function;

```

### FieldMayBeFinal
Field `function` may be 'final'
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/IdentityMutationReductionOpportunity.java`
#### Snippet
```java
  private IAstNode parent;
  private Expr childToReduce;
  private OpaqueFunctionType function;

  IdentityMutationReductionOpportunity(IAstNode parent, Expr childToReduce,
```

### FieldMayBeFinal
Field `parentMap` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Fragment2Compute.java`
#### Snippet
```java
    new ScopeTrackingVisitor() {

      private IParentMap parentMap = IParentMap.createParentMap(computeTu);

      @Override
```

### FieldMayBeFinal
Field `parentMap` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Fragment2Compute.java`
#### Snippet
```java
    new StandardVisitor() {

      private IParentMap parentMap = IParentMap.createParentMap(computeTu);

      @Override
```

### FieldMayBeFinal
Field `enclosingLoops` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/FuzzingContext.java`
#### Snippet
```java
  private Scope currentScope;

  private int enclosingLoops;

  private FunctionPrototype enclosingFunction = null;
```

### FieldMayBeFinal
Field `probSwitchify` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/util/TransformationProbabilities.java`
#### Snippet
```java
  private int probAddLiveFragColorWrites; // Probability of adding a live write to gl_FragColor
  private int probAddDeadFragColorWrites; // Probability of outlining a dead write to gl_FragColor
  private int probSwitchify; // Probability of applying switchification
  private int probInjectDeadBarrierAtStmt; // Probability of adding a dead barrier at a statement
  // in a compute shader
```

### FieldMayBeFinal
Field `probInjectDeadBarrierAtStmt` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/util/TransformationProbabilities.java`
#### Snippet
```java
  private int probAddDeadFragColorWrites; // Probability of outlining a dead write to gl_FragColor
  private int probSwitchify; // Probability of applying switchification
  private int probInjectDeadBarrierAtStmt; // Probability of adding a dead barrier at a statement
  // in a compute shader

```

### FieldMayBeFinal
Field `names` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/donation/DonationContext.java`
#### Snippet
```java
    return new StandardVisitor() {

      private Set<String> names = new HashSet<>();

      @Override
```

### FieldMayBeFinal
Field `blockStmt` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/injection/BlockInjectionPoint.java`
#### Snippet
```java
public class BlockInjectionPoint extends InjectionPoint {

  private BlockStmt blockStmt;
  private Stmt nextStmt; // null if there is no next statement

```

### FieldMayBeFinal
Field `nextStmt` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/injection/BlockInjectionPoint.java`
#### Snippet
```java

  private BlockStmt blockStmt;
  private Stmt nextStmt; // null if there is no next statement

  public BlockInjectionPoint(BlockStmt blockStmt, Stmt nextStmt,
```

### FieldMayBeFinal
Field `loopStmt` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/injection/LoopInjectionPoint.java`
#### Snippet
```java
public class LoopInjectionPoint extends InjectionPoint {

  private LoopStmt loopStmt;

  public LoopInjectionPoint(LoopStmt loopStmt, FunctionDefinition enclosingFunction,
```

### FieldMayBeFinal
Field `ifStmt` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/injection/IfInjectionPoint.java`
#### Snippet
```java
public class IfInjectionPoint extends InjectionPoint {

  private IfStmt ifStmt;
  private boolean chooseThen;

```

### FieldMayBeFinal
Field `chooseThen` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/transformation/injection/IfInjectionPoint.java`
#### Snippet
```java

  private IfStmt ifStmt;
  private boolean chooseThen;

  public IfInjectionPoint(IfStmt ifStmt, boolean chooseThen, FunctionDefinition enclosingFunction,
```

### FieldMayBeFinal
Field `fuzzingContext` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Fuzzer.java`
#### Snippet
```java
  private final IRandom generator;
  private int nextId;
  private FuzzingContext fuzzingContext;

  private final GenerationParams generationParams;
```

### FieldMayBeFinal
Field `referencedVars` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/OutlineStatementMutation.java`
#### Snippet
```java
    return new StandardVisitor() {

      private List<String> referencedVars = new ArrayList<String>();

      @Override
```

### FieldMayBeFinal
Field `names` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/IdentityMutationFinder.java`
#### Snippet
```java
      forLoopIterators.addLast(
            new StandardVisitor() {
              private Set<String> names = new HashSet<>();

              Set<String> getIteratorVariableNames(ForStmt forStmt) {
```

### FieldMayBeFinal
Field `templates` may be 'final'
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/Templates.java`
#### Snippet
```java
public class Templates {

  private static ConcurrentMap<ShadingLanguageVersionAndKind, List<IExprTemplate>> templates
        = new ConcurrentHashMap<>();

```

### FieldMayBeFinal
Field `completer` may be 'final'
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/SingleJob.java`
#### Snippet
```java
  public final Job job;
  private Job skipJob;
  private ISingleJobCompleter completer;

  private final AtomicLong skipJobIdCounter;
```

### FieldMayBeFinal
Field `directory` may be 'final'
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/ClasspathFileServlet.java`
#### Snippet
```java
public class ClasspathFileServlet extends HttpServlet {

  private String directory = "ogltestingstatic";

  @Override
```

### FieldMayBeFinal
Field `service` may be 'final'
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceManagerImpl.java`
#### Snippet
```java
  private static final Logger LOGGER = LoggerFactory.getLogger(FuzzerServiceManagerImpl.class);

  private FuzzerServiceImpl service;

  private final AtomicLong jobIdCounter;
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

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/ast/decl/VariablesDeclaration.java`
#### Snippet
```java

  public VariablesDeclaration(Type baseType, VariableDeclInfo declInfo) {
    this(baseType, Arrays.asList(declInfo));
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/ast/inliner/ReturnRemover.java`
#### Snippet
```java
                      new IfStmt(
                        makeHasReturned(),
                        new BlockStmt(Arrays.asList(new BreakStmt()), true),
                        null),
                      forStmt.getBody()),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/util/TruncateLoops.java`
#### Snippet
```java
                  new IntConstantExpr(String.valueOf(limit)),
                  BinOp.GE),
            new BlockStmt(Arrays.asList(new BreakStmt()), true),
            null),
          new ExprStmt(new UnaryExpr(
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/util/AddBraces.java`
#### Snippet
```java

      private Stmt makeBlock(Stmt stmt) {
        return new BlockStmt(Arrays.asList(stmt), true);
      }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/com/graphicsfuzz/common/util/GloballyTruncateLoops.java`
#### Snippet
```java
        // Add loop bound variable.
        tu.addDeclarationBefore(new VariablesDeclaration(new QualifiedType(BasicType.INT,
                Arrays.asList(TypeQualifier.CONST)), new VariableDeclInfo(loopBoundName, null,
                new Initializer(new IntConstantExpr(new Integer(loopLimit).toString())))),
            firstNonPrecisionDeclaration);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
        }
        // the first parameter of interpolateAtOffset has same type as return type, so use it
        if (Arrays.asList("interpolateAtOffset").contains(functionCallExpr.getCallee())) {
          assert functionCallExpr.getNumChildren() == 2;
          final Expr childExpr = functionCallExpr.getChild(0);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderJobToVertexShaderJob.java`
#### Snippet
```java
        new FunctionDefinition(
            new FunctionPrototype("main", VoidType.VOID, Collections.emptyList()),
            new BlockStmt(Arrays.asList(
                new ExprStmt(new BinaryExpr(
                    new VariableIdentifierExpr(Constants.GLF_COLOR),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `common/src/main/java/com/graphicsfuzz/common/util/FragmentShaderToShaderJob.java`
#### Snippet
```java
                new FunctionDefinition(
                    new FunctionPrototype("main", VoidType.VOID, Collections.emptyList()),
                    new BlockStmt(Arrays.asList(
                        new ExprStmt(new BinaryExpr(
                        new VariableIdentifierExpr(OpenGlConstants.GL_POSITION),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        for (Type t : ugenType()) {
          addBuiltin(builtinsForVersion, name, t, t, t, new QualifiedType(t,
              Arrays.asList(TypeQualifier.OUT_PARAM)));
        }
      }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        for (Type t : ugenType()) {
          addBuiltin(builtinsForVersion, name, t, t, t, new QualifiedType(t,
              Arrays.asList(TypeQualifier.OUT_PARAM)));
        }
      }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        for (Type t : ugenType()) {
          addBuiltin(builtinsForVersion, name, VoidType.VOID, t, t,
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)),
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)));
        }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
          addBuiltin(builtinsForVersion, name, VoidType.VOID, t, t,
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)),
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)));
        }
      }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        for (Type t : igenType()) {
          addBuiltin(builtinsForVersion, name, VoidType.VOID, t, t,
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)),
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)));
        }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
          addBuiltin(builtinsForVersion, name, VoidType.VOID, t, t,
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)),
              new QualifiedType(t, Arrays.asList(TypeQualifier.OUT_PARAM)));
        }
      }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        for (Type t : genType()) {
          addBuiltin(builtinsForVersion, name, t, t, new QualifiedType(t,
              Arrays.asList(TypeQualifier.OUT_PARAM)));
        }
      }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
        final String name = "frexp";
        addBuiltin(builtinsForVersion, name, BasicType.FLOAT, BasicType.FLOAT,
            new QualifiedType(BasicType.INT, Arrays.asList(TypeQualifier.OUT_PARAM)));
        addBuiltin(builtinsForVersion, name, BasicType.VEC2, BasicType.VEC2,
            new QualifiedType(BasicType.IVEC2, Arrays.asList(TypeQualifier.OUT_PARAM)));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
            new QualifiedType(BasicType.INT, Arrays.asList(TypeQualifier.OUT_PARAM)));
        addBuiltin(builtinsForVersion, name, BasicType.VEC2, BasicType.VEC2,
            new QualifiedType(BasicType.IVEC2, Arrays.asList(TypeQualifier.OUT_PARAM)));
        addBuiltin(builtinsForVersion, name, BasicType.VEC3, BasicType.VEC3,
            new QualifiedType(BasicType.IVEC3, Arrays.asList(TypeQualifier.OUT_PARAM)));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
            new QualifiedType(BasicType.IVEC2, Arrays.asList(TypeQualifier.OUT_PARAM)));
        addBuiltin(builtinsForVersion, name, BasicType.VEC3, BasicType.VEC3,
            new QualifiedType(BasicType.IVEC3, Arrays.asList(TypeQualifier.OUT_PARAM)));
        addBuiltin(builtinsForVersion, name, BasicType.VEC4, BasicType.VEC4,
            new QualifiedType(BasicType.IVEC4, Arrays.asList(TypeQualifier.OUT_PARAM)));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `ast/src/main/java/com/graphicsfuzz/common/typing/TyperHelper.java`
#### Snippet
```java
            new QualifiedType(BasicType.IVEC3, Arrays.asList(TypeQualifier.OUT_PARAM)));
        addBuiltin(builtinsForVersion, name, BasicType.VEC4, BasicType.VEC4,
            new QualifiedType(BasicType.IVEC4, Arrays.asList(TypeQualifier.OUT_PARAM)));
      }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LoopMergeReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InlineFunctionReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/UnwrapReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/UnwrapReductionOpportunity.java`
#### Snippet
```java
  public UnwrapReductionOpportunity(Stmt wrapper, Stmt wrapee, IParentMap parentMap,
        VisitationDepth depth) {
    this(wrapper, Arrays.asList(wrapee), parentMap, depth);
    assert wrapee != null;
  }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/GlobalVariablesDeclarationReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/CompoundExprToSubExprReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiveOutputVariableWriteReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunity.java`
#### Snippet
```java
          .map(item -> item.getVariablesDeclaration())
          .map(item -> item.getDeclInfos())
          .reduce(Arrays.asList(), ListConcat::concatenate)
          .stream()
          .anyMatch(item -> item.getName().equals(findOriginalVariableInfo().getName()));
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveStructFieldReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/LiteralToUniformReductionOpportunity.java`
#### Snippet
```java
        arrayInfo, null);
    final VariablesDeclaration arrayDecl = new VariablesDeclaration(
        new QualifiedType(basicType, Arrays.asList(TypeQualifier.UNIFORM)), variableDeclInfo
    );

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/ExprToConstantReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/GlobalPrecisionDeclarationReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/IdentityMutationReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InlineUniformReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context, shaderJob.getPipelineInfo()))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/GlobalVariableDeclToExprReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FunctionReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InlineInitializerReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/StmtReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VariableDeclReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/DestructifyReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(DestructifyReductionOpportunities::findOpportunitiesForShader)
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/UnswitchifyReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/RemoveUnusedParameterReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/InlineStructifiedFieldReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VariableDeclToExprReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FlattenControlFlowReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java

  private static boolean isZeroInt(Expr expr) {
    return isIntValue(expr, Arrays.asList("0"));
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/FoldConstantReductionOpportunities.java`
#### Snippet
```java
        .stream()
        .map(item -> findOpportunitiesForShader(item, context))
        .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` to create an empty List
in `reducer/src/main/java/com/graphicsfuzz/reducer/reductionopportunities/VectorizationReductionOpportunity.java`
#### Snippet
```java
          .map(item -> item.getVariablesDeclaration())
          .map(item -> item.getDeclInfos())
          .reduce(Arrays.asList(), ListConcat::concatenate);
  }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Compound2BodyMutationFinder.java`
#### Snippet
```java
    super.visitForStmt(forStmt);
    final BlockStmt replacement = new BlockStmt(
          Arrays.asList(forStmt.getInit()), true);
    for (Stmt stmt :
          forStmt.getBody() instanceof BlockStmt
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Compound2BodyMutationFinder.java`
#### Snippet
```java
          forStmt.getBody() instanceof BlockStmt
                ? ((BlockStmt) forStmt.getBody()).getStmts()
                : Arrays.asList(forStmt.getBody())) {
      replacement.addStmt(stmt);
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/ReplaceBlockStmtsWithSwitchMutationFinder.java`
#### Snippet
```java
        new BlockStmt(switchBodyStmts, false));

    addMutation(new ReplaceBlockStmtsMutation(block, new ArrayList<>(Arrays.asList(replacement))));

    super.visitBlockStmt(block);
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddDeadOutputWriteMutation.java`
#### Snippet
```java

    return AddJumpMutation.makeDeadConditional(injectionPoint,
        new BlockStmt(Arrays.asList(
            new ExprStmt(new BinaryExpr(
                new VariableIdentifierExpr(outputVariableName),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/semanticschanging/Expr2ArrayAccessMutationFinder.java`
#### Snippet
```java
    Expr index = expr;
    if (unqualifiedType == BasicType.FLOAT) {
      index = new TypeConstructorExpr("int", Arrays.asList(expr));
    }
    ArrayIndexExpr arrayIndexExpr = new ArrayIndexExpr(new VariableIdentifierExpr(arrayName),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java

    private IdentityAndTrue() {
      super(Arrays.asList(BasicType.BOOL), false);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java

    private IdentityLogicalNotNot() {
      super(Arrays.asList(BasicType.BOOL), false);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
      case 2:
        modifiableArgs = isUpperTriangular
            ? Arrays.asList(1)                       // mat2, upper triangular
            : Arrays.asList(2);                      // mat2, lower triangular
        break;
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java
        modifiableArgs = isUpperTriangular
            ? Arrays.asList(1)                       // mat2, upper triangular
            : Arrays.asList(2);                      // mat2, lower triangular
        break;
      case 3:
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/fuzzer/OpaqueExpressionGenerator.java`
#### Snippet
```java

    private IdentityOrFalse() {
      super(Arrays.asList(BasicType.BOOL), false);
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddLiveOutputWriteMutation.java`
#### Snippet
```java
            BasicType.BOOL, false, 0, fuzzer), true),
        new BlockStmt(
            Arrays.asList(new ExprStmt(new BinaryExpr(
                new VariableIdentifierExpr(outputVariableName),
                new VariableIdentifierExpr(backupName), BinOp.ASSIGN))),
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `generator/src/main/java/com/graphicsfuzz/generator/semanticspreserving/AddWrappingConditionalMutation.java`
#### Snippet
```java
    if (injectionPoint instanceof IfInjectionPoint) {
      // Avoid replacing the body of an if with an if, due to dangling else problem
      wrapped = new BlockStmt(Arrays.asList(wrapped), false);
    }
    injectionPoint.replaceNext(wrapped);
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `ast/src/main/java/com/graphicsfuzz/common/ast/type/QualifiedType.java`
#### Snippet
```java
    String result = "";
    for (TypeQualifier q : getQualifiers()) {
      result += q + " ";
    }
    result += targetType;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `ast/src/main/java/com/graphicsfuzz/common/glslversion/ShadingLanguageVersion.java`
#### Snippet
```java
    String version = components[1];
    for (int i = 2; i < components.length; i++) {
      version += " " + components[i];
    }
    if (isWebGlHint(lines[1])) {
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `generator/src/main/java/com/graphicsfuzz/generator/util/TransformationProbabilities.java`
#### Snippet
```java
      try {
        value = field.get(this);
        result += field.getName() + ": " + value.toString() + "\n";
      } catch (IllegalAccessException exception) {
        result += exception.getMessage();
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `generator/src/main/java/com/graphicsfuzz/generator/util/TransformationProbabilities.java`
#### Snippet
```java
        result += field.getName() + ": " + value.toString() + "\n";
      } catch (IllegalAccessException exception) {
        result += exception.getMessage();
      }
    }
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Generate.java`
#### Snippet
```java
          .apply(reference, probabilities,
              generator, generationParams);
      result += transformation.getName() + "\n";
    }
    return result;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `generator/src/main/java/com/graphicsfuzz/generator/tool/Generate.java`
#### Snippet
```java
      if ((transformations.isEmpty() && numTransformationsApplied == 0)
          || decideToApplyTransformation(generator, numTransformationsApplied)) {
        result += transformation.getName() + "\n";
        transformation.apply(reference, probabilities,
            generator.spawnChild(),
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
    return getFunctionDefinitions().filter(TranslationUnit::isMain)
        .findAny()
        .get();
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
  public ShadingLanguageVersion getShadingLanguageVersion() {
    if (hasShadingLanguageVersion()) {
      return shadingLanguageVersion.get();
    }
    return ShadingLanguageVersion.ESSL_100;
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

  public VariableDeclInfo getVariableDeclInfo() {
    return variableDeclInfo.get();
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
  private boolean adaptExistingWrites() {

    final Typer typer = new Typer(shaderJob.getFragmentShader().get());

    return new ScopeTrackingVisitor() {
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
  private void addNewWrites() {
    for (IInjectionPoint injectionPoint : new InjectionPoints(
        shaderJob.getFragmentShader().get(), generator, item -> true)
        .getInjectionPoints(item -> item.nextFloat() < probabilityOfAddingNewWrite)) {
      final Scope scope = injectionPoint.scopeAtInjectionPoint();
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
in `fuzzerserver/src/main/java/com/graphicsfuzz/server/FuzzerServiceImpl.java`
#### Snippet
```java
          }
          StringBuilder logmsg = new StringBuilder();
          logmsg.append("getJob(): worker '" + worker
              + "' gets job " + res.getJobId());
          if (res.isSetSkipJob()) {
```

