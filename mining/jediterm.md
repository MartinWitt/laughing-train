# jediterm 
 
# Bad smells
I found 940 bad smells with 89 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 120 | false |
| AssignmentToMethodParameter | 80 | false |
| RedundantFieldInitialization | 61 | false |
| RedundantSuppression | 58 | false |
| ReturnNull | 46 | false |
| NonSerializableFieldInSerializableClass | 35 | false |
| UtilityClassWithoutPrivateConstructor | 33 | true |
| SizeReplaceableByIsEmpty | 26 | true |
| MissortedModifiers | 24 | false |
| NestedAssignment | 23 | false |
| EmptyMethod | 23 | false |
| UnnecessaryUnboxing | 21 | false |
| SuspiciousNameCombination | 20 | false |
| UnnecessaryFullyQualifiedName | 20 | false |
| ConstantValue | 19 | false |
| Convert2Lambda | 16 | false |
| PatternVariableCanBeUsed | 15 | false |
| DynamicRegexReplaceableByCompiledPattern | 14 | false |
| Anonymous2MethodRef | 14 | false |
| CommentedOutCode | 13 | false |
| EnhancedSwitchMigration | 13 | false |
| UnnecessaryBoxing | 13 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 12 | false |
| MissingDeprecatedAnnotation | 11 | false |
| MarkedForRemoval | 10 | false |
| RegExpRedundantEscape | 10 | false |
| DataFlowIssue | 10 | false |
| NonProtectedConstructorInAbstractClass | 9 | true |
| AbstractClassNeverImplemented | 9 | false |
| NullableProblems | 8 | false |
| UNUSED_IMPORT | 7 | false |
| ArrayEquality | 7 | false |
| EmptyStatementBody | 6 | false |
| Convert2MethodRef | 6 | false |
| ManualMinMaxCalculation | 5 | false |
| CodeBlock2Expr | 5 | true |
| UnnecessaryToStringCall | 5 | true |
| RedundantMethodOverride | 4 | false |
| UnusedAssignment | 4 | false |
| UseCompareMethod | 4 | false |
| RedundantImplements | 4 | false |
| ZeroLengthArrayInitialization | 4 | false |
| DeprecatedIsStillUsed | 4 | false |
| AssignmentToForLoopParameter | 4 | false |
| ToArrayCallWithZeroLengthArrayArgument | 3 | true |
| SynchronizeOnThis | 3 | false |
| UnnecessarySemicolon | 3 | false |
| StringOperationCanBeSimplified | 3 | false |
| SwitchStatementWithConfusingDeclaration | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| StaticCallOnSubclass | 3 | false |
| DuplicateBranchesInSwitch | 3 | false |
| UnnecessaryReturn | 3 | true |
| CatchMayIgnoreException | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| StaticInitializerReferencesSubClass | 2 | false |
| UnnecessaryQualifierForThis | 2 | false |
| TrivialStringConcatenation | 2 | false |
| ReplaceAssignmentWithOperatorAssignment | 2 | false |
| StringRepeatCanBeUsed | 2 | false |
| ObsoleteCollection | 2 | false |
| InstanceofIncompatibleInterface | 2 | false |
| UnnecessarySuperQualifier | 2 | false |
| SynchronizeOnNonFinalField | 2 | false |
| ClassNameSameAsAncestorName | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| CanBeParameter | 1 | false |
| EqualsAndHashcode | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| UnnecessaryInitCause | 1 | false |
| CharsetObjectCanBeUsed | 1 | false |
| SamePackageImport | 1 | false |
| WaitNotInLoop | 1 | false |
| PointlessBooleanExpression | 1 | true |
| UseBulkOperation | 1 | false |
| UsePropertyAccessSyntax | 1 | false |
| StringEquality | 1 | false |
| SuspiciousSystemArraycopy | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| RefusedBequest | 1 | false |
| NonShortCircuitBoolean | 1 | false |
| CollectionAddedToSelf | 1 | false |
| IfStatementMissingBreakInLoop | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| PrivatePropertyName | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| StringBufferReplaceableByStringBuilder | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| FieldMayBeStatic | 1 | false |
| MissingSerialAnnotation | 1 | false |
| RedundantCollectionOperation | 1 | false |
| StringEqualsEmptyString | 1 | false |
| RegExpSingleCharAlternation | 1 | false |
| Java8MapApi | 1 | false |
| ThreadStartInConstruction | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new ObjectNode\[children.size()\]'
in `JediTerm/src/main/java/com/intellij/openapi/util/objectTree/ObjectNode.java`
#### Snippet
```java
    List<ObjectNode<T>> children = myChildren;
    if (children == null || children.isEmpty()) return EMPTY_ARRAY;
    return children.toArray(new ObjectNode[children.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Object\[collection.size()\]'
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
    if (collection.isEmpty()) return EMPTY_OBJECT_ARRAY;
    //noinspection SSBasedInspection
    return collection.toArray(new Object[collection.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new List\[lists.size()\]'
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <T> List<T> concat(@NotNull final List<List<? extends T>> lists) {
    @SuppressWarnings("unchecked") List<? extends T>[] array = lists.toArray(new List[lists.size()]);
    return concat(array);
  }
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'com.jediterm.terminal.Questioner' is deprecated and marked for removal
in `ui/src/com/jediterm/terminal/ui/PreConnectHandler.java`
#### Snippet
```java
package com.jediterm.terminal.ui;

import com.jediterm.terminal.Questioner;
import com.jediterm.terminal.Terminal;

```

### MarkedForRemoval
'Integer(java.lang.String)' is deprecated and marked for removal
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
      else {
```

### MarkedForRemoval
'Integer(java.lang.String)' is deprecated and marked for removal
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
      else {
```

### MarkedForRemoval
'Float(float)' is deprecated and marked for removal
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
    float oldProportion = myProportion;
    myProportion = proportion;
    firePropertyChange(PROP_PROPORTION, new Float(oldProportion), new Float(myProportion));
    revalidate();
    repaint();
```

### MarkedForRemoval
'Float(float)' is deprecated and marked for removal
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
    float oldProportion = myProportion;
    myProportion = proportion;
    firePropertyChange(PROP_PROPORTION, new Float(oldProportion), new Float(myProportion));
    revalidate();
    repaint();
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
    private static final MySecurityManager INSTANCE = new MySecurityManager();
    public Class[] getStack() {
      return getClassContext();
    }
  }
```

### MarkedForRemoval
'java.lang.SecurityManager' is deprecated and marked for removal
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java


  private static class MySecurityManager extends SecurityManager {
    private static final MySecurityManager INSTANCE = new MySecurityManager();
    public Class[] getStack() {
```

### MarkedForRemoval
'Integer(java.lang.String)' is deprecated and marked for removal
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
      else {
```

### MarkedForRemoval
'Integer(java.lang.String)' is deprecated and marked for removal
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
      else {
```

### MarkedForRemoval
'Integer(java.lang.String)' is deprecated and marked for removal
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
        int cmp;
        if (p.matches("\\d+")) {
          cmp = new Integer(p).compareTo(0);
        }
        else {
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`while` statement has empty body
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
      /* Look for first character. */
      if (!charsEqualIgnoreCase(where.charAt(i), first)) {
        while (++i <= max && !charsEqualIgnoreCase(where.charAt(i), first)) ;
      }

```

### EmptyStatementBody
`for` statement has empty body
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
        int j = i + 1;
        int end = j + targetCount - 1;
        for (int k = 1; j < end && charsEqualIgnoreCase(where.charAt(j), what.charAt(k)); j++, k++) ;

        if (j == end) {
```

### EmptyStatementBody
`if` statement has empty body
in `JediTerm/src/main/java/com/intellij/util/concurrency/AppScheduledExecutorService.java`
#### Snippet
```java
    @Override
    protected void beforeExecute(Thread t, Runnable r) {
      if (LOG.isTraceEnabled()) {
      }
    }
```

### EmptyStatementBody
`if` statement has empty body
in `JediTerm/src/main/java/com/intellij/util/concurrency/AppScheduledExecutorService.java`
#### Snippet
```java
    @Override
    protected void afterExecute(Runnable r, Throwable t) {
      if (LOG.isTraceEnabled()) {
      }

```

### EmptyStatementBody
`while` statement has empty body
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      /* Look for first character. */
      if (!charsEqualIgnoreCase(where.charAt(i), first)) {
        while (++i <= max && !charsEqualIgnoreCase(where.charAt(i), first)) ;
      }

```

### EmptyStatementBody
`for` statement has empty body
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
        int j = i + 1;
        int end = j + targetCount - 1;
        for (int k = 1; j < end && charsEqualIgnoreCase(where.charAt(j), what.charAt(k)); j++, k++) ;

        if (j == end) {
```

## RuleId[id=StaticInitializerReferencesSubClass]
### StaticInitializerReferencesSubClass
Referencing subclass Rejected from superclass ActionCallback initializer might lead to class loading deadlock
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
public class ActionCallback  {
  public static final ActionCallback DONE = new Done();
  public static final ActionCallback REJECTED = new Rejected();

  private final ExecutionCallback myDone;
```

### StaticInitializerReferencesSubClass
Referencing subclass Done from superclass ActionCallback initializer might lead to class loading deadlock
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java

public class ActionCallback  {
  public static final ActionCallback DONE = new Done();
  public static final ActionCallback REJECTED = new Rejected();

```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `JediTerm/src/main/java/com/intellij/ui/components/OnOffButton.java`
#### Snippet
```java
        g.setPaint(new GradientPaint(h, 0, new JBColor(Gray._158, Gray._100), 0, h, new JBColor(Gray._210, Gray._100)));
        g.fillRoundRect(0, 0, h, h, 3, 3);
//        g.setColor(UIUtil.getBorderColor());
//        g.drawOval(0, 0, h, h);
      }
```

### CommentedOutCode
Commented out code (3 lines)
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
      and JNA
     */
        //private static boolean isAppleRetina (Graphics2D g2d) {
        //  return false;
        //}
```

### CommentedOutCode
Commented out code (4 lines)
in `core/src/com/jediterm/terminal/emulator/charset/CharacterSets.java`
#### Snippet
```java
    //TODO: verify that approach
    
    //else if (original >= GR_START && original <= GR_END) {
    //  int idx = original - GR_START;
    //  mappedChar = gr.map(original, idx);
```

### CommentedOutCode
Commented out code (3 lines)
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBEditorTabs.java`
#### Snippet
```java
    final Color tabColor = label.getInfo().getTabColor();
    final Composite oldComposite = g2d.getComposite();
    //if (label != getSelectedLabel()) {
    //  g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f));
    //}
```

### CommentedOutCode
Commented out code (25 lines)
in `JediTerm/src/main/java/com/intellij/util/ui/Gray.java`
#### Snippet
```java
  public static final Color TRANSPARENT = new Color(0,0,0,0);

  //public static void main(String[] args) {
  //  for (int i = 0; i < 256; i++) {
  //    System.out.println("public static final Gray _" + i + " = new Gray("+ i + ");");
```

### CommentedOutCode
Commented out code (3 lines)
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java

        final Composite oldComposite = ((Graphics2D) g).getComposite();
        //if (myTabs instanceof JBEditorTabs && !myTabs.isSingleRow() && myTabs.getSelectedInfo() != myInfo) {
        //  ((Graphics2D)g).setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.9f));
        //}
```

### CommentedOutCode
Commented out code (2 lines)
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/MacUtil.java`
#### Snippet
```java
        assert false: "Should be called from Event-Dispatch Thread only!";
        while (component.getClientProperty(key) == Boolean.TRUE) {
          // TODO:
          //wait();
        }
```

### CommentedOutCode
Commented out code (4 lines)
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java

      myGraphicSetState.resetState();
      //myGraphicSetState.designateGraphicSet(0, CharacterSet.ASCII);//Maps the ASCII character set into GL
      //mapCharsetToGL(0);
      //myGraphicSetState.designateGraphicSet(1, CharacterSet.DEC_SUPPLEMENTAL);
```

### CommentedOutCode
Commented out code (3 lines)
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    }

    //public static boolean isMacRetina(Graphics2D g) {
    //  return DetectRetinaKit.isMacRetina(g);
    //}
```

### CommentedOutCode
Commented out code (25 lines)
in `JediTerm/src/main/java/com/intellij/ui/Gray.java`
#### Snippet
```java
  public static final Color TRANSPARENT = new Color(0,0,0,0);

  //public static void main(String[] args) {
  //  for (int i = 0; i < 256; i++) {
  //    System.out.println("public static final Gray _" + i + " = new Gray("+ i + ");");
```

### CommentedOutCode
Commented out code (4 lines)
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
      if (!font.canDisplay(c)) {
//          TODO
//        for (SuitableFontProvider provider : SuitableFontProvider.EP_NAME.getExtensions()) {
//          font = provider.getFontAbleToDisplay(c, basefont.getSize(), basefont.getStyle(), basefont.getFamily());
//          if (font != null) break;
```

### CommentedOutCode
Commented out code (3 lines)
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabsSideSplitter.java`
#### Snippet
```java
  public void propertyChange(PropertyChangeEvent evt) {
    if (evt.getSource() != myTabs) return;
//    Integer limit = UIUtil.getClientProperty(myTabs, JBTabsImpl.SIDE_TABS_SIZE_LIMIT_KEY);
//    if (limit == null) limit = JBTabsImpl.DEFAULT_MAX_TAB_WIDTH;
//    setSideTabsLimit(limit);
```

### CommentedOutCode
Commented out code (4 lines)
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/table/TableLayout.java`
#### Snippet
```java
    }

    //for (TableRow eachMove : toMove) {
    //  data.table.remove(eachMove);
    //  data.table.add(0, eachMove);
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
    }

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
    }

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

    int idx = 0;
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

    int idx = 0;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static String formatLinks(@NotNull String message) {
    Pattern linkPattern = Pattern.compile("http://[a-zA-Z0-9\\./\\-\\+]+");
    StringBuffer result = new StringBuffer();
    Matcher m = linkPattern.matcher(message);
```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static String formatLinks(@NotNull String message) {
    Pattern linkPattern = Pattern.compile("http://[a-zA-Z0-9\\./\\-\\+]+");
    StringBuffer result = new StringBuffer();
    Matcher m = linkPattern.matcher(message);
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    }

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    }

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

    int idx = 0;
```

### RegExpRedundantEscape
Redundant character escape `\\_` in RegExp
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

    int idx = 0;
```

## RuleId[id=UnnecessaryQualifierForThis]
### UnnecessaryQualifierForThis
Qualifier `TerminalPanel` on 'this' is unnecessary in this context
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    int textLength = CharUtils.getTextLengthDoubleWidthAware(buf.getBuf(), buf.getStart(), buf.length(), mySettingsProvider.ambiguousCharsAreDoubleWidth());
    int height = Math.min(myCharSize.height - (includeSpaceBetweenLines ? 0 : mySpaceBetweenLines), getHeight() - yCoord);
    int width = Math.min(textLength * TerminalPanel.this.myCharSize.width, TerminalPanel.this.getWidth() - xCoord);

    if (style instanceof HyperlinkStyle) {
```

### UnnecessaryQualifierForThis
Qualifier `TerminalPanel` on 'this' is unnecessary in this context
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    int textLength = CharUtils.getTextLengthDoubleWidthAware(buf.getBuf(), buf.getStart(), buf.length(), mySettingsProvider.ambiguousCharsAreDoubleWidth());
    int height = Math.min(myCharSize.height - (includeSpaceBetweenLines ? 0 : mySpaceBetweenLines), getHeight() - yCoord);
    int width = Math.min(textLength * TerminalPanel.this.myCharSize.width, TerminalPanel.this.getWidth() - xCoord);

    if (style instanceof HyperlinkStyle) {
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`s.length() != 0` can be replaced with '!s.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtilRt.java`
#### Snippet
```java
  @Contract(pure = true)
  public static boolean endsWithChar(@Nullable CharSequence s, char suffix) {
    return s != null && s.length() != 0 && s.charAt(s.length() - 1) == suffix;
  }

```

### SizeReplaceableByIsEmpty
`myTokens.size() == 0` can be replaced with 'myTokens.isEmpty()'
in `core/src/com/jediterm/terminal/SubstringFinder.java`
#### Snippet
```java

  public void nextChar(int x, int y, CharBuffer characters, int index) {
    if (myTokens.size() == 0 || myTokens.get(myTokens.size() - 1).buf != characters) {
      myTokens.add(new TextToken(x, y, characters));
    }
```

### SizeReplaceableByIsEmpty
`myAnswer.length() > 0` can be replaced with '!myAnswer.isEmpty()'
in `ui/src/com/jediterm/terminal/ui/PreConnectHandler.java`
#### Snippet
```java
      switch (e.getKeyCode()) {
        case KeyEvent.VK_BACK_SPACE:
          if (myAnswer.length() > 0) {
            myTerminal.backspace();
            myTerminal.eraseInLine(0);
```

### SizeReplaceableByIsEmpty
`data.toDrop.size() > 0` can be replaced with '!data.toDrop.isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java

  protected void layoutMoreButton(SingleRowPassInfo data) {
    if (data.toDrop.size() > 0) {
      data.moreRect = getStrategy().getMoreRect(data);
    }
```

### SizeReplaceableByIsEmpty
`myLastSingRowLayout.myVisibleInfos.size() == 0` can be replaced with 'myLastSingRowLayout.myVisibleInfos.isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java
        result =  index >= 0 && index < myLastSingRowLayout.myVisibleInfos.size() ? index : -1;
      } else {
        if (myLastSingRowLayout.myVisibleInfos.size() == 0) {
          result = 0;
        } else {
```

### SizeReplaceableByIsEmpty
`data.toLayout.size() > 0` can be replaced with '!data.toLayout.isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java
    data.tabRectangle = new Rectangle();

    if (data.toLayout.size() > 0) {
      final TabLabel firstLabel = myTabs.myInfo2Label.get(data.toLayout.get(0));
      final TabLabel lastLabel = findLastVisibleLabel(data);
```

### SizeReplaceableByIsEmpty
`data.toLayout.size() == 0` can be replaced with 'data.toLayout.isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java
    while (true) {
      if (data.requiredLength <= data.toFitLength - data.position) break;
      if (data.toLayout.size() == 0) break;

      final TabInfo first = data.toLayout.get(0);
```

### SizeReplaceableByIsEmpty
`visibleInfos.size() > 0` can be replaced with '!visibleInfos.isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/ScrollableSingleRowLayout.java`
#### Snippet
```java
    if (myLastSingRowLayout != null) {
      final List<TabInfo> visibleInfos = myLastSingRowLayout.myVisibleInfos;
      if (visibleInfos.size() > 0) {
        final TabInfo info = visibleInfos.get(0);
        return getStrategy().getScrollUnitIncrement(myTabs.myInfo2Label.get(info));
```

### SizeReplaceableByIsEmpty
`pattern.length() == 0` can be replaced with 'pattern.isEmpty()'
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java

  public SubstringFinder.FindResult searchInTerminalTextBuffer(@NotNull String pattern, boolean ignoreCase) {
    if (pattern.length() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`myVisibleInfos.size() > 0` can be replaced with '!myVisibleInfos.isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        Dimension size = new Dimension();
        TabInfo tabInfo = getSelectedInfo();
        if (tabInfo == null && myVisibleInfos.size() > 0) {
            tabInfo = myVisibleInfos.get(0);
        }
```

### SizeReplaceableByIsEmpty
`rows.size() > 0` can be replaced with '!rows.isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/table/TableLayout.java`
#### Snippet
```java
    if (info == null) return false;
    List<TableRow> rows = myLastTableLayout.table;
    if (rows.size() > 0) {
      for (TabInfo tabInfo : rows.get(rows.size() - 1).myColumns) {
        if (tabInfo == info) return true;
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
        }

        if (sb.length() > 0) {
          myTerminalStarter.sendString(sb.toString(), true);
        }
```

### SizeReplaceableByIsEmpty
`myInputMethodUncommittedChars.length() > 0` can be replaced with '!myInputMethodUncommittedChars.isEmpty()'
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  private boolean hasUncommittedChars() {
    return myInputMethodUncommittedChars != null && myInputMethodUncommittedChars.length() > 0;
  }

```

### SizeReplaceableByIsEmpty
`selectionText.length() != 0` can be replaced with '!selectionText.isEmpty()'
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    }
    String selectionText = SelectionUtil.getSelectionText(selectionStart, selectionEnd, myTerminalTextBuffer);
    if (selectionText.length() != 0) {
      myCopyPasteHandler.setContents(selectionText, useSystemSelectionClipboardIfAvailable);
    }
```

### SizeReplaceableByIsEmpty
`sb.length() > 0` can be replaced with '!sb.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      remainder = count % multiplier;
      count /= multiplier;
      if (partSeparator != null && (remainder != 0 || sb.length() > 0)) {
        sb.insert(0, units[i]).insert(0, remainder).insert(0, partSeparator);
      }
```

### SizeReplaceableByIsEmpty
`result.length() == 0` can be replaced with 'result.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      final char ch = name.charAt(i);
      if (Character.isJavaIdentifierPart(ch)) {
        if (result.length() == 0 && !Character.isJavaIdentifierStart(ch)) {
          result.append("_");
        }
```

### SizeReplaceableByIsEmpty
`builder.length() > 0` can be replaced with '!builder.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      final char c = s.charAt(i);
      if (c == separator && !inQuotes) {
        if (builder.length() > 0) {
          result.add(builder.toString());
          builder.setLength(0);
```

### SizeReplaceableByIsEmpty
`builder.length() > 0` can be replaced with '!builder.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    }

    if (builder.length() > 0) {
      result.add(builder.toString());
    }
```

### SizeReplaceableByIsEmpty
`s.length() != 0` can be replaced with '!s.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static boolean startsWithChar(@Nullable CharSequence s, char prefix) {
    return s != null && s.length() != 0 && s.charAt(0) == prefix;
  }

```

### SizeReplaceableByIsEmpty
`result.length() != 0` can be replaced with '!result.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      String string = f.fun(item);
      if (string != null && !string.isEmpty()) {
        if (result.length() != 0) result.append(separator);
        result.append(string);
      }
```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      result.append(item).append(separator);
    }
    if (result.length() > 0) {
      result.setLength(result.length() - separator.length());
    }
```

### SizeReplaceableByIsEmpty
`separator.length() == 0` can be replaced with 'separator.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  public static List<CharSequence> split(@NotNull CharSequence s, @NotNull CharSequence separator,
                                         boolean excludeSeparator, boolean excludeEmptyStrings) {
    if (separator.length() == 0) {
      return Collections.singletonList(s);
    }
```

### SizeReplaceableByIsEmpty
`token.length() != 0` can be replaced with '!token.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      final int nextPos = index + separator.length();
      CharSequence token = s.subSequence(pos, excludeSeparator ? index : nextPos);
      if (token.length() != 0 || !excludeEmptyStrings) {
        result.add(token);
      }
```

### SizeReplaceableByIsEmpty
`cs.length() == 0` can be replaced with 'cs.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(value = "null -> true",pure = true)
  public static boolean isEmpty(@Nullable CharSequence cs) {
    return cs == null || cs.length() == 0;
  }

```

### SizeReplaceableByIsEmpty
`out.length() > 0` can be replaced with '!out.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    while (tokenizer.hasMoreTokens()) {
      final String word = tokenizer.nextToken();
      if (!leaveOriginalDelims && out.length() > 0) {
        out.append(' ');
      }
```

### SizeReplaceableByIsEmpty
`myBuffer.length() > 0` can be replaced with '!myBuffer.isEmpty()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

    private void handleTag(HTML.Tag tag) {
      if (tag.breaksFlow() && myBuffer.length() > 0) {
        myBuffer.append(SystemProperties.getLineSeparator());
      }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
    LOG.assertTrue(childCount >= 1);
    if (childCount > 3) {
      throw new IllegalStateException("" + childCount);
    }
    LOG.assertTrue(childCount <= 3);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
        int cursorX = myCursor.getCoordX();
        Pair<Character, TextStyle> sc = myTerminalTextBuffer.getStyledCharAt(cursorX, cursorY);
        String cursorChar = "" + sc.first;
        if (Character.isHighSurrogate(sc.first)) {
          cursorChar += myTerminalTextBuffer.getStyledCharAt(cursorX + 1, cursorY).first;
```

## RuleId[id=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `core/src/com/jediterm/terminal/model/CharBuffer.java`
#### Snippet
```java
  private final int myLength;

  public CharBuffer(@NotNull char[] buf, int start, int length) {
    if (start + length > buf.length) {
      throw new IllegalArgumentException(String.format("Out ouf bounds %d+%d>%d", start, length, buf.length));
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `JediTerm/src/main/java/com/intellij/ui/tabs/UiDecorator.java`
#### Snippet
```java
    final Insets myLabelInsets;

    public UiDecoration(final Font labelFont, final Insets labelInsets) {
      myLabelFont = labelFont;
      myLabelInsets = labelInsets;
```

### NullableProblems
Constructor parameter for @Nullable field might be annotated @Nullable itself
in `JediTerm/src/main/java/com/intellij/ui/tabs/UiDecorator.java`
#### Snippet
```java
    final Insets myLabelInsets;

    public UiDecoration(final Font labelFont, final Insets labelInsets) {
      myLabelFont = labelFont;
      myLabelInsets = labelInsets;
```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/com/jediterm/terminal/StyledTextConsumer.java`
#### Snippet
```java
   *                 It can be different for different buffers, e.g. backBuffer starts from 0, textBuffer and scrollBuffer from -count
   */
  void consume(int x, int y, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);

  void consumeNul(int x, int y, int nulIndex, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);
```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/com/jediterm/terminal/StyledTextConsumer.java`
#### Snippet
```java
   *                 It can be different for different buffers, e.g. backBuffer starts from 0, textBuffer and scrollBuffer from -count
   */
  void consume(int x, int y, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);

  void consumeNul(int x, int y, int nulIndex, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);
```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/com/jediterm/terminal/StyledTextConsumer.java`
#### Snippet
```java
  void consume(int x, int y, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);

  void consumeNul(int x, int y, int nulIndex, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);

  void consumeQueue(int x, int y, int nulIndex, int startRow);
```

### NullableProblems
Overridden method parameters are not annotated
in `core/src/com/jediterm/terminal/StyledTextConsumer.java`
#### Snippet
```java
  void consume(int x, int y, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);

  void consumeNul(int x, int y, int nulIndex, @NotNull TextStyle style, @NotNull CharBuffer characters, int startRow);

  void consumeQueue(int x, int y, int nulIndex, int startRow);
```

### NullableProblems
Overridden method parameters are not annotated
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLayout.java`
#### Snippet
```java
  }

  public boolean isDragOut(@NotNull TabLabel tabLabel, int deltaX, int deltaY) {
    return Math.abs(deltaY) > tabLabel.getSize().height * getDragOutMultiplier();
  }
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
                            final GraphicsDevice device = env.getDefaultScreenDevice();
                            Integer scale = ReflectionUtil.getField(device.getClass(), device, int.class, "scale");
                            if (scale != null && scale.intValue() == 2) {
                                ourRetina.set(true);
                                return true;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `core/src/com/jediterm/terminal/emulator/charset/CharacterSet.java`
#### Snippet
```java
        if ( index >= 64 && index < 96 )
        {
          return ( ( Character )CharacterSets.DEC_SPECIAL_CHARS[index - 64][0] ).charValue();
        }
        return -1;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/Centerizer.java`
#### Snippet
```java
    final Couple<Integer> y = getFit(compSize.height, size.height);

    c.setBounds(x.first.intValue(), y.first.intValue(), x.second.intValue(), y.second.intValue());
  }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/Centerizer.java`
#### Snippet
```java
    final Couple<Integer> y = getFit(compSize.height, size.height);

    c.setBounds(x.first.intValue(), y.first.intValue(), x.second.intValue(), y.second.intValue());
  }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/Centerizer.java`
#### Snippet
```java
    final Couple<Integer> y = getFit(compSize.height, size.height);

    c.setBounds(x.first.intValue(), y.first.intValue(), x.second.intValue(), y.second.intValue());
  }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/Centerizer.java`
#### Snippet
```java
    final Couple<Integer> y = getFit(compSize.height, size.height);

    c.setBounds(x.first.intValue(), y.first.intValue(), x.second.intValue(), y.second.intValue());
  }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        }

        if (index.intValue() < 0) {
            index = 0;
        }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        }

        return index.intValue();
    }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        for (final TabInfo eachInfo : myInfo2Label.keySet()) {
            updateTab(() -> {
                changed.set(changed.get().booleanValue());
                return false;
            }, eachInfo);
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        }

        if (changed.get().booleanValue()) {
            if (validateNow) {
                validate();
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
            updateColor(tabInfo);
        } else if (TabInfo.ALERT_STATUS.equals(evt.getPropertyName())) {
            boolean start = ((Boolean) evt.getNewValue()).booleanValue();
            updateAttraction(tabInfo, start);
        } else if (TabInfo.TAB_ACTION_GROUP.equals(evt.getPropertyName())) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            // With forced scale, we derive font from a hard-coded value as we cannot be sure
            // the system font comes unscaled.
            font = font.deriveFont(DEF_SYSTEM_FONT_SIZE * forcedScale.floatValue());
        }
        ourSystemFontData = Pair.create(font.getName(), font.getSize());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        if (rootPane != null) {
            final Object isDialog = rootPane.getClientProperty("DIALOG_ROOT_PANE");
            return isDialog instanceof Boolean && ((Boolean) isDialog).booleanValue();
        }
        return false;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/ColorUtil.java`
#### Snippet
```java
    if (str.length() == 3) {
      return new Color(
        17 * Integer.valueOf(String.valueOf(str.charAt(0)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(1)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(2)), 16).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/ColorUtil.java`
#### Snippet
```java
      return new Color(
        17 * Integer.valueOf(String.valueOf(str.charAt(0)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(1)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(2)), 16).intValue());
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/ui/ColorUtil.java`
#### Snippet
```java
        17 * Integer.valueOf(String.valueOf(str.charAt(0)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(1)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(2)), 16).intValue());
    }
    else if (str.length() == 6) {
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `ui/src/com/jediterm/terminal/ui/UIUtil.java`
#### Snippet
```java
          Object scale = field.get(device);

          if (scale instanceof Integer && ((Integer)scale).intValue() == 2) {
            return true;
          }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
    int i = 0;
    for (Integer e : list) {
      ret[i++] = e.intValue();
    }
    return ret;
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/ColorUtil.java`
#### Snippet
```java
    if (str.length() == 3) {
      return new Color(
        17 * Integer.valueOf(String.valueOf(str.charAt(0)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(1)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(2)), 16).intValue());
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/ColorUtil.java`
#### Snippet
```java
      return new Color(
        17 * Integer.valueOf(String.valueOf(str.charAt(0)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(1)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(2)), 16).intValue());
    }
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `JediTerm/src/main/java/com/intellij/util/ui/ColorUtil.java`
#### Snippet
```java
        17 * Integer.valueOf(String.valueOf(str.charAt(0)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(1)), 16).intValue(),
        17 * Integer.valueOf(String.valueOf(str.charAt(2)), 16).intValue());
    }
    else if (str.length() == 6) {
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Builder` is the same as one of its superclass' names
in `core/src/com/jediterm/terminal/HyperlinkStyle.java`
#### Snippet
```java
  }

  public static class Builder extends TextStyle.Builder {

    @NotNull
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `paintComponent()` only delegates to its super method
in `JediTerm/src/main/java/com/intellij/ui/components/OnOffButton.java`
#### Snippet
```java

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
  }
```

### RedundantMethodOverride
Method `useSmallLabels()` is identical to its super method
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBEditorTabs.java`
#### Snippet
```java

  @Override
  public boolean useSmallLabels() {
    return false;
//    return UISettings.getInstance().USE_SMALL_LABELS_ON_TABS;
```

### RedundantMethodOverride
Method `createSingleRowLayout()` only delegates to its super method
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBEditorTabs.java`
#### Snippet
```java

  @Override
  protected SingleRowLayout createSingleRowLayout() {
    return super.createSingleRowLayout();
  }
```

### RedundantMethodOverride
Method `removeNotify()` only delegates to its super method
in `JediTerm/src/main/java/com/intellij/openapi/ui/OnePixelDivider.java`
#### Snippet
```java

  @Override
  public void removeNotify() {
    super.removeNotify();
  }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
myCycleDuration \* 1000: integer multiplication implicitly cast to long
in `JediTerm/src/main/java/com/intellij/util/ui/Animator.java`
#### Snippet
```java
          return "Scheduled "+Animator.this;
        }
      }, 0, myCycleDuration * 1000 / myTotalFrames, TimeUnit.MICROSECONDS);
    }
  }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.Collections;`
in `JediTerm/src/main/java/com/intellij/ui/components/JBLabel.java`
#### Snippet
```java
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Collections;

public class JBLabel extends JLabel implements AnchorableComponent {
```

### UNUSED_IMPORT
Unused import `import org.intellij.lang.annotations.JdkConstants;`
in `JediTerm/src/main/java/com/intellij/ui/components/JBTabbedPane.java`
#### Snippet
```java
import com.intellij.ui.JBColor;
import com.intellij.util.ui.UIUtil;
import org.intellij.lang.annotations.JdkConstants;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.InvocationTargetException;`
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/MacUtil.java`
#### Snippet
```java
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
```

### UNUSED_IMPORT
Unused import `import java.lang.reflect.Method;`
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/MacUtil.java`
#### Snippet
```java
import java.awt.event.KeyEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

```

### UNUSED_IMPORT
Unused import `import com.intellij.openapi.util.registry.Registry;`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLayout.java`
#### Snippet
```java
package com.intellij.ui.tabs.impl;

import com.intellij.openapi.util.registry.Registry;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import com.intellij.util.ui.UIUtil;`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabsSideSplitter.java`
#### Snippet
```java
import com.intellij.ui.tabs.JBTabsPosition;
import com.intellij.ui.tabs.TabInfo;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import java.lang.annotation.Annotation;`
in `JediTerm/src/main/java/com/intellij/util/ui/ColorUtil.java`
#### Snippet
```java

import java.awt.*;
import java.lang.annotation.Annotation;

/**
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`i = i + step` could be simplified to 'i += step'
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
          LOG.warn("Unknown character attribute:" + arg);
      }
      i = i + step;
    }
    return builder.build();
```

### ReplaceAssignmentWithOperatorAssignment
`text = text + new CharBuffer(CharUtils.NUL_CHAR, myTerminalTextBuffer.getWidth() - text.length())` could be simplified to 'text += new CharBuffer(CharUtils.NUL_CHAR, myTerminalTextBuffer.getWidth() - text.length())'
in `core/src/com/jediterm/terminal/model/hyperlinks/TextProcessing.java`
#### Snippet
```java
      String text = buffer.getLine(i).getText();
      if (i < updatedLineInd && text.length() < myTerminalTextBuffer.getWidth()) {
        text = text + new CharBuffer(CharUtils.NUL_CHAR, myTerminalTextBuffer.getWidth() - text.length());
      }
      result.append(text);
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `ui/src/com/jediterm/terminal/debug/ControlSequenceVisualizer.java`
#### Snippet
```java
    String lastNum = null;
    String line;
    while ((line = in.readLine()) != null) {
      if (!line.startsWith("&") && !line.startsWith("\"")) {
        lastNum = String.format("%3d ", i++);
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
          g.setStroke(THIN_STROKE);
          while (dx < width) {
            path.lineTo(dx += period, upper);
            path.lineTo(dx += period, lower);
          }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
          while (dx < width) {
            path.lineTo(dx += period, upper);
            path.lineTo(dx += period, lower);
          }
        }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
          double center = (upper + lower) / 2;
          while (dx < width) {
            path.quadTo(prev += size, lower, dx += size, center);
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
          double center = (upper + lower) / 2;
          while (dx < width) {
            path.quadTo(prev += size, lower, dx += size, center);
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
          while (dx < width) {
            path.quadTo(prev += size, lower, dx += size, center);
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
            path.quadTo(prev += size, lower, dx += size, lower);
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
          while (dx < width) {
            path.quadTo(prev += size, lower, dx += size, center);
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
            path.quadTo(prev += size, lower, dx += size, lower);
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
            path.quadTo(prev += size, lower, dx += size, center);
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
            path.quadTo(prev += size, lower, dx += size, lower);
          }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
            path.quadTo(prev += size, lower, dx += size, center);
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
            path.quadTo(prev += size, lower, dx += size, lower);
          }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
            path.quadTo(prev += size, lower, dx += size, lower);
          }
        }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
            path.quadTo(prev += size, upper, dx += size, upper);
            path.quadTo(prev += size, upper, dx += size, center);
            path.quadTo(prev += size, lower, dx += size, lower);
          }
        }
```

### NestedAssignment
Result of assignment expression used
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
  private void completeResize() {
    CompletableFuture<Void> resizeFuture;
    while ((resizeFuture = myResizeFutureQueue.poll()) != null) {
      resizeFuture.complete(null);
    }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
                LookAndFeel laf = (LookAndFeel) cls.newInstance();
                if (laf.isSupportedLookAndFeel()) { // if gtk lib is available
                    return systemLaFClassName = name;
                }
            } catch (Exception ignore) {
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            }
        }
        return systemLaFClassName = UIManager.getSystemLookAndFeelClassName();
    }

```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/containers/ImmutableList.java`
#### Snippet
```java
        int i = cursor - 1;
        E previous = get(i);
        lastRet = cursor = i;
        return previous;
      }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/SmartList.java`
#### Snippet
```java
        }
        Object[] oldArray = array;
        myElem = array = new Object[newCapacity];
        System.arraycopy(oldArray, 0, array, 0, oldCapacity);
      }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/ui/tabs/TabInfo.java`
#### Snippet
```java
    SimpleTextAttributes attributes = myDefaultAttributes;
    if (attributes == null) {
      myDefaultAttributes = attributes = new SimpleTextAttributes(myDefaultStyle != -1 ? myDefaultStyle : SimpleTextAttributes.STYLE_PLAIN,
                                                     myDefaultForeground, myDefaultWaveColor);

    }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
    Type type;
    Class current = aClass;
    while ((type = resolveVariable(variable, current, false)) == null) {
      current = current.getSuperclass();
      if (current == null) {
```

### NestedAssignment
Result of assignment expression used
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    int endOffset;
    int startOffset = 0;
    while ((endOffset = iterator.next()) != BreakIterator.DONE) {
      endOffset = extendEndOffset(text, iterator, startOffset, endOffset);
      int effectiveEndOffset = shiftDwcToEnd(text, startOffset, endOffset);
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  private static void escapeChar(@NotNull final StringBuilder buf, final char character) {
    int idx = 0;
    while ((idx = indexOf(buf, character, idx)) >= 0) {
      buf.insert(idx, "\\");
      idx += 2;
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
    V value = result.get(key);
    if (value == null) {
      result.put(key, value = defaultValue);
    }
    return value;
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

    // Recursively sort non-partition-elements
    if ((s = b - a) > 1) quickSort(x, comparator, off, s);
    if ((s = d - c) > 1) quickSort(x, comparator, n - s, s);
  }
```

### NestedAssignment
Result of assignment expression used
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
    // Recursively sort non-partition-elements
    if ((s = b - a) > 1) quickSort(x, comparator, off, s);
    if ((s = d - c) > 1) quickSort(x, comparator, n - s, s);
  }

```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `toMove` are updated, but never queried
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/table/TableLayout.java`
#### Snippet
```java
    }

    List<TableRow> toMove = new ArrayList<>();
    for (int i = selectedRow + 1; i < data.table.size(); i++) {
      toMove.add(data.table.get(i));
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `myAnswer` is accessed in both synchronized and unsynchronized contexts
in `ui/src/com/jediterm/terminal/ui/PreConnectHandler.java`
#### Snippet
```java
  private final Object mySync = new Object();
  private final Terminal myTerminal;
  private StringBuffer myAnswer;
  private boolean myVisible;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myScreenBuffer` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java
  private LinesBuffer myHistoryBuffer;

  private LinesBuffer myScreenBuffer;

  private int myWidth;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myParent` is accessed in both synchronized and unsynchronized contexts
in `JediTerm/src/main/java/com/intellij/openapi/util/objectTree/ObjectNode.java`
#### Snippet
```java
  private final ObjectTree<T> myTree;

  private ObjectNode<T> myParent; // guarded by myTree.treeLock
  private final T myObject;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myChildren` is accessed in both synchronized and unsynchronized contexts
in `JediTerm/src/main/java/com/intellij/openapi/util/objectTree/ObjectNode.java`
#### Snippet
```java
  private final T myObject;

  private List<ObjectNode<T>> myChildren; // guarded by myTree.treeLock
  private final Throwable myTrace;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myTypeAheadLine` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java
  private boolean myWrapped = false;
  private final List<TerminalLineIntervalHighlighting> myCustomHighlightings = new ArrayList<>();
  TerminalLine myTypeAheadLine;

  public TerminalLine() {
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myTextEntries` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(TerminalLine.class);

  private TextEntries myTextEntries = new TextEntries();
  private boolean myWrapped = false;
  private final List<TerminalLineIntervalHighlighting> myCustomHighlightings = new ArrayList<>();
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `terminal` is accessed in both synchronized and unsynchronized contexts
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
    public static final String FIND = "FIND";

    private Component terminal;
    private Component scroll;
    private Component find;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `scroll` is accessed in both synchronized and unsynchronized contexts
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java

    private Component terminal;
    private Component scroll;
    private Component find;

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `find` is accessed in both synchronized and unsynchronized contexts
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
    private Component terminal;
    private Component scroll;
    private Component find;

    @Override
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `ourCurrentRunnableCount` is accessed in both synchronized and unsynchronized contexts
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java

  private static final Map<String, RunnableInfo> ourMainThreadRunnables = new HashMap<String, RunnableInfo>();
  private static long ourCurrentRunnableCount = 0;
  private static final Object RUNNABLE_LOCK = new Object();

```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myTabs` is accessed in both synchronized and unsynchronized contexts
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
  private T myTermWidget = null;

  private AbstractTabs<T> myTabs;

  private final TabbedSettingsProvider mySettingsProvider;
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `myLines` is accessed in both synchronized and unsynchronized contexts
in `core/src/com/jediterm/terminal/model/LinesBuffer.java`
#### Snippet
```java
  private int myBufferMaxLinesCount = DEFAULT_MAX_LINES_COUNT;

  private ArrayList<TerminalLine> myLines = new ArrayList<>();

  @Nullable
```

## RuleId[id=CanBeParameter]
### CanBeParameter
Constructor parameter is never used as a property
in `JediTerm/src/main/kotlin/com/jediterm/app/JediTerminalPanel.kt`
#### Snippet
```java


class JediTerminalPanel(private val mySettingsProvider: SettingsProvider,
                        styleState: StyleState,
                        backBuffer: TerminalTextBuffer) : TerminalPanel(mySettingsProvider, backBuffer, styleState), Disposable {
```

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `JediTerm/src/main/java/com/intellij/util/containers/Stack.java`
#### Snippet
```java
 * @author max
 */
public class Stack<T> extends ArrayList<T> {
  public Stack() { }

```

## RuleId[id=StringRepeatCanBeUsed]
### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java
        StringBuilder line = new StringBuilder(myScreenBuffer.getLine(row).getText());

        for (int i = line.length(); i < myWidth; i++) {
          line.append(' ');
        }
```

### StringRepeatCanBeUsed
Can be replaced with 'String.repeat()'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    assert count >= 0 : count;
    StringBuilder sb = new StringBuilder(s.length() * count);
    for (int i = 0; i < count; i++) {
      sb.append(s);
    }
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java
      @Override
      protected void doDispose() {
        synchronized (TerminalLine.this) {
          myCustomHighlightings.remove(this);
        }
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `JediTerm/src/main/java/com/intellij/openapi/util/ExecutionCallback.java`
#### Snippet
```java

    List<Runnable> all;
    synchronized (this) {
      if (myRunnables == null) {
        return true;
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `JediTerm/src/main/java/com/intellij/openapi/util/ExecutionCallback.java`
#### Snippet
```java
  void doWhenExecuted(@NotNull final Runnable runnable) {
    Runnable toRun;
    synchronized (this) {
      if (isExecuted()) {
        if (myRunnables == null) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `myHonorMinimumSize` initializer `false` is redundant
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
   */
  private boolean myVerticalSplit;
  private boolean myHonorMinimumSize = false;
  private final float myMinProp;
  private final float myMaxProp;
```

### UnusedAssignment
The value `255` assigned to `alpha` is never used
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
                }
            } else {
                alpha = 255;
                final Color tabColor = getActiveTabColor(null);
                final Color defaultBg = DrawUtil.isUnderDarcula() ? UIUtil.getControlColor() : Color.white;
```

### UnusedAssignment
Variable `scale` initializer `1f` is redundant
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        } catch (HeadlessException e) {
        }
        float scale = 1f;
        if (dpi < 120) scale = 1f;
        else if (dpi < 144) scale = 1.25f;
```

### UnusedAssignment
Variable `myMaxFPS` initializer `50` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private AtomicBoolean needRepaint = new AtomicBoolean(true);

  private int myMaxFPS = 50;
  private int myBlinkingPeriod = 500;
  private TerminalCoordinates myCoordsAccessor;
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'x' should probably not be returned from method 'getMaxY'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public int getMaxY() {
      return getShapeRect().x;
    }

```

### SuspiciousNameCombination
'left' should probably not be passed as parameter 'top'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.left, insets.top, insets.right, insets.bottom);
    }

```

### SuspiciousNameCombination
'top' should probably not be passed as parameter 'left'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.left, insets.top, insets.right, insets.bottom);
    }

```

### SuspiciousNameCombination
'right' should probably not be passed as parameter 'bottom'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.left, insets.top, insets.right, insets.bottom);
    }

```

### SuspiciousNameCombination
'bottom' should probably not be passed as parameter 'right'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.left, insets.top, insets.right, insets.bottom);
    }

```

### SuspiciousNameCombination
'right' should probably not be passed as parameter 'top'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.right, insets.top, insets.left, insets.bottom);
    }

```

### SuspiciousNameCombination
'top' should probably not be passed as parameter 'left'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.right, insets.top, insets.left, insets.bottom);
    }

```

### SuspiciousNameCombination
'left' should probably not be passed as parameter 'bottom'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.right, insets.top, insets.left, insets.bottom);
    }

```

### SuspiciousNameCombination
'bottom' should probably not be passed as parameter 'right'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Insets transformInsets(Insets insets) {
      return new Insets(insets.right, insets.top, insets.left, insets.bottom);
    }

```

### SuspiciousNameCombination
'y' should probably not be returned from method 'getX'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public int getX() {
      return getShapeRect().y;
    }

```

### SuspiciousNameCombination
'y1' should probably not be passed as parameter 'x1'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }
  }
```

### SuspiciousNameCombination
'x1' should probably not be passed as parameter 'y1'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }
  }
```

### SuspiciousNameCombination
'y2' should probably not be passed as parameter 'x2'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }
  }
```

### SuspiciousNameCombination
'x2' should probably not be passed as parameter 'y2'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }
  }
