# assertj-swing 
 
# Bad smells
I found 1114 bad smells with 68 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| MissortedModifiers | 571 | false |
| DataFlowIssue | 199 | false |
| Convert2MethodRef | 70 | false |
| NonProtectedConstructorInAbstractClass | 36 | true |
| BoundedWildcard | 27 | false |
| IgnoreResultOfCall | 20 | false |
| UnnecessaryFullyQualifiedName | 16 | false |
| NullableProblems | 11 | false |
| NonStaticFinalLogger | 10 | false |
| ReturnNull | 10 | false |
| ConstantValue | 7 | false |
| CatchMayIgnoreException | 7 | false |
| ToArrayCallWithZeroLengthArrayArgument | 6 | true |
| ObsoleteCollection | 6 | false |
| FinalStaticMethod | 6 | false |
| UnnecessaryToStringCall | 6 | true |
| Convert2Lambda | 6 | false |
| UnnecessaryModifier | 5 | true |
| NestedAssignment | 5 | false |
| ZeroLengthArrayInitialization | 5 | false |
| UnusedAssignment | 5 | false |
| ProtectedMemberInFinalClass | 5 | true |
| PointlessArithmeticExpression | 4 | false |
| UnnecessarySuperQualifier | 4 | false |
| UNUSED_IMPORT | 4 | false |
| EmptyMethod | 4 | false |
| UtilityClassWithoutPrivateConstructor | 4 | true |
| UnnecessarySemicolon | 4 | false |
| ThrowablePrintStackTrace | 4 | false |
| MethodOverloadsParentMethod | 3 | false |
| AssignmentToStaticFieldFromInstanceMethod | 2 | false |
| ManualArrayCopy | 2 | false |
| RedundantArrayCreation | 2 | true |
| KeySetIterationMayUseEntrySet | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| MalformedFormatString | 2 | false |
| FieldAccessedSynchronizedAndUnsynchronized | 2 | false |
| SynchronizeOnThis | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| SystemOutErr | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| SizeReplaceableByIsEmpty | 1 | true |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| WhileLoopSpinsOnField | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| InstanceofCatchParameter | 1 | false |
| ExceptionNameDoesntEndWithException | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| AbstractMethodCallInConstructor | 1 | false |
| PublicFieldAccessedInSynchronizedContext | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| DynamicRegexReplaceableByCompiledPattern | 1 | false |
| Anonymous2MethodRef | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new Container\[roots.size()\]'
in `assertj-swing/src/main/java/org/assertj/swing/core/HierarchyRootsSource.java`
#### Snippet
```java
  Container[] existingHierarchyRoots() {
    Collection<? extends Container> roots = new ExistingHierarchy().roots();
    return roots.toArray(new Container[roots.size()]);
  }
}
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[result.size()\]'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreePathFinder.java`
#### Snippet
```java
      index = separatorPosition + separatorSize;
    }
    return result.toArray(new String[result.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[selection.size()\]'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
  @Nonnull public String[] selectionOf(@Nonnull JList<?> list) {
    List<String> selection = selectionValues(list, cellReader());
    return selection.toArray(new String[selection.size()]);
  }

```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[allTitles.size()\]'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
        allTitles.add(tabbedPane.getTitleAt(i));
      }
      return allTitles.toArray(new String[allTitles.size()]);
    });
    return checkNotNull(result);
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new KeyStroke\[keyStrokes.size()\]'
in `assertj-swing/src/main/java/org/assertj/swing/driver/KeyStrokes.java`
#### Snippet
```java
    }
    if (!keyStrokes.isEmpty()) {
      return keyStrokes.toArray(new KeyStroke[keyStrokes.size()]);
    }
    throw actionFailure(String.format("Unable to find valid input event for action with key '%s'", actionName));
```

### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[parts.size()\]'
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/listener/ScreenshotFileNameGenerator.java`
#### Snippet
```java
    addParameters(result, parts);
    parts.add(PNG);
    return parts.toArray(new String[parts.size()]);
  }

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `assertj-swing/src/main/java/org/assertj/swing/core/ComponentLookupScope.java`
#### Snippet
```java
  private final boolean requireShowing;

  private ComponentLookupScope(boolean requireShowing) {
    this.requireShowing = requireShowing;
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `assertj-swing/src/main/java/org/assertj/swing/core/MouseButton.java`
#### Snippet
```java
  public final int mask;

  private MouseButton(int mask) {
    this.mask = mask;
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `assertj-swing/src/main/java/org/assertj/swing/util/OSFamily.java`
#### Snippet
```java
  private final String key;

  private OSFamily(@Nonnull String key) {
    this.key = key;
  }
```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameAction.java`
#### Snippet
```java
  final boolean value;

  private JInternalFrameAction(@Nonnull String name, boolean value) {
    this.name = name;
    this.value = value;
```

### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JToolBarFixture.java`
#### Snippet
```java
   * @author Alex Ruiz
   */
  public static enum UnfloatConstraint {
    NORTH(BorderLayout.NORTH), EAST(BorderLayout.EAST), SOUTH(BorderLayout.SOUTH), WEST(BorderLayout.WEST);

```

## RuleId[id=PointlessArithmeticExpression]
### PointlessArithmeticExpression
`HASH_CODE_PRIME * 1` can be replaced with 'HASH_CODE_PRIME'
in `assertj-swing/src/main/java/org/assertj/swing/data/Index.java`
#### Snippet
```java
  @Override
  public int hashCode() {
    return HASH_CODE_PRIME * 1 + value;
  }

```

### PointlessArithmeticExpression
`HASH_CODE_PRIME * 1` can be replaced with 'HASH_CODE_PRIME'
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
    @Override
    public int hashCode() {
      return HASH_CODE_PRIME * 1 + value;
    }

```

### PointlessArithmeticExpression
`HASH_CODE_PRIME * 1` can be replaced with 'HASH_CODE_PRIME'
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
    @Override
    public int hashCode() {
      return HASH_CODE_PRIME * 1 + value;
    }

```

### PointlessArithmeticExpression
`HASH_CODE_PRIME * 1` can be replaced with 'HASH_CODE_PRIME'
in `assertj-swing/src/main/java/org/assertj/swing/timing/Timeout.java`
#### Snippet
```java
  @Override
  public int hashCode() {
    return HASH_CODE_PRIME * 1 + (int) (duration ^ (duration >>> 32));
  }

```

## RuleId[id=AssignmentToStaticFieldFromInstanceMethod]
### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `sign` from instance context
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowStatus.java`
#### Snippet
```java
      robot.mouseMove(x, y + sign);
    }
    sign = -sign;
  }

```

### AssignmentToStaticFieldFromInstanceMethod
Assignment to static field `counter` from instance context
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ReportTransformer.java`
#### Snippet
```java
    Project project = task.getProject();
    if (format.equals(FRAMES)) {
      String tempFileProperty = concat(getClass().getName(), String.valueOf(counter++));
      setUpTempFileTask(tempFileTask, tempFileProperty);
      return new File(project.getProperty(tempFileProperty));
```

## RuleId[id=ManualArrayCopy]
### ManualArrayCopy
Manual array copy
in `assertj-swing/src/main/java/org/assertj/swing/util/Arrays.java`
#### Snippet
```java
    int arraySize = array.length;
    T[] copy = (T[]) Array.newInstance(array.getClass().getComponentType(), arraySize);
    for (int i = 0; i < arraySize; i++) {
      copy[i] = array[i];
    }
```

### ManualArrayCopy
Manual array copy
in `assertj-swing/src/main/java/org/assertj/swing/util/Arrays.java`
#### Snippet
```java
    int arraySize = array.length;
    int[] copy = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      copy[i] = array[i];
    }
```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java
  private final Stack<WeakReference<Component>> componentStack = new Stack<WeakReference<Component>>();
  private final Stack<Point> locationStack = new Stack<Point>();
  private final Stack<Point> screenLocationStack = new Stack<Point>();

  private int buttons;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java
  private final Stack<WeakReference<Component>> componentStack = new Stack<WeakReference<Component>>();
  private final Stack<Point> locationStack = new Stack<Point>();
  private final Stack<Point> screenLocationStack = new Stack<Point>();

  private int buttons;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java

  private final Stack<WeakReference<Component>> componentStack = new Stack<WeakReference<Component>>();
  private final Stack<Point> locationStack = new Stack<Point>();
  private final Stack<Point> screenLocationStack = new Stack<Point>();

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java

  private final Stack<WeakReference<Component>> componentStack = new Stack<WeakReference<Component>>();
  private final Stack<Point> locationStack = new Stack<Point>();
  private final Stack<Point> screenLocationStack = new Stack<Point>();

```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java
  private Point locationOnScreen = new Point(0, 0);

  private final Stack<WeakReference<Component>> componentStack = new Stack<WeakReference<Component>>();
  private final Stack<Point> locationStack = new Stack<Point>();
  private final Stack<Point> screenLocationStack = new Stack<Point>();
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java
  private Point locationOnScreen = new Point(0, 0);

  private final Stack<WeakReference<Component>> componentStack = new Stack<WeakReference<Component>>();
  private final Stack<Point> locationStack = new Stack<Point>();
  private final Stack<Point> screenLocationStack = new Stack<Point>();
```

