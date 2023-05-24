# NullAway 
 
# Bad smells
I found 147 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocReference | 22 | false |
| FieldMayBeFinal | 15 | false |
| DataFlowIssue | 10 | false |
| UnnecessaryToStringCall | 10 | true |
| NullableProblems | 9 | false |
| TrivialIf | 8 | false |
| IOStreamConstructor | 7 | false |
| UnnecessaryLocalVariable | 5 | true |
| ConstantValue | 5 | false |
| OptionalIsPresent | 4 | false |
| StringOperationCanBeSimplified | 4 | false |
| DuplicatedCode | 4 | false |
| DuplicateBranchesInSwitch | 3 | false |
| OptionalUsedAsFieldOrParameterType | 3 | false |
| OptionalAssignedToNull | 3 | false |
| RedundantCast | 3 | false |
| UnnecessaryModifier | 2 | true |
| CStyleArrayDeclaration | 2 | false |
| RegExpRedundantEscape | 2 | false |
| DuplicateExpressions | 2 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| IgnoreResultOfCall | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| SimplifyOptionalCallChains | 2 | false |
| UnnecessaryContinue | 2 | false |
| StringConcatenationInLoops | 2 | false |
| StringConcatenationInsideStringBufferAppend | 2 | false |
| SimplifyStreamApiCallChains | 1 | false |
| RedundantTypeArguments | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| FieldCanBeLocal | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| AutoCloseableResource | 1 | false |
| ConditionCoveredByFurtherCondition | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| RegExpUnnecessaryNonCapturingGroup | 1 | false |
| PointlessBooleanExpression | 1 | true |
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

## RuleId[id=UnnecessaryModifier]
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

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `Symbol.MethodSymbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/LibraryModels.java`
#### Snippet
```java
   *
   * <p>The formatting of a method signature should match the result of calling {@link
   * Symbol.MethodSymbol#toString()} on the corresponding symbol. See {@link
   * com.uber.nullaway.handlers.LibraryModelsHandler.DefaultLibraryModels} for examples. Basic
   * principles:
```

### JavadocReference
Symbol `com.uber.nullaway.handlers.LibraryModelsHandler.DefaultLibraryModels` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/LibraryModels.java`
#### Snippet
```java
   * <p>The formatting of a method signature should match the result of calling {@link
   * Symbol.MethodSymbol#toString()} on the corresponding symbol. See {@link
   * com.uber.nullaway.handlers.LibraryModelsHandler.DefaultLibraryModels} for examples. Basic
   * principles:
   *
```

### JavadocReference
Symbol `com.uber.nullaway.handlers.LibraryModelsHandler.OptimizedLibraryModels` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/LibraryModels.java`
#### Snippet
```java
    /**
     * we store the method name separately to enable fast comparison with MethodSymbols. See {@link
     * com.uber.nullaway.handlers.LibraryModelsHandler.OptimizedLibraryModels}
     */
    public final String methodName;
```

### JavadocReference
Symbol `Symbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/Serializer.java`
#### Snippet
```java

  /**
   * Serializes the given {@link Symbol} to a string.
   *
   * @param symbol The symbol to serialize.
```

### JavadocReference
Symbol `Symbol.MethodSymbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/Nullness.java`
#### Snippet
```java
   *
   * <p>NOTE: this method does not work for checking all annotations of parameters of methods from
   * class files. For that case, use {@link #paramHasNullableAnnotation(Symbol.MethodSymbol, int,
   * Config)}
   */
```

### JavadocReference
Symbol `Symbol.MethodSymbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/Nullness.java`
#### Snippet
```java
   *
   * <p>NOTE: this method does not work for checking all annotations of parameters of methods from
   * class files. For that case, use {@link #paramHasNullableAnnotation(Symbol.MethodSymbol, int,
   * Config)}
   */
```

