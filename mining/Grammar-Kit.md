# Grammar-Kit 
 
# Bad smells
I found 490 bad smells with 34 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 136 | false |
| ReturnNull | 68 | false |
| PatternVariableCanBeUsed | 27 | false |
| KeySetIterationMayUseEntrySet | 26 | false |
| AssignmentToMethodParameter | 26 | false |
| DynamicRegexReplaceableByCompiledPattern | 23 | false |
| ConditionCoveredByFurtherCondition | 18 | false |
| NestedAssignment | 17 | false |
| DataFlowIssue | 14 | false |
| AssignmentToForLoopParameter | 13 | false |
| BoundedWildcard | 13 | false |
| UtilityClassWithoutPrivateConstructor | 12 | true |
| EmptyMethod | 12 | false |
| SuspiciousMethodCalls | 11 | false |
| NonShortCircuitBoolean | 10 | false |
| SizeReplaceableByIsEmpty | 9 | true |
| ProtectedMemberInFinalClass | 9 | true |
| ClassCanBeRecord | 9 | false |
| NullableProblems | 6 | false |
| UNUSED_IMPORT | 5 | false |
| CommentedOutCode | 3 | false |
| NonProtectedConstructorInAbstractClass | 3 | true |
| Java8MapApi | 3 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| StringEqualsEmptyString | 2 | false |
| RedundantFieldInitialization | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| FieldMayBeStatic | 1 | false |
| RedundantSuppression | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| ThrowablePrintStackTrace | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| CaughtExceptionImmediatelyRethrown | 1 | false |
| EqualsAndHashcode | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
## RuleId[ruleID=FieldMayBeStatic]
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

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
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
Class `Rule` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static class Rule {

    public static boolean isPrivate(BnfRule node) {
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
Class `ExpressionGeneratorHelper` has only 'static' members, and lacks a 'private' constructor
in `src/org/intellij/grammar/generator/ExpressionGeneratorHelper.java`
#### Snippet
```java
 * @author greg
 */
public class ExpressionGeneratorHelper {

  private static final ConsumeType CONSUME_TYPE_OVERRIDE = ConsumeType.SMART;
```

## RuleId[ruleID=DataFlowIssue]
### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
    return element instanceof BnfReferenceOrToken || element instanceof BnfLiteralExpression ||
           element instanceof BnfParenthesized || element instanceof BnfQuantified ||
           isTrivial(element)
      ;
  }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `src/org/intellij/grammar/actions/FileGeneratorUtil.java`
#### Snippet
```java
      for (VirtualFile file : files) {
        String existingFilePackage = packageIndex.getPackageNameByDirectory(file.getParent());
        if (!hasPackage || existingFilePackage == null || targetPackage.equals(existingFilePackage)) {
          existingFile = file;
          break;
```

### DataFlowIssue
Method invocation `getText` will produce `NullPointerException`
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java
                                   StringBuilder sb) {
    for (PsiElement r : collection) {
      String text = r instanceof PsiNamedElement ? ((PsiNamedElement)r).getName() : r.getText();
      sb.append(" ");
      sb.append(StringUtil.escapeXmlEntities(StringUtil.notNullize(text, "?")));
```

### DataFlowIssue
Method invocation `toString` will produce `NullPointerException`
in `src/org/intellij/jflex/psi/impl/StateRef.java`
#### Snippet
```java
      return e.replace(JFlexPsiElementFactory.createJavaCodeFromText(e.getProject(), text));
    }
    throw new UnsupportedOperationException(e.toString());
  }

```

### DataFlowIssue
Method invocation `getFirstChild` will produce `NullPointerException`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      }
    }
    else if (element.getFirstChild() == element.getLastChild() && element instanceof BnfExpression) {
      child = element.getFirstChild();
    }
```

