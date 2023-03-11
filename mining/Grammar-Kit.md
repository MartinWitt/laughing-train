# Grammar-Kit 
 
# Bad smells
I found 334 bad smells with 25 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 55 | false |
| ReturnNull | 44 | false |
| PatternVariableCanBeUsed | 28 | false |
| KeySetIterationMayUseEntrySet | 26 | false |
| AssignmentToMethodParameter | 26 | false |
| DynamicRegexReplaceableByCompiledPattern | 24 | false |
| NestedAssignment | 17 | false |
| UnstableApiUsage | 15 | false |
| AssignmentToForLoopParameter | 13 | false |
| UtilityClassWithoutPrivateConstructor | 12 | true |
| DataFlowIssue | 11 | false |
| NonShortCircuitBoolean | 10 | false |
| SizeReplaceableByIsEmpty | 9 | true |
| ClassCanBeRecord | 8 | false |
| ConstantValue | 5 | false |
| CommentedOutCode | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| Java8MapApi | 3 | false |
| MagicConstant | 2 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| StringEqualsEmptyString | 2 | false |
| DialogTitleCapitalization | 2 | false |
| RedundantFieldInitialization | 2 | false |
| RedundantImplements | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| FieldMayBeStatic | 1 | false |
| NonSerializableFieldInSerializableClass | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ThrowablePrintStackTrace | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| EmptyMethod | 1 | false |
| EqualsAndHashcode | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `psiLocal` may be 'static'
in `src/org/intellij/grammar/generator/Names.java`
#### Snippet
```java
  public final String priority;
  public final String metaParamPrefix;
  public final String psiLocal = "p";

  private Names(String builder,
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: Font.PLAIN, Font.BOLD, Font.ITALIC or their combination
in `src/org/intellij/grammar/editor/BnfSyntaxHighlighter.java`
#### Snippet
```java
  public static final TextAttributesKey RECOVER_MARKER = createTextAttributesKey("BNF_RECOVER_MARKER");
  public static final TextAttributesKey PIN_MARKER = createTextAttributesKey(
    "BNF_PIN", new TextAttributes(null, null, DefaultLanguageHighlighterColors.LINE_COMMENT.getDefaultAttributes().getForegroundColor(), EffectType.BOLD_DOTTED_LINE, 0));

  @Override
```

### MagicConstant
Should be one of: PsiModifier.PUBLIC, PsiModifier.PROTECTED, PsiModifier.PRIVATE, PsiModifier.STATIC, ...
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public boolean isPublic(@Nullable NavigatablePsiElement element) {
      return element instanceof PsiModifierListOwner && ((PsiModifierListOwner)element).hasModifierProperty("public");
    }

```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `BnfExpressionOptimizer` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
 * @author gregsh
 */
public class BnfExpressionOptimizer {
  public static void optimize(@NotNull Project project, @NotNull PsiElement element) {
    LinkedList<PsiElement> list = new LinkedList<>();
```

### UtilityClassWithoutPrivateConstructor
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
 * @noinspection UseOfSystemOutOrSystemErr
 */
public class Main {
  public static void main(String[] args) {
    if (args.length < 2) {
```

### UtilityClassWithoutPrivateConstructor
Class `Init` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
  }

  public static class Init {