### JavadocReference
Symbol `Context` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java

  /**
   * like {@link #resultBeforeExpr(TreePath, Context, ForwardTransferFunction)} but for an arbitrary
   * Tree in a method. A bit riskier to use since we don't check that there is a corresponding CFG
   * node to the Tree; use with care.
```

### JavadocReference
Symbol `Symbol.MethodSymbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/NullabilityUtil.java`
#### Snippet
```java
  /**
   * NOTE: this method does not work for getting all annotations of parameters of methods from class
   * files. For that case, use {@link #getAllAnnotationsForParameter(Symbol.MethodSymbol, int)}
   *
   * @param symbol the symbol
```

### JavadocReference
Symbol `Symbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/handlers/Handler.java`
#### Snippet
```java
   *
   * @param node The AST node for the field access.
   * @param symbol The {@link Symbol} object for the above node, provided for convenience.
   * @param types {@link Types} for the current compilation
   * @param context the javac Context object (or Error Prone SubContext)
```

### JavadocReference
Symbol `Types` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/handlers/Handler.java`
#### Snippet
```java
   * @param node The AST node for the field access.
   * @param symbol The {@link Symbol} object for the above node, provided for convenience.
   * @param types {@link Types} for the current compilation
   * @param context the javac Context object (or Error Prone SubContext)
   * @param apContext the current access path context information (see {@link
```

### JavadocReference
Symbol `org.jspecify.annotations.NullMarked` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
    /**
     * class has a mix of annotatedness, depending on presence of {@link
     * org.jspecify.annotations.NullMarked} annotations
     */
    PARTIALLY_MARKED
```

### JavadocReference
Cannot resolve symbol `NullnessAnalysis`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessAnalysis.java`
#### Snippet
```java
 * API to our nullness dataflow analysis for access paths.
 *
 * <p>Based on code from Error Prone; see {@link NullnessAnalysis}
 */
public final class AccessPathNullnessAnalysis {
```

### JavadocReference
Symbol `com.google.errorprone.dataflow.nullnesspropagation.AbstractNullnessPropagationTransfer` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
 *
 * <p>Based on code originally from Error Prone (see {@link
 * com.google.errorprone.dataflow.nullnesspropagation.AbstractNullnessPropagationTransfer} and
 * {@link com.google.errorprone.dataflow.nullnesspropagation.NullnessPropagationTransfer})
 */
```

### JavadocReference
Symbol `com.google.errorprone.dataflow.nullnesspropagation.NullnessPropagationTransfer` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPathNullnessPropagation.java`
#### Snippet
```java
 * <p>Based on code originally from Error Prone (see {@link
 * com.google.errorprone.dataflow.nullnesspropagation.AbstractNullnessPropagationTransfer} and
 * {@link com.google.errorprone.dataflow.nullnesspropagation.NullnessPropagationTransfer})
 */
public class AccessPathNullnessPropagation
```