## RuleId[id=RedundantArrayCreation]
### RedundantArrayCreation
Redundant array creation for calling varargs method
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/GUITestRecognizer.java`
#### Snippet
```java
    try {
      Class<?> testClass = Class.forName(className);
      Method testMethod = testClass.getDeclaredMethod(methodName, new Class<?>[0]);
      return GUITestFinder.isGUITest(testClass, testMethod);
    } catch (Exception e) {
```

### RedundantArrayCreation
Redundant array creation for calling varargs method
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/Tests.java`
#### Snippet
```java
  private static Method methodInType(Class<?> type, String name) {
    try {
      return type.getMethod(name, new Class[0]);
    } catch (Exception e) {
      return null;
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `MODIFIER_TO_KEY.keySet()` may be replaced with 'entrySet()' iteration
in `assertj-swing/src/main/java/org/assertj/swing/util/Modifiers.java`
#### Snippet
```java
  @Nonnull public static int[] keysFor(int modifierMask) {
    List<Integer> keyList = newArrayList();
    for (Integer mask : MODIFIER_TO_KEY.keySet()) {
      if ((modifierMask & mask) != 0) {
        keyList.add(MODIFIER_TO_KEY.get(mask));
```

### KeySetIterationMayUseEntrySet
Iteration over `queueMap.keySet()` may be replaced with 'values()' iteration
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowEventQueueMapping.java`
#### Snippet
```java
  Collection<Window> windows() {
    Set<Window> rootWindows = newHashSet();
    for (EventQueue queue : queueMap.keySet()) {
      rootWindows.addAll(queueMap.get(queue).keySet());
    }
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`queue.size() > 0` can be replaced with '!queue.isEmpty()'
in `assertj-swing/src/main/java/org/assertj/swing/listener/EventDispatchThreadedEventListener.java`
#### Snippet
```java
      deferredEvents.clear();
    }
    while (queue.size() > 0) {
      AWTEvent event = queue.get(0);
      queue.remove(0);
```

## RuleId[id=FinalStaticMethod]
### FinalStaticMethod
'static' method declared `final`
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/NamedComponentMatcherTemplate.java`
#### Snippet
```java
  }

  protected static final @Nonnull Object anyValue() {
    return ANY;
  }
```

### FinalStaticMethod
'static' method declared `final`
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
   * @return the created {@code From}.
   */
  public static final @Nonnull From from(int value) {
    return new From(value);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
   * @return the created {@code To}.
   */
  public static final @Nonnull To to(int value) {
    return new To(value);
  }
```

### FinalStaticMethod
'static' method declared `final`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/testcase/AssertJSwingJUnitTestCase.java`
#### Snippet
```java
   */
  @BeforeClass
  public static final void setUpOnce() {
    FailOnThreadViolationRepaintManager.install();
  }
```

### FinalStaticMethod
'static' method declared `final`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/testcase/AssertJSwingJUnitTestCase.java`
#### Snippet
```java
   */
  @AfterClass
  public static final void tearDownOnce() {
    FailOnThreadViolationRepaintManager.uninstall();
  }
```

### FinalStaticMethod
'static' method declared `final`
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/testcase/AssertJSwingTestngTestCase.java`
#### Snippet
```java
   */
  @AfterClass(alwaysRun = true)
  public static final void tearDownOnce() {
    FailOnThreadViolationRepaintManager.uninstall();
  }
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `AssertJSwingJUnitTestCase` has no concrete subclass
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/testcase/AssertJSwingJUnitTestCase.java`
#### Snippet
```java
 * @author Alex Ruiz
 */
public abstract class AssertJSwingJUnitTestCase extends AssertJSwingTestCaseTemplate {

  /**
```

### AbstractClassNeverImplemented
Abstract class `AssertJSwingTestngTestCase` has no concrete subclass
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/testcase/AssertJSwingTestngTestCase.java`
#### Snippet
```java
 * @author Alex Ruiz
 */
public abstract class AssertJSwingTestngTestCase extends AssertJSwingTestCaseTemplate {

  /**
```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder message` are updated, but never queried
in `assertj-swing/src/main/java/org/assertj/swing/core/UnexpectedJOptionPaneFinder.java`
#### Snippet
```java

  private void unexpectedJOptionPanesFound(@Nonnull List<Component> found) {
    StringBuilder message = new StringBuilder();
    message.append("Expecting no JOptionPane to be showing, but found:<[");
    int size = found.size();
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? super String`
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java
  }

  private static <T> T getGeneric(Properties p, String suffix, Function<String, T> convert, T defaultValue) {
    String key = "org.assertj.swing." + suffix;
    String systemProperty = System.getProperty(key);
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java
  }

  private static <T> T getGeneric(Properties p, String suffix, Function<String, T> convert, T defaultValue) {
    String key = "org.assertj.swing." + suffix;
    String systemProperty = System.getProperty(key);
```

### BoundedWildcard
Can generalize to `? extends Component`
in `assertj-swing/src/main/java/org/assertj/swing/core/UnexpectedJOptionPaneFinder.java`
#### Snippet
```java
  }

  private void unexpectedJOptionPanesFound(@Nonnull List<Component> found) {
    StringBuilder message = new StringBuilder();
    message.append("Expecting no JOptionPane to be showing, but found:<[");
```

### BoundedWildcard
Can generalize to `? extends T`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java

  @RunsInEDT
  private <T extends Component> void find(@Nonnull ComponentHierarchy h, @Nonnull GenericTypeMatcher<T> m,
                                          @Nonnull Component root, Set<T> found) {
    for (Component c : childrenOfComponent(root, h)) {
```

### BoundedWildcard
Can generalize to `? super T`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
  @RunsInEDT
  private <T extends Component> void find(@Nonnull ComponentHierarchy h, @Nonnull GenericTypeMatcher<T> m,
                                          @Nonnull Component root, Set<T> found) {
    for (Component c : childrenOfComponent(root, h)) {
      find(h, m, checkNotNull(c), found);
```

### BoundedWildcard
Can generalize to `? super Component`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
  @RunsInEDT
  private void find(@Nonnull ComponentHierarchy h, @Nonnull ComponentMatcher m, @Nonnull Component root,
                    @Nonnull Set<Component> found) {
    for (Component c : childrenOfComponent(root, h)) {
      find(h, m, checkNotNull(c), found);
```

### BoundedWildcard
Can generalize to `? extends Component`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  private Collection<? extends JPopupMenu> determineInnerPopupsToRemove(List<Component> found) {
    // JPopupMenu contains JMenuItem's (note: JMenu extends JMenuItem):
    // ...... JMenu [implying a cascading JPopupMenu automatically set up]
```

### BoundedWildcard
Can generalize to `? extends Component`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  private static void appendComponents(final @Nonnull StringBuilder message, final @Nonnull Collection<Component> found) {
    execute(() -> {
      for (Component c : found) {
```

### BoundedWildcard
Can generalize to `? extends Container`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
  @RunsInEDT
  private void maximizeOrNormalize(@Nonnull JInternalFrame internalFrame, @Nonnull JInternalFrameAction action,
                                   @Nonnull Pair<Container, Point> toMoveMouseTo) {
    moveMouseIgnoringAnyError(toMoveMouseTo.first, toMoveMouseTo.second);
    setMaximumProperty(internalFrame, action);
```

### BoundedWildcard
Can generalize to `? extends Point`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
  @RunsInEDT
  private void maximizeOrNormalize(@Nonnull JInternalFrame internalFrame, @Nonnull JInternalFrameAction action,
                                   @Nonnull Pair<Container, Point> toMoveMouseTo) {
    moveMouseIgnoringAnyError(toMoveMouseTo.first, toMoveMouseTo.second);
    setMaximumProperty(internalFrame, action);
```

### BoundedWildcard
Can generalize to `? extends Point`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
  }

  @Nonnull private Point cellCenterIn(@Nonnull Pair<Integer, Point> scrollInfo) {
    return checkNotNull(scrollInfo.second);
  }
```

### BoundedWildcard
Can generalize to `? extends Point`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void simulateScrolling(@Nonnull JScrollBar scrollBar, @Nonnull GenericRange<Point> points) {
    robot.moveMouse(scrollBar, points.from());
    robot.moveMouse(scrollBar, points.to());
```

### BoundedWildcard
Can generalize to `? extends Point`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void scroll(@Nonnull JScrollBar scrollBar, @Nonnull Pair<Point, Integer> scrollInfo) {
    // For now, do it programmatically, faking the mouse movement and clicking
    robot.moveMouse(scrollBar, checkNotNull(scrollInfo.first));
```

### BoundedWildcard
Can generalize to `? extends Point`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void doFloat(@Nonnull JToolBar toolBar, int x, int y, Pair<Point, Pair<Window, Point>> floatInfo) {
    drag(toolBar, checkNotNull(floatInfo.first));
    Pair<Window, Point> locationAndAncestor = floatInfo.second;
```

### BoundedWildcard
Can generalize to `? extends Pair`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void doFloat(@Nonnull JToolBar toolBar, int x, int y, Pair<Point, Pair<Window, Point>> floatInfo) {
    drag(toolBar, checkNotNull(floatInfo.first));
    Pair<Window, Point> locationAndAncestor = floatInfo.second;
```

### BoundedWildcard
Can generalize to `? extends Component`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java

  @RunsInEDT
  private static void appendComponents(final @Nonnull StringBuilder message, final @Nonnull Collection<Component> found) {
    execute(() -> {
      for (Component c : found) {
```

### BoundedWildcard
Can generalize to `? extends Point`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void simulateMovingDivider(@Nonnull JSplitPane splitPane, @Nonnull GenericRange<Point> range) {
    try {
      robot.moveMouse(splitPane, range.from());
```

### BoundedWildcard
Can generalize to `? super Integer`
in `assertj-swing/src/main/java/org/assertj/swing/driver/MultipleSelectionTemplate.java`
#### Snippet
```java

  @RunsInEDT
  final void multiSelect(Consumer<Integer> action, boolean firstWithoutCommandKey) {
    int elementCount = elementCount();
    if (firstWithoutCommandKey) {
```

### BoundedWildcard
Can generalize to `? extends Point`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void slide(@Nonnull JSlider slider, int value, @Nonnull GenericRange<Point> fromAndTo) {
    moveMouseIgnoringAnyError(slider, fromAndTo.from());
    moveMouseIgnoringAnyError(slider, fromAndTo.to());
```

### BoundedWildcard
Can generalize to `? extends Dimension`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void simulateMoveStarted(@Nonnull Container c, @Nonnull Triple<Dimension, Insets, Point> moveInfo, int x,
      int y) {
    Point p = moveLocation(checkNotNull(moveInfo.first), checkNotNull(moveInfo.second));
```

### BoundedWildcard
Can generalize to `? extends Insets`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void simulateMoveStarted(@Nonnull Container c, @Nonnull Triple<Dimension, Insets, Point> moveInfo, int x,
      int y) {
    Point p = moveLocation(checkNotNull(moveInfo.first), checkNotNull(moveInfo.second));
```

### BoundedWildcard
Can generalize to `? extends Dimension`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
  }

  @Nonnull private static Point resizeLocation(final @Nonnull Pair<Dimension, Insets> resizeInfo) {
    return resizeLocation(checkNotNull(resizeInfo.first), checkNotNull(resizeInfo.second));
  }
```

### BoundedWildcard
Can generalize to `? extends Insets`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
  }

  @Nonnull private static Point resizeLocation(final @Nonnull Pair<Dimension, Insets> resizeInfo) {
    return resizeLocation(checkNotNull(resizeInfo.first), checkNotNull(resizeInfo.second));
  }
```

### BoundedWildcard
Can generalize to `? extends EventQueue`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/EventQueueMapping.java`
#### Snippet
```java
  }

  @Nullable private EventQueue queueFrom(@Nullable WeakReference<EventQueue> reference) {
    if (reference == null) {
      return null;
```

### BoundedWildcard
Can generalize to `? extends ChildrenFinderStrategy`
in `assertj-swing/src/main/java/org/assertj/swing/hierarchy/ChildrenFinder.java`
#### Snippet
```java

  @VisibleForTesting
  static void replaceStrategiesWith(@Nonnull List<ChildrenFinderStrategy> newStrategies) {
    strategies = newArrayList(newStrategies);
  }
```

### BoundedWildcard
Can generalize to `? extends KeyStrokeMapping`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/ParsedKeyStrokeMappingProvider.java`
#### Snippet
```java
  private final List<KeyStrokeMapping> mappings = newArrayList();

  ParsedKeyStrokeMappingProvider(@Nonnull List<KeyStrokeMapping> mappings) {
    this.mappings.addAll(defaultMappings());
    this.mappings.addAll(mappings);
```

### BoundedWildcard
Can generalize to `? super String`
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/listener/ScreenshotFileNameGenerator.java`
#### Snippet
```java
  }

  private static void addParameters(ITestResult result, List<String> parts) {
    Object[] parameters = result.getParameters();
    if (parameters == null)
```

## RuleId[id=NullableProblems]
### NullableProblems
Overridden method parameters are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/core/Robot.java`
#### Snippet
```java
   * @throws IllegalArgumentException if the given code is not a valid key code.
   */
  void pressKeyWhileRunning(int keyCode, @Nonnull Runnable runnable);

  /**
```

### NullableProblems
Overridden method parameters are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/core/Robot.java`
#### Snippet
```java
   * @see java.awt.event.InputEvent
   */
  void pressModifiersWhileRunning(int modifierMask, @Nonnull Runnable runnable);

  /**
```

### NullableProblems
Overridden methods are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/text/TextReader.java`
#### Snippet
```java
   * @return the type of AWT or Swing {@code Component} this reader supports.
   */
  public abstract @Nonnull Class<T> supportedComponent();

  /**
```

### NullableProblems
Primitive type members cannot be annotated
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static boolean isEnabledAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.isEnabledAt(index.value));
  }
```

### NullableProblems
Overridden methods are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/format/ComponentFormatter.java`
#### Snippet
```java
   * @return the type of {@code Component} this formatter supports.
   */
  @Nonnull
  Class<? extends Component> targetType();
}
```

### NullableProblems
Overridden methods are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/format/ComponentFormatterTemplate.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  protected abstract @Nonnull String doFormat(@Nonnull Component c);

  private void checkTypeOf(@Nonnull Component c) {
```

### NullableProblems
Overridden methods are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/timing/Condition.java`
#### Snippet
```java
   * @return by default, an empty {@code String}.
   */
  @Nonnull protected String descriptionAddendum() {
    return EMPTY_TEXT;
  }
```

### NullableProblems
Overridden methods are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/fixture/ComponentFixtureExtension.java`
#### Snippet
```java
   * @return the created {@code ComponentFixture}.
   */
  public abstract @Nonnull F createFixture(@Nonnull Robot robot, @Nonnull Container root);
}

```

### NullableProblems
Overridden method parameters are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void click(@Nonnull Component c) {
    checkClickAllowed(c);
    robot.click(c);
```

### NullableProblems
Nullability annotation is not applicable to constructors
in `assertj-swing/src/main/java/org/assertj/swing/exception/UnexpectedException.java`
#### Snippet
```java
   * @param cause the unexpected exception.
   */
  @Nonnull public UnexpectedException(@Nonnull Throwable cause) {
    super(cause);
  }
```

### NullableProblems
Overridden methods are not annotated
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider.java`
#### Snippet
```java
   * @return the {@code KeyStrokeMapping}s to be used by {@link KeyStrokeMap}.
   */
  @Nonnull
  Collection<KeyStrokeMapping> keyStrokeMappings();
}
```

## RuleId[id=MissortedModifiers]
### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiQuery.java`
#### Snippet
```java
  protected abstract @Nullable T executeInEDT() throws Throwable;

  final @Nullable T result() {
    return result;
  }
```

### MissortedModifiers
Missorted modifiers `protected abstract @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiQuery.java`
#### Snippet
```java
   * @throws Throwable any error thrown when executing an action in the event dispatch thread (EDT).
   */
  protected abstract @Nullable T executeInEDT() throws Throwable;

  final @Nullable T result() {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiAction.java`
#### Snippet
```java
  private CountDownLatch executionNotification;

  final @Nullable Throwable catchedException() {
    return caughtException;
  }
```

### MissortedModifiers
Missorted modifiers `protected abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiLazyLoadingDescription.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  protected abstract @Nonnull String loadDescription();
}

```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiLazyLoadingDescription.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull String value() {
    String result = execute(() -> loadDescription());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/FocusMonitor.java`
#### Snippet
```java
  private volatile boolean hasFocus;

  static @Nonnull FocusMonitor attachTo(@Nonnull Component c) {
    FocusMonitor monitor = new FocusMonitor(c);
    c.addFocusListener(monitor);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/awt/AWT.java`
#### Snippet
```java
  @RunsInCurrentThread
  @Nullable public static
  Component invokerOf(final @Nonnull Component c) {
    if (c instanceof JPopupMenu) {
      return ((JPopupMenu) c).getInvoker();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/ActivateWindowTask.java`
#### Snippet
```java
class ActivateWindowTask {
  @RunsInEDT
  static void activateWindow(final @Nonnull Window w) {
    execute(() -> {
      w.toFront();
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/FocusOwnerFinder.java`
#### Snippet
```java

  @VisibleForTesting
  static @Nonnull List<FocusOwnerFinderStrategy> strategies() {
    return newArrayList(STRATEGIES);
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/ComponentIsFocusableQuery.java`
#### Snippet
```java
final class ComponentIsFocusableQuery {
  @RunsInEDT
  static boolean isFocusable(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isFocusable());
    return Preconditions.checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentPrinter.java`
#### Snippet
```java
   * @return the component hierarchy used by this printer.
   */
  protected final @Nonnull ComponentHierarchy hierarchy() {
    return hierarchy;
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/ComponentRequestFocusTask.java`
#### Snippet
```java
final class ComponentRequestFocusTask {
  @RunsInEDT
  static void giveFocusTo(final @Nonnull Component c) {
    execute(() -> c.requestFocusInWindow());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/Scrolling.java`
#### Snippet
```java
   * @param rectangle the rectangular region.
   */
  private static void scrollToVisible(@Nonnull Robot robot, final @Nonnull JComponent c,
      final @Nonnull Rectangle rectangle) {
    execute(() -> c.scrollRectToVisible(rectangle));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/Scrolling.java`
#### Snippet
```java
   */
  private static void scrollToVisible(@Nonnull Robot robot, final @Nonnull JComponent c,
      final @Nonnull Rectangle rectangle) {
    execute(() -> c.scrollRectToVisible(rectangle));
    robot.waitForIdle();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/GenericTypeMatcher.java`
#### Snippet
```java
   * @return the supported type of this matcher.
   */
  public final @Nonnull Class<T> supportedType() {
    return supportedType;
  }
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/NamedComponentMatcherTemplate.java`
#### Snippet
```java
  }

  protected final @Nullable Object name() {
    return name;
  }
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/NamedComponentMatcherTemplate.java`
#### Snippet
```java
   *         not been set.
   */
  protected final @Nullable Object quotedName() {
    return quoted(name);
  }
```

### MissortedModifiers
Missorted modifiers `protected static final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/NamedComponentMatcherTemplate.java`
#### Snippet
```java
  }

  protected static final @Nonnull Object anyValue() {
    return ANY;
  }
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/NamedComponentMatcherTemplate.java`
#### Snippet
```java
   *         has not been set.
   */
  protected final @Nullable Object quoted(@Nullable Object propertyValue) {
    if (ANY.equals(propertyValue)) {
      return ANY;
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInRowByValue.java`
#### Snippet
```java

  @RunsInCurrentThread
  private static void validateEqualSize(final @Nonnull JTable table, final @Nonnull String[] values) {
    int columnCount = table.getColumnCount();
    if (values.length != columnCount) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInRowByValue.java`
#### Snippet
```java

  @RunsInCurrentThread
  private static void validateEqualSize(final @Nonnull JTable table, final @Nonnull String[] values) {
    int columnCount = table.getColumnCount();
    if (values.length != columnCount) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInRowByValue.java`
#### Snippet
```java

  @RunsInEDT
  private static int findRowIndex(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader,
                                  final @Nonnull String[] values) {
    Integer result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInRowByValue.java`
#### Snippet
```java

  @RunsInEDT
  private static int findRowIndex(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader,
                                  final @Nonnull String[] values) {
    Integer result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInRowByValue.java`
#### Snippet
```java
  @RunsInEDT
  private static int findRowIndex(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader,
                                  final @Nonnull String[] values) {
    Integer result = execute(() -> {
      validateEqualSize(table, values);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellByColumnId.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static TableCell findCell(final @Nonnull JTable table, final int row, final @Nonnull Object columnId) {
    TableCell result = execute(() -> {
      int column = columnIndexByIdentifier(table, columnId);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellByColumnId.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static TableCell findCell(final @Nonnull JTable table, final int row, final @Nonnull Object columnId) {
    TableCell result = execute(() -> {
      int column = columnIndexByIdentifier(table, columnId);
```

### MissortedModifiers
Missorted modifiers `public abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/text/TextReader.java`
#### Snippet
```java
   * @return the type of AWT or Swing {@code Component} this reader supports.
   */
  public abstract @Nonnull Class<T> supportedComponent();

  /**
```

### MissortedModifiers
Missorted modifiers `public static final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
   * @return the created {@code From}.
   */
  public static final @Nonnull From from(int value) {
    return new From(value);
  }
```

### MissortedModifiers
Missorted modifiers `public static final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
   * @return the created {@code To}.
   */
  public static final @Nonnull To to(int value) {
    return new To(value);
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java

  @RunsInEDT
  private static <T extends Component> boolean isMatching(final @Nonnull Component c,
                                                          final @Nonnull GenericTypeMatcher<T> m) {
    Boolean matching = execute(() -> m.matches(c));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
  @RunsInEDT
  private static <T extends Component> boolean isMatching(final @Nonnull Component c,
                                                          final @Nonnull GenericTypeMatcher<T> m) {
    Boolean matching = execute(() -> m.matches(c));
    return checkNotNull(matching);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Collection<? extends Component> rootsOf(final @Nonnull ComponentHierarchy h) {
    return checkNotNull(execute(() -> h.roots()));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Collection<Component> childrenOfComponent(final @Nonnull Component c,
                                                                    final @Nonnull ComponentHierarchy h) {
    Collection<Component> children = execute(() -> h.childrenOf(c));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Collection<Component> childrenOfComponent(final @Nonnull Component c,
                                                                    final @Nonnull ComponentHierarchy h) {
    Collection<Component> children = execute(() -> h.childrenOf(c));
    return checkNotNull(children);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/text/TextReaders.java`
#### Snippet
```java
   */
  @RunsInEDT
  public boolean containsText(final @Nonnull Container container, final @Nonnull String text) {
    checkNotNull(container);
    checkNotNull(text);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/text/TextReaders.java`
#### Snippet
```java
   */
  @RunsInEDT
  public boolean containsText(final @Nonnull Container container, final @Nonnull String text) {
    checkNotNull(container);
    checkNotNull(text);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/image/ScreenshotTaker.java`
#### Snippet
```java

  // TODO(Alex): Verify that this method really needs to be executed in the EDT.
  @Nonnull private static BufferedImage takeScreenshot(final @Nonnull Robot robot, final @Nonnull Rectangle r) {
    BufferedImage result = execute(() -> robot.createScreenCapture(r));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/image/ScreenshotTaker.java`
#### Snippet
```java

  // TODO(Alex): Verify that this method really needs to be executed in the EDT.
  @Nonnull private static BufferedImage takeScreenshot(final @Nonnull Robot robot, final @Nonnull Rectangle r) {
    BufferedImage result = execute(() -> robot.createScreenCapture(r));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/image/ScreenshotTaker.java`
#### Snippet
```java

  @RunsInEDT
  private static void showCaretOf(final @Nonnull JTextComponent textComponent) {
    execute(() -> {
      Caret caret = textComponent.getCaret();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentHasFocusQuery.java`
#### Snippet
```java
   */
  @RunsInEDT
  public static boolean hasFocus(final @Nonnull Component component) {
    Boolean result = execute(() -> component.hasFocus());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentVisibleQuery.java`
#### Snippet
```java
   */
  @RunsInEDT
  public static boolean isVisible(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isVisible());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentParentQuery.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nullable public static Container parentOf(final @Nonnull Component component) {
    return execute(() -> component.getParent());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentSizeQuery.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nonnull public static Dimension sizeOf(final @Nonnull Component component) {
    Dimension result = execute(() -> component.getSize());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `public synchronized @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/input/InputState.java`
#### Snippet
```java
   * @return the last known mouse location.
   */
  public synchronized @Nullable Point mouseLocationOnScreen() {
    return mouseInfo.locationOnScreen();
  }
```

### MissortedModifiers
Missorted modifiers `public synchronized @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/input/InputState.java`
#### Snippet
```java
   * @return the most deeply nested AWT or Swing {@code Component} which currently contains the pointer.
   */
  public synchronized @Nullable Component deepestComponentUnderMousePointer() {
    Component c = mouseComponent();
    if (c != null) {
```

### MissortedModifiers
Missorted modifiers `public synchronized @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/input/InputState.java`
#### Snippet
```java
   * @return the last known {@code Component} to contain the pointer, or {@code null} if none.
   */
  public synchronized @Nullable Component mouseComponent() {
    return mouseInfo.component();
  }
```

### MissortedModifiers
Missorted modifiers `public synchronized @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/input/InputState.java`
#### Snippet
```java
   *         outside all components.
   */
  public synchronized @Nullable Point mouseLocation() {
    return mouseInfo.location();
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentShowingQuery.java`
#### Snippet
```java
   */
  @RunsInEDT
  public static boolean isShowing(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isShowing());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentLocationOnScreenQuery.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nonnull public static Point locationOnScreen(final @Nonnull Component component) {
    Point result = execute(() -> component.getLocationOnScreen());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentEnabledQuery.java`
#### Snippet
```java
   * @see Component#isEnabled()
   */
  public static boolean isEnabled(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isEnabled());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/JTableColumnByIdentifierQuery.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  public static int columnIndexByIdentifier(final @Nonnull JTable table, final @Nonnull Object identifier) {
    try {
      TableColumn column = table.getColumn(identifier);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/JTableColumnByIdentifierQuery.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  public static int columnIndexByIdentifier(final @Nonnull JTable table, final @Nonnull Object identifier) {
    try {
      TableColumn column = table.getColumn(identifier);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/query/AbstractButtonTextQuery.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nullable public static String textOf(final @Nonnull AbstractButton button) {
    return execute(() -> button.getText());
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCellEditorQuery.java`
#### Snippet
```java
final class JTableCellEditorQuery {
  @RunsInCurrentThread
  static @Nullable Component cellEditorIn(final @Nonnull JTable table, final int row, final int column) {
    TableCellEditor cellEditor = table.getCellEditor(row, column);
    return cellEditor.getTableCellEditorComponent(table, table.getValueAt(row, column), false, row, column);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCellEditorQuery.java`
#### Snippet
```java
final class JTableCellEditorQuery {
  @RunsInCurrentThread
  static @Nullable Component cellEditorIn(final @Nonnull JTable table, final int row, final int column) {
    TableCellEditor cellEditor = table.getCellEditor(row, column);
    return cellEditor.getTableCellEditorComponent(table, table.getValueAt(row, column), false, row, column);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneSelectTabQuery.java`
#### Snippet
```java
final class JTabbedPaneSelectTabQuery {
  @RunsInEDT
  static Index selectedTabIndexOf(final @Nonnull JTabbedPane tabbedPane) {
    Integer selectedTab = execute(() -> tabbedPane.getSelectedIndex());
    return atIndex(selectedTab);
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerValueQuery.java`
#### Snippet
```java
final class JSpinnerValueQuery {
  @RunsInEDT
  static @Nullable Object valueOf(final @Nonnull JSpinner spinner) {
    return execute(() -> spinner.getValue());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerValueQuery.java`
#### Snippet
```java
final class JSpinnerValueQuery {
  @RunsInEDT
  static @Nullable Object valueOf(final @Nonnull JSpinner spinner) {
    return execute(() -> spinner.getValue());
  }
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/TextAssert.java`
#### Snippet
```java
 */
class TextAssert extends AbstractCharSequenceAssert<TextAssert, String> {
  static @Nonnull TextAssert assertThat(@Nullable String s) {
    return new TextAssert(s);
  }
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/TextAssert.java`
#### Snippet
```java
  }

  static @Nonnull TextAssert verifyThat(@Nullable String s) {
    return new TextAssert(s);
  }
```

### MissortedModifiers
Missorted modifiers `abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarLocationStrategy.java`
#### Snippet
```java
  abstract @Nonnull Point blockLocation(@Nonnull JScrollBar scrollBar, @Nonnull Point unitLocation, int offset);

  abstract @Nonnull Point unitLocationToScrollDown(@Nonnull JScrollBar scrollBar);
}

```

### MissortedModifiers
Missorted modifiers `abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarLocationStrategy.java`
#### Snippet
```java
  abstract @Nonnull Point thumbLocation(@Nonnull JScrollBar scrollBar, double fraction);

  abstract @Nonnull Point blockLocation(@Nonnull JScrollBar scrollBar, @Nonnull Point unitLocation, int offset);

  abstract @Nonnull Point unitLocationToScrollDown(@Nonnull JScrollBar scrollBar);
```

### MissortedModifiers
Missorted modifiers `abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarLocationStrategy.java`
#### Snippet
```java
  abstract int arrow(@Nonnull JScrollBar scrollBar);

  abstract @Nonnull Point thumbLocation(@Nonnull JScrollBar scrollBar, double fraction);

  abstract @Nonnull Point blockLocation(@Nonnull JScrollBar scrollBar, @Nonnull Point unitLocation, int offset);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableMatchingCellQuery.java`
#### Snippet
```java
final class JTableMatchingCellQuery {
  @RunsInEDT
  static @Nonnull TableCell cellWithValue(final @Nonnull JTable table, final @Nonnull TextMatcher matcher,
                                          final @Nonnull JTableCellReader cellReader) {
    TableCell result = execute(() -> findMatchingCell(table, matcher, cellReader));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableMatchingCellQuery.java`
#### Snippet
```java
final class JTableMatchingCellQuery {
  @RunsInEDT
  static @Nonnull TableCell cellWithValue(final @Nonnull JTable table, final @Nonnull TextMatcher matcher,
                                          final @Nonnull JTableCellReader cellReader) {
    TableCell result = execute(() -> findMatchingCell(table, matcher, cellReader));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableMatchingCellQuery.java`
#### Snippet
```java
final class JTableMatchingCellQuery {
  @RunsInEDT
  static @Nonnull TableCell cellWithValue(final @Nonnull JTable table, final @Nonnull TextMatcher matcher,
                                          final @Nonnull JTableCellReader cellReader) {
    TableCell result = execute(() -> findMatchingCell(table, matcher, cellReader));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableMatchingCellQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull TableCell cellWithValue(final @Nonnull JTable table, final @Nonnull TextMatcher matcher,
                                          final @Nonnull JTableCellReader cellReader) {
    TableCell result = execute(() -> findMatchingCell(table, matcher, cellReader));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static AppletContext appletContext(final @Nonnull JApplet applet) {
    return execute(() -> applet.getAppletContext());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void doResize(final @Nonnull JApplet applet, final int width, final int height) {
    execute(() -> applet.resize(width, height));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String parameter(final @Nonnull JApplet applet, final @Nullable String parameterName) {
    return execute(() -> applet.getParameter(parameterName));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String parameter(final @Nonnull JApplet applet, final @Nullable String parameterName) {
    return execute(() -> applet.getParameter(parameterName));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static URL codeBase(final @Nonnull JApplet applet) {
    return execute(() -> applet.getCodeBase());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static boolean active(final @Nonnull JApplet applet) {
    Boolean result = execute(() -> applet.isActive());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static URL documentBase(final @Nonnull JApplet applet) {
    return execute(() -> applet.getDocumentBase());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuItemDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateAndDoClick(final @Nonnull JMenuItem menuItem) {
    execute(() -> {
      checkEnabledAndShowing(menuItem);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuItemDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static JMenuItemLocation locationOf(final @Nonnull JMenuItem menuItem) {
    JMenuItemLocation result = execute(() -> new JMenuItemLocation(menuItem));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonTextQuery.java`
#### Snippet
```java
final class AbstractButtonTextQuery {
  @RunsInEDT
  static @Nonnull String textOf(final @Nonnull AbstractButton button) {
    String result = execute(() -> button.getText());
    return result == null ? "" : result;
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonTextQuery.java`
#### Snippet
```java
final class AbstractButtonTextQuery {
  @RunsInEDT
  static @Nonnull String textOf(final @Nonnull AbstractButton button) {
    String result = execute(() -> button.getText());
    return result == null ? "" : result;
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneLocation.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  @Nonnull public Point pointAt(final @Nonnull JTabbedPane tabbedPane, final int index) {
    checkIndexInBounds(tabbedPane, index);
    Rectangle rect = tabbedPane.getUI().getTabBounds(tabbedPane, index);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneLocation.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  public int indexOf(final @Nonnull JTabbedPane tabbedPane, final @Nonnull TextMatcher matcher) {
    int index = indexOfTab(tabbedPane, matcher);
    if (index >= 0) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneLocation.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  public int indexOf(final @Nonnull JTabbedPane tabbedPane, final @Nonnull TextMatcher matcher) {
    int index = indexOfTab(tabbedPane, matcher);
    if (index >= 0) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Component, Point> invokerAndCenterOfInvoker(final @Nonnull JPopupMenu popupMenu) {
    Pair<Component, Point> result = execute(new GuiQuery<Pair<Component, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @VisibleForTesting
  final @Nullable Object screenLockOwner() {
    return screenLockOwner;
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInCurrentThread
  private static void dispose(final @Nonnull ComponentHierarchy hierarchy, @Nonnull Window w) {
    hierarchy.dispose(w);
    w.setVisible(false);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  private static void appendComponents(final @Nonnull StringBuilder message, final @Nonnull Collection<Component> found) {
    execute(() -> {
      for (Component c : found) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  private static void appendComponents(final @Nonnull StringBuilder message, final @Nonnull Collection<Component> found) {
    execute(() -> {
      for (Component c : found) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  private static void disposeWindows(final @Nonnull ComponentHierarchy hierarchy) {
    execute(() -> {
      for (Container c : hierarchy.roots()) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  private static Pair<Window, Window> windowAncestorsOf(final @Nullable Component one, final @Nullable Component two) {
    return execute(new GuiQuery<Pair<Window, Window>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  @RunsInEDT
  private static Pair<Window, Window> windowAncestorsOf(final @Nullable Component one, final @Nullable Component two) {
    return execute(new GuiQuery<Pair<Window, Window>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComponentToolTipQuery.java`
#### Snippet
```java
final class JComponentToolTipQuery {
  @RunsInEDT
  static @Nullable String toolTipOf(final @Nonnull JComponent c) {
    return execute(() -> c.getToolTipText());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComponentToolTipQuery.java`
#### Snippet
```java
final class JComponentToolTipQuery {
  @RunsInEDT
  static @Nullable String toolTipOf(final @Nonnull JComponent c) {
    return execute(() -> c.getToolTipText());
  }
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeChildrenShowUpCondition.java`
#### Snippet
```java
  private TreePath path;

  static @Nonnull JTreeChildrenShowUpCondition untilChildrenShowUp(@Nonnull JTree tree, @Nonnull TreePath path) {
    return new JTreeChildrenShowUpCondition(tree, path);
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeChildOfPathCountQuery.java`
#### Snippet
```java
final class JTreeChildOfPathCountQuery {
  @RunsInEDT
  static int childCount(final @Nonnull JTree tree, final @Nonnull TreePath path) {
    return checkNotNull(execute(() -> tree.getModel().getChildCount(path.getLastPathComponent())));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeChildOfPathCountQuery.java`
#### Snippet
```java
final class JTreeChildOfPathCountQuery {
  @RunsInEDT
  static int childCount(final @Nonnull JTree tree, final @Nonnull TreePath path) {
    return checkNotNull(execute(() -> tree.getModel().getChildCount(path.getLastPathComponent())));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarSetValueTask.java`
#### Snippet
```java
 */
final class JScrollBarSetValueTask {
  static void setValue(final @Nonnull JScrollBar scrollBar, final int value) {
    execute(() -> scrollBar.setValue(value));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectedIndexQuery.java`
#### Snippet
```java
final class JListSelectedIndexQuery {
  @RunsInEDT
  static int selectedIndexOf(final @Nonnull JList<?> list) {
    Integer result = execute(() -> list.getSelectedIndex());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeExpandPathTask.java`
#### Snippet
```java
final class JTreeExpandPathTask {
  @RunsInEDT
  static void expandTreePath(final @Nonnull JTree tree, final @Nonnull TreePath path) {
    execute(() -> {
      TreePath realPath = addRootIfInvisible(tree, path);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeExpandPathTask.java`
#### Snippet
```java
final class JTreeExpandPathTask {
  @RunsInEDT
  static void expandTreePath(final @Nonnull JTree tree, final @Nonnull TreePath path) {
    execute(() -> {
      TreePath realPath = addRootIfInvisible(tree, path);
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java
final class JTreeNodeTextQuery {
  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final int row, final @Nonnull JTreeLocation location,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java
final class JTreeNodeTextQuery {
  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final int row, final @Nonnull JTreeLocation location,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java
final class JTreeNodeTextQuery {
  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final int row, final @Nonnull JTreeLocation location,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final int row, final @Nonnull JTreeLocation location,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
      TreePath matchingPath = location.pathFor(tree, row);
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final @Nonnull String path,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final @Nonnull String path,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final @Nonnull String path,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeNodeTextQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable String nodeText(final @Nonnull JTree tree, final @Nonnull String path,
                                   final @Nonnull JTreePathFinder pathFinder) {
    return execute(() -> {
      TreePath matchingPath = matchingPathWithRootIfInvisible(tree, path, pathFinder);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Container, Point> maximizeLocationOf(final @Nonnull JInternalFrame internalFrame) {
    Pair<Container, Point> result = execute(new GuiQuery<Pair<Container, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void moveToBack(final @Nonnull JInternalFrame internalFrame) {
    execute(() -> // it seems that moving to back always works, regardless if the internal frame is invisible and/or
                  // disabled.
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Triple<Boolean, Container, Point> validateAndfindDeiconifyInfo(
                                                                                         final @Nonnull JInternalFrame internalFrame) {
    Triple<Boolean, Container, Point> result = execute(new GuiQuery<Triple<Boolean, Container, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void moveToFront(final @Nonnull JInternalFrame internalFrame) {
    execute(() -> // it seems that moving to front always works, regardless if the internal frame is invisible and/or
                  // disabled.
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Boolean, Point> findIconifyInfo(final @Nonnull JInternalFrame internalFrame) {
    Pair<Boolean, Point> result = execute(new GuiQuery<Pair<Boolean, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static Pair<Container, Point> validateAndFindNormalizeLocation(final @Nonnull JInternalFrame internalFrame) {
    return execute(new GuiQuery<Pair<Container, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Point findCloseButtonLocation(final @Nonnull JInternalFrame internalFrame) {
    return execute(() -> {
      checkShowing(internalFrame);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxContentQuery.java`
#### Snippet
```java
final class JComboBoxContentQuery {
  @RunsInEDT
  static @Nonnull String[] contents(final @Nonnull JComboBox<?> comboBox, final @Nonnull JComboBoxCellReader cellReader) {
    String[] result = execute(() -> {
      int itemCount = comboBox.getItemCount();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxContentQuery.java`
#### Snippet
```java
final class JComboBoxContentQuery {
  @RunsInEDT
  static @Nonnull String[] contents(final @Nonnull JComboBox<?> comboBox, final @Nonnull JComboBoxCellReader cellReader) {
    String[] result = execute(() -> {
      int itemCount = comboBox.getItemCount();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxContentQuery.java`
#### Snippet
```java
final class JComboBoxContentQuery {
  @RunsInEDT
  static @Nonnull String[] contents(final @Nonnull JComboBox<?> comboBox, final @Nonnull JComboBoxCellReader cellReader) {
    String[] result = execute(() -> {
      int itemCount = comboBox.getItemCount();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/DialogModalQuery.java`
#### Snippet
```java
final class DialogModalQuery {
  @RunsInEDT
  static boolean isModal(final @Nonnull Dialog dialog) {
    Boolean result = execute(() -> dialog.isModal());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuPopupMenuQuery.java`
#### Snippet
```java
final class JMenuPopupMenuQuery {
  @RunsInEDT
  static @Nonnull JPopupMenu popupMenuOf(final @Nonnull JMenu menu) {
    JPopupMenu result = execute(() -> menu.getPopupMenu());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuPopupMenuQuery.java`
#### Snippet
```java
final class JMenuPopupMenuQuery {
  @RunsInEDT
  static @Nonnull JPopupMenu popupMenuOf(final @Nonnull JMenu menu) {
    JPopupMenu result = execute(() -> menu.getPopupMenu());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneTabTitlesQuery.java`
#### Snippet
```java
final class JTabbedPaneTabTitlesQuery {
  @RunsInEDT
  static @Nonnull String[] tabTitlesOf(final @Nonnull JTabbedPane tabbedPane) {
    String[] result = execute(new GuiQuery<String[]>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneTabTitlesQuery.java`
#### Snippet
```java
final class JTabbedPaneTabTitlesQuery {
  @RunsInEDT
  static @Nonnull String[] tabTitlesOf(final @Nonnull JTabbedPane tabbedPane) {
    String[] result = execute(new GuiQuery<String[]>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarWaitUntilIsDeterminate.java`
#### Snippet
```java
final class JProgressBarWaitUntilIsDeterminate {
  @RunsInEDT
  static void waitUntilValueIsDeterminate(final @Nonnull JProgressBar progressBar, final @Nonnull Timeout timeout) {
    pause(new Condition(untilIsDeterminate(progressBar)) {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarWaitUntilIsDeterminate.java`
#### Snippet
```java
final class JProgressBarWaitUntilIsDeterminate {
  @RunsInEDT
  static void waitUntilValueIsDeterminate(final @Nonnull JProgressBar progressBar, final @Nonnull Timeout timeout) {
    pause(new Condition(untilIsDeterminate(progressBar)) {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarWaitUntilIsDeterminate.java`
#### Snippet
```java
  }

  private static Description untilIsDeterminate(final @Nonnull JProgressBar progressBar) {
    return new GuiLazyLoadingDescription() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectionValueQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull Pair<Boolean, String> selection(final @Nonnull JComboBox<?> comboBox,
                                                  final @Nonnull JComboBoxCellReader cellReader) {
    Pair<Boolean, String> result = execute(new GuiQuery<Pair<Boolean, String>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectionValueQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull Pair<Boolean, String> selection(final @Nonnull JComboBox<?> comboBox,
                                                  final @Nonnull JComboBoxCellReader cellReader) {
    Pair<Boolean, String> result = execute(new GuiQuery<Pair<Boolean, String>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectionValueQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull Pair<Boolean, String> selection(final @Nonnull JComboBox<?> comboBox,
                                                  final @Nonnull JComboBoxCellReader cellReader) {
    Pair<Boolean, String> result = execute(new GuiQuery<Pair<Boolean, String>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentSelectAllTask.java`
#### Snippet
```java
final class JTextComponentSelectAllTask {
  @RunsInEDT
  static void selectAllText(final @Nonnull JTextComponent textBox) {
    execute(() -> textBox.selectAll());
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/FrameTitleQuery.java`
#### Snippet
```java
final class FrameTitleQuery {
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull Frame f) {
    return execute(() -> f.getTitle());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/FrameTitleQuery.java`
#### Snippet
```java
final class FrameTitleQuery {
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull Frame f) {
    return execute(() -> f.getTitle());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCancelCellEditingTask.java`
#### Snippet
```java
final class JTableCancelCellEditingTask {
  @RunsInEDT
  static void cancelEditing(final @Nonnull JTable table, final int row, final int column) {
    execute(() -> {
      checkCellIndicesInBounds(table, row, column);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCancelCellEditingTask.java`
#### Snippet
```java

  @RunsInEDT
  static void cancelEditing(final @Nonnull TableCellEditor cellEditor) {
    execute(() -> doCancelEditing(cellEditor));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarMaximumQuery.java`
#### Snippet
```java
final class JProgressBarMaximumQuery {
  @RunsInEDT
  static int maximumOf(final @Nonnull JProgressBar progressBar) {
    Integer result = execute(() -> progressBar.getMaximum());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListCellCenterQuery.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  static @Nonnull Point cellCenter(@Nonnull JList<?> list, @Nonnull Rectangle cellBounds) {
    Point cellCenter = centerOf(cellBounds);
    Rectangle visibleRect = list.getVisibleRect();
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarMinimumAndMaximumQuery.java`
#### Snippet
```java
final class JProgressBarMinimumAndMaximumQuery {
  @RunsInEDT
  static @Nonnull Pair<Integer, Integer> minimumAndMaximumOf(final @Nonnull JProgressBar progressBar) {
    Pair<Integer, Integer> result = execute(() -> Pair.of(progressBar.getMinimum(), progressBar.getMaximum()));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarMinimumAndMaximumQuery.java`
#### Snippet
```java
final class JProgressBarMinimumAndMaximumQuery {
  @RunsInEDT
  static @Nonnull Pair<Integer, Integer> minimumAndMaximumOf(final @Nonnull JProgressBar progressBar) {
    Pair<Integer, Integer> result = execute(() -> Pair.of(progressBar.getMinimum(), progressBar.getMaximum()));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java

  @RunsInCurrentThread
  static @Nonnull TreePath matchingPathWithRootIfInvisible(@Nonnull JTree tree, @Nonnull String path,
                                                           @Nonnull JTreePathFinder pathFinder) {
    TreePath matchingPath = pathFinder.findMatchingPath(tree, path);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull TreePath matchingPathFor(final @Nonnull JTree tree, final @Nonnull String path,
                                           final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(() -> matchingPathWithRootIfInvisible(tree, path, pathFinder));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull TreePath matchingPathFor(final @Nonnull JTree tree, final @Nonnull String path,
                                           final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(() -> matchingPathWithRootIfInvisible(tree, path, pathFinder));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull TreePath matchingPathFor(final @Nonnull JTree tree, final @Nonnull String path,
                                           final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(() -> matchingPathWithRootIfInvisible(tree, path, pathFinder));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull TreePath matchingPathFor(final @Nonnull JTree tree, final @Nonnull String path,
                                           final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(() -> matchingPathWithRootIfInvisible(tree, path, pathFinder));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java
final class JTreeMatchingPathQuery {
  @RunsInEDT
  static @Nonnull TreePath verifyJTreeIsReadyAndFindMatchingPath(final @Nonnull JTree tree, final @Nonnull String path,
                                                                 final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(new GuiQuery<TreePath>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java
final class JTreeMatchingPathQuery {
  @RunsInEDT
  static @Nonnull TreePath verifyJTreeIsReadyAndFindMatchingPath(final @Nonnull JTree tree, final @Nonnull String path,
                                                                 final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(new GuiQuery<TreePath>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java
final class JTreeMatchingPathQuery {
  @RunsInEDT
  static @Nonnull TreePath verifyJTreeIsReadyAndFindMatchingPath(final @Nonnull JTree tree, final @Nonnull String path,
                                                                 final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(new GuiQuery<TreePath>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull TreePath verifyJTreeIsReadyAndFindMatchingPath(final @Nonnull JTree tree, final @Nonnull String path,
                                                                 final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(new GuiQuery<TreePath>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void requireSelection(final @Nonnull JList<?> list, int index) {
    int selectedIndex = selectedIndexOf(list);
    if (selectedIndex == -1) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static int itemIndex(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                               final @Nonnull JListCellReader cellReader) {
    Integer result = execute(() -> matchingItemIndex(list, matcher, cellReader));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static int itemIndex(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                               final @Nonnull JListCellReader cellReader) {
    Integer result = execute(() -> matchingItemIndex(list, matcher, cellReader));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
  @RunsInEDT
  private static int itemIndex(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                               final @Nonnull JListCellReader cellReader) {
    Integer result = execute(() -> matchingItemIndex(list, matcher, cellReader));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
  }

  @Nullable private String requiredSelection(final @Nonnull JList<?> list) {
    Object selection = singleSelectionValue(list, cellReader());
    if (NO_SELECTION_VALUE == selection) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void requireSelection(final @Nonnull JList<?> list, @Nullable String value) {
    String selection = requiredSelection(list);
    verifyThat(selection).as(selectedIndexProperty(list)).isEqualOrMatches(value);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
   *           the {@code JList}.
   */
  public void selectItems(final @Nonnull JList<?> list, final @Nonnull int[] indices) {
    checkNotNullOrEmpty(indices);
    clearSelection(list);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
   *           the {@code JList}.
   */
  public void selectItems(final @Nonnull JList<?> list, final @Nonnull int[] indices) {
    checkNotNullOrEmpty(indices);
    clearSelection(list);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
   *           the {@code JList}.
   */
  public void unselectItems(final @Nonnull JList<?> list, final @Nonnull int[] indices) {
    checkNotNullOrEmpty(indices);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
   *           the {@code JList}.
   */
  public void unselectItems(final @Nonnull JList<?> list, final @Nonnull int[] indices) {
    checkNotNullOrEmpty(indices);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void selectItems(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher) {
    final List<Integer> indices = matchingItemIndices(list, matcher, cellReader());
    if (indices.isEmpty()) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void selectItems(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher) {
    final List<Integer> indices = matchingItemIndices(list, matcher, cellReader());
    if (indices.isEmpty()) {
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListCellBoundsQuery.java`
#### Snippet
```java
final class JListCellBoundsQuery {
  @RunsInCurrentThread
  static @Nullable Rectangle cellBounds(@Nonnull JList<?> list, int index) {
    checkIndexInBounds(list, index);
    return list.getCellBounds(index, index);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateIndicesAndClearSelection(final @Nonnull JList<?> list, final @Nonnull int... indices) {
    execute(() -> {
      checkIndicesInBounds(list, indices);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateIndicesAndClearSelection(final @Nonnull JList<?> list, final @Nonnull int... indices) {
    execute(() -> {
      checkIndicesInBounds(list, indices);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void unselectItems(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher) {
    final List<Integer> indices = matchingItemIndices(list, matcher, cellReader());
    if (indices.isEmpty()) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void unselectItems(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher) {
    final List<Integer> indices = matchingItemIndices(list, matcher, cellReader());
    if (indices.isEmpty()) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void clearSelectionOf(final @Nonnull JList<?> list) {
    execute(() -> list.clearSelection());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameSetIconTask.java`
#### Snippet
```java
final class JInternalFrameSetIconTask {
  @RunsInEDT
  static void setIcon(final @Nonnull JInternalFrame internalFrame, final @Nonnull JInternalFrameAction action) {
    execute(() -> {
      internalFrame.setMaximum(false);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameSetIconTask.java`
#### Snippet
```java
final class JInternalFrameSetIconTask {
  @RunsInEDT
  static void setIcon(final @Nonnull JInternalFrame internalFrame, final @Nonnull JInternalFrameAction action) {
    execute(() -> {
      internalFrame.setMaximum(false);
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarStringQuery.java`
#### Snippet
```java
final class JProgressBarStringQuery {
  @RunsInEDT
  static @Nullable String stringOf(final @Nonnull JProgressBar progressBar) {
    return execute(() -> progressBar.getString());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarStringQuery.java`
#### Snippet
```java
final class JProgressBarStringQuery {
  @RunsInEDT
  static @Nullable String stringOf(final @Nonnull JProgressBar progressBar) {
    return execute(() -> progressBar.getString());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneLocationCalculator.java`
#### Snippet
```java

  @RunsInEDT
  static int locationToMoveDividerTo(final @Nonnull JSplitPane splitPane, final int desiredLocation) {
    Integer result = execute(() -> FINDERS.get(splitPane.getOrientation()).locationToMoveDividerTo(splitPane,
                                                                                                   desiredLocation));
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneLocationCalculator.java`
#### Snippet
```java
  }

  private static abstract class LocationFinder {
    abstract int locationToMoveDividerTo(@Nonnull JSplitPane splitPane, int desiredLocation);

```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerSetValueTask.java`
#### Snippet
```java
final class JSpinnerSetValueTask {
  @RunsInEDT
  static void setValue(final @Nonnull JSpinner spinner, final @Nonnull Object value) {
    execute(() -> {
      checkEnabledAndShowing(spinner);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerSetValueTask.java`
#### Snippet
```java
final class JSpinnerSetValueTask {
  @RunsInEDT
  static void setValue(final @Nonnull JSpinner spinner, final @Nonnull Object value) {
    execute(() -> {
      checkEnabledAndShowing(spinner);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void toggleRowThroughTreeUI(final @Nonnull JTree tree, final @Nonnull Point p) {
    execute(() -> {
      TreeUI treeUI = tree.getUI();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void toggleRowThroughTreeUI(final @Nonnull JTree tree, final @Nonnull Point p) {
    execute(() -> {
      TreeUI treeUI = tree.getUI();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void selectPaths(final @Nonnull JTree tree, final @Nonnull String[] paths) {
    checkNotNullOrEmpty(paths);
    clearSelection(tree);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void selectPaths(final @Nonnull JTree tree, final @Nonnull String[] paths) {
    checkNotNullOrEmpty(paths);
    clearSelection(tree);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void checkEditorNotNull(final @Nonnull JSpinner spinner, final @Nullable JTextComponent editor) {
    execute(() -> {
      if (editor == null) {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void checkEditorNotNull(final @Nonnull JSpinner spinner, final @Nullable JTextComponent editor) {
    execute(() -> {
      if (editor == null) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void commit(final @Nonnull JSpinner spinner) {
    execute(() -> spinner.commitEdit());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateAndDecrementValue(final @Nonnull JSpinner spinner) {
    execute(() -> {
      checkEnabledAndShowing(spinner);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateAndIncrementValue(final @Nonnull JSpinner spinner, final int times) {
    execute(() -> {
      checkEnabledAndShowing(spinner);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateAndIncrementValue(final @Nonnull JSpinner spinner) {
    execute(() -> {
      checkEnabledAndShowing(spinner);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateAndDecrementValue(final @Nonnull JSpinner spinner, final int times) {
    execute(() -> {
      checkEnabledAndShowing(spinner);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/MenuElementComponentQuery.java`
#### Snippet
```java
final class MenuElementComponentQuery {
  @RunsInEDT
  static @Nonnull Component componentIn(final @Nonnull MenuElement menuElement) {
    Component result = execute(() -> menuElement.getComponent());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/MenuElementComponentQuery.java`
#### Snippet
```java
final class MenuElementComponentQuery {
  @RunsInEDT
  static @Nonnull Component componentIn(final @Nonnull MenuElement menuElement) {
    Component result = execute(() -> menuElement.getComponent());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nonnull private static Pair<Boolean, Point> scrollToPathToSelect(final @Nonnull JTree tree,
                                                                    final @Nonnull TreePath path,
                                                                    final @Nonnull JTreeLocation location,
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Boolean, Point> scrollToPathToSelect(final @Nonnull JTree tree,
                                                                    final @Nonnull TreePath path,
                                                                    final @Nonnull JTreeLocation location,
                                                                    boolean singleSelectionRequired) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @Nonnull private static Pair<Boolean, Point> scrollToPathToSelect(final @Nonnull JTree tree,
                                                                    final @Nonnull TreePath path,
                                                                    final @Nonnull JTreeLocation location,
                                                                    boolean singleSelectionRequired) {
    Pair<Boolean, Point> result = execute(new GuiQuery<Pair<Boolean, Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nonnull private static Triple<Boolean, Point, Integer> scrollToRowAndGetToggleInfo(final @Nonnull JTree tree,
                                                                                      final int row,
                                                                                      final @Nonnull JTreeLocation location) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @Nonnull private static Triple<Boolean, Point, Integer> scrollToRowAndGetToggleInfo(final @Nonnull JTree tree,
                                                                                      final int row,
                                                                                      final @Nonnull JTreeLocation location) {
    Triple<Boolean, Point, Integer> result = execute(new GuiQuery<Triple<Boolean, Point, Integer>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Triple<Boolean, Point, Integer> scrollToMatchingPathAndGetToggleInfo(
                                                                                               final @Nonnull JTree tree,
                                                                                               final @Nonnull String path,
                                                                                               final @Nonnull JTreePathFinder pathFinder,
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @Nonnull private static Triple<Boolean, Point, Integer> scrollToMatchingPathAndGetToggleInfo(
                                                                                               final @Nonnull JTree tree,
                                                                                               final @Nonnull String path,
                                                                                               final @Nonnull JTreePathFinder pathFinder,
                                                                                               final @Nonnull JTreeLocation location) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
                                                                                               final @Nonnull JTree tree,
                                                                                               final @Nonnull String path,
                                                                                               final @Nonnull JTreePathFinder pathFinder,
                                                                                               final @Nonnull JTreeLocation location) {
    Triple<Boolean, Point, Integer> result = execute(new GuiQuery<Triple<Boolean, Point, Integer>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
                                                                                               final @Nonnull String path,
                                                                                               final @Nonnull JTreePathFinder pathFinder,
                                                                                               final @Nonnull JTreeLocation location) {
    Triple<Boolean, Point, Integer> result = execute(new GuiQuery<Triple<Boolean, Point, Integer>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void unselectPaths(final @Nonnull JTree tree, final @Nonnull String[] paths) {
    checkNotNullOrEmpty(paths);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void unselectPaths(final @Nonnull JTree tree, final @Nonnull String[] paths) {
    checkNotNullOrEmpty(paths);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nonnull private static Pair<Boolean, Point> scrollToRow(final @Nonnull JTree tree, final int row,
                                                           final @Nonnull JTreeLocation location,
                                                           boolean singleSelectRequired) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Boolean, Point> scrollToRow(final @Nonnull JTree tree, final int row,
                                                           final @Nonnull JTreeLocation location,
                                                           boolean singleSelectRequired) {
    Pair<Boolean, Point> result = execute(new GuiQuery<Pair<Boolean, Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void selectRows(final @Nonnull JTree tree, final @Nonnull int[] rows) {
    ArrayPreconditions.checkNotNullOrEmpty(rows);
    clearSelection(tree);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void selectRows(final @Nonnull JTree tree, final @Nonnull int[] rows) {
    ArrayPreconditions.checkNotNullOrEmpty(rows);
    clearSelection(tree);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void unselectRows(final @Nonnull JTree tree, final @Nonnull int[] rows) {
    ArrayPreconditions.checkNotNullOrEmpty(rows);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void unselectRows(final @Nonnull JTree tree, final @Nonnull int[] rows) {
    ArrayPreconditions.checkNotNullOrEmpty(rows);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java

  @RunsInEDT
  private void clearSelection(final @Nonnull JTree tree) {
    clearSelectionOf(tree);
    robot.waitForIdle();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  private String actualMessageTypeAsText(final @Nonnull JOptionPane optionPane) {
    return messageTypeAsText(messageTypeOf(optionPane));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableSingleRowCellSelectedQuery.java`
#### Snippet
```java
final class JTableRowCellSelectedQuery {
  @RunsInCurrentThread
  static boolean isCellSelected(final @Nonnull JTable table, final int row, final int column) {
    return table.isCellSelected(row, column);
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarWaitUntilValueIsEqualToExpectedTask.java`
#### Snippet
```java
final class JProgressBarWaitUntilValueIsEqualToExpectedTask {
  @RunsInEDT
  static void waitUntilValueIsEqualToExpected(final @Nonnull JProgressBar progressBar, final int expected,
      final @Nonnull Timeout timeout) {
    pause(new Condition(untilValueIsEqualTo(progressBar, expected)) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarWaitUntilValueIsEqualToExpectedTask.java`
#### Snippet
```java
  @RunsInEDT
  static void waitUntilValueIsEqualToExpected(final @Nonnull JProgressBar progressBar, final int expected,
      final @Nonnull Timeout timeout) {
    pause(new Condition(untilValueIsEqualTo(progressBar, expected)) {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarWaitUntilValueIsEqualToExpectedTask.java`
#### Snippet
```java
  }

  private static Description untilValueIsEqualTo(final @Nonnull JProgressBar progressBar, final int expected) {
    return new GuiLazyLoadingDescription() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComponentDriver.java`
#### Snippet
```java
  }

  @Nullable private static Object clientPropertyIn(final @Nonnull JComponent c, final @Nonnull Object key) {
    return execute(() -> c.getClientProperty(key));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComponentDriver.java`
#### Snippet
```java
  }

  @Nullable private static Object clientPropertyIn(final @Nonnull JComponent c, final @Nonnull Object key) {
    return execute(() -> c.getClientProperty(key));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectedIndexQuery.java`
#### Snippet
```java
final class JComboBoxSelectedIndexQuery {
  @RunsInEDT
  static int selectedIndexOf(final @Nonnull JComboBox<?> comboBox) {
    Integer result = execute(() -> comboBox.getSelectedIndex());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListItemCountQuery.java`
#### Snippet
```java
@RunsInEDT
final class JListItemCountQuery {
  static int itemCountIn(final @Nonnull JList<?> list) {
    Integer result = execute(() -> list.getModel().getSize());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void selectRows(final @Nonnull JTable table, final @Nonnull int... rows) {
    checkNotNullOrEmpty(rows);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void selectRows(final @Nonnull JTable table, final @Nonnull int... rows) {
    checkNotNullOrEmpty(rows);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private Pair<Boolean, Point> cellSelectionInfo(final @Nonnull JTable table, final int row,
                                                          final int column,
                                                          final @Nonnull JTableLocation location) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @Nonnull private Pair<Boolean, Point> cellSelectionInfo(final @Nonnull JTable table, final int row,
                                                          final int column,
                                                          final @Nonnull JTableLocation location) {
    Pair<Boolean, Point> result = execute(new GuiQuery<Pair<Boolean, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static int findColumnIndex(final @Nonnull JTable table, final @Nonnull Object columnId) {
    Integer result = execute(() -> {
      int index = columnIndexByIdentifier(table, columnId);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static int findColumnIndex(final @Nonnull JTable table, final @Nonnull Object columnId) {
    Integer result = execute(() -> {
      int index = columnIndexByIdentifier(table, columnId);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   * @throws IndexOutOfBoundsException if any of the indices of any of the {@code cells} are out of bounds.
   */
  public void unselectCells(final @Nonnull JTable table, final @Nonnull TableCell[] cells) {
    checkNotNullOrEmpty(cells);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   * @throws IndexOutOfBoundsException if any of the indices of any of the {@code cells} are out of bounds.
   */
  public void unselectCells(final @Nonnull JTable table, final @Nonnull TableCell[] cells) {
    checkNotNullOrEmpty(cells);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static int[] selectedRowsOf(final @Nonnull JTable table) {
    int[] result = execute(() -> table.getSelectedRows());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private Point scrollToPointAtCell(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                             final @Nonnull JTableLocation location) {
    checkNotNull(cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private Point scrollToPointAtCell(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                             final @Nonnull JTableLocation location) {
    checkNotNull(cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private Point scrollToPointAtCell(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                             final @Nonnull JTableLocation location) {
    checkNotNull(cell);
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String cellValue(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                            final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String cellValue(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                            final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static String cellValue(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                            final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
      JTableCellPreconditions.checkCellIndicesInBounds(table, cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point pointAtCell(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                            final @Nonnull JTableLocation location) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point pointAtCell(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                            final @Nonnull JTableLocation location) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Point pointAtCell(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                            final @Nonnull JTableLocation location) {
    Point result = execute(() -> {
      JTableCellPreconditions.checkCellIndicesInBounds(table, cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Color cellForeground(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                                final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeAddRootIfInvisibleTask.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  static @Nonnull TreePath addRootIfInvisible(@Nonnull JTree tree, @Nonnull TreePath path) {
    Object root = tree.getModel().getRoot();
    if (tree.isRootVisible() || root == null) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Color cellForeground(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                                final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static Color cellForeground(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                                final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
      JTableCellPreconditions.checkCellIndicesInBounds(table, cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void requireEditableEqualTo(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                             boolean editable) {
    checkNotNull(cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void requireEditableEqualTo(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                             boolean editable) {
    checkNotNull(cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void unselectRows(final @Nonnull JTable table, final @Nonnull int... rows) {
    checkNotNullOrEmpty(rows);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void unselectRows(final @Nonnull JTable table, final @Nonnull int... rows) {
    checkNotNullOrEmpty(rows);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void checkCellIndicesInBounds(final @Nonnull JTable table, final @Nonnull TableCell cell) {
    execute(() -> JTableCellPreconditions.checkCellIndicesInBounds(table, cell));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void checkCellIndicesInBounds(final @Nonnull JTable table, final @Nonnull TableCell cell) {
    execute(() -> JTableCellPreconditions.checkCellIndicesInBounds(table, cell));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   * @throws IndexOutOfBoundsException if any of the indices of any of the {@code cells} are out of bounds.
   */
  public void selectCells(final @Nonnull JTable table, final @Nonnull TableCell[] cells) {
    checkNotNullOrEmpty(cells);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   * @throws IndexOutOfBoundsException if any of the indices of any of the {@code cells} are out of bounds.
   */
  public void selectCells(final @Nonnull JTable table, final @Nonnull TableCell[] cells) {
    checkNotNullOrEmpty(cells);
    new MultipleSelectionTemplate(robot) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String cellValue(final @Nonnull JTable table, final int row, final int column,
                                            final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static String cellValue(final @Nonnull JTable table, final int row, final int column,
                                            final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
      JTableCellPreconditions.checkCellIndicesInBounds(table, row, column);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInCurrentThread
  private void scrollToCell(final @Nonnull JTable table, final int row, final int column,
                            final @Nonnull JTableLocation location) {
    checkClickAllowed(table);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInCurrentThread
  private void scrollToCell(final @Nonnull JTable table, final int row, final int column,
                            final @Nonnull JTableLocation location) {
    checkClickAllowed(table);
    JTableCellPreconditions.checkCellIndicesInBounds(table, row, column);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Font cellFont(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                         final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Font cellFont(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                         final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static Font cellFont(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                         final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
      JTableCellPreconditions.checkCellIndicesInBounds(table, cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String selectionValue(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
      if (table.getSelectedRowCount() == 0) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String selectionValue(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
      if (table.getSelectedRowCount() == 0) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Color cellBackground(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                                final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Color cellBackground(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                                final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static Color cellBackground(final @Nonnull JTable table, final @Nonnull TableCell cell,
                                                final @Nonnull JTableCellReader cellReader) {
    return execute(() -> {
      JTableCellPreconditions.checkCellIndicesInBounds(table, cell);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void assertNoSelection(final @Nonnull JTable table) {
    execute(() -> {
      if (!hasSelection(table)) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentPerformDefaultAccessibleActionTask.java`
#### Snippet
```java

  @RunsInCurrentThread
  static void performDefaultAccessibleAction(final @Nonnull Component c) {
    AccessibleAction action = c.getAccessibleContext().getAccessibleAction();
    if (action == null || action.getAccessibleActionCount() == 0) {
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageQuery.java`
#### Snippet
```java
final class JOptionPaneMessageQuery {
  @RunsInEDT
  static @Nullable Object messageOf(final @Nonnull JOptionPane optionPane) {
    return execute(() -> optionPane.getMessage());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageQuery.java`
#### Snippet
```java
final class JOptionPaneMessageQuery {
  @RunsInEDT
  static @Nullable Object messageOf(final @Nonnull JOptionPane optionPane) {
    return execute(() -> optionPane.getMessage());
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCellValueQuery.java`
#### Snippet
```java
final class JTableCellValueQuery {
  @RunsInEDT
  static @Nullable Object cellValueOf(final @Nonnull JTable table, final int row, final int column) {
    return execute(() -> table.getValueAt(row, column));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCellValueQuery.java`
#### Snippet
```java
final class JTableCellValueQuery {
  @RunsInEDT
  static @Nullable Object cellValueOf(final @Nonnull JTable table, final int row, final int column) {
    return execute(() -> table.getValueAt(row, column));
  }
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneOptionsQuery.java`
#### Snippet
```java
final class JOptionPaneOptionsQuery {
  @RunsInEDT
  static @Nonnull Object[] optionsOf(final @Nonnull JOptionPane optionPane) {
    Object[] result = execute(() -> optionPane.getOptions());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneOptionsQuery.java`
#### Snippet
```java
final class JOptionPaneOptionsQuery {
  @RunsInEDT
  static @Nonnull Object[] optionsOf(final @Nonnull JOptionPane optionPane) {
    Object[] result = execute(() -> optionPane.getOptions());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneSelectTabTask.java`
#### Snippet
```java
final class JTabbedPaneSelectTabTask {
  @RunsInEDT
  static void setSelectedTab(final @Nonnull JTabbedPane tabbedPane, final int index) {
    execute(() -> tabbedPane.setSelectedIndex(index));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentSetTextTask.java`
#### Snippet
```java
final class JTextComponentSetTextTask {
  @RunsInEDT
  static void setTextIn(final @Nonnull JTextComponent textBox, final String text) {
    execute(() -> textBox.setText(text));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Integer, GenericRange<Point>> findScrollToMaximumInfo(
      final @Nonnull JScrollBar scrollBar, final @Nonnull JScrollBarLocation location) {
    Pair<Integer, GenericRange<Point>> result = execute(new GuiQuery<Pair<Integer, GenericRange<Point>>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Integer, GenericRange<Point>> findScrollToMaximumInfo(
      final @Nonnull JScrollBar scrollBar, final @Nonnull JScrollBarLocation location) {
    Pair<Integer, GenericRange<Point>> result = execute(new GuiQuery<Pair<Integer, GenericRange<Point>>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static GenericRange<Point> validateAndFindScrollInfo(final @Nonnull JScrollBar scrollBar,
      final @Nonnull JScrollBarLocation location, final int position) {
    GenericRange<Point> result = execute(new GuiQuery<GenericRange<Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static GenericRange<Point> validateAndFindScrollInfo(final @Nonnull JScrollBar scrollBar,
      final @Nonnull JScrollBarLocation location, final int position) {
    GenericRange<Point> result = execute(new GuiQuery<GenericRange<Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Point, Integer> validateAndFindScrollBlockInfo(final @Nonnull JScrollBar scrollBar,
      final @Nonnull JScrollBarLocation location, final int times) {
    Pair<Point, Integer> result = execute(new GuiQuery<Pair<Point, Integer>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Point, Integer> validateAndFindScrollBlockInfo(final @Nonnull JScrollBar scrollBar,
      final @Nonnull JScrollBarLocation location, final int times) {
    Pair<Point, Integer> result = execute(new GuiQuery<Pair<Point, Integer>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Integer, GenericRange<Point>> findScrollToMinimumInfo(
      final @Nonnull JScrollBar scrollBar, final JScrollBarLocation location) {
    Pair<Integer, GenericRange<Point>> result = execute(new GuiQuery<Pair<Integer, GenericRange<Point>>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Point, Integer> findScrollUnitInfo(final @Nonnull JScrollBar scrollBar,
      final @Nonnull JScrollBarLocation location, final int times) {
    Pair<Point, Integer> result = execute(new GuiQuery<Pair<Point, Integer>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Point, Integer> findScrollUnitInfo(final @Nonnull JScrollBar scrollBar,
      final @Nonnull JScrollBarLocation location, final int times) {
    Pair<Point, Integer> result = execute(new GuiQuery<Pair<Point, Integer>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentEditableQuery.java`
#### Snippet
```java
final class JTextComponentEditableQuery {
  @RunsInEDT
  static boolean isEditable(final @Nonnull JTextComponent textBox) {
    Boolean result = execute(() -> textBox.isEditable());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeToggleExpandStateTask.java`
#### Snippet
```java
final class JTreeToggleExpandStateTask {
  @RunsInCurrentThread
  static void toggleExpandState(final @Nonnull JTree tree, final @Nonnull Point pathLocation) {
    TreePath path = tree.getPathForLocation(pathLocation.x, pathLocation.y);
    TreeUI treeUI = tree.getUI();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeToggleExpandStateTask.java`
#### Snippet
```java
final class JTreeToggleExpandStateTask {
  @RunsInCurrentThread
  static void toggleExpandState(final @Nonnull JTree tree, final @Nonnull Point pathLocation) {
    TreePath path = tree.getPathForLocation(pathLocation.x, pathLocation.y);
    TreeUI treeUI = tree.getUI();
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/PointAndParentForScrollingJTextFieldQuery.java`
#### Snippet
```java
final class PointAndParentForScrollingJTextFieldQuery {
  @RunsInCurrentThread
  static @Nonnull Pair<Point, Container> pointAndParentForScrolling(final @Nonnull JTextField textField) {
    Point origin = new Point(textField.getX(), textField.getY());
    Container parent = textField.getParent();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/PointAndParentForScrollingJTextFieldQuery.java`
#### Snippet
```java
final class PointAndParentForScrollingJTextFieldQuery {
  @RunsInCurrentThread
  static @Nonnull Pair<Point, Container> pointAndParentForScrolling(final @Nonnull JTextField textField) {
    Point origin = new Point(textField.getX(), textField.getY());
    Container parent = textField.getParent();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static JScrollBar horizontalScrollBar(final @Nonnull JScrollPane scrollPane) {
    JScrollBar result = execute(() -> scrollPane.getHorizontalScrollBar());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static JScrollBar verticalScrollBar(final @Nonnull JScrollPane scrollPane) {
    JScrollBar result = execute(() -> scrollPane.getVerticalScrollBar());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableContentsQuery.java`
#### Snippet
```java
final class JTableContentsQuery {
  @RunsInEDT
  static @Nonnull String[][] tableContents(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader) {
    String[][] result = execute(new GuiQuery<String[][]>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableContentsQuery.java`
#### Snippet
```java
final class JTableContentsQuery {
  @RunsInEDT
  static @Nonnull String[][] tableContents(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader) {
    String[][] result = execute(new GuiQuery<String[][]>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableContentsQuery.java`
#### Snippet
```java
final class JTableContentsQuery {
  @RunsInEDT
  static @Nonnull String[][] tableContents(final @Nonnull JTable table, final @Nonnull JTableCellReader cellReader) {
    String[][] result = execute(new GuiQuery<String[][]>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static boolean checkSelected(final @Nonnull AbstractButton button) {
    Boolean result = execute(() -> {
      checkEnabledAndShowing(button);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarIndeterminateQuery.java`
#### Snippet
```java
final class JProgressBarIndeterminateQuery {
  @RunsInEDT
  static boolean isIndeterminate(final @Nonnull JProgressBar progressBar) {
    Boolean result = execute(() -> progressBar.isIndeterminate());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListItemValueQuery.java`
#### Snippet
```java
final class JListItemValueQuery {
  @RunsInEDT
  static @Nullable String itemValue(final @Nonnull JList<?> list, final int index,
                                    final @Nonnull JListCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListItemValueQuery.java`
#### Snippet
```java
final class JListItemValueQuery {
  @RunsInEDT
  static @Nullable String itemValue(final @Nonnull JList<?> list, final int index,
                                    final @Nonnull JListCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListItemValueQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable String itemValue(final @Nonnull JList<?> list, final int index,
                                    final @Nonnull JListCellReader cellReader) {
    return execute(() -> {
      checkIndexInBounds(list, index);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/FrameDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static Point iconifyInfo(final @Nonnull Frame frame) {
    return execute(() -> {
      checkEnabledAndShowing(frame);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/FrameDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point maximizeInfo(final @Nonnull Frame frame) {
    Point result = execute(() -> {
      checkEnabledAndShowing(frame);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentSetSizeTask.java`
#### Snippet
```java
final class ComponentSetSizeTask {
  @RunsInEDT
  static void setComponentSize(final @Nonnull Component c, final int width, final int height) {
    execute(() -> c.setSize(width, height));
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentTextQuery.java`
#### Snippet
```java
final class JTextComponentTextQuery {
  @RunsInEDT
  static @Nullable String textOf(final @Nonnull JTextComponent textComponent) {
    return execute(() -> textComponent.getText());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentTextQuery.java`
#### Snippet
```java
final class JTextComponentTextQuery {
  @RunsInEDT
  static @Nullable String textOf(final @Nonnull JTextComponent textComponent) {
    return execute(() -> textComponent.getText());
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderQuery.java`
#### Snippet
```java
final class JTableHeaderQuery {
  @RunsInEDT
  static @Nullable JTableHeader tableHeader(final @Nonnull JTable table) {
    return execute(() -> table.getTableHeader());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderQuery.java`
#### Snippet
```java
final class JTableHeaderQuery {
  @RunsInEDT
  static @Nullable JTableHeader tableHeader(final @Nonnull JTable table) {
    return execute(() -> table.getTableHeader());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarValueQuery.java`
#### Snippet
```java
final class JScrollBarValueQuery {
  @RunsInEDT
  static int valueOf(final @Nonnull JScrollBar scrollBar) {
    Integer result = execute(() -> scrollBar.getValue());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Window windowAncestorOf(final @Nonnull JToolBar toolBar) {
    return execute(() -> {
      checkEnabledAndShowing(toolBar);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public boolean isFloating(final @Nonnull JToolBar toolBar) {
    Boolean result = execute(() -> isJToolBarFloating(toolBar));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateIsNotFloating(final @Nonnull JToolBar toolBar, final @Nonnull String constraint) {
    execute(() -> {
      if (isJToolBarFloating(toolBar)) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateIsNotFloating(final @Nonnull JToolBar toolBar, final @Nonnull String constraint) {
    execute(() -> {
      if (isJToolBarFloating(toolBar)) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Point, Pair<Window, Point>> floatInfo(final @Nonnull JToolBar toolBar,
                                                                     final @Nonnull JToolBarLocation location) {
    Pair<Point, Pair<Window, Point>> result = execute(new GuiQuery<Pair<Point, Pair<Window, Point>>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Point, Pair<Window, Point>> floatInfo(final @Nonnull JToolBar toolBar,
                                                                     final @Nonnull JToolBarLocation location) {
    Pair<Point, Pair<Window, Point>> result = execute(new GuiQuery<Pair<Point, Pair<Window, Point>>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<GenericRange<Point>, Container> unfloatInfo(final @Nonnull JToolBar toolBar,
                                                                           final @Nonnull String constraint,
                                                                           final @Nonnull JToolBarLocation location) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<GenericRange<Point>, Container> unfloatInfo(final @Nonnull JToolBar toolBar,
                                                                           final @Nonnull String constraint,
                                                                           final @Nonnull JToolBarLocation location) {
    Pair<GenericRange<Point>, Container> result = execute(new GuiQuery<Pair<GenericRange<Point>, Container>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
  @Nonnull private static Pair<GenericRange<Point>, Container> unfloatInfo(final @Nonnull JToolBar toolBar,
                                                                           final @Nonnull String constraint,
                                                                           final @Nonnull JToolBarLocation location) {
    Pair<GenericRange<Point>, Container> result = execute(new GuiQuery<Pair<GenericRange<Point>, Container>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void checkFloated(final @Nonnull JToolBar toolBar) {
    execute(() -> {
      if (!isJToolBarFloating(toolBar)) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInCurrentThread
  @Nonnull private static Pair<Window, Point> ancestorAndLocation(final @Nonnull JToolBar toolBar) {
    Window window = getWindowAncestor(toolBar);
    return Pair.of(window, window.getLocation());
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java

  @RunsInCurrentThread
  @Nonnull private static Container dockFor(final @Nonnull JToolBar toolBar) {
    try {
      return checkNotNull(field("dockingSource").ofType(Container.class).in(toolBar.getUI()).get());
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowMoveToFrontTask.java`
#### Snippet
```java
final class WindowMoveToFrontTask {
  @RunsInEDT
  static void toFront(final @Nonnull Window w) {
    execute(() -> w.toFront());
  }
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionIndicesQuery.java`
#### Snippet
```java
final class JListSelectionIndicesQuery {
  @RunsInEDT
  static @Nonnull int[] selectedIndices(final @Nonnull JList<?> list) {
    int[] result = execute(() -> list.getSelectedIndices());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionIndicesQuery.java`
#### Snippet
```java
final class JListSelectionIndicesQuery {
  @RunsInEDT
  static @Nonnull int[] selectedIndices(final @Nonnull JList<?> list) {
    int[] result = execute(() -> list.getSelectedIndices());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/BasicJTableCellReader.java`
#### Snippet
```java

  @RunsInCurrentThread
  @Nullable private Component cellRendererIn(final @Nonnull JTable table, final int row, final int column) {
    return table.prepareRenderer(table.getCellRenderer(row, column), row, column);
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneSetDividerLocationTask.java`
#### Snippet
```java
final class JSplitPaneSetDividerLocationTask {
  @RunsInEDT
  static void setDividerLocation(final @Nonnull JSplitPane splitPane, final int location) {
    execute(() -> splitPane.setDividerLocation(location));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentMoveTask.java`
#### Snippet
```java
final class ComponentMoveTask {
  @RunsInEDT
  static void moveComponent(final @Nonnull Component c, final @Nonnull Point location) {
    execute(() -> c.setLocation(location));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentMoveTask.java`
#### Snippet
```java
final class ComponentMoveTask {
  @RunsInEDT
  static void moveComponent(final @Nonnull Component c, final @Nonnull Point location) {
    execute(() -> c.setLocation(location));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneTabIndexQuery.java`
#### Snippet
```java
final class JTabbedPaneTabIndexQuery {
  @RunsInEDT
  static int indexOfTab(final @Nonnull JTabbedPane tabbedPane, final @Nonnull TextMatcher matcher) {
    Integer result = execute(() -> {
      int tabCount = tabbedPane.getTabCount();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneTabIndexQuery.java`
#### Snippet
```java
final class JTabbedPaneTabIndexQuery {
  @RunsInEDT
  static int indexOfTab(final @Nonnull JTabbedPane tabbedPane, final @Nonnull TextMatcher matcher) {
    Integer result = execute(() -> {
      int tabCount = tabbedPane.getTabCount();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxEditableQuery.java`
#### Snippet
```java
final class JComboBoxEditableQuery {
  @RunsInEDT
  static boolean isEditable(final @Nonnull JComboBox<?> comboBox) {
    Boolean result = execute(() -> comboBox.isEditable());
    return Preconditions.checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java

  @RunsInEDT
  private static void appendComponents(final @Nonnull StringBuilder message, final @Nonnull Collection<Component> found) {
    execute(() -> {
      for (Component c : found) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java

  @RunsInEDT
  private static void appendComponents(final @Nonnull StringBuilder message, final @Nonnull Collection<Component> found) {
    execute(() -> {
      for (Component c : found) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxItemCountQuery.java`
#### Snippet
```java
@RunsInEDT
final class JComboBoxItemCountQuery {
  static int itemCountIn(final @Nonnull JComboBox<?> comboBox) {
    Integer result = execute(() -> comboBox.getItemCount());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Component cellEditorComponent(final @Nonnull JTable table, final int row, final int column) {
    return execute(() -> {
      checkCellIndicesInBounds(table, row, column);
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
   */
  @RunsInEDT
  protected final @Nullable <T extends Component> T waitForEditorActivation(@Nonnull JTable table, int row, int column,
                                                                            @Nonnull Class<T> supportedType) {
    return waitForEditorActivation(new TypeMatcher(supportedType, true), table, row, column, supportedType);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  protected static void validate(final @Nonnull JTable table, final int row, final int column) {
    checkCellIndicesInBounds(table, row, column);
    checkEnabledAndShowing(table);
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
   */
  @RunsInEDT
  protected final @Nullable <T extends Component> T waitForEditorActivation(@Nonnull ComponentMatcher matcher,
                                                                            @Nonnull JTable table, int row, int column,
                                                                            @Nonnull Class<T> supportedType) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nonnull protected static Point cellLocation(final @Nonnull JTable table, final int row, final int column,
                                               final @Nonnull JTableLocation location) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull protected static Point cellLocation(final @Nonnull JTable table, final int row, final int column,
                                               final @Nonnull JTableLocation location) {
    Point result = execute(() -> {
      validate(table, row, column);
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
  }

  protected final @Nonnull JTableLocation location() {
    return location;
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nullable protected static TableCellEditor cellEditor(final @Nonnull JTable table, final int row, final int column) {
    return execute(() -> table.getCellEditor(row, column));
  }
```

### MissortedModifiers
Missorted modifiers `protected final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
   * @return the cell editor being currently used, or {@code null} if no table cell is being currently edited.
   */
  protected final @Nullable TableCellEditor cellEditor() {
    return cellEditor;
  }
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionValuesQuery.java`
#### Snippet
```java
final class JListSelectionValuesQuery {
  @RunsInEDT
  static @Nonnull List<String> selectionValues(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    List<String> result = execute(new GuiQuery<List<String>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionValuesQuery.java`
#### Snippet
```java
final class JListSelectionValuesQuery {
  @RunsInEDT
  static @Nonnull List<String> selectionValues(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    List<String> result = execute(new GuiQuery<List<String>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionValuesQuery.java`
#### Snippet
```java
final class JListSelectionValuesQuery {
  @RunsInEDT
  static @Nonnull List<String> selectionValues(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    List<String> result = execute(new GuiQuery<List<String>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JFileChooserCancelButtonTextQuery.java`
#### Snippet
```java
  private static final String CANCEL_BUTTON_TEXT_KEY = "FileChooser.cancelButtonText";

  static @Nullable String cancelButtonText() {
    return UIManager.getString(CANCEL_BUTTON_TEXT_KEY);
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ModelValueToString.java`
#### Snippet
```java
   *         {@code toString}.
   */
  static @Nullable String asText(@Nullable Object o) {
    if (o == null) {
      return null;
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static GenericRange<Point> findWhereToMoveDividerVertically(final @Nonnull JSplitPane splitPane,
                                                                               final int location) {
    GenericRange<Point> result = execute(new GuiQuery<GenericRange<Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static GenericRange<Point> findWhereToMoveDividerHorizontally(final @Nonnull JSplitPane splitPane,
                                                                                 final int location) {
    GenericRange<Point> result = execute(new GuiQuery<GenericRange<Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameCloseTask.java`
#### Snippet
```java
final class JInternalFrameCloseTask {
  @RunsInEDT
  static void close(final @Nonnull JInternalFrame internalFrame) {
    execute(() -> internalFrame.doDefaultCloseAction());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableRowCountQuery.java`
#### Snippet
```java
final class JTableRowCountQuery {
  @RunsInEDT
  static int rowCountOf(final @Nonnull JTable table) {
    Integer result = execute(() -> table.getRowCount());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneTitleQuery.java`
#### Snippet
```java
final class JOptionPaneTitleQuery {
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull JOptionPane optionPane) {
    return execute(() -> ((Dialog) optionPane.getRootPane().getParent()).getTitle());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneTitleQuery.java`
#### Snippet
```java
final class JOptionPaneTitleQuery {
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull JOptionPane optionPane) {
    return execute(() -> ((Dialog) optionPane.getRootPane().getParent()).getTitle());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSetSelectedIndexTask.java`
#### Snippet
```java
final class JComboBoxSetSelectedIndexTask {
  @RunsInEDT
  static void setSelectedIndex(final @Nonnull JComboBox<?> comboBox, final int index) {
    execute(() -> comboBox.setSelectedIndex(index));
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameTitleQuery.java`
#### Snippet
```java
final class JInternalFrameTitleQuery {
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull JInternalFrame f) {
    return execute(() -> f.getTitle());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameTitleQuery.java`
#### Snippet
```java
final class JInternalFrameTitleQuery {
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull JInternalFrame f) {
    return execute(() -> f.getTitle());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void requireEditable(final @Nonnull JComboBox<?> comboBox) {
    checkEditable(comboBox, true);
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Component accessibleEditorOf(final @Nonnull JComboBox<?> comboBox) {
    return execute(() -> {
      checkAccessibleEditor(comboBox);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void enterText(final @Nonnull JComboBox<?> comboBox, @Nonnull String text) {
    execute(() -> checkAccessibleEditor(comboBox));
    Component editor = editorComponentOf(comboBox);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void selectItem(final @Nonnull JComboBox<?> comboBox, int index) {
    validateCanSelectItem(comboBox, index);
    showDropDownList(comboBox);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void validateCanSelectItem(final @Nonnull JComboBox<?> comboBox, final int index) {
    execute(() -> {
      checkEnabledAndShowing(comboBox);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Component editorComponentOf(final @Nonnull JComboBox<?> comboBox) {
    return execute(() -> editorComponent(comboBox));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String valueAsText(final @Nonnull JComboBox<?> comboBox, final int index,
                                              final @Nonnull JComboBoxCellReader cellReader) {
    return execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static String valueAsText(final @Nonnull JComboBox<?> comboBox, final int index,
                                              final @Nonnull JComboBoxCellReader cellReader) {
    return execute(() -> {
      checkItemIndexInBounds(comboBox, index);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowLikeContainers.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  static @Nonnull Point iconifyButtonLocation(@Nonnull Container c) {
    Insets insets = c.getInsets();
    // From Abbot: We know the exact layout of the window manager frames for w32 and OSX. Currently no way of detecting
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowLikeContainers.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  static @Nonnull Point closeButtonLocation(@Nonnull Container c) {
    Insets insets = c.getInsets();
    if (isOSX()) {
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowLikeContainers.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  static @Nonnull Point maximizeButtonLocation(@Nonnull Container c) {
    Point p = iconifyButtonLocation(c);
    p.x += MAXIMIZE_BUTTON_OFFSET;
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCheckBoxEditorCellWriter.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Boolean, Point> doStartCellEditing(final @Nonnull JTable table, final int row,
                                                                  final int column,
                                                                  final @Nonnull JTableLocation location) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCheckBoxEditorCellWriter.java`
#### Snippet
```java
  @Nonnull private static Pair<Boolean, Point> doStartCellEditing(final @Nonnull JTable table, final int row,
                                                                  final int column,
                                                                  final @Nonnull JTableLocation location) {
    Pair<Boolean, Point> result = execute(new GuiQuery<Pair<Boolean, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the point that the JList was scrolled to. */
  @RunsInCurrentThread
  @Nullable private static Point scrollToItemWithIndexIfNotSelectedYet(final @Nonnull JList<?> list, final int index) {
    if (list.getSelectedIndex() == index) {
      return null;
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nonnull Point scrollToItem(final @Nonnull JList<?> list, final int index) {
    Point result = execute(() -> {
      checkEnabledAndShowing(list);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nonnull Point scrollToItem(final @Nonnull JList<?> list, final int index) {
    Point result = execute(() -> {
      checkEnabledAndShowing(list);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the index of first matching element and the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nonnull Pair<Integer, Point> scrollToItem(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the index of first matching element and the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nonnull Pair<Integer, Point> scrollToItem(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the index of first matching element and the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nonnull Pair<Integer, Point> scrollToItem(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull Pair<Integer, Point> scrollToItem(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the index of first matching element and the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nonnull Pair<Integer, Point> scrollToItemIfNotSelectedYet(final @Nonnull JList<?> list,
                                                                    final @Nonnull TextMatcher matcher,
                                                                    final @Nonnull JListCellReader cellReader) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the index of first matching element and the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nonnull Pair<Integer, Point> scrollToItemIfNotSelectedYet(final @Nonnull JList<?> list,
                                                                    final @Nonnull TextMatcher matcher,
                                                                    final @Nonnull JListCellReader cellReader) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull Pair<Integer, Point> scrollToItemIfNotSelectedYet(final @Nonnull JList<?> list,
                                                                    final @Nonnull TextMatcher matcher,
                                                                    final @Nonnull JListCellReader cellReader) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  static @Nonnull Pair<Integer, Point> scrollToItemIfNotSelectedYet(final @Nonnull JList<?> list,
                                                                    final @Nonnull TextMatcher matcher,
                                                                    final @Nonnull JListCellReader cellReader) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nullable Point scrollToItemIfNotSelectedYet(final @Nonnull JList<?> list, final int index) {
    return execute(() -> {
      checkEnabledAndShowing(list);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  /** @return the point that the JList was scrolled to. */
  @RunsInEDT
  static @Nullable Point scrollToItemIfNotSelectedYet(final @Nonnull JList<?> list, final int index) {
    return execute(() -> {
      checkEnabledAndShowing(list);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxMatchingItemQuery.java`
#### Snippet
```java
final class JComboBoxMatchingItemQuery {
  @RunsInEDT
  static int matchingItemIndex(final @Nonnull JComboBox<?> comboBox, final @Nonnull TextMatcher matcher,
                               final @Nonnull JComboBoxCellReader cellReader) {
    Integer result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxMatchingItemQuery.java`
#### Snippet
```java
final class JComboBoxMatchingItemQuery {
  @RunsInEDT
  static int matchingItemIndex(final @Nonnull JComboBox<?> comboBox, final @Nonnull TextMatcher matcher,
                               final @Nonnull JComboBoxCellReader cellReader) {
    Integer result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxMatchingItemQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int matchingItemIndex(final @Nonnull JComboBox<?> comboBox, final @Nonnull TextMatcher matcher,
                               final @Nonnull JComboBoxCellReader cellReader) {
    Integer result = execute(() -> {
      int itemCount = comboBox.getItemCount();
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JLabelTextQuery.java`
#### Snippet
```java
final class JLabelTextQuery {
  @RunsInEDT
  static @Nullable String textOf(final @Nonnull JLabel label) {
    return execute(() -> label.getText());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JLabelTextQuery.java`
#### Snippet
```java
final class JLabelTextQuery {
  @RunsInEDT
  static @Nullable String textOf(final @Nonnull JLabel label) {
    return execute(() -> label.getText());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableStopCellEditingTask.java`
#### Snippet
```java

  @RunsInEDT
  static void stopEditing(final @Nonnull JTable table, final int row, final int column) {
    execute(() -> doStopCellEditing(table, row, column));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableStopCellEditingTask.java`
#### Snippet
```java

  @RunsInEDT
  static void checkStateAndStopEditing(final @Nonnull JTable table, final int row, final int column) {
    execute(() -> {
      checkCellIndicesInBounds(table, row, column);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableStopCellEditingTask.java`
#### Snippet
```java
final class JTableStopCellEditingTask {
  @RunsInEDT
  static void stopEditing(final @Nonnull TableCellEditor cellEditor) {
    execute(() -> doStopCellEditing(cellEditor));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void doMoveToFront(final @Nonnull Window w) {
    execute(() -> w.toFront());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point closeInfo(final @Nonnull Window w) {
    Point result = execute(() -> {
      checkEnabledAndShowing(w);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void doMoveToBack(final @Nonnull Window w) {
    execute(() -> w.toBack());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderSetValueTask.java`
#### Snippet
```java
final class JSliderSetValueTask {
  @RunsInEDT
  static void setValue(final @Nonnull JSlider slider, final int newValue) {
    execute(() -> slider.setValue(newValue));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeClearSelectionTask.java`
#### Snippet
```java
final class JTreeClearSelectionTask {
  @RunsInEDT
  static void clearSelectionOf(final @Nonnull JTree tree) {
    execute(() -> tree.clearSelection());
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonArmedQuery.java`
#### Snippet
```java
final class AbstractButtonArmedQuery {
  @RunsInEDT
  static boolean isArmed(final @Nonnull AbstractButton button) {
    Boolean result = execute(() -> button.getModel().isArmed());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JPopupMenuElementsAsTextQuery.java`
#### Snippet
```java
final class JPopupMenuElementsAsTextQuery {
  @RunsInEDT
  static @Nonnull String[] menuElementsAsText(final @Nonnull JPopupMenu popupMenu) {
    String[] result = execute(new GuiQuery<String[]>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JPopupMenuElementsAsTextQuery.java`
#### Snippet
```java
final class JPopupMenuElementsAsTextQuery {
  @RunsInEDT
  static @Nonnull String[] menuElementsAsText(final @Nonnull JPopupMenu popupMenu) {
    String[] result = execute(new GuiQuery<String[]>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Integer, Point> tabToSelectInfo(final @Nonnull JTabbedPaneLocation location,
                                                               final @Nonnull JTabbedPane tabbedPane,
                                                               final @Nonnull TextMatcher matcher) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Integer, Point> tabToSelectInfo(final @Nonnull JTabbedPaneLocation location,
                                                               final @Nonnull JTabbedPane tabbedPane,
                                                               final @Nonnull TextMatcher matcher) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
  @Nonnull private static Pair<Integer, Point> tabToSelectInfo(final @Nonnull JTabbedPaneLocation location,
                                                               final @Nonnull JTabbedPane tabbedPane,
                                                               final @Nonnull TextMatcher matcher) {
    Pair<Integer, Point> result = execute(new GuiQuery<Pair<Integer, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String toolTipTextAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.getToolTipTextAt(index.value));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String toolTipTextAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.getToolTipTextAt(index.value));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String titleAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.getTitleAt(index.value));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static String titleAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.getTitleAt(index.value));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static String[] allTabTitlesIn(final @Nonnull JTabbedPane tabbedPane) {
    String[] result = execute(() -> {
      List<String> allTitles = newArrayList();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point pointAtTab(final @Nonnull JTabbedPaneLocation location,
                                           final @Nonnull JTabbedPane tabbedPane, final int index) {
    Point result = execute(() -> location.pointAt(tabbedPane, index));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Point pointAtTab(final @Nonnull JTabbedPaneLocation location,
                                           final @Nonnull JTabbedPane tabbedPane, final int index) {
    Point result = execute(() -> location.pointAt(tabbedPane, index));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point pointAtTabWhenShowing(final @Nonnull JTabbedPaneLocation location,
                                                      final @Nonnull JTabbedPane tabbedPane, final int index) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Point pointAtTabWhenShowing(final @Nonnull JTabbedPaneLocation location,
                                                      final @Nonnull JTabbedPane tabbedPane, final int index) {
    Point result = execute(() -> {
      location.checkIndexInBounds(tabbedPane, index);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static boolean isEnabledAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.isEnabledAt(index.value));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static boolean isEnabledAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.isEnabledAt(index.value));
  }
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageTypes.java`
#### Snippet
```java
  }

  static @Nonnull String messageTypeAsText(int messageType) {
    if (messageMap.containsKey(messageType)) {
      return checkNotNullOrEmpty(messageMap.get(messageType)).toString();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JFileChooserSelectFileTask.java`
#### Snippet
```java

  @RunsInEDT
  static void setSelectedFiles(final @Nonnull JFileChooser fileChooser, final @Nonnull File[] files) {
    execute(() -> {
      checkEnabledAndShowing(fileChooser);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JFileChooserSelectFileTask.java`
#### Snippet
```java

  @RunsInEDT
  static void setSelectedFiles(final @Nonnull JFileChooser fileChooser, final @Nonnull File[] files) {
    execute(() -> {
      checkEnabledAndShowing(fileChooser);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JFileChooserSelectFileTask.java`
#### Snippet
```java
final class JFileChooserSelectFileTask {
  @RunsInEDT
  static void setSelectedFile(final @Nonnull JFileChooser fileChooser, final @Nonnull File file) {
    execute(() -> {
      checkEnabledAndShowing(fileChooser);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JFileChooserSelectFileTask.java`
#### Snippet
```java
final class JFileChooserSelectFileTask {
  @RunsInEDT
  static void setSelectedFile(final @Nonnull JFileChooser fileChooser, final @Nonnull File file) {
    execute(() -> {
      checkEnabledAndShowing(fileChooser);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point pointAtIndex(final @Nonnull JTableHeader tableHeader, final int columnIndex,
                                             final JTableHeaderLocation location) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point pointAtName(final @Nonnull JTableHeader tableHeader,
                                            final @Nonnull TextMatcher matcher,
                                            final @Nonnull JTableHeaderLocation location) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Point pointAtName(final @Nonnull JTableHeader tableHeader,
                                            final @Nonnull TextMatcher matcher,
                                            final @Nonnull JTableHeaderLocation location) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderDriver.java`
#### Snippet
```java
  @Nonnull private static Point pointAtName(final @Nonnull JTableHeader tableHeader,
                                            final @Nonnull TextMatcher matcher,
                                            final @Nonnull JTableHeaderLocation location) {
    Point result = execute(() -> {
      Pair<Integer, Point> indexAndLocation = location.pointAt(tableHeader, matcher);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameSetMaximumTask.java`
#### Snippet
```java
final class JInternalFrameSetMaximumTask {
  @RunsInEDT
  static void setMaximum(final @Nonnull JInternalFrame internalFrame, final @Nonnull JInternalFrameAction action) {
    execute(() -> {
      internalFrame.setIcon(false);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameSetMaximumTask.java`
#### Snippet
```java
final class JInternalFrameSetMaximumTask {
  @RunsInEDT
  static void setMaximum(final @Nonnull JInternalFrame internalFrame, final @Nonnull JInternalFrameAction action) {
    execute(() -> {
      internalFrame.setIcon(false);
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JFileChooserApproveButtonTextQuery.java`
#### Snippet
```java
final class JFileChooserApproveButtonTextQuery {
  @RunsInEDT
  static @Nullable String approveButtonTextFrom(final @Nonnull JFileChooser fileChooser) {
    return execute(() -> {
      String text = fileChooser.getApproveButtonText();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JFileChooserApproveButtonTextQuery.java`
#### Snippet
```java
final class JFileChooserApproveButtonTextQuery {
  @RunsInEDT
  static @Nullable String approveButtonTextFrom(final @Nonnull JFileChooser fileChooser) {
    return execute(() -> {
      String text = fileChooser.getApproveButtonText();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableColumnCountQuery.java`
#### Snippet
```java
final class JTableColumnCountQuery {
  @RunsInEDT
  static int columnCountOf(final @Nonnull JTable table) {
    Integer result = execute(() -> table.getColumnCount());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/KeyStrokes.java`
#### Snippet
```java
final class KeyStrokes {
  @RunsInCurrentThread
  static @Nonnull KeyStroke[] findKeyStrokesForAction(@Nonnull String actionName, @Nonnull Object actionKey,
      @Nonnull InputMap inputMap) {
    List<KeyStroke> keyStrokes = newArrayList();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java

  @RunsInEDT
  static void checkHasSelection(final @Nonnull JTree tree, final @Nonnull String[] selection,
                                final @Nonnull JTreePathFinder pathFinder, final @Nonnull Description errMsg) {
    execute(() -> checkSelection(tree, selection, pathFinder, errMsg));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java

  @RunsInEDT
  static void checkHasSelection(final @Nonnull JTree tree, final @Nonnull String[] selection,
                                final @Nonnull JTreePathFinder pathFinder, final @Nonnull Description errMsg) {
    execute(() -> checkSelection(tree, selection, pathFinder, errMsg));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
  @RunsInEDT
  static void checkHasSelection(final @Nonnull JTree tree, final @Nonnull String[] selection,
                                final @Nonnull JTreePathFinder pathFinder, final @Nonnull Description errMsg) {
    execute(() -> checkSelection(tree, selection, pathFinder, errMsg));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
  @RunsInEDT
  static void checkHasSelection(final @Nonnull JTree tree, final @Nonnull String[] selection,
                                final @Nonnull JTreePathFinder pathFinder, final @Nonnull Description errMsg) {
    execute(() -> checkSelection(tree, selection, pathFinder, errMsg));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
  }

  private static void failNoSelection(final @Nonnull Description errMessage) {
    fail(String.format("[%s] No selection", errMessage.value()));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
final class JTreeVerifySelectionTask {
  @RunsInEDT
  static void checkHasSelection(final @Nonnull JTree tree, final @Nonnull int[] selection,
                                final @Nonnull Description errMsg) {
    execute(() -> checkSelection(tree, selection, errMsg));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
final class JTreeVerifySelectionTask {
  @RunsInEDT
  static void checkHasSelection(final @Nonnull JTree tree, final @Nonnull int[] selection,
                                final @Nonnull Description errMsg) {
    execute(() -> checkSelection(tree, selection, errMsg));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
  @RunsInEDT
  static void checkHasSelection(final @Nonnull JTree tree, final @Nonnull int[] selection,
                                final @Nonnull Description errMsg) {
    execute(() -> checkSelection(tree, selection, errMsg));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java

  @RunsInEDT
  static void checkNoSelection(final @Nonnull JTree tree, final @Nonnull Description errMsg) {
    execute(() -> {
      if (tree.getSelectionCount() == 0) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java

  @RunsInEDT
  static void checkNoSelection(final @Nonnull JTree tree, final @Nonnull Description errMsg) {
    execute(() -> {
      if (tree.getSelectionCount() == 0) {
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionValueQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nullable Object singleSelectionValue(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    return execute(() -> {
      int selectedIndex = list.getSelectedIndex();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionValueQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nullable Object singleSelectionValue(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    return execute(() -> {
      int selectedIndex = list.getSelectedIndex();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionValueQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nullable Object singleSelectionValue(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    return execute(() -> {
      int selectedIndex = list.getSelectedIndex();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeEditableQuery.java`
#### Snippet
```java
final class JTreeEditableQuery {
  @RunsInEDT
  static boolean isEditable(final @Nonnull JTree tree) {
    Boolean result = execute(() -> tree.isEditable());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListContentQuery.java`
#### Snippet
```java
final class JListContentQuery {
  @RunsInEDT
  static @Nonnull String[] contents(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    String[] result = execute(() -> {
      String[] values = new String[list.getModel().getSize()];
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListContentQuery.java`
#### Snippet
```java
final class JListContentQuery {
  @RunsInEDT
  static @Nonnull String[] contents(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    String[] result = execute(() -> {
      String[] values = new String[list.getModel().getSize()];
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListContentQuery.java`
#### Snippet
```java
final class JListContentQuery {
  @RunsInEDT
  static @Nonnull String[] contents(final @Nonnull JList<?> list, final @Nonnull JListCellReader cellReader) {
    String[] result = execute(() -> {
      String[] values = new String[list.getModel().getSize()];
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentEnabledCondition.java`
#### Snippet
```java
  }

  @Nonnull private static Description description(final @Nonnull Component c) {
    return new GuiLazyLoadingDescription() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentEnabledCondition.java`
#### Snippet
```java
  private Component c;

  static @Nonnull ComponentEnabledCondition untilIsEnabled(@Nonnull Component c) {
    return new ComponentEnabledCondition(c);
  }
```

### MissortedModifiers
Missorted modifiers `abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderLocation.java`
#### Snippet
```java

    @RunsInCurrentThread
    abstract @Nonnull Point update(@Nonnull Point center, int coordinate);

    @RunsInCurrentThread
```

### MissortedModifiers
Missorted modifiers `static abstract`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderLocation.java`
#### Snippet
```java
  }

  private static abstract class JSliderLocationStrategy {
    @RunsInCurrentThread
    final @Nonnull Point locationForValue(JSlider slider, int value) {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderLocation.java`
#### Snippet
```java
  private static abstract class JSliderLocationStrategy {
    @RunsInCurrentThread
    final @Nonnull Point locationForValue(JSlider slider, int value) {
      Point center = new Point(slider.getWidth() / 2, slider.getHeight() / 2);
      int max = max(slider, checkNotNull(slider.getInsets()));
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageTypeQuery.java`
#### Snippet
```java
class JOptionPaneMessageTypeQuery {
  @RunsInEDT
  static int messageTypeOf(final @Nonnull JOptionPane optionPane) {
    Integer result = execute(() -> optionPane.getMessageType());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point checkStateAndScrollToPosition(final @Nonnull JTextComponent textBox, final int index) {
    Point result = execute(() -> {
      checkEnabledAndShowing(textBox);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static void performAndValidateTextSelection(final @Nonnull JTextComponent textBox, final int start,
                                                      final int end) {
    execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static int indexOfText(final @Nonnull JTextComponent textBox, final @Nonnull String text) {
    Integer result = execute(() -> {
      checkEnabledAndShowing(textBox);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java

  @RunsInEDT
  private static int indexOfText(final @Nonnull JTextComponent textBox, final @Nonnull String text) {
    Integer result = execute(() -> {
      checkEnabledAndShowing(textBox);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Point scrollToPosition(final @Nonnull JTextComponent textBox, final int index) {
    Point result = execute(() -> scrollToVisible(textBox, index));
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Integer, GenericRange<Point>> findSlideToMaximumInfo(final @Nonnull JSlider slider,
      final @Nonnull JSliderLocation location) {
    Pair<Integer, GenericRange<Point>> result = execute(new GuiQuery<Pair<Integer, GenericRange<Point>>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Integer, GenericRange<Point>> findSlideToMaximumInfo(final @Nonnull JSlider slider,
      final @Nonnull JSliderLocation location) {
    Pair<Integer, GenericRange<Point>> result = execute(new GuiQuery<Pair<Integer, GenericRange<Point>>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static Pair<Integer, GenericRange<Point>> findSlideToMinimumInfo(final @Nonnull JSlider slider,
      final @Nonnull JSliderLocation location) {
    Pair<Integer, GenericRange<Point>> result = execute(new GuiQuery<Pair<Integer, GenericRange<Point>>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Pair<Integer, GenericRange<Point>> findSlideToMinimumInfo(final @Nonnull JSlider slider,
      final @Nonnull JSliderLocation location) {
    Pair<Integer, GenericRange<Point>> result = execute(new GuiQuery<Pair<Integer, GenericRange<Point>>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private static GenericRange<Point> findSlideInfo(final @Nonnull JSlider slider,
      final @Nonnull JSliderLocation location, final int value) {
    GenericRange<Point> result = execute(new GuiQuery<GenericRange<Point>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static GenericRange<Point> findSlideInfo(final @Nonnull JSlider slider,
      final @Nonnull JSliderLocation location, final int value) {
    GenericRange<Point> result = execute(new GuiQuery<GenericRange<Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull List<Integer> matchingItemIndices(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    List<Integer> result = execute(new GuiQuery<List<Integer>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull List<Integer> matchingItemIndices(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    List<Integer> result = execute(new GuiQuery<List<Integer>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull List<Integer> matchingItemIndices(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    List<Integer> result = execute(new GuiQuery<List<Integer>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull List<Integer> matchingItemIndices(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                    final @Nonnull JListCellReader cellReader) {
    List<Integer> result = execute(new GuiQuery<List<Integer>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull List<String> matchingItemValues(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                  final @Nonnull JListCellReader cellReader) {
    List<String> result = execute(new GuiQuery<List<String>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull List<String> matchingItemValues(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                  final @Nonnull JListCellReader cellReader) {
    List<String> result = execute(new GuiQuery<List<String>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java

  @RunsInEDT
  static @Nonnull List<String> matchingItemValues(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                  final @Nonnull JListCellReader cellReader) {
    List<String> result = execute(new GuiQuery<List<String>>() {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull List<String> matchingItemValues(final @Nonnull JList<?> list, final @Nonnull TextMatcher matcher,
                                                  final @Nonnull JListCellReader cellReader) {
    List<String> result = execute(new GuiQuery<List<String>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
final class JListMatchingItemQuery {
  @RunsInEDT
  static @Nonnull Point centerOfMatchingItemCell(final @Nonnull JList<?> list, final @Nullable String value,
                                                 final @Nonnull JListCellReader cellReader) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
final class JListMatchingItemQuery {
  @RunsInEDT
  static @Nonnull Point centerOfMatchingItemCell(final @Nonnull JList<?> list, final @Nullable String value,
                                                 final @Nonnull JListCellReader cellReader) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
final class JListMatchingItemQuery {
  @RunsInEDT
  static @Nonnull Point centerOfMatchingItemCell(final @Nonnull JList<?> list, final @Nullable String value,
                                                 final @Nonnull JListCellReader cellReader) {
    Point result = execute(() -> {
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull Point centerOfMatchingItemCell(final @Nonnull JList<?> list, final @Nullable String value,
                                                 final @Nonnull JListCellReader cellReader) {
    Point result = execute(() -> {
      int itemIndex = matchingItemIndex(list, new StringTextMatcher(value), cellReader);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonSelectedQuery.java`
#### Snippet
```java
final class AbstractButtonSelectedQuery {
  @RunsInEDT
  static boolean isSelected(final @Nonnull AbstractButton button) {
    Boolean result = execute(() -> button.isSelected());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/Actions.java`
#### Snippet
```java
 */
final class Actions {
  static @Nonnull Object findActionKey(@Nonnull String name, @Nonnull ActionMap actionMap) {
    Action action = actionMap.get(name);
    if (action != null) {
```

### MissortedModifiers
Missorted modifiers `public abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/finder/WindowFinderTemplate.java`
#### Snippet
```java
   */
  @Override
  public abstract @Nonnull AbstractWindowFixture<?, T, ?> using(@Nonnull Robot robot);
}

```

### MissortedModifiers
Missorted modifiers `protected abstract @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/finder/ComponentFinderTemplate.java`
#### Snippet
```java
   * @return the given {@code Component} casted to the type supported by this finder.
   */
  protected abstract @Nullable T cast(@Nullable Component c);
}

```

### MissortedModifiers
Missorted modifiers `public abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/finder/ComponentFinderTemplate.java`
#### Snippet
```java
   *           not be found.
   */
  public abstract @Nonnull AbstractComponentFixture<?, T, ?> using(@Nonnull Robot robot);

  /**
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/finder/ComponentFinderTemplate.java`
#### Snippet
```java
   *           not be found.
   */
  protected final @Nonnull T findComponentWith(@Nonnull Robot robot) {
    ComponentFoundCondition condition = new ComponentFoundCondition(searchDescription, robot.finder(), matcher);
    pause(condition, timeout);
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/format/ComponentFormatterTemplate.java`
#### Snippet
```java
  @RunsInCurrentThread
  @Override
  public final @Nonnull String format(@Nonnull Component c) {
    checkTypeOf(c);
    return doFormat(c);
```

### MissortedModifiers
Missorted modifiers `protected abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/format/ComponentFormatterTemplate.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  protected abstract @Nonnull String doFormat(@Nonnull Component c);

  private void checkTypeOf(@Nonnull Component c) {
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/timing/Condition.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull String toString() {
    String descriptionText = description != null ? description.value() : defaultDescription();
    String addendum = descriptionAddendum();
```

### MissortedModifiers
Missorted modifiers `public abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/ComponentFixtureExtension.java`
#### Snippet
```java
   * @return the created {@code ComponentFixture}.
   */
  public abstract @Nonnull F createFixture(@Nonnull Robot robot, @Nonnull Container root);
}

```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/format/Formatting.java`
#### Snippet
```java
   */
  @RunsInEDT
  @Nonnull public static String inEdtFormat(final @Nonnull Component c) {
    return checkNotNull(execute(() -> format(c)));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  protected static void checkInEdtShowing(final @Nonnull Component c) {
    execute(() -> checkShowing(c));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull
  public static Description propertyName(final @Nonnull Component c, final @Nonnull String propertyName) {
    return new GuiLazyLoadingDescription() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull
  public static Description propertyName(final @Nonnull Component c, final @Nonnull String propertyName) {
    return new GuiLazyLoadingDescription() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  protected void checkClickAllowed(final @Nonnull Component c) {
    if (robot.settings().clickOnDisabledComponentsAllowed()) {
      checkInEdtShowing(c);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull
  public Color foregroundOf(final @Nonnull Component c) {
    Color result = execute(() -> c.getForeground());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull
  public Color backgroundOf(final @Nonnull Component c) {
    Color result = execute(() -> c.getBackground());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  protected static void checkInEdtEnabledAndShowing(final @Nonnull Component c) {
    execute(() -> checkEnabledAndShowing(c));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull
  public Font fontOf(final @Nonnull Component c) {
    Font result = execute(() -> c.getFont());
    return checkNotNull(result);
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture select() {
    list.selectItem(index);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture click(@Nonnull MouseClickInfo mouseClickInfo) {
    list.clickItem(index, mouseClickInfo.button(), mouseClickInfo.times());
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture click(@Nonnull MouseButton button) {
    list.clickItem(index, button, 1);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nullable String value() {
    return list.valueAt(index);
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture drag() {
    list.drag(index);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   *           the {@code JList}.
   */
  public final @Nonnull JListItemFixture unselect() {
    list.unselectItem(index);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture drop() {
    list.drop(index);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JPopupMenuFixture showPopupMenu() {
    return list.showPopupMenuAt(index);
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture click() {
    list.clickItem(index);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture rightClick() {
    list.clickItem(index, RIGHT_BUTTON, 1);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JListItemFixture doubleClick() {
    list.clickItem(index, LEFT_BUTTON, 2);
    return this;
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws AssertionError if the {@code AbstractButton} managed by this fixture is armed.
   */
  public final @Nonnull S requireNotArmed() {
    driver().requireNotArmed(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws IllegalStateException if this fixture's {@code AbstractButton} is not showing on the screen.
   */
  public final @Nonnull S check() {
    driver().select(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws AssertionError if the {@code AbstractButton} managed by this fixture is not armed.
   */
  public final @Nonnull S requireArmed() {
    driver().requireArmed(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws IllegalStateException if this fixture's {@code AbstractButton} is not showing on the screen.
   */
  public final @Nonnull S uncheck() {
    driver().deselect(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws AssertionError if the {@code AbstractButton} managed by this fixture is selected.
   */
  public final @Nonnull S requireNotSelected() {
    driver().requireNotSelected(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws AssertionError if the {@code AbstractButton} managed by this fixture is not selected.
   */
  public final @Nonnull S requireSelected() {
    driver().requireSelected(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws AssertionError if the {@code AbstractButton} managed by this fixture is not armed.
   */
  public final @Nonnull S requireArmed(boolean armed) {
    if (armed) {
      return requireArmed();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws IllegalStateException if this fixture's {@code AbstractButton} is not showing on the screen.
   */
  public final @Nonnull S check(boolean checked) {
    if (checked) {
      return check();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws AssertionError if the {@code AbstractButton} managed by this fixture is not selected.
   */
  public final @Nonnull S requireSelected(boolean selected) {
    if (selected) {
      return requireSelected();
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/Containers.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull public static
  JFrame frameFor(final @Nonnull Container contentPane) {
	JFrame result = execute(new GuiQuery<JFrame>() {
	  @Override
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractButtonFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S requireText(@Nullable String expected) {
    driver().requireText(target(), expected);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractButtonFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S requireText(@Nonnull Pattern pattern) {
    driver().requireText(target(), pattern);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/ColorFixture.java`
#### Snippet
```java
   * @return this fixture's description.
   */
  public final @Nullable String description() {
    return description != null ? description.value() : null;
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
  }

  @Nonnull private static Point resizeLocation(final @Nonnull Pair<Dimension, Insets> resizeInfo) {
    return resizeLocation(checkNotNull(resizeInfo.first), checkNotNull(resizeInfo.second));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private Pair<Dimension, Insets> resizeInfo(final @Nonnull Container c) {
    Pair<Dimension, Insets> result = execute(new GuiQuery<Pair<Dimension, Insets>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java

  @RunsInEDT
  @Nonnull private Triple<Dimension, Insets, Point> moveInfo(final @Nonnull Container c) {
    Triple<Dimension, Insets, Point> result = execute(new GuiQuery<Triple<Dimension, Insets, Point>>() {
      @Override
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/FontFixture.java`
#### Snippet
```java
   * @return this fixture's description.
   */
  public final @Nullable String description() {
    return description != null ? description.value() : null;
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nullable Object clientProperty(@Nonnull Object key) {
    return driver().clientProperty(target(), key);
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S requireToolTip(@Nonnull Pattern pattern) {
    driver().requireToolTip(target(), pattern);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JPopupMenuFixture showPopupMenu() {
    return new JPopupMenuFixture(robot(), driver().invokePopupMenu(target()));
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JPopupMenuFixture showPopupMenuAt(@Nonnull Point p) {
    return new JPopupMenuFixture(robot(), driver().invokePopupMenu(target(), p));
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S requireToolTip(@Nullable String expected) {
    driver().requireToolTip(target(), expected);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S requireToolTip(@Nullable String expected) {
    driver().requireToolTip(target(), expected);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nullable Object clientProperty(@Nonnull Object key) {
    return driver().clientProperty(target(), key);
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S requireToolTip(@Nonnull Pattern pattern) {
    driver().requireToolTip(target(), pattern);
    return myself();
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowMetrics.java`
#### Snippet
```java
final class WindowMetrics {
  @RunsInCurrentThread
  static @Nonnull Point absoluteCenterOf(@Nonnull Window window) {
    Insets insets = window.getInsets();
    int w = window.getWidth() - (insets.left + insets.right);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/Context.java`
#### Snippet
```java

  @RunsInEDT
  @Nullable private static Component topParentOf(final @Nonnull Component c) {
    return execute(() -> {
      Component parent = c;
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/testing/AssertJSwingTestCaseTemplate.java`
#### Snippet
```java
   * @return this test's {@link Robot}
   */
  protected final @Nonnull Robot robot() {
    return robot;
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowStatus.java`
#### Snippet
```java

  @RunsInEDT
  private void checkSafelyIfReady(final @Nonnull Window w) {
    if (!windows.isShowingButNotReady(w)) {
      return;
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowStatus.java`
#### Snippet
```java

  @RunsInEDT
  private static Point centerOf(final @Nonnull Window w) {
    return execute(() -> absoluteCenterOf(w));
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/Windows.java`
#### Snippet
```java
   * @param w the given window.
   */
  void markAsShowing(final @Nonnull Window w) {
    synchronized (lock) {
      TimerTask task = new TimerTask() {
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/exception/ComponentLookupException.java`
#### Snippet
```java
   * @return the AWT and Swing {@code Component}s found by the lookup (if any).
   */
  public final @Nonnull Collection<Component> found() {
    return unmodifiableCollection(found);
  }
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/launcher/AppletLauncher.java`
#### Snippet
```java
  }

  @Nonnull private static AppletLauncher instantiate(final @Nonnull Class<?> appletType) {
    try {
      Object applet = execute(() -> appletType.newInstance());
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/hierarchy/ChildrenFinder.java`
#### Snippet
```java

  @VisibleForTesting
  static @Nonnull List<ChildrenFinderStrategy> strategies() {
    return newArrayList(strategies);
  }
```

### MissortedModifiers
Missorted modifiers `static @Nullable`
in `assertj-swing/src/main/java/org/assertj/swing/hierarchy/JInternalFrameDesktopPaneQuery.java`
#### Snippet
```java
final class JInternalFrameDesktopPaneQuery {
  @RunsInCurrentThread
  static @Nullable JDesktopPane desktopPaneOf(@Nonnull JInternalFrame internalFrame) {
    JDesktopIcon icon = internalFrame.getDesktopIcon();
    if (icon != null) {
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/launcher/NewAppletViewerQuery.java`
#### Snippet
```java
  // TODO test
  @RunsInEDT
  static @Nonnull AppletViewer showAppletViewerWith(final @Nonnull Applet applet,
                                                    final @Nonnull Map<String, String> parameters) {
    final AppletViewer viewer = newViewer(applet, parameters);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/launcher/NewAppletViewerQuery.java`
#### Snippet
```java
  // TODO test
  @RunsInEDT
  static @Nonnull AppletViewer showAppletViewerWith(final @Nonnull Applet applet,
                                                    final @Nonnull Map<String, String> parameters) {
    final AppletViewer viewer = newViewer(applet, parameters);
```

### MissortedModifiers
Missorted modifiers `final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/launcher/NewAppletViewerQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull AppletViewer showAppletViewerWith(final @Nonnull Applet applet,
                                                    final @Nonnull Map<String, String> parameters) {
    final AppletViewer viewer = newViewer(applet, parameters);
    execute(() -> {
```

### MissortedModifiers
Missorted modifiers `static @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappings.java`
#### Snippet
```java
 */
final class KeyStrokeMappings {
  static @Nonnull Collection<KeyStrokeMapping> defaultMappings() {
    List<KeyStrokeMapping> mappings = newArrayList();
    mappings.add(mapping('\b', VK_BACK_SPACE, NO_MASK));
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @return a fixture that checks properties of the foreground color of this fixture's {@code Component}.
   */
  public final @Nonnull ColorFixture foreground() {
    Color foreground = driver.foregroundOf(target);
    return new ColorFixture(foreground, propertyName(target(), FOREGROUND_PROPERTY));
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws AssertionError if this fixture's {@code Component} is not visible.
   */
  public final @Nonnull S requireVisible() {
    driver.requireVisible(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @see KeyPressInfo
   */
  public final @Nonnull S pressAndReleaseKey(@Nonnull KeyPressInfo keyPressInfo) {
    driver.pressAndReleaseKey(target(), keyPressInfo);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S click(@Nonnull MouseButton button) {
    driver.click(target(), button);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws AssertionError if this fixture's {@code Component} does not have input focus.
   */
  public final @Nonnull S requireFocused() {
    driver.requireFocused(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S click() {
    driver.click(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @see java.awt.event.KeyEvent
   */
  public final @Nonnull S pressKey(int keyCode) {
    driver.pressKey(target(), keyCode);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @return the GUI component in this fixture.
   */
  public final @Nonnull C target() {
    return target;
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws AssertionError if this fixture's {@code Component} is visible.
   */
  public final @Nonnull S requireNotVisible() {
    driver.requireNotVisible(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws AssertionError if this fixture's {@code Component} is disabled.
   */
  public final @Nonnull S requireEnabled() {
    driver.requireEnabled(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S click(@Nonnull MouseClickInfo mouseClickInfo) {
    driver.click(target(), mouseClickInfo);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws AssertionError if this fixture's {@code Component} is not an instance of the given type.
   */
  public final @Nonnull <T extends C> T targetCastedTo(@Nonnull Class<T> type) {
    assertThat(target).as(format(target)).isInstanceOf(type);
    return type.cast(target);
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java

  /** @return the {@link Robot} that simulates user events on {@link #target()}. */
  public final @Nonnull Robot robot() {
    return robot;
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.WaitTimedOutError if this fixture's {@code Component} is never enabled.
   */
  public final @Nonnull S requireEnabled(@Nonnull Timeout timeout) {
    driver.requireEnabled(target(), timeout);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws AssertionError if this fixture's {@code Component} is enabled.
   */
  public final @Nonnull S requireDisabled() {
    driver.requireDisabled(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @return a fixture that checks properties of the background color of this fixture's {@code Component}.
   */
  public final @Nonnull ColorFixture background() {
    Color background = driver.backgroundOf(target);
    return new ColorFixture(background, propertyName(target(), BACKGROUND_PROPERTY));
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @return a fixture that checks properties of the font of this fixture's {@code Component}.
   */
  public final @Nonnull FontFixture font() {
    Font font = driver.fontOf(target);
    return new FontFixture(font, propertyName(target(), FONT_PROPERTY));
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @see java.awt.event.KeyEvent
   */
  public final @Nonnull S releaseKey(int keyCode) {
    driver.releaseKey(target(), keyCode);
    return myself();
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
  protected abstract @Nonnull D createDriver(@Nonnull Robot robot);

  protected final @Nonnull D driver() {
    return driver;
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ActionFailedException if there is no drag action in effect.
   */
  public final @Nonnull S drop() {
    driver().drop(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @return {@code this} casted to the "self type".
   */
  protected final @Nonnull S myself() {
    return myself;
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @see java.awt.event.KeyEvent
   */
  public final @Nonnull S pressAndReleaseKeys(@Nonnull int... keyCodes) {
    driver.pressAndReleaseKeys(target(), keyCodes);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws IllegalStateException if this fixture's {@code Component} is not showing on the screen.
   */
  public final @Nonnull S focus() {
    driver.focus(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @see java.awt.event.KeyEvent
   */
  public final @Nonnull S pressKeyWhileRunning(int keyCode, @Nonnull Runnable runnable) {
    driver.pressKeyWhileRunning(target(), keyCode, runnable);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S rightClick() {
    driver.rightClick(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S doubleClick() {
    driver.doubleClick(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `protected abstract @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
  }

  protected abstract @Nonnull D createDriver(@Nonnull Robot robot);

  protected final @Nonnull D driver() {
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @return the {@code ComponentFinder} contained in this fixture's {@code Robot}.
   */
  protected final @Nonnull ComponentFinder finder() {
    return robot().finder();
  }
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  protected final @Nonnull <T extends Component> T findByName(@Nullable String name, @Nonnull Class<T> type) {
    return finder().findByName(target(), name, type, requireShowing());
  }
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  protected final @Nonnull <T extends Component> T findByType(@Nonnull Class<T> type) {
    return finder().findByType(target(), type, requireShowing());
  }
```

### MissortedModifiers
Missorted modifiers `protected final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  protected final @Nonnull <T extends Component> T find(@Nonnull GenericTypeMatcher<? extends T> matcher) {
    return finder().find(target(), matcher);
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JPopupMenuFixture showPopupMenu() {
    return new JPopupMenuFixture(robot(), driver().invokePopupMenu(target()));
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S resizeHeightTo(int height) {
    driver().resizeHeightTo(target(), height);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S moveToBack() {
    driver().moveToBack(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S moveToFront() {
    driver().moveToFront(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   * @return this fixture.
   */
  public final @Nonnull S show(@Nonnull Dimension size) {
    driver().show(target(), size);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S resizeWidthTo(int width) {
    driver().resizeWidthTo(target(), width);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   * @return this fixture.
   */
  public final @Nonnull S show() {
    driver().show(target());
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S resizeTo(@Nonnull Dimension size) {
    driver().resizeTo(target(), size);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull JPopupMenuFixture showPopupMenuAt(@Nonnull Point p) {
    return new JPopupMenuFixture(robot(), driver().invokePopupMenu(target(), p));
  }
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S requireSize(@Nonnull Dimension size) {
    driver().requireSize(target(), size);
    return myself();
```

### MissortedModifiers
Missorted modifiers `public final @Nonnull`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   */
  @Override
  public final @Nonnull S moveTo(@Nonnull Point p) {
    driver().moveTo(target(), p);
    return myself();
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/core/UnexpectedJOptionPaneFinder.java`
#### Snippet
```java
    }
    message.append("]>");
    fail(message.toString());
  }
}
```

### IgnoreResultOfCall
Result of `Invoker.info()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/util/AWTExceptionHandlerInstaller.java`
#### Snippet
```java
  static void installAWTExceptionHandler(@Nonnull Class<?> exceptionHandlerType, SystemPropertyWriter writer) {
    try {
      constructor().in(exceptionHandlerType).info();
    } catch (RuntimeException e) {
      throw new IllegalArgumentException("The exception handler type should have a default constructor");
```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
  @RunsInEDT
  private void failNoSelection(@Nonnull JList<?> list) {
    fail(String.format("[%s] No selection", selectedIndexProperty(list).value()));
  }

```

### IgnoreResultOfCall
Result of `Preconditions.checkNotNullOrEmpty()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @RunsInEDT
  public void selectPaths(final @Nonnull JTree tree, final @Nonnull String[] paths) {
    checkNotNullOrEmpty(paths);
    clearSelection(tree);
    new MultipleSelectionTemplate(robot) {
```

### IgnoreResultOfCall
Result of `Preconditions.checkNotNullOrEmpty()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @RunsInEDT
  public void unselectPaths(final @Nonnull JTree tree, final @Nonnull String[] paths) {
    checkNotNullOrEmpty(paths);
    new MultipleSelectionTemplate(robot) {
      @Override
```

### IgnoreResultOfCall
Result of `Preconditions.checkNotNullOrEmpty()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  public void unselectCells(final @Nonnull JTable table, final @Nonnull TableCell[] cells) {
    checkNotNullOrEmpty(cells);
    new MultipleSelectionTemplate(robot) {
      @Override
```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
    String descriptionValue = description != null ? description.value() : null;
    String message = descriptionValue == null ? "" : String.format("[%s] ", descriptionValue);
    fail(message + String.format("expected:<%s> but was<%s>", Arrays.format(expected), Arrays.format(actual)));
  }

```

### IgnoreResultOfCall
Result of `Preconditions.checkNotNullOrEmpty()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
   */
  public void selectCells(final @Nonnull JTable table, final @Nonnull TableCell[] cells) {
    checkNotNullOrEmpty(cells);
    new MultipleSelectionTemplate(robot) {
      @Override
```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
      String msg = String.format(format, propertyName(table, SELECTION_PROPERTY).value(),
                                 format(selectedRowsOf(table)), format(table.getSelectedColumns()));
      fail(msg);
    });
  }
```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java
    }
    String format = "[%s] Expecting no selection, but found:<%s>";
    fail(String.format(format, selectedIndexProperty(comboBox).value(), quote(selection.second)));
  }

```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java

  private void failNoSelection(@Nonnull JComboBox<?> comboBox) {
    fail(String.format("[%s] No selection", selectedIndexProperty(comboBox).value()));
  }

```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/MultipleSelectionTemplate.java`
#### Snippet
```java

  private void fail() {
    Fail.fail("Unexpected method call.");
  }
}
```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
    String format = "[%s] expecting selection:<%s> but was:<%s>";
    String msg = String.format(format, errMsg.value(), format(expected), format(actual));
    fail(msg);
  }

```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java

  private static void failNoSelection(final @Nonnull Description errMessage) {
    fail(String.format("[%s] No selection", errMessage.value()));
  }

```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
    String format = "[%s] expecting selection:<%s> but was:<%s>";
    String msg = String.format(format, errMsg.value(), format(expected), format(actual));
    fail(msg);
  }

```

### IgnoreResultOfCall
Result of `Fail.fail()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeVerifySelectionTask.java`
#### Snippet
```java
      String format = "[%s] expected no selection but was:<%s>";
      String message = String.format(format, errMsg.value(), format(tree.getSelectionPaths()));
      fail(message);
    });
  }
```

### IgnoreResultOfCall
Result of `Preconditions.checkNotNullOrEmpty()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/timing/Pause.java`
#### Snippet
```java
   */
  public static void pause(@Nonnull final Condition[] conditions, final long timeout) {
    checkNotNullOrEmpty(conditions);
    for (Condition condition : conditions) {
      checkNotNull(condition);
```

### IgnoreResultOfCall
Result of `AbstractObjectAssert.as()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/fixture/ColorFixture.java`
#### Snippet
```java
  private void describe(AbstractObjectAssert<?, Color> assertThat) {
    if (description != null) {
      assertThat.as(description);
    }
  }
```

### IgnoreResultOfCall
Result of `AbstractAssert.usingDefaultComparator()` is ignored
in `assertj-swing/src/main/java/org/assertj/swing/assertions/ImageAssert.java`
#### Snippet
```java
  @Override
  public ImageAssert usingDefaultComparator() {
    super.usingDefaultComparator();
    images = Images.instance();
    return myself;
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/runner/FolderCreator.java`
#### Snippet
```java
        delete(imageFolder);
      }
      imageFolder.mkdir();
      return imageFolder;
    } catch (Exception e) {
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `assertj-swing/src/main/java/org/assertj/swing/assertions/data/RgbColor.java`
#### Snippet
```java
    if (color == null)
      return false;
    int offsetValue = offset.value.intValue();
    if (abs(r - color.r) > offsetValue)
      return false;
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `Assertions` is the same as one of its superclass' names
in `assertj-swing/src/main/java/org/assertj/swing/assertions/Assertions.java`
#### Snippet
```java
 * </pre>
 */
public class Assertions extends org.assertj.core.api.Assertions {

  /**
```

### ClassNameSameAsAncestorName
Class name `ScreenshotOnFailureListener` is the same as one of its superclass' names
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/ScreenshotOnFailureListener.java`
#### Snippet
```java
 */
@Deprecated
public class ScreenshotOnFailureListener extends org.assertj.swing.testng.listener.ScreenshotOnFailureListener {
}

```

## RuleId[id=MalformedFormatString]
### MalformedFormatString
Too many arguments for format string (found: 2, expected: 1)
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreePathFinder.java`
#### Snippet
```java
  @Nonnull private LocationUnavailableException multipleMatchingNodes(@Nonnull String matchingText,
      @Nullable Object parentText) {
    String msg = String.format("There is more than one node with value '%s' under", matchingText, quote(parentText));
    throw new LocationUnavailableException(msg);
  }
```

### MalformedFormatString
Too many arguments for format string (found: 2, expected: 1)
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
    execute(() -> {
      if (isJToolBarFloating(toolBar)) {
        String msg = String.format("Failed to dock <%s> using constraint ''", format(toolBar), constraint);
        throw actionFailure(msg);
      }
```

## RuleId[id=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `assertj-swing/src/main/java/org/assertj/swing/lock/ScreenLock.java`
#### Snippet
```java
        return;
      }
      while (acquired) {
        released.await();
      }
```

## RuleId[id=IntegerMultiplicationImplicitCastToLong]
### IntegerMultiplicationImplicitCastToLong
settings().eventPostingDelay() \* 4: integer multiplication implicitly cast to long
in `assertj-swing/src/main/java/org/assertj/swing/core/ComponentDragAndDrop.java`
#### Snippet
```java
  public void drop(@Nonnull Component target, @Nonnull Point where) {
    dragOver(target, where);
    TimeoutWatch watch = startWatchWithTimeoutOf(settings().eventPostingDelay() * 4);
    while (!robot.isDragging()) {
      if (watch.isTimeOut()) {
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
    robot.waitForIdle();
    checkItemFound(list, scrollInfo, matcher);
    super.drop(list, cellCenterIn(scrollInfo));
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
    robot.waitForIdle();
    checkItemFound(list, scrollInfo, matcher);
    super.drag(list, cellCenterIn(scrollInfo));
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
    Point cellCenter = scrollToItem(list, index);
    robot.waitForIdle();
    super.drop(list, cellCenter);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
    Point cellCenter = scrollToItem(list, index);
    robot.waitForIdle();
    super.drag(list, cellCenter);
  }

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import static java.awt.event.InputEvent.ALT_GRAPH_MASK;`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fi.java`
#### Snippet
```java
import java.util.List;

import static java.awt.event.InputEvent.ALT_GRAPH_MASK;
import static java.awt.event.InputEvent.SHIFT_MASK;
import static java.awt.event.KeyEvent.*;
```

### UNUSED_IMPORT
Unused import `import static java.awt.event.InputEvent.SHIFT_MASK;`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fi.java`
#### Snippet
```java

import static java.awt.event.InputEvent.ALT_GRAPH_MASK;
import static java.awt.event.InputEvent.SHIFT_MASK;
import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_MINUS;
```

### UNUSED_IMPORT
Unused import `import static java.awt.event.KeyEvent.VK_MINUS;`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fi.java`
#### Snippet
```java
import static java.awt.event.InputEvent.SHIFT_MASK;
import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_SPACE;
import static org.assertj.swing.keystroke.KeyStrokeMapping.mapping;
```

### UNUSED_IMPORT
Unused import `import static java.awt.event.KeyEvent.VK_SPACE;`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fi.java`
#### Snippet
```java
import static java.awt.event.KeyEvent.*;
import static java.awt.event.KeyEvent.VK_MINUS;
import static java.awt.event.KeyEvent.VK_SPACE;
import static org.assertj.swing.keystroke.KeyStrokeMapping.mapping;

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java

  void clear() {
    buttons = modifiers = clickCount = 0;
    componentStack.clear();
    locationStack.clear();
```

### NestedAssignment
Result of assignment expression used
in `assertj-swing/src/main/java/org/assertj/swing/input/MouseInfo.java`
#### Snippet
```java

  void clear() {
    buttons = modifiers = clickCount = 0;
    componentStack.clear();
    locationStack.clear();
```

### NestedAssignment
Result of assignment expression used
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
    }
    TimeoutWatch watch = startWatchWithTimeoutOf(POPUP_TIMEOUT);
    while ((popup = activePopupMenu()) == null) {
      if (watch.isTimeOut()) {
        break;
```

### NestedAssignment
Result of assignment expression used
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneLocationCalculator.java`
#### Snippet
```java
      int maximum = calculateMaximum(splitPane);
      if (maximum < minimum) {
        minimum = maximum = 0;
      }
      return min(maximum, max(minimum, desiredLocation));
```

### NestedAssignment
Result of assignment expression used
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneLocationCalculator.java`
#### Snippet
```java
      int maximum = calculateMaximum(splitPane);
      if (maximum < minimum) {
        minimum = maximum = 0;
      }
      return min(maximum, max(minimum, desiredLocation));
```

## RuleId[id=FieldAccessedSynchronizedAndUnsynchronized]
### FieldAccessedSynchronizedAndUnsynchronized
Field `executeInEDT` is accessed in both synchronized and unsynchronized contexts
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiActionRunner.java`
#### Snippet
```java
public class GuiActionRunner {
  @GuardedBy("this")
  private static boolean executeInEDT = true;

  /**
```

### FieldAccessedSynchronizedAndUnsynchronized
Field `toolkit` is accessed in both synchronized and unsynchronized contexts
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  private static final int BUTTON_MASK = BUTTON1_MASK | BUTTON2_MASK | BUTTON3_MASK;

  private static Toolkit toolkit = ToolkitProvider.instance().defaultToolkit();
  private static WindowMonitor windowMonitor = WindowMonitor.instance();
  private static InputState inputState = new InputState(toolkit);
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `assertj-swing/src/main/java/org/assertj/swing/core/ResettableComponentMatcher.java`
#### Snippet
```java
   * @param matchFound indicates whether a match has been found before resetting.
   */
  void reset(boolean matchFound);
}

```

### EmptyMethod
All implementations of this method are empty
in `assertj-swing/src/main/java/org/assertj/swing/security/ExitCallHook.java`
#### Snippet
```java
   * @param status the status the exit status.
   */
  void exitCalled(int status);
}

```

### EmptyMethod
The method is empty
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/testcase/AssertJSwingJUnitTestCase.java`
#### Snippet
```java
   * @throws Exception when the tear down of the test fails which results in that the test will not be cleaned up properly
   */
  protected void onTearDown() throws Exception {}
}

```

### EmptyMethod
The method is empty
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/testcase/AssertJSwingTestngTestCase.java`
#### Snippet
```java
   * <code>{@link #tearDown()}</code>.
   */
  protected void onTearDown() {
  }
}
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-18-22-40-04.998.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=InstanceofCatchParameter]
### InstanceofCatchParameter
'instanceof' on 'catch' parameter `e`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/runner/FolderCreator.java`
#### Snippet
```java
      String message = concat("Unable to create directory ", quote(name));

      if (e instanceof IOException) {
        throw new UncheckedIOException(message, (IOException) e);
      }
```

## RuleId[id=ExceptionNameDoesntEndWithException]
### ExceptionNameDoesntEndWithException
Exception class name `WaitTimedOutError` does not end with 'Exception'
in `assertj-swing/src/main/java/org/assertj/swing/exception/WaitTimedOutError.java`
#### Snippet
```java
 * @author Yvonne Wang
 */
public final class WaitTimedOutError extends RuntimeException {
  /** Generated serial version UID. */
  private static final long serialVersionUID = 4272325985481493108L;
```

## RuleId[id=NonStaticFinalLogger]
### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing/src/main/java/org/assertj/swing/text/TextReaders.java`
#### Snippet
```java
 */
public class TextReaders {
  private static Logger logger = Logger.getLogger(TextReaders.class.getCanonicalName());

  @VisibleForTesting
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing/src/main/java/org/assertj/swing/input/DragAwareEventNormalizer.java`
#### Snippet
```java
 */
class DragAwareEventNormalizer extends EventNormalizer {
  private static Logger logger = Logger.getLogger(DragAwareEventNormalizer.class.getCanonicalName());

  private DragAwareEventQueue dragAwareEventQueue;
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing/src/main/java/org/assertj/swing/format/Formatting.java`
#### Snippet
```java
  private static final ConcurrentMap<Class<?>, ComponentFormatter> FORMATTERS = newConcurrentHashMap();

  private static Logger logger = Logger.getLogger(Formatting.class.getCanonicalName());

  static {
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/ProtectingTimerTask.java`
#### Snippet
```java
  private static final int CANCELED = 3;

  private static Logger logger = Logger.getLogger(ProtectingTimerTask.class.getCanonicalName());

  private final TimerTask task;
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowStatus.java`
#### Snippet
```java
  private static final Dimension MINIMUM_WINDOW_SIZE = new Dimension(50, 30);

  private static Logger logger = Logger.getLogger(WindowStatus.class.getCanonicalName());
  private static int sign = 1;

```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProviderPicker.java`
#### Snippet
```java
 */
class KeyStrokeMappingProviderPicker {
  private static Logger LOGGER = Logger.getLogger(KeyStrokeMappingProviderPicker.class.getName());
  private final KeyStrokeMappingProviderFactory factory;

```

### NonStaticFinalLogger
Non-constant logger field `LOGGER`
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeLocale.java`
#### Snippet
```java
class KeyStrokeLocale {
  static final String ASSERTJ_SWING_KEYBOARD_LOCALE = "assertj.swing.keyboard.locale";
  private static Logger LOGGER = Logger.getLogger(KeyStrokeLocale.class.getName());
  private static Locale locale;

```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
  private static final String EMPTY_STRING = "";

  private static Logger logger = Logger.getAnonymousLogger();

  private static ImageEncoder imageEncoder = new ImageEncoder();
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/runner/FailureScreenshotTaker.java`
#### Snippet
```java
public class FailureScreenshotTaker {

  private static Logger logger = Logger.getAnonymousLogger();

  private final File imageFolder;
```

### NonStaticFinalLogger
Non-constant logger field `logger`
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/listener/ScreenshotOnFailureListener.java`
#### Snippet
```java
public class ScreenshotOnFailureListener extends AbstractTestListener {

  private static Logger logger = Logger.getAnonymousLogger();

  private ScreenshotTakerIF screenshotTaker;
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `assertj-swing/src/main/java/org/assertj/swing/format/JTabbedPaneFormatter.java`
#### Snippet
```java
    int count = tabbedPane.getTabCount();
    if (count == 0) {
      return new String[0];
    }
    String[] titles = new String[count];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `assertj-swing/src/main/java/org/assertj/swing/launcher/ApplicationLauncher.java`
#### Snippet
```java

  private final Class<?> applicationType;
  private String[] args = {};

  private ApplicationLauncher(@Nonnull Class<?> applicationType) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/GUITestRecognizer.java`
#### Snippet
```java
    try {
      Class<?> testClass = Class.forName(className);
      Method testMethod = testClass.getDeclaredMethod(methodName, new Class<?>[0]);
      return GUITestFinder.isGUITest(testClass, testMethod);
    } catch (Exception e) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/Tests.java`
#### Snippet
```java
  private static Method methodInType(Class<?> type, String name) {
    try {
      return type.getMethod(name, new Class[0]);
    } catch (Exception e) {
      return null;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/Tests.java`
#### Snippet
```java
      return UNKNOWN;
    try {
      return (String) m.invoke(target, new Object[0]);
    } catch (Exception e) {
      return UNKNOWN;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `assertj-swing/src/main/java/org/assertj/swing/input/InputState.java`
#### Snippet
```java
      }
      if (inputEvent instanceof KeyEvent) {
        synchronized (this) {
          lastEventTime(inputEvent);
          modifiers(inputEvent.getModifiers());
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `assertj-swing/src/main/java/org/assertj/swing/input/InputState.java`
#### Snippet
```java
        if(mouseEvent.getComponent() != null) {
          Point eventScreenLocation = screenLocation(mouseEvent);
          synchronized (this) {
            lastEventTime(mouseEvent);
            dragDropInfo.update(mouseEvent);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `textComponent` initializer `null` is redundant
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableTextComponentEditorCellWriter.java`
#### Snippet
```java
  @Nonnull private JTextComponent doStartCellEditing(@Nonnull JTable table, int row, int column) {
    Point cellLocation = cellLocation(table, row, column, location());
    JTextComponent textComponent = null;
    try {
      textComponent = activateEditorWithF2Key(table, row, column, cellLocation);
```

### UnusedAssignment
Variable `r` initializer `null` is redundant
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java
  @RunsInCurrentThread
  @Nonnull private static Rectangle locationOf(@Nonnull JTextComponent textBox, int index) {
    Rectangle r = null;
    try {
      r = textBox.modelToView(index);
```

### UnusedAssignment
Variable `beanInfo` initializer `null` is redundant
in `assertj-swing/src/main/java/org/assertj/swing/format/IntrospectionComponentFormatter.java`
#### Snippet
```java

  private void populate() {
    BeanInfo beanInfo = null;
    try {
      beanInfo = Introspector.getBeanInfo(targetType, Object.class);
```

### UnusedAssignment
Variable `in` initializer `null` is redundant
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageDecoder.java`
#### Snippet
```java

  BufferedImage decodeBase64(String encoded) throws IOException {
    ByteArrayInputStream in = null;
    byte[] toDecode = encoded.getBytes(UTF_8);
    in = new ByteArrayInputStream(Base64.decodeBase64(toDecode));
```

### UnusedAssignment
Variable `hostName` initializer `null` is redundant
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/EnvironmentXmlNodeWriter.java`
#### Snippet
```java

  EnvironmentXmlNodeWriter writeHostName(XmlNode target) {
    String hostName = null;
    try {
      hostName = hostNameReader.localHostName();
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `p == null` is always `false`
in `assertj-swing/src/main/java/org/assertj/swing/awt/AWT.java`
#### Snippet
```java
  Point translate(@Nonnull Component c, int x, int y) {
    Point p = locationOnScreenOf(c);
    if (p == null) {
      return null;
    }
```

### ConstantValue
Value `iconified` is always 'false'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
      return Pair.of(true, null);
    }
    return Pair.of(iconified, findIconifyLocation(internalFrame));
  }

```

### ConstantValue
Value `deiconified` is always 'false'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
    }
    Container desktopIcon = checkNotNull(internalFrame.getDesktopIcon());
    return Triple.of(deiconified, desktopIcon, iconifyButtonLocation(desktopIcon));
  }

```

### ConstantValue
Condition `path.getPathCount() > 0` is always `true`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeAddRootIfInvisibleTask.java`
#### Snippet
```java
    }
    // root is invisible but path already contains root
    if (path.getPathCount() > 0 && root == path.getPathComponent(0)) {
      return path;
    }
```

### ConstantValue
Condition `pathAsArray == null` is always `false`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeAddRootIfInvisibleTask.java`
#### Snippet
```java
    }
    Object[] pathAsArray = path.getPath();
    if (pathAsArray == null) {
      return new TreePath(newArrayList(root));
    }
```

### ConstantValue
Condition `index >= 0` is always `true`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxItemIndexPreconditions.java`
#### Snippet
```java
      throw new IndexOutOfBoundsException("JComboBox is empty");
    }
    if (index >= 0 && index < itemCount) {
      return;
    }
```

### ConstantValue
Condition `newTimeout < 0` is always `false`
in `assertj-swing/src/main/java/org/assertj/swing/finder/ComponentFinderTemplate.java`
#### Snippet
```java
   */
  @Nonnull protected ComponentFinderTemplate<T> withTimeout(@Nonnegative long newTimeout) {
    if (newTimeout < 0) {
      throw new IllegalArgumentException("Timeout cannot be a negative number");
    }
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `GuiActionRunner` has only 'static' members, and lacks a 'private' constructor
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiActionRunner.java`
#### Snippet
```java
 */
@ThreadSafe
public class GuiActionRunner {
  @GuardedBy("this")
  private static boolean executeInEDT = true;
```

### UtilityClassWithoutPrivateConstructor
Class `Maps` has only 'static' members, and lacks a 'private' constructor
in `assertj-swing/src/main/java/org/assertj/swing/util/Maps.java`
#### Snippet
```java
 * @author Christian Rösch
 */
public class Maps {
  /**
   * Returns a <em>mutable</em> {@code HashMap} that is empty.
```

### UtilityClassWithoutPrivateConstructor
Class `ComponentPerformDefaultAccessibleActionTask` has only 'static' members, and lacks a 'private' constructor
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentPerformDefaultAccessibleActionTask.java`
#### Snippet
```java
 * @author Alex Ruiz
 */
class ComponentPerformDefaultAccessibleActionTask {
  private static final int DEFAULT_ACTION_INDEX = 0;

```

### UtilityClassWithoutPrivateConstructor
Class `Tests` has only 'static' members, and lacks a 'private' constructor
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/Tests.java`
#### Snippet
```java
 * @author Alex Ruiz
 */
final class Tests {

  private static final String JUNIT4_TEST_CASE_FACADE_TYPE = "junit.framework.JUnit4TestCaseFacade";
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `assertj-swing/src/main/java/org/assertj/swing/util/Arrays.java`
#### Snippet
```java
      return false;
    }
    ;
    if (one.length == 0) {
      return true;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `assertj-swing/src/main/java/org/assertj/swing/driver/BasicJComboBoxCellReader.java`
#### Snippet
```java
      };
    });
    ;
    return checkNotNull(result);
  }
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `assertj-swing/src/main/java/org/assertj/swing/driver/BasicJComboBoxCellReader.java`
#### Snippet
```java
      protected JList<T> executeInEDT() {
        return new JList<T>();
      };
    });
    ;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowMonitor.java`
#### Snippet
```java
      protected WindowMonitor executeInEDT() {
        return new WindowMonitor(ToolkitProvider.instance().defaultToolkit());
      };
    });
  }
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiLazyLoadingDescription.java`
#### Snippet
```java
  public final @Nonnull String value() {
    String result = execute(() -> loadDescription());
    return checkNotNull(result);
  }

```

### DataFlowIssue
@Nullable method 'translate' always returns a non-null value
in `assertj-swing/src/main/java/org/assertj/swing/awt/AWT.java`
#### Snippet
```java
   */
  @RunsInCurrentThread
  @Nullable public static
  Point translate(@Nonnull Component c, int x, int y) {
    Point p = locationOnScreenOf(c);
```

### DataFlowIssue
Argument `center` might be null
in `assertj-swing/src/main/java/org/assertj/swing/awt/AWT.java`
#### Snippet
```java
      return centerOf(c);
    });
    return checkNotNull(center);
  }

```

### DataFlowIssue
Argument `where` might be null
in `assertj-swing/src/main/java/org/assertj/swing/awt/AWT.java`
#### Snippet
```java
  public static boolean isPointInScreenBoundaries(@Nonnull JComponent c, @Nonnull Point p) {
    Point where = translate(c, p.x, p.y);
    return isPointInScreenBoundaries(where);
  }

```

### DataFlowIssue
Argument `execute(() -> translate(c, x, y))` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/RobotEventGenerator.java`
#### Snippet
```java
  @Override
  public void moveMouse(@Nonnull Component c, int x, int y) {
    Point p = checkNotNull(execute(() -> translate(c, x, y)));
    moveMouse(p.x, p.y);
  }
```

### DataFlowIssue
Argument `execute(() -> translate(c, where.x, where.y))` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/RobotEventGenerator.java`
#### Snippet
```java
  @Override
  public void pressMouse(@Nonnull Component c, @Nonnull Point where, int buttons) {
    Point p = checkNotNull(execute(() -> translate(c, where.x, where.y)));
    if (!isPointInScreenBoundaries(p)) {
      throw actionFailure("The component to click is out of the boundaries of the screen");
```

### DataFlowIssue
Argument `label` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/LabelMatcher.java`
#### Snippet
```java
  public LabelMatcher(@Nullable String label, @Nonnull Class<? extends Component> type, boolean requireShowing) {
    super(requireShowing);
    this.label = checkNotNullOrEmpty(label).toString();
    this.type = checkNotNull(type);
  }
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/ComponentIsFocusableQuery.java`
#### Snippet
```java
  static boolean isFocusable(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isFocusable());
    return Preconditions.checkNotNull(result);
  }

```

### DataFlowIssue
Argument `name` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/NameMatcher.java`
#### Snippet
```java
  public NameMatcher(@Nullable String name, @Nonnull Class<? extends Component> type, boolean requireShowing) {
    super(requireShowing);
    this.name = checkNotNullOrEmpty(name).toString();
    this.type = checkNotNull(type);
  }
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/EdtSafeCondition.java`
#### Snippet
```java
  public final boolean test() {
    Boolean result = execute(() -> testInEDT());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInSelectedRow.java`
#### Snippet
```java
  private static int selectedRowOf(final JTable table) {
    Integer result = execute(() -> table.getSelectedRow());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInRowByValue.java`
#### Snippet
```java
      return -1;
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellByColumnId.java`
#### Snippet
```java
      return new TableCell(row, column);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `lowestScreen` might be null
in `assertj-swing/src/main/java/org/assertj/swing/util/RobotFactory.java`
#### Snippet
```java
      }
    }
    return new Robot(lowestScreen);
  }
}
```

### DataFlowIssue
Argument `value` might be null
in `assertj-swing/src/main/java/org/assertj/swing/util/SystemPropertyWriter.java`
#### Snippet
```java
  @Nullable
  String updateSystemProperty(@Nonnull String propertyName, @Nullable String value) {
    return System.setProperty(propertyName, value);
  }
}
```

### DataFlowIssue
Argument `reader.systemProperty("os.name")` might be null
in `assertj-swing/src/main/java/org/assertj/swing/util/OSIdentifier.java`
#### Snippet
```java
  @VisibleForTesting
  OSIdentifier(@Nonnull SystemPropertyReader reader) {
    String osName = checkNotNull(reader.systemProperty("os.name")).toLowerCase(ENGLISH);
    isWindows = osName.startsWith("windows");
    isWindows9x = isWindows && containsAny(osName, "95", "98", "me");
```

### DataFlowIssue
Argument `matching` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
                                                          final @Nonnull GenericTypeMatcher<T> m) {
    Boolean matching = execute(() -> m.matches(c));
    return checkNotNull(matching);
  }
}
```

### DataFlowIssue
Argument `matching` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
  private static boolean isMatching(@Nonnull final Component c, @Nonnull final ComponentMatcher m) {
    Boolean matching = execute(() -> m.matches(c));
    return checkNotNull(matching);
  }

```

### DataFlowIssue
Argument `execute(() -> h.roots())` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Collection<? extends Component> rootsOf(final @Nonnull ComponentHierarchy h) {
    return checkNotNull(execute(() -> h.roots()));
  }

```

### DataFlowIssue
Argument `children` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
                                                                    final @Nonnull ComponentHierarchy h) {
    Collection<Component> children = execute(() -> h.childrenOf(c));
    return checkNotNull(children);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/text/TextReaders.java`
#### Snippet
```java
      return anyComponentContainsText(container.getComponents(), text);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/image/ScreenshotTaker.java`
#### Snippet
```java
  @Nonnull private static BufferedImage takeScreenshot(final @Nonnull Robot robot, final @Nonnull Rectangle r) {
    BufferedImage result = execute(() -> robot.createScreenCapture(r));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentHasFocusQuery.java`
#### Snippet
```java
  public static boolean hasFocus(final @Nonnull Component component) {
    Boolean result = execute(() -> component.hasFocus());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentVisibleQuery.java`
#### Snippet
```java
  public static boolean isVisible(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isVisible());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentSizeQuery.java`
#### Snippet
```java
  @Nonnull public static Dimension sizeOf(final @Nonnull Component component) {
    Dimension result = execute(() -> component.getSize());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentShowingQuery.java`
#### Snippet
```java
  public static boolean isShowing(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isShowing());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentLocationOnScreenQuery.java`
#### Snippet
```java
  @Nonnull public static Point locationOnScreen(final @Nonnull Component component) {
    Point result = execute(() -> component.getLocationOnScreen());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentEnabledQuery.java`
#### Snippet
```java
  public static boolean isEnabled(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isEnabled());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `selectedTab` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneSelectTabQuery.java`
#### Snippet
```java
  static Index selectedTabIndexOf(final @Nonnull JTabbedPane tabbedPane) {
    Integer selectedTab = execute(() -> tabbedPane.getSelectedIndex());
    return atIndex(selectedTab);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableMatchingCellQuery.java`
#### Snippet
```java
                                          final @Nonnull JTableCellReader cellReader) {
    TableCell result = execute(() -> findMatchingCell(table, matcher, cellReader));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java
  private static boolean active(final @Nonnull JApplet applet) {
    Boolean result = execute(() -> applet.isActive());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuItemDriver.java`
#### Snippet
```java
  @Nonnull private static JMenuItemLocation locationOf(final @Nonnull JMenuItem menuItem) {
    JMenuItemLocation result = execute(() -> new JMenuItemLocation(menuItem));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `screenLockOwner` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  private void releaseScreenLock() {
    ScreenLock screenLock = ScreenLock.instance();
    if (screenLock.acquiredBy(screenLockOwner)) {
      screenLock.release(screenLockOwner);
    }
```

### DataFlowIssue
Argument `eventQueue` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
    Component applet = findAppletDescendent(w);
    EventQueue eventQueue = windowMonitor.eventQueueFor(applet != null ? applet : w);
    checkNotNull(eventQueue).postEvent(event);
    waitForIdle();
  }
```

### DataFlowIssue
Argument `execute(() -> isReadyForInput(checkNotNull(getWindowAncestor(popup))))` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  @RunsInEDT
  private boolean isWindowAncestorReadyForInput(final JPopupMenu popup) {
    return checkNotNull(execute(() -> isReadyForInput(checkNotNull(getWindowAncestor(popup)))));
  }

```

### DataFlowIssue
Argument `invokerAndCenterOfInvoker.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
        Component invoker = invokerAndCenterOfInvoker.first;
        if (invoker instanceof JMenu) {
          jitter(invoker, invokerAndCenterOfInvoker.second);
        }
      }
```

### DataFlowIssue
Argument `targetAncestor` might be null
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
      return;
    }
    activate(checkNotNull(targetAncestor));
    waitForIdle();
  }
```

### DataFlowIssue
Argument `execute(() -> tree.getModel().getChildCount(path.getLastPathComponent()))` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeChildOfPathCountQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int childCount(final @Nonnull JTree tree, final @Nonnull TreePath path) {
    return checkNotNull(execute(() -> tree.getModel().getChildCount(path.getLastPathComponent())));
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectedIndexQuery.java`
#### Snippet
```java
  static int selectedIndexOf(final @Nonnull JList<?> list) {
    Integer result = execute(() -> list.getSelectedIndex());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `deiconifyInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
  public void deiconify(@Nonnull JInternalFrame internalFrame) {
    Triple<Boolean, Container, Point> deiconifyInfo = validateAndfindDeiconifyInfo(internalFrame);
    if (deiconifyInfo.first) {
      return; // internal frame is already de-iconified
    }
```

### DataFlowIssue
Argument `deiconifyInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
      return; // internal frame is already de-iconified
    }
    moveMouseIgnoringAnyError(deiconifyInfo.second, deiconifyInfo.third);
    setIconProperty(internalFrame, DEICONIFY);
  }
```

### DataFlowIssue
Argument `toMoveMouseTo.first` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
  private void maximizeOrNormalize(@Nonnull JInternalFrame internalFrame, @Nonnull JInternalFrameAction action,
                                   @Nonnull Pair<Container, Point> toMoveMouseTo) {
    moveMouseIgnoringAnyError(toMoveMouseTo.first, toMoveMouseTo.second);
    setMaximumProperty(internalFrame, action);
  }
```

### DataFlowIssue
Argument `toMoveMouseTo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
  private void maximizeOrNormalize(@Nonnull JInternalFrame internalFrame, @Nonnull JInternalFrameAction action,
                                   @Nonnull Pair<Container, Point> toMoveMouseTo) {
    moveMouseIgnoringAnyError(toMoveMouseTo.first, toMoveMouseTo.second);
    setMaximumProperty(internalFrame, action);
  }
```

### DataFlowIssue
@Nullable method 'executeInEDT' always returns a non-null value
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
    Pair<Container, Point> result = execute(new GuiQuery<Pair<Container, Point>>() {
      @Override
      @Nullable protected Pair<Container, Point> executeInEDT() {
        checkCanMaximize(internalFrame);
        return findMaximizeLocation(internalFrame);
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `iconifyInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
  public void iconify(@Nonnull JInternalFrame internalFrame) {
    Pair<Boolean, Point> iconifyInfo = findIconifyInfo(internalFrame);
    if (iconifyInfo.first) {
      return; // internal frame is already iconified
    }
```

### DataFlowIssue
Argument `iconifyInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
      return; // internal frame is already iconified
    }
    moveMouseIgnoringAnyError(internalFrame, iconifyInfo.second);
    setIconProperty(internalFrame, ICONIFY);
  }
```

### DataFlowIssue
@Nullable method 'executeInEDT' always returns a non-null value
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
    Triple<Boolean, Container, Point> result = execute(new GuiQuery<Triple<Boolean, Container, Point>>() {
      @Override
      @Nullable protected Triple<Boolean, Container, Point> executeInEDT() throws Throwable {
        checkShowingOrIconified(internalFrame);
        return deiconifyInfo(internalFrame);
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
@Nullable method 'executeInEDT' always returns a non-null value
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
    Pair<Boolean, Point> result = execute(new GuiQuery<Pair<Boolean, Point>>() {
      @Override
      @Nullable protected Pair<Boolean, Point> executeInEDT() throws Throwable {
        checkShowingOrIconified(internalFrame);
        if (!internalFrame.isIconifiable()) {
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxContentQuery.java`
#### Snippet
```java
      return values;
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/DialogModalQuery.java`
#### Snippet
```java
  static boolean isModal(final @Nonnull Dialog dialog) {
    Boolean result = execute(() -> dialog.isModal());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuPopupMenuQuery.java`
#### Snippet
```java
  static @Nonnull JPopupMenu popupMenuOf(final @Nonnull JMenu menu) {
    JPopupMenu result = execute(() -> menu.getPopupMenu());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneTabTitlesQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
@Nullable method 'executeInEDT' always returns a non-null value
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectionValueQuery.java`
#### Snippet
```java
    Pair<Boolean, String> result = execute(new GuiQuery<Pair<Boolean, String>>() {
      @Override
      @Nullable protected Pair<Boolean, String> executeInEDT() {
        int selectedIndex = comboBox.getSelectedIndex();
        if (selectedIndex == -1) {
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectionValueQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarValueQuery.java`
#### Snippet
```java
  static int valueOf(final JProgressBar progressBar) {
    Integer result = execute(() -> progressBar.getValue());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarMaximumQuery.java`
#### Snippet
```java
  static int maximumOf(final @Nonnull JProgressBar progressBar) {
    Integer result = execute(() -> progressBar.getMaximum());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarMinimumAndMaximumQuery.java`
#### Snippet
```java
  static @Nonnull Pair<Integer, Integer> minimumAndMaximumOf(final @Nonnull JProgressBar progressBar) {
    Pair<Integer, Integer> result = execute(() -> Pair.of(progressBar.getMinimum(), progressBar.getMaximum()));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java
                                           final @Nonnull JTreePathFinder pathFinder) {
    TreePath result = execute(() -> matchingPathWithRootIfInvisible(tree, path, pathFinder));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeMatchingPathQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
                               final @Nonnull JListCellReader cellReader) {
    Integer result = execute(() -> matchingItemIndex(list, matcher, cellReader));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneLocationCalculator.java`
#### Snippet
```java
    Integer result = execute(() -> FINDERS.get(splitPane.getOrientation()).locationToMoveDividerTo(splitPane,
                                                                                                   desiredLocation));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `info.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
    Triple<Boolean, Point, Integer> info = scrollToRowAndGetToggleInfo(tree, row, location());
    robot.waitForIdle();
    if (!info.first) {
      return; // already collapsed
    }
```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      return; // already collapsed
    }
    toggleCell(tree, checkNotNull(info.second), info.third);
  }

```

### DataFlowIssue
Unboxing of `info.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
    Triple<Boolean, Point, Integer> info = scrollToRowAndGetToggleInfo(tree, row, location());
    robot.waitForIdle();
    if (info.first) {
      return; // already expanded
    }
```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      return; // already expanded
    }
    toggleCell(tree, checkNotNull(info.second), info.third);
  }

```

### DataFlowIssue
Unboxing of `info.second` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
    robot.waitForIdle();
    Point where = checkNotNull(info.third);
    if (info.second != select) {
      robot.click(tree, where);
    }
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `info.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  public void collapsePath(@Nonnull JTree tree, @Nonnull String path) {
    Triple<Boolean, Point, Integer> info = scrollToMatchingPathAndGetToggleInfo(tree, path, pathFinder(), location());
    if (!info.first) {
      return; // already collapsed
    }
```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      return; // already collapsed
    }
    toggleCell(tree, checkNotNull(info.second), info.third);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `info.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  public void expandPath(@Nonnull JTree tree, @Nonnull String path) {
    Triple<Boolean, Point, Integer> info = scrollToMatchingPathAndGetToggleInfo(tree, path, pathFinder(), location());
    if (info.first) {
      return; // already expanded
    }
```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      return; // already expanded
    }
    toggleCell(tree, checkNotNull(info.second), info.third);
  }

```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
    Triple<Boolean, Point, Integer> info = scrollToRowAndGetToggleInfo(tree, row, location());
    robot.waitForIdle();
    toggleCell(tree, checkNotNull(info.second), info.third);
  }

```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  public void drop(@Nonnull JTree tree, int row) {
    Pair<Boolean, Point> info = scrollToRow(tree, row, location(), true);
    drop(tree, checkNotNull(info.second));
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @Nonnull public JPopupMenu showPopupMenu(@Nonnull JTree tree, int row) {
    Pair<Boolean, Point> info = scrollToRow(tree, row, location(), true);
    Point p = checkNotNull(info.second);
    return robot.showPopupMenu(tree, p);
  }
```

### DataFlowIssue
Argument `info.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
  @Nonnull private Point scrollAndSelectRow(@Nonnull JTree tree, int row, boolean select, boolean singleSelectRequired) {
    Pair<Boolean, Point> info = scrollToRow(tree, row, location(), singleSelectRequired);
    Point p = checkNotNull(info.second);
    if (info.first != select) {
      robot.click(tree, p);
```

### DataFlowIssue
Unboxing of `info.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeDriver.java`
#### Snippet
```java
    Pair<Boolean, Point> info = scrollToRow(tree, row, location(), singleSelectRequired);
    Point p = checkNotNull(info.second);
    if (info.first != select) {
      robot.click(tree, p);
    }
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/MenuElementComponentQuery.java`
#### Snippet
```java
  static @Nonnull Component componentIn(final @Nonnull MenuElement menuElement) {
    Component result = execute(() -> menuElement.getComponent());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectedIndexQuery.java`
#### Snippet
```java
  static int selectedIndexOf(final @Nonnull JComboBox<?> comboBox) {
    Integer result = execute(() -> comboBox.getSelectedIndex());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `execute(() -> isCellEditable(table, cell))` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
                                             boolean editable) {
    checkNotNull(cell);
    boolean cellEditable = checkNotNull(execute(() -> isCellEditable(table, cell)));
    assertThat(cellEditable).as(cellProperty(table, concat(EDITABLE_PROPERTY, " ", cell))).isEqualTo(editable);
  }
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
      return index;
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @Nonnull private static int[] selectedRowsOf(final @Nonnull JTable table) {
    int[] result = execute(() -> table.getSelectedRows());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
      return location.pointAt(table, cell.row, cell.column);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
      return location.pointAt(table, cell.row, cell.column);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListItemCountQuery.java`
#### Snippet
```java
  static int itemCountIn(final @Nonnull JList<?> list) {
    Integer result = execute(() -> list.getModel().getSize());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneOptionsQuery.java`
#### Snippet
```java
  static @Nonnull Object[] optionsOf(final @Nonnull JOptionPane optionPane) {
    Object[] result = execute(() -> optionPane.getOptions());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `scrollInfo.first` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  private void scroll(@Nonnull JScrollBar scrollBar, @Nonnull Pair<Point, Integer> scrollInfo) {
    // For now, do it programmatically, faking the mouse movement and clicking
    robot.moveMouse(scrollBar, checkNotNull(scrollInfo.first));
    setValueProperty(scrollBar, scrollInfo.second);
  }
```

### DataFlowIssue
Unboxing of `scrollInfo.second` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
    // For now, do it programmatically, faking the mouse movement and clicking
    robot.moveMouse(scrollBar, checkNotNull(scrollInfo.first));
    setValueProperty(scrollBar, scrollInfo.second);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `scrollInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  public void scrollToMinimum(@Nonnull JScrollBar scrollBar) {
    Pair<Integer, GenericRange<Point>> scrollInfo = findScrollToMinimumInfo(scrollBar, location);
    scroll(scrollBar, scrollInfo.first, checkNotNull(scrollInfo.second));
  }

```

### DataFlowIssue
Argument `scrollInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  public void scrollToMinimum(@Nonnull JScrollBar scrollBar) {
    Pair<Integer, GenericRange<Point>> scrollInfo = findScrollToMinimumInfo(scrollBar, location);
    scroll(scrollBar, scrollInfo.first, checkNotNull(scrollInfo.second));
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `scrollInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  public void scrollToMaximum(@Nonnull JScrollBar scrollBar) {
    Pair<Integer, GenericRange<Point>> scrollInfo = findScrollToMaximumInfo(scrollBar, location());
    scroll(scrollBar, scrollInfo.first, checkNotNull(scrollInfo.second));
  }

```

### DataFlowIssue
Argument `scrollInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
  public void scrollToMaximum(@Nonnull JScrollBar scrollBar) {
    Pair<Integer, GenericRange<Point>> scrollInfo = findScrollToMaximumInfo(scrollBar, location());
    scroll(scrollBar, scrollInfo.first, checkNotNull(scrollInfo.second));
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentEditableQuery.java`
#### Snippet
```java
  static boolean isEditable(final @Nonnull JTextComponent textBox) {
    Boolean result = execute(() -> textBox.isEditable());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollPaneDriver.java`
#### Snippet
```java
  @Nonnull private static JScrollBar horizontalScrollBar(final @Nonnull JScrollPane scrollPane) {
    JScrollBar result = execute(() -> scrollPane.getHorizontalScrollBar());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollPaneDriver.java`
#### Snippet
```java
  @Nonnull private static JScrollBar verticalScrollBar(final @Nonnull JScrollPane scrollPane) {
    JScrollBar result = execute(() -> scrollPane.getVerticalScrollBar());
    return checkNotNull(result);
  }
}
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableContentsQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarIndeterminateQuery.java`
#### Snippet
```java
  static boolean isIndeterminate(final @Nonnull JProgressBar progressBar) {
    Boolean result = execute(() -> progressBar.isIndeterminate());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonDriver.java`
#### Snippet
```java
      return button.isSelected();
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/FrameDriver.java`
#### Snippet
```java
      return maximizeButtonLocation(frame);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarValueQuery.java`
#### Snippet
```java
  static int valueOf(final @Nonnull JScrollBar scrollBar) {
    Integer result = execute(() -> scrollBar.getValue());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `floatInfo.first` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
  @RunsInEDT
  private void doFloat(@Nonnull JToolBar toolBar, int x, int y, Pair<Point, Pair<Window, Point>> floatInfo) {
    drag(toolBar, checkNotNull(floatInfo.first));
    Pair<Window, Point> locationAndAncestor = floatInfo.second;
    Point ancestorLocation = locationAndAncestor.second;
```

### DataFlowIssue
Dereference of `locationAndAncestor` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
    drag(toolBar, checkNotNull(floatInfo.first));
    Pair<Window, Point> locationAndAncestor = floatInfo.second;
    Point ancestorLocation = locationAndAncestor.second;
    drop(checkNotNull(locationAndAncestor.first), new Point(x - ancestorLocation.x, y - ancestorLocation.y));
    checkFloated(toolBar);
```

### DataFlowIssue
Argument `locationAndAncestor.first` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
    Pair<Window, Point> locationAndAncestor = floatInfo.second;
    Point ancestorLocation = locationAndAncestor.second;
    drop(checkNotNull(locationAndAncestor.first), new Point(x - ancestorLocation.x, y - ancestorLocation.y));
    checkFloated(toolBar);
  }
```

### DataFlowIssue
Dereference of `ancestorLocation` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
    Pair<Window, Point> locationAndAncestor = floatInfo.second;
    Point ancestorLocation = locationAndAncestor.second;
    drop(checkNotNull(locationAndAncestor.first), new Point(x - ancestorLocation.x, y - ancestorLocation.y));
    checkFloated(toolBar);
  }
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
  public boolean isFloating(final @Nonnull JToolBar toolBar) {
    Boolean result = execute(() -> isJToolBarFloating(toolBar));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Method invocation `from` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
    Pair<GenericRange<Point>, Container> unfloatInfo = unfloatInfo(toolBar, constraint, location());
    GenericRange<Point> fromAndTo = unfloatInfo.first;
    drag(toolBar, fromAndTo.from());
    drop(checkNotNull(unfloatInfo.second), fromAndTo.to());
    validateIsNotFloating(toolBar, constraint);
```

### DataFlowIssue
Argument `unfloatInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
    GenericRange<Point> fromAndTo = unfloatInfo.first;
    drag(toolBar, fromAndTo.from());
    drop(checkNotNull(unfloatInfo.second), fromAndTo.to());
    validateIsNotFloating(toolBar, constraint);
  }
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Dereference of `floatInfo.second` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
  public void makeFloat(@Nonnull JToolBar toolBar) {
    Pair<Point, Pair<Window, Point>> floatInfo = floatInfo(toolBar, location());
    Point p = floatInfo.second.second; // ancestor location
    doFloat(toolBar, p.x, p.y, floatInfo);
  }
```

### DataFlowIssue
Dereference of `p` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarDriver.java`
#### Snippet
```java
    Pair<Point, Pair<Window, Point>> floatInfo = floatInfo(toolBar, location());
    Point p = floatInfo.second.second; // ancestor location
    doFloat(toolBar, p.x, p.y, floatInfo);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionIndicesQuery.java`
#### Snippet
```java
  static @Nonnull int[] selectedIndices(final @Nonnull JList<?> list) {
    int[] result = execute(() -> list.getSelectedIndices());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneTabIndexQuery.java`
#### Snippet
```java
      return -1;
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxEditableQuery.java`
#### Snippet
```java
  static boolean isEditable(final @Nonnull JComboBox<?> comboBox) {
    Boolean result = execute(() -> comboBox.isEditable());
    return Preconditions.checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxItemCountQuery.java`
#### Snippet
```java
  static int itemCountIn(final @Nonnull JComboBox<?> comboBox) {
    Integer result = execute(() -> comboBox.getItemCount());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
      return location.pointAt(table, row, column);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionValuesQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/BasicJComboBoxCellReader.java`
#### Snippet
```java
    });
    ;
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableRowCountQuery.java`
#### Snippet
```java
  static int rowCountOf(final @Nonnull JTable table) {
    Integer result = execute(() -> table.getRowCount());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCheckBoxEditorCellWriter.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }
}
```

### DataFlowIssue
Unboxing of `editingInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCheckBoxEditorCellWriter.java`
#### Snippet
```java
    boolean realValue = parseBoolean(value);
    Pair<Boolean, Point> editingInfo = doStartCellEditing(table, row, column, location());
    if (editingInfo.first == realValue) {
      return; // JCheckBox already has value to set.
    }
```

### DataFlowIssue
Argument `editingInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableCheckBoxEditorCellWriter.java`
#### Snippet
```java
      return; // JCheckBox already has value to set.
    }
    robot.click(table, checkNotNull(editingInfo.second));
  }

```

### DataFlowIssue
Argument `cellBounds(list, index)` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
  @RunsInCurrentThread
  @Nonnull private static Point scrollToItemWithIndex(@Nonnull JList<?> list, int index) {
    Rectangle cellBounds = checkNotNull(cellBounds(list, index));
    list.scrollRectToVisible(cellBounds);
    return cellCenter(list, cellBounds);
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
      return scrollToItemWithIndex(list, index);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListScrollToItemTask.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxMatchingItemQuery.java`
#### Snippet
```java
      return -1;
    });
    return Preconditions.checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowDriver.java`
#### Snippet
```java
      return closeButtonLocation(w);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonArmedQuery.java`
#### Snippet
```java
  static boolean isArmed(final @Nonnull AbstractButton button) {
    Boolean result = execute(() -> button.getModel().isArmed());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
      return allTitles.toArray(new String[allTitles.size()]);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
                                           final @Nonnull JTabbedPane tabbedPane, final int index) {
    Point result = execute(() -> location.pointAt(tabbedPane, index));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `tabToSelectInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
      } catch (ActionFailedException e) {
        // On Mac it may be necessary to scroll the tabs to find the one to click.
        setTabDirectly(tabbedPane, tabToSelectInfo.first);
      }
      return;
```

### DataFlowIssue
Unboxing of `tabToSelectInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
      return;
    }
    setTabDirectly(tabbedPane, tabToSelectInfo.first);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
      return location.pointAt(tabbedPane, index);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JPopupMenuElementsAsTextQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `execute(() -> tabbedPane.isEnabledAt(index.value))` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static boolean isEnabledAt(final @Nonnull JTabbedPane tabbedPane, final @Nonnull Index index) {
    return execute(() -> tabbedPane.isEnabledAt(index.value));
  }

```

### DataFlowIssue
Argument `textComponent` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableTextComponentEditorCellWriter.java`
#### Snippet
```java
    }
    cellEditor(cellEditor(table, row, column));
    return checkNotNull(textComponent);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderDriver.java`
#### Snippet
```java
      return p;
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderDriver.java`
#### Snippet
```java
      return indexAndLocation.second;
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableColumnCountQuery.java`
#### Snippet
```java
  static int columnCountOf(final @Nonnull JTable table) {
    Integer result = execute(() -> table.getColumnCount());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeEditableQuery.java`
#### Snippet
```java
  static boolean isEditable(final @Nonnull JTree tree) {
    Boolean result = execute(() -> tree.isEditable());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `minAndMax.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarDriver.java`
#### Snippet
```java
  private void checkInBetweenMinAndMax(@Nonnull JProgressBar progressBar, int value) {
    Pair<Integer, Integer> minAndMax = minimumAndMaximumOf(progressBar);
    assertIsInBetweenMinAndMax(value, minAndMax.first, minAndMax.second);
  }

```

### DataFlowIssue
Unboxing of `minAndMax.second` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarDriver.java`
#### Snippet
```java
  private void checkInBetweenMinAndMax(@Nonnull JProgressBar progressBar, int value) {
    Pair<Integer, Integer> minAndMax = minimumAndMaximumOf(progressBar);
    assertIsInBetweenMinAndMax(value, minAndMax.first, minAndMax.second);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListContentQuery.java`
#### Snippet
```java
      return values;
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageTypeQuery.java`
#### Snippet
```java
  static int messageTypeOf(final @Nonnull JOptionPane optionPane) {
    Integer result = execute(() -> optionPane.getMessageType());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java
      return scrollToVisible(textBox, index);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java
      return actualText.indexOf(text);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java
  @Nonnull private static Point scrollToPosition(final @Nonnull JTextComponent textBox, final int index) {
    Point result = execute(() -> scrollToVisible(textBox, index));
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Unboxing of `slideInfo.first` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
  @RunsInEDT
  private void slide(@Nonnull JSlider slider, @Nonnull Pair<Integer, GenericRange<Point>> slideInfo) {
    slide(slider, slideInfo.first, checkNotNull(slideInfo.second));
  }

```

### DataFlowIssue
Argument `slideInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSliderDriver.java`
#### Snippet
```java
  @RunsInEDT
  private void slide(@Nonnull JSlider slider, @Nonnull Pair<Integer, GenericRange<Point>> slideInfo) {
    slide(slider, slideInfo.first, checkNotNull(slideInfo.second));
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `cellBounds(list, itemIndex)` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
    Point result = execute(() -> {
      int itemIndex = matchingItemIndex(list, new StringTextMatcher(value), cellReader);
      Rectangle cellBounds = checkNotNull(cellBounds(list, itemIndex));
      return cellCenter(list, cellBounds);
    });
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListMatchingItemQuery.java`
#### Snippet
```java
      return cellCenter(list, cellBounds);
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonSelectedQuery.java`
#### Snippet
```java
  static boolean isSelected(final @Nonnull AbstractButton button) {
    Boolean result = execute(() -> button.isSelected());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `cast(condition.found())` might be null
in `assertj-swing/src/main/java/org/assertj/swing/finder/ComponentFinderTemplate.java`
#### Snippet
```java
    ComponentFoundCondition condition = new ComponentFoundCondition(searchDescription, robot.finder(), matcher);
    pause(condition, timeout);
    return checkNotNull(cast(condition.found()));
  }

```

### DataFlowIssue
Argument `execute(() -> format(c))` might be null
in `assertj-swing/src/main/java/org/assertj/swing/format/Formatting.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull public static String inEdtFormat(final @Nonnull Component c) {
    return checkNotNull(execute(() -> format(c)));
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  public Color foregroundOf(final @Nonnull Component c) {
    Color result = execute(() -> c.getForeground());
    return checkNotNull(result);
  }
}
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  public Color backgroundOf(final @Nonnull Component c) {
    Color result = execute(() -> c.getBackground());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  public Font fontOf(final @Nonnull Component c) {
    Font result = execute(() -> c.getFont());
    return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/fixture/Containers.java`
#### Snippet
```java
	  }
	});
	return checkNotNull(result);
  }

```

### DataFlowIssue
Argument `moveInfo.first` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
  private void simulateMoveStarted(@Nonnull Container c, @Nonnull Triple<Dimension, Insets, Point> moveInfo, int x,
      int y) {
    Point p = moveLocation(checkNotNull(moveInfo.first), checkNotNull(moveInfo.second));
    moveMouseIgnoringAnyError(c, p);
    moveMouseIgnoringAnyError(c, p.x + x, p.y + y);
```

### DataFlowIssue
Argument `moveInfo.second` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
  private void simulateMoveStarted(@Nonnull Container c, @Nonnull Triple<Dimension, Insets, Point> moveInfo, int x,
      int y) {
    Point p = moveLocation(checkNotNull(moveInfo.first), checkNotNull(moveInfo.second));
    moveMouseIgnoringAnyError(c, p);
    moveMouseIgnoringAnyError(c, p.x + x, p.y + y);
```

### DataFlowIssue
@Nullable method 'executeInEDT' always returns a non-null value
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
    Triple<Dimension, Insets, Point> result = execute(new GuiQuery<Triple<Dimension, Insets, Point>>() {
      @Override
      @Nullable protected Triple<Dimension, Insets, Point> executeInEDT() {
        checkCanMove(c);
        Point locationOnScreen = null;
```

### DataFlowIssue
Dereference of `size` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
    simulateResizeStarted(c, resizeInfo, x, y);
    Dimension size = resizeInfo.first;
    setComponentSize(c, size.width + x, size.height + y);
    robot.waitForIdle();
  }
```

### DataFlowIssue
@Nullable method 'executeInEDT' always returns a non-null value
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
    Pair<Dimension, Insets> result = execute(new GuiQuery<Pair<Dimension, Insets>>() {
      @Override
      @Nullable protected Pair<Dimension, Insets> executeInEDT() {
        checkCanResize(c);
        return Pair.of(c.getSize(), c.getInsets());
```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Dereference of `size` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
    Pair<Dimension, Insets> resizeInfo = resizeInfo(c);
    Dimension size = resizeInfo.first;
    resizeBy(c, resizeInfo, width - size.width, height - size.height);
  }

```

### DataFlowIssue
Dereference of `size` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
    Pair<Dimension, Insets> resizeInfo = resizeInfo(c);
    Dimension size = resizeInfo.first;
    resizeBy(c, resizeInfo, 0, height - size.height);
  }

```

### DataFlowIssue
Argument `result` might be null
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
      }
    });
    return checkNotNull(result);
  }

```

### DataFlowIssue
Dereference of `size` may produce `NullPointerException`
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
    Pair<Dimension, Insets> resizeInfo = resizeInfo(c);
    Dimension size = resizeInfo.first;
    resizeBy(c, resizeInfo, width - size.width, 0);
  }

```

### DataFlowIssue
Argument `tableHeader` might be null
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JTableFixture.java`
#### Snippet
```java
  @Nonnull public JTableHeaderFixture tableHeader() {
    JTableHeader tableHeader = driver().tableHeaderOf(target());
    return new JTableHeaderFixture(robot(), checkNotNull(tableHeader));
  }

```

### DataFlowIssue
Argument `foreground` might be null
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JTableFixture.java`
#### Snippet
```java
  @Nonnull public ColorFixture foregroundAt(@Nonnull TableCell cell) {
    Color foreground = driver().foreground(target(), cell);
    return new ColorFixture(checkNotNull(foreground), cellProperty(cell, FOREGROUND_PROPERTY));
  }

```

### DataFlowIssue
Argument `font` might be null
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JTableFixture.java`
#### Snippet
```java
  public FontFixture fontAt(@Nonnull TableCell cell) {
    Font font = driver().font(target(), cell);
    return new FontFixture(checkNotNull(font), cellProperty(cell, FONT_PROPERTY));
  }

```

### DataFlowIssue
Expression `SingletonLazyLoader.INSTANCE` might evaluate to null but is returned by the method declared as @Nonnull
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowMonitor.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull public static WindowMonitor instance() {
    return SingletonLazyLoader.INSTANCE;
  }

```

### DataFlowIssue
Expression `listenerReference.get()` might evaluate to null but is returned by the method declared as @Nonnull
in `assertj-swing/src/main/java/org/assertj/swing/listener/WeakEventListener.java`
#### Snippet
```java
   */
  @Nonnull public AWTEventListener underlyingListener() {
    return listenerReference.get();
  }

```

### DataFlowIssue
Argument `applet` might be null
in `assertj-swing/src/main/java/org/assertj/swing/launcher/AppletLauncher.java`
#### Snippet
```java
    try {
      Object applet = execute(() -> appletType.newInstance());
      return launcherFor(checkNotNull((Applet) applet));
    } catch (Exception e) {
      String msg = String.format("Unable to create a new instance of %s", appletType.getName());
```

### DataFlowIssue
Argument `dialog` might be null
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
    pause(condition, timeout);
    Dialog dialog = (Dialog) condition.found();
    return new DialogFixture(robot(), checkNotNull(dialog));
  }

```

### DataFlowIssue
Argument `optionPane` might be null
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
    pause(condition, timeout);
    JOptionPane optionPane = (JOptionPane) condition.found();
    return new JOptionPaneFixture(robot(), checkNotNull(optionPane));
  }

```

### DataFlowIssue
Argument `fileChooser` might be null
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
    pause(condition, timeout);
    JFileChooser fileChooser = (JFileChooser) condition.found();
    return new JFileChooserFixture(robot(), checkNotNull(fileChooser));
  }

```

### DataFlowIssue
Argument `image` might be null
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
    BufferedImage image = decodeBase64(encoded, decoder);
    try {
      writer.writeAsPng(image, realPath);
    } catch (Exception ignored) {
      logger.log(SEVERE, ignored.getMessage());
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `assertj-swing/src/main/java/org/assertj/swing/util/Strings.java`
#### Snippet
```java
      return false;
    }
    String hash = s.substring(at + 1, s.length());
    try {
      Integer.parseInt(hash, 16);
```

### StringOperationCanBeSimplified
Inefficient conversion from ByteArrayOutputStream
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java
    printer.printComponents(printStream, root);
    printStream.flush();
    return new String(out.toByteArray());
  }

```

## RuleId[id=MethodOverloadsParentMethod]
### MethodOverloadsParentMethod
Method `pressAndReleaseKeys()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java
   */
  @RunsInEDT
  public void pressAndReleaseKeys(@Nonnull JComboBox<?> comboBox, @Nonnull int... keyCodes) {
    checkNotNull(keyCodes);
    checkInEdtEnabledAndShowing(comboBox);
```

### MethodOverloadsParentMethod
Method `isEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-swing/src/main/java/org/assertj/swing/assertions/ImageAssert.java`
#### Snippet
```java
   * @throws AssertionError if the actual image is not equal to the given one.
   */
  public ImageAssert isEqualTo(BufferedImage expected) {
    images.assertEqual(info, actual, expected);
    return this;
```

### MethodOverloadsParentMethod
Method `isNotEqualTo()` overloads a compatible method of a superclass, when overriding might have been intended
in `assertj-swing/src/main/java/org/assertj/swing/assertions/ImageAssert.java`
#### Snippet
```java
  }

  public ImageAssert isNotEqualTo(BufferedImage other) {
    images.assertNotEqual(info, actual, other);
    return this;
```

## RuleId[id=Convert2MethodRef]
### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/edt/GuiLazyLoadingDescription.java`
#### Snippet
```java
  @Override
  public final @Nonnull String value() {
    String result = execute(() -> loadDescription());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/FocusOwnerFinder.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable public static Component inEdtFocusOwner() {
    return execute(() -> focusOwner());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java

  private static boolean get(Properties p, String suffix, boolean defaultValue) {
    return getGeneric(p, suffix, t -> Boolean.parseBoolean(t), defaultValue);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java
    DEFAULT_DELAY_DROP = get(p, "delay.drop", 0);
    DEFAULT_DELAY_POSTING_EVENTS = get(p, "delay.posting_events", 100);
    DEFAULT_LOOKUP_SCOPE = getGeneric(p, "lookup_scope", t -> ComponentLookupScope.valueOf(t), DEFAULT);
    DEFAULT_TIMEOUT_IDLE = get(p, "timeout.idle", 10000);
    DEFAULT_CLICK_ON_DISABLED = get(p, "allow_click_on_disabled_component", true);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java
    DEFAULT_TIMEOUT_IDLE = get(p, "timeout.idle", 10000);
    DEFAULT_CLICK_ON_DISABLED = get(p, "allow_click_on_disabled_component", true);
    DEFAULT_DRAG_BUTTON = getGeneric(p, "drag.button", t -> MouseButton.valueOf(t), LEFT_BUTTON);

    PRESERVE_SCREENSHOTS = get(p, "preserve_screenshots", false);
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java

  private static int get(Properties p, String suffix, int defaultValue) {
    return getGeneric(p, suffix, t -> Integer.parseInt(t), defaultValue);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/ComponentIsFocusableQuery.java`
#### Snippet
```java
  @RunsInEDT
  static boolean isFocusable(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isFocusable());
    return Preconditions.checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/ComponentRequestFocusTask.java`
#### Snippet
```java
  @RunsInEDT
  static void giveFocusTo(final @Nonnull Component c) {
    execute(() -> c.requestFocusInWindow());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/EdtSafeCondition.java`
#### Snippet
```java
  @Override
  public final boolean test() {
    Boolean result = execute(() -> testInEDT());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellInSelectedRow.java`
#### Snippet
```java
  @RunsInEDT
  private static int selectedRowOf(final JTable table) {
    Integer result = execute(() -> table.getSelectedRow());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/core/FinderDelegate.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static Collection<? extends Component> rootsOf(final @Nonnull ComponentHierarchy h) {
    return checkNotNull(execute(() -> h.roots()));
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentHasFocusQuery.java`
#### Snippet
```java
  @RunsInEDT
  public static boolean hasFocus(final @Nonnull Component component) {
    Boolean result = execute(() -> component.hasFocus());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentVisibleQuery.java`
#### Snippet
```java
  @RunsInEDT
  public static boolean isVisible(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isVisible());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentParentQuery.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable public static Container parentOf(final @Nonnull Component component) {
    return execute(() -> component.getParent());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentShowingQuery.java`
#### Snippet
```java
  @RunsInEDT
  public static boolean isShowing(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isShowing());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentLocationOnScreenQuery.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull public static Point locationOnScreen(final @Nonnull Component component) {
    Point result = execute(() -> component.getLocationOnScreen());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/query/ComponentEnabledQuery.java`
#### Snippet
```java
   */
  public static boolean isEnabled(final @Nonnull Component component) {
    Boolean result = execute(() -> component.isEnabled());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/query/AbstractButtonTextQuery.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable public static String textOf(final @Nonnull AbstractButton button) {
    return execute(() -> button.getText());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneSelectTabQuery.java`
#### Snippet
```java
  @RunsInEDT
  static Index selectedTabIndexOf(final @Nonnull JTabbedPane tabbedPane) {
    Integer selectedTab = execute(() -> tabbedPane.getSelectedIndex());
    return atIndex(selectedTab);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerValueQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable Object valueOf(final @Nonnull JSpinner spinner) {
    return execute(() -> spinner.getValue());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static AppletContext appletContext(final @Nonnull JApplet applet) {
    return execute(() -> applet.getAppletContext());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static URL codeBase(final @Nonnull JApplet applet) {
    return execute(() -> applet.getCodeBase());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java
  @RunsInEDT
  private static boolean active(final @Nonnull JApplet applet) {
    Boolean result = execute(() -> applet.isActive());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static URL documentBase(final @Nonnull JApplet applet) {
    return execute(() -> applet.getDocumentBase());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonTextQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull String textOf(final @Nonnull AbstractButton button) {
    String result = execute(() -> button.getText());
    return result == null ? "" : result;
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectedIndexQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int selectedIndexOf(final @Nonnull JList<?> list) {
    Integer result = execute(() -> list.getSelectedIndex());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
    execute(() -> // it seems that moving to back always works, regardless if the internal frame is invisible and/or
                  // disabled.
    internalFrame.moveToBack());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
    execute(() -> // it seems that moving to front always works, regardless if the internal frame is invisible and/or
                  // disabled.
    internalFrame.toFront());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/DialogModalQuery.java`
#### Snippet
```java
  @RunsInEDT
  static boolean isModal(final @Nonnull Dialog dialog) {
    Boolean result = execute(() -> dialog.isModal());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuPopupMenuQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull JPopupMenu popupMenuOf(final @Nonnull JMenu menu) {
    JPopupMenu result = execute(() -> menu.getPopupMenu());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarValueQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int valueOf(final JProgressBar progressBar) {
    Integer result = execute(() -> progressBar.getValue());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentSelectAllTask.java`
#### Snippet
```java
  @RunsInEDT
  static void selectAllText(final @Nonnull JTextComponent textBox) {
    execute(() -> textBox.selectAll());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/FrameTitleQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull Frame f) {
    return execute(() -> f.getTitle());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarMaximumQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int maximumOf(final @Nonnull JProgressBar progressBar) {
    Integer result = execute(() -> progressBar.getMaximum());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListDriver.java`
#### Snippet
```java
  @RunsInEDT
  private static void clearSelectionOf(final @Nonnull JList<?> list) {
    execute(() -> list.clearSelection());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarStringQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable String stringOf(final @Nonnull JProgressBar progressBar) {
    return execute(() -> progressBar.getString());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSpinnerDriver.java`
#### Snippet
```java
  @RunsInEDT
  private static void commit(final @Nonnull JSpinner spinner) {
    execute(() -> spinner.commitEdit());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/MenuElementComponentQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull Component componentIn(final @Nonnull MenuElement menuElement) {
    Component result = execute(() -> menuElement.getComponent());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxSelectedIndexQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int selectedIndexOf(final @Nonnull JComboBox<?> comboBox) {
    Integer result = execute(() -> comboBox.getSelectedIndex());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static int[] selectedRowsOf(final @Nonnull JTable table) {
    int[] result = execute(() -> table.getSelectedRows());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable Object messageOf(final @Nonnull JOptionPane optionPane) {
    return execute(() -> optionPane.getMessage());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneOptionsQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull Object[] optionsOf(final @Nonnull JOptionPane optionPane) {
    Object[] result = execute(() -> optionPane.getOptions());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentEditableQuery.java`
#### Snippet
```java
  @RunsInEDT
  static boolean isEditable(final @Nonnull JTextComponent textBox) {
    Boolean result = execute(() -> textBox.isEditable());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollPaneDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static JScrollBar horizontalScrollBar(final @Nonnull JScrollPane scrollPane) {
    JScrollBar result = execute(() -> scrollPane.getHorizontalScrollBar());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollPaneDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nonnull private static JScrollBar verticalScrollBar(final @Nonnull JScrollPane scrollPane) {
    JScrollBar result = execute(() -> scrollPane.getVerticalScrollBar());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JProgressBarIndeterminateQuery.java`
#### Snippet
```java
  @RunsInEDT
  static boolean isIndeterminate(final @Nonnull JProgressBar progressBar) {
    Boolean result = execute(() -> progressBar.isIndeterminate());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableHeaderQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable JTableHeader tableHeader(final @Nonnull JTable table) {
    return execute(() -> table.getTableHeader());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarValueQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int valueOf(final @Nonnull JScrollBar scrollBar) {
    Integer result = execute(() -> scrollBar.getValue());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowMoveToFrontTask.java`
#### Snippet
```java
  @RunsInEDT
  static void toFront(final @Nonnull Window w) {
    execute(() -> w.toFront());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JListSelectionIndicesQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nonnull int[] selectedIndices(final @Nonnull JList<?> list) {
    int[] result = execute(() -> list.getSelectedIndices());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxEditableQuery.java`
#### Snippet
```java
  @RunsInEDT
  static boolean isEditable(final @Nonnull JComboBox<?> comboBox) {
    Boolean result = execute(() -> comboBox.isEditable());
    return Preconditions.checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxItemCountQuery.java`
#### Snippet
```java
final class JComboBoxItemCountQuery {
  static int itemCountIn(final @Nonnull JComboBox<?> comboBox) {
    Integer result = execute(() -> comboBox.getItemCount());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameCloseTask.java`
#### Snippet
```java
  @RunsInEDT
  static void close(final @Nonnull JInternalFrame internalFrame) {
    execute(() -> internalFrame.doDefaultCloseAction());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableRowCountQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int rowCountOf(final @Nonnull JTable table) {
    Integer result = execute(() -> table.getRowCount());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameTitleQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable String titleOf(final @Nonnull JInternalFrame f) {
    return execute(() -> f.getTitle());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JLabelTextQuery.java`
#### Snippet
```java
  @RunsInEDT
  static @Nullable String textOf(final @Nonnull JLabel label) {
    return execute(() -> label.getText());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowDriver.java`
#### Snippet
```java
  @RunsInEDT
  private static void doMoveToFront(final @Nonnull Window w) {
    execute(() -> w.toFront());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/WindowDriver.java`
#### Snippet
```java
  @RunsInEDT
  private static void doMoveToBack(final @Nonnull Window w) {
    execute(() -> w.toBack());
  }
}
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeClearSelectionTask.java`
#### Snippet
```java
  @RunsInEDT
  static void clearSelectionOf(final @Nonnull JTree tree) {
    execute(() -> tree.clearSelection());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/MultipleSelectionTemplate.java`
#### Snippet
```java
  @RunsInEDT
  final void multiUnselect() {
    multiSelect(i -> unselectElement(i), false);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/MultipleSelectionTemplate.java`
#### Snippet
```java
  @RunsInEDT
  final void multiSelect() {
    multiSelect(i -> selectElement(i), true);
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
  @RunsInEDT
  @Nullable private static Component selectedComponent(final JTabbedPane tabbedPane) {
    return execute(() -> tabbedPane.getSelectedComponent());
  }

```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableColumnCountQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int columnCountOf(final @Nonnull JTable table) {
    Integer result = execute(() -> table.getColumnCount());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTreeEditableQuery.java`
#### Snippet
```java
  @RunsInEDT
  static boolean isEditable(final @Nonnull JTree tree) {
    Boolean result = execute(() -> tree.isEditable());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/JOptionPaneMessageTypeQuery.java`
#### Snippet
```java
  @RunsInEDT
  static int messageTypeOf(final @Nonnull JOptionPane optionPane) {
    Integer result = execute(() -> optionPane.getMessageType());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractButtonSelectedQuery.java`
#### Snippet
```java
  @RunsInEDT
  static boolean isSelected(final @Nonnull AbstractButton button) {
    Boolean result = execute(() -> button.isSelected());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @Nonnull
  public Color foregroundOf(final @Nonnull Component c) {
    Color result = execute(() -> c.getForeground());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @Nonnull
  public Color backgroundOf(final @Nonnull Component c) {
    Color result = execute(() -> c.getBackground());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/driver/ComponentDriver.java`
#### Snippet
```java
  @Nonnull
  public Font fontOf(final @Nonnull Component c) {
    Font result = execute(() -> c.getFont());
    return checkNotNull(result);
  }
```

### Convert2MethodRef
Lambda can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/launcher/AppletLauncher.java`
#### Snippet
```java
  @Nonnull private static AppletLauncher instantiate(final @Nonnull Class<?> appletType) {
    try {
      Object applet = execute(() -> appletType.newInstance());
      return launcherFor(checkNotNull((Applet) applet));
    } catch (Exception e) {
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMapping.java`
#### Snippet
```java
  public String toString() {
    String format = "%s[character='%s', keyStroke=%s]";
    return String.format(format, getClass().getSimpleName(), String.valueOf(character), keyStroke.toString());
  }
}
```

## RuleId[id=AbstractMethodCallInConstructor]
### AbstractMethodCallInConstructor
Call to 'abstract' method `createDriver()` during object construction
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
    this.robot = checkNotNull(robot);
    this.target = checkNotNull(target);
    replaceDriverWith(createDriver(robot));
  }

```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `assertj-swing/src/main/java/org/assertj/swing/awt/AWT.java`
#### Snippet
```java
        return insets;
      }
    } catch (Exception e) {
    }
    return new Insets(0, 0, 0, 0);
```

### CatchMayIgnoreException
Empty `catch` block
in `assertj-swing/src/main/java/org/assertj/swing/input/DragAwareEventNormalizer.java`
#### Snippet
```java
    try {
      dragAwareEventQueue.pop();
    } catch (EmptyStackException e) {
    }
    dragAwareEventQueue = null;
```

### CatchMayIgnoreException
Empty `catch` block
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
        }
        return (currentTimeMillis() - start) >= settings.idleTimeout();
      } catch (InterruptedException e) {
      }
      return false;
```

### CatchMayIgnoreException
Empty `catch` block
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTabbedPaneDriver.java`
#### Snippet
```java
        try {
          point = location.pointAt(tabbedPane, index);
        } catch (LocationUnavailableException e) {
        }
        return Pair.of(index, point);
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowStatus.java`
#### Snippet
```java
    try {
      r = robotFactory.newRobotInLeftScreen();
    } catch (AWTException ignored) {
      logger.log(WARNING, "Error ocurred when creating a new Robot", ignored);
    }
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowStatus.java`
#### Snippet
```java
    try {
      checkSafelyIfReady(w);
    } catch (Exception ignored) {
      // TODO We are getting InterruptedException in Xwnc
      // http://groups.google.com/group/easytesting/browse_frm/thread/116cc070ab7b22e6
```

### CatchMayIgnoreException
'catch' parameter named `ignored` is used
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
    try {
      writer.writeAsPng(image, realPath);
    } catch (Exception ignored) {
      logger.log(SEVERE, ignored.getMessage());
    }
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentPrinter.java`
#### Snippet
```java
   * @return the component hierarchy used by this printer.
   */
  protected final @Nonnull ComponentHierarchy hierarchy() {
    return hierarchy;
  }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentPrinter.java`
#### Snippet
```java
   * @param hierarchy the component hierarchy to use.
   */
  protected BasicComponentPrinter(@Nonnull ComponentHierarchy hierarchy) {
    this.hierarchy = hierarchy;
  }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java
   * @param settings the configuration settings to use. It can be {@code null}.
   */
  protected BasicComponentFinder(@Nonnull ComponentHierarchy hierarchy, @Nullable Settings settings) {
    this.hierarchy = hierarchy;
    this.settings = settings;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java
   * @param hierarchy the component hierarchy to use.
   */
  protected BasicComponentFinder(@Nonnull ComponentHierarchy hierarchy) {
    this(hierarchy, null);
  }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java
   *         finder does not have configuration settings.
   */
  protected final boolean requireShowingFromSettingsOr(boolean defaultValue) {
    if (settings == null) {
      return defaultValue;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-swing/src/main/java/org/assertj/swing/lock/ScreenLock.java`
#### Snippet
```java
      }
      if (owner != currentOwner) {
        throw new ScreenLockException(String.format("%s is not the lock owner", currentOwner.toString()));
      }
      acquired = false;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @Nonnull private static ActionFailedException failColumnIndexNotFound(@Nonnull Object columnId) {
    throw actionFailure(String.format("Unable to find a column with id '%s'", columnId.toString()));
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java
    StringBuilder message = new StringBuilder();
    String format = "Found more than one component using matcher %s. %n%nFound:";
    message.append(String.format(format, m.toString()));
    appendComponents(message, found);
    if (!found.isEmpty()) {
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-swing/src/main/java/org/assertj/swing/driver/Actions.java`
#### Snippet
```java
      return (String) quote(key);
    }
    return String.format("%s(%s)", key.toString(), key.getClass().getName());
  }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-swing/src/main/java/org/assertj/swing/format/Formatting.java`
#### Snippet
```java
    if (previous != null) {
      String format = "Replaced formatter %s with %s for type %s";
      logger.info(String.format(format, previous.toString(), formatter.toString(), key.getName()));
    }
  }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `assertj-swing/src/main/java/org/assertj/swing/format/Formatting.java`
#### Snippet
```java
    if (previous != null) {
      String format = "Replaced formatter %s with %s for type %s";
      logger.info(String.format(format, previous.toString(), formatter.toString(), key.getName()));
    }
  }
```

## RuleId[id=PublicFieldAccessedInSynchronizedContext]
### PublicFieldAccessedInSynchronizedContext
Non-private field `WINDOW_READY_DELAY` accessed in synchronized context
in `assertj-swing/src/main/java/org/assertj/swing/monitor/Windows.java`
#### Snippet
```java
        }
      };
      windowReadyTimer.schedule(new ProtectingTimerTask(task), WINDOW_READY_DELAY);
      pending.put(w, task);
    }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
  public void click(@Nonnull JTable table, @Nonnull TableCell cell, @Nonnull MouseButton mouseButton,
                    @Nonnegative int times) {
    if (times <= 0) {
      throw new IllegalArgumentException("The number of times to click a cell should be greater than zero");
    }
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/StandardOutputStreams.java`
#### Snippet
```java

  boolean isStandardOutOrErr(OutputStream out) {
    return out == System.out || out == System.err;
  }

```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/StandardOutputStreams.java`
#### Snippet
```java

  boolean isStandardOutOrErr(OutputStream out) {
    return out == System.out || out == System.err;
  }

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageDecoder.java`
#### Snippet
```java
  BufferedImage decodeBase64(String encoded) throws IOException {
    ByteArrayInputStream in = null;
    byte[] toDecode = encoded.getBytes(UTF_8);
    in = new ByteArrayInputStream(Base64.decodeBase64(toDecode));
    return ImageIO.read(in);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageEncoder.java`
#### Snippet
```java
      ImageIO.write(image, PNG, out);
      byte[] encoded = Base64.encodeBase64(out.toByteArray());
      return new String(encoded, UTF_8);
    }
  }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'parent == null' covered by subsequent condition '!(parent instanceof JComponent)'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java
    Pair<Point, Container> pointAndParent = pointAndParentForScrolling((JTextField) textBox);
    Container parent = pointAndParent.second;
    if (parent == null || parent instanceof CellRendererPane || !(parent instanceof JComponent)) {
      return;
    }
```

### ConditionCoveredByFurtherCondition
Condition 'parent instanceof CellRendererPane' covered by subsequent condition '!(parent instanceof JComponent)'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTextComponentDriver.java`
#### Snippet
```java
    Pair<Point, Container> pointAndParent = pointAndParentForScrolling((JTextField) textBox);
    Container parent = pointAndParent.second;
    if (parent == null || parent instanceof CellRendererPane || !(parent instanceof JComponent)) {
      return;
    }
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
    if (isNullOrEmpty(path))
      return EMPTY_STRING;
    String realPath = path.replace("/", separator);
    BufferedImage image = decodeBase64(encoded, decoder);
    try {
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `java.awt.event` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/core/EmergencyAbortListener.java`
#### Snippet
```java
   *
   * @param event the event to inspect.
   * @see java.awt.event.AWTEventListener#eventDispatched(java.awt.AWTEvent)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/core/EmergencyAbortListener.java`
#### Snippet
```java
   *
   * @param event the event to inspect.
   * @see java.awt.event.AWTEventListener#eventDispatched(java.awt.AWTEvent)
   */
  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.exception` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/data/TableCellByColumnId.java`
#### Snippet
```java
   * @param cellReader knows how to read the contents of a cell in a {@code JTable}.
   * @return the cell found, if any.
   * @throws org.assertj.swing.exception.ActionFailedException if a matching cell could not be found.
   */
  @RunsInEDT
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.core` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/finder/JOptionPaneFinder.java`
#### Snippet
```java
 *
 * <p>
 * Where {@code robot} is an instance of {@link org.assertj.swing.core.Robot}.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.core` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/finder/JFileChooserFinder.java`
#### Snippet
```java
 *
 * <p>
 * Where {@code robot} is an instance of {@link org.assertj.swing.core.Robot}.
 * </p>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util.concurrent` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/finder/JFileChooserFinder.java`
#### Snippet
```java
 *
 * <pre>
 * JFileChooserFixture fileChooser = JFileChooserFinder.findFileChooser().withTimeout(10, {@link java.util.concurrent.TimeUnit#SECONDS SECONDS}).using(robot);
 * </pre>
 *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.fixture` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JToggleButtonFixture.java`
#### Snippet
```java

  /**
   * Creates a new {@link org.assertj.swing.fixture.JToggleButtonFixture}.
   * 
   * @param robot performs simulation of user events on a {@code JToggleButton}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.cell` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JTableFixture.java`
#### Snippet
```java
  /**
   * Returns the {@code String} representation of the selected cell in this fixture's {@code JTable}, using this
   * fixture's {@link org.assertj.swing.cell.JTableCellReader}. Returns {@code null} if one can not be obtained or if
   * the {@code JTable} does not have any selected cell.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `java.applet` is unnecessary, and can be replaced with an import
in `assertj-swing/src/main/java/org/assertj/swing/monitor/Context.java`
#### Snippet
```java
      Component parent = c;
      // Components above the applet in the hierarchy may or may not share the same context with the applet itself.
      while (!(parent instanceof java.applet.Applet) && parent.getParent() != null) {
        parent = parent.getParent();
      }
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/monitor/Context.java`
#### Snippet
```java
  /**
   * Return the event queue corresponding to the given AWT or Swing {@code Component}. In most cases, this is the same
   * as {@link java.awt.Toolkit#getSystemEventQueue()}, but in the case of applets will bypass the {@code AppContext}
   * and provide the real event queue.
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.launcher` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/launcher/AppletLauncher.java`
#### Snippet
```java
 * {@link AppletViewer} viewer = AppletLauncher.{@link #launcherFor(Applet) applet}(new MyApplet())
 *                                     .{@link #withParameters(Map) withParameters}(
 *                                         {@link AppletParameter#name(String) name}(&quot;bgcolor&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;blue&quot;),
 *                                         {@link AppletParameter#name(String) name}(&quot;color&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;red&quot;),
 *                                         {@link AppletParameter#name(String) name}(&quot;pause&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;200&quot;)
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.launcher` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/launcher/AppletLauncher.java`
#### Snippet
```java
 *                                     .{@link #withParameters(Map) withParameters}(
 *                                         {@link AppletParameter#name(String) name}(&quot;bgcolor&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;blue&quot;),
 *                                         {@link AppletParameter#name(String) name}(&quot;color&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;red&quot;),
 *                                         {@link AppletParameter#name(String) name}(&quot;pause&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;200&quot;)
 *                                      )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.launcher` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/launcher/AppletLauncher.java`
#### Snippet
```java
 *                                         {@link AppletParameter#name(String) name}(&quot;bgcolor&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;blue&quot;),
 *                                         {@link AppletParameter#name(String) name}(&quot;color&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;red&quot;),
 *                                         {@link AppletParameter#name(String) name}(&quot;pause&quot;).{@link org.assertj.swing.launcher.AppletParameter.AppletParameterBuilder#value(String) value}(&quot;200&quot;)
 *                                      )
 *                                     .{@link #start() start}();
```

### UnnecessaryFullyQualifiedName
Qualifier `java.awt` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/hierarchy/NewHierarchy.java`
#### Snippet
```java
 * Implicitly auto-filters {@code Window}s which are disposed (i.e. generates a {@code WindowEvent#WINDOW_CLOSED}
 * event), but also implicitly un-filters them if they should be shown again. Any {@code Window} explicitly disposed by
 * the calling {@link ComponentHierarchy#dispose(java.awt.Window)} will be ignored permanently.
 * </p>
 * 
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.core` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if a matching component could not be found.
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   * @see org.assertj.swing.core.ComponentFinder#findByName(String, Class)
   */
  public AbstractContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String name,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.assertj.swing.core` is unnecessary and can be removed
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if a matching component could not be found.
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   * @see org.assertj.swing.core.ComponentFinder#findByType(Class)
   */
  public AbstractContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull Class<? extends C> type) {
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `assertj-swing/src/main/java/org/assertj/swing/core/SimpleFallbackExceptionHandler.java`
#### Snippet
```java
   */
  public void handle(@Nonnull Throwable t) {
    t.printStackTrace();
  }
}
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    DEFAULT_TIMEOUT_VISIBILITY = get(p, "timeout.visibility", 30000);
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `assertj-swing/src/main/java/org/assertj/swing/timing/Pause.java`
#### Snippet
```java
                                                new StandardRepresentation().toStringOf(value)));
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      if (e.getCause() instanceof RuntimeException) {
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `assertj-swing/src/main/java/org/assertj/swing/timing/Pause.java`
#### Snippet
```java
        throw (RuntimeException) e.getCause();
      }
      e.printStackTrace();
    }
  }
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `AbstractComponentMatcher()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/core/AbstractComponentMatcher.java`
#### Snippet
```java
   * {@code Component} to match to be showing.
   */
  public AbstractComponentMatcher() {
    this(false);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractComponentMatcher()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/core/AbstractComponentMatcher.java`
#### Snippet
```java
   * @param requireShowing indicates whether the AWT or Swing {@code Component} to match should be showing or not.
   */
  public AbstractComponentMatcher(boolean requireShowing) {
    requireShowing(requireShowing);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `GenericTypeMatcher()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/core/GenericTypeMatcher.java`
#### Snippet
```java
   * @throws NullPointerException if the given type is {@code null}.
   */
  public GenericTypeMatcher(@Nonnull Class<T> supportedType, boolean requireShowing) {
    super(requireShowing);
    this.supportedType = checkNotNull(supportedType);
```

### NonProtectedConstructorInAbstractClass
Constructor `GenericTypeMatcher()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/core/GenericTypeMatcher.java`
#### Snippet
```java
   * @throws NullPointerException if the given type is {@code null}.
   */
  public GenericTypeMatcher(@Nonnull Class<T> supportedType) {
    this(supportedType, false);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `EdtSafeCondition()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/core/EdtSafeCondition.java`
#### Snippet
```java
   * @param description describes this condition.
   */
  public EdtSafeCondition(@Nullable Description description) {
    super(description);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `EdtSafeCondition()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/core/EdtSafeCondition.java`
#### Snippet
```java
   * @param description describes this condition.
   */
  public EdtSafeCondition(@Nonnull String description) {
    super(description);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJTableCellWriter()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/driver/AbstractJTableCellWriter.java`
#### Snippet
```java
  private static final long EDITOR_LOOKUP_TIMEOUT = 5000;

  public AbstractJTableCellWriter(@Nonnull Robot robot) {
    this.robot = robot;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Condition()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/timing/Condition.java`
#### Snippet
```java
   * @param description describes this condition.
   */
  public Condition(@Nullable Description description) {
    this.description = description;
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `Condition()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/timing/Condition.java`
#### Snippet
```java
   * @param description describes this condition.
   */
  public Condition(@Nonnull String description) {
    this(new TextDescription(description));
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTwoStateButtonFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   *           found. Or if more than one matching {@code AbstractButton} is found.
   */
  public AbstractTwoStateButtonFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String buttonName,
                                       @Nonnull Class<? extends T> type) {
    super(selfType, robot, buttonName, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractTwoStateButtonFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractTwoStateButtonFixture.java`
#### Snippet
```java
   * @throws NullPointerException if {@code target} is {@code null}.
   */
  public AbstractTwoStateButtonFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull T target) {
    super(selfType, robot, target);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractButtonFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractButtonFixture.java`
#### Snippet
```java
   * @throws NullPointerException if {@code target} is {@code null}.
   */
  public AbstractButtonFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull T target) {
    super(selfType, robot, target);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractButtonFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractButtonFixture.java`
#### Snippet
```java
   *           found. Or if more than one matching {@code AbstractButton} is found.
   */
  public AbstractButtonFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String buttonName,
                               @Nonnull Class<? extends T> type) {
    super(selfType, robot, buttonName, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `ContainerDriver()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/driver/ContainerDriver.java`
#### Snippet
```java
   * @param robot the robot to use to simulate user input.
   */
  public ContainerDriver(@Nonnull Robot robot) {
    super(robot);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJPopupMenuInvokerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJPopupMenuInvokerFixture.java`
#### Snippet
```java
   * @throws NullPointerException if {@code target} is {@code null}.
   */
  public AbstractJPopupMenuInvokerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull T target) {
    super(selfType, robot, target);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJPopupMenuInvokerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJPopupMenuInvokerFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  public AbstractJPopupMenuInvokerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot,
                                          @Nonnull Class<? extends T> type) {
    super(selfType, robot, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJPopupMenuInvokerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJPopupMenuInvokerFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  public AbstractJPopupMenuInvokerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String name,
                                          @Nonnull Class<? extends T> type) {
    super(selfType, robot, name, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSwingContainerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   * @see org.assertj.swing.core.ComponentFinder#findByType(Class)
   */
  public AbstractSwingContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot,
                                       @Nonnull Class<? extends C> type) {
    super(selfType, robot, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSwingContainerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   * @throws NullPointerException if {@code target} is {@code null}.
   */
  public AbstractSwingContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull C target) {
    super(selfType, robot, target);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractSwingContainerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractSwingContainerFixture.java`
#### Snippet
```java
   * @see org.assertj.swing.core.ComponentFinder#findByName(String, Class)
   */
  public AbstractSwingContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String name,
                                       @Nonnull Class<? extends C> type) {
    super(selfType, robot, name, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJComponentFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJComponentFixture.java`
#### Snippet
```java
   *           than one matching component is found.
   */
  public AbstractJComponentFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String name,
                                   @Nonnull Class<? extends T> type) {
    super(selfType, robot, name, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJComponentFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJComponentFixture.java`
#### Snippet
```java
   * @throws NullPointerException if {@code target} is {@code null}.
   */
  public AbstractJComponentFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull T target) {
    super(selfType, robot, target);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractJComponentFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractJComponentFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  public AbstractJComponentFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull Class<? extends T> type) {
    super(selfType, robot, type);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AssertJSwingTestCaseTemplate()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/testing/AssertJSwingTestCaseTemplate.java`
#### Snippet
```java
  private Robot robot;

  public AssertJSwingTestCaseTemplate() {
    robot = null; // Just to satisfy FindBugs
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractComponentFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  public AbstractComponentFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String name,
                                  @Nonnull Class<? extends C> type) {
    this(selfType, robot, findTarget(robot, name, type));
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractComponentFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws org.assertj.swing.exception.ComponentLookupException if more than one matching component is found.
   */
  public AbstractComponentFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull Class<? extends C> type) {
    this(selfType, robot, findTarget(robot, type));
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractComponentFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractComponentFixture.java`
#### Snippet
```java
   * @throws NullPointerException if {@code target} is {@code null}.
   */
  public AbstractComponentFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull C target) {
    myself = checkNotNull(selfType).cast(this);
    this.robot = checkNotNull(robot);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractContainerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @throws NullPointerException if {@code target} is {@code null}.
   */
  public AbstractContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull C target) {
    super(selfType, robot, target);
    menuItemFinder = new JMenuItemFinder(robot, target());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractContainerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @see org.assertj.swing.core.ComponentFinder#findByName(String, Class)
   */
  public AbstractContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String name,
                                  @Nonnull Class<? extends C> type) {
    super(selfType, robot, name, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractContainerFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractContainerFixture.java`
#### Snippet
```java
   * @see org.assertj.swing.core.ComponentFinder#findByType(Class)
   */
  public AbstractContainerFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull Class<? extends C> type) {
    super(selfType, robot, type);
    menuItemFinder = new JMenuItemFinder(robot, target());
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWindowFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   * @throws NullPointerException if the given target {@code Window} is {@code null}.
   */
  public AbstractWindowFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull C target) {
    super(selfType, robot, target);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWindowFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   *           is found.
   */
  public AbstractWindowFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nonnull Class<? extends C> type) {
    super(selfType, robot, type);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWindowFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   * @see org.assertj.swing.core.BasicRobot#robotWithCurrentAwtHierarchy()
   */
  public AbstractWindowFixture(@Nonnull Class<S> selfType, @Nonnull Class<? extends C> type) {
    this(selfType, robotWithCurrentAwtHierarchy(), type);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWindowFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   * @throws NullPointerException if the given target {@code Window} is {@code null}.
   */
  public AbstractWindowFixture(@Nonnull Class<S> selfType, @Nonnull C target) {
    this(selfType, robotWithCurrentAwtHierarchy(), target);
  }
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWindowFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   *           is found.
   */
  public AbstractWindowFixture(@Nonnull Class<S> selfType, @Nonnull Robot robot, @Nullable String name,
                               @Nonnull Class<? extends C> type) {
    super(selfType, robot, name, type);
```

### NonProtectedConstructorInAbstractClass
Constructor `AbstractWindowFixture()` of an abstract class should not be declared 'public'
in `assertj-swing/src/main/java/org/assertj/swing/fixture/AbstractWindowFixture.java`
#### Snippet
```java
   * @see org.assertj.swing.core.BasicRobot#robotWithCurrentAwtHierarchy()
   */
  public AbstractWindowFixture(@Nonnull Class<S> selfType, @Nullable String name, @Nonnull Class<? extends C> type) {
    this(selfType, robotWithCurrentAwtHierarchy(), name, type);
  }
```

## RuleId[id=Anonymous2MethodRef]
### Anonymous2MethodRef
Anonymous new Runnable() can be replaced with method reference
in `assertj-swing/src/main/java/org/assertj/swing/listener/EventDispatchThreadedEventListener.java`
#### Snippet
```java
  private final Object lock = new Object();

  private final Runnable processDeferredEventsTask = new Runnable() {
    @Override
    public void run() {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  @Override
  public void showWindow(@Nonnull final Window w, @Nullable final Dimension size, final boolean pack) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  private volatile boolean active;

  private static final Runnable EMPTY_RUNNABLE = new Runnable() {
    @Override
    public void run() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `assertj-swing/src/main/java/org/assertj/swing/applet/AppletViewer.java`
#### Snippet
```java
      return;
    }
    invokeLater(new Runnable() {
      @Override
      public void run() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `assertj-swing/src/main/java/org/assertj/swing/timing/Pause.java`
#### Snippet
```java
    checkNotNull(condition);
    try {
      Callable<Object> task = new Callable<Object>() {
        @Override
        public Object call() {
```

### Convert2Lambda
Anonymous new Callable() can be replaced with lambda
in `assertj-swing/src/main/java/org/assertj/swing/timing/Pause.java`
#### Snippet
```java
    }
    try {
      Callable<Object> task = new Callable<Object>() {
        @Override
        public Object call() {
```

### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `assertj-swing/src/main/java/org/assertj/swing/listener/EventDispatchThreadedEventListener.java`
#### Snippet
```java
  private final Object lock = new Object();

  private final Runnable processDeferredEventsTask = new Runnable() {
    @Override
    public void run() {
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `lock`
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  private boolean postInvocationEvent(@Nonnull EventQueue eventQueue, long timeout) {
    Object lock = new RobotIdleLock();
    synchronized (lock) {
      InvocationEvent event = new InvocationEvent(toolkit, EMPTY_RUNNABLE, lock, true);
      eventQueue.postEvent(event);
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `assertj-swing/src/main/java/org/assertj/swing/image/ScreenshotTaker.java`
#### Snippet
```java
      Component focusOwner = focusOwner();
      if (!(focusOwner instanceof JTextComponent)) {
        return null;
      }
      JTextComponent textComponent = (JTextComponent) focusOwner;
```

### ReturnNull
Return of `null`
in `assertj-swing/src/main/java/org/assertj/swing/image/ScreenshotTaker.java`
#### Snippet
```java
      Caret caret = textComponent.getCaret();
      if (caret == null || !caret.isVisible()) {
        return null;
      }
      caret.setVisible(false);
```

### ReturnNull
Return of `null`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JInternalFrameDriver.java`
#### Snippet
```java
      }
      if (internalFrame.isClosed()) {
        return null;
      }
      return closeButtonLocation(internalFrame);
```

### ReturnNull
Return of `null`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java
    return execute(() -> {
      if (table.getSelectedRowCount() == 0) {
        return null;
      }
      return cellReader.valueAt(table, table.getSelectedRow(), table.getSelectedColumn());
```

### ReturnNull
Return of `null`
in `assertj-swing/src/main/java/org/assertj/swing/driver/JComboBoxDriver.java`
#### Snippet
```java
    return execute(() -> {
      if (!comboBox.isEditable()) {
        return null;
      }
      return editorComponent(comboBox);
```

### ReturnNull
Return of `null`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
    } catch (Exception e) {
      logger.log(SEVERE, "Unable to encode image", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
    } catch (Exception e) {
      logger.log(SEVERE, "Unable to encode image", e);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/Tests.java`
#### Snippet
```java
      return type.getMethod(name, new Class[0]);
    } catch (Exception e) {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/xml/XmlNode.java`
#### Snippet
```java
  private static XmlNode xmlNodeFrom(Node n) {
    if (!(n instanceof Element))
      return null;
    return new XmlNode((Element) n);
  }
```

### ReturnNull
Return of `null`
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/listener/ScreenshotOnFailureListener.java`
#### Snippet
```java
    } catch (Exception e) {
      logger.log(SEVERE, e.getMessage(), e);
      return null;
    }
    return imageName;
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `parent` is redundant
in `assertj-swing/src/main/java/org/assertj/swing/core/Scrolling.java`
#### Snippet
```java
    // we go up to the top of the hierarchy
    while (root != null) {
      Container parent = root.getParent();
      // the new candidate root becomes the parent of the previous one
      root = parent;
```

### UnnecessaryLocalVariable
Local variable `offset` is redundant
in `assertj-swing/src/main/java/org/assertj/swing/driver/JScrollBarLocation.java`
#### Snippet
```java
  @Nonnull public Point blockLocationToScrollUp(@Nonnull JScrollBar scrollBar) {
    Point p = unitLocationToScrollUp(scrollBar);
    int offset = BLOCK_OFFSET;
    return blockLocation(scrollBar, p, offset);
  }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `assertj-swing/src/main/java/org/assertj/swing/hierarchy/ExistingHierarchy.java`
#### Snippet
```java
    List<Container> roots = newArrayList();
    for (Window w : windowMonitor.rootWindows()) {
      roots.add(w);
    }
    return roots;
```

