# psiviewer 
 
# Bad smells
I found 88 bad smells with 10 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| CharsetObjectCanBeUsed | 18 | false |
| NonSerializableFieldInSerializableClass | 8 | false |
| RedundantFieldInitialization | 7 | false |
| ReturnNull | 7 | false |
| UtilityClassWithoutPrivateConstructor | 4 | true |
| AssignmentToMethodParameter | 4 | false |
| StringOperationCanBeSimplified | 3 | false |
| UnnecessaryFullyQualifiedName | 3 | false |
| NestedAssignment | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| IOResource | 2 | false |
| StringEquality | 2 | false |
| MarkedForRemoval | 2 | false |
| CommentedOutCode | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UNUSED_IMPORT | 2 | false |
| ThrowablePrintStackTrace | 2 | false |
| StringBufferReplaceableByStringBuilder | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| MagicConstant | 1 | false |
| DataFlowIssue | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| RedundantSuppression | 1 | false |
| UnnecessaryBoxing | 1 | false |
| UnnecessaryUnboxing | 1 | false |
| RedundantImplements | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=IOResource]
### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();
```

### IOResource
'OutputStreamWriter' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            cm.setCookies(conn);

            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();
```

## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
            _selectedElement = element;
            updatePropertySheet();
            if (reason != TREE_SELECTION_CHANGED)
                changeTreeSelection();
            applyHighlighting();
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
                changeTreeSelection();
            applyHighlighting();
            if (reason != CARET_MOVED && element != null)
                moveEditorCaret();
        }
```

## RuleId[id=MagicConstant]
### MagicConstant
Should be one of: ListSelectionModel.SINGLE_SELECTION, ListSelectionModel.SINGLE_INTERVAL_SELECTION, ...
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetPanel.java`
#### Snippet
```java
        ;
        myTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        myTable.getSelectionModel().setSelectionMode(0);

        packColumn(myTable, 0, 2);
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `IntrospectionUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/idea/plugin/psiviewer/util/IntrospectionUtil.java`
#### Snippet
```java
import java.lang.reflect.Method;

