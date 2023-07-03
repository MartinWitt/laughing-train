# assertj-swing 
 
# Bad smells
I found 229 bad smells with 27 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| DataFlowIssue | 47 | false |
| JavadocDeclaration | 33 | false |
| FieldMayBeFinal | 21 | false |
| JavadocReference | 12 | false |
| DuplicatedCode | 12 | false |
| NullableProblems | 12 | false |
| CatchMayIgnoreException | 7 | false |
| ConstantValue | 7 | false |
| ToArrayCallWithZeroLengthArrayArgument | 6 | true |
| UnnecessaryToStringCall | 6 | true |
| FinalStaticMethod | 6 | false |
| UnnecessaryModifier | 5 | true |
| ProtectedMemberInFinalClass | 5 | true |
| SuspiciousMethodCalls | 5 | false |
| UnusedAssignment | 5 | false |
| UnnecessarySemicolon | 4 | false |
| FinalMethodInFinalClass | 4 | false |
| UNUSED_IMPORT | 4 | false |
| UNCHECKED_WARNING | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| ManualArrayCopy | 2 | false |
| RedundantArrayCreation | 2 | true |
| FieldCanBeLocal | 2 | false |
| CharsetObjectCanBeUsed | 2 | false |
| ConditionCoveredByFurtherCondition | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| UnnecessaryCallToStringValueOf | 1 | false |
| Deprecation | 1 | false |
| RedundantTypeArguments | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| TrivialIf | 1 | false |
| IgnoreResultOfCall | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| MalformedFormatString | 1 | false |
| AutoCloseableResource | 1 | false |
| IntegerMultiplicationImplicitCastToLong | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'getListCellRendererComponent(JList, E, int, boolean, boolean)' as a member of raw type 'javax.swing.ListCellRenderer'
in `assertj-swing/src/main/java/org/assertj/swing/driver/BasicJComboBoxCellReader.java`
#### Snippet
```java
    Object item = comboBox.getItemAt(index);
    ListCellRenderer renderer = comboBox.getRenderer();
    return renderer.getListCellRendererComponent(REFERENCE_JLIST, item, index, true, true);
  }
}
```

### UNCHECKED_WARNING
Unchecked call to 'getListCellRendererComponent(JList, E, int, boolean, boolean)' as a member of raw type 'javax.swing.ListCellRenderer'
in `assertj-swing/src/main/java/org/assertj/swing/driver/BasicJListCellReader.java`
#### Snippet
```java
    boolean isSelected = lsm.isSelectedIndex(index);
    boolean cellHasFocus = list.hasFocus() && lsm.getLeadSelectionIndex() == index;
    Component c = list.getCellRenderer().getListCellRendererComponent(list, element, index, isSelected, cellHasFocus);
    String value = (c != null) ? rendererReader.valueFrom(c) : null;
    if (value != null) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `ITestResult`
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/listener/AbstractTestListener.java`
#### Snippet
```java

  /**
   * Invoked each time before a test will be invoked. The <code>{@link ITestResult}</code> is only partially filled with
   * the references to class, method, start millis and status.
   * 
```

### JavadocReference
Cannot resolve symbol `org.apache.tools.ant.BuildException`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/XmlJUnitResultFormatter.java`
#### Snippet
```java
   *
   * @param suite the test suite.
   * @throws org.apache.tools.ant.BuildException on error.
   */
  @Override
```

### JavadocReference
Cannot resolve symbol `BuildException`
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ReportTransformer.java`
#### Snippet
```java
   * Performs the XSLT transformation to generate the HTML report.
   *
   * @throws BuildException thrown if something goes wrong with the transformation.
   */
  @Override
```

### JavadocReference
Cannot resolve symbol `replaceCellReader(JListCellReader)`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   * @throws IndexOutOfBoundsException if this item's index is negative or greater than the index of the last item in
   *           the {@code JList}.
   * @see JListFixture#replaceCellReader(JListCellReader)
   */
  @Override
```

### JavadocReference
Cannot resolve symbol `JListCellReader`
in `assertj-swing/src/main/java/org/assertj/swing/fixture/JListItemFixture.java`
#### Snippet
```java
   * @throws IndexOutOfBoundsException if this item's index is negative or greater than the index of the last item in
   *           the {@code JList}.
   * @see JListFixture#replaceCellReader(JListCellReader)
   */
  @Override
