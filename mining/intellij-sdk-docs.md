# intellij-sdk-docs 
 
# Bad smells
I found 94 bad smells with 24 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 18 | false |
| UtilityClassWithoutPrivateConstructor | 11 | true |
| MarkedForRemoval | 6 | false |
| DuplicateBranchesInSwitch | 6 | false |
| UnnecessaryToStringCall | 5 | true |
| DynamicRegexReplaceableByCompiledPattern | 5 | false |
| UnnecessaryFullyQualifiedName | 5 | false |
| ReturnNull | 5 | false |
| UnusedAssignment | 5 | false |
| CStyleArrayDeclaration | 4 | false |
| NestedAssignment | 4 | false |
| SizeReplaceableByIsEmpty | 3 | true |
| ToArrayCallWithZeroLengthArrayArgument | 2 | true |
| RedundantFieldInitialization | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| NonShortCircuitBoolean | 1 | false |
| RedundantEscapeInRegexReplacement | 1 | false |
| MissortedModifiers | 1 | false |
| RedundantSuppression | 1 | false |
| RedundantMethodOverride | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| DialogTitleCapitalization | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| AssignmentToMethodParameter | 1 | false |
| RedundantImplements | 1 | false |
| ZeroLengthArrayInitialization | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ResolveResult\[results.size()\]'
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleReference.java`
#### Snippet
```java
      results.add(new PsiElementResolveResult(property));
    }
    return results.toArray(new ResolveResult[results.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new FoldingDescriptor\[descriptors.size()\]'
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleFoldingBuilder.java`
#### Snippet
```java
      }
    }
    return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
  }

```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'com.intellij.ide.projectView.BaseProjectTreeBuilder' is deprecated and marked for removal
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
import com.intellij.ide.SelectInTarget;
import com.intellij.ide.impl.ProjectViewSelectInTarget;
import com.intellij.ide.projectView.BaseProjectTreeBuilder;
import com.intellij.ide.projectView.ViewSettings;
import com.intellij.ide.projectView.impl.AbstractProjectViewPSIPane;
```

### MarkedForRemoval
'com.intellij.ide.util.treeView.AbstractTreeBuilder' is deprecated and marked for removal
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
import com.intellij.ide.projectView.impl.ProjectTreeStructure;
import com.intellij.ide.projectView.impl.ProjectViewTree;
import com.intellij.ide.util.treeView.AbstractTreeBuilder;
import com.intellij.ide.util.treeView.AbstractTreeUpdater;
import com.intellij.openapi.project.Project;
```

### MarkedForRemoval
'com.intellij.ide.util.treeView.AbstractTreeUpdater' is deprecated and marked for removal
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
import com.intellij.ide.projectView.impl.ProjectViewTree;
import com.intellij.ide.util.treeView.AbstractTreeBuilder;
import com.intellij.ide.util.treeView.AbstractTreeUpdater;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
```

### MarkedForRemoval
'com.intellij.ide.util.treeView.AbstractTreeUpdater' is deprecated and marked for removal
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
  @NotNull
  @Override
  protected AbstractTreeUpdater createTreeUpdater(@NotNull AbstractTreeBuilder builder) {
    throw new IllegalStateException("ImagesProjectViewPane tree is async now");
  }
```

### MarkedForRemoval
'com.intellij.ide.util.treeView.AbstractTreeBuilder' is deprecated and marked for removal
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
  @NotNull
  @Override
  protected AbstractTreeUpdater createTreeUpdater(@NotNull AbstractTreeBuilder builder) {
    throw new IllegalStateException("ImagesProjectViewPane tree is async now");
  }
```

### MarkedForRemoval
'com.intellij.ide.projectView.BaseProjectTreeBuilder' is deprecated and marked for removal
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
  //  Legacy code, awaiting refactoring of AbstractProjectViewPSIPane#createBuilder
  @Override
  protected BaseProjectTreeBuilder createBuilder(@NotNull DefaultTreeModel treeModel) {
    return null;
  }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `SdkIcons` has only 'static' members, and lacks a 'private' constructor