```

### SuspiciousNameCombination
'x' should probably not be returned from method 'getY'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public int getY() {
      return getShapeRect().x;
    }

```

### SuspiciousNameCombination
'y' should probably not be returned from method 'getX'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java

    public int getX() {
      return getShapeRect().y;
    }

```

### SuspiciousNameCombination
'y1' should probably not be passed as parameter 'x1'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }

```

### SuspiciousNameCombination
'x1' should probably not be passed as parameter 'y1'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }

```

### SuspiciousNameCombination
'y2' should probably not be passed as parameter 'x2'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }

```

### SuspiciousNameCombination
'x2' should probably not be passed as parameter 'y2'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/ShapeTransform.java`
#### Snippet
```java
    @Override
    public Line2D.Float transformLine(int x1, int y1, int x2, int y2) {
      return new Line2D.Float(y1, x1, y2, x2);
    }

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `core/src/com/jediterm/terminal/emulator/mouse/MouseMode.java`
#### Snippet
```java
  MOUSE_REPORTING_BUTTON_MOTION,
  MOUSE_REPORTING_ALL_MOTION,
  MOUSE_REPORTING_FOCUS;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/DefaultEditorTabsPainter.java`
#### Snippet
```java
                              int column,
                              boolean vertical) {
    ;
    g2d.setColor(tabColor != null ? tabColor : getDefaultTabColor());
    g2d.fillRect(x, y, w, h);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  public enum TerminalCursorState {
    SHOWING, HIDDEN, NO_FOCUS;
  }

```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    final StringBuilder sb = new StringBuilder(text.length());
    while (matcher.find()) {
      sb.append(text.substring(lastEnd, matcher.start()));
      final char c = (char)Integer.parseInt(matcher.group().substring(2), 16);
      sb.append(c);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      lastEnd = matcher.end();
    }
    sb.append(text.substring(lastEnd, text.length()));
    return sb.toString();
  }
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static String tail(@NotNull String s, final int idx) {
    return idx >= s.length() ? "" : s.substring(idx, s.length());
  }

```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `addKeyListener()` overrides synchronized method
in `ui/src/com/jediterm/terminal/ui/JediTermDefaultSearchComponent.java`
#### Snippet
```java

  @Override
  public void addKeyListener(@NotNull KeyListener listener) {
    myTextField.addKeyListener(listener);
  }
```

## RuleId[id=SwitchStatementWithConfusingDeclaration]
### SwitchStatementWithConfusingDeclaration
Local variable `command` declared in one 'switch' branch and used in another
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
        break;
      case 'P': // Device Control String (DCS)
        SystemCommandSequence command = new SystemCommandSequence(myDataStream);

        if (!deviceControlString(command)) {
```

### SwitchStatementWithConfusingDeclaration
Local variable `oldCursorX` declared in one 'switch' branch and used in another
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java
            && myIsShowingPredictions);
      case AltBackspace:
        int oldCursorX = newLineWCursorX.myCursorX;
        newLineWCursorX.moveToWordBoundary(false, myTerminalModel.getShellType());

```

### SwitchStatementWithConfusingDeclaration
Local variable `amount` declared in one 'switch' branch and used in another
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java
          return new HardBoundary();
        }
        int amount = oldCursorX - newLineWCursorX.myCursorX;

        if (newLineWCursorX.myCursorX < newLineWCursorX.myLineText.length()) {
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `myTypeAheadLine` accessed in synchronized context
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java
    int nulIndex = -1;
    TerminalLineIntervalHighlighting highlighting = myCustomHighlightings.stream().findFirst().orElse(null);
    TerminalLine typeAheadLine = myTypeAheadLine;
    TextEntries textEntries = typeAheadLine != null ? typeAheadLine.myTextEntries : myTextEntries;
    for (TextEntry te : textEntries) {
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
    }

    //noinspection Contract
    return value;
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/Disposer.java`
#### Snippet
```java
    @Override
    public void execute(@NotNull final Disposable each) {
      //noinspection SSBasedInspection
      each.dispose();
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/Pair.java`
#### Snippet
```java
  @NotNull
  @SuppressWarnings("MethodNamesDifferingOnlyByCase")
  public static <A, B> Pair<A, B> pair(A first, B second) {
    //noinspection DontUsePairConstructor
    return new Pair<A, B>(first, second);
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/Pair.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static final Pair EMPTY = create(null, null);

  @SuppressWarnings("unchecked")
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/RecursionGuard.java`
#### Snippet
```java
  @Deprecated
  @Nullable
  public <T> T doPreventingRecursion(@NotNull Object key, @NotNull Computable<T> computation) {
    return doPreventingRecursion(key, false, computation);
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java

@SuppressWarnings({"HardCodedStringLiteral", "UtilityClassWithoutPrivateConstructor", "UnusedDeclaration"})
public class SystemInfo extends SystemInfoRt {
    public static final String OS_NAME = SystemInfoRt.OS_NAME;
    public static final String OS_VERSION = SystemInfoRt.OS_VERSION;
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/objectTree/ObjectTree.java`
#### Snippet
```java

  @SuppressWarnings({"UseOfSystemOutOrSystemErr", "HardCodedStringLiteral"})
  public void assertIsEmpty(boolean throwError) {
    synchronized (treeLock) {
      for (T object : myRootObjects) {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
//TeamCity inherits StringUtil: do not add private constructors!!!
@SuppressWarnings({"UtilityClassWithoutPrivateConstructor", "MethodOverridesStaticMethodOfSuperclass"})
public class StringUtil extends StringUtilRt {
  @NonNls
  private static final String VOWELS = "aeiouy";
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(value = "null -> null; !null -> !null", pure = true)
  public static String toLowerCase(@Nullable final String str) {
    //noinspection ConstantConditions
    return str == null ? null : str.toLowerCase();
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtilRt.java`
#### Snippet
```java
 */
@SuppressWarnings({"UtilityClassWithoutPrivateConstructor"})
public class StringUtilRt {
  @Contract(pure = true)
  public static boolean charsEqualIgnoreCase(char a, char b) {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/Gray.java`
#### Snippet
```java
 */
@SuppressWarnings({"InspectionUsingGrayColors", "UnusedDeclaration"})
public class Gray extends Color {
  private Gray(int num) {
    super(num, num, num);
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/Gray.java`
#### Snippet
```java

  @SuppressWarnings("UseJBColor")
  public static final Color TRANSPARENT = new Color(0,0,0,0);

  //public static void main(String[] args) {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/JBColor.java`