### DataFlowIssue
Method invocation `getNode` will produce `NullPointerException`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    }
    else {
      return tree.getNode().getElementType();
    }
  }
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
Method invocation `getText` will produce `NullPointerException`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      NodeCall nodeCall = generateNodeCall(rule, firstElement, getNextName(nextName, 0), consumeType);
      for (PsiElement e : childExpressions) {
        String t = e instanceof BnfStringLiteralExpression ? GrammarUtil.unquote(e.getText()) : e.getText();
        if (!mySimpleTokens.containsKey(t) && !mySimpleTokens.containsValue(t)) {
          mySimpleTokens.put(t, null);
```

### DataFlowIssue
Array index is out of bounds
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    BnfRule[] targetRule = {startRule};
    return JBIterable.generate(0, i -> i + 1).take(splitPath.length).map(i -> {
      String pathElement = splitPath[i];
      int indexStart = pathElement.indexOf('[');
      String item = indexStart > -1 ? pathElement.substring(0, indexStart).trim() : pathElement.trim();
```

### DataFlowIssue
Method invocation `getName` may produce `NullPointerException`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      if (error != null) {
        if (intf) { // warn only once
          addWarning(format("%s#%s(\"%s\"): %s", startRule.getName(), methodInfo.name, methodInfo.path, error));
        }
        return;
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

### DataFlowIssue
Argument `rule` might be null
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      }
      out("public " + r + t + " accept(" + shorten(NOTNULL_ANNO) + " " + shortened + r + " visitor) {");
      out(ret + "visitor.visit" + getRulePsiClassName(rule, null) + "(this);");
      out("}");
      newLine();
```

### DataFlowIssue
Method invocation `getParent` will produce `NullPointerException`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      BnfExpression context = nextMap.get(e);
      Cardinality cardinality = REQUIRED;
      for (PsiElement cur = context; !(cur instanceof BnfRule); cur = cur.getParent()) {
        if (PsiTreeUtil.isAncestor(cur, e, true)) break;
        IElementType curType = getEffectiveType(cur);
```

### DataFlowIssue
Condition `tree instanceof BnfReferenceOrToken` is redundant and can be replaced with a null check
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java

    Map<PsiElement, Cardinality> result;
    if (tree instanceof BnfReferenceOrToken) {
      BnfRule targetRule = ((BnfReferenceOrToken)tree).resolveRule();
      if (targetRule != null) {
```

## RuleId[ruleID=CommentedOutCode]
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

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
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

## RuleId[ruleID=PatternVariableCanBeUsed]
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
Variable 'bnfFile' can be replaced with pattern variable
in `src/org/intellij/grammar/actions/BnfGenerateLexerAction.java`
#### Snippet
```java
    Project project = file.getProject();

    BnfFile bnfFile = (BnfFile) file;
    String flexFileName = getFlexFileName(bnfFile);

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
      if (!(method instanceof PsiMethod)) return super.getExceptionList(method);

      PsiMethod psiMethod = (PsiMethod)method;
      PsiClassType[] types = psiMethod.getThrowsList().getReferencedTypes();
      return ContainerUtil.map(types, type -> type.getCanonicalText(false));
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

## RuleId[ruleID=SizeReplaceableByIsEmpty]
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

## RuleId[ruleID=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
      psiElement(BnfExpression.class).withReference(BnfReferenceImpl.class)), new CompletionProvider<>() {
      @Override
      protected void addCompletions(@NotNull CompletionParameters parameters,
                                    @NotNull ProcessingContext context,
                                    @NotNull CompletionResultSet result) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
    extend(CompletionType.BASIC, placePattern, new CompletionProvider<>() {
      @Override
      protected void addCompletions(@NotNull CompletionParameters parameters,
                                    @NotNull ProcessingContext context,
                                    @NotNull CompletionResultSet result) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
    extend(CompletionType.BASIC, placePattern.andNot(psiElement().inside(false, psiElement(BnfAttr.class))), new CompletionProvider<>() {
      @Override
      protected void addCompletions(@NotNull CompletionParameters parameters,
                                    @NotNull ProcessingContext context,
                                    @NotNull CompletionResultSet result) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
      new OccurrencesChooser<BnfExpression[]>(editor) {
        @Override
        protected TextRange getOccurrenceRange(BnfExpression[] occurrence) {
          return new TextRange(occurrence[0].getTextRange().getStartOffset(),
                               occurrence[occurrence.length - 1].getTextRange().getEndOffset());
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/grammar/refactor/BnfIntroduceTokenHandler.java`
#### Snippet
```java
      new OccurrencesChooser<BnfExpression>(editor) {
        @Override
        protected TextRange getOccurrenceRange(BnfExpression occurrence) {
          return occurrence.getTextRange();
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/jflex/editor/JFlexCompletionContributor.java`
#### Snippet
```java
    extend(CompletionType.BASIC, psiElement().inFile(StandardPatterns.instanceOf(JFlexFileImpl.class)), new CompletionProvider<>() {
      @Override
      protected void addCompletions(@NotNull CompletionParameters parameters,
                                    @NotNull ProcessingContext context,
                                    @NotNull CompletionResultSet result) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/grammar/psi/impl/BnfFileImpl.java`
#### Snippet
```java
    return new AtomicClearableLazyValue<>() {
      @Override
      protected @NotNull T compute() {
        return producer.get();
      }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/jflex/psi/impl/StateRef.java`
#### Snippet
```java
      new CommonProcessors.FindFirstProcessor<>() {
        @Override
        protected boolean accept(JFlexStateDefinition o) {
          return Objects.equals(o.getName(), name);
        }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/org/intellij/jflex/psi/impl/JFlexPsiImplUtil.java`
#### Snippet
```java
          new CommonProcessors.FindFirstProcessor<>() {
            @Override
            protected boolean accept(JFlexMacroDefinition o) {
              return Objects.equals(o.getName(), name);
            }
```

## RuleId[ruleID=NonShortCircuitBoolean]
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

## RuleId[ruleID=RedundantEscapeInRegexReplacement]
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

## RuleId[ruleID=AssignmentToForLoopParameter]
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

## RuleId[ruleID=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map' may not contain keys of type 'BnfRule'
in `src/org/intellij/grammar/editor/BnfRecursionLineMarkerProvider.java`
#### Snippet
```java
      RuleGraphHelper helper = RuleGraphHelper.getCached((BnfFile)rule.getContainingFile());
      Map<PsiElement, RuleGraphHelper.Cardinality> map = helper.getFor(rule);
      if (map.containsKey(rule)) {
        result.add(new MyMarkerInfo(rule.getId()));
      }
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'BnfRule'
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
  private void buildOperatorMap(BnfRule rule, BnfRule rootRule, ExpressionInfo expressionInfo) {
    Map<PsiElement, RuleGraphHelper.Cardinality> ruleContent = myRuleGraph.getFor(rule);
    RuleGraphHelper.Cardinality cardinality = ruleContent.get(rootRule);
    BnfRule rootRuleSubst = rootRule;
    if (cardinality == null) {
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'BnfRule'
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java
        .append(getSuperRules(myFile, rootRule).filter(Conditions.notNull()));
      for (BnfRule r : tryOtherRules) {
        cardinality = ruleContent.get(r);
        if (cardinality == null) continue;
        rootRuleSubst = r;
```

### SuspiciousMethodCalls
'List' may not contain objects of type 'PsiElement'
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java
        else if (parent instanceof BnfSequence) {
          List<BnfExpression> children  = ((BnfSequence)parent).getExpressionList();
          int idx = children.indexOf(cur);
          List<BnfExpression> sublist = myBackward? children.subList(0, idx) : children.subList(idx + 1, children.size());
          calcSequenceFirstInner(sublist, curResult, visited);
```

### SuspiciousMethodCalls
'Map\>' may not contain keys of type ''
in `src/org/intellij/grammar/livePreview/LivePreviewParser.java`
#### Snippet
```java
                                                                ExpressionHelper.OperatorType... operatorTypes) {
    return ContainerUtil.mapNotNull(opCalls.keySet(), opCall ->
      ContainerUtil.getFirstItem(ExpressionGeneratorHelper.findOperators(opCalls.get(opCall), operatorTypes)));
  }

```

### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
    }

    for (BnfRule r : rules.filter(o -> !roots.contains(o) && !inSuppressed.contains(o))) {
      String message = null;
      if (ParserGeneratorUtil.Rule.isFake(r)) {
```

### SuspiciousMethodCalls
'Set' may not contain objects of type ''
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
    }

    for (BnfRule r : rules.filter(o -> !roots.contains(o) && !inSuppressed.contains(o))) {
      String message = null;
      if (ParserGeneratorUtil.Rule.isFake(r)) {
```

### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      supers.put(rule, getEffectiveSuperRule(myFile, rule));
    }
    JBTreeTraverser<BnfRule> ordered = new JBTreeTraverser<BnfRule>(key -> JBIterable.of(supers.get(key)))
      .withRoots(sortedPsiRules.values())
      .withTraversal(TreeTraversal.POST_ORDER_DFS)
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'BnfRule'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      }
      for (Map.Entry<BnfRule, BnfRule> e : replacementMap.entrySet()) {
        Cardinality card = copy.remove(e.getKey());
        if (card == null) continue;
        Cardinality cur = copy.get(e.getValue());
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'BnfRule'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        Cardinality card = copy.remove(e.getKey());
        if (card == null) continue;
        Cardinality cur = copy.get(e.getValue());
        copy.put(e.getValue(), cur == null ? card : cur.or(card));
      }
```

### SuspiciousMethodCalls
'Map' may not contain keys of type 'BnfExpression'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      }
      result = joinMaps(rule, tryCollapse, type, list);
      result = type == BnfTypes.BNF_SEQUENCE && visited.contains(RECURSION_MARKER) && result.remove(rule.getExpression()) != null ?
               joinMaps(rule, false, type, Arrays.asList(result, result)) : result;
    }
```

## RuleId[ruleID=BoundedWildcard]
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
Can generalize to `? super String`
in `src/org/intellij/grammar/generator/ExpressionHelper.java`
#### Snippet
```java


  public ExpressionHelper(BnfFile file, RuleGraphHelper ruleGraph, @Nullable Consumer<String> warningConsumer) {
    myFile = file;
    myRuleGraph = ruleGraph;
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
Can generalize to `? extends JavaHelper.TypeParameterInfo`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
  }

  public static String getGenericClauseString(List<JavaHelper.TypeParameterInfo> genericParameters, NameShortener shortener) {
    if (genericParameters.isEmpty()) return "";

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
Can generalize to `? extends Map.Entry`>
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java

  private static void findTheBestReplacement(Map<BnfRule, BnfRule> rulesAndAlts,
                                             List<Map.Entry<BnfRule, Collection<BnfRule>>> supers) {
    BitSet bits = new BitSet(rulesAndAlts.size());
    int minI = -1, minC = -1, minS = -1;
```

## RuleId[ruleID=NullableProblems]
### NullableProblems
Overridden methods are not annotated
in `src/org/intellij/grammar/BnfParserDefinition.java`
#### Snippet
```java

  @Override
  public @NotNull PsiParser createParser(Project project) {
    return new GrammarParser();
  }
```

### NullableProblems
Overridden methods are not annotated
in `src/org/intellij/grammar/BnfParserDefinition.java`
#### Snippet
```java

  @Override
  public @NotNull Lexer createLexer(Project project) {
    return new BnfLexer();
  }
```

### NullableProblems
Overridden methods are not annotated
in `src/org/intellij/grammar/BnfParserDefinition.java`
#### Snippet
```java

  @Override
  public @NotNull PsiFile createFile(@NotNull FileViewProvider fileViewProvider) {
    return new BnfFileImpl(fileViewProvider);
  }
```

### NullableProblems
Overridden method parameters are not annotated
in `src/org/intellij/grammar/BnfParserDefinition.java`
#### Snippet
```java

  @Override
  public @NotNull PsiFile createFile(@NotNull FileViewProvider fileViewProvider) {
    return new BnfFileImpl(fileViewProvider);
  }
```

### NullableProblems
Overridden methods are not annotated
in `src/org/intellij/grammar/BnfParserDefinition.java`
#### Snippet
```java

  @Override
  public @NotNull IFileElementType getFileNodeType() {
    return BNF_FILE_ELEMENT_TYPE;
  }
```

### NullableProblems
Overridden methods are not annotated
in `src/org/intellij/grammar/BnfParserDefinition.java`
#### Snippet
```java

  @Override
  public @NotNull PsiElement createElement(ASTNode astNode) {
    throw new UnsupportedOperationException(astNode.getElementType().toString());
  }
```

## RuleId[ruleID=StringEqualsEmptyString]
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

## RuleId[ruleID=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/org/intellij/grammar/livePreview/LivePreviewHelper.java`
#### Snippet
```java

  /** @noinspection MethodMayBeStatic*/
  public void showFor(@NotNull BnfFile bnfFile) {
    Project project = bnfFile.getProject();
    PsiFile psiFile = parseFile(bnfFile, "");
```

## RuleId[ruleID=NonStrictComparisonCanBeEquality]
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

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'parent instanceof BnfQuantified' covered by subsequent condition 'parent instanceof BnfPredicate'
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return Collections.emptyList();
    PsiElement parent = element.getParent();
    PsiElement target = parent instanceof BnfQuantified || parent instanceof BnfPredicate? parent : element;
    return Collections.singletonList(target.replace(BnfElementFactory.createExpressionFromText(
      project, element.getContainingFile().getText().substring(first.getTextRange().getStartOffset(), last.getTextRange().getEndOffset()))));
```

### ConditionCoveredByFurtherCondition
Condition 'parent instanceof BnfQuantified' covered by subsequent condition 'parent instanceof BnfPredicate'
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
    }
    PsiElement parent = element.getParent();
    return parent instanceof BnfQuantified || parent instanceof BnfPredicate ? parent : element;
  }

```

### ConditionCoveredByFurtherCondition
Condition 'element instanceof BnfReferenceOrToken' covered by subsequent condition 'element instanceof BnfLiteralExpression'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java

  private static boolean isTrivialOrSingular(PsiElement element) {
    return element instanceof BnfReferenceOrToken || element instanceof BnfLiteralExpression ||
           element instanceof BnfParenthesized || element instanceof BnfQuantified ||
           isTrivial(element)
```

### ConditionCoveredByFurtherCondition
Condition 'cur instanceof BnfQuantified' covered by subsequent condition 'cur instanceof BnfParenOptExpression'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java

  private static boolean isOptMany(PsiElement cur) {
    return cur instanceof BnfQuantified || cur instanceof BnfParenOptExpression;
  }

```

### ConditionCoveredByFurtherCondition
Condition 'next instanceof PsiComment' covered by subsequent condition 'next instanceof PsiWhiteSpace'
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
    if (!(parent instanceof BnfRule)) return false;
    for (PsiElement cur = element, next = cur.getNextSibling();
         next == null || next instanceof PsiComment || next instanceof PsiWhiteSpace;
         cur = next, next = cur.getNextSibling()) {
      if (next == null) {
```

### ConditionCoveredByFurtherCondition
Condition 'element instanceof BnfAttrs' covered by subsequent condition 'element instanceof BnfRule'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
    @Override
    protected boolean isSuitable(PsiElement element) {
      return element instanceof BnfAttrs || element instanceof BnfRule;
    }
  }
```

### ConditionCoveredByFurtherCondition
Condition 'element instanceof BnfRule' covered by subsequent condition 'element instanceof BnfAttr'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
    public @NotNull Collection<StructureViewTreeElement> getChildrenBase() {
      PsiElement element = getElement();
      if (element instanceof BnfRule
          || element instanceof BnfAttr) {
        return Collections.emptyList();
```

### ConditionCoveredByFurtherCondition
Condition 'e instanceof PsiWhiteSpace' covered by subsequent condition 'e instanceof PsiComment'
in `src/org/intellij/grammar/inspection/BnfInspectionSuppressor.java`
#### Snippet
```java
      JBIterable.generate(root, PsiTreeUtil::prevLeaf).skip(1);
    JBIterable<PsiComment> comments = leaves
      .takeWhile(e -> e instanceof PsiWhiteSpace || e instanceof PsiComment ||
                      e instanceof BnfSequence && e.getTextLength() == 0)
      .filter(PsiComment.class);
```

### ConditionCoveredByFurtherCondition
Condition 'parent instanceof BnfAttrPattern' covered by subsequent condition 'parent instanceof BnfAttr'
in `src/org/intellij/grammar/editor/BnfAnnotator.java`
#### Snippet
```java
    }
    else if (psiElement instanceof BnfStringLiteralExpression) {
      if (parent instanceof BnfAttrPattern || parent instanceof BnfAttr || parent instanceof BnfListEntry) {
        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
          .range(psiElement)
```

### ConditionCoveredByFurtherCondition
Condition 'parent instanceof BnfAttr' covered by subsequent condition 'parent instanceof BnfListEntry'
in `src/org/intellij/grammar/editor/BnfAnnotator.java`
#### Snippet
```java
    }
    else if (psiElement instanceof BnfStringLiteralExpression) {
      if (parent instanceof BnfAttrPattern || parent instanceof BnfAttr || parent instanceof BnfListEntry) {
        annotationHolder.newSilentAnnotation(HighlightSeverity.INFORMATION)
          .range(psiElement)
```

### ConditionCoveredByFurtherCondition
Condition 'parent instanceof BnfAttr' covered by subsequent condition 'parent instanceof BnfListEntry'
in `src/org/intellij/grammar/editor/BnfAnnotator.java`
#### Snippet
```java
          .create();
      }
      if (parent instanceof BnfAttr || parent instanceof BnfListEntry) {
        String attrName = Objects.requireNonNull(PsiTreeUtil.getParentOfType(psiElement, BnfAttr.class)).getName();
        KnownAttribute<?> attribute = KnownAttribute.getCompatibleAttribute(attrName);
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof BnfLiteralExpression' covered by subsequent condition 'child instanceof BnfReferenceOrToken'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      child = element.getFirstChild();
    }
    return child instanceof BnfExpression && !(child instanceof BnfLiteralExpression || child instanceof BnfReferenceOrToken) ?
        (BnfExpression) child : null;
  }
```

### ConditionCoveredByFurtherCondition
Condition 'tree instanceof BnfReferenceOrToken' covered by subsequent condition 'tree instanceof BnfLiteralExpression'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    Map<String, BnfExpression> result = new TreeMap<>();
    for (PsiElement tree : accessors) {
      if (!(tree instanceof BnfReferenceOrToken || tree instanceof BnfLiteralExpression)) continue;
      result.put(tree.getText(), (BnfExpression)tree);
    }
```

### ConditionCoveredByFurtherCondition
Condition 'o instanceof BnfReferenceOrToken' covered by subsequent condition 'o instanceof BnfStringLiteralExpression'
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java

  private static @Nullable BnfRule resolveRule(@Nullable PsiElement o) {
    if (!(o instanceof BnfReferenceOrToken ||
          o instanceof BnfStringLiteralExpression)) return null;
    PsiReference reference = ContainerUtil.findInstance(o.getReferences(), BnfReferenceImpl.class);
```

### ConditionCoveredByFurtherCondition
Condition 'e1 instanceof BnfReferenceOrToken \&\& e2 instanceof BnfReferenceOrToken' covered by subsequent condition 'e1 instanceof BnfLiteralExpression \&\& e2 instanceof BnfLiteralExpression'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    @Override
    public boolean equals(PsiElement e1, PsiElement e2) {
      if (e1 instanceof BnfReferenceOrToken && e2 instanceof BnfReferenceOrToken ||
          e1 instanceof BnfLiteralExpression && e2 instanceof BnfLiteralExpression) {
        return e1.getText().equals(e2.getText());
```

### ConditionCoveredByFurtherCondition
Condition 'e instanceof BnfReferenceOrToken' covered by subsequent condition 'e instanceof BnfLiteralExpression'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    @Override
    public int hashCode(PsiElement e) {
      if (e instanceof BnfReferenceOrToken || e instanceof BnfLiteralExpression) {
        return e.getText().hashCode();
      }
```

### ConditionCoveredByFurtherCondition
Condition 'o instanceof BnfPredicate' covered by subsequent condition 'o instanceof BnfExternalExpression'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
  private void buildRulesGraph() {
    SyntaxTraverser<PsiElement> s = SyntaxTraverser.psiTraverser()
      .expand(o -> !(o instanceof BnfPredicate || o instanceof BnfExternalExpression));
    for (BnfRule rule : myFile.getRules()) {
      for (PsiElement e : s.withRoot(rule.getExpression()).filter(BnfExpression.class)) {
```

### ConditionCoveredByFurtherCondition
Condition 'e instanceof BnfReferenceOrToken' covered by subsequent condition 'e instanceof BnfStringLiteralExpression'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
          myRulesGraph.putValue(rule, r);
        }
        else if (e instanceof BnfReferenceOrToken || e instanceof BnfStringLiteralExpression) {
          myRulesWithTokens.add(rule);
        }
```

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
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
      String unquoted = GrammarUtil.unquote(text);
      // in double-quoted strings: un-escape quotes only leaving the rest \ manageable
      String result = text.charAt(0) == '"' ? unquoted.replaceAll("\\\\([\"'])", "$1") : unquoted;
      return (T) result;
    }
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

## RuleId[ruleID=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;
```

### UNUSED_IMPORT
Unused import `import java.util.HashSet;`
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

```

### UNUSED_IMPORT
Unused import `import com.intellij.util.*;`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.*;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.containers.FactoryMap;
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.org.objectweb.asm.*;`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.org.objectweb.asm.*;
import org.jetbrains.org.objectweb.asm.signature.SignatureReader;
import org.jetbrains.org.objectweb.asm.signature.SignatureVisitor;
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Type;`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.*;
import java.util.*;
```

## RuleId[ruleID=ThrowablePrintStackTrace]
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

## RuleId[ruleID=NestedAssignment]
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
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
        String argNextName;
        int metaIdx;
        if (argument.startsWith("<<") && (metaIdx = metaParameterNames.indexOf(argument)) > -1) {
          nested = expressions.get(metaIdx + 1);
          argument = nested.getText();
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

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
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

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=Java8MapApi]
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

## RuleId[ruleID=EmptyMethod]
### EmptyMethod
The method is empty
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
  }

  public static void init() {
  }

```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java

    @Override
    public void dispose() {
    }
  }
```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java

    @Override
    public void dispose() {
    }

```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java

      @Override
      public void visitEnd() {
      }

```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java

      @Override
      public void visitInnerClassType(String s) {
      }

```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/livePreview/LivePreviewHelper.java`
#### Snippet
```java

  @Override
  public void dispose() {
  }

```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/psi/impl/BnfStringImpl.java`
#### Snippet
```java

    @Override
    public void accept(@NotNull PsiElementVisitor visitor) {
    }

```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java

  @Override
  public void invoke(@NotNull Project project, PsiElement @NotNull [] elements, DataContext dataContext) {
    // do not support this case
  }
```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/refactor/BnfIntroduceTokenHandler.java`
#### Snippet
```java

  @Override
  public void invoke(@NotNull Project project, PsiElement @NotNull [] elements, DataContext dataContext) {
    // do not support this case
  }
```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java

  @Override
  public void collectElementsToIgnore(@NotNull PsiElement element, @NotNull Set<PsiElement> result) {
  }

```

### EmptyMethod
The method is empty
in `src/org/intellij/grammar/refactor/InlineRuleDialog.java`
#### Snippet
```java

  @Override
  protected void doHelpAction() {
  }
}
```

### EmptyMethod
The method is empty
in `src/org/intellij/jflex/psi/impl/StateRef.java`
#### Snippet
```java

    @Override
    public void navigate(boolean requestFocus) {
    }

```

## RuleId[ruleID=RedundantFieldInitialization]
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

## RuleId[ruleID=CaughtExceptionImmediatelyRethrown]
### CaughtExceptionImmediatelyRethrown
Caught exception `ex` is immediately rethrown
in `src/org/intellij/grammar/actions/FileGeneratorUtil.java`
#### Snippet
```java
      }
    }
    catch (ProcessCanceledException ex) {
      throw ex;
    }
```

## RuleId[ruleID=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
  }

  public static class MockLanguageFileType extends LanguageFileType {

    private final String myExtension;
```

## RuleId[ruleID=AssignmentToMethodParameter]
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

## RuleId[ruleID=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-01-10-20-28-59.440.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
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
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
    public Icon getIcon(boolean open) {
      PsiElement element = getElement();
      if (element == null) return null;
      return element instanceof BnfAttrs ? PlatformIcons.PACKAGE_ICON : element.getIcon(0);
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
    public String getQualifiedName(BnfRule element) {
      if (element == null) return null;
      PsiFile psiFile = element.getContainingFile();
      VirtualFile virtualFile = psiFile == null ? null : psiFile.getVirtualFile();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
      PsiFile psiFile = element.getContainingFile();
      VirtualFile virtualFile = psiFile == null ? null : psiFile.getVirtualFile();
      if (virtualFile == null) return null;
      return String.format("%s?rule=%s", virtualFile.getUrl(), element.getName());
    }
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
in `src/org/intellij/grammar/BnfDescriptionProvider.java`
#### Snippet
```java
      if (location == UsageViewTypeLocation.INSTANCE) {
        IElementType elementType = PsiUtilCore.getElementType(psiElement);
        return elementType == null ? null : StringUtil.join(NameUtil.splitWords(elementType.toString(), false), " ");
      }
      return psiElement instanceof PsiNamedElement? ((PsiNamedElement) psiElement).getName() : psiElement.getClass().getSimpleName();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfDescriptionProvider.java`
#### Snippet
```java
      return psiElement instanceof PsiNamedElement? ((PsiNamedElement) psiElement).getName() : psiElement.getClass().getSimpleName();
    }
    return null;
  }
}
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
in `src/org/intellij/grammar/editor/BnfRecursionLineMarkerProvider.java`
#### Snippet
```java
        @Override
        public AnAction getClickAction() {
          return null;
        }
      };
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java
  @Override
  public TextEditorHighlightingPass createHighlightingPass(@NotNull PsiFile file, @NotNull Editor editor) {
    if (ApplicationManager.getApplication().isHeadlessEnvironment()) return null;

    if (editor.isOneLineMode()) return null;
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java
    if (ApplicationManager.getApplication().isHeadlessEnvironment()) return null;

    if (editor.isOneLineMode()) return null;
    if (!(file instanceof BnfFile)) return null;

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java

    if (editor.isOneLineMode()) return null;
    if (!(file instanceof BnfFile)) return null;

    VirtualFile virtualFile = file.getVirtualFile();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java

    VirtualFile virtualFile = file.getVirtualFile();
    if (virtualFile == null || !FileEditorManager.getInstance(file.getProject()).isFileOpen(virtualFile)) return null;

    return new TextEditorHighlightingPass(file.getProject(), editor.getDocument(), false) {
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
in `src/org/intellij/jflex/editor/JFlexStructureViewFactory.java`
#### Snippet
```java
    public Icon getIcon(boolean open) {
      PsiElement o = getElement();
      if (o == null) return null;
      return o.getIcon(0);
    }
```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexStructureViewFactory.java`
#### Snippet
```java
    public String getPresentableText() {
      PsiElement o = getElement();
      if (o == null) return null;
      if (o instanceof JFlexFile) {
        return ((JFlexFile)o).getName();
```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/editor/BnfWordSelectioner.java`
#### Snippet
```java
  public List<TextRange> select(@NotNull PsiElement e, @NotNull CharSequence editorText, int cursorOffset, @NotNull Editor editor) {
    List<TextRange> list = super.select(e, editorText, cursorOffset, editor);
    if (list == null) return null;
    if (e instanceof LeafPsiElement && ((LeafPsiElement)e).getElementType() == BnfTypes.BNF_STRING) {
      TextRange range = e.getTextRange();
```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexFindUsagesProvider.java`
#### Snippet
```java
  @Override
  public WordsScanner getWordsScanner() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexFindUsagesProvider.java`
#### Snippet
```java
  @Override
  public String getHelpId(@NotNull PsiElement psiElement) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexCommenter.java`
#### Snippet
```java
  @Override
  public String getDocumentationCommentLinePrefix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexCommenter.java`
#### Snippet
```java
  @Override
  public IElementType getDocumentationCommentTokenType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexCommenter.java`
#### Snippet
```java
  @Override
  public String getDocumentationCommentSuffix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexCommenter.java`
#### Snippet
```java
  @Override
  public String getCommentedBlockCommentPrefix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexCommenter.java`
#### Snippet
```java
  @Override
  public String getDocumentationCommentPrefix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/jflex/editor/JFlexCommenter.java`
#### Snippet
```java
  @Override
  public String getCommentedBlockCommentSuffix() {
    return null;
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
in `src/org/intellij/grammar/BnfCommenter.java`
#### Snippet
```java
  @Override
  public IElementType getDocumentationCommentTokenType() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfCommenter.java`
#### Snippet
```java
  @Override
  public String getCommentedBlockCommentPrefix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfCommenter.java`
#### Snippet
```java
  @Override
  public String getCommentedBlockCommentSuffix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfCommenter.java`
#### Snippet
```java
  @Override
  public String getDocumentationCommentPrefix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfCommenter.java`
#### Snippet
```java
  @Override
  public String getDocumentationCommentSuffix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfCommenter.java`
#### Snippet
```java
  @Override
  public String getDocumentationCommentLinePrefix() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfFindUsagesProvider.java`
#### Snippet
```java
  @Override
  public WordsScanner getWordsScanner() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/org/intellij/grammar/BnfFindUsagesProvider.java`
#### Snippet
```java
  @Override
  public String getHelpId(@NotNull PsiElement psiElement) {
    return null;
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

    private static String fixClassName(String s) {
      return s == null ? null : s.replace('/', '.').replace('$', '.');
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

## RuleId[ruleID=ZeroLengthArrayInitialization]
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

## RuleId[ruleID=ClassCanBeRecord]
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

  static class ConsumeTokensCall implements NodeCall {

    final String methodName;
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

  static class MetaMethodCallArgument implements NodeArgument {

    final MetaMethodCall call;
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

### ClassCanBeRecord
Class can be a record
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
  }

  private static class MyElement<T> extends FakePsiElement implements NavigatablePsiElement {

    final T delegate;
```

## RuleId[ruleID=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'PsiNamedElement' type conflicts with preceding 'instanceof BnfRule' check
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
      PsiElement element = getElement();
      if (element instanceof BnfRule) {
        return StringUtil.notNullize(((PsiNamedElement)element).getName());
      }
      else if (element instanceof BnfAttr) {
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `first == null || last == null || first == last && last instanceof PsiWhiteSpace` is always `true`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return Collections.emptyList();
    PsiElement parent = element.getParent();
    PsiElement target = parent instanceof BnfQuantified || parent instanceof BnfPredicate? parent : element;
```

### ConstantValue
Condition `last == null` is always `false`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return Collections.emptyList();
    PsiElement parent = element.getParent();
    PsiElement target = parent instanceof BnfQuantified || parent instanceof BnfPredicate? parent : element;
```

### ConstantValue
Condition `first == last` is always `true`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return Collections.emptyList();
    PsiElement parent = element.getParent();
    PsiElement target = parent instanceof BnfQuantified || parent instanceof BnfPredicate? parent : element;
```

### ConstantValue
Condition `first == last && last instanceof PsiWhiteSpace` is always `true`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return Collections.emptyList();
    PsiElement parent = element.getParent();
    PsiElement target = parent instanceof BnfQuantified || parent instanceof BnfPredicate? parent : element;
```

### ConstantValue
Condition `first == null || last == null || first == last && last instanceof PsiWhiteSpace` is always `true`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;
    for (PsiElement c = first; c != last && c != null; c = c.getNextSibling()) {
      toExtract.add(c);
```

### ConstantValue
Condition `last == null` is always `false`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;
    for (PsiElement c = first; c != last && c != null; c = c.getNextSibling()) {
      toExtract.add(c);
```

### ConstantValue
Condition `first == last` is always `true`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;
    for (PsiElement c = first; c != last && c != null; c = c.getNextSibling()) {
      toExtract.add(c);
```

### ConstantValue
Condition `first == last && last instanceof PsiWhiteSpace` is always `true`
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;
    for (PsiElement c = first; c != last && c != null; c = c.getNextSibling()) {
      toExtract.add(c);
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java

  private static boolean isTrivialOrSingular(PsiElement element) {
    return element instanceof BnfReferenceOrToken || element instanceof BnfLiteralExpression ||
           element instanceof BnfParenthesized || element instanceof BnfQuantified ||
           isTrivial(element)
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
  private static boolean isTrivialOrSingular(PsiElement element) {
    return element instanceof BnfReferenceOrToken || element instanceof BnfLiteralExpression ||
           element instanceof BnfParenthesized || element instanceof BnfQuantified ||
           isTrivial(element)
      ;
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
  private static boolean isTrivialOrSingular(PsiElement element) {
    return element instanceof BnfReferenceOrToken || element instanceof BnfLiteralExpression ||
           element instanceof BnfParenthesized || element instanceof BnfQuantified ||
           isTrivial(element)
      ;
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
    return element instanceof BnfReferenceOrToken || element instanceof BnfLiteralExpression ||
           element instanceof BnfParenthesized || element instanceof BnfQuantified ||
           isTrivial(element)
      ;
  }
```

### ConstantValue
Value `cur` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java

  private static boolean isOptMany(PsiElement cur) {
    return cur instanceof BnfQuantified || cur instanceof BnfParenOptExpression;
  }

```

### ConstantValue
Condition `cur instanceof BnfChoice && !(parent instanceof BnfParenthesized) && (...` is always `false`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
        }
      }
      else if (cur instanceof BnfChoice &&
               !(parent instanceof BnfParenthesized) &&
               (parent instanceof BnfSequence || parent instanceof BnfQuantified)) {
        String replacement = "(" + cur.getText() + ")";
        cur.replace(BnfElementFactory.createExpressionFromText(project, replacement));
```

### ConstantValue
Condition `parent instanceof BnfSequence || parent instanceof BnfQuantified` is always `false`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      else if (cur instanceof BnfChoice &&
               !(parent instanceof BnfParenthesized) &&
               (parent instanceof BnfSequence || parent instanceof BnfQuantified)) {
        String replacement = "(" + cur.getText() + ")";
        cur.replace(BnfElementFactory.createExpressionFromText(project, replacement));
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      else if (cur instanceof BnfChoice &&
               !(parent instanceof BnfParenthesized) &&
               (parent instanceof BnfSequence || parent instanceof BnfQuantified)) {
        String replacement = "(" + cur.getText() + ")";
        cur.replace(BnfElementFactory.createExpressionFromText(project, replacement));
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      else if (cur instanceof BnfChoice &&
               !(parent instanceof BnfParenthesized) &&
               (parent instanceof BnfSequence || parent instanceof BnfQuantified)) {
        String replacement = "(" + cur.getText() + ")";
        cur.replace(BnfElementFactory.createExpressionFromText(project, replacement));
```

### ConstantValue
Condition `first == null || last == null || first == last && last instanceof PsiWhiteSpace` is always `true`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;

    PsiElement result = parent.addRangeBefore(first, last, from);
```

### ConstantValue
Condition `last == null` is always `false`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;

    PsiElement result = parent.addRangeBefore(first, last, from);
```

### ConstantValue
Condition `first == last` is always `true`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;

    PsiElement result = parent.addRangeBefore(first, last, from);
```

### ConstantValue
Condition `first == last && last instanceof PsiWhiteSpace` is always `true`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;

    PsiElement result = parent.addRangeBefore(first, last, from);
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
    if (cur instanceof BnfSequence) {
      if (parent instanceof BnfChoice) return true;
      if (parent instanceof BnfSequence) {
        List<BnfExpression> list = ((BnfSequence)parent).getExpressionList();
        return list.isEmpty() || !GrammarUtil.isExternalReference(list.get(0));
```

### ConstantValue
Condition `cur instanceof BnfChoice && parent instanceof BnfChoice` is always `false`
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      }
    }
    return cur instanceof BnfChoice && parent instanceof BnfChoice;
  }

```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      }
    }
    return cur instanceof BnfChoice && parent instanceof BnfChoice;
  }

```

### ConstantValue
Condition `!(parent instanceof BnfRule)` is always `true`
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
    PsiElement parent = PsiTreeUtil.getParentOfType(element, BnfRule.class, GeneratedParserUtilBase.DummyBlock.class);
    if (parent instanceof GeneratedParserUtilBase.DummyBlock) return true;
    if (!(parent instanceof BnfRule)) return false;
    for (PsiElement cur = element, next = cur.getNextSibling();
         next == null || next instanceof PsiComment || next instanceof PsiWhiteSpace;
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/BnfCompletionContributor.java`
#### Snippet
```java
    PsiElement parent = PsiTreeUtil.getParentOfType(element, BnfRule.class, GeneratedParserUtilBase.DummyBlock.class);
    if (parent instanceof GeneratedParserUtilBase.DummyBlock) return true;
    if (!(parent instanceof BnfRule)) return false;
    for (PsiElement cur = element, next = cur.getNextSibling();
         next == null || next instanceof PsiComment || next instanceof PsiWhiteSpace;
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
      expressionList = ((BnfExternalExpression)parent).getExpressionList();
    }
    else if (parent instanceof BnfSequence) {
      expressionList = ((BnfSequence)parent).getExpressionList();
    }
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
      expressionList = ((BnfSequence)parent).getExpressionList();
    }
    else if (parent instanceof BnfRule) {
      expressionList = Collections.emptyList();
    }
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
    }
    else {
      LOG.error(parent);
      return;
    }
```

### ConstantValue
Condition `!(parent instanceof BnfExternalExpression)` is always `false`
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
    }
    inlineExpressionUsage(project, (BnfExpression)parent, expression);
    if (!(parent instanceof BnfExternalExpression)) {
      for (BnfModifier modifier : rule.getModifierList()) {
        if (modifier.getText().equals("external")) {
```

### ConstantValue
Condition `!(tree instanceof BnfRule)` is always `false`
in `src/org/intellij/grammar/generator/RuleMethodsHelper.java`
#### Snippet
```java
    String result;

    if (!(tree instanceof BnfRule)) {
      if (type.many()) return null; // do not generate token lists

```

### ConstantValue
Condition `psi instanceof BnfAttrs && !(psi.getParent() instanceof BnfRule)` is always `false` when reached
in `src/org/intellij/grammar/BnfFoldingBuilder.java`
#### Snippet
```java
    PsiElement psi = node.getPsi();
    return psi instanceof BnfValueList ||
           psi instanceof BnfAttrs && !(psi.getParent() instanceof BnfRule);
  }
}
```

### ConstantValue
Value `psi` is always 'null'
in `src/org/intellij/grammar/BnfFoldingBuilder.java`
#### Snippet
```java
    PsiElement psi = node.getPsi();
    return psi instanceof BnfValueList ||
           psi instanceof BnfAttrs && !(psi.getParent() instanceof BnfRule);
  }
}
```

### ConstantValue
Value `psi` is always 'null'
in `src/org/intellij/grammar/BnfFoldingBuilder.java`
#### Snippet
```java
    PsiElement psi = node.getPsi();
    if (psi instanceof BnfAttrs) return "{..}";
    if (psi instanceof BnfRule) return ((BnfRule)psi).getName() + " ::= ...";
    if (psi instanceof BnfValueList) return "[..]";
    if (node.getElementType() == BnfParserDefinition.BNF_BLOCK_COMMENT) return "/*..*/";
```

### ConstantValue
Value `psi` is always 'null'
in `src/org/intellij/grammar/BnfFoldingBuilder.java`
#### Snippet
```java
    if (psi instanceof BnfAttrs) return "{..}";
    if (psi instanceof BnfRule) return ((BnfRule)psi).getName() + " ::= ...";
    if (psi instanceof BnfValueList) return "[..]";
    if (node.getElementType() == BnfParserDefinition.BNF_BLOCK_COMMENT) return "/*..*/";
    return null;
```

### ConstantValue
Condition `!(root instanceof BnfFile)` is always `false`
in `src/org/intellij/grammar/BnfFoldingBuilder.java`
#### Snippet
```java
                                          @NotNull Document document,
                                          boolean quick) {
    if (!(root instanceof BnfFile)) return;
    BnfFile file = (BnfFile)root;

```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
        return StringUtil.notNullize(((PsiNamedElement)element).getName());
      }
      else if (element instanceof BnfAttr) {
        return getAttrDisplayName((BnfAttr)element);
      }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
        return getAttrDisplayName((BnfAttr)element);
      }
      else if (element instanceof BnfAttrs) {
        List<BnfAttr> attrList = ((BnfAttrs)element).getAttrList();
        BnfAttr firstAttr = ContainerUtil.getFirstItem(attrList);
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
        return "Attributes { " + getAttrDisplayName(firstAttr) + suffix+ "}";
      }
      else if (element instanceof BnfFileImpl) {
        return ((BnfFileImpl)element).getName();
      }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
        return ((BnfFileImpl)element).getName();
      }
      return String.valueOf(element);
    }

```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
    @Override
    protected boolean isSuitable(PsiElement element) {
      return element instanceof BnfAttrs || element instanceof BnfRule;
    }
  }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
      PsiElement element = getElement();
      if (element instanceof BnfRule
          || element instanceof BnfAttr) {
        return Collections.emptyList();
      }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
      }
      List<StructureViewTreeElement> result = new ArrayList<>();
      if (element instanceof BnfFile) {
        for (BnfAttrs o : ((BnfFile)element).getAttributes()) {
          result.add(new MyElement(o));
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java
        }
      }
      else if (element instanceof BnfAttrs) {
        for (BnfAttr o : ((BnfAttrs)element).getAttrList()) {
          result.add(new MyElement(o));
```

### ConstantValue
Condition `!(c instanceof BnfExpression)` is always `false`
in `src/org/intellij/grammar/refactor/BnfIntroduceRuleHandler.java`
#### Snippet
```java
      BnfExpression[] result = new BnfExpression[selectedExpressions.size()];
      for (PsiElement c = expression.getFirstChild(), s = null; c != null; c = c.getNextSibling()) {
        if (!(c instanceof BnfExpression)) continue;
        if (GrammarUtil.equalsElement((BnfExpression)c, selectedExpressions.get(pos))) {
          if (pos == 0) s = c;
```

### ConstantValue
Condition `!(host instanceof BnfStringImpl)` is always `false`
in `src/org/intellij/grammar/psi/impl/BnfStringRegexpInjector.java`
#### Snippet
```java
  @Override
  public void getLanguagesToInject(@NotNull PsiLanguageInjectionHost host, @NotNull InjectedLanguagePlaces places) {
    if (!(host instanceof BnfStringImpl)) return;
    if (!Options.BNF_INJECT_REGEXP_IN_BNF.get()) return;

```

### ConstantValue
Condition `item instanceof PsiNamedElement` is always `false`
in `src/org/intellij/grammar/diagram/BnfDiagramProvider.java`
#### Snippet
```java
    public @Nullable SimpleColoredText getItemName(@Nullable BnfRule element, @Nullable Object item, @NotNull DiagramBuilder builder) {
      if (item instanceof Item o) item = o.rule;
      if (item instanceof PsiNamedElement) {
        return new SimpleColoredText(StringUtil.notNullize(((PsiNamedElement)item).getName()), DEFAULT_TITLE_ATTR);
      }
```

### ConstantValue
Condition `count == 0` is always `true`
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
          }
        }
        if (count == 0) {
          System.out.println("No grammars matching '"+wildCard+"' found in: "+ grammarDir);
        }
```

### ConstantValue
Condition `!(cur instanceof BnfExpression)` is always `false`
in `src/org/intellij/grammar/intention/BnfFlipChoiceIntention.java`
#### Snippet
```java
    if (choice == null) return null;
    for (PsiElement cur = choice.getFirstChild(), prev = null; cur != null; cur = cur.getNextSibling()) {
      if (!(cur instanceof BnfExpression) ) continue;
      int start = prev == null? choice.getTextRange().getStartOffset() : prev.getTextRange().getEndOffset();
      int end = cur.getTextRange().getStartOffset();
```

### ConstantValue
Condition `!(context instanceof JFlexJavaCodeInjectionHostImpl)` is always `false`
in `src/org/intellij/jflex/psi/impl/JFlexJavaCodeInjector.java`
#### Snippet
```java
  @Override
  public void getLanguagesToInject(@NotNull MultiHostRegistrar registrar, @NotNull PsiElement context) {
    if (!(context instanceof JFlexJavaCodeInjectionHostImpl)) return;
    if (!Options.INJECT_JAVA_IN_JFLEX.get()) return;

```

### ConstantValue
Value `hostParent` is always 'null'
in `src/org/intellij/jflex/psi/impl/JFlexJavaCodeInjector.java`
#### Snippet
```java
        registrar.addPlace(null, sb.toString(), host, new TextRange(0, host.getTextLength()));
      }
      else if (hostParent instanceof JFlexOption) {
        IElementType optionType = PsiUtilCore.getElementType(hostParent.getFirstChild());
        if (optionType == JFlexTypes.FLEX_OPT_CODE1) {
```

### ConstantValue
Value `hostParent` is always 'null'
in `src/org/intellij/jflex/psi/impl/JFlexJavaCodeInjector.java`
#### Snippet
```java
        }
      }
      else if (hostParent instanceof JFlexRule) {
        String prefix = ruleCount == 0 ?
                        "\n" +
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java
      return docBuilder.toString();
    }
    else if (element instanceof BnfAttr) {
      KnownAttribute<?> attribute = KnownAttribute.getAttribute(((BnfAttr)element).getName());
      if (attribute != null) return attribute.getDescription();
```

### ConstantValue
Condition `!(psiElement instanceof BnfRule)` is always `false`
in `src/org/intellij/grammar/editor/BnfPinMarkerAnnotator.java`
#### Snippet
```java
  @Override
  public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
    if (!(psiElement instanceof BnfRule)) return;
    BnfRule rule = (BnfRule)psiElement;
    BnfFile bnfFile = (BnfFile)rule.getContainingFile();
```

### ConstantValue
Condition `!(file instanceof BnfFile)` is always `false`
in `src/org/intellij/grammar/livePreview/GrammarAtCaretPassFactory.java`
#### Snippet
```java

    if (editor.isOneLineMode()) return null;
    if (!(file instanceof BnfFile)) return null;

    VirtualFile virtualFile = file.getVirtualFile();
```

### ConstantValue
Condition `prevSibling != null` is always `false`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
      prevSibling = prevSibling.getLastChild();
    }
    if (prevSibling != null) return prevSibling;
    PsiElement parent = child.getParent();
    while (parent instanceof GeneratedParserUtilBase.DummyBlock && parent.getPrevSibling() == null) {
```

### ConstantValue
Condition `c1 == null || c1 instanceof BnfExpression` is always `true`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
    else {
      for (PsiElement c1 = e1.getFirstChild(), c2 = e2.getFirstChild(); ;) {
        boolean f1 = c1 == null || c1 instanceof BnfExpression;
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
```

### ConstantValue
Condition `c2 == null || c2 instanceof BnfExpression` is always `true`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
      for (PsiElement c1 = e1.getFirstChild(), c2 = e2.getFirstChild(); ;) {
        boolean f1 = c1 == null || c1 instanceof BnfExpression;
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
```

### ConstantValue
Condition `f1` is always `true`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        boolean f1 = c1 == null || c1 instanceof BnfExpression;
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
```

### ConstantValue
Condition `f2` is always `true`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        boolean f1 = c1 == null || c1 instanceof BnfExpression;
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
```

### ConstantValue
Condition `!f1` is always `false`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
        if (c1 == null && c2 == null) return true;
```

### ConstantValue
Condition `!f1 || f2` is always `true`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
        if (c1 == null && c2 == null) return true;
```

### ConstantValue
Value `f1` is always 'true'
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
        if (c1 == null && c2 == null) return true;
```

### ConstantValue
Condition `f2` is always `true` when reached
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        boolean f2 = c2 == null || c2 instanceof BnfExpression;
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
        if (c1 == null && c2 == null) return true;
```

### ConstantValue
Condition `f1` is always `true`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
        if (c1 == null && c2 == null) return true;
      }
```

### ConstantValue
Condition `f1 || !f2` is always `true`
in `src/org/intellij/grammar/psi/impl/GrammarUtil.java`
#### Snippet
```java
        if (f1 && f2 && !equalsElement((BnfExpression)c1, (BnfExpression)c2)) return false;
        if (!f1 || f2) c1 = c1 == null ? null : c1.getNextSibling();
        if (f1 || !f2) c2 = c2 == null ? null : c2.getNextSibling();
        if (c1 == null && c2 == null) return true;
      }
```

### ConstantValue
Value `tokenType` is always 'null'
in `src/org/intellij/grammar/livePreview/LivePreviewSyntaxHighlighterFactory.java`
#### Snippet
```java
            IElementType tokenType = super.getTokenType();
            return tokenType instanceof LivePreviewElementType.TokenType
                   ? ((LivePreviewElementType.TokenType)tokenType).delegate : tokenType;
          }
        };
```

### ConstantValue
Condition `element == null || element instanceof LeafPsiElement` is always `true`
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
    public @NotNull Collection<StructureViewTreeElement> getChildrenBase() {
      PsiElement element = getElement();
      if (element == null || element instanceof LeafPsiElement) return Collections.emptyList();
      ArrayList<StructureViewTreeElement> result = new ArrayList<>();
      for (PsiElement e = element.getFirstChild(); e != null; e = e.getNextSibling()) {
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
        return null; //AllIcons.General.Error;
      }
      else if (element instanceof LeafPsiElement) {
        return null;
      }
```

### ConstantValue
Condition `element != null` is always `false`
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
        return null;
      }
      ASTNode node = element != null ? element.getNode() : null;
      IElementType elementType = node != null ? node.getElementType() : null;
      if (elementType instanceof LivePreviewElementType.RuleType) {
```

### ConstantValue
Condition `node != null` is always `false`
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
      }
      ASTNode node = element != null ? element.getNode() : null;
      IElementType elementType = node != null ? node.getElementType() : null;
      if (elementType instanceof LivePreviewElementType.RuleType) {
        return BnfIcons.RULE;
```

### ConstantValue
Value `elementType` is always 'null'
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
      ASTNode node = element != null ? element.getNode() : null;
      IElementType elementType = node != null ? node.getElementType() : null;
      if (elementType instanceof LivePreviewElementType.RuleType) {
        return BnfIcons.RULE;
      }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
        return elementType + ": '" + element.getText() + "'";
      }
      else if (element instanceof PsiErrorElement) {
        return "PsiErrorElement: '" + ((PsiErrorElement)element).getErrorDescription() + "'";
      }
```

### ConstantValue
Value `elementType` is always 'null'
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
        return "PsiErrorElement: '" + ((PsiErrorElement)element).getErrorDescription() + "'";
      }
      else if (elementType instanceof LivePreviewElementType.RuleType) {
        BnfRule rule = ((LivePreviewElementType.RuleType)elementType).getRule(element.getProject());
        if (rule != null) {
```

### ConstantValue
Value `elementType` is always 'null'
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
        }
      }
      return String.valueOf(elementType);
    }

```

### ConstantValue
Condition `e instanceof BnfComposite || e instanceof LeafPsiElement && ((LeafPsiElement)e).getElemen...` is always `true`
in `src/org/intellij/grammar/editor/BnfWordSelectioner.java`
#### Snippet
```java
  @Override
  public boolean canSelect(@NotNull PsiElement e) {
    return e instanceof BnfComposite ||
           e instanceof LeafPsiElement && ((LeafPsiElement)e).getElementType() == BnfTypes.BNF_STRING;
  }

```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/editor/BnfMoveLeftRightHandler.java`
#### Snippet
```java
      return ((BnfChoice)element).getExpressionList();
    }
    else if (element instanceof BnfSequence) {
      return ((BnfSequence)element).getExpressionList();
    }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/editor/BnfMoveLeftRightHandler.java`
#### Snippet
```java
      return ((BnfSequence)element).getExpressionList();
    }
    else if (element instanceof BnfAttrs) {
      return ((BnfAttrs)element).getAttrList();
    }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/editor/BnfMoveLeftRightHandler.java`
#### Snippet
```java
      return ((BnfAttrs)element).getAttrList();
    }
    else if (element instanceof BnfValueList) {
      return ((BnfValueList)element).getListEntryList();
    }
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/editor/BnfMoveLeftRightHandler.java`
#### Snippet
```java
      return ((BnfValueList)element).getListEntryList();
    }
    else if (element instanceof BnfExternalExpression) {
      return ((BnfExternalExpression)element).getArguments();
    }
```

### ConstantValue
Condition `psiElement instanceof JFlexComposite && psiElement instanceof PsiNamedElement` is always `true`
in `src/org/intellij/jflex/editor/JFlexRefactoringSupportProvider.java`
#### Snippet
```java
  @Override
  public boolean isMemberInplaceRenameAvailable(@NotNull PsiElement psiElement, @Nullable PsiElement context) {
    return psiElement instanceof JFlexComposite && psiElement instanceof PsiNamedElement;
  }
}
```

### ConstantValue
Condition `psiElement instanceof JFlexComposite && psiElement instanceof PsiNamedElement` is always `true`
in `src/org/intellij/jflex/editor/JFlexFindUsagesProvider.java`
#### Snippet
```java
  @Override
  public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
    return psiElement instanceof JFlexComposite && psiElement instanceof PsiNamedElement;
  }

```

### ConstantValue
Condition `!(psiElement instanceof BnfRule)` is always `false`
in `src/org/intellij/grammar/editor/BnfExpressionMarkerAnnotator.java`
#### Snippet
```java
  @Override
  public void annotate(@NotNull PsiElement psiElement, @NotNull AnnotationHolder annotationHolder) {
    if (!(psiElement instanceof BnfRule)) return;
    BnfRule rule = (BnfRule) psiElement;
    // todo
```

### ConstantValue
Value `root` is always 'null'
in `src/org/intellij/grammar/inspection/BnfInspectionSuppressor.java`
#### Snippet
```java
      root instanceof PsiFile ?
      JBIterable.generate(PsiTreeUtil.getDeepestFirst(root), PsiTreeUtil::nextLeaf) :
      JBIterable.generate(root, PsiTreeUtil::prevLeaf).skip(1);
    JBIterable<PsiComment> comments = leaves
      .takeWhile(e -> e instanceof PsiWhiteSpace || e instanceof PsiComment ||
```

### ConstantValue
Value `e` is always 'null'
in `src/org/intellij/grammar/inspection/BnfInspectionSuppressor.java`
#### Snippet
```java
      JBIterable.generate(root, PsiTreeUtil::prevLeaf).skip(1);
    JBIterable<PsiComment> comments = leaves
      .takeWhile(e -> e instanceof PsiWhiteSpace || e instanceof PsiComment ||
                      e instanceof BnfSequence && e.getTextLength() == 0)
      .filter(PsiComment.class);
```

### ConstantValue
Condition `e instanceof BnfSequence && e.getTextLength() == 0` is always `false`
in `src/org/intellij/grammar/inspection/BnfInspectionSuppressor.java`
#### Snippet
```java
    JBIterable<PsiComment> comments = leaves
      .takeWhile(e -> e instanceof PsiWhiteSpace || e instanceof PsiComment ||
                      e instanceof BnfSequence && e.getTextLength() == 0)
      .filter(PsiComment.class);
    for (PsiComment comment : comments) {
```

### ConstantValue
Value `e` is always 'null'
in `src/org/intellij/grammar/inspection/BnfInspectionSuppressor.java`
#### Snippet
```java
    JBIterable<PsiComment> comments = leaves
      .takeWhile(e -> e instanceof PsiWhiteSpace || e instanceof PsiComment ||
                      e instanceof BnfSequence && e.getTextLength() == 0)
      .filter(PsiComment.class);
    for (PsiComment comment : comments) {
```

### ConstantValue
Condition `!(element instanceof BnfComposite)` is always `false`
in `src/org/intellij/grammar/inspection/BnfInspectionSuppressor.java`
#### Snippet
```java
  @Override
  public boolean isSuppressedFor(@NotNull PsiElement element, @NotNull String toolId) {
    if (!(element instanceof BnfComposite)) return false;
    PsiFile file = element.getContainingFile();
    if (isSuppressedInComment(file, toolId + "ForFile")) return true;
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/psi/impl/BnfReferenceImpl.java`
#### Snippet
```java
    PsiElement parent = myElement.getParent();
    int paramCount = parent instanceof BnfSequence ? ((BnfSequence)parent).getExpressionList().size() - 1 :
                     parent instanceof BnfExternalExpression ? ((BnfExternalExpression)parent).getArguments().size() : 0;
    BnfRule rule = Objects.requireNonNull(PsiTreeUtil.getParentOfType(myElement, BnfRule.class));
    String parserClass = ParserGeneratorUtil.getAttribute(rule, KnownAttribute.PARSER_UTIL_CLASS);
```

### ConstantValue
Condition `parent instanceof BnfAttr || parent instanceof BnfListEntry` is always `false`
in `src/org/intellij/grammar/inspection/BnfResolveInspection.java`
#### Snippet
```java
          }
        }
        else if (parent instanceof BnfAttr || parent instanceof BnfListEntry) {
          String attrName = Objects.requireNonNull(PsiTreeUtil.getParentOfType(o, BnfAttr.class)).getName();
          KnownAttribute<?> attribute = KnownAttribute.getCompatibleAttribute(attrName);
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/inspection/BnfResolveInspection.java`
#### Snippet
```java
          }
        }
        else if (parent instanceof BnfAttr || parent instanceof BnfListEntry) {
          String attrName = Objects.requireNonNull(PsiTreeUtil.getParentOfType(o, BnfAttr.class)).getName();
          KnownAttribute<?> attribute = KnownAttribute.getCompatibleAttribute(attrName);
```

### ConstantValue
Value `parent` is always 'null'
in `src/org/intellij/grammar/inspection/BnfResolveInspection.java`
#### Snippet
```java
          }
        }
        else if (parent instanceof BnfAttr || parent instanceof BnfListEntry) {
          String attrName = Objects.requireNonNull(PsiTreeUtil.getParentOfType(o, BnfAttr.class)).getName();
          KnownAttribute<?> attribute = KnownAttribute.getCompatibleAttribute(attrName);
```

### ConstantValue
Condition `isInterface` is always `false`
in `src/org/intellij/grammar/actions/BnfGenerateParserUtilAction.java`
#### Snippet
```java
            PsiElement clazz = ref.resolve();
            boolean isInterface = clazz instanceof PsiClass && ((PsiClass)clazz).isInterface();
            PsiReferenceList targetReferenceList = isInterface ? resultClass.getImplementsList() : resultClass.getExtendsList();
            assert targetReferenceList != null;
            targetReferenceList.add(ref);
```

### ConstantValue
Value `e` is always 'null'
in `src/org/intellij/jflex/psi/impl/StateRef.java`
#### Snippet
```java
        .replace(JFlexPsiElementFactory.createIdFromText(e.getProject(), newElementName));
    }
    else if (e instanceof JFlexJavaCode) {
      String text = StringUtil.replaceSubstring(e.getText(), getRangeInElement(), newElementName);
      return e.replace(JFlexPsiElementFactory.createJavaCodeFromText(e.getProject(), text));
```

### ConstantValue
Condition `psiElement instanceof BnfRule || psiElement instanceof BnfAttr` is always `true`
in `src/org/intellij/grammar/BnfFindUsagesProvider.java`
#### Snippet
```java
  @Override
  public boolean canFindUsagesFor(@NotNull PsiElement psiElement) {
    return psiElement instanceof BnfRule || psiElement instanceof BnfAttr;
  }

```

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
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      return BnfTypes.BNF_OP_OPT;
    }
    else if (tree instanceof BnfQuantified) {
      BnfQuantifier quantifier = ((BnfQuantified)tree).getQuantifier();
      return PsiTreeUtil.getDeepestFirst(quantifier).getNode().getElementType();
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      return PsiTreeUtil.getDeepestFirst(quantifier).getNode().getElementType();
    }
    else if (tree instanceof BnfPredicate) {
      return ((BnfPredicate)tree).getPredicateSign().getFirstChild().getNode().getElementType();
    }
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      return ((BnfPredicate)tree).getPredicateSign().getFirstChild().getNode().getElementType();
    }
    else if (tree instanceof BnfStringLiteralExpression) {
      return BnfTypes.BNF_STRING;
    }
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      return BnfTypes.BNF_STRING;
    }
    else if (tree instanceof BnfLiteralExpression) {
      return tree.getFirstChild().getNode().getElementType();
    }
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
      return tree.getFirstChild().getNode().getElementType();
    }
    else if (tree instanceof BnfParenExpression) {
      return BNF_SEQUENCE;
    }
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    Map<String, BnfExpression> result = new TreeMap<>();
    for (PsiElement tree : accessors) {
      if (!(tree instanceof BnfReferenceOrToken || tree instanceof BnfLiteralExpression)) continue;
      result.put(tree.getText(), (BnfExpression)tree);
    }
```

### ConstantValue
Value `o` is always 'null'
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
  private static @Nullable BnfRule resolveRule(@Nullable PsiElement o) {
    if (!(o instanceof BnfReferenceOrToken ||
          o instanceof BnfStringLiteralExpression)) return null;
    PsiReference reference = ContainerUtil.findInstance(o.getReferences(), BnfReferenceImpl.class);
    PsiElement target = reference != null ? reference.resolve() : null;
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
            return inParsing.contains(rule) || inSuppressed.contains(rule);
          }
          else if (element instanceof BnfReferenceOrToken) {
            ContainerUtil.addIfNotNull(inParsing, ((BnfReferenceOrToken)element).resolveRule());
            return false;
```

### ConstantValue
Condition `!(file instanceof BnfFile)` is always `false`
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
  @Override
  public ProblemDescriptor @Nullable [] checkFile(@NotNull PsiFile file, @NotNull InspectionManager manager, boolean isOnTheFly) {
    if (!(file instanceof BnfFile)) return null;
    if (SuppressionUtil.inspectionResultSuppressed(file, this)) return null;
    BnfFile myFile = (BnfFile)file;
```

### ConstantValue
Condition `!(element instanceof JFlexLexicalRulesSection)` is always `false`
in `src/org/intellij/jflex/psi/impl/JFlexPsiImplUtil.java`
#### Snippet
```java
          result.add((T)element);
        }
        else if (!(element instanceof JFlexLexicalRulesSection) &&
                 !(element instanceof JFlexUserCodeSection)) {
          super.visitElement(element);
```

### ConstantValue
Condition `!(element instanceof JFlexLexicalRulesSection) && !(element instanceof JFlexUserCod...` is always `false`
in `src/org/intellij/jflex/psi/impl/JFlexPsiImplUtil.java`
#### Snippet
```java
          result.add((T)element);
        }
        else if (!(element instanceof JFlexLexicalRulesSection) &&
                 !(element instanceof JFlexUserCodeSection)) {
          super.visitElement(element);
        }
```

### ConstantValue
Value `method` is always 'null'
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public @NotNull List<String> getParameterAnnotations(@Nullable NavigatablePsiElement method, int paramIndex) {
      if (!(method instanceof PsiMethod)) return super.getParameterAnnotations(method, paramIndex);
      PsiMethod psiMethod = (PsiMethod)method;
      PsiParameter[] parameters = psiMethod.getParameterList().getParameters();
```

### ConstantValue
Value `method` is always 'null'
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public @NotNull List<String> getMethodTypes(NavigatablePsiElement method) {
      if (!(method instanceof PsiMethod)) return super.getMethodTypes(method);
      PsiMethod psiMethod = (PsiMethod)method;
      PsiType returnType = psiMethod.getReturnType();
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public @NotNull List<String> getAnnotations(NavigatablePsiElement element) {
      if (!(element instanceof PsiModifierListOwner)) return super.getAnnotations(element);
      return getAnnotationsInner((PsiModifierListOwner)element);
    }
```

### ConstantValue
Value `method` is always 'null'
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public @NotNull String getDeclaringClass(@Nullable NavigatablePsiElement method) {
      if (!(method instanceof PsiMethod)) return super.getDeclaringClass(method);
      PsiMethod psiMethod = (PsiMethod)method;
      PsiClass aClass = psiMethod.getContainingClass();
```

### ConstantValue
Value `method` is always 'null'
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public List<String> getExceptionList(NavigatablePsiElement method) {
      if (!(method instanceof PsiMethod)) return super.getExceptionList(method);

      PsiMethod psiMethod = (PsiMethod)method;
```

### ConstantValue
Value `method` is always 'null'
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
    @Override
    public List<TypeParameterInfo> getGenericParameters(NavigatablePsiElement method) {
      if (!(method instanceof PsiMethod)) return super.getGenericParameters(method);

      PsiMethod psiMethod = (PsiMethod)method;
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

### ConstantValue
Condition `isExternalPsi(required)` is always `false` when reached
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        if (required == null) {
          required = t;
          maybeCollapsed = required instanceof BnfRule || isExternalPsi(required);
        }
        else {
```

### ConstantValue
Value `required` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        if (required == null) {
          required = t;
          maybeCollapsed = required instanceof BnfRule || isExternalPsi(required);
        }
        else {
```

### ConstantValue
Condition `e1 instanceof BnfLiteralExpression && e2 instanceof BnfLiteralExpression` is always `false` when reached
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    public boolean equals(PsiElement e1, PsiElement e2) {
      if (e1 instanceof BnfReferenceOrToken && e2 instanceof BnfReferenceOrToken ||
          e1 instanceof BnfLiteralExpression && e2 instanceof BnfLiteralExpression) {
        return e1.getText().equals(e2.getText());
      }
```

### ConstantValue
Value `e2` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    public boolean equals(PsiElement e1, PsiElement e2) {
      if (e1 instanceof BnfReferenceOrToken && e2 instanceof BnfReferenceOrToken ||
          e1 instanceof BnfLiteralExpression && e2 instanceof BnfLiteralExpression) {
        return e1.getText().equals(e2.getText());
      }
```

### ConstantValue
Value `cur` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      Cardinality cardinality = REQUIRED;
      for (PsiElement cur = context; !(cur instanceof BnfRule); cur = cur.getParent()) {
        if (PsiTreeUtil.isAncestor(cur, e, true)) break;
        IElementType curType = getEffectiveType(cur);
        if (curType == BnfTypes.BNF_OP_OPT || curType == BnfTypes.BNF_OP_ONEMORE || curType == BnfTypes.BNF_OP_ZEROMORE) {
```

### ConstantValue
Value `cur` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      for (PsiElement cur = context; !(cur instanceof BnfRule); cur = cur.getParent()) {
        if (PsiTreeUtil.isAncestor(cur, e, true)) break;
        IElementType curType = getEffectiveType(cur);
        if (curType == BnfTypes.BNF_OP_OPT || curType == BnfTypes.BNF_OP_ONEMORE || curType == BnfTypes.BNF_OP_ZEROMORE) {
          cardinality = cardinality.and(fromNodeType(curType));
```

### ConstantValue
Value `e` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    @Override
    public int hashCode(PsiElement e) {
      if (e instanceof BnfReferenceOrToken || e instanceof BnfLiteralExpression) {
        return e.getText().hashCode();
      }
```

### ConstantValue
Value `e` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        return e.getText().hashCode();
      }
      return Objects.hashCode(e);
    }

```

### ConstantValue
Value `o` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
  private void buildRulesGraph() {
    SyntaxTraverser<PsiElement> s = SyntaxTraverser.psiTraverser()
      .expand(o -> !(o instanceof BnfPredicate || o instanceof BnfExternalExpression));
    for (BnfRule rule : myFile.getRules()) {
      for (PsiElement e : s.withRoot(rule.getExpression()).filter(BnfExpression.class)) {
```

### ConstantValue
Value `e` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        BnfReferenceOrToken ruleRef =
          e instanceof BnfReferenceOrToken ? (BnfReferenceOrToken)e :
          e instanceof BnfExternalExpression ? PsiTreeUtil.findChildOfType(e, BnfReferenceOrToken.class) :
          null;
        BnfRule r = ruleRef != null ? ruleRef.resolveRule() : null;
```

### ConstantValue
Value `e` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
          myRulesGraph.putValue(rule, r);
        }
        else if (e instanceof BnfReferenceOrToken || e instanceof BnfStringLiteralExpression) {
          myRulesWithTokens.add(rule);
        }
```

### ConstantValue
Condition `isExternalPsi(element)` is always `false`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        BnfRule r = null;
        if (element instanceof BnfRule) r = (BnfRule)element;
        else if (isExternalPsi(element) && !element.getText().startsWith("#") && !isDoubleAngles(element.getText())) {
          String text = element.getText();
          BnfRule rule = myFile.getRule(text);
```

### ConstantValue
Condition `isExternalPsi(element) && !element.getText().startsWith("#") && !isDoubleAngles(element.getText())` is always `false`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        BnfRule r = null;
        if (element instanceof BnfRule) r = (BnfRule)element;
        else if (isExternalPsi(element) && !element.getText().startsWith("#") && !isDoubleAngles(element.getText())) {
          String text = element.getText();
          BnfRule rule = myFile.getRule(text);
```

### ConstantValue
Value `element` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
        BnfRule r = null;
        if (element instanceof BnfRule) r = (BnfRule)element;
        else if (isExternalPsi(element) && !element.getText().startsWith("#") && !isDoubleAngles(element.getText())) {
          String text = element.getText();
          BnfRule rule = myFile.getRule(text);
```

### ConstantValue
Condition `tree instanceof BnfExternalExpression` is always `false`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      }
    }
    else if (tree instanceof BnfExternalExpression) {
      BnfExternalExpression expression = (BnfExternalExpression)tree;
      List<BnfExpression> arguments = expression.getArguments();
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      }
    }
    else if (tree instanceof BnfExternalExpression) {
      BnfExternalExpression expression = (BnfExternalExpression)tree;
      List<BnfExpression> arguments = expression.getArguments();
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
      boolean pinApplied = false;

      IElementType type = getEffectiveType(tree);

      List<Map<PsiElement, Cardinality>> list = new ArrayList<>();
```

### ConstantValue
Value `tree` is always 'null'
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java

      List<Map<PsiElement, Cardinality>> list = new ArrayList<>();
      List<BnfExpression> childExpressions = getChildExpressions(tree);
      for (BnfExpression child : childExpressions) {
        Map<PsiElement, Cardinality> nextMap = collectMembers(rule, child, visited);
```

### ConstantValue
Condition `!(marker instanceof PsiBuilder.Marker)` is always `false`
in `src/org/intellij/grammar/parser/GeneratedParserUtilBase.java`
#### Snippet
```java
  private static PsiBuilderImpl.ProductionMarker getLatestExtensibleDoneMarker(@NotNull PsiBuilder builder) {
    PsiBuilderImpl.ProductionMarker marker = ContainerUtil.getLastItem(((Builder)builder).getProductions());
    return marker == null || marker.getTokenType() == null || !(marker instanceof PsiBuilder.Marker) ? null : marker;
  }

```