in `code_samples/module/src/main/java/icons/SdkIcons.java`
#### Snippet
```java
import javax.swing.*;

public class SdkIcons {

  public static final Icon Sdk_default_icon = IconLoader.getIcon("/icons/sdk_16.svg", SdkIcons.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SdkIcons` has only 'static' members, and lacks a 'private' constructor
in `code_samples/facet_basics/src/main/java/icons/SdkIcons.java`
#### Snippet
```java
import javax.swing.*;

public class SdkIcons {

  public static final Icon Sdk_default_icon = IconLoader.getIcon("/icons/sdk_16.svg", SdkIcons.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SdkIcons` has only 'static' members, and lacks a 'private' constructor
in `code_samples/action_basics/src/main/java/icons/SdkIcons.java`
#### Snippet
```java
import javax.swing.*;

public class SdkIcons {

  public static final Icon Sdk_default_icon = IconLoader.getIcon("/icons/sdk_16.svg", SdkIcons.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SdkIcons` has only 'static' members, and lacks a 'private' constructor
in `code_samples/editor_basics/src/main/java/icons/SdkIcons.java`
#### Snippet
```java
import javax.swing.*;

public class SdkIcons {

  public static final Icon Sdk_default_icon = IconLoader.getIcon("/icons/sdk_16.svg", SdkIcons.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SdkIcons` has only 'static' members, and lacks a 'private' constructor
in `code_samples/project_model/src/main/java/icons/SdkIcons.java`
#### Snippet
```java
import javax.swing.*;

public class SdkIcons {

  public static final Icon Sdk_default_icon = IconLoader.getIcon("/icons/sdk_16.svg", SdkIcons.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SdkIcons` has only 'static' members, and lacks a 'private' constructor
in `code_samples/framework_basics/src/main/java/icons/SdkIcons.java`
#### Snippet
```java
import javax.swing.*;

public class SdkIcons {

  public static final Icon Sdk_default_icon = IconLoader.getIcon("/icons/sdk_16.svg", SdkIcons.class);
```

### UtilityClassWithoutPrivateConstructor
Class `Factory` has only 'static' members, and lacks a 'private' constructor
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/psi/SimpleTypes.java`
#### Snippet
```java
  IElementType VALUE = new SimpleTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleIcons` has only 'static' members, and lacks a 'private' constructor
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleIcons.java`
#### Snippet
```java
import javax.swing.*;

public class SimpleIcons {

  public static final Icon FILE = IconLoader.getIcon("/icons/jar-gray.png", SimpleIcons.class);
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleUtil` has only 'static' members, and lacks a 'private' constructor
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleUtil.java`
#### Snippet
```java
import java.util.*;

public class SimpleUtil {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `SimpleElementFactory` has only 'static' members, and lacks a 'private' constructor
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/psi/SimpleElementFactory.java`
#### Snippet
```java
import org.intellij.sdk.language.SimpleFileType;

public class SimpleElementFactory {

