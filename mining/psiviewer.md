# psiviewer 
 
# Bad smells
I found 108 bad smells with 4 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BlockingMethodInNonBlockingContext | 30 | false |
| CharsetObjectCanBeUsed | 18 | false |
| NullableProblems | 17 | false |
| Deprecation | 9 | false |
| UNCHECKED_WARNING | 7 | false |
| StringOperationCanBeSimplified | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| TrivialIf | 3 | false |
| StringEquality | 2 | false |
| UNUSED_IMPORT | 2 | false |
| CStyleArrayDeclaration | 2 | false |
| CommentedOutCode | 2 | false |
| MagicConstant | 1 | false |
| MarkedForRemoval | 1 | false |
| DataFlowIssue | 1 | false |
| JavadocDeclaration | 1 | false |
| CachedNumberConstructorCall | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| RedundantTypeArguments | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| UnusedAssignment | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked call to 'setModel(ComboBoxModel)' as a member of raw type 'javax.swing.JComboBox'
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java

        //noinspection Since15
        myLanguagesComboBox.setModel(new ListComboBoxModel<>(new ArrayList<>(languages)));

        if (selectedLanguage != null && languages.contains(selectedLanguage))
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
        // we don't, so let's create it and put it in the store
        domainStore = new HashMap();
        myStore.put(domain, domainStore);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
        String name = token.substring(0, token.indexOf(NAME_VALUE_SEPARATOR));
        String value = token.substring(token.indexOf(NAME_VALUE_SEPARATOR) + 1, token.length());
        domainStore.put(name, cookie);
        cookie.put(name, value);
    }
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
        String value = token.substring(token.indexOf(NAME_VALUE_SEPARATOR) + 1, token.length());
        domainStore.put(name, cookie);
        cookie.put(name, value);
    }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
    while (st.hasMoreTokens()) {
        String token  = st.nextToken();
        cookie.put(token.substring(0, token.indexOf(NAME_VALUE_SEPARATOR)).toLowerCase(), token.substring(token.indexOf(NAME_VALUE_SEPARATOR) + 1, token.length()));
    }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'addFirst(E)' as a member of raw type 'java.util.LinkedList'
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
        while (element != null && element != _rootElement)
        {
            list.addFirst(element);
            element = element.getParent();
        }