### JavadocReference
Symbol `com.uber.nullaway.handlers.CompositeHandler` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/dataflow/cfg/NullAwayCFGBuilder.java`
#### Snippet
```java
     * @param env annotation processing environment containing type utilities
     * @param handler a NullAway handler or chain of handlers (through {@link
     *     com.uber.nullaway.handlers.CompositeHandler}
     */
    public NullAwayCFGTranslationPhaseOne(
```

### JavadocReference
Symbol `com.uber.nullaway.handlers.CompositeHandler` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/dataflow/cfg/NullAwayCFGBuilder.java`
#### Snippet
```java
   * @param env annotation processing environment containing type utilities
   * @param handler a NullAway handler or chain of handlers (through {@link
   *     com.uber.nullaway.handlers.CompositeHandler}
   * @return a control flow graph
   */
```

### JavadocReference
Symbol `com.sun.tools.javac.code.Symbol.MethodSymbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
  /**
   * A view of library models optimized to make lookup of {@link
   * com.sun.tools.javac.code.Symbol.MethodSymbol}s fast
   */
  private static class OptimizedLibraryModels {
```

### JavadocReference
Symbol `Name` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
    /**
     * Mapping from {@link MethodRef} to some state, where lookups first check for a matching method
     * name as an optimization. The {@link Name} data structure is used to avoid unnecessary String
     * conversions when looking up {@link com.sun.tools.javac.code.Symbol.MethodSymbol}s.
     *
```

### JavadocReference
Symbol `com.sun.tools.javac.code.Symbol.MethodSymbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
     * Mapping from {@link MethodRef} to some state, where lookups first check for a matching method
     * name as an optimization. The {@link Name} data structure is used to avoid unnecessary String
     * conversions when looking up {@link com.sun.tools.javac.code.Symbol.MethodSymbol}s.
     *
     * @param <T> the type of the associated state.
```

### JavadocReference
Cannot resolve symbol `com.google.errorprone.dataflow.LocalStore`
in `nullaway/src/main/java/com/uber/nullaway/dataflow/NullnessStore.java`
#### Snippet
```java

/**
 * Highly based on {@link com.google.errorprone.dataflow.LocalStore}, but for {@link AccessPath}s.
 */
public class NullnessStore implements Store<NullnessStore> {
```

### JavadocReference
Symbol `Symbol.MethodSymbol` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/adapters/SerializationAdapter.java`
#### Snippet
```java

  /**
   * Serializes the signature of the given {@link Symbol.MethodSymbol} to a string.
   *
   * @param methodSymbol The method symbol to serialize.
```

### JavadocReference
Symbol `Context` is inaccessible from here
in `nullaway/src/main/java/com/uber/nullaway/handlers/OptionalEmptinessHandler.java`
#### Snippet
```java
   * in dataflow analysis to track whether the Optional content is present.
   *
   * <p>Instances of this type should be accessed using {@link #instance(Context)}, not instantiated
   * directly.
   */
```

## RuleId[id=DataFlowIssue]
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
Argument `ASTHelpers.getSymbol(leaf)` might be null
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
      return ASTHelpers.getSymbol((ClassTree) parent);
    } else {
      return castToNonNull(ASTHelpers.enclosingClass(ASTHelpers.getSymbol(leaf)));
    }
  }
```

### DataFlowIssue
Argument `this.member` might be null
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/out/ClassAndMemberInfo.java`
#### Snippet
```java
    }
    this.member = symbol;
    this.clazz = ASTHelpers.enclosingClass(this.member);
  }

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

## RuleId[id=CStyleArrayDeclaration]
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

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/StubxWriter.java`
#### Snippet
```java
    int packageAnnotationSize = 0;
    for (Map.Entry<String, Set<String>> entry : packageAnnotations.entrySet()) {
      packageAnnotationSize += entry.getValue().size();
    }
    out.writeInt(packageAnnotationSize);
    // Followed by those records as pairs of ints pointing into the dictionary
    for (Map.Entry<String, Set<String>> entry : packageAnnotations.entrySet()) {
      for (String annot : entry.getValue()) {
        out.writeInt(encodingDictionary.get(entry.getKey()));
        out.writeInt(encodingDictionary.get(importedAnnotations.get(annot)));
      }
    }
```

### DuplicatedCode
Duplicated code
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
        Type actualParameter = getTreeType(actualParams.get(i));
        if (formalParameter instanceof Type.ClassType
            && actualParameter instanceof Type.ClassType) {
          if (!compareNullabilityAnnotations(
              (Type.ClassType) formalParameter, (Type.ClassType) actualParameter)) {
            reportInvalidParametersNullabilityError(
                formalParameter, actualParameter, actualParams.get(i), state, analysis);
          }
        }
```

### DuplicatedCode
Duplicated code
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
      ImmutableSetMultimap.Builder<MethodRef, Integer> failIfNullParametersBuilder =
          new ImmutableSetMultimap.Builder<>();
      ImmutableSetMultimap.Builder<MethodRef, Integer> explicitlyNullableParametersBuilder =
          new ImmutableSetMultimap.Builder<>();
      ImmutableSetMultimap.Builder<MethodRef, Integer> nonNullParametersBuilder =
          new ImmutableSetMultimap.Builder<>();
```

### DuplicatedCode
Duplicated code
in `nullaway/src/main/java/com/uber/nullaway/handlers/MethodNameUtil.java`
#### Snippet
```java
    isNotNull = table.fromString(IS_NOT_NULL_METHOD);
    isOwnerTruthSubject = table.fromString(IS_OWNER_TRUTH_SUBJECT);
    isOwnerAssertJAbstractAssert = table.fromString(IS_OWNER_ASSERTJ_ABSTRACT_ASSERT);

    isInstanceOf = table.fromString(IS_INSTANCE_OF_METHOD);
    isInstanceOfAny = table.fromString(IS_INSTANCE_OF_ANY_METHOD);

    isTrue = table.fromString(IS_TRUE_METHOD);
    isFalse = table.fromString(IS_FALSE_METHOD);
    isTrueOwnerTruth = table.fromString(IS_TRUE_OWNER_TRUTH);
    isTrueOwnerAssertJ = table.fromString(IS_TRUE_OWNER_ASSERTJ);

    isBooleanValueOfMethod = table.fromString(BOOLEAN_VALUE_OF_METHOD);
    isBooleanValueOfOwner = table.fromString(BOOLEAN_VALUE_OF_OWNER);

    assertThat = table.fromString(ASSERT_THAT_METHOD);
    assertThatOwnerTruth = table.fromString(ASSERT_THAT_OWNER_TRUTH);
    assertThatOwnerAssertJ = table.fromString(ASSERT_THAT_OWNER_ASSERTJ);

    isPresent = table.fromString(IS_PRESENT_METHOD);
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    Preconditions.checkArgument(
        outPath.endsWith(ASTUBX_JAR_SUFFIX), "invalid model file path! " + outPath);
    ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(outPath));
    if (!nonnullParams.isEmpty()) {
      ZipEntry entry = new ZipEntry(DEFAULT_ASTUBX_LOCATION);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    InputStream jarIS = null;
    if (libPath.endsWith(".jar")) {
      jarIS = new FileInputStream(libPath);
    } else if (libPath.endsWith(".aar")) {
      ZipFile aar = new ZipFile(libPath);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
      new File(outPath).getParentFile().mkdirs();
      if (outPath.endsWith(".astubx")) {
        writeModel(new DataOutputStream(new FileOutputStream(outPath)));
      } else {
        writeModelJAR(outPath);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    if (inPath.endsWith(".jar")) {
      JarFile jar = new JarFile(inPath);
      JarOutputStream jarOS = new JarOutputStream(new FileOutputStream(outFile));
      BytecodeAnnotator.annotateBytecodeInJar(
          jar, jarOS, nonnullParams, nullableReturns, stripJarSignatures, DEBUG);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    } else if (inPath.endsWith(".aar")) {
      ZipFile zip = new ZipFile(inPath);
      ZipOutputStream zipOS = new ZipOutputStream(new FileOutputStream(outFile));
      BytecodeAnnotator.annotateBytecodeInAar(
          zip, zipOS, nonnullParams, nullableReturns, stripJarSignatures, DEBUG);
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
      zipOS.close();
    } else {
      InputStream is = new FileInputStream(inPath);
      OutputStream os = new FileOutputStream(outFile);
      BytecodeAnnotator.annotateBytecodeInClass(is, os, nonnullParams, nullableReturns, DEBUG);
```

### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    } else {
      InputStream is = new FileInputStream(inPath);
      OutputStream os = new FileOutputStream(outFile);
      BytecodeAnnotator.annotateBytecodeInClass(is, os, nonnullParams, nullableReturns, DEBUG);
      os.close();
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `nullaway/src/main/java/com/uber/nullaway/handlers/CompositeHandler.java`
#### Snippet
```java
  @Override
  public ImmutableSet<String> onRegisterImmutableTypes() {
    ImmutableSet.Builder<String> builder = ImmutableSet.<String>builder();
    for (Handler h : handlers) {
      builder.addAll(h.onRegisterImmutableTypes());
```

## RuleId[id=NullableProblems]
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
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
              new CacheLoader<AnalysisParams, Analysis<?, ?, ?>>() {
                @Override
                public Analysis<?, ?, ?> load(AnalysisParams key) {
                  final ControlFlowGraph cfg = key.cfg();
                  final ForwardTransferFunction<?, ?> transfer = key.transferFunction();
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
              new CacheLoader<AnalysisParams, Analysis<?, ?, ?>>() {
                @Override
                public Analysis<?, ?, ?> load(AnalysisParams key) {
                  final ControlFlowGraph cfg = key.cfg();
                  final ForwardTransferFunction<?, ?> transfer = key.transferFunction();
```

### NullableProblems
Not annotated method overrides method annotated with @ElementTypesAreNonnullByDefault
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
              new CacheLoader<CfgParams, ControlFlowGraph>() {
                @Override
                public ControlFlowGraph load(CfgParams key) {
                  final TreePath codePath = key.codePath();
                  final TreePath bodyPath;
```

### NullableProblems
Not annotated parameter overrides @ElementTypesAreNonnullByDefault parameter
in `nullaway/src/main/java/com/uber/nullaway/dataflow/DataFlow.java`
#### Snippet
```java
              new CacheLoader<CfgParams, ControlFlowGraph>() {
                @Override
                public ControlFlowGraph load(CfgParams key) {
                  final TreePath codePath = key.codePath();
                  final TreePath bodyPath;
```

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
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `nullaway/src/main/java/com/uber/nullaway/fixserialization/out/ClassAndMemberInfo.java`
#### Snippet
```java
  @Nullable private Symbol.ClassSymbol clazz;

  public ClassAndMemberInfo(TreePath path) {
    Preconditions.checkNotNull(path);
    this.path = path;
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `nullaway/src/main/java/com/uber/nullaway/ErrorProneCLIFlagsConfig.java`
#### Snippet
```java
/**
 * provides nullability configuration based on additional flags passed to ErrorProne via
 * "-XepOpt:[Namespace:]FlagName[=Value]". See. http://errorprone.info/docs/flags
 */
final class ErrorProneCLIFlagsConfig extends AbstractConfig {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParams.java`
#### Snippet
```java
public class DefinitelyDerefedParams {
  private static final boolean DEBUG = false;
  private boolean USE_EXTENDED_APPROACH = true;

  private static void LOG(boolean cond, String tag, String msg) {
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

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/CodeAnnotationInfo.java`
#### Snippet
```java
      }
      ImmutableSet<String> generatedCodeAnnotations = config.getGeneratedCodeAnnotations();
      if (classSymbol.getAnnotationMirrors().stream()
          .map(anno -> anno.getAnnotationType().toString())
          .anyMatch(generatedCodeAnnotations::contains)) {
```

### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/CodeAnnotationInfo.java`
#### Snippet
```java
      return false;
    }
    if (config.fromExplicitlyUnannotatedPackage(className)
        || (enclosingPackage != null
            && ASTHelpers.hasDirectAnnotationWithSimpleName(
```

### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
      return true;
    }
    if (expr.getKind() == Tree.Kind.METHOD_INVOCATION
        && exprSymbol instanceof Symbol.MethodSymbol
        && isReturnAnnotatedNullable((Symbol.MethodSymbol) exprSymbol)) {
```

### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
    if (statements.size() > 0) {
      StatementTree statementTree = statements.get(0);
      if (isThisCall(statementTree, state)) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/NullAway.java`
#### Snippet
```java
                this, state, methodSymbol, arguments, null);
      }
      if (castToNonNullArg != null && leaf.equals(arguments.get(castToNonNullArg))) {
        return true;
      }
```

### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/handlers/LibraryModelsHandler.java`
#### Snippet
```java
      return true;
    }
    if (!optLibraryModels.nullImpliesNullParameters(methodSymbol).isEmpty()) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/handlers/RestrictiveAnnotationHandler.java`
#### Snippet
```java
    }
    Tree.Kind exprKind = expr.getKind();
    if (exprSymbol != null
        && (exprKind == Tree.Kind.METHOD_INVOCATION || exprKind == Tree.Kind.IDENTIFIER)
        && isSymbolRestrictivelyNullable(exprSymbol, state.context)) {
```

### TrivialIf
`if` statement can be simplified
in `nullaway/src/main/java/com/uber/nullaway/handlers/OptionalEmptinessHandler.java`
#### Snippet
```java
      return true;
    }
    if (expr.getKind() == Tree.Kind.METHOD_INVOCATION
        && exprSymbol instanceof Symbol.MethodSymbol
        && optionalIsGetCall((Symbol.MethodSymbol) exprSymbol, state.getTypes())) {
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
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

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'tbaseType'
in `nullaway/src/main/java/com/uber/nullaway/handlers/ApacheThriftIsSetHandler.java`
#### Snippet
```java
  private static final Supplier<Type> TBASE_TYPE_SUPPLIER = Suppliers.typeFromString(TBASE_NAME);

  @Nullable private Optional<Type> tbaseType;

  @Override
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

## RuleId[id=OptionalAssignedToNull]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'ZipFile' used without 'try'-with-resources statement
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
      jarIS = new FileInputStream(libPath);
    } else if (libPath.endsWith(".aar")) {
      ZipFile aar = new ZipFile(libPath);
      ZipEntry jarEntry = aar.getEntry("classes.jar");
      jarIS = (jarEntry == null ? null : aar.getInputStream(jarEntry));
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

## RuleId[id=RedundantCast]
### RedundantCast
Casting `symbol` to `Symbol.ClassSymbol` is redundant
in `nullaway/src/main/java/com/uber/nullaway/ErrorBuilder.java`
#### Snippet
```java
    if (symbol instanceof Symbol.ClassSymbol) {
      ImmutableSet<String> excludedClassAnnotations = config.getExcludedClassAnnotations();
      return ((Symbol.ClassSymbol) symbol)
          .getAnnotationMirrors().stream()
              .map(anno -> anno.getAnnotationType().toString())
```

### RedundantCast
Casting `null` to `Void` is redundant
in `nullaway/src/main/java/com/uber/nullaway/dataflow/cfg/NullAwayCFGBuilder.java`
#### Snippet
```java
      Label preconditionEntry = new Label();
      Label endPrecondition = new Label();
      this.scan(booleanExpressionTree, (Void) null);
      ConditionalJump cjump =
          new ConditionalJump(
```

### RedundantCast
Casting `iterVar.getElement()` to `VariableElement` is redundant
in `nullaway/src/main/java/com/uber/nullaway/dataflow/AccessPath.java`
#### Snippet
```java
      Node mapNode, LocalVariableNode iterVar, AccessPathContext apContext) {
    IteratorContentsKey iterContentsKey =
        new IteratorContentsKey((VariableElement) iterVar.getElement());
    return buildAccessPathRecursive(mapNode, new ArrayDeque<>(), apContext, iterContentsKey);
  }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `USE_EXTENDED_APPROACH` may be 'final'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParams.java`
#### Snippet
```java
public class DefinitelyDerefedParams {
  private static final boolean DEBUG = false;
  private boolean USE_EXTENDED_APPROACH = true;

  private static void LOG(boolean cond, String tag, String msg) {
```

### FieldMayBeFinal
Field `compiler` may be 'final'
in `jmh/src/main/java/com/uber/nullaway/jmh/NullawayJavac.java`
#### Snippet
```java
  //////////////////////
  private List<JavaFileObject> compilationUnits;
  private JavaCompiler compiler;
  @Nullable private DiagnosticListener<JavaFileObject> diagnosticListener;
  private StandardJavaFileManager fileManager;
```

### FieldMayBeFinal
Field `options` may be 'final'
in `jmh/src/main/java/com/uber/nullaway/jmh/NullawayJavac.java`
#### Snippet
```java
  @Nullable private DiagnosticListener<JavaFileObject> diagnosticListener;
  private StandardJavaFileManager fileManager;
  private List<String> options;

  /**
```

### FieldMayBeFinal
Field `diagnosticListener` may be 'final'
in `jmh/src/main/java/com/uber/nullaway/jmh/NullawayJavac.java`
#### Snippet
```java
  private List<JavaFileObject> compilationUnits;
  private JavaCompiler compiler;
  @Nullable private DiagnosticListener<JavaFileObject> diagnosticListener;
  private StandardJavaFileManager fileManager;
  private List<String> options;
```

### FieldMayBeFinal
Field `fileManager` may be 'final'
in `jmh/src/main/java/com/uber/nullaway/jmh/NullawayJavac.java`
#### Snippet
```java
  private JavaCompiler compiler;
  @Nullable private DiagnosticListener<JavaFileObject> diagnosticListener;
  private StandardJavaFileManager fileManager;
  private List<String> options;

```

### FieldMayBeFinal
Field `compilationUnits` may be 'final'
in `jmh/src/main/java/com/uber/nullaway/jmh/NullawayJavac.java`
#### Snippet
```java
  // state required to run javac via the standard APIs
  //////////////////////
  private List<JavaFileObject> compilationUnits;
  private JavaCompiler compiler;
  @Nullable private DiagnosticListener<JavaFileObject> diagnosticListener;
```

### FieldMayBeFinal
Field `analysis` may be 'final'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
  private VisitorState state;
  private Config config;
  private NullAway analysis;

  public GenericsChecks(VisitorState state, Config config, NullAway analysis) {
```

### FieldMayBeFinal
Field `state` may be 'final'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
  private static final Supplier<Type> NULLABLE_TYPE_SUPPLIER =
      Suppliers.typeFromString(NULLABLE_NAME);
  private VisitorState state;
  private Config config;
  private NullAway analysis;
```

### FieldMayBeFinal
Field `config` may be 'final'
in `nullaway/src/main/java/com/uber/nullaway/GenericsChecks.java`
#### Snippet
```java
      Suppliers.typeFromString(NULLABLE_NAME);
  private VisitorState state;
  private Config config;
  private NullAway analysis;

```

### FieldMayBeFinal
Field `VERBOSE` may be 'final'
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
public class InferredJARModelsHandler extends BaseNoOpHandler {
  private static boolean DEBUG = false;
  private static boolean VERBOSE = false;

  private static void LOG(boolean cond, String tag, String msg) {
```

### FieldMayBeFinal
Field `DEBUG` may be 'final'
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
/** This handler loads inferred nullability model from stubs for methods in unannotated packages. */
public class InferredJARModelsHandler extends BaseNoOpHandler {
  private static boolean DEBUG = false;
  private static boolean VERBOSE = false;

```

### FieldMayBeFinal
Field `foo` may be 'final'
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Foo.java`
#### Snippet
```java

public class Foo {
  private String foo;

  public Foo(String str) {
```

### FieldMayBeFinal
Field `nonnullParams` may be 'final'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
  private long analyzedBytes = 0;
  private long analysisStartTime = 0;
  private MethodParamAnnotations nonnullParams = new MethodParamAnnotations();
  private MethodReturnAnnotations nullableReturns = new MethodReturnAnnotations();

```

### FieldMayBeFinal
Field `nullableReturns` may be 'final'
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
  private long analysisStartTime = 0;
  private MethodParamAnnotations nonnullParams = new MethodParamAnnotations();
  private MethodReturnAnnotations nullableReturns = new MethodReturnAnnotations();

  private boolean annotateBytecode = false;
```

### FieldMayBeFinal
Field `bar` may be 'final'
in `jar-infer/test-java-lib-jarinfer/src/main/java/com/uber/nullaway/jarinfer/toys/unannotated/Bar.java`
#### Snippet
```java

public class Bar {
  private String bar;
  public int b;

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

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `nullaway/src/main/java/com/uber/nullaway/handlers/InferredJARModelsHandler.java`
#### Snippet
```java
    if (!method.getParameters().isEmpty()) {
      for (Symbol.VarSymbol var : method.getParameters()) {
        methodSign += getSimpleTypeName(var.type) + ", ";
      }
      methodSign = methodSign.substring(0, methodSign.lastIndexOf(','));
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `jar-infer/jar-infer-lib/src/main/java/com/uber/nullaway/jarinfer/DefinitelyDerefedParamsDriver.java`
#### Snippet
```java
    int argi = mtd.isStatic() ? 0 : 1; // Skip 'this' parameter
    for (; argi < mtd.getNumberOfParameters(); argi++) {
      strArgTypes += getSimpleTypeName(mtd.getParameterType(argi));
      if (argi < mtd.getNumberOfParameters() - 1) {
        strArgTypes += ", ";
```

## RuleId[id=ConstantValue]
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

## RuleId[id=StringConcatenationInsideStringBufferAppend]
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