  public static SimpleProperty createProperty(Project project, String name) {
```

### UtilityClassWithoutPrivateConstructor
Class `SimplePsiImplUtil` has only 'static' members, and lacks a 'private' constructor
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/psi/impl/SimplePsiImplUtil.java`
#### Snippet
```java
import javax.swing.*;

public class SimplePsiImplUtil {

  public static String getKey(SimpleProperty element) {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `getClass().getResource("/toolWindow/Calendar-icon.png")` might be null
in `code_samples/tool_window/src/main/java/org/intellij/sdk/toolWindow/MyToolWindow.java`
#### Snippet
```java
                    + instance.get(Calendar.YEAR)
    );
    currentDate.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Calendar-icon.png")));
    int min = instance.get(Calendar.MINUTE);
    String strMin = min < 10 ? "0" + min : String.valueOf(min);
```

### DataFlowIssue
Argument `getClass().getResource("/toolWindow/Time-icon.png")` might be null
in `code_samples/tool_window/src/main/java/org/intellij/sdk/toolWindow/MyToolWindow.java`
#### Snippet
```java
    String strMin = min < 10 ? "0" + min : String.valueOf(min);
    currentTime.setText(instance.get(Calendar.HOUR_OF_DAY) + ":" + strMin);
    currentTime.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Time-icon.png")));
    // Get time zone
    long gmt_Offset = instance.get(Calendar.ZONE_OFFSET); // offset from GMT in milliseconds
```

### DataFlowIssue
Argument `getClass().getResource("/toolWindow/Time-zone-icon.png")` might be null
in `code_samples/tool_window/src/main/java/org/intellij/sdk/toolWindow/MyToolWindow.java`
#### Snippet
```java
    str_gmt_Offset = (gmt_Offset > 0) ? "GMT + " + str_gmt_Offset : "GMT - " + str_gmt_Offset;
    timeZone.setText(str_gmt_Offset);
    timeZone.setIcon(new ImageIcon(getClass().getResource("/toolWindow/Time-zone-icon.png")));
  }

```

### DataFlowIssue
Argument `ProjectUtil.guessProjectDir(project)` might be null
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectNode.java`
#### Snippet
```java

  public ImagesProjectNode(final Project project) {
    super(project, ProjectUtil.guessProjectDir(project));
    scanImages(project);

```

### DataFlowIssue
Method invocation `substring` may produce `NullPointerException`
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleFoldingBuilder.java`
#### Snippet
```java
    if (node.getPsi() instanceof PsiLiteralExpression) {
      PsiLiteralExpression nodeElement = (PsiLiteralExpression) node.getPsi();
      String key = ((String) nodeElement.getValue()).substring(
              SimpleAnnotator.SIMPLE_PREFIX_STR.length() + SimpleAnnotator.SIMPLE_SEPARATOR_STR.length()
      );
```

### DataFlowIssue
Method invocation `getNode` may produce `NullPointerException`
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleCreatePropertyQuickFix.java`
#### Snippet
```java
    WriteCommandAction.writeCommandAction(project).run(() -> {
      SimpleFile simpleFile = (SimpleFile) PsiManager.getInstance(project).findFile(file);
      ASTNode lastChildNode = simpleFile.getNode().getLastChildNode();
      // TODO: Add another check for CRLF
      if (lastChildNode != null/* && !lastChildNode.getElementType().equals(SimpleTypes.CRLF)*/) {
```

### DataFlowIssue
Method invocation `getCaretModel` may produce `NullPointerException`
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleCreatePropertyQuickFix.java`
#### Snippet
```java
      simpleFile.getNode().addChild(property.getNode());
      ((Navigatable) property.getLastChild().getNavigationElement()).navigate(true);
      FileEditorManager.getInstance(project).getSelectedTextEditor().getCaretModel().moveCaretRelatively(2, 0, false, false, false);
    });
  }
```

### DataFlowIssue
Method invocation `replace` may produce `NullPointerException`
in `code_samples/comparing_string_references_inspection/src/main/java/org/intellij/sdk/codeInspection/ComparingStringReferencesInspection.java`
#### Snippet
```java
              (PsiMethodCallExpression) factory.createExpressionFromText("a.equals(b)", null);

      equalsCall.getMethodExpression().getQualifierExpression().replace(lExpr);
      equalsCall.getArgumentList().getExpressions()[0].replace(rExpr);

```

### DataFlowIssue
Method invocation `replace` may produce `NullPointerException`
in `code_samples/comparing_string_references_inspection/src/main/java/org/intellij/sdk/codeInspection/ComparingStringReferencesInspection.java`
#### Snippet
```java
      if (opSign == JavaTokenType.NE) {
        PsiPrefixExpression negation = (PsiPrefixExpression) factory.createExpressionFromText("!a", null);
        negation.getOperand().replace(result);
        result.replace(negation);
      }