```

### JavadocReference
Cannot resolve symbol `org.fest.reflect.exception.ReflectionError`
in `assertj-swing/src/main/java/org/assertj/swing/launcher/ApplicationLauncher.java`
#### Snippet
```java
   * Starts the application.
   *
   * @throws org.fest.reflect.exception.ReflectionError if the "main" method cannot be invoked.
   */
  public void start() {
```

### JavadocReference
Cannot resolve symbol `assertThat(int)`
in `assertj-swing/src/main/java/org/assertj/swing/assertions/Assertions.java`
#### Snippet
```java
 * <pre>
 * int removed = employees.removeFired();
 * {@link Assertions#assertThat(int) assertThat}(removed).{@link org.assertj.core.api.IntegerAssert#isZero isZero}();
 *
 * List&lt;Employee&gt; newEmployees = employees.hired(TODAY);
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.IntegerAssert`
in `assertj-swing/src/main/java/org/assertj/swing/assertions/Assertions.java`
#### Snippet
```java
 * <pre>
 * int removed = employees.removeFired();
 * {@link Assertions#assertThat(int) assertThat}(removed).{@link org.assertj.core.api.IntegerAssert#isZero isZero}();
 *
 * List&lt;Employee&gt; newEmployees = employees.hired(TODAY);
```

### JavadocReference
Cannot resolve symbol `isZero`
in `assertj-swing/src/main/java/org/assertj/swing/assertions/Assertions.java`
#### Snippet
```java
 * <pre>
 * int removed = employees.removeFired();
 * {@link Assertions#assertThat(int) assertThat}(removed).{@link org.assertj.core.api.IntegerAssert#isZero isZero}();
 *
 * List&lt;Employee&gt; newEmployees = employees.hired(TODAY);
```

### JavadocReference
Cannot resolve symbol `assertThat(Iterable)`
in `assertj-swing/src/main/java/org/assertj/swing/assertions/Assertions.java`
#### Snippet
```java
 *
 * List&lt;Employee&gt; newEmployees = employees.hired(TODAY);
 * {@link Assertions#assertThat(Iterable) assertThat}(newEmployees).{@link org.assertj.core.api.IterableAssert#hasSize(int) hasSize}(6);
 * </pre>
 */
```

### JavadocReference
Cannot resolve symbol `org.assertj.core.api.IterableAssert`
in `assertj-swing/src/main/java/org/assertj/swing/assertions/Assertions.java`
#### Snippet
```java
 *
 * List&lt;Employee&gt; newEmployees = employees.hired(TODAY);
 * {@link Assertions#assertThat(Iterable) assertThat}(newEmployees).{@link org.assertj.core.api.IterableAssert#hasSize(int) hasSize}(6);
 * </pre>
 */
```

### JavadocReference
Cannot resolve symbol `hasSize(int)`
in `assertj-swing/src/main/java/org/assertj/swing/assertions/Assertions.java`
#### Snippet
```java
 *
 * List&lt;Employee&gt; newEmployees = employees.hired(TODAY);
 * {@link Assertions#assertThat(Iterable) assertThat}(newEmployees).{@link org.assertj.core.api.IterableAssert#hasSize(int) hasSize}(6);
 * </pre>
 */
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
      protected JList<T> executeInEDT() {
        return new JList<T>();
      };
    });
    ;
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
    Pair<Boolean, Point> result = execute(new GuiQuery<Pair<Boolean, Point>>() {
      @Override
      @Nullable protected Pair<Boolean, Point> executeInEDT() throws Throwable {
        checkShowingOrIconified(internalFrame);
        if (!internalFrame.isIconifiable()) {
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

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=FinalMethodInFinalClass]
### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentPrinter.java`
#### Snippet
```java
   * @return the component hierarchy used by this printer.
   */
  protected final @Nonnull ComponentHierarchy hierarchy() {
    return hierarchy;
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicComponentFinder.java`
#### Snippet
```java
   *         finder does not have configuration settings.
   */
  protected final boolean requireShowingFromSettingsOr(boolean defaultValue) {
    if (settings == null) {
      return defaultValue;
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
   * @return the created {@code From}.
   */
  public static final @Nonnull From from(int value) {
    return new From(value);
  }
```

### FinalMethodInFinalClass
Method declared `final` in 'final' class
in `assertj-swing/src/main/java/org/assertj/swing/util/Range.java`
#### Snippet
```java
   * @return the created {@code To}.
   */
  public static final @Nonnull To to(int value) {
    return new To(value);
  }
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_de.java`
#### Snippet
```java
    mappings.add(mapping('4', VK_4, NO_MASK));
    mappings.add(mapping('$', VK_4, SHIFT_MASK));
    mappings.add(mapping('5', VK_5, NO_MASK));
    mappings.add(mapping('%', VK_5, SHIFT_MASK));
    mappings.add(mapping('6', VK_6, NO_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fi.java`
#### Snippet
```java
        mappings.add(mapping('$', VK_4, ALT_GRAPH_MASK));
        mappings.add(mapping('5', VK_5, NO_MASK));
        mappings.add(mapping('%', VK_5, SHIFT_MASK));
        mappings.add(mapping('6', VK_6, NO_MASK));
        mappings.add(mapping('&', VK_6, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_de.java`
#### Snippet
```java
    mappings.add(mapping('7', VK_7, NO_MASK));
    mappings.add(mapping('/', VK_7, SHIFT_MASK));
    mappings.add(mapping('{', VK_7, ALT_GRAPH_MASK));
    mappings.add(mapping('8', VK_8, NO_MASK));
    mappings.add(mapping('(', VK_8, SHIFT_MASK));
    mappings.add(mapping('[', VK_8, ALT_GRAPH_MASK));
    mappings.add(mapping('9', VK_9, NO_MASK));
    mappings.add(mapping(')', VK_9, SHIFT_MASK));
    mappings.add(mapping(']', VK_9, ALT_GRAPH_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_en.java`
#### Snippet
```java
    mappings.add(mapping('f', VK_F, NO_MASK));
    mappings.add(mapping('F', VK_F, SHIFT_MASK));
    mappings.add(mapping('g', VK_G, NO_MASK));
    mappings.add(mapping('G', VK_G, SHIFT_MASK));
    mappings.add(mapping('h', VK_H, NO_MASK));
    mappings.add(mapping('H', VK_H, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_de.java`
#### Snippet
```java
    mappings.add(mapping('F', VK_F, SHIFT_MASK));
    mappings.add(mapping('g', VK_G, NO_MASK));
    mappings.add(mapping('G', VK_G, SHIFT_MASK));
    mappings.add(mapping('h', VK_H, NO_MASK));
    mappings.add(mapping('H', VK_H, SHIFT_MASK));
    mappings.add(mapping('i', VK_I, NO_MASK));
    mappings.add(mapping('I', VK_I, SHIFT_MASK));
    mappings.add(mapping('j', VK_J, NO_MASK));
    mappings.add(mapping('J', VK_J, SHIFT_MASK));
    mappings.add(mapping('k', VK_K, NO_MASK));
    mappings.add(mapping('K', VK_K, SHIFT_MASK));
    mappings.add(mapping('l', VK_L, NO_MASK));
    mappings.add(mapping('L', VK_L, SHIFT_MASK));
    mappings.add(mapping('m', VK_M, NO_MASK));
    mappings.add(mapping('M', VK_M, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fi.java`
#### Snippet
```java
        mappings.add(mapping('j', VK_J, NO_MASK));
        mappings.add(mapping('J', VK_J, SHIFT_MASK));
        mappings.add(mapping('k', VK_K, NO_MASK));
        mappings.add(mapping('K', VK_K, SHIFT_MASK));
        mappings.add(mapping('l', VK_L, NO_MASK));
        mappings.add(mapping('L', VK_L, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_de.java`
#### Snippet
```java
    mappings.add(mapping('n', VK_N, NO_MASK));
    mappings.add(mapping('N', VK_N, SHIFT_MASK));
    mappings.add(mapping('o', VK_O, NO_MASK));
    mappings.add(mapping('O', VK_O, SHIFT_MASK));
    mappings.add(mapping('p', VK_P, NO_MASK));
    mappings.add(mapping('P', VK_P, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_de.java`
#### Snippet
```java
    mappings.add(mapping(' ', VK_SPACE, NO_MASK));
    mappings.add(mapping('t', VK_T, NO_MASK));
    mappings.add(mapping('T', VK_T, SHIFT_MASK));
    mappings.add(mapping('u', VK_U, NO_MASK));
    mappings.add(mapping('U', VK_U, SHIFT_MASK));
    mappings.add(mapping('v', VK_V, NO_MASK));
    mappings.add(mapping('V', VK_V, SHIFT_MASK));
    mappings.add(mapping('w', VK_W, NO_MASK));
    mappings.add(mapping('W', VK_W, SHIFT_MASK));
    mappings.add(mapping('x', VK_X, NO_MASK));
    mappings.add(mapping('X', VK_X, SHIFT_MASK));
    mappings.add(mapping('y', VK_Y, NO_MASK));
    mappings.add(mapping('Y', VK_Y, SHIFT_MASK));
    mappings.add(mapping('z', VK_Z, NO_MASK));
    mappings.add(mapping('Z', VK_Z, SHIFT_MASK));
    return mappings;
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fr.java`
#### Snippet
```java
    mappings.add(mapping('\b', VK_BACK_SPACE, NO_MASK));
    mappings.add(mapping('', VK_DELETE, NO_MASK));
    mappings.add(mapping('', VK_ESCAPE, NO_MASK));
    mappings.add(mapping('\n', VK_ENTER, NO_MASK));
    mappings.add(mapping('\r', VK_ENTER, NO_MASK));
    mappings.add(mapping('&', VK_1, NO_MASK));
    mappings.add(mapping('1', VK_1, SHIFT_MASK));
    mappings.add(mapping('�', VK_2, NO_MASK));
    mappings.add(mapping('2', VK_2, SHIFT_MASK));
    mappings.add(mapping('"', VK_3, NO_MASK));
    mappings.add(mapping('3', VK_3, SHIFT_MASK));
    mappings.add(mapping('\'', VK_4, NO_MASK));
    mappings.add(mapping('4', VK_4, SHIFT_MASK));
    mappings.add(mapping('(', VK_5, NO_MASK));
    mappings.add(mapping('5', VK_5, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_mac_fr_FR.java`
#### Snippet
```java
    mappings.add(mapping('', VK_ESCAPE, NO_MASK));
    mappings.add(mapping('\n', VK_ENTER, NO_MASK));
    mappings.add(mapping('\r', VK_ENTER, NO_MASK));
    mappings.add(mapping('&', VK_1, NO_MASK));
    mappings.add(mapping('1', VK_1, SHIFT_MASK));
    mappings.add(mapping('�', VK_2, NO_MASK));
    mappings.add(mapping('2', VK_2, SHIFT_MASK));
    mappings.add(mapping('"', VK_3, NO_MASK));
    mappings.add(mapping('3', VK_3, SHIFT_MASK));
    mappings.add(mapping('\'', VK_4, NO_MASK));
    mappings.add(mapping('4', VK_4, SHIFT_MASK));
    mappings.add(mapping('(', VK_5, NO_MASK));
    mappings.add(mapping('5', VK_5, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fr.java`
#### Snippet
```java
    mappings.add(mapping('8', VK_8, SHIFT_MASK));
    mappings.add(mapping('�', VK_9, NO_MASK));
    mappings.add(mapping('9', VK_9, SHIFT_MASK));
    mappings.add(mapping('�', VK_0, NO_MASK));
    mappings.add(mapping('0', VK_0, SHIFT_MASK));
```

### DuplicatedCode
Duplicated code
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProvider_fr.java`
#### Snippet
```java
mappings.add(mapping('a', VK_A, NO_MASK));
    mappings.add(mapping('A', VK_A, SHIFT_MASK));
    mappings.add(mapping('b', VK_B, NO_MASK));
    mappings.add(mapping('B', VK_B, SHIFT_MASK));
    mappings.add(mapping('c', VK_C, NO_MASK));
    mappings.add(mapping('C', VK_C, SHIFT_MASK));
    mappings.add(mapping('d', VK_D, NO_MASK));
    mappings.add(mapping('D', VK_D, SHIFT_MASK));
    mappings.add(mapping('e', VK_E, NO_MASK));
    mappings.add(mapping('E', VK_E, SHIFT_MASK));
    mappings.add(mapping('f', VK_F, NO_MASK));
    mappings.add(mapping('F', VK_F, SHIFT_MASK));
    mappings.add(mapping('g', VK_G, NO_MASK));
    mappings.add(mapping('G', VK_G, SHIFT_MASK));
    mappings.add(mapping('h', VK_H, NO_MASK));
    mappings.add(mapping('H', VK_H, SHIFT_MASK));
    mappings.add(mapping('i', VK_I, NO_MASK));
    mappings.add(mapping('I', VK_I, SHIFT_MASK));
    mappings.add(mapping('j', VK_J, NO_MASK));
    mappings.add(mapping('J', VK_J, SHIFT_MASK));
    mappings.add(mapping('k', VK_K, NO_MASK));
    mappings.add(mapping('K', VK_K, SHIFT_MASK));
    mappings.add(mapping('l', VK_L, NO_MASK));
    mappings.add(mapping('L', VK_L, SHIFT_MASK));
    mappings.add(mapping('m', VK_M, NO_MASK));
    mappings.add(mapping('M', VK_M, SHIFT_MASK));
    mappings.add(mapping('n', VK_N, NO_MASK));
    mappings.add(mapping('N', VK_N, SHIFT_MASK));
    mappings.add(mapping('o', VK_O, NO_MASK));
    mappings.add(mapping('O', VK_O, SHIFT_MASK));
    mappings.add(mapping('p', VK_P, NO_MASK));
    mappings.add(mapping('P', VK_P, SHIFT_MASK));
    mappings.add(mapping('q', VK_Q, NO_MASK));
    mappings.add(mapping('Q', VK_Q, SHIFT_MASK));
    mappings.add(mapping('r', VK_R, NO_MASK));
    mappings.add(mapping('R', VK_R, SHIFT_MASK));
    mappings.add(mapping('s', VK_S, NO_MASK));
    mappings.add(mapping('S', VK_S, SHIFT_MASK));
    mappings.add(mapping('t', VK_T, NO_MASK));
    mappings.add(mapping('T', VK_T, SHIFT_MASK));
    mappings.add(mapping('u', VK_U, NO_MASK));
    mappings.add(mapping('U', VK_U, SHIFT_MASK));
    mappings.add(mapping('v', VK_V, NO_MASK));
    mappings.add(mapping('V', VK_V, SHIFT_MASK));
    mappings.add(mapping('w', VK_W, NO_MASK));
    mappings.add(mapping('W', VK_W, SHIFT_MASK));
    mappings.add(mapping('x', VK_X, NO_MASK));
    mappings.add(mapping('X', VK_X, SHIFT_MASK));
    mappings.add(mapping('y', VK_Y, NO_MASK));
    mappings.add(mapping('Y', VK_Y, SHIFT_MASK));
    mappings.add(mapping('z', VK_Z, NO_MASK));
    mappings.add(mapping('Z', VK_Z, SHIFT_MASK));
    return mappings;
```

## RuleId[id=CatchMayIgnoreException]
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
      checkSafelyIfReady(w);
    } catch (Exception ignored) {
      // TODO We are getting InterruptedException in Xwnc
      // http://groups.google.com/group/easytesting/browse_frm/thread/116cc070ab7b22e6
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

## RuleId[id=Deprecation]
### Deprecation
'getSelectedValues()' is deprecated
in `assertj-swing/src/main/java/org/assertj/swing/format/JListFormatter.java`
#### Snippet
```java
    String format = "%s[name=%s, selectedValues=%s, contents=%s, selectionMode=%s, enabled=%b, visible=%b, showing=%b]";
    return String.format(format, getRealClassName(c), quote(list.getName()),
                         Arrays.format(list.getSelectedValues()), Arrays.format(contentsOf(list)),
                         SELECTION_MODES.get(list.getSelectionMode()), list.isEnabled(), list.isVisible(),
                         list.isShowing());
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
in `assertj-swing/src/main/java/org/assertj/swing/driver/JTableDriver.java`
#### Snippet
```java

  @Nonnull private static ActionFailedException failColumnIndexNotFound(@Nonnull Object columnId) {
    throw actionFailure(String.format("Unable to find a column with id '%s'", columnId.toString()));
  }

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

## RuleId[id=FinalStaticMethod]
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `assertj-swing/src/main/java/org/assertj/swing/driver/JAppletDriver.java`
#### Snippet
```java
  @Nonnull public Enumeration<Applet> getApplets() {
    Enumeration<Applet> applets = applet.getAppletContext().getApplets();
    return applets != null ? applets : enumeration(Collections.<Applet> emptyList());
  }
}
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `assertj-swing/src/main/java/org/assertj/swing/input/DisposalMonitor.java`
#### Snippet
```java
    Component c = e.getComponent();
    c.removeComponentListener(this); // we are already in EDT
    disposedWindows.remove(c);
  }
}
```

### SuspiciousMethodCalls
Suspicious call to 'Collection.contains()'
in `assertj-swing/src/main/java/org/assertj/swing/monitor/ContextMonitor.java`
#### Snippet
```java
    }
    if ((id >= WINDOW_FIRST && id <= WINDOW_LAST) || id == COMPONENT_SHOWN) {
      if ((!context.rootWindows().contains(component)) || windows.isClosed(component)) {
        recognizeAsOpenWindow(component);
      }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowEventQueueMapping.java`
#### Snippet
```java
    Map<Window, Boolean> windowMapping = queueMap.get(queue);
    if (windowMapping != null) {
      windowMapping.remove(component);
    }
  }
```

### SuspiciousMethodCalls
Suspicious call to 'Map.containsKey()'
in `assertj-swing/src/main/java/org/assertj/swing/monitor/Windows.java`
#### Snippet
```java
  boolean isClosed(@Nonnull Component c) {
    synchronized (lock) {
      return closed.containsKey(c);
    }
  }
```

### SuspiciousMethodCalls
'Collection' may not contain objects of type 'Component'
in `assertj-swing/src/main/java/org/assertj/swing/hierarchy/NewHierarchy.java`
#### Snippet
```java
  @Nonnull public Collection<Container> roots() {
    Collection<Container> roots = super.roots();
    roots.removeAll(filter.filtered());
    return roots;
  }
```

## RuleId[id=NullableProblems]
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
Not annotated parameter overrides @Nonnull parameter
in `assertj-swing/src/main/java/org/assertj/swing/driver/JMenuItemDriver.java`
#### Snippet
```java

  @Override
  public void click(Component c) {
    /*
     * Since our internal methods now all call click(Component) this is used to route the method calls to the correct
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
in `assertj-swing/src/main/java/org/assertj/swing/fixture/ComponentFixtureExtension.java`
#### Snippet
```java
   * @return the created {@code ComponentFixture}.
   */
  public abstract @Nonnull F createFixture(@Nonnull Robot robot, @Nonnull Container root);
}

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

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `assertj-swing/src/main/java/org/assertj/swing/edt/CheckThreadViolationRepaintManager.java`
#### Snippet
```java
 * @author Alexander Potochkin
 *
 *         https://swinghelper.dev.java.net/
 */
abstract class CheckThreadViolationRepaintManager extends RepaintManager {
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowMonitor.java`
#### Snippet
```java
public class WindowMonitor {
  private final Context context;
  private final ContextMonitor contextMonitor;
  private final Windows windows;
  private final WindowStatus windowStatus;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowMonitor.java`
#### Snippet
```java
  private final Windows windows;
  private final WindowStatus windowStatus;
  private final WindowAvailabilityMonitor windowAvailabilityMonitor;

  /**
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `assertj-swing/src/main/java/org/assertj/swing/core/InputModifiers.java`
#### Snippet
```java
      return false;
    }
    if (e.isShiftDown() != isShiftDown(modifiers)) {
      return false;
    }
```

## RuleId[id=IgnoreResultOfCall]
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

## RuleId[id=CharsetObjectCanBeUsed]
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

## RuleId[id=MalformedFormatString]
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

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'InputStream' used without 'try'-with-resources statement
in `assertj-swing/src/main/java/org/assertj/swing/applet/BasicAppletContext.java`
#### Snippet
```java
  public void setStream(@Nullable String key, @Nullable InputStream stream) {
    if (stream == null) {
      streamMap.remove(key);
      return;
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/Settings.java`
#### Snippet
```java
   * </p>
   *
   * @param allow new value for {@link #clickOnDisabledComponentsAllowed(boolean)}.
   */
  public void clickOnDisabledComponentsAllowed(boolean allow) {
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/Robot.java`
#### Snippet
```java
   * <p>
   * <strong>Note:</strong> The preferred method to use to clean up resources is {@link #cleanUp()}. Using
   * {@link #cleanUpWithoutDisposingWindows()} may leave many windows open after each test. Use it on very special
   * cases. Please read <a href="http://code.google.com/p/fest/issues/detail?id=138" target="_blank">bug 138</a> for
   * more details.
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JButtonMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JButtonMatcher m = {@link #withText(Pattern) withText}(Pattern.compile("O.*"));
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JButtonMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JButtonMatcher m = {@link #withText(Pattern) withText}(Pattern.compile("O.*")).{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JButtonMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JButtonMatcher m = {@link #withText(String) withText}("OK");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JButtonMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JButtonMatcher m = {@link #withText(String) withText}("OK").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JButtonMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JButtonMatcher m = {@link #withName(String) withName}("ok").{@link #andText(String) andText}("OK");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JButtonMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JButtonMatcher m = {@link #withName(String) withName}("ok").{@link #andText(String) andText}("OK").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JLabelMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JLabelMatcher m = {@link #withText(Pattern) withText}(Pattern.compile("F.*");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JLabelMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JLabelMatcher m = {@link #withText(Pattern) withText}(Pattern.compile("F.*").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JLabelMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JLabelMatcher m = {@link #withText(String) withText}("First Name:");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JLabelMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JLabelMatcher m = {@link #withText(String) withText}("First Name:").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JLabelMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JLabelMatcher m = {@link #withName(String) withName}("firstName").{@link #andText(String) andText}("First Name:");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JLabelMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JLabelMatcher m = {@link #withName(String) withName}("firstName").{@link #andText(String) andText}("First Name:").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/DialogMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * DialogMatcher m = {@link #withTitle(String) withTitle}("Save File");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/DialogMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * DialogMatcher m = {@link #withTitle(String) withTitle}("Save File").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/DialogMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * DialogMatcher m = {@link #withName(String) withName}("saveFile").{@link #andTitle(String) andTitle}("Save File");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/DialogMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * DialogMatcher m = {@link #withName(String) withName}("saveFile").{@link #andTitle(String) andTitle}("Save File").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/DialogMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * DialogMatcher m = {@link #withTitle(Pattern) withTitle}(Pattern.compile("Sav.*"));
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/DialogMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * DialogMatcher m = {@link #withTitle(Pattern) withTitle}(Pattern.compile("Sav.*")).{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/FrameMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * FrameMatcher m = {@link #withTitle(String) withTitle}("My App");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/FrameMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * FrameMatcher m = {@link #withTitle(String) withTitle}("My App").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/FrameMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * FrameMatcher m = {@link #withTitle(Pattern) withTitle}(Pattern.compile("My.*"));
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/FrameMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * FrameMatcher m = {@link #withTitle(Pattern) withTitle}(Pattern.compile("My.*")).{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/FrameMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * FrameMatcher m = {@link #withName(String) withName}("myApp").{@link #andTitle(String) andTitle}("My App");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/FrameMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * FrameMatcher m = {@link #withName(String) withName}("myApp").{@link #andTitle(String) andTitle}("My App").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JTextComponentMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JTextComponentMatcher m = {@link #withText(Pattern) withText}(Pattern.compile("W.*"));
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JTextComponentMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JTextComponentMatcher m = {@link #withText(Pattern) withText}(Pattern.compile("W.*")).{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JTextComponentMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JTextComponentMatcher m = {@link #withName(String) withName}("lastName").{@link #andText(String) andText}("Wang");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JTextComponentMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JTextComponentMatcher m = {@link #withName(String) withName}("lastName").{@link #andText(String) andText}("Wang").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JTextComponentMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JTextComponentMatcher m = {@link #withText(String) withText}("Wang");
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/core/matcher/JTextComponentMatcher.java`
#### Snippet
```java
   *
   * <pre>
   * JTextComponentMatcher m = {@link #withText(String) withText}("Wang").{@link #andShowing() andShowing}();
   * </pre>
   *
```

### JavadocDeclaration
Javadoc pointing to itself
in `assertj-swing/src/main/java/org/assertj/swing/lock/ScreenLock.java`
#### Snippet
```java
  /**
   * @return the object currently owning the lock. Or <code>null</code> if no object is owning the lock. If
   *         {@link #acquired()} is <code>true</code> calling {@link #acquiredBy(Object)} with {@link #getOwner()}
   *         returns <code>true</code>.
   */
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/runner/FailureScreenshotTaker.java`
#### Snippet
```java
public class FailureScreenshotTaker {

  private static Logger logger = Logger.getAnonymousLogger();

  private final File imageFolder;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing-testng/src/main/java/org/assertj/swing/testng/listener/ScreenshotOnFailureListener.java`
#### Snippet
```java
public class ScreenshotOnFailureListener extends AbstractTestListener {

  private static Logger logger = Logger.getAnonymousLogger();

  private ScreenshotTakerIF screenshotTaker;
```

### FieldMayBeFinal
Field `imageFileWriter` may be 'final'
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
  private static ImageEncoder imageEncoder = new ImageEncoder();
  private static ImageDecoder imageDecoder = new ImageDecoder();
  private static ImageFileWriter imageFileWriter = new ImageFileWriter();

  /**
```

### FieldMayBeFinal
Field `imageDecoder` may be 'final'
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java

  private static ImageEncoder imageEncoder = new ImageEncoder();
  private static ImageDecoder imageDecoder = new ImageDecoder();
  private static ImageFileWriter imageFileWriter = new ImageFileWriter();

```

### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
  private static final String EMPTY_STRING = "";

  private static Logger logger = Logger.getAnonymousLogger();

  private static ImageEncoder imageEncoder = new ImageEncoder();
```

### FieldMayBeFinal
Field `imageEncoder` may be 'final'
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/ImageHandler.java`
#### Snippet
```java
  private static Logger logger = Logger.getAnonymousLogger();

  private static ImageEncoder imageEncoder = new ImageEncoder();
  private static ImageDecoder imageDecoder = new ImageDecoder();
  private static ImageFileWriter imageFileWriter = new ImageFileWriter();
```

### FieldMayBeFinal
Field `testCaseName` may be 'final'
in `assertj-swing-junit/src/main/java/org/assertj/swing/junit/ant/Tests.java`
#### Snippet
```java
  private static final String JUNIT4_TEST_CASE_FACADE_TYPE = "junit.framework.JUnit4TestCaseFacade";

  private static Method testCaseName = nameMethodIn(TestCase.class);

  static String testMethodNameFrom(Test test) {
```

### FieldMayBeFinal
Field `hierarchy` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/core/WindowAncestorFinder.java`
#### Snippet
```java
 */
public final class WindowAncestorFinder {
  private static ComponentHierarchy hierarchy = new ExistingHierarchy();

  /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/text/TextReaders.java`
#### Snippet
```java
 */
public class TextReaders {
  private static Logger logger = Logger.getLogger(TextReaders.class.getCanonicalName());

  @VisibleForTesting
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/input/DragAwareEventNormalizer.java`
#### Snippet
```java
 */
class DragAwareEventNormalizer extends EventNormalizer {
  private static Logger logger = Logger.getLogger(DragAwareEventNormalizer.class.getCanonicalName());

  private DragAwareEventQueue dragAwareEventQueue;
```

### FieldMayBeFinal
Field `inputState` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  private static Toolkit toolkit = ToolkitProvider.instance().defaultToolkit();
  private static WindowMonitor windowMonitor = WindowMonitor.instance();
  private static InputState inputState = new InputState(toolkit);

  private final ComponentHierarchy hierarchy;
```

### FieldMayBeFinal
Field `toolkit` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java
  private static final int BUTTON_MASK = BUTTON1_MASK | BUTTON2_MASK | BUTTON3_MASK;

  private static Toolkit toolkit = ToolkitProvider.instance().defaultToolkit();
  private static WindowMonitor windowMonitor = WindowMonitor.instance();
  private static InputState inputState = new InputState(toolkit);
```

### FieldMayBeFinal
Field `windowMonitor` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/core/BasicRobot.java`
#### Snippet
```java

  private static Toolkit toolkit = ToolkitProvider.instance().defaultToolkit();
  private static WindowMonitor windowMonitor = WindowMonitor.instance();
  private static InputState inputState = new InputState(toolkit);

```

### FieldMayBeFinal
Field `FINDERS` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JSplitPaneLocationCalculator.java`
#### Snippet
```java
 */
final class JSplitPaneLocationCalculator {
  private static Map<Integer, LocationFinder> FINDERS = newHashMap();

  static {
```

### FieldMayBeFinal
Field `VALID_CONSTRAINTS` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/driver/JToolBarLocation.java`
#### Snippet
```java
 */
public final class JToolBarLocation {
  private static String[] VALID_CONSTRAINTS = { NORTH, EAST, SOUTH, WEST };

  /**
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/format/Formatting.java`
#### Snippet
```java
  private static final ConcurrentMap<Class<?>, ComponentFormatter> FORMATTERS = newConcurrentHashMap();

  private static Logger logger = Logger.getLogger(Formatting.class.getCanonicalName());

  static {
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/monitor/ProtectingTimerTask.java`
#### Snippet
```java
  private static final int CANCELED = 3;

  private static Logger logger = Logger.getLogger(ProtectingTimerTask.class.getCanonicalName());

  private final TimerTask task;
```

### FieldMayBeFinal
Field `logger` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/monitor/WindowStatus.java`
#### Snippet
```java
  private static final Dimension MINIMUM_WINDOW_SIZE = new Dimension(50, 30);

  private static Logger logger = Logger.getLogger(WindowStatus.class.getCanonicalName());
  private static int sign = 1;

```

### FieldMayBeFinal
Field `windowMonitor` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/hierarchy/ExistingHierarchy.java`
#### Snippet
```java
 */
public class ExistingHierarchy implements ComponentHierarchy {
  private static WindowMonitor windowMonitor = WindowMonitor.instance();

  private final ParentFinder parentFinder;
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeMappingProviderPicker.java`
#### Snippet
```java
 */
class KeyStrokeMappingProviderPicker {
  private static Logger LOGGER = Logger.getLogger(KeyStrokeMappingProviderPicker.class.getName());
  private final KeyStrokeMappingProviderFactory factory;

```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `assertj-swing/src/main/java/org/assertj/swing/keystroke/KeyStrokeLocale.java`
#### Snippet
```java
class KeyStrokeLocale {
  static final String ASSERTJ_SWING_KEYBOARD_LOCALE = "assertj.swing.keyboard.locale";
  private static Logger LOGGER = Logger.getLogger(KeyStrokeLocale.class.getName());
  private static Locale locale;

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

## RuleId[id=UnusedAssignment]
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