#### Snippet
```java
 */
@SuppressWarnings("UseJBColor")
public class JBColor extends Color {

  private static volatile boolean DARK = DrawUtil.isUnderDarcula();
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/SimpleTextAttributes.java`
#### Snippet
```java
 */
@SuppressWarnings({"PointlessBitwiseExpression"})
public final class SimpleTextAttributes {

  @MagicConstant(flags = {STYLE_PLAIN, STYLE_BOLD, STYLE_ITALIC, STYLE_STRIKEOUT, STYLE_WAVED, STYLE_UNDERLINE, STYLE_BOLD_DOTTED_LINE, STYLE_SEARCH_MATCH, STYLE_SMALLER, STYLE_OPAQUE})
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/components/MultiColumnList.java`
#### Snippet
```java
    setCellSelectionEnabled(true);
    setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    //noinspection UndesirableClassUsage
    myList = new JList(model) {
      @Override
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/MacUtil.java`
#### Snippet
```java
    final long alpha = invoke(colorInSpace, "alphaComponent").longValue();
    final double realAlpha = alpha != 0 && (int)((alpha >> 52) & 0x7ffL) == 0 ? 1.0 : Double.longBitsToDouble(alpha);
    //noinspection UseJBColor
    return new Color((float)Double.longBitsToDouble(red),
                     (float)Double.longBitsToDouble(green),
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/DarculaEditorTabsPainter.java`
#### Snippet
```java
 */
@SuppressWarnings("UseJBColor")
class DarculaEditorTabsPainter extends DefaultEditorTabsPainter {

  @Override
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/DefaultEditorTabsPainter.java`
#### Snippet
```java
 */
@SuppressWarnings("UseJBColor")
public class DefaultEditorTabsPainter extends JBEditorTabsPainter {

  @Override
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/Alarm.java`
#### Snippet
```java

                        if (myThreadToUse == ThreadToUse.SWING_THREAD && !isEdt()) {
                            //noinspection SSBasedInspection
                            SwingUtilities.invokeLater(task);
                        } else {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  public static Object[] toObjectArray(@NotNull Collection<?> collection) {
    if (collection.isEmpty()) return EMPTY_OBJECT_ARRAY;
    //noinspection SSBasedInspection
    return collection.toArray(new Object[collection.size()]);
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ArrayUtilRt.java`
#### Snippet
```java
 */
@SuppressWarnings({"UtilityClassWithoutPrivateConstructor", "SSBasedInspection"})
public class ArrayUtilRt {
  public static final short[] EMPTY_SHORT_ARRAY = new short[0];
  public static final char[] EMPTY_CHAR_ARRAY = new char[0];
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ObjectUtils.java`
#### Snippet
```java
  @NotNull
  public static <T> T notNull(@Nullable T value) {
    //noinspection ConstantConditions
    return notNull(value, value);
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

@SuppressWarnings({"UtilityClassWithoutPrivateConstructor", "MethodOverridesStaticMethodOfSuperclass"})
public class ContainerUtil extends ContainerUtilRt {
  private static final int INSERTION_SORT_THRESHOLD = 10;
  private static final int DEFAULT_CONCURRENCY_LEVEL = Math.min(16, Runtime.getRuntime().availableProcessors());
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
 */
@SuppressWarnings("UtilityClassWithoutPrivateConstructor")
public class ContainerUtilRt {
  private static final int ARRAY_COPY_THRESHOLD = 20;

```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/AppleBoldDottedPainter.java`
#### Snippet
```java
      painter = new AppleBoldDottedPainter(color);
      // creating a new Color instance, as the one passed as parameter can be mutable (JBColor) and shouldn't be used as a map key
      //noinspection UseJBColor
      myPainters.put(new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()), painter);
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/Centerizer.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({"ConstantConditions"})
  public Dimension getPreferredSize() {
    return getComponent() != null ? getComponent().getPreferredSize() : super.getPreferredSize();
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/Centerizer.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({"ConstantConditions"})
  public Dimension getMinimumSize() {
    return getComponent() != null ? getComponent().getMinimumSize() : super.getPreferredSize();
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/Centerizer.java`
#### Snippet
```java
  @Override
  @SuppressWarnings({"ConstantConditions"})
  public Dimension getMaximumSize() {
    return getComponent() != null ? getComponent().getMaximumSize() : super.getPreferredSize();
  }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderDarcula() {
        return UIManager.getLookAndFeel().getName().contains("Darcula");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderIntelliJLaF() {
        return UIManager.getLookAndFeel().getName().contains("IntelliJ");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
            return RetinaImage.create(width, height, type);
        }
        //noinspection UndesirableClassUsage
        return new BufferedImage(width, height, type);
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
            return RetinaImage.create(width, height, type);
        }
        //noinspection UndesirableClassUsage
        return new BufferedImage(width, height, type);
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
            if (rect == null) rect = new Rectangle(size);

            //noinspection UndesirableClassUsage
            Image image = new BufferedImage(rect.width * 2, rect.height * 2, BufferedImage.TYPE_INT_RGB);
            Graphics2D imageGraphics = (Graphics2D) image.getGraphics();
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/GraphicsUtil.java`
#### Snippet
```java
public class GraphicsUtil {
  @SuppressWarnings("UndesirableClassUsage")
  private static final Graphics2D ourGraphics = new BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB).createGraphics();
  static {
    setupFractionalMetrics(ourGraphics);
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/GraphicsUtil.java`
#### Snippet
```java
      Graphics2D g = (Graphics2D)g2;
      Toolkit tk = Toolkit.getDefaultToolkit();
      //noinspection HardCodedStringLiteral
      Map map = (Map)tk.getDesktopProperty("awt.font.desktophints");

```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/Gray.java`
#### Snippet
```java
 */
@SuppressWarnings({"InspectionUsingGrayColors", "UnusedDeclaration"})
public class Gray extends Color {
  private Gray(int num) {
    super(num, num, num);
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/Gray.java`
#### Snippet
```java

  @SuppressWarnings("UseJBColor")
  public static final Color TRANSPARENT = new Color(0,0,0,0);

  //public static void main(String[] args) {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        if (isUnderNimbusLookAndFeel()) {
            final Color color = UIManager.getColor("List.background");
            //noinspection UseJBColor
            return new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderAlloyLookAndFeel() {
        return UIManager.getLookAndFeel().getName().contains("Alloy");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderAlloyIDEALookAndFeel() {
        return isUnderAlloyLookAndFeel() && UIManager.getLookAndFeel().getName().contains("IDEA");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderWindowsLookAndFeel() {
        return SystemInfo.isWindows && UIManager.getLookAndFeel().getName().equals("Windows");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderWindowsClassicLookAndFeel() {
        return UIManager.getLookAndFeel().getName().equals("Windows Classic");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderNimbusLookAndFeel() {
        return UIManager.getLookAndFeel().getName().contains("Nimbus");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderAquaLookAndFeel() {
        return SystemInfo.isMac && UIManager.getLookAndFeel().getName().contains("Mac OS X");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderJGoodiesLookAndFeel() {
        return UIManager.getLookAndFeel().getName().contains("JGoodies");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderAquaBasedLookAndFeel() {
        return SystemInfo.isMac && (isUnderAquaLookAndFeel() || isUnderDarcula() || isUnderIntelliJLaF());
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static boolean isUnderGTKLookAndFeel() {
        return SystemInfo.isXWindow && UIManager.getLookAndFeel().getName().contains("GTK");
    }
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    @SuppressWarnings({"HardCodedStringLiteral"})
    @Nullable
    public static String getGtkThemeName() {
        final LookAndFeel laf = UIManager.getLookAndFeel();
        if (laf != null && "GTKLookAndFeel".equals(laf.getClass().getSimpleName())) {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    public static Color shade(final Color c, final double factor, final double alphaFactor) {
        assert factor >= 0 : factor;
        //noinspection UseJBColor
        return new Color(
                Math.min((int) Math.round(c.getRed() * factor), 255),
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        assert 0 <= factor && factor <= 1.0 : factor;
        final double backFactor = 1.0 - factor;
        //noinspection UseJBColor
        return new Color(
                Math.min((int) Math.round(c1.getRed() * backFactor + c2.getRed() * factor), 255),
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        Graphics2D g2d = (Graphics2D) g;
        Toolkit tk = Toolkit.getDefaultToolkit();
        //noinspection HardCodedStringLiteral
        Map map = (Map) tk.getDesktopProperty("awt.font.desktophints");
        if (map != null) {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            // will have to set X server DPI to meet their display.
        } else if (SystemInfo.isWindows) {
            //noinspection HardCodedStringLiteral
            Font winFont = (Font) Toolkit.getDefaultToolkit().getDesktopProperty("win.messagebox.font");
            if (winFont != null) {
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @SuppressWarnings({"HardCodedStringLiteral"})
    public static void fixFormattedField(JFormattedTextField field) {
        if (SystemInfo.isMac) {
            final Toolkit toolkit = Toolkit.getDefaultToolkit();
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

        if (!newSize.equals(size)) {
            //noinspection SSBasedInspection
            SwingUtilities.invokeLater(new Runnable() {
                @Override
```

### RedundantSuppression
Redundant suppression
in `JediTerm/src/main/java/com/intellij/util/ui/WavePainter.java`
#### Snippet
```java
      painter = new WavePainter(color);
      // creating a new Color instance, as the one passed as parameter can be mutable (JBColor) and shouldn't be used as a map key
      //noinspection UseJBColor
      myPainters.put(new Color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()), painter);
    }
```

### RedundantSuppression
Redundant suppression
in `core/src/com/jediterm/terminal/Questioner.java`
#### Snippet
```java
@SuppressWarnings("DeprecatedIsStillUsed")
@Deprecated(forRemoval = true)
public interface Questioner {
  String questionVisible(String question, String defValue);

```

### RedundantSuppression
Redundant suppression
in `core/src/com/jediterm/terminal/util/Pair.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static final Pair EMPTY = create(null, null);

  @SuppressWarnings("unchecked")
```

### RedundantSuppression
Redundant suppression
in `ui/src/com/jediterm/terminal/ui/UIUtil.java`
#### Snippet
```java
    Graphics2D g2d = (Graphics2D)g;
    Toolkit tk = Toolkit.getDefaultToolkit();
    //noinspection HardCodedStringLiteral
    Map map = (Map)tk.getDesktopProperty("awt.font.desktophints");
    if (map != null) {
```

## RuleId[id=UnnecessaryInitCause]
### UnnecessaryInitCause
Unnecessary `Throwable.initCause()` call
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/DefaultLogger.java`
#### Snippet
```java

    AssertionError error = new AssertionError(message);
    error.initCause(t);
    throw error;
  }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_16LE can be used instead
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java
      }

      byte[] utf16Bytes = s.getBytes("UTF-16LE");
      return invoke(invoke(invoke("NSString", "alloc"), "initWithBytes:length:encoding:", utf16Bytes, utf16Bytes.length,
                    convertCFEncodingToNS(FoundationLibrary.kCFStringEncodingUTF16LE)), "autorelease");
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
    }

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

    int idx = 0;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java

      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java

      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        int htmlIndex = 6 + text.indexOf("<html>");
        if (htmlIndex < 6) {
            return text.replaceAll("\n", "<br>");
        }
        int htmlCloseIndex = text.indexOf("</html>", htmlIndex);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        assignMnemonic(text, action);

        text = text.replaceAll("&", "");
        action.putValue(Action.NAME, text);
    }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java

  private static String convertFragment(String fragment) {
    return StringUtil.escapeXml(fragment).replaceAll("\\\\n", "<br>");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  public static String stripHtml(@NotNull String html, boolean convertBreaks) {
    if (convertBreaks) {
      html = html.replaceAll("<br/?>", "\n\n");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    }

    return html.replaceAll("<(.|\n)*?>", "");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    }

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

```

### DynamicRegexReplaceableByCompiledPattern
`split()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

    String[] part1 = v1.split("[\\.\\_\\-]");
    String[] part2 = v2.split("[\\.\\_\\-]");

    int idx = 0;
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

      int cmp;
      if (p1.matches("\\d+") && p2.matches("\\d+")) {
        cmp = new Integer(p1).compareTo(new Integer(p2));
      }
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
        String p = parts[idx];
        int cmp;
        if (p.matches("\\d+")) {
          cmp = new Integer(p).compareTo(0);
        }
```

## RuleId[id=SamePackageImport]
### SamePackageImport
Unnecessary import from the same package `import com.intellij.ui.JBColor;`
in `JediTerm/src/main/java/com/intellij/ui/IdeBorderFactory.java`
#### Snippet
```java
import com.intellij.openapi.ui.RoundedLineBorder;
import com.intellij.openapi.ui.SideBorder;
import com.intellij.ui.JBColor;
import com.intellij.util.ui.JBInsets;
import org.intellij.lang.annotations.MagicConstant;
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Animator()` of an abstract class should not be declared 'public'
in `JediTerm/src/main/java/com/intellij/util/ui/Animator.java`
#### Snippet
```java
  private volatile boolean myDisposed;

  public Animator(@NonNls final String name,
                  final int totalFrames,
                  final int cycleDuration,
```

### NonProtectedConstructorInAbstractClass
Constructor `Animator()` of an abstract class should not be declared 'public'
in `JediTerm/src/main/java/com/intellij/util/ui/Animator.java`
#### Snippet
```java
  }

  public Animator(@NonNls final String name,
                  final int totalFrames,
                  final int cycleDuration,
```

### NonProtectedConstructorInAbstractClass
Constructor `DataStreamIteratingEmulator()` of an abstract class should not be declared 'public'
in `core/src/com/jediterm/terminal/DataStreamIteratingEmulator.java`
#### Snippet
```java
  private boolean myEof = false;

  public DataStreamIteratingEmulator(TerminalDataStream dataStream, Terminal terminal) {
    myDataStream = dataStream;
    myTerminal = terminal;
```

### NonProtectedConstructorInAbstractClass
Constructor `MultiColumnListModel()` of an abstract class should not be declared 'public'
in `JediTerm/src/main/java/com/intellij/ui/components/MultiColumnListModel.java`
#### Snippet
```java
  private final ListModel myModel;

  public MultiColumnListModel(ListModel model) {
    myModel = model;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `ProcessTtyConnector()` of an abstract class should not be declared 'public'
in `core/src/com/jediterm/terminal/ProcessTtyConnector.java`
#### Snippet
```java
  }

  public ProcessTtyConnector(@NotNull Process process, @NotNull Charset charset, @Nullable List<String> commandLine) {
    myOutputStream = process.getOutputStream();
    myCharset = charset;
```

### NonProtectedConstructorInAbstractClass
Constructor `ProcessTtyConnector()` of an abstract class should not be declared 'public'
in `core/src/com/jediterm/terminal/ProcessTtyConnector.java`
#### Snippet
```java
  private final @Nullable List<String> myCommandLine;

  public ProcessTtyConnector(@NotNull Process process, @NotNull Charset charset) {
    this(process, charset, null);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTabbedTerminalWidget()` of an abstract class should not be declared 'public'
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
  private final JPanel myPanel;

  public AbstractTabbedTerminalWidget(@NotNull TabbedSettingsProvider settingsProvider, @NotNull Function<AbstractTabbedTerminalWidget<T>, T> createNewSessionAction) {
    super(new BorderLayout());
    mySettingsProvider = settingsProvider;
```

### NonProtectedConstructorInAbstractClass
Constructor `Divider()` of an abstract class should not be declared 'public'
in `JediTerm/src/main/java/com/intellij/openapi/ui/Divider.java`
#### Snippet
```java
 */
public abstract class Divider extends JPanel {
  public Divider(LayoutManager layout) {
    super(layout);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `BombedCharSequence()` of an abstract class should not be declared 'public'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    private int i;

    public BombedCharSequence(@NotNull CharSequence sequence) {
      delegate = sequence;
    }
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `xStart`
in `JediTerm/src/main/java/com/intellij/util/ui/WavePainter.java`
#### Snippet
```java
      g.setComposite(AlphaComposite.SrcOver);
      g.setClip(waveClip);
      xStart -= xStart % 4;
      DrawUtil.drawImage(g, myImage, xStart, y - 3, null);
    } finally {
```

### AssignmentToMethodParameter
Assignment to method parameter `height`
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
                                  boolean drawTopLine,
                                  boolean drawBottomLine) {
        height++;
        GraphicsConfig config = GraphicsUtil.disableAAPainting(g);
        try {
```

### AssignmentToMethodParameter
Assignment to method parameter `start`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtilRt.java`
#### Snippet
```java
  @Contract(pure = true)
  public static int lastIndexOf(@NotNull CharSequence s, char c, int start, int end) {
    start = Math.max(start, 0);
    for (int i = Math.min(end, s.length()) - 1; i >= start; i--) {
      if (s.charAt(i) == c) return i;
```

### AssignmentToMethodParameter
Assignment to method parameter `max`
in `core/src/com/jediterm/terminal/util/CharUtils.java`
#### Snippet
```java
        min = mid + 1;
      else if (ucs < table[mid][0])
        max = mid - 1;
      else
        return 1;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `core/src/com/jediterm/terminal/util/CharUtils.java`
#### Snippet
```java
    char tmp;
    while (len > 0) {
      tmp = buf[offset++];
      if (0x20 <= tmp) { //stop when we reach control chars
        len--;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `core/src/com/jediterm/terminal/util/CharUtils.java`
#### Snippet
```java
        continue;
      }
      offset--;
      break;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `paint`
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
    @Override
    public void paint(Graphics2D g, int x, int y, int width, int height, Paint paint) {
      if (paint == null) paint = g.getPaint();
      g = (Graphics2D)g.create(x, y, width, height);
      g.setComposite(AlphaComposite.SrcOver);
```

### AssignmentToMethodParameter
Assignment to method parameter `g`
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
    public void paint(Graphics2D g, int x, int y, int width, int height, Paint paint) {
      if (paint == null) paint = g.getPaint();
      g = (Graphics2D)g.create(x, y, width, height);
      g.setComposite(AlphaComposite.SrcOver);
      BufferedImage image = paint instanceof Color ? getImage(g, (Color)paint, height) : createImage(g, paint, height);
```

### AssignmentToMethodParameter
Assignment to method parameter `y`
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
    if (height > 3) {
      int max = getMaxHeight(height);
      y += height - max;
      height = max;
      if (thickness > 1 && height > 3) {
```

### AssignmentToMethodParameter
Assignment to method parameter `height`
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
      int max = getMaxHeight(height);
      y += height - max;
      height = max;
      if (thickness > 1 && height > 3) {
        thickness = JBUI.scale(thickness);
```

### AssignmentToMethodParameter
Assignment to method parameter `thickness`
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
      height = max;
      if (thickness > 1 && height > 3) {
        thickness = JBUI.scale(thickness);
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `y`
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
    int offset = height - thickness;
    if (offset > 0) {
      y += offset - (offset >> 1);
      height = thickness;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `height`
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
    if (offset > 0) {
      y += offset - (offset >> 1);
      height = thickness;
    }
    if (painter == BOLD_DOTTED_UNDERSCORE) {
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java

    if (fromIndex < 0) {
      fromIndex = 0;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `scale`
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
    }

    if (scale < 1.25f) scale = 1.0f;
    else if (scale < 1.5f) scale = 1.25f;
    else if (scale < 1.75f) scale = 1.5f;
```

### AssignmentToMethodParameter
Assignment to method parameter `scale`
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java

    if (scale < 1.25f) scale = 1.0f;
    else if (scale < 1.5f) scale = 1.25f;
    else if (scale < 1.75f) scale = 1.5f;
    else if (scale < 2f) scale = 1.75f;
```

### AssignmentToMethodParameter
Assignment to method parameter `scale`
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
    if (scale < 1.25f) scale = 1.0f;
    else if (scale < 1.5f) scale = 1.25f;
    else if (scale < 1.75f) scale = 1.5f;
    else if (scale < 2f) scale = 1.75f;
    else scale = 2.0f;
```

### AssignmentToMethodParameter
Assignment to method parameter `scale`
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
    else if (scale < 1.5f) scale = 1.25f;
    else if (scale < 1.75f) scale = 1.5f;
    else if (scale < 2f) scale = 1.75f;
    else scale = 2.0f;

```

### AssignmentToMethodParameter
Assignment to method parameter `scale`
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
    else if (scale < 1.75f) scale = 1.5f;
    else if (scale < 2f) scale = 1.75f;
    else scale = 2.0f;

    if (SystemInfo.isLinux && scale == 1.25f) {
```

### AssignmentToMethodParameter
Assignment to method parameter `scale`
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
    if (SystemInfo.isLinux && scale == 1.25f) {
      //Default UI font size for Unity and Gnome is 15. Scaling factor 1.25f works badly on Linux
      scale = 1f;
    }
    if (scaleFactor == scale) {
```

### AssignmentToMethodParameter
Assignment to method parameter `maximalLinesToProcess`
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java
      //Process all lines in this case
      
      maximalLinesToProcess = myHistoryBuffer.getLineCount() + myScreenBuffer.getLineCount();
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `proportion`
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
      throw new IllegalArgumentException("Wrong proportion: " + proportion);
    }
    if (proportion < myMinProp) proportion = myMinProp;
    if (proportion > myMaxProp) proportion = myMaxProp;
    float oldProportion = myProportion;
```

### AssignmentToMethodParameter
Assignment to method parameter `proportion`
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
    }
    if (proportion < myMinProp) proportion = myMinProp;
    if (proportion > myMaxProp) proportion = myMaxProp;
    float oldProportion = myProportion;
    myProportion = proportion;
```

### AssignmentToMethodParameter
Assignment to method parameter `rightX`
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java
  public synchronized void clearArea(int leftX, int rightX, @NotNull TextStyle style) {
    if (rightX == -1) {
      rightX = Math.max(myTextEntries.length(), leftX);
    }
    writeCharacters(leftX, style, new CharBuffer(
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/HorizontalLayout.java`
#### Snippet
```java
        }
        component.setBounds(x + insets.left, y + insets.top, size.width, size.height);
        x += size.width + myGap;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `length`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/ScrollableSingleRowLayout.java`
#### Snippet
```java
  protected boolean applyTabLayout(SingleRowPassInfo data, TabLabel label, int length, int deltaToFit) {
    if (data.requiredLength > data.toFitLength) {
      length = getStrategy().getLengthIncrement(label.getPreferredSize());
      final int moreRectSize = getStrategy().getMoreRectAxisSize();
      if (data.position + length > data.toFitLength - moreRectSize && label.getInfo() != myTabs.getSelectedInfo()) {
```

### AssignmentToMethodParameter
Assignment to method parameter `msg`
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
      if (logThrottlerCounter % (logThrottlerLimit / logThrottlerRatio) == 0) {
        if (logThrottlerLimit / logThrottlerRatio > 1) {
          msg += " and " + (logThrottlerLimit / logThrottlerRatio) + " more...";
        }
        LOG.warn(msg);
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `JediTerm/src/main/java/com/intellij/util/ExceptionUtil.java`
#### Snippet
```java
  public static <T> T findCause(Throwable e, Class<T> klass) {
    while (e != null && !klass.isInstance(e)) {
      e = e.getCause();
    }
    @SuppressWarnings("unchecked") T t = (T)e;
```

### AssignmentToMethodParameter
Assignment to method parameter `result`
in `JediTerm/src/main/java/com/intellij/util/ExceptionUtil.java`
#### Snippet
```java
  private static String extractMessage(@NotNull String result, @NotNull String errorPattern) {
    if (result.lastIndexOf(errorPattern) >= 0) {
      result = result.substring(result.lastIndexOf(errorPattern) + errorPattern.length());
    }
    return result;
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `JediTerm/src/main/java/com/intellij/util/ExceptionUtil.java`
#### Snippet
```java
    while (true) {
      if (e.getCause() == null) return e;
      e = e.getCause();
    }
  }
```

### AssignmentToMethodParameter
Assignment to method parameter `e`
in `JediTerm/src/main/java/com/intellij/util/ExceptionUtil.java`
#### Snippet
```java

    while ((result == null || result.contains(exceptionPattern) || result.contains(errorPattern)) && e.getCause() != null) {
      e = e.getCause();
      result = e.getMessage();
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `delay`
in `JediTerm/src/main/java/com/intellij/util/concurrency/SchedulingWrapper.java`
#### Snippet
```java
      long headDelay = head.getDelay(TimeUnit.NANOSECONDS);
      if (headDelay < 0 && delay - headDelay < 0) {
        delay = Long.MAX_VALUE + headDelay;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `errorText`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/ValidatingComponent.java`
#### Snippet
```java
  public void setErrorText(String errorText) {
    if ("".equals(errorText) || errorText == null) {
      errorText = " ";
    }
    myErrorLabel.setText(errorText);
```

### AssignmentToMethodParameter
Assignment to method parameter `characters`
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
        if (characters instanceof SubCharBuffer) {
          SubCharBuffer subCharBuffer = (SubCharBuffer) characters;
          characters = subCharBuffer.getParent();
          offset = subCharBuffer.getOffset();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `descendant`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
                return true;
            }
            descendant = descendant.getParent();
        }
        return false;
```

### AssignmentToMethodParameter
Assignment to method parameter `html`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    @NonNls
    public static String toHtml(String html, final int hPadding) {
        html = CLOSE_TAG_PATTERN.matcher(html).replaceAll("<$1$2></$1>");
        Font font = getLabelFont();
        @NonNls String family = font != null ? font.getFamily() : "Tahoma";
```

### AssignmentToMethodParameter
Assignment to method parameter `component`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
                return (T) component;
            }
            component = component.getParent();
        }
        return null;
```

### AssignmentToMethodParameter
Assignment to method parameter `child`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    public static boolean isDescendingFrom(@Nullable Component child, @NotNull Component parent) {
        while (child != null && child != parent) {
            child = child instanceof JPopupMenu ? ((JPopupMenu) child).getInvoker()
                    : child.getParent();
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `border`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            Border old = component.getBorder();
            if (old != null) {
                border = BorderFactory.createCompoundBorder(border, old);
            }
            component.setBorder(border);
```

### AssignmentToMethodParameter
Assignment to method parameter `base`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    @NotNull
    public static Font getFont(@NotNull FontSize size, @Nullable Font base) {
        if (base == null) base = getLabelFont();

        return base.deriveFont(getFontSize(size));
```

### AssignmentToMethodParameter
Assignment to method parameter `text`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        assignMnemonic(text, action);

        text = text.replaceAll("&", "");
        action.putValue(Action.NAME, text);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `font`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
      boolean isSmaller = attributes.isSmaller();
      if (font.getStyle() != attributes.getFontStyle() || isSmaller != wasSmaller) { // derive font only if it is necessary
        font = font.deriveFont(attributes.getFontStyle(), isSmaller ? UIUtil.getFontSize(UIUtil.FontSize.SMALL) : baseSize);
      }
      wasSmaller = isSmaller;
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
    // If there is no icon, then we have to add left internal padding
    if (offset == 0) {
      offset = myIpad.left;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
    int textStart = offset;
    if (myBorder != null) {
      offset += myBorder.getBorderInsets(this).left;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
    final Font baseFont = getBaseFont();
    g.setFont(baseFont);
    offset += computeTextAlignShift(baseFont);
    int baseSize = baseFont.getSize();
    FontMetrics baseMetrics = g.getFontMetrics();
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
        endOffset = fragmentPadding;
        if (fragmentAlignment == SwingConstants.RIGHT || fragmentAlignment == SwingConstants.TRAILING) {
          offset = fragmentPadding - fragmentWidth;
        }
      }
```

### AssignmentToMethodParameter
Assignment to method parameter `offset`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
      }

      offset = endOffset;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `balance`
in `JediTerm/src/main/java/com/intellij/ui/ColorUtil.java`
#### Snippet
```java
  @NotNull
  public static Color mix(@NotNull Color c1, @NotNull Color c2, double balance) {
    balance = Math.min(1, Math.max(0, balance));
    return new Color((int)((1 - balance) * c1.getRed() + c2.getRed() * balance + .5),
                     (int)((1 - balance) * c1.getGreen() + c2.getGreen() * balance + .5),
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `JediTerm/src/main/java/com/intellij/ui/ColorUtil.java`
#### Snippet
```java
   */
  public static Color fromHex(String str) {
    str = StringUtil.trimStart(str, "#");
    if (str.length() == 3) {
      return new Color(
```

### AssignmentToMethodParameter
Assignment to method parameter `ind`
in `core/src/com/jediterm/terminal/model/LinesBuffer.java`
#### Snippet
```java
        myLines.remove(ind);
      }
      ind--;
      i++;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `core/src/com/jediterm/terminal/model/LinesBuffer.java`
#### Snippet
```java

  public synchronized void moveBottomLinesTo(int count, final @NotNull LinesBuffer buffer) {
    count = Math.min(count, getLineCount());
    buffer.addLinesFirst(myLines.subList(getLineCount() - count, getLineCount()));

```

### AssignmentToMethodParameter
Assignment to method parameter `count`
in `core/src/com/jediterm/terminal/model/LinesBuffer.java`
#### Snippet
```java

  public synchronized void moveTopLinesTo(int count, final @NotNull LinesBuffer buffer) {
    count = Math.min(count, getLineCount());
    buffer.addLines(myLines.subList(0, count));
    removeTopLines(count);
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static int[] append(@NotNull int[] array, int value) {
    array = realloc(array, array.length + 1);
    array[array.length - 1] = value;
    return array;
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static byte[] append(@NotNull byte[] array, byte value) {
    array = realloc(array, array.length + 1);
    array[array.length - 1] = value;
    return array;
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static long[] append(@NotNull long[] array, long value) {
    array = realloc(array, array.length + 1);
    array[array.length - 1] = value;
    return array;
```

### AssignmentToMethodParameter
Assignment to method parameter `array`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static boolean[] append(@NotNull boolean[] array, boolean value) {
    array = realloc(array, array.length + 1);
    array[array.length - 1] = value;
    return array;
```

### AssignmentToMethodParameter
Assignment to method parameter `y`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/VerticalLayout.java`
#### Snippet
```java
        }
        component.setBounds(x + insets.left, y + insets.top, size.width, size.height);
        y += size.height + myGap;
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `x`
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
  protected void paint(Graphics2D g, int x, int y, int width, int height) {
    if (myOffset > 0) {
      x += myOffset;
      y += myOffset;
      width -= myOffset + myOffset;
```

### AssignmentToMethodParameter
Assignment to method parameter `y`
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
    if (myOffset > 0) {
      x += myOffset;
      y += myOffset;
      width -= myOffset + myOffset;
      height -= myOffset + myOffset;
```

### AssignmentToMethodParameter
Assignment to method parameter `width`
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
      x += myOffset;
      y += myOffset;
      width -= myOffset + myOffset;
      height -= myOffset + myOffset;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `height`
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
      y += myOffset;
      width -= myOffset + myOffset;
      height -= myOffset + myOffset;
    }
    if (width > 0 && height > 0) {
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/DefaultLogger.java`
#### Snippet
```java
  @SuppressWarnings("UseOfSystemOutOrSystemErr")
  public void error(String message, @Nullable Throwable t, @NotNull String... details) {
    t = checkException(t);
    message += attachmentsToString(t);
    System.err.println("ERROR: " + message);
```

### AssignmentToMethodParameter
Assignment to method parameter `message`
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/DefaultLogger.java`
#### Snippet
```java
  public void error(String message, @Nullable Throwable t, @NotNull String... details) {
    t = checkException(t);
    message += attachmentsToString(t);
    System.err.println("ERROR: " + message);
    if (t != null) t.printStackTrace(System.err);
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/DefaultLogger.java`
#### Snippet
```java
  @SuppressWarnings("UseOfSystemOutOrSystemErr")
  public void warn(@NonNls String message, @Nullable Throwable t) {
    t = checkException(t);
    System.err.println("WARN: " + message);
    if (t != null) t.printStackTrace(System.err);
```

### AssignmentToMethodParameter
Assignment to method parameter `str`
in `JediTerm/src/main/java/com/intellij/util/ui/ColorUtil.java`
#### Snippet
```java
   */
  public static Color fromHex(String str) {
    str = StringUtil.trimStart(str, "#");
    if (str.length() == 3) {
      return new Color(
```

### AssignmentToMethodParameter
Assignment to method parameter `balance`
in `JediTerm/src/main/java/com/intellij/util/ui/ColorUtil.java`
#### Snippet
```java
  @NotNull
  public static Color mix(@NotNull Color c1, @NotNull Color c2, double balance) {
    balance = Math.min(1, Math.max(0, balance));
    return new Color((int)((1 - balance) * c1.getRed() + c2.getRed() * balance + .5),
                     (int)((1 - balance) * c1.getGreen() + c2.getGreen() * balance + .5),
```

### AssignmentToMethodParameter
Assignment to method parameter `buffer`
in `core/src/com/jediterm/terminal/model/hyperlinks/TextProcessing.java`
#### Snippet
```java
          return;
        }
        buffer = myTerminalTextBuffer.getHistoryBuffer();
      }
      int startLineInd = updatedLineInd;
```

### AssignmentToMethodParameter
Assignment to method parameter `startOffset`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
        break;
      }
      startOffset = endOffset;
      endOffset = newEndOffset;
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `endOffset`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
      }
      startOffset = endOffset;
      endOffset = newEndOffset;
    }
    return endOffset;
```

### AssignmentToMethodParameter
Assignment to method parameter `style`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

        // substitute text style with the hyperlink highlight style if applicable
        style = hyperlinkStyle.getHighlightStyle();
      }
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static int indexOf(@NotNull char[] s, char c, int start, int end, boolean caseSensitive) {
    end = min(end, s.length);
    for (int i = max(start, 0); i < end; i++) {
      if (charsMatch(s[i], c, !caseSensitive)) return i;
```

### AssignmentToMethodParameter
Assignment to method parameter `html`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  public static String stripHtml(@NotNull String html, boolean convertBreaks) {
    if (convertBreaks) {
      html = html.replaceAll("<br/?>", "\n\n");
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static int indexOfAny(@NotNull final CharSequence s, @NotNull final String chars, final int start, int end) {
    end = min(end, s.length());
    for (int i = max(start, 0); i < end; i++) {
      if (containsChar(chars, s.charAt(i))) return i;
```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static int indexOf(@NotNull CharSequence s, char c, int start, int end) {
    end = min(end, s.length());
    for (int i = max(start, 0); i < end; i++) {
      if (s.charAt(i) == c) return i;
```

### AssignmentToMethodParameter
Assignment to method parameter `fromIndex`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

    if (fromIndex < 0) {
      fromIndex = 0;
    }

```

### AssignmentToMethodParameter
Assignment to method parameter `end`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static int indexOf(@NotNull CharSequence s, char c, int start, int end, boolean caseSensitive) {
    end = min(end, s.length());
    for (int i = max(start, 0); i < end; i++) {
      if (charsMatch(s.charAt(i), c, !caseSensitive)) return i;
```

### AssignmentToMethodParameter
Assignment to method parameter `t`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
    while (t != null) {
      list.add(t);
      t = next.fun(t);
    }
    return list;
```

### AssignmentToMethodParameter
Assignment to method parameter `a`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
   */
  private static <T> void vecswap(List<T> x, int a, int b, int n) {
    for (int i = 0; i < n; i++, a++, b++) {
      swapElements(x, a, b);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `b`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
   */
  private static <T> void vecswap(List<T> x, int a, int b, int n) {
    for (int i = 0; i < n; i++, a++, b++) {
      swapElements(x, a, b);
    }
```

### AssignmentToMethodParameter
Assignment to method parameter `to`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
    if (to.length < from.length) {
      @SuppressWarnings("unchecked") V[] array = (V[])Array.newInstance(to.getClass().getComponentType(), from.length);
      to = array;
    }
    for (int i = 0; i < from.length; i++) {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/Pair.java`
#### Snippet
```java

  public static <T> T getFirst(@Nullable Pair<T, ?> pair) {
    return pair != null ? pair.first : null;
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/Pair.java`
#### Snippet
```java

  public static <T> T getSecond(@Nullable Pair<?, T> pair) {
    return pair != null ? pair.second : null;
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/Key.java`
#### Snippet
```java
  public T get(@Nullable Map<Key, ?> holder) {
    //noinspection unchecked
    return holder == null ? null : (T)holder.get(this);
  }

```

### ReturnNull
Return of `null`
in `core/src/com/jediterm/terminal/TerminalKeyEncoder.java`
#### Snippet
```java
    bytes = myKeyCodes.get(new KeyCodeAndModifier(key, 0));
    if (bytes == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `core/src/com/jediterm/terminal/SubstringFinder.java`
#### Snippet
```java
          return filtered;
        }
        return null;
      }
      return ranges.get(characters);
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java
    }

    return null;
  }

```

### ReturnNull
Return of `null`
in `ui/src/com/jediterm/terminal/ui/TerminalActionProviderBase.java`
#### Snippet
```java
  @Override
  public TerminalActionProvider getNextProvider() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/jediterm/terminal/util/Pair.java`
#### Snippet
```java

  public static <T> T getSecond(Pair<?, T> pair) {
    return pair != null ? pair.second : null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/jediterm/terminal/util/Pair.java`
#### Snippet
```java

  public static <T> T getFirst(Pair<T, ?> pair) {
    return pair != null ? pair.first : null;
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/objectTree/ObjectNode.java`
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
in `JediTerm/src/main/java/com/intellij/util/NullableFunction.java`
#### Snippet
```java
  NullableFunction NULL = new NullableFunction() {
    public Object fun(final Object o) {
      return null;
    }
  };
```

### ReturnNull
Return of `null`
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
      } else {
        LOG.warn("Bogus color setting " + args.toString());
        return null;
      }
    } else if (code == 5) {
```

### ReturnNull
Return of `null`
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
    } else {
      LOG.warn("Unsupported code for color attribute " + args.toString());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/jediterm/example/BasicTerminalExample.java`
#### Snippet
```java
    @Override
    public String getName() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/MacUtil.java`
#### Snippet
```java
      return activity;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
  public SubstringFinder.FindResult searchInTerminalTextBuffer(@NotNull String pattern, boolean ignoreCase) {
    if (pattern.length() == 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
                return (Accessible) myComponent;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        public String getAccessibleActionDescription(int i) {
            if (i != 0)
                return null;

            return "Activate";
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        public Accessible getAccessibleSelection(int i) {
            if (getSelectedInfo() == null)
                return null;
            return myInfo2Page.get(getSelectedInfo());
        }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
                return returnIcons;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
                return (Accessible) myComponent;
            } else {
                return null;
            }
        }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/StatelessCardLayout.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     */
    public static Object getClientProperty(Object component, @NotNull Object key) {
        return component instanceof JComponent ? ((JComponent) component).getClientProperty(key) : null;
    }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    public static JComponent getPreferredFocusedComponent(Container container) {
        Container parent = container;
        if (parent == null) return null;
        FocusTraversalPolicy policy = parent.getFocusTraversalPolicy();
        while (policy == null) {
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        while (policy == null) {
            parent = parent.getParent();
            if (parent == null) return null;
            policy = parent.getFocusTraversalPolicy();
        }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        }
        Component component = policy.getFirstComponent(container);
        return component instanceof JComponent ? (JComponent) component : null;
    }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
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
in `ui/src/com/jediterm/terminal/ui/JediTermDefaultSearchComponent.java`
#### Snippet
```java
      }
      //noinspection SuspiciousInvocationHandlerImplementation
      return null;
    });
  }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
      current = current.getSuperclass();
      if (current == null) {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
    }
    assert false : type;
    return null;
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
    catch (NoSuchFieldException e) {
      LOG.debug(e);
      return null;
    }
    catch (IllegalAccessException e) {
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
    catch (IllegalAccessException e) {
      LOG.debug(e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
    catch (NoSuchFieldException e) {
      LOG.debug(e);
      return null;
    }
    catch (IllegalAccessException e) {
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
    catch (IllegalAccessException e) {
      LOG.debug(e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
      if (result != null) return result;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    @Override
    public AttributedCharacterIterator getCommittedText(int beginIndex, int endIndex, AttributedCharacterIterator.Attribute[] attributes) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private static String uncommittedChars(@Nullable AttributedCharacterIterator text) {
    if (text == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @SuppressWarnings("UnusedDeclaration")
  static String toShortString(@Nullable Object o) {
    if (o == null) return null;
    if (o instanceof CharSequence) return o.toString();
    String className = o.getClass().getName();
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(value = "null -> null; !null -> !null", pure = true)
  public static String toUpperCase(String a) {
    return a == null ? null : StringUtilRt.toUpperCase(a).toString();
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java

  public static String replaceUnicodeEscapeSequences(String text) {
    if (text == null) return null;

    final Matcher matcher = UNICODE_CHAR.matcher(text);
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(value = "null -> null; !null -> !null", pure = true)
  public static String escapeMnemonics(@Nullable String text) {
    if (text == null) return null;
    return replace(text, MN_CHARS, MN_QUOTED);
  }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  public static String toLowerCase(@Nullable final String str) {
    //noinspection ConstantConditions
    return str == null ? null : str.toLowerCase();
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(value = "null -> null; !null -> !null",pure = true)
  public static String escapeXml(@Nullable final String text) {
    if (text == null) return null;
    return replace(text, REPLACES_DISP, REPLACES_REFS);
  }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(value = "null -> null; !null -> !null",pure = true)
  public static String unescapeXml(@Nullable final String text) {
    if (text == null) return null;
    return replace(text, REPLACES_REFS, REPLACES_DISP);
  }
```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @Contract(value = "null -> null; !null -> !null", pure = true)
  public static String trim(@Nullable String s) {
    return s == null ? null : s.trim();
  }

```

### ReturnNull
Return of `null`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract("null -> null; !null -> !null")
  public static <T> List<T> trimToSize(@Nullable List<T> list) {
    if (list == null) return null;
    if (list.isEmpty()) return emptyList();

```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `g` is redundant
in `JediTerm/src/main/java/com/intellij/util/HiDPIScaledGraphics.java`
#### Snippet
```java
  @Override
  public Graphics create() {
    Graphics g = myPeer.create();
    return g;
  }
```

### UnnecessaryLocalVariable
Local variable `tabInfo` is redundant
in `JediTerm/src/main/java/com/jediterm/app/JediTabbedTerminalWidget.java`
#### Snippet
```java

    private TabInfo createTabInfo(String name, JediTerminalWidget terminal) {
      TabInfo tabInfo = new TabInfo(terminal).setText(name);
      return tabInfo;
    }
```

### UnnecessaryLocalVariable
Local variable `font` is redundant
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
    int currentIndex = start;
    for(char c = it.first(); c != CharacterIterator.DONE; c = it.next()) {
      Font font = basefont;
      if (!font.canDisplay(c)) {
//          TODO
```

## RuleId[id=UseCompareMethod]
### UseCompareMethod
Expression can be replaced with 'Double.compare'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java

  public static int compare(double o1, double o2) {
    return o1 < o2 ? -1 : o1 == o2 ? 0 : 1;
  }

```

### UseCompareMethod
Expression can be replaced with 'Byte.compare'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java

  public static int compare(byte o1, byte o2) {
    return o1 < o2 ? -1 : o1 == o2 ? 0 : 1;
  }

```

### UseCompareMethod
Expression can be replaced with 'Long.compare'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java

  public static int compare(long o1, long o2) {
    return o1 < o2 ? -1 : o1 == o2 ? 0 : 1;
  }

```

### UseCompareMethod
Expression can be replaced with 'Integer.compare'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java

  public static int compare(int o1, int o2) {
    return o1 < o2 ? -1 : o1 == o2 ? 0 : 1;
  }

```

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `ui/src/com/jediterm/terminal/ui/PreConnectHandler.java`
#### Snippet
```java
      }
      try {
        mySync.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`myShowDividerControls && false` can be simplified to 'false'
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
                                                       new Insets(0, 0, 0, 0), 0, 0));

      if (myShowDividerControls && false) {
        int glueFill = isVerticalSplit ? GridBagConstraints.VERTICAL : GridBagConstraints.HORIZONTAL;
        int xMask = isVerticalSplit ? 1 : 0;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
    //noinspection ManualArrayToCollectionCopy
    for (T element : elements) {
      collection.add(element);
    }
    return collection;
```

## RuleId[id=UsePropertyAccessSyntax]
### UsePropertyAccessSyntax
Use of getter method instead of property access syntax
in `JediTerm/src/main/kotlin/com/jediterm/app/JediTerminalPanel.kt`
#### Snippet
```java
                val newG = g.create(0, 0, image.getWidth(observer), image.getHeight(observer)) as Graphics2D
                newG.scale(0.5, 0.5)
                var img = image.getDelegate()
                if (img == null) {
                    img = image
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `==`, not 'equals()'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java
  public static boolean equal(@Nullable String arg1, @Nullable String arg2, boolean caseSensitive) {
    if (arg1 == null || arg2 == null) {
      return arg1 == arg2;
    }
    else {
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
Source parameter type 'java.lang.Object\[\]' is not assignable to destination parameter `array` of type 'T\[\]'
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  public static <T> T[] toObjectArray(@NotNull Class<T> aClass, @NotNull Object... source) {
    @SuppressWarnings("unchecked") T[] array = (T[])Array.newInstance(aClass, source.length);
    System.arraycopy(source, 0, array, 0, array.length);
    return array;
  }
```

## RuleId[id=StaticCallOnSubclass]
### StaticCallOnSubclass
Static method `getPanelBackground()` declared in class 'com.intellij.util.ui.DrawUtil' but referenced via subclass 'com.intellij.util.ui.UIUtil'
in `JediTerm/src/main/java/com/intellij/ui/components/OnOffButton.java`
#### Snippet
```java
        g.drawString(button.getOnText(), h/2, h - 4);
      } else {
        g.setColor(UIUtil.getPanelBackground());
        g.fillRoundRect(0, 0, w, h, 5, 5);
        g.setColor(new JBColor(Gray._192, Gray._100));
```

### StaticCallOnSubclass
Static method `isUnderDarcula()` declared in class 'com.intellij.util.ui.DrawUtil' but referenced via subclass 'com.intellij.util.ui.UIUtil'
in `JediTerm/src/main/java/com/intellij/ui/components/JBCheckBox.java`
#### Snippet
```java
   */
  public boolean setTextIcon(@NotNull Icon icon) {
    if (UIUtil.isUnderDarcula() || UIUtil.isUnderIntelliJLaF()) {
      return false;
    }
```

### StaticCallOnSubclass
Static method `isUnderIntelliJLaF()` declared in class 'com.intellij.util.ui.DrawUtil' but referenced via subclass 'com.intellij.util.ui.UIUtil'
in `JediTerm/src/main/java/com/intellij/ui/components/JBCheckBox.java`
#### Snippet
```java
   */
  public boolean setTextIcon(@NotNull Icon icon) {
    if (UIUtil.isUnderDarcula() || UIUtil.isUnderIntelliJLaF()) {
      return false;
    }
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  public static String escapeCharCharacters(@NotNull String s) {
    StringBuilder buffer = new StringBuilder(s.length());
    escapeStringCharacters(s.length(), s, "\'", buffer);
    return buffer.toString();
  }
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
  private final TerminalKeyEncoder myTerminalKeyEncoder;

  private final Stack<String> myWindowTitlesStack = new Stack<>();

  private final Tabulator myTabulator;
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
  private final TerminalKeyEncoder myTerminalKeyEncoder;

  private final Stack<String> myWindowTitlesStack = new Stack<>();

  private final Tabulator myTabulator;
```

## RuleId[id=RefusedBequest]
### RefusedBequest
Method `clone()` does not call 'super.clone()'
in `core/src/com/jediterm/terminal/model/CharBuffer.java`
#### Snippet
```java
  }

  public CharBuffer clone() {
    char[] newBuf = Arrays.copyOfRange(myBuf, myStart, myStart + myLength);

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
        break;
      case '-':
        terminal.designateCharacterSet(1, secondCh); //Designate G1 Character set (VT300)
        break;
      case '.':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
        break;
      case '.':
        terminal.designateCharacterSet(2, secondCh); //Designate G2 Character set (VT300)
        break;
      case '/':
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
        break;
      case '/':
        terminal.designateCharacterSet(3, secondCh); //Designate G3 Character set (VT300)
        break;
      case '$':
```

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `modified |= collection.remove(element)`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
    boolean modified = false;
    for (T element : elements) {
      modified |= collection.remove(element);
    }
    return modified;
```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java

        if (myOverlayedIcon == null)
            return;

    }
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * which is called from Toolkit.getDefaultToolkit().
     */
        if (!(SystemInfo.isLinux && Registry.is("linux.jdk.accessibility.atkwrapper.block"))) return;


```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabsSideSplitter.java`
#### Snippet
```java
  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    if (evt.getSource() != myTabs) return;
//    Integer limit = UIUtil.getClientProperty(myTabs, JBTabsImpl.SIDE_TABS_SIZE_LIMIT_KEY);
//    if (limit == null) limit = JBTabsImpl.DEFAULT_MAX_TAB_WIDTH;
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java

    assert countToDone >= 0 : "count=" + countToDone;
    myDone = new ExecutionCallback(countToDone >= 1 ? countToDone : 1);
    myRejected = new ExecutionCallback();

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayoutStrategy.java`
#### Snippet
```java

    public int getLengthIncrement(final Dimension labelPrefSize) {
      return myTabs.isEditorTabs() ? labelPrefSize.width < MIN_TAB_WIDTH ? MIN_TAB_WIDTH : labelPrefSize.width : labelPrefSize.width;
    }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java

    private static int normalize(int number) {
        return number > 9 ? 9 : number;
    }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `JediTerm/src/main/java/com/intellij/ui/ColorUtil.java`
#### Snippet
```java
  private static int shift(int colorComponent, double d) {
    final int n = (int)(colorComponent * d);
    return n > 255 ? 255 : n < 0 ? 0 : n;
  }

```

### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `JediTerm/src/main/java/com/intellij/util/ui/ColorUtil.java`
#### Snippet
```java
  private static int shift(int colorComponent, double d) {
    final int n = (int)(colorComponent * d);
    return n > 255 ? 255 : n < 0 ? 0 : n;
  }

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super Key`
in `JediTerm/src/main/java/com/intellij/openapi/util/Key.java`
#### Snippet
```java


  public void set(@Nullable Map<Key, Object> holder, T value) {
    if (holder != null) {
      holder.put(this, value);
```

### BoundedWildcard
Can generalize to `? super String`
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java

  @NotNull
  public final ActionCallback doWhenRejected(@NotNull final Consumer<String> consumer) {
    myRejected.doWhenExecuted(new Runnable() {
      @Override
```

### BoundedWildcard
Can generalize to `? super Option`
in `core/src/com/jediterm/terminal/TextStyle.java`
#### Snippet
```java
    HIDDEN;

    private void set(@NotNull EnumSet<Option> options, boolean val) {
      if (val) {
        options.add(this);
```

### BoundedWildcard
Can generalize to `? super ScrollbarStyleListener`
in `JediTerm/src/main/java/com/intellij/util/ui/NSScrollerHelper.java`
#### Snippet
```java
  }

  private static void processReferences(ScrollbarStyleListener toAdd, ScrollbarStyleListener toRemove, List<ScrollbarStyleListener> list) {
    synchronized (ourStyleListeners) {
      Iterator<Reference<ScrollbarStyleListener>> iterator = ourStyleListeners.iterator();
```

### BoundedWildcard
Can generalize to `? super Graphics2D`
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
                                            @NotNull Graphics g,
                                            boolean useRetinaCondition,
                                            Consumer<Graphics2D> paintRoutine) {
        if (!useRetinaCondition || !isRetina() || Registry.is("ide.mac.retina.disableDrawingFix")) {
            paintRoutine.consume((Graphics2D) g);
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/Stack.java`
#### Snippet
```java
  }

  public Stack(@NotNull Collection<T> init) {
    super(init);
  }
```

### BoundedWildcard
Can generalize to `? super TextEntry`
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java
  }

  void forEachEntry(@NotNull Consumer<TextEntry> action) {
    myTextEntries.forEach(action);
  }
```

### BoundedWildcard
Can generalize to `? super Integer`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
    }

    public void doTranslate(PairConsumer<Integer, Integer> consumer) {
        final JBTabsPosition pos = myTabs.getTabsPosition();

```

### BoundedWildcard
Can generalize to `? super Integer`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
    }

    public void doTranslate(PairConsumer<Integer, Integer> consumer) {
        final JBTabsPosition pos = myTabs.getTabsPosition();

```

### BoundedWildcard
Can generalize to `? extends Component`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/HorizontalLayout.java`
#### Snippet
```java
  }

  private Dimension getPreferredSize(ArrayList<Component> list) {
    Dimension result = null;
    for (Component component : list) {
```

### BoundedWildcard
Can generalize to `? extends Component`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/HorizontalLayout.java`
#### Snippet
```java
  }

  private int layout(ArrayList<Component> list, int x, int height, Insets insets) {
    for (Component component : list) {
      if (component.isVisible()) {
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/ObjectUtils.java`
#### Snippet
```java

  @Nullable
  public static <T> T nullizeByCondition(@Nullable final T obj, @NotNull final Condition<T> condition) {
    if (condition.value(obj)) {
      return null;
```

### BoundedWildcard
Can generalize to `? super Long`
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
  }

  public @NotNull CompletableFuture<?> getPromptUpdatedAfterResizeFuture(@NotNull BiConsumer<Long, Runnable> taskScheduler) {
    CompletableFuture<Void> resizeFuture = new CompletableFuture<>();
    taskScheduler.accept(100L, this::completeResize);
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/openapi/Suppliers.java`
#### Snippet
```java
  private Suppliers() {}

  public static <T> Supplier<T> memoize(@NotNull Supplier<T> delegate) {
    AtomicReference<T> value = new AtomicReference<>();
    return () -> {
```

### BoundedWildcard
Can generalize to `? super TabInfo`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    }

    public void sortTabs(Comparator<TabInfo> comparator) {
        Collections.sort(myVisibleInfos, comparator);

```

### BoundedWildcard
Can generalize to `? super JComponent`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    }

    private Dimension computeSize(Function<JComponent, Dimension> transform, int tabCount) {
        Dimension size = new Dimension();
        for (TabInfo each : myVisibleInfos) {
```

### BoundedWildcard
Can generalize to `? extends Dimension`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    }

    private Dimension computeSize(Function<JComponent, Dimension> transform, int tabCount) {
        Dimension size = new Dimension();
        for (TabInfo each : myVisibleInfos) {
```

### BoundedWildcard
Can generalize to `? super Component`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    @Nullable
    public static Component findParentByCondition(@NotNull Component c, Condition<Component> condition) {
        Component eachParent = c;
        while (eachParent != null) {
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    }

    private static <T extends JComponent> void findComponentsOfType(JComponent parent, Class<T> cls, ArrayList<T> result) {
        if (parent == null) return;
        if (cls.isAssignableFrom(parent.getClass())) {
```

### BoundedWildcard
Can generalize to `? extends Color`
in `JediTerm/src/main/java/com/intellij/ui/JBColor.java`
#### Snippet
```java
  }

  public JBColor(NotNullProducer<Color> function) {
    super(0);
    darkColor = null;
```

### BoundedWildcard
Can generalize to `? super AbstractTabbedTerminalWidget`
in `JediTerm/src/main/java/com/jediterm/ui/TabbedTerminalWidget.java`
#### Snippet
```java
 */
public class TabbedTerminalWidget extends AbstractTabbedTerminalWidget<JediTermWidget> {
  public TabbedTerminalWidget(@NotNull TabbedSettingsProvider settingsProvider, @NotNull Function<AbstractTabbedTerminalWidget, JediTermWidget> createNewSessionAction) {
    super(settingsProvider, createNewSessionAction::apply);
  }
```

### BoundedWildcard
Can generalize to `? extends JediTermWidget`
in `JediTerm/src/main/java/com/jediterm/ui/TabbedTerminalWidget.java`
#### Snippet
```java
 */
public class TabbedTerminalWidget extends AbstractTabbedTerminalWidget<JediTermWidget> {
  public TabbedTerminalWidget(@NotNull TabbedSettingsProvider settingsProvider, @NotNull Function<AbstractTabbedTerminalWidget, JediTermWidget> createNewSessionAction) {
    super(settingsProvider, createNewSessionAction::apply);
  }
```

### BoundedWildcard
Can generalize to `? extends E`
in `JediTerm/src/main/java/com/intellij/util/containers/ImmutableList.java`
#### Snippet
```java
    private int size;

    SubList(List<E> list, int fromIndex, int toIndex) {
      if (fromIndex < 0) {
        throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
```

### BoundedWildcard
Can generalize to `? extends Request`
in `JediTerm/src/main/java/com/intellij/util/Alarm.java`
#### Snippet
```java
    }

    private void cancelRequest(@NotNull Runnable request, @NotNull List<Request> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            Request r = list.get(i);
```

### BoundedWildcard
Can generalize to `? extends Request`
in `JediTerm/src/main/java/com/intellij/util/Alarm.java`
#### Snippet
```java
    }

    private int cancelAllRequests(@NotNull List<Request> list) {
        int count = 0;
        for (Request request : list) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> T[] mergeArrays(@NotNull T[] a1, @NotNull T[] a2, @NotNull ArrayFactory<T> factory) {
    if (a1.length == 0) {
      return a2;
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> int lastIndexOf(@NotNull List<T> src, final T obj, @NotNull Equality<? super T> comparator) {
    for (int i = src.size() - 1; i >= 0; i--) {
      final T o = src.get(i);
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> T[] remove(@NotNull final T[] src, int idx, @NotNull ArrayFactory<T> factory) {
    int length = src.length;
    if (idx < 0 || idx >= length) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> T[] mergeCollections(@NotNull Collection<? extends T> c1, @NotNull Collection<? extends T> c2, @NotNull ArrayFactory<T> factory) {
    T[] res = factory.create(c1.size() + c2.size());

```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> int indexOf(@NotNull List<T> objects, T object, @NotNull Comparator<T> comparator) {
    for (int i = 0; i < objects.size(); i++) {
      if (comparator.compare(objects.get(i), object) == 0) return i;
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> int indexOf(@NotNull List<T> objects, T object, @NotNull Comparator<T> comparator) {
    for (int i = 0; i < objects.size(); i++) {
      if (comparator.compare(objects.get(i), object) == 0) return i;
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> T[] append(@NotNull final T[] src, final T element, @NotNull ArrayFactory<T> factory) {
    int length = src.length;
    T[] result = factory.create(length + 1);
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> int indexOf(@NotNull List<T> objects, T object, @NotNull Equality<T> comparator) {
    for (int i = 0; i < objects.size(); i++) {
      if (comparator.equals(objects.get(i), object)) return i;
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> int indexOf(@NotNull List<T> objects, T object, @NotNull Equality<T> comparator) {
    for (int i = 0; i < objects.size(); i++) {
      if (comparator.equals(objects.get(i), object)) return i;
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> T[] prepend(final T element, @NotNull final T[] src, @NotNull ArrayFactory<T> factory) {
    int length = src.length;
    T[] result = factory.create(length + 1);
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> int indexOf(@NotNull T[] objects, T object, @NotNull Equality<T> comparator) {
    for (int i = 0; i < objects.length; i++) {
      if (comparator.equals(objects[i], object)) return i;
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  public static <T> T[] mergeArrayAndCollection(@NotNull T[] array,
                                                @NotNull Collection<T> collection,
                                                @NotNull final ArrayFactory<T> factory) {
    if (collection.isEmpty()) {
      return array;
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> T[] realloc(@NotNull T[] array, final int newSize, @NotNull ArrayFactory<T> factory) {
    final int oldSize = array.length;
    if (oldSize == newSize) {
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/openapi/util/objectTree/ObjectTree.java`
#### Snippet
```java
  static <T> void executeActionWithRecursiveGuard(@NotNull T object,
                                                  @NotNull List<T> recursiveGuard,
                                                  @NotNull final ObjectTreeAction<T> action) {
    synchronized (recursiveGuard) {
      if (ArrayUtil.indexOf(recursiveGuard, object, ContainerUtil.<T>identityStrategy()) != -1) return;
```

### BoundedWildcard
Can generalize to `? extends Component`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/VerticalLayout.java`
#### Snippet
```java
  }

  private int layout(ArrayList<Component> list, int y, int width, Insets insets) {
    for (Component component : list) {
      if (component.isVisible()) {
```

### BoundedWildcard
Can generalize to `? extends Component`
in `JediTerm/src/main/java/com/intellij/ui/components/panels/VerticalLayout.java`
#### Snippet
```java
  }

  private Dimension getPreferredSize(ArrayList<Component> list) {
    Dimension result = null;
    for (Component component : list) {
```

### BoundedWildcard
Can generalize to `? super Float`
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
    private RegionPainter<Float> myFallback;

    private Protected(RegionPainter<Float> painter, RegionPainter<Float> fallback) {
      myPainter = painter;
      myFallback = fallback;
```

### BoundedWildcard
Can generalize to `? super KeyEvent`
in `ui/src/com/jediterm/terminal/ui/TerminalAction.java`
#### Snippet
```java
  private boolean myHidden = false;

  public TerminalAction(@NotNull TerminalActionPresentation presentation, @NotNull Predicate<KeyEvent> runnable) {
    myPresentation = presentation;
    myRunnable = runnable;
```

### BoundedWildcard
Can generalize to `? super Field`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
  }

  private static void collectFields(@NotNull Class clazz, @NotNull List<Field> result) {
    final List<Field> fields = getClassDeclaredFields(clazz);
    result.addAll(fields);
```

### BoundedWildcard
Can generalize to `? super Field`
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
  }

  private static Field processFields(@NotNull Class clazz, @NotNull Condition<Field> checker) {
    for (Field field : clazz.getDeclaredFields()) {
      if (checker.value(field)) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<V> map2List(@NotNull Collection<? extends T> collection, @NotNull Function<T, V> mapper) {
    if (collection.isEmpty()) return emptyList();
    List<V> list = new ArrayList<V>(collection.size());
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java

  @NotNull
  public static <T> T[] toArray(@NotNull List<T> collection, @NotNull T[] array) {
    final int length = array.length;
    if (length < ARRAY_COPY_THRESHOLD && array.length >= collection.size()) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(@NotNull Map<K, V> map) {
    return new com.intellij.util.containers.LinkedHashMap<K, V>(map);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(@NotNull Map<K, V> map) {
    return new com.intellij.util.containers.LinkedHashMap<K, V>(map);
  }
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K extends Comparable, V> TreeMap<K, V> newTreeMap(@NotNull Map<K, V> map) {
    return new TreeMap<K, V>(map);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K extends Comparable, V> TreeMap<K, V> newTreeMap(@NotNull Map<K, V> map) {
    return new TreeMap<K, V>(map);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
   */
  @NotNull
  public static <T> T[] toArray(@NotNull Collection<T> c, @NotNull T[] sample) {
    final int size = c.size();
    if (size == sample.length && size < ARRAY_COPY_THRESHOLD) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> LinkedHashMap<K,V> newLinkedHashMap(@NotNull Pair<K, V> first, @NotNull Pair<K, V>[] entries) {
    LinkedHashMap<K, V> map = newLinkedHashMap();
    map.put(first.getFirst(), first.getSecond());
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> LinkedHashMap<K,V> newLinkedHashMap(@NotNull Pair<K, V> first, @NotNull Pair<K, V>[] entries) {
    LinkedHashMap<K, V> map = newLinkedHashMap();
    map.put(first.getFirst(), first.getSecond());
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K, V> newHashMap(@NotNull List<K> keys, @NotNull List<V> values) {
    if (keys.size() != values.size()) {
      throw new IllegalArgumentException(keys + " should have same length as " + values);
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K, V> newHashMap(@NotNull List<K> keys, @NotNull List<V> values) {
    if (keys.size() != values.size()) {
      throw new IllegalArgumentException(keys + " should have same length as " + values);
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> Set<V> map2Set(@NotNull Collection<? extends T> collection, @NotNull Function<T, V> mapper) {
    if (collection.isEmpty()) return Collections.emptySet();
    Set <V> set = new HashSet<V>(collection.size());
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<V> map2List(@NotNull T[] array, @NotNull Function<T, V> mapper) {
    return map2List(Arrays.asList(array), mapper);
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> Set<V> map2Set(@NotNull T[] collection, @NotNull Function<T, V> mapper) {
    return map2Set(Arrays.asList(collection), mapper);
  }
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K, V> newHashMap(@NotNull Pair<K, ? extends V> first, @NotNull Pair<K, ? extends V>... entries) {
    Map<K, V> map = newHashMap(entries.length + 1);
    map.put(first.getFirst(), first.getSecond());
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure = true)
  public static <T> String join(@NotNull T[] items, @NotNull Function<T, String> f, @NotNull @NonNls String separator) {
    return join(Arrays.asList(items), f, separator);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> Object[] map2Array(@NotNull Collection<T> array, @NotNull Function<T, Object> mapper) {
    return map2Array(array, Object.class, mapper);
  }
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> Object[] map2Array(@NotNull Collection<T> array, @NotNull Function<T, Object> mapper) {
    return map2Array(array, Object.class, mapper);
  }
```

### BoundedWildcard
Can generalize to `? super V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<T> concat(@NotNull V[] array, @NotNull Function<V, Collection<? extends T>> fun) {
    return concat(Arrays.asList(array), fun);
  }
```

### BoundedWildcard
Can generalize to `? extends E`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
    private final List<E> myStore;

    private ImmutableListBackedByList(@NotNull List<E> list) {
      myStore = list;
    }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> boolean containsIdentity(@NotNull Iterable<T> list, T element) {
    for (T t : list) {
      if (t == element) {
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> Object[] map2Array(@NotNull T[] array, @NotNull Function<T, Object> mapper) {
    return map2Array(array, Object.class, mapper);
  }
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <KEY, VALUE> Map<KEY, VALUE> map2Map(@NotNull Collection<Pair<KEY, VALUE>> collection) {
    final Map<KEY, VALUE> result = new THashMap<KEY, VALUE>(collection.size());
    for (Pair<KEY, VALUE> pair : collection) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T,V> List<V> map(@NotNull Iterable<? extends T> iterable, @NotNull Function<T, V> mapping) {
    List<V> result = new ArrayList<V>();
    for (T t : iterable) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<V> mapNotNull(@NotNull Iterable<? extends T> iterable, @NotNull Function<T, V> mapping) {
    List<V> result = new ArrayList<V>();
    for (T t : iterable) {
```

### BoundedWildcard
Can generalize to `? extends Collection`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<T> concat(@NotNull Iterable<? extends V> list, @NotNull Function<V, Collection<? extends T>> listGenerator) {
    List<T> result = new ArrayList<T>();
    for (final V v : list) {
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static <T, KEY, VALUE> Map<KEY, VALUE> map2MapNotNull(@NotNull Collection<? extends T> collection,
                                                               @NotNull Function<T, Pair<KEY, VALUE>> mapper) {
    final Map<KEY, VALUE> set = new THashMap<KEY, VALUE>(collection.size());
    for (T t : collection) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K> THashSet<K> newIdentityTroveSet(@NotNull Collection<K> collection) {
    return new THashSet<K>(collection, ContainerUtil.<K>identityStrategy());
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> Iterator<T> iterate(@NotNull final Enumeration<T> enumeration) {
    return new Iterator<T>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> Set<T> union(@NotNull Set<T> set, @NotNull Set<T> set2) {
    Set<T> result = new THashSet<T>(set.size() + set2.size());
    result.addAll(set);
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> Set<T> union(@NotNull Set<T> set, @NotNull Set<T> set2) {
    Set<T> result = new THashSet<T>(set.size() + set2.size());
    result.addAll(set);
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static <T, KEY, VALUE> Map<KEY, VALUE> map2MapNotNull(@NotNull T[] collection,
                                                               @NotNull Function<T, Pair<KEY, VALUE>> mapper) {
    return map2MapNotNull(Arrays.asList(collection), mapper);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @Contract(pure = true)
  public static <T> T getOrElse(@NotNull List<T> elements, int i, T defaultValue) {
    return elements.size() > i ? elements.get(i) : defaultValue;
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> THashSet<T> newTroveSet(@NotNull TObjectHashingStrategy<T> strategy, @NotNull Collection<T> elements) {
    return new THashSet<T>(elements, strategy);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> Collection<T> subtract(@NotNull Collection<T> from, @NotNull Collection<T> what) {
    final Set<T> set = newHashSet(from);
    set.removeAll(what);
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @NotNull
  public static <T> List<T> collect(@NotNull Iterator<T> iterator) {
    if (!iterator.hasNext()) return emptyList();
    List<T> list = new ArrayList<T>();
```

### BoundedWildcard
Can generalize to `? super K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @NotNull
  public static <K,V> V[] convert(@NotNull K[] from, @NotNull V[] to, @NotNull Function<K,V> fun) {
    if (to.length < from.length) {
      @SuppressWarnings("unchecked") V[] array = (V[])Array.newInstance(to.getClass().getComponentType(), from.length);
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @NotNull
  public static <K,V> V[] convert(@NotNull K[] from, @NotNull V[] to, @NotNull Function<K,V> fun) {
    if (to.length < from.length) {
      @SuppressWarnings("unchecked") V[] array = (V[])Array.newInstance(to.getClass().getComponentType(), from.length);
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> T getFirstItem(@Nullable final Collection<T> items, @Nullable final T defaultResult) {
    return items == null || items.isEmpty() ? defaultResult : items.iterator().next();
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> THashSet<T> newTroveSet(@NotNull Collection<T> elements) {
    return new THashSet<T>(elements);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @NotNull
  public static <T> Set<T> collectSet(@NotNull Iterator<T> iterator) {
    if (!iterator.hasNext()) return Collections.emptySet();
    Set<T> hashSet = newHashSet();
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  }

  public static <T> void sort(@NotNull T[] a, @NotNull Comparator<T> comparator) {
    int size = a.length;

```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T,V> List<V> map(@NotNull Collection<? extends T> iterable, @NotNull Function<T, V> mapping) {
    if (iterable.isEmpty()) return emptyList();
    List<V> result = new ArrayList<V>(iterable.size());
```

### BoundedWildcard
Can generalize to `? extends E`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <E> List<E> reverse(@NotNull final List<E> elements) {
    if (elements.isEmpty()) {
      return ContainerUtilRt.emptyList();
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <T, KEY, VALUE> Map<KEY, VALUE> map2Map(@NotNull Collection<? extends T> collection,
                                                        @NotNull Function<T, Pair<KEY, VALUE>> mapper) {
    final Map<KEY, VALUE> set = new THashMap<KEY, VALUE>(collection.size());
    for (T t : collection) {
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K, V> intersection(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, V> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K, V> intersection(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, V> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K, V> intersection(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, V> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K, V> intersection(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, V> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<V> mapNotNull(@NotNull Collection<? extends T> iterable, @NotNull Function<T, V> mapping) {
    if (iterable.isEmpty()) {
      return emptyList();
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> V[] map(@NotNull T[] arr, @NotNull Function<T, V> mapping, @NotNull V[] emptyArray) {
    if (arr.length==0) {
      assert emptyArray.length == 0 : "You must pass an empty array";
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> V[] map(@NotNull T[] arr, @NotNull Function<T, V> mapping, @NotNull V[] emptyArray) {
    if (arr.length==0) {
      assert emptyArray.length == 0 : "You must pass an empty array";
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> V[] map2Array(@NotNull T[] array, @NotNull Class<? super V> aClass, @NotNull Function<T, V> mapper) {
    return map2Array(Arrays.asList(array), aClass, mapper);
  }
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> V[] map2Array(@NotNull T[] array, @NotNull Class<? super V> aClass, @NotNull Function<T, V> mapper) {
    return map2Array(Arrays.asList(array), aClass, mapper);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T,U> Iterator<U> mapIterator(@NotNull final Iterator<T> iterator, @NotNull final Function<T,U> mapper) {
    return new Iterator<U>() {
      @Override
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T,U> Iterator<U> mapIterator(@NotNull final Iterator<T> iterator, @NotNull final Function<T,U> mapper) {
    return new Iterator<U>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends U`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T,U> Iterator<U> mapIterator(@NotNull final Iterator<T> iterator, @NotNull final Function<T,U> mapper) {
    return new Iterator<U>() {
      @Override
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  }

  public static <T> boolean processSortedListsInOrder(@NotNull List<T> list1,
                                                      @NotNull List<T> list2,
                                                      @NotNull Comparator<? super T> comparator,
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  public static <T> boolean processSortedListsInOrder(@NotNull List<T> list1,
                                                      @NotNull List<T> list2,
                                                      @NotNull Comparator<? super T> comparator,
                                                      boolean mergeEqualItems,
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
                                                      @NotNull Comparator<? super T> comparator,
                                                      boolean mergeEqualItems,
                                                      @NotNull Processor<T> processor) {
    int index1 = 0;
    int index2 = 0;
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<V> mapNotNull(@NotNull T[] array, @NotNull Function<T, V> mapping) {
    return mapNotNull(Arrays.asList(array), mapping);
  }
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> List<T> sorted(@NotNull Iterable<T> list, @NotNull Comparator<? super T> comparator) {
    List<T> sorted = newArrayList(list);
    sort(sorted, comparator);
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K,Couple<V>> diff(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, Couple<V>> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K,Couple<V>> diff(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, Couple<V>> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? extends K`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K,Couple<V>> diff(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, Couple<V>> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <K, V> Map<K,Couple<V>> diff(@NotNull Map<K, V> map1, @NotNull Map<K, V> map2) {
    final Map<K, Couple<V>> res = newHashMap();
    final Set<K> keys = newHashSet();
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> List<T> unfold(@Nullable T t, @NotNull NullableFunction<T, T> next) {
    if (t == null) return emptyList();

```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T> List<T> unfold(@Nullable T t, @NotNull NullableFunction<T, T> next) {
    if (t == null) return emptyList();

```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> V getOrElse(@NotNull Map<T, V> result, final T key, @NotNull V defValue) {
    V value = result.get(key);
    return value == null ? defValue : value;
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<V> map(@NotNull T[] array, @NotNull Function<T, V> mapping) {
    List<V> result = new ArrayList<V>(array.length);
    for (T t : array) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> List<V> map(@NotNull T[] array, @NotNull Function<T, V> mapping) {
    List<V> result = new ArrayList<V>(array.length);
    for (T t : array) {
```

### BoundedWildcard
Can generalize to `? extends T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java

  @Contract(pure=true)
  public static <T> int indexOf(@NotNull List<T> list, @NotNull final T object) {
    return indexOf(list, new Condition<T>() {
      @Override
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> V[] mapNotNull(@NotNull T[] array, @NotNull Function<T, V> mapping, @NotNull V[] emptyArray) {
    List<V> result = new ArrayList<V>(array.length);
    for (T t : array) {
```

### BoundedWildcard
Can generalize to `? extends V`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, V> V[] mapNotNull(@NotNull T[] array, @NotNull Function<T, V> mapping, @NotNull V[] emptyArray) {
    List<V> result = new ArrayList<V>(array.length);
    for (T t : array) {
```

### BoundedWildcard
Can generalize to `? super T`
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @NotNull
  @Contract(pure=true)
  public static <T, KEY, VALUE> Map<KEY, VALUE> map2Map(@NotNull T[] collection, @NotNull Function<T, Pair<KEY, VALUE>> mapper) {
    return map2Map(Arrays.asList(collection), mapper);
  }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `NotNullCachedComputable` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/openapi/util/Computable.java`
#### Snippet
```java
  }

  abstract class NotNullCachedComputable<T> implements Computable<T> {
    private T myValue;

```

### AbstractClassNeverImplemented
Abstract class `NullableCachedComputable` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/openapi/util/Computable.java`
#### Snippet
```java
  }

  abstract class NullableCachedComputable<T> implements Computable<T> {
    private static final Object NULL_VALUE = new Object();
    private Object myValue;
```

### AbstractClassNeverImplemented
Abstract class `RecursionGuard` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/openapi/util/RecursionGuard.java`
#### Snippet
```java
 * @author peter
*/
public abstract class RecursionGuard {

  /**
```

### AbstractClassNeverImplemented
Abstract class `TwoWayAnimator` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/ui/components/TwoWayAnimator.java`
#### Snippet
```java
 * @author Sergey.Malenkov
 */
abstract class TwoWayAnimator {
  private final Alarm myAlarm = new Alarm();
  private final MyAnimator myForwardAnimator;
```

### AbstractClassNeverImplemented
Abstract class `ClickListener` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/ui/ClickListener.java`
#### Snippet
```java
import java.awt.event.MouseEvent;

public abstract class ClickListener {

  private static final int EPS = 4;
```

### AbstractClassNeverImplemented
Abstract class `TerminalActionProviderBase` has no concrete subclass
in `ui/src/com/jediterm/terminal/ui/TerminalActionProviderBase.java`
#### Snippet
```java
 * @author traff
 */
public abstract class TerminalActionProviderBase implements TerminalActionProvider {
  @Override
  public TerminalActionProvider getNextProvider() {
```

### AbstractClassNeverImplemented
Abstract class `Adapter` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/ui/components/JBLoadingPanelListener.java`
#### Snippet
```java


  abstract class Adapter implements JBLoadingPanelListener {
    @Override
    public void onLoadingStart() {
```

### AbstractClassNeverImplemented
Abstract class `ValidatingComponent` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/ui/components/panels/ValidatingComponent.java`
#### Snippet
```java
 * A label with possible error text is placed under validated component.
 */
public abstract class ValidatingComponent<T extends JComponent> extends NonOpaquePanel {
  private static final Font ERROR_FONT = UIUtil.getLabelFont().deriveFont(Font.PLAIN, 10f);

```

### AbstractClassNeverImplemented
Abstract class `BombedCharSequence` has no concrete subclass
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
   * i.e. when java.util.regex.Pattern match goes out of control.
   */
  public abstract static class BombedCharSequence implements CharSequence {
    private final CharSequence delegate;
    private int i;
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final static`
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
    private final static class DetectRetinaKit {

        private final static Map<GraphicsDevice, Boolean> devicesToRetinaSupportCacheMap = new HashMap<>();

        /**
```

### MissortedModifiers
Missorted modifiers `final static`
in `JediTerm/src/main/java/com/intellij/util/ui/DrawUtil.java`
#### Snippet
```java
     * Utility class for retina routine
     */
    private final static class DetectRetinaKit {

        private final static Map<GraphicsDevice, Boolean> devicesToRetinaSupportCacheMap = new HashMap<>();
```

### MissortedModifiers
Missorted modifiers `final static`
in `core/src/com/jediterm/terminal/emulator/charset/CharacterSets.java`
#### Snippet
```java
   * Denotes the mapping for C0 characters.
   */
  public final static Object[][] C0_CHARS = {{0, "nul"}, //
    {0, "soh"}, //
    {0, "stx"}, //
```

### MissortedModifiers
Missorted modifiers `final static`
in `core/src/com/jediterm/terminal/model/CharBuffer.java`
#### Snippet
```java
public class CharBuffer implements Iterable<Character>, CharSequence {

  public final static CharBuffer EMPTY = new CharBuffer(new char[0], 0, 0);

  private final char[] myBuf;
```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `JediTerm/src/main/java/com/intellij/ui/tabs/UiDecorator.java`
#### Snippet
```java
    private @Nullable
    final Font myLabelFont;
    private @Nullable
    final Insets myLabelInsets;

```

### MissortedModifiers
Missorted modifiers `private @Nullable`
in `JediTerm/src/main/java/com/intellij/ui/tabs/UiDecorator.java`
#### Snippet
```java

  class UiDecoration {
    private @Nullable
    final Font myLabelFont;
    private @Nullable
```

### MissortedModifiers
Missorted modifiers `private static @NotNull`
in `JediTerm/src/main/java/com/jediterm/example/BasicTerminalShellExample.java`
#### Snippet
```java
public class BasicTerminalShellExample {

  private static @NotNull JediTermWidget createTerminalWidget() {
    JediTermWidget widget = new JediTermWidget(80, 24, new DefaultSettingsProvider());
    widget.setTtyConnector(createTtyConnector());
```

### MissortedModifiers
Missorted modifiers `private static @NotNull`
in `JediTerm/src/main/java/com/jediterm/example/BasicTerminalShellExample.java`
#### Snippet
```java
  }

  private static @NotNull TtyConnector createTtyConnector() {
    try {
      Map<String, String> envs = System.getenv();
```

### MissortedModifiers
Missorted modifiers `private static @NotNull`
in `JediTerm/src/main/java/com/jediterm/example/BasicTerminalExample.java`
#### Snippet
```java
  }

  private static @NotNull JediTermWidget createTerminalWidget() {
    JediTermWidget widget = new JediTermWidget(80, 24, new DefaultSettingsProvider());
    PipedWriter terminalWriter = new PipedWriter();
```

### MissortedModifiers
Missorted modifiers `public @NotNull`
in `JediTerm/src/main/java/com/jediterm/terminal/ui/settings/DefaultTabbedSettingsProvider.java`
#### Snippet
```java

  @Override
  public @NotNull TerminalActionPresentation getPreviousTabActionPresentation() {
    return new TerminalActionPresentation("Previous Tab", UIUtil.isMac
      ? KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, InputEvent.CTRL_DOWN_MASK)
```

### MissortedModifiers
Missorted modifiers `public @NotNull`
in `JediTerm/src/main/java/com/jediterm/terminal/ui/settings/DefaultTabbedSettingsProvider.java`
#### Snippet
```java

  @Override
  public @NotNull TerminalActionPresentation getNextTabActionPresentation() {
    return new TerminalActionPresentation("Next Tab", UIUtil.isMac
      ? KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, InputEvent.CTRL_DOWN_MASK)
```

### MissortedModifiers
Missorted modifiers `public @NotNull`
in `JediTerm/src/main/java/com/jediterm/terminal/ui/settings/DefaultTabbedSettingsProvider.java`
#### Snippet
```java

  @Override
  public @NotNull TerminalActionPresentation getCloseSessionActionPresentation() {
    return new TerminalActionPresentation("Close Session", UIUtil.isMac
      ? KeyStroke.getKeyStroke(KeyEvent.VK_W, InputEvent.META_DOWN_MASK)
```

### MissortedModifiers
Missorted modifiers `public @NotNull`
in `JediTerm/src/main/java/com/jediterm/terminal/ui/settings/DefaultTabbedSettingsProvider.java`
#### Snippet
```java
  }
  @Override
  public @NotNull TerminalActionPresentation getNewSessionActionPresentation() {
    return new TerminalActionPresentation("New Session", UIUtil.isMac
      ? KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.META_DOWN_MASK)
```

### MissortedModifiers
Missorted modifiers `volatile private`
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
  private int myScrollRegionTop;
  private int myScrollRegionBottom;
  volatile private int myCursorX = 0;
  volatile private int myCursorY = 1;

```

### MissortedModifiers
Missorted modifiers `volatile private`
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
  private int myScrollRegionBottom;
  volatile private int myCursorX = 0;
  volatile private int myCursorY = 1;

  private int myTerminalWidth;
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `JediTerm/src/main/java/com/jediterm/app/JediTabbedTerminalWidget.java`
#### Snippet
```java

  public JediTabbedTerminalWidget(@NotNull TabbedSettingsProvider settingsProvider,
                                  final @NotNull Function<Pair<TerminalWidget, String>, JediTerminalWidget> createNewSessionAction, @NotNull Disposable parent) {
    super(settingsProvider, input -> createNewSessionAction.apply(Pair.create(input, null)));

```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        @NotNull
        JBTabsImpl myParent;
        private final
        @NotNull
        TabInfo myTabInfo;
```

### MissortedModifiers
Missorted modifiers `private final @NotNull`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
            implements Accessible, AccessibleComponent, AccessibleAction {

        private final
        @NotNull
        JBTabsImpl myParent;
```

### MissortedModifiers
Missorted modifiers `private @NotNull`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        }

        private
        @NotNull
        TabInfo getTabInfo() {
```

### MissortedModifiers
Missorted modifiers `public @NotNull`
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
  }

  public @NotNull T getCurrentSession() {
    if (myTabs != null) {
      return getTerminalPanel(myTabs.getSelectedIndex());
```

### MissortedModifiers
Missorted modifiers `final @NotNull`
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
    }

    private TabComponent(final @NotNull AbstractTabs<T> tabs, final T terminal) {
      super(new FlowLayout(FlowLayout.LEFT, 0, 0));
      myTerminal = terminal;
```

### MissortedModifiers
Missorted modifiers `private @NotNull`
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
  }

  private @NotNull T getTerminalPanel(int index) {
    Objects.checkIndex(index, myTabs.getTabCount());
    return myTabs.getComponentAt(index);
```

### MissortedModifiers
Missorted modifiers `final private`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private final TerminalTextBuffer myTerminalTextBuffer;

  final private StyleState myStyleState;

  /*scroll and cursor*/
```

### MissortedModifiers
Missorted modifiers `final private`
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  /*scroll and cursor*/
  final private TerminalCursor myCursor = new TerminalCursor();

  //we scroll a window [0, terminal_height] in the range [-history_lines_count, terminal_height]
```

## RuleId[id=CollectionAddedToSelf]
### CollectionAddedToSelf
'offer()' called on collection `queue` with itself as argument
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            @Override
            public void run() {
                queue.offer(queue);
            }
        });
```

## RuleId[id=IfStatementMissingBreakInLoop]
### IfStatementMissingBreakInLoop
Loop can be terminated after condition is met
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
        found = true;
        for (int j = 0; j < preposition.length(); j++) {
          if (toLowerCase(s.charAt(firstChar + j)) != preposition.charAt(j)) {
            found = false;
          }
```

## RuleId[id=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `ControlFlowException`
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java

  protected static Throwable checkException(@Nullable Throwable t) {
    return t instanceof ControlFlowException ? new Throwable("Control-flow exceptions should never be logged", t) : t;
  }
}
```

### InstanceofIncompatibleInterface
'instanceof' incompatible interface `TreeCellRenderer`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
  private boolean myIconOpaque = false;

  private boolean myAutoInvalidate = !(this instanceof TreeCellRenderer);

  private boolean myIconOnTheRight = false;
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    }

    if (part1.length == part2.length) {
      return 0;
    }
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `JediTerm/src/main/java/com/intellij/ui/components/JBLabelDecorator.java`
#### Snippet
```java

  public JBLabelDecorator setComponentStyleDecorative(@NotNull UIUtil.ComponentStyle componentStyle) {
    super.setComponentStyle(componentStyle);
    return this;
  }
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `JediTerm/src/main/java/com/intellij/ui/components/JBLabelDecorator.java`
#### Snippet
```java

  public JBLabelDecorator setFontColorDecorative(@NotNull UIUtil.FontColor fontColor) {
    super.setFontColor(fontColor);
    return this;
  }
```

## RuleId[id=CodeBlock2Expr]
### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/com/jediterm/terminal/TerminalStarter.java`
#### Snippet
```java

  public void postResize(@NotNull TermSize termSize, @NotNull RequestOrigin origin) {
    execute(() -> {
      resize(myEmulator, myTerminal, myTtyConnector, termSize, origin, (millisDelay, runnable) -> {
        myEmulatorExecutor.schedule(runnable, millisDelay, TimeUnit.MILLISECONDS);
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/com/jediterm/terminal/TerminalStarter.java`
#### Snippet
```java
  public void postResize(@NotNull TermSize termSize, @NotNull RequestOrigin origin) {
    execute(() -> {
      resize(myEmulator, myTerminal, myTtyConnector, termSize, origin, (millisDelay, runnable) -> {
        myEmulatorExecutor.schedule(runnable, millisDelay, TimeUnit.MILLISECONDS);
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
      myTerminalWidth = newTermSize.getColumns();
      myTerminalHeight = newTermSize.getRows();
      promptUpdated.thenRun(() -> {
        doResize(newTermSize, origin, oldHeight);
      });
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `ui/src/com/jediterm/terminal/ui/JediTermDefaultSearchComponent.java`
#### Snippet
```java

  private void listenForChanges() {
    Runnable settingsChanged = () -> {
      myMulticaster.searchSettingsChanged(myTextField.getText(), ignoreCaseCheckBox.isSelected());
    };
```

### CodeBlock2Expr
Statement lambda can be replaced with expression lambda
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    return List.of(
            new TerminalAction(mySettingsProvider.getOpenUrlActionPresentation(), input -> {
              return openSelectionAsURL();
            }).withEnabledSupplier(this::selectionTextIsUrl),
            new TerminalAction(mySettingsProvider.getCopyActionPresentation(), this::handleCopy) {
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
  public abstract boolean isDebugEnabled();

  public abstract void debug(@NonNls String message);

  public abstract void debug(@Nullable Throwable t);
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
  public abstract void debug(@NonNls String message);

  public abstract void debug(@Nullable Throwable t);

  public abstract void debug(@NonNls String message, @Nullable Throwable t);
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
  public abstract void debug(@Nullable Throwable t);

  public abstract void debug(@NonNls String message, @Nullable Throwable t);

  public void debug(@NotNull String message, @NotNull Object... details) {
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
  }

  public abstract void info(@NonNls String message);

  public abstract void info(@NonNls String message, @Nullable Throwable t);
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
  public abstract void info(@NonNls String message);

  public abstract void info(@NonNls String message, @Nullable Throwable t);

  public void warn(@NonNls String message) {
```

### EmptyMethod
Method only calls its super
in `JediTerm/src/main/java/com/intellij/openapi/ui/OnePixelDivider.java`
#### Snippet
```java

  @Override
  public void removeNotify() {
    super.removeNotify();
  }
```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/openapi/ui/OnePixelDivider.java`
#### Snippet
```java
  }

  private void init() {
  }

```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
  }

  public void dispose() {
  }

```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/ui/ColoredTextContainer.java`
#### Snippet
```java
  void setIcon(@Nullable Icon icon);

  void setToolTipText(@Nullable String text);
}
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/ui/components/JBLoadingPanelListener.java`
#### Snippet
```java
 */
public interface JBLoadingPanelListener {
  void onLoadingStart();

  void onLoadingFinish();
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/ui/components/JBLoadingPanelListener.java`
#### Snippet
```java
  void onLoadingStart();

  void onLoadingFinish();


```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java


  public static void init() { /* fake method to init foundation */ }

  private Foundation() {
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/TabsListener.java`
#### Snippet
```java
  void selectionChanged(TabInfo oldSelection, TabInfo newSelection);

  void beforeSelectionChanged(TabInfo oldSelection, TabInfo newSelection);
  
  void tabRemoved(TabInfo tabToRemove);
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/TabsListener.java`
#### Snippet
```java
  void tabRemoved(TabInfo tabToRemove);
  
  void tabsMoved();
  
  class Adapter implements TabsListener {
```

### EmptyMethod
Method only calls its super
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBEditorTabs.java`
#### Snippet
```java

  @Override
  protected SingleRowLayout createSingleRowLayout() {
    return super.createSingleRowLayout();
  }
```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBEditorTabs.java`
#### Snippet
```java
  }

  public static void setAlphabeticalMode(boolean on) {
    //
  }
```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    }

    public void showMorePopup(@Nullable final MouseEvent e) {

    }
```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    }

    private void updateTabActions(final TabInfo info) {
    }

```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    }

    void moveDraggedTabLabel() {
    }

```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    }

    private void adjust(final TabInfo each) {
    }

```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
    }

    private void handlePopup(MouseEvent e) {

    }
```

### EmptyMethod
All implementations of this method are empty
in `JediTerm/src/main/java/com/intellij/util/Consumer.java`
#### Snippet
```java
   * t is supposed to be a not-null value. If you need to pass {@code null}s to the consumer use {@link NullableConsumer} instead
   */
  void consume(T t);
}
```

### EmptyMethod
The method is empty
in `JediTerm/src/main/java/com/intellij/util/ui/RegionPainter.java`
#### Snippet
```java
     * @param image the cached image to update
     */
    protected void updateImage(BufferedImage image) {
    }

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/TerminalKeyEncoder.java`
#### Snippet
```java

  private boolean myAltSendsEscape = true;
  private boolean myMetaSendsEscape = false;

  public TerminalKeyEncoder() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/intellij/util/ui/NSScrollerHelper.java`
#### Snippet
```java
  public enum Style {Legacy, Overlay}

  private static ClickBehavior ourClickBehavior = null;
  private static final List<Reference<ScrollbarStyleListener>> ourStyleListeners = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/DataStreamIteratingEmulator.java`
#### Snippet
```java
  protected final Terminal myTerminal;

  private boolean myEof = false;

  public DataStreamIteratingEmulator(TerminalDataStream dataStream, Terminal terminal) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/com/jediterm/terminal/SubstringFinder.java`
#### Snippet
```java
  private final ArrayList<TextToken> myTokens = new ArrayList<>();
  private int myFirstIndex;
  private int myPower = 0;

  private final FindResult myResult = new FindResult();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/com/jediterm/terminal/SubstringFinder.java`
#### Snippet
```java
    private final List<FindItem> items = new ArrayList<>();
    private final Map<CharBuffer, List<Pair<Integer, Integer>>> ranges = new HashMap<>();
    private int selectedItem = 0;

    public List<Pair<Integer, Integer>> getRanges(CharBuffer characters) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ui/src/com/jediterm/terminal/model/JediTermTypeAheadModel.java`
#### Snippet
```java
  private @NotNull TypeAheadTerminalModel.ShellType myShellType = ShellType.Unknown;

  private boolean isPredictionsApplied = false;

  public JediTermTypeAheadModel(@NotNull Terminal terminal,
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `JediTerm/src/main/java/com/intellij/openapi/ui/ClickListener.java`
#### Snippet
```java
      private Point lastClickPoint;
      private long lastTimeClicked = -1;
      private int clickCount = 0;

      @Override
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredText.java`
#### Snippet
```java
  private final ArrayList<String> myTexts;
  private final ArrayList<SimpleTextAttributes> myAttributes;
  private String myCachedToString = null;

  public SimpleColoredText() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java
  private LinesBuffer myScreenBufferBackup; // to store textBuffer after switching to alternate buffer

  private boolean myAlternateBuffer = false;

  private boolean myUsingAlternateBuffer = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java
  private boolean myAlternateBuffer = false;

  private boolean myUsingAlternateBuffer = false;

  private final List<TerminalModelListener> myListeners = new CopyOnWriteArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java
      final StringBuilder sb = new StringBuilder();
      myScreenBuffer.processLines(0, myHeight, new StyledTextConsumerAdapter() {
        int count = 0;

        @Override
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `JediTerm/src/main/java/com/intellij/ui/ClickListener.java`
#### Snippet
```java
      private Point lastClickPoint;
      private long lastTimeClicked = -1;
      private int clickCount = 0;

      @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
   */
  private boolean myVerticalSplit;
  private boolean myHonorMinimumSize = false;
  private final float myMinProp;
  private final float myMaxProp;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java
    private final List<TextEntry> myTextEntries = new ArrayList<>();

    private int myLength = 0;

    public void add(TextEntry entry) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/model/TerminalLine.java`
#### Snippet
```java

  private TextEntries myTextEntries = new TextEntries();
  private boolean myWrapped = false;
  private final List<TerminalLineIntervalHighlighting> myCustomHighlightings = new ArrayList<>();
  TerminalLine myTypeAheadLine;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/ScrollableSingleRowLayout.java`
#### Snippet
```java
public class ScrollableSingleRowLayout extends SingleRowLayout {
  private int myScrollOffset = 0;
  private boolean myScrollSelectionInViewPending = false;

  public ScrollableSingleRowLayout(final JBTabsImpl tabs) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/ScrollableSingleRowLayout.java`
#### Snippet
```java
 */
public class ScrollableSingleRowLayout extends SingleRowLayout {
  private int myScrollOffset = 0;
  private boolean myScrollSelectionInViewPending = false;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(JediEmulator.class);

  private static int logThrottlerCounter = 0;
  private static int logThrottlerRatio = 100;
  private static int logThrottlerLimit = logThrottlerRatio;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java

  private static final Map<String, RunnableInfo> ourMainThreadRunnables = new HashMap<String, RunnableInfo>();
  private static long ourCurrentRunnableCount = 0;
  private static final Object RUNNABLE_LOCK = new Object();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/emulator/ControlSequence.java`
#### Snippet
```java

  private boolean myStartsWithQuestionMark = false; // true when CSI ?
  private boolean myStartsWithMoreMark = false; // true when CSI >

  private final StringBuilder mySequenceString = new StringBuilder();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/emulator/ControlSequence.java`
#### Snippet
```java
  private ArrayList<Character> myUnhandledChars;

  private boolean myStartsWithQuestionMark = false; // true when CSI ?
  private boolean myStartsWithMoreMark = false; // true when CSI >

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java

  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
  private Point myLastMotionReport = null;
  private boolean myCursorYChanged;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
  private int myScrollRegionTop;
  private int myScrollRegionBottom;
  volatile private int myCursorX = 0;
  volatile private int myCursorY = 1;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
  private final StyleState myStyleState;

  private StoredCursor myStoredCursor = null;

  private final EnumSet<TerminalMode> myModes = EnumSet.noneOf(TerminalMode.class);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java

  @Nullable
  private TerminalOutputStream myTerminalOutput = null;

  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private boolean myPaintFocus;

    private boolean myHideTabs = false;

    private boolean myRequestFocusOnLastFocusedComponent = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    public boolean myHorizontalSide = true;

    private boolean myStealthTabMode = false;

    private boolean mySideComponentOnTabs = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private boolean myHideTabs = false;

    private boolean myRequestFocusOnLastFocusedComponent = false;
    private boolean myListenerAdded;
    final Set<TabInfo> myAttractions = new HashSet<>();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    boolean myAddNavigationGroup = true;

    private boolean myGhostsAlwaysVisible = false;
    private boolean myDisposed;
    private boolean myToDrawBorderIfTabsHidden = true;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
  private TerminalPanelListener myTerminalPanelListener = null;

  private T myTermWidget = null;

  private AbstractTabs<T> myTabs;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
  private final Object myLock = new Object();

  private TerminalPanelListener myTerminalPanelListener = null;

  private T myTermWidget = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
  private boolean myAutoInvalidate = !(this instanceof TreeCellRenderer);

  private boolean myIconOnTheRight = false;
  private boolean myTransparentIconBackground;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
  @JdkConstants.HorizontalAlignment private int myTextAlign = SwingConstants.LEFT;

  private boolean myIconOpaque = false;

  private boolean myAutoInvalidate = !(this instanceof TreeCellRenderer);
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
  private Font myLayoutFont;
  private final List<SimpleTextAttributes> myAttributes;
  private List<Object> myFragmentTags = null;
  private TIntIntHashMap myFragmentAlignment;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java
  // guards the terminal prompt. All predictions that try to move the cursor beyond leftmost cursor position are tentative
  private Integer myLeftMostCursorPosition = null;
  private boolean myIsNotPasswordPrompt = false;
  private @Nullable TypeAheadPrediction myLastSuccessfulPrediction = null;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java
  private boolean myIsShowingPredictions = false;
  // if true, new predictions will only be generated if the user isn't typing for a certain amount of time
  private volatile boolean myOutOfSyncDetected = false;
  private long myLastTypedTime;
  // guards the terminal prompt. All predictions that try to move the cursor beyond leftmost cursor position are tentative
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java
    public EventType myEventType;
    // if event is Character it will hold character
    private @Nullable Character myCharacter = null;

    public TypeAheadEvent(EventType eventType) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java

  // if false, predictions will still be generated for latency statistics but won't be displayed
  private boolean myIsShowingPredictions = false;
  // if true, new predictions will only be generated if the user isn't typing for a certain amount of time
  private volatile boolean myOutOfSyncDetected = false;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java
  private Integer myLeftMostCursorPosition = null;
  private boolean myIsNotPasswordPrompt = false;
  private @Nullable TypeAheadPrediction myLastSuccessfulPrediction = null;

  public TerminalTypeAheadManager(@NotNull TypeAheadTerminalModel terminalModel) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/core/typeahead/TerminalTypeAheadManager.java`
#### Snippet
```java
  private long myLastTypedTime;
  // guards the terminal prompt. All predictions that try to move the cursor beyond leftmost cursor position are tentative
  private Integer myLeftMostCursorPosition = null;
  private boolean myIsNotPasswordPrompt = false;
  private @Nullable TypeAheadPrediction myLastSuccessfulPrediction = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/terminal/model/StyleState.java`
#### Snippet
```java
  private TextStyle myDefaultStyle = TextStyle.EMPTY;
  
  private TextStyle myMergedStyle = null;

  public StyleState() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `JediTerm/src/main/java/com/intellij/util/containers/ImmutableList.java`
#### Snippet
```java
     * Index of element to be returned by subsequent call to next.
     */
    int cursor = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `core/src/com/jediterm/terminal/model/JediTermDebouncerImpl.java`
#### Snippet
```java
  private final long myDelay;

  private TimerTask myTimerTask = null;

  public JediTermDebouncerImpl(Runnable runnable, long delay) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/openapi/ui/OnePixelDivider.java`
#### Snippet
```java
  }

  private boolean myDragging = false;

  private void setDragging(boolean dragging) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/intellij/ui/JBSplitter.java`
#### Snippet
```java
   */
  @Nullable
  private String mySplitterProportionKey = null;
  private final float myDefaultProportion;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/intellij/ui/components/JBLabel.java`
#### Snippet
```java
  private JComponent myAnchor = null;
  private JEditorPane myEditorPane = null;
  private JLabel myIconLabel = null;
  private boolean myMultiline = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/intellij/ui/components/JBLabel.java`
#### Snippet
```java
  private UIUtil.FontColor myFontColor = UIUtil.FontColor.NORMAL;
  private JComponent myAnchor = null;
  private JEditorPane myEditorPane = null;
  private JLabel myIconLabel = null;
  private boolean myMultiline = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `JediTerm/src/main/java/com/intellij/ui/components/JBLabel.java`
#### Snippet
```java
  private JEditorPane myEditorPane = null;
  private JLabel myIconLabel = null;
  private boolean myMultiline = false;

  public JBLabel() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `JediTerm/src/main/java/com/intellij/ui/components/JBLabel.java`
#### Snippet
```java
  private UIUtil.ComponentStyle myComponentStyle = UIUtil.ComponentStyle.REGULAR;
  private UIUtil.FontColor myFontColor = UIUtil.FontColor.NORMAL;
  private JComponent myAnchor = null;
  private JEditorPane myEditorPane = null;
  private JLabel myIconLabel = null;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalAction.java`
#### Snippet
```java
  private Integer myMnemonicKeyCode = null;
  private boolean mySeparatorBefore = false;
  private boolean myHidden = false;

  public TerminalAction(@NotNull TerminalActionPresentation presentation, @NotNull Predicate<KeyEvent> runnable) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalAction.java`
#### Snippet
```java
  private Supplier<Boolean> myEnabledSupplier = () -> true;
  private Integer myMnemonicKeyCode = null;
  private boolean mySeparatorBefore = false;
  private boolean myHidden = false;

```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalAction.java`
#### Snippet
```java

  private Supplier<Boolean> myEnabledSupplier = () -> true;
  private Integer myMnemonicKeyCode = null;
  private boolean mySeparatorBefore = false;
  private boolean myHidden = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `core/src/com/jediterm/terminal/model/TerminalLineIntervalHighlighting.java`
#### Snippet
```java
  private final int myEndOffset;
  private final TextStyle myStyle;
  private boolean myDisposed = false;

  TerminalLineIntervalHighlighting(@NotNull TerminalLine line, int startOffset, int length, @NotNull TextStyle style) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private boolean myMonospaced;
  private TermSize myTermSize;
  private boolean myInitialSizeSyncDone = false;

  private TerminalStarter myTerminalStarter = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
  private Point mySelectionStartPoint = null;
  private TerminalSelection mySelection = null;

  private final TerminalCopyPasteHandler myCopyPasteHandler;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private TerminalTypeAheadManager myTypeAheadManager;
  private volatile boolean myBracketedPasteMode;
  private boolean myUsingAlternateBuffer = false;
  private boolean myFillCharacterBackgroundIncludingLineSpacing;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private Font myBoldItalicFont;
  private int myDescent = 0;
  private int mySpaceBetweenLines = 0;
  protected final Dimension myCharSize = new Dimension();
  private boolean myMonospaced;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private Font myBoldFont;
  private Font myBoldItalicFont;
  private int myDescent = 0;
  private int mySpaceBetweenLines = 0;
  protected final Dimension myCharSize = new Dimension();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private boolean myInitialSizeSyncDone = false;

  private TerminalStarter myTerminalStarter = null;

  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private SubstringFinder.FindResult myFindResult;

  private LinkInfo myHoveredHyperlink = null;

  private int myCursorType = Cursor.DEFAULT_CURSOR;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
  private Point mySelectionStartPoint = null;
  private TerminalSelection mySelection = null;

```

## RuleId[id=PrivatePropertyName]
### PrivatePropertyName
Private property name `MAX_LOG_SIZE` should not contain underscores in the middle or the end
in `JediTerm/src/main/kotlin/com/jediterm/app/JediTermMain.kt`
#### Snippet
```java
  ) :
    PtyProcessTtyConnector(process, charset, command), LoggingTtyConnector {
    private val MAX_LOG_SIZE = 200

    private val myDataChunks = LinkedList<CharArray>()
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `TableModel`
in `JediTerm/src/main/java/com/intellij/ui/components/MultiColumnListModel.java`
#### Snippet
```java
 * @author Konstantin Bulenkov
 */
public abstract class MultiColumnListModel extends AbstractTableModel implements TableModel {
  private final ListModel myModel;

```

### RedundantImplements
Redundant interface declaration `Accessible`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
import java.awt.image.BufferedImage;

public class TabLabel extends JPanel implements Accessible {
    protected final SimpleColoredComponent myLabel;

```

### RedundantImplements
Redundant interface declaration `Accessible`
in `JediTerm/src/main/java/com/intellij/ui/components/JBMenu.java`
#### Snippet
```java
import javax.swing.*;

public class JBMenu extends JMenu implements Accessible {
  @Override
  public AccessibleContext getAccessibleContext() {
```

### RedundantImplements
Redundant interface declaration `Accessible`
in `JediTerm/src/main/java/com/intellij/ui/components/JBCheckBoxMenuItem.java`
#### Snippet
```java
import javax.swing.*;

public class JBCheckBoxMenuItem extends JCheckBoxMenuItem implements Accessible {
  @Override
  public AccessibleContext getAccessibleContext() {
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `EOF` does not end with 'Exception'
in `core/src/com/jediterm/terminal/TerminalDataStream.java`
#### Snippet
```java
  boolean isEmpty();

  class EOF extends IOException {
    public EOF() {
      super("EOF: There is no more data or connection is lost");
```

## RuleId[id=ArrayEquality]
### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java

  public static int compare(@Nullable byte[] o1, @Nullable byte[] o2) {
    if (o1 == o2) return 0;
    if (o1 == null) return 1;
    if (o2 == null) return -1;
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java
  public static <T> boolean equal(@Nullable T[] arr1, @Nullable T[] arr2) {
    if (arr1 == null || arr2 == null) {
      return arr1 == arr2;
    }
    return Arrays.equals(arr1, arr2);
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java
  public static <T> boolean haveEqualElements(@Nullable T[] a, @Nullable T[] b) {
    if (a == null || b == null) {
      return a == b;
    }

```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <T> boolean equals(@NotNull T[] a1, @NotNull T[] a2, @NotNull Equality<? super T> comparator) {
    if (a1 == a2) {
      return true;
    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <E> boolean startsWith(@NotNull E[] array, @NotNull E[] subArray) {
    if (array == subArray) {
      return true;
    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static boolean startsWith(@NotNull byte[] array, @NotNull byte[] prefix) {
    if (array == prefix) {
      return true;
    }
```

### ArrayEquality
Array objects are compared using `==`, not 'Arrays.equals()'
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <T> boolean equals(@NotNull T[] a1, @NotNull T[] a2, @NotNull Comparator<? super T> comparator) {
    if (a1 == a2) {
      return true;
    }
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer result` may be declared as 'StringBuilder'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  public static String formatLinks(@NotNull String message) {
    Pattern linkPattern = Pattern.compile("http://[a-zA-Z0-9\\./\\-\\+]+");
    StringBuffer result = new StringBuffer();
    Matcher m = linkPattern.matcher(message);
    while (m.find()) {
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java

  public void error(@NonNls String message) {
    error(message, new Throwable(), new String[0]);
  }
  public void error(Object message) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java

  public void error(@NonNls String message, @Nullable Throwable e) {
    error(message, e, new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java

  public void error(@NotNull Throwable t) {
    error(t.getMessage(), t, new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
    int start = 0;
    int end = text.length();
    AttributedCharacterIterator it = string.getIterator(new AttributedCharacterIterator.Attribute[0], start, end);
    Font currentFont = basefont;
    int currentIndex = start;
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `c > 0x1F` is always `true`
in `core/src/com/jediterm/terminal/util/CharUtils.java`
#### Snippet
```java
      sb.append(" DEL");
      return CharacterType.NONPRINTING;
    } else if (c > 0x1F && c <= 0x7E) {
      if (last != CharacterType.PRINTING) sb.append(EMPTY_CHAR);
      sb.append(c);
```

### ConstantValue
Condition `original >= C0_START` is always `true`
in `core/src/com/jediterm/terminal/emulator/charset/CharacterSets.java`
#### Snippet
```java
  private static Object[] getMapping(char original, GraphicSet gl, GraphicSet gr) {
    int mappedChar = original;
    if (original >= C0_START && original <= C0_END) {
      int idx = original - C0_START;
      return C0_CHARS[idx];
```

### ConstantValue
Condition `original >= GL_START` is always `true`
in `core/src/com/jediterm/terminal/emulator/charset/CharacterSets.java`
#### Snippet
```java
      return C1_CHARS[idx];
    }
    else if (original >= GL_START && original <= GL_END) {
      int idx = original - GL_START;
      mappedChar = gl.map(original, idx);
```

### ConstantValue
Condition `value || assertTrue(false, null)` is always `true`
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
  @Contract("false->fail") // wrong, but avoid quite a few warnings in the code
  public boolean assertTrue(boolean value) {
    return value || assertTrue(false, null);
  }

```

### ConstantValue
Condition `myShowDividerControls && false` is always `false`
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
                                                       new Insets(0, 0, 0, 0), 0, 0));

      if (myShowDividerControls && false) {
        int glueFill = isVerticalSplit ? GridBagConstraints.VERTICAL : GridBagConstraints.HORIZONTAL;
        int xMask = isVerticalSplit ? 1 : 0;
```

### ConstantValue
Value `myFirstComponent` is always 'null'
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
      }
      else {
        hideNull(myFirstComponent);
      }
      if (mySecondComponent != null) {
```

### ConstantValue
Value `mySecondComponent` is always 'null'
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
      }
      else {
        hideNull(mySecondComponent);
      }
    }
```

### ConstantValue
Condition `childCount <= 3` is always `true`
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
      throw new IllegalStateException("" + childCount);
    }
    LOG.assertTrue(childCount <= 3);
    if (childCount == 1) {
      setFirstComponent((JComponent)comp);
```

### ConstantValue
Condition `info != null` is always `true`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        public void addAccessibleSelection(int i) {
            TabInfo info = getTabAt(i);
            if (info != null) {
                select(info, false);
            }
```

### ConstantValue
Condition `myRemoveDeferredRequest == executionRequest` is always `true`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java

        final Runnable onDone = () -> {
            if (myRemoveDeferredRequest == executionRequest) {
                removeDeferredNow();
            }
```

### ConstantValue
Condition `component != this || component != null` is always `true`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        Component component = findComponentAt(point);
        if (component == null) return null;
        while (component != this || component != null) {
            if (component instanceof TabLabel) {
                return ((TabLabel) component).getInfo();
```

### ConstantValue
Condition `component != null` is always `true` when reached
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        Component component = findComponentAt(point);
        if (component == null) return null;
        while (component != this || component != null) {
            if (component instanceof TabLabel) {
                return ((TabLabel) component).getInfo();
```

### ConstantValue
Condition `firstShowing` is always `true`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
            shape.quadTo(leftX, topY, leftX + shape.deltaX(arc), topY);
        } else {
            if (firstShowing) {
                shape.moveTo(leftX, topY + shape.deltaY(getEdgeArcSize()));
                shape.quadTo(leftX, topY, leftX + shape.deltaX(getEdgeArcSize()), topY);
```

### ConstantValue
Condition `lastShowing` is always `true`
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
            shape.lineTo(rightX, bottomY);
        } else {
            if (lastShowing) {
                shape.lineTo(rightX - shape.deltaX(arc), topY);
                shape.quadTo(rightX + 1, topY, rightX + 1, topY + shape.deltaY(arc));
```

### ConstantValue
Condition `lcdContrastValue == 0` is always `true`
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

        // Evaluate the value depending on our current theme
        if (lcdContrastValue == 0) {
            if (SystemInfo.isMacIntel64) {
                lcdContrastValue = isUnderDarcula() ? 140 : 230;
```

### ConstantValue
Condition `font != null` is always `true`
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java

    Font font = getBaseFont();
    LOG.assertTrue(font != null);

    width += computeTextWidth(font, mainTextOnly);
```

### ConstantValue
Condition `event == null` is always `false`
in `JediTerm/src/main/java/com/intellij/openapi/ui/OnePixelDivider.java`
#### Snippet
```java
    private void _processMouseEvent(MouseEvent e) {
      MouseEvent event = getTargetEvent(e);
      if (event == null) {
        return;
      }
```

### ConstantValue
Condition `event == null` is always `false`
in `JediTerm/src/main/java/com/intellij/openapi/ui/OnePixelDivider.java`
#### Snippet
```java
    private void _processMouseMotionEvent(MouseEvent e) {
      MouseEvent event = getTargetEvent(e);
      if (event == null) {
        return;
      }
```

### ConstantValue
Condition `field != null` is always `true`
in `ui/src/com/jediterm/terminal/ui/UIUtil.java`
#### Snippet
```java
        Field field = device.getClass().getDeclaredField("scale");

        if (field != null) {
          field.setAccessible(true);
          Object scale = field.get(device);
```

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `getInstance()` tries to override a static method of a superclass
in `JediTerm/src/main/java/com/intellij/util/containers/EmptyListIterator.java`
#### Snippet
```java
  private static final EmptyListIterator<Object> INSTANCE = new EmptyListIterator<Object>();

  public static <E> EmptyListIterator<E> getInstance() {
    //noinspection unchecked
    return (EmptyListIterator<E>)INSTANCE;
```

## RuleId[id=FieldMayBeStatic]
### FieldMayBeStatic
Field `myAdjustBorders` may be 'static'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private boolean myPaintBlocked;
    private BufferedImage myImage;
    private final boolean myAdjustBorders = true;

    boolean myAddNavigationGroup = true;
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `GraphicsUtil` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/ui/GraphicsUtil.java`
#### Snippet
```java
 * @author Konstantin Bulenkov
 */
public class GraphicsUtil {
  @SuppressWarnings("UndesirableClassUsage")
  private static final Graphics2D ourGraphics = new BufferedImage(1,1,BufferedImage.TYPE_INT_ARGB).createGraphics();
```

### UtilityClassWithoutPrivateConstructor
Class `Registry` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/openapi/util/registry/Registry.java`
#### Snippet
```java
 * Created by traff on 22/08/16.
 */
public class Registry {
    public static boolean is(String s) {
        return true;
```

### UtilityClassWithoutPrivateConstructor
Class `NSScrollerHelper` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/ui/NSScrollerHelper.java`
#### Snippet
```java
import static com.intellij.ui.mac.foundation.Foundation.invoke;

class NSScrollerHelper {
  private static final Callback APPEARANCE_CALLBACK = new Callback() {
    @SuppressWarnings("UnusedDeclaration")
```

### UtilityClassWithoutPrivateConstructor
Class `ThrowableInterner` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/openapi/util/objectTree/ThrowableInterner.java`
#### Snippet
```java
 * 1) too slow and 2) explodes Throwable retained size by polluting Throwable.stackTrace fields.
 */
public class ThrowableInterner {
  // all removed
  private static Object[] getBacktrace(@NotNull Throwable throwable) {
```

### UtilityClassWithoutPrivateConstructor
Class `Util` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java

// In Java 5, the java.util.Arrays class has no copyOf() members...
public class Util {
  @SuppressWarnings("unchecked")
  public static <T> T[] copyOf(T[] original, int newLength) {
```

### UtilityClassWithoutPrivateConstructor
Class `Borders` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
  }

  public static class Borders {
    public static JBEmptyBorder empty(int top, int left, int bottom, int right) {
      return new JBEmptyBorder(top, left, bottom, right);
```

### UtilityClassWithoutPrivateConstructor
Class `JBUI` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
 * @author Konstantin Bulenkov
 */
public class JBUI {
  private static final Logger LOG = Logger.getInstance("#com.intellij.util.ui.JBUI");

```

### UtilityClassWithoutPrivateConstructor
Class `Fonts` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
  }

  public static class Fonts {
    public static JBFont label() {
      return JBFont.create(UIManager.getFont("Label.font"), false);
```

### UtilityClassWithoutPrivateConstructor
Class `BitUtil` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/BitUtil.java`
#### Snippet
```java
package com.intellij.util;

public class BitUtil {
  public static boolean isSet(byte value, byte mask) {
    assertOneBitMask(mask);
```

### UtilityClassWithoutPrivateConstructor
Class `ComparableObjectCheck` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/ui/update/ComparableObjectCheck.java`
#### Snippet
```java


public class ComparableObjectCheck {
  public static boolean equals(@NotNull ComparableObject me, Object him) {
    if (me == him) {
```

### UtilityClassWithoutPrivateConstructor
Class `RetinaImage` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/RetinaImage.java`
#### Snippet
```java
 * @author Konstantin Bulenkov
 */
public class RetinaImage {
  /**
   * Creates a Retina-aware wrapper over a raw image.
```

### UtilityClassWithoutPrivateConstructor
Class `SelectionUtil` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/jediterm/terminal/model/SelectionUtil.java`
#### Snippet
```java
 * @author traff
 */
public class SelectionUtil {
  private static final Logger LOG = LoggerFactory.getLogger(SelectionUtil.class);
  
```

### UtilityClassWithoutPrivateConstructor
Class `InputEvent` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/jediterm/core/input/InputEvent.java`
#### Snippet
```java
package com.jediterm.core.input;

public final class InputEvent {
  public static final int SHIFT_MASK = Event.SHIFT_MASK;
  public static final int ALT_MASK = Event.ALT_MASK;
```

### UtilityClassWithoutPrivateConstructor
Class `KeyEvent` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/jediterm/core/input/KeyEvent.java`
#### Snippet
```java
package com.jediterm.core.input;

public final class KeyEvent {
  public static final int VK_ENTER          = '\n';
  public static final int VK_BACK_SPACE     = '\b';
```

### UtilityClassWithoutPrivateConstructor
Class `BasicTerminalShellExample` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/jediterm/example/BasicTerminalShellExample.java`
#### Snippet
```java
import java.util.Map;

public class BasicTerminalShellExample {

  private static @NotNull JediTermWidget createTerminalWidget() {
```

### UtilityClassWithoutPrivateConstructor
Class `BasicTerminalExample` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/jediterm/example/BasicTerminalExample.java`
#### Snippet
```java
import java.io.PipedWriter;

public class BasicTerminalExample {
  private static final char ESC = 27;

```

### UtilityClassWithoutPrivateConstructor
Class `AppExecutorUtil` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/concurrency/AppExecutorUtil.java`
#### Snippet
```java
import java.util.concurrent.TimeUnit;

public class AppExecutorUtil {
  /**
   * Returns application-wide instance of {@link ScheduledExecutorService} which is:
```

### UtilityClassWithoutPrivateConstructor
Class `NSWorkspace` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/NSWorkspace.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class NSWorkspace {
  @Nullable
  public static String absolutePathForAppBundleWithIdentifier(@NotNull String bundleID) {
```

### UtilityClassWithoutPrivateConstructor
Class `BoundedTaskExecutor` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/concurrency/BoundedTaskExecutor.java`
#### Snippet
```java
 * The number of submitted tasks is unrestricted.
 */
public class BoundedTaskExecutor  {

  // for diagnostics
```

### UtilityClassWithoutPrivateConstructor
Class `MouseButtonModifierFlags` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/jediterm/terminal/emulator/mouse/MouseButtonModifierFlags.java`
#### Snippet
```java
 * @author traff
 */
public class MouseButtonModifierFlags {
  // keyboard modifier flag
  //  4 - shift
```

### UtilityClassWithoutPrivateConstructor
Class `AppleHiDPIScaledImage` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/AppleHiDPIScaledImage.java`
#### Snippet
```java
 * @author Konstantin Bulenkov
 */
public class AppleHiDPIScaledImage {
  public static BufferedImage create(int width, int height, int imageType) {
    return new CImage.HiDPIScaledImage(width, height, imageType) {
```

### UtilityClassWithoutPrivateConstructor
Class `AwtTransformers` has only 'static' members, and lacks a 'private' constructor
in `ui/src/com/jediterm/terminal/ui/AwtTransformers.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public final class AwtTransformers {

  @Contract(value = "null -> null; !null -> new", pure = true)
```

### UtilityClassWithoutPrivateConstructor
Class `UIUtil` has only 'static' members, and lacks a 'private' constructor
in `ui/src/com/jediterm/terminal/ui/UIUtil.java`
#### Snippet
```java
 * @author traff
 */
public class UIUtil {
  public static final String OS_NAME = System.getProperty("os.name");
  public static final String OS_VERSION = System.getProperty("os.version").toLowerCase();
```

### UtilityClassWithoutPrivateConstructor
Class `MouseButtonCodes` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/jediterm/terminal/emulator/mouse/MouseButtonCodes.java`
#### Snippet
```java
 * @author traff
 */
public class MouseButtonCodes {
  // X11 button number
  public static final int NONE = -1;       // no button
```

### UtilityClassWithoutPrivateConstructor
Class `Event` has only 'static' members, and lacks a 'private' constructor
in `core/src/com/jediterm/core/input/Event.java`
#### Snippet
```java
package com.jediterm.core.input;

final class Event {
  public static final int SHIFT_MASK          = 1;
  public static final int ALT_MASK            = 1 << 3;
```

### UtilityClassWithoutPrivateConstructor
Class `Mac` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
                                                              new ScrollPainter(0, .25f, .15f, Gray.x80, Gray.x59));

    static final class Mac {
      static final RegionPainter<Float> DARCULA = new Round(1, .35f, .20f, Gray.xA6, Gray.x0D);
      static final RegionPainter<Float> DEFAULT = Thumb.Mac.DEFAULT;
```

### UtilityClassWithoutPrivateConstructor
Class `Overlay` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
      static final RegionPainter<Float> DEFAULT = new Round(2, .20f, .30f, Gray.x00, null);

      static final class Overlay {
        static final RegionPainter<Float> DARCULA = new Round(1, 0f, .55f, Gray.x80, Gray.x26);
        static final RegionPainter<Float> DEFAULT = new Round(2, 0f, .50f, Gray.x00, null);
```

### UtilityClassWithoutPrivateConstructor
Class `EditorThumb` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
  }

  static final class EditorThumb {
    static final RegionPainter<Float> DARCULA = new ScrollPainter(0, .33f, .12f, Gray.xA6, Gray.x1A);
    static final RegionPainter<Float> DEFAULT = new Protected(new SubtractColor(0, .25f, .15f, Gray.x80, Gray.xA6),
```

### UtilityClassWithoutPrivateConstructor
Class `Mac` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
                                                              new ScrollPainter(0, .20f, .08f, Gray.x73, Gray.x59));

    static final class Mac {
      static final RegionPainter<Float> DARCULA = new Round(1, .35f, .20f, Gray.x80, Gray.x26);
      static final RegionPainter<Float> DEFAULT = new Round(2, .20f, .30f, Gray.x00, null);
```

### UtilityClassWithoutPrivateConstructor
Class `Track` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
class ScrollPainter extends RegionPainter.Alpha {

  static final class Track {
    static final RegionPainter<Float> DARCULA = new ScrollPainter(0, .0f, .1f, Gray.x80, null);
    static final RegionPainter<Float> DEFAULT = DARCULA;
```

### UtilityClassWithoutPrivateConstructor
Class `Thumb` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
  }

  static final class Thumb {
    static final RegionPainter<Float> DARCULA = new ScrollPainter(0, .28f, .07f, Gray.xA6, Gray.x38);
    static final RegionPainter<Float> DEFAULT = new Protected(new SubtractColor(0, .20f, .08f, Gray.x73, Gray.x91),
```

### UtilityClassWithoutPrivateConstructor
Class `Overlay` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
      static final RegionPainter<Float> DEFAULT = Thumb.Mac.DEFAULT;

      static final class Overlay {
        static final RegionPainter<Float> DARCULA = new Round(1, 0f, .55f, Gray.xA6, Gray.x0D);
        static final RegionPainter<Float> DEFAULT = Thumb.Mac.Overlay.DEFAULT;
```

### UtilityClassWithoutPrivateConstructor
Class `IsRetina` has only 'static' members, and lacks a 'private' constructor
in `JediTerm/src/main/java/com/intellij/util/ui/IsRetina.java`
#### Snippet
```java
import java.awt.image.BufferedImage;

class IsRetina {
  public static boolean isRetina() {
    try {
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
The call to 'assertTrue' always fails, according to its method contracts
in `JediTerm/src/main/java/com/intellij/openapi/diagnostic/Logger.java`
#### Snippet
```java
  @Contract("false->fail") // wrong, but avoid quite a few warnings in the code
  public boolean assertTrue(boolean value) {
    return value || assertTrue(false, null);
  }

```

### DataFlowIssue
Condition `myLabel instanceof Accessible` is redundant and can be replaced with a null check
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
            String name = super.getAccessibleName();
            if (name == null) {
                if (myLabel instanceof Accessible) {
                    name = myLabel.getAccessibleContext().getAccessibleName();
                }
```

### DataFlowIssue
Condition `myLabel instanceof Accessible` is redundant and can be replaced with a null check
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
            String name = super.getAccessibleDescription();
            if (name == null) {
                if (myLabel instanceof Accessible) {
                    name = myLabel.getAccessibleContext().getAccessibleDescription();
                }
```

### DataFlowIssue
Expression `notNull(t)` might evaluate to null but is returned by the method declared as @NotNull
in `JediTerm/src/main/java/com/intellij/util/ObjectUtils.java`
#### Snippet
```java
  @NotNull
  public static <T> T assertNotNull(@Nullable T t) {
    return notNull(t);
  }

```

### DataFlowIssue
Variable is already assigned to this value
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        }
        float scale = 1f;
        if (dpi < 120) scale = 1f;
        else if (dpi < 144) scale = 1.25f;
        else if (dpi < 168) scale = 1.5f;
```

### DataFlowIssue
Variable is already assigned to this value
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
          string.addAttribute(TextAttribute.FONT, currentFont, currentIndex, i);
        }
        currentFont = font;
        currentIndex = i;
      }
```

### DataFlowIssue
Argument `points.first` might be null
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
      if (points.first != null || points.second != null) {
        return SelectionUtil
                .getSelectionText(points.first, points.second, myTerminalTextBuffer);

      }
```

### DataFlowIssue
Immutable object is passed where mutable is expected
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <T, V> V[] map2Array(@NotNull Collection<? extends T> collection, @NotNull V[] to, @NotNull Function<T, V> mapper) {
    return map2List(collection, mapper).toArray(to);
  }

```

### DataFlowIssue
Immutable object is passed where mutable is expected
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
      result.add(mapping.fun(t));
    }
    return result.toArray(emptyArray);
  }

```

### DataFlowIssue
Immutable object is passed where mutable is expected
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
      return emptyArray;
    }
    return result.toArray(emptyArray);
  }

```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtilRt.java`
#### Snippet
```java
   */
  private static class EmptyList<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1L;

    private static final EmptyList INSTANCE = new EmptyList();
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'PreConnectHandler' is still used
in `ui/src/com/jediterm/terminal/ui/PreConnectHandler.java`
#### Snippet
```java
@SuppressWarnings("removal")
@Deprecated(forRemoval = true)
final class PreConnectHandler implements Questioner, KeyListener {
  private final Object mySync = new Object();
  private final Terminal myTerminal;
```

### DeprecatedIsStillUsed
Deprecated member 'getBorderColor' is still used
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated
     */
    public static Color getBorderColor() {
        return isUnderDarcula() ? Gray._50 : BORDER_COLOR;
    }
```

### DeprecatedIsStillUsed
Deprecated member 'OWN_THREAD' is still used
in `JediTerm/src/main/java/com/intellij/util/Alarm.java`
#### Snippet
```java
         */
        @Deprecated
        OWN_THREAD
    }

```

### DeprecatedIsStillUsed
Deprecated member 'init' is still used
in `core/src/com/jediterm/terminal/TtyConnector.java`
#### Snippet
```java
  @SuppressWarnings("removal")
  @Deprecated(forRemoval = true)
  default boolean init(Questioner q) {
    return true;
  }
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ui/Animator.java`
#### Snippet
```java
    stopTicker();

    SwingUtilities.invokeLater(() -> paintCycleEnd());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ui/NSScrollerHelper.java`
#### Snippet
```java
    @SuppressWarnings("UnusedDeclaration")
    public void callback(ID self, Pointer selector, ID event) {
      UIUtil.invokeLaterIfNeeded(() -> fireStyleChanged());
    }
  };
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ui/NSScrollerHelper.java`
#### Snippet
```java
    @SuppressWarnings("UnusedDeclaration")
    public void callback(ID self, Pointer selector, ID event) {
      UIUtil.invokeLaterIfNeeded(() -> updateBehaviorPreferences());
    }
  };
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java

    private void doPaint(final Graphics g) {
        doTranslate((x, y) -> g.translate(x, y));

        final Composite oldComposite = ((Graphics2D) g).getComposite();
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        }

        return computeSize(component -> component.getPreferredSize(), 3);
    }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        }

        return computeSize(component -> component.getMinimumSize(), 1);
    }

```

## RuleId[id=PatternVariableCanBeUsed]
### PatternVariableCanBeUsed
Variable 'arr1' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java
    }
    if (arg1 instanceof Object[] && arg2 instanceof Object[]) {
      Object[] arr1 = (Object[])arg1;
      Object[] arr2 = (Object[])arg2;
      return Arrays.equals(arr1, arr2);
```

### PatternVariableCanBeUsed
Variable 'arr2' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/openapi/util/Comparing.java`
#### Snippet
```java
    if (arg1 instanceof Object[] && arg2 instanceof Object[]) {
      Object[] arr1 = (Object[])arg1;
      Object[] arr2 = (Object[])arg2;
      return Arrays.equals(arr1, arr2);
    }
```

### PatternVariableCanBeUsed
Variable 'g' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/ui/GraphicsUtil.java`
#### Snippet
```java
  public static void setupAntialiasing(Graphics g2, boolean enableAA, boolean ignoreSystemSettings) {
    if (g2 instanceof Graphics2D) {
      Graphics2D g = (Graphics2D)g2;
      Toolkit tk = Toolkit.getDefaultToolkit();
      //noinspection HardCodedStringLiteral
```

### PatternVariableCanBeUsed
Variable 'jbSize' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/ui/JBUI.java`
#### Snippet
```java
  public static JBDimension size(Dimension size) {
    if (size instanceof JBDimension) {
      final JBDimension jbSize = (JBDimension)size;
      if (jbSize.originalScale == scale(1f)) {
        return jbSize;
```

### PatternVariableCanBeUsed
Variable 'ghost' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java
      }
    } else if (c instanceof GhostComponent) {
      GhostComponent ghost = (GhostComponent)c;
      TabInfo info = ghost.myInfo;
      if (info != null) {
```

### PatternVariableCanBeUsed
Variable 'other' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/containers/Stack.java`
#### Snippet
```java
  public boolean equals(Object o) {
    if (o instanceof RandomAccess && o instanceof List) {
      List other = (List)o;
      if (size() != other.size()) {
        return false;
```

### PatternVariableCanBeUsed
Variable 'x' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/concurrency/SchedulingWrapper.java`
#### Snippet
```java
      }
      if (other instanceof MyScheduledFutureTask) {
        MyScheduledFutureTask<?> x = (MyScheduledFutureTask<?>)other;
        long diff = time - x.time;
        if (diff < 0) {
```

### PatternVariableCanBeUsed
Variable 'label' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
            // leaving other types of children untouched.
            if (accessibleChild instanceof TabLabel) {
                TabLabel label = (TabLabel) accessibleChild;
                return myInfo2Page.get(label.getInfo());
            }
```

### PatternVariableCanBeUsed
Variable 'jc' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
            final Component each = getComponent(i);
            if (each instanceof JComponent) {
                final JComponent jc = (JComponent) each;
                final Object done = jc.getClientProperty(LAYOUT_DONE);
                if (!Boolean.TRUE.equals(done)) {
```

### PatternVariableCanBeUsed
Variable 'comboBox' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            public void actionPerformed(final ActionEvent e) {
                if (!(e.getSource() instanceof JComboBox)) return;
                final JComboBox comboBox = (JComboBox) e.getSource();
                final String text;
                final Object selectedItem = comboBox.getSelectedItem();
```

### PatternVariableCanBeUsed
Variable 'frame' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    public static void toFront(Window window) {
        if (window instanceof Frame) {
            Frame frame = (Frame) window;
            frame.setState(Frame.NORMAL);
        }
```

### PatternVariableCanBeUsed
Variable 'c' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        if (!(comp instanceof JComponent)) return;

        JComponent c = (JComponent) comp;

        if (isUnderAquaBasedLookAndFeel()) {
```

### PatternVariableCanBeUsed
Variable 'container' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        }
        if (component instanceof Container) {
            Container container = (Container) component;
            for (int i = 0; i < container.getComponentCount(); i++) {
                if (hasComponentOfType(container.getComponent(i), types)) {
```

### PatternVariableCanBeUsed
Variable 'dcm' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/ui/components/ScrollPainter.java`
#### Snippet
```java
    private static boolean isValid(ColorModel model) {
      if (model instanceof DirectColorModel && DataBuffer.TYPE_INT == model.getTransferType()) {
        DirectColorModel dcm = (DirectColorModel)model;
        if (0x00FF0000 == dcm.getRedMask() && 0x0000FF00 == dcm.getGreenMask() && 0x000000FF == dcm.getBlueMask()) {
          return 4 != dcm.getNumComponents() || 0xFF000000 == dcm.getAlphaMask();
```

### PatternVariableCanBeUsed
Variable 'typeVariable' can be replaced with pattern variable
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
      }
      if (resolved instanceof TypeVariable) {
        final TypeVariable typeVariable = (TypeVariable)resolved;
        index = ArrayUtilRt.find(anInterface.getTypeParameters(), typeVariable);
        if (index < 0) {
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'myVisualizer' in a Serializable class
in `ui/src/com/jediterm/terminal/debug/BufferPanel.java`
#### Snippet
```java
  }

  private final ControlSequenceVisualizer myVisualizer = new ControlSequenceVisualizer();

  private String getControlSequencesVisualization(TerminalSession session, int stateIndex) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'THIN_STROKE' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/paint/EffectPainter.java`
#### Snippet
```java
    },
    WAVE_UNDERSCORE {
      private final BasicStroke THIN_STROKE = new BasicStroke(.7f);

      @Override
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myInfo' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java

  public class GhostComponent extends JLabel {
    private TabInfo myInfo;

    private GhostComponent(final RowDropPolicy before, final RowDropPolicy after) {
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myInactiveStateImage' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
    protected final JBTabsImpl myTabs;

    private BufferedImage myInactiveStateImage;
    private Rectangle myLastPaintedInactiveImageBounds;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myInfo' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
    private Icon myOverlayedIcon;

    private final TabInfo myInfo;

    private boolean myCentered;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTerminalStarter' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
  private final PreConnectHandler myPreConnectHandler;
  private TtyConnector myTtyConnector;
  private TerminalStarter myTerminalStarter;
  private Thread myEmuThread;
  protected final SettingsProvider mySettingsProvider;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTypeAheadManager' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
  protected final AtomicBoolean mySessionRunning = new AtomicBoolean();
  private final JediTermTypeAheadModel myTypeAheadTerminalModel;
  private final TerminalTypeAheadManager myTypeAheadManager;
  private JediTermSearchComponent myFindComponent;
  @SuppressWarnings("removal")
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myEmuThread' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
  private TtyConnector myTtyConnector;
  private TerminalStarter myTerminalStarter;
  private Thread myEmuThread;
  protected final SettingsProvider mySettingsProvider;
  private TerminalActionProvider myNextActionProvider;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTypeAheadTerminalModel' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
  protected final JediTerminal myTerminal;
  protected final AtomicBoolean mySessionRunning = new AtomicBoolean();
  private final JediTermTypeAheadModel myTypeAheadTerminalModel;
  private final TerminalTypeAheadManager myTypeAheadManager;
  private JediTermSearchComponent myFindComponent;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myPreConnectHandler' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
  private JediTermSearchComponent myFindComponent;
  @SuppressWarnings("removal")
  private final PreConnectHandler myPreConnectHandler;
  private TtyConnector myTtyConnector;
  private TerminalStarter myTerminalStarter;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTerminal' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
  protected final TerminalPanel myTerminalPanel;
  protected final JScrollBar myScrollBar;
  protected final JediTerminal myTerminal;
  protected final AtomicBoolean mySessionRunning = new AtomicBoolean();
  private final JediTermTypeAheadModel myTypeAheadTerminalModel;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTextProcessing' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/JediTermWidget.java`
#### Snippet
```java
  private TerminalActionProvider myNextActionProvider;
  private final JLayeredPane myInnerPanel;
  private final TextProcessing myTextProcessing;
  private final List<TerminalWidgetListener> myListeners = new CopyOnWriteArrayList<>();

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mySingleRowLayout' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private final WeakHashMap<Component, Component> myDeferredToRemove = new WeakHashMap<>();

    private SingleRowLayout mySingleRowLayout;
    private final TableLayout myTableLayout = new TableLayout(this);
    private final TabsSideSplitter mySplitter = new TabsSideSplitter(this);
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myPopupInfo' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private String myPopupPlace;

    TabInfo myPopupInfo;

    final PopupMenuListener myPopupListener;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myImage' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private List<TabInfo> myAllTabs;
    private boolean myPaintBlocked;
    private BufferedImage myImage;
    private final boolean myAdjustBorders = true;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myLastPaintedSelection' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private TabLayout myLayout;
    private LayoutPassInfo myLastLayoutPass;
    private TabInfo myLastPaintedSelection;

    public boolean myForcedRelayout;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myBorder' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private JBTabsPosition myPosition = JBTabsPosition.top;

    private final TabsBorder myBorder = new TabsBorder(this);

    private boolean myTabDraggingEnabled;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mySplitter' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private SingleRowLayout mySingleRowLayout;
    private final TableLayout myTableLayout = new TableLayout(this);
    private final TabsSideSplitter mySplitter = new TabsSideSplitter(this);


```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myOldSelection' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    protected boolean myShowDropLocation = true;

    private TabInfo myOldSelection;
    private SelectionChangeHandler mySelectionChangeHandler;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myDropInfo' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java

    private boolean myOwnSwitchProvider = true;
    protected TabInfo myDropInfo;
    private int myDropInfoIndex;
    protected boolean myShowDropLocation = true;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTabActionsAutoHideListener' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private boolean myTabLabelActionsAutoHide;

    private final TabActionsAutoHideListener myTabActionsAutoHideListener = new TabActionsAutoHideListener();
    @NonNls
    private static final String LAYOUT_DONE = "Layout.done";
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mySelectedInfo' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
    private final Map<TabInfo, Integer> myHiddenInfos = new HashMap<>();

    private TabInfo mySelectedInfo;
    public final Map<TabInfo, TabLabel> myInfo2Label = new HashMap<>();
    public final Map<TabInfo, Toolbar> myInfo2Toolbar = new HashMap<>();
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTableLayout' in a Serializable class
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java

    private SingleRowLayout mySingleRowLayout;
    private final TableLayout myTableLayout = new TableLayout(this);
    private final TabsSideSplitter mySplitter = new TabsSideSplitter(this);

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myLock' in a Serializable class
in `JediTerm/src/main/java/com/jediterm/ui/AbstractTabbedTerminalWidget.java`
#### Snippet
```java
 */
public abstract class AbstractTabbedTerminalWidget<T extends JediTermWidget> extends JPanel implements TerminalWidget, TerminalActionProvider {
  private final Object myLock = new Object();

  private TerminalPanelListener myTerminalPanelListener = null;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTerminalKeyHandler' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  private int myCursorType = Cursor.DEFAULT_CURSOR;
  private final TerminalKeyHandler myTerminalKeyHandler = new TerminalKeyHandler();
  private LinkInfoEx.HoverConsumer myLinkHoverConsumer;
  private TerminalTypeAheadManager myTypeAheadManager;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mySelection' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
  private Point mySelectionStartPoint = null;
  private TerminalSelection mySelection = null;

  private final TerminalCopyPasteHandler myCopyPasteHandler;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTermSize' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  protected final Dimension myCharSize = new Dimension();
  private boolean myMonospaced;
  private TermSize myTermSize;
  private boolean myInitialSizeSyncDone = false;

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTerminalTextBuffer' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  private final SettingsProvider mySettingsProvider;
  private final TerminalTextBuffer myTerminalTextBuffer;

  final private StyleState myStyleState;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myStyleState' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private final TerminalTextBuffer myTerminalTextBuffer;

  final private StyleState myStyleState;

  /*scroll and cursor*/
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myFindResult' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private TerminalCoordinates myCoordsAccessor;

  private SubstringFinder.FindResult myFindResult;

  private LinkInfo myHoveredHyperlink = null;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTerminalStarter' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private boolean myInitialSizeSyncDone = false;

  private TerminalStarter myTerminalStarter = null;

  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTypeAheadManager' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private final TerminalKeyHandler myTerminalKeyHandler = new TerminalKeyHandler();
  private LinkInfoEx.HoverConsumer myLinkHoverConsumer;
  private TerminalTypeAheadManager myTypeAheadManager;
  private volatile boolean myBracketedPasteMode;
  private boolean myUsingAlternateBuffer = false;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myHoveredHyperlink' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
  private SubstringFinder.FindResult myFindResult;

  private LinkInfo myHoveredHyperlink = null;

  private int myCursorType = Cursor.DEFAULT_CURSOR;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myCursor' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  /*scroll and cursor*/
  final private TerminalCursor myCursor = new TerminalCursor();

  //we scroll a window [0, terminal_height] in the range [-history_lines_count, terminal_height]
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'mySelectionStartPoint' in a Serializable class
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java

  private MouseMode myMouseMode = MouseMode.MOUSE_REPORTING_NONE;
  private Point mySelectionStartPoint = null;
  private TerminalSelection mySelection = null;

```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary collection created to copy an array
in `JediTerm/src/main/java/com/intellij/util/ExceptionUtil.java`
#### Snippet
```java
      if (trace[trace.length - i - 1].equals(rootTrace[rootTrace.length - i - 1])) continue;
      int newDepth = trace.length - i;
      th.setStackTrace(Arrays.asList(trace).subList(0, newDepth).toArray(new StackTraceElement[newDepth]));
      break;
    }
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        try {
            dpi = Toolkit.getDefaultToolkit().getScreenResolution();
        } catch (HeadlessException e) {
        }
        float scale = 1f;
```

### CatchMayIgnoreException
Empty `catch` block
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      html2TextParser.parse(new StringReader(htmlString));
    }
    catch (IOException e) {
    }
    return html2TextParser.getText();
```

### CatchMayIgnoreException
Empty `catch` block
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      }
    }
    catch (IOException e) {
    }
  }
```

## RuleId[id=EnhancedSwitchMigration]
### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/singleRow/SingleRowLayout.java`
#### Snippet
```java

  SingleRowLayoutStrategy getStrategy() {
    switch (myTabs.getPresentation().getTabsPosition()) {
      case top:
        return myTop;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
        int plain = getNonSelectedOffset();

        switch (pos) {
            case bottom:
                dY = -plain;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java

        final JBTabsPosition pos = myTabs.getTabsPosition();
        switch (pos) {
            case top:
            case bottom:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/components/panels/HorizontalLayout.java`
#### Snippet
```java
  public HorizontalLayout(int gap, int alignment) {
    myGap = gap;
    switch (alignment) {
      case SwingConstants.TOP:
      case SwingConstants.BOTTOM:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java
    @Override
    public Object toNative() {
      switch (Native.LONG_SIZE) {
        case 4:
          return (float)value;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java
    @Override
    public Object fromNative(Object o, FromNativeContext fromNativeContext) {
      switch (Native.LONG_SIZE) {
        case 4:
          return new CGFloat((Float)o);
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java
    @Override
    public Class<?> nativeType() {
      switch (Native.LONG_SIZE) {
        case 4:
          return Float.class;
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    public static float getFontSize(FontSize size) {
        int defSize = getLabelFont().getSize();
        switch (size) {
            case SMALL:
                return Math.max(defSize - JBUI.scale(2f), JBUI.scale(11f));
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/ui/components/panels/VerticalLayout.java`
#### Snippet
```java
  public VerticalLayout(int gap, int alignment) {
    myGap = gap;
    switch (alignment) {
      case SwingConstants.LEFT:
      case SwingConstants.RIGHT:
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    for (int idx = 0; idx < length; idx++) {
      char ch = str.charAt(idx);
      switch (ch) {
        case '\b':
          buffer.append("\\b");
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      switch (c) {
        case '\n':
          buffer.append("\\n");
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
    for (int i = 0; i < input.length(); i++) {
      final char ch = input.charAt(i);
      switch (ch) {
        case ' ':
          if (isKey && i == 0) {
```

### EnhancedSwitchMigration
Switch statement can be replaced with enhanced 'switch'
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <E> Set<E> immutableSet(@NotNull E... elements) {
    switch (elements.length) {
      case 0:
        return Collections.emptySet();
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
        return new TerminalColor(val0, val1, val2);
      } else {
        LOG.warn("Bogus color setting " + args.toString());
        return null;
      }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
      return ColorPalette.getIndexedTerminalColor(args.getArg(index + 2, 0));
    } else {
      LOG.warn("Unsupported code for color attribute " + args.toString());
      return null;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
      return true;
    } else {
      LOG.warn("Sending Device Report Status : unsupported parameter: " + args.toString());
      return false;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
        return true;
      default:
        LOG.warn("Setting cursor shape : unsupported parameter " + args.toString());
        return false;
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `JediTerm/src/main/java/com/intellij/util/concurrency/AppDelayQueue.java`
#### Snippet
```java
                        final SchedulingWrapper.MyScheduledFutureTask task = take();
                        if (LOG.isTraceEnabled()) {
                            LOG.trace("Took " + task.toString());
                        }
                        if (!task.isDone()) {  // can be cancelled already
```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `core/src/com/jediterm/terminal/util/Util.java`
#### Snippet
```java
      /* Look for first character. */
      if (!charsEqualIgnoreCase(where.charAt(i), first)) {
        while (++i <= max && !charsEqualIgnoreCase(where.charAt(i), first)) ;
      }

```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      char ch = str.charAt(i);
      if (ch == '\\' && i != last) {
        i++;
        ch = str.charAt(i);
        if (ch != unescapeChar) buf.append('\\');
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
        if (text.regionMatches(i, toReplace, 0, len)) {
          result.append(replaceWith);
          i += len - 1;
          continue replace;
        }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
      /* Look for first character. */
      if (!charsEqualIgnoreCase(where.charAt(i), first)) {
        while (++i <= max && !charsEqualIgnoreCase(where.charAt(i), first)) ;
      }

```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `JediTerm/src/main/java/com/intellij/ui/components/panels/ValidatingComponent.java`
#### Snippet
```java

  public void setErrorText(String errorText) {
    if ("".equals(errorText) || errorText == null) {
      errorText = " ";
    }
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java
    private static int toInt(String string) {
        try {
            return Integer.valueOf(string);
        } catch (NumberFormatException e) {
            return 0;
```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/Foundation.java`
#### Snippet
```java
    final ID runnableObject = invoke(invoke(ideaRunnable, "alloc"), "init");
    invoke(runnableObject, "performSelectorOnMainThread:withObject:waitUntilDone:", createSelector("run:"),
           nsString(String.valueOf(ourCurrentRunnableCount)), Boolean.valueOf(waitUntilDone));
    invoke(runnableObject, "release");
  }
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
    @Override
    public void setTabStop(int position) {
      myTabStops.add(Integer.valueOf(position));
    }
  }
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java

      // Search for the first tab stop before the given position...
      SortedSet<Integer> headSet = myTabStops.headSet(Integer.valueOf(position));
      if (!headSet.isEmpty()) {
        tabStop = headSet.last();
```

### UnnecessaryBoxing
Unnecessary boxing
in `core/src/com/jediterm/terminal/model/JediTerminal.java`
#### Snippet
```java
    @Override
    public void clearTabStop(int position) {
      myTabStops.remove(Integer.valueOf(position));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/JBTabsImpl.java`
#### Snippet
```java
        Integer index = myHiddenInfos.get(each);
        if (index == null) {
            index = Integer.valueOf(myVisibleInfos.size());
        }

```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    public static void setSliderIsFilled(final JSlider slider, final boolean value) {
        slider.putClientProperty("JSlider.isFilled", Boolean.valueOf(value));
    }

```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            float scale = getScreenScale();
            if (scale > 1f) {
                forcedScale = Float.valueOf(scale);
            }
            // Or otherwise leave the detected font. It's undetermined if it's scaled or not.
```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            String mnemoChar = text.substring(mnemoPos + 1, mnemoPos + 2).trim();
            if (mnemoChar.length() == 1) {
                action.putValue(Action.MNEMONIC_KEY, Integer.valueOf(mnemoChar.charAt(0)));
            }
        }
```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/table/TableLayout.java`
#### Snippet
```java
        final TabLabel label = myTabs.myInfo2Label.get(tabInfo);

        label.putClientProperty(JBTabsImpl.STRETCHED_BY_WIDTH, Boolean.valueOf(toAjust));
        
        int width;
```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
        }
        else if (int.class.equals(type)) {
          field.set(object, Integer.valueOf(0));
        }
        else if (double.class.equals(type)) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
        }
        else if (double.class.equals(type)) {
          field.set(object, Double.valueOf(0));
        }
        else if (float.class.equals(type)) {
```

### UnnecessaryBoxing
Unnecessary boxing
in `JediTerm/src/main/java/com/intellij/util/ReflectionUtil.java`
#### Snippet
```java
        }
        else if (float.class.equals(type)) {
          field.set(object, Float.valueOf(0));
        }
      }
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `myScreenBuffer`
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java

  public char getCharAt(int x, int y) {
    synchronized (myScreenBuffer) {
      TerminalLine line = getLine(y);
      return line.charAt(x);
```

### SynchronizeOnNonFinalField
Synchronization on a non-final field `myScreenBuffer`
in `core/src/com/jediterm/terminal/model/TerminalTextBuffer.java`
#### Snippet
```java

  public Pair<Character, TextStyle> getStyledCharAt(int x, int y) {
    synchronized (myScreenBuffer) {
      TerminalLine line = getLine(y);
      return new Pair<Character, TextStyle>(line.charAt(x), line.getStyleAt(x));
```

## RuleId[id=MissingDeprecatedAnnotation]
### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/openapi/ui/Splitter.java`
#### Snippet
```java
   */
  @Override
  public Component add(Component comp) {
    final int childCount = getComponentCount();
    LOG.assertTrue(childCount >= 1);
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused")
    public static final boolean isAMD64 = "amd64".equals(OS_ARCH);
}
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused")
    public static final boolean isWindowsXP = isWindows && (OS_VERSION.equals("5.1") || OS_VERSION.equals("5.2"));

    /**
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated use getBorderColor instead
     */
    public static Color getBorderInactiveColor() {
        return getBorderColor();
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated use com.intellij.util.ui.UIUtil#getTextFieldBackground()
     */
    public static Color getActiveTextFieldBackgroundColor() {
        return getTextFieldBackground();
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated use getBorderColor instead
     */
    public static Color getBorderSeparatorColor() {
        return getBorderColor();
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated use com.intellij.util.ui.UIUtil#getPanelBackground() instead
     */
    public static Color getPanelBackgound() {
        return getPanelBackground();
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated
     */
    public static Color getBorderColor() {
        return isUnderDarcula() ? Gray._50 : BORDER_COLOR;
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated use getBorderColor instead
     */
    public static Color getBorderActiveColor() {
        return getBorderColor();
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
     * @deprecated use com.intellij.util.ui.UIUtil#getInactiveTextColor()
     */
    public static Color getTextInactiveTextColor() {
        return getInactiveTextColor();
    }
```

### MissingDeprecatedAnnotation
Missing '@Deprecated' annotation
in `JediTerm/src/main/java/com/intellij/openapi/util/text/StringUtil.java`
#### Snippet
```java
  /** @deprecated use {@link #startsWithConcatenation(String, String...)} (to remove in IDEA 15) */
  @SuppressWarnings("unused")
  public static boolean startsWithConcatenationOf(@NotNull String string, @NotNull String firstPrefix, @NotNull String secondPrefix) {
    return startsWithConcatenation(string, firstPrefix, secondPrefix);
  }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.openapi.util` is unnecessary and can be removed
in `JediTerm/src/main/java/com/intellij/openapi/util/RecursionGuard.java`
#### Snippet
```java
     * results. When such non-reliable results exist in the thread's call stack, returns false, otherwise true.
     * If you use this with {@link RecursionGuard#doPreventingRecursion(Object, Computable)}, then the
     * {@link com.intellij.openapi.util.RecursionGuard#markStack()}+{@link #mayCacheNow()} should be outside of recursion prevention call. Otherwise
     * even the outer recursive computation result won't be cached.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.openapi.util` is unnecessary and can be removed
in `JediTerm/src/main/java/com/intellij/openapi/util/RecursionGuard.java`
#### Snippet
```java

  /**
   * Makes {@link com.intellij.openapi.util.RecursionGuard.StackStamp#mayCacheNow()} return false for all stamps created since a computation with
   * key <code>since</code> began.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.openapi.util` is unnecessary and can be removed
in `JediTerm/src/main/java/com/intellij/openapi/util/RecursionGuard.java`
#### Snippet
```java

  /**
   * Used in pair with {@link com.intellij.openapi.util.RecursionGuard.StackStamp#mayCacheNow()} to ensure that cached are only the reliable values,
   * not depending on anything incomplete due to recursive prevention policies.
   * A typical usage is this:
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt.event` is unnecessary, and can be replaced with an import
in `ui/src/com/jediterm/terminal/ui/input/AwtMouseEvent.java`
#### Snippet
```java
    } else if (SwingUtilities.isRightMouseButton(awtMouseEvent)) {
      return MouseButtonCodes.NONE; //we don't handle right mouse button as it used for the context menu invocation
    } else if (awtMouseEvent instanceof java.awt.event.MouseWheelEvent) {
      if (((java.awt.event.MouseWheelEvent) awtMouseEvent).getWheelRotation() > 0) {
        return MouseButtonCodes.SCROLLUP;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt.event` is unnecessary, and can be replaced with an import
in `ui/src/com/jediterm/terminal/ui/input/AwtMouseEvent.java`
#### Snippet
```java
      return MouseButtonCodes.NONE; //we don't handle right mouse button as it used for the context menu invocation
    } else if (awtMouseEvent instanceof java.awt.event.MouseWheelEvent) {
      if (((java.awt.event.MouseWheelEvent) awtMouseEvent).getWheelRotation() > 0) {
        return MouseButtonCodes.SCROLLUP;
      } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `ui/src/com/jediterm/terminal/debug/BufferPanel.java`
#### Snippet
```java
  private String getControlSequencesVisualization(TerminalSession session, int stateIndex) {
    if (session.getTtyConnector() instanceof LoggingTtyConnector) {
      java.util.List<char[]> chunks = ((LoggingTtyConnector) session.getTtyConnector()).getChunks();
      return myVisualizer.getVisualizedString(chunks.subList(0, stateIndex));
    } else {
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `ui/src/com/jediterm/terminal/ui/settings/DefaultSettingsProvider.java`
#### Snippet
```java
  @Override
  public TextStyle getHyperlinkColor() {
    return new TextStyle(fromAwtToTerminalColor(java.awt.Color.BLUE), TerminalColor.WHITE);
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.util.ui` is unnecessary and can be removed
in `JediTerm/src/main/java/com/intellij/ui/tabs/impl/TabLabel.java`
#### Snippet
```java
            @Override
            protected boolean shouldDrawMacShadow() {
                return SystemInfo.isMac || com.intellij.util.ui.DrawUtil.isUnderDarcula();
            }

```

### UnnecessaryFullyQualifiedName
Qualifier `com.jediterm.terminal` is unnecessary and can be removed
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
 * The main terminal emulator class.
 * <p/>
 * Obtains data from the  {@link com.jediterm.terminal.TerminalDataStream}, interprets terminal ANSI escape sequences as commands and directs them
 * as well as plain data characters to the  {@link com.jediterm.terminal.Terminal}
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `com.jediterm.terminal` is unnecessary and can be removed
in `core/src/com/jediterm/terminal/emulator/JediEmulator.java`
#### Snippet
```java
 * <p/>
 * Obtains data from the  {@link com.jediterm.terminal.TerminalDataStream}, interprets terminal ANSI escape sequences as commands and directs them
 * as well as plain data characters to the  {@link com.jediterm.terminal.Terminal}
 *
 * @author traff
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.util.ui` is unnecessary and can be removed
in `JediTerm/src/main/java/com/jediterm/app/JediTabbedTerminalWidget.java`
#### Snippet
```java
            };
            if (myTabs.useSmallLabels()) {
              textField.setFont(com.intellij.util.ui.UIUtil.getFont(UIUtil.FontSize.SMALL, textField.getFont()));
            }
            textField.setOpaque(true);
```

### UnnecessaryFullyQualifiedName
Qualifier `com.intellij.util.ui` is unnecessary and can be removed
in `JediTerm/src/main/java/com/intellij/ui/SimpleColoredComponent.java`
#### Snippet
```java
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
      g.setColor(Color.BLACK);
      com.intellij.util.ui.DrawUtil.drawDottedRectangle(g, x, y, x + width - 1, y + height - 1);
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `core/src/com/jediterm/terminal/TtyConnector.java`
#### Snippet
```java
  @SuppressWarnings("unused")
  @Deprecated
  default void resize(java.awt.Dimension termWinSize, java.awt.Dimension pixelSize) {
    throw new IllegalStateException("This method shouldn't be called. " +
      getClass() + " should override TtyConnector.resize(com.jediterm.core.util.TermSize)");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `core/src/com/jediterm/terminal/TtyConnector.java`
#### Snippet
```java
  @SuppressWarnings("unused")
  @Deprecated
  default void resize(java.awt.Dimension termWinSize, java.awt.Dimension pixelSize) {
    throw new IllegalStateException("This method shouldn't be called. " +
      getClass() + " should override TtyConnector.resize(com.jediterm.core.util.TermSize)");
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `core/src/com/jediterm/terminal/TtyConnector.java`
#### Snippet
```java
  default void resize(@NotNull TermSize termSize) {
    // support old implementations not overriding this method
    resize(new java.awt.Dimension(termSize.getColumns(), termSize.getRows()));
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `core/src/com/jediterm/terminal/TtyConnector.java`
#### Snippet
```java
   */
  @Deprecated
  default void resize(@NotNull java.awt.Dimension termWinSize) {
    // support old implementations overriding neither `resize(Dimension)` nor this method
    resize(termWinSize, new java.awt.Dimension(0, 0));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary, and can be replaced with an import
in `core/src/com/jediterm/terminal/TtyConnector.java`
#### Snippet
```java
  default void resize(@NotNull java.awt.Dimension termWinSize) {
    // support old implementations overriding neither `resize(Dimension)` nor this method
    resize(termWinSize, new java.awt.Dimension(0, 0));
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
      myTermSize = newSize;

      setPreferredSize(new java.awt.Dimension(getPixelWidth(), getPixelHeight()));
      if (myTerminalPanelListener != null) {
        SwingUtilities.invokeLater(() -> myTerminalPanelListener.onPanelResize(origin));
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    java.awt.Point topLeft = new java.awt.Point(cellInterval.getStartColumn() * myCharSize.width + getInsetX(),
      cellInterval.getLine() * myCharSize.height);
    return new Rectangle(topLeft, new java.awt.Dimension(myCharSize.width * cellInterval.getCellCount(), myCharSize.height));
  }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `ui/src/com/jediterm/terminal/ui/TerminalPanel.java`
#### Snippet
```java
    initFont();

    setPreferredSize(new java.awt.Dimension(getPixelWidth(), getPixelHeight()));

    setFocusable(true);
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `ui/src/com/jediterm/terminal/ui/PreConnectHandler.java`
#### Snippet
```java
        mySync.wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      String answerStr = myAnswer.toString();
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `JediTerm/src/main/java/com/jediterm/example/BasicTerminalExample.java`
#### Snippet
```java
      terminalWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return widget;
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `JediTerm/src/main/java/com/intellij/util/ui/IsRetina.java`
#### Snippet
```java
    }
    catch (Throwable e) {
      e.printStackTrace();
      return false;
    }
```

## RuleId[id=RegExpSingleCharAlternation]
### RegExpSingleCharAlternation
Single character alternation in RegExp
in `JediTerm/src/main/java/com/intellij/util/io/URLUtil.java`
#### Snippet
```java
  public static final String JAR_SEPARATOR = "!/";

  public static final Pattern DATA_URI_PATTERN = Pattern.compile("data:([^,;]+/[^,;]+)(;charset(?:=|:)[^,;]+)?(;base64)?,(.+)");
  public static final Pattern URL_PATTERN = Pattern.compile("\\b(mailto:|(news|(ht|f)tp(s?))://|((?<![\\p{L}0-9_.])(www\\.)))[-A-Za-z0-9+$&@#/%?=~_|!:,.;]*[-A-Za-z0-9+$&@#/%=~_|]");

```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
    final Semaphore semaphore = new Semaphore();
    semaphore.down();
    doWhenProcessed(new Runnable() {
      @Override
      public void run() {
```

### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
  @NotNull
  public Runnable createSetDoneRunnable() {
    return new Runnable() {
      @Override
      public void run() {
```

### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
  @Deprecated
  public Runnable createSetRejectedRunnable() {
    return new Runnable() {
      @Override
      public void run() {
```

### Anonymous2MethodRef
Anonymous new Function() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/Function.java`
#### Snippet
```java
  Function NULL = NullableFunction.NULL;

  Function TO_STRING = new Function() {
    public Object fun(Object o) {
      return String.valueOf(o);
```

### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            c.requestFocus();
        } else {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
```

### Anonymous2MethodRef
Anonymous new Function.Mono() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java


    private static final Function.Mono<Component> COMPONENT_PARENT = new Function.Mono<Component>() {
        @Override
        public Component fun(Component c) {
```

### Anonymous2MethodRef
Anonymous new Condition() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
    @Nullable
    public static Component findNearestOpaque(Component c) {
        return findParentByCondition(c, new Condition<Component>() {
            @Override
            public boolean value(Component component) {
```

### Anonymous2MethodRef
Anonymous new NotNullProducer() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/ui/JBColor.java`
#### Snippet
```java

  public static Color background() {
    return new JBColor(new NotNullProducer<Color>() {
      @NotNull
      @Override
```

### Anonymous2MethodRef
Anonymous new NotNullProducer() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/ui/JBColor.java`
#### Snippet
```java

  public static Color foreground() {
    return new JBColor(new NotNullProducer<Color>() {
      @NotNull
      @Override
```

### Anonymous2MethodRef
Anonymous new NotNullProducer() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/ui/JBColor.java`
#### Snippet
```java

  public static Color border() {
    return new JBColor(new NotNullProducer<Color>() {
      @NotNull
      @Override
```

### Anonymous2MethodRef
Anonymous new ArrayFactory() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
    }
  };
  public static final ArrayFactory<Object> OBJECT_ARRAY_FACTORY = new ArrayFactory<Object>() {
    @NotNull
    @Override
```

### Anonymous2MethodRef
Anonymous new ArrayFactory() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/ArrayUtil.java`
#### Snippet
```java
  public static final Runnable[] EMPTY_RUNNABLE_ARRAY = ArrayUtilRt.EMPTY_RUNNABLE_ARRAY;

  public static final ArrayFactory<String> STRING_ARRAY_FACTORY = new ArrayFactory<String>() {
    @NotNull
    @Override
```

### Anonymous2MethodRef
Anonymous new Condition() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static <T, U extends T> U findLastInstance(@NotNull List<T> list, @NotNull final Class<U> clazz) {
    int i = lastIndexOf(list, new Condition<T>() {
      @Override
      public boolean value(T t) {
```

### Anonymous2MethodRef
Anonymous new Condition() can be replaced with method reference
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure = true)
  public static <T, U extends T> int lastIndexOfInstance(@NotNull List<T> list, @NotNull final Class<U> clazz) {
    return lastIndexOf(list, new Condition<T>() {
      @Override
      public boolean value(T t) {
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.computeIfAbsent' method call
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  public static <T, V> V getOrCreate(@NotNull Map<T, V> result, final T key, @NotNull V defaultValue) {
    V value = result.get(key);
    if (value == null) {
      result.put(key, value = defaultValue);
    }
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
  @NotNull
  public final ActionCallback doWhenRejected(@NotNull final Consumer<String> consumer) {
    myRejected.doWhenExecuted(new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
    final Semaphore semaphore = new Semaphore();
    semaphore.down();
    doWhenProcessed(new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
  @NotNull
  public Runnable createSetDoneRunnable() {
    return new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
  @NotNull
  public final ActionCallback notifyWhenRejected(@NotNull final ActionCallback child) {
    return doWhenRejected(new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/ActionCallback.java`
#### Snippet
```java
  @Deprecated
  public Runnable createSetRejectedRunnable() {
    return new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/execution/filters/UrlFilter.java`
#### Snippet
```java

      String url = m.group();
      item = new LinkResultItem(textStartOffset + m.start(), textStartOffset + m.end(), new LinkInfo(new Runnable() {
        @Override
        public void run() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java
    public static final boolean isMacIntel64 = isMac && "x86_64".equals(OS_ARCH);

    private static final Supplier<Boolean> ourHasXdgOpen = Suppliers.memoize(new Supplier<Boolean>() {
        @Override
        public Boolean get() {
```

### Convert2Lambda
Anonymous new Supplier() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java
    }

    private static final Supplier<Boolean> ourHasXdgMime = Suppliers.memoize(new Supplier<Boolean>() {
        @Override
        public Boolean get() {
```

### Convert2Lambda
Anonymous new Supplier\>() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/openapi/util/SystemInfo.java`
#### Snippet
```java

    // http://www.freedesktop.org/software/systemd/man/os-release.html
    private static final Supplier<Map<String, String>> ourOsReleaseInfo = Suppliers.memoize(new Supplier<Map<String, String>>() {
        @Override
        public Map<String, String> get() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/util/concurrency/AppDelayQueue.java`
#### Snippet
```java
    AppDelayQueue() {
    /* this thread takes the ready-to-execute scheduled tasks off the queue and passes them for immediate execution to {@link SchedulingWrapper#backendExecutorService} */
        scheduledToPooledTransferer = new Thread(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/ui/mac/foundation/MacUtil.java`
#### Snippet
```java
    if (!SystemInfo.isMacOSSnowLeopard) return false;
    final AtomicBoolean result = new AtomicBoolean();
    Foundation.executeOnMainThread(new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        if (!newSize.equals(size)) {
            //noinspection SSBasedInspection
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java

    public static void scrollListToVisibleIfNeeded(@NotNull final JList list) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
        assert !SwingUtilities.isEventDispatchThread();
        final BlockingQueue<Object> queue = new LinkedBlockingQueue<Object>();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/util/ui/UIUtil.java`
#### Snippet
```java
            c.requestFocus();
        } else {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
```

### Convert2Lambda
Anonymous new Comparator() can be replaced with lambda
in `JediTerm/src/main/java/com/intellij/util/containers/ContainerUtil.java`
#### Snippet
```java
  @Contract(pure=true)
  public static <T extends Comparable<? super T>> List<T> sorted(@NotNull Collection<T> list) {
    return sorted(list, new Comparator<T>() {
      @Override
      public int compare(T o1, T o2) {
```

## RuleId[id=ThreadStartInConstruction]
### ThreadStartInConstruction
Call to `start()` during object construction
in `JediTerm/src/main/java/com/intellij/util/concurrency/AppDelayQueue.java`
#### Snippet
```java
            }
        }, "Periodic tasks thread");
        scheduledToPooledTransferer.start();
    }

```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `JediTerm/src/main/java/com/intellij/util/ui/update/ComparableObject.java`
#### Snippet
```java

    @Override
    public final boolean equals(Object obj) {
      return ComparableObjectCheck.equals(this, obj);
    }
```

