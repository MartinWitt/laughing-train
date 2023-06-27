# Grammar-Kit 
 
# Bad smells
I found 99 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UnstableApiUsage | 15 | false |
| DataFlowIssue | 11 | false |
| StaticCollection | 8 | false |
| BlockingMethodInNonBlockingContext | 6 | false |
| RedundantMethodOverride | 6 | false |
| InstanceofThis | 5 | false |
| DeclareCollectionAsInterface | 5 | false |
| Singleton | 5 | false |
| ConstantValue | 5 | false |
| MagicNumber | 5 | false |
| CommentedOutCode | 3 | false |
| DuplicatedCode | 3 | false |
| TrivialIf | 3 | false |
| MagicConstant | 2 | false |
| FinalClass | 2 | false |
| RedundantEscapeInRegexReplacement | 2 | false |
| DialogTitleCapitalization | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| LimitedScopeInnerClass | 1 | false |
| EmptyStatementBody | 1 | false |
| MarkerInterface | 1 | false |
| SwitchStatementDensity | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| Deprecation | 1 | false |
| NullableProblems | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
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

## RuleId[id=LimitedScopeInnerClass]
### LimitedScopeInnerClass
Local class `ParamTypeAnno`
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
                                MethodType.INSTANCE;
        myInfo.methods.add(m);
        class ParamTypeAnno { int index; String anno; TypePath path; }
        List<ParamTypeAnno> typeAnnos = new SmartList<>();
        return new MethodVisitor(ASM_OPCODES) {
```

## RuleId[id=InstanceofThis]
### InstanceofThis
'instanceof' check for `this`
in `src/org/intellij/grammar/psi/impl/BnfNamedImpl.java`
#### Snippet
```java
  @Override
  public Icon getIcon(int flags) {
    if (this instanceof BnfRule) {
      Icon base = hasModifier((BnfRule)this, "external") ? BnfIcons.EXTERNAL_RULE : BnfIcons.RULE;
      Icon visibility = hasModifier((BnfRule)this, "private") ? PlatformIcons.PRIVATE_ICON : PlatformIcons.PUBLIC_ICON;
```

### InstanceofThis
'instanceof' check for `this`
in `src/org/intellij/grammar/psi/impl/BnfNamedImpl.java`
#### Snippet
```java
      return row;
    }
    else if (this instanceof BnfAttr) {
      return BnfIcons.ATTRIBUTE;
    }
```

### InstanceofThis
'instanceof' check for `this`
in `src/org/intellij/jflex/psi/impl/JFlexCompositeImpl.java`
#### Snippet
```java
  @Override
  public Icon getIcon(int flags) {
    if (this instanceof JFlexRule) {
      JFlexExpression e = ((JFlexRule)this).getExpression();
      return e == null ? PlatformIcons.PACKAGE_ICON : PlatformIcons.METHOD_ICON;
```

### InstanceofThis
'instanceof' check for `this`
in `src/org/intellij/jflex/psi/impl/JFlexCompositeImpl.java`
#### Snippet
```java
      return e == null ? PlatformIcons.PACKAGE_ICON : PlatformIcons.METHOD_ICON;
    }
    else if (this instanceof JFlexOption) {
      return PlatformIcons.PROPERTY_ICON;
    }
```

### InstanceofThis
'instanceof' check for `this`
in `src/org/intellij/jflex/psi/impl/JFlexCompositeImpl.java`
#### Snippet
```java
      return PlatformIcons.PROPERTY_ICON;
    }
    else if (this instanceof JFlexMacroDefinition) {
      return PlatformIcons.FIELD_ICON;
    }
```

## RuleId[id=DataFlowIssue]
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

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
      }
    }
    else if (GrammarUtil.isAtomicExpression(child) || isTokenSequence(rule, child)) {
      // do not generate
    }
```

## RuleId[id=MarkerInterface]
### MarkerInterface
Marker interface `JFlexFile`
in `src/org/intellij/jflex/psi/impl/JFlexFile.java`
#### Snippet
```java
 * @author gregsh
 */
public interface JFlexFile extends PsiFile {
}

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

## RuleId[id=FinalClass]
### FinalClass
Class 'LivePreviewHelper' declared `final`
in `src/org/intellij/grammar/livePreview/LivePreviewHelper.java`
#### Snippet
```java
 */
@Service
public final class LivePreviewHelper implements Disposable {

  public static LivePreviewHelper getInstance() {
```

### FinalClass
Class 'GrammarKitBundle' declared `final`
in `src/org/intellij/grammar/GrammarKitBundle.java`
#### Snippet
```java
 * @author gregsh
 */
public final class GrammarKitBundle extends DynamicBundle {

  public static final @NonNls String BUNDLE = "messages.GrammarKitBundle";
```

## RuleId[id=SwitchStatementDensity]
### SwitchStatementDensity
`switch` has too low of a branch density (20%)
in `src/org/intellij/grammar/generator/ParserGenerator.java`
#### Snippet
```java
    for (RuleMethodsHelper.MethodInfo methodInfo : myRulesMethodsHelper.getFor(rule)) {
      if (StringUtil.isEmpty(methodInfo.name)) continue;
      switch (methodInfo.type) {
        case RULE, TOKEN -> generatePsiAccessor(rule, methodInfo, intf, mixedAST);
        case USER -> generateUserPsiAccessors(rule, methodInfo, intf, mixedAST);
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
    while (first != last && first instanceof PsiWhiteSpace) {
      first = first.getNextSibling();
    }
    while (last != first && last instanceof PsiWhiteSpace) {
      last = last.getPrevSibling();
    }
    if (first == null || last == null || first == last && last instanceof PsiWhiteSpace) return null;
```

### DuplicatedCode
Duplicated code
in `src/org/intellij/grammar/refactor/BnfUnwrapDescriptor.java`
#### Snippet
```java
    PsiElement last = element.getLastChild();
    PsiElement first = element.getFirstChild();
    if (element instanceof BnfParenthesized) {
      last = last.getPrevSibling();
      first = first.getNextSibling();
    }
    while (first != last && first instanceof PsiWhiteSpace) {
      first = first.getNextSibling();
    }
    while (last != first && last instanceof PsiWhiteSpace) {
      last = last.getPrevSibling();
    }
```

### DuplicatedCode
Duplicated code
in `src/org/intellij/jflex/editor/JFlexSyntaxHighlighterFactory.java`
#### Snippet
```java
      if (o == FLEX_LINE_COMMENT || o == FLEX_BLOCK_COMMENT) return pack(COMMENT);
      if (o == FLEX_RAW) return pack(RAW_CODE);
      if (o == FLEX_TWO_PERCS) return pack(SECT_DIV);
      if (o == FLEX_STRING) return pack(STRING);
      if (o == FLEX_CHAR) return pack(CHAR);
      if (o == FLEX_CHAR_ESC) return pack(CHAR_ESC);
```

## RuleId[id=DeclareCollectionAsInterface]
### DeclareCollectionAsInterface
Declaration of `ArrayList` should probably be weakened to 'java.util.List'
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
      PsiElement element = getElement();
      if (element == null || element instanceof LeafPsiElement) return Collections.emptyList();
      ArrayList<StructureViewTreeElement> result = new ArrayList<>();
      for (PsiElement e = element.getFirstChild(); e != null; e = e.getNextSibling()) {
        if (e instanceof PsiWhiteSpace) continue;
```

### DeclareCollectionAsInterface
Declaration of `HashSet` should probably be weakened to 'java.util.Set'
in `src/org/intellij/grammar/inspection/BnfIdenticalChoiceBranchesInspection.java`
#### Snippet
```java
  public @NotNull PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly) {
    return new BnfVisitor<Void>() {
      final HashSet<BnfExpression> set = new HashSet<>();
      @Override
      public Void visitChoice(@NotNull BnfChoice o) {
```

### DeclareCollectionAsInterface
Declaration of `HashSet` should probably be weakened to 'java.util.Set'
in `src/org/intellij/grammar/inspection/BnfUnreachableChoiceBranchInspection.java`
#### Snippet
```java
  private static void checkChoice(BnfChoice choice, ProblemsHolder problemsHolder) {
    Set<BnfExpression> visited = new HashSet<>();
    HashSet<BnfExpression> first = new HashSet<>();
    BnfFirstNextAnalyzer analyzer = BnfFirstNextAnalyzer.createAnalyzer(true);
    List<BnfExpression> list = choice.getExpressionList();
```

### DeclareCollectionAsInterface
Declaration of `LinkedList` should probably be weakened to 'java.util.Deque'
in `src/org/intellij/grammar/refactor/BnfInlineRuleProcessor.java`
#### Snippet
```java
    }
    Object2IntMap<String> visited = new Object2IntOpenHashMap<>();
    LinkedList<Pair<PsiElement, PsiElement>> work = new LinkedList<>();
    (expression = (BnfExpression)expression.copy()).acceptChildren(new PsiRecursiveElementWalkingVisitor() {
      @Override
```

### DeclareCollectionAsInterface
Declaration of `HashSet` should probably be weakened to 'java.util.Set'
in `src/org/intellij/grammar/analysis/BnfFirstNextAnalyzer.java`
#### Snippet
```java

    LinkedList<BnfExpression> stack = new LinkedList<>();
    HashSet<BnfRule> totalVisited = new HashSet<>();
    Set<BnfExpression> curResult = new HashSet<>();
    stack.add(targetExpression);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `src/org/intellij/grammar/inspection/BnfUnusedRuleInspection.java`
#### Snippet
```java
      if (SuppressionUtil.inspectionResultSuppressed(rule, this)) inSuppressed.add(rule);
    }
    inParsing.addAll(roots);

    for (int size = 0, prev = -1; size != prev; prev = size, size = inParsing.size()) {
```

## RuleId[id=Deprecation]
### Deprecation
'createTextAttributesKey(java.lang.@org.jetbrains.annotations.NonNls @org.jetbrains.annotations.NotNull String, com.intellij.openapi.editor.markup.TextAttributes)' is deprecated
in `src/org/intellij/grammar/editor/BnfSyntaxHighlighter.java`
#### Snippet
```java
  public static final TextAttributesKey OP_SIGN = createTextAttributesKey("BNF_OP_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN);
  public static final TextAttributesKey RECOVER_MARKER = createTextAttributesKey("BNF_RECOVER_MARKER");
  public static final TextAttributesKey PIN_MARKER = createTextAttributesKey(
    "BNF_PIN", new TextAttributes(null, null, DefaultLanguageHighlighterColors.LINE_COMMENT.getDefaultAttributes().getForegroundColor(), EffectType.BOLD_DOTTED_LINE, 0));

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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated method overrides method annotated with @NotNull
in `src/org/intellij/jflex/editor/JFlexBraceMatcher.java`
#### Snippet
```java

  @Override
  public BracePair @NotNull [] getPairs() {
    return PAIRS;
  }
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
        if (is == null) return null;
        byte[] bytes = FileUtil.loadBytes(is);
        is.close();
        return getClassInfo(className, bytes);
      }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
    }
    else {
      jarFile.putNextEntry(new JarEntry(resourceName));
      FileUtil.copy(stream, jarFile);
      jarFile.closeEntry();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      jarFile.putNextEntry(new JarEntry(resourceName));
      FileUtil.copy(stream, jarFile);
      jarFile.closeEntry();
    }
  }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
    String s;
    addJarEntry(jar, "misc/registry.properties");
    while ((s = reader.readLine()) != null) {
      Matcher matcher = pattern.matcher(s);
      if (!matcher.matches()) continue;
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/org/intellij/grammar/LightPsi.java`
#### Snippet
```java
      count ++;
    }
    jar.close();
    return count;
  }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/org/intellij/grammar/Main.java`
#### Snippet
```java
            count ++;
            new ParserGenerator((BnfFile) bnfFile, grammarDir.getAbsolutePath(), output.getAbsolutePath(), "").generate();
            System.out.println(file.getName() + " parser generated to " + output.getCanonicalPath());
          }
        }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/org/intellij/grammar/java/JavaHelper.java`
#### Snippet
```java
      MyElement<?> element = (MyElement<?>)o;

      if (!delegate.equals(element.delegate)) return false;

      return true;
```

### TrivialIf
`if` statement can be simplified
in `src/org/intellij/grammar/refactor/BnfExpressionOptimizer.java`
#### Snippet
```java
      return true;
    }
    else if (element instanceof BnfChoice && (((BnfChoice)element).getExpressionList().size() == 1 || parent instanceof BnfChoice)) {
      return true;
    }
```

### TrivialIf
`if` statement can be simplified
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
    if (getAttribute(subRule, KnownAttribute.RECOVER_WHILE) != null) return true;
    if (!getAttribute(subRule, KnownAttribute.HOOKS).isEmpty()) return true;
    if (Rule.isExternal(subRule)) return true;
    return false;
  }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isReadOnly()` is identical to its super method
in `src/org/intellij/grammar/livePreview/LivePreviewFileType.java`
#### Snippet
```java

  @Override
  public boolean isReadOnly() {
    return false;
  }
```

### RedundantMethodOverride
Method `shouldEnterElement()` is identical to its super method
in `src/org/intellij/grammar/BnfStructureViewFactory.java`
#### Snippet
```java

    @Override
    public boolean shouldEnterElement(Object element) {
      return false;
    }
```

### RedundantMethodOverride
Method `shouldEnterElement()` is identical to its super method
in `src/org/intellij/jflex/editor/JFlexStructureViewFactory.java`
#### Snippet
```java

    @Override
    public boolean shouldEnterElement(Object element) {
      return false;
    }
```

### RedundantMethodOverride
Method `getDocumentationElementForLookupItem()` is identical to its super method
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java

  @Override
  public @Nullable PsiElement getDocumentationElementForLookupItem(PsiManager psiManager, Object obj5ect, PsiElement element) {
    return null;
  }
```

### RedundantMethodOverride
Method `getUrlFor()` is identical to its super method
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java

  @Override
  public @Nullable List<String> getUrlFor(PsiElement element, PsiElement originalElement) {
    return null;
  }
```

### RedundantMethodOverride
Method `getDocumentationElementForLink()` is identical to its super method
in `src/org/intellij/grammar/BnfDocumentationProvider.java`
#### Snippet
```java

  @Override
  public @Nullable PsiElement getDocumentationElementForLink(PsiManager psiManager, String link, PsiElement context) {
    return null;
  }
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

## RuleId[id=Singleton]
### Singleton
Class `JFlexFileType` is a singleton
in `src/org/intellij/jflex/parser/JFlexFileType.java`
#### Snippet
```java
import javax.swing.*;

public class JFlexFileType extends LanguageFileType {

  public static final JFlexFileType INSTANCE = new JFlexFileType();
```

### Singleton
Class `BnfLanguage` is a singleton
in `src/org/intellij/grammar/BnfLanguage.java`
#### Snippet
```java
 * Time: 22:44
 */
public class BnfLanguage extends Language {

  public static final BnfLanguage INSTANCE = new BnfLanguage();
```

### Singleton
Class `GrammarKitBundle` is a singleton
in `src/org/intellij/grammar/GrammarKitBundle.java`
#### Snippet
```java
 * @author gregsh
 */
public final class GrammarKitBundle extends DynamicBundle {

  public static final @NonNls String BUNDLE = "messages.GrammarKitBundle";
```

### Singleton
Class `JFlexLanguage` is a singleton
in `src/org/intellij/jflex/JFlexLanguage.java`
#### Snippet
```java
import org.jetbrains.annotations.NotNull;

public class JFlexLanguage extends Language {

  public static final JFlexLanguage INSTANCE = new JFlexLanguage();
```

### Singleton
Class `BnfFileType` is a singleton
in `src/org/intellij/grammar/BnfFileType.java`
#### Snippet
```java
 * Time: 22:46
 */
public class BnfFileType extends LanguageFileType {

  public static final BnfFileType INSTANCE = new BnfFileType();
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

## RuleId[id=StaticCollection]
### StaticCollection
Static collection `JAVA_CLASS_ATTRIBUTES`
in `src/org/intellij/grammar/psi/impl/BnfStringRefContributor.java`
#### Snippet
```java
  private static final Set<KnownAttribute<?>> RULE_ATTRIBUTES = ContainerUtil.set(EXTENDS, IMPLEMENTS, RECOVER_WHILE, NAME);

  private static final Set<KnownAttribute<?>> JAVA_CLASS_ATTRIBUTES = ContainerUtil.set(EXTENDS, IMPLEMENTS, MIXIN);

  @Override
```

### StaticCollection
Static collection `RULE_ATTRIBUTES`
in `src/org/intellij/grammar/psi/impl/BnfStringRefContributor.java`
#### Snippet
```java
public class BnfStringRefContributor extends PsiReferenceContributor {

  private static final Set<KnownAttribute<?>> RULE_ATTRIBUTES = ContainerUtil.set(EXTENDS, IMPLEMENTS, RECOVER_WHILE, NAME);

  private static final Set<KnownAttribute<?>> JAVA_CLASS_ATTRIBUTES = ContainerUtil.set(EXTENDS, IMPLEMENTS, MIXIN);
```

### StaticCollection
Static collection `EMPTY_LIST`
in `src/org/intellij/grammar/KnownAttribute.java`
#### Snippet
```java
  public static @Nullable KnownAttribute<?> getAttribute(@Nullable String name) { return name == null ? null : ourAttributes.get(name); }

  private static final ListValue EMPTY_LIST = new ListValue();

  public static final KnownAttribute<String>       CLASS_HEADER              = create(true, String.class, "classHeader", BnfConstants.CLASS_HEADER_DEF);
```

### StaticCollection
Static collection `ourAttributes`
in `src/org/intellij/grammar/KnownAttribute.java`
#### Snippet
```java
@SuppressWarnings("StaticVariableOfConcreteClass")
public class KnownAttribute<T> {
  private static final Map<String, KnownAttribute<?>> ourAttributes = new TreeMap<>();

  public static @NotNull Collection<KnownAttribute<?>> getAttributes() { return Collections.unmodifiableCollection(ourAttributes.values()); }
```

### StaticCollection
Static collection `ourBinders`
in `src/org/intellij/grammar/livePreview/LiveHooksHelper.java`
#### Snippet
```java

  private static final Map<String, Object> ourHooks = new HashMap<>();
  private static final Map<String, Object> ourBinders = new HashMap<>();

  static {
```

### StaticCollection
Static collection `ourHooks`
in `src/org/intellij/grammar/livePreview/LiveHooksHelper.java`
#### Snippet
```java
  }

  private static final Map<String, Object> ourHooks = new HashMap<>();
  private static final Map<String, Object> ourBinders = new HashMap<>();

```

### StaticCollection
Static collection `ourProviders`
in `src/org/intellij/grammar/psi/impl/BnfStringImpl.java`
#### Snippet
```java

  private static final Key<PsiReference> REF_KEY = Key.create("BNF_REF_KEY");
  private static final Map<ElementPattern<? extends PsiElement>, PsiReferenceProvider> ourProviders;

  static {
```

### StaticCollection
Static collection `JAVA_RESERVED`
in `src/org/intellij/grammar/generator/ParserGeneratorUtil.java`
#### Snippet
```java
public class ParserGeneratorUtil {
  private static final String RESERVED_SUFFIX = "_$";
  private static final Set<String> JAVA_RESERVED =
    ContainerUtil.set("abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                      "const", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally",
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

## RuleId[id=MagicNumber]
### MagicNumber
Magic number `30`
in `src/org/intellij/grammar/livePreview/LivePreviewStructureViewFactory.java`
#### Snippet
```java
          BnfFile file = (BnfFile)rule.getContainingFile();
          String className = getRulePsiClassName(rule, getPsiClassFormat(file));
          return className + ": '" + StringUtil.first(element.getText(), 30, true) +"'";
        }
      }
```

### MagicNumber
Magic number `50`
in `src/org/intellij/grammar/psi/impl/BnfCompositeImpl.java`
#### Snippet
```java
    if (addText) {
      String text = this instanceof BnfLiteralExpression ? getText() :
                    StringUtil.shortenTextWithEllipsis(getText(), 50, 25, false).replace('\n', ' ');
      return elementType + (StringUtil.isEmptyOrSpaces(text)? "" : ": " + text);
    }
```

### MagicNumber
Magic number `25`
in `src/org/intellij/grammar/psi/impl/BnfCompositeImpl.java`
#### Snippet
```java
    if (addText) {
      String text = this instanceof BnfLiteralExpression ? getText() :
                    StringUtil.shortenTextWithEllipsis(getText(), 50, 25, false).replace('\n', ' ');
      return elementType + (StringUtil.isEmptyOrSpaces(text)? "" : ": " + text);
    }
```

### MagicNumber
Magic number `16`
in `src/org/intellij/grammar/generator/RuleGraphHelper.java`
#### Snippet
```java
    BitSet bits = new BitSet(rulesAndAlts.size());
    int minI = -1, minC = -1, minS = -1;
    for (int len = Math.min(16, supers.size()), i = (1 << len) - 1; i > 0; i --) {
      if (minC != -1 && Integer.bitCount(i) > minC) continue;
      int curC = 0, curS = 0;
```

### MagicNumber
Magic number `40`
in `src/org/intellij/jflex/editor/JFlexStructureViewFactory.java`
#### Snippet
```java
        if (expr != null) {
          if (states != null) sb.append(" ");
          sb.append(firstLast(expr.getText(), 40));
        }
        return sb.toString();
```

