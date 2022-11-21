# closure-templates 
 
# Bad smells
I found 2031 bad smells with 99 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 409 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 194 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 184 | false |
| RuleId[ruleID=DataFlowIssue] | 183 | false |
| RuleId[ruleID=NullableProblems] | 121 | false |
| RuleId[ruleID=ReturnNull] | 95 | false |
| RuleId[ruleID=OptionalUsedAsFieldOrParameterType] | 70 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 65 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 45 | false |
| RuleId[ruleID=UnstableApiUsage] | 44 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 43 | false |
| RuleId[ruleID=SystemOutErr] | 42 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 40 | false |
| RuleId[ruleID=UnnecessaryModifier] | 39 | true |
| RuleId[ruleID=UnnecessarySemicolon] | 32 | false |
| RuleId[ruleID=OptionalGetWithoutIsPresent] | 31 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 21 | true |
| RuleId[ruleID=UnusedAssignment] | 20 | false |
| RuleId[ruleID=ConstantValue] | 19 | false |
| RuleId[ruleID=FinalStaticMethod] | 18 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 16 | false |
| RuleId[ruleID=RedundantImplements] | 14 | false |
| RuleId[ruleID=OptionalIsPresent] | 14 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 14 | true |
| RuleId[ruleID=FinalPrivateMethod] | 13 | false |
| RuleId[ruleID=NestedAssignment] | 13 | false |
| RuleId[ruleID=Convert2MethodRef] | 12 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 11 | true |
| RuleId[ruleID=UnnecessaryStringEscape] | 10 | false |
| RuleId[ruleID=EmptyMethod] | 10 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 10 | false |
| RuleId[ruleID=UnnecessaryReturn] | 9 | true |
| RuleId[ruleID=OptionalContainsCollection] | 9 | false |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 8 | false |
| RuleId[ruleID=StaticPseudoFunctionalStyleMethod] | 7 | false |
| RuleId[ruleID=DefaultAnnotationParam] | 7 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 7 | false |
| RuleId[ruleID=StaticInitializerReferencesSubClass] | 6 | false |
| RuleId[ruleID=RegExpRedundantEscape] | 6 | false |
| RuleId[ruleID=DuplicateBranchesInSwitch] | 6 | false |
| RuleId[ruleID=RegExpSimplifiable] | 6 | false |
| RuleId[ruleID=EmptyStatementBody] | 5 | false |
| RuleId[ruleID=RefusedBequest] | 5 | false |
| RuleId[ruleID=StringBufferReplaceableByString] | 5 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 5 | false |
| RuleId[ruleID=UnnecessaryUnboxing] | 4 | false |
| RuleId[ruleID=RegExpRepeatedSpace] | 4 | false |
| RuleId[ruleID=IgnoreResultOfCall] | 3 | false |
| RuleId[ruleID=RedundantMethodOverride] | 3 | false |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 3 | false |
| RuleId[ruleID=AbstractMethodCallInConstructor] | 3 | false |
| RuleId[ruleID=ProtectedMemberInFinalClass] | 3 | true |
| RuleId[ruleID=RegExpUnexpectedAnchor] | 3 | false |
| RuleId[ruleID=RedundantSuppression] | 3 | false |
| RuleId[ruleID=Anonymous2MethodRef] | 3 | false |
| RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup] | 3 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 2 | false |
| RuleId[ruleID=AnonymousHasLambdaAlternative] | 2 | false |
| RuleId[ruleID=IfStatementWithIdenticalBranches] | 2 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 2 | false |
| RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment] | 2 | false |
| RuleId[ruleID=CodeBlock2Expr] | 2 | false |
| RuleId[ruleID=EqualsAndHashcode] | 2 | false |
| RuleId[ruleID=SynchronizeOnThis] | 2 | false |
| RuleId[ruleID=NonFinalFieldOfException] | 2 | false |
| RuleId[ruleID=StringConcatenationInsideStringBufferAppend] | 2 | false |
| RuleId[ruleID=SwitchStatementWithConfusingDeclaration] | 2 | false |
| RuleId[ruleID=ThrowablePrintStackTrace] | 2 | false |
| RuleId[ruleID=RegExpSingleCharAlternation] | 2 | false |
| RuleId[ruleID=UnnecessaryContinue] | 2 | false |
| RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument] | 1 | true |
| RuleId[ruleID=WrapperTypeMayBePrimitive] | 1 | false |
| RuleId[ruleID=StringEquality] | 1 | false |
| RuleId[ruleID=JavaLangInvokeHandleSignature] | 1 | false |
| RuleId[ruleID=CommentedOutCode] | 1 | false |
| RuleId[ruleID=ManualArrayCopy] | 1 | false |
| RuleId[ruleID=UnnecessaryQualifierForThis] | 1 | false |
| RuleId[ruleID=IfStatementMissingBreakInLoop] | 1 | false |
| RuleId[ruleID=InstanceofIncompatibleInterface] | 1 | false |
| RuleId[ruleID=WhileLoopSpinsOnField] | 1 | false |
| RuleId[ruleID=IntegerMultiplicationImplicitCastToLong] | 1 | false |
| RuleId[ruleID=RegExpDuplicateCharacterInClass] | 1 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 1 | false |
| RuleId[ruleID=DoubleBraceInitialization] | 1 | false |
| RuleId[ruleID=Java8MapForEach] | 1 | false |
| RuleId[ruleID=FieldMayBeStatic] | 1 | false |
| RuleId[ruleID=JavaReflectionMemberAccess] | 1 | false |
| RuleId[ruleID=NonSerializableFieldInSerializableClass] | 1 | false |
| RuleId[ruleID=InnerClassMayBeStatic] | 1 | true |
| RuleId[ruleID=PrimitiveArrayArgumentToVariableArgMethod] | 1 | false |
| RuleId[ruleID=AssignmentToLambdaParameter] | 1 | false |
| RuleId[ruleID=CopyConstructorMissesField] | 1 | false |
| RuleId[ruleID=EqualsWhichDoesntCheckParameterClass] | 1 | false |
## RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
### RuleId[ruleID=ToArrayCallWithZeroLengthArrayArgument]
Call to `toArray()` with pre-sized array argument 'new String\[builder.interfaces.size()\]'
in `java/src/com/google/template/soy/jbcsrc/internal/SoyClassWriter.java`
#### Snippet
```java
        null /* not generic */,
        builder.baseClass.internalName(),
        builder.interfaces.toArray(new String[builder.interfaces.size()]));
    if (builder.fileName != null) {
      super.visitSource(
```

## RuleId[ruleID=WrapperTypeMayBePrimitive]
### RuleId[ruleID=WrapperTypeMayBePrimitive]
Type may be primitive
in `java/src/com/google/template/soy/i18ndirectives/I18NDirectivesRuntime.java`
#### Snippet
```java
    }
    if (number instanceof Number) {
      Double val;
      if (number instanceof Double) {
        val = (Double) number;
```

## RuleId[ruleID=StringEquality]
### RuleId[ruleID=StringEquality]
String values are compared using `==`, not 'equals()'
in `java/src/com/google/template/soy/data/SanitizedContents.java`
#### Snippet
```java
    // Extra runtime check in case the compile-time check doesn't work.
    Preconditions.checkArgument(
        constant.intern() == constant,
        "The provided argument does not look like a compile-time constant.");
    return SanitizedContent.create(constant, kind, dir);
```

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/PluginLoader.java`
#### Snippet
```java
public interface PluginLoader extends Closeable {
  /** The default implementation just loads directly from a single classloader. */
  public static final class Default implements PluginLoader {
    private final ClassLoader classLoader;
    private final boolean closeable;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `java/src/com/google/template/soy/PluginLoader.java`
#### Snippet
```java
public interface PluginLoader extends Closeable {
  /** The default implementation just loads directly from a single classloader. */
  public static final class Default implements PluginLoader {
    private final ClassLoader classLoader;
    private final boolean closeable;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/base/internal/IdGenerator.java`
#### Snippet
```java
   * @return A clone of this id generator.
   */
  public IdGenerator copy();
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/base/internal/IdGenerator.java`
#### Snippet
```java
   * @return The generated id.
   */
  public int genId();

  /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/data/SoyEasyList.java`
#### Snippet
```java
   */
  @Deprecated
  public void add(SoyValueProvider valueProvider);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/data/SoyDict.java`
#### Snippet
```java
   */
  @Nonnull
  public Map<String, ? extends SoyValueProvider> asJavaStringMap();

  /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/data/SoyDict.java`
#### Snippet
```java
   */
  @Nonnull
  public Map<String, ? extends SoyValue> asResolvedJavaStringMap();
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/msgs/SoyMsgPlugin.java`
#### Snippet
```java
   * @throws SoyMsgException If there was an error building the file content.
   */
  public CharSequence generateExtractedMsgsFile(
      SoyMsgBundle msgBundle, OutputFileOptions options, ErrorReporter errorReporter);

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/msgs/SoyMsgPlugin.java`
#### Snippet
```java
   * @throws SoyMsgException If there was an error parsing the file content.
   */
  public SoyMsgBundle parseTranslatedMsgsFile(String translatedMsgsFileContent);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner interfaces
in `java/src/com/google/template/soy/error/SourceSnippetPrinter.java`
#### Snippet
```java
public final class SourceSnippetPrinter {
  /** Represents an item that can be printed as part of a snippet. */
  private static interface Printable {
    /**
     * Returns the string content of this Printable.
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/jssrc/restricted/SoyLibraryAssistedJsSrcPrintDirective.java`
#### Snippet
```java
   * @return A collection of strings representing Closure JS library names
   */
  public ImmutableSet<String> getRequiredJsLibNames();
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/jssrc/restricted/SoyJsSrcPrintDirective.java`
#### Snippet
```java
   * @return The resulting value.
   */
  public JsExpr applyForJsSrc(JsExpr value, List<JsExpr> args);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/pysrc/restricted/SoyPySrcPrintDirective.java`
#### Snippet
```java
   * @return The resulting value.
   */
  public PyExpr applyForPySrc(PyExpr value, List<PyExpr> args);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `java/src/com/google/template/soy/jbcsrc/ExpressionDetacher.java`
#### Snippet
```java
   * }</pre>
   */
  static final class BasicDetacher implements ExpressionDetacher {
    static final BasicDetacher INSTANCE = new BasicDetacher(() -> Statement.NULL_STATEMENT);
    private final Supplier<Statement> saveOperationSupplier;
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `java/src/com/google/template/soy/jbcsrc/ExpressionDetacher.java`
#### Snippet
```java
   * <p>This assumes that all SoyValueProviders will be already resolved and simply calls resolve().
   */
  static final class NullDetatcher implements ExpressionDetacher, Factory {
    static final NullDetatcher INSTANCE = new NullDetatcher();

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
  interface PlaceholderCompiler {
    @AutoValue
    abstract static class Placeholder {
      static Placeholder create(Expression soyValueProvider, boolean requiresDetachLogicToResolve) {
        soyValueProvider.checkAssignableTo(SOY_VALUE_PROVIDER_TYPE);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner enums
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
      new RepeatedFieldInterpreter();

  static enum ScalarFieldMode {
    DEFAULT_IF_UNSET,
    NULL_IF_UNSET,
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/pysrc/restricted/SoyPySrcFunction.java`
#### Snippet
```java
   * @return The computed result of this function.
   */
  public PyExpr computeForPySrc(List<PyExpr> args);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/jssrc/restricted/SoyJsSrcFunction.java`
#### Snippet
```java
   * @return The computed result of this function.
   */
  public JsExpr computeForJsSrc(List<JsExpr> args);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/shared/internal/SoyScopedData.java`
#### Snippet
```java

  /** A subtype of {@link AutoCloseable} that can be closed without an IOException. */
  public interface InScope extends AutoCloseable {

    BidiGlobalDir getBidiGlobalDir();
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/shared/internal/SoyScopedData.java`
#### Snippet
```java

  /** Allows entering a portion of code from which SoyScopedData can be retrieved. */
  public interface Enterable {
    /** Enters an occurrence of this scope. */
    @CheckReturnValue
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner enums
in `java/src/com/google/template/soy/shared/internal/TagWhitelist.java`
#### Snippet
```java

  /** Additional tags which can be white-listed as safe. */
  public static enum OptionalSafeTag {
    HR("hr"),
    LI("li"),
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/shared/restricted/SoyJavaPrintDirective.java`
#### Snippet
```java
   * @return The resulting value. Must be either {@code StringData} or {@code SanitizedContent}.
   */
  public SoyValue applyForJava(SoyValue value, List<SoyValue> args);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/shared/restricted/SoyPrintDirective.java`
#### Snippet
```java
   * @return The set of valid args list sizes.
   */
  public Set<Integer> getValidArgsSizes();
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/shared/restricted/SoyPrintDirective.java`
#### Snippet
```java
   * @return The name of the Soy print directive.
   */
  public String getName();

  /**
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/shared/restricted/SoyJavaFunction.java`
#### Snippet
```java
   * @return The computed result of this function.
   */
  public SoyValue computeForJava(List<SoyValue> args);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner enums
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java

  /** The list of potential languages which are used by the escapers. */
  public static enum EscapingLanguage {
    JAVASCRIPT,
    PYTHON
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `java/src/com/google/template/soy/soytree/SoyNode.java`
#### Snippet
```java

    /** A SamenessKey that uses the identity of a SoyNode. */
    static final class IdentitySamenessKey implements SamenessKey {
      private SoyNode node;

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner interfaces
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
   * msg, etc.
   */
  public static interface CommandTagAttributesHolder extends SoyNode {
    List<CommandTagAttribute> getAttributes();

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/exprtree/ExprNode.java`
#### Snippet
```java

  /** Gets the data type of this node. */
  public SoyType getType();

  @Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/exprtree/ExprNode.java`
#### Snippet
```java
   */
  @Override
  public Kind getKind();

  /** Gets the data type of this node. */
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/exprtree/ExprNode.java`
#### Snippet
```java
  interface OperatorNode extends ParentExprNode {

    public Operator getOperator();

    @Override
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/exprtree/ExprNode.java`
#### Snippet
```java

    @Override
    public OperatorNode copy(CopyState copyState);
  }

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/exprtree/ExprNode.java`
#### Snippet
```java

  @Override
  public ParentExprNode getParent();

  /** See {@link Node#copy(CopyState)} for a description of the copy contract. */
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `java/src/com/google/template/soy/exprtree/ExprNode.java`
#### Snippet
```java
  /** See {@link Node#copy(CopyState)} for a description of the copy contract. */
  @Override
  public ExprNode copy(CopyState copyState);

  // -----------------------------------------------------------------------------------------------
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner enums
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java

  /** Enum for an operator's associativity. */
  public static enum Associativity {
    /** Left-to-right. */
    LEFT,
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner interfaces
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java
  /** Represents a syntax element (used in a syntax specification for an operator). */
  @Immutable
  public static interface SyntaxElement {}

  /** A syntax element for an operand. */
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `private` is redundant for enum constructors
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java
   * @param associativity This operator's associativity.
   */
  private Operator(
      ImmutableList<SyntaxElement> syntax, int precedence, Associativity associativity) {
    this(syntax, precedence, associativity, /* description= */ null);
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for inner classes of interfaces
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
  interface Processor {
    @AutoValue
    abstract static class Result {
      static Result create(Context next, int numCharactersConsumed) {
        return new AutoValue_RawTextContextUpdater_Processor_Result(next, numCharactersConsumed);
```

## RuleId[ruleID=EmptyStatementBody]
### RuleId[ruleID=EmptyStatementBody]
`for` statement has empty body
in `java/src/com/google/template/soy/msgs/restricted/RenderOnlySoyMsgBundleImpl.java`
#### Snippet
```java
    for (int bucket = 0, idx = 0; bucket < numBuckets; bucket++) {
      bucketBoundaries[bucket] = idx;
      for (;
          (idx < sortedMsgs.size()) && (bucketOf(sortedMsgs.get(idx).getId()) == bucket);
          idx++) {}
```

### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex > 0 && (lastChar = text.charAt(--charIndex)) != quote) {}
        }
      }
```

### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex < length && (lastChar = text.charAt(charIndex++)) != quote) {}
        }
      }
```

### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
     */
    private byte skipEntityForward() {
      while (charIndex < length && (lastChar = text.charAt(charIndex++)) != ';') {}
      return UCharacter.DIRECTIONALITY_WHITESPACE;
    }
```

### RuleId[ruleID=EmptyStatementBody]
`while` statement has empty body
in `java/src/com/google/template/soy/basicfunctions/HtmlToText.java`
#### Snippet
```java
        // Pop tags until we pop one that matches the current closing tag. This means we're
        // effectively automatically closing tags that aren't explicitly closed.
        while (!preserveWhitespaceStack.isEmpty()
            && !preserveWhitespaceStack.pop().tagName().equals(lowerCaseTag)) {}
      } else if (matchesTag(lowerCaseTag, WS_PRESERVING_TAGS)) {
```

## RuleId[ruleID=JavaLangInvokeHandleSignature]
### RuleId[ruleID=JavaLangInvokeHandleSignature]
Cannot resolve method 'slowpathTemplate'
in `java/src/com/google/template/soy/jbcsrc/shared/ClassLoaderFallbackCallFactory.java`
#### Snippet
```java
    MethodHandle handle =
        lookup.findStatic(
            ClassLoaderFallbackCallFactory.class, "slowpathTemplate", SLOWPATH_TEMPLATE_TYPE);
    handle = insertArguments(handle, 0, templateName);
    return new ConstantCallSite(handle);
```

## RuleId[ruleID=UnnecessaryStringEscape]
### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/pysrc/internal/GeneratePySanitizeEscapingDirectiveCode.java`
#### Snippet
```java
  @Override
  protected String escapeOutputString(String input) {
    String escapeCharacters = "\\\'\"\b\f\n\r\t";

    // Give the string builder a little bit of extra space to account for new escape characters.
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForIcuSection =
      str -> str.replace("'", "\\\'");
}

```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForPyFormatString =
      str -> str.replaceAll("\\{", "{{").replaceAll("\\}", "}}").replace("'", "\\\'");

  /**
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          // and
          //      <img src="/foo/{print $x}.png">
          .escapeAll(" (){}\"\'\\<>")
          // More spaces and newlines.
          .escapeAll("\u0085\u00A0\u2028\u2029")
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          // Newlines are disallowed in strings, so not escaping them can trigger CSS error
          // recovery.
          .escapeAll("\u0000\b\t\n\u000b\f\r\u0085\u00a0\u2028\u2029\"\'\\<>&{};:()@/=*")
          .build();
    }
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/soyparse/Tokens.java`
#### Snippet
```java
        return "string";
      case SoyFileParserConstants.FOR:
        return "\'for\'";
      case SoyFileParserConstants.IN:
        return "\'in\'";
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/soyparse/Tokens.java`
#### Snippet
```java
        return "string";
      case SoyFileParserConstants.FOR:
        return "\'for\'";
      case SoyFileParserConstants.IN:
        return "\'in\'";
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/soyparse/Tokens.java`
#### Snippet
```java
        return "\'for\'";
      case SoyFileParserConstants.IN:
        return "\'in\'";

      case SoyFileParserConstants.UNEXPECTED_TOKEN:
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/soyparse/Tokens.java`
#### Snippet
```java
        return "\'for\'";
      case SoyFileParserConstants.IN:
        return "\'in\'";

      case SoyFileParserConstants.UNEXPECTED_TOKEN:
```

### RuleId[ruleID=UnnecessaryStringEscape]
`\'` is unnecessarily escaped
in `java/src/com/google/template/soy/soyparse/SoyParseUtils.java`
#### Snippet
```java
    // NOTE: we don't just use String.replace since it internally allocates/compiles a regular
    // expression.  Instead we have a handrolled loop.
    int index = s.indexOf(quoteStyle == QuoteStyle.DOUBLE ? "\\\"" : "\\\'");
    if (index == -1) {
      return s;
```

## RuleId[ruleID=StaticInitializerReferencesSubClass]
### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass BasicTemplateContentKind from superclass TemplateContentKind initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/base/internal/TemplateContentKind.java`
#### Snippet
```java
          "Invalid value for template attribute ''kind'', expected one of "
              + ImmutableSortedSet.naturalOrder()
                  .addAll(BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.keySet())
                  .add("html<...>")
                  .build()
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass BasicTemplateContentKind from superclass TemplateContentKind initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/base/internal/TemplateContentKind.java`
#### Snippet
```java

  public static final TemplateContentKind DEFAULT =
      BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.get(
          SanitizedContentKind.HTML.asAttributeValue());

```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass ExpressionStatement from superclass Statement initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/jssrc/dsl/Statement.java`
#### Snippet
```java
public abstract class Statement extends CodeChunk {

  public static final Statement ERROR_STMT = ExpressionStatement.of(ERROR_EXPR);

  Statement() {}
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass PrimitiveJavaType from superclass SimpleJavaType initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java

  public static final SimpleJavaType INT =
      new PrimitiveJavaType(
          /* boxedType= */ "java.lang.Long",
          /* primitiveType= */ "long",
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass PrimitiveJavaType from superclass SimpleJavaType initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java
   */
  public static final SimpleJavaType BOOLEAN =
      new PrimitiveJavaType(
          /* boxedType= */ "java.lang.Boolean",
          /* primitiveType= */ "boolean",
```

### RuleId[ruleID=StaticInitializerReferencesSubClass]
Referencing subclass PrimitiveJavaType from superclass SimpleJavaType initializer might lead to class loading deadlock
in `java/src/com/google/template/soy/javagencode/javatypes/SimpleJavaType.java`
#### Snippet
```java

  public static final SimpleJavaType FLOAT =
      new PrimitiveJavaType(
          /* boxedType= */ "java.lang.Double",
          /* primitiveType= */ "double",
```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (7 lines)
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java

      // Generates code to check the type of the base expression and call the correct getter method:
      // if (base instanceof Foo) {
      //   ((Foo) base).getMyField();
      // } else if (base instanceof Bar) {
```

## RuleId[ruleID=ManualArrayCopy]
### RuleId[ruleID=ManualArrayCopy]
Manual array copy
in `java/src/com/google/template/soy/plugin/java/internal/ValidatorErrorReporter.java`
#### Snippet
```java
    args[1] = fnClass.getName();
    args[2] = includeTriggeredInTemplateMsg ? "\nTriggered by usage in template at:" : "";
    for (int i = 0; i < additionalArgs.length; i++) {
      args[3 + i] = additionalArgs[i];
    }
```

## RuleId[ruleID=RegExpRedundantEscape]
### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\]` in RegExp
in `java/src/com/google/template/soy/msgs/internal/ExtractMsgsVisitor.java`
#### Snippet
```java

  /** Regex pattern for extracting message attributes from the message description. */
  private static final Pattern MESSAGE_ATTRIBUTE_PATTERN = Pattern.compile("\\[[^\\[\\]]*\\]");

  /**
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\#` in RegExp
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
  // Note: Need to escape hash char in regex due to Pattern.COMMENTS.
  private static final Pattern ICU_SYNTAX_CHAR_NEEDING_ESCAPE_PATTERN =
      Pattern.compile(" ' (?= ['{}\\#] ) | ' $ | [{}] ", Pattern.COMMENTS);

  /** Map from ICU syntax char to its escape sequence. */
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\}` in RegExp
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForPyFormatString =
      str -> str.replaceAll("\\{", "{{").replaceAll("\\}", "}}").replace("'", "\\\'");

  /**
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\ ` in RegExp
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
  private static final Pattern SOY_DOC_END =
      Pattern.compile("\\r?\\n? [\\ ]* [*][/] $", Pattern.COMMENTS);

  /**
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\ ` in RegExp
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc start token, including spaces up to the first newline. */
  private static final Pattern SOY_DOC_START =
      Pattern.compile("^ [/][*][*] [\\ ]* \\r?\\n?", Pattern.COMMENTS);

  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
```

### RuleId[ruleID=RegExpRedundantEscape]
Redundant character escape `\\)` in RegExp
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
              HtmlContext.CSS_URI,
              TransitionSetProcessor.of(
                  makeTransitionToState(Pattern.compile("[\\)\\s]"), HtmlContext.CSS),
                  URI_PART_TRANSITION,
                  URI_START_TRANSITION,
```

## RuleId[ruleID=RefusedBequest]
### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/jssrc/SoyJsSrcOptions.java`
#### Snippet
```java

  @Override
  public final SoyJsSrcOptions clone() {
    return new SoyJsSrcOptions(this);
  }
```

### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java

  @Override
  public final SoyPySrcOptions clone() {
    return new SoyPySrcOptions(this);
  }
```

### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/shared/SoyGeneralOptions.java`
#### Snippet
```java

  @Override
  public final SoyGeneralOptions clone() {
    return new SoyGeneralOptions(this);
  }
```

### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/soytree/defn/UndeclaredVar.java`
#### Snippet
```java

  @Override
  public UndeclaredVar clone() {
    return new UndeclaredVar(this);
  }
```

### RuleId[ruleID=RefusedBequest]
Method `clone()` does not call 'super.clone()'
in `java/src/com/google/template/soy/incrementaldomsrc/SoyIncrementalDomSrcOptions.java`
#### Snippet
```java

  @Override
  public SoyIncrementalDomSrcOptions clone() {
    return new SoyIncrementalDomSrcOptions(this);
  }
```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `manifest.keySet()` may be replaced with 'entrySet()' iteration
in `java/src/com/google/template/soy/pysrc/internal/PySrcMain.java`
#### Snippet
```java
      try (Writer out =
          Files.newWriter(new File(pySrcOptions.namespaceManifestFile()), StandardCharsets.UTF_8)) {
        for (String namespace : manifest.keySet()) {
          out.write(String.format("%s=%s\n", namespace, manifest.get(namespace)));
        }
```

### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `inputToOutputPaths.keySet()` may be replaced with 'entrySet()' iteration
in `java/src/com/google/template/soy/pysrc/internal/PySrcMain.java`
#### Snippet
```java
    Map<String, String> manifest = new HashMap<>();

    for (SourceFilePath inputFilePath : inputToOutputPaths.keySet()) {
      String outputFilePath = inputToOutputPaths.get(inputFilePath).toString();
      String pythonPath = outputFilePath.replace(".py", "").replace('/', '.');
```

## RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `java/src/com/google/template/soy/data/internal/SoyLegacyObjectMapImpl.java`
#### Snippet
```java
  @Override
  public Iterable<? extends SoyValue> getItemKeys() {
    return Iterables.transform(map.keySet(), StringData::forValue);
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `java/src/com/google/template/soy/data/internal/DictImpl.java`
#### Snippet
```java
  public Iterable<? extends SoyValue> keys() {
    typeTracker.maybeSetMapType();
    return Iterables.transform(providerMap.keySet(), StringData::forValue);
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `java/src/com/google/template/soy/data/internal/DictImpl.java`
#### Snippet
```java
  public final Iterable<? extends SoyValue> getItemKeys() {
    typeTracker.maybeSetLegacyObjectMapOrRecordType();
    return Iterables.transform(providerMap.keySet(), StringData::forValue);
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `java/src/com/google/template/soy/jbcsrc/JbcSrcValueFactory.java`
#### Snippet
```java
  public JbcSrcJavaValue listOf(List<JavaValue> args) {
    List<SoyExpression> soyExprs =
        Lists.transform(args, value -> (SoyExpression) ((JbcSrcJavaValue) value).expr());
    return JbcSrcJavaValue.of(SoyExpression.asBoxedList(soyExprs));
  }
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java
  @Override
  public Iterable<? extends SoyValue> keys() {
    return Iterables.transform(map.keySet(), StringData::forValue);
  }

```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java
  public TofuJavaValue listOf(List<JavaValue> args) {
    List<SoyValue> values =
        Lists.transform(
            args,
            soyArg -> {
```

### RuleId[ruleID=StaticPseudoFunctionalStyleMethod]
Pseudo functional style code
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java
      SoyJavaSourceFunction srcFn, List<SoyValue> args, TofuPluginContext context) {
    List<JavaValue> javaArgs =
        Lists.transform(args, soyArg -> TofuJavaValue.forSoyValue(soyArg, fnSourceLocation));
    TofuJavaValue result = (TofuJavaValue) srcFn.applyForJavaSource(this, javaArgs, context);
    if (!result.hasSoyValue()) {
```

## RuleId[ruleID=DuplicateBranchesInSwitch]
### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        case IS_PARAM_SET:
        case DEBUG_SOY_TEMPLATE_INFO:
          node.setType(BoolType.getInstance());
          break;
        case VE_DATA:
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
          break;
        case LEGACY_DYNAMIC_TAG:
          node.setType(StringType.getInstance());
          break;
        case PROTO_INIT:
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        case PROTO_EXTENSION:
          // May not be erased if other errors are present.
          return UnknownType.getInstance();
        case PROTO_MODULE:
        case PROTO_ENUM_TYPE:
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Branch in 'switch' is a duplicate of the default branch
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyExprVisitor.java`
#### Snippet
```java
        return IntegerData.forValue(((ProtoEnumValueNode) expr).getValue());
      case GLOBAL_NODE:
        return null;
      default:
        return null;
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
      case PROTO_ENUM:
        // TODO(lukes): this should also assert that the value is in range
        return CheckResult.fromBool(value instanceof IntegerData);
      case RECORD:
        return CheckResult.fromBool(value instanceof SoyRecord);
```

### RuleId[ruleID=DuplicateBranchesInSwitch]
Duplicate branch in 'switch'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
            // the autoescaper the difference, for now treat as Javascript which is pretty close
            // ?.
            elType = ElementType.SCRIPT;
            break;
          case UNKNOWN:
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `FieldRef` on 'this' is unnecessary in this context
in `java/src/com/google/template/soy/jbcsrc/restricted/FieldRef.java`
#### Snippet
```java
  void accessStaticUnchecked(CodeBuilder mv) {
    checkState(isStatic());
    mv.getStatic(owner().type(), FieldRef.this.name(), type());
  }

```

## RuleId[ruleID=FinalPrivateMethod]
### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
   * SoyValueConverter for interpretation.
   */
  private static final ProtoFieldInterpreter enumTypeField(final EnumDescriptor enumDescriptor) {
    return new ProtoFieldInterpreter() {

```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
  }

  private final TemplateParam syntheticTemplateParam(TemplateType.Parameter typeParam) {
    TemplateParam param =
        new TemplateParam(
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
    }

    private static final Type getKeyType(FieldDescriptor keyDescriptor) {
      switch (keyDescriptor.getJavaType()) {
        case INT:
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
  }

  private static final String modifiableImplsMapKey(TemplateBasicNode templateBasicNode) {
    return !templateBasicNode.getLegacyDeltemplateNamespace().isEmpty()
        ? templateBasicNode.getLegacyDeltemplateNamespace()
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java

  /** The {@link Method} signature of the {@code static CompiledTemplate template()} method. */
  private static final Method createTemplateMethod(String methodName) {
    return new Method(methodName, Type.getMethodDescriptor(BytecodeUtils.COMPILED_TEMPLATE_TYPE));
  }
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
  }

  private static final boolean isValidVariantType(SoyType type) {
    return type.equals(SoyTypes.NUMBER_TYPE)
        || type.equals(StringType.getInstance())
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/soytree/JavaImplNode.java`
#### Snippet
```java
   * constructors.
   */
  private final void initAttributes(ErrorReporter errorReporter) {
    for (CommandTagAttribute attr : attributes) {
      if (attr.hasName(CLASS)) {
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/soytree/JsImplNode.java`
#### Snippet
```java
   * constructors.
   */
  private final void initAttributes() {
    for (CommandTagAttribute attr : attributes) {
      if (attr.hasName(NAMESPACE)) {
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
  }

  private final HashMap<String, Wrapper> namedParamsMap(FunctionNode node) {
    HashMap<String, Wrapper> map = new HashMap<>();
    List<ExprNode> children = node.getChildren();
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
  }

  private final HashMap<String, Wrapper> recordLiteralFields(RecordLiteralNode node) {
    HashMap<String, Wrapper> map = new HashMap<>();
    List<ExprNode> children = node.getChildren();
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
  }

  private final HashMap<Wrapper, Wrapper> mapLiteralFields(MapLiteralNode node) {
    // both of these nodes store keys and values as alternating children.  We don't want order to
    // matter so we store in a map
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java
  public static final ExtensionRegistry REGISTRY = createRegistry();

  private static final ExtensionRegistry createRegistry() {
    ExtensionRegistry instance = ExtensionRegistry.newInstance();
    // Add extensions needed for parsing descriptors here.
```

### RuleId[ruleID=FinalPrivateMethod]
'private' method declared `final`
in `java/src/com/google/template/soy/i18ndirectives/FormatNumFunction.java`
#### Snippet
```java
          .build();

  private static final JavaScriptValue jsArgToValue(String arg, JavaScriptValueFactory factory) {
    String formatEnum = JS_ARGS_TO_ENUM.get(arg);
    if (formatEnum == null) {
```

## RuleId[ruleID=RegExpSimplifiable]
### RuleId[ruleID=RegExpSimplifiable]
`\\p{IsDigit}` can be simplified to '\\d'
in `java/src/com/google/template/soy/data/ordainers/JsIdentifierOrdainer.java`
#### Snippet
```java
  private static final Pattern VALID_JS_IDENTIFIER_PATTERN =
      Pattern.compile(
          "^[$_\\p{IsLetter}][$_\\p{IsLetter}\\p{IsDigit}]*$", Pattern.UNICODE_CHARACTER_CLASS);

  /**
```

### RuleId[ruleID=RegExpSimplifiable]
`\\p{IsDigit}` can be simplified to '\\d'
in `java/src/com/google/template/soy/passes/BasicHtmlValidationPass.java`
#### Snippet
```java
  // https://developer.mozilla.org/en-US/docs/Glossary/Identifier
  private static final Pattern JS_IDENTIFIER_PATTERN =
      Pattern.compile("^[$_\\p{IsLetter}][$_\\p{IsLetter}\\p{IsDigit}]*$");

  private void warnOnIdAttributesMatchingJsIdentifiers(HtmlAttributeNode attributeNode) {
```

### RuleId[ruleID=RegExpSimplifiable]
`[\\ ]` can be simplified to '\\ '
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
  private static final Pattern SOY_DOC_END =
      Pattern.compile("\\r?\\n? [\\ ]* [*][/] $", Pattern.COMMENTS);

  /**
```

### RuleId[ruleID=RegExpSimplifiable]
`[/]` can be simplified to '/'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
  private static final Pattern SOY_DOC_END =
      Pattern.compile("\\r?\\n? [\\ ]* [*][/] $", Pattern.COMMENTS);

  /**
```

### RuleId[ruleID=RegExpSimplifiable]
`[/]` can be simplified to '/'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc start token, including spaces up to the first newline. */
  private static final Pattern SOY_DOC_START =
      Pattern.compile("^ [/][*][*] [\\ ]* \\r?\\n?", Pattern.COMMENTS);

  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
```

### RuleId[ruleID=RegExpSimplifiable]
`[\\ ]` can be simplified to '\\ '
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  /** Pattern for a SoyDoc start token, including spaces up to the first newline. */
  private static final Pattern SOY_DOC_START =
      Pattern.compile("^ [/][*][*] [\\ ]* \\r?\\n?", Pattern.COMMENTS);

  /** Pattern for a SoyDoc end token, including preceding spaces up to the last newline. */
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`targetLocaleString.length() > 0` can be replaced with '!targetLocaleString.isEmpty()'
in `java/src/com/google/template/soy/SoyMsgExtractor.java`
#### Snippet
```java
    OutputFileOptions options = new OutputFileOptions();
    options.setSourceLocaleString(sourceLocaleString);
    if (targetLocaleString.length() > 0) {
      options.setTargetLocaleString(targetLocaleString);
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`runtimePath.length() == 0` can be replaced with 'runtimePath.isEmpty()'
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
  @Override
  protected void validateFlags() {
    if (runtimePath.length() == 0) {
      exitWithError("Must provide the Python runtime library path.");
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`javaPackage.length() == 0` can be replaced with 'javaPackage.isEmpty()'
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
  protected void validateFlags() {
    // Java package is always required.
    if (javaPackage.length() == 0) {
      exitWithError("Must provide Java package.");
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`subdir.length() > 0` can be replaced with '!subdir.isEmpty()'
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java

      String fileName = inputPath.getFileName().toString();
      if (subdir != null && subdir.length() > 0) {
        fileName = subdir + "/" + fileName;
      }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`path.length() == 0` can be replaced with 'path.isEmpty()'
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
  public static void ensureDirsExistInPath(String path) {

    if (path == null || path.length() == 0) {
      throw new AssertionError("ensureDirsExistInPath called with null or empty path.");
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`getContent().length() > 0` can be replaced with '!getContent().isEmpty()'
in `java/src/com/google/template/soy/data/SanitizedContent.java`
#### Snippet
```java
  @Override
  public boolean coerceToBoolean() {
    return getContent().length() > 0; // Consistent with StringData
  }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`getValue().length() > 0` can be replaced with '!getValue().isEmpty()'
in `java/src/com/google/template/soy/data/restricted/StringData.java`
#### Snippet
```java
  @Override
  public boolean coerceToBoolean() {
    return getValue().length() > 0;
  }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `java/src/com/google/template/soy/data/restricted/StringData.java`
#### Snippet
```java
   */
  public static StringData forValue(String value) {
    return (value.length() == 0) ? EMPTY_STRING : new StringData(value);
  }

```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`namespace.length() > 0` can be replaced with '!namespace.isEmpty()'
in `java/src/com/google/template/soy/tofu/internal/NamespacedTofu.java`
#### Snippet
```java
    Preconditions.checkNotNull(baseTofu);
    this.baseTofu = baseTofu;
    Preconditions.checkArgument(namespace != null && namespace.length() > 0);
    this.namespace = namespace;
  }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`value().length() == 0` can be replaced with 'value().isEmpty()'
in `java/src/com/google/template/soy/jssrc/dsl/RawText.java`
#### Snippet
```java
  @Override
  void doFormatInitialStatements(FormattingContext ctx) {
    if (value().length() == 0) {
      return;
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`params().size() == 0` can be replaced with 'params().isEmpty()'
in `java/src/com/google/template/soy/jssrc/dsl/JsDoc.java`
#### Snippet
```java

  private boolean isSingleLine() {
    return params().size() == 0
        || (overviewComment().isEmpty()
            && params().size() == 1
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`overviewComment().length() > 0` can be replaced with '!overviewComment().isEmpty()'
in `java/src/com/google/template/soy/jssrc/dsl/JsDoc.java`
#### Snippet
```java
    ctx.append("/**");
    ctx.endLine();
    if (overviewComment().length() > 0) {
      ctx.append("* " + overviewComment());
      ctx.endLine();
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
      boolean areAllLinesEmpty = true;
      for (String line : lines) {
        if (line.length() == 0) {
          continue; // empty lines are okay
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`line.length() == 0` can be replaced with 'line.isEmpty()'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
      for (int i = 0; i < lines.size(); i++) {
        String line = lines.get(i);
        if (line.length() == 0) {
          continue; // don't change empty lines
        }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`rawText.length() > 0` can be replaced with '!rawText.isEmpty()'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
  public static RawTextNode newLiteral(int id, String rawText, SourceLocation loc) {
    SourceOffsets.Builder builder = new SourceOffsets.Builder();
    if (rawText.length() > 0) {
      builder.add(0, loc.getBeginLine(), loc.getBeginColumn(), Reason.NONE);
    }
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`locale.length() > 0` can be replaced with '!locale.isEmpty()'
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    SoyMsgBundle msgBundle;
    if (locale.length() > 0) {
      // Use translations from an XLIFF file.
      SoyMsgBundleHandler msgBundleHandler = new SoyMsgBundleHandler(new XliffMsgPlugin());
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`isRtlCodeSnippet.length() > 0` can be replaced with '!isRtlCodeSnippet.isEmpty()'
in `java/src/com/google/template/soy/internal/i18n/BidiGlobalDir.java`
#### Snippet
```java
      String isRtlCodeSnippet, @Nullable String namespace, SoyBackendKind backend) {
    Preconditions.checkArgument(
        isRtlCodeSnippet != null && isRtlCodeSnippet.length() > 0,
        "Bidi global direction source code snippet must be non-empty.");
    Preconditions.checkArgument(
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`targetLocaleString.length() > 0` can be replaced with '!targetLocaleString.isEmpty()'
in `java/src/com/google/template/soy/xliffmsgplugin/XliffGenerator.java`
#### Snippet
```java
    Escaper contentEscaper = XmlEscapers.xmlContentEscaper();

    boolean hasTarget = targetLocaleString != null && targetLocaleString.length() > 0;

    IndentedLinesBuilder ilb = new IndentedLinesBuilder(2);
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`contentType.length() > 0` can be replaced with '!contentType.isEmpty()'
in `java/src/com/google/template/soy/xliffmsgplugin/XliffGenerator.java`
#### Snippet
```java
      ilb.appendLineStart("<trans-unit id=\"", Long.toString(msg.getId()), "\"");
      String contentType = msg.getContentType();
      if (contentType != null && contentType.length() > 0) {
        String xliffDatatype = CONTENT_TYPE_TO_XLIFF_DATATYPE_MAP.get(contentType);
        if (xliffDatatype == null) {
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`desc.length() > 0` can be replaced with '!desc.isEmpty()'
in `java/src/com/google/template/soy/xliffmsgplugin/XliffGenerator.java`
#### Snippet
```java
      // Description and meaning.
      String desc = msg.getDesc();
      if (desc != null && desc.length() > 0) {
        ilb.appendLine(
            "<note priority=\"1\" from=\"description\">", contentEscaper.escape(desc), "</note>");
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`meaning.length() > 0` can be replaced with '!meaning.isEmpty()'
in `java/src/com/google/template/soy/xliffmsgplugin/XliffGenerator.java`
#### Snippet
```java
      }
      String meaning = msg.getMeaning();
      if (meaning != null && meaning.length() > 0) {
        ilb.appendLine(
            "<note priority=\"1\" from=\"meaning\">", contentEscaper.escape(meaning), "</note>");
```

## RuleId[ruleID=StringBufferReplaceableByString]
### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder` can be replaced with 'String'
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
  public static String escapeToWrappedSoyString(
      String value, boolean shouldEscapeToAscii, QuoteStyle quoteStyle) {
    return new StringBuilder(value.length() + 2)
        .append(quoteStyle.getQuoteChar())
        .append(escapeToSoyString(value, shouldEscapeToAscii, quoteStyle))
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder exprSb` can be replaced with 'String'
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
    // <true> if <conditional> else <false>.
    int conditionalPrecedence = PyExprUtils.pyPrecedenceForOperator(Operator.CONDITIONAL);
    StringBuilder exprSb =
        new StringBuilder()
            .append(PyExprUtils.maybeProtect(trueExpr, conditionalPrecedence).getText())
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder description` can be replaced with 'String'
in `java/src/com/google/template/soy/soytree/defn/TemplateStateVar.java`
#### Snippet
```java
  @Override
  public String toString() {
    StringBuilder description = new StringBuilder();
    description.append(getClass().getSimpleName());
    description.append("{name = ").append(name());
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder sb` can be replaced with 'String'
in `java/src/com/google/template/soy/basetree/MixinParentNode.java`
#### Snippet
```java
   */
  public String toTreeString(int indent) {
    StringBuilder sb = new StringBuilder();
    sb.append(SPACES, 0, indent).append("[").append(master).append("]\n");
    return sb.toString();
```

### RuleId[ruleID=StringBufferReplaceableByString]
`StringBuilder javadocSb` can be replaced with 'String'
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java

    for (Map.Entry<String, TemplateNode> templateEntry : publicBasicTemplateMap.entrySet()) {
      StringBuilder javadocSb = new StringBuilder();
      javadocSb
          .append("The full template name of the ")
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `endNeedsSpaceForAttribute |= needsSpaceForAttribute`
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java
      for (ParentSoyNode<?> branch : branches) {
        visitChildren(branch);
        endNeedsSpaceForAttribute |= needsSpaceForAttribute;
        needsSpaceForAttribute = startNeedsSpaceForAttribute;
        endNeedsSpaceForSelfClosingTag |= needsSpaceSelfClosingTag;
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `endNeedsSpaceForSelfClosingTag |= needsSpaceSelfClosingTag`
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java
        endNeedsSpaceForAttribute |= needsSpaceForAttribute;
        needsSpaceForAttribute = startNeedsSpaceForAttribute;
        endNeedsSpaceForSelfClosingTag |= needsSpaceSelfClosingTag;
        needsSpaceSelfClosingTag = startNeedsSpaceForSelfClosingTag;
      }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `v != 0.0 & !Double.isNaN(v)`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    // NaN and 0 should both be falsy, all other numbers are truthy
    // use & instead of && to avoid a branch
    return v != 0.0 & !Double.isNaN(v);
  }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `value instanceof NullData | value instanceof UndefinedData`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  @Nullable
  private static SoyValue handleTofuNull(SoyValue value) {
    if (value instanceof NullData | value instanceof UndefinedData) {
      return null;
    }
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `index < size & index >= 0`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    int size = list.size();
    // use & instead of && to avoid a branch
    if (index < size & index >= 0) {
      SoyValueProvider soyValueProvider = list.get((int) index);
      return soyValueProvider == null ? NULL_PROVIDER : soyValueProvider;
```

## RuleId[ruleID=UnnecessaryReturn]
### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
            : new File(path).getParent();
    if (dirPath == null || knownExistingDirs.contains(dirPath)) {
      return; // known to exist
    } else {
      new File(dirPath).mkdirs();
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
    if (!fitsOnCurrentLine(nextAppendContent)) {
      endLine();
      return;
    }
  }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/passes/VeLogValidationPass.java`
#### Snippet
```java
          function.getStaticFunctionName(),
          " It has sibling nodes in the attribute value.");
      return;
    }
  }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
      if (sig != null && !sig.deprecatedWarning().isEmpty()) {
        reporter.warn(location, DEPRECATED_PLUGIN, name, sig.deprecatedWarning());
        return;
      }
    }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  public void addKytheLinkTo(Span methodNameSpan, ParamInfo paramInfo, TemplateInfo template) {
    if (!isEnabled()) {
      return;
    }
  }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  public void addKytheLinkTo(Span classNameSpan, TemplateInfo template) {
    if (!isEnabled()) {
      return;
    }
  }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  public void addKytheLinkTo(Span classNameSpan, SoyFileNode file) {
    if (!isEnabled()) {
      return;
    }
  }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
        case RCDATA_TITLE:
        case RCDATA_XMP:
          return;
      }
    }
```

### RuleId[ruleID=UnnecessaryReturn]
`return` is unnecessary as the last statement in a 'void' method
in `java/src/com/google/template/soy/xliffmsgplugin/XliffParser.java`
#### Snippet
```java
      if (!isInMsg) {
        // We don't care about characters if not currently inside a message.
        return;
      } else if (currRawTextPart == null) {
        // Common case: Save the characters to the currRawTextPart.
```

## RuleId[ruleID=FinalStaticMethod]
### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
   * @param errorMsg The error message to print.
   */
  protected static final RuntimeException exitWithError(String errorMsg) {
    throw new CommandLineError(errorMsg);
  }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
   * @param errorMsg The error message to print.
   */
  static final RuntimeException exitWithError(String errorMsg) {
    throw new CommandLineError("Error: " + errorMsg);
  }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
   * SoyValueConverter for interpretation.
   */
  private static final ProtoFieldInterpreter enumTypeField(final EnumDescriptor enumDescriptor) {
    return new ProtoFieldInterpreter() {

```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/data/internal/Converters.java`
#### Snippet
```java
/** Converters between runtime and type system content kinds. */
public final class Converters {
  public static final ContentKind contentKindfromSanitizedContentKind(
      SanitizedContentKind sanitizedContentKind) {
    if (sanitizedContentKind == SanitizedContentKind.HTML_ELEMENT) {
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/jssrc/dsl/Expressions.java`
#### Snippet
```java
public final class Expressions {

  public static final boolean isStringLiteral(Expression expr) {
    return expr instanceof StringLiteral;
  }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
   * collision with JavaScript reserved words.
   */
  public static final String genParamAlias(String paramName) {
    return JsSrcUtils.isReservedWord(paramName) ? "param$" + paramName : paramName;
  }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
   * built-in property names of Object.
   */
  public static final String genParamPropAlias(String paramName) {
    return JsSrcUtils.isPropertyOfObject(paramName) ? "param$" + paramName : paramName;
  }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
    }

    private static final Type getKeyType(FieldDescriptor keyDescriptor) {
      switch (keyDescriptor.getJavaType()) {
        case INT:
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
  }

  private static final String modifiableImplsMapKey(TemplateBasicNode templateBasicNode) {
    return !templateBasicNode.getLegacyDeltemplateNamespace().isEmpty()
        ? templateBasicNode.getLegacyDeltemplateNamespace()
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java

  /** The {@link Method} signature of the {@code static CompiledTemplate template()} method. */
  private static final Method createTemplateMethod(String methodName) {
    return new Method(methodName, Type.getMethodDescriptor(BytecodeUtils.COMPILED_TEMPLATE_TYPE));
  }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
   * CompiledTemplate#render(SoyRecord,SoyRecord,AdvisingAppendable, RenderContext)} method.
   */
  static final Method createRenderMethod(String methodName) {
    return new Method(
        methodName,
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/shared/RangeArgs.java`
#### Snippet
```java
   * expression.
   */
  public static final Optional<RangeArgs> createFromNode(ForNode node) {
    if (node.getExpr().getRoot() instanceof FunctionNode) {
      FunctionNode fn = (FunctionNode) node.getExpr().getRoot();
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
  }

  private static final boolean isValidVariantType(SoyType type) {
    return type.equals(SoyTypes.NUMBER_TYPE)
        || type.equals(StringType.getInstance())
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java
  public static final ExtensionRegistry REGISTRY = createRegistry();

  private static final ExtensionRegistry createRegistry() {
    ExtensionRegistry instance = ExtensionRegistry.newInstance();
    // Add extensions needed for parsing descriptors here.
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java
   * @throws IllegalArgumentException If there is no Soy operator matching the given data.
   */
  public static final OperatorNode createOperatorNode(
      SourceLocation location,
      String op,
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java

  private static final class CheckResult {
    static final CheckResult fromBool(boolean result) {
      return result ? PASS : FAIL;
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
    }

    static final CheckResult passWithWarning(Runnable onPass) {
      return new CheckResult(true, Optional.of(onPass));
    }
```

### RuleId[ruleID=FinalStaticMethod]
'static' method declared `final`
in `java/src/com/google/template/soy/i18ndirectives/FormatNumFunction.java`
#### Snippet
```java
          .build();

  private static final JavaScriptValue jsArgToValue(String arg, JavaScriptValueFactory factory) {
    String formatEnum = JS_ARGS_TO_ENUM.get(arg);
    if (formatEnum == null) {
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SoyFileSetParser` has no concrete subclass
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
 */
@AutoValue
public abstract class SoyFileSetParser {

  /** A simple tuple for the result of a parse operation. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
  /** Builder for {@link SoyFileSetParser}. */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setCache(SoyAstCache cache);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ValidatedLoggableElement` has no concrete subclass
in `java/src/com/google/template/soy/logging/ValidatedLoggingConfig.java`
#### Snippet
```java
  /** A validated wrapper for {@link AnnotatedLoggableElement}. */
  @AutoValue
  public abstract static class ValidatedLoggableElement {
    static ValidatedLoggableElement create(AnnotatedLoggableElement annotatedElement) {
      LoggableElement element = annotatedElement.getElement();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CssRegistry` has no concrete subclass
in `java/src/com/google/template/soy/css/CssRegistry.java`
#### Snippet
```java
@Immutable
@AutoValue
public abstract class CssRegistry {
  public abstract ImmutableSet<String> providedSymbols();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SourceFilePath` has no concrete subclass
in `java/src/com/google/template/soy/base/SourceFilePath.java`
#### Snippet
```java
@Immutable
@AutoValue
public abstract class SourceFilePath implements Comparable<SourceFilePath> {
  // TODO(b/162524005): Add support for different 'logical/import paths' vs 'real paths'. Consider
  // modelling file types, there is a limited number and recording it might be useful
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Options` has no concrete subclass
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java

  @AutoValue
  abstract static class Options {

    private static Options create(AnnotatedLoggingConfig loggingConfig, String generator) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Identifier` has no concrete subclass
in `java/src/com/google/template/soy/base/internal/Identifier.java`
#### Snippet
```java
@Immutable
@SuppressWarnings("Immutable")
public abstract class Identifier {

  /** What flavor of identifier this is. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SoyTemplateParam` has no concrete subclass
in `java/src/com/google/template/soy/data/SoyTemplateParam.java`
#### Snippet
```java
 */
@AutoValue
public abstract class SoyTemplateParam<T> {
  /** Creates a standard optional or required param with the given name. */
  public static <T> SoyTemplateParam<T> standard(String name, boolean required, TypeToken<T> type) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SoyVisualElement` has no concrete subclass
in `java/src/com/google/template/soy/data/SoyVisualElement.java`
#### Snippet
```java
/** Soy's runtime representation of objects of the Soy {@code ve} type. */
@AutoValue
public abstract class SoyVisualElement extends SoyAbstractValue {

  private static final LoggableElementMetadata EMPTY_METADATA =
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LoggingFunctionInvocation` has no concrete subclass
in `java/src/com/google/template/soy/data/LoggingFunctionInvocation.java`
#### Snippet
```java
/** The result of executing the logging function. */
@AutoValue
public abstract class LoggingFunctionInvocation {
  public static LoggingFunctionInvocation create(
      String functionName, String placeholderValue, List<SoyValue> args) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Point` has no concrete subclass
in `java/src/com/google/template/soy/base/SourceLocation.java`
#### Snippet
```java
  @AutoValue
  @Immutable
  public abstract static class Point implements Comparable<Point> {
    public static final Point UNKNOWN_POINT = new AutoValue_SourceLocation_Point(-1, -1);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TofuTemplateValue` has no concrete subclass
in `java/src/com/google/template/soy/data/TofuTemplateValue.java`
#### Snippet
```java
/** Tofu-specific runtime type for templates. */
@AutoValue
public abstract class TofuTemplateValue extends SoyAbstractValue {
  public static TofuTemplateValue create(String templateName) {
    return new AutoValue_TofuTemplateValue(templateName, Optional.empty());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LogStatement` has no concrete subclass
in `java/src/com/google/template/soy/data/LogStatement.java`
#### Snippet
```java
/** The value of a {@code velog} statement. */
@AutoValue
public abstract class LogStatement {
  public static LogStatement create(long id, @Nullable Message data, boolean logOnly) {
    return new AutoValue_LogStatement(id, data, logOnly);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SoyVisualElementData` has no concrete subclass
in `java/src/com/google/template/soy/data/SoyVisualElementData.java`
#### Snippet
```java
/** Soy's runtime representation of objects of the Soy {@code ve_data} type. */
@AutoValue
public abstract class SoyVisualElementData extends SoyAbstractValue {

  public static SoyVisualElementData create(SoyVisualElement ve, Message data) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CssParam` has no concrete subclass
in `java/src/com/google/template/soy/data/CssParam.java`
#### Snippet
```java
 */
@AutoOneOf(CssParam.Type.class)
public abstract class CssParam {
  enum Type {
    SAFE_STYLE,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LoggingFunctionCommand` has no concrete subclass
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java

    @AutoValue
    abstract static class LoggingFunctionCommand {
      static LoggingFunctionCommand create(
          LoggingFunctionInvocation fn, ImmutableList<Function<String, String>> escapers) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Case` has no concrete subclass
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgPart.java`
#### Snippet
```java
  @AutoValue
  @Immutable(containerOf = "T")
  public abstract static class Case<T> {
    public static <T> Case<T> create(T spec, Iterable<? extends SoyMsgPart> parts) {
      return new AutoValue_SoyMsgPart_Case<>(spec, ImmutableList.copyOf(parts));
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `BaseSoyTemplateImpl` has no concrete subclass
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
 * names of generated subclasses.
 */
public abstract class BaseSoyTemplateImpl implements SoyTemplate {

  private final ImmutableMap<String, SoyValueProvider> data;
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AbstractBuilder` has no concrete subclass
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
   * <p>Instances of this abstract class are not thread safe.
   */
  public abstract static class AbstractBuilder<
          B extends AbstractBuilder<?, T>, T extends SoyTemplate>
      implements Builder<T> {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AbstractBuilderWithAccumulatorParameters` has no concrete subclass
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
   * @param <T> The type of the concrete SoyTemplate class
   */
  public abstract static class AbstractBuilderWithAccumulatorParameters<
          B extends AbstractBuilderWithAccumulatorParameters<?, T>, T extends SoyTemplate>
      extends AbstractBuilder<B, T> {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SourceLocationAndTemplate` has no concrete subclass
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
  @AutoValue
  @Immutable
  public abstract static class SourceLocationAndTemplate {
    static SourceLocationAndTemplate create(SourceLocation srcLoc, String template) {
      return new AutoValue_SoyMsg_SourceLocationAndTemplate(srcLoc, template);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SoyMsg` has no concrete subclass
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class SoyMsg {

  /** Returns a new builder for {@link SoyMsg}. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SourceLine` has no concrete subclass
in `java/src/com/google/template/soy/error/SourceSnippetPrinter.java`
#### Snippet
```java
  /** A portion of a snippet corresponding to a single line. */
  @AutoValue
  abstract static class SourceLine implements Printable {
    static SourceLine create(int lineNumber, String line) {
      return new AutoValue_SourceSnippetPrinter_SourceLine(lineNumber, line);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SoyError` has no concrete subclass
in `java/src/com/google/template/soy/error/SoyError.java`
#### Snippet
```java
/** A structured error object for reporting */
@AutoValue
public abstract class SoyError implements Comparable<SoyError> {

  static SoyError create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Throw` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Throw.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Throw extends Statement {

  abstract Expression value();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Cast` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Cast.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Cast extends Expression {
  abstract Expression expr();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Dot` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Dot.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Dot extends Operation {

  abstract Expression receiver();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `HtmlAttribute` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/HtmlAttribute.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class HtmlAttribute extends Statement {

  abstract ImmutableList<Statement> children();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `NamedFunctionDeclaration` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/NamedFunctionDeclaration.java`
#### Snippet
```java
 */
@AutoValue
public abstract class NamedFunctionDeclaration extends Statement {

  abstract String name();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Concatenation` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Concatenation.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Concatenation extends Operation {

  static Concatenation create(Iterable<? extends Expression> parts) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RawText` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/RawText.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class RawText extends Statement {
  abstract String value();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TsxFragmentElement` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/TsxFragmentElement.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class TsxFragmentElement extends Expression {
  public static Expression create(ImmutableList<Statement> body) {
    return new AutoValue_TsxFragmentElement(/* initialStatements= */ ImmutableList.of(), body);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FunctionDeclaration` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/FunctionDeclaration.java`
#### Snippet
```java
 */
@AutoValue
public abstract class FunctionDeclaration extends Expression {

  abstract JsDoc jsDoc();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Return` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Return.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class Return extends Statement {
  private static final Return EMPTY_RETURN = new AutoValue_Return(null);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ForOf` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ForOf.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class ForOf extends Statement {

  abstract String localVar();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `VariableReference` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/VariableReference.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class VariableReference extends Expression {

  abstract VariableDeclaration declaration();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Composite` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Composite.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Composite extends Expression {

  abstract Expression value();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Assignment` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Assignment.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Assignment extends Statement {
  abstract Expression lhs();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ExpressionStatement` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ExpressionStatement.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class ExpressionStatement extends Statement {

  public static ExpressionStatement of(Expression expression) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `HtmlTag` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/HtmlTag.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class HtmlTag extends Statement {

  public static final HtmlTag FRAGMENT_OPEN = createOpen("", ImmutableList.of());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MethodDeclaration` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ClassExpression.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class MethodDeclaration extends Expression {
    abstract String name();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ClassExpression` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ClassExpression.java`
#### Snippet
```java
 */
@AutoValue
public abstract class ClassExpression extends Expression {
  @Nullable
  abstract Expression baseClass();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `BinaryOperation` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/BinaryOperation.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class BinaryOperation extends Operation {
  abstract String operator();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Conditional` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Conditional.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Conditional extends Statement {
  abstract ImmutableList<IfThenPair<Statement>> conditions();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateLiteral` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/TemplateLiteral.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class TemplateLiteral extends Expression {

  abstract ImmutableList<Statement> body();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StatementList` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/StatementList.java`
#### Snippet
```java
/** Represents a sequence of statements. */
@AutoValue
public abstract class StatementList extends Statement {
  private static final StatementList EMPTY = new AutoValue_StatementList(ImmutableList.of());

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Bracket` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Bracket.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Bracket extends Operation {

  abstract Expression receiver();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ArrayLiteral` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ArrayLiteral.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class ArrayLiteral extends Expression {

  abstract ImmutableList<? extends Expression> elements();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StringLiteral` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/StringLiteral.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class StringLiteral extends Expression {

  static Expression create(String literalValue) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LineComment` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/LineComment.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class LineComment extends Statement {

  abstract String comment();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Operation` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Operation.java`
#### Snippet
```java

/** Base class for representing a JavaScript operation. */
abstract class Operation extends Expression {

  abstract int precedence();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `GoogRequire` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/GoogRequire.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class GoogRequire implements Comparable<GoogRequire> {

  private static final Expression GOOG_REQUIRE = dottedIdNoRequire("goog.require");
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UnaryOperation` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/UnaryOperation.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class UnaryOperation extends Operation {
  abstract String operator();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Leaf` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Leaf.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Leaf extends Expression {
  static Leaf create(String text, boolean isCheap, Iterable<GoogRequire> require) {
    return create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Ternary` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Ternary.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Ternary extends Operation {
  abstract Expression predicate();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TsxElement` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/TsxElement.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class TsxElement extends Expression {

  abstract HtmlTag openTag();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Group` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Group.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Group extends Operation {
  abstract Expression underlying();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DoWhile` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/DoWhile.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class DoWhile extends Statement {

  public static Builder builder() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/DoWhile.java`
#### Snippet
```java
  /** A builder for a {@link DoWhile}. */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setCondition(Expression condition);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Switch` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Switch.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Switch extends Statement {
  abstract Expression switchOn();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParamDecls` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ParamDecls.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class ParamDecls {

  abstract ImmutableList<ParamDecl> params();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Import` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Import.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Import extends Statement {

  static final String STAR = "*";
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `New` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/New.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class New extends Operation {

  abstract Expression ctor();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TaggedTemplateLiteral` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/TaggedTemplateLiteral.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class TaggedTemplateLiteral extends Operation {
  abstract Expression tag();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RangeComment` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/RangeComment.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class RangeComment extends Statement {

  abstract String comment();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `For` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/For.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class For extends Statement {

  abstract String localVar();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `File` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/File.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class File extends Statement {

  abstract String fileOverviewComments();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Param` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/JsDoc.java`
#### Snippet
```java
  @AutoValue
  @Immutable
  public abstract static class Param {
    abstract String annotationType();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `JsDoc` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/JsDoc.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class JsDoc {

  public static JsDoc getDefaultInstance() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/JsDoc.java`
#### Snippet
```java
  /** Builder for JsDoc. */
  @AutoValue.Builder
  public abstract static class Builder {

    abstract ImmutableList.Builder<Param> paramsBuilder();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParamDecl` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ParamDecl.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class ParamDecl {

  abstract String name();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Call` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/Call.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class Call extends Operation {
  abstract Expression receiver();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/VariableDeclaration.java`
#### Snippet
```java
  /** A builder for a {@link VariableDeclaration}. */
  @AutoValue.Builder
  public abstract static class Builder {

    abstract Builder setVarName(String name);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `VariableDeclaration` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/VariableDeclaration.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class VariableDeclaration extends Statement {

  public static Builder builder(String name) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TranslationContext` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/internal/TranslationContext.java`
#### Snippet
```java
 */
@AutoValue
public abstract class TranslationContext {

  public abstract SoyToJsVariableMappings soyToJsVariableMappings();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Call` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java

  @AutoValue
  abstract static class Call extends FieldAccess {
    abstract String getter();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Id` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java

  @AutoValue
  abstract static class Id extends FieldAccess {
    abstract String fieldName();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FieldAccess` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
   * precedence issue.
   */
  abstract static class FieldAccess {

    @ForOverride
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ProtoCall` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java

  @AutoValue
  abstract static class ProtoCall extends FieldAccess {

    private enum Type {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ObjectLiteral` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/dsl/ObjectLiteral.java`
#### Snippet
```java
@AutoValue
@Immutable
abstract class ObjectLiteral extends Expression {

  abstract ImmutableMap<Expression, Expression> values();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Callee` has no concrete subclass
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
  /** Represents a callable function symbol. */
  @AutoValue
  public abstract static class Callee {
    Callee() {}

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `OutputVar` has no concrete subclass
in `java/src/com/google/template/soy/pysrc/internal/PyCodeBuilder.java`
#### Snippet
```java

  @AutoValue
  abstract static class OutputVar {
    static OutputVar create(String name, boolean isInited) {
      return new AutoValue_PyCodeBuilder_OutputVar(name, isInited);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `NamespaceAndName` has no concrete subclass
in `java/src/com/google/template/soy/pysrc/internal/GenPyCodeVisitor.java`
#### Snippet
```java

  @AutoValue
  abstract static class NamespaceAndName {
    static NamespaceAndName fromModule(String moduleName) {
      String namespace = moduleName;
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ProtoEnumImportType` has no concrete subclass
in `java/src/com/google/template/soy/types/ProtoEnumImportType.java`
#### Snippet
```java
/** Representing an imported proto enum type. */
@AutoValue
public abstract class ProtoEnumImportType extends ImportType {

  public static ProtoEnumImportType create(EnumDescriptor descriptor) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ProtoImportType` has no concrete subclass
in `java/src/com/google/template/soy/types/ProtoImportType.java`
#### Snippet
```java
/** Representing an imported proto message type. */
@AutoValue
public abstract class ProtoImportType extends ImportType {

  public static ProtoImportType create(Descriptor descriptor) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Member` has no concrete subclass
in `java/src/com/google/template/soy/types/RecordType.java`
#### Snippet
```java
  /** The {name, type} pair that is a record member. */
  @AutoValue
  public abstract static class Member {
    public abstract String name();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
  /** Builder pattern. */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setAllowExtraAttributes(boolean allowAttributes);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Parameter` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class Parameter {

    private static final Pattern ATTR_NAME = Pattern.compile("^[a-z_][a-z_\\d]*(-[a-z_\\d]+)*$");
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
    /** Builder for {@link DataAllCallSituation} */
    @AutoValue.Builder
    public abstract static class Builder {
      public abstract Builder setTemplateName(String templateName);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DataAllCallSituation` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class DataAllCallSituation {
    public static Builder builder() {
      return new AutoValue_TemplateType_DataAllCallSituation.Builder();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateType` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
/** Template type, containing a list of named, typed parameters and a return type. */
@AutoValue
public abstract class TemplateType extends SoyType {

  public static final String ATTRIBUTES_HIDDEN_PARAM_NAME = "__soyInternalAttributes";
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
    /** Builder for {@link Parameter} */
    @AutoValue.Builder
    public abstract static class Builder {
      public abstract Builder setName(String name);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ProtoModuleImportType` has no concrete subclass
in `java/src/com/google/template/soy/types/ProtoModuleImportType.java`
#### Snippet
```java
/** Representing an imported proto module/file type, i.e. "import * as p from 'p.proto'; */
@AutoValue
public abstract class ProtoModuleImportType extends ImportType {

  public static ProtoModuleImportType create(FileDescriptor descriptor) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateModuleImportType` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateModuleImportType.java`
#### Snippet
```java
/** Representing an imported template module/file type, i.e. "import * as p from 'p.soy'; */
@AutoValue
public abstract class TemplateModuleImportType extends ImportType {

  public static TemplateModuleImportType create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ImportType` has no concrete subclass
in `java/src/com/google/template/soy/types/ImportType.java`
#### Snippet
```java

/** Base type for all imported symbol types. */
public abstract class ImportType extends SoyType {

  @Override
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FunctionType` has no concrete subclass
in `java/src/com/google/template/soy/types/FunctionType.java`
#### Snippet
```java
/** Function type, containing a list of named, typed parameters and a return type. */
@AutoValue
public abstract class FunctionType extends SoyType {

  public static FunctionType of(Collection<Parameter> parameters, SoyType returnType) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Parameter` has no concrete subclass
in `java/src/com/google/template/soy/types/FunctionType.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class Parameter {

    public static Parameter of(String name, SoyType type) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateImportType` has no concrete subclass
in `java/src/com/google/template/soy/types/TemplateImportType.java`
#### Snippet
```java
/** Representing an imported template. */
@AutoValue
public abstract class TemplateImportType extends ImportType {

  public static TemplateImportType create(String fqn) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ProtoExtensionImportType` has no concrete subclass
in `java/src/com/google/template/soy/types/ProtoExtensionImportType.java`
#### Snippet
```java
/** Representing an imported proto extension type. */
@AutoValue
public abstract class ProtoExtensionImportType extends ImportType {

  public static ProtoExtensionImportType create(FieldDescriptor descriptor) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `NamedTypeNode` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/NamedTypeNode.java`
#### Snippet
```java
/** A simple named type (may be an intrinsic type, '?', or a custom type). */
@AutoValue
public abstract class NamedTypeNode extends TypeNode {
  public static NamedTypeNode create(Identifier identifier) {
    return new AutoValue_NamedTypeNode(identifier.location(), identifier);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RecordTypeNode` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/RecordTypeNode.java`
#### Snippet
```java
/** A record type (eg, [a: someType, b: otherType]). */
@AutoValue
public abstract class RecordTypeNode extends TypeNode {

  public static RecordTypeNode create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Property` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/RecordTypeNode.java`
#### Snippet
```java
  /** A single property declaration in a record type. */
  @AutoValue
  public abstract static class Property {
    public static Property create(
        SourceLocation nameLocation, String name, boolean optional, TypeNode type) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `UnionTypeNode` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/UnionTypeNode.java`
#### Snippet
```java
/** A union type (eg, a|b). */
@AutoValue
public abstract class UnionTypeNode extends TypeNode {

  public static UnionTypeNode create(Iterable<TypeNode> candidates) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateTypeNode` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/TemplateTypeNode.java`
#### Snippet
```java
/** Node representing a template type, e.g. () => html. */
@AutoValue
public abstract class TemplateTypeNode extends TypeNode {

  public static TemplateTypeNode create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Parameter` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/TemplateTypeNode.java`
#### Snippet
```java
  /** A single named, typed parameter to a template. */
  @AutoValue
  public abstract static class Parameter {
    public static Parameter create(
        SourceLocation nameLocation,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `GenericTypeNode` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/GenericTypeNode.java`
#### Snippet
```java
/** A typename with type arguments (eg, list<someType>). */
@AutoValue
public abstract class GenericTypeNode extends TypeNode {
  GenericTypeNode() {}

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeNode` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/TypeNode.java`
#### Snippet
```java

/** The base class for an immutable node in the type AST. */
public abstract class TypeNode {

  @Nullable private SoyType resolvedType;
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Parameter` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/FunctionTypeNode.java`
#### Snippet
```java
  /** A single named, typed parameter to a template. */
  @AutoValue
  public abstract static class Parameter {
    public static Parameter create(
        SourceLocation nameLocation, String name, String sourceName, TypeNode type) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FunctionTypeNode` has no concrete subclass
in `java/src/com/google/template/soy/types/ast/FunctionTypeNode.java`
#### Snippet
```java
/** Node representing a function type, e.g. (p1:string) => int. */
@AutoValue
public abstract class FunctionTypeNode extends TypeNode {

  public static FunctionTypeNode create(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DescriptorKey` has no concrete subclass
in `java/src/com/google/template/soy/types/SoyTypeRegistryBuilder.java`
#### Snippet
```java

  @AutoValue
  abstract static class DescriptorKey {
    public static DescriptorKey of(GenericDescriptor d) {
      if (d instanceof FileDescriptor) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SyntheticVarName` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/SyntheticVarName.java`
#### Snippet
```java
 */
@AutoValue
abstract class SyntheticVarName {

  static SyntheticVarName renderee() {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StreamingDirectiveWithArgs` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java

  @AutoValue
  abstract static class StreamingDirectiveWithArgs {
    static StreamingDirectiveWithArgs create(SoyJbcSrcPrintDirective.Streamable directive) {
      return new AutoValue_PrintDirectives_StreamingDirectiveWithArgs(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AppendableAndFlushBuffersDepth` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java

  @AutoValue
  abstract static class AppendableAndFlushBuffersDepth {
    static AppendableAndFlushBuffersDepth create(
        AppendableExpression appendableExpression, int flushDepth) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeWriter` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/SoyFileCompiler.java`
#### Snippet
```java

  @AutoValue
  abstract static class TypeWriter {
    static TypeWriter create(SoyFileNode node) {
      TypeInfo fileType =
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Placeholder` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
  interface PlaceholderCompiler {
    @AutoValue
    abstract static class Placeholder {
      static Placeholder create(Expression soyValueProvider, boolean requiresDetachLogicToResolve) {
        soyValueProvider.checkAssignableTo(SOY_VALUE_PROVIDER_TYPE);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PlaceholderAndEndTag` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java

  @AutoValue
  abstract static class PlaceholderAndEndTag {
    static PlaceholderAndEndTag create(PlaceholderCompiler.Placeholder placeholder) {
      return create(placeholder, Optional.empty());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `VarKey` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class VarKey {
    enum Kind {
      /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SaveRestoreState` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
  /** Statements for saving and restoring local variables in class fields. */
  @AutoValue
  abstract static class SaveRestoreState {
    abstract Statement save();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `StaticFieldVariable` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/FieldManager.java`
#### Snippet
```java

  @AutoValue
  abstract static class StaticFieldVariable {
    abstract FieldRef field();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CompiledForeachRangeArgs` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java

  @AutoValue
  abstract static class CompiledForeachRangeArgs {
    /** Current loop index. */
    abstract Expression start();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ListOfExpressionsAndInitializer` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java

  @AutoValue
  abstract static class ListOfExpressionsAndInitializer {
    static ListOfExpressionsAndInitializer create(
        ImmutableList<Expression> expressions, Statement initializer) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RecordOrPositional` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java

  @AutoValue
  abstract static class RecordOrPositional {
    static RecordOrPositional create(Expression record) {
      return create(Suppliers.ofInstance(record), Optional.empty());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ExpressionAndInitializer` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java

  @AutoValue
  abstract static class ExpressionAndInitializer {
    static ExpressionAndInitializer create(Expression expression, Statement initializer) {
      return new AutoValue_SoyNodeCompiler_ExpressionAndInitializer(expression, initializer);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CompiledMethodBody` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java

  @AutoValue
  abstract static class CompiledMethodBody {
    static CompiledMethodBody create(Statement body, int numDetaches) {
      return new AutoValue_SoyNodeCompiler_CompiledMethodBody(body, numDetaches);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ReattachState` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java

  @AutoValue
  abstract static class ReattachState {
    static ReattachState create(Label reattachPoint, Optional<Statement> restore) {
      return new AutoValue_DetachState_ReattachState(reattachPoint, restore);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CompiledTemplateMetadata` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
 */
@AutoValue
abstract class CompiledTemplateMetadata {

  /**
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java

  @AutoValue.Builder
  abstract static class Builder {
    abstract Builder setRenderMethod(MethodRef value);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `IfBlock` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/ControlFlow.java`
#### Snippet
```java

  @AutoValue
  abstract static class IfBlock {
    static IfBlock create(Expression cond, Statement block) {
      cond.checkAssignableTo(Type.BOOLEAN_TYPE);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AnalysisResult` has no concrete subclass
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  /** Returns the result of {@link #compileForAnalysis}. */
  @AutoValue
  public abstract static class AnalysisResult {
    AnalysisResult() {}

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `HeaderResult` has no concrete subclass
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  @AutoValue
  abstract static class HeaderResult {
    abstract SoyFileSetNode fileSet();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParentCapture` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class ParentCapture {
    static ParentCapture create(FieldRef captureField, Expression parentExpression) {
      if (parentExpression.isNonNullable()) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LazyClosure` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
final class LazyClosureCompiler {
  @AutoValue
  abstract static class LazyClosure {
    static LazyClosure create(
        String name,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/api/PluginRuntimeInstanceInfo.java`
#### Snippet
```java
  /** Builder for {@link PluginRuntimeInstanceInfo}, with an accumulator for source locations. */
  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder setPluginName(String value);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PluginRuntimeInstanceInfo` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/api/PluginRuntimeInstanceInfo.java`
#### Snippet
```java
 */
@AutoValue
public abstract class PluginRuntimeInstanceInfo {
  private static final char FIELD_DELIMITER = '|';
  private static final Splitter FIELD_SPLITTER = Splitter.on(FIELD_DELIMITER);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FrameKey` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/shared/SaveStateMetaFactory.java`
#### Snippet
```java

  @AutoValue
  abstract static class FrameKey {
    static FrameKey create(ImmutableList<Class<?>> fieldTypes) {
      return new AutoValue_SaveStateMetaFactory_FrameKey(fieldTypes);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DetachableSoyValueProviderProvider` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProviderProvider.java`
#### Snippet
```java
 * SoyValue#render}.
 */
public abstract class DetachableSoyValueProviderProvider implements SoyValueProvider {
  protected SoyValueProvider resolvedValueProvider = null;

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AppendableAndOptions` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyJbcSrcPrintDirective.java`
#### Snippet
```java
     */
    @AutoValue
    abstract class AppendableAndOptions {
      /**
       * Creates an appendable that doesn't need to be closed.
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TypeInfo` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/restricted/TypeInfo.java`
#### Snippet
```java
 */
@AutoValue
public abstract class TypeInfo {
  public static TypeInfo create(Class<?> clazz) {
    Type type = Type.getType(clazz);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ConstructorRef` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/restricted/ConstructorRef.java`
#### Snippet
```java
/** A reference to a type that can be constructed at runtime. */
@AutoValue
public abstract class ConstructorRef {
  /**
   * Returns a new {@link ConstructorRef} that refers to a constructor on the given type with the
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `LineNumberTableEntry` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/restricted/CodeBuilder.java`
#### Snippet
```java

  @AutoValue
  abstract static class LineNumberTableEntry {
    static LineNumberTableEntry create(Label label, int lineNumber) {
      return new AutoValue_CodeBuilder_LineNumberTableEntry(label, lineNumber);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FieldRef` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/restricted/FieldRef.java`
#### Snippet
```java
/** Representation of a field in a java class. */
@AutoValue
public abstract class FieldRef {
  public static final FieldRef BOOLEAN_DATA_FALSE =
      staticFieldReference(BooleanData.class, "FALSE").asNonNull();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MethodRef` has no concrete subclass
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
/** A reference to a method that can be called at runtime. */
@AutoValue
public abstract class MethodRef {

  public static final Type[] NO_METHOD_ARGS = {};
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ActiveEdge` has no concrete subclass
in `java/src/com/google/template/soy/passes/htmlmatcher/ActiveEdge.java`
#### Snippet
```java
 */
@AutoValue
public abstract class ActiveEdge {
  public abstract HtmlMatcherGraphNode getGraphNode();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ReadMethodData` has no concrete subclass
in `java/src/com/google/template/soy/plugin/java/ReadMethodData.java`
#### Snippet
```java
/** Information about a method that was read. */
@AutoValue
public abstract class ReadMethodData {

  /** True if both the method and the containing class are public. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ValueType` has no concrete subclass
in `java/src/com/google/template/soy/plugin/java/internal/ValidatorValue.java`
#### Snippet
```java

  @AutoOneOf(ValueType.Type.class)
  abstract static class ValueType {
    enum Type {
      CONSTANT_NULL,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PluginMetadata` has no concrete subclass
in `java/src/com/google/template/soy/plugin/java/internal/PluginAnalyzer.java`
#### Snippet
```java
  /** Simple metadata about the plugin. */
  @AutoValue
  public abstract static class PluginMetadata {
    static PluginMetadata create(
        boolean accessesContext,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ValidationResult` has no concrete subclass
in `java/src/com/google/template/soy/plugin/java/internal/ValidatorFactory.java`
#### Snippet
```java

  @AutoValue
  abstract static class ValidationResult {
    enum Result {
      VALID,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MethodSignature` has no concrete subclass
in `java/src/com/google/template/soy/plugin/java/restricted/MethodSignature.java`
#### Snippet
```java
 */
@AutoValue
public abstract class MethodSignature {

  private static final ImmutableMap<String, Class<?>> PRIMITIVE_TYPE_INDEX =
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RangeArgs` has no concrete subclass
in `java/src/com/google/template/soy/shared/RangeArgs.java`
#### Snippet
```java
 */
@AutoValue
public abstract class RangeArgs {
  private static RangeArgs create(List<ExprNode> args) {
    switch (args.size()) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ResolvedSignature` has no concrete subclass
in `java/src/com/google/template/soy/shared/internal/ResolvedSignature.java`
#### Snippet
```java
 */
@AutoValue
public abstract class ResolvedSignature {

  /** A list of parameter types. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `PartialSignature` has no concrete subclass
in `java/src/com/google/template/soy/plugin/java/internal/CompiledJarsPluginSignatureReader.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class PartialSignature {
    abstract String methodName();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `GeneratedFile` has no concrete subclass
in `java/src/com/google/template/soy/shared/internal/gencode/GeneratedFile.java`
#### Snippet
```java
/** Wrapper for a generated file to write. Holds the file name and contents. */
@AutoValue
public abstract class GeneratedFile {
  public static GeneratedFile create(String fileName, String contents) {
    return create("", fileName, contents, null);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DelTemplateKey` has no concrete subclass
in `java/src/com/google/template/soy/soytree/TemplateDelegateNode.java`
#### Snippet
```java
  @AutoValue
  @VisibleForTesting
  public abstract static class DelTemplateKey {

    static DelTemplateKey create(String name, String variant) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `SamenessKeyImpl` has no concrete subclass
in `java/src/com/google/template/soy/soytree/MsgHtmlTagNode.java`
#### Snippet
```java

  @AutoValue
  abstract static class SamenessKeyImpl implements SamenessKey {
    static SamenessKeyImpl create(
        String userSuppliedPlaceholderName, String fullTagText, VeLogNode.SamenessKey key) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Summary` has no concrete subclass
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
  @Immutable
  @AutoValue
  public abstract static class Summary {
    public static Summary create(String name) {
      return create(name, /* example= */ Optional.empty());
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `MessagePlaceholder` has no concrete subclass
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
@Immutable
@AutoValue
public abstract class MessagePlaceholder {
  public static final String PHNAME_ATTR = "phname";
  public static final String PHEX_ATTR = "phex";
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ModNameDeclaration` has no concrete subclass
in `java/src/com/google/template/soy/soytree/ModNameDeclaration.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class ModNameDeclaration {

  public static ModNameDeclaration create(SourceLocation location, Identifier name) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RepresentativeNodes` has no concrete subclass
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
   */
  @AutoValue
  abstract static class RepresentativeNodes {
    static RepresentativeNodes createFromNode(MsgNode msgNode, ErrorReporter reporter) {
      ListMultimap<String, MsgSubstUnitNode> baseNameToRepNodesMap = LinkedListMultimap.create();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `AliasDeclaration` has no concrete subclass
in `java/src/com/google/template/soy/soytree/AliasDeclaration.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class AliasDeclaration {

  public static AliasDeclaration create(SourceLocation location, Identifier namespace) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Comment` has no concrete subclass
in `java/src/com/google/template/soy/soytree/Comment.java`
#### Snippet
```java
/** A comment from a Soy source file. */
@AutoValue
public abstract class Comment {

  /** The comment type. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateMetadata` has no concrete subclass
in `java/src/com/google/template/soy/soytree/TemplateMetadata.java`
#### Snippet
```java
 */
@AutoValue
public abstract class TemplateMetadata {

  /** Builds a Template from a parsed TemplateNode. */
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/soytree/TemplateMetadata.java`
#### Snippet
```java
  /** Builder for {@link TemplateMetadata} */
  @AutoValue.Builder
  public abstract static class Builder {
    public abstract Builder setSoyFileKind(SoyFileKind location);

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DelegatingVarDefn` has no concrete subclass
in `java/src/com/google/template/soy/exprtree/DelegatingVarDefn.java`
#### Snippet
```java

/** Delegating implementation of {@link VarDefn}. */
public abstract class DelegatingVarDefn implements VarDefn {
  private final VarDefn delegate;

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ConstantImpl` has no concrete subclass
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java

  @AutoValue
  abstract static class ConstantImpl implements FileMetadata.Constant {

    private static ConstantImpl of(String name, SoyType type) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `CompilationUnitAndKind` has no concrete subclass
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
  /** Simple tuple of un an-evaluated compilation unit containing information about dependencies. */
  @AutoValue
  public abstract static class CompilationUnitAndKind {
    public static CompilationUnitAndKind create(
        SoyFileKind fileKind, CompilationUnit compilationUnit) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParseContext` has no concrete subclass
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
  /** Parameter bean. */
  @AutoValue
  abstract static class ParseContext {
    static ParseContext of(ErrorReporter errorReporter, SoyTypeRegistry typeRegistry) {
      return new AutoValue_Metadata_ParseContext(errorReporter, typeRegistry);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DepsFileMetadata` has no concrete subclass
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
  /** FileMetadata for deps. */
  @AutoValue
  abstract static class DepsFileMetadata extends AbstractFileMetadata {

    protected abstract SoyFileP proto();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ExternImpl` has no concrete subclass
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java

  @AutoValue
  abstract static class ExternImpl implements FileMetadata.Extern {

    private static ExternImpl of(String name, FunctionType signature) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DepsFileSetMetadata` has no concrete subclass
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
  /** FileSetMetadata for deps. */
  @AutoValue
  abstract static class DepsFileSetMetadata implements FileSetMetadata {

    abstract ImmutableList<CompilationUnitAndKind> units();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `BidiWrappingText` has no concrete subclass
in `java/src/com/google/template/soy/internal/i18n/BidiFormatter.java`
#### Snippet
```java
  /** The text used to bidi wrap a string. */
  @AutoValue
  public abstract static class BidiWrappingText {
    static BidiWrappingText create(String beforeText, String afterText) {
      return new AutoValue_BidiFormatter_BidiWrappingText(beforeText, afterText);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FunctionRef` has no concrete subclass
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
   */
  @AutoOneOf(FunctionRef.Type.class)
  public abstract static class FunctionRef {
    enum Type {
      SOY_FUNCTION,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ExternRef` has no concrete subclass
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
  /** All the information a runtime needs to execute a call to an extern. */
  @AutoValue
  public abstract static class ExternRef {
    public static ExternRef of(SourceFilePath path, String name, FunctionType signature) {
      return new AutoValue_FunctionNode_ExternRef(path, name, signature);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateName` has no concrete subclass
in `java/src/com/google/template/soy/parseinfo/TemplateName.java`
#### Snippet
```java
@AutoValue
@Immutable
public abstract class TemplateName {

  public static TemplateName of(String name) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `RuleWithExemptions` has no concrete subclass
in `java/src/com/google/template/soy/conformance/RuleWithExemptions.java`
#### Snippet
```java
 */
@AutoValue
abstract class RuleWithExemptions {
  static RuleWithExemptions create(
      Rule<? extends Node> rule,
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `FileInfo` has no concrete subclass
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java
  /** The transformed {@link SoyFileNode}. */
  @AutoValue
  public abstract static class FileInfo {

    abstract SoyFileNode fileNode();
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `ParamInfo` has no concrete subclass
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java
  /** The transformed {@link TemplateParam}. */
  @AutoValue
  public abstract static class ParamInfo {
    static ParamInfo of(TemplateParam param, ParamStatus status) {
      return of(
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TemplateInfo` has no concrete subclass
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java
  /** The transformed {@link TemplateNode}. */
  @AutoValue
  public abstract static class TemplateInfo {

    static TemplateInfo error(TemplateNode template, TemplateStatus status) {
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Result` has no concrete subclass
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
  interface Processor {
    @AutoValue
    abstract static class Result {
      static Result create(Context next, int numCharactersConsumed) {
        return new AutoValue_RawTextContextUpdater_Processor_Result(next, numCharactersConsumed);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `InferencesAndContext` has no concrete subclass
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java

  @AutoValue
  abstract static class InferencesAndContext {
    static InferencesAndContext create(Inferences inferences, Context context) {
      return new AutoValue_InferenceEngine_InferencesAndContext(inferences, context);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `DerivedNameAndContext` has no concrete subclass
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java

  @AutoValue
  abstract static class DerivedNameAndContext {
    static DerivedNameAndContext create(String derivedName, Context context) {
      return new AutoValue_InferenceEngine_DerivedNameAndContext(derivedName, context);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `NamedExprNode` has no concrete subclass
in `java/src/com/google/template/soy/treebuilder/ExprNodes.java`
#### Snippet
```java
   */
  @AutoValue
  public abstract static class NamedExprNode {
    public abstract String name();

```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Context` has no concrete subclass
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
@Immutable
@AutoValue
abstract class Context {

  // TODO(lukes): consider implementing as an @AutoValue
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `Builder` has no concrete subclass
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
  /** A mutable builder for {@link Context}s. */
  @AutoValue.Builder
  abstract static class Builder {
    @ForOverride
    abstract Builder setState(HtmlContext state);
```

### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `TagAndWs` has no concrete subclass
in `java/src/com/google/template/soy/basicfunctions/HtmlToText.java`
#### Snippet
```java

  @AutoValue
  abstract static class TagAndWs {
    static TagAndWs of(String tagName, boolean preserveWhitespace) {
      return new AutoValue_HtmlToText_TagAndWs(tagName, preserveWhitespace);
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    ParseResult(
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      this.soyTree = soyTree;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CssRegistry`
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      this.soyTree = soyTree;
      this.registry = registry;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/logging/GetMetadataMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    checkArgument(args.size() == 1);
    return factory.callStaticMethod(Methods.METHOD, args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/logging/GetMetadataMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    checkArgument(args.size() == 1);
    return factory.callModuleFunction("soy.velog", "$$getMetadata", args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ValidatedLoggableElement`
in `java/src/com/google/template/soy/logging/ValidatedLoggingConfig.java`
#### Snippet
```java
  private final ImmutableMap<String, ValidatedLoggableElement> elementsByName;

  private ValidatedLoggingConfig(ImmutableMap<String, ValidatedLoggableElement> elementsByName) {
    this.elementsByName = elementsByName;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyFunction`
in `java/src/com/google/template/soy/SoyModule.java`
#### Snippet
```java
  @Provides
  SoyFileSet.Builder provideBuilder(
      Set<SoyFunction> pluginFunctions, Set<SoyPrintDirective> pluginDirectives) {
    return SoyFileSet.builder()
        .addSoyFunctions(pluginFunctions)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyPrintDirective`
in `java/src/com/google/template/soy/SoyModule.java`
#### Snippet
```java
  @Provides
  SoyFileSet.Builder provideBuilder(
      Set<SoyFunction> pluginFunctions, Set<SoyPrintDirective> pluginDirectives) {
    return SoyFileSet.builder()
        .addSoyFunctions(pluginFunctions)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/logging/GetVeMetadataMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    checkArgument(args.size() == 1);
    return factory.callModuleFunction("soy.velog", "$$getVeMetadata", args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/logging/GetVeMetadataMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    checkArgument(args.size() == 1);
    return factory.callStaticMethod(Methods.METHOD, args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
  @VisibleForTesting
  static List<FileDescriptor> parseProtos(
      List<File> protoFileDescriptors,
      SoyInputCache cache,
      SoyCompilerFileReader reader,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
   */
  void writeFiles(
      List<File> srcs, List<String> outFileContents, @Nullable String locale, boolean omitIfEmpty) {
    if (srcs.size() != outFileContents.size()) {
      throw new AssertionError(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SourceFilePath`
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
  }

  ImmutableMap<SourceFilePath, Path> getOutputFilePathsForInputs(List<SourceFilePath> srcs) {
    return srcs.stream()
        .collect(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyTemplateParam`
in `java/src/com/google/template/soy/data/SoyTemplatesRestrictedApi.java`
#### Snippet
```java

    private static ImmutableMap<String, ParamRequisiteness> paramsAsMap(
        ImmutableSet<SoyTemplateParam<?>> params) {
      return params.stream()
          .collect(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValueProvider`
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java
    SoyValueProvider delegate;

    LazyProvider(Supplier<SoyValueProvider> delegateProvider) {
      this.delegateProvider = delegateProvider;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends K`
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueMap.java`
#### Snippet
```java
      ProtoFieldInterpreter keyFieldInterpreter,
      ProtoFieldInterpreter valueFieldInterpreter,
      Class<K> keyClass) {
    rawMap = ImmutableMap.copyOf(map);
    wrappedValues = new HashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/data/internal/ParamStore.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    localStore.forEach(action);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Function`
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java

  protected static String escapePlaceholder(
      String placeholder, List<Function<String, String>> escapers) {
    // TODO(lukes): we should be able to do this at compile time
    for (Function<String, String> escaper : escapers) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValueProvider`
in `java/src/com/google/template/soy/data/internal/SoyRecordImpl.java`
#### Snippet
```java
  }

  public static SoyRecordImpl forProviderMap(Map<String, SoyValueProvider> map) {
    return new SoyRecordImpl(ImmutableMap.copyOf(map));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/data/internal/SoyRecordImpl.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    map.forEach(action);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/data/internal/DictImpl.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    typeTracker.maybeSetLegacyObjectMapOrRecordType();
    providerMap.forEach(action);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyMsgPart`
in `java/src/com/google/template/soy/msgs/internal/MsgUtils.java`
#### Snippet
```java

  private static void doBuildMsgPartsForChildren(
      MsgBlockNode parent, MsgNode msgNode, ImmutableList.Builder<SoyMsgPart> msgParts) {
    for (StandaloneNode child : parent.getChildren()) {
      if (child instanceof RawTextNode) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
      ImmutableList.Builder<SoyMsgPart> newMsgPartsBuilder,
      StringBuilder currRawTextSb,
      List<SoyMsgPart> origMsgParts,
      boolean isInPlrselPart) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValueProvider`
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
  private final ImmutableMap<String, SoyValueProvider> data;

  protected BaseSoyTemplateImpl(ImmutableMap<String, SoyValueProvider> data) {
    this.data = data;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgBundleCompactor.java`
#### Snippet
```java

  /** Compacts a set of message parts. */
  private ImmutableList<SoyMsgPart> compactParts(ImmutableList<SoyMsgPart> parts) {
    ImmutableList.Builder<SoyMsgPart> builder = ImmutableList.builder();
    for (SoyMsgPart part : parts) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/msgs/restricted/MsgPartUtils.java`
#### Snippet
```java
   * @return Whether there are any plural or select parts.
   */
  public static boolean hasPlrselPart(List<SoyMsgPart> msgParts) {
    // If there is a plrsel part then it has to be the first and only part in the list
    if (msgParts.size() == 1) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SourceLocationAndTemplate`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
     */
    @CanIgnoreReturnValue
    public Builder addAllSourceLocations(Iterable<SourceLocationAndTemplate> sourceLocations) {
      this.sourceLocations.addAll(sourceLocations);
      return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GoogRequire`
in `java/src/com/google/template/soy/jssrc/dsl/Cast.java`
#### Snippet
```java

  @Override
  public void collectRequires(Consumer<GoogRequire> collector) {
    for (GoogRequire require : googRequires()) {
      collector.accept(require);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SourceFilePath`
in `java/src/com/google/template/soy/error/ErrorReporter.java`
#### Snippet
```java

  /** Creates a new ErrorReporter which can create source snippets from the given files. */
  public static ErrorReporter create(Map<SourceFilePath, SoyFileSupplier> filePathsToSuppliers) {
    return new ErrorReporterImpl(ImmutableMap.copyOf(filePathsToSuppliers));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyFileSupplier`
in `java/src/com/google/template/soy/error/ErrorReporter.java`
#### Snippet
```java

  /** Creates a new ErrorReporter which can create source snippets from the given files. */
  public static ErrorReporter create(Map<SourceFilePath, SoyFileSupplier> filePathsToSuppliers) {
    return new ErrorReporterImpl(ImmutableMap.copyOf(filePathsToSuppliers));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyFileSupplier`
in `java/src/com/google/template/soy/error/ErrorReporterImpl.java`
#### Snippet
```java
    }

    SoyError asSoyError(ImmutableMap<SourceFilePath, SoyFileSupplier> filePathsToSuppliers) {
      final Optional<String> snippet =
          Optional
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Statement`
in `java/src/com/google/template/soy/jssrc/dsl/Statement.java`
#### Snippet
```java

  /** Creates a new code chunk representing the concatenation of the given statements. */
  public static Statement of(Iterable<Statement> stmts) {
    ImmutableList<Statement> copy = ImmutableList.copyOf(stmts);
    return copy.size() == 1 ? copy.get(0) : StatementList.create(copy);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyError`
in `java/src/com/google/template/soy/error/SoyErrors.java`
#### Snippet
```java
  }

  private static String formatErrorsInternal(Iterable<SoyError> errors, boolean messageOnly) {
    int numErrors = 0;
    int numWarnings = 0;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Statement`
in `java/src/com/google/template/soy/jssrc/dsl/ImportsBuilder.java`
#### Snippet
```java
  }

  public void ingest(Iterable<Statement> statements) {
    List<GoogRequire> requires = new ArrayList<>();
    for (Statement statement : statements) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Statement`
in `java/src/com/google/template/soy/jssrc/dsl/TsArrowFunction.java`
#### Snippet
```java
  private final ImmutableList<Statement> bodyStmts;

  TsArrowFunction(ParamDecls params, Expression returnType, ImmutableList<Statement> bodyStmts) {
    this.params = params;
    this.returnType = returnType;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GoogRequire`
in `java/src/com/google/template/soy/jssrc/dsl/Leaf.java`
#### Snippet
```java

  @Override
  public void collectRequires(Consumer<GoogRequire> collector) {
    for (GoogRequire require : requires()) {
      collector.accept(require);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GoogRequire`
in `java/src/com/google/template/soy/jssrc/dsl/Leaf.java`
#### Snippet
```java
@Immutable
abstract class Leaf extends Expression {
  static Leaf create(String text, boolean isCheap, Iterable<GoogRequire> require) {
    return create(
        new JsExpr(text, Integer.MAX_VALUE),
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jssrc/dsl/GenericType.java`
#### Snippet
```java
  private final ImmutableList<Expression> generics;

  GenericType(Expression className, ImmutableList<Expression> generics) {
    this.className = className;
    this.generics = generics;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
      Expression expr,
      SoyJsSrcPrintDirective directive,
      List<Expression> args,
      SourceLocation location,
      ErrorReporter errorReporter) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jssrc/dsl/SoyJsPluginUtils.java`
#### Snippet
```java
  public static Expression applySoyFunction(
      SoyJsSrcFunction soyJsSrcFunction,
      List<Expression> args,
      SourceLocation location,
      ErrorReporter errorReporter) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GoogRequire`
in `java/src/com/google/template/soy/jssrc/dsl/New.java`
#### Snippet
```java

  @Override
  public void collectRequires(Consumer<GoogRequire> collector) {
    if (googRequire() != null) {
      collector.accept(googRequire());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GoogRequire`
in `java/src/com/google/template/soy/jssrc/dsl/JsDoc.java`
#### Snippet
```java
  public abstract ImmutableList<Param> params();

  public void collectRequires(Consumer<GoogRequire> collector) {
    for (GoogRequire require : requires()) {
      collector.accept(require);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/jssrc/internal/VeLogFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callModuleFunction(
        "soy.velog",
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
  }

  private static void collectIjParams(TemplateNode template, Set<String> into) {
    for (TemplateParam param : template.getInjectedParams()) {
      into.add(param.name());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateNode`
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java

  private static ImmutableMap<String, ImmutableSortedSet<String>> buildTemplateToIjParamsInfoMap(
      ImmutableMap<String, TemplateNode> basicTemplates,
      DelTemplateSelector<TemplateNode> delTemplates) {
    Map<String, ImmutableSortedSet<String>> templateNameToIjs = new LinkedHashMap<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateNode`
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
  private static ImmutableMap<String, ImmutableSortedSet<String>> buildTemplateToIjParamsInfoMap(
      ImmutableMap<String, TemplateNode> basicTemplates,
      DelTemplateSelector<TemplateNode> delTemplates) {
    Map<String, ImmutableSortedSet<String>> templateNameToIjs = new LinkedHashMap<>();
    Set<TemplateNode> soFar = Sets.newIdentityHashSet();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TemplateNode`
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java

  private static void maybeAddTemplateToModifiableMap(
      TemplateNode template, DelTemplateSelector.Builder<TemplateNode> delTemplates) {
    if (!(template instanceof TemplateBasicNode)) {
      return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jssrc/dsl/Expression.java`
#### Snippet
```java
   * Generator#conditionalExpression} instead.
   */
  public static Expression operation(Operator op, List<Expression> operands) {
    Preconditions.checkArgument(operands.size() == op.getNumOperands());
    Preconditions.checkArgument(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super GoogRequire`
in `java/src/com/google/template/soy/jssrc/dsl/VariableDeclaration.java`
#### Snippet
```java

  @Override
  public void collectRequires(Consumer<GoogRequire> collector) {
    for (GoogRequire require : allRequires()) {
      collector.accept(require);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jssrc/internal/JavaScriptValueFactoryImpl.java`
#### Snippet
```java
  }

  private static List<JavaScriptValue> wrapParams(List<Expression> params) {
    List<JavaScriptValue> exprs = new ArrayList<>(params.size());
    for (Expression e : params) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/jssrc/internal/JavaScriptValueFactoryImpl.java`
#### Snippet
```java
  }

  private static List<Expression> unwrapParams(List<JavaScriptValue> params) {
    List<Expression> exprs = new ArrayList<>(params.size());
    for (JavaScriptValue v : params) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/jssrc/internal/VeLogJsSrcLoggingFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callModuleFunction(
        "soy.velog",
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChainAccess`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
  }

  private static Expression flushUnpackBuffer(Expression base, Deque<ChainAccess> unpackBuffer) {
    boolean tail = true;
    for (ChainAccess link : unpackBuffer) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ChainAccess`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
      Expression base,
      CodeChunk.Generator generator,
      Iterator<ChainAccess> chain,
      Deque<ChainAccess> unpackBuffer) {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Expression`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java

    public FunctionCall(
        boolean nullSafe, boolean assertNonNull, Function<Expression, Expression> funct) {
      super(nullSafe, assertNonNull);
      this.funct = funct;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java

    public FunctionCall(
        boolean nullSafe, boolean assertNonNull, Function<Expression, Expression> funct) {
      super(nullSafe, assertNonNull);
      this.funct = funct;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Expression`
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
      ForNonemptyNode node,
      Expression limit,
      Function<Expression, Expression> getDataItemFunction) {
    // Build some local variable names.
    String refPrefix = node.getVarRefName();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
      ForNonemptyNode node,
      Expression limit,
      Function<Expression, Expression> getDataItemFunction) {
    // Build some local variable names.
    String refPrefix = node.getVarRefName();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Expression`
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
   */
  public static void maybeAddVariantParam(
      CallNode callNode, TranslateExprNodeVisitor exprTranslator, List<Expression> params) {
    if (hasVariant(callNode)) {
      params.add(exprTranslator.exec(((CallBasicNode) callNode).getVariantExpr()));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GoogRequire`
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java

    @CanIgnoreReturnValue
    Builder addRequires(Iterable<GoogRequire> symbols) {
      extraRequires.addAll(symbols);
      return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyType`
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
      String fieldName,
      SourceLocation sourceLocation,
      Function<SoyType, FieldAccess> memberGenerator) {
    if (baseType.getKind() == SoyType.Kind.NULL) {
      // This is a special edge case since the loop below would be a no-op.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FieldAccess`
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
      String fieldName,
      SourceLocation sourceLocation,
      Function<SoyType, FieldAccess> memberGenerator) {
    if (baseType.getKind() == SoyType.Kind.NULL) {
      // This is a special edge case since the loop below would be a no-op.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
   */
  private void genGoogMsgCodeForChildren(
      ImmutableList<SoyMsgPart> parts, MsgNode msgNode, GoogMsgPlaceholderCodeGenInfo codeGenInfo) {

    for (SoyMsgPart child : parts) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SourceFilePath`
in `java/src/com/google/template/soy/pysrc/internal/PySrcMain.java`
#### Snippet
```java
  private static ImmutableMap<String, String> generateManifest(
      Map<SourceFilePath, String> soyNamespaces,
      Map<SourceFilePath, Path> inputToOutputPaths,
      Optional<Path> outputDirectoryFlag,
      ErrorReporter errorReporter) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PyExpr`
in `java/src/com/google/template/soy/pysrc/internal/PythonValueFactoryImpl.java`
#### Snippet
```java
  }

  private static List<PythonValue> wrapParams(List<PyExpr> params) {
    List<PythonValue> exprs = new ArrayList<>(params.size());
    for (PyExpr e : params) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyPrintDirective`
in `java/src/com/google/template/soy/pysrc/internal/GenPyCallExprVisitor.java`
#### Snippet
```java
   * @return A PyExpr containing the call expression with all directives applied.
   */
  private PyExpr escapeCall(String callExpr, ImmutableList<SoyPrintDirective> directives) {
    PyExpr escapedExpr = new PyExpr(callExpr, Integer.MAX_VALUE);
    if (directives.isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static String processMsgPartsHelper(
      ImmutableList<SoyMsgPart> parts, Function<String, String> escaper) {
    StringBuilder rawMsgTextSb = new StringBuilder();
    for (SoyMsgPart part : parts) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static String processMsgPartsHelper(
      ImmutableList<SoyMsgPart> parts, Function<String, String> escaper) {
    StringBuilder rawMsgTextSb = new StringBuilder();
    for (SoyMsgPart part : parts) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PyExpr`
in `java/src/com/google/template/soy/pysrc/restricted/PyFunctionExprBuilder.java`
#### Snippet
```java

  @CanIgnoreReturnValue
  public PyFunctionExprBuilder addArgs(List<PyExpr> argList) {
    this.argList.addAll(argList);
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/types/UnionType.java`
#### Snippet
```java
   *     not be a UnionType.
   */
  public static SoyType of(Collection<SoyType> members) {
    // sort and flatten the set of types
    ImmutableSortedSet.Builder<SoyType> builder = ImmutableSortedSet.orderedBy(MEMBER_ORDER);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java

  static String stringRepresentation(
      Iterable<Parameter> parameters,
      TemplateContentKind contentKind,
      ImmutableSet<String> reservedAttributes) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
      }

      static LazyTypeWrapper fromSupplier(final Supplier<SoyType> typeSupplier) {
        return new LazyTypeWrapper() {
          @LazyInit SoyType type;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/types/SoyTypes.java`
#### Snippet
```java
   */
  public static SoyType computeLowestCommonType(
      SoyTypeRegistry typeRegistry, Collection<SoyType> types) {
    SoyType result = null;
    for (SoyType type : types) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GenericDescriptor`
in `java/src/com/google/template/soy/types/TypeRegistries.java`
#### Snippet
```java
    }

    private SoyType getProtoImportType(Map<String, GenericDescriptor> index, String member) {
      GenericDescriptor d = index.get(member);
      if (d != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GenericDescriptor`
in `java/src/com/google/template/soy/types/SoyTypeRegistryBuilder.java`
#### Snippet
```java
    public ProtoFqnTypeRegistry(
        TypeInterner interner,
        ImmutableMap<String, GenericDescriptor> msgAndEnumFqnToDesc,
        ImmutableSetMultimap<String, FieldDescriptor> msgFqnToExts) {
      this.interner = interner;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/types/SoyTypeRegistryBuilder.java`
#### Snippet
```java
        TypeInterner interner,
        ImmutableMap<String, GenericDescriptor> msgAndEnumFqnToDesc,
        ImmutableSetMultimap<String, FieldDescriptor> msgFqnToExts) {
      this.interner = interner;
      this.msgAndEnumFqnToDesc = msgAndEnumFqnToDesc;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java
          new GenericTypeInfo(1) {
            @Override
            SoyType create(List<SoyType> types, TypeInterner interner) {
              return interner.getOrCreateListType(types.get(0));
            }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java
          new GenericTypeInfo(2) {
            @Override
            SoyType create(List<SoyType> types, TypeInterner interner) {
              return interner.getOrCreateLegacyObjectMapType(types.get(0), types.get(1));
            }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java
          new GenericTypeInfo(2) {
            @Override
            SoyType create(List<SoyType> types, TypeInterner interner) {
              return interner.getOrCreateMapType(types.get(0), types.get(1));
            }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends BaseGenericTypeInfo`
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java

  private SoyType visit(
      GenericTypeNode node, ImmutableMap<String, BaseGenericTypeInfo> genericTypes) {
    ImmutableList<TypeNode> args = node.arguments();
    String name = node.name();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyPrintDirective`
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java

  static boolean areAllPrintDirectivesStreamable(
      ImmutableList<SoyPrintDirective> escapingDirectives) {
    for (SoyPrintDirective directive : escapingDirectives) {
      if (!(directive instanceof SoyJbcSrcPrintDirective.Streamable)) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StreamingDirectiveWithArgs`
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java

  private static AppendableAndFlushBuffersDepth applyStreamingPrintDirectivesTo(
      List<StreamingDirectiveWithArgs> directivesToApply,
      AppendableExpression appendable,
      JbcSrcPluginContext context) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyPrintDirective`
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java
   */
  static AppendableAndFlushBuffersDepth applyStreamingEscapingDirectives(
      List<SoyPrintDirective> directives,
      AppendableExpression appendable,
      JbcSrcPluginContext context) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jbcsrc/AppendableExpression.java`
#### Snippet
```java
      String placeholderValue,
      List<SoyExpression> args,
      List<Expression> escapingDirectives) {
    return withNewDelegate(
        delegate.invoke(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyPrintDirective`
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java
  /** Handles a translation consisting of a single raw text node. */
  private Statement handleBasicTranslation(
      MsgNode msg, List<SoyPrintDirective> escapingDirectives, Expression soyMsgParts) {
    // optimize for simple constant translations (very common)
    // this becomes: renderContext.getSoyMessge(<id>).getParts().get(0).getRawText()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExprNode`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
    ProtoInitGenerator(
        FunctionNode node,
        Function<ExprNode, SoyExpression> compilerFunction,
        ExpressionDetacher detacher,
        LocalVariableManager varManager) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyExpression`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        SoyType fieldType,
        LocalVariableManager varManager,
        Function<SoyExpression, SoyExpression> memberGenerator) {
      checkArgument(baseExpr.soyType().getKind() == SoyType.Kind.UNION, baseExpr.soyType());
      this.baseExpr = baseExpr;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
  private Expression computeRangeValue(
      SyntheticVarName varName,
      Optional<ExprNode> expression,
      int defaultValue,
      Scope scope,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Statement`
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
      int defaultValue,
      Scope scope,
      final ImmutableList.Builder<Statement> initStatements) {
    if (!expression.isPresent()) {
      return constant(defaultValue);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
                      @Override
                      public Expression call(
                          List<Expression> params,
                          Expression ij,
                          AppendableExpression appendable,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
    }

    private SoyExpression callExtern(ExternRef extern, List<ExprNode> params) {
      String namespace = fileSetMetadata.getNamespaceForPath(extern.path());
      TypeInfo externOwner = TypeInfo.createClass(Names.javaClassNameFromSoyNamespace(namespace));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends IfBlock`
in `java/src/com/google/template/soy/jbcsrc/ControlFlow.java`
#### Snippet
```java
   * if-elseif-else chain.
   */
  static Statement ifElseChain(final List<IfBlock> ifs, final Optional<Statement> elseBlock) {
    checkArgument(!ifs.isEmpty());
    return new Statement() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Statement`
in `java/src/com/google/template/soy/jbcsrc/ControlFlow.java`
#### Snippet
```java
   * if-elseif-else chain.
   */
  static Statement ifElseChain(final List<IfBlock> ifs, final Optional<Statement> elseBlock) {
    checkArgument(!ifs.isEmpty());
    return new Statement() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java

  @Override
  public void forEach(BiConsumer<String, ? super SoyValueProvider> action) {
    map.forEach(action);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Supplier`
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   * @throws SoyCompilationException If compilation fails.
   */
  public SoySauce compileTemplates(Map<String, Supplier<Object>> pluginInstances) {
    return entryPoint(
        () -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Supplier`
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  /** Helper method to compile SoyTofu from {@link ServerCompilationPrimitives} */
  private SoyTofu doCompileToTofu(
      ServerCompilationPrimitives primitives, Map<String, Supplier<Object>> pluginInstances) {
    return new BaseTofu(
        scopedData.enterable(), primitives.soyTree, PluginInstances.of(pluginInstances));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends File`
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
     */
    @CanIgnoreReturnValue
    Builder setPluginRuntimeJars(List<File> pluginRuntimeJars) {
      this.pluginRuntimeJars = ImmutableList.copyOf(pluginRuntimeJars);
      return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ByteSink`
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   * @throws SoyCompilationException If compilation fails.
   */
  void compileToJar(ByteSink jarTarget, Optional<ByteSink> srcJarTarget) {
    entryPointVoid(
        () -> {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Supplier`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceBuilder.java`
#### Snippet
```java
   */
  @CanIgnoreReturnValue
  public SoySauceBuilder withPluginInstances(Map<String, Supplier<Object>> pluginInstances) {
    this.userPluginInstances = PluginInstances.of(pluginInstances);
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Function`
in `java/src/com/google/template/soy/jbcsrc/api/OutputAppendable.java`
#### Snippet
```java
  @Override
  protected void doAppendLoggingFunctionInvocation(
      LoggingFunctionInvocation funCall, ImmutableList<Function<String, String>> escapers)
      throws IOException {
    String value = logger.evalLoggingFunction(funCall);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyFileSupplier`
in `java/src/com/google/template/soy/jbcsrc/BytecodeCompiler.java`
#### Snippet
```java
   */
  public static void writeSrcJar(
      SoyFileSetNode soyFileSet, ImmutableMap<SourceFilePath, SoyFileSupplier> files, ByteSink sink)
      throws IOException {
    try (SoyJarFileWriter writer = new SoyJarFileWriter(sink.openStream())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ParentCapture`
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
     * <p>This constructor is called by the generate factory classes.
     */
    Expression generateConstructor(Iterable<ParentCapture> captures) {
      final Label start = new Label();
      final Label end = new Label();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PluginRuntimeInstanceInfo`
in `java/src/com/google/template/soy/jbcsrc/api/PluginRuntimeInstanceInfo.java`
#### Snippet
```java
  public abstract ImmutableSortedSet<String> sourceLocations();

  public static ByteSource serialize(Iterable<PluginRuntimeInstanceInfo> plugins) {
    StringBuilder builder = new StringBuilder();
    for (PluginRuntimeInstanceInfo plugin : plugins) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Block`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java

    private static Block deepCopyBlock(
        Block original, IdentityHashMap<Block, Block> originalToCopy) {
      if (originalToCopy.containsKey(original)) {
        return originalToCopy.get(original);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super Block`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
   * succcessors} first).
   */
  private static void dfsPreOrder(Block node, Consumer<Block> fn) {
    Set<Block> visited = Sets.newIdentityHashSet();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Set`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
    }

    static <T> Set<T> mergePredecessors(Map<Block, Set<T>> blockToAccessedExprs, Block current) {
      Set<T> currentBlockSet = null;
      for (Block predecessor : current.predecessors) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Supplier`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    @Override
    public RendererImpl setPluginInstances(Map<String, Supplier<Object>> pluginInstances) {
      contextBuilder.withPluginInstances(
          SoySauceImpl.this.pluginInstances.combine(pluginInstances));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java

    private < T>
        Continuation<T> renderToValue(Function<String, T> factory) {
      StringBuilder sb = new StringBuilder();
      try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/jbcsrc/api/SoySauceImpl.java`
#### Snippet
```java

    private < T>
        Continuation<T> renderToValue(Function<String, T> factory) {
      StringBuilder sb = new StringBuilder();
      try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TemplateData`
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
  private void collectTransitiveCallees(
      @Nullable TemplateData templateData,
      Set<TemplateData> orderedTemplateCalls,
      Set<TemplateData> visited,
      Predicate<String> enabledMods,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TemplateData`
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
      @Nullable TemplateData templateData,
      Set<TemplateData> orderedTemplateCalls,
      Set<TemplateData> visited,
      Predicate<String> enabledMods,
      boolean collectCssFromDelvariants) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super TemplateData`
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
   */
  private void collectTransitiveCallees(
      @Nullable TemplateData templateData, Set<TemplateData> visited) {
    if (templateData == null || visited.contains(templateData)) {
      return; // avoids chasing recursive cycles
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java

  private static <T> ImmutableList<Case<T>> parseCases(
      PeekingIterator<Object> rawParts, Function<Object, T> specFactory) {
    Tag next = null;
    ImmutableList.Builder<Case<T>> cases = ImmutableList.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java

  private static ImmutableList<Object> partsToConstantPartsList(
      ImmutableList<SoyMsgPart> msgParts) {
    ImmutableList.Builder<Object> builder = ImmutableList.builder();
    for (SoyMsgPart msgPart : msgParts) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Label`
in `java/src/com/google/template/soy/jbcsrc/restricted/LocalVariable.java`
#### Snippet
```java

  /** Writes the value at the top of the stack to the local variable. */
  private Statement store(final Expression expr, final Optional<Label> firstVarInstruction) {
    expr.checkAssignableTo(resultType());
    return new Statement() {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/CheckIndirectDepsPass.java`
#### Snippet
```java

  public CheckIndirectDepsPass(
      ErrorReporter errorReporter, Supplier<FileSetMetadata> templateRegistryFull) {
    this.errorReporter = errorReporter;
    this.templateRegistryFull = templateRegistryFull;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/BanDuplicateNamespacesPass.java`
#### Snippet
```java

  BanDuplicateNamespacesPass(
      ErrorReporter errorReporter, Supplier<FileSetMetadata> fileSetTemplateRegistry) {
    this.errorReporter = errorReporter;
    this.fileSetTemplateRegistry = fileSetTemplateRegistry;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyPrintDirective`
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java
  }

  private static boolean isTrustedResourceUri(List<SoyPrintDirective> printDirectives) {
    for (SoyPrintDirective printDirectiveNode : Lists.reverse(printDirectives)) {
      if (printDirectiveNode.getName().equals("|filterTrustedResourceUri")) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java

  CheckBadContextualUsagePass(
      ErrorReporter errorReporter, Supplier<FileSetMetadata> templateRegistryFull) {
    this.errorReporter = errorReporter;
    this.templateRegistryFull = templateRegistryFull;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/CheckTemplateVisibilityPass.java`
#### Snippet
```java

  CheckTemplateVisibilityPass(
      ErrorReporter errorReporter, Supplier<FileSetMetadata> templateRegistryFull) {
    this.errorReporter = errorReporter;
    this.templateRegistryFull = templateRegistryFull;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

  @Nullable
  public static ImmutableList<Double> listUnboxNumbers(List<SoyValue> values) {
    if (values == null) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

  @Nullable
  public static ImmutableList<Long> listUnboxInts(List<SoyValue> values) {
    if (values == null) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

  @Nullable
  public static ImmutableList<String> listUnboxStrings(List<SoyValue> values) {
    if (values == null) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    public MsgRenderer(
        long msgId,
        ImmutableList<SoyMsgPart> msgParts,
        @Nullable ULocale locale,
        int numPlaceholders,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

  @Nullable
  public static ImmutableList<Boolean> listUnboxBools(List<SoyValue> values) {
    if (values == null) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Function`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
        @Override
        protected void doAppendLoggingFunctionInvocation(
            LoggingFunctionInvocation funCall, ImmutableList<Function<String, String>> escapers)
            throws IOException {
          String val = funCall.placeholderValue();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  @Nullable
  public static <T extends ProtocolMessageEnum> ImmutableList<T> listUnboxEnums(
      List<SoyValue> values, Class<T> type) {
    if (values == null) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  @Nullable
  public static <T extends ProtocolMessageEnum> ImmutableList<T> listUnboxEnums(
      List<SoyValue> values, Class<T> type) {
    if (values == null) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValueProvider`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  }

  public static SoyValueProvider getSoyListItemProvider(List<SoyValueProvider> list, long index) {
    if (list == null) {
      throw new NullPointerException("Attempted to access list item '" + index + "' of null");
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java

  @Nullable
  public static ImmutableList<Double> listUnboxFloats(List<SoyValue> values) {
    if (values == null) {
      return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/passes/RuntimeTypeCoercion.java`
#### Snippet
```java
   */
  @CheckReturnValue
  static SoyType maybeCoerceType(ExprNode node, Collection<SoyType> toTypes) {
    SoyType fromType = node.getType();
    if (AVAILABLE_CALL_SITE_COERCIONS.row(fromType).isEmpty()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/passes/CheckModifiableTemplatesPass.java`
#### Snippet
```java

  private void validateSingleFileIsModded(
      TemplateBasicNode templateBasicNode, SoyFileNode file, Set<String> modifiedNamespaces) {
    // Invariants checked in validateModifiesAttribute().
    Preconditions.checkNotNull(templateBasicNode.getModifiesExpr());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StandaloneNode`
in `java/src/com/google/template/soy/passes/RewriteGenderMsgsPass.java`
#### Snippet
```java
  }

  private static List<MsgPlaceholderNode> allPlaceholders(List<StandaloneNode> nodes) {
    return nodes.stream()
        .flatMap(node -> SoyTreeUtils.allNodesOfType(node, MsgPlaceholderNode.class))
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/FinalizeTemplateRegistryPass.java`
#### Snippet
```java
  public FinalizeTemplateRegistryPass(
      ErrorReporter errorReporter,
      Supplier<FileSetMetadata> registryFromDeps,
      Consumer<FileSetMetadata> fullRegSetter) {
    this.errorReporter = errorReporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super FileSetMetadata`
in `java/src/com/google/template/soy/passes/FinalizeTemplateRegistryPass.java`
#### Snippet
```java
      ErrorReporter errorReporter,
      Supplier<FileSetMetadata> registryFromDeps,
      Consumer<FileSetMetadata> fullRegSetter) {
    this.errorReporter = errorReporter;
    this.registryFromDeps = registryFromDeps;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/AutoescaperPass.java`
#### Snippet
```java
      ImmutableList<? extends SoyPrintDirective> printDirectives,
      boolean autoescaperEnabled,
      Supplier<FileSetMetadata> templateRegistryFull) {
    this.errorReporter = errorReporter;
    this.printDirectives = printDirectives;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/CheckTemplateHeaderVarsPass.java`
#### Snippet
```java

  CheckTemplateHeaderVarsPass(
      ErrorReporter errorReporter, Supplier<FileSetMetadata> templateRegistryFull) {
    this.errorReporter = errorReporter;
    this.templateRegistryFull = templateRegistryFull;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
      ExprNode template,
      SourceLocation templateLocation,
      Function<String, Boolean> addParam,
      Consumer<HtmlTagNode> consumer) {
    if (!(startNode instanceof HtmlOpenTagNode) || !((HtmlOpenTagNode) startNode).isSlot()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super HtmlTagNode`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
      SourceLocation templateLocation,
      Function<String, Boolean> addParam,
      Consumer<HtmlTagNode> consumer) {
    if (!(startNode instanceof HtmlOpenTagNode) || !((HtmlOpenTagNode) startNode).isSlot()) {
      errorReporter.report(startNode.getSourceLocation(), ONLY_SLOTS_ALLOWED);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
  private void validateAttribute(
      HtmlAttributeNode attr,
      Function<String, Boolean> addAttr,
      ImmutableMap<String, Parameter> allParamsByAttrName,
      boolean hasAllAttributes,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
      HtmlAttributeNode attr,
      Function<String, Boolean> addAttr,
      ImmutableMap<String, Parameter> allParamsByAttrName,
      boolean hasAllAttributes,
      ImmutableSet<String> reservedAttributes) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super FunctionNode`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
  }

  private void handleDynamicTag(HtmlTagNode tagNode, Set<FunctionNode> correctlyPlaced) {
    TagName name = tagNode.getTagName();
    PrintNode printNode = name.getDynamicTagName();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ImmutableList`
in `java/src/com/google/template/soy/passes/FileDependencyOrderPass.java`
#### Snippet
```java

  public FileDependencyOrderPass(
      ErrorReporter errorReporter, Consumer<ImmutableList<SoyFileNode>> stateSetter) {
    this.errorReporter = errorReporter;
    this.stateSetter = stateSetter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ActiveEdge`
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherAccumulatorNode.java`
#### Snippet
```java
   *     more than once.
   */
  public void accumulateActiveEdges(ImmutableList<ActiveEdge> activeEdges) {
    for (ActiveEdge accEdge : activeEdges) {
      accEdge.getGraphNode().linkEdgeToNode(accEdge.getActiveEdge(), this);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CompilerFilePass`
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java

  private PassManager(
      ImmutableList<CompilerFilePass> parsePasses,
      ImmutableList<CompilerFileSetPass> passes,
      AccumulatedState accumulatedState) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CompilerFileSetPass`
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java
  private PassManager(
      ImmutableList<CompilerFilePass> parsePasses,
      ImmutableList<CompilerFileSetPass> passes,
      AccumulatedState accumulatedState) {
    this.parsePasses = parsePasses;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends MethodChecker`
in `java/src/com/google/template/soy/plugin/java/DelegatingMethodChecker.java`
#### Snippet
```java
  private final List<MethodChecker> methodCheckers;

  public DelegatingMethodChecker(List<MethodChecker> methodCheckers) {
    this.methodCheckers = methodCheckers;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/TemplateImportProcessor.java`
#### Snippet
```java
  private SoyTypeRegistry typeRegistry;

  TemplateImportProcessor(ErrorReporter errorReporter, Supplier<FileSetMetadata> registryFromDeps) {
    this.registryFromDeps = registryFromDeps;
    this.errorReporter = errorReporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/CheckTemplateCallsPass.java`
#### Snippet
```java

  CheckTemplateCallsPass(
      ErrorReporter errorReporter, Supplier<FileSetMetadata> templateRegistryFull) {
    this.errorReporter = errorReporter;
    this.templateRegistryFull = templateRegistryFull;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java
  private final Supplier<FileSetMetadata> templateRegistryFull;

  CheckDelegatesPass(ErrorReporter errorReporter, Supplier<FileSetMetadata> templateRegistryFull) {
    this.errorReporter = errorReporter;
    this.templateRegistryFull = templateRegistryFull;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java

  private static Set<Parameter> getRequiredParamsDifference(
      List<Parameter> paramList1, List<Parameter> paramList2) {
    Map<String, Parameter> nameToParamMap =
        paramList2.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java

  private static Set<Parameter> getRequiredParamsDifference(
      List<Parameter> paramList1, List<Parameter> paramList2) {
    Map<String, Parameter> nameToParamMap =
        paramList2.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Parameter`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java
  }

  private static Set<String> formatParamSet(Set<Parameter> paramSet) {
    return paramSet.stream()
        .map(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateMetadata`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java

  @Nullable
  private TemplateMetadata getDefault(Iterable<TemplateMetadata> templates) {
    for (TemplateMetadata callee : templates) {
      if (callee.getModName() == null && isNullOrEmpty(callee.getDelTemplateVariant())) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyError`
in `java/src/com/google/template/soy/plugin/java/internal/ValidatorErrorReporter.java`
#### Snippet
```java
  }

  public void wrapErrors(Iterable<SoyError> errors) {
    errors.forEach(e -> report(UNEXPECTED_ERROR, e.message()));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyError`
in `java/src/com/google/template/soy/plugin/java/internal/ValidatorErrorReporter.java`
#### Snippet
```java
  }

  public void wrapWarnings(Iterable<SoyError> warnings) {
    warnings.forEach(e -> warn(UNEXPECTED_ERROR, e.message()));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
      ErrorReporter errorReporter,
      ImmutableList<? extends SoyPrintDirective> printDirectives,
      Supplier<FileSetMetadata> templateRegistryFull,
      boolean desugarIdomFeatures) {
    this.errorReporter = errorReporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
      HtmlAttributeNode attr,
      IdGenerator nodeIdGen,
      Set<String> seenAttr,
      Map<String, SoyType> parameterMap,
      Map<String, AttrParam> attrs,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
      IdGenerator nodeIdGen,
      Set<String> seenAttr,
      Map<String, SoyType> parameterMap,
      Map<String, AttrParam> attrs,
      CallParamContentNode attributesNode,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
  private static void maybePrintAttribute(
      CallParamContentNode attributesNode,
      Optional<ExprNode> conditional,
      IdGenerator nodeIdGen,
      HtmlAttributeNode attrNode) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/plugin/java/internal/JavaPluginValidator.java`
#### Snippet
```java
      String fnName,
      SoyJavaSourceFunction fn,
      List<SoyType> expectedParams,
      SoyType expectedReturn,
      SourceLocation sourceLocation,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super StandaloneNode`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
  }

  private static void copyChildren(HtmlAttributeNode from, ParentSoyNode<StandaloneNode> to) {
    Iterator<StandaloneNode> i = from.getChildren().iterator();
    i.next(); // skip the attribute name
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
  ElementAttributePass(
      ErrorReporter errorReporter,
      Supplier<FileSetMetadata> templateRegistryFromDeps,
      boolean desugarIdomPasses) {
    this.errorReporter = errorReporter;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateNode`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java

  private void updateReservedAttributesForDelegateCalls(
      ImmutableList<TemplateNode> templates, ImmutableMap<String, TemplateNode> allAstElements) {

    Map<String, String> templateFqnCall =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateNode`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java

  private void updateReservedAttributesForDelegateCalls(
      ImmutableList<TemplateNode> templates, ImmutableMap<String, TemplateNode> allAstElements) {

    Map<String, String> templateFqnCall =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoySourceFunction`
in `java/src/com/google/template/soy/plugin/internal/PluginValidator.java`
#### Snippet
```java
  }

  public void validate(Iterable<SoySourceFunction> fns) {
    for (SoySourceFunction fn : fns) {
      if (fn instanceof SoyJavaSourceFunction) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
     * exists.
     */
    T select(Predicate<String> activeModSelector) {
      Map.Entry<String, T> selected = null;
      // Select whatever mod is active and ensure that only one is activated.  If none are
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/shared/internal/InternalPlugins.java`
#### Snippet
```java

  static <T> ImmutableList<T> filterDuplicates(
      Iterable<? extends T> items, Function<T, String> nameFn) {
    Map<String, T> indexed = new HashMap<>();
    ImmutableList.Builder<T> output = ImmutableList.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/plugin/python/restricted/PythonValue.java`
#### Snippet
```java

  /** See {@link #call(PythonValue...)}. */
  default PythonValue call(Iterable<PythonValue> args) {
    return call(Iterables.toArray(args, PythonValue.class));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/plugin/javascript/restricted/JavaScriptValue.java`
#### Snippet
```java

  /** See {@link #invokeMethod(String, JavaScriptValue...)}. */
  default JavaScriptValue invokeMethod(String ident, Iterable<JavaScriptValue> args) {
    return invokeMethod(ident, Iterables.toArray(args, JavaScriptValue.class));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/plugin/java/internal/CompiledJarsPluginSignatureReader.java`
#### Snippet
```java
   * fails, falls back to using reflection.
   */
  private ClassSignatures index(String runtimeClassName, Consumer<String> errorReporter) {
    String ownerName = TypeInfo.create(runtimeClassName, /* doesn't matter */ false).internalName();
    for (File f : pluginRuntimeJars) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
   */
  @VisibleForTesting
  public void generateCode(Predicate<String> availableIdentifiers, StringBuilder outputCode) {

    outputCode.append(generatedCodeStartMarker).append('\n');
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
     */
    private <T> void computeConstraintIntersectionInto(
        Map<T, SoyType> left, Map<T, SoyType> right, Map<T, SoyType> into) {
      if (left.isEmpty()) {
        return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
     */
    private <T> void computeConstraintIntersectionInto(
        Map<T, SoyType> left, Map<T, SoyType> right, Map<T, SoyType> into) {
      if (left.isEmpty()) {
        return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyType`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
     */
    private <T> void computeConstraintIntersectionInto(
        Map<T, SoyType> left, Map<T, SoyType> right, Map<T, SoyType> into) {
      if (left.isEmpty()) {
        return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
    private final Table<SourceFilePath, String, List<ExternNode>> sources = HashBasedTable.create();

    public ExternsTypeIndex(Supplier<FileSetMetadata> deps) {
      this.deps = deps;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMethod.Registry`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
    private final List<SoyMethod.Registry> registries;

    public CompositeMethodRegistry(List<SoyMethod.Registry> registries) {
      this.registries = registries;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
    }

    private SoyType getGenericMapType(Iterable<ExprNode> intersectionOf) {
      ImmutableSet.Builder<SoyType> keyTypesBuilder = ImmutableSet.builder();
      ImmutableSet.Builder<SoyType> valueTypesBuilder = ImmutableSet.builder();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends FileSetMetadata`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
    private final Table<SourceFilePath, String, ConstNode> sources = HashBasedTable.create();

    public ConstantsTypeIndex(Supplier<FileSetMetadata> deps) {
      this.deps = deps;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
     */
    private <T> void computeConstraintUnionInto(
        Map<T, SoyType> left, Map<T, SoyType> right, Map<T, SoyType> into) {
      if (left.isEmpty()) {
        return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
     */
    private <T> void computeConstraintUnionInto(
        Map<T, SoyType> left, Map<T, SoyType> right, Map<T, SoyType> into) {
      if (left.isEmpty()) {
        return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
     */
    private <T> void computeConstraintUnionInto(
        Map<T, SoyType> left, Map<T, SoyType> right, Map<T, SoyType> into) {
      if (left.isEmpty()) {
        return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyType`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
     */
    private <T> void computeConstraintUnionInto(
        Map<T, SoyType> left, Map<T, SoyType> right, Map<T, SoyType> into) {
      if (left.isEmpty()) {
        return;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
    }

    private SoyType getGenericListType(Iterable<ExprNode> intersectionOf) {
      ImmutableSet.Builder<SoyType> elementTypesBuilder = ImmutableSet.builder();
      for (ExprNode childNode : intersectionOf) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExternRef`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
    }

    private boolean maybeSetExtern(FunctionNode node, List<ExternRef> externTypes) {
      List<ExternRef> matching =
          externTypes.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java

    private boolean paramsMatchFunctionType(
        List<ExprNode> providedParams, FunctionType functionType) {
      ImmutableList<Parameter> functParams = functionType.getParameters();
      if (functParams.size() != providedParams.size()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/shared/restricted/SoySourceFunctionMethod.java`
#### Snippet
```java

  @Override
  public boolean appliesToArgs(List<SoyType> argTypes) {
    Preconditions.checkArgument(argTypes.size() == this.argTypes.size());
    for (int i = 0; i < argTypes.size(); i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/plugin/javascript/restricted/JavaScriptValueFactory.java`
#### Snippet
```java
  /** See {@link #callNamespaceFunction(String, String, JavaScriptValue...)}. */
  public final JavaScriptValue callNamespaceFunction(
      String googProvide, String fullFunctionName, Iterable<JavaScriptValue> params) {
    return callNamespaceFunction(
        googProvide, fullFunctionName, Iterables.toArray(params, JavaScriptValue.class));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/plugin/javascript/restricted/JavaScriptValueFactory.java`
#### Snippet
```java
  /** See {@link #callModuleFunction(String, String, JavaScriptValue...)}. */
  public final JavaScriptValue callModuleFunction(
      String moduleName, String functionName, Iterable<JavaScriptValue> params) {
    return callModuleFunction(
        moduleName, functionName, Iterables.toArray(params, JavaScriptValue.class));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super FieldDescriptor`
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java

  protected boolean appliesToProto(
      String methodName, SoyType baseType, Predicate<FieldDescriptor> acceptField) {
    if (!appliesToBase(baseType)) {
      return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        String methodName,
        SoyType baseType,
        List<ExprNode> params,
        SoyTypeRegistry soyTypeRegistry,
        ErrorReporter errorReporter) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java

  protected ImmutableCollection<String> expandMethodNamesForProto(
      SoyType baseType, Function<String, String> fieldToMethodName) {
    if (!appliesToBase(baseType)) {
      return ImmutableList.of();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        String methodName,
        SoyType baseType,
        List<ExprNode> params,
        SoyTypeRegistry soyTypeRegistry,
        ErrorReporter errorReporter) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends HtmlMatcherGraphNode`
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java

  private QueuedTask visit(
      Optional<HtmlMatcherGraphNode> maybeNode,
      Map<ExprEquivalence.Wrapper, Boolean> exprValueMap,
      HtmlStack stack) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StandaloneNode`
in `java/src/com/google/template/soy/soytree/AstEdits.java`
#### Snippet
```java

  /** Replace a given node with the new nodes. */
  public void replace(StandaloneNode oldNode, Iterable<StandaloneNode> newNodes) {
    checkState(oldNode.getParent() != null, "oldNode must be in the tree in order to replace it");
    remove(oldNode);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StandaloneNode`
in `java/src/com/google/template/soy/soytree/AstEdits.java`
#### Snippet
```java

  /** Add children to the given parent. */
  public void addChildren(ParentSoyNode<StandaloneNode> parent, Iterable<StandaloneNode> children) {
    checkNotNull(parent);
    newChildren.putAll(parent, children);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T1`
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java

  private static <T1 extends Enum<T1>, T2 extends Enum<T2>> Converter<T1, T2> createEnumConverter(
      final Class<T1> t1, final Class<T2> t2) {
    Map<String, T1> t1NameMap = new HashMap<>();
    for (T1 instance : t1.getEnumConstants()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T2`
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java

  private static <T1 extends Enum<T1>, T2 extends Enum<T2>> Converter<T1, T2> createEnumConverter(
      final Class<T1> t1, final Class<T2> t2) {
    Map<String, T1> t1NameMap = new HashMap<>();
    for (T1 instance : t1.getEnumConstants()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CaseOrDefaultNode`
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

    private static void maybeEnqueueMsgNode(
        Deque<SoyNode> traversalQueue, ParentSoyNode<CaseOrDefaultNode> node) {
      for (CaseOrDefaultNode child : node.getChildren()) {
        for (SoyNode grandchild : child.getChildren()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyNode`
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
    }

    private static void maybeEnqueue(Deque<SoyNode> traversalQueue, SoyNode child) {
      if (child instanceof MsgSubstUnitNode || child instanceof VeLogNode) {
        traversalQueue.add(child);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ImportedVar`
in `java/src/com/google/template/soy/soytree/ImportNode.java`
#### Snippet
```java

  private static void visitVars(
      ImportedVar id, SoyType parentType, BiConsumer<ImportedVar, SoyType> visitor) {
    visitor.accept(id, parentType);
    id.getNestedTypes()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyType`
in `java/src/com/google/template/soy/soytree/ImportNode.java`
#### Snippet
```java

  private static void visitVars(
      ImportedVar id, SoyType parentType, BiConsumer<ImportedVar, SoyType> visitor) {
    visitor.accept(id, parentType);
    id.getNestedTypes()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/soytree/MsgSubstUnitPlaceholderNameUtils.java`
#### Snippet
```java
   */
  public static List<String> genNoncollidingBaseNamesForExprs(
      List<ExprNode> exprNodes, String fallbackBaseName, ErrorReporter errorReporter) {

    int numExprs = exprNodes.size();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
   */
  public static <T extends SoyNode> List<T> cloneListWithNewIds(
      List<T> origNodes, IdGenerator nodeIdGen) {

    Preconditions.checkNotNull(origNodes);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
   */
  public static <T extends Node> Stream<T> allNodesOfType(
      Node rootSoyNode, Class<T> classObject, NodeVisitor<? super Node, VisitDirective> visitor) {
    return allNodes(rootSoyNode, visitor).filter(classObject::isInstance).map(classObject::cast);
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExprNode`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
   */
  public static <R> void execOnAllV2Exprs(
      SoyNode node, final AbstractNodeVisitor<ExprNode, R> exprNodeVisitor) {
    allNodes(node, SoyTreeUtils::visitNonExpr)
        .filter(n -> n instanceof ExprHolderNode)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java

  public static <T extends ExprNode> void visitExprNodesWithHolder(
      SoyNode root, Class<T> exprType, BiConsumer<ExprHolderNode, T> visitor) {
    SoyTreeUtils.allNodesOfType(root, ExprHolderNode.class)
        .forEach(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExprHolderNode`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java

  public static <T extends ExprNode> void visitExprNodesWithHolder(
      SoyNode root, Class<T> exprType, BiConsumer<ExprHolderNode, T> visitor) {
    SoyTreeUtils.allNodesOfType(root, ExprHolderNode.class)
        .forEach(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java

  public static <T extends ExprNode> void visitExprNodesWithHolder(
      SoyNode root, Class<T> exprType, BiConsumer<ExprHolderNode, T> visitor) {
    SoyTreeUtils.allNodesOfType(root, ExprHolderNode.class)
        .forEach(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
   */
  public static <T extends Node> ImmutableList<T> getAllNodesOfType(
      Node rootSoyNode, final Class<T> classObject) {
    return allNodesOfType(rootSoyNode, classObject).collect(toImmutableList());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/basetree/ParentNode.java`
#### Snippet
```java

  default <T extends N> ImmutableList<T> getChildrenOfType(
      ParentNode<? super T> root, Class<T> type) {
    return root.getChildren().stream()
        .filter(type::isInstance)
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/basetree/CopyState.java`
#### Snippet
```java

  private static <T> Listener<T> chainListeners(
      final Listener<T> listener, final Listener<T> oldListener) {
    return new Listener<T>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/basetree/CopyState.java`
#### Snippet
```java

  private static <T> Listener<T> chainListeners(
      final Listener<T> listener, final Listener<T> oldListener) {
    return new Listener<T>() {
      @Override
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends CompilationUnitAndKind`
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  public SoyFileSetParserBuilder addCompilationUnits(
      Iterable<CompilationUnitAndKind> newCompilationUnits) {
    compilationUnits =
        ImmutableList.<CompilationUnitAndKind>builder()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/exprtree/CallableExprBuilder.java`
#### Snippet
```java

  @CanIgnoreReturnValue
  public CallableExprBuilder setParamValues(List<ExprNode> paramValues) {
    this.paramValues = paramValues;
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Point`
in `java/src/com/google/template/soy/exprtree/CallableExprBuilder.java`
#### Snippet
```java

  @CanIgnoreReturnValue
  public CallableExprBuilder setCommaLocations(List<Point> commaLocations) {
    this.commaLocations = commaLocations;
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Identifier`
in `java/src/com/google/template/soy/exprtree/CallableExprBuilder.java`
#### Snippet
```java

  @CanIgnoreReturnValue
  public CallableExprBuilder setParamNames(List<Identifier> paramNames) {
    this.paramNames = paramNames;
    return this;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/exprtree/MethodCallNode.java`
#### Snippet
```java
  public static MethodCallNode newWithPositionalArgs(
      ExprNode base,
      List<ExprNode> params,
      Identifier methodName,
      SourceLocation location,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateMetadata`
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java

  private static DelTemplateSelector<TemplateMetadata> buildDelTemplateSelector(
      Collection<TemplateMetadata> allTemplates,
      ErrorReporter errorReporter,
      FileSetMetadata fileSetMetadata) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ExprNode`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
    private final int hashCode;

    Wrapper(Equivalence<ExprNode> equivalence, ExprNode expr) {
      this.equivalence = equivalence;
      this.expr = checkNotNull(expr);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
  }

  public final int hash(List<ExprNode> a) {
    int result = 1;
    for (ExprNode element : a) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
  }

  public final boolean equivalent(List<ExprNode> a, List<ExprNode> b) {
    if (a.size() != b.size()) {
      return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
  }

  public final boolean equivalent(List<ExprNode> a, List<ExprNode> b) {
    if (a.size() != b.size()) {
      return false;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/internal/util/BreadthFirstStream.java`
#### Snippet
```java
   * @param <T> the type of node in the tree
   */
  public static <T> Stream<? extends T> of(T root, Function<T, Iterable<? extends T>> successors) {
    Deque<T> generations = new ArrayDeque<>();
    generations.add(root);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Iterable`
in `java/src/com/google/template/soy/internal/util/BreadthFirstStream.java`
#### Snippet
```java
   * @param <T> the type of node in the tree
   */
  public static <T> Stream<? extends T> of(T root, Function<T, Iterable<? extends T>> successors) {
    Deque<T> generations = new ArrayDeque<>();
    generations.add(root);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/internal/proto/Field.java`
#### Snippet
```java
  /** Returns the set of fields indexed by soy accessor name for the given type. */
  public static <T extends Field> ImmutableMap<String, T> getFieldsForType(
      Descriptor descriptor, Set<FieldDescriptor> extensions, Factory<T> factory) {
    ImmutableMap.Builder<String, T> fields = ImmutableMap.builder();
    for (FieldDescriptor fieldDescriptor : descriptor.getFields()) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Point`
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java

  public static FunctionNode newPositional(
      Identifier name, SourceLocation sourceLocation, @Nullable List<Point> commaLocations) {
    return new FunctionNode(
        sourceLocation,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyType`
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
  }

  public void setAllowedParamTypes(List<SoyType> allowedParamTypes) {
    checkState(paramsStyle == ParamsStyle.POSITIONAL || numChildren() == 0);
    checkState(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Identifier`
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java

  public static FunctionNode newNamed(
      Identifier name, Iterable<Identifier> paramNames, SourceLocation sourceLocation) {
    return new FunctionNode(
        sourceLocation, name, null, ParamsStyle.NAMED, ImmutableList.copyOf(paramNames), null);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java
   * @throws NoSuchElementException if a cycle is encountered
   */
  public ImmutableList<T> sort(Iterable<T> unsorted, Function<T, Iterable<T>> successorFunc) {
    cyclicKeys = null;

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java
   * @throws NoSuchElementException if a cycle is encountered
   */
  public ImmutableList<T> sort(Iterable<T> unsorted, Function<T, Iterable<T>> successorFunc) {
    cyclicKeys = null;

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Iterable`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java
   * @throws NoSuchElementException if a cycle is encountered
   */
  public ImmutableList<T> sort(Iterable<T> unsorted, Function<T, Iterable<T>> successorFunc) {
    cyclicKeys = null;

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java

  private static <T> boolean dfs(
      Set<T> visited, Deque<T> chain, T node, Function<T, Iterable<T>> successors) {
    chain.addLast(node);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java

  private static <T> boolean dfs(
      Set<T> visited, Deque<T> chain, T node, Function<T, Iterable<T>> successors) {
    chain.addLast(node);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super T`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java

  private static <T> boolean dfs(
      Set<T> visited, Deque<T> chain, T node, Function<T, Iterable<T>> successors) {
    chain.addLast(node);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Iterable`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java

  private static <T> boolean dfs(
      Set<T> visited, Deque<T> chain, T node, Function<T, Iterable<T>> successors) {
    chain.addLast(node);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java
  }

  private static <T> ImmutableList<T> findCycle(Map<T, Set<T>> remaining) {
    // Because all remaining nodes are not leaves and all have at least one dep, every one must
    // be part of at least one cycle. So it doesn't matter where we start searching from.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Set`
in `java/src/com/google/template/soy/internal/util/TopoSort.java`
#### Snippet
```java
  }

  private static <T> ImmutableList<T> findCycle(Map<T, Set<T>> remaining) {
    // Because all remaining nodes are not leaves and all have at least one dep, every one must
    // be part of at least one cycle. So it doesn't matter where we start searching from.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends RuleWithExemptions`
in `java/src/com/google/template/soy/conformance/SoyConformance.java`
#### Snippet
```java
  private final ImmutableList<RuleWithExemptions> rules;

  SoyConformance(ImmutableList<RuleWithExemptions> rules) {
    this.rules = rules;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateHeaderVarDefn`
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java

  private static ImmutableList<TemplateHeaderVarDefn> copyParams(
      ImmutableList<TemplateHeaderVarDefn> orig, CopyState copyState) {
    ImmutableList.Builder<TemplateHeaderVarDefn> newParams = ImmutableList.builder();
    for (TemplateHeaderVarDefn prev : orig) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends AliasDeclaration`
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
        ErrorReporter errorReporter,
        NamespaceDeclaration namespaceDeclaration,
        Collection<AliasDeclaration> aliases) {
      Map<String, String> map = Maps.newLinkedHashMap();
      String aliasForFileNamespace =
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ParamInfo`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
  }

  private static void appendParamConstants(IndentedLinesBuilder ilb, List<ParamInfo> params) {
    Set<String> usedNames = new HashSet<>();
    List<String> nonInjected = new ArrayList<>();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ParamInfo`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java

  private static void appendRecordListInitializations(
      IndentedLinesBuilder ilb, List<ParamInfo> params) {
    // For every required param that's of type list<[...]> (list of records), initialize the list
    // so that upon building the template we do not throw an error for zero records.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends GeneratedFile`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java

  /** Logs a warning if two soy files mapped to the same generated java file name. */
  private void logWarningIfFilenamesNotUnique(ImmutableList<GeneratedFile> files) {
    ImmutableList<String> duplicateFilenames =
        files.stream().collect(groupingBy(GeneratedFile::fileName, counting())).entrySet().stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java

  private static void changeParamFutureStatus(
      Map<String, ParamInfo> params, String paramName, ParamFutureStatus futureStatus) {
    ParamInfo previous = params.get(paramName);
    params.put(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super ParamInfo`
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java
  }

  private void addIndirectParams(TemplateNode template, Map<String, ParamInfo> params) {
    Set<String> directParamNames = ImmutableSet.copyOf(params.keySet());

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super String`
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java

  private static void changeParamStatus(
      Map<String, ParamInfo> params, String paramName, ParamStatus newStatus) {
    ParamInfo previous = params.get(paramName);
    params.put(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateMetadata`
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java

  private static String modifyIndirectDesc(
      String description, Collection<TemplateMetadata> callees) {
    StringBuilder sb = new StringBuilder();
    if (description != null) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Transition`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    final ImmutableList<Transition> transitions;

    TransitionSetProcessor(ImmutableList<Transition> transitions) {
      this.transitions = transitions;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateType`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
     * content kind.
     */
    private SanitizedContentKind getCommonContentKindIfStrict(List<TemplateType> templates) {
      if (templates.isEmpty()) {
        return null;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaType`
in `java/src/com/google/template/soy/javagencode/javatypes/JavaTypeUtils.java`
#### Snippet
```java
  }

  public static ImmutableList<JavaType> makeNullable(List<JavaType> types) {
    return types.stream().map(JavaType::asNullable).collect(toImmutableList());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ExprNode`
in `java/src/com/google/template/soy/treebuilder/ExprNodes.java`
#### Snippet
```java
   * to the tree.
   */
  private static ImmutableList<ExprNode> maybeCopyNodes(ImmutableList<ExprNode> nodes) {
    return nodes.stream().map(ExprNodes::maybeCopyNode).collect(toImmutableList());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NamedExprNode`
in `java/src/com/google/template/soy/treebuilder/ExprNodes.java`
#### Snippet
```java
  }

  public static FunctionNode protoInit(String protoName, ImmutableList<NamedExprNode> children) {
    FunctionNode node =
        FunctionNode.newNamed(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NamedExprNode`
in `java/src/com/google/template/soy/treebuilder/ExprNodes.java`
#### Snippet
```java
  }

  public static FunctionNode elementCall(String name, ImmutableList<NamedExprNode> params) {
    ImmutableList.Builder<Identifier> paramNames = ImmutableList.builder();
    for (NamedExprNode param : params) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NamedExprNode`
in `java/src/com/google/template/soy/treebuilder/ExprNodes.java`
#### Snippet
```java
  }

  public static RecordLiteralNode recordLiteral(ImmutableList<NamedExprNode> children) {
    RecordLiteralNode node =
        new RecordLiteralNode(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyMsgPart`
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitorAssistantForMsgs.java`
#### Snippet
```java
   */
  private void renderMsgFromTranslation(
      MsgNode msg, ImmutableList<SoyMsgPart> msgParts, @Nullable ULocale locale) {
    SoyMsgPart firstPart = msgParts.get(0);

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends StandaloneNode`
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
    }

    static SourceLocation getLocationOf(List<StandaloneNode> nodes) {
      SourceLocation location = nodes.get(0).getSourceLocation();
      if (nodes.size() > 1) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super MsgBlockNode`
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
  }

  private static void collectMsgBranches(MsgBlockNode parent, List<MsgBlockNode> msgBranches) {
    StandaloneNode firstChild = Iterables.getFirst(parent.getChildren(), null);
    if (firstChild instanceof MsgPluralNode) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValueProvider`
in `java/src/com/google/template/soy/sharedpasses/render/TestingEnvironment.java`
#### Snippet
```java
  private final Map<String, SoyValueProvider> locals;

  private TestingEnvironment(SoyRecord params, Map<String, SoyValueProvider> locals) {
    this.params = params;
    this.locals = locals;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/bidifunctions/BidiTextDirFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    JavaValue html = args.size() == 2 ? args.get(1).asSoyBoolean() : factory.constant(false);
    return factory.callStaticMethod(Methods.BIDI_TEXT_DIR, args.get(0), html);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/bidifunctions/BidiTextDirFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory
        .global("bidi.text_dir")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/bidifunctions/BidiMarkAfterFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    List<JavaScriptValue> fnArgs = new ArrayList<>(args.size() + 1);
    fnArgs.add(context.getBidiDir());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/bidifunctions/BidiMarkAfterFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory
        .global("bidi.mark_after")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/bidifunctions/BidiMarkAfterFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    JavaValue html = args.size() == 1 ? factory.constant(false) : args.get(1).asSoyBoolean();
    return factory.callStaticMethod(Methods.MARK_AFTER, context.getBidiDir(), args.get(0), html);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrToAsciiLowerCaseFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.ASCII_TO_LOWER_CASE_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrToAsciiLowerCaseFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "soy", "soy.$$strToAsciiLowerCase", args.get(0).coerceToString());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrToAsciiLowerCaseFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.str_to_ascii_lower_case").call(args.get(0).coerceToString());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/bidifunctions/BidiDirAttrFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    JavaValue html = args.size() == 1 ? factory.constant(false) : args.get(1).asSoyBoolean();
    return factory.callStaticMethod(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/bidifunctions/BidiDirAttrFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory
        .global("bidi.dir_attr")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/bidifunctions/BidiDirAttrFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    List<JavaScriptValue> fnArgs = new ArrayList<>();
    fnArgs.add(context.getBidiDir());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/PowFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.global("Math").invokeMethod("pow", args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/PowFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MATH_POW, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/PowFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("math.pow").call(args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java

  SoyValue computeForJava(
      SoyJavaSourceFunction srcFn, List<SoyValue> args, TofuPluginContext context) {
    List<JavaValue> javaArgs =
        Lists.transform(args, soyArg -> TofuJavaValue.forSoyValue(soyArg, fnSourceLocation));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/RangeFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    JavaValue start;
    JavaValue end;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrIndexOfFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    List<JavaScriptValue> transformedArgs = new ArrayList<>();
    transformedArgs.add(args.get(1).coerceToString());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrIndexOfFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.INDEX_OF,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrIndexOfFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    List<PythonValue> transformedArgs = new ArrayList<>();
    // Coerce SanitizedContent args to strings.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/MapKeysFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MAP_KEYS_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/MapKeysFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return args.get(0).getProp("keys").call();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/MapKeysFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    // TODO(lukes) this could be callModuleFunction but other parts of soy don't generate aliased
    // requires so we can't generate one here without create a 'multiple require' error
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrSubFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    if (args.size() == 2) {
      return factory.callStaticMethod(Methods.STR_SUB_START, args.get(0), args.get(1));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrSubFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    // Coerce SanitizedContent args to strings.
    PythonValue str = args.get(0).coerceToString();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/MapToLegacyObjectMapFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    // TODO(lukes) this could be callModuleFunction but other parts of soy don't generate aliased
    // requires so we can't generate one here without create a 'multiple require' error
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/MapToLegacyObjectMapFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.map_to_legacy_object_map").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/MapToLegacyObjectMapFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MAP_TO_LEGACY_OBJECT_MAP, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/MinFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("min").call(args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/MinFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.global("Math").invokeMethod("min", args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/MinFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MIN_FN, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyRecord`
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java

  private void visitCallNodeHelper(
      CallNode node, TemplateNode callee, Optional<SoyRecord> boundParams) {

    // ------ Build the call data. ------
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ParseFloatFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.parse_float").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ParseFloatFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.PARSE_FLOAT, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ParseFloatFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    // TODO(user): parseFloat('123abc') == 123; JS parseFloat tries to parse as much as it can.
    // That means parseFloat('1.1.1') == 1.1
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ListReverseMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.LIST_REVERSE_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ListReverseMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$listReverse", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ListReverseMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.list_reverse").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ListContainsFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.list_contains").call(args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ListContainsFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$listContains", args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ListContainsFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.LIST_CONTAINS_FN, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ListSliceMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.LIST_SLICE_FN,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ListSliceMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory
        .global("runtime.list_slice")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ListUniqMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.list_uniq").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ListUniqMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.LIST_UNIQ_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ListUniqMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$listUniq", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StringListSortMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.LIST_SORT_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StringListSortMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.string_list_sort").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StringListSortMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$stringListSort", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/LengthFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("len").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/LengthFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return args.get(0).accessProperty("length");
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/LengthFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.DELEGATE_SOYLIST_LENGTH, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/KeysFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$getMapKeys", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/KeysFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return args.get(0).getProp("keys").call();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/KeysFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.KEYS_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/JoinFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.JOIN, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/JoinFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return args.get(1)
        .getProp("join")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/JoinFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return args.get(0).invokeMethod("join", args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrReplaceAllMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "soy", "soy.$$strReplaceAll", args.get(0), args.get(1), args.get(2));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrReplaceAllMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.str_replace_all").call(args.get(0), args.get(1), args.get(2));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrReplaceAllMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.STR_REPLACE_ALL, args.get(0), args.get(1), args.get(2));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatMapsMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.map.$$concatMaps", args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatMapsMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.CONCAT_MAPS_FN, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatMapsMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.concat_maps").call(args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ProtoIsDefaultMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy.map", "soy.map.$$isProtoDefault", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ProtoIsDefaultMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.IS_DEFAULT_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatAttributeValuesFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.CONCAT_ATTRIBUTE_VALUES, args.get(0), args.get(1), args.get(2));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatAttributeValuesFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory
        .global("runtime.concat_attribute_values")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatAttributeValuesFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "soy", "soy.$$concatAttributeValues", args.get(0), args.get(1), args.get(2));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrStartsWithMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.STR_STARTS_WITH,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrSplitMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.STR_SPLIT,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrSplitMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    if (args.size() == 3) {
      return args.get(0).invokeMethod("split", args.get(1), args.get(2));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ListFlatMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    if (args.size() == 1) {
      return factory.callNamespaceFunction("soy", "soy.$$listFlat", args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ListFlatMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    if (args.size() == 1) {
      return factory.global("runtime.list_flat").call(args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ListFlatMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    if (args.size() == 1) {
      return factory.callStaticMethod(Methods.LIST_FLAT_FN, args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrEndsWithMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.STR_ENDS_WITH,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `java/src/com/google/template/soy/basicfunctions/ParseIntFunction.java`
#### Snippet
```java
  }

  private <T> T getRadixValue(List<T> args, T defaultValue) {
    return args.size() == 2 ? args.get(1) : defaultValue;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatListsFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    PythonValue accum = args.get(0);
    for (int i = 1; i < args.size(); i++) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/MaxFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MAX_FN, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/MaxFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.global("Math").invokeMethod("max", args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/MaxFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("max").call(args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrSmsUriToUriFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("sanitize.sms_to_uri").call(args.get(0).coerceToString());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrSmsUriToUriFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.SMS_TO_URI, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrSmsUriToUriFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$strSmsUriToUri", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? super SoyValueProvider`
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java

  private static void listFlatImpl(
      SoyList list, ImmutableList.Builder<SoyValueProvider> builder, int maxDepth) {
    for (SoyValueProvider value : list.asJavaList()) {
      if (maxDepth > 0 && value.resolve() instanceof SoyList) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyList`
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java

  /** Concatenates its arguments. */
  public static ImmutableList<SoyValueProvider> concatLists(List<SoyList> args) {
    ImmutableList.Builder<SoyValueProvider> flattened = ImmutableList.builder();
    for (SoyList soyList : args) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/HtmlToTextFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("sanitize.html_to_text").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/HtmlToTextFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$htmlToText", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/HtmlToTextFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.HTML_TO_TEXT, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/LegacyObjectMapToMapFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    // TODO(b/69064788): The runtime representations of legacy_object_map and
    // experimental_map should be different in every backend, just as they are different in JS.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/LegacyObjectMapToMapFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callModuleFunction("soy.newmaps", "$$legacyObjectMapToMap", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/LegacyObjectMapToMapFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.LEGACY_OBJECT_MAP_TO_MAP, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends ImmutableList`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
      PluginInstances pluginInstances,
      UndefinedDataHandlingMode undefinedDataHandlingMode,
      ImmutableTable<SourceFilePath, String, ImmutableList<ExternNode>> externs,
      DelTemplateSelector<TemplateNode> deltemplates,
      Predicate<String> activeModSelector) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends TemplateNode`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
      UndefinedDataHandlingMode undefinedDataHandlingMode,
      ImmutableTable<SourceFilePath, String, ImmutableList<ExternNode>> externs,
      DelTemplateSelector<TemplateNode> deltemplates,
      Predicate<String> activeModSelector) {
    this.env = checkNotNull(env);
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ProtoEqualsMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "soy.map", "soy.map.$$protoEquals", args.get(0), args.get(1));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ProtoEqualsMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.PROTO_EQUALS_FN, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrToAsciiUpperCaseFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "soy", "soy.$$strToAsciiUpperCase", args.get(0).coerceToString());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrToAsciiUpperCaseFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.str_to_ascii_upper_case").call(args.get(0).coerceToString());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrToAsciiUpperCaseFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.ASCII_TO_UPPER_CASE_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/CeilingFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.global("Math").invokeMethod("ceil", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/SqrtFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MATH_SQRT, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/SqrtFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.sqrt").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/SqrtFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.global("Math").invokeMethod("sqrt", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/CeilingFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("int").call(factory.global("math.ceil").call(args.get(0)));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/MapEntriesMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MAP_ENTRIES_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/MapEntriesMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.map_entries").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/MapEntriesMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    // TODO(lukes) this could be callModuleFunction but other parts of soy don't generate aliased
    // requires so we can't generate one here without create a 'multiple require' error
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/CeilingFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.CEIL_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/MapLengthMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    // TODO(lukes) this could be callModuleFunction but other parts of soy don't generate aliased
    // requires so we can't generate one here without create a 'multiple require' error
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ListIndexOfFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.LIST_CONTAINS_FN,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/MapLengthMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("len").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/MapLengthMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MAP_SIZE_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/RandomIntFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$randomInt", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/RandomIntFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.RANDOM_INT_FN, args.get(0).asSoyInt());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/RandomIntFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory
        .global("random.randint")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrLenFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.STR_LEN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrLenFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return args.get(0).coerceToString().accessProperty("length");
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrLenFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("len").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrContainsFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.STR_CONTAINS, args.get(0), args.get(1).coerceToSoyString());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrContainsFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return args.get(1).coerceToString().in(args.get(0).coerceToString());
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrContainsFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "soy", "soy.$$strContains", args.get(0).coerceToString(), args.get(1).coerceToString());
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatCssValuesFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.concat_css_values").call(args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatCssValuesFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.CONCAT_CSS_VALUES, args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/ConcatCssValuesFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$concatCssValues", args.get(0), args.get(1));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/StrTrimMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.str_trim").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/StrTrimMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return args.get(0).invokeMethod("trim");
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/StrTrimMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.STR_TRIM, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/RoundFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory
        .global("runtime.soy_round")
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/RoundFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    if (args.size() == 1) {
      return factory.callStaticMethod(Methods.BOXED_ROUND_FN, args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/RoundFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    if (args.size() == 1) {
      return factory.global("Math").invokeMethod("round", args.get(0));
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/MapValuesMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return args.get(0).getProp("values").call();
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/MapValuesMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.MAP_VALUES_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/MapValuesMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    // TODO(lukes) this could be callModuleFunction but other parts of soy don't generate aliased
    // requires so we can't generate one here without create a 'multiple require' error
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/FloorFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("int").call(factory.global("math.floor").call(args.get(0)));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/FloorFunction.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.FLOOR_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/FloorFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.global("Math").invokeMethod("floor", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/basicfunctions/NumberListSortMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(Methods.LIST_SORT_FN, args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/basicfunctions/NumberListSortMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.number_list_sort").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/basicfunctions/NumberListSortMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction("soy", "soy.$$numberListSort", args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/i18ndirectives/LocaleSortMethod.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callModuleFunction(
        "soy.i18n",
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/i18ndirectives/LocaleSortMethod.java`
#### Snippet
```java
  @Override
  public JavaValue applyForJavaSource(
      JavaValueFactory factory, List<JavaValue> args, JavaPluginContext context) {
    return factory.callStaticMethod(
        Methods.LIST_SORT_FN,
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/i18ndirectives/LocaleSortMethod.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    return factory.global("runtime.string_list_sort").call(args.get(0));
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaValue`
in `java/src/com/google/template/soy/i18ndirectives/FormatNumFunction.java`
#### Snippet
```java
  }

  private static JavaValue getArgOrDefault(List<JavaValue> args, int index, JavaValue defaultVal) {
    return args.size() > index ? args.get(index) : defaultVal;
  }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends JavaScriptValue`
in `java/src/com/google/template/soy/i18ndirectives/FormatNumFunction.java`
#### Snippet
```java
  @Override
  public JavaScriptValue applyForJavaScriptSource(
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    List<JavaScriptValue> jsArgs = new ArrayList<>(args);
    if (jsArgs.size() == 1) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PythonValue`
in `java/src/com/google/template/soy/i18ndirectives/FormatNumFunction.java`
#### Snippet
```java
  @Override
  public PythonValue applyForPythonSource(
      PythonValueFactory factory, List<PythonValue> args, PythonPluginContext context) {
    List<PythonValue> pyArgs = new ArrayList<>(args);
    if (pyArgs.size() > 2) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/basicdirectives/InsertWordBreaksDirective.java`
#### Snippet
```java

  @Override
  public SoyValue applyForJava(SoyValue value, List<SoyValue> args) {

    int maxCharsBetweenWordBreaks;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/basicdirectives/CleanHtmlDirective.java`
#### Snippet
```java

  @Override
  public SoyValue applyForJava(SoyValue value, List<SoyValue> args) {
    ImmutableSet<OptionalSafeTag> optionalSafeTags =
        args.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PyExpr`
in `java/src/com/google/template/soy/basicdirectives/CleanHtmlDirective.java`
#### Snippet
```java

  @Override
  public PyExpr applyForPySrc(PyExpr value, List<PyExpr> args) {
    String optionalSafeTagsArg = generateOptionalSafeTagsArg(args);
    return new PyExpr(
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends SoyValue`
in `java/src/com/google/template/soy/basicdirectives/TruncateDirective.java`
#### Snippet
```java

  @Override
  public SoyValue applyForJava(SoyValue value, List<SoyValue> args) {
    int maxLen;
    try {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends PyExpr`
in `java/src/com/google/template/soy/basicdirectives/TruncateDirective.java`
#### Snippet
```java

  @Override
  public PyExpr applyForPySrc(PyExpr value, List<PyExpr> args) {
    // Truncation always wants a string, so to potentially save an unnecessary conversion, we do
    // optional coercing at compile time.
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Supplier`>
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      CallNode callNode,
      TranslateExprNodeVisitor exprTranslator,
      Optional<Supplier<List<Expression>>> positionalParameters,
      Supplier<Expression> paramObject,
      boolean isIdomCall) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Expression`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      TranslateExprNodeVisitor exprTranslator,
      Optional<Supplier<List<Expression>>> positionalParameters,
      Supplier<Expression> paramObject,
      boolean isIdomCall) {
    List<Expression> params = new ArrayList<>();
```

## RuleId[ruleID=NullableProblems]
### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
   * @return Whether this SoyRecord has a field of the given name.
   */
  boolean hasField(String name);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
  ImmutableMap<String, SoyValueProvider> recordAsMap();

  void forEach(BiConsumer<String, ? super SoyValueProvider> action);

  int recordSize();
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
   * @return A provider of the field value for the given field name, or null if no such field name.
   */
  SoyValueProvider getFieldProvider(String name);

  /** Returns a view of this object as a java map. */
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyRecord.java`
#### Snippet
```java
   * @return The field value for the given field name, or null if no such field name.
   */
  SoyValue getField(String name);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyValue.java`
#### Snippet
```java
   * @throws IOException
   */
  void render(LoggingAdvisingAppendable appendable) throws IOException;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@javax.annotation.Nonnull'
in `java/src/com/google/template/soy/base/SourceLocation.java`
#### Snippet
```java
public final class SourceLocation implements Comparable<SourceLocation> {
  /** A file path or URI useful for error messages. */
  @Nonnull private final SourceFilePath filePath;

  private final Point begin;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/data/SoyAbstractCachingValueProvider.java`
#### Snippet
```java
  // We thread a simple linked list through this field to eliminate the cost of allocating a
  // collection
  @Nullable private ValueAssertion valueAssertion;

  @Override
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return Whether this SoyMap has an item with the given key.
   */
  boolean containsKey(SoyValue key);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return An iterable over all item keys.
   */
  @Nonnull
  Iterable<? extends SoyValue> keys();

```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return The item value for the given item key, or null if no such item key.
   */
  SoyValue get(SoyValue key);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyMap.java`
#### Snippet
```java
   * @return A provider of the item value for the given item key, or null if no such item key.
   */
  SoyValueProvider getProvider(SoyValue key);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyList.java`
#### Snippet
```java
   * @return A Java list of all value providers.
   */
  @Nonnull
  List<? extends SoyValueProvider> asJavaList();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyList.java`
#### Snippet
```java
   * @return A Java list of all resolved values.
   */
  @Nonnull
  List<? extends SoyValue> asResolvedJavaList();

```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyValueProvider.java`
#### Snippet
```java
   * @return The resolved value.
   */
  @Nonnull
  SoyValue resolve();

```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyValueProvider.java`
#### Snippet
```java
   * @throws IOException If the appendable throws an IOException
   */
  RenderResult renderAndResolve(LoggingAdvisingAppendable appendable, boolean isLast)
      throws IOException;
}
```

### RuleId[ruleID=NullableProblems]
Overridden methods are not annotated
in `java/src/com/google/template/soy/data/SoyValueProvider.java`
#### Snippet
```java
   * RenderResult}
   */
  @Nonnull
  RenderResult status();

```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyLegacyObjectMap.java`
#### Snippet
```java
   * @return Whether this SoyMap has an item with the given key.
   */
  boolean hasItem(SoyValue key);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyLegacyObjectMap.java`
#### Snippet
```java
   * @return The item value for the given item key, or null if no such item key.
   */
  SoyValue getItem(SoyValue key);

  /**
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/data/SoyLegacyObjectMap.java`
#### Snippet
```java
   * @return A provider of the item value for the given item key, or null if no such item key.
   */
  SoyValueProvider getItemProvider(SoyValue key);
}

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java

  /** The directionality of the content appended to this appendable. */
  @Nullable private Dir contentDir;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/internal/InsertMsgsVisitor.java`
#### Snippet
```java
              + "shouldGenerateGoogMsgDefs is true.");

  @Nullable private final SoyMsgBundle msgBundle;
  private final ErrorReporter errorReporter;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    @Nullable private String meaning;
    @Nullable private String desc;
    @Nullable private String contentType;
    private final ImmutableSet.Builder<SourceLocationAndTemplate> sourceLocations =
        ImmutableSet.builder();
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    @Nullable private String localeString;
    @Nullable private String meaning;
    @Nullable private String desc;
    @Nullable private String contentType;
    private final ImmutableSet.Builder<SourceLocationAndTemplate> sourceLocations =
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    private long id;
    private OptionalLong alternateId = OptionalLong.empty();
    @Nullable private String localeString;
    @Nullable private String meaning;
    @Nullable private String desc;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
    private OptionalLong alternateId = OptionalLong.empty();
    @Nullable private String localeString;
    @Nullable private String meaning;
    @Nullable private String desc;
    @Nullable private String contentType;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  private static final class Scope {
    final Set<CodeChunk> formatted = Collections.newSetFromMap(new IdentityHashMap<>());
    @Nullable
    final Scope parent;
    final boolean emitClosingBrace;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/dsl/ConditionalBuilder.java`
#### Snippet
```java
  private final ImmutableList.Builder<IfThenPair<Statement>> conditions = ImmutableList.builder();

  @Nullable private Statement trailingElse = null;

  ConditionalBuilder(Expression predicate, Statement consequent) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/dsl/SwitchBuilder.java`
#### Snippet
```java
  private final Expression switchOn;
  private final ImmutableList.Builder<Switch.CaseClause> clauses = ImmutableList.builder();
  @Nullable private Statement defaultCaseBody;

  SwitchBuilder(Expression switchOn) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
  private static class DotCall extends ChainAccess {
    final String getter;
    @Nullable final Expression arg;

    DotCall(String getter, @Nullable Expression arg, boolean nullSafe, boolean assertNonNull) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
    final ImmutableSortedSet.Builder<String> typeExpressions = ImmutableSortedSet.naturalOrder();
    final ImmutableSet.Builder<GoogRequire> extraRequires = ImmutableSet.builder();
    @Nullable TypePredicate predicate;

    @CanIgnoreReturnValue
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java

  /** The name of a manifest file to generate, or null. */
  @Nullable private final String namespaceManifestFile;

  public SoyPySrcOptions(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
     * which require a different formatting method to be called.
     */
    @Nullable final Expression placeholders;

    GoogMsgCodeGenInfo(Expression googMsgVar, Expression placeholders) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java

    private final Type type;
    @Nullable private final PyExpr defaultValue;

    private NotFoundBehavior(Type type) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/types/ast/TypeNode.java`
#### Snippet
```java
public abstract class TypeNode {

  @Nullable private SoyType resolvedType;

  TypeNode() {}
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/JbcSrcJavaValue.java`
#### Snippet
```java

  private final Expression expr;
  @Nullable private final MethodSignature methodSignature;

  private JbcSrcJavaValue(Expression expr, MethodSignature methodSignature) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
      extends EnhancedAbstractExprNodeVisitor<SoyExpression> {
    // is null when we are generating code with no detaches.
    @Nullable final ExpressionDetacher detacher;
    private final SoyNode context;
    final TemplateAnalysis analysis;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  private ErrorReporter errorReporter;

  @Nullable private final Appendable warningSink;

  SoyFileSet(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  /** Optional soy tree cache for faster recompile times. */
  @Nullable private final SoyAstCache cache;

  private final SoyGeneralOptions generalOptions;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    private final SoyTypeRegistryBuilder typeRegistryBuilder = new SoyTypeRegistryBuilder();

    @Nullable private Appendable warningSink;

    private ValidatedConformanceConfig conformanceConfig = ValidatedConformanceConfig.EMPTY;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
    @Nullable final ExpressionCompiler exprCompiler;
    @Nullable final BasicExpressionCompiler detachingExprCompiler;
    @Nullable final ExpressionDetacher detacher;

    CompilerVisitor(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
    // depending on the mode at most one of exprCompiler and detachingExprCompiler will be null
    @Nullable final ExpressionCompiler exprCompiler;
    @Nullable final BasicExpressionCompiler detachingExprCompiler;
    @Nullable final ExpressionDetacher detacher;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java

    // depending on the mode at most one of exprCompiler and detachingExprCompiler will be null
    @Nullable final ExpressionCompiler exprCompiler;
    @Nullable final BasicExpressionCompiler detachingExprCompiler;
    @Nullable final ExpressionDetacher detacher;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/api/RenderResult.java`
#### Snippet
```java
  private final Type type;

  @Nullable
  private final Future<?> future;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    @Nullable Multiset<String> startPlaceholderRenderCount;
    // an optional map from a placeholder to another placeholder that must precede it.
    @Nullable SetMultimap<String, String> endPlaceholderToStartPlaceholder;
    private final long msgId;
    private final boolean htmlEscape;
```

### RuleId[ruleID=NullableProblems]
Method annotated with @Nullable must not override @Nonnull method
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    }

    @Nullable
    @Override
    public SoyValue resolve() {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    // correctly in the face of translators reordering things.
    // The constraints are simply that an end tag must come after a start tag
    @Nullable Set<String> startPlaceholders;
    @Nullable Multiset<String> startPlaceholderRenderCount;
    // an optional map from a placeholder to another placeholder that must precede it.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    // The constraints are simply that an end tag must come after a start tag
    @Nullable Set<String> startPlaceholders;
    @Nullable Multiset<String> startPlaceholderRenderCount;
    // an optional map from a placeholder to another placeholder that must precede it.
    @Nullable SetMultimap<String, String> endPlaceholderToStartPlaceholder;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/StrictHtmlValidationPass.java`
#### Snippet
```java
  private final ErrorReporter errorReporter;

  @Nullable private HtmlMatcherGraph htmlMatcherGraph = null;

  public StrictHtmlValidationPass(ErrorReporter errorReporter) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherAccumulatorNode.java`
#### Snippet
```java
public final class HtmlMatcherAccumulatorNode extends HtmlMatcherGraphNode {

  @Nullable private HtmlMatcherGraphNode nextNode = null;

  @Override
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  @Nullable private HtmlMatcherGraphNode trueBranchNode = null;

  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;

  private Optional<Boolean> isInternallyBalancedForForeignContent = Optional.empty();
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  private final HtmlMatcherGraph graph;

  @Nullable private HtmlMatcherGraphNode trueBranchNode = null;

  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherTagNode.java`
#### Snippet
```java
  private final HtmlTagNode htmlTagNode;

  @Nullable private HtmlMatcherGraphNode nextNode = null;

  public HtmlMatcherTagNode(SoyNode htmlTagNode) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherBlockNode.java`
#### Snippet
```java
  private final String parentBlockType;

  @Nullable private HtmlMatcherGraphNode nextNode;

  public HtmlMatcherBlockNode(HtmlMatcherGraph graph, String parentBlockType) {
```

### RuleId[ruleID=NullableProblems]
Overridden method parameters are not annotated
in `java/src/com/google/template/soy/shared/SoyIdRenamingMap.java`
#### Snippet
```java
   */
  @Nullable
  String get(String key);
}

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
  private static final class Group<T> {
    final String formattedName;
    @Nullable final T defaultValue;
    final ImmutableMap<String, T> modToValue;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/DirectiveDigest.java`
#### Snippet
```java

  /** The prefix to use for non-ASCII characters not in the escape map. */
  @Nullable final String nonAsciiPrefix;

  /** Innocuous output for this context. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
  private static final class TypeSubstitution {
    /** Parent substitution. */
    @Nullable final TypeSubstitution parent;

    /** The expression whose type we are overriding. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/HtmlAttributeNode.java`
#### Snippet
```java

  /** Will be null if this attribute node doesn't have a value. */
  @Nullable private final SourceLocation.Point equalsSignLocation;

  public HtmlAttributeNode(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java

  /** Used for error messages to detail what context an error is in. */
  @Nullable private final String parentBlockType;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
  public abstract static class CrossLanguageStringXform extends Escaper {
    private final String directiveName;
    @Nullable private final Pattern valueFilter;
    private final ImmutableList<Escape> escapes;
    /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
     * @see #getNonAsciiPrefix
     */
    @Nullable private final String nonAsciiPrefix;

    /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java

  private final StandaloneNode node;
  @Nullable private final String nameAsLowerCase;
  @Nullable private final RcDataTagName rcDataTagName;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
  private final StandaloneNode node;
  @Nullable private final String nameAsLowerCase;
  @Nullable private final RcDataTagName rcDataTagName;

  public TagName(RawTextNode node) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/SoyFileNode.java`
#### Snippet
```java

  /** The name and location of the containing modname, or null if none. */
  @Nullable private final ModNameDeclaration modName;

  /** This Soy file's namespace, or null if syntax version V1. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/PrintNode.java`
#### Snippet
```java
  private final MessagePlaceholder placeholder;

  @Nullable private HtmlContext htmlContext;

  // TODO(user): Consider adding static factory methods for implicit vs explicit print.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/ForNonemptyNode.java`
#### Snippet
```java

  private final LocalVar var;
  @Nullable private final LocalVar indexVar;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/HtmlContext.java`
#### Snippet
```java

  @Nullable private final EscapingMode escapingMode;
  @Nullable private final String errorMessage;

  /** Whether a class contains information about HTML context */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/HtmlContext.java`
#### Snippet
```java
  TEXT(EscapingMode.TEXT);

  @Nullable private final EscapingMode escapingMode;
  @Nullable private final String errorMessage;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/IfNode.java`
#### Snippet
```java
        StatementNode {

  @Nullable private HtmlContext htmlContext;
  private final SourceLocation closeTagLocation;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgFallbackGroupNode.java`
#### Snippet
```java
  private ImmutableList<SoyPrintDirective> escapingDirectiveNames = ImmutableList.of();

  @Nullable private HtmlContext htmlContext;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgHtmlTagNode.java`
#### Snippet
```java
  private final boolean isSelfEnding;

  @Nullable private final SamenessKey samenessKey;

  private final MessagePlaceholder placeholder;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java
   * used to help with dom alignment in Incremental DOM backend.
   */
  @Nullable private String callKey;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java

  /** The HTML context that the call is in, such as in HTML or Attributes. */
  @Nullable private HtmlContext htmlContext;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/VeLogNode.java`
#### Snippet
```java
  private boolean needsSyntheticVelogNode = false;
  private final List<CommandTagAttribute> attributes;
  @Nullable private final ExprRootNode logonlyExpr;

  public VeLogNode(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The EscapingMode where this message is used. */
  @Nullable private EscapingMode escapingMode = null;

  /** The optional alternate id attribute to be used if a translation for the msg id is missing. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The meaning string if set, otherwise null (usually null). */
  @Nullable private final String meaning;

  /** The description string for translators. Required. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The list of expressions for gender values. Null after rewriting. */
  @Nullable private ImmutableList<ExprRootNode> genderExprs;

  /** The meaning string if set, otherwise null (usually null). */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The substitution unit info (var name mappings, or null if not yet generated). */
  @Nullable private SubstUnitInfo substUnitInfo = null;

  /** The EscapingMode where this message is used. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The string representation of genderExprs, for debugging. */
  @Nullable private final String genderExprsString;

  /** The substitution unit info (var name mappings, or null if not yet generated). */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/EscapingMode.java`
#### Snippet
```java

  /** The kind of content produced by the escaping directive associated with this escaping mode. */
  @Nullable public final SanitizedContentKind contentKind;

  /** Whether this directive is only for internal use by the contextual autoescaper. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java

  /** The params from template header. Null if no decls. */
  @Nullable protected ImmutableList<TemplateHeaderVarDefn> params;

  protected boolean strictHtmlDisabled;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
  @Nullable private final SourceOffsets offsets;

  @Nullable private HtmlContext htmlContext;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
  private final Provenance provenance;

  @Nullable private final SourceOffsets offsets;

  @Nullable private HtmlContext htmlContext;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
  // either value or valueExprList must be set, but not both.
  @Nullable private final String value;
  @Nullable private final ImmutableList<ExprRootNode> valueExprList;

  public CommandTagAttribute(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
  private final SourceLocation sourceLocation;
  // either value or valueExprList must be set, but not both.
  @Nullable private final String value;
  @Nullable private final ImmutableList<ExprRootNode> valueExprList;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/defn/TemplateStateVar.java`
#### Snippet
```java
  @Nullable private final TypeNode typeNode;
  private final TypeNode originalTypeNode;
  @Nullable private final ExprRootNode initialValue;
  private final boolean isExplicitlyOptional;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/defn/TemplateStateVar.java`
#### Snippet
```java
  private String desc;
  private final SourceLocation sourceLocation;
  @Nullable private final TypeNode typeNode;
  private final TypeNode originalTypeNode;
  @Nullable private final ExprRootNode initialValue;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/defn/TemplateParam.java`
#### Snippet
```java
  private final boolean isExplicitlyOptional;

  @Nullable private final ExprRootNode defaultValue;

  public TemplateParam(
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private final ImmutableMap<SourceFilePath, SoyFileSupplier> soyFileSuppliers;
  private SoyTypeRegistry typeRegistry = SoyTypeRegistryBuilder.create();
  @Nullable private SoyAstCache astCache = null;
  private ErrorReporter errorReporter = ErrorReporter.exploding(); // See #parse for discussion.
  private boolean allowUnboundGlobals;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/VeLiteralNode.java`
#### Snippet
```java
  private final Identifier veIdentifier;
  private final Identifier name;
  @Nullable private ValidatedLoggableElement loggableElement;
  private SoyType type;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/AbstractVarDefn.java`
#### Snippet
```java
  private final String name;

  @Nullable private final SourceLocation nameLocation;

  /** The data type of the value. */
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/AbstractVarDefn.java`
#### Snippet
```java

  /** The data type of the value. */
  @Nullable protected SoyType type;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/ListComprehensionNode.java`
#### Snippet
```java
public final class ListComprehensionNode extends AbstractParentExprNode {
  private final ComprehensionVarDefn listIterVar;
  @Nullable private final ComprehensionVarDefn indexVar;
  private final boolean hasFilter;
  private int nodeId;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/internal/i18n/BidiGlobalDir.java`
#### Snippet
```java
  private final String codeSnippet;
  /** An optional {@code goog.require} namespace associated with the snippet. */
  @Nullable private final String namespace;

  /**
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
  private final ImmutableList<Identifier> paramNames;

  @Nullable private final ImmutableList<SourceLocation.Point> commaLocations;

  // Mutable state stored in this AST node from various passes.
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
  private static final class FunctionState {
    @Nullable private FunctionRef function;
    @Nullable private ImmutableList<SoyType> allowedParamTypes;
    private boolean allowedToInvokeAsFunction = false;
  }
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java

  private static final class FunctionState {
    @Nullable private FunctionRef function;
    @Nullable private ImmutableList<SoyType> allowedParamTypes;
    private boolean allowedToInvokeAsFunction = false;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
    private final ImmutableList<String> importSymbols;

    @Nullable private final ModNameDeclaration modNameDeclaration;
    private final Priority priority;
    @Nullable private final String namespace;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
    @Nullable private final ModNameDeclaration modNameDeclaration;
    private final Priority priority;
    @Nullable private final String namespace;

    private final Set<String> usedAliases;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/SoyAutoescapeException.java`
#### Snippet
```java

  /** The name of the template with the syntax error if any. */
  @Nullable private final String templateName;

  private SoyAutoescapeException(String message, Throwable cause, SoyNode node) {
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
      new Transition(Pattern.compile("(?i)^(javascript|data|blob|filesystem):")) {
        @Override
        boolean isApplicableTo(Context prior, Matcher matcher) {
          return prior.uriPart() == UriPart.START && prior.uriType() != UriType.TRUSTED_RESOURCE;
        }
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(RawTextNode node, int offset, Context prior, Matcher matcher) {
        throw SoyAutoescapeException.createWithNode(
            message, node.substring(Integer.MAX_VALUE, offset));
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        return prior.transitionToState(state);
      }
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

    /** For matching a literal string. */
    @Nullable final String literal;

    Transition(Pattern pattern) {
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        return prior;
      }
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
                      Pattern.compile("[,;] *(URL *=? *)?['\"]?", Pattern.CASE_INSENSITIVE)) {
                    @Override
                    Context computeNextContext(Context prior, Matcher matcher) {
                      return prior.toBuilder()
                          .withState(HtmlContext.URI)
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

        @Override
        Context computeNextContext(Context prior, Matcher matcher) {
          // TODO(gboyer): Ban all but whitelisted schemes.
          return prior.derive(UriPart.DANGEROUS_SCHEME);
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
      new Transition() {
        @Override
        Context computeNextContext(Context prior, Matcher matcher) {
          return prior;
        }
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

        @Override
        Context computeNextContext(RawTextNode node, int offset, Context prior, Matcher matcher) {
          UriPart uriPart = prior.uriPart();
          if (uriPart == UriPart.START) {
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
                  new Transition() {
                    @Override
                    Context computeNextContext(Context prior, Matcher matcher) {
                      return prior.derive(HtmlHtmlAttributePosition.NOT_START);
                    }
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(literal) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        return prior.transitionToState(state);
      }
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java

    /** Matches a pattern. */
    @Nullable final Pattern pattern;

    /** For matching a literal string. */
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
    return new Transition(regex) {
      @Override
      Context computeNextContext(Context prior, Matcher matcher) {
        String delim = matcher.group(1);
        HtmlContext state;
```

### RuleId[ruleID=NullableProblems]
Parameter annotated @ParametersAreNonnullByDefault must not override @Nullable parameter
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
      new Transition(Pattern.compile("([:./&?=#])|\\z")) {
        @Override
        boolean isApplicableTo(Context prior, Matcher matcher) {
          return prior.uriType() != UriType.TRUSTED_RESOURCE;
        }
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuPluginContext.java`
#### Snippet
```java
/** Exposes plugin context for Tofu, based on a SoyMsgBundle. */
final class TofuPluginContext implements JavaPluginContext {
  @Nullable private final SoyMsgBundle msgBundle;

  public TofuPluginContext(@Nullable SoyMsgBundle msgBundle) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  @Nullable private final SoyValue soyValue;
  @Nullable private final SourceLocation sourceLocation;
  @Nullable private final Object rawValue;

  private TofuJavaValue(SoyValue soyValue, Object rawValue, SourceLocation sourceLocation) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java

  @Nullable private final SoyValue soyValue;
  @Nullable private final SourceLocation sourceLocation;
  @Nullable private final Object rawValue;

```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  }

  @Nullable private final SoyValue soyValue;
  @Nullable private final SourceLocation sourceLocation;
  @Nullable private final Object rawValue;
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
     * that is part of the attribute but not part of the value.
     */
    @Nullable public final String text;

    AttributeEndDelimiter(String text) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java
  private final String instanceKey;
  private final PluginInstances pluginInstances;
  @Nullable private final FunctionType externSig;

  TofuValueFactory(JavaPluginExecContext fn, PluginInstances pluginInstances) {
```

### RuleId[ruleID=NullableProblems]
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@javax.annotation.Nullable'
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
  private final Environment env;

  @Nullable private final SoyMsgBundle msgBundle;

  /** The current CSS renaming map. */
```

## RuleId[ruleID=AnonymousHasLambdaAlternative]
### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `java/src/com/google/template/soy/data/SoyFutureValueProvider.java`
#### Snippet
```java
   */
  public static final ThreadLocal<FutureBlockCallback> futureBlockCallback =
      new ThreadLocal<FutureBlockCallback>() {
        @Override
        protected FutureBlockCallback initialValue() {
```

### RuleId[ruleID=AnonymousHasLambdaAlternative]
Anonymous new ThreadLocal() can be replaced with ThreadLocal.withInitial()
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeProducer.java`
#### Snippet
```java
  private static final ThreadLocal<Boolean> isGenerating =
      Flags.DEBUG
          ? new ThreadLocal<Boolean>() {
            @Override
            protected Boolean initialValue() {
```

## RuleId[ruleID=IfStatementMissingBreakInLoop]
### RuleId[ruleID=IfStatementMissingBreakInLoop]
Loop can be terminated after condition is met
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    if (isValid) {
      for (StandaloneNode child : openTag.getChildren()) {
        if (child instanceof SkipNode) {
          hasSkipNode = true;
        }
```

## RuleId[ruleID=InstanceofIncompatibleInterface]
### RuleId[ruleID=InstanceofIncompatibleInterface]
'instanceof' incompatible interface `AlwaysSlowPath`
in `java/src/com/google/template/soy/jbcsrc/shared/ClassLoaderFallbackCallFactory.java`
#### Snippet
```java
    }
    // Test if we should send this class through the slowpath anyway
    if (clazz.getClassLoader() instanceof AlwaysSlowPath) {
      Method method =
          clazz.getDeclaredMethod(Names.renderMethodNameFromSoyTemplateName(templateName));
```

## RuleId[ruleID=IgnoreResultOfCall]
### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
    for (Path outputPath : outputPathToContents.keySet()) {
      if (outputPath.getParent() != null) {
        outputPath.getParent().toFile().mkdirs();
      }
      try {
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.mkdirs()` is ignored
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
      return; // known to exist
    } else {
      new File(dirPath).mkdirs();
      knownExistingDirs.add(dirPath);
    }
```

### RuleId[ruleID=IgnoreResultOfCall]
Result of `File.delete()` is ignored
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
    } catch (IOException ex) {
      // Make sure an abortive write does not leave a file w
      output.file.delete();
    }
  }
```

## RuleId[ruleID=UnnecessaryUnboxing]
### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return FloatData.forValue(((Float) field).floatValue());
        }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return FloatData.forValue(((Double) field).doubleValue());
        }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return IntegerData.forValue(((Long) field).longValue());
        }

```

### RuleId[ruleID=UnnecessaryUnboxing]
Unnecessary unboxing
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
          //   amp           end
          Integer cpI = HTML_ENTITY_TO_CODEPOINT.get(s.substring(amp, end));
          cp = cpI != null ? cpI.intValue() : -1;
        }
      }
```

## RuleId[ruleID=WhileLoopSpinsOnField]
### RuleId[ruleID=WhileLoopSpinsOnField]
`while` loop spins on field
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
      int embeddingLevel = 0;
      int lastNonEmptyEmbeddingLevel = 0;
      while (charIndex > 0) {
        switch (dirTypeBackward()) {
          case UCharacter.DIRECTIONALITY_LEFT_TO_RIGHT:
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `visitChildren()` only delegates to its super method
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
    // override to make it visible
    @Override
    protected void visitChildren(ParentSoyNode<?> node) {
      super.visitChildren(node);
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `getInnocuousOutput()` is identical to its super method
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java

    @Override
    public String getInnocuousOutput() {
      return INNOCUOUS_OUTPUT;
    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `toSourceString()` is identical to its super method
in `java/src/com/google/template/soy/soytree/KeyNode.java`
#### Snippet
```java

  @Override
  public String toSourceString() {
    return getTagString();
  }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Scope` is the same as one of its superclass' names
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
  }

  abstract static class Scope implements LocalVariableManager.Scope {
    private Scope() {}

```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `NodeVisitor` is the same as one of its superclass' names
in `java/src/com/google/template/soy/passes/LocalVariablesNodeVisitor.java`
#### Snippet
```java
  }

  abstract static class NodeVisitor extends AbstractSoyNodeVisitor<Void> {

    /** Scope for injected params. */
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `InScope` is the same as one of its superclass' names
in `java/src/com/google/template/soy/shared/internal/SoySimpleScope.java`
#### Snippet
```java
   * <p>Obtain an instance with {@link SoySimpleScope#enter}.
   */
  private static final class InScope implements SoyScopedData.InScope {
    private boolean isClosed;
    private final Thread openThread = Thread.currentThread();
```

## RuleId[ruleID=DefaultAnnotationParam]
### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `java/src/com/google/template/soy/SoyPluginValidator.java`
#### Snippet
```java
  @Option(
      name = "--validateJavaImpls",
      required = false,
      usage = "[Optional] Whether to validate the plugin's Java implementations.")
  private boolean validateJavaImpls = true;
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `java/src/com/google/template/soy/SoyPluginValidator.java`
#### Snippet
```java
  @Option(
      name = "--pluginRuntimeJars",
      required = false,
      usage =
          "[Optional] The list of jars that contain the plugin runtime"
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
  @Option(
      name = "--javaPackage",
      required = false,
      usage =
          "The Java package name used for generated Java classes associated with these"
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `java/src/com/google/template/soy/SoyToJbcSrcCompiler.java`
#### Snippet
```java
  @Option(
    name = "--outputSrcJar",
    required = false,
    usage =
        "[Optional] The file name of the JAR containing sources to be written.  Each compiler"
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `java/src/com/google/template/soy/basicfunctions/StringListSortMethod.java`
#### Snippet
```java
    value = {
      @Signature(
          parameterTypes = {},
          returnType = "list<string>"),
    })
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `java/src/com/google/template/soy/basicfunctions/NumberListSortMethod.java`
#### Snippet
```java
    value = {
      @Signature(
          parameterTypes = {},
          // The generic type may be overwritten to a narrower int or float type by
          // ResolveExpressionTypesPass.
```

### RuleId[ruleID=DefaultAnnotationParam]
Redundant default parameter value assignment
in `java/src/com/google/template/soy/i18ndirectives/LocaleSortMethod.java`
#### Snippet
```java
    value = {
      @Signature(
          parameterTypes = {},
          returnType = "list<string>"),
      @Signature(
```

## RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
### RuleId[ruleID=IntegerMultiplicationImplicitCastToLong]
step \* i: integer multiplication implicitly cast to long
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
        int size = length / step + (length % step == 0 ? 0 : 1);
        for (int i = 0; i < size; ++i) {
          executeForeachBody(child, i, IntegerData.forValue(start + step * i));
        }
      }
```

## RuleId[ruleID=RegExpDuplicateCharacterInClass]
### RuleId[ruleID=RegExpDuplicateCharacterInClass]
Duplicate character '_' inside character class
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
     */
    static final Pattern ATTRIBUTE_NAME =
        Pattern.compile("[a-z_$_@](?:[a-z0-9_:?$\\\\-]*[a-z0-9?$_])?", Pattern.CASE_INSENSITIVE);

    /**
```

## RuleId[ruleID=IfStatementWithIdenticalBranches]
### RuleId[ruleID=IfStatementWithIdenticalBranches]
'if' statement can be collapsed with side effect extraction
in `java/src/com/google/template/soy/plugin/java/internal/CompiledJarsPluginSignatureReader.java`
#### Snippet
```java
    // If a matching sig exists w/o a matching return type, return an arbitrary method so we can
    // display a decent error message.
    if (!methodsForSig.isEmpty()) {
      return false;
    }
```

### RuleId[ruleID=IfStatementWithIdenticalBranches]
'if' statement can be collapsed with side effect extraction
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
  @Nullable
  public Message getGeneratedCodeInfo() {
    if (!isEnabled()) {
      return null;
    }
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `java/src/com/google/template/soy/jbcsrc/internal/AbstractMemoryClassLoader.java`
#### Snippet
```java
    }
    try {
      return super.defineClass(
          name, classDef.data(), 0, classDef.data().length, DEFAULT_PROTECTION_DOMAIN);
    } catch (Throwable t) {
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
  protected Statement visitIfNode(IfNode node) {
    if (!isTextContent(contentKind.peek())) {
      return super.generateNonExpressionIfNode(node);
    } else {
      return super.visitIfNode(node);
```

## RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`fieldName = fieldName + field.getNumber()` could be simplified to 'fieldName += field.getNumber()'
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
      // If there is a conflict, add the field number to the end of the field name. The same is done
      // in Proto Java at
      fieldName = fieldName + field.getNumber();
    }
    String javaName = underscoresToCamelCase(fieldName, capitalizeFirstLetter);
```

### RuleId[ruleID=ReplaceAssignmentWithOperatorAssignment]
`upperUnderscoreKey = upperUnderscoreKey + "_"` could be simplified to 'upperUnderscoreKey += "_"'
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
      // stage of the compiler.
      while (allParamKeysMap.containsKey(upperUnderscoreKey)) {
        upperUnderscoreKey = upperUnderscoreKey + "_";
      }
      allParamKeysMap.put(upperUnderscoreKey, key);
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/error/SoyErrorKind.java`
#### Snippet
```java
    int index = 0;
    char singleQuote = '\'';
    while ((index = format.indexOf(singleQuote, index)) != -1) {
      int nextIndex = format.indexOf(singleQuote, index + 1);
      if (nextIndex == -1) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
      toVisit.add(initialTemplate);
      TemplateNode currentTemplate;
      while ((currentTemplate = toVisit.poll()) != null) {
        if (!soFar.add(currentTemplate)) {
          continue; // avoid revisiting recursion
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
      Optional<ListOfExpressionsAndInitializer> explicitParams;
      if (asDirectPositionalCall.isPresent()
          && (explicitParams =
                  paramsExpression.asPositionalParams(
                      renderScope, asDirectPositionalCall.get().calleeType()))
              .isPresent()) {
        initParams = explicitParams.get().initializer();
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
      toVisit.add(start);
      Block current;
      while ((current = toVisit.poll()) != null) {
        if (visited.add(current)) {
          adjacencyMatrix.putAll(current, current.successors);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableContentProvider.java`
#### Snippet
```java
        (LoggingAdvisingAppendable.BufferingAppendable) builder;
    if (currentBuilder == null) {
      builder = currentBuilder = LoggingAdvisingAppendable.buffering();
    }
    RenderResult result;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableContentProvider.java`
#### Snippet
```java
    TeeAdvisingAppendable currentBuilder = (TeeAdvisingAppendable) builder;
    if (currentBuilder == null) {
      builder = currentBuilder = new TeeAdvisingAppendable(appendable);
    }
    RenderResult result = doRender(currentBuilder);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java
    Object last;
    int lastElement = constantParts.size() - 1;
    while ((last = constantParts.get(lastElement)) instanceof Integer
        && ((Integer) last) == Tag.END.ordinal()) {
      lastElement--;
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
    int start = 0;
    int indexOfLt;
    while ((indexOfLt = value.indexOf('<', start)) != -1) {
      start = indexOfLt;
      if (matchPrefixIgnoreCasePastEnd("</script", value, start)
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex > 0 && (lastChar = text.charAt(--charIndex)) != quote) {}
        }
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex < length && (lastChar = text.charAt(charIndex++)) != quote) {}
        }
      }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
     */
    private byte skipEntityForward() {
      while (charIndex < length && (lastChar = text.charAt(charIndex++)) != ';') {}
      return UCharacter.DIRECTIONALITY_WHITESPACE;
    }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
        // Infer one.
        escapingModes =
            escapingModesToSet = context.getEscapingModes(printNode, printNode.getChildren());
        inferences.setEscapingDirectives(printNode, prev, escapingModesToSet);
      } else if (!context.isCompatibleWith(escapingModes.get(0))) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
          case NONE:
            // no replacements, no parsing, just jump to the end
            currentRawTextIndex = currentRawTextOffset = currentRawText.length();
            break;
          case PCDATA:
```

## RuleId[ruleID=CodeBlock2Expr]
### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `java/src/com/google/template/soy/soytree/PrintNode.java`
#### Snippet
```java
      copyState.registerRefListener(
          orig.node,
          newNode -> {
            this.node = newNode;
          });
```

### RuleId[ruleID=CodeBlock2Expr]
Statement lambda can be replaced with expression lambda
in `java/src/com/google/template/soy/soytree/VeLogNode.java`
#### Snippet
```java
      copyState.registerRefListener(
          orig.delegate,
          newDelegate -> {
            this.delegate = newDelegate;
          });
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `conformanceConfigs` are queried, but never updated
in `java/src/com/google/template/soy/SoyConformanceChecker.java`
#### Snippet
```java
      usage = "Location of conformance config protos in text proto format.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> conformanceConfigs = new ArrayList<>();

  SoyConformanceChecker(PluginLoader loader, SoyInputCache cache) {
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `pluginModules` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " print directive plugins (comma-delimited list).",
      handler = SoyCmdLineParser.ModuleListOptionHandler.class)
  private List<Module> pluginModules = new ArrayList<>();

  @Option(
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `indirectDepHeaders` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + "Used by the compiler for typechecking and call analysis.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> indirectDepHeaders = new ArrayList<>();

  @Option(
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `loggingConfigs` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
      usage = "Location of logging config protos in binary proto format. Optional.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> loggingConfigs = new ArrayList<>();

  @Option(
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `javaDeps` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " references.",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> javaDeps = new ArrayList<>();

  @Option(
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `depHeaders` are queried, but never updated
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + " analysis/checking..",
      handler = SoyCmdLineParser.FileListOptionHandler.class)
  private List<File> depHeaders = new ArrayList<>();

  @Option(
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `locales` are queried, but never updated
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " combination of input Soy file and locale.",
      handler = SoyCmdLineParser.StringListOptionHandler.class)
  private List<String> locales = new ArrayList<>();

  @Option(
```

### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `inputRoots` are queried, but never updated
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
              + "are transformed into output paths.  See --outputDirectory for more information.",
      handler = SoyCmdLineParser.PathListOptionHandler.class)
  private List<Path> inputRoots = new ArrayList<>();

  @Option(
```

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `errorReporter` is accessed in both synchronized and unsynchronized contexts
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  /** For reporting errors during parsing. */
  private ErrorReporter errorReporter;

  @Nullable private final Appendable warningSink;
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `java/src/com/google/template/soy/SoyInputCache.java`
#### Snippet
```java
   * file} should be evicted.
   */
  void declareDependency(File file, File dependency);

  /**
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `java/src/com/google/template/soy/basetree/AbstractNode.java`
#### Snippet
```java

  @Override
  public final int hashCode() {
    return super.hashCode();
  }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `java/src/com/google/template/soy/exprtree/AbstractVarDefn.java`
#### Snippet
```java

  @Override
  public final int hashCode() {
    return super.hashCode();
  }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `java/src/com/google/template/soy/jbcsrc/BytecodeCompiler.java`
#### Snippet
```java
     * @param name The full name as would be returned by SoyTemplateInfo.getName()
     */
    void onCompileTemplate(String name) {}

    /**
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java
  }

  private void validateJs(JsImplNode jsImplNode) {}

  @Nullable
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `java/src/com/google/template/soy/soytree/FileMetadata.java`
#### Snippet
```java
  /** Java object version of {@link ConstantP}. */
  interface Constant {
    String getName();

    SoyType getType();
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `java/src/com/google/template/soy/soytree/FileMetadata.java`
#### Snippet
```java
    String getName();

    SoyType getType();
  }

```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `java/src/com/google/template/soy/soytree/FileMetadata.java`
#### Snippet
```java
  /** Java object version of {@link ExternP}. */
  interface Extern {
    String getName();

    FunctionType getSignature();
```

### RuleId[ruleID=EmptyMethod]
All implementations of this method are empty
in `java/src/com/google/template/soy/soytree/FileMetadata.java`
#### Snippet
```java
    String getName();

    FunctionType getSignature();
  }

```

### RuleId[ruleID=EmptyMethod]
Method only calls its super
in `java/src/com/google/template/soy/soytree/SoyFileSetNode.java`
#### Snippet
```java
  @Deprecated
  @Override
  public SourceLocation getSourceLocation() {
    return super.getSourceLocation();
  }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/SoyToIncrementalDomSrcCompiler.java`
#### Snippet
```java
          "When this option is used, the generated JS files will have a requirecss annotation for"
              + " the generated GSS header file.")
  private boolean dependOnCssHeader = false;

  private final PerInputOutputFiles outputFiles =
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/SoyToPySrcCompiler.java`
#### Snippet
```java
            + " to write. Default is to not write this file."
  )
  private String outputNamespaceManifest = null;

  private final PerInputOutputFiles outputFiles = new PerInputOutputFiles("py");
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
              + " (FooTemplates.java). If false, generates the old FooSoyInfo.java files"
              + " instead.")
  private boolean generateBuilders = false;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/SoyHeaderCompiler.java`
#### Snippet
```java
          "Where to write metadata about the template calls.  This will be a file containing"
              + " a gzipped TemplateCallMetadata proto")
  private File templateCallMetadataOutput = null;

  SoyHeaderCompiler(PluginLoader loader, SoyInputCache cache) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/SoyHeaderCompiler.java`
#### Snippet
```java
          "Where to write metadata about CSS.  This will be a file containing a gzipped"
              + " CssMetadata proto")
  private File cssMetadataOutput = null;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
      name = "--skip_css_reference_check",
      usage = "Whether to skip the go/css-conformance#css-reference-checks.")
  private boolean skipCssReferenceCheck = false;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
              + "the performance in general. "
              + "This flag should only be set in integration test environment.")
  private boolean disableOptimizer = false;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " Whether to determine the bidi global direction at template runtime by"
              + " evaluating (goog.i18n.bidi.IS_RTL). Do not combine with --bidiGlobalDir.")
  private boolean useGoogIsRtlForBidiGlobalDir = false;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " will end up with two separate and possibly different sets of translations"
              + " for your messages.")
  private boolean googMsgsAreExternal = false;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " necessary if a message file is provided, because by default the bidi global"
              + " directionality is simply inferred from the message file.")
  private int bidiGlobalDir = 0;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
              + " --bidiGlobalDir, or --useGoogIsRtlForBidiGlobalDir, usually the latter."
              + " Also see --googMsgsAreExternal.")
  private boolean shouldGenerateGoogMsgDefs = false;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/SoyToJsSrcCompiler.java`
#### Snippet
```java
          "When this option is used, the generated JS files will have a requirecss annotation for"
              + " the generated CSS header file.")
  private boolean dependOnCssHeader = false;

  @Option(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `java/src/com/google/template/soy/base/internal/IndentedLinesBuilder.java`
#### Snippet
```java
  private String indent;

  private int byteLength = 0;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/data/SoyAbstractCachingValueProvider.java`
#### Snippet
```java
   * null. This is volatile to indicate it will be tested and set atomically across threads.
   */
  private volatile SoyValue resolvedValue = null;

  // We thread a simple linked list through this field to eliminate the cost of allocating a
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/msgs/SoyMsgException.java`
#### Snippet
```java

  /** The name of the file or resource associated with this error. */
  private String fileOrResourceName = null;

  /** @param message A detailed description of the error. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `java/src/com/google/template/soy/msgs/restricted/RenderOnlySoyMsgBundleImpl.java`
#### Snippet
```java
  public Iterator<SoyMsg> iterator() {
    return new Iterator<SoyMsg>() {
      int index = 0;

      @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  private String curIndent;
  private boolean nextAppendShouldStartNewLine = false;
  private boolean applyTsxLineBreaks = false;
  private final ArrayDeque<InterpolationKind> interpolationKindStack;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  private Scope curScope = new Scope(/* parent= */ null, /* emitClosingBrace= */ false);
  private String curIndent;
  private boolean nextAppendShouldStartNewLine = false;
  private boolean applyTsxLineBreaks = false;
  private final ArrayDeque<InterpolationKind> interpolationKindStack;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/jssrc/dsl/ConditionalBuilder.java`
#### Snippet
```java
  private final ImmutableList.Builder<IfThenPair<Statement>> conditions = ImmutableList.builder();

  @Nullable private Statement trailingElse = null;

  ConditionalBuilder(Expression predicate, Statement consequent) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/pysrc/restricted/PyFunctionExprBuilder.java`
#### Snippet
```java
  private final Deque<PyExpr> argList;
  private final Map<String, PyExpr> kwargMap;
  private String unpackedKwargs = null;

  /** @param funcName The name of the function. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java
    private ProtoTypeRegistry protoRegistry;
    private boolean disableAllTypeChecking = false;
    private boolean systemExternal = false;

    private Builder() {}
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java
    private TypeRegistry typeRegistry;
    private ProtoTypeRegistry protoRegistry;
    private boolean disableAllTypeChecking = false;
    private boolean systemExternal = false;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/jbcsrc/FieldManager.java`
#### Snippet
```java
  private final List<FieldRef> fields = new ArrayList<>();
  private final List<StaticFieldVariable> staticFields = new ArrayList<>();
  private boolean definedFields = false;

  FieldManager(TypeInfo owner) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    private Optional<CssRegistry> cssRegistry = Optional.empty();

    private boolean skipPluginValidation = false;

    private boolean optimize = true;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

    /** Optional AST cache. */
    private SoyAstCache cache = null;

    /** The general compiler options. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

    /** The general compiler options. */
    private SoyGeneralOptions lazyGeneralOptions = null;

    /** The SoyProtoTypeProvider builder that will be built for local type registry. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProviderProvider.java`
#### Snippet
```java
 */
public abstract class DetachableSoyValueProviderProvider implements SoyValueProvider {
  protected SoyValueProvider resolvedValueProvider = null;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/passes/InsertMsgPlaceholderNodesPass.java`
#### Snippet
```java
    final IdGenerator nodeIdGen;
    final ErrorReporter errorReporter;
    boolean isValidMsgPlaceholderPosition = false;

    Visitor(IdGenerator nodeIdGen, ErrorReporter errorReporter) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/passes/StrictHtmlValidationPass.java`
#### Snippet
```java
  private final ErrorReporter errorReporter;

  @Nullable private HtmlMatcherGraph htmlMatcherGraph = null;

  public StrictHtmlValidationPass(ErrorReporter errorReporter) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherAccumulatorNode.java`
#### Snippet
```java
public final class HtmlMatcherAccumulatorNode extends HtmlMatcherGraphNode {

  @Nullable private HtmlMatcherGraphNode nextNode = null;

  @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  @Nullable private HtmlMatcherGraphNode trueBranchNode = null;

  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;

  private Optional<Boolean> isInternallyBalancedForForeignContent = Optional.empty();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  private final HtmlMatcherGraph graph;

  @Nullable private HtmlMatcherGraphNode trueBranchNode = null;

  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherTagNode.java`
#### Snippet
```java
  private final HtmlTagNode htmlTagNode;

  @Nullable private HtmlMatcherGraphNode nextNode = null;

  public HtmlMatcherTagNode(SoyNode htmlTagNode) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/shared/internal/StreamingAttributeEscaper.java`
#### Snippet
```java
  private final CrossLanguageStringXform transform;
  private final Appendable escapedAppendable;
  private StringBuilder buffer = null;

  private StreamingAttributeEscaper(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/SoyFileNode.java`
#### Snippet
```java
    private final String sourcePath;
    private String resolvedPath;
    private String namespace = null;

    CssPath(String sourcePath) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/soytree/TemplateBasicNodeBuilder.java`
#### Snippet
```java

  /** Expression that will evaluate to "modifies" attribute. */
  private boolean hasModifies = false;

  /** The "legacydeltemplatenamespace" attribute. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/soytree/TemplateBasicNodeBuilder.java`
#### Snippet
```java

  /** Expression that will evaluate to the value of the "variant" attribute. */
  private boolean hasVariant = false;

  /** The "usevarianttype" attribute. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/soytree/TemplateBasicNodeBuilder.java`
#### Snippet
```java

  /** The "modifiable" attribute. */
  private boolean modifiable = false;

  /** Expression that will evaluate to "modifies" attribute. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/HtmlOpenTagNode.java`
#### Snippet
```java
  private boolean isSkipRoot;

  private String keyId = null;

  public HtmlOpenTagNode(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java

  /** True if this node is within a HTML context. */
  private boolean isPcData = false;

  /** Protected constructor for use by subclasses. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
   * yet, while NullType is used to express that there is no usevarianttype attribute at all.
   */
  private SoyType useVariantType = null;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
  private final String useVariantTypeString;

  private String variantString = null;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/CallParamNode.java`
#### Snippet
```java
  // This parameter may be synthetically generated from an HTML attribute. Within velogging,
  // we need to reconstruct the original name.
  private String originalName = null;

  protected CallParamNode(int id, SourceLocation sourceLocation, Identifier key) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/soytree/VeLogNode.java`
#### Snippet
```java

  private final ExprRootNode veDataExpr;
  private boolean needsSyntheticVelogNode = false;
  private final List<CommandTagAttribute> attributes;
  @Nullable private final ExprRootNode logonlyExpr;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The EscapingMode where this message is used. */
  @Nullable private EscapingMode escapingMode = null;

  /** The optional alternate id attribute to be used if a translation for the msg id is missing. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The substitution unit info (var name mappings, or null if not yet generated). */
  @Nullable private SubstUnitInfo substUnitInfo = null;

  /** The EscapingMode where this message is used. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  private boolean component;

  SourceLocation allowExtraAttributesLoc = null;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java

  /** Counter for the number of examples written so far. */
  private static int numExamples = 0;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private boolean allowUnknownJsGlobals;
  // disable optimization by default
  private boolean runOptimizer = false;
  private final SoyScopedData scopedData;
  private ImmutableList.Builder<SoyFunction> soyFunctions;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private boolean addHtmlAttributesForDebugging = false;
  private final PassManager.Builder passManager = new PassManager.Builder();
  private boolean disableAllTypeChecking = false;

  public static SoyFileSetParserBuilder forTemplateAndImports(
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private final ImmutableMap<SourceFilePath, SoyFileSupplier> soyFileSuppliers;
  private SoyTypeRegistry typeRegistry = SoyTypeRegistryBuilder.create();
  @Nullable private SoyAstCache astCache = null;
  private ErrorReporter errorReporter = ErrorReporter.exploding(); // See #parse for discussion.
  private boolean allowUnboundGlobals;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  // escaper not running and enable by default.  This configuration bit only really exists
  // for incrementaldomsrc, not tests.
  private boolean runAutoescaper = false;
  // By default, do not modify the AST to add the HTML comments, since many unit tests depend on
  // the order of the nodes in the AST.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  // By default, do not modify the AST to add the HTML comments, since many unit tests depend on
  // the order of the nodes in the AST.
  private boolean addHtmlAttributesForDebugging = false;
  private final PassManager.Builder passManager = new PassManager.Builder();
  private boolean disableAllTypeChecking = false;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

  /** Counter for the number of examples written so far. */
  private int numExamples = 0;

  /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java
    @Nullable private FunctionRef function;
    @Nullable private ImmutableList<SoyType> allowedParamTypes;
    private boolean allowedToInvokeAsFunction = false;
  }

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `java/src/com/google/template/soy/soyparse/RawTextBuilder.java`
#### Snippet
```java
  private int endColumnAtStartOfWhitespace;
  // tracks whether the current sequence of whitespace contains a newline
  private boolean basicHasNewline = false;
  // this will be set to non {@code NONE} if the previous sequence of text added isn't a basic
  // text literal.  this will force us to record a new offset for the next token
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java

  /** Serialized container for template calls, used for template traversal. */
  private TemplateCallMetadata.Template templateCallMetadata = null;

  // TODO(b/19406885): Remove.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java

  /** Additional metadata for serialization and verification across templates. */
  private HtmlElementMetadataP templateMetadata = null;

  /** Serialized container for template calls, used for template traversal. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Inferences.java`
#### Snippet
```java

  /** Map of template names to instances used to type <code>{call}</code> commands. */
  private FileSetMetadata fileSetMetadata = null;

  /** Maps print, msg and call commands to the inferred escaping modes. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java
    }

    private int uniqueSerial = 0;

    public abstract Parameter param();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
    private Context context;

    private RawTextNode uriStart = null;

    public ContextPropagatingVisitor(Context context) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/basicfunctions/HtmlToText.java`
#### Snippet
```java
    Matcher whitespaceMatcher = null;
    Matcher attributeMatcher = null;
    Matcher styleMatcher = null;
    ArrayDeque<TagAndWs> preserveWhitespaceStack = new ArrayDeque<>();

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/basicfunctions/HtmlToText.java`
#### Snippet
```java
  private static class HtmlToTextConverter {

    Matcher whitespaceMatcher = null;
    Matcher attributeMatcher = null;
    Matcher styleMatcher = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `java/src/com/google/template/soy/basicfunctions/HtmlToText.java`
#### Snippet
```java

    Matcher whitespaceMatcher = null;
    Matcher attributeMatcher = null;
    Matcher styleMatcher = null;
    ArrayDeque<TagAndWs> preserveWhitespaceStack = new ArrayDeque<>();
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java

  // Counter for static variables that are declared at the global scope.
  private int staticsCounter = 0;

  GenIncrementalDomTemplateBodyVisitor(
```

## RuleId[ruleID=EqualsAndHashcode]
### RuleId[ruleID=EqualsAndHashcode]
Class has `hashCode()` defined but does not define `equals()`
in `java/src/com/google/template/soy/data/SoyAbstractCachingValueProvider.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 */
public abstract class SoyAbstractCachingValueProvider implements SoyValueProvider {

  /**
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `java/src/com/google/template/soy/data/restricted/IntegerData.java`
#### Snippet
```java
 */
@Immutable
public final class IntegerData extends NumberData {

  // Note: ZERO, ONE, and MINUS_ONE are public. The rest are private.
```

## RuleId[ruleID=RedundantImplements]
### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `SoyLegacyObjectMap`
in `java/src/com/google/template/soy/data/SoyEasyList.java`
#### Snippet
```java
@Deprecated
@ParametersAreNonnullByDefault
public interface SoyEasyList extends SoyList, SoyLegacyObjectMap {

  /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `CompilerFileSetPass`
in `java/src/com/google/template/soy/passes/CombineConsecutiveRawTextNodesPass.java`
#### Snippet
```java
 */
public final class CombineConsecutiveRawTextNodesPass
    implements CompilerFilePass, CompilerFileSetPass {

  /**
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/ForNode.java`
#### Snippet
```java
 */
public final class ForNode extends AbstractParentCommandNode<BlockNode>
    implements StandaloneNode, SplitLevelTopNode<BlockNode>, StatementNode, ExprHolderNode {

  /** The parsed expression for the list that we're iterating over. */
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/PrintNode.java`
#### Snippet
```java
 */
public final class PrintNode extends AbstractParentCommandNode<PrintDirectiveNode>
    implements StandaloneNode,
        SplitLevelTopNode<PrintDirectiveNode>,
        HtmlContext.HtmlContextHolder,
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `ExprHolderNode`
in `java/src/com/google/template/soy/soytree/TemplateElementNode.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 */
public final class TemplateElementNode extends TemplateNode implements ExprHolderNode {
  /**
   * Main constructor. This is package-private because TemplateElementNode instances should be built
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/SwitchNode.java`
#### Snippet
```java
 */
public final class SwitchNode extends AbstractParentCommandNode<CaseOrDefaultNode>
    implements StandaloneNode,
        SplitLevelTopNode<CaseOrDefaultNode>,
        StatementNode,
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/IfNode.java`
#### Snippet
```java
public final class IfNode extends AbstractParentSoyNode<BlockNode>
    implements HtmlContext.HtmlContextHolder,
        StandaloneNode,
        SplitLevelTopNode<BlockNode>,
        StatementNode {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/MsgFallbackGroupNode.java`
#### Snippet
```java
public final class MsgFallbackGroupNode extends AbstractParentSoyNode<MsgNode>
    implements HtmlContext.HtmlContextHolder,
        StandaloneNode,
        SplitLevelTopNode<MsgNode>,
        StatementNode {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/LogNode.java`
#### Snippet
```java
 */
public final class LogNode extends AbstractBlockCommandNode
    implements StandaloneNode, StatementNode {

  public LogNode(int id, SourceLocation sourceLocation) {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/CallNode.java`
#### Snippet
```java
 */
public abstract class CallNode extends AbstractParentCommandNode<CallParamNode>
    implements StandaloneNode,
        SplitLevelTopNode<CallParamNode>,
        StatementNode,
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/DebuggerNode.java`
#### Snippet
```java
 */
public final class DebuggerNode extends AbstractCommandNode
    implements StandaloneNode, StatementNode {

  public DebuggerNode(int id, SourceLocation sourceLocation) {
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/LetNode.java`
#### Snippet
```java
 */
public abstract class LetNode extends AbstractCommandNode
    implements StandaloneNode, StatementNode, LocalVarInlineNode {

  /** The local variable defined by this node. */
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `StandaloneNode`
in `java/src/com/google/template/soy/soytree/KeyNode.java`
#### Snippet
```java
 */
public final class KeyNode extends AbstractCommandNode
    implements StandaloneNode, StatementNode, ExprHolderNode {

  /** The parsed expression representing the key value. */
```

### RuleId[ruleID=RedundantImplements]
Redundant interface declaration `TemplateHeaderVarDefn`
in `java/src/com/google/template/soy/soytree/defn/AttrParam.java`
#### Snippet
```java
 * <p>Important: Do not use outside of Soy code (treat as superpackage-private).
 */
public final class AttrParam extends TemplateParam implements TemplateHeaderVarDefn {

  private final String originalAttributeName;
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-21-23-02-55.493.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `LexerError` does not end with 'Exception'
in `java/src/com/google/template/soy/parsepasses/contextautoesc/LexerError.java`
#### Snippet
```java
 * An error thrown by the JsLexer, used to communicate information about where the error ocurred.
 */
final class LexerError extends RuntimeException {

  private final String reason;
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  /** Template pattern for any public or package visible entry point method that returns a value. */
  private <T> T entryPoint(Supplier<T> variant) {
    synchronized (this) {
      if (isCompiling) {
        // TODO(lukes): upgrade to an exception
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
      }
    } finally {
      synchronized (this) {
        isCompiling = false;
      }
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/jssrc/dsl/VariableDeclaration.java`
#### Snippet
```java
      type().collectRequires(requiresBuilder::add);
    }
    return requiresBuilder.build().toArray(new GoogRequire[0]);
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
    }

    Type methodType = Type.getMethodType(Type.VOID_TYPE, methodTypeParams.toArray(new Type[0]));
    Statement saveState =
        new Statement() {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java
                    /* max=*/ reattaches.size(),
                    /*dflt=*/ unexpectedState,
                    caseLabels.toArray(new Label[0]));
              }
            },
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
        }
      } else {
        escapesByCodeUnit = new String[0];
      }
      // Create the sparse non-ASCII map.
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
        }
      } else {
        nonAsciiCodeUnits = new char[0];
        nonAsciiEscapes = new String[0];
      }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
      } else {
        nonAsciiCodeUnits = new char[0];
        nonAsciiEscapes = new String[0];
      }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/basetree/MixinParentNode.java`
#### Snippet
```java
    // ConcurrentModificationExceptions as nodes are moved from one parent to another.  To avoid
    // this we make a copy of the input list.
    for (Node child : children.toArray(new Node[0])) {
      addChild((N) child);
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/exprtree/testing/ExpressionParser.java`
#### Snippet
```java
                SharedTestUtils.NS,
                SharedTestUtils.buildTestTemplateContent(false, contents),
                protos.toArray(new GenericDescriptor[0]))
            .runOptimizer(true)
            .addSoySourceFunctions(functions)
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/treebuilder/ExprNodes.java`
#### Snippet
```java

  public static OperatorNode operator(Operator op, ImmutableList<ExprNode> children) {
    return operator(op, children.toArray(new ExprNode[] {}));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/bidifunctions/BidiTextDirFunction.java`
#### Snippet
```java
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "soy", "soy.$$bidiTextDir", args.toArray(new JavaScriptValue[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/bidifunctions/BidiMarkAfterFunction.java`
#### Snippet
```java
    fnArgs.addAll(args);
    return factory.callNamespaceFunction(
        "soy", "soy.$$bidiMarkAfter", fnArgs.toArray(new JavaScriptValue[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/bidifunctions/BidiDirAttrFunction.java`
#### Snippet
```java
    fnArgs.addAll(args);
    return factory.callNamespaceFunction(
        "soy", "soy.$$bidiDirAttr", fnArgs.toArray(new JavaScriptValue[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java
      Class<?> clazz = Class.forName(methodSig.fullyQualifiedClassName());
      Method method =
          clazz.getMethod(methodSig.methodName(), methodSig.arguments().toArray(new Class<?>[0]));
      if (!method.getReturnType().equals(methodSig.returnType())) {
        throw RenderException.create(
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/basicfunctions/RangeFunction.java`
#### Snippet
```java
    // Use range which is guaranteed to produce either a list (python 2) or a lazy iterable
    // (python 3) -- both of which are enumerable -- because xrange does not exist in python 3.
    return factory.global("range").call(args.toArray(new PythonValue[0]));
  }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/basicfunctions/RangeFunction.java`
#### Snippet
```java
      JavaScriptValueFactory factory, List<JavaScriptValue> args, JavaScriptPluginContext context) {
    return factory.callNamespaceFunction(
        "goog.array", "goog.array.range", args.toArray(new JavaScriptValue[0]));
  }
}
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `java/src/com/google/template/soy/basicfunctions/ConcatListsFunction.java`
#### Snippet
```java
    return factory
        .global("Array.prototype")
        .invokeMethod("concat", args.toArray(new JavaScriptValue[0]));
  }

```

## RuleId[ruleID=NonFinalFieldOfException]
### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `dataPath` of exception class
in `java/src/com/google/template/soy/data/SoyDataException.java`
#### Snippet
```java

  /** The data path where this error occurred. */
  private String dataPath;

  /** @param message A detailed description of the error. */
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `fileOrResourceName` of exception class
in `java/src/com/google/template/soy/msgs/SoyMsgException.java`
#### Snippet
```java

  /** The name of the file or resource associated with this error. */
  private String fileOrResourceName = null;

  /** @param message A detailed description of the error. */
```

## RuleId[ruleID=DoubleBraceInitialization]
### RuleId[ruleID=DoubleBraceInitialization]
Double brace initialization
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeProducer.java`
#### Snippet
```java
    // sub type?)
    Textifier textifier =
        new Textifier(Opcodes.ASM7) {
          {
            // reset tab sizes.  Since we don't care about formatting class names or method
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
The value `1` assigned to `depth` is never used
in `java/src/com/google/template/soy/data/AbstractLoggingAdvisingAppendable.java`
#### Snippet
```java
      logOnlyDepth = depth;
    } else if (statement.logOnly()) {
      depth = 1;
      logOnlyDepth = 1;
    }
```

### RuleId[ruleID=UnusedAssignment]
The value `true` assigned to `addedCast` is never used
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
      if (!jsType.typeExpr().equals(declType.typeExpr()) && !JsSrcUtils.isReservedWord(paramName)) {
        // TODO(b/256679865): rename JS builtins here.
        addedCast = true;
        initializer = initializer.castAs(jsType.typeExpr(), jsType.getGoogRequires());
      }
```

### RuleId[ruleID=UnusedAssignment]
Variable `pyExprText` initializer `""` is redundant
in `java/src/com/google/template/soy/pysrc/internal/GenPyExprsVisitor.java`
#### Snippet
```java
                generateMsgFunc(node.getMsg(), /* useAlternateId=*/ true).getText())
            : msg.getText();
    String pyExprText = "";

    // MsgFallbackGroupNode could only have one child or two children. See MsgFallbackGroupNode.
```

### RuleId[ruleID=UnusedAssignment]
Variable `soyExpr` initializer `null` is redundant
in `java/src/com/google/template/soy/jbcsrc/JbcSrcValueFactory.java`
#### Snippet
```java
    SoyType expectedType = fnNode.getReturnType();
    Expression expr = pluginReturnValue.expr();
    SoyExpression soyExpr = null;

    // Note: All expressions that were able to be converted in tryToWrapInSoyExpression
```

### RuleId[ruleID=UnusedAssignment]
Variable `serialized` initializer `null` is redundant
in `java/src/com/google/template/soy/jbcsrc/restricted/Statement.java`
#### Snippet
```java
      // ASM fails in bizarre ways, attach a trace of the thing we tried to generate to the
      // exception.
      String serialized = null;
      try {
        serialized = String.valueOf(this);
```

### RuleId[ruleID=UnusedAssignment]
Variable `next` initializer `null` is redundant
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java
  private static <T> ImmutableList<Case<T>> parseCases(
      PeekingIterator<Object> rawParts, Function<Object, T> specFactory) {
    Tag next = null;
    ImmutableList.Builder<Case<T>> cases = ImmutableList.builder();
    while (rawParts.hasNext()) {
```

### RuleId[ruleID=UnusedAssignment]
The value `null` assigned to `next` is never used
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java
        T spec = specFactory.apply(rawParts.next());
        cases.add(Case.create(spec, parseParts(rawParts, /* isCase=*/ true)));
        next = null;
      } else if (next == Tag.END) {
        break;
```

### RuleId[ruleID=UnusedAssignment]
Variable `modifiers` initializer `0` is redundant
in `java/src/com/google/template/soy/jbcsrc/restricted/FieldRef.java`
#### Snippet
```java
  public static FieldRef instanceFieldReference(Class<?> owner, String name) {
    Class<?> fieldType;
    int modifiers = 0;
    try {
      java.lang.reflect.Field declaredField = owner.getDeclaredField(name);
```

### RuleId[ruleID=UnusedAssignment]
The value `openTag.getKeyNode().getSourceLocation()` assigned to `attributeSourceLocation` is never used
in `java/src/com/google/template/soy/passes/DesugarStateNodesPass.java`
#### Snippet
```java

    if (openTag.getKeyNode() != null) {
      attributeSourceLocation = openTag.getKeyNode().getSourceLocation();
      wrappedFn.addChild(openTag.getKeyNode().getExpr().getRoot().copy(new CopyState()));
    } else {
```

### RuleId[ruleID=UnusedAssignment]
Variable `calleeMetadata` initializer `null` is redundant
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
      Set<TemplateNode> visited) {

    HtmlElementMetadataP calleeMetadata = null;
    boolean isCalleeSoyElement = false;
    TemplateMetadata templateMetadata =
```

### RuleId[ruleID=UnusedAssignment]
Variable `isCalleeSoyElement` initializer `false` is redundant
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java

    HtmlElementMetadataP calleeMetadata = null;
    boolean isCalleeSoyElement = false;
    TemplateMetadata templateMetadata =
        templateRegistryFromDeps.get().getBasicTemplateOrElement(callee);
```

### RuleId[ruleID=UnusedAssignment]
The value `true` assigned to `reportedSingleHtmlElmError` is never used
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
        if (isElmOrHtml) {
          errorReporter.report(child.getSourceLocation(), ELEMENT_TEMPLATE_EXACTLY_ONE_TAG);
          reportedSingleHtmlElmError = true;
        }
        if (isSoyElement && ((CallBasicNode) child).getKeyExpr() != null) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `nameSegment` initializer `null` is redundant
in `java/src/com/google/template/soy/soytree/MsgSubstUnitPlaceholderNameUtils.java`
#### Snippet
```java

      while (exprNode != null) {
        String nameSegment = null;
        if (exprNode instanceof VarRefNode) {
          nameSegment = ((VarRefNode) exprNode).getNameWithoutLeadingDollar();
```

### RuleId[ruleID=UnusedAssignment]
The value `builder.addDefault(delTemplateName, variant, template)` assigned to `previous` is never used
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
    if (modName == null) {
      // default delegate
      previous = builder.addDefault(delTemplateName, variant, template);
    } else {
      previous = builder.add(delTemplateName, modName, variant, template);
```

### RuleId[ruleID=UnusedAssignment]
The value `text.charAt(--charIndex)` assigned to `lastChar` is never used
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex > 0 && (lastChar = text.charAt(--charIndex)) != quote) {}
        }
      }
```

### RuleId[ruleID=UnusedAssignment]
The value `text.charAt(charIndex++)` assigned to `lastChar` is never used
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
          // Skip over a quoted attribute value inside the tag.
          char quote = lastChar;
          while (charIndex < length && (lastChar = text.charAt(charIndex++)) != quote) {}
        }
      }
```

### RuleId[ruleID=UnusedAssignment]
Variable `cp` initializer `-1` is redundant
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
        }
      }
      int cp = -1;
      if (end == -1) {
        cp = -1;
```

### RuleId[ruleID=UnusedAssignment]
Variable `escapingModesToSet` initializer `null` is redundant
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
        // The inferences set below specify which nodes to change. In the non-contextual modes,
        // we leave escapingModesToSet null since no changes are to be made to this print node.
        List<EscapingMode> escapingModesToSet = null;
        // Infer one.
        escapingModes =
```

### RuleId[ruleID=UnusedAssignment]
The value `escapingModesToSet = context.getEscapingModes(printNode, printNode.getChildren())` assigned to `escapingModes` is never used
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
        List<EscapingMode> escapingModesToSet = null;
        // Infer one.
        escapingModes =
            escapingModesToSet = context.getEscapingModes(printNode, printNode.getChildren());
        inferences.setEscapingDirectives(printNode, prev, escapingModesToSet);
```

### RuleId[ruleID=UnusedAssignment]
Variable `isLogOnlyVar` initializer `null` is redundant
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
  VeLogStateHolder openVeLogNode(VeLogNode node) {
    Expression isLogOnly = Expression.LITERAL_FALSE;
    VariableDeclaration isLogOnlyVar = null;
    Expression isLogOnlyReference = null;
    List<Statement> stmts = new ArrayList<>();
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
Condition `other != null` is always `true`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  @Override
  public boolean equals(Object other) {
    return other != null
        && this.getClass() == other.getClass()
        // Use identity for js compatibility
```

### RuleId[ruleID=ConstantValue]
Condition `other != null` is always `true`
in `java/src/com/google/template/soy/data/restricted/StringData.java`
#### Snippet
```java
    // Keep this in sync with UnsanitizedString#equals so that StringData and UnsanitizedString can
    // be used interchangeably.
    return other != null && getValue().equals(other.toString());
  }

```

### RuleId[ruleID=ConstantValue]
Method reference result is always 'true'
in `java/src/com/google/template/soy/pysrc/restricted/PyFunctionExprBuilder.java`
#### Snippet
```java
        kwargMap.entrySet().stream()
            .map(entry -> entry.getKey() + "=" + entry.getValue().getText())
            .filter(Objects::nonNull)
            .collect(Collectors.joining(", "));

```

### RuleId[ruleID=ConstantValue]
Condition `elem instanceof String` is always `true`
in `java/src/com/google/template/soy/pysrc/restricted/PyExprUtils.java`
#### Snippet
```java
      } else if (elem instanceof PyExpr) {
        values.add(((PyExpr) elem).getText());
      } else if (elem instanceof String) {
        values.add("'" + elem + "'");
      }
```

### RuleId[ruleID=ConstantValue]
Condition `size == 2` is always `true` when reached
in `java/src/com/google/template/soy/jbcsrc/SimpleLocalVariableManager.java`
#### Snippet
```java
    while (start < 65536) {
      int nextClear = availableSlots.nextClearBit(start);
      if (size == 1 || (size == 2 && !availableSlots.get(nextClear + 1))) {
        availableSlots.set(nextClear, nextClear + size);
        return nextClear;
```

### RuleId[ruleID=ConstantValue]
Condition `resolved == null` is always `false`
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableSoyValueProvider.java`
#### Snippet
```java
    if (result.isDone()) {
      SoyValue resolved = resolve();
      if (resolved == null) {
        appendable.append("null");
      } else {
```

### RuleId[ruleID=ConstantValue]
Condition `value == null` is always `false`
in `java/src/com/google/template/soy/jbcsrc/shared/RenderContext.java`
#### Snippet
```java
      }
      SoyValue value = variantProvider.resolve();
      variant = value == null ? "null" : value.coerceToString();
    }
    CompiledTemplate template = getDelTemplate(delCalleeName, variant);
```

### RuleId[ruleID=ConstantValue]
Condition `closeTag != null` is always `true` when reached
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    }
    // openTag being null means that the template isn't kind HTML.
    boolean isValid = openTag != null && closeTag != null;
    boolean hasSkipNode = false;
    String delegateTemplate = null;
```

### RuleId[ruleID=ConstantValue]
Condition `attributesNode != null` is always `true`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
            });

    if (attributesNode != null && attributesNode.numChildren() > 0) {
      call.addChild(attributesNode);
    }
```

### RuleId[ruleID=ConstantValue]
Condition `!attrNode.hasValue() && iAmAnElementCallingAnElement && !isSoyAttr` is always `false`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
              }

              if (!attrNode.hasValue() && iAmAnElementCallingAnElement && !isSoyAttr) {
                // Pass through and handle in SoyElementCompositionPass since we cannot encode
                // null/absent in an HtmlAttributeNode.
```

### RuleId[ruleID=ConstantValue]
Condition `!isSoyAttr` is always `false`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
              }

              if (!attrNode.hasValue() && iAmAnElementCallingAnElement && !isSoyAttr) {
                // Pass through and handle in SoyElementCompositionPass since we cannot encode
                // null/absent in an HtmlAttributeNode.
```

### RuleId[ruleID=ConstantValue]
Value `isSoyAttr` is always 'true'
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
              }

              if (!attrNode.hasValue() && iAmAnElementCallingAnElement && !isSoyAttr) {
                // Pass through and handle in SoyElementCompositionPass since we cannot encode
                // null/absent in an HtmlAttributeNode.
```

### RuleId[ruleID=ConstantValue]
Condition `this.defaultValue == null` is always `true`
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
          return this.defaultValue;
        }
        checkState(this.defaultValue == null);
        this.defaultValue = checkNotNull(defaultValue);
        return null;
```

### RuleId[ruleID=ConstantValue]
Condition `index > endTextIndex` is always `true`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
          endReason = reasons[i];
          break;
        } else if (index > endTextIndex) {
          // to find the end location we need to scan from the previous index
          Point endPoint = getLocationOf(text, i - 1, endTextIndex);
```

### RuleId[ruleID=ConstantValue]
Condition `params == null` is always `false`
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
    super(nodeBuilder.getId(), nodeBuilder.sourceLocation, nodeBuilder.openTagLocation, cmdName);
    checkNotNull(params);
    this.headerParams = params == null ? ImmutableList.of() : params;
    this.soyFileHeaderInfo = soyFileHeaderInfo;
    this.templateName = nodeBuilder.getTemplateName();
```

### RuleId[ruleID=ConstantValue]
Condition `escapingModes != null` is always `true`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Inferences.java`
#### Snippet
```java
            || (node instanceof MsgFallbackGroupNode),
        "Escaping directives may only be set for {print}, {msg}, or {call} nodes");
    if (escapingModes != null) {
      nodeToEscapingModes.put(node, ImmutableList.copyOf(escapingModes));
    }
```

### RuleId[ruleID=ConstantValue]
Value `error` is always 'null'
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java

      if (!directTagChildren.isEmpty()) {
        error = format(error, "Expected directTagChildren to be empty, got: %s", directTagChildren);
      }
      if (attributeName != null) {
```

### RuleId[ruleID=ConstantValue]
Condition `!(base instanceof SoyProtoValue)` is always `true` when reached
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    checkArgument(!fieldAccess.isNullSafe());
    // attempting field access on non-SoyRecord
    if (!(base instanceof SoyRecord) && !(base instanceof SoyProtoValue)) {
      if (nullSafe) {
        if (!isNullOrUndefinedBase(base)) {
```

### RuleId[ruleID=ConstantValue]
Condition `base instanceof SoyProtoValue` is always `false` when reached
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    checkArgument(!fieldAccess.isNullSafe());
    // attempting field access on non-SoyRecord
    if (!(base instanceof SoyRecord) && !(base instanceof SoyProtoValue)) {
      if (nullSafe) {
        if (!isNullOrUndefinedBase(base)) {
```

## RuleId[ruleID=OptionalGetWithoutIsPresent]
### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/css/CssRegistry.java`
#### Snippet
```java

  public ImmutableList<String> allowedSymbolsToUse(String nsOrPath) {
    return classMap().get().get(nsOrPath);
  }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jssrc/dsl/TsxPrintNode.java`
#### Snippet
```java
      ctx.append(
          String.format(
              "%s'%s'}", ctx.getInterpolationOpenString(), expr().get().asStringLiteral().get()));

      if (endLineAfterChar) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
              hasVariant(callNode)));
      maybeAddVariantParam(callNode, exprTranslator, params);
      call = callee.positionalStyle().get().call(params);
    } else {
      List<Expression> params = new ArrayList<>();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`OptionalLong.getAsLong()` without 'isPresent()' check
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
    Preconditions.checkNotNull(msgPartsAndIds);

    this.msgId = useAlternateId ? this.msgNode.getAlternateId().getAsLong() : msgPartsAndIds.id;
    this.msgParts = msgPartsAndIds.parts;

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/JbcSrcValueFactory.java`
#### Snippet
```java
        soyExpr =
            SoyExpression.forProto(
                SoyRuntimeType.getUnboxedType(soyTypeForProtoOrEnum(type)).get(), expr);
      } else if (type.isEnum() && ProtocolMessageEnum.class.isAssignableFrom(type)) {
        // We need to get the # out of the enum & cast to a long.
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java

    HasserGenerator(SoyProtoType protoType, SoyExpression baseExpr, String fieldName) {
      super(SoyRuntimeType.getUnboxedType(protoType).get(), baseExpr);
      this.descriptor = protoType.getFieldDescriptor(fieldName);
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
          }.asNonNullable();

      return SoyExpression.forProto(SoyRuntimeType.getUnboxedType(protoType).get(), expression);
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        // The caller should check that all member types are protos, so this cast is safe.
        SoyProtoType protoType = (SoyProtoType) member;
        SoyRuntimeType unboxed = SoyRuntimeType.getUnboxedType(protoType).get();
        SoyExpression fieldAccess =
            memberGenerator.apply(
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        SoyType fieldType,
        ScalarFieldMode mode) {
      super(SoyRuntimeType.getUnboxedType(protoType).get(), baseExpr);
      this.fieldType = fieldType;
      this.descriptor = protoType.getFieldDescriptor(fieldName);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
      if (fieldType.getKind() == SoyType.Kind.PROTO) {
        SoyProtoType fieldProtoType = (SoyProtoType) fieldType;
        SoyRuntimeType protoRuntimeType = SoyRuntimeType.getUnboxedType(fieldProtoType).get();
        return SoyExpression.forProto(protoRuntimeType, field);
      } else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
                            adapter.visitInvokeDynamicInsn(
                                "call",
                                metadata.positionalRenderMethod().get().method().getDescriptor(),
                                STATIC_CALL_HANDLE,
                                Stream.concat(
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
   */
  private CompiledForeachRangeArgs calculateRangeArgs(ForNode forNode, Scope scope) {
    RangeArgs rangeArgs = RangeArgs.createFromNode(forNode).get();
    ForNonemptyNode nonEmptyNode = (ForNonemptyNode) forNode.getChild(0);
    ImmutableList.Builder<Statement> initStatements = ImmutableList.builder();
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
      return;
    }
    Handle renderHandle = template.positionalRenderMethod().get().asHandle();
    Statement.returnExpression(
            new Expression(BytecodeUtils.COMPILED_TEMPLATE_TYPE) {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
    @Override
    public Expression getParamsRecord() {
      return paramsRecord.get();
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java

    if (template.defaultModTemplateMethod().isPresent()) {
      generateTemplateMethod(template.templateMethod(), template.modifiableSelectMethod().get());
      generateTemplateMethod(template.defaultModTemplateMethod().get(), template.renderMethod());
    } else {
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
          throwIfErrorsPresent();
          return new AutoValue_SoyFileSet_HeaderResult(
              parseResult.fileSet(), parseResult.registry(), cssRegistry.get());
        });
  }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

    return new SoySauceImpl(
        templates.get(), scopedData.enterable(), soyFunctions, printDirectives, pluginInstances);
  }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java

  public CssRegistry getCssRegistry() {
    return cssRegistry.get();
  }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
    checkNotNull(detacher);
    // This mode always works so we can unconditionally dereference this
    return createVisitor(exprCompiler, detacher).exec(node).get();
  }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyRuntimeType.java`
#### Snippet
```java
        // If we are a primitive type then there must be another primitive type that is the same
        // but non-nullable (or nullable).
        return getUnboxedType(newSoyType).get();
      }
    }
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyExpression.java`
#### Snippet
```java

  private static SoyRuntimeType getUnboxedType(SoyType soyType) {
    return SoyRuntimeType.getUnboxedType(soyType).get();
  }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/passes/DesugarStateNodesPass.java`
#### Snippet
```java
        attributeSourceLocation = openTag.getKeyNode().getSourceLocation();
      } else {
        attributeSourceLocation = skipNode.get().getSourceLocation();
      }
      HtmlAttributeNode htmlAttributeNode =
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
            parameterMap.containsKey(paramName)
                ? SanitizedContentKind.fromAttributeValue(getKind(parameterMap.get(paramName)))
                    .get()
                : SanitizedContentKind.TEXT);
    call.getParent().addChild(call.getParent().getChildIndex(call), letContentNode);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
          continue;
        }
        TagName tagName = getElementOpen(node).get().getTagName();
        if (tagName.isStatic()) {
          errorReporter.report(tagName.getTagLocation(), ROOT_TAG_KIND_MISMATCH, expectedTagName);
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
      Map<ExprEquivalence.Wrapper, Boolean> exprValueMap,
      HtmlStack stack) {
    HtmlTagNode tag = (HtmlTagNode) tagNode.getSoyNode().get();
    TagName openTagName = tag.getTagName();
    HtmlStack prev = stack;
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
    // character's source string instead.
    if (this.provenance.equals(Provenance.COMMAND_CHARACTER)) {
      return this.commandChar.get().sourceString();
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
   */
  public CommandChar getCommandChar() {
    return commandChar.get();
  }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
            cssPath -> {
              if (cssPath.getNamespace() != null
                  && !filePathToNamespace.containsKey(cssPath.resolvedPath().get())) {
                filePathToNamespace.put(
                    String.format("\"%s\"", cssPath.resolvedPath().get()),
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
        Streams.concat(
                fileInfo.fileNode().getRequiredCssNamespaces().stream(),
                fileInfo.fileNode().getRequiredCssPaths().stream().map(p -> p.resolvedPath().get()),
                fileInfo.templates().stream()
                    .flatMap(
```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java

    public TemplateInfo findTemplate(TemplateNode node) {
      return templates().stream().filter(t -> t.template().equals(node)).findFirst().get();
    }

```

### RuleId[ruleID=OptionalGetWithoutIsPresent]
`Optional.get()` without 'isPresent()' check
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      params.addAll(positionalParameters.get().get());
      GenCallCodeUtils.maybeAddVariantParam(callNode, exprTranslator, params);
      return callee.positionalStyle().get().call(params);
    }
    params.add(paramObject.get());
```

## RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
      if (part instanceof SoyMsgPlaceholderPart) {
        String phName = ((SoyMsgPlaceholderPart) part).getPlaceholderName();
        rawMsgTextSb.append("{" + phName + "}");
      }
    }
```

### RuleId[ruleID=StringConcatenationInsideStringBufferAppend]
String concatenation as argument to `StringBuilder.append()` call
in `java/src/com/google/template/soy/testing/SharedTestUtils.java`
#### Snippet
```java
        type = UnknownType.getInstance();
      }
      templateBody.append("{@param " + varName + ": " + type + "}\n");
    }
    String contents = "{" + soyExpr + "}\n";
```

## RuleId[ruleID=OptionalIsPresent]
### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jssrc/dsl/TsxPrintNode.java`
#### Snippet
```java
  @Override
  public void collectRequires(Consumer<GoogRequire> collector) {
    if (expr.isPresent()) {
      expr.get().collectRequires(collector);
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
      Expression value, String valueName, String paramKind, Generator codeGenerator) {
    Optional<Expression> typeAssertion = getTypeAssertion(value, codeGenerator);
    if (!typeAssertion.isPresent()) {
      return Optional.empty();
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
            .filter(t -> t != null)
            .findFirst();
    if (mods.isPresent()) {
      header.addParameterizedAnnotation("mods", getGoogModuleNamespace(mods.get()));
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/types/VeType.java`
#### Snippet
```java
  public String toString() {
    return "ve<"
        + (dataType.isPresent() ? dataType.get() : NullType.getInstance().toString())
        + ">";
  }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jbcsrc/restricted/LocalVariable.java`
#### Snippet
```java
      protected void doGen(CodeBuilder adapter) {
        expr.gen(adapter);
        if (firstVarInstruction.isPresent()) {
          adapter.mark(firstVarInstruction.get());
        }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/jbcsrc/restricted/BytecodeUtils.java`
#### Snippet
```java
                      Optional<Class<?>> elementType =
                          objectTypeToClassCache.getUnchecked(key.getElementType());
                      if (elementType.isPresent()) {
                        // The easiest way to generically get an array class.
                        return Optional.of(Array.newInstance(elementType.get(), 0).getClass());
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java
  public void addNode(HtmlMatcherGraphNode node) {
    checkNotNull(node);
    if (graphCursor.isPresent()) {
      graphCursor.get().linkActiveEdgeToNode(node);
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
    if (isSoyAttr) {
      ExprNode val = new VarRefNode("$" + paramName, unknown, attrs.get(paramName));
      if (condition.isPresent()) {
        return new CallParamValueNode(
            nodeIdGen.genId(),
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/soytree/MsgSelectNode.java`
#### Snippet
```java
  public String getCommandText() {
    Optional<String> phname = placeholder.userSuppliedName();
    return phname.isPresent()
        ? selectExpr.toSourceString() + " phname=\"" + phname.get() + "\""
        : selectExpr.toSourceString();
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
    this.escapingMode = orig.escapingMode;
    this.alternateIdAttribute =
        orig.alternateIdAttribute.isPresent()
            ? Optional.of(orig.alternateIdAttribute.get().copy(copyState))
            : Optional.empty();
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
        return this;
      }
      if (!other.onPass.isPresent()) {
        return other;
      }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/xliffmsgplugin/XliffGenerator.java`
#### Snippet
```java
                  // placeholder examples are not part of the xliff standard. It is an android
                  // convention so we add it in the hope that tools will support it anyway.
                  + (example.isPresent()
                      ? " example=\"" + attributeEscaper.escape(example.get()) + "\""
                      : "")
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomCodeVisitor.java`
#### Snippet
```java
            /* paramKind= */ "@state",
            templateTranslationContext.codeGenerator());
    if (typeAssertion.isPresent()) {
      setStateMethodStatements.add(typeAssertion.get().asStatement());
    }
```

### RuleId[ruleID=OptionalIsPresent]
Can be replaced with single expression in functional style
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
    Optional<Expression> maybeApplyStatics = getApplyStaticAttributes(node);
    Expression close = node.isElementRoot() ? INCREMENTAL_DOM_ELEMENT_CLOSE : INCREMENTAL_DOM_CLOSE;
    if (maybeApplyStatics.isPresent()) {
      statements.add(maybeApplyStatics.get().asStatement());
    }
```

## RuleId[ruleID=Java8MapForEach]
### RuleId[ruleID=Java8MapForEach]
Can be replaced with 'Map.forEach()'
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
        .allActiveVariables()
        .entrySet()
        .forEach(
            entry ->
                variablesByKey.put(
```

## RuleId[ruleID=FieldMayBeStatic]
### RuleId[ruleID=FieldMayBeStatic]
Field `modifiableDefaultImplSuffix` may be 'static'
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
  protected GenJsExprsVisitor genJsExprsVisitor;

  protected final String modifiableDefaultImplSuffix = "__default_impl";

  protected FileSetMetadata fileSetMetadata;
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SoyMaps` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/data/SoyMaps.java`
#### Snippet
```java
 */
// TODO(b/74360679): Delete this once all Soy plugins are passed SoyMaps.
public final class SoyMaps {

  /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `JsSrcNameGenerators` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/jssrc/internal/JsSrcNameGenerators.java`
#### Snippet
```java
 * A name generator for jssrc local variables.
 */
public final class JsSrcNameGenerators {
  // javascript is more permissive than this, but we are purposively restrictive
  private static final CharMatcher DANGEROUS_CHARACTERS =
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ProtoUtils` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
 * <p>TODO(user): Consider moving this back into ExpressionCompiler.
 */
final class ProtoUtils {

  private static final Type BYTE_STRING_TYPE = Type.getType(ByteString.class);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SaveRestoreState` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    private final ImmutableList<SoyJavaPrintDirective> directives;

    static class SaveRestoreState {
      static final MethodHandle saveStateMethodHandle;
      static final MethodHandle restoreAppendableHandle;
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `EscapingConventions` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
 */
@ParametersAreNonnullByDefault
public final class EscapingConventions {

  // Below we take advantage of lazy class loading to avoid doing the work of initializing maps
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Constants` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java

  /** Constants used in the enum definitions above. */
  static class Constants {
    static final Spacer SP = new Spacer();
    static final Operand OPERAND_0 = new Operand(0);
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `SoyParseUtils` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/soyparse/SoyParseUtils.java`
#### Snippet
```java

/** Shared utilities for the 'soyparse' package. */
final class SoyParseUtils {

  private static final SoyErrorKind CALL_COLLIDES_WITH_NAMESPACE_ALIAS =
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `TofuTypeChecks` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java

/** Implements runtime type checks for tofu. */
public final class TofuTypeChecks {

  private static final CheckResult PASS = new CheckResult(true, Optional.empty());
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `BidiFunctionsRuntime` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/bidifunctions/BidiFunctionsRuntime.java`
#### Snippet
```java

/** Contains static functions that implement the java versions of the bidifunctions. */
public final class BidiFunctionsRuntime {

  public static SanitizedContent bidiDirAttrSanitized(
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `UnescapingVisitor` has only 'static' members, and lacks a 'private' constructor
in `java/src/com/google/template/soy/incrementaldomsrc/UnescapingVisitor.java`
#### Snippet
```java
 * content in these contexts as text rather than HTML source.
 */
final class UnescapingVisitor {

  static void unescapeRawTextInHtml(SoyNode node) {
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/base/internal/SoyFileKind.java`
#### Snippet
```java
   * <p>Exist only to satisfy dependencies of direct dependencies, and cannot be used by sources.
   */
  INDIRECT_DEP;
}

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/base/internal/Identifier.java`
#### Snippet
```java
     * and {@link #SINGLE_IDENT}.
     */
    DOTTED_IDENT;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/tofu/LegacySoyJavaTofuStringCaller.java`
#### Snippet
```java
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RUNTIME)
public @interface LegacySoyJavaTofuStringCaller {};

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/error/SourceSnippetPrinter.java`
#### Snippet
```java
  public SourceSnippetPrinter() {
    this.maxLines = Integer.MAX_VALUE;
    ;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jssrc/SoyJsSrcOptions.java`
#### Snippet
```java
    NAMESPACES,
    /** Whether we should generate code to declare/require goog.modules. */
    MODULE;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
    BASIC,
    DELTEMPLATE,
    ELEMENT;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
       * expression.
       */
      SYNTHETIC;
    }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
    DERIVED,
    /** Means that the value of the variable should be saved . */
    STORE;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/api/RenderResult.java`
#### Snippet
```java
    DETACH,
    /** Rendering has completed successfully. */
    DONE;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/api/LegacySoyJavaStringCaller.java`
#### Snippet
```java
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RUNTIME)
public @interface LegacySoyJavaStringCaller {};

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
    TRUE,
    FALSE,
    UNKNOWN;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/restricted/Expression.java`
#### Snippet
```java
     * than once if the alternative is generating additional fields and save/restore code.
     */
    CHEAP;
    // TODO(lukes): an idempotent feature would be useful some expressions are not safe to gen more
    // than once.
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/passes/CompilerFileSetPass.java`
#### Snippet
```java
  enum Result {
    CONTINUE,
    STOP;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/jbcsrc/restricted/SoyExpression.java`
#### Snippet
```java
              MethodRef.SOY_LIST_AS_JAVA_LIST.invokeUnchecked(adapter);
              adapter.mark(end);
            };
          };
    }
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/passes/ContentSecurityPolicyNonceInjectionPass.java`
#### Snippet
```java
    STYLE,
    OTHER
  };

  ContentSecurityPolicyNonceInjectionPass(ErrorReporter errorReporter) {
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
    ALLOW_UNDEFINED_AND_WARN,
    /** This is the normal thing, it is an error for the plugin to not exist. */
    REQUIRE_DEFINITIONS;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java
    TRICORDER,
    /** All the AST rewrites. */
    ALL;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
  private enum UnknownPolicy {
    ALLOWED,
    DISALLOWED;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/soytree/ImportNode.java`
#### Snippet
```java
    PROTO,
    TEMPLATE,
    UNKNOWN;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
       * others due to {@link #concat} because we performed whitespace joining.
       */
      NONE;
    }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
    SKIP_CHILDREN,
    /** This means that traversal should continue as normal. */
    CONTINUE;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/internal/proto/ProtoFlavor.java`
#### Snippet
```java
public enum ProtoFlavor {
  PROTO2,
;
}

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/soyparse/Tokens.java`
#### Snippet
```java
                filePath, toString(next), endLine, endColumn));
      }
      ;
      endLine = next.endLine;
      endColumn = next.endColumn;
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
    LITERAL_ALLOWED,
    /** Means a literal block may start here, in which case it must end before the state changes. */
    LITERAL_STRICT;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    NONE,
    /** Inside HTML attribute value containing HTML but not at the start. */
    NOT_START;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
     * </ul>
     */
    TRUSTED_RESOURCE;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java

    /** A known-dangerous scheme where dynamic content is forbidden. */
    DANGEROUS_SCHEME;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    /** Other content. Human readable or other non-structured plain text or keyword values. */
    PLAIN_TEXT,
    ;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    /** An element whose content is normal mixed PCDATA and child elements. */
    NORMAL,
    ;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
     */
    UNKNOWN,
    ;
  }

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    JAVASCRIPT,
    JSON,
    UNKNOWN;
  }
  // See
```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    BUGGED,
    /** Normal mode just means not doing the bugged behavior. */
    NORMAL;
  }

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `toSourceString` may produce `NullPointerException`
in `java/src/com/google/template/soy/SoyUtils.java`
#### Snippet
```java
      String valueSrcStr =
          InternalValueUtils.convertPrimitiveDataToExpr(entry.getValue(), SourceLocation.UNKNOWN)
              .toSourceString();
      output
          .append("{export const ")
```

### RuleId[ruleID=DataFlowIssue]
Argument `VeMetadataGenerator.class.getResourceAsStream(metadataTemplateFilename)` might be null
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java
              new BufferedReader(
                  new InputStreamReader(
                      VeMetadataGenerator.class.getResourceAsStream(metadataTemplateFilename),
                      UTF_8)));

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getId` may produce `NullPointerException`
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java
                .map(AnnotatedLoggableElement::getElement)
                .collect(
                    toImmutableMap(e -> e.getId(), e -> serializeFunction.apply(e.getMetadata())));

        output.write(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getMetadata` may produce `NullPointerException`
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java
                .map(AnnotatedLoggableElement::getElement)
                .collect(
                    toImmutableMap(e -> e.getId(), e -> serializeFunction.apply(e.getMetadata())));

        output.write(
```

### RuleId[ruleID=DataFlowIssue]
Argument `BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.get(attrValue)` might be null
in `java/src/com/google/template/soy/base/internal/TemplateContentKind.java`
#### Snippet
```java
    }
    if (BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.containsKey(attrValue)) {
      return Optional.of(BasicTemplateContentKind.KINDS_BY_ATTR_VALUE.get(attrValue));
    }
    return Optional.empty();
```

### RuleId[ruleID=DataFlowIssue]
Argument `obj` might be null
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java

  private SoyValueProvider convertNonPrimitive(@Nullable Object obj) {
    SoyValueProvider converted = expensiveConverterMap.convert(obj);
    if (converted != null) {
      return converted;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `assignField` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
    @CanIgnoreReturnValue
    public Builder setField(String field, SoyValue value) {
      clazz.fields.get(field).assignField(builder, value);
      return this;
    }
```

### RuleId[ruleID=DataFlowIssue]
Casting `value0` to `PrimitiveData` may produce `ClassCastException`
in `java/src/com/google/template/soy/data/internalutils/InternalValueUtils.java`
#### Snippet
```java
          isValidValue = false;
        }
        value = (PrimitiveData) value0;
      } catch (SoyDataException sde) {
        isValidValue = false;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getLanguage` may produce `NullPointerException`
in `java/src/com/google/template/soy/msgs/SoyMsgBundleWithFullLocale.java`
#### Snippet
```java
    // avoid wrapping the original bundle when its language code isn't preserved.
    ULocale ulocale = new ULocale(locale.toLanguageTag());
    return ulocale.getLanguage().equals(bundle.getLocale().getLanguage())
        ? new SoyMsgBundleWithFullLocale(bundle, ulocale, ulocale.toLanguageTag())
        : bundle;
```

### RuleId[ruleID=DataFlowIssue]
Argument `msg.getDesc()` might be null
in `java/src/com/google/template/soy/msgs/internal/ExtractMsgsVisitor.java`
#### Snippet
```java
  private static String extractAttributes(SoyMsg msg) {
    StringBuilder attributes = new StringBuilder();
    Matcher matcher = MESSAGE_ATTRIBUTE_PATTERN.matcher(msg.getDesc());
    while (matcher.find()) {
      attributes.append(matcher.group());
```

### RuleId[ruleID=DataFlowIssue]
Argument `repl` might be null
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
    do {
      String repl = ICU_SYNTAX_CHAR_ESCAPE_MAP.get(matcher.group());
      matcher.appendReplacement(escapedTextSb, repl);
    } while (matcher.find());
    matcher.appendTail(escapedTextSb);
```

### RuleId[ruleID=DataFlowIssue]
Argument `pluralCase.spec()` might be null
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java

    for (Case<SoyMsgPluralCaseSpec> pluralCase : origPluralPart.getCases()) {
      currRawTextSb.append(getPluralCaseOpenString(pluralCase.spec()));
      convertMsgPartsHelper(
          newMsgPartsBuilder, currRawTextSb, pluralCase.parts(), /* isInPlrselPart= */ true);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgPluralPart.java`
#### Snippet
```java

      SoyMsgPluralCaseSpec pluralCaseSpec = case0.spec();
      SoyMsgPluralCaseSpec.Type caseType = pluralCaseSpec.getType();
      if (caseType == SoyMsgPluralCaseSpec.Type.EXPLICIT) {
        if (pluralCaseSpec.getExplicitValue() == pluralValue) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgPluralPart.java`
#### Snippet
```java
      for (Case<SoyMsgPluralCaseSpec> case0 : getCases()) {

        if (case0.spec().getType() == correctCaseType) {
          caseParts = case0.parts();
          break;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setElse` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/dsl/ConditionalExpressionBuilder.java`
#### Snippet
```java
    }
    if (trailingElse != null) {
      builder.setElse(var.assign(trailingElse).asStatement());
    }
    return var.withInitialStatements(ImmutableList.of(decl, builder.build()));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `build` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/dsl/ConditionalExpressionBuilder.java`
#### Snippet
```java
      builder.setElse(var.assign(trailingElse).asStatement());
    }
    return var.withInitialStatements(ImmutableList.of(decl, builder.build()));
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
      } else if ((desc.getType() == FieldDescriptor.Type.BYTES)
          || (desc.isMapField()
              && ProtoUtils.getMapValueFieldDescriptor(desc).getType()
                  == FieldDescriptor.Type.BYTES)) {
        return protoByteStringToBase64ConverterFunction();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `unpackResult` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
      // means that we can do the less expensive SINGULAR access type.
      AccessType accessType = tail ? protoCall.accessType() : AccessType.SINGULAR;
      return accessType.unpackResult(base, protoCall.unpackFunction());
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setElse` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
        Statement trailingElse = Statement.of(visitChildren((IfElseNode) child));
        // Add else-block to conditional.
        conditional.setElse(trailingElse);
      } else {
        throw new AssertionError();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `build` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
    }

    return conditional.build();
  }

```

### RuleId[ruleID=DataFlowIssue]
Casting `callNode` to `CallBasicNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/jssrc/internal/GenCallCodeUtils.java`
#### Snippet
```java
                  templateAliases.get(
                          ((TemplateLiteralNode)
                                  ((CallBasicNode) callNode).getCalleeExpr().getRoot())
                              .getResolvedName())
                      + "$"));
```

### RuleId[ruleID=DataFlowIssue]
Argument `result` might be null
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
                      }
                    }
                    return Optional.of(result);
                  })
              .build();
```

### RuleId[ruleID=DataFlowIssue]
Switch label `TEXT` is unreachable
in `java/src/com/google/template/soy/jssrc/internal/JsType.java`
#### Snippet
```java
        break;
      case ATTRIBUTES:
      case TEXT:
        // nothing extra
        break;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSourceLocation` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/VeLogInstrumentationVisitor.java`
#### Snippet
```java
      HtmlOpenTagNode tag = node.getOpenTagNode();
      SourceLocation insertionLocation =
          tag.getSourceLocation()
              .getEndPoint()
              .asLocation(tag.getSourceLocation().getFilePath());
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `node.getId()` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
            construct(
                SOY_VISUAL_ELEMENT,
                Expression.number(node.getId()),
                metadata,
                Expression.stringLiteral(node.getName().identifier())))
```

### RuleId[ruleID=DataFlowIssue]
Argument `ProtoUtils.getMapValueMessageType(fieldDesc)` might be null
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
          Expression sanitizedContentPackFn =
              sanitizedContentToProtoConverterFunction(
                  ProtoUtils.getMapValueMessageType(fieldDesc));
          fieldValue = SOY_NEWMAPS_TRANSFORM_VALUES.call(fieldValue, sanitizedContentPackFn);
        } else if (ProtoUtils.getMapValueFieldDescriptor(fieldDesc).getType()
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
                  ProtoUtils.getMapValueMessageType(fieldDesc));
          fieldValue = SOY_NEWMAPS_TRANSFORM_VALUES.call(fieldValue, sanitizedContentPackFn);
        } else if (ProtoUtils.getMapValueFieldDescriptor(fieldDesc).getType()
            == FieldDescriptor.Type.BYTES) {
          fieldValue =
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `lastIndexOf` may produce `NullPointerException`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
    } else {
      String resolvedName = node.getResolvedName();
      int secondToLastDotIndex = resolvedName.lastIndexOf('.', resolvedName.lastIndexOf('.') - 1);
      name = resolvedName.substring(secondToLastDotIndex + 1);
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `((TemplateParam) node.getDefnDecl()).defaultValue()` might be null
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
          // once at the beginning of the template. But the Python backend is minimally
          // supported so this is fine.
          PyExpr defaultValue = visit(((TemplateParam) node.getDefnDecl()).defaultValue());
          notFoundBehavior = NotFoundBehavior.defaultValue(defaultValue);
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
                      alias,
                      // Strip the optional suffix character "="
                      /*objectParamName=*/ objectParamType.substring(
                          0, objectParamType.length() - 1),
                      /*addStubMapLogic=*/ true));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
                      ? null
                      // Strip the optional suffix character "="
                      : objectParamType.substring(0, objectParamType.length() - 1),
                  /*addStubMapLogic=*/ false));
      if (jsSrcOptions.shouldGenerateGoogModules()) {
```

### RuleId[ruleID=DataFlowIssue]
Casting `node` to `TemplateBasicNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
        declarations.add(Statement.assign(dottedIdNoRequire(defaultImplName), impl, jsDoc));
      }
      TemplateBasicNode templateBasicNode = (TemplateBasicNode) node;
      declarations.add(
          makeRegisterDefaultFnCall(templateBasicNode, dottedIdNoRequire(defaultImplName)));
```

### RuleId[ruleID=DataFlowIssue]
Casting `node` to `TemplateBasicNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
      declarations.add(
          makeRegisterModFn(
              (TemplateBasicNode) node,
              dottedIdNoRequire(alias + (generatePositionalParamsSignature ? "$" : ""))));
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getRoot` may produce `NullPointerException`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java

  protected static TemplateType getModifiedTemplateType(TemplateBasicNode node) {
    return (TemplateType) node.getModifiesExpr().getRoot().getType();
  }

```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `PYTHON_PRECEDENCES.get(op)` may produce `NullPointerException`
in `java/src/com/google/template/soy/pysrc/restricted/PyExprUtils.java`
#### Snippet
```java
   */
  public static int pyPrecedenceForOperator(Operator op) {
    return PYTHON_PRECEDENCES.get(op);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isAssignableFromLoose` may produce `NullPointerException`
in `java/src/com/google/template/soy/types/TemplateBindingUtil.java`
#### Snippet
```java
        continue;
      }
      if (!base.getParameterMap().get(member.name()).isAssignableFromLoose(member.checkedType())) {
        errorReporter.report(
            PARAMETER_TYPE_MISMATCH,
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/types/TemplateType.java`
#### Snippet
```java
      if (thisParam.getKind() == ParameterKind.ATTRIBUTE) {
        if (!(srcParams.containsKey(thisParam.getName())
            && srcParams.get(thisParam.getName()).getKind() == ParameterKind.ATTRIBUTE)) {
          return false;
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/types/FunctionType.java`
#### Snippet
```java
      // argument of this type. This is because the parameter types are constraints; assignability
      // of a template type is only possible when the constraints of the from-type are narrower.
      if (!srcParam.getType().isAssignableFromInternal(thisParam.getType(), unknownPolicy)) {
        return false;
      }
```

### RuleId[ruleID=DataFlowIssue]
@Nullable method 'classToUnboxTo' always returns a non-null value
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
    }

    @Nullable
    private static Class<?> classToUnboxTo(FieldDescriptor field) {
      switch (field.getJavaType()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `invokeUnchecked` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
          cb.checkCast(BytecodeUtils.SANITIZED_CONTENT_TYPE);
        }
        toProto.invokeUnchecked(cb);
        currentType = toProto.returnType();
      }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `invoke` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        Descriptor messageType = descriptor.getMessageType();
        MethodRef fromProtoMethod = SAFE_PROTO_TO_SANITIZED_CONTENT.get(messageType.getFullName());
        return SoyExpression.forSoyValue(fieldType, fromProtoMethod.invoke(field));
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `node.getId()` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        visualElement =
            MethodRef.SOY_VISUAL_ELEMENT_CREATE.invoke(
                constant(node.getId()), constant(node.getName().identifier()));
      }
      return SoyExpression.forSoyValue(node.getType(), visualElement);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
      } else if (!analysis.isResolved(varRef)) {
        // otherwise it must be a SoyValueProvider, resolve and cast
        expression = detacher.resolveSoyValueProvider(expression);
        return SoyExpression.forSoyValue(
            varRef.getType(),
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
            MethodRef.RUNTIME_GET_FIELD_PROVIDER.invoke(
                baseExprAsRecord, constant(node.getFieldName()));
        fieldAccess = detacher.resolveSoyValueProvider(fieldProvider);
      }
      return SoyExpression.forSoyValue(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        } else {
          soyValueProvider =
              detacher.resolveSoyValueProvider(
                  MethodRef.RUNTIME_GET_LIST_ITEM_PROVIDER.invoke(list, index));
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        } else {
          soyValueProvider =
              detacher.resolveSoyValueProvider(
                  MethodRef.RUNTIME_GET_MAP_ITEM_PROVIDER.invoke(map, index));
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        } else {
          soyValueProvider =
              detacher.resolveSoyValueProvider(
                  MethodRef.RUNTIME_GET_LEGACY_OBJECT_MAP_ITEM_PROVIDER.invoke(map, index));
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `longValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public long getLong(int index) {
    return get(index).longValue();
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `stringValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public String getString(int index) {
    return get(index).stringValue();
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `floatValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public double getFloat(int index) {
    return get(index).floatValue();
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `booleanValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public boolean getBoolean(int index) {
    return get(index).booleanValue();
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `integerValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
   */
  public int getInteger(int index) {
    return get(index).integerValue();
  }

```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `node.getId()` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
              @Override
              protected void doGen(CodeBuilder adapter) {
                adapter.pushLong(node.getId());
                adapter.pushString(node.getName().identifier());
                renderContext.gen(adapter);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `resolveSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
    private Expression resolveVarRefNode(VarRefNode varRef, Expression unresolvedExpression) {
      if (!analysis.isResolved(varRef)) {
        return detacher.resolveSoyValueProvider(unresolvedExpression);
      } else {
        return unresolvedExpression.invoke(MethodRef.SOY_VALUE_PROVIDER_RESOLVE);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `waitForSoyValueProvider` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java
            left =
                ExpressionCompiler.requiresDetach(analysis, node.getLeftChild())
                    ? detacher.waitForSoyValueProvider(leftSVP)
                    : leftSVP;
          } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `compile` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/ExpressionToSoyValueProviderCompiler.java`
#### Snippet
```java

    private Expression compileToSoyValueProviderWithDetaching(ExprNode expr) {
      return detachingExprCompiler.compile(expr).boxAsSoyValueProvider();
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asCharSource` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/BytecodeCompiler.java`
#### Snippet
```java
        writer.writeEntry(
            Names.javaFileName(namespace, fileName),
            files.get(file.getFilePath()).asCharSource().asByteSource(UTF_8));
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `addBranch` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
        } else {
          SwitchDefaultNode ien = (SwitchDefaultNode) child;
          Block defaultBlockStart = conditions.addBranch();
          Block defaultBlockEnd = exec(defaultBlockStart, ien);
          branchEnds.add(defaultBlockEnd);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `addBranch` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
        } else {
          IfElseNode ien = (IfElseNode) child;
          Block branch = conditionFork.addBranch();
          branch = exec(branch, ien);
          branchEnds.add(branch);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `replayOn` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/DetachableContentProvider.java`
#### Snippet
```java
            "calling renderAndResolve after setting isLast = true is not supported");
      }
      buffer.replayOn(appendable);
      return RenderResult.done();
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java
      for (Case<SoyMsgPluralCaseSpec> item : pluralPart.getCases()) {
        builder.add(Tag.BEGIN_CASE.ordinal());
        if (item.spec().getType() == SoyMsgPluralCaseSpec.Type.EXPLICIT) {
          builder.add(item.spec().getExplicitValue());
        } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSoyFileKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckIndirectDepsPass.java`
#### Snippet
```java
            i -> {
              FileMetadata metadata = templateRegistryFull.get().getFile(i.getSourceFilePath());
              SoyFileKind calleeKind = metadata.getSoyFileKind();
              if (calleeKind == SoyFileKind.INDIRECT_DEP) {
                String callerFilePath = i.getSourceLocation().getFilePath().path();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
        ImmutableList<SoyMsgPart> parts = this.msgParts;
        RenderResult caseSelectionResult = RenderResult.done();
        while (!parts.isEmpty()) {
          SoyMsgPart first = parts.get(0);
          if (first instanceof SoyMsgSelectPart) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `contains` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
          String placeholderName = ((SoyMsgPlaceholderPart) msgPart).getPlaceholderName();
          if (endPlaceholderToStartPlaceholder != null) {
            if (startPlaceholders.contains(placeholderName)) {
              startPlaceholderRenderCount.add(placeholderName);
            } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `add` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
          if (endPlaceholderToStartPlaceholder != null) {
            if (startPlaceholders.contains(placeholderName)) {
              startPlaceholderRenderCount.add(placeholderName);
            } else {
              // check if it is an end tag
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `remove` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
                boolean matched = false;
                for (String startPlaceholder : startPlaceholders) {
                  if (startPlaceholderRenderCount.remove(startPlaceholder)) {
                    matched = true;
                    break;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `contains` may produce `NullPointerException`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
                endPlaceholder));
      }
      if (startPlaceholders.contains(endPlaceholder)) {
        String beforePlaceholder = null;
        // scan to find the placeholder that is supposed to come after this one.
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckModifiableTemplatesPass.java`
#### Snippet
```java
        (TemplateLiteralNode) templateBasicNode.getModifiesExpr().getRoot();
    String namespace =
        literal.getResolvedName().substring(0, literal.getResolvedName().lastIndexOf("."));
    if (!namespace.equals(file.getNamespace())) {
      modifiedNamespaces.add(namespace);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getRoot` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckModifiableTemplatesPass.java`
#### Snippet
```java
    }
    TemplateType modifiedTemplateType =
        (TemplateType) templateBasicNode.getModifiesExpr().getRoot().getType();
    SoyType variantType = templateBasicNode.getVariantExpr().getRoot().getType();
    if (!modifiedTemplateType.getUseVariantType().isAssignableFromStrict(variantType)) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `definiteBlockAttrs` might be null
in `java/src/com/google/template/soy/passes/BasicHtmlValidationPass.java`
#### Snippet
```java
          }
        }
        foundSoFar.addAll(definiteBlockAttrs);
      } else {
        for (BlockNode block : parent.getChildren()) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getExtensions` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ProtoImportProcessor.java`
#### Snippet
```java
    // Add a mapping from "moduleName.ExtensionName" -> fqn, for every top-level extension in the
    // file.
    for (FieldDescriptor ext : fd.getExtensions()) {
      String symbol = Field.computeSoyName(ext);
      String moduleRelativeName = node.getModuleAlias() + "." + symbol;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getMessageTypes` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ProtoImportProcessor.java`
#### Snippet
```java

    ImmutableMap<String, Descriptor> messages =
        fd.getMessageTypes().stream().collect(toImmutableMap(Descriptor::getName, f -> f));
    ImmutableMap<String, EnumDescriptor> enums =
        fd.getEnumTypes().stream().collect(toImmutableMap(EnumDescriptor::getName, f -> f));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toLineColumnString` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/LocalVariablesNodeVisitor.java`
#### Snippet
```java
              englishName(defn),
              refName,
              preexisting.nameLocation().toLineColumnString());
        }
        return false;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `put` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/LocalVariablesNodeVisitor.java`
#### Snippet
```java
    void define(VarDefn defn, Node definingNode) {
      if (check(defn, definingNode)) {
        currentScope.peek().put(defn.refName(), defn);
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getAndIncrement` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/IncrementalDomKeysPass.java`
#### Snippet
```java
      }
      AtomicInteger keyCounter = keyCounterStack.peek();
      return template.getTemplateName() + "-" + keyCounter.getAndIncrement();
    }
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getClass` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/PluginResolver.java`
#### Snippet
```java
            SourceLocation.UNKNOWN,
            FUNCTION_PRINT_DIRECTIVE_COLLISION,
            functions.get(functionName).getClass().getName(),
            functionName,
            directive.getClass().getName());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `add` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/StrictHtmlValidationPass.java`
#### Snippet
```java
      if (htmlMatcherGraph.getNodeAtCursor().isPresent()) {
        HtmlMatcherGraphNode activeNode = htmlMatcherGraph.getNodeAtCursor().get();
        activeEdgeStack.peek().add(ActiveEdge.create(activeNode, activeNode.getActiveEdgeKind()));
      }
      ifConditionNode.setActiveEdgeKind(EdgeKind.FALSE_EDGE);
```

### RuleId[ruleID=DataFlowIssue]
Argument `htmlMatcherGraph` might be null
in `java/src/com/google/template/soy/passes/StrictHtmlValidationPass.java`
#### Snippet
```java

            /* parentBlockType= */ null)
        .run(htmlMatcherGraph);
    if (node.isStrictHtml()) {
      reporter.copyTo(this.errorReporter);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getIsSoyElement` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    if (templateMetadata != null) {
      calleeMetadata = templateMetadata.getHtmlElement();
      isCalleeSoyElement = templateMetadata.getSoyElement().getIsSoyElement();
    } else if (templatesInLibrary.containsKey(callee)) {
      TemplateNode calledTemplate = templatesInLibrary.get(callee);
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    } else {
      // These are text/css/uri/etc/deltemplate nodes
      isCalleeSoyElement = false;
      calleeMetadata = DEFAULT_HTML_METADATA;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFinalCallee` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    }
    String finalCallee;
    if (calleeMetadata.getFinalCallee().isEmpty()) {
      finalCallee = callee;
    } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTag` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
                templatesInLibrary,
                visited);
        tagName = metadata.getTag();
      } else {
        // TODO(tomnguyen) It should be possible to use type information to get more data.
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFinalCallee` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
          getTemplateMetadataForStaticCall(
              template, delegateTemplate, openTag.getSourceLocation(), templatesInLibrary, visited);
      if (htmlMetadata.getFinalCallee().isEmpty()) {
        finalCallee = delegateTemplate;
      } else {
```

### RuleId[ruleID=DataFlowIssue]
Argument `graph` might be null
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
    if (foreignContentTagDepth > 0) {
      if (!isInternallyBalancedForForeignContent.isPresent()) {
        pass.run(graph);
        isInternallyBalancedForForeignContent = Optional.of(errorReporter.getErrors().isEmpty());
      }
```

### RuleId[ruleID=DataFlowIssue]
Argument `graph` might be null
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
    }
    if (!isInternallyBalanced.isPresent()) {
      pass.run(graph);
      isInternallyBalanced = Optional.of(errorReporter.getErrors().isEmpty());
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `hasTemplate` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/TemplateImportProcessor.java`
#### Snippet
```java
    for (ImportedVar symbol : node.getIdentifiers()) {
      String name = symbol.getSymbol();
      boolean isTemplate = fileMetadata.hasTemplate(name);

      // Report an error if the symbol name is invalid.
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getNamespace` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/TemplateImportProcessor.java`
#### Snippet
```java
    return typeRegistry.intern(
        TemplateModuleImportType.create(
            templatesPerFile.getNamespace(),
            path,
            ImmutableSet.copyOf(templatesPerFile.getConstantNames()),
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckTemplateCallsPass.java`
#### Snippet
```java
          ExprNode dataExpr = call.getDataExpr();
          // TODO(b/168852179): enforce that the correct set of properties are present
          if (!SoyTypes.isKindOrUnionOfKind(dataExpr.getType(), SoyType.Kind.RECORD)
              && dataExpr.getType().getKind() != SoyType.Kind.UNKNOWN
              // We allow 'any' due to a convention in wiz components :(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toLineColumnString` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java
          node.getSourceLocation(),
          DELCALL_TO_BASIC_TEMPLATE,
          collision.nameLocation().toLineColumnString());
    }
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isRequired` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/CheckDelegatesPass.java`
#### Snippet
```java
              // with the same name differ in either the type or isRequired.
              Parameter param2 = nameToParamMap.get(paramName);
              return !param.equals(param2) && (param.isRequired() || param2.isRequired());
            })
        .collect(Collectors.toSet());
```

### RuleId[ruleID=DataFlowIssue]
Argument `paramName` might be null
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
            startNode.getSourceLocation(),
            unknown,
            Identifier.create(paramName, unknown),
            new CommandTagAttribute(
                Identifier.create("kind", unknown),
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `startsWith` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java

    String attrName = attr.getStaticKey();
    boolean isSoyAttr = attrName.startsWith("@");
    if (isSoyAttr) {
      attrName = attrName.substring(1);
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `java/src/com/google/template/soy/plugin/java/internal/JavaPluginValidator.java`
#### Snippet
```java
        break;
      case CLAZZ:
        actualSoyType = null;
        break;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getTemplateType` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
                  .get()
                  .getBasicTemplateOrElement(leaf.getValue())
                  .getTemplateType()
                  .getReservedAttributes();
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `setReservedAttributes` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
        }
        TemplateNode caller = allAstElements.get(leaf.getKey());
        caller.setReservedAttributes(
            ImmutableSet.<String>builder()
                .addAll(caller.getReservedAttributes())
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ElementAttributePass.java`
#### Snippet
```java
              AttrParam attr = attrs.get(attrName);
              unseenParams.remove(attr);
              VarRefNode attrExpr = new VarRefNode("$" + attr.name(), unknown, attr);

              final StandaloneNode replacementNode;
```

### RuleId[ruleID=DataFlowIssue]
@Nullable method 'get' always returns a non-null value
in `java/src/com/google/template/soy/shared/SoyCssRenamingMap.java`
#### Snippet
```java
  SoyCssRenamingMap IDENTITY =
      new SoyCssRenamingMap() {
        @Nullable
        @Override
        public String get(String key) {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `nameLocation` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
              node.getName().location(),
              VE_CONFLICTS_WITH_TYPE,
              importIndex.get(node.getName().identifier()).nameLocation().getBeginLine());
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getBeginLine` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
              node.getName().location(),
              VE_CONFLICTS_WITH_TYPE,
              importIndex.get(node.getName().identifier()).nameLocation().getBeginLine());
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getFieldNames` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
      // TODO(user): Consider writing a soyProtoTypeImpl.getRequiredFields()
      Set<String> givenParams = new HashSet<>();
      ImmutableSet<String> fields = protoType.getFieldNames();

      boolean hasAliasedParams = false;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java

        // Same for List<?>, for repeated fields
        if (fieldType.getKind() == Kind.LIST && argType.getKind() == Kind.LIST) {
          SoyType argElementType = ((ListType) argType).getElementType();
          if (argElementType == null || argElementType.equals(UnknownType.getInstance())) {
```

### RuleId[ruleID=DataFlowIssue]
Casting `argType` to `ListType` may produce `ClassCastException`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        // Same for List<?>, for repeated fields
        if (fieldType.getKind() == Kind.LIST && argType.getKind() == Kind.LIST) {
          SoyType argElementType = ((ListType) argType).getElementType();
          if (argElementType == null || argElementType.equals(UnknownType.getInstance())) {
            continue;
```

### RuleId[ruleID=DataFlowIssue]
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java

      checkMapFromListConstructorCondition(
          ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.KEY_STRING)
              && ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.VALUE_STRING),
          recordEntry,
```

### RuleId[ruleID=DataFlowIssue]
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java
      checkMapFromListConstructorCondition(
          ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.KEY_STRING)
              && ((SoyRecord) recordEntry).hasField(MapLiteralFromListNode.VALUE_STRING),
          recordEntry,
          OptionalInt.of(i));
```

### RuleId[ruleID=DataFlowIssue]
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java
          OptionalInt.of(i));

      SoyValue key = ((SoyRecord) recordEntry).getField(MapLiteralFromListNode.KEY_STRING);
      SoyValueProvider valueProvider =
          ((SoyRecord) recordEntry).getFieldProvider(MapLiteralFromListNode.VALUE_STRING);
```

### RuleId[ruleID=DataFlowIssue]
Casting `recordEntry` to `SoyRecord` may produce `ClassCastException`
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java
      SoyValue key = ((SoyRecord) recordEntry).getField(MapLiteralFromListNode.KEY_STRING);
      SoyValueProvider valueProvider =
          ((SoyRecord) recordEntry).getFieldProvider(MapLiteralFromListNode.VALUE_STRING);
      checkMapFromListConstructorCondition(
          key != null && SoyMap.isAllowedKeyType(key), recordEntry, OptionalInt.of(i));
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterNormalizeUri(String value) {
    if (EscapingConventions.FilterNormalizeUri.INSTANCE.getValueFilter().matcher(value).find()) {
      return EscapingConventions.FilterNormalizeUri.INSTANCE.escape(value);
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterCssValue(String value) {
    if (EscapingConventions.FilterCssValue.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a sip URI. */
  public static SanitizedContent filterSipUri(String value) {
    if (EscapingConventions.FilterSipUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape. Escaping for other contexts (e.g. HTML) happen after this.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a data URI corresponding to an image. */
  public static SanitizedContent filterImageDataUri(String value) {
    if (EscapingConventions.FilterImageDataUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterHtmlAttributes(String value) {
    if (EscapingConventions.FilterHtmlAttributes.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
    if (EscapingConventions.FilterNormalizeMediaUri.INSTANCE
        .getValueFilter()
        .matcher(value)
        .find()) {
      return EscapingConventions.FilterNormalizeMediaUri.INSTANCE.escape(value);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Checks that the input is part of the name of an innocuous element. */
  public static String filterHtmlElementName(String value) {
    if (EscapingConventions.FilterHtmlElementName.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a sms URI. */
  public static SanitizedContent filterSmsUri(String value) {
    if (EscapingConventions.FilterSmsUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape. Escaping for other contexts (e.g. HTML) happen after this.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a tel URI. */
  public static SanitizedContent filterTelUri(String value) {
    if (EscapingConventions.FilterTelUri.INSTANCE.getValueFilter().matcher(value).find()) {
      // NOTE: No need to escape. Escaping for other contexts (e.g. HTML) happen after this.
      return UnsafeSanitizedContentOrdainer.ordainAsSafe(value, ContentKind.URI);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `matcher` may produce `NullPointerException`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java

  public static String filterCspNonceValue(String value) {
    if (EscapingConventions.FilterCspNonceValue.INSTANCE.getValueFilter().matcher(value).find()) {
      return value;
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `refName` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/ForNode.java`
#### Snippet
```java
            "%s, %s in %s",
            ((ForNonemptyNode) getChild(0)).getVarRefName(),
            ((ForNonemptyNode) getChild(0)).getIndexVar().refName(),
            expr.toSourceString());
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asAttributeValue` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/LetContentNode.java`
#### Snippet
```java
            Identifier.create("kind", SourceLocation.UNKNOWN),
            QuoteStyle.DOUBLE,
            contentKind.asAttributeValue(),
            SourceLocation.UNKNOWN,
            SourceLocation.UNKNOWN);
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
          break;
        }
        prev = stack;
        while (!prev.isEmpty()) {
          HtmlOpenTagNode nextOpenTag = prev.tagNode;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `hashCode` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
  public int hashCode() {
    return isStatic()
        ? nameAsLowerCase.hashCode()
        : PrintNode.PrintEquivalence.get().hash((PrintNode) node);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
      }
      if (isStatic()) {
        return nameAsLowerCase.equals(tag.nameAsLowerCase);
      }
      return PrintNode.PrintEquivalence.get().equivalent((PrintNode) node, (PrintNode) tag.node);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `templateKind` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
    String templateName;
    String variant = templateProto.getDelTemplateVariant();
    switch (templateKind) {
      case ELEMENT:
      case BASIC:
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/ForNonemptyNode.java`
#### Snippet
```java
  @Nullable
  public final String getIndexVarName() {
    return indexVar.name();
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `basePlaceholderName` might be null
in `java/src/com/google/template/soy/soytree/MsgHtmlTagNode.java`
#### Snippet
```java
    // TODO(lukes): track down some documentation for these rules and add placeholder validation
    // in more places.
    basePlaceholderName = INVALID_PLACEHOLDER_CHARS.replaceFrom(basePlaceholderName, '_');
    return Ascii.toUpperCase(basePlaceholderName);
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getRoot` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
   */
  private String resolveVariantExpression() {
    variantString = TemplateNode.variantExprToString(getVariantExpr().getRoot());
    return variantString;
  }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `substring` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
        return templateLiteralNode
            .getResolvedName()
            .substring(0, templateLiteralNode.getResolvedName().lastIndexOf("."));
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getNamespace` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/PartialFileSetMetadata.java`
#### Snippet
```java
   */
  default String getNamespaceForPath(SourceFilePath path) {
    return getPartialFile(path).getNamespace();
  }
}
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
   */
  public String getPluralVarName(MsgPluralNode pluralNode) {
    return getSubstUnitInfo().nodeToVarNameMap.get(pluralNode).name();
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `name` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java
   */
  public String getSelectVarName(MsgSelectNode selectNode) {
    return getSubstUnitInfo().nodeToVarNameMap.get(selectNode).name();
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `SoyFileHeaderInfo.EMPTY.getNamespace()` might be null
in `java/src/com/google/template/soy/soytree/NamespaceDeclaration.java`
#### Snippet
```java
  public static final NamespaceDeclaration EMPTY =
      new NamespaceDeclaration(
          Identifier.create(SoyFileHeaderInfo.EMPTY.getNamespace(), UNKNOWN),
          ImmutableList.of(),
          null,
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getSourceLocation` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/MsgSubstUnitPlaceholderNameUtils.java`
#### Snippet
```java
        }
        errorReporter.report(
            collidingExprRoot.getSourceLocation(),
            COLLIDING_EXPRESSIONS,
            exprRoot.toSourceString(),
```

### RuleId[ruleID=DataFlowIssue]
Casting `template` to `TemplateDelegateNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/soytree/TemplateMetadata.java`
#### Snippet
```java
    }
    if (template.getKind() == Kind.TEMPLATE_DELEGATE_NODE) {
      TemplateDelegateNode deltemplate = (TemplateDelegateNode) template;
      builder.setDelTemplateName(deltemplate.getDelTemplateName());
      builder.setDelTemplateVariant(deltemplate.getDelTemplateVariant());
```

### RuleId[ruleID=DataFlowIssue]
Argument `specialCharTag` might be null
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
      while (matcher.find()) {
        String specialCharTag = SPECIAL_CHAR_TO_TAG.get(matcher.group());
        matcher.appendReplacement(sb, Matcher.quoteReplacement(specialCharTag));
      }
      matcher.appendTail(sb);
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `node.offsets` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
        // joining the arrays
        // we don't preserve offsets from empty nodes.
        numOffsets += node.isEmpty() ? 0 : node.offsets.indexes.length - 1;
      } else {
        numOffsets = -1;
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `offsets` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
        // offset's string.
        SourceOffsets offsets = node.offsets;
        int amountToCopy = offsets.indexes.length;
        if (i < nodes.size() - 1) {
          amountToCopy--;
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `nodes.get(i - 1).offsets` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
        // If the new begin reason is NONE, then use the old end reason.
        if (offsets.reasons[0] == Reason.NONE && i > 0) {
          Reason[] prevReasons = nodes.get(i - 1).offsets.reasons;
          reasons[offsetsIndex] = prevReasons[prevReasons.length - 1];
        }
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `stream` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
          key,
          quoteStyle,
          valueExprList.stream()
              .map(expr -> expr.getRoot().copy(copyState))
              .collect(toImmutableList()),
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `size` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
  void checkAsExpr(ErrorReporter reporter) {
    checkState(value == null);
    if (valueExprList.size() != 1) {
      SourceLocation loc =
          valueExprList.isEmpty() ? getSourceLocation() : valueExprList.get(1).getSourceLocation();
```

### RuleId[ruleID=DataFlowIssue]
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    checkState(valueExprList == null);

    Iterable<String> namespaces = SPLITTER.split(value);
    boolean hasError = false;
    for (String namespace : namespaces) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `valueExprList` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
            ? BaseUtils.escapeToWrappedSoyString(value, false, quoteStyle)
            : quoteStyle.getQuoteChar()
                + SoyTreeUtils.toSourceString(valueExprList)
                + quoteStyle.getQuoteChar();
    return key.identifier() + "=" + valueStr;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `get` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    checkAsExpr(reporter);
    // Return the first expr to avoid an NPE in CallNode ctor.
    return valueExprList.get(0);
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    checkState(valueExprList == null);

    return ImmutableList.copyOf(SPLITTER.split(value));
  }

```

### RuleId[ruleID=DataFlowIssue]
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java

    try {
      return OptionalInt.of(Integer.parseInt(value));
    } catch (NumberFormatException e) {
      errorReporter.report(valueLocation, INVALID_ATTRIBUTE, key.identifier(), "a number");
```

### RuleId[ruleID=DataFlowIssue]
Argument `value` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java

    try {
      return OptionalLong.of(Long.parseLong(value));
    } catch (NumberFormatException e) {
      errorReporter.report(valueLocation, INVALID_ATTRIBUTE, key.identifier(), "a number");
```

### RuleId[ruleID=DataFlowIssue]
Argument `valueExprList` might be null
in `java/src/com/google/template/soy/soytree/CommandTagAttribute.java`
#### Snippet
```java
    String valueStr =
        quoteStyle.getQuoteChar()
            + ((value != null) ? value : SoyTreeUtils.toSourceString(valueExprList))
            + quoteStyle.getQuoteChar();
    return key.identifier() + "=" + valueStr;
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `copy` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/defn/TemplateStateVar.java`
#### Snippet
```java
    this.isExplicitlyOptional = old.isExplicitlyOptional;
    this.desc = old.desc;
    this.initialValue = old.initialValue.copy(copyState);
    this.sourceLocation = old.sourceLocation;
    copyState.updateRefs(old.initialValue, this.initialValue);
```

### RuleId[ruleID=DataFlowIssue]
Argument `value` might be null
in `java/src/com/google/template/soy/testing/AbstractSoyPrintDirectiveTestCase.java`
#### Snippet
```java
      SoyJavaPrintDirective directive,
      Object... args) {
    assertTofuOutput(StringData.forValue(expectedOutput), value, directive, args);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isSingleLine` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/defn/ImportedVar.java`
#### Snippet
```java
  public SourceLocation symbolLocation() {
    SourceLocation full = nameLocation();
    if (isAliased() && full.isSingleLine()) {
      return full.substring(0, symbol.length());
    } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toSourceString` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ListComprehensionNode.java`
#### Snippet
```java
            indexVar.refName(),
            getListExpr().toSourceString(),
            getFilterExpr().toSourceString());
      }
      return String.format(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toSourceString` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ListComprehensionNode.java`
#### Snippet
```java
          listIterVar.refName(),
          getListExpr().toSourceString(),
          getFilterExpr().toSourceString());
    }
    return String.format(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getName` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
                  e ->
                      ExternImpl.of(
                          e.getName(),
                          (FunctionType)
                              TemplateMetadataSerializer.fromProto(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java

  private static boolean sameFile(TemplateMetadata t1, TemplateMetadata t2) {
    return t1.getSourceLocation().getFileName().equals(t2.getSourceLocation().getFileName());
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getName` may produce `NullPointerException`
in `java/src/com/google/template/soy/soytree/Metadata.java`
#### Snippet
```java
                  c ->
                      ConstantImpl.of(
                          c.getName(),
                          TemplateMetadataSerializer.fromProto(
                              c.getType(),
```

### RuleId[ruleID=DataFlowIssue]
Casting `node` to `GroupNode` may produce `ClassCastException`
in `java/src/com/google/template/soy/exprtree/NullSafeAccessNode.java`
#### Snippet
```java
    return (node.getKind() == Kind.STRING_NODE
            && ((StringNode) node).getValue().equals(BASE_PLACEHOLDER_VALUE))
        || (node.getKind() == Kind.GROUP_NODE && ((GroupNode) node).isNullSafeAccessPlaceHolder());
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
    protected Boolean visitTemplateLiteralNode(TemplateLiteralNode node) {
      TemplateLiteralNode otherNode = (TemplateLiteralNode) other;
      return node.getResolvedName().equals(otherNode.getResolvedName());
    }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `hashCode` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
        @Override
        protected Integer visitTemplateLiteralNode(TemplateLiteralNode node) {
          return node.getResolvedName().hashCode();
        }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/ExprEquivalence.java`
#### Snippet
```java
    protected Boolean visitVeLiteralNode(VeLiteralNode node) {
      VeLiteralNode otherNode = (VeLiteralNode) other;
      return node.getId().equals(otherNode.getId())
          && node.getName().equals(otherNode.getName())
          && node.getType().toString().equals(otherNode.getType().toString());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getType` may produce `NullPointerException`
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java
  public static Descriptor getMapValueMessageType(FieldDescriptor mapField) {
    FieldDescriptor valueDesc = getMapValueFieldDescriptor(mapField);
    if (valueDesc.getType() == FieldDescriptor.Type.MESSAGE) {
      return valueDesc.getMessageType();
    } else {
```

### RuleId[ruleID=DataFlowIssue]
Dereference of `jsType` may produce `NullPointerException`
in `java/src/com/google/template/soy/internal/proto/FieldVisitor.java`
#### Snippet
```java
    if (ProtoUtils.hasJsType(fieldDescriptor)) {
      JSType jsType = ProtoUtils.getJsType(fieldDescriptor);
      switch (jsType) {
        case JS_NORMAL:
        case JS_NUMBER:
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
      int cp = -1;
      if (end == -1) {
        cp = -1;
      } else {
        if (s.charAt(amp + 1) == '#') { // Decode a numeric entity
```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `java/src/com/google/template/soy/internal/base/UnescapeUtils.java`
#### Snippet
```java
            }
          } catch (NumberFormatException ex) {
            cp = -1; // Malformed numeric entity
          }
        } else {
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getPrecedence` may produce `NullPointerException`
in `java/src/com/google/template/soy/exprtree/Operator.java`
#### Snippet
```java

    Operator operator = OPERATOR_TABLE.get(op, children.length);
    if (operator.getPrecedence() != prec) {
      throw new IllegalArgumentException("invalid precedence " + prec + " for operator " + op);
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `soyFileHeaderInfo.namespace` might be null
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java
  public StackTraceElement createStackTraceElement(SourceLocation srcLocation) {
    return new StackTraceElement(
        /* declaringClass= */ soyFileHeaderInfo.namespace,
        // The partial template name begins with a '.' that causes the stack trace element to
        // print "namespace..templateName" otherwise.
```

### RuleId[ruleID=DataFlowIssue]
Passing `null` argument to parameter annotated as @NotNull
in `java/src/com/google/template/soy/parsepasses/contextautoesc/SoyAutoescapeException.java`
#### Snippet
```java
   */
  static SoyAutoescapeException createWithNode(String message, SoyNode node) {
    return new SoyAutoescapeException(message, /*cause=*/ null, node);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
              (templateLiteral) ->
                  !templateLiteral.isStaticCall()
                      && templateLiteral.getResolvedName().equals(template.getTemplateName()))) {
        // If a template is passed around into other templates, we cannot be sure of the trusted
        // content kind.
```

### RuleId[ruleID=DataFlowIssue]
Argument `printDirectives.get(escapingMode.directiveName)` might be null
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
          new ImmutableList.Builder<>();
      for (EscapingMode escapingMode : inferences.getEscapingModesForNode(node)) {
        escapingDirectiveNames.add(printDirectives.get(escapingMode.directiveName));
      }
      return escapingDirectiveNames.build();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `asInlineCast` may produce `NullPointerException`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
          paramNames.get(i),
          "\", ",
          type.getJavaTypeMap().get(paramNames.get(i)).asInlineCast(javaParamNames.get(i)));
    }
    ilb.appendLineEnd("));");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isEmpty` may produce `NullPointerException`
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
        case DELTEMPLATE:
          resultSb.append(template.getDelTemplateName());
          if (!template.getDelTemplateVariant().isEmpty()) {
            resultSb.append(':');
            resultSb.append(template.getDelTemplateVariant());
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `toLineColumnString` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/Environment.java`
#### Snippet
```java
              "No value for %s at %s. All: %s",
              var.name(),
              var.nameLocation().toLineColumnString(),
              localVariables.keySet())
          .resolve();
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `coerceToBoolean` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  public JavaValue coerceToSoyBoolean() {
    return TofuJavaValue.forSoyValue(
        BooleanData.forValue(soyValue.coerceToBoolean()), sourceLocation);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `coerceToString` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
  public JavaValue coerceToSoyString() {
    return TofuJavaValue.forSoyValue(
        StringData.forValue(soyValue.coerceToString()), sourceLocation);
  }

```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getClass` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/TofuJavaValue.java`
#### Snippet
```java
              + soyValue
              + "] of type: "
              + soyValue.getClass()
              + " is incompatible with soy type: "
              + type);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `equals` may produce `NullPointerException`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    boolean isEndTag = state() == HtmlContext.HTML_BEFORE_CLOSE_TAG_NAME;
    int newTemplateNestDepth = templateNestDepth();
    if (node.getTagName().isStatic() && node.getTagName().getTagString().equals("template")) {
      newTemplateNestDepth += isEndTag ? -1 : 1;
      if (newTemplateNestDepth < 0) {
```

### RuleId[ruleID=DataFlowIssue]
Argument `state().getErrorMessage()` might be null
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    // Short circuit on the error case first.
    if (escapingMode == null) {
      throw SoyAutoescapeException.createWithNode(state().getErrorMessage(), node);
    }

```

### RuleId[ruleID=DataFlowIssue]
Variable is already assigned to this value
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
        if (node.getDirectAttributeNamed("rel") == null
            && node.getDirectAttributeNamed("itemprop") != null) {
          elType = ElementType.NORMAL;
        } else {
          String rel = getStaticAttributeValue(node, "rel");
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `getExpr` may produce `NullPointerException`
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
                      ConstNode constNode =
                          constants.get(SourceFilePath.create(node.getPath()), var.getSymbol());
                      return eval(constNode.getExpr(), constNode);
                    }));
          }
```

### RuleId[ruleID=DataFlowIssue]
Casting `base` to `SoyLegacyObjectMap` may produce `ClassCastException`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    boolean shouldUseNewMap = MapType.ANY_MAP.isAssignableFromStrict(baseType);
    SoyValue value =
        shouldUseNewMap ? ((SoyMap) base).get(key) : ((SoyLegacyObjectMap) base).getItem(key);

    if (value != null
```

### RuleId[ruleID=DataFlowIssue]
Argument `((TemplateParam) node.getDefnDecl()).defaultValue()` might be null
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
          && (UndefinedData.INSTANCE == value)) {
        // Use the default value if it has one and the parameter is undefined.
        value = visit(((TemplateParam) node.getDefnDecl()).defaultValue());
      }
      return value;
```

### RuleId[ruleID=DataFlowIssue]
Casting `listValue` to `SoyList` may produce `ClassCastException`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
          listValue instanceof SoyList, listValue, OptionalInt.empty());

      List<? extends SoyValueProvider> list = ((SoyList) listValue).asJavaList();
      return constructMapFromList(list);
    } catch (IllegalArgumentException e) {
```

### RuleId[ruleID=DataFlowIssue]
Unboxing of `isNonConst.get(headerVar)` may produce `NullPointerException`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomCodeVisitor.java`
#### Snippet
```java
    String prefix = STATE_PREFIX;
    for (TemplateStateVar headerVar : headerVars) {
      if (isNonConst.get(headerVar)) {
        stateReassignmentBuilder.add(
            Statement.assign(
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isHtml` may produce `NullPointerException`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      // We could be in some other content kind (like JS in a <script> tag) or still in HTML. Either
      // way, a closing HTML tag means we're back in HTML, so pop if needed for HTML.
      if (!contentKind.peek().isHtml()) {
        contentKind.pop();
        checkState(contentKind.peek().isHtml(), "unexpected contentKind: %s", contentKind);
```

### RuleId[ruleID=DataFlowIssue]
Method invocation `isHtml` may produce `NullPointerException`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      if (!contentKind.peek().isHtml()) {
        contentKind.pop();
        checkState(contentKind.peek().isHtml(), "unexpected contentKind: %s", contentKind);
      }
    }
```

### RuleId[ruleID=DataFlowIssue]
Argument `contentKind.peek()` might be null
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
  @Override
  protected Statement visitIfNode(IfNode node) {
    if (!isTextContent(contentKind.peek())) {
      return super.generateNonExpressionIfNode(node);
    } else {
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'SoyEasyList' is still used
in `java/src/com/google/template/soy/data/SoyEasyList.java`
#### Snippet
```java
@Deprecated
@ParametersAreNonnullByDefault
public interface SoyEasyList extends SoyList, SoyLegacyObjectMap {

  /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'EasyListImpl' is still used
in `java/src/com/google/template/soy/data/internal/EasyListImpl.java`
#### Snippet
```java
@ParametersAreNonnullByDefault
@Deprecated
public final class EasyListImpl extends ListBackedList implements SoyEasyList {

  /** Whether this instance is still mutable (immutability cannot be undone, of course). */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'createFromExistingData' is still used
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
   */
  @Deprecated
  protected static SoyValue createFromExistingData(Object obj) {
    if (obj instanceof SoyValue) {
      return (SoyValue) obj;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'SoyLibraryAssistedJsSrcFunction' is still used
in `java/src/com/google/template/soy/jssrc/restricted/SoyLibraryAssistedJsSrcFunction.java`
#### Snippet
```java
 */
@Deprecated
public interface SoyLibraryAssistedJsSrcFunction extends SoyJsSrcFunction {

  /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'maybeWrapAsSanitizedContent' is still used
in `java/src/com/google/template/soy/jssrc/restricted/JsExprUtils.java`
#### Snippet
```java
   */
  @Deprecated
  public static JsExpr maybeWrapAsSanitizedContent(ContentKind contentKind, JsExpr jsExpr) {
    if (contentKind == ContentKind.TEXT) {
      return jsExpr;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'SoyPySrcFunction' is still used
in `java/src/com/google/template/soy/pysrc/restricted/SoyPySrcFunction.java`
#### Snippet
```java
 */
@Deprecated
public interface SoyPySrcFunction extends SoyFunction {

  /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'SoyListData' is still used
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
 */
@Deprecated
public final class SoyListData extends CollectionData implements Iterable<SoyValue>, SoyList {
  /** The underlying list. */
  private final List<SoyValue> list;
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'SoyJsSrcFunction' is still used
in `java/src/com/google/template/soy/jssrc/restricted/SoyJsSrcFunction.java`
#### Snippet
```java
 */
@Deprecated
public interface SoyJsSrcFunction extends SoyFunction {

  /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'SoyMapData' is still used
in `java/src/com/google/template/soy/data/SoyMapData.java`
#### Snippet
```java
 */
@Deprecated
public class SoyMapData extends CollectionData implements SoyDict, SoyMap {

  /** Underlying map. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'compileToTofu' is still used
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   */
  @Deprecated
  public SoyTofu compileToTofu() {
    return compileToTofu(ImmutableMap.of());
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'extractMsgs' is still used
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   */
  @Deprecated
  public SoyMsgBundle extractMsgs() {
    return entryPoint(this::doExtractMsgs);
  }
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'renderTemplate' is still used
in `java/src/com/google/template/soy/jbcsrc/api/SoySauce.java`
#### Snippet
```java
   */
  @Deprecated
  Renderer renderTemplate(String template);

  default Renderer renderTemplate(TemplateName template) {
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'TypedSoyFunction' is still used
in `java/src/com/google/template/soy/shared/restricted/TypedSoyFunction.java`
#### Snippet
```java
 */
@Deprecated
public abstract class TypedSoyFunction implements SoyFunction {

  @Override
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_DOUBLE_BRACES' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoDoubleBracesSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoDoubleBracesSoyTemplateInfo DEMO_DOUBLE_BRACES =
      DemoDoubleBracesSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoCallWithParamBlockSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoCallWithParamBlockSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_COMMENTS' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCommentsSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCommentsSoyTemplateInfo DEMO_COMMENTS =
      DemoCommentsSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_CALL_WITHOUT_PARAM' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCallWithoutParamSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCallWithoutParamSoyTemplateInfo DEMO_CALL_WITHOUT_PARAM =
      DemoCallWithoutParamSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoCallWithParamSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoCallWithParamSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_LINE_JOINING' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoLineJoiningSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoLineJoiningSoyTemplateInfo DEMO_LINE_JOINING =
      DemoLineJoiningSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoAutoescapeTrueSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoAutoescapeTrueSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_IF' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoIfSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoIfSoyTemplateInfo DEMO_IF =
      DemoIfSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoCallWithoutParamSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoCallWithoutParamSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_EXPRESSIONS' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoExpressionsSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoExpressionsSoyTemplateInfo DEMO_EXPRESSIONS =
      DemoExpressionsSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoMsgSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoMsgSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_SWITCH' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoSwitchSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoSwitchSoyTemplateInfo DEMO_SWITCH =
      DemoSwitchSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_AUTOESCAPE_TRUE' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoAutoescapeTrueSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoAutoescapeTrueSoyTemplateInfo DEMO_AUTOESCAPE_TRUE =
      DemoAutoescapeTrueSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoPrintSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoPrintSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoBidiSupportSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoBidiSupportSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoDoubleBracesSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoDoubleBracesSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_FOR' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoForSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoForSoyTemplateInfo DEMO_FOR =
      DemoForSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoForSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoForSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_BIDI_SUPPORT' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoBidiSupportSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoBidiSupportSoyTemplateInfo DEMO_BIDI_SUPPORT =
      DemoBidiSupportSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_CALL_WITH_PARAM_BLOCK' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCallWithParamBlockSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCallWithParamBlockSoyTemplateInfo DEMO_CALL_WITH_PARAM_BLOCK =
      DemoCallWithParamBlockSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_FOR_RANGE' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoForRangeSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoForRangeSoyTemplateInfo DEMO_FOR_RANGE =
      DemoForRangeSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_CALL_WITH_PARAM' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoCallWithParamSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoCallWithParamSoyTemplateInfo DEMO_CALL_WITH_PARAM =
      DemoCallWithParamSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoExpressionsSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoExpressionsSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_PRINT' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoPrintSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoPrintSoyTemplateInfo DEMO_PRINT =
      DemoPrintSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DemoForRangeSoyTemplateInfo' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
   */
  @Deprecated
  public static final class DemoForRangeSoyTemplateInfo extends SoyTemplateInfo {

    /** This template's full name. */
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_MSG' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoMsgSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoMsgSoyTemplateInfo DEMO_MSG =
      DemoMsgSoyTemplateInfo.getInstance();

```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'DEMO_RAW_TEXT_COMMANDS' is still used
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
  /** Same as DemoRawTextCommandsSoyTemplateInfo.getInstance(). */
  @Deprecated
  public static final DemoRawTextCommandsSoyTemplateInfo DEMO_RAW_TEXT_COMMANDS =
      DemoRawTextCommandsSoyTemplateInfo.getInstance();

```

## RuleId[ruleID=OptionalContainsCollection]
### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableListMultimap`
in `java/src/com/google/template/soy/css/CssRegistry.java`
#### Snippet
```java
  abstract ImmutableMap<String, String> filePathToSymbol();

  abstract Optional<ImmutableListMultimap<String, String>> classMap();

  abstract ImmutableMap<String, String> classToFilePathMap();
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableMap`>
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
    abstract Supplier<Expression> record();

    abstract Optional<ImmutableMap<CallParamNode, Supplier<Expression>>> explicit();
  }

```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableMap`>
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
    static RecordOrPositional create(
        Supplier<Expression> record,
        Optional<ImmutableMap<CallParamNode, Supplier<Expression>>> explicit) {
      return new AutoValue_SoyNodeCompiler_RecordOrPositional(record, explicit);
    }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableList`
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java

    /** Tracks all the nodes that should replace the current node. */
    private Optional<ImmutableList<StandaloneNode>> replacements = Optional.empty();

    RewritingVisitor(IdGenerator idGenerator) {
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableList`
in `java/src/com/google/template/soy/exprtree/MethodCallNode.java`
#### Snippet
```java

  @Override
  public Optional<ImmutableList<Point>> getCommaLocations() {
    return Optional.empty();
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableList`
in `java/src/com/google/template/soy/exprtree/ExprNode.java`
#### Snippet
```java

    /** The source positions of commas. Sometimes available to aid the formatter. */
    Optional<ImmutableList<Point>> getCommaLocations();

    /** The ordered list of parameter values. */
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableList`
in `java/src/com/google/template/soy/exprtree/ListLiteralNode.java`
#### Snippet
```java
public final class ListLiteralNode extends AbstractParentExprNode {

  private final Optional<ImmutableList<SourceLocation.Point>> commaLocations;

  /** @param items The expressions for the items in this list. */
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableList`
in `java/src/com/google/template/soy/exprtree/ListLiteralNode.java`
#### Snippet
```java
  }

  public Optional<ImmutableList<SourceLocation.Point>> getCommaLocations() {
    return commaLocations;
  }
```

### RuleId[ruleID=OptionalContainsCollection]
'Optional' contains collection `ImmutableList`
in `java/src/com/google/template/soy/exprtree/FunctionNode.java`
#### Snippet
```java

  @Override
  public Optional<ImmutableList<SourceLocation.Point>> getCommaLocations() {
    return Optional.ofNullable(commaLocations);
  }
```

## RuleId[ruleID=Convert2MethodRef]
### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/SoyHeaderCompiler.java`
#### Snippet
```java
                // This shouldn't really happen due to the ValidateRequiredCssPass but that pass
                // doesn't run in the open source build
                .filter(f -> f != null)
                .collect(toList()))
        .addAllCssClassNames(cssClassNames)
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jssrc/dsl/TsxPrintNode.java`
#### Snippet
```java

    private CommandChar(Optional<String> charContents, boolean endLineAfterChar) {
      super(charContents.map(c -> StringLiteral.create(c)));
      this.endLineAfterChar = endLineAfterChar;
    }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jssrc/internal/GenJsTemplateBodyVisitor.java`
#### Snippet
```java
      // does it make sense to store this in a variable?
      limitInitializer = listVar.dotAccess("length");
      getDataItemFunction = index -> listVar.bracketAccess(index);
    }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
  protected PyExpr visitListLiteralNode(ListLiteralNode node) {
    return PyExprUtils.convertIterableToPyListExpr(
        node.getChildren().stream().map(n -> visit(n)).collect(Collectors.toList()));
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
            .map(TemplateBasicNode.class::cast)
            .map(TemplateBasicNode::moddedSoyNamespace)
            .filter(t -> t != null)
            .findFirst();
    if (mods.isPresent()) {
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
                                        Stream.of(node.getCalleeName()),
                                        metadata.templateType().getActualParameters().stream()
                                            .map(p -> p.getName()))
                                    .toArray(Object[]::new));
                          }
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
      paramNames.addAll(
          template.templateType().getActualParameters().stream()
              .map(p -> p.getName())
              .collect(toList()));
    } else {
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
    namespaces.addAll(templateNode.getParent().getRequiredCssNamespaces());
    templateNode.getParent().getRequiredCssPaths().stream()
        .map(p -> p.getNamespace())
        .filter(p -> p != null)
        .forEach(namespaces::add);
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
    templateNode.getParent().getRequiredCssPaths().stream()
        .map(p -> p.getNamespace())
        .filter(p -> p != null)
        .forEach(namespaces::add);
    namespaces.addAll(templateNode.getRequiredCssNamespaces());
```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    }
    return map.recordAsMap().entrySet().stream()
        .collect(toImmutableMap(e -> e.getKey(), e -> SoyValueUnconverter.unconvert(e.getValue())));
  }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/plugin/java/internal/CompiledJarsPluginSignatureReader.java`
#### Snippet
```java
      this.methods =
          builder.methodsBuilder.entrySet().stream()
              .collect(toImmutableMap(e -> e.getKey(), e -> e.getValue().build()));
    }

```

### RuleId[ruleID=Convert2MethodRef]
Lambda can be replaced with method reference
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
        @Override
        public ImmutableList<? extends TypeNode> visit(RecordTypeNode node) {
          return node.properties().stream().map(p -> p.type()).collect(toImmutableList());
        }

```

## RuleId[ruleID=JavaReflectionMemberAccess]
### RuleId[ruleID=JavaReflectionMemberAccess]
Cannot resolve method 'defineClass'
in `java/src/com/google/template/soy/jbcsrc/shared/SaveStateMetaFactory.java`
#### Snippet
```java
    try {
      // try to find the defineClass method which is only defined in jdk9+
      Method defineClass = MethodHandles.Lookup.class.getMethod("defineClass", byte[].class);
      impl = (lookup, name, bytes) -> (Class<?>) defineClass.invoke(lookup, bytes);
    } catch (NoSuchMethodException nsme) {
```

## RuleId[ruleID=NonSerializableFieldInSerializableClass]
### RuleId[ruleID=NonSerializableFieldInSerializableClass]
Non-serializable field 'srcLoc' in a Serializable class
in `java/src/com/google/template/soy/parsepasses/contextautoesc/SoyAutoescapeException.java`
#### Snippet
```java

  /** The location in the soy file at which the error occurred. */
  private final SourceLocation srcLoc;

  /** The name of the template with the syntax error if any. */
```

## RuleId[ruleID=AbstractMethodCallInConstructor]
### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getLineCommentSyntax()` during object construction
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java

  /** A line that follows the rest of the generated code. */
  public final String generatedCodeEndMarker = getLineCommentSyntax() + " END GENERATED CODE";

  /**
```

### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `getLineCommentSyntax()` during object construction
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
  /** A line that precedes the rest of the generated code. */
  public final String generatedCodeStartMarker =
      getLineCommentSyntax() + " START GENERATED CODE FOR ESCAPERS.";

  /** A line that follows the rest of the generated code. */
```

### RuleId[ruleID=AbstractMethodCallInConstructor]
Call to 'abstract' method `defineEscapes()` during object construction
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java

      this.valueFilter = valueFilter;
      this.escapes = defineEscapes();

      // Now create the maps used by the escape methods.  The below depends on defineEscapes()
```

## RuleId[ruleID=ProtectedMemberInFinalClass]
### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `java/src/com/google/template/soy/pysrc/internal/GenPyCodeVisitor.java`
#### Snippet
```java
  @VisibleForTesting final GenPyExprsVisitorFactory genPyExprsVisitorFactory;

  @VisibleForTesting protected GenPyExprsVisitor genPyExprsVisitor;

  private final GenPyCallExprVisitor genPyCallExprVisitor;
```

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `java/src/com/google/template/soy/pysrc/internal/GenPyCodeVisitor.java`
#### Snippet
```java

  /** @see LocalVariableStack */
  @VisibleForTesting protected LocalVariableStack localVarExprs;

  private static final SoyErrorKind DELEGATE_TEMPLATES_UNSUPPORTED =
```

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `java/src/com/google/template/soy/pysrc/internal/GenPyCodeVisitor.java`
#### Snippet
```java
  private final FileSetMetadata fileSetMetadata;

  @VisibleForTesting protected PyCodeBuilder pyCodeBuilder;

  private final IsComputableAsPyExprVisitor isComputableAsPyExprVisitor;
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `idx`
in `java/src/com/google/template/soy/msgs/restricted/RenderOnlySoyMsgBundleImpl.java`
#### Snippet
```java
      for (;
          (idx < sortedMsgs.size()) && (bucketOf(sortedMsgs.get(idx).getId()) == bucket);
          idx++) {}
    }
    bucketBoundaries[numBuckets] = sortedMsgs.size();
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `java/src/com/google/template/soy/jssrc/restricted/JsExprUtils.java`
#### Snippet
```java
        // can be an apostrophe, which is all we really care about. Nor do we check that the escape
        // doesn't include the final apostrophe, since that would mean the JS expression is invalid.
        ++i;
      }
    }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java
          List<? extends C> typedReplacements = (List<? extends C>) replacements.get();
          parent.addChildren(i, typedReplacements);
          i += replacements.get().size() - 1;
          replacements = Optional.empty();
        }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
        }
        // jump ahead to just after the close tag
        i = template.getChildIndex(closeTag);
        openTag = ((HtmlOpenTagNode) child);
      } else if (openTag == null && child instanceof VeLogNode) {
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
          // look for \n as the next char to handled both \r and \r\n
          if (i + 1 < text.length() && text.charAt(i + 1) == '\n') {
            i++;
          }
          line++;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `codePoint`
in `java/src/com/google/template/soy/basicdirectives/BasicDirectivesRuntime.java`
#### Snippet
```java
    String processString(String str) {
      for (int codePoint, i = 0, n = str.length(); i < n; i += Character.charCount(codePoint)) {
        codePoint = str.codePointAt(i);
        processOneCodePoint(codePoint);
      }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `i`
in `java/src/com/google/template/soy/incrementaldomsrc/RemoveUnnecessaryEscapingDirectives.java`
#### Snippet
```java
        ImmutableList.Builder<SoyPrintDirective> builder = ImmutableList.builder();
        builder.addAll(escapingDirectives.subList(0, i));
        for (; i < escapingDirectives.size(); i++) {
          directive = escapingDirectives.get(i);
          if (!canSkip(directive)) {
```

## RuleId[ruleID=InnerClassMayBeStatic]
### RuleId[ruleID=InnerClassMayBeStatic]
Inner class `HtmlStack` may be 'static'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
   * traversal of the HTML Matcher Graph.
   */
  class HtmlStack {
    final HtmlOpenTagNode tagNode;
    final int foreignContentTagDepth;
```

## RuleId[ruleID=RegExpUnexpectedAnchor]
### RuleId[ruleID=RegExpUnexpectedAnchor]
Anchor `$` in unexpected position
in `java/src/com/google/template/soy/msgs/internal/IcuSyntaxUtils.java`
#### Snippet
```java
  // Note: Need to escape hash char in regex due to Pattern.COMMENTS.
  private static final Pattern ICU_SYNTAX_CHAR_NEEDING_ESCAPE_PATTERN =
      Pattern.compile(" ' (?= ['{}\\#] ) | ' $ | [{}] ", Pattern.COMMENTS);

  /** Map from ICU syntax char to its escape sequence. */
```

### RuleId[ruleID=RegExpUnexpectedAnchor]
Anchor `^` in unexpected position
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Pattern for an all-upper-case word in a file name or identifier. */
  private static final Pattern ALL_UPPER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [A-Z]+  (?= [^A-Za-z] | $)", Pattern.COMMENTS);

  /** Pattern for an all-lower-case word in a file name or identifier. */
```

### RuleId[ruleID=RegExpUnexpectedAnchor]
Anchor `^` in unexpected position
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  // Note: Char after an all-lower word can be an upper letter (e.g. first word of camel case).
  private static final Pattern ALL_LOWER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [a-z]+  (?= [^a-z] | $)", Pattern.COMMENTS);

  /** Pattern for a character that's not a letter nor a digit. */
```

## RuleId[ruleID=RegExpRepeatedSpace]
### RuleId[ruleID=RegExpRepeatedSpace]
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Pattern for an all-upper-case word in a file name or identifier. */
  private static final Pattern ALL_UPPER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [A-Z]+  (?= [^A-Za-z] | $)", Pattern.COMMENTS);

  /** Pattern for an all-lower-case word in a file name or identifier. */
```

### RuleId[ruleID=RegExpRepeatedSpace]
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Pattern for an all-upper-case word in a file name or identifier. */
  private static final Pattern ALL_UPPER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [A-Z]+  (?= [^A-Za-z] | $)", Pattern.COMMENTS);

  /** Pattern for an all-lower-case word in a file name or identifier. */
```

### RuleId[ruleID=RegExpRepeatedSpace]
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  // Note: Char after an all-lower word can be an upper letter (e.g. first word of camel case).
  private static final Pattern ALL_LOWER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [a-z]+  (?= [^a-z] | $)", Pattern.COMMENTS);

  /** Pattern for a character that's not a letter nor a digit. */
```

### RuleId[ruleID=RegExpRepeatedSpace]
2 consecutive spaces in RegExp
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  // Note: Char after an all-lower word can be an upper letter (e.g. first word of camel case).
  private static final Pattern ALL_LOWER_WORD =
      Pattern.compile("(?<= [^A-Za-z] | ^)  [a-z]+  (?= [^a-z] | $)", Pattern.COMMENTS);

  /** Pattern for a character that's not a letter nor a digit. */
```

## RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
### RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
Local variable `fieldName` declared in one 'switch' branch and used in another
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
              assertNonNull);
        case HAS_PROTO_FIELD:
          String fieldName = BuiltinMethod.getProtoFieldNameFromMethodCall(methodCallNode);
          FieldAccess fieldAccess =
              genCodeForMaybeUnion(
```

### RuleId[ruleID=SwitchStatementWithConfusingDeclaration]
Local variable `fieldAccess` declared in one 'switch' branch and used in another
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
        case HAS_PROTO_FIELD:
          String fieldName = BuiltinMethod.getProtoFieldNameFromMethodCall(methodCallNode);
          FieldAccess fieldAccess =
              genCodeForMaybeUnion(
                  baseType,
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  @SuppressWarnings("deprecation")
  @Deprecated
  public List<String> compileToJsSrc(
      SoyJsSrcOptions jsSrcOptions, @Nullable SoyMsgBundle msgBundle) {
    return compileToJsSrcInternal(jsSrcOptions, msgBundle);
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
     */
    @SuppressWarnings("fallthrough")
    Dir estimateDirectionByWordCount() {
      charIndex = 0;
      ltrWordCount = 0;
```

### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
        new IndirectParamsCalculator(fileSetMetadata).calculateIndirectParams(node);

    @SuppressWarnings("ConstantConditions") // for IntelliJ
    String upperUnderscoreName = convertToUpperUnderscore(node.getLocalTemplateSymbol());
    String templateInfoClassName =
        CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, upperUnderscoreName)
```

## RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'registry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    static ParseResult create(
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      return new ParseResult(soyTree, registry, cssRegistry);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      return new ParseResult(soyTree, registry, cssRegistry);
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    private final Optional<FileSetMetadata> registry;

    private final Optional<CssRegistry> cssRegistry;

    static ParseResult create(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'registry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    ParseResult(
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      this.soyTree = soyTree;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
        SoyFileSetNode soyTree,
        Optional<FileSetMetadata> registry,
        Optional<CssRegistry> cssRegistry) {
      this.soyTree = soyTree;
      this.registry = registry;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'registry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java

    /** The TemplateRegistry, which is guaranteed to be present if the error reporter is empty. */
    private final Optional<FileSetMetadata> registry;

    private final Optional<CssRegistry> cssRegistry;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSetParser.java`
#### Snippet
```java
    public abstract Builder setTypeRegistry(SoyTypeRegistry typeRegistry);

    public abstract Builder setCssRegistry(Optional<CssRegistry> cssRegistry);

    public abstract SoyFileSetParser build();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'srcJarTarget'
in `java/src/com/google/template/soy/SoyToJbcSrcCompiler.java`
#### Snippet
```java
   *     be useful for enabling IDE debugging scenarios.
   */
  public static void compile(SoyFileSet sfs, ByteSink jarTarget, Optional<ByteSink> srcJarTarget)
      throws IOException {
    // compileToJar disallows external calls so we don't need to enforce the external call
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'resourceOutput'
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java
  private final SoyTypeRegistry typeRegistry;
  private final CharSink output;
  private final Optional<ByteSink> resourceOutput;

  public VeMetadataGenerator(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'resourceOutput'
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java
        ExtensionRegistry registry,
        CharSink output,
        Optional<ByteSink> resourceOutput)
        throws IOException;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'resourceOutput'
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java
      SoyTypeRegistry typeRegistry,
      CharSink output,
      Optional<ByteSink> resourceOutput) {
    this.mode = mode;
    this.loggingConfigBytes = loggingConfigBytes;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'fileJoiner'
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java

  private final String extension;
  private final Optional<Joiner> fileJoiner;

  PerInputOutputFiles(String extension, @Nullable Joiner fileJoiner) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'placeholderExample'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgPlaceholderPart.java`
#### Snippet
```java

  /** @param placeholderExample An optional example. */
  public SoyMsgPlaceholderPart(String placeholderName, Optional<String> placeholderExample) {
    this(MessagePlaceholder.Summary.create(checkNotNull(placeholderName), placeholderExample));
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalLong` used as type for field 'alternateId'
in `java/src/com/google/template/soy/msgs/restricted/SoyMsg.java`
#### Snippet
```java
  public static final class Builder {
    private long id;
    private OptionalLong alternateId = OptionalLong.empty();
    @Nullable private String localeString;
    @Nullable private String meaning;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'snippet'
in `java/src/com/google/template/soy/error/SoyError.java`
#### Snippet
```java
      SoyErrorKind kind,
      String message,
      Optional<String> snippet,
      boolean isWarning) {
    return new AutoValue_SoyError(location, kind, message, snippet, isWarning);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'expr'
in `java/src/com/google/template/soy/jssrc/dsl/TsxPrintNode.java`
#### Snippet
```java
  }

  private TsxPrintNode(Optional<Expression> expr) {
    this.expr = expr;
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'charContents'
in `java/src/com/google/template/soy/jssrc/dsl/TsxPrintNode.java`
#### Snippet
```java
    }

    private CommandChar(Optional<String> charContents, boolean endLineAfterChar) {
      super(charContents.map(c -> StringLiteral.create(c)));
      this.endLineAfterChar = endLineAfterChar;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'charContents'
in `java/src/com/google/template/soy/jssrc/dsl/TsxPrintNode.java`
#### Snippet
```java
    }

    private CommandChar(Optional<String> charContents) {
      this(charContents, /* endLineAfterChar= */ false);
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'expr'
in `java/src/com/google/template/soy/jssrc/dsl/TsxPrintNode.java`
#### Snippet
```java
@Immutable
public class TsxPrintNode extends Statement {
  private final Optional<Expression> expr;

  public static TsxPrintNode create(Expression expr) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'outputDirectoryFlag'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java
  private final ImmutableMap<SourceFilePath, Path> inputToOutputFilePaths;

  private final Optional<Path> outputDirectoryFlag;

  /** The name of a manifest file to generate, or null. */
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outputDirectoryFlag'
in `java/src/com/google/template/soy/pysrc/SoyPySrcOptions.java`
#### Snippet
```java
      ImmutableMap<String, String> namespaceManifest,
      ImmutableMap<SourceFilePath, Path> inputToOutputFilePaths,
      Optional<Path> outputDirectoryFlag,
      String namespaceManifestFile) {
    this.runtimePath = runtimePath;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'outputDirectoryFlag'
in `java/src/com/google/template/soy/pysrc/internal/PySrcMain.java`
#### Snippet
```java
      Map<SourceFilePath, String> soyNamespaces,
      Map<SourceFilePath, Path> inputToOutputPaths,
      Optional<Path> outputDirectoryFlag,
      ErrorReporter errorReporter) {
    Map<String, String> manifest = new HashMap<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'dataType'
in `java/src/com/google/template/soy/types/VeType.java`
#### Snippet
```java
  private final Optional<String> dataType;

  private VeType(Optional<String> dataType) {
    this.dataType = dataType;
  }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'dataType'
in `java/src/com/google/template/soy/types/VeType.java`
#### Snippet
```java
  // This isn't a soyType to avoid triggering issues with strict deps and protos.  Not sure if that
  // makes sense though given imports.
  private final Optional<String> dataType;

  private VeType(Optional<String> dataType) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'matchingEndTag'
in `java/src/com/google/template/soy/jbcsrc/MsgCompiler.java`
#### Snippet
```java

    static PlaceholderAndEndTag create(
        PlaceholderCompiler.Placeholder placeholder, Optional<String> matchingEndTag) {
      return new AutoValue_MsgCompiler_PlaceholderAndEndTag(
          placeholder.soyValueProvider(),
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'expression'
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
  private Expression computeRangeValue(
      SyntheticVarName varName,
      Optional<ExprNode> expression,
      int defaultValue,
      Scope scope,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`>> used as type for parameter 'explicit'
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
    static RecordOrPositional create(
        Supplier<Expression> record,
        Optional<ImmutableMap<CallParamNode, Supplier<Expression>>> explicit) {
      return new AutoValue_SoyNodeCompiler_RecordOrPositional(record, explicit);
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'paramsRecord'
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
  private static final class TemplateVariables implements TemplateParameterLookup {
    private final TemplateVariableManager variableSet;
    private final Optional<? extends Expression> paramsRecord;
    private final Expression ijRecord;
    private final RenderContextExpression renderContext;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'paramsRecord'
in `java/src/com/google/template/soy/jbcsrc/TemplateCompiler.java`
#### Snippet
```java
    TemplateVariables(
        TemplateVariableManager variableSet,
        Optional<? extends Expression> paramsRecord,
        Expression ijRecord,
        RenderContextExpression renderContext) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'restore'
in `java/src/com/google/template/soy/jbcsrc/DetachState.java`
#### Snippet
```java
  @AutoValue
  abstract static class ReattachState {
    static ReattachState create(Label reattachPoint, Optional<Statement> restore) {
      return new AutoValue_DetachState_ReattachState(reattachPoint, restore);
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'value'
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
    abstract Builder setPositionalRenderMethod(Optional<MethodRef> value);

    abstract Builder setModifiableSelectMethod(Optional<MethodRef> value);

    abstract Builder setTemplateMethod(MethodRef value);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'value'
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
    abstract Builder setRenderMethod(MethodRef value);

    abstract Builder setPositionalRenderMethod(Optional<MethodRef> value);

    abstract Builder setModifiableSelectMethod(Optional<MethodRef> value);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'value'
in `java/src/com/google/template/soy/jbcsrc/CompiledTemplateMetadata.java`
#### Snippet
```java
    abstract Builder setTemplateMethod(MethodRef value);

    abstract Builder setDefaultModTemplateMethod(Optional<MethodRef> value);

    abstract Builder setTemplateType(TemplateType value);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'elseBlock'
in `java/src/com/google/template/soy/jbcsrc/ControlFlow.java`
#### Snippet
```java
   * if-elseif-else chain.
   */
  static Statement ifElseChain(final List<IfBlock> ifs, final Optional<Statement> elseBlock) {
    checkArgument(!ifs.isEmpty());
    return new Statement() {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
      boolean optimize,
      Set<SourceFilePath> generatedPathsToCheck,
      Optional<CssRegistry> cssRegistry,
      MethodChecker javaMethodChecker) {
    this.scopedData = apiCallScopeProvider;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'srcJarTarget'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
   * @throws SoyCompilationException If compilation fails.
   */
  void compileToJar(ByteSink jarTarget, Optional<ByteSink> srcJarTarget) {
    entryPointVoid(
        () -> {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
    private ImmutableList<File> pluginRuntimeJars = ImmutableList.of();

    private Optional<CssRegistry> cssRegistry = Optional.empty();

    private boolean skipPluginValidation = false;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
  private final ValidatedLoggingConfig loggingConfig;
  private final ImmutableList<File> pluginRuntimeJars;
  private final Optional<CssRegistry> cssRegistry;

  private final ImmutableList<SoyFunction> soyFunctions;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'resourceOutput'
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
      String generator,
      CharSink output,
      Optional<ByteSink> resourceOutput)
      throws IOException {
    new VeMetadataGenerator(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'delTemplateName'
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java

    // If this is a deltemplate then delTemplateName will be present
    final Optional<String> delTemplateName;
    final Optional<String> modName;
    final String variant;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'modName'
in `java/src/com/google/template/soy/jbcsrc/shared/CompiledTemplates.java`
#### Snippet
```java
    // If this is a deltemplate then delTemplateName will be present
    final Optional<String> delTemplateName;
    final Optional<String> modName;
    final String variant;

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'firstVarInstruction'
in `java/src/com/google/template/soy/jbcsrc/restricted/LocalVariable.java`
#### Snippet
```java

  /** Writes the value at the top of the stack to the local variable. */
  private Statement store(final Expression expr, final Optional<Label> firstVarInstruction) {
    expr.checkAssignableTo(resultType());
    return new Statement() {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'replacements'
in `java/src/com/google/template/soy/passes/DesugarHtmlNodesPass.java`
#### Snippet
```java

    /** Tracks all the nodes that should replace the current node. */
    private Optional<ImmutableList<StandaloneNode>> replacements = Optional.empty();

    RewritingVisitor(IdGenerator idGenerator) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'first'
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java
  }

  private boolean jsImplsEqual(Optional<JsImplNode> first, Optional<JsImplNode> second) {
    boolean moduleEquals = first.map(JsImplNode::module).equals(second.map(JsImplNode::module));
    boolean functionEquals =
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'second'
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java
  }

  private boolean jsImplsEqual(Optional<JsImplNode> first, Optional<JsImplNode> second) {
    boolean moduleEquals = first.map(JsImplNode::module).equals(second.map(JsImplNode::module));
    boolean functionEquals =
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'rootNode'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java
public final class HtmlMatcherGraph {

  private Optional<HtmlMatcherGraphNode> rootNode = Optional.empty();

  /** Pointer to where all new nodes are added in the graph. */
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'graphCursor'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java

  /** Pointer to where all new nodes are added in the graph. */
  private Optional<HtmlMatcherGraphNode> graphCursor = Optional.empty();

  private final ArrayDeque<Optional<HtmlMatcherGraphNode>> cursorStack = new ArrayDeque<>();
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'isInternallyBalanced'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java

  private Optional<Boolean> isInternallyBalancedForForeignContent = Optional.empty();
  private Optional<Boolean> isInternallyBalanced = Optional.empty();

  public HtmlMatcherConditionNode(SoyNode soyNode, ExprNode expression, HtmlMatcherGraph graph) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'isInternallyBalancedForForeignContent'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherConditionNode.java`
#### Snippet
```java
  @Nullable private HtmlMatcherGraphNode falseBranchNode = null;

  private Optional<Boolean> isInternallyBalancedForForeignContent = Optional.empty();
  private Optional<Boolean> isInternallyBalanced = Optional.empty();

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'registry'
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java

    @CanIgnoreReturnValue
    public Builder setCssRegistry(Optional<CssRegistry> registry) {
      this.cssRegistry = registry;
      return this;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/passes/PassManager.java`
#### Snippet
```java
    private ErrorReporter errorReporter;
    private SoyGeneralOptions options;
    private Optional<CssRegistry> cssRegistry = Optional.empty();
    private boolean allowUnknownGlobals;
    private boolean allowUnknownJsGlobals;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'conditional'
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
      Map<String, AttrParam> attrs,
      @Nullable CallParamContentNode attributesNode,
      Optional<ExprNode> conditional) {
    if (c.getKind() == SoyNode.Kind.HTML_ATTRIBUTE_NODE) {
      HtmlAttributeNode attrNode = (HtmlAttributeNode) c;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'condition'
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
      CallParamContentNode attributesNode,
      CallBasicNode call,
      Optional<ExprNode> condition) {
    SourceLocation unknown = attr.getSourceLocation().clearRange();

```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'conditional'
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java
  private static void maybePrintAttribute(
      CallParamContentNode attributesNode,
      Optional<ExprNode> conditional,
      IdGenerator nodeIdGen,
      HtmlAttributeNode attrNode) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalInt` used as type for parameter 'index'
in `java/src/com/google/template/soy/shared/internal/SharedRuntime.java`
#### Snippet
```java

  public static void checkMapFromListConstructorCondition(
      boolean condition, SoyValue list, OptionalInt index) {
    if (!condition) {
      String exceptionString =
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'INVALID_NODE'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
  private static final String EXPECTED_TAG_NAME = "Expected an html tag name.";

  private static final Optional<HtmlTagNode> INVALID_NODE = Optional.empty();

  private final ErrorReporter errorReporter;
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'maybeNode'
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java

  private QueuedTask visit(
      Optional<HtmlMatcherGraphNode> maybeNode,
      Map<ExprEquivalence.Wrapper, Boolean> exprValueMap,
      HtmlStack stack) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'example'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
  }

  public static MessagePlaceholder create(String name, Optional<String> example) {
    return new AutoValue_MessagePlaceholder(
        Summary.create(name, example),
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'example'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
    }

    public static Summary create(String name, Optional<String> example) {
      return new AutoValue_MessagePlaceholder_Summary(name, example);
    }
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'example'
in `java/src/com/google/template/soy/soytree/MessagePlaceholder.java`
#### Snippet
```java
      String userSuppliedName,
      SourceLocation userSuppliedNameLocation,
      Optional<String> example) {
    return new AutoValue_MessagePlaceholder(
        Summary.create(name, example),
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`OptionalLong` used as type for field 'alternateId'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The optional alternate id value, to be used if a translation for the msg id is missing. */
  private final OptionalLong alternateId;

  public MsgNode(
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'alternateIdAttribute'
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  /** The optional alternate id attribute to be used if a translation for the msg id is missing. */
  private final Optional<CommandTagAttribute> alternateIdAttribute;

  /** The optional alternate id value, to be used if a translation for the msg id is missing. */
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'commandChar'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
      int id,
      String rawText,
      Optional<CommandChar> commandChar,
      SourceLocation sourceLocation,
      @Nullable SourceOffsets offsets,
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'commandChar'
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java

  // For COMMAND_CHARACTER nodes only. The character this node represents (e.g. "{sp}" or "{nbsp}").
  private final Optional<CommandChar> commandChar;

  /** Whether this raw text was created from the {literal} command. */
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'cssRegistry'
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
  private boolean desugarHtmlNodes = true;
  private boolean desugarIdomFeatures = true;
  private Optional<CssRegistry> cssRegistry = Optional.empty();
  // TODO(lukes): disabled for compatibility with unit tests.  Fix tests relying on the
  // escaper not running and enable by default.  This configuration bit only really exists
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`> used as type for field 'commaLocations'
in `java/src/com/google/template/soy/exprtree/ListLiteralNode.java`
#### Snippet
```java
public final class ListLiteralNode extends AbstractParentExprNode {

  private final Optional<ImmutableList<SourceLocation.Point>> commaLocations;

  /** @param items The expressions for the items in this list. */
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'onPass'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java
    final Optional<Runnable> onPass;

    CheckResult(boolean result, Optional<Runnable> onPass) {
      this.result = result;
      this.onPass = checkNotNull(onPass);
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for field 'onPass'
in `java/src/com/google/template/soy/sharedpasses/render/TofuTypeChecks.java`
#### Snippet
```java

    final boolean result;
    final Optional<Runnable> onPass;

    CheckResult(boolean result, Optional<Runnable> onPass) {
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional` used as type for parameter 'boundParams'
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java

  private void visitCallNodeHelper(
      CallNode node, TemplateNode callee, Optional<SoyRecord> boundParams) {

    // ------ Build the call data. ------
```

### RuleId[ruleID=OptionalUsedAsFieldOrParameterType]
`Optional`>> used as type for parameter 'positionalParameters'
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
      CallNode callNode,
      TranslateExprNodeVisitor exprTranslator,
      Optional<Supplier<List<Expression>>> positionalParameters,
      Supplier<Expression> paramObject,
      boolean isIdomCall) {
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java

  final void runMain(String... args) {
    int status = run(args, System.err);
    System.exit(status);
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
        warningSink.append(formatted);
      } catch (IOException ioe) {
        System.err.println("error while printing warnings");
        ioe.printStackTrace();
      }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
        @Override
        protected final void doAppend(CharSequence csq) throws IOException {
          System.out.append(csq);
        }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
        @Override
        protected final void doAppend(CharSequence csq, int start, int end) throws IOException {
          System.out.append(csq, start, end);
        }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
            val = directive.apply(val);
          }
          System.out.append(val);
        }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
        @Override
        protected final void doAppend(char c) throws IOException {
          System.out.append(c);
        }

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
    super.execute();
    if (output == null) {
      System.err.println(
          "Please add an <output> for the <" + getTaskName() + "> at " + this.getLocation());
      return;
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
        }
      } catch (IOException ex) {
        System.err.println("Failed to read " + input.file);
        ex.printStackTrace();
        return;
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
  private static void writeExampleHeader() {
    numExamples++;
    System.out.println("----------------------------------------------------------------");
    System.out.println("[" + numExamples + "]");
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    numExamples++;
    System.out.println("----------------------------------------------------------------");
    System.out.println("[" + numExamples + "]");
  }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    // Example 1.
    writeExampleHeader();
    System.out.println(tofu.newRenderer("soy.examples.simple.helloWorld").render());

    // Create a namespaced tofu object to make calls more concise.
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    // Example 2.
    writeExampleHeader();
    System.out.println(
        simpleTofu.newRenderer(".helloName").setData(ImmutableMap.of("name", "Ana")).render());

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/SimpleUsage.java`
#### Snippet
```java
    // Example 3.
    writeExampleHeader();
    System.out.println(
        simpleTofu
            .newRenderer(".helloNames")
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
  private void writeExampleHeader(String exampleName) {
    numExamples++;
    System.out.println(
        "--------------------------------------------------------------------------------");
    System.out.printf("[%d. %s]\n", numExamples, exampleName);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    System.out.println(
        "--------------------------------------------------------------------------------");
    System.out.printf("[%d. %s]\n", numExamples, exampleName);
  }
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    } catch (CmdLineException cle) {
      System.err.println("\nError: " + cle.getMessage() + "\n\n");
      System.err.println(USAGE_PREFIX);
      cmdLineParser.printUsage(System.err);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    } catch (CmdLineException cle) {
      System.err.println("\nError: " + cle.getMessage() + "\n\n");
      System.err.println(USAGE_PREFIX);
      cmdLineParser.printUsage(System.err);
      System.exit(1);
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
      System.err.println("\nError: " + cle.getMessage() + "\n\n");
      System.err.println(USAGE_PREFIX);
      cmdLineParser.printUsage(System.err);
      System.exit(1);
    }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoComments");
    System.out.println(tofu.newRenderer(DEMO_COMMENTS).setMsgBundle(msgBundle).render());

    writeExampleHeader("demoLineJoining");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoLineJoining");
    System.out.println(tofu.newRenderer(DEMO_LINE_JOINING).setMsgBundle(msgBundle).render());

    writeExampleHeader("demoRawTextCommands");
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoRawTextCommands");
    System.out.println(
        tofu.newRenderer(DEMO_RAW_TEXT_COMMANDS).setMsgBundle(msgBundle).renderText());

```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoPrint");
    System.out.println(
        tofu.newRenderer(DEMO_PRINT)
            .setData(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoAutoescapeTrue");
    System.out.println(
        tofu.newRenderer(DEMO_AUTOESCAPE_TRUE)
            .setData(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoMsg");
    System.out.println(
        tofu.newRenderer(DEMO_MSG)
            .setData(ImmutableMap.of(DemoMsgSoyTemplateInfo.NAME, "Ed"))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoIf");
    System.out.println(
        tofu.newRenderer(DEMO_IF)
            .setData(ImmutableMap.of("pi", 3.14159))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_IF)
            .setData(ImmutableMap.of("pi", 2.71828))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_IF)
            .setData(ImmutableMap.of("pi", 1.61803))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoSwitch");
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Fay"))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Go"))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Hal"))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            .setMsgBundle(msgBundle)
            .render());
    System.out.println(
        tofu.newRenderer(DEMO_SWITCH)
            .setData(ImmutableMap.of("name", "Ivy"))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            ImmutableMap.of("name", "Lex", "numWaffles", 1),
            ImmutableMap.of("name", "Mel", "numWaffles", 2));
    System.out.println(
        tofu.newRenderer(DEMO_FOR)
            .setData(ImmutableMap.of(DemoForSoyTemplateInfo.PERSONS, persons))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoFor_Range");
    System.out.println(
        tofu.newRenderer(DEMO_FOR_RANGE)
            .setData(ImmutableMap.of(DemoForRangeSoyTemplateInfo.NUM_LINES, 3))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoCallWithoutParam");
    System.out.println(
        tofu.newRenderer(DEMO_CALL_WITHOUT_PARAM)
            .setData(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoCallWithParam");
    System.out.println(
        tofu.newRenderer(DEMO_CALL_WITH_PARAM)
            .setData(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoCallWithParamBlock");
    System.out.println(
        tofu.newRenderer(DEMO_CALL_WITH_PARAM_BLOCK)
            .setData(ImmutableMap.of(DemoCallWithParamBlockSoyTemplateInfo.NAME, "Quo"))
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
            ImmutableMap.of("name", "Tim", "major", "Engineering", "year", 2005),
            ImmutableMap.of("name", "Uma", "major", "Biology", "year", 1972));
    System.out.println(
        tofu.newRenderer(DEMO_EXPRESSIONS)
            .setData(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java

    writeExampleHeader("demoDoubleBraces");
    System.out.println(
        tofu.newRenderer(DEMO_DOUBLE_BRACES)
            .setData(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/examples/FeaturesUsage.java`
#### Snippet
```java
    // this really in action, run the Javascript example.
    writeExampleHeader("demoBidiSupport");
    System.out.println(
        tofu.newRenderer(DEMO_BIDI_SUPPORT)
            .setData(
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
      stateTransitionPoint = checkNotNull(point);
      if (DEBUG) {
        System.err.println(
            point.asLocation(filePath) + "\tState: " + s.name() + " errors: " + errorReporter);
      }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
  @Override
  protected void visitLogNode(LogNode node) {
    renderBlock(node, System.out);
    System.out.println(); // add a newline
  }
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
  protected void visitLogNode(LogNode node) {
    renderBlock(node, System.out);
    System.out.println(); // add a newline
  }

```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  FormattingContext appendForeignCode(String stuff) {
    stuff = stuff.replaceAll("\n", "\n" + curIndent);
    append(stuff);
    return this;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/dsl/StringLiteral.java`
#### Snippet
```java
    // </script in a JavaScript string will end the current script tag in most browsers. Escape the
    // forward slash in the string to get around this issue.
    return escaped.replace("</script", "<\\/script");
  }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
        javaPattern
            .pattern()
            .replace("\r", "\\r")
            .replace("\n", "\\n")
            .replace("\t", "\\t")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .pattern()
            .replace("\r", "\\r")
            .replace("\n", "\\n")
            .replace("\t", "\\t")
            .replace("\u0000", "\\u0000")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\r", "\\r")
            .replace("\n", "\\n")
            .replace("\t", "\\t")
            .replace("\u0000", "\\u0000")
            .replace("\u0020", "\\u0020")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\n", "\\n")
            .replace("\t", "\\t")
            .replace("\u0000", "\\u0000")
            .replace("\u0020", "\\u0020")
            .replace("\u2028", "\\u2028")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\t", "\\t")
            .replace("\u0000", "\\u0000")
            .replace("\u0020", "\\u0020")
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\u0000", "\\u0000")
            .replace("\u0020", "\\u0020")
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
            .replace("\\A", "^")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\u0020", "\\u0020")
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
            .replace("\\A", "^")
            .replace("\\z", "$")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
            .replace("\\A", "^")
            .replace("\\z", "$")
            .replaceAll("(?<!\\\\)(?:\\\\{2})*/", "\\\\/");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\u2029", "\\u2029")
            .replace("\\A", "^")
            .replace("\\z", "$")
            .replaceAll("(?<!\\\\)(?:\\\\{2})*/", "\\\\/");
    // Some features supported by Java are not supported by JavaScript such as lookbehind,
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jssrc/internal/GenerateSoyUtilsEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\\A", "^")
            .replace("\\z", "$")
            .replaceAll("(?<!\\\\)(?:\\\\{2})*/", "\\\\/");
    // Some features supported by Java are not supported by JavaScript such as lookbehind,
    // DOTALL, and unicode character classes.
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/GeneratePySanitizeEscapingDirectiveCode.java`
#### Snippet
```java
        javaPattern
            .pattern()
            .replace("\r", "\\r")
            .replace("\n", "\\n")
            .replace("\u2028", "\\u2028")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/GeneratePySanitizeEscapingDirectiveCode.java`
#### Snippet
```java
            .pattern()
            .replace("\r", "\\r")
            .replace("\n", "\\n")
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/GeneratePySanitizeEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\r", "\\r")
            .replace("\n", "\\n")
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
            .replace("\\z", "\\Z");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/GeneratePySanitizeEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\n", "\\n")
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
            .replace("\\z", "\\Z");
    // DOTALL is not allowed to keep the syntax simple (it's also not available in JavaScript).
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/GeneratePySanitizeEscapingDirectiveCode.java`
#### Snippet
```java
            .replace("\u2028", "\\u2028")
            .replace("\u2029", "\\u2029")
            .replace("\\z", "\\Z");
    // DOTALL is not allowed to keep the syntax simple (it's also not available in JavaScript).
    if ((javaPattern.flags() & Pattern.DOTALL) != 0) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/PySrcMain.java`
#### Snippet
```java
    for (SourceFilePath inputFilePath : inputToOutputPaths.keySet()) {
      String outputFilePath = inputToOutputPaths.get(inputFilePath).toString();
      String pythonPath = outputFilePath.replace(".py", "").replace('/', '.');

      String namespace = soyNamespaces.get(inputFilePath);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForIcuSection =
      str -> str.replace("'", "\\\'");
}

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForPyFormatString =
      str -> str.replaceAll("\\{", "{{").replaceAll("\\}", "}}").replace("'", "\\\'");

  /**
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForPyFormatString =
      str -> str.replaceAll("\\{", "{{").replaceAll("\\}", "}}").replace("'", "\\\'");

  /**
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/pysrc/internal/MsgFuncGenerator.java`
#### Snippet
```java
   */
  private static final Function<String, String> escaperForPyFormatString =
      str -> str.replaceAll("\\{", "{{").replaceAll("\\}", "}}").replace("'", "\\\'");

  /**
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    static String escapeHtml(String s) {
      // Note that "&" is not replaced because the translation can contain HTML entities.
      return s.replace("<", "&lt;");
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/passes/CheckTemplateCallsPass.java`
#### Snippet
```java
                node.getDelCalleeName(),
                CaseFormat.LOWER_UNDERSCORE.to(
                    CaseFormat.UPPER_CAMEL, defaultLocation.fileName().replaceAll(".soy$", "")),
                defaultLocation.path());
          }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/MainEntryPointUtils.java`
#### Snippet
```java

    if (locale != null) {
      path = path.replace("{LOCALE}", locale);
      path = path.replace("{LOCALE_LOWER_CASE}", locale.toLowerCase().replace('-', '_'));
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/MainEntryPointUtils.java`
#### Snippet
```java
    if (locale != null) {
      path = path.replace("{LOCALE}", locale);
      path = path.replace("{LOCALE_LOWER_CASE}", locale.toLowerCase().replace('-', '_'));
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/MainEntryPointUtils.java`
#### Snippet
```java

      // Substitute placeholders.
      path = path.replace("{INPUT_DIRECTORY}", directory);
      path = path.replace("{INPUT_FILE_NAME}", fileName);
      path = path.replace("{INPUT_FILE_NAME_NO_EXT}", fileNameNoExt);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/MainEntryPointUtils.java`
#### Snippet
```java
      // Substitute placeholders.
      path = path.replace("{INPUT_DIRECTORY}", directory);
      path = path.replace("{INPUT_FILE_NAME}", fileName);
      path = path.replace("{INPUT_FILE_NAME_NO_EXT}", fileNameNoExt);
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/MainEntryPointUtils.java`
#### Snippet
```java
      path = path.replace("{INPUT_DIRECTORY}", directory);
      path = path.replace("{INPUT_FILE_NAME}", fileName);
      path = path.replace("{INPUT_FILE_NAME_NO_EXT}", fileNameNoExt);
    }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/MainEntryPointUtils.java`
#### Snippet
```java

    // Remove redundant /'s if any placeholder representing a directory was empty.
    path = path.replace("//", "/");

    return path;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
    public void setPattern(String s) {
      // \Q starts a RegExp literal block, and \E ends one.
      String regex = "\\Q" + s.replace("*", "\\E\\w+\\Q") + "\\E";
      // E.g. "foo.*.bar" -> "\Qfoo.\E\w+\Q.bar\E"
      // which will match anything starting with the literal "foo.", then some identifier chars,
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterNormalizeRefreshUri(SoyValue value) {
    return filterNormalizeUri(value).replace(";", "%3B");
  }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Like {@link #filterNormalizeUri} but also escapes ';'. */
  public static String filterNormalizeRefreshUri(String value) {
    return filterNormalizeUri(value).replace(";", "%3B");
  }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Filters decimal and floating-point numbers. */
  public static String filterNumber(String value) {
    if (!value.matches("\\d*\\.?\\d+")) {
      return EscapingConventions.INNOCUOUS_OUTPUT;
    }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/soytree/JavaImplNode.java`
#### Snippet
```java
      return ImmutableList.of();
    }
    return ImmutableList.copyOf(Arrays.asList(val.split("\\s*,\\s*")));
  }

```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
    // Escape all @deprecated javadoc tags.
    // TODO(cushon): add this to the specification and then also generate @Deprecated annotations
    soyDoc = soyDoc.replace("@deprecated", "&#64;deprecated");

    // Strip start/end tokens and spaces (including newlines if they occupy their own lines).
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java

  private static String escapeWhitespaceForErrorPrinting(String s) {
    s = s.replace("\r", "\\r");
    s = s.replace("\n", "\\n");
    s = s.replace("\t", "\\t");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
  private static String escapeWhitespaceForErrorPrinting(String s) {
    s = s.replace("\r", "\\r");
    s = s.replace("\n", "\\n");
    s = s.replace("\t", "\\t");
    return s;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
    s = s.replace("\r", "\\r");
    s = s.replace("\n", "\\n");
    s = s.replace("\t", "\\t");
    return s;
  }
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
    do {
      type = newType;
      newType = type.replaceAll("<[^>]*>", "");
    } while (!newType.equals(type));
    return newType;
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
              // TODO(jcg): this should probably be a wildcard type
              ? "com.google.common.reflect.TypeToken.of(java.lang.Object.class)"
              : (genericType.matches("(\\.|\\w)+")
                  ? "com.google.common.reflect.TypeToken.of(" + genericType + ".class" + ")"
                  : "new com.google.common.reflect.TypeToken<" + genericType + ">() {}");
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitorAssistantForMsgs.java`
#### Snippet
```java
          if (msg.getEscapingMode() == EscapingMode.ESCAPE_HTML) {
            // Note that "&" is not replaced because the translation can contain HTML entities.
            s = s.replace("<", "&lt;");
          }
          RenderVisitor.append(master.getCurrOutputBufForUseByAssistants(), s);
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `java/src/com/google/template/soy/i18ndirectives/I18nUtils.java`
#### Snippet
```java
      return Locale.US;
    }
    String[] groups = localeString.split("[-_]");
    switch (groups.length) {
      case 1:
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
    }
    sfsBuilder.setCssRegistry(
        CssRegistry.create(ImmutableSet.of(), com.google.common.collect.ImmutableMap.of()));

    ImmutableList.Builder<MethodChecker> builder = ImmutableList.builder();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/logging/VeMetadataGenerator.java`
#### Snippet
```java
        checkState(!resourceOutput.isPresent());
        Function<LoggableElementMetadata, String> serializeFunction =
            (metadata) -> java.util.Arrays.toString(metadata.toByteArray());
        ImmutableMap<Long, String> veMetadatas =
            loggingConfig.getElementList().stream()
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.data` is unnecessary and can be removed
in `java/src/com/google/template/soy/data/SoyValueProvider.java`
#### Snippet
```java

  /**
   * Renders this value to the given {@link com.google.template.soy.data.LoggingAdvisingAppendable},
   * possibly partially.
   *
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary and can be removed
in `java/src/com/google/template/soy/data/internal/DictImpl.java`
#### Snippet
```java
 *
 * <p>This class exists because the Java rendering APIs do not have enough structure. When a user
 * requests a template to be rendered with a {@link java.util.Map} as part of its data (either
 * {@link com.google.template.soy.jbcsrc.api.SoySauce.Renderer#setData regular data} or {@link
 * com.google.template.soy.jbcsrc.api.SoySauce.Renderer#setIj injected data}), it is generally not
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.error` is unnecessary and can be removed
in `java/src/com/google/template/soy/error/ErrorReporterImpl.java`
#### Snippet
```java

/**
 * Simple {@link com.google.template.soy.error.ErrorReporter} implementation.
 */
final class ErrorReporterImpl extends ErrorReporter {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.exprtree` is unnecessary and can be removed
in `java/src/com/google/template/soy/jssrc/internal/SoyToJsVariableMappings.java`
#### Snippet
```java
 */
public final class SoyToJsVariableMappings {
  /** TODO(user): change the key type to {@link com.google.template.soy.exprtree.VarDefn}. */
  private final Map<String, Expression> mappings;

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.pysrc.restricted` is unnecessary and can be removed
in `java/src/com/google/template/soy/pysrc/restricted/SoyPySrcPrintDirective.java`
#### Snippet
```java
   * <p>Important note when implementing this method: The string value may not yet have been coerced
   * to a string. You may need to explicitly coerce it to a string expression using {@link
   * com.google.template.soy.pysrc.restricted.PyExpr#toPyString}.
   *
   * @param value The value to apply the directive on. This value may not yet have been coerced to a
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.jbcsrc.restricted` is unnecessary and can be removed
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java
   *
   * @param directives The directives. All are required to be {@link
   *     com.google.template.soy.jbcsrc.restricted.SoyJbcSrcPrintDirective.Streamable streamable}
   * @param appendable The appendable to wrap
   * @param basic The expression compiler to use for compiling the arguments
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.jbcsrc.restricted` is unnecessary and can be removed
in `java/src/com/google/template/soy/jbcsrc/PrintDirectives.java`
#### Snippet
```java
   *
   * @param directives The directives. All are required to be {@link
   *     com.google.template.soy.jbcsrc.restricted.SoyJbcSrcPrintDirective.Streamable streamable}
   * @param appendable The appendable to wrap
   * @param context The render context for the plugins
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `java/src/com/google/template/soy/jbcsrc/internal/InnerClasses.java`
#### Snippet
```java
   * Adds the data for an inner class.
   *
   * @throws java.lang.IllegalArgumentException if the class wasn't previous registered via {@link
   *     #registerInnerClass(String, int)} or {@link #registerInnerClassWithGeneratedName(String,
   *     int)}.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/jbcsrc/restricted/FieldRef.java`
#### Snippet
```java
  }

  public static FieldRef staticFieldReference(java.lang.reflect.Field field) {
    if (!Modifier.isStatic(field.getModifiers())) {
      throw new IllegalStateException("Field: " + field + " is not static");
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/jbcsrc/restricted/FieldRef.java`
#### Snippet
```java

  public static FieldRef staticFieldReference(Class<?> owner, String name) {
    java.lang.reflect.Field declaredField;
    try {
      declaredField = owner.getDeclaredField(name);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/jbcsrc/restricted/FieldRef.java`
#### Snippet
```java
    int modifiers = 0;
    try {
      java.lang.reflect.Field declaredField = owner.getDeclaredField(name);
      modifiers = declaredField.getModifiers();
      if (Modifier.isStatic(modifiers)) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.base.internal` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/passes/RewriteRemaindersPass.java`
#### Snippet
```java

  @Override
  public void run(SoyFileNode file, com.google.template.soy.base.internal.IdGenerator nodeIdGen) {
    new Visitor().exec(file);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.passes.htmlmatcher` is unnecessary and can be removed
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlMatcherGraph.java`
#### Snippet
```java

  /**
   * Returns the {@link com.google.template.soy.passes.htmlmatcher.HtmlMatcherGraphNode} at the
   * cursor.
   */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.objectweb.asm` is unnecessary and can be removed
in `java/src/com/google/template/soy/plugin/java/internal/CompiledJarsPluginSignatureReader.java`
#### Snippet
```java
        }
        try (InputStream in = jar.getInputStream(entry)) {
          ClassReader reader = new org.objectweb.asm.ClassReader(in);
          Visitor visitor = new Visitor();
          reader.accept(
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `java/src/com/google/template/soy/shared/restricted/SoyDeprecated.java`
#### Snippet
```java
 * <p>This will trigger warnings from the Soy compiler.
 *
 * <p>NOTE: don't use {@link java.lang.Deprecated} for a few reasons:
 *
 * <ol>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `java/src/com/google/template/soy/shared/restricted/SoyDeprecated.java`
#### Snippet
```java
 *       whereas in Java this is a more standardized and supported workflow.
 *   <li>It allows authors to distinguish between deprecated implementations (for which {@link
 *       java.lang.Deprecated} would be appropriate ) and deprecated Soy plugins (for which this
 *       annotation is appropriate.)
 *   <li>It requires an explicit opt-in to prevent author confusion by adding a new behavior to
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `java/src/com/google/template/soy/shared/restricted/SoyDeprecated.java`
#### Snippet
```java
 *       annotation is appropriate.)
 *   <li>It requires an explicit opt-in to prevent author confusion by adding a new behavior to
 *       {@link java.lang.Deprecated}.
 * </ul>
 */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy` is unnecessary and can be removed
in `java/src/com/google/template/soy/testing/SoyFileSetParserBuilder.java`
#### Snippet
```java
import javax.annotation.Nullable;

/** Fluent builder for configuring {@link com.google.template.soy.SoyFileSetParser}s in tests. */
public final class SoyFileSetParserBuilder {

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.template.soy.exprtree` is unnecessary and can be removed
in `java/src/com/google/template/soy/exprtree/AbstractLocalVarDefn.java`
#### Snippet
```java
 *
 * <p>NOTE: The reason for this base class is that the declaring node type can be either a {@link
 * com.google.template.soy.soytree.SoyNode} or an {@link com.google.template.soy.exprtree.ExprNode}:
 *
 * <p>Regular {@link com.google.template.soy.soytree.defn.LocalVar}s that are declared in a
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(EXAMPLE_NUM, ParamRequisiteness.REQUIRED)
              .put(EXAMPLE_NAME, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(NUM_LINES, ParamRequisiteness.REQUIRED)
              .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(NAME, ParamRequisiteness.REQUIRED)
              .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(NAME, ParamRequisiteness.REQUIRED)
              .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
        "features.soy",
        __NAMESPACE__,
        com.google.common.collect.ImmutableList.<SoyTemplateInfo>of(
            DEMO_COMMENTS,
            DEMO_LINE_JOINING,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(TITLE, ParamRequisiteness.REQUIRED)
              .put(AUTHOR, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(SET_NAME, ParamRequisiteness.REQUIRED)
              .put(SET_MEMBERS, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(PI, ParamRequisiteness.REQUIRED)
              .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(MESSAGE, ParamRequisiteness.REQUIRED)
              .put(LIST, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(STUDENTS, ParamRequisiteness.REQUIRED)
              .put(CURRENT_YEAR, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(NAME, ParamRequisiteness.REQUIRED)
              .put(COMPANION_NAME, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(PERSONS, ParamRequisiteness.REQUIRED)
              .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(NAME, ParamRequisiteness.REQUIRED)
              .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(ITALIC_HTML, ParamRequisiteness.REQUIRED)
              .build());
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(BOO, ParamRequisiteness.REQUIRED)
              .put(TWO, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `com.google.common.collect` is unnecessary and can be removed
in `java/src/com/google/template/soy/examples/FeaturesSoyInfo.java`
#### Snippet
```java
          __NAME__,
          __TEMPLATE_NAME__,
          com.google.common.collect.ImmutableMap.<String, ParamRequisiteness>builder()
              .put(NAME, ParamRequisiteness.REQUIRED)
              .put(TRIP_INFO, ParamRequisiteness.REQUIRED)
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
     * entity, advances over the whole tag/entity and returns an appropriate dirtype.
     *
     * @throws java.lang.IndexOutOfBoundsException if called when charIndex > length or <= 0.
     */
    @VisibleForTesting
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `java/src/com/google/template/soy/internal/i18n/BidiUtils.java`
#### Snippet
```java
     * appropriate dirtype.
     *
     * @throws java.lang.IndexOutOfBoundsException if called when charIndex >= length or < 0.
     */
    @VisibleForTesting
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/soyparse/SoySimpleCharStream.java`
#### Snippet
```java

  /** Constructor. */
  public SoySimpleCharStream(java.io.Reader dstream, int startline, int startcolumn) {
    this(dstream, startline, startcolumn, 4096);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/soyparse/SoySimpleCharStream.java`
#### Snippet
```java

  @Override
  public char readChar() throws java.io.IOException {
    char c = super.readChar();
    updateLineLengthsForNewChar();
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/soyparse/SoySimpleCharStream.java`
#### Snippet
```java

  /** Constructor. */
  public SoySimpleCharStream(java.io.Reader dstream) {
    this(dstream, 1, 1, 4096);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/soyparse/SoySimpleCharStream.java`
#### Snippet
```java
  /** Constructor. */
  public SoySimpleCharStream(
      java.io.Reader dstream, int startline, int startcolumn, int buffersize) {
    super(dstream, startline, startcolumn, buffersize);
  }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `java/src/com/google/template/soy/javagencode/javatypes/CodeGenUtils.java`
#### Snippet
```java
    private final String name;

    private MethodImpl(java.lang.reflect.Method method, boolean qualified) {
      this.name = (qualified ? method.getDeclaringClass().getName() + "." : "") + method.getName();
    }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `javax.annotation` is unnecessary, and can be replaced with an import
in `java/src/com/google/template/soy/parsepasses/contextautoesc/package-info.java`
#### Snippet
```java
 * com.google.template.soy.parsepasses.contextautoesc.ContextualAutoescaper}.
 */
@javax.annotation.ParametersAreNonnullByDefault
package com.google.template.soy.parsepasses.contextautoesc;

```

## RuleId[ruleID=ThrowablePrintStackTrace]
### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
      } catch (IOException ioe) {
        System.err.println("error while printing warnings");
        ioe.printStackTrace();
      }
    } else {
```

### RuleId[ruleID=ThrowablePrintStackTrace]
Call to `printStackTrace()` should probably be replaced with more robust logging
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
      } catch (IOException ex) {
        System.err.println("Failed to read " + input.file);
        ex.printStackTrace();
        return;
      }
```

## RuleId[ruleID=RegExpSingleCharAlternation]
### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
public class GenJsCodeVisitorAssistantForMsgs extends AbstractReturningSoyNodeVisitor<Statement> {

  private static final Pattern LINE_BOUNDARY_PATTERN = Pattern.compile("\\s*?(\\n|\\r)\\s*");
  /** Regex pattern for an underscore-number suffix. */
  private static final Pattern UNDERSCORE_NUMBER_SUFFIX = Pattern.compile("_[0-9]+$");
```

### RuleId[ruleID=RegExpSingleCharAlternation]
Single character alternation in RegExp
in `java/src/com/google/template/soy/soytree/MsgNode.java`
#### Snippet
```java

  // Note that the first set of whitespace is reluctant.
  private static final Pattern LINE_BOUNDARY_PATTERN = Pattern.compile("\\s*?(\\n|\\r)\\s*");

  /** We don't use different content types. It may be a historical artifact in the TC. */
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractSoyFileSupplier()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/base/internal/AbstractSoyFileSupplier.java`
#### Snippet
```java
   * @param filePath The path to the Soy file, used for as a unique map/set key and for messages.
   */
  public AbstractSoyFileSupplier(SourceFilePath filePath) {
    this.filePath = checkNotNull(filePath);
  }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `GenericTypeInfo()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java
  /** Simple representation of a generic type specification. */
  private abstract static class GenericTypeInfo extends BaseGenericTypeInfo {
    public GenericTypeInfo(int numParams) {
      super(numParams);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `StringArgGenericTypeInfo()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/types/ast/TypeNodeConverter.java`
#### Snippet
```java

  private abstract static class StringArgGenericTypeInfo extends BaseGenericTypeInfo {
    public StringArgGenericTypeInfo(int numParams) {
      super(numParams);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BaseGenerator()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
    final SoyExpression baseExpr;

    public BaseGenerator(SoyRuntimeType unboxedRuntimeType, SoyExpression baseExpr) {
      this.unboxedRuntimeType = unboxedRuntimeType;
      this.baseExpr = baseExpr;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `CaseOrDefaultNode()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/soytree/CaseOrDefaultNode.java`
#### Snippet
```java
   * @param commandName The name of the Soy command.
   */
  public CaseOrDefaultNode(
      int id, SourceLocation sourceLocation, SourceLocation openTagLocation, String commandName) {
    super(id, sourceLocation, openTagLocation, commandName);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractParentCommandNode()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/soytree/AbstractParentCommandNode.java`
#### Snippet
```java
   * @param commandName The name of the Soy command.
   */
  public AbstractParentCommandNode(int id, SourceLocation sourceLocation, String commandName) {
    super(id, sourceLocation, commandName);
    parentMixin = new MixinParentNode<>(this);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractBlockNode()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/soytree/AbstractBlockNode.java`
#### Snippet
```java
   * @param sourceLocation The node's source location.
   */
  public AbstractBlockNode(int id, SourceLocation sourceLocation) {
    super(id, sourceLocation);
  }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractBlockCommandNode()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/soytree/AbstractBlockCommandNode.java`
#### Snippet
```java
   * @param commandName The name of the Soy command.
   */
  public AbstractBlockCommandNode(
      int id, SourceLocation sourceLocation, SourceLocation openTagLocation, String commandName) {
    super(id, sourceLocation, commandName);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractParentSoyNode()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/soytree/AbstractParentSoyNode.java`
#### Snippet
```java
   * @param sourceLocation The node's source location.
   */
  public AbstractParentSoyNode(int id, SourceLocation sourceLocation) {
    super(id, sourceLocation);
    parentMixin = new MixinParentNode<>(this);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractCommandNode()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/soytree/AbstractCommandNode.java`
#### Snippet
```java
   * @param commandName The name of the Soy command.
   */
  public AbstractCommandNode(int id, SourceLocation sourceLocation, String commandName) {
    super(id, sourceLocation);
    this.commandName = checkNotNull(commandName);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractLocalVarDefn()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/exprtree/AbstractLocalVarDefn.java`
#### Snippet
```java

  /** Copy constructor for when the declaring node is being cloned. */
  public AbstractLocalVarDefn(AbstractLocalVarDefn<T> localVar, T declaringNode) {
    super(localVar);
    checkArgument(localVar.declaringNode != declaringNode);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractLocalVarDefn()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/exprtree/AbstractLocalVarDefn.java`
#### Snippet
```java
   * @param type The data type of the variable.
   */
  public AbstractLocalVarDefn(
      String name, SourceLocation nameLocation, T declaringNode, SoyType type) {
    super(name.startsWith("$") ? name.substring(1) : name, nameLocation, type);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `AbstractVarDefn()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/exprtree/AbstractVarDefn.java`
#### Snippet
```java
   * @param type The data type of the value.
   */
  public AbstractVarDefn(
      String name, @Nullable SourceLocation nameLocation, @Nullable SoyType type) {
    this.name = checkNotNull(name);
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `BasicEscapeDirective()` of an abstract class should not be declared 'public'
in `java/src/com/google/template/soy/basicdirectives/BasicEscapeDirective.java`
#### Snippet
```java

  /** @param name E.g. {@code |escapeUri}. */
  public BasicEscapeDirective(String name) {
    this.name = name;
  }
```

## RuleId[ruleID=Anonymous2MethodRef]
### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new PrivilegedAction() can be replaced with method reference
in `java/src/com/google/template/soy/jbcsrc/shared/SaveStateMetaFactory.java`
#### Snippet
```java
        ProtectionDomain callerProtectionDomain =
            AccessController.doPrivileged(
                new PrivilegedAction<ProtectionDomain>() {
                  @Override
                  public ProtectionDomain run() {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new PrivilegedAction() can be replaced with method reference
in `java/src/com/google/template/soy/jbcsrc/internal/AbstractMemoryClassLoader.java`
#### Snippet
```java
    DEFAULT_PROTECTION_DOMAIN =
        AccessController.doPrivileged(
            new PrivilegedAction<ProtectionDomain>() {
              @Override
              public ProtectionDomain run() {
```

### RuleId[ruleID=Anonymous2MethodRef]
Anonymous new CopyState.Listener() can be replaced with method reference
in `java/src/com/google/template/soy/soytree/HtmlTagNode.java`
#### Snippet
```java
      copyState.registerRefListener(
          matchingNode,
          new CopyState.Listener<HtmlTagNode>() {
            @Override
            public void newVersion(HtmlTagNode newMatchingNode) {
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `inputPath`
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
      for (Path root : inputRoots) {
        if (inputPath.startsWith(root)) {
          inputPath = root.relativize(inputPath);
          break;
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `inputPath`
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
              + "."
              + extension;
      inputPath = inputPath.resolveSibling(fileName);
      inputPath = outputDirectory.resolve(inputPath);
      return inputPath;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `inputPath`
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
              + extension;
      inputPath = inputPath.resolveSibling(fileName);
      inputPath = outputDirectory.resolve(inputPath);
      return inputPath;
    } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `ident`
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
  public static String convertToUpperUnderscore(String ident) {

    ident = LEADING_OR_TRAILING_UNDERSCORE_PATTERN.matcher(ident).replaceAll("");
    ident = WORD_BOUNDARY_IN_IDENT_PATTERN.matcher(ident).replaceAll("_");
    ident = CONSECUTIVE_UNDERSCORES_PATTERN.matcher(ident).replaceAll("_");
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `ident`
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java

    ident = LEADING_OR_TRAILING_UNDERSCORE_PATTERN.matcher(ident).replaceAll("");
    ident = WORD_BOUNDARY_IN_IDENT_PATTERN.matcher(ident).replaceAll("_");
    ident = CONSECUTIVE_UNDERSCORES_PATTERN.matcher(ident).replaceAll("_");
    return Ascii.toUpperCase(ident);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `ident`
in `java/src/com/google/template/soy/base/internal/BaseUtils.java`
#### Snippet
```java
    ident = LEADING_OR_TRAILING_UNDERSCORE_PATTERN.matcher(ident).replaceAll("");
    ident = WORD_BOUNDARY_IN_IDENT_PATTERN.matcher(ident).replaceAll("_");
    ident = CONSECUTIVE_UNDERSCORES_PATTERN.matcher(ident).replaceAll("_");
    return Ascii.toUpperCase(ident);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `placeholder`
in `java/src/com/google/template/soy/data/LoggingAdvisingAppendable.java`
#### Snippet
```java
    // TODO(lukes): we should be able to do this at compile time
    for (Function<String, String> escaper : escapers) {
      placeholder = escaper.apply(placeholder);
    }
    return placeholder;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `delegate`
in `java/src/com/google/template/soy/msgs/SoyMsgBundleWithFullLocale.java`
#### Snippet
```java
    // unwrap the delegate
    while (delegate instanceof SoyMsgBundleWithFullLocale) {
      delegate = ((SoyMsgBundleWithFullLocale) delegate).delegate;
    }
    this.delegate = delegate;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `part`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgBundleCompactor.java`
#### Snippet
```java
  private SoyMsgPart compactPart(SoyMsgPart part) {
    if (part instanceof SoyMsgPluralPart) {
      part = compactPlural((SoyMsgPluralPart) part);
    } else if (part instanceof SoyMsgSelectPart) {
      part = compactSelect((SoyMsgSelectPart) part);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `part`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgBundleCompactor.java`
#### Snippet
```java
      part = compactPlural((SoyMsgPluralPart) part);
    } else if (part instanceof SoyMsgSelectPart) {
      part = compactSelect((SoyMsgSelectPart) part);
    } else if (part instanceof SoyMsgPlaceholderPart) {
      part = compactPlaceholder((SoyMsgPlaceholderPart) part);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `part`
in `java/src/com/google/template/soy/msgs/restricted/SoyMsgBundleCompactor.java`
#### Snippet
```java
      part = compactSelect((SoyMsgSelectPart) part);
    } else if (part instanceof SoyMsgPlaceholderPart) {
      part = compactPlaceholder((SoyMsgPlaceholderPart) part);
    }
    // Now intern the message part.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
              | ((str[i + 6] & 0xff) << 16)
              | ((str[i + 7] & 0xff) << 24));
      c +=
          (((str[i + 8] & 0xff) << 0)
              | ((str[i + 9] & 0xff) << 8)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      b -= a;
      b ^= (a << 8);
      c -= a;
      c -= b;
      c ^= (b >>> 13);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      b ^= (a << 8);
      c -= a;
      c -= b;
      c ^= (b >>> 13);
      a -= b;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      c -= a;
      c -= b;
      c ^= (b >>> 13);
      a -= b;
      a -= c;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      b -= a;
      b ^= (a << 16);
      c -= a;
      c -= b;
      c ^= (b >>> 5);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      b ^= (a << 16);
      c -= a;
      c -= b;
      c ^= (b >>> 5);
      a -= b;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      c -= a;
      c -= b;
      c ^= (b >>> 5);
      a -= b;
      a -= c;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      b -= a;
      b ^= (a << 10);
      c -= a;
      c -= b;
      c ^= (b >>> 15);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      b ^= (a << 10);
      c -= a;
      c -= b;
      c ^= (b >>> 15);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      c -= a;
      c -= b;
      c ^= (b >>> 15);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    }

    c += limit - start;
    switch (limit - i) { // Deal with rest. Cases fall through.
      case 11:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    switch (limit - i) { // Deal with rest. Cases fall through.
      case 11:
        c += (str[i + 10] & 0xff) << 24;
      case 10:
        c += (str[i + 9] & 0xff) << 16;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
        c += (str[i + 10] & 0xff) << 24;
      case 10:
        c += (str[i + 9] & 0xff) << 16;
      case 9:
        c += (str[i + 8] & 0xff) << 8;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
        c += (str[i + 9] & 0xff) << 16;
      case 9:
        c += (str[i + 8] & 0xff) << 8;
        // the first byte of c is reserved for the length
      case 8:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    b -= a;
    b ^= (a << 8);
    c -= a;
    c -= b;
    c ^= (b >>> 13);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    b ^= (a << 8);
    c -= a;
    c -= b;
    c ^= (b >>> 13);
    a -= b;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    c -= a;
    c -= b;
    c ^= (b >>> 13);
    a -= b;
    a -= c;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    b -= a;
    b ^= (a << 16);
    c -= a;
    c -= b;
    c ^= (b >>> 5);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    b ^= (a << 16);
    c -= a;
    c -= b;
    c ^= (b >>> 5);
    a -= b;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    c -= a;
    c -= b;
    c ^= (b >>> 5);
    a -= b;
    a -= c;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    b -= a;
    b ^= (a << 10);
    c -= a;
    c -= b;
    c ^= (b >>> 15);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    b ^= (a << 10);
    c -= a;
    c -= b;
    c ^= (b >>> 15);

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `c`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
    c -= a;
    c -= b;
    c ^= (b >>> 15);

    return c;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `msgParts`
in `java/src/com/google/template/soy/msgs/internal/SoyMsgIdComputer.java`
#### Snippet
```java
      ImmutableList<SoyMsgPart> msgParts, boolean doUseBracedPhs) {

    msgParts = IcuSyntaxUtils.convertMsgPartsToEmbeddedIcuSyntax(msgParts);

    StringBuilder msgStrSb = new StringBuilder();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `stuff`
in `java/src/com/google/template/soy/jssrc/dsl/FormattingContext.java`
#### Snippet
```java
  @CanIgnoreReturnValue
  FormattingContext appendForeignCode(String stuff) {
    stuff = stuff.replaceAll("\n", "\n" + curIndent);
    append(stuff);
    return this;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `activeModNames`
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java

    if (activeModNames == null) {
      activeModNames = arg -> false;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `data`
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java

    if (data == null) {
      data = ParamStore.EMPTY_INSTANCE;
    }
    if (ijData == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `ijData`
in `java/src/com/google/template/soy/tofu/internal/BaseTofu.java`
#### Snippet
```java
    }
    if (ijData == null) {
      ijData = ParamStore.EMPTY_INSTANCE;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `java/src/com/google/template/soy/jssrc/internal/JavaScriptValueFactoryImpl.java`
#### Snippet
```java
  private Expression chainedDotAccess(Expression base, String suffix) {
    for (String part : Splitter.on('.').splitToList(suffix)) {
      base = base.dotAccess(part);
    }
    return base;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
      Unpacking unpacking = link.getUnpacking();
      if (unpacking == Unpacking.UNPACK) {
        base = link.unpack(base, tail);
        break;
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
    Expression result;
    if (link.nullSafe && !base.isCheap()) {
      base = generator.declarationBuilder().setRhs(base).build().ref();
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `prevTip`
in `java/src/com/google/template/soy/jssrc/internal/NullSafeAccumulator.java`
#### Snippet
```java
    Expression extend(Expression prevTip) {
      // Never allow a null method receiver.
      prevTip = SOY_CHECK_NOT_NULL.call(prevTip);
      return funct.apply(prevTip);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `accumulator`
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
      // This is an access chain (e.g. $foo.bar.baz), so recurse through the base expression
      // ($foo.bar) first.
      accumulator =
          accumulateNullSafeDataAccess(
              (DataAccessNode) dataAccessNode.getBaseExprChild(),
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dataAccess`
in `java/src/com/google/template/soy/jssrc/internal/TranslateExprNodeVisitor.java`
#### Snippet
```java
    if (dataAccess.getKind() == ExprNode.Kind.ASSERT_NON_NULL_OP_NODE) {
      AssertNonNullOpNode assertNonNull = (AssertNonNullOpNode) dataAccess;
      dataAccess = (AccessChainComponentNode) assertNonNull.getChild(0);
      foundAssertNonNull = true;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `msgParts`
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitorAssistantForMsgs.java`
#### Snippet
```java
      ImmutableList<SoyMsgPart> msgParts, boolean doUseBracedPhs) {

    msgParts = IcuSyntaxUtils.convertMsgPartsToEmbeddedIcuSyntax(msgParts);

    StringBuilder msgStrSb = new StringBuilder();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dataAccessNode`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
    if (dataAccessNode.getKind() == ExprNode.Kind.ASSERT_NON_NULL_OP_NODE) {
      AssertNonNullOpNode assertNonNull = (AssertNonNullOpNode) dataAccessNode;
      dataAccessNode = (AccessChainComponentNode) assertNonNull.getChild(0);
      hasAssertNonNull = true;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java
    boolean nullSafe = true;
    if (dataAccessNode.getBaseExprChild() instanceof DataAccessNode) {
      base =
          accumulateDataAccess(
              (DataAccessNode) dataAccessNode.getBaseExprChild(),
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `containerExpr`
in `java/src/com/google/template/soy/pysrc/internal/TranslateToPyExprVisitor.java`
#### Snippet
```java

    // Never allow a null method receiver.
    containerExpr = assertNotNull(containerExpr);

    if (method instanceof BuiltinMethod) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/jbcsrc/RenderContextExpression.java`
#### Snippet
```java
      SoyPrintDirective directive, SoyExpression value, List<SoyExpression> args) {
    if (directive instanceof SoyJbcSrcPrintDirective) {
      value = ((SoyJbcSrcPrintDirective) directive).applyForJbcSrc(this, value, args);
    } else {
      value =
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/jbcsrc/RenderContextExpression.java`
#### Snippet
```java
      value = ((SoyJbcSrcPrintDirective) directive).applyForJbcSrc(this, value, args);
    } else {
      value =
          SoyExpression.forSoyValue(
              UnknownType.getInstance(),
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `currentType`
in `java/src/com/google/template/soy/jbcsrc/ProtoUtils.java`
#### Snippet
```java
        }
        toProto.invokeUnchecked(cb);
        currentType = toProto.returnType();
      }
      if (!currentType.equals(runtimeFieldType)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `externCall`
in `java/src/com/google/template/soy/jbcsrc/ExternCompiler.java`
#### Snippet
```java
        // string keys. We know that's not the case here (because the Soy return type of the extern
        // is "map") so mark this as a "map" and not a "legacy_object_map".
        externCall = MethodRef.MARK_AS_SOY_MAP.invoke(externCall);
      }
      return MethodRef.CONVERT_OBJECT_TO_SOY_VALUE_PROVIDER.invoke(externCall);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `externCall`
in `java/src/com/google/template/soy/jbcsrc/ExternCompiler.java`
#### Snippet
```java
        // convertObjectToSoyValueProvider requires values to be Java-boxed (i.e. int to Integer) so
        // do that first if needed.
        externCall = BytecodeUtils.boxJavaPrimitive(externCall.resultType(), externCall);
      }
      return MethodRef.CONVERT_OBJECT_TO_SOY_VALUE_PROVIDER.invoke(externCall);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `local`
in `java/src/com/google/template/soy/jbcsrc/TemplateVariableManager.java`
#### Snippet
```java
      this.initExpression = initExpression;
      if (initExpression.isNonNullable()) {
        local = local.asNonNullable();
      }
      this.local = local;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `soyValueProvider`
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
              TemplateVariableManager.SaveStrategy.STORE);
      initRenderee = variable.initializer();
      soyValueProvider = variable.accessor();
    }
    initRenderee = initRenderee.labelStart(reattachPoint);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `paramStoreExpression`
in `java/src/com/google/template/soy/jbcsrc/SoyNodeCompiler.java`
#### Snippet
```java
      if (param.hasDefault()) {
        foundDefaultParams = true;
        paramStoreExpression =
            MethodRef.PARAM_STORE_SET_FIELD.invoke(
                paramStoreExpression,
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `baseExpr`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        DataAccessNode dataAccessNode, SoyExpression baseExpr, boolean hasAssertNonNull) {
      if (dataAccessNode.getBaseExprChild() instanceof DataAccessNode) {
        baseExpr =
            accumulateDataAccess(
                    (DataAccessNode) dataAccessNode.getBaseExprChild(),
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `baseExpr`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
        Label nullSafeExit,
        boolean hasAssertNonNull) {
      baseExpr = addNullSafetyCheck(baseExpr, nullSafeExit);
      return accumulateDataAccess(dataAccessNode, baseExpr, hasAssertNonNull);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dataAccessNode`
in `java/src/com/google/template/soy/jbcsrc/ExpressionCompiler.java`
#### Snippet
```java
      if (dataAccessNode.getKind() == ExprNode.Kind.ASSERT_NON_NULL_OP_NODE) {
        AssertNonNullOpNode assertNonNull = (AssertNonNullOpNode) dataAccessNode;
        dataAccessNode = (AccessChainComponentNode) assertNonNull.getChild(0);
        hasAssertNonNull = true;
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `captureField`
in `java/src/com/google/template/soy/jbcsrc/LazyClosureCompiler.java`
#### Snippet
```java
    static ParentCapture create(FieldRef captureField, Expression parentExpression) {
      if (parentExpression.isNonNullable()) {
        captureField = captureField.asNonNull();
      }
      return new AutoValue_LazyClosureCompiler_ParentCapture(captureField, parentExpression);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `simpleName`
in `java/src/com/google/template/soy/jbcsrc/internal/InnerClasses.java`
#### Snippet
```java
   */
  public TypeInfo registerInnerClassWithGeneratedName(String simpleName, int accessModifiers) {
    simpleName = classNames.generateName(simpleName);
    TypeInfo innerClass = outer.innerClass(simpleName);
    innerClassesAccessModifiers.put(innerClass, accessModifiers);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `boundParams`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
      if (delegate instanceof PartiallyBoundTemplate) {
        PartiallyBoundTemplate partiallyBoundTemplate = (PartiallyBoundTemplate) delegate;
        boundParams = SoyRecords.merge(partiallyBoundTemplate.boundParams, boundParams);
        delegate = partiallyBoundTemplate.delegate;
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `delegate`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
        PartiallyBoundTemplate partiallyBoundTemplate = (PartiallyBoundTemplate) delegate;
        boundParams = SoyRecords.merge(partiallyBoundTemplate.boundParams, boundParams);
        delegate = partiallyBoundTemplate.delegate;
      }
      this.delegate = delegate;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `key`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
    Preconditions.checkNotNull(soyMap, "Attempted to access map item '%s' of null", key);
    if (key == null) {
      key = NullData.INSTANCE;
    }
    SoyValueProvider soyValueProvider = soyMap.getProvider(key);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static SoyValue applyPrintDirective(
      SoyJavaPrintDirective directive, SoyValue value, List<SoyValue> args) {
    value = value == null ? NullData.INSTANCE : value;
    for (int i = 0; i < args.size(); i++) {
      if (args.get(i) == null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `soyType`
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java

  private static boolean protoTypesAreCompatible(String javaType, SoyType soyType) {
    soyType = SoyTypes.removeNull(soyType);
    switch (soyType.getKind()) {
      case PROTO:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `soyType`
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java
    }

    soyType = SoyTypes.removeNull(soyType);
    javaType = Primitives.wrap(javaType);
    switch (soyType.getKind()) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `javaType`
in `java/src/com/google/template/soy/passes/ValidateExternsPass.java`
#### Snippet
```java

    soyType = SoyTypes.removeNull(soyType);
    javaType = Primitives.wrap(javaType);
    switch (soyType.getKind()) {
      case INT:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `attrType`
in `java/src/com/google/template/soy/passes/SoyElementCompositionPass.java`
#### Snippet
```java

  private static String getKind(SoyType attrType) {
    attrType = SoyTypes.removeNull(attrType);
    if (TrustedResourceUriType.getInstance().isAssignableFromStrict(attrType)) {
      return "trusted_resource_uri";
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `java/src/com/google/template/soy/plugin/java/internal/ValidatorFactory.java`
#### Snippet
```java
    ImmutableSet<Class<?>> expectedClasses = null;
    GenericDescriptor expectedDescriptor = null;
    type = SoyTypes.tryRemoveNull(type);
    switch (type.getKind()) {
      case ANY:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
    if (b.size() < a.size()) {
      Map<K, V> t = a;
      a = b;
      b = t;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `java/src/com/google/template/soy/shared/internal/AbstractGenerateSoyEscapingDirectiveCode.java`
#### Snippet
```java
      Map<K, V> t = a;
      a = b;
      b = t;
    }
    boolean overlap = false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `baseType`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        calculateAccessChainTypes(baseType, (DataAccessNode) dataAccess.getBaseExprChild());
        nullSafe = false;
        baseType = dataAccess.getBaseExprChild().getType();
      } else if (dataAccess.getBaseExprChild().getKind() == ExprNode.Kind.ASSERT_NON_NULL_OP_NODE) {
        AssertNonNullOpNode baseExpr = (AssertNonNullOpNode) dataAccess.getBaseExprChild();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `baseType`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        finishAssertNonNullOpNodeChain(baseExpr);
        nullSafe = false;
        baseType = dataAccess.getBaseExprChild().getType();
      }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesPass.java`
#### Snippet
```java
        resolvedNode.setType(node.getType());
        node.getParent().replaceChild(node, resolvedNode);
        node = resolvedNode;
      }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nextReplacement`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
        throw new AssertionError();
      }
      nextReplacement = -1;
      if (searchForEndTag) {
        int indexOfEndTag = css.indexOf("</", endOfPreviousReplacement);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `searchForEndTag`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
        int indexOfEndTag = css.indexOf("</", endOfPreviousReplacement);
        if (indexOfEndTag == -1) {
          searchForEndTag = false;
        } else {
          nextReplacement = indexOfEndTag;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nextReplacement`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
          searchForEndTag = false;
        } else {
          nextReplacement = indexOfEndTag;
        }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `searchForEndCData`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
        int indexOfEndCData = css.indexOf("]]>", endOfPreviousReplacement);
        if (indexOfEndCData == -1) {
          searchForEndCData = false;
        } else {
          nextReplacement =
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `nextReplacement`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
          searchForEndCData = false;
        } else {
          nextReplacement =
              nextReplacement == -1 ? indexOfEndCData : min(nextReplacement, indexOfEndCData);
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Filters out strings that cannot be a substring of a valid <script> tag. */
  public static String filterHtmlScriptPhrasingData(SoyValue value) {
    value = normalizeNull(value);
    // no content types are safe for this context
    return filterHtmlScriptPhrasingData(value.coerceToString());
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Filters bad csp values. */
  public static String filterCspNonceValue(SoyValue value) {
    value = normalizeNull(value);
    return filterCspNonceValue(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure the given input is an instance of either trustedResourceUrl or trustedString. */
  public static String filterTrustedResourceUri(SoyValue value) {
    value = normalizeNull(value);
    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.TRUSTED_RESOURCE_URI)) {
      return value.coerceToString();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a sip URI. */
  public static SanitizedContent filterSipUri(SoyValue value) {
    value = normalizeNull(value);
    return filterSipUri(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String normalizeHtmlNospace(SoyValue value) {
    value = normalizeNull(value);
    return normalizeHtmlNospace(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String escapeHtmlAttribute(SoyValue value) {
    value = normalizeNull(value);
    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.HTML)) {
      // |escapeHtmlAttribute should only be used on attribute values that cannot have tags.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Converts the input to HTML suitable for use inside {@code <textarea>} by entity escaping. */
  public static String escapeHtmlRcdata(SoyValue value) {
    value = normalizeNull(value);

    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.HTML)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static SanitizedContent filterImageDataUri(SoyValue value) {
    value = normalizeNull(value);
    return filterImageDataUri(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  public static SanitizedContent cleanHtml(
      SoyValue value, Collection<? extends OptionalSafeTag> optionalSafeTags) {
    value = normalizeNull(value);
    Dir valueDir = null;
    if (value instanceof SanitizedContent) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Converts the input to the body of a CSS string literal. */
  public static String escapeCssString(SoyValue value) {
    value = normalizeNull(value);
    return escapeCssString(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a tel URI. */
  public static SanitizedContent filterTelUri(SoyValue value) {
    value = normalizeNull(value);
    return filterTelUri(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String escapeHtmlAttributeNospace(SoyValue value) {
    value = normalizeNull(value);
    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.HTML)) {
      // |escapeHtmlAttributeNospace should only be used on attribute values that cannot have tags.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Converts the input to the body of a JavaScript string by using {@code \n} style escapes. */
  public static String escapeJsString(SoyValue value) {
    value = normalizeNull(value);
    return escapeJsString(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterCssValue(SoyValue value) {
    value = normalizeNull(value);
    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.CSS)) {
      // We don't need to do this when the CSS is embedded in a
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Converts the input to the body of a JavaScript regular expression literal. */
  public static String escapeJsRegex(SoyValue value) {
    value = normalizeNull(value);
    return escapeJsRegex(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Converts the input to a piece of a URI by percent encoding the value as UTF-8 bytes. */
  public static String escapeUri(SoyValue value) {
    value = normalizeNull(value);
    return escapeUri(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Makes sure that the given input is a sms URI. */
  public static SanitizedContent filterSmsUri(SoyValue value) {
    value = normalizeNull(value);
    return filterSmsUri(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Converts the input to HTML by entity escaping. */
  public static String escapeHtml(SoyValue value) {
    value = normalizeNull(value);
    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.HTML)) {
      return value.coerceToString();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String normalizeUri(SoyValue value) {
    value = normalizeNull(value);
    return normalizeUri(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Normalizes HTML to HTML making sure quotes and other specials are entity encoded. */
  public static String normalizeHtml(SoyValue value) {
    value = normalizeNull(value);
    return normalizeHtml(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterNormalizeMediaUri(SoyValue value) {
    value = normalizeNull(value);
    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.URI)
        || isSanitizedContentOfKind(value, SanitizedContent.ContentKind.TRUSTED_RESOURCE_URI)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
   */
  public static String filterNormalizeUri(SoyValue value) {
    value = normalizeNull(value);
    if (isSanitizedContentOfKind(value, SanitizedContent.ContentKind.URI)
        || isSanitizedContentOfKind(value, SanitizedContent.ContentKind.TRUSTED_RESOURCE_URI)) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/shared/internal/Sanitizers.java`
#### Snippet
```java
  /** Checks that the input is part of the name of an innocuous element. */
  public static String filterHtmlElementName(SoyValue value) {
    value = normalizeNull(value);
    return filterHtmlElementName(value.coerceToString());
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `methodName`
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
        methodName.length() >= 4 && (methodName.startsWith("get") || methodName.startsWith("has")));
    if (methodName.endsWith("OrUndefined")) {
      methodName = methodName.substring(3, methodName.length() - "OrUndefined".length());
    } else {
      methodName = methodName.substring(3);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `methodName`
in `java/src/com/google/template/soy/shared/internal/BuiltinMethod.java`
#### Snippet
```java
      methodName = methodName.substring(3, methodName.length() - "OrUndefined".length());
    } else {
      methodName = methodName.substring(3);
    }
    return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, methodName);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `stack`
in `java/src/com/google/template/soy/passes/htmlmatcher/HtmlTagMatchingPass.java`
#### Snippet
```java
        annotationMap.put(stack.tagNode, INVALID_NODE);
      }
      stack = stack.pop();
    }
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
   */
  public static String makeUpperCamelCase(String str) {
    str = makeWordsCapitalized(str, ALL_UPPER_WORD);
    str = makeWordsCapitalized(str, ALL_LOWER_WORD);
    str = NON_LETTER_DIGIT.matcher(str).replaceAll("");
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  public static String makeUpperCamelCase(String str) {
    str = makeWordsCapitalized(str, ALL_UPPER_WORD);
    str = makeWordsCapitalized(str, ALL_LOWER_WORD);
    str = NON_LETTER_DIGIT.matcher(str).replaceAll("");
    return str;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
    str = makeWordsCapitalized(str, ALL_UPPER_WORD);
    str = makeWordsCapitalized(str, ALL_LOWER_WORD);
    str = NON_LETTER_DIGIT.matcher(str).replaceAll("");
    return str;
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java

  public static String makeLowerCamelCase(String str) {
    str = makeUpperCamelCase(str);
    return Character.toLowerCase(str.charAt(0)) + str.substring(1);
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `fileName`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
    Preconditions.checkArgument(!fileName.contains("/") && !fileName.contains("\\"));
    if (Ascii.toLowerCase(fileName).endsWith(".soy")) {
      fileName = fileName.substring(0, fileName.length() - 4);
    }
    String prefix = makeUpperCamelCase(fileName);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `doc`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
        wrappedLines.add(line);
      }
      doc = Joiner.on("\n").join(wrappedLines);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `out`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
              // Create a new buffer if we need to escape a character in s.
              // We add 32 to the size to leave a decent amount of space for escape characters.
              out = new StringBuilder(end - start + 32);
            }
            out.append(s, pos, i).append(esc);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `out`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          if (index >= 0) {
            if (out == null) {
              out = new StringBuilder(end - start + 32);
            }
            out.append(s, pos, i).append(nonAsciiEscapes[index]);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `out`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
          } else if (nonAsciiPrefix != null) { // Fallback to the prefix based escaping.
            if (out == null) {
              out = new StringBuilder(end - start + 32);
            }
            out.append(s, pos, i);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `notEscaped`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
    final EscapeListBuilder escapeAllInRangeExcept(
        int startInclusive, int endExclusive, char... notEscaped) {
      notEscaped = notEscaped.clone();
      Arrays.sort(notEscaped);
      int k = 0;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `exprNode`
in `java/src/com/google/template/soy/soytree/MsgSubstUnitPlaceholderNameUtils.java`
#### Snippet
```java
        if (exprNode instanceof VarRefNode) {
          nameSegment = ((VarRefNode) exprNode).getNameWithoutLeadingDollar();
          exprNode = null;
        } else if (exprNode instanceof FieldAccessNode) {
          FieldAccessNode fieldAccess = (FieldAccessNode) exprNode;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `exprNode`
in `java/src/com/google/template/soy/soytree/MsgSubstUnitPlaceholderNameUtils.java`
#### Snippet
```java
          FieldAccessNode fieldAccess = (FieldAccessNode) exprNode;
          nameSegment = fieldAccess.getFieldName();
          exprNode = fieldAccess.getBaseExprChild();
        } else if (exprNode instanceof ItemAccessNode) {
          ItemAccessNode itemAccess = (ItemAccessNode) exprNode;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `exprNode`
in `java/src/com/google/template/soy/soytree/MsgSubstUnitPlaceholderNameUtils.java`
#### Snippet
```java
        } else if (exprNode instanceof ItemAccessNode) {
          ItemAccessNode itemAccess = (ItemAccessNode) exprNode;
          exprNode = itemAccess.getBaseExprChild();
          if (itemAccess.getKeyExprChild() instanceof IntegerNode) {
            // Prefix with index, but don't add to baseNames list since it's not a valid ident.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `soyDoc`
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
  private static String cleanSoyDocHelper(String soyDoc) {
    // Change all newlines to "\n".
    soyDoc = NEWLINE.matcher(soyDoc).replaceAll("\n");

    // Escape all @deprecated javadoc tags.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `soyDoc`
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
    // Escape all @deprecated javadoc tags.
    // TODO(cushon): add this to the specification and then also generate @Deprecated annotations
    soyDoc = soyDoc.replace("@deprecated", "&#64;deprecated");

    // Strip start/end tokens and spaces (including newlines if they occupy their own lines).
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `soyDoc`
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java

    // Strip start/end tokens and spaces (including newlines if they occupy their own lines).
    soyDoc = SOY_DOC_START.matcher(soyDoc).replaceFirst("");
    soyDoc = SOY_DOC_END.matcher(soyDoc).replaceFirst("");

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `soyDoc`
in `java/src/com/google/template/soy/soytree/TemplateNodeBuilder.java`
#### Snippet
```java
    // Strip start/end tokens and spaces (including newlines if they occupy their own lines).
    soyDoc = SOY_DOC_START.matcher(soyDoc).replaceFirst("");
    soyDoc = SOY_DOC_END.matcher(soyDoc).replaceFirst("");

    // Split into lines.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `endTextIndex`
in `java/src/com/google/template/soy/soytree/RawTextNode.java`
#### Snippet
```java
      // subtract 1 from end since we want the endLocation to point at the last character rather
      // than just beyond it.
      endTextIndex--;

      int startLocation = Arrays.binarySearch(indexes, startTextIndex);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `typeNode`
in `java/src/com/google/template/soy/soytree/defn/TemplateStateVar.java`
#### Snippet
```java
    // Optional params become nullable
    if (optional && typeNode != null) {
      typeNode = TemplateParam.getNullableTypeNode(typeNode);
    }
    this.typeNode = typeNode;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `typeNode`
in `java/src/com/google/template/soy/soytree/defn/TemplateParam.java`
#### Snippet
```java
    // Optional params become nullable
    if (optional && !isNullable && typeNode != null) {
      typeNode = getNullableTypeNode(typeNode);
    }
    this.typeNode = typeNode;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java

  private static boolean doIsDescendantOf(Node node, Node ancestor) {
    for (; node != null; node = node.getParent()) {
      if (ancestor == node) {
        return true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
    // first find the root of the expression tree
    while (node.getParent() != null) {
      node = node.getParent();
    }
    Node nodeRoot = node;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dir`
in `java/src/com/google/template/soy/internal/i18n/BidiFormatter.java`
#### Snippet
```java
  public BidiWrappingText spanWrappingText(@Nullable Dir dir, String str, boolean isHtml) {
    if (dir == null) {
      dir = estimateDirection(str, isHtml);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `java/src/com/google/template/soy/internal/i18n/BidiFormatter.java`
#### Snippet
```java
    BidiWrappingText wrappingText = spanWrappingText(dir, str, isHtml);
    if (!isHtml) {
      str = HtmlEscapers.htmlEscaper().escape(str);
    }
    return wrappingText.beforeText() + str + wrappingText.afterText();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dir`
in `java/src/com/google/template/soy/internal/i18n/BidiFormatter.java`
#### Snippet
```java
  public BidiWrappingText unicodeWrappingText(@Nullable Dir dir, String str, boolean isHtml) {
    if (dir == null) {
      dir = estimateDirection(str, isHtml);
    }
    StringBuilder beforeText = new StringBuilder();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dir`
in `java/src/com/google/template/soy/internal/i18n/BidiFormatter.java`
#### Snippet
```java
  public String markAfter(@Nullable Dir dir, String str, boolean isHtml) {
    if (dir == null) {
      dir = estimateDirection(str, isHtml);
    }
    // BidiUtils.getExitDir() is called only if needed (short-circuit).
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `capitalizeNextLetter`
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
          result.append(ch);
        }
        capitalizeNextLetter = false;
      } else if ('A' <= ch && ch <= 'Z') {
        if (i == 0 && !capitalizeNextLetter) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `capitalizeNextLetter`
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
          result.append(ch);
        }
        capitalizeNextLetter = false;
      } else if ('0' <= ch && ch <= '9') {
        result.append(ch);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `capitalizeNextLetter`
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
      } else if ('0' <= ch && ch <= '9') {
        result.append(ch);
        capitalizeNextLetter = true;
      } else {
        capitalizeNextLetter = true;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `capitalizeNextLetter`
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java
        capitalizeNextLetter = true;
      } else {
        capitalizeNextLetter = true;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `i`
in `java/src/com/google/template/soy/soyparse/SoyParseUtils.java`
#### Snippet
```java
    checkArgument(i < s.length(), "Found escape sequence at the end of a string.");

    char c = s.charAt(i++);
    switch (c) {
      case 'n':
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `i`
in `java/src/com/google/template/soy/soyparse/SoyParseUtils.java`
#### Snippet
```java
      case '6':
      case '7':
        --i; // backup to first octal digit
        int nOctalDigits = 1;
        int digitLimit = c < '4' ? 3 : 2;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `i`
in `java/src/com/google/template/soy/soyparse/SoyParseUtils.java`
#### Snippet
```java
        }
        sb.append((char) Integer.parseInt(s.substring(i, i + nOctalDigits), 8));
        i += nOctalDigits;
        break;
      case 'x':
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `i`
in `java/src/com/google/template/soy/soyparse/SoyParseUtils.java`
#### Snippet
```java

        sb.append((char) unicodeValue);
        i += nHexDigits;
        break;
      default:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expectedTokens`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
      normalizedTokensBuilder.add(maybeQuoteForParseError(t));
    }
    expectedTokens = normalizedTokensBuilder.build().asList();

    StringBuilder details = new StringBuilder();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java

  private static String escapeWhitespaceForErrorPrinting(String s) {
    s = s.replace("\r", "\\r");
    s = s.replace("\n", "\\n");
    s = s.replace("\t", "\\t");
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
  private static String escapeWhitespaceForErrorPrinting(String s) {
    s = s.replace("\r", "\\r");
    s = s.replace("\n", "\\n");
    s = s.replace("\t", "\\t");
    return s;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
    s = s.replace("\r", "\\r");
    s = s.replace("\n", "\\n");
    s = s.replace("\t", "\\t");
    return s;
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `token`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
    // the literal matches are surrounded in double quotes, so remove them
    if (token.length() > 1 && token.charAt(0) == '"' && token.charAt(token.length() - 1) == '"') {
      token = token.substring(1, token.length() - 1);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `token`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
    if (TOKENS_TO_QUOTE.matches(token.charAt(0))
        || TOKENS_TO_QUOTE.matches(token.charAt(token.length() - 1))) {
      token = "'" + token + "'";
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `optionalAdvice`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java

    if (e instanceof SoyFileParser.ParseExceptionWithAdvice) {
      optionalAdvice = ((SoyFileParser.ParseExceptionWithAdvice) e).advice;
      e = ((SoyFileParser.ParseExceptionWithAdvice) e).original;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `e`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
    if (e instanceof SoyFileParser.ParseExceptionWithAdvice) {
      optionalAdvice = ((SoyFileParser.ParseExceptionWithAdvice) e).advice;
      e = ((SoyFileParser.ParseExceptionWithAdvice) e).original;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `optionalAdvice`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
          // If we don't already have a context-specific suggestion, warn the user the "in" and
          // "for" are reserved words.
          optionalAdvice +=
              ".\nNote: "
                  + Tokens.getTokenDisplayName(errorToken.kind)
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `optionalAdvice`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
        if (currentLexicalState == SoyFileParserConstants.IN_DQ_ATTRIBUTE_VALUE
            || currentLexicalState == SoyFileParserConstants.IN_SQ_ATTRIBUTE_VALUE) {
          optionalAdvice += ". Did you forget to close an attribute?";
        } else if (currentLexicalState == SoyFileParserConstants.IN_MULTILINE_COMMENT
            || currentLexicalState == SoyFileParserConstants.IN_SOYDOC) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `optionalAdvice`
in `java/src/com/google/template/soy/soyparse/ParseErrors.java`
#### Snippet
```java
        } else if (currentLexicalState == SoyFileParserConstants.IN_MULTILINE_COMMENT
            || currentLexicalState == SoyFileParserConstants.IN_SOYDOC) {
          optionalAdvice += ". Did you forget to close a comment?";
        }
        // fall-through
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `e`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/ContextualAutoescaper.java`
#### Snippet
```java
    String message = "- " + e.getOriginalMessage();
    while (e.getCause() instanceof SoyAutoescapeException) {
      e = (SoyAutoescapeException) e.getCause();
      message += "\n- " + e.getMessage();
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `type`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java
    String newType = type;
    do {
      type = newType;
      newType = type.replaceAll("<[^>]*>", "");
    } while (!newType.equals(type));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `java/src/com/google/template/soy/javagencode/GenerateBuildersVisitor.java`
#### Snippet
```java

  private static String makeParamName(String s) {
    s = makeLowerCamelCase(s);
    return isReservedKeyword(s) ? s + "_" : s;
  }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `context`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
            // If the prefix is not allowed then we switch to UriPart.END meaning that we don't
            // allow anything after this node (the whole URI must be fixed).
            context = context.derive(UriPart.TRUSTED_RESOURCE_URI_END);
            break;
          } else {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `context`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
            break;
          } else {
            context = context.derive(UriPart.AUTHORITY_OR_PATH);
          }
          // and fall-through
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `context`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
          }
          if (queryIndex != -1) {
            context = context.derive(UriPart.QUERY);
          }
          // fall-through
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `context`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/RawTextContextUpdater.java`
#### Snippet
```java
            return context;
          }
          context = context.derive(UriPart.FRAGMENT);
          break;
        case FRAGMENT:
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyExprVisitor.java`
#### Snippet
```java
                dataAccessChainBase.getParent().replaceChild(dataAccessChainBase, replacement);
              }
              node = nullSafeAccessChild;
            }
            break;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `templateName`
in `java/src/com/google/template/soy/treebuilder/ExprNodes.java`
#### Snippet
```java
  public static TemplateLiteralNode templateLiteral(String templateName) {
    if (templateName.startsWith(".")) {
      templateName = templateName.substring(1);
    }
    return TemplateLiteralNode.forVarRef(
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `error`
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
    private static StringBuilder format(StringBuilder error, String fmt, Object... args) {
      if (error == null) {
        error = new StringBuilder();
      }
      error.append(String.format(fmt, args));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `s`
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
      int charsLeft = currentRawText.length() - currentRawTextIndex;
      if (s.length() > charsLeft) {
        s = s.substring(0, charsLeft);
      }
      return matchPrefixIgnoreCase(s, /* advance= */ false);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `attrName`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
  static Context getAttrNameContext(String attrName, ElementType elType, Context.Builder builder) {
    // according to spec ascii case is not meaningful for attributes.
    attrName = Ascii.toLowerCase(attrName);
    // Get the local name so we can treat xlink:href and svg:style as per HTML.
    int colon = attrName.lastIndexOf(':');
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    // Try to reconcile each property one-by-one.
    if (a.slashType() != b.slashType()) {
      a = a.derive(JsFollowingSlash.UNKNOWN);
      b = b.derive(JsFollowingSlash.UNKNOWN);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    if (a.slashType() != b.slashType()) {
      a = a.derive(JsFollowingSlash.UNKNOWN);
      b = b.derive(JsFollowingSlash.UNKNOWN);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
    if (a.uriPart() != b.uriPart()) {
      UriPart unionedUriPart = unionUriParts(a.uriPart(), b.uriPart());
      a = a.derive(unionedUriPart);
      b = b.derive(unionedUriPart);
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
      UriPart unionedUriPart = unionUriParts(a.uriPart(), b.uriPart());
      a = a.derive(unionedUriPart);
      b = b.derive(unionedUriPart);
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
      if (a.state().compareTo(b.state()) > 0) {
        Context swap = a;
        a = b;
        b = swap;
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
        Context swap = a;
        a = b;
        b = swap;
      }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
        // TODO(lukes): given this usecase, HTML_TAG_NAME is poorly named, consider
        // AFTER_TAG_OR_UNQUOTED_ATTR?  maybe just HTML_TAG_NEEDS_SPACE
        a = a.toBuilder().withState(HtmlContext.HTML_TAG_NAME).withoutAttrContext().build();
        // The next block will clean up b.
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
          // attrccontext at all, but prior reconciliation of slashtype may have added one.  so
          // clear it.
          a = a.toBuilder().withoutAttrContext().build();
          b = b.toBuilder().withState(HtmlContext.HTML_TAG_NAME).withoutAttrContext().build();
        }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
          // clear it.
          a = a.toBuilder().withoutAttrContext().build();
          b = b.toBuilder().withState(HtmlContext.HTML_TAG_NAME).withoutAttrContext().build();
        }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `a`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
        // TODO(gboyer): The withoutAttrContext() doesn't make any sense, since HTML_TAG_NAME can't
        // have an attribute context.
        a = a.toBuilder().withState(HtmlContext.HTML_TAG).withoutAttrContext().build();
      }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `b`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
          // TODO(gboyer): do we need to require a space before any new attribute name after an
          // unquoted attribute?
          b = b.toBuilder().withState(HtmlContext.HTML_TAG).withoutAttrContext().build();
        }
      }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `isHtml`
in `java/src/com/google/template/soy/bidifunctions/BidiFunctionsRuntime.java`
#### Snippet
```java
      SanitizedContent sanitizedContent = (SanitizedContent) value;
      valueDir = sanitizedContent.getContentDirection();
      isHtml = isHtml || sanitizedContent.getContentKind() == ContentKind.HTML;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `object`
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java
      // string keys. We know that's not the case here (because the Soy return type of the extern
      // is "map") so mark this as a "map" and not a "legacy_object_map".
      object = SoyValueConverter.markAsSoyMap((Map) object);
    }
    try {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `lowerCaseTag`
in `java/src/com/google/template/soy/basicfunctions/HtmlToText.java`
#### Snippet
```java
    private void updatePreserveWhitespaceStack(String lowerCaseTag, String attrs) {
      if (lowerCaseTag.charAt(0) == '/') {
        lowerCaseTag = lowerCaseTag.substring(1);
        // Pop tags until we pop one that matches the current closing tag. This means we're
        // effectively automatically closing tags that aren't explicitly closed.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `outputBuf`
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
        flushable = new CountingFlushableAppendable(outputBuf);
      }
      outputBuf = flushable;
    }
    pushOutputBuf(outputBuf);
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `paramValue`
in `java/src/com/google/template/soy/sharedpasses/render/RenderVisitor.java`
#### Snippet
```java
    }
    if (paramValue == null) {
      paramValue = NullData.INSTANCE;
    } else if (paramValue instanceof SoyAbstractCachingValueProvider) {
      SoyAbstractCachingValueProvider typedValue = (SoyAbstractCachingValueProvider) paramValue;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `dataAccessNode`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    if (dataAccessNode.getKind() == ExprNode.Kind.ASSERT_NON_NULL_OP_NODE) {
      AssertNonNullOpNode assertNonNull = (AssertNonNullOpNode) dataAccessNode;
      dataAccessNode = (AccessChainComponentNode) assertNonNull.getChild(0);
      hasAssertNonNull = true;
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java

    // Never allow a null method receiver.
    base = assertNotNull(base, methodNode.getBaseExprChild());

    SoyMethod method = methodNode.getSoyMethod();
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `base`
in `java/src/com/google/template/soy/sharedpasses/render/EvalVisitor.java`
#### Snippet
```java
    boolean accessChain = false;
    if (dataAccessNode.getBaseExprChild() instanceof DataAccessNode) {
      base =
          accumulateDataAccess(
              (DataAccessNode) dataAccessNode.getBaseExprChild(),
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/bididirectives/BidiDirectivesRuntime.java`
#### Snippet
```java
  public static SoyValue bidiUnicodeWrap(BidiGlobalDir dir, SoyValue value) {
    // normalize null between tofu and jbcsrc
    value = value == null ? NullData.INSTANCE : value;
    // We treat the value as HTML if and only if it says it's HTML.
    boolean isHtml = false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/coredirectives/CoreDirectivesRuntime.java`
#### Snippet
```java
    if (value == null) {
      // jbcsrc uses null as null.
      value = NullData.INSTANCE;
    }
    Dir valueDir = null;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `uLocale`
in `java/src/com/google/template/soy/i18ndirectives/I18NDirectivesRuntime.java`
#### Snippet
```java
      @Nullable Integer minFractionDigits,
      @Nullable Integer maxFractionDigits) {
    uLocale = uLocale.setKeywordValue("numbers", numbersKeyword);
    NumberFormat numberFormat;
    switch (formatType) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `maxFractionDigits`
in `java/src/com/google/template/soy/i18ndirectives/I18NDirectivesRuntime.java`
#### Snippet
```java
    if (minFractionDigits != null || maxFractionDigits != null) {
      if (maxFractionDigits == null) {
        maxFractionDigits = minFractionDigits;
      }
      if (minFractionDigits != null) {
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `value`
in `java/src/com/google/template/soy/basicdirectives/BasicEscapeDirective.java`
#### Snippet
```java
        }
        // otherwise fall through to boxing, this handles cases like 'null'
        value = value.box();
      }
      return SoyExpression.forString(javaSanitizer(SoyValue.class).invoke(value));
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `maxLen`
in `java/src/com/google/template/soy/basicdirectives/BasicDirectivesRuntime.java`
#### Snippet
```java
    if (doAddEllipsis) {
      if (maxLen > 3) {
        maxLen -= 3;
      } else {
        doAddEllipsis = false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `doAddEllipsis`
in `java/src/com/google/template/soy/basicdirectives/BasicDirectivesRuntime.java`
#### Snippet
```java
        maxLen -= 3;
      } else {
        doAddEllipsis = false;
      }
    }
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `maxLen`
in `java/src/com/google/template/soy/basicdirectives/BasicDirectivesRuntime.java`
#### Snippet
```java
    if (Character.isHighSurrogate(str.charAt(maxLen - 1))
        && Character.isLowSurrogate(str.charAt(maxLen))) {
      maxLen -= 1;
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `java/src/com/google/template/soy/basicdirectives/BasicDirectivesRuntime.java`
#### Snippet
```java

    // Truncate.
    str = str.substring(0, maxLen);

    // Add ellipsis.
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `str`
in `java/src/com/google/template/soy/basicdirectives/BasicDirectivesRuntime.java`
#### Snippet
```java
    // Add ellipsis.
    if (doAddEllipsis) {
      str += "...";
    }

```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `expression`
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomCodeVisitor.java`
#### Snippet
```java
      Expression expression, JsType currentType, JsType desiredType) {
    if (!currentType.typeExpr().equals(desiredType.typeExpr())) {
      expression = expression.castAs(desiredType.typeExpr(), desiredType.getGoogRequires());
    }
    return expression;
```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
`continue` is unnecessary as the last statement in a loop
in `java/src/com/google/template/soy/passes/MsgWithIdFunctionPass.java`
#### Snippet
```java
      for (SoyNode child : letNode.getChildren()) {
        if (child instanceof RawTextNode && ((RawTextNode) child).getRawText().isEmpty()) {
          continue;
        } else if (child instanceof MsgFallbackGroupNode) {
          if (fallbackGroupNode == null) {
```

### RuleId[ruleID=UnnecessaryContinue]
`continue` is unnecessary as the last statement in a loop
in `java/src/com/google/template/soy/incrementaldomsrc/GenIncrementalDomTemplateBodyVisitor.java`
#### Snippet
```java
    for (int i = 0; i < attrValue.numChildren(); i++) {
      if (attrValue.getChild(i) instanceof RawTextNode) {
        continue;
      } else if (attrValue.getChild(i) instanceof PrintNode) {
        PrintNode n = (PrintNode) attrValue.getChild(i);
```

## RuleId[ruleID=PrimitiveArrayArgumentToVariableArgMethod]
### RuleId[ruleID=PrimitiveArrayArgumentToVariableArgMethod]
Confusing primitive array argument to varargs method
in `java/src/com/google/template/soy/jbcsrc/shared/SaveStateMetaFactory.java`
#### Snippet
```java
      // try to find the defineClass method which is only defined in jdk9+
      Method defineClass = MethodHandles.Lookup.class.getMethod("defineClass", byte[].class);
      impl = (lookup, name, bytes) -> (Class<?>) defineClass.invoke(lookup, bytes);
    } catch (NoSuchMethodException nsme) {
      // must be pre jdk9 :( but in this case we can use Unsafe for similar purposes
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/SoyInputCache.java`
#### Snippet
```java
        public SoyAstCache astCache() {
          // null is interpreted as 'no cache' throughout the compiler.
          return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/SoyCmdLineParser.java`
#### Snippet
```java
    @Override
    public String getDefaultMetaVariable() {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyValueUnconverter.java`
#### Snippet
```java
  public static Object unconvert(SoyValueProvider provider) {
    if (provider == null) {
      return null;
    }
    SoyValue soyValue = provider.resolve();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyValueUnconverter.java`
#### Snippet
```java

  static {
    CONVERTERS.put(NullData.class, v -> null);
    CONVERTERS.put(BooleanData.class, BooleanData::getValue);
    CONVERTERS.put(IntegerData.class, IntegerData::getValue);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java
        return converter.apply(o);
      }
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyValueConverter.java`
#### Snippet
```java
          private Function<?, ?> getConverterOrNull(Class<?> clz) {
            if (clz == null) {
              return null;
            }
            return get(clz);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/ListBackedList.java`
#### Snippet
```java
  public final SoyValue get(int index) {
    SoyValueProvider valueProvider = getProvider(index);
    return (valueProvider != null) ? valueProvider.resolve() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/ListBackedList.java`
#### Snippet
```java
      return providerList.get(index);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  public SoyValue getField(String name) {
    asRecord();
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  public SoyValue getItem(SoyValue key) {
    asMap();
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  public SoyValueProvider getFieldProvider(String name) {
    asRecord();
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyProtoValue.java`
#### Snippet
```java
  public SoyValueProvider getItemProvider(SoyValue key) {
    asMap();
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/SoyMapImpl.java`
#### Snippet
```java
  public SoyValue get(SoyValue key) {
    SoyValueProvider provider = getProvider(key);
    return (provider != null) ? provider.resolve() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/LazyProtoToSoyValueMap.java`
#### Snippet
```java
  private K soyValueToKey(SoyValue soyValue) {
    if (NullData.INSTANCE.equals(soyValue)) {
      return null;
    }
    return rawKeys.computeIfAbsent(
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/ParamStore.java`
#### Snippet
```java
  public SoyValue getField(String name) {
    SoyValueProvider valueProvider = getFieldProvider(name);
    return (valueProvider != null) ? valueProvider.resolve() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/SoyLegacyObjectMapImpl.java`
#### Snippet
```java
  public SoyValue getItem(SoyValue key) {
    SoyValueProvider provider = getItemProvider(key);
    return provider != null ? provider.resolve() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/SoyRecordImpl.java`
#### Snippet
```java
    SoyValueProvider svp = map.get(name);
    if (svp == null) {
      return null;
    }
    return svp.resolve();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/internal/DictImpl.java`
#### Snippet
```java
  private SoyValue getFieldInternal(String name) {
    SoyValueProvider provider = providerMap.get(name);
    return (provider != null) ? provider.resolve() : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/restricted/CollectionData.java`
#### Snippet
```java
      SoyValue soyData = collectionData.getSingle(keys.get(i));
      if (!(soyData instanceof CollectionData)) {
        return null;
      }
      collectionData = (CollectionData) soyData;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/msgs/SoyMsgBundle.java`
#### Snippet
```java
      @Override
      public SoyMsg getMsg(long msgId) {
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/msgs/restricted/RenderOnlySoyMsgBundleImpl.java`
#### Snippet
```java
  public SoyMsg getMsg(long msgId) {
    int index = binarySearch(msgId);
    return index >= 0 ? resurrectMsg(msgId, partsForIndex(index)) : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jssrc/internal/VeLogInstrumentationVisitor.java`
#### Snippet
```java
  private static FunctionNode getLoggingFunction(CallParamNode paramNode) {
    if (!(paramNode instanceof CallParamContentNode)) {
      return null;
    }
    CallParamContentNode callParamNode = (CallParamContentNode) paramNode;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jssrc/internal/VeLogInstrumentationVisitor.java`
#### Snippet
```java
    CallParamContentNode callParamNode = (CallParamContentNode) paramNode;
    if (callParamNode.numChildren() != 1 || !(callParamNode.getChild(0) instanceof PrintNode)) {
      return null;
    }
    PrintNode printNode = (PrintNode) callParamNode.getChild(0);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jssrc/internal/VeLogInstrumentationVisitor.java`
#### Snippet
```java
    PrintNode printNode = (PrintNode) callParamNode.getChild(0);
    if (!(printNode.getExpr().getRoot() instanceof FunctionNode)) {
      return null;
    }
    FunctionNode fnNode = (FunctionNode) printNode.getExpr().getRoot();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jssrc/internal/VeLogInstrumentationVisitor.java`
#### Snippet
```java
      return fnNode;
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/types/SoyProtoEnumType.java`
#### Snippet
```java
      return value.getNumber();
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/types/TypeRegistries.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/data/SoyListData.java`
#### Snippet
```java
      return list.get(index);
    } catch (IndexOutOfBoundsException ioobe) {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/CompilingClassLoader.java`
#### Snippet
```java
    if (!name.startsWith(Names.CLASS_PREFIX)) {
      // this means we couldn't possibly compile it.
      return null;
    }
    // Remove because ClassLoader itself maintains a cache so we don't need it after loading
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/CompilingClassLoader.java`
#### Snippet
```java
    if (node == null) {
      // typo in template name?
      return null;
    }
    ClassData clazzToLoad = null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/SoyFileSet.java`
#### Snippet
```java
        () -> {
          variant.run();
          return null;
        });
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/BytecodeCompiler.java`
#### Snippet
```java

    T getResult() {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/internal/AbstractMemoryClassLoader.java`
#### Snippet
```java
  protected final URL findResource(final String name) {
    if (!name.endsWith(".class")) {
      return null;
    }
    String className = name.substring(0, name.length() - ".class".length()).replace('/', '.');
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/internal/AbstractMemoryClassLoader.java`
#### Snippet
```java
    ClassData classDef = getClassData(className);
    if (classDef == null) {
      return null;
    }
    return classDef.asUrl();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/shared/MsgDefaultConstantFactory.java`
#### Snippet
```java
                    spec -> {
                      String s = (String) spec;
                      return s.isEmpty() ? null : s;
                    });
            parts.add(new SoyMsgSelectPart(selectVarName, cases));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/restricted/CodeBuilder.java`
#### Snippet
```java
  private static String[] getInternalNames(@Nullable Type[] types) {
    if (types == null) {
      return null;
    }
    String[] names = new String[types.length];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ResolvePluginsPass.java`
#### Snippet
```java
      return BuiltinFunction.PROTO_INIT;
    }
    return null;
  }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ResolveDottedImportsPass.java`
#### Snippet
```java
              fullLocation);
      if (target == null) {
        return null;
      }
      FunctionNode function =
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ResolveDottedImportsPass.java`
#### Snippet
```java
    }

    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/CheckBadContextualUsagePass.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static Integer toBoxedInteger(SoyValue value) {
    if (value == null) {
      return null;
    }
    return value.integerValue();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static Double toBoxedDouble(SoyValue value) {
    if (value == null) {
      return null;
    } else if (value instanceof NumberData) {
      return ((NumberData) value).numberValue();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static Object unboxMapItem(SoyValue value, Class<?> type) {
    if (value == null) {
      return null;
    } else if (type == Long.class) {
      return value.longValue();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static <T> T toEnum(SoyValue value, Class<T> clazz) {
    if (value == null) {
      return null;
    }
    return getEnumValue(clazz, value.integerValue());
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static Long toBoxedLong(SoyValue value) {
    if (value == null) {
      return null;
    }
    return value.longValue();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static Float toBoxedFloat(SoyValue value) {
    if (value == null) {
      return null;
    } else if (value instanceof NumberData) {
      return (float) ((NumberData) value).numberValue();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/jbcsrc/runtime/JbcSrcRuntime.java`
#### Snippet
```java
  public static Boolean toBoxedBoolean(SoyValue value) {
    if (value == null) {
      return null;
    }
    return value.coerceToBoolean();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/LocalVariablesNodeVisitor.java`
#### Snippet
```java
      // Only local template references may begin with '.'
      if (defn != null && varRef.originallyLeadingDot() && defn.kind() != Kind.TEMPLATE) {
        return null;
      }
      return defn;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ValidateAliasesPass.java`
#### Snippet
```java
      return ((SoyProtoEnumType) type).getDescriptor().getFullName();
    } else {
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
    if (!(startNode instanceof HtmlOpenTagNode) || !((HtmlOpenTagNode) startNode).isSlot()) {
      errorReporter.report(startNode.getSourceLocation(), ONLY_SLOTS_ALLOWED);
      return null;
    }
    HtmlOpenTagNode nextOpenTag = (HtmlOpenTagNode) startNode;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
    if (nextOpenTag.numChildren() != 2) {
      errorReporter.report(nextOpenTag.getSourceLocation(), NO_ATTRIBUTES_ON_SLOT);
      return null;
    }
    if (nextOpenTag.getTaggedPairs().size() > 1) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
    if (nextOpenTag.getTaggedPairs().size() > 1) {
      errorReporter.report(nextOpenTag.getSourceLocation(), SLOTS_ONLY_ONE_CLOSE_TAG);
      return null;
    }
    HtmlAttributeNode attributeNode = (HtmlAttributeNode) nextOpenTag.getChild(1);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
        || attributeNode.getStaticContent() == null) {
      errorReporter.report(attributeNode.getSourceLocation(), NO_ATTRIBUTES_ON_SLOT);
      return null;
    }
    TemplateType templateType = (TemplateType) template.getType();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
        if (calleeMetadata == null) {
          template.setHtmlElementMetadata(DEFAULT_HTML_METADATA);
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    TagName tagName = openTag.getTagName();
    if (tagName.isStatic()) {
      return null;
    }
    PrintNode printNode = tagName.getDynamicTagName();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    if (!(exprNode.getKind() == ExprNode.Kind.METHOD_CALL_NODE
        && ((MethodCallNode) exprNode).getMethodName().identifier().equals("bind"))) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
    MethodCallNode bind = (MethodCallNode) exprNode;
    if (bind.getChild(0).getKind() != ExprNode.Kind.TEMPLATE_LITERAL_NODE) {
      return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/passes/SoyElementPass.java`
#### Snippet
```java
      }
      template.setHtmlElementMetadata(DEFAULT_HTML_METADATA);
      return null;
    }
    visited.add(template);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/shared/SoyAstCache.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
        checkState(this.defaultValue == null);
        this.defaultValue = checkNotNull(defaultValue);
        return null;
      }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/plugin/java/internal/CompiledJarsPluginSignatureReader.java`
#### Snippet
```java
              classIsInterface,
              methodType.getReturnType().getClassName()));
      return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
                    return ((SoyProtoEnumType) type).getDescriptorExpression();
                  }
                  return null;
                })
            .filter(Objects::nonNull);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
                  return ((SoyProtoEnumType) type).getDescriptorExpression();
                default:
                  return null;
              }
            })
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/TagName.java`
#### Snippet
```java
      return ((TemplateContentKind.ElementContentKind) templateType.getContentKind()).getTagName();
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/HtmlOpenTagNode.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/TemplateBasicNode.java`
#### Snippet
```java
  /** Returns the CommandTagAttribute, if it's an expression. */
  private Optional<CommandTagAttribute> getCommandTagAttributeExpr(String name) {
    return getCommandTagAttribute(name).map(a -> a.hasExprValue() ? a : null);
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
    ParentNode<?> parent = node.getParent();
    if (parent == null) {
      return null;
    }
    int index = parent.getChildIndex(node);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
    Preconditions.checkState(index >= 0);
    int nextIndex = index + 1;
    return parent.numChildren() > nextIndex ? parent.getChild(nextIndex) : null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
  public static HtmlTagNode getNodeAsHtmlTagNode(SoyNode node, boolean openTag) {
    if (node == null) {
      return null;
    }
    SoyNode.Kind tagKind =
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/SoyTreeUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/basetree/AbstractNode.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/basetree/AbstractNodeVisitor.java`
#### Snippet
```java
  public R exec(N node) {
    visit(node);
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/internal/i18n/SoyBidiUtils.java`
#### Snippet
```java
  public static BidiGlobalDir decodeBidiGlobalDirFromPyOptions(String bidiIsRtlFn) {
    if (bidiIsRtlFn == null || bidiIsRtlFn.isEmpty()) {
      return null;
    }
    int dotIndex = bidiIsRtlFn.lastIndexOf('.');
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/internal/i18n/SoyBidiUtils.java`
#### Snippet
```java
    if (bidiGlobalDir == 0) {
      if (!useGoogIsRtlForBidiGlobalDir) {
        return null;
      }
      return BidiGlobalDir.forIsRtlCodeSnippet(
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java
      return fieldDescriptor.getOptions().getJstype();
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/conformance/BanFragmentNavigation.java`
#### Snippet
```java
        case TEMPLATE_DELEGATE_NODE:
        case TEMPLATE_ELEMENT_NODE:
          return null;
        case HTML_OPEN_TAG_NODE:
          return (HtmlOpenTagNode) parent;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soytree/TemplateNode.java`
#### Snippet
```java

    public String getModName() {
      return modNameDeclaration == null ? null : modNameDeclaration.name().identifier();
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/javagencode/javatypes/FutureJavaType.java`
#### Snippet
```java
  @Override
  String asGenericsTypeArgumentString() {
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/ContextualAutoescaper.java`
#### Snippet
```java
    }
    if (errorReporter.hasErrors()) {
      return null;
    }
    return inferences;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
        TemplateNode template, TemplateParam param) {
      if (param.isInjected()) {
        return null; // can't validate injected parameters
      }
      if (!param.type().getKind().isKnownSanitizedContent()) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
      }
      if (!param.type().getKind().isKnownSanitizedContent()) {
        return null; // only care about sanitized types
      }
      if (SoyTreeUtils.allNodesOfType(template.getParent(), TemplateLiteralNode.class)
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
        // If a template is passed around into other templates, we cannot be sure of the trusted
        // content kind.
        return null;
      }
      SanitizedContentKind expectedKind = ((SanitizedType) param.type()).getContentKind();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
      // if they are all passing the parameter with a consistent kind
      if (template.getVisibility() != Visibility.PRIVATE) {
        return null; // can only find all callers for private templates
      }
      for (CallBasicNode callNode :
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Rewriter.java`
#### Snippet
```java
            && callNode.getCalleeName().equals(template.getTemplateName())
            && !doesCallPassCompatibleContentForParameter(callNode, expectedKind, param.name())) {
          return null;
        }
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/parsepasses/contextautoesc/InferenceEngine.java`
#### Snippet
```java
    private SanitizedContentKind getCommonContentKindIfStrict(List<TemplateType> templates) {
      if (templates.isEmpty()) {
        return null;
      }
      TemplateContentKind contentKind = templates.get(0).getContentKind();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyExprVisitor.java`
#### Snippet
```java
        return IntegerData.forValue(((ProtoEnumValueNode) expr).getValue());
      case GLOBAL_NODE:
        return null;
      default:
        return null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyExprVisitor.java`
#### Snippet
```java
        return null;
      default:
        return null;
    }
  }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyExprVisitor.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
      switch (finalState) {
        case PCDATA: // we could suggest for this one based on the start state maybe?
          return null; // no suggestion
        case BEFORE_ATTRIBUTE_VALUE:
          return "Expected an attribute value before the end of the block";
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
            return "Did you forget to close the tag?";
          }
          return null;
        case NONE: // should be impossible, there are no transitions into NONE from non-NONE
      }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/sharedpasses/opti/SimplifyVisitor.java`
#### Snippet
```java
  private static SoyValue getConstantOrNull(ExprRootNode exprRoot) {
    if (exprRoot == null) {
      return null;
    }
    ExprNode expr = exprRoot.getRoot();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/sharedpasses/render/TofuValueFactory.java`
#### Snippet
```java
                  + "]");
        }
        return null;
      } else if (isExternApi && type == Object.class) {
        return SoyValueUnconverter.unconvert(value);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
  public static IntegerData parseInt(String str, int radix) {
    if (radix < 2 || radix > 36) {
      return null;
    }
    Long l = Longs.tryParse(str, radix);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
    }
    Long l = Longs.tryParse(str, radix);
    return (l == null) ? null : IntegerData.forValue(l);
  }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
  public static FloatData parseFloat(String str) {
    Double d = Doubles.tryParse(str);
    return (d == null || d.isNaN()) ? null : FloatData.forValue(d);
  }

```

## RuleId[ruleID=AssignmentToLambdaParameter]
### RuleId[ruleID=AssignmentToLambdaParameter]
Assignment to lambda parameter `v`
in `java/src/com/google/template/soy/passes/ResolveDottedImportsPass.java`
#### Snippet
```java
            v -> {
              while (v != null) {
                v = inlineNode(v);
              }
            });
```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `impl` is redundant
in `java/src/com/google/template/soy/error/ErrorReporter.java`
#### Snippet
```java
   */
  public final boolean errorsSince(Checkpoint checkpoint) {
    Checkpoint impl = checkpoint;
    if (impl.owner != this) {
      throw new IllegalArgumentException(
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `caseBlockStart` is redundant
in `java/src/com/google/template/soy/jbcsrc/TemplateAnalysisImpl.java`
#### Snippet
```java
      Block previous = this.current;
      for (Case<?> caseOrDefault : cases) {
        Block caseBlockStart = previous.addBranch();
        this.current = caseBlockStart;
        evaluateMsgParts(msgNode, caseOrDefault.parts(), placeholderBlocks);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `prev` is redundant
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
      T add(String mod, T value) {
        checkArgument(!mod.isEmpty());
        T prev = modToValue.put(mod, checkNotNull(value));
        return prev;
      }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `instance` is redundant
in `java/src/com/google/template/soy/internal/proto/ProtoUtils.java`
#### Snippet
```java

  private static final ExtensionRegistry createRegistry() {
    ExtensionRegistry instance = ExtensionRegistry.newInstance();
    // Add extensions needed for parsing descriptors here.
    return instance;
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `name` is redundant
in `java/src/com/google/template/soy/internal/proto/JavaQualifiedNames.java`
#### Snippet
```java

  private static String classNameWithoutPackage(Descriptor descriptor, ProtoFlavor flavor) {
    String name = stripPackageName(descriptor.getFullName(), descriptor.getFile());
    return name;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `biggerLineLengthsArr` is redundant
in `java/src/com/google/template/soy/soyparse/SoySimpleCharStream.java`
#### Snippet
```java
    // Increase the size of the array, if necessary.
    if (line >= lineLengths.length) {
      int[] biggerLineLengthsArr =
          Arrays.copyOf(lineLengths, Math.max(lineLengths.length, line) + 2048);
      lineLengths = biggerLineLengthsArr;
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `result` is redundant
in `java/src/com/google/template/soy/javagencode/GenerateParseInfoVisitor.java`
#### Snippet
```java
   */
  private String convertToUpperUnderscore(String ident) {
    String result = convertedIdents.computeIfAbsent(ident, BaseUtils::convertToUpperUnderscore);
    return result;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `node` is redundant
in `java/src/com/google/template/soy/soyparse/HtmlRewriter.java`
#### Snippet
```java
      // characters and then validate the text afterwards.
      advanceWhileMatches(TAG_DELIMITER_MATCHER);
      RawTextNode node = consumeAsRawText();
      return node;
    }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `result` is redundant
in `java/src/com/google/template/soy/parsepasses/contextautoesc/Context.java`
#### Snippet
```java
          "Unable to parse context \"" + text + "\". Unparsed portion: " + parts);
    }
    Context result = builder.build();
    return result;
  }
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `markAfterKnownDir` is redundant
in `java/src/com/google/template/soy/bidifunctions/BidiFunctionsRuntime.java`
#### Snippet
```java
    }

    String markAfterKnownDir =
        BidiFormatter.getInstance(bidiGlobalDir.toDir())
            .markAfter(valueDir, value.coerceToString(), isHtml);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `wrappedValue` is redundant
in `java/src/com/google/template/soy/bididirectives/BidiDirectivesRuntime.java`
#### Snippet
```java
    // calling |bidiSpanWrap because BidiSpanWrapDirective implements SanitizedContentOperator,
    // but this does not mean that the input has to be HTML SanitizedContent.
    String wrappedValue =
        bidiFormatter.spanWrap(valueDir, value.coerceToString(), /* isHtml= */ true);

```

## RuleId[ruleID=CopyConstructorMissesField]
### RuleId[ruleID=CopyConstructorMissesField]
Copy constructor does not copy field 'namespace'
in `java/src/com/google/template/soy/soytree/SoyFileNode.java`
#### Snippet
```java
    }

    private CssPath(CssPath origin) {
      this.sourcePath = origin.sourcePath;
      this.resolvedPath = origin.resolvedPath;
```

## RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[a-z0-9_$:-]*)`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
                  + "(?:action|archive|background|cite|classid|codebase|content|data|dsync|href"
                  + "|http-equiv|longdesc|style|usemap)\\s*$)"
                  + "(?:"
                  // Must match letters
                  + "[a-z0-9_$:-]*"
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:[_a-z0-9-]+)`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
                + "(?:(?:"
                + // A latin class name or ID, CSS identifier, hex color or unicode range.
                "[.#]?-?(?:[_a-z0-9-]+)(?:-[_a-z0-9-]+)*-?|"
                + // A CSS function call. This allows the same characters as
                // except for / and *, because those can make comments which we want to exclude, but
```

### RuleId[ruleID=RegExpUnnecessaryNonCapturingGroup]
Unnecessary non-capturing group `(?:missingValue)`
in `java/src/com/google/template/soy/shared/internal/EscapingConventions.java`
#### Snippet
```java
                // except for / and *, because those can make comments which we want to exclude, but
                // don't have an easy way of doing that in this regex.
                "(?:"
                + Joiner.on('|').join(ALLOWED_CSS_FUNCTIONS)
                + ")\\([- \t,+.!#%_0-9a-zA-Z]+\\)|"
```

## RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
### RuleId[ruleID=EqualsWhichDoesntCheckParameterClass]
`equals()` should check the class of its parameter
in `java/src/com/google/template/soy/data/restricted/StringData.java`
#### Snippet
```java

  @Override
  public boolean equals(Object other) {
    // Keep this in sync with UnsanitizedString#equals so that StringData and UnsanitizedString can
    // be used interchangeably.
```

## RuleId[ruleID=UnstableApiUsage]
### RuleId[ruleID=UnstableApiUsage]
'asByteSource(java.nio.charset.Charset)' is marked unstable with @Beta
in `java/src/com/google/template/soy/SoyParseInfoGenerator.java`
#### Snippet
```java
          writer.writeEntry(
              resourcePath + genFile.fileName(),
              contentsWithKytheComment(genFile, false).asByteSource(UTF_8));
        }
      }
```

### RuleId[ruleID=UnstableApiUsage]
'asMap(com.google.common.collect.SetMultimap)' is marked unstable with @Beta
in `java/src/com/google/template/soy/AbstractSoyCompiler.java`
#### Snippet
```java
    }
    for (Map.Entry<String, Set<CacheLoaders.CachedDescriptorSet>> entry :
        Multimaps.asMap(protoFileToDescriptor).entrySet()) {
      if (entry.getValue().size() > 1) {
        err.println(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.base.Utf8' is marked unstable with @Beta
in `java/src/com/google/template/soy/base/internal/IndentedLinesBuilder.java`
#### Snippet
```java
  private void appendInternal(String s) {
    sb.append(s);
    byteLength += Utf8.encodedLength(s);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `java/src/com/google/template/soy/base/internal/IndentedLinesBuilder.java`
#### Snippet
```java
  private void appendInternal(String s) {
    sb.append(s);
    byteLength += Utf8.encodedLength(s);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        } else {
          checkState(
```

### RuleId[ruleID=UnstableApiUsage]
'asCharSink(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        } else {
          checkState(
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.io.MoreFiles' is marked unstable with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        }

```

### RuleId[ruleID=UnstableApiUsage]
'asCharSink(java.nio.file.Path, java.nio.charset.Charset, java.nio.file.OpenOption...)' is declared in unstable class 'com.google.common.io.MoreFiles' marked with @Beta
in `java/src/com/google/template/soy/PerInputOutputFiles.java`
#### Snippet
```java
            continue;
          }
          MoreFiles.asCharSink(outputPath, UTF_8).write(contents);
        }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return StringData.forValue(UnsignedLongs.toString((Long) field));
        }

```

### RuleId[ruleID=UnstableApiUsage]
'toString(long)' is declared in unstable class 'com.google.common.primitives.UnsignedLongs' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return StringData.forValue(UnsignedLongs.toString((Long) field));
        }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return IntegerData.forValue(UnsignedInts.toLong(((Number) field).intValue()));
        }

```

### RuleId[ruleID=UnstableApiUsage]
'toLong(int)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public SoyValue soyFromProto(Object field) {
          return IntegerData.forValue(UnsignedInts.toLong(((Number) field).intValue()));
        }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedInts.saturatedCast(field.longValue());
        }
      };
```

### RuleId[ruleID=UnstableApiUsage]
'saturatedCast(long)' is declared in unstable class 'com.google.common.primitives.UnsignedInts' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedInts.saturatedCast(field.longValue());
        }
      };
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedLongs.parseUnsignedLong(field.stringValue());
        }
      };
```

### RuleId[ruleID=UnstableApiUsage]
'parseUnsignedLong(java.lang.String)' is declared in unstable class 'com.google.common.primitives.UnsignedLongs' marked with @Beta
in `java/src/com/google/template/soy/data/ProtoFieldInterpreter.java`
#### Snippet
```java
        @Override
        public Object protoFromSoy(SoyValue field) {
          return UnsignedLongs.parseUnsignedLong(field.stringValue());
        }
      };
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
      prepareDataForBuild();
      ImmutableMap.Builder<String, SoyValueProvider> finalDataBuilder =
          ImmutableMap.<String, SoyValueProvider>builderWithExpectedSize(data.size());
      // Use forEach instead of looping over the entry set to avoid allocating entrySet+entry
      // objects
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
      checkArgument((more.length % 2) == 0);
      ImmutableMap.Builder<String, SoyValueProvider> map =
          ImmutableMap.<String, SoyValueProvider>builderWithExpectedSize(1 + more.length / 2)
              .put(firstKey, firstValue);
      for (int i = 0; i < more.length; i += 2) {
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
        Map<?, V> map, Function<? super V, ? extends SoyValueProvider> valueMapper) {
      ImmutableMap.Builder<String, SoyValueProvider> builder =
          ImmutableMap.builderWithExpectedSize(map.size());
      for (Map.Entry<?, V> entry : map.entrySet()) {
        // coerce key to a string, legacy object maps always coerce keys to strings.
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/data/BaseSoyTemplateImpl.java`
#### Snippet
```java
        Function<? super V, ? extends SoyValueProvider> valueMapper) {
      ImmutableMap.Builder<SoyValue, SoyValueProvider> builder =
          ImmutableMap.builderWithExpectedSize(map.size());
      map.forEach((k, v) -> builder.put(keyMapper.apply(k), valueMapper.apply(v)));
      return SoyMapImpl.forProviderMap(builder.build());
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Optional)' is marked unstable with @Beta
in `java/src/com/google/template/soy/jssrc/internal/GenJsCodeVisitor.java`
#### Snippet
```java
    node.getExterns().stream()
        .map(ExternNode::getJsImpl)
        .flatMap(Streams::stream)
        .forEach(
            jsExtern -> {
```

### RuleId[ruleID=UnstableApiUsage]
'asByteSource(java.nio.charset.Charset)' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/BytecodeCompiler.java`
#### Snippet
```java
        writer.writeEntry(
            Names.javaFileName(namespace, fileName),
            files.get(file.getFilePath()).asCharSource().asByteSource(UTF_8));
      }
    }
```

### RuleId[ruleID=UnstableApiUsage]
'asByteSource(java.nio.charset.Charset)' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/api/PluginRuntimeInstanceInfo.java`
#### Snippet
```java
      builder.append(plugin.toMetaInfEntry());
    }
    return CharSource.wrap(builder.toString()).asByteSource(UTF_8);
  }

```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(UnsignedLongs.class, "parseUnsignedLong", String.class).asCheap();
  public static final MethodRef UNSIGNED_LONGS_TO_STRING =
      create(UnsignedLongs.class, "toString", long.class).asCheap().asNonNullable();
  public static final MethodRef UNSIGNED_INTS_SATURATED_CAST =
      create(UnsignedInts.class, "saturatedCast", long.class).asCheap();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(UnsignedLongs.class, "toString", long.class).asCheap().asNonNullable();
  public static final MethodRef UNSIGNED_INTS_SATURATED_CAST =
      create(UnsignedInts.class, "saturatedCast", long.class).asCheap();
  public static final MethodRef UNSIGNED_INTS_TO_LONG =
      create(UnsignedInts.class, "toLong", int.class).asCheap();
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedInts' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(UnsignedInts.class, "saturatedCast", long.class).asCheap();
  public static final MethodRef UNSIGNED_INTS_TO_LONG =
      create(UnsignedInts.class, "toLong", int.class).asCheap();

  public static final MethodRef LONG_TO_STRING = create(Long.class, "toString", long.class);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.primitives.UnsignedLongs' is marked unstable with @Beta
in `java/src/com/google/template/soy/jbcsrc/restricted/MethodRef.java`
#### Snippet
```java
      create(Long.class, "parseLong", String.class).asCheap().asNonNullable();
  public static final MethodRef UNSIGNED_LONGS_PARSE_UNSIGNED_LONG =
      create(UnsignedLongs.class, "parseUnsignedLong", String.class).asCheap();
  public static final MethodRef UNSIGNED_LONGS_TO_STRING =
      create(UnsignedLongs.class, "toString", long.class).asCheap().asNonNullable();
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/passes/ResolveExpressionTypesCrossTemplatePass.java`
#### Snippet
```java
                    .forEach(
                        templateNode ->
                            stream(SoyTypes.getTypeTraverser(templateNode.getType(), null))
                                .filter(t -> t.getKind() == SoyType.Kind.TEMPLATE)
                                .map(TemplateType.class::cast)
```

### RuleId[ruleID=UnstableApiUsage]
'newCustomTable(java.util.Map\>, com.google.common.base.Supplier\>)' is marked unstable with @Beta
in `java/src/com/google/template/soy/shared/internal/DelTemplateSelector.java`
#### Snippet
```java
  public static final class Builder<T> {
    private final Table<String, String, Group.Builder<T>> nameAndVariantToGroup =
        Tables.newCustomTable(new LinkedHashMap<>(), LinkedHashMap::new);

    /** Adds the default template (not associated with any mod or variant). */
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/shared/internal/gencode/JavaGenerationUtils.java`
#### Snippet
```java
  /** Recursively search for protocol buffer types within the given type. */
  private static Stream<String> findProtoTypes(SoyType root, SoyTypeRegistry typeRegistry) {
    return stream(typeIterator(root, typeRegistry))
        .map(
            type -> {
```

### RuleId[ruleID=UnstableApiUsage]
'asMap(com.google.common.collect.ListMultimap)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/AstEdits.java`
#### Snippet
```java
    }
    for (Map.Entry<ParentSoyNode<StandaloneNode>, List<StandaloneNode>> entry :
        asMap(newChildren).entrySet()) {
      entry.getKey().addChildren(entry.getValue());
    }
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
      ImmutableList<DataAllCallSituation> callSituationList, SoyFileNode fileNode) {
    ImmutableList.Builder<DataAllCallSituationP> builder =
        ImmutableList.builderWithExpectedSize(callSituationList.size());
    for (DataAllCallSituation call : callSituationList) {
      builder.add(
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
      List<DataAllCallSituationP> callSituationList, SoyFileP fileProto) {
    ImmutableList.Builder<DataAllCallSituation> builder =
        ImmutableList.builderWithExpectedSize(callSituationList.size());
    for (DataAllCallSituationP call : callSituationList) {
      String templateName = call.getTemplateName();
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadataSerializer.java`
#### Snippet
```java
      ErrorReporter errorReporter) {
    ImmutableList.Builder<Parameter> builder =
        ImmutableList.builderWithExpectedSize(parameterList.size());
    for (ParameterP parameter : parameterList) {
      builder.add(
```

### RuleId[ruleID=UnstableApiUsage]
'trueFirst()' is marked unstable with @Beta
in `java/src/com/google/template/soy/soytree/TemplateMetadata.java`
#### Snippet
```java
  private static ImmutableList<Parameter> directParametersFromTemplate(TemplateNode node) {
    return node.getParams().stream()
        .sorted(comparing(TemplateParam::isRequired, trueFirst()))
        .filter(p -> !p.isImplicit())
        .map(TemplateMetadata::parameterFromTemplateParam)
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.base.Utf8' is marked unstable with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    // Count backwards from end. ilb may insert whitespace before line.
    int endingLength = ilb.getByteLength();
    int partStart = endingLength - Utf8.encodedLength(line) - /* newline */ (fullLine ? 1 : 0);

    List<Span> spans = new ArrayList<>(parts.length);
```

### RuleId[ruleID=UnstableApiUsage]
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    // Count backwards from end. ilb may insert whitespace before line.
    int endingLength = ilb.getByteLength();
    int partStart = endingLength - Utf8.encodedLength(line) - /* newline */ (fullLine ? 1 : 0);

    List<Span> spans = new ArrayList<>(parts.length);
```

### RuleId[ruleID=UnstableApiUsage]
'com.google.common.base.Utf8' is marked unstable with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    List<Span> spans = new ArrayList<>(parts.length);
    for (String part : parts) {
      int partEnd = partStart + Utf8.encodedLength(part) - 1;
      spans.add(new Span(partStart, partEnd));
      partStart = partEnd + 1;
```

### RuleId[ruleID=UnstableApiUsage]
'encodedLength(java.lang.CharSequence)' is declared in unstable class 'com.google.common.base.Utf8' marked with @Beta
in `java/src/com/google/template/soy/javagencode/KytheHelper.java`
#### Snippet
```java
    List<Span> spans = new ArrayList<>(parts.length);
    for (String part : parts) {
      int partEnd = partStart + Utf8.encodedLength(part) - 1;
      spans.add(new Span(partStart, partEnd));
      partStart = partEnd + 1;
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/javagencode/SoyFileNodeTransformer.java`
#### Snippet
```java

  private static boolean hasProtoDep(SoyType type) {
    return Streams.stream(SoyTypes.getTypeTraverser(type, null))
        .anyMatch(t -> t.getKind() == Kind.PROTO || t.getKind() == Kind.PROTO_ENUM);
  }
```

### RuleId[ruleID=UnstableApiUsage]
'stream(java.util.Iterator)' is marked unstable with @Beta
in `java/src/com/google/template/soy/javagencode/javatypes/JavaTypeUtils.java`
#### Snippet
```java

    // No records of records.
    if (Streams.stream(SoyTypes.getTypeTraverser(recordType, null))
        .anyMatch(t -> t.getKind() == Kind.RECORD && t != recordType)) {
      return ImmutableList.of();
```

### RuleId[ruleID=UnstableApiUsage]
'tryParse(java.lang.String, int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
      return null;
    }
    Long l = Longs.tryParse(str, radix);
    return (l == null) ? null : IntegerData.forValue(l);
  }
```

### RuleId[ruleID=UnstableApiUsage]
'builderWithExpectedSize(int)' is marked unstable with @Beta
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java
    // if step does not evenly divide length add +1 to account for the fact that we always add start
    int size = length / step + (length % step == 0 ? 0 : 1);
    ImmutableList.Builder<IntegerData> list = ImmutableList.builderWithExpectedSize(size);
    if (step > 0) {
      for (int i = start; i < end; i += step) {
```

### RuleId[ruleID=UnstableApiUsage]
'tryParse(java.lang.String)' is marked unstable with @Beta
in `java/src/com/google/template/soy/basicfunctions/BasicFunctionsRuntime.java`
#### Snippet
```java

  public static FloatData parseFloat(String str) {
    Double d = Doubles.tryParse(str);
    return (d == null || d.isNaN()) ? null : FloatData.forValue(d);
  }
```