```

### DataFlowIssue
Method invocation `replace` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java

      // Replace initializer with the ternary expression, making an assignment statement using the ternary
      ((PsiAssignmentExpression) statement.getExpression()).getRExpression().replace(variable.getInitializer());

      // Remove the initializer portion of the local variable statement,
```

### DataFlowIssue
Argument `variable.getInitializer()` might be null
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java

      // Replace initializer with the ternary expression, making an assignment statement using the ternary
      ((PsiAssignmentExpression) statement.getExpression()).getRExpression().replace(variable.getInitializer());

      // Remove the initializer portion of the local variable statement,
```

### DataFlowIssue
Method invocation `getCondition` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java

    // Replace the conditional expression with the one from the original ternary expression
    final PsiReferenceExpression condition = (PsiReferenceExpression) conditionalExpression.getCondition().copy();
    newIfStmt.getCondition().replace(condition);

```

### DataFlowIssue
Method invocation `replace` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java
    // Replace the conditional expression with the one from the original ternary expression
    final PsiReferenceExpression condition = (PsiReferenceExpression) conditionalExpression.getCondition().copy();
    newIfStmt.getCondition().replace(condition);

    // Begin building the assignment string for the THEN and ELSE clauses using the
```

### DataFlowIssue
Method invocation `getLExpression` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java
            PsiTreeUtil.getParentOfType(conditionalExpression, PsiAssignmentExpression.class, false);
    // Get the contents of the assignment expression up to the start of the ternary expression
    String exprFrag = assignmentExpression.getLExpression().getText()
            + assignmentExpression.getOperationSign().getText();

```

### DataFlowIssue
Method invocation `getText` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java
    // Build the THEN statement string for the new IF statement,
    // make a PsiExpressionStatement from the string, and switch the placeholder
    String thenStr = exprFrag + conditionalExpression.getThenExpression().getText() + ";";
    PsiExpressionStatement thenStmt = (PsiExpressionStatement) factory.createStatementFromText(thenStr, null);
    ((PsiBlockStatement) newIfStmt.getThenBranch()).getCodeBlock().getStatements()[0].replace(thenStmt);
```

### DataFlowIssue
Method invocation `getCodeBlock` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java
    String thenStr = exprFrag + conditionalExpression.getThenExpression().getText() + ";";
    PsiExpressionStatement thenStmt = (PsiExpressionStatement) factory.createStatementFromText(thenStr, null);
    ((PsiBlockStatement) newIfStmt.getThenBranch()).getCodeBlock().getStatements()[0].replace(thenStmt);

    // Build the ELSE statement string for the new IF statement,
```

### DataFlowIssue
Method invocation `getText` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java
    // Build the ELSE statement string for the new IF statement,
    // make a PsiExpressionStatement from the string, and switch the placeholder
    String elseStr = exprFrag + conditionalExpression.getElseExpression().getText() + ";";
    PsiExpressionStatement elseStmt = (PsiExpressionStatement) factory.createStatementFromText(elseStr, null);
    ((PsiBlockStatement) newIfStmt.getElseBranch()).getCodeBlock().getStatements()[0].replace(elseStmt);
```

### DataFlowIssue
Method invocation `getCodeBlock` may produce `NullPointerException`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java
    String elseStr = exprFrag + conditionalExpression.getElseExpression().getText() + ";";
    PsiExpressionStatement elseStmt = (PsiExpressionStatement) factory.createStatementFromText(elseStr, null);
    ((PsiBlockStatement) newIfStmt.getElseBranch()).getCodeBlock().getStatements()[0].replace(elseStmt);

    // Replace the entire original statement with the new IF
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of field `ZZ_CMAP_A`
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_A table has 320 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\4\1\2\1\1\1\5\1\3\22\0\1\7\1\10\1\0\1\10\26\0\1\11\2\0\1\11\36\0\1"+
    "\6\50\0\1\1\242\0\2\1\26\0");
```