```

### UNCHECKED_WARNING
Unchecked call to 'addFirst(E)' as a member of raw type 'java.util.LinkedList'
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerPanel.java`
#### Snippet
```java
        }
        if (element != null)
            list.addFirst(element);
        TreePath treePath = new TreePath(list.toArray());
        debug("root=" + _rootElement + ", treePath=" + treePath);
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

## RuleId[id=StringOperationCanBeSimplified]
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

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
        if (this.myDescription == null || this.myDescription.length() == 0) throw new RuntimeException("Description");

        StringBuilder response = new StringBuilder("");

        //Create Post String
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param path` tag description is missing
in `src/main/java/idea/plugin/psiviewer/util/Helpers.java`
#### Snippet
```java
     * return <i>some</i> sort of icon even if it has to build one on-the-fly.
     *
     * @param path
     * @return An Icon almost guaranteed to be usable.
     */
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

## RuleId[id=CachedNumberConstructorCall]
### CachedNumberConstructorCall
Number constructor call with primitive argument
in `src/main/java/idea/plugin/psiviewer/view/configuration/CompoundSlider.java`
#### Snippet
```java
        _slider.addChangeListener(it -> {
                    int value = ((JSlider) it.getSource()).getValue();
                    _spinner.setValue(new Integer(value));
                    updateColor(value);
                }
```

## RuleId[id=UnnecessaryLocalVariable]
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

## RuleId[id=Deprecation]
### Deprecation
'com.intellij.openapi.editor.event.CaretAdapter' is deprecated
in `src/main/java/idea/plugin/psiviewer/controller/project/EditorListener.java`
#### Snippet
```java
 * @version $Revision: 1.1 $
 */
public class EditorListener extends CaretAdapter implements FileEditorManagerListener, CaretListener {


```

### Deprecation
'com.intellij.openapi.components.ServiceManager' is deprecated
in `src/main/java/idea/plugin/psiviewer/controller/application/PsiViewerApplicationSettings.java`
#### Snippet
```java

    public static PsiViewerApplicationSettings getInstance() {
        return ServiceManager.getService(PsiViewerApplicationSettings.class);
    }

```

### Deprecation
'getService(java.lang.@org.jetbrains.annotations.NotNull Class)' is deprecated
in `src/main/java/idea/plugin/psiviewer/controller/application/PsiViewerApplicationSettings.java`
#### Snippet
```java

    public static PsiViewerApplicationSettings getInstance() {
        return ServiceManager.getService(PsiViewerApplicationSettings.class);
    }

```

### Deprecation
'message(java.util.@org.jetbrains.annotations.NotNull ResourceBundle, java.lang.@org.jetbrains.annotations.NotNull String, java.lang.Object @org.jetbrains.annotations.NotNull ...)' is deprecated
in `src/main/java/com/sylvanaar/idea/errorreporting/PluginErrorReportSubmitterBundle.java`
#### Snippet
```java
    public static String message(@PropertyKey(resourceBundle = "com.sylvanaar.idea.errorreporting.PluginErrorReportSubmitterBundle") String key,
                                 Object... params) {
        return CommonBundle.message(OUR_BUNDLE, key, params);
    }
}
```

### Deprecation
'com.intellij.openapi.util.DefaultJDOMExternalizer' is deprecated
in `src/main/java/com/sylvanaar/idea/errorreporting/PluginErrorSubmitDialog.java`
#### Snippet
```java

            USERNAME = myUserTextField.getText();
            DefaultJDOMExternalizer.writeExternal(this, componentElement);

            Document document = new Document(applicationElement);
```

### Deprecation
'loadDocument(java.io.@org.jetbrains.annotations.NotNull File)' is deprecated
in `src/main/java/com/sylvanaar/idea/errorreporting/PluginErrorSubmitDialog.java`
#### Snippet
```java
        if (file.exists()) {
            try {
                Document document = JDOMUtil.loadDocument(file);
                Element applicationElement = document.getRootElement();
                if (applicationElement == null) {
```

### Deprecation
'com.intellij.openapi.util.DefaultJDOMExternalizer' is deprecated
in `src/main/java/com/sylvanaar/idea/errorreporting/PluginErrorSubmitDialog.java`
#### Snippet
```java
                }

                DefaultJDOMExternalizer.readExternal(this, componentElement);
                myUserTextField.setText(USERNAME);
            } catch (Exception e) {
```

### Deprecation
'findPluginId(java.lang.Throwable)' is deprecated
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
        Throwable t = ideaLoggingEvents[0].getThrowable();
        if (t != null) {
            final PluginId pluginId = IdeErrorsDialog.findPluginId(t);
            if (pluginId != null) {
                final IdeaPluginDescriptor ideaPluginDescriptor = PluginManager.getPlugin(pluginId);
```

### Deprecation
'getPlugin(com.intellij.openapi.extensions.@org.jetbrains.annotations.Nullable PluginId)' is deprecated
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            final PluginId pluginId = IdeErrorsDialog.findPluginId(t);
            if (pluginId != null) {
                final IdeaPluginDescriptor ideaPluginDescriptor = PluginManager.getPlugin(pluginId);
                if (ideaPluginDescriptor != null && !ideaPluginDescriptor.isBundled()) {
                    descBuilder.append("Plugin ").append(ideaPluginDescriptor.getName()).append(" version: ").append(ideaPluginDescriptor.getVersion()).append("\n");
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

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
        myLanguagesComboBox = new ComboBox();
        panel.add(myLanguagesComboBox);
        updateLanguagesList(Collections.<Language>emptyList());

        myViewerPanel.add(panel, BorderLayout.NORTH);
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'List.indexOf()'
in `src/main/java/idea/plugin/psiviewer/model/PsiViewerTreeModel.java`
#### Snippet
```java
        List<PsiElement> psiChildren = getFilteredChildren(psiParent);

        return psiChildren.indexOf(child);
    }

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

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlAttributeValue(XmlAttributeValue psiElement) {
        }

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlComment(XmlComment psiElement) {
            setIcon(IconCache.getIcon(XmlComment.class));
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlTag(XmlTag psiElement) {
            setIcon(IconCache.getIcon(XmlTag.class));
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlFile(XmlFile psiElement) {
            setIcon(IconCache.getIcon(XmlFile.class));
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlDocument(XmlDocument psiElement) {
        }
        
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlDoctype(XmlDoctype psiElement) {
        }

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java

    private class ElementVisitorXml extends XmlElementVisitor {
        public void visitXmlAttribute(XmlAttribute psiElement) {
            setIcon(IconCache.getIcon(XmlAttribute.class));
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlDecl(XmlDecl psiElement) {
        }

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }
        
        public void visitXmlProlog(XmlProlog psiElement) {
        }

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PropertySheetHeaderRenderer.java`
#### Snippet
```java
        }

        public void visitXmlToken(XmlToken psiElement) {
        }
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerTreeCellRenderer.java`
#### Snippet
```java
        }

        public void visitXmlAttributeValue(XmlAttributeValue psiElement) {
            setText("XmlAttributeValue");
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerTreeCellRenderer.java`
#### Snippet
```java
        }

        public void visitXmlComment(XmlComment psiElement) {
            setIcon(IconCache.getIcon(XmlComment.class));
            setText("XmlComment");
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerTreeCellRenderer.java`
#### Snippet
```java
        }

        public void visitXmlDocument(XmlDocument psiElement) {
            setText("XmlDocument");
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerTreeCellRenderer.java`
#### Snippet
```java
        }

        public void visitXmlDecl(XmlDecl psiElement) {
            setText("XmlDecl");
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerTreeCellRenderer.java`
#### Snippet
```java
        }

        public void visitXmlProlog(XmlProlog psiElement) {
            setText("XmlProlog");
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/idea/plugin/psiviewer/view/PsiViewerTreeCellRenderer.java`
#### Snippet
```java
        }

        public void visitXmlDoctype(XmlDoctype psiElement) {
            setText("XmlDoctype");
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

    @Override
    public boolean submit(@NotNull IdeaLoggingEvent[] ideaLoggingEvents,
                          @Nullable String additionalInfo,
                          @NotNull Component component,
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
 * <code>
 *     Cookiemanager cm = new CookieManager();
 *     URL url = new URL("http://www.hccp.org/test/cookieTest.jsp");
 *
 *      . . .
```

## RuleId[id=BlockingMethodInNonBlockingContext]
### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

            // Send Login
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            // Build Login
            data.append(URLEncoder.encode("login", "UTF-8")).append("=").append(URLEncoder.encode(USER_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("password", "UTF-8")).append("=").append(URLEncoder.encode("root", "UTF-8"));

            // Send Login
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            // Send Login
            URL url = new URL(LOGIN_URL);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            conn.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();

            // Get The Response
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            // Get The Response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data = new StringBuilder();
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append(URLEncoder.encode("project", "UTF-8")).append("=").append(URLEncoder.encode(PROJECT_NAME, "UTF-8"));
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("assignee", "UTF-8")).append("=").append(URLEncoder.encode("Unassigned", "UTF-8"));
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("summary", "UTF-8")).append("=").append(URLEncoder.encode(myDescription, "UTF-8"));
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

            if (this.myAffectedVersion != null)
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            data.append("&").append(URLEncoder.encode("description", "UTF-8")).append("=").append(URLEncoder.encode(myExtraInformation, "UTF-8"));
            data.append("&").append(URLEncoder.encode("priority", "UTF-8")).append("=").append(URLEncoder.encode("4", "UTF-8"));
            data.append("&").append(URLEncoder.encode("type", "UTF-8")).append("=").append(URLEncoder.encode("Exception", "UTF-8"));

            if (this.myAffectedVersion != null)
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            if (this.myAffectedVersion != null)
                data.append("&").append(URLEncoder.encode("affectsVersion", "UTF-8")).append("=").append(URLEncoder.encode(this.myAffectedVersion, "UTF-8"));

            // Send Data To Page
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            if (this.myAffectedVersion != null)
                data.append("&").append(URLEncoder.encode("affectsVersion", "UTF-8")).append("=").append(URLEncoder.encode(this.myAffectedVersion, "UTF-8"));

            // Send Data To Page
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            url = new URL(SERVER_ISSUE_URL);

            conn = url.openConnection();
            conn.setDoOutput(true);
            cm.setCookies(conn);
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            cm.setCookies(conn);

            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();

```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data.toString());
            wr.flush();

            // Get The Response
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java

            // Get The Response
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            while ((line = rd.readLine()) != null) {
```

### BlockingMethodInNonBlockingContext
Possibly blocking call in non-blocking context could lead to thread starvation
in `src/main/java/com/sylvanaar/idea/errorreporting/YouTrackBugReporter.java`
#### Snippet
```java
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            while ((line = rd.readLine()) != null) {
                response.append(line);
            }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/idea/plugin/psiviewer/controller/application/Configuration.java`
#### Snippet
```java
            return true;

        if (!Helpers.encodeColor(myPanel.getReferenceHighlightColor()).equals(mySettings.REFERENCE_HIGHLIGHT_COLOR))
            return true;

```

### TrivialIf
`if` statement can be simplified
in `src/main/java/idea/plugin/psiviewer/controller/project/PsiViewerProjectService.java`
#### Snippet
```java
        }

        if (languages.size() < 2) {
            myLanguagesComboBox.setVisible(false);
        } else {
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/com/sylvanaar/idea/errorreporting/CookieManager.java`
#### Snippet
```java
} else if (cookiePath.equals("/")) {
    return true;
} else if (targetPath.regionMatches(0, cookiePath, 0, cookiePath.length())) {
    return true;
} else {
```