    public static void initExtensions(MockApplication application, @NotNull MockProject project) {
```

### UtilityClassWithoutPrivateConstructor
Class `LightPsi` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
 * @noinspection UseOfSystemOutOrSystemErr
 */
public class LightPsi {

  private static final MyParsing ourParsing;
```

### UtilityClassWithoutPrivateConstructor
Class `FileGeneratorUtil` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/actions/FileGeneratorUtil.java`
#### Snippet
```java
 * @author gregsh
 */
public class FileGeneratorUtil {
  public static @NotNull VirtualFile getTargetDirectoryFor(@NotNull Project project,
                                                           @NotNull VirtualFile sourceFile,
```

### UtilityClassWithoutPrivateConstructor
Class `JFlexPsiElementFactory` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/jflex/psi/JFlexPsiElementFactory.java`
#### Snippet
```java
 * @author gregsh
 */
public class JFlexPsiElementFactory {

  private static PsiFile createFile(@NotNull Project project, @NotNull String text) {
```

### UtilityClassWithoutPrivateConstructor
Class `GrammarUtil` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
 * @author gregsh
 */
public class GrammarUtil {

  public static final BnfExpression[] EMPTY_EXPRESSIONS_ARRAY = new BnfExpression[0];
```

### UtilityClassWithoutPrivateConstructor
Class `LiveHooksHelper` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/livePreview/LiveHooksHelper.java`
#### Snippet
```java
 * @author gregsh
 */
public class LiveHooksHelper {

  public static void registerHook(PsiBuilder builder, String name, String value) {
```

### UtilityClassWithoutPrivateConstructor
Class `GrammarPsiImplUtil` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/psi/impl/GrammarPsiImplUtil.java`
#### Snippet
```java
 * @author gregsh
 */
public class GrammarPsiImplUtil {
  public static PsiReference @NotNull [] getReferences(BnfListEntry o) {
    BnfAttr attr = PsiTreeUtil.getParentOfType(o, BnfAttr.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ParserGeneratorUtil` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
 *         Date: 16.07.11 10:41
 */
public class ParserGeneratorUtil {
  private static final String RESERVED_SUFFIX = "_$";
  private static final Set<String> JAVA_RESERVED =
```

### UtilityClassWithoutPrivateConstructor
Class `Rule` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static class Rule {

    public static boolean isPrivate(BnfRule node) {
```

### UtilityClassWithoutPrivateConstructor
Class `ExpressionGeneratorHelper` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/generator/ExpressionGeneratorHelper.java`
#### Snippet
```java
 * @author greg
 */
public class ExpressionGeneratorHelper {

  private static final ConsumeType CONSUME_TYPE_OVERRIDE = ConsumeType.SMART;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `child` might be null
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
        IElementType type2 = ParserGeneratorUtil.getEffectiveType(child);
        if (type1 == type2) {
          list.add(cur.replace(child));
        }
        else if (type1 == BnfTypes.BNF_OP_OPT && type2 == BnfTypes.BNF_OP_ONEMORE ||
```

### DataFlowIssue
Argument `element` might be null
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
        }
        else if (!meta && !metaRuleRef) {
          inlineExpressionUsage(myProject, element, expression);
        }
      }
```

### DataFlowIssue
Method invocation `getModifierList` may produce `NullPointerException`
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
    inlineExpressionUsage(project, (BnfExpression)parent, expression);
    if (!(parent instanceof BnfExternalExpression)) {
      for (BnfModifier modifier : rule.getModifierList()) {
        if (modifier.getText().equals("external")) {
          modifier.getNextSibling().delete(); // whitespace
```

### DataFlowIssue
The call to 'rethrowAllAsUnchecked' always fails, according to its method contracts
in `src/org/intellij/grammar/refactor/BnfIntroduceTokenHandler.java`
#### Snippet
```java
            }
            catch (StartMarkAction.AlreadyStartedException e) {
              ExceptionUtil.rethrowAllAsUnchecked(e);
            }
          });
```

### DataFlowIssue
Argument `context.getEditor()` might be null
in `src/org/intellij/grammar/refactor/BnfIntroduceTokenHandler.java`
#### Snippet
```java
        @Override
        public @Nullable Result calculateResult(ExpressionContext context) {
          TemplateState state = TemplateManagerImpl.getTemplateState(context.getEditor());
          assert state != null;
          TextResult text = Objects.requireNonNull(state.getVariableValue("TokenText"));
```

### DataFlowIssue
Argument `stream` might be null
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
    StringWriter out = new StringWriter();
    InputStream stream = getClass().getResourceAsStream("/templates/lexer.flex.template");
    ve.evaluate(context, out, "lexer.flex.template", new InputStreamReader(stream));
    return StringUtil.convertLineSeparators(out.toString());
  }
```

### DataFlowIssue
Method invocation `getTokenType` may produce `NullPointerException`
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java

        if (priority_ <  priority &&
            (operator.arg1 == null || ((LighterASTNode)left_marker_).getTokenType() == getRuleElementType(operator.arg1)) &&
            generateNodeCall(builder, level, info.rootRule, operator.operator, getNextName(operator.rule.getName(), 0), Collections.emptyMap())) {

```

### DataFlowIssue
Method invocation `precede` may produce `NullPointerException`
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
          }
          marker_.drop();
          left_marker_.precede().done(elementType);
          marker_ = null;
          if (!empty_element_parsed_guard_(builder, info.rootRule.getName(), pos)) break main;
```

### DataFlowIssue
Argument `elementType` might be null
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
          }
          marker_.drop();
          left_marker_.precede().done(elementType);
          marker_ = null;
          if (!empty_element_parsed_guard_(builder, info.rootRule.getName(), pos)) break main;
```

### DataFlowIssue
Method invocation `resolve` may produce `NullPointerException`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
          if (e instanceof BnfExternalExpression) {
            if (params == null) {
              BnfRule metaRule = (BnfRule)ruleRef.getReference().resolve();
              if (metaRule == null) {
                LOG.error("ruleRef:" + ruleRef.getText() +", metaResult:" + metaResults);
```

### DataFlowIssue
Argument `rule` might be null
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    if (!G.generateTokenTypes) {
      // add parser static imports hoping external token constants are there
      for (RuleMethodsHelper.MethodInfo methodInfo : myRulesMethodsHelper.getFor(rule)) {
        if (methodInfo.rule == null && !StringUtil.isEmpty(methodInfo.name)) {
          for (String s : getRootAttribute(myFile, KnownAttribute.PARSER_IMPORTS).asStrings()) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/org/intellij/grammar/editor/BnfExpressionMarkerAnnotator.java`
#### Snippet
```java
    BnfRule rule = (BnfRule) psiElement;
    // todo
    //boolean expression = ExpressionGeneratorHelper.getInfoForExpressionParsing(ExpressionHelper.getCached((BnfFile)rule.getContainingFile()), rule) != null;
    //if (expression) {
    //  annotationHolder.createInfoAnnotation(rule.getNameIdentifier(), null).setTextAttributes(key);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
    }

    //if (recoverRoot == null && (isRule || firstNonTrivial)) {
    //  frameName = generateFirstCheck(rule, frameName, true);
    //}
```

### CommentedOutCode
Commented out code (2 lines)
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
          // not supported
          return false;
          //method = generateExternalCall(rule, clause, GrammarUtil.getExternalRuleExpressions(subRule), nextName);
          //return method + "(builder_, level_ + 1" + clause.toString() + ")";
        }
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `cardMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleMethodsHelper.java`
#### Snippet
```java
    Map<PsiElement, RuleGraphHelper.Cardinality> cardMap = myGraphHelper.getFor(rule);

    for (PsiElement element : cardMap.keySet()) {
      RuleGraphHelper.Cardinality c = myExpressionHelper.fixCardinality(rule, element, cardMap.get(element));
      String pathName = getRuleOrTokenNameForPsi(element, c);
```

### KeySetIterationMayUseEntrySet
Iteration over `p.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleMethodsHelper.java`
#### Snippet
```java
        if (!myMethods.containsKey(r)) continue;
        Map<String, MethodInfo> p = myMethods.get(r).first;
        for (String name : p.keySet()) {
          MethodInfo m0 = p0.get(name);
          if (m0 == null) continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
          });
        }
        for (PsiElement element : map.keySet()) {
          if (!(element instanceof BnfRule)) continue;
          RuleGraphHelper.Cardinality cardinality = map.get(element);
```

### KeySetIterationMayUseEntrySet
Iteration over `priorityMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
        sb.append(i).append(":");
        int count = 0;
        for (BnfRule rule : priorityMap.keySet()) {
          if (priorityMap.get(rule) == i) {
            if ((count ++ % 4) == 0 && count > 1) sb.append("\n  ");
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/livePreview/LivePreviewLexer.java`
#### Snippet
```java
      int i = 0;
      String tokenConstantPrefix = getRootAttribute(bnfFile, KnownAttribute.ELEMENT_TYPE_PREFIX);
      for (String pattern : map.keySet()) {
        String tokenName = map.get(pattern);

```

### KeySetIterationMayUseEntrySet
Iteration over `origTokens.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    }
    // fix ordering: origTokens go _after_ to handle keywords correctly
    for (String tokenText : origTokens.keySet()) {
      String tokenName = origTokens.get(tokenText);
      map.remove(tokenText);
```

### KeySetIterationMayUseEntrySet
Iteration over `tokenMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
    Map<String, String> simpleTokens = new LinkedHashMap<>();
    Map<String, String> regexpTokens = new LinkedHashMap<>();
    for (String name : tokenMap.keySet()) {
      String token = tokenMap.get(name);
      if (name == null || token == null) continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedOpCalls` may be replaced with 'values()' iteration
in `src/org/intellij/grammar/generator/ExpressionGeneratorHelper.java`
#### Snippet
```java

    boolean first = true;
    for (String opCall : sortedOpCalls) {
      List<OperatorInfo> operators = findOperators(opCalls.get(opCall), OperatorType.ATOM, OperatorType.PREFIX);
      if (operators.isEmpty()) continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedOpCalls` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ExpressionGeneratorHelper.java`
#### Snippet
```java

    first = true;
    for (String opCall : sortedOpCalls) {
      List<OperatorInfo> operators = findOperators(opCalls.get(opCall), OperatorType.BINARY, OperatorType.N_ARY, OperatorType.POSTFIX);
      if (operators.isEmpty()) continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedOpCalls` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ExpressionGeneratorHelper.java`
#### Snippet
```java
    // operators and tails
    Set<BnfExpression> visited = new HashSet<>();
    for (String opCall : sortedOpCalls) {
      for (OperatorInfo operator : opCalls.get(opCall)) {
        if (operator.type == OperatorType.ATOM) {
```

### KeySetIterationMayUseEntrySet
Iteration over `metaResults.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
          Map<PsiElement, Cardinality> metaResults = collectMembers(metaRule, visited);
          List<String> params = null;
          for (PsiElement member : metaResults.keySet()) {
            Cardinality cardinality = metaResults.get(member);
            if (!isExternalPsi(member)) {
```

### KeySetIterationMayUseEntrySet
Iteration over `argMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
              if (idx > -1 && idx < arguments.size()) {
                Map<PsiElement, Cardinality> argMap = collectMembers(rule, arguments.get(idx), visited);
                for (PsiElement element : argMap.keySet()) {
                  Cardinality existing = ObjectUtils.notNull(result.get(element), NONE);
                  result.put(element, existing.or(cardinality.and(argMap.get(element))));
```

### KeySetIterationMayUseEntrySet
Iteration over `rulesToTheLeft.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      List<Map<PsiElement, Cardinality>> list = new ArrayList<>();
      Map<BnfRule, Cardinality> rulesToTheLeft = getRulesToTheLeft(rule);
      for (BnfRule r : rulesToTheLeft.keySet()) {
        Cardinality cardinality = rulesToTheLeft.get(r);
        Map<PsiElement, Cardinality> leftMap = psiMap(r, REQUIRED);
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java

    boolean requiredFound = false;
    for (PsiElement t : map.keySet()) {
      if (PsiUtilCore.getElementType(t) == MARKER_TYPE) continue;
      if (requiredFound || map.get(t) != REQUIRED) return false;
```

### KeySetIterationMayUseEntrySet
Iteration over `nextMap.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    Map<BnfRule, Cardinality> result = new LinkedHashMap<>();
    Map<BnfExpression, BnfExpression> nextMap = BnfFirstNextAnalyzer.createBackwardAnalyzer(true).calcNext(rule);
    for (BnfExpression e : nextMap.keySet()) {
      if (!(e instanceof BnfReferenceOrToken)) continue;
      BnfRule r = ((BnfReferenceOrToken)e).resolveRule();
```

### KeySetIterationMayUseEntrySet
Iteration over `m.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      Map<PsiElement, Cardinality> map = psiMap();
      boolean leftMarker = m.containsKey(LEFT_MARKER);
      for (PsiElement t : m.keySet()) {
        Cardinality joinedCard = fromNodeType(type).and(m.get(t));
        if (leftMarker) {
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        }
        else if (leftMarker == OPTIONAL) {
          for (PsiElement t : map.keySet()) {
            if (!m.containsKey(t)) {
              map.put(t, map.get(t).and(OPTIONAL));
```

### KeySetIterationMayUseEntrySet
Iteration over `m.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
          }
        }
        for (PsiElement t : m.keySet()) {
          if (t == LEFT_MARKER && m != list.get(0)) continue;
          Cardinality c1 = map.get(t);
```

### KeySetIterationMayUseEntrySet
Iteration over `m.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      for (Map<PsiElement, Cardinality> m : list) {
        if (tryCollapse && willCollapse(rule, m)) continue;
        for (PsiElement t : m.keySet()) {
          if (map.containsKey(t)) continue;
          map.put(t, OPTIONAL.and(m.get(t)));
```

### KeySetIterationMayUseEntrySet
Iteration over `map.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    boolean maybeCollapsed = true;
    PsiElement required = null;
    for (PsiElement t : map.keySet()) {
      if (PsiUtilCore.getElementType(t) == MARKER_TYPE) continue;
      if (!map.get(t).optional()) {
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedCompositeTypes.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java

    Map<String, Trinity<String, String, RuleInfo>> compositeToClassAndFactoryMap = new HashMap<>();
    for (String elementType : sortedCompositeTypes.keySet()) {
      BnfRule rule = sortedCompositeTypes.get(elementType);
      RuleInfo ruleInfo = ruleInfo(rule);
```

### KeySetIterationMayUseEntrySet
Iteration over `mySimpleTokens.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      }
      String fieldType = ObjectUtils.notNull(useExactTokens ? exactType : null, IELEMENTTYPE_CLASS);
      for (String tokenText : mySimpleTokens.keySet()) {
        String tokenName = ObjectUtils.chooseNotNull(mySimpleTokens.get(tokenText), tokenText);
        if (isIgnoredWhitespaceToken(tokenName, tokenText)) continue;
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedTokens.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
        sortedTokens.put(getElementType(tokenName), isRegexpToken(tokenText) ? tokenName : tokenText);
      }
      for (String tokenType : sortedTokens.keySet()) {
        String callFix = tokenCreateCall.endsWith("IElementType") ? ", null" : "";
        String tokenString = sortedTokens.get(tokenType);
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedCompositeTypes.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      newLine();
      out("static {");
      for (String elementType : sortedCompositeTypes.keySet()) {
        BnfRule rule = sortedCompositeTypes.get(elementType);
        RuleInfo info = ruleInfo(rule);
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedCompositeTypes.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      out("class Factory {");
      first1 = true;
      for (String elementType : sortedCompositeTypes.keySet()) {
        BnfRule rule = sortedCompositeTypes.get(elementType);
        RuleInfo info = ruleInfo(rule);
```

### KeySetIterationMayUseEntrySet
Iteration over `sortedCompositeTypes.keySet()` may be replaced with 'entrySet()' iteration
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      }
      first2 = true;
      for (String elementType : sortedCompositeTypes.keySet()) {
        BnfRule rule = sortedCompositeTypes.get(elementType);
        RuleInfo info = ruleInfo(rule);
```

## RuleId[id=PatternVariableCanBeUsed]
### PatternVariableCanBeUsed
Variable 'bnfString' can be replaced with pattern variable
in `src/org/intellij/grammar/psi/impl/BnfStringRegexpInjector.java`
#### Snippet
```java
    if (!Options.BNF_INJECT_REGEXP_IN_BNF.get()) return;

    BnfStringImpl bnfString = (BnfStringImpl)host;
    String text = StringUtil.unquoteString(bnfString.getString().getText());
    if (!text.startsWith(REGEXP_PREFIX)) return;
```

### PatternVariableCanBeUsed
Variable 'file' can be replaced with pattern variable
in `src/org/intellij/grammar/BnfFoldingBuilder.java`
#### Snippet
```java
                                          boolean quick) {
    if (!(root instanceof BnfFile)) return;
    BnfFile file = (BnfFile)root;

    for (BnfAttrs attrs : file.getAttributes()) {
```

### PatternVariableCanBeUsed
Variable 'asRule' can be replaced with pattern variable
in `src/org/intellij/grammar/generator/RuleMethodsHelper.java`
#### Snippet
```java
    }
    else {
      BnfRule asRule = (BnfRule)tree;
      result = asRule.getName();
      if (StringUtil.isEmpty(getElementType(asRule, G.generateElementCase))) return null;
```

### PatternVariableCanBeUsed
Variable 'resultType' can be replaced with pattern variable
in `src/org/intellij/grammar/generator/RuleMethodsHelper.java`
#### Snippet
```java
      if (pathName == null) continue;
      if (element instanceof BnfRule) {
        BnfRule resultType = (BnfRule)element;
        if (!Rule.isPrivate(rule)) {
          result.add(new MethodInfo(MethodType.RULE, pathName, pathName, resultType, c));
```

### PatternVariableCanBeUsed
Variable 'attr' can be replaced with pattern variable
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
        }
        else if (parent instanceof BnfAttr) {
          BnfAttr attr = (BnfAttr)parent;
          attrCompletion = position == attr.getId() || isOneAfterAnother(attr.getExpression(), position);
        }
```

### PatternVariableCanBeUsed
Variable 'rule' can be replaced with pattern variable
in `src/org/intellij/grammar/editor/BnfRecursionLineMarkerProvider.java`
#### Snippet
```java
    for (PsiElement element : elements) {
      if (!(element instanceof BnfRule)) continue;
      BnfRule rule = (BnfRule)element;

      ProgressManager.checkCanceled();
```

### PatternVariableCanBeUsed
Variable 'rule' can be replaced with pattern variable
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java
  public @Nullable String generateDoc(PsiElement element, PsiElement originalElement) {
    if (element instanceof BnfRule) {
      BnfRule rule = (BnfRule)element;
      BnfFirstNextAnalyzer analyzer = BnfFirstNextAnalyzer.createAnalyzer(false);
      Set<String> first = BnfFirstNextAnalyzer.asStrings(analyzer.calcFirst(rule));
```

### PatternVariableCanBeUsed
Variable 'rule' can be replaced with pattern variable
in `src/org/intellij/grammar/editor/BnfPinMarkerAnnotator.java`
#### Snippet
```java
  public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
    if (!(psiElement instanceof BnfRule)) return;
    BnfRule rule = (BnfRule)psiElement;
    BnfFile bnfFile = (BnfFile)rule.getContainingFile();
    ExpressionHelper exprHelper = ExpressionHelper.getCached(bnfFile);
```

### PatternVariableCanBeUsed
Variable 'bnfFile' can be replaced with pattern variable
in `src/org/intellij/grammar/refactor/BnfIntroduceTokenHandler.java`
#### Snippet
```java
                     @Nullable DataContext dataContext) {
    if (!(file instanceof BnfFile)) return;
    BnfFile bnfFile = (BnfFile) file;

    Map<String, String> tokenNameMap = RuleGraphHelper.getTokenNameToTextMap(bnfFile);
```

### PatternVariableCanBeUsed
Variable 'bnfFile' can be replaced with pattern variable
in `src/org/intellij/grammar/inspection/BnfDuplicateRuleInspection.java`
#### Snippet
```java
  private static void checkFile(PsiFile file, ProblemsHolder problemsHolder) {
    if (!(file instanceof BnfFile)) return;
    BnfFile bnfFile = (BnfFile)file;

    Set<BnfRule> rules = new LinkedHashSet<>();
```

### PatternVariableCanBeUsed
Variable 'rule' can be replaced with pattern variable
in `src/org/intellij/grammar/editor/BnfExpressionMarkerAnnotator.java`
#### Snippet
```java
  public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
    if (!(psiElement instanceof BnfRule)) return;
    BnfRule rule = (BnfRule) psiElement;
    // todo
    //boolean expression = ExpressionGeneratorHelper.getInfoForExpressionParsing(ExpressionHelper.getCached((BnfFile)rule.getContainingFile()), rule) != null;
```

### PatternVariableCanBeUsed
Variable 'state' can be replaced with pattern variable
in `src/org/intellij/jflex/psi/impl/JFlexStateUsageSearcher.java`
#### Snippet
```java
    }
    else if (element instanceof JFlexStateDefinition) {
      JFlexStateDefinition state = (JFlexStateDefinition)element;
      String name = state.getName();
      JFlexJavaCode javaCode = SyntaxTraverser.psiTraverser(containingFile).filter(JFlexJavaCode.class).first();
```

### PatternVariableCanBeUsed
Variable 'javaFile' can be replaced with pattern variable
in `src/org/intellij/jflex/psi/impl/JFlexStateUsageSearcher.java`
#### Snippet
```java
        JBIterable.from(InjectedLanguageManager.getInstance(javaCode.getProject()).getInjectedPsiFiles(javaCode)).first();
      if (injectedFile != null && injectedFile.first instanceof PsiJavaFile) {
        PsiJavaFile javaFile = (PsiJavaFile)injectedFile.first;
        PsiField field = JBIterable.of(javaFile.getClasses())
          .take(1).flatMap(o -> JBIterable.of(o.getFields()))
```

### PatternVariableCanBeUsed
Variable 'bnfFile' can be replaced with pattern variable
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java

    Project project = file.getProject();
    BnfFile bnfFile = (BnfFile) file;
    String qualifiedName = createClass(
        bnfFile, "Create Parser Util Class", BnfConstants.GPUB_CLASS,
```

### PatternVariableCanBeUsed
Variable 'myFile' can be replaced with pattern variable
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
    if (!(file instanceof BnfFile)) return null;
    if (SuppressionUtil.inspectionResultSuppressed(file, this)) return null;
    BnfFile myFile = (BnfFile)file;
    JBIterable<BnfRule> rules = JBIterable.from(myFile.getRules());
    if (rules.isEmpty()) return null;
```

### PatternVariableCanBeUsed
Variable 'rule' can be replaced with pattern variable
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
        public boolean value(PsiElement element) {
          if (element instanceof BnfRule) {
            BnfRule rule = (BnfRule)element;
            // add recovery rules to calculation
            BnfAttr recoverAttr = findAttribute(rule, RECOVER_WHILE);
```

### PatternVariableCanBeUsed
Variable 'rule' can be replaced with pattern variable
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    for (PsiElement tree : accessors) {
      if (tree instanceof BnfRule) {
        BnfRule rule = (BnfRule)tree;
        if (!Rule.isPrivate(rule)) result.put(rule.getName(), rule);
      }
```

### PatternVariableCanBeUsed
Variable 'bnfFile' can be replaced with pattern variable
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
    Project project = file.getProject();

    BnfFile bnfFile = (BnfFile) file;
    String flexFileName = getFlexFileName(bnfFile);

```

### PatternVariableCanBeUsed
Variable 'externalExpression' can be replaced with pattern variable
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
    }
    else if (expression instanceof BnfExternalExpression) {
      BnfExternalExpression externalExpression = (BnfExternalExpression)expression;
      List<BnfExpression> arguments = externalExpression.getArguments();
      if (arguments.isEmpty() && ParserGeneratorUtil.Rule.isMeta(ParserGeneratorUtil.Rule.of(expression))) {
```

### PatternVariableCanBeUsed
Variable 'rule' can be replaced with pattern variable
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
          (myParentFilter == null || myParentFilter.value(parent)) &&
          totalVisited.add((BnfRule)parent)) {
        BnfRule rule = (BnfRule)parent;
        for (PsiReference reference : ReferencesSearch.search(rule, rule.getUseScope()).findAll()) {
          PsiElement element = reference.getElement();
```

### PatternVariableCanBeUsed
Variable 'psiMethod' can be replaced with pattern variable
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
      if (!(method instanceof PsiMethod)) return super.getGenericParameters(method);

      PsiMethod psiMethod = (PsiMethod)method;
      PsiTypeParameter[] typeParameters = psiMethod.getTypeParameters();
      return ContainerUtil.map(typeParameters, param -> new TypeParameterInfo(
```

### PatternVariableCanBeUsed
Variable 'psiMethod' can be replaced with pattern variable
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    public @NotNull List<String> getMethodTypes(NavigatablePsiElement method) {
      if (!(method instanceof PsiMethod)) return super.getMethodTypes(method);
      PsiMethod psiMethod = (PsiMethod)method;
      PsiType returnType = psiMethod.getReturnType();
      List<String> strings = new ArrayList<>();
```

### PatternVariableCanBeUsed
Variable 'psiMethod' can be replaced with pattern variable
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    public @NotNull String getDeclaringClass(@Nullable NavigatablePsiElement method) {
      if (!(method instanceof PsiMethod)) return super.getDeclaringClass(method);
      PsiMethod psiMethod = (PsiMethod)method;
      PsiClass aClass = psiMethod.getContainingClass();
      return aClass == null ? "" : StringUtil.notNullize(aClass.getQualifiedName());
```

### PatternVariableCanBeUsed
Variable 'psiMethod' can be replaced with pattern variable
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    public @NotNull List<String> getParameterAnnotations(@Nullable NavigatablePsiElement method, int paramIndex) {
      if (!(method instanceof PsiMethod)) return super.getParameterAnnotations(method, paramIndex);
      PsiMethod psiMethod = (PsiMethod)method;
      PsiParameter[] parameters = psiMethod.getParameterList().getParameters();
      if (paramIndex < 0 || paramIndex >= parameters.length) return Collections.emptyList();
```

### PatternVariableCanBeUsed
Variable 'psiMethod' can be replaced with pattern variable
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
      if (!(method instanceof PsiMethod)) return super.getExceptionList(method);

      PsiMethod psiMethod = (PsiMethod)method;
      PsiClassType[] types = psiMethod.getThrowsList().getReferencedTypes();
      return ContainerUtil.map(types, type -> type.getCanonicalText(false));
```

### PatternVariableCanBeUsed
Variable 'expression' can be replaced with pattern variable
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    }
    else if (tree instanceof BnfExternalExpression) {
      BnfExternalExpression expression = (BnfExternalExpression)tree;
      List<BnfExpression> arguments = expression.getArguments();
      if (arguments.isEmpty() && Rule.isMeta(rule)) {
```

### PatternVariableCanBeUsed
Variable 'metaCall' can be replaced with pattern variable
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    NodeCall nodeCall = generateNodeCall(rule, nested, nextName);
    if (nodeCall instanceof MetaMethodCall) {
      MetaMethodCall metaCall = (MetaMethodCall)nodeCall;
      MetaMethodCallArgument argument = new MetaMethodCallArgument(metaCall);
      if (metaCall.referencesMetaParameter()) {
```

### PatternVariableCanBeUsed
Variable 'methodCall' can be replaced with pattern variable
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    }
    else if (nodeCall instanceof MethodCall && G.javaVersion > 6) {
      MethodCall methodCall = (MethodCall)nodeCall;
      return () -> format("%s::%s", methodCall.getClassName(), methodCall.getMethodName());
    }
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'myBnfFile' in a Serializable class
in `src/org/intellij/grammar/livePreview/LivePreviewLanguage.java`
#### Snippet
```java

  private final VirtualFilePointer myFilePointer;
  private final SoftReference<BnfFile> myBnfFile;
  public static final Language BASE_INSTANCE = new Language("BNF_LP") {
    @Override
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`sortedPublicRules.size() > 0` can be replaced with '!sortedPublicRules.isEmpty()'
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java
    }
    else {
      if (sortedPublicRules.size() > 0) {
        printElements(map, sortedPublicRules, docBuilder.append("\n<br><h1>Contains public rules:</h1>"));
      }
```

### SizeReplaceableByIsEmpty
`sortedTokens.size() > 0` can be replaced with '!sortedTokens.isEmpty()'
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java
        docBuilder.append("<h2>Contains no public rules</h2>");
      }
      if (sortedTokens.size() > 0) {
        printElements(map, sortedTokens, docBuilder.append("\n<br><h1>Contains tokens:</h1>"));
      }
```

### SizeReplaceableByIsEmpty
`sb.length() == 0` can be replaced with 'sb.isEmpty()'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    boolean allCaps = Case.UPPER.apply(fixed).equals(fixed);
    StringBuilder sb = new StringBuilder();
    if (!Character.isJavaIdentifierStart(fixed.charAt(0)) && sb.length() == 0) sb.append("_");
    String[] strings = NameUtil.nameToWords(fixed);
    for (int i = 0, len = strings.length; i < len; i++) {
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    for (String pattern : tokens.keySet()) {
      if (!isRegexpToken(pattern)) continue;
      if (sb.length() > 0) sb.append("|");
      sb.append(getRegexpTokenRegexp(pattern));
    }
```

### SizeReplaceableByIsEmpty
`s.substring(prefix[3] + 1, offset).trim().length() > 0` can be replaced with '!s.substring(prefix\[3\] + 1, offset).trim().isEmpty()'
in `src/org/intellij/grammar/generator/NameShortener.java`
#### Snippet
```java
      }
      else if (!quoted && prefixStack != null && !prefixStack.isEmpty() && parenCount == (prefix = prefixStack.peek())[0] &&
               s.substring(prefix[3] + 1, offset).trim().length() > 0) {
        prefixStack.pop();
        if (forcedOffset == -1 || prefix[1] == forcedOffset) {
```

### SizeReplaceableByIsEmpty
`expressions.size() > 0` can be replaced with '!expressions.isEmpty()'
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
    List<BnfExpression> callParameters = expressions;
    List<String> metaParameterNames;
    String method = expressions.size() > 0 ? expressions.get(0).getText() : null;
    BnfRule targetRule = method == null ? null : myFile.getRule(method);
    // handle external rule call: substitute and merge arguments from external expression and rule definition
```

### SizeReplaceableByIsEmpty
`sb.length() == 0` can be replaced with 'sb.isEmpty()'
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java

      private void finishElement(State finishState) {
        if (sb.length() == 0) return;
        main:
        while (!states.isEmpty()) {
```

### SizeReplaceableByIsEmpty
`s.length() == 0` can be replaced with 's.isEmpty()'
in `src/org/intellij/grammar/parser/GeneratedParserUtilBase.java`
#### Snippet
```java
      count = 0;
      for (String s : strings) {
        if (s.length() == 0) continue;
        if (count++ > 0) {
          if (count > MAX_VARIANTS_TO_DISPLAY) {
```

### SizeReplaceableByIsEmpty
`expressions.size() > 0` can be replaced with '!expressions.isEmpty()'
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    List<BnfExpression> callParameters = expressions;
    List<String> metaParameterNames = Collections.emptyList();
    String method = expressions.size() > 0 ? expressions.get(0).getText() : null;
    String targetClassName = null;
    BnfRule targetRule = method == null ? null : myFile.getRule(method);
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `newLine &= (size - count) > 2`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    for (int count = 0, line = 0, size = tokenTypes.size(); count < size; count++) {
      boolean newLine = line == 0 && count == 2 || line > 0 && (count - 2) % 6 == 0;
      newLine &= (size - count) > 2;
      if (count > 0) sb.append(",").append(newLine ? "\n" : " ");
      sb.append(tokenTypes.get(count));
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `matchesSomething |= !result.remove(BNF_MATCHES_NOTHING)`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
      for (BnfExpression child : ((BnfChoice)expression).getExpressionList()) {
        calcFirstInner(child, result, visited, forcedNext);
        matchesSomething |= !result.remove(BNF_MATCHES_NOTHING);
      }
      if (!matchesSomething || matchesNothing) result.add(BNF_MATCHES_NOTHING);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `pinApplied |= pinned.contains(e)`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
        for (BnfExpression e : ((BnfSequence)firstItem.getParent()).getExpressionList()) {
          if (e == firstItem) break;
          pinApplied |= pinned.contains(e);
        }
      }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `matchesEof |= pinApplied`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
    for (int i = 0, size = list.size(); i < size; i++) {
      if (!result.remove(BNF_MATCHES_EOF)) break;
      matchesEof |= pinApplied;
      BnfExpression e = list.get(i);
      calcFirstInner(e, result, visited, i < size - 1 ? Pair.create(pinned.contains(e), list.subList(i + 1, size)) : null);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `pinApplied |= pinned.contains(e)`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
      BnfExpression e = list.get(i);
      calcFirstInner(e, result, visited, i < size - 1 ? Pair.create(pinned.contains(e), list.subList(i + 1, size)) : null);
      pinApplied |= pinned.contains(e);
    }
    // add empty back if was there before
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `hasSynonyms |= rule != e.getValue()`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      BnfRule rule = e.getKey();
      e.setValue(getSynonymTargetOrSelf(rule));
      hasSynonyms |= rule != e.getValue();
      for (PsiElement r : myRulesCollapseMap.get(rule)) {
        if (r instanceof BnfRule && !rulesAndAlts.containsKey(r)) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `changed |= rules.addAll(ruleExtendsMap.get(rule))`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        Collection<BnfRule> rules = ruleExtendsMap.get(superRule);
        for (BnfRule rule : new ArrayList<>(rules)) {
          changed |= rules.addAll(ruleExtendsMap.get(rule));
        }
      }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `result |= canCollapseBy(rule, t)`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    if (maybeCollapsed) {
      for (PsiElement t : required != null ? Collections.singleton(required) : map.keySet()) {
        result |= canCollapseBy(rule, t);
      }
    }
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `totalNullable |= cardinality.optional()`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      targetRule = targetInfo.rule; // next accessors
      cardinality = targetInfo.cardinality;
      totalNullable |= cardinality.optional();

      // list item
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `totalNullable |= cardinality.optional()`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
        context = curId;
        cardinality = cardinality == AT_LEAST_ONE && index.equals("0") ? REQUIRED : OPTIONAL;
        totalNullable |= cardinality.optional();
      }
    }
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of 'x'
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\p\\{Upper}", "[:uppercase:]");
      s = s.replaceAll("\\\\p\\{Alnum}", "([:letter:]|[:digit:])");
      s = s.replaceAll("\\\\p\\{ASCII}", "[\\x00-\\x7F]");
    }
    return s;
```

### RedundantEscapeInRegexReplacement
Redundant escape of 'x'
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\p\\{Upper}", "[:uppercase:]");
      s = s.replaceAll("\\\\p\\{Alnum}", "([:letter:]|[:digit:])");
      s = s.replaceAll("\\\\p\\{ASCII}", "[\\x00-\\x7F]");
    }
    return s;
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `prev`
in `src/org/intellij/grammar/intention/BnfFlipChoiceIntention.java`
#### Snippet
```java
      int end = cur.getTextRange().getStartOffset();
      if (start <= offset && offset <= end) return prev == null ? null : Pair.create(cur, prev);
      prev = cur;
    }
    return null;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `s`
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
        if (!(c instanceof BnfExpression)) continue;
        if (GrammarUtil.equalsElement((BnfExpression)c, selectedExpressions.get(pos))) {
          if (pos == 0) s = c;
          result[pos] = (BnfExpression)c;
          if (++ pos == result.length) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `c`
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
        }
        else if (s != null) {
          c = s;
          pos = 0;
          s = null;
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `s`
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
          c = s;
          pos = 0;
          s = null;
        }
      }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `next`
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
        PsiElement curParent = cur.getParent();
        while (next == null && curParent != parent) {
          next = curParent.getNextSibling();
          curParent = curParent.getParent();
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `next`
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
        }
        if (curParent == parent) return true;
        next = PsiTreeUtil.getDeepestFirst(next);
      }
    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `line`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      if (count > 0) sb.append(",").append(newLine ? "\n" : " ");
      sb.append(tokenTypes.get(count));
      if (newLine) line ++;
    }
  }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `p`
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
        else {
          skip[0]--; // we are inside already generated token sequence
          if (pinApplied && i == p + 1) p++; // shift pinned index as we skip
        }
        if (!pinApplied && pinMatcher.matches(i, child)) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `p`
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
        if (!pinApplied && pinMatcher.matches(i, child)) {
          pinApplied = true;
          p = i;
          pinned_ = result_; // pin = pinMatcher.pinValue
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `p`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
        else {
          skip[0]--; // we are inside already generated token sequence
          if (pinApplied && i == p + 1) p++; // shift pinned index as we skip
        }
        if (pinned && !pinApplied && pinMatcher.matches(i, child)) {
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `p`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
        if (pinned && !pinApplied && pinMatcher.matches(i, child)) {
          pinApplied = true;
          p = i;
          out("%s = %s; // pin = %s", N.pinned, N.result, pinMatcher.pinValue);
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `end`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    for (int start = 0, end; start < length; start = end + 1) {
      boolean isComment = s.startsWith("//", start);
      end = StringUtil.indexOf(s, '\n', start, length);
      if (end == -1) end = length;
      String substring = s.substring(start, end);
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `end`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      boolean isComment = s.startsWith("//", start);
      end = StringUtil.indexOf(s, '\n', start, length);
      if (end == -1) end = length;
      String substring = s.substring(start, end);
      if (!isComment && (substring.startsWith("}") || substring.startsWith(")"))) {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super PsiElement`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
  }

  private static void mergeChildrenTo(PsiElement parent, PsiElement cur, List<PsiElement> list) {
    boolean skipParens = cur instanceof BnfParenthesized;
    PsiElement last = cur.getLastChild();
```

### BoundedWildcard
Can generalize to `? extends BnfRule`
in `src/org/intellij/grammar/generator/RuleMethodsHelper.java`
#### Snippet
```java
  }

  public void buildMaps(Collection<BnfRule> sortedPsiRules) {
    Map<String, String> tokensReversed = RuleGraphHelper.computeTokens(myGraphHelper.getFile()).asMap();
    for (BnfRule rule : sortedPsiRules) {
```

### BoundedWildcard
Can generalize to `? super OccurrencesChooser.ReplaceChoice`
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java

  private static void addOccurrence(OccurrencesChooser.ReplaceChoice choice,
                                    Map<OccurrencesChooser.ReplaceChoice, List<BnfExpression[]>> occurrencesMap,
                                    BnfExpression... expressions) {
    List<BnfExpression[]> list = occurrencesMap.get(choice);
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java

  private static void findOccurrences(BnfExpression expression,
                                      List<BnfExpression> selectedExpressions,
                                      Map<OccurrencesChooser.ReplaceChoice, List<BnfExpression[]>> occurrencesMap) {
    if (selectedExpressions.size() == 1) {
```

### BoundedWildcard
Can generalize to `? super BnfExpression`
in `src/org/intellij/grammar/inspection/BnfIdenticalChoiceBranchesInspection.java`
#### Snippet
```java
  }

  private static void checkChoice(BnfChoice choice, Set<BnfExpression> set) {
    List<BnfExpression> list = choice.getExpressionList();
    for (BnfExpression e1 : list) {
```

### BoundedWildcard
Can generalize to `? extends VirtualFile`
in `src/org/intellij/grammar/actions/GenerateAction.java`
#### Snippet
```java
  }

  public static void doGenerate(@NotNull Project project, @NotNull List<VirtualFile> bnfFiles) {
    Map<VirtualFile, VirtualFile> rootMap = new LinkedHashMap<>();
    Map<VirtualFile, String> packageMap = new LinkedHashMap<>();
```

### BoundedWildcard
Can generalize to `? extends TextRange`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java
  }

  private static void createHighlights(Set<TextRange> trueRanges,
                                       Set<TextRange> falseRanges,
                                       List<HighlightInfo> result) {
```

### BoundedWildcard
Can generalize to `? extends TextRange`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java

  private static void createHighlights(Set<TextRange> trueRanges,
                                       Set<TextRange> falseRanges,
                                       List<HighlightInfo> result) {
    EditorColorsManager manager = EditorColorsManager.getInstance();
```

### BoundedWildcard
Can generalize to `? super HighlightInfo`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java
  private static void createHighlights(Set<TextRange> trueRanges,
                                       Set<TextRange> falseRanges,
                                       List<HighlightInfo> result) {
    EditorColorsManager manager = EditorColorsManager.getInstance();
    TextAttributes trueAttrs = manager.getGlobalScheme().getAttributes(EditorColors.SEARCH_RESULT_ATTRIBUTES);
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
  }

  private @Nullable BnfRule substRule(List<BnfExpression> list, int idx, BnfRule rootRule) {
    if (idx < 0) return null;
    BnfRule rule = myFile.getRule(list.get(idx).getText());
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
  private int indexOf(BnfRule rootRule,
                      int startIndex,
                      List<BnfExpression> childExpressions,
                      ExpressionInfo expressionInfo) {
    Collection<BnfRule> extendsRules = myRuleGraph.getExtendsRules(rootRule);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java


  public ExpressionHelper(BnfFile file, RuleGraphHelper ruleGraph, @Nullable Consumer<String> warningConsumer) {
    myFile = file;
    myRuleGraph = ruleGraph;
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/refactor/BnfIntroduceTokenHandler.java`
#### Snippet
```java
  private static void buildTemplateAndRun(Project project,
                                          Editor editor,
                                          BnfFile bnfFile, List<BnfExpression> occurrences,
                                          String tokenName,
                                          String tokenText,
```

### BoundedWildcard
Can generalize to `? super String`
in `src/org/intellij/grammar/livePreview/LiveHooksHelper.java`
#### Snippet
```java
  }

  private static void collectStaticFields(Class<?> where, Class<?> what, Map<String, Object> result) {
    for (Field field : where.getFields()) {
      int m = field.getModifiers();
```

### BoundedWildcard
Can generalize to `? extends T`
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
  }

  private static @NotNull <T> AtomicClearableLazyValue<T> lazyValue(Supplier<T> producer) {
    return new AtomicClearableLazyValue<>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends PsiElement`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static Collection<LeafPsiElement> getSortedExternalRules(Set<PsiElement> accessors) {
    Map<String, LeafPsiElement> result = new TreeMap<>();
    for (PsiElement tree : accessors) {
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    }

    public boolean shouldGenerate(List<BnfExpression> children) {
      // do not check last expression, last item pin is trivial
      for (int i = 0, size = children.size(); i < size - 1; i++) {
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java

  // null when some expression is not a token or total tokens count is less than or equals threshold
  static @Nullable Collection<String> getTokenNames(@NotNull BnfFile file, @NotNull List<BnfExpression> expressions, int threshold) {
    Set<String> tokens = new LinkedHashSet<>();
    for (BnfExpression expression : expressions) {
```

### BoundedWildcard
Can generalize to `? extends JavaHelper.TypeParameterInfo`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static String getGenericClauseString(List<JavaHelper.TypeParameterInfo> genericParameters, NameShortener shortener) {
    if (genericParameters.isEmpty()) return "";

```

### BoundedWildcard
Can generalize to `? extends PsiElement`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static Collection<BnfExpression> getSortedTokens(Set<PsiElement> accessors) {
    Map<String, BnfExpression> result = new TreeMap<>();
    for (PsiElement tree : accessors) {
```

### BoundedWildcard
Can generalize to `? extends BnfRule`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static List<BnfRule> topoSort(@NotNull Collection<BnfRule> rules, @NotNull RuleGraphHelper ruleGraph) {
    Set<BnfRule> rulesSet = new HashSet<>(rules);
    return new JBTreeTraverser<BnfRule>(
```

### BoundedWildcard
Can generalize to `? extends K`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  static @NotNull <K extends Comparable<? super K>, V> Map<K, V> take(@NotNull Map<K, V> map) {
    Map<K, V> result = new TreeMap<>(map);
    map.clear();
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  static @NotNull <K extends Comparable<? super K>, V> Map<K, V> take(@NotNull Map<K, V> map) {
    Map<K, V> result = new TreeMap<>(map);
    map.clear();
```

### BoundedWildcard
Can generalize to `? extends PsiElement`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static Collection<BnfRule> getSortedPublicRules(Set<PsiElement> accessors) {
    Map<String, BnfRule> result = new TreeMap<>();
    for (PsiElement tree : accessors) {
```

### BoundedWildcard
Can generalize to `? extends OperatorInfo`
in `src/org/intellij/grammar/generator/ExpressionGeneratorHelper.java`
#### Snippet
```java
  }

  public static @NotNull List<OperatorInfo> findOperators(Collection<OperatorInfo> list, OperatorType... types) {
    List<OperatorInfo> result = new SmartList<>();
    for (OperatorInfo o : list) {
```

### BoundedWildcard
Can generalize to `? super JFlexMacroDefinition`
in `src/org/intellij/jflex/psi/impl/JFlexPsiImplUtil.java`
#### Snippet
```java
  }

  private static boolean processMacroVariants(PsiElement context, Processor<JFlexMacroDefinition> processor) {
    PsiFile containingFile = context.getContainingFile();
    List<JFlexMacroDefinition> macros = CachedValuesManager.getCachedValue(
```

### BoundedWildcard
Can generalize to `? extends RangeMarker`
in `src/org/intellij/grammar/refactor/BnfIntroduceRulePopup.java`
#### Snippet
```java
  }

  private static void setLeftGreedy(Collection<RangeMarker> leftRestore, boolean greedyToLeft) {
    for (RangeMarker rangeMarker : leftRestore) {
      rangeMarker.setGreedyToLeft(greedyToLeft);
```

### BoundedWildcard
Can generalize to `? extends RangeMarker`
in `src/org/intellij/grammar/refactor/BnfIntroduceRulePopup.java`
#### Snippet
```java
  }

  private static void setRightGreedy(Collection<RangeMarker> rightRestore, boolean greedyToRight) {
    for (RangeMarker rangeMarker : rightRestore) {
      rangeMarker.setGreedyToRight(greedyToRight);
```

### BoundedWildcard
Can generalize to `? super RangeMarker`
in `src/org/intellij/grammar/refactor/BnfIntroduceRulePopup.java`
#### Snippet
```java

  private static void collectRangeMarker(RangeMarker rangeMarker, int lineOffset,
                                         Collection<RangeMarker> leftGreedyMarkers, Collection<RangeMarker> emptyMarkers) {
    if (rangeMarker.getStartOffset() == lineOffset && rangeMarker.isGreedyToLeft()) {
      leftGreedyMarkers.add(rangeMarker);
```

### BoundedWildcard
Can generalize to `? super RangeMarker`
in `src/org/intellij/grammar/refactor/BnfIntroduceRulePopup.java`
#### Snippet
```java

  private static void collectRangeMarker(RangeMarker rangeMarker, int lineOffset,
                                         Collection<RangeMarker> leftGreedyMarkers, Collection<RangeMarker> emptyMarkers) {
    if (rangeMarker.getStartOffset() == lineOffset && rangeMarker.isGreedyToLeft()) {
      leftGreedyMarkers.add(rangeMarker);
```

### BoundedWildcard
Can generalize to `? super String`
in `src/org/intellij/grammar/generator/NameShortener.java`
#### Snippet
```java
  }

  private static void addTypeToImports(@Nullable String s, @NotNull Consumer<String> result, int forcedOffset) {
    if (s == null) return;
    boolean quoted = false;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/org/intellij/grammar/generator/NameShortener.java`
#### Snippet
```java
  public static void addTypeToImports(@Nullable String type,
                                      @NotNull List<String> typeAnnotations,
                                      @NotNull Collection<String> result) {
    addTypeToImports(type, result::add, -1);
    for (String anno : typeAnnotations) {
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
  }

  private static Iterable<ExpressionHelper.OperatorInfo> filter(Map<String, List<ExpressionHelper.OperatorInfo>> opCalls,
                                                                ExpressionHelper.OperatorType... operatorTypes) {
    return ContainerUtil.mapNotNull(opCalls.keySet(), opCall ->
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
                                            int level,
                                            BnfRule rule,
                                            List<BnfExpression> children,
                                            String funcName,
                                            int startIndex,
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
  }

  private static boolean involvesTextMatching(Set<BnfExpression> set) {
    for (BnfExpression o : set) {
      if (o instanceof BnfStringLiteralExpression &&
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
  }

  public static Set<String> asStrings(Set<BnfExpression> expressions) {
    Set<String> result = new TreeSet<>();
    for (BnfExpression expression : expressions) {
```

### BoundedWildcard
Can generalize to `? super PsiElement`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
                               boolean publicRuleOpaque,
                               boolean predicateLookAhead,
                               Condition<PsiElement> parentFilter) {
    myBackward = backward;
    myPublicRuleOpaque = publicRuleOpaque;
```

### BoundedWildcard
Can generalize to `? extends List`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
  }

  public Set<BnfExpression> calcFirstInner(BnfExpression expression, Set<BnfExpression> result, Set<BnfExpression> visited, @Nullable Pair<Boolean, List<BnfExpression>> forcedNext) {
    BnfFile file = (BnfFile)expression.getContainingFile();
    if (expression instanceof BnfLiteralExpression) {
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
  }

  private static @NotNull Set<BnfExpression> exprSetUnion(Collection<BnfExpression> a, Collection<BnfExpression> b) {
    Set<BnfExpression> result = newExprSet(a);
    result.addAll(b);
```

### BoundedWildcard
Can generalize to `? extends Map`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
  }

  private static List<Map<PsiElement, Cardinality>> replaceRulesInMaps(List<Map<PsiElement, Cardinality>> mapList,
                                                                       Map<BnfRule, BnfRule> replacementMap,
                                                                       Map<PsiElement, BnfRule> externalMap) {
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `src/org/intellij/grammar/parser/GeneratedParserUtilBase.java`
#### Snippet
```java
  private static final int MAX_CHILDREN_IN_TREE = 10;
  private static void checkSiblings(IElementType chunkType,
                                    Deque<Pair<PsiBuilder.Marker, PsiBuilder.Marker>> parens,
                                    Deque<Pair<PsiBuilder.Marker, Integer>> siblings) {
    main:
```

### BoundedWildcard
Can generalize to `? extends BnfRule`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
  private static List<Map<PsiElement, Cardinality>> replaceRulesInMaps(List<Map<PsiElement, Cardinality>> mapList,
                                                                       Map<BnfRule, BnfRule> replacementMap,
                                                                       Map<PsiElement, BnfRule> externalMap) {
    List<Map<PsiElement, Cardinality>> result = new ArrayList<>(mapList.size());
    for (Map<PsiElement, Cardinality> map : mapList) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
  }

  private static <V> Map<PsiElement, V> psiMap(Map<PsiElement, V> map) {
    return new Object2ObjectOpenCustomHashMap<>(map, CARDINALITY_HASHING_STRATEGY);
  }
```

### BoundedWildcard
Can generalize to `? extends Map.Entry`>
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java

  private static void findTheBestReplacement(Map<BnfRule, BnfRule> rulesAndAlts,
                                             List<Map.Entry<BnfRule, Collection<BnfRule>>> supers) {
    BitSet bits = new BitSet(rulesAndAlts.size());
    int minI = -1, minC = -1, minS = -1;
```

### BoundedWildcard
Can generalize to `? extends PsiElement`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
  }

  private boolean canCollapse(BnfRule rule, Map<PsiElement, Cardinality> map) {
    boolean result = false;
    boolean maybeCollapsed = true;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `src/org/intellij/grammar/actions/BnfRunJFlexAction.java`
#### Snippet
```java

  private static void createOrUpdateLibrary(@NotNull String libraryName,
                                            @NotNull List<Pair<VirtualFile, DownloadableFileDescription>> pairs) {
    ApplicationManager.getApplication().assertWriteAccessAllowed();
    LibraryTable libraryTable = LibraryTablesRegistrar.getInstance().getLibraryTable();
```

### BoundedWildcard
Can generalize to `? extends File`
in `src/org/intellij/grammar/actions/BnfRunJFlexAction.java`
#### Snippet
```java
  public static ActionCallback doGenerate(@NotNull Project project,
                                          @NotNull VirtualFile flexFile,
                                          @NotNull List<File> jflex,
                                          @NotNull String batchId) {
    FileDocumentManager fileDocumentManager = FileDocumentManager.getInstance();
```

### BoundedWildcard
Can generalize to `? super File`
in `src/org/intellij/grammar/actions/BnfRunJFlexAction.java`
#### Snippet
```java
  }

  private static boolean collectFiles(List<File> result, List<String> roots, String... urls) {
    main: for (int i = 0; i < urls.length; i++) {
      String url = urls[i];
```

### BoundedWildcard
Can generalize to `? extends BnfRule`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
  }

  private void calcRealSuperClasses(Map<String, BnfRule> sortedPsiRules) {
    Map<BnfRule, BnfRule> supers = new HashMap<>();
    for (BnfRule rule : sortedPsiRules.values()) {
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
  }

  void generateNodeChildren(BnfRule rule, String funcName, List<BnfExpression> children, Set<BnfExpression> visited) {
    for (int i = 0, len = children.size(); i < len; i++) {
      generateNodeChild(rule, children.get(i), funcName, i, visited);
```

### BoundedWildcard
Can generalize to `? extends BnfExpression`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
  }

  private @NotNull NodeCall generateTokenSequenceCall(List<BnfExpression> children,
                                                      int startIndex,
                                                      PinMatcher pinMatcher,
```

### BoundedWildcard
Can generalize to `? extends BnfRule`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
  }

  private void generateVisitor(String psiClass, Map<String, BnfRule> sortedRules) {
    String superIntf = ObjectUtils.notNull(ContainerUtil.getFirstItem(getRootAttribute(myFile, KnownAttribute.IMPLEMENTS)),
                                           KnownAttribute.IMPLEMENTS.getDefaultValue().get(0)).second;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
                                  boolean intf,
                                  boolean isInPsiUtil,
                                  Set<String> visited) {
    List<String> methodTypes = method == null ? Collections.emptyList() : myJavaHelper.getMethodTypes(method);
    String returnType = methodTypes.isEmpty()? "void" : shorten(methodTypes.get(0));
```

### BoundedWildcard
Can generalize to `? extends BnfRule`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
  /*ElementTypes******************************************************************/

  private void generateElementTypesHolder(String className, Map<String, BnfRule> sortedCompositeTypes) {
    String tokenTypeClass = getRootAttribute(myFile, KnownAttribute.TOKEN_TYPE_CLASS);
    String tokenTypeFactory = getRootAttribute(myFile, KnownAttribute.TOKEN_TYPE_FACTORY);
```

### BoundedWildcard
Can generalize to `? extends NavigatablePsiElement`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
  }

  private void collectMethodTypesToImport(@NotNull List<NavigatablePsiElement> methods, boolean isInPsiUtil, @NotNull Set<String> result) {
    for (NavigatablePsiElement method : methods) {
      List<String> types = myJavaHelper.getMethodTypes(method);
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  public static String getElementType(BnfRule rule, @NotNull Case cas) {
    String elementType = getAttribute(rule, KnownAttribute.ELEMENT_TYPE);
    if ("".equals(elementType)) return "";
    NameFormat prefix = NameFormat.from(getAttribute(rule, KnownAttribute.ELEMENT_TYPE_PREFIX));
    return toIdentifier(elementType != null ? elementType : rule.getName(), prefix, cas);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    if (Rule.isPrivate(rule) || Rule.isExternal(rule)) return false;
    String attr = getAttribute(rule, KnownAttribute.ELEMENT_TYPE);
    if (!psiClasses) return !"".equals(attr);
    BnfRule thatRule = containingFile.getRule(attr);
    return thatRule == null || thatRule == grammarRoot || Rule.isPrivate(thatRule) || Rule.isExternal(thatRule);
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/org/intellij/grammar/actions/BnfRunJFlexAction.java`
#### Snippet
```java
        if (forceDir) {
          int idx = url.indexOf("/master/");
          if (idx <= -1) continue;
          if (!StringUtil.endsWithIgnoreCase(fileUrl, url.substring(idx + "/master/".length()))) continue;
        }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
public class BnfIntroduceRuleHandler implements RefactoringActionHandler {
  public static final String REFACTORING_NAME = "Extract Rule";
  public static final Function<BnfExpression, String> RENDER_FUNCTION = bnfExpression -> bnfExpression.getText().replaceAll("\\s+", " ");

  private final @Nullable Function<? super List<BnfExpression>, ? extends BnfExpression> myPopupVariantsHandler;
```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/livePreview/LiveHooksHelper.java`
#### Snippet
```java

  public static Object getHookParam(@NotNull String value) {
    String[] args = value.trim().split("\\s*,\\s*");
    if (args.length == 1) return ourBinders.get(args[0]);
    Object[] res = new WhitespacesAndCommentsBinder[args.length];
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  public static @NotNull String toIdentifier(@NotNull String text, @Nullable NameFormat format, @NotNull Case cas) {
    if (text.isEmpty()) return "";
    String fixed = text.replaceAll("[^:\\p{javaJavaIdentifierPart}]", "_");
    boolean allCaps = Case.UPPER.apply(fixed).equals(fixed);
    StringBuilder sb = new StringBuilder();
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  public static String getTokenType(BnfFile file, String token, @NotNull Case cas) {
    NameFormat format = NameFormat.from(getRootAttribute(file, KnownAttribute.ELEMENT_TYPE_PREFIX));
    String fixed = cas.apply(token.replaceAll("[^:\\p{javaJavaIdentifierPart}]", "_"));
    return format == null ? fixed : format.apply(fixed);
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      String unquoted = GrammarUtil.unquote(text);
      // in double-quoted strings: un-escape quotes only leaving the rest \ manageable
      String result = text.charAt(0) == '"' ? unquoted.replaceAll("\\\\([\"'])", "$1") : unquoted;
      return (T) result;
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
    String s;
    if (!isRegexp) {
      s = text.replaceAll("([\"\\\\])", "\\\\$1");
    }
    else {
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
    else {
      String spaces = " \\\\t\\\\n\\\\x0B\\\\f\\\\r";
      s = text.replaceAll("\"", "\\\\\"");
      s = s.replaceAll("(/+)", "\"$1\"");
      s = s.replaceAll("\\\\d", "[0-9]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      String spaces = " \\\\t\\\\n\\\\x0B\\\\f\\\\r";
      s = text.replaceAll("\"", "\\\\\"");
      s = s.replaceAll("(/+)", "\"$1\"");
      s = s.replaceAll("\\\\d", "[0-9]");
      s = s.replaceAll("\\\\D", "[^0-9]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = text.replaceAll("\"", "\\\\\"");
      s = s.replaceAll("(/+)", "\"$1\"");
      s = s.replaceAll("\\\\d", "[0-9]");
      s = s.replaceAll("\\\\D", "[^0-9]");
      s = s.replaceAll("\\\\s", "[" + spaces + "]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("(/+)", "\"$1\"");
      s = s.replaceAll("\\\\d", "[0-9]");
      s = s.replaceAll("\\\\D", "[^0-9]");
      s = s.replaceAll("\\\\s", "[" + spaces + "]");
      s = s.replaceAll("\\\\S", "[^" + spaces + "]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\d", "[0-9]");
      s = s.replaceAll("\\\\D", "[^0-9]");
      s = s.replaceAll("\\\\s", "[" + spaces + "]");
      s = s.replaceAll("\\\\S", "[^" + spaces + "]");
      s = s.replaceAll("\\\\w", "[a-zA-Z_0-9]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\D", "[^0-9]");
      s = s.replaceAll("\\\\s", "[" + spaces + "]");
      s = s.replaceAll("\\\\S", "[^" + spaces + "]");
      s = s.replaceAll("\\\\w", "[a-zA-Z_0-9]");
      s = s.replaceAll("\\\\W", "[^a-zA-Z_0-9]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\s", "[" + spaces + "]");
      s = s.replaceAll("\\\\S", "[^" + spaces + "]");
      s = s.replaceAll("\\\\w", "[a-zA-Z_0-9]");
      s = s.replaceAll("\\\\W", "[^a-zA-Z_0-9]");
      s = s.replaceAll("\\\\p\\{Space}", "[" + spaces + "]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\S", "[^" + spaces + "]");
      s = s.replaceAll("\\\\w", "[a-zA-Z_0-9]");
      s = s.replaceAll("\\\\W", "[^a-zA-Z_0-9]");
      s = s.replaceAll("\\\\p\\{Space}", "[" + spaces + "]");
      s = s.replaceAll("\\\\p\\{Digit}", "[:digit:]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\w", "[a-zA-Z_0-9]");
      s = s.replaceAll("\\\\W", "[^a-zA-Z_0-9]");
      s = s.replaceAll("\\\\p\\{Space}", "[" + spaces + "]");
      s = s.replaceAll("\\\\p\\{Digit}", "[:digit:]");
      s = s.replaceAll("\\\\p\\{Alpha}", "[:letter:]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\W", "[^a-zA-Z_0-9]");
      s = s.replaceAll("\\\\p\\{Space}", "[" + spaces + "]");
      s = s.replaceAll("\\\\p\\{Digit}", "[:digit:]");
      s = s.replaceAll("\\\\p\\{Alpha}", "[:letter:]");
      s = s.replaceAll("\\\\p\\{Lower}", "[:lowercase:]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\p\\{Space}", "[" + spaces + "]");
      s = s.replaceAll("\\\\p\\{Digit}", "[:digit:]");
      s = s.replaceAll("\\\\p\\{Alpha}", "[:letter:]");
      s = s.replaceAll("\\\\p\\{Lower}", "[:lowercase:]");
      s = s.replaceAll("\\\\p\\{Upper}", "[:uppercase:]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\p\\{Digit}", "[:digit:]");
      s = s.replaceAll("\\\\p\\{Alpha}", "[:letter:]");
      s = s.replaceAll("\\\\p\\{Lower}", "[:lowercase:]");
      s = s.replaceAll("\\\\p\\{Upper}", "[:uppercase:]");
      s = s.replaceAll("\\\\p\\{Alnum}", "([:letter:]|[:digit:])");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\p\\{Alpha}", "[:letter:]");
      s = s.replaceAll("\\\\p\\{Lower}", "[:lowercase:]");
      s = s.replaceAll("\\\\p\\{Upper}", "[:uppercase:]");
      s = s.replaceAll("\\\\p\\{Alnum}", "([:letter:]|[:digit:])");
      s = s.replaceAll("\\\\p\\{ASCII}", "[\\x00-\\x7F]");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\p\\{Lower}", "[:lowercase:]");
      s = s.replaceAll("\\\\p\\{Upper}", "[:uppercase:]");
      s = s.replaceAll("\\\\p\\{Alnum}", "([:letter:]|[:digit:])");
      s = s.replaceAll("\\\\p\\{ASCII}", "[\\x00-\\x7F]");
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      s = s.replaceAll("\\\\p\\{Upper}", "[:uppercase:]");
      s = s.replaceAll("\\\\p\\{Alnum}", "([:letter:]|[:digit:])");
      s = s.replaceAll("\\\\p\\{ASCII}", "[\\x00-\\x7F]");
    }
    return s;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
      sb.append(text2JFlex(javaRegexp.substring(start, m.start()), true));
      // escape only double quotes inside character class [...]
      sb.append(javaRegexp.substring(m.start(), m.end()).replaceAll("\"", "\\\\\""));
      start = m.end();
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/generator/NameShortener.java`
#### Snippet
```java
    for (String item : initialImports) {
      boolean isStatic = false;
      for (String s : StringUtil.tokenize(item.replaceAll("\\s+", " "), TYPE_TEXT_SEPARATORS)) {
        s = StringUtil.trimStart(StringUtil.trimStart(s, "? super "), "? extends ");
        boolean wasStatic = isStatic;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
        StringUtil.isEmpty(stubName) ? superRuleClass :
        AST_WRAPPER_PSI_ELEMENT_CLASS.equals(superRuleClass) ? STUB_BASED_PSI_ELEMENT_BASE + "<" + stubName + ">" :
        superRuleClass.contains("?") ? superRuleClass.replaceAll("\\?", stubName) : superRuleClass;
      // mixin attribute overrides "extends":
      info.realSuperClass = StringUtil.notNullize(info.mixin, adjustedSuperRuleClass);
```

## RuleId[id=DialogTitleCapitalization]
### DialogTitleCapitalization
String 'Grammar-Kit BNF Live Preview' is not properly capitalized. It should have sentence capitalization
in `src/org/intellij/grammar/livePreview/LivePreviewFileType.java`
#### Snippet
```java
  @Override
  public @NotNull String getDescription() {
    return GrammarKitBundle.message("language.name.bnf.live.preview");
  }

```

### DialogTitleCapitalization
String 'unmatched input' is not properly capitalized. It should have sentence capitalization
in `src/org/intellij/grammar/parser/GeneratedParserUtilBase.java`
#### Snippet
```java
    if (expected.isEmpty()) {
      if (isEmpty(actual)) {
        message = "unmatched input";
      }
      else {
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
    Object2IntMap<String> visited = new Object2IntOpenHashMap<>();
    LinkedList<Pair<PsiElement, PsiElement>> work = new LinkedList<>();
    (expression = (BnfExpression)expression.copy()).acceptChildren(new PsiRecursiveElementWalkingVisitor() {
      @Override
      public void visitElement(@NotNull PsiElement element) {
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
            String text = list.get(0).getText();
            int idx = visited.getInt(text);
            if (idx == 0) visited.put(text, idx = visited.size() + 1);
            if (idx < expressionList.size()) {
              work.addFirst(Pair.create(element, expressionList.get(idx)));
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
    String s;
    addJarEntry(jar, "misc/registry.properties");
    while ((s = reader.readLine()) != null) {
      Matcher matcher = pattern.matcher(s);
      if (!matcher.matches()) continue;
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/psi/impl/BnfStringImpl.java`
#### Snippet
```java
    PsiReference ref = e.getUserData(REF_KEY);
    if (ref == null) {
      e.putUserData(REF_KEY, ref = new MyRuleReference(e));
    }
    return ref;
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/psi/impl/BnfStringImpl.java`
#### Snippet
```java
    PsiReference ref = e.getUserData(REF_KEY);
    if (ref == null) {
      e.putUserData(REF_KEY, ref = new MyPatternReference(e));
    }
    return ref;
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/generator/RuleMethodsHelper.java`
#### Snippet
```java
    private MethodInfo(MethodType type, String name, String path, BnfRule rule, RuleGraphHelper.Cardinality cardinality) {
      this.type = type;
      this.name = originalName = name;
      this.path = path;
      this.rule = rule;
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
                                    BnfExpression... expressions) {
    List<BnfExpression[]> list = occurrencesMap.get(choice);
    if (list == null) occurrencesMap.put(choice, list = new LinkedList<>());
    list.add(expressions);
  }
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/jflex/psi/impl/JFlexJavaCodeInjector.java`
#### Snippet
```java
        int i = 1;
        for (JFlexStateDefinition element : states) {
          sb.append("  public static final int ").append(element.getName()).append(" = ").append(i += 2).append(";\n");
        }
        sb.append("\n");
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
    CachedValue<ExpressionHelper> value = file.getUserData(EXPRESSION_HELPER_KEY);
    if (value == null) {
      file.putUserData(EXPRESSION_HELPER_KEY, value = CachedValuesManager.getManager(file.getProject()).createCachedValue(
        () -> new CachedValueProvider.Result<>(new ExpressionHelper(file, RuleGraphHelper.getCached(file), null), file), false));
    }
    return value.getValue();
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
          }
          List<AttributeInfo> list = result.get(attr.getName());
          if (list == null) result.put(attr.getName(), list = new ArrayList<>());
          Object value = ParserGeneratorUtil.getAttributeValue(attr.getExpression());
          int offset = attr.getTextRange().getStartOffset();
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/generator/NameShortener.java`
#### Snippet
```java
      }
      else if (!quoted && (myImports.contains(part) ||
                           "java.lang".equals(pkg = StringUtil.getPackageName(part)) ||
                           myPackage.equals(pkg) ||
                           myImports.contains(pkg + ".*") ||
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/generator/NameShortener.java`
#### Snippet
```java
        }
      }
      else if (!quoted && prefixStack != null && !prefixStack.isEmpty() && parenCount == (prefix = prefixStack.peek())[0] &&
               s.substring(prefix[3] + 1, offset).trim().length() > 0) {
        prefixStack.pop();
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
      String opCall = getNextName(operator.rule.getName(), 0);
      List<ExpressionHelper.OperatorInfo> list = opCalls.get(opCall);
      if (list == null) opCalls.put(opCall, list = new ArrayList<>(2));
      list.add(operator);
    }
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
      String argNextName;
      int metaIdx;
      if (argument.startsWith("<<") && (metaIdx = metaParameterNames.indexOf(argument)) > -1) {
        nested = expressions.get(metaIdx + 1);
        argNextName = getNextName(nextName, metaIdx);
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    PsiElement e = myExternalElements.get(name);
    if (e == null) {
      myExternalElements.put(name, e = new FakeBnfExpression(EXTERNAL_TYPE, name));
    }
    return e;
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    CachedValue<RuleGraphHelper> value = file.getUserData(RULE_GRAPH_HELPER_KEY);
    if (value == null) {
      file.putUserData(RULE_GRAPH_HELPER_KEY, value = CachedValuesManager.getManager(file.getProject()).createCachedValue(
        () -> new CachedValueProvider.Result<>(new RuleGraphHelper(file), file), false));
    }
    return value.getValue();
```

### NestedAssignment
Result of assignment expression used
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
        String argNextName;
        int metaIdx;
        if (argument.startsWith("<<") && (metaIdx = metaParameterNames.indexOf(argument)) > -1) {
          nested = expressions.get(metaIdx + 1);
          argument = nested.getText();
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
    }
    catch (Throwable throwable) {
      throwable.printStackTrace();
    }
    finally {
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `BnfRefOrTokenImpl()` of an abstract class should not be declared 'public'
in `src/org/intellij/grammar/psi/impl/BnfRefOrTokenImpl.java`
#### Snippet
```java
 */
public abstract class BnfRefOrTokenImpl extends BnfExpressionImpl implements BnfReferenceOrToken {
  public BnfRefOrTokenImpl(IElementType elementType) {
    super(elementType);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BnfStringImpl()` of an abstract class should not be declared 'public'
in `src/org/intellij/grammar/psi/impl/BnfStringImpl.java`
#### Snippet
```java
  }

  public BnfStringImpl(IElementType type) {
    super(type);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BnfNamedImpl()` of an abstract class should not be declared 'public'
in `src/org/intellij/grammar/psi/impl/BnfNamedImpl.java`
#### Snippet
```java
  private volatile String myCachedName;
  
  public BnfNamedImpl(IElementType elementType) {
    super(elementType);
  }
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `typeParameters` are updated, but never queried
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    String superClass;
    int modifiers;
    final List<String> typeParameters = new SmartList<>();
    final List<String> interfaces = new SmartList<>();
    final List<String> annotations = new SmartList<>();
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
                                    BnfExpression... expressions) {
    List<BnfExpression[]> list = occurrencesMap.get(choice);
    if (list == null) occurrencesMap.put(choice, list = new LinkedList<>());
    list.add(expressions);
  }
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
          }
          List<AttributeInfo> list = result.get(attr.getName());
          if (list == null) result.put(attr.getName(), list = new ArrayList<>());
          Object value = ParserGeneratorUtil.getAttributeValue(attr.getExpression());
          int offset = attr.getTextRange().getStartOffset();
```

### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
      String opCall = getNextName(operator.rule.getName(), 0);
      List<ExpressionHelper.OperatorInfo> list = opCalls.get(opCall);
      if (list == null) opCalls.put(opCall, list = new ArrayList<>(2));
      list.add(operator);
    }
```

## RuleId[id=EmptyMethod]
### EmptyMethod
The method is empty
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
  }

  public static void init() {
  }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/org/intellij/grammar/actions/GenerateAction.java`
#### Snippet
```java
      final List<File> files = new ArrayList<>();
      final Set<VirtualFile> targets = new LinkedHashSet<>();
      int filesProcessed = 0;
      long totalWritten = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/org/intellij/grammar/actions/GenerateAction.java`
#### Snippet
```java
      final Set<VirtualFile> targets = new LinkedHashSet<>();
      int filesProcessed = 0;
      long totalWritten = 0;

      @Override
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
  }

  public static class MockLanguageFileType extends LanguageFileType {

    private final String myExtension;
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `first`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
  private static PsiElement unwrap(PsiElement parent, PsiElement first, PsiElement last, PsiElement from) {
    while (first != last && first instanceof PsiWhiteSpace) {
      first = first.getNextSibling();
    }
    while (last != first && last instanceof PsiWhiteSpace) {
```

### AssignmentToMethodParameter
Assignment to method parameter `last`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
    }
    while (last != first && last instanceof PsiWhiteSpace) {
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `cur`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      first = first.getNextSibling();
    }
    cur = unwrap(parent, first, last, cur);
    while (cur != null) {
      if (cur instanceof BnfExpression) list.add(cur);
```

### AssignmentToMethodParameter
Assignment to method parameter `cur`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      if (cur instanceof BnfExpression) list.add(cur);
      if (cur == last) break;
      cur = cur.getNextSibling();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `wildcardPattern`
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java

  private static String convertToJavaPattern(String wildcardPattern) {
    wildcardPattern = StringUtil.replace(wildcardPattern, ".", "\\.");
    wildcardPattern = StringUtil.replace(wildcardPattern, "*?", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "?*", ".+");
```

### AssignmentToMethodParameter
Assignment to method parameter `wildcardPattern`
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
  private static String convertToJavaPattern(String wildcardPattern) {
    wildcardPattern = StringUtil.replace(wildcardPattern, ".", "\\.");
    wildcardPattern = StringUtil.replace(wildcardPattern, "*?", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "?*", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "*", ".*");
```

### AssignmentToMethodParameter
Assignment to method parameter `wildcardPattern`
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
    wildcardPattern = StringUtil.replace(wildcardPattern, ".", "\\.");
    wildcardPattern = StringUtil.replace(wildcardPattern, "*?", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "?*", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "*", ".*");
    wildcardPattern = StringUtil.replace(wildcardPattern, "?", ".");
```

### AssignmentToMethodParameter
Assignment to method parameter `wildcardPattern`
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
    wildcardPattern = StringUtil.replace(wildcardPattern, "*?", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "?*", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "*", ".*");
    wildcardPattern = StringUtil.replace(wildcardPattern, "?", ".");
    return wildcardPattern;
```

### AssignmentToMethodParameter
Assignment to method parameter `wildcardPattern`
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
    wildcardPattern = StringUtil.replace(wildcardPattern, "?*", ".+");
    wildcardPattern = StringUtil.replace(wildcardPattern, "*", ".*");
    wildcardPattern = StringUtil.replace(wildcardPattern, "?", ".");
    return wildcardPattern;
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `expression`
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
    Object2IntMap<String> visited = new Object2IntOpenHashMap<>();
    LinkedList<Pair<PsiElement, PsiElement>> work = new LinkedList<>();
    (expression = (BnfExpression)expression.copy()).acceptChildren(new PsiRecursiveElementWalkingVisitor() {
      @Override
      public void visitElement(@NotNull PsiElement element) {
```

### AssignmentToMethodParameter
Assignment to method parameter `item`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
    @Override
    public @Nullable SimpleColoredText getItemName(@Nullable BnfRule element, @Nullable Object item, @NotNull DiagramBuilder builder) {
      if (item instanceof Item o) item = o.rule;
      if (item instanceof PsiNamedElement) {
        return new SimpleColoredText(StringUtil.notNullize(((PsiNamedElement)item).getName()), DEFAULT_TITLE_ATTR);
```

### AssignmentToMethodParameter
Assignment to method parameter `endOffset`
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
  private static @Nullable BnfExpression findParentExpression(PsiFile file, int startOffset, int endOffset) {
    if (endOffset > startOffset) {
      endOffset--;
    }
    PsiElement startElement = file.findElementAt(startOffset);
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `src/org/intellij/grammar/intention/BnfConvertOptExpressionIntention.java`
#### Snippet
```java
  private static BnfExpression skipBracketsDown(BnfExpression expr) {
    while (expr instanceof BnfParenOptExpression) {
      expr = ((BnfParenOptExpression)expr).getExpression();
    }
    return expr;
```

### AssignmentToMethodParameter
Assignment to method parameter `expr`
in `src/org/intellij/grammar/intention/BnfConvertOptExpressionIntention.java`
#### Snippet
```java
  private static BnfExpression skipParenthesesDown(BnfExpression expr) {
    while (expr instanceof BnfParenthesized) {
      expr = ((BnfParenthesized)expr).getExpression();
    }
    return expr;
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java

    public String strip(String s) {
      if (prefix != null && s.startsWith(prefix)) s = s.substring(prefix.length());
      if (suffix != null && s.endsWith(suffix)) s = s.substring(0, s.length() - suffix.length());
      return s;
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    public String strip(String s) {
      if (prefix != null && s.startsWith(prefix)) s = s.substring(prefix.length());
      if (suffix != null && s.endsWith(suffix)) s = s.substring(0, s.length() - suffix.length());
      return s;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java

    public String apply(String s) {
      if (prefix != null) s = prefix + s;
      if (suffix != null) s += suffix;
      return s;
```

### AssignmentToMethodParameter
Assignment to method parameter `s`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    public String apply(String s) {
      if (prefix != null) s = prefix + s;
      if (suffix != null) s += suffix;
      return s;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `c`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java

    public Cardinality or(Cardinality c) {
      if (c == null) c = NONE;
      if (this == NONE && c == NONE) return NONE;
      if (this == NONE) return c;
```

### AssignmentToMethodParameter
Assignment to method parameter `list`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    if (type == BnfTypes.BNF_OP_OPT || type == BnfTypes.BNF_OP_ZEROMORE || type == BnfTypes.BNF_OP_ONEMORE) {
      ParserGenerator.LOG.assertTrue(list.size() == 1);
      list = compactInheritors(rule, list);
      Map<PsiElement, Cardinality> m = list.get(0);
      if (tryCollapse && willCollapse(rule, m) && type == BnfTypes.BNF_OP_OPT) {
```

### AssignmentToMethodParameter
Assignment to method parameter `list`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    }
    else if (type == BnfTypes.BNF_SEQUENCE || type == BnfTypes.BNF_EXPRESSION || type == BnfTypes.BNF_REFERENCE_OR_TOKEN) {
      list = new ArrayList<>(compactInheritors(rule, list));
      list.removeIf(Map::isEmpty);
      Map<PsiElement, Cardinality> map = psiMap();
```

### AssignmentToMethodParameter
Assignment to method parameter `list`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    else if (type == BnfTypes.BNF_CHOICE) {
      Map<PsiElement, Cardinality> map = psiMap();
      list = compactInheritors(rule, list);
      if (tryCollapse) {
        for (int i = 0, newListSize = list.size(); i < newListSize; i++) {
```

### AssignmentToMethodParameter
Assignment to method parameter `marker`
in `src/org/intellij/grammar/parser/GeneratedParserUtilBase.java`
#### Snippet
```java
      state.predicateCount--;
      if ((frame.modifiers & _NOT_) != 0) state.predicateSign = !state.predicateSign;
      marker = elementType != null && marker != null && (result || pinned) ? builder.mark() : null;
      if (resetLastPos) frame.lastVariantAt = builder.rawTokenIndex();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `elementType`
in `src/org/intellij/grammar/parser/GeneratedParserUtilBase.java`
#### Snippet
```java
              state.typeExtends(last.getTokenType(), elementType) &&
              wasAutoSkipped(builder, builder.rawTokenIndex() - last.getEndIndex())) {
            elementType = last.getTokenType();
            ((PsiBuilder.Marker)last).drop();
          }
```

### AssignmentToMethodParameter
Assignment to method parameter `elementType`
in `src/org/intellij/grammar/parser/GeneratedParserUtilBase.java`
#### Snippet
```java
    Frame frame = state.currentFrame;
    state.currentFrame = frame == null ? null : frame.parentFrame;
    if (frame != null && frame.elementType != null) elementType = frame.elementType;
    if (frame == null || level != frame.level) {
      LOG.error("Unbalanced error section: got " + frame + ", expected level " + level);
```

### AssignmentToMethodParameter
Assignment to method parameter `pinApplied`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      if (!pinApplied && pinMatcher.matches(i, child)) {
        pin = i - startIndex + 1;
        pinApplied = true;
      }
    }
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `ModificationTracker`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
  }

  private static class MyDataModel extends DiagramDataModel<BnfRule> implements ModificationTracker {

    private final BnfFile myFile;
```

### RedundantImplements
Redundant interface declaration `NavigatablePsiElement`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
  }

  private static class MyElement<T> extends FakePsiElement implements NavigatablePsiElement {

    final T delegate;
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-11-17-07-24.520.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;
    for (PsiElement c = first; c != last && c != null; c = c.getNextSibling()) {
      toExtract.add(c);
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;

    PsiElement result = parent.addRangeBefore(first, last, from);
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfFoldingBuilder.java`
#### Snippet
```java
    if (psi instanceof BnfValueList) return "[..]";
    if (node.getElementType() == BnfParserDefinition.BNF_BLOCK_COMMENT) return "/*..*/";
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
    @Override public @NotNull String getDescription() { return ""; }
    @Override public @NotNull String getDefaultExtension() { return myExtension; }
    @Override public Icon getIcon() { return null; }
    @Override
    public boolean equals(Object obj) {
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/psi/impl/BnfStringImpl.java`
#### Snippet
```java
    @Override
    public <R> R accept(@NotNull BnfVisitor<R> visitor) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
    public BnfRule findInDataContext(@NotNull DataContext context) {
      PsiFile file = CommonDataKeys.PSI_FILE.getData(context);
      if (!(file instanceof BnfFile bnfFile)) return null;
      List<BnfRule> rules = bnfFile.getRules();
      return rules.get(0);
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
    @Override
    public DiagramNode<BnfRule> addElement(BnfRule psiElement) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
    public BnfRule resolveElementByFQN(@NotNull String s, @NotNull Project project) {
      List<String> parts = StringUtil.split(s, "?rule=");
      if (parts.size() < 1 || parts.size() > 2) return null;
      VirtualFile virtualFile = VirtualFileManager.getInstance().findFileByUrl(parts.get(0));
      PsiFile psiFile = virtualFile == null ? null : PsiManager.getInstance(project).findFile(virtualFile);
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
      VirtualFile virtualFile = VirtualFileManager.getInstance().findFileByUrl(parts.get(0));
      PsiFile psiFile = virtualFile == null ? null : PsiManager.getInstance(project).findFile(virtualFile);
      if (!(psiFile instanceof BnfFile bnfFile)) return null;
      return parts.size() == 2 ? ((BnfFile)psiFile).getRule(parts.get(1)) : ContainerUtil.getFirstItem(bnfFile.getRules());
    }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/editor/BnfRecursionLineMarkerProvider.java`
#### Snippet
```java
    @Override
    public GutterIconRenderer createGutterRenderer() {
      if (myIcon == null) return null;
      return new LineMarkerGutterIconRenderer<>(this) {
        @Override
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
      parent = parent.getParent();
    }
    return parent == null? null : parent.getPrevSibling();
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
  private static final Key<List<BnfExpression>> ORIGINAL_EXPRESSIONS = Key.create("ORIGINAL_EXPRESSIONS");
  private static BnfExpression combine(List<BnfExpression> list) {
    if (list.isEmpty()) return null;
    if (list.size() == 1) return list.get(0);
    Project project = list.get(0).getProject();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
    BnfRule root = myRootRulesMap.get(rule);
    ExpressionInfo info = root == null ? null : myExpressionMap.get(root);
    if (info == null) return null;
    if (info.rootRule == rule || Rule.isPrivate(rule)) return info;
    return info.priorityMap.containsKey(rule) ? info : null;
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
    if (info == null) return null;
    if (info.rootRule == rule || Rule.isPrivate(rule)) return info;
    return info.priorityMap.containsKey(rule) ? info : null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/livePreview/LiveHooksHelper.java`
#### Snippet
```java
    Object[] res = new WhitespacesAndCommentsBinder[args.length];
    for (int i = 0; i < args.length; i++) {
      if (!ourBinders.containsKey(args[i])) return null;
      res[i] = ourBinders.get(args[i]);
    }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/KnownAttribute.java`
#### Snippet
```java
    try {
      InputStream resourceAsStream = getClass().getResourceAsStream("/messages/attributeDescriptions/" + getName() + ".html");
      return resourceAsStream == null? null : FileUtil.loadTextAndClose(resourceAsStream);
    }
    catch (IOException e) {
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/KnownAttribute.java`
#### Snippet
```java
    }
    catch (IOException e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java
        }
      });
    return resultRef.isNull() ? null : resultRef.get().getQualifiedName();
  }
}
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java
    Module module = ModuleUtilCore.findModuleForPsiElement(origin);
    CreateClassDialog dialog = new CreateClassDialog(project, title, suggestedName, suggestedPackage, CreateClassKind.CLASS, true, module);
    if (!dialog.showAndGet()) return null;

    String className = dialog.getClassName();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
    return JBIterable.generate(
      Math.min(list.size() - 1, index < 0 ? -index - 1 : index),
      i -> i > 0 ? i - 1 : null)
      .map(i -> {
        AttributeInfo info = list.get(i);
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
      .map(i -> {
        AttributeInfo info = list.get(i);
        if (offset < info.offset || !info.global && ruleStartOffset > info.offset) return null;
        if (info.pattern == null || toMatch != null && info.pattern.matcher(toMatch).matches()) {
          return info;
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
          return info;
        }
        return null;
      }).filter(Conditions.notNull());
  }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    }
    else if (expression instanceof BnfReferenceOrToken) {
      return file.getRule(text) == null ? text : null;
    }
    else {
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    }
    else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
        if (!isTrivialNode(tree)) return tree;
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java

  public static Object getAttributeValue(BnfExpression value) {
    if (value == null) return null;
    if (value instanceof BnfReferenceOrToken) {
      return getTokenValue((BnfReferenceOrToken)value);
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      return pairs;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      @Override
      public Object fun(Object o) {
        if (o == ObjectUtils.NULL) return null;
        BnfRule cur = (BnfRule)o;
        if (visited == null) visited = new HashSet<>();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
        BnfRule next = getSynonymTargetOrSelf(cur);
        if (next != cur) return next;
        if (cur != rule) return null; // do not search for elementType any further
        String attr = getAttribute(cur, KnownAttribute.EXTENDS);
        //noinspection StringEquality
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
        //noinspection StringEquality
        BnfRule ext = attr != KnownAttribute.EXTENDS.getDefaultValue() ? file.getRule(attr) : null;
        return ext == null && attr != null ? null : ext;
      }
    }).map(o -> o == ObjectUtils.NULL ? null : o);
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
        return ext == null && attr != null ? null : ext;
      }
    }).map(o -> o == ObjectUtils.NULL ? null : o);
    return (JBIterable<BnfRule>)(JBIterable<?>)result;
  }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    }
    return child instanceof BnfExpression && !(child instanceof BnfLiteralExpression || child instanceof BnfReferenceOrToken) ?
        (BnfExpression) child : null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java

  private IElementType getTokenElementType(String token) {
    return token == null ? null : myTokenElementTypes.get(myTokenTypeText + token.toUpperCase());
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
        public AnnotationVisitor visitArray(String s) {
          annoParamCounter++;
          return null;
        }
      }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java

    private static ClassInfo findClassSafe(String className) {
      if (className == null) return null;
      try {
        int lastDot = className.length();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
        while(is == null && lastDot > 0);

        if (is == null) return null;
        byte[] bytes = FileUtil.loadBytes(is);
        is.close();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
        reportException(e, className, null);
      }
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
        public AnnotationVisitor visitAnnotation(String s, String s2) {
          annoParamCounter++;
          return null;
        }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public PsiElement getParent() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java

    private static String fixClassName(String s) {
      return s == null ? null : s.replace('/', '.').replace('$', '.');
    }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java

    private PsiClass findClassSafe(String className) {
      if (className == null) return null;
      try {
        return myFacade.findClass(className, GlobalSearchScope.allScope(myFacade.getProject()));
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
      }
      catch (IndexNotReadyException e) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    }

    return dropFrameName && StringUtil.isEmpty(getAttribute(rule, KnownAttribute.NAME)) ? null : frameName;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java

      if (item.isEmpty()) return item;
      if (targetRule[0] == null) return null;
      RuleMethodsHelper.MethodInfo targetInfo = myRulesMethodsHelper.getMethodInfo(targetRule[0], item);
      targetRule[0] = targetInfo == null ? null : targetInfo.rule;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/org/intellij/grammar/livePreview/LivePreviewLexer.java`
#### Snippet
```java
    BnfFile bnfFile = language.getGrammar(project);

    myTokens = bnfFile == null? new Token[0] : CachedValuesManager.getCachedValue(bnfFile, () -> {
      Set<String> usedInGrammar = new LinkedHashSet<>();
      Map<String, String> map = collectTokenPattern2Name(bnfFile, usedInGrammar);
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
    ContainerUtil.addIfNotNull(braces, tryMakeBracePair("[", "]", false));
    ContainerUtil.addIfNotNull(braces, tryMakeBracePair("<", ">", false));
    ErrorState.get(builder).braces = braces.isEmpty() ? null : braces.toArray(new BracePair[0]);
    boolean result = true;
    PsiBuilder.Marker marker = enter_section_(builder, 0, _COLLAPSE_, null);
```

## RuleId[id=ClassCanBeRecord]
### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/generator/NodeCalls.java`
#### Snippet
```java
  }

  static class MetaParameterCall implements NodeCall {

    final String metaParameterName;
```

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/generator/NodeCalls.java`
#### Snippet
```java
  }

  static class MetaMethodCallArgument implements NodeArgument {

    final MetaMethodCall call;
```

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/generator/NodeCalls.java`
#### Snippet
```java
  }

  static class ConsumeTokensCall implements NodeCall {

    final String methodName;
```

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/generator/NodeCalls.java`
#### Snippet
```java
  }

  static class ConsumeTokenChoiceCall implements NodeCall {

    final ParserGeneratorUtil.ConsumeType consumeType;
```

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/generator/NodeCalls.java`
#### Snippet
```java
  }

  static class MethodCall implements NodeCall {

    final boolean renderClass;
```

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/generator/NodeCalls.java`
#### Snippet
```java
  }

  static class ExpressionMethodCall implements NodeCall {

    final String methodName;
```

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/generator/NodeCalls.java`
#### Snippet
```java
  }

  static class ConsumeTokenCall implements NodeCall {

    final ParserGeneratorUtil.ConsumeType consumeType;
```

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
  }

  private static class AttributeInfo implements Comparable<AttributeInfo> {
    final int attrOffset;
    final int offset;
```

## RuleId[id=ConstantValue]
### ConstantValue
Value `pinApplied` is always 'true'
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
                // do not report error for last child
                if (i == p + 1) {
                  result_ = result_ && generateTokenSequenceCall(builder, level, rule, children, funcName, i, pinMatcher, pinApplied, skip, externalArguments);
                }
                else {
```

### ConstantValue
Value `pinApplied` is always 'true'
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
                }
                else {
                  result_ = pinned_ && generateTokenSequenceCall(builder, level, rule, children, funcName, i, pinMatcher, pinApplied, skip, externalArguments) && result_;
                }
              }
```

### ConstantValue
Value `pinApplied` is always 'true'
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
              }
              else if (i == p + 1) {
                result_ = result_ && report_error_(builder, generateTokenSequenceCall(builder, level, rule, children, funcName, i, pinMatcher, pinApplied, skip, externalArguments));
              }
              else {
```

### ConstantValue
Value `pinApplied` is always 'true'
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
              }
              else {
                result_ = pinned_ && report_error_(builder, generateTokenSequenceCall(builder, level, rule, children, funcName, i, pinMatcher, pinApplied, skip, externalArguments)) && result_;
              }
            }
```

### ConstantValue
Condition `frameName == null` is always `true`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java

    boolean sectionRequired = !alwaysTrue || !isPrivate || isLeft || recoverWhile != null;
    boolean sectionRequiredSimple = sectionRequired && modifierList.isEmpty() && recoverWhile == null && frameName == null;
    boolean sectionMaybeDropped = sectionRequiredSimple && type == BNF_CHOICE && elementTypeRef == null &&
                                  !ContainerUtil.exists(children, o -> isRollbackRequired(o, myFile));
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' is marked unstable with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java

    public static void initExtensions(MockApplication application, @NotNull MockProject project) {
      ExtensionsAreaImpl ra = application.getExtensionArea();
      ra.registerExtensionPoint("com.intellij.referencesSearch", "com.intellij.util.QueryExecutor", INTERFACE, false);
      ra.getExtensionPoint("com.intellij.referencesSearch").registerExtension(new CachesBasedRefSearcher(), project);
```

### UnstableApiUsage
'getExtensionArea()' is unstable because its signature references unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java

    public static void initExtensions(MockApplication application, @NotNull MockProject project) {
      ExtensionsAreaImpl ra = application.getExtensionArea();
      ra.registerExtensionPoint("com.intellij.referencesSearch", "com.intellij.util.QueryExecutor", INTERFACE, false);
      ra.getExtensionPoint("com.intellij.referencesSearch").registerExtension(new CachesBasedRefSearcher(), project);
```

### UnstableApiUsage
'registerExtensionPoint(java.lang.String, java.lang.String, com.intellij.openapi.extensions.ExtensionPoint.Kind, boolean)' is declared in unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
    public static void initExtensions(MockApplication application, @NotNull MockProject project) {
      ExtensionsAreaImpl ra = application.getExtensionArea();
      ra.registerExtensionPoint("com.intellij.referencesSearch", "com.intellij.util.QueryExecutor", INTERFACE, false);
      ra.getExtensionPoint("com.intellij.referencesSearch").registerExtension(new CachesBasedRefSearcher(), project);
      ra.registerExtensionPoint("com.intellij.useScopeEnlarger", "com.intellij.psi.search.UseScopeEnlarger", INTERFACE, false);
```

### UnstableApiUsage
'getExtensionPoint(java.lang.String)' is declared in unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ExtensionsAreaImpl ra = application.getExtensionArea();
      ra.registerExtensionPoint("com.intellij.referencesSearch", "com.intellij.util.QueryExecutor", INTERFACE, false);
      ra.getExtensionPoint("com.intellij.referencesSearch").registerExtension(new CachesBasedRefSearcher(), project);
      ra.registerExtensionPoint("com.intellij.useScopeEnlarger", "com.intellij.psi.search.UseScopeEnlarger", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.useScopeOptimizer", "com.intellij.psi.search.ScopeOptimizer", INTERFACE, false);
```

### UnstableApiUsage
'registerExtension(@org.jetbrains.annotations.NotNull T, com.intellij.openapi.@org.jetbrains.annotations.NotNull Disposable)' is declared in unstable class 'com.intellij.openapi.extensions.impl.ExtensionPointImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ExtensionsAreaImpl ra = application.getExtensionArea();
      ra.registerExtensionPoint("com.intellij.referencesSearch", "com.intellij.util.QueryExecutor", INTERFACE, false);
      ra.getExtensionPoint("com.intellij.referencesSearch").registerExtension(new CachesBasedRefSearcher(), project);
      ra.registerExtensionPoint("com.intellij.useScopeEnlarger", "com.intellij.psi.search.UseScopeEnlarger", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.useScopeOptimizer", "com.intellij.psi.search.ScopeOptimizer", INTERFACE, false);
```

### UnstableApiUsage
'registerExtensionPoint(java.lang.String, java.lang.String, com.intellij.openapi.extensions.ExtensionPoint.Kind, boolean)' is declared in unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ra.registerExtensionPoint("com.intellij.referencesSearch", "com.intellij.util.QueryExecutor", INTERFACE, false);
      ra.getExtensionPoint("com.intellij.referencesSearch").registerExtension(new CachesBasedRefSearcher(), project);
      ra.registerExtensionPoint("com.intellij.useScopeEnlarger", "com.intellij.psi.search.UseScopeEnlarger", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.useScopeOptimizer", "com.intellij.psi.search.ScopeOptimizer", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.codeInsight.containerProvider", "com.intellij.codeInsight.ContainerProvider", INTERFACE, false);
```

### UnstableApiUsage
'registerExtensionPoint(java.lang.String, java.lang.String, com.intellij.openapi.extensions.ExtensionPoint.Kind, boolean)' is declared in unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ra.getExtensionPoint("com.intellij.referencesSearch").registerExtension(new CachesBasedRefSearcher(), project);
      ra.registerExtensionPoint("com.intellij.useScopeEnlarger", "com.intellij.psi.search.UseScopeEnlarger", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.useScopeOptimizer", "com.intellij.psi.search.ScopeOptimizer", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.codeInsight.containerProvider", "com.intellij.codeInsight.ContainerProvider", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.languageInjector", "com.intellij.psi.LanguageInjector", INTERFACE, false);
```

### UnstableApiUsage
'registerExtensionPoint(java.lang.String, java.lang.String, com.intellij.openapi.extensions.ExtensionPoint.Kind, boolean)' is declared in unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ra.registerExtensionPoint("com.intellij.useScopeEnlarger", "com.intellij.psi.search.UseScopeEnlarger", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.useScopeOptimizer", "com.intellij.psi.search.ScopeOptimizer", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.codeInsight.containerProvider", "com.intellij.codeInsight.ContainerProvider", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.languageInjector", "com.intellij.psi.LanguageInjector", INTERFACE, false);
      project.registerService(PsiSearchHelper.class, PsiSearchHelperImpl.class);
```

### UnstableApiUsage
'registerExtensionPoint(java.lang.String, java.lang.String, com.intellij.openapi.extensions.ExtensionPoint.Kind, boolean)' is declared in unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ra.registerExtensionPoint("com.intellij.useScopeOptimizer", "com.intellij.psi.search.ScopeOptimizer", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.codeInsight.containerProvider", "com.intellij.codeInsight.ContainerProvider", INTERFACE, false);
      ra.registerExtensionPoint("com.intellij.languageInjector", "com.intellij.psi.LanguageInjector", INTERFACE, false);
      project.registerService(PsiSearchHelper.class, PsiSearchHelperImpl.class);
      project.getExtensionArea().registerExtensionPoint("com.intellij.multiHostInjector", "com.intellij.lang.injection.MultiHostInjector", INTERFACE, false);
```

### UnstableApiUsage
'getExtensionArea()' is unstable because its signature references unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ra.registerExtensionPoint("com.intellij.languageInjector", "com.intellij.psi.LanguageInjector", INTERFACE, false);
      project.registerService(PsiSearchHelper.class, PsiSearchHelperImpl.class);
      project.getExtensionArea().registerExtensionPoint("com.intellij.multiHostInjector", "com.intellij.lang.injection.MultiHostInjector", INTERFACE, false);
      try {
        project.registerService(JavaHelper.class, new JavaHelper.AsmHelper());
```

### UnstableApiUsage
'registerExtensionPoint(java.lang.String, java.lang.String, com.intellij.openapi.extensions.ExtensionPoint.Kind, boolean)' is declared in unstable 'com.intellij.openapi.extensions.impl.ExtensionsAreaImpl' marked with @ApiStatus.Internal
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      ra.registerExtensionPoint("com.intellij.languageInjector", "com.intellij.psi.LanguageInjector", INTERFACE, false);
      project.registerService(PsiSearchHelper.class, PsiSearchHelperImpl.class);
      project.getExtensionArea().registerExtensionPoint("com.intellij.multiHostInjector", "com.intellij.lang.injection.MultiHostInjector", INTERFACE, false);
      try {
        project.registerService(JavaHelper.class, new JavaHelper.AsmHelper());
```

### UnstableApiUsage
'com.intellij.openapi.util.NlsContexts' is marked unstable with @ApiStatus.Experimental
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java
  static String createClass(String className, PsiDirectory targetDirectory,
                            String baseClass,
                            @NlsContexts.Command String title,
                            Consumer<? super PsiClass> consumer) {
    Project project = targetDirectory.getProject();
```

### UnstableApiUsage
'com.intellij.openapi.util.NlsContexts.Command' is declared in unstable class 'com.intellij.openapi.util.NlsContexts' marked with @ApiStatus.Experimental
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java
  static String createClass(String className, PsiDirectory targetDirectory,
                            String baseClass,
                            @NlsContexts.Command String title,
                            Consumer<? super PsiClass> consumer) {
    Project project = targetDirectory.getProject();
```

### UnstableApiUsage
'com.intellij.openapi.util.NlsContexts' is marked unstable with @ApiStatus.Experimental
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java

  public static String createClass(@NotNull PsiFile origin,
                                   @NlsContexts.DialogTitle @NotNull String title,
                                   @Nullable String baseClass,
                                   @NotNull String suggestedName,
```

### UnstableApiUsage
'com.intellij.openapi.util.NlsContexts.DialogTitle' is declared in unstable class 'com.intellij.openapi.util.NlsContexts' marked with @ApiStatus.Experimental
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java

  public static String createClass(@NotNull PsiFile origin,
                                   @NlsContexts.DialogTitle @NotNull String title,
                                   @Nullable String baseClass,
                                   @NotNull String suggestedName,
```