### CStyleArrayDeclaration
C-style array declaration of field `ZZ_CMAP_Z`
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\100\1\200\u010d\100");

```

### CStyleArrayDeclaration
C-style array declaration of field `ZZ_CMAP_Y`
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java

  /* The ZZ_CMAP_Y table has 192 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\77\3");

```

### CStyleArrayDeclaration
C-style array declaration of field `ZZ_LEXSTATE`
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 9: break;
          case 3: 
            { return TokenType.BAD_CHARACTER;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 10: break;
          case 4: 
            { yybegin(YYINITIAL); return SimpleTypes.COMMENT;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 11: break;
          case 5: 
            { yybegin(WAITING_VALUE); return SimpleTypes.SEPARATOR;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 12: break;
          case 6: 
            { yybegin(YYINITIAL); return SimpleTypes.VALUE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 13: break;
          case 7: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
            } 
            // fall through
          case 14: break;
          default:
            zzScanError(ZZ_NO_MATCH);
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`text.length() > 0` can be replaced with '!text.isEmpty()'
in `code_samples/live_templates/src/main/java/org/intellij/sdk/liveTemplates/TitleCaseMacro.java`
#### Snippet
```java
      return null;
    }
    if (text.length() > 0) {
      // Capitalize the start of every word
      text = StringUtil.toTitleCase(text);
```

### SizeReplaceableByIsEmpty
`properties.size() > 0` can be replaced with '!properties.isEmpty()'
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleLineMarkerProvider.java`
#### Snippet
```java
    );
    final List<SimpleProperty> properties = SimpleUtil.findProperties(project, possibleProperties);
    if (properties.size() > 0) {
      // Add the property to a collection of line marker info
      NavigationGutterIconBuilder<PsiElement> builder =
```

### SizeReplaceableByIsEmpty
`property.getKey().length() > 0` can be replaced with '!property.getKey().isEmpty()'
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleReference.java`
#### Snippet
```java
    List<LookupElement> variants = new ArrayList<>();
    for (final SimpleProperty property : properties) {
      if (property.getKey() != null && property.getKey().length() > 0) {
        variants.add(LookupElementBuilder
                .create(property).withIcon(SimpleIcons.FILE)
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `modified |= mySettingsComponent.getIdeaUserStatus() != settings.ideaStatus`
in `code_samples/settings/src/main/java/org/intellij/sdk/settings/AppSettingsConfigurable.java`
#### Snippet
```java
    AppSettingsState settings = AppSettingsState.getInstance();
    boolean modified = !mySettingsComponent.getUserNameText().equals(settings.userId);
    modified |= mySettingsComponent.getIdeaUserStatus() != settings.ideaStatus;
    return modified;
  }
```

## RuleId[id=RedundantEscapeInRegexReplacement]
### RedundantEscapeInRegexReplacement
Redundant escape of 'n'
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleFoldingBuilder.java`
#### Snippet
```java
      // IMPORTANT: Convert embedded \n to backslash n, so that the string will look
      // like it has LF embedded in it and embedded " to escaped "
      return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
    }
    return retTxt;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `code_samples/editor_basics/src/main/java/org/intellij/sdk/editor/EditorAreaIllustration.java`
#### Snippet
```java
    int caretOffset = primaryCaret.getOffset();
    // Build and display the caret report.
    String report = logicalPos.toString() + "\n" + visualPos.toString() + "\n" +
            "Offset: " + caretOffset;
    Messages.showInfoMessage(report, "Caret Parameters Inside The Editor");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `code_samples/editor_basics/src/main/java/org/intellij/sdk/editor/EditorAreaIllustration.java`
#### Snippet
```java
    int caretOffset = primaryCaret.getOffset();
    // Build and display the caret report.
    String report = logicalPos.toString() + "\n" + visualPos.toString() + "\n" +
            "Offset: " + caretOffset;
    Messages.showInfoMessage(report, "Caret Parameters Inside The Editor");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `code_samples/action_basics/src/main/java/org/intellij/sdk/action/PopupDialogAction.java`
#### Snippet
```java
    Navigatable nav = event.getData(CommonDataKeys.NAVIGATABLE);
    if (nav != null) {
      dlgMsg.append(String.format("\nSelected Element: %s", nav.toString()));
    }
    Messages.showMessageDialog(currentProject, dlgMsg.toString(), dlgTitle, Messages.getInformationIcon());
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `code_samples/project_model/src/main/java/org/intellij/sdk/project/model/ShowSourceRootsActions.java`
#### Snippet
```java
    }
    Messages.showInfoMessage(
            "Source roots for the " + projectName + " plugin:\n" + sourceRootsList.toString(),
            "Project Properties"
    );
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `code_samples/project_model/src/main/java/org/intellij/sdk/project/model/LibrariesAction.java`
#### Snippet
```java
      String fileAndLibs;
      if (jars.length() > 0) {
        fileAndLibs = virtualFile.getName() + ": " + jars.toString();
      } else {
        fileAndLibs = "None";
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `code_samples/max_opened_projects/src/main/java/org/intellij/sdk/maxOpenProjects/ProjectCountingService.java`
#### Snippet
```java
   * Sets the maximum allowed number of opened projects.
   */
  private final static int MAX_OPEN_PRJ_LIMIT = 3;

  /**
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/parser/SimpleParser.java`
#### Snippet
```java

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SimpleParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `createWizardSteps()` only delegates to its super method
in `code_samples/module/src/main/java/org/intellij/sdk/module/DemoModuleType.java`
#### Snippet
```java

  @Override
  public ModuleWizardStep @NotNull [] createWizardSteps(@NotNull WizardContext wizardContext,
                                                        @NotNull DemoModuleBuilder moduleBuilder,
                                                        @NotNull ModulesProvider modulesProvider) {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replaceFirst()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleUtil.java`
#### Snippet
```java
    while (element instanceof PsiComment || element instanceof PsiWhiteSpace) {
      if (element instanceof PsiComment) {
        String commentText = element.getText().replaceFirst("[!# ]+", "");
        result.add(commentText);
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleFoldingBuilder.java`
#### Snippet
```java
      // IMPORTANT: Convert embedded \n to backslash n, so that the string will look
      // like it has LF embedded in it and embedded " to escaped "
      return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
    }
    return retTxt;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleFoldingBuilder.java`
#### Snippet
```java
      // IMPORTANT: Convert embedded \n to backslash n, so that the string will look
      // like it has LF embedded in it and embedded " to escaped "
      return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
    }
    return retTxt;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/psi/impl/SimplePsiImplUtil.java`
#### Snippet
```java
    if (keyNode != null) {
      // IMPORTANT: Convert embedded escaped spaces to simple spaces
      return keyNode.getText().replaceAll("\\\\ ", " ");
    } else {
      return null;
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleCreatePropertyQuickFix.java`
#### Snippet
```java
      }
      // IMPORTANT: change spaces to escaped spaces or the new node will only have the first word for the key
      SimpleProperty property = SimpleElementFactory.createProperty(project, key.replaceAll(" ", "\\\\ "), "");
      simpleFile.getNode().addChild(property.getNode());
      ((Navigatable) property.getLastChild().getNavigationElement()).navigate(true);
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `javax.swing` is unnecessary, and can be replaced with an import
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
  @NotNull
  @Override
  public javax.swing.Icon getIcon() {
    return AllIcons.FileTypes.Custom;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
   * @param   in  the java.io.Reader to read input from.
   */
  SimpleLexer(java.io.Reader in) {
    this.zzReader = in;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];
```

### NestedAssignment
Result of assignment expression used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];
```

### NestedAssignment
Result of assignment expression used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
```

### NestedAssignment
Result of assignment expression used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectNode.java`
#### Snippet
```java

    } catch (Throwable throwable) {
      throwable.printStackTrace();
    }
  }
```

## RuleId[id=DialogTitleCapitalization]
### DialogTitleCapitalization
The sentence capitalization is provided where title capitalization is required
in `code_samples/action_basics/src/main/java/org/intellij/sdk/action/PopupDialogAction.java`
#### Snippet
```java
    Project currentProject = event.getProject();
    StringBuilder dlgMsg = new StringBuilder(event.getPresentation().getText() + " Selected!");
    String dlgTitle = event.getPresentation().getDescription();
    // If an element is selected in the editor, add info about it.
    Navigatable nav = event.getData(CommonDataKeys.NAVIGATABLE);
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `SimpleNamedElementImpl()` of an abstract class should not be declared 'public'
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/psi/impl/SimpleNamedElementImpl.java`
#### Snippet
```java
public abstract class SimpleNamedElementImpl extends ASTWrapperPsiElement implements SimpleNamedElement {

  public SimpleNamedElementImpl(@NotNull ASTNode node) {
    super(node);
  }
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `code_samples/settings/src/main/java/org/intellij/sdk/settings/AppSettingsState.java`
#### Snippet
```java

  public String userId = "John Q. Public";
  public boolean ideaStatus = false;

  public static AppSettingsState getInstance() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `code_samples/max_opened_projects/src/main/java/org/intellij/sdk/maxOpenProjects/ProjectCountingService.java`
#### Snippet
```java
   * The count of open projects must always be >= 0.
   */
  private int myOpenProjectCount = 0;

  public void incrProjectCount() {
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `b`
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/parser/SimpleParser.java`
#### Snippet
```java
  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `IntentionAction`
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java
 */
@NonNls
public class ConditionalOperatorConverter extends PsiElementBaseIntentionAction implements IntentionAction {

  /**
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `code_samples/project_view_pane/src/main/java/org/intellij/sdk/view/pane/ImagesProjectViewPane.java`
#### Snippet
```java
  @Override
  protected BaseProjectTreeBuilder createBuilder(@NotNull DefaultTreeModel treeModel) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
```

### ReturnNull
Return of `null`
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/psi/impl/SimplePsiImplUtil.java`
#### Snippet
```java
      return keyNode.getText().replaceAll("\\\\ ", " ");
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/psi/impl/SimplePsiImplUtil.java`
#### Snippet
```java
      return keyNode.getPsi();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/psi/impl/SimplePsiImplUtil.java`
#### Snippet
```java
      return valueNode.getText();
    } else {
      return null;
    }
  }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `zzTransL` is redundant
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;
```

### UnnecessaryLocalVariable
Local variable `zzRowMapL` is redundant
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `code_samples/simple_language_plugin/src/main/java/org/intellij/sdk/language/SimpleStructureViewElement.java`
#### Snippet
```java
        treeElements.add(new SimpleStructureViewElement((SimplePropertyImpl) property));
      }
      return treeElements.toArray(new TreeElement[0]);
    }
    return EMPTY_ARRAY;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
The value `zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result)` assigned to `offset` is never used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
    int [] result = new int[170];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }
```

### UnusedAssignment
The value `zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result)` assigned to `offset` is never used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
    int [] result = new int[21];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }
```

### UnusedAssignment
The value `zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result)` assigned to `offset` is never used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
    int [] result = new int[21];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }
```

### UnusedAssignment
The value `zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result)` assigned to `offset` is never used
in `code_samples/simple_language_plugin/src/main/gen/org/intellij/sdk/language/SimpleLexer.java`
#### Snippet
```java
    int [] result = new int[21];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }
```

### UnusedAssignment
The value `(PsiIfStatement) originalStatement.replace(newIfStmt)` assigned to `newIfStmt` is never used
in `code_samples/conditional_operator_intention/src/main/java/org/intellij/sdk/intention/ConditionalOperatorConverter.java`
#### Snippet
```java

    // Replace the entire original statement with the new IF
    newIfStmt = (PsiIfStatement) originalStatement.replace(newIfStmt);
  }

```