public class IntrospectionUtil
{
    private static final Logger LOG = Logger.getInstance(IntrospectionUtil.class);
```

### UtilityClassWithoutPrivateConstructor
Class `PluginPsiUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/idea/plugin/psiviewer/util/PluginPsiUtil.java`
#### Snippet
```java
import org.jetbrains.annotations.Nullable;

public class PluginPsiUtil
{
    @Nullable
```

### UtilityClassWithoutPrivateConstructor
Class `Helpers` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/idea/plugin/psiviewer/util/Helpers.java`
#### Snippet
```java
import java.net.URL;

public final class Helpers
{
    private static final Logger LOG = Logger.getInstance(Helpers.class);
```

### UtilityClassWithoutPrivateConstructor
Class `ActionEventUtil` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/idea/plugin/psiviewer/util/ActionEventUtil.java`
#### Snippet
```java
import com.intellij.psi.PsiFile;

public class ActionEventUtil
{
    public static Project getProject(AnActionEvent event)
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'Integer(int)' is deprecated and marked for removal
in `src/main/java/idea/plugin/psiviewer/view/configuration/CompoundSlider.java`
#### Snippet
```java
        _slider.addChangeListener(it -> {
                    int value = ((JSlider) it.getSource()).getValue();
                    _spinner.setValue(new Integer(value));
                    updateColor(value);
                }
```

### MarkedForRemoval
'findPluginId(java.lang.@org.jetbrains.annotations.NotNull Throwable)' is deprecated and marked for removal
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
        Throwable t = ideaLoggingEvents[0].getThrowable();
        if (t != null) {
            final PluginId pluginId = IdeErrorsDialog.findPluginId(t);
            if (pluginId != null) {
                final IdeaPluginDescriptor ideaPluginDescriptor = PluginManager.getPlugin(pluginId);
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Result of 'min' is the same as the second argument making the call meaningless
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
                                       String description,
                                       String user) {
        this.myDescription = ideaLoggingEvents[0].getThrowableText().substring(0, Math.min(Math.max(80, ideaLoggingEvents[0].getThrowableText().length()), 80));

        @NonNls StringBuilder descBuilder = new StringBuilder();
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
        if (this.myDescription == null || this.myDescription.length() == 0) throw new RuntimeException("Description");

        StringBuilder response = new StringBuilder("");

        //Create Post String
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
        String token  = st.nextToken();
        String name = token.substring(0, token.indexOf(NAME_VALUE_SEPARATOR));
        String value = token.substring(token.indexOf(NAME_VALUE_SEPARATOR) + 1, token.length());
        domainStore.put(name, cookie);
        cookie.put(name, value);
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
    while (st.hasMoreTokens()) {
        String token  = st.nextToken();
        cookie.put(token.substring(0, token.indexOf(NAME_VALUE_SEPARATOR)).toLowerCase(), token.substring(token.indexOf(NAME_VALUE_SEPARATOR) + 1, token.length()));
    }
    }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (7 lines)
in `src/main/java/idea/plugin/psiviewer/view/IconCache.java`
#### Snippet
```java
        _iconCache.put(PsiDirectory.class, Helpers.getIcon("/nodes/folder.png"));

//        try {
//            _iconCache.put(PsiField.class, Helpers.getIcon("/nodes/field.png"));
//            _iconCache.put(PsiMethod.class, Helpers.getIcon("/nodes/method.png"));
```

### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
        if (ResultString == null)
            return new SubmittedReportInfo(SERVER_ISSUE_URL, "", FAILED);
//        else {
//            if (ResultString.trim().length() > 0)
//                status = DUPLICATE;
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `args`
in `src/main/java/idea/plugin/psiviewer/util/IntrospectionUtil.java`
#### Snippet
```java
        try
        {
            Object args[] = {};
            getter.setAccessible(true);

```

### CStyleArrayDeclaration
C-style array declaration of local variable `token`
in `src/main/java/idea/plugin/psiviewer/util/Helpers.java`
#### Snippet
```java
    {
        int red = 0, green = 0, blue = 0, alpha = 128;
        String token[] = rgba.split(" ");
        if (token.length > 0) red = getSample(token[0]);
        if (token.length > 1) green = getSample(token[1]);
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field '_elementVisitor' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerTreeCellRenderer.java`
#### Snippet
```java

class PsiViewerTreeCellRenderer extends DefaultTreeCellRenderer implements PsiViewerConstants {
    private final ElementVisitor _elementVisitor = new ElementVisitor();
    private final XmlElementVisitor _elementVisitorXml = new ElementVisitorXml();

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myElementVisitor' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java

class PropertySheetHeaderRenderer extends JLabel implements TableCellRenderer, PsiViewerConstants {
    private final ElementVisitor myElementVisitor = new ElementVisitor();
    private final XmlElementVisitor myElementVisitorXml = new ElementVisitorXml();

```

### NonSerializableFieldInSerializableClass
Non-serializable field 'myTarget' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetPanel.java`
#### Snippet
```java
 */
public class PropertySheetPanel extends JPanel {
    private Object myTarget;
    private JTable myTable;

```

### NonSerializableFieldInSerializableClass
Non-serializable field '_model' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
    private String _actionTitle;
    private PsiViewerTree _tree;
    private PsiViewerTreeModel _model;
    private PsiElement _rootElement; // The root element of the tree
    private PsiElement _selectedElement; // The currently selected element in the tree
```

### NonSerializableFieldInSerializableClass
Non-serializable field '_highlighter' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
    private final ViewerTreeSelectionListener _treeSelectionListener;
    private final EditorCaretMover _caretMover;
    private final EditorPsiElementHighlighter _highlighter;
    private final PsiViewerProjectService _projectComponent;
    private final PropertySheetHeaderRenderer _propertyHeaderRenderer =
```

### NonSerializableFieldInSerializableClass
Non-serializable field '_treeSelectionListener' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
    private ToolWindow _toolWindow;
    private JSplitPane _splitPane;
    private final ViewerTreeSelectionListener _treeSelectionListener;
    private final EditorCaretMover _caretMover;
    private final EditorPsiElementHighlighter _highlighter;
```

### NonSerializableFieldInSerializableClass
Non-serializable field '_projectComponent' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
    private final EditorCaretMover _caretMover;
    private final EditorPsiElementHighlighter _highlighter;
    private final PsiViewerProjectService _projectComponent;
    private final PropertySheetHeaderRenderer _propertyHeaderRenderer =
            new PropertySheetHeaderRenderer(Helpers.getIcon(PsiViewerConstants.ICON_PSI),
```

### NonSerializableFieldInSerializableClass
Non-serializable field '_caretMover' in a Serializable class
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
    private JSplitPane _splitPane;
    private final ViewerTreeSelectionListener _treeSelectionListener;
    private final EditorCaretMover _caretMover;
    private final EditorPsiElementHighlighter _highlighter;
    private final PsiViewerProjectService _projectComponent;
```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`getFilteredChildren(psi).size() == 0` can be replaced with 'getFilteredChildren(psi).isEmpty()'
in `src/main/java/idea/plugin/psiviewer/model/PsiViewerTreeModel.java`
#### Snippet
```java
    public boolean isLeaf(Object node) {
        PsiElement psi = (PsiElement) node;
        return getFilteredChildren(psi).size() == 0;
    }

```

### SizeReplaceableByIsEmpty
`this.myDescription.length() == 0` can be replaced with 'this.myDescription.isEmpty()'
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

    public String submit() {
        if (this.myDescription == null || this.myDescription.length() == 0) throw new RuntimeException("Description");

        StringBuilder response = new StringBuilder("");
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/idea/plugin/psiviewer/controller/project/EditorListener.java`
#### Snippet
```java

    public void selectionChanged(@NotNull FileEditorManagerEvent event) {
        debug("selection changed " + event.toString());

        if (event.getNewFile() == null || myCurrentEditor == null) return;
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
        myLanguagesComboBox.removeItemListener(myLanguagesComboBoxListener);

        //noinspection Since15
        myLanguagesComboBox.setModel(new ListComboBoxModel<>(new ArrayList<>(languages)));

```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/idea/plugin/psiviewer/view/configuration/CompoundSlider.java`
#### Snippet
```java
        _slider.addChangeListener(it -> {
                    int value = ((JSlider) it.getSource()).getValue();
                    _spinner.setValue(new Integer(value));
                    updateColor(value);
                }
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

            // Send Login
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

            // Send Login
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

            if (this.myAffectedVersion != null)
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

            if (this.myAffectedVersion != null)
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            if (this.myAffectedVersion != null)
                data.append("&").append(URLEncoder.encode("affectsVersion", "UTF-8")).append("=").append(URLEncoder.encode(this.myAffectedVersion, "UTF-8"));

            // Send Data To Page
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            if (this.myAffectedVersion != null)
                data.append("&").append(URLEncoder.encode("affectsVersion", "UTF-8")).append("=").append(URLEncoder.encode(this.myAffectedVersion, "UTF-8"));

            // Send Data To Page
```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/idea/plugin/psiviewer/util/Helpers.java`
#### Snippet
```java
        try
        {
            s = Math.min(Math.abs(Integer.valueOf(sample).intValue()), 255);
        }
        catch (NumberFormatException e)
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `idea.plugin.psiviewer.controller.project` is unnecessary and can be removed
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerToolWindowFactory.java`
#### Snippet
```java
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        PsiViewerProjectService component = idea.plugin.psiviewer.controller.project.PsiViewerProjectService.getInstance(project);
        ContentManager contentManager = toolWindow.getContentManager();
        PsiViewerPanel panel = component.initToolWindow(toolWindow);
```

### UnnecessaryFullyQualifiedName
Qualifier `idea.plugin.psiviewer.controller.project` is unnecessary and can be removed
in `src/main/java/idea/plugin/psiviewer/view/EditorPsiElementHighlighter.java`
#### Snippet
```java

    private boolean isHighlightOn() {
        return idea.plugin.psiviewer.controller.project.PsiViewerProjectService.getInstance(_project).isHighlighted();
    }

```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary and can be removed
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
 *
 * @param conn a java.net.URLConnection - must NOT be open, or IOException will be thrown
 * @throws java.io.IOException Thrown if <i>conn</i> has already been opened.
 */
public void setCookies(URLConnection conn) throws IOException {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.intellij.util.xmlb.XmlSerializerUtil;`
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.components.panels.HorizontalLayout;
import com.intellij.util.xmlb.XmlSerializerUtil;
import idea.plugin.psiviewer.PsiViewerConstants;
import idea.plugin.psiviewer.controller.actions.PropertyToggleAction;
```

### UNUSED_IMPORT
Unused import `import idea.plugin.psiviewer.PsiViewerConstants;`
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
import com.intellij.ui.components.panels.HorizontalLayout;
import com.intellij.util.xmlb.XmlSerializerUtil;
import idea.plugin.psiviewer.PsiViewerConstants;
import idea.plugin.psiviewer.controller.actions.PropertyToggleAction;
import idea.plugin.psiviewer.util.Helpers;
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

        } catch (Exception e) {
            e.printStackTrace();
        }

```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
    return (now.compareTo(myDateFormat.parse(cookieExpires))) <= 0;
} catch (ParseException pe) {
    pe.printStackTrace();
    return false;
}
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java

String headerName=null;
for (int i=1; (headerName = conn.getHeaderFieldKey(i)) != null; i++) {
    if (headerName.equalsIgnoreCase(SET_COOKIE)) {
    Map cookie = new HashMap();
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
        public int SPLIT_DIVIDER_POSITION = 300;
        public boolean AUTOSCROLL_TO_SOURCE = false;
        public boolean AUTOSCROLL_FROM_SOURCE = false;
    }
    private State myState = new State();
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java

    static class State {
        public boolean HIGHLIGHT = false;
        public boolean FILTER_WHITESPACE = false;
        public boolean SHOW_PROPERTIES = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
        public boolean SHOW_PROPERTIES = true;
        public int SPLIT_DIVIDER_POSITION = 300;
        public boolean AUTOSCROLL_TO_SOURCE = false;
        public boolean AUTOSCROLL_FROM_SOURCE = false;
    }
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
    static class State {
        public boolean HIGHLIGHT = false;
        public boolean FILTER_WHITESPACE = false;
        public boolean SHOW_PROPERTIES = true;
        public int SPLIT_DIVIDER_POSITION = 300;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
    private static final String PROJECT_NAME = "PSI";

    private String myDescription = null;
    private String myExtraInformation = "";
    private String myAffectedVersion = null;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
    private String myDescription = null;
    private String myExtraInformation = "";
    private String myAffectedVersion = null;
    private final boolean myShowDialog = ApplicationInfo.getInstance().getBuild().getBaselineVersion() > 110;

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
    private static final String TREE_SELECTION_CHANGED = "tree selection changed";

    private boolean inSetSelectedElement = false;

    private void setSelectedElement(PsiElement element, String reason)
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `user`
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
        }

        if (user == null) user = "<none>";
        if (description == null) description = "<none>";

```

### AssignmentToMethodParameter
Assignment to method parameter `description`
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

        if (user == null) user = "<none>";
        if (description == null) description = "<none>";

        descBuilder.append("\n\nDescription: ").append(description).append("\n\nUser: ").append(user);
```

### AssignmentToMethodParameter
Assignment to method parameter `rootElement`
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
                if( selectedRoot != null )
                {
                    rootElement = selectedRoot;
                }
            }
```

### AssignmentToMethodParameter
Assignment to method parameter `element`
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
        {
            list.addFirst(element);
            element = element.getParent();
        }
        if (element != null)
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `CaretListener`
in `src/main/java/idea/plugin/psiviewer/controller/project/EditorListener.java`
#### Snippet
```java
 * @version $Revision: 1.1 $
 */
public class EditorListener extends CaretAdapter implements FileEditorManagerListener, CaretListener {


```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/idea/plugin/psiviewer/view/configuration/AlphaChooserPanel.java`
#### Snippet
```java
    public Icon getLargeDisplayIcon()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/idea/plugin/psiviewer/view/configuration/AlphaChooserPanel.java`
#### Snippet
```java
    public Icon getSmallDisplayIcon()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/idea/plugin/psiviewer/controller/actions/ViewElementAtCaretAction.java`
#### Snippet
```java
        Editor editor = ActionEventUtil.getEditor(event);
        if (editor == null)
            return null;
        final PsiFile psiFile = ActionEventUtil.getPsiFile(event);
        if (psiFile == null)
```

### ReturnNull
Return of `null`
in `src/main/java/idea/plugin/psiviewer/controller/actions/ViewElementAtCaretAction.java`
#### Snippet
```java
        final PsiFile psiFile = ActionEventUtil.getPsiFile(event);
        if (psiFile == null)
            return null;
        return psiFile.findElementAt(editor.getCaretModel().getOffset());
    }
```

### ReturnNull
Return of `null`
in `src/main/java/idea/plugin/psiviewer/view/EditorCaretMover.java`
#### Snippet
```java
        }
        
        if (psiFile == null) return null;

        final VirtualFile virtualFile = psiFile.getVirtualFile();
```

### ReturnNull
Return of `null`
in `src/main/java/idea/plugin/psiviewer/view/EditorCaretMover.java`
#### Snippet
```java
        final VirtualFile virtualFile = psiFile.getVirtualFile();

        if (virtualFile == null) return null;

        OpenFileDescriptor fileDesc = new OpenFileDescriptor(_project, virtualFile, i);    // 20050826 IDEA 5.0.1 #3461
```

### ReturnNull
Return of `null`
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
    private TreePath getPath(PsiElement element)
    {
        if (element == null) return null;
        LinkedList list = new LinkedList();
        while (element != null && element != _rootElement)
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `filePath` is redundant
in `src/main/java/com/sylvanaar/idea/errorreporting/PluginErrorSubmitDialog.java`
#### Snippet
```java
    private String getOptionsFilePath() {
        String optionsPath = PathManager.getOptionsPath();
        String filePath = optionsPath + File.separator + "pluginErrorReportSubmitter.xml";
        return filePath;
    }
```

### UnnecessaryLocalVariable
Local variable `status` is redundant
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
        }

        SubmittedReportInfo.SubmissionStatus status = NEW_ISSUE;

        if (ResultString == null)
```

### UnnecessaryLocalVariable
Local variable `ioe` is redundant
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
    conn.setRequestProperty(COOKIE, cookieStringBuffer.toString());
} catch (IllegalStateException ise) {
    IOException ioe = new IOException("Illegal State! Cookies cannot be set on a URLConnection that is already connected. Only call setCookies(java.net.URLConnection) AFTER calling java.net.URLConnection.connect().");
    throw ioe;
}
```

## RuleId[id=StringBufferReplaceableByStringBuilder]
### StringBufferReplaceableByStringBuilder
`StringBuffer buf` may be declared as 'StringBuilder'
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetPanel.java`
#### Snippet
```java
        if (object == null) return "null";
        if (!object.getClass().isArray()) return object.toString();
        StringBuffer buf = new StringBuffer();
        buf.append("[");
        int arrayLength = Array.getLength(object);
```

### StringBufferReplaceableByStringBuilder
`StringBuffer cookieStringBuffer` may be declared as 'StringBuilder'
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
    Map domainStore = (Map) myStore.get(domain);
if (domainStore == null) return;
StringBuffer cookieStringBuffer = new StringBuffer();

Iterator cookieNames = domainStore.keySet().iterator();
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/idea/plugin/psiviewer/util/IntrospectionUtil.java`
#### Snippet
```java
        try
        {
            Object args[] = {};
            getter.setAccessible(true);

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/idea/plugin/psiviewer/util/IntrospectionUtil.java`
#### Snippet
```java
            LOG.debug("Introspector.getBeanInfo(" + targetClass + ") exception...");
            LOG.debug(ex);
            propertyDescriptors = new PropertyDescriptor[0];
        }
        return propertyDescriptors;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `headerName` initializer `null` is redundant
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
// OK, now we are ready to get the cookies out of the URLConnection

String headerName=null;
for (int i=1; (headerName = conn.getHeaderFieldKey(i)) != null; i++) {
    if (headerName.equalsIgnoreCase(SET_COOKIE)) {
```

