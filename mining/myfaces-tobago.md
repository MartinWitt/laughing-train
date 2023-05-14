# myfaces-tobago 
 
# Bad smells
I found 612 bad smells with 11 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 109 | false |
| ConstantValue | 85 | false |
| DataFlowIssue | 54 | false |
| Deprecation | 49 | false |
| DuplicatedCode | 43 | false |
| JavadocReference | 38 | false |
| UNCHECKED_WARNING | 27 | false |
| DeprecatedIsStillUsed | 24 | false |
| CommentedOutCode | 23 | false |
| ConditionCoveredByFurtherCondition | 19 | false |
| EmptyStatementBody | 14 | false |
| NonFinalFieldInEnum | 14 | false |
| WebProperties | 12 | false |
| DefaultAnnotationParam | 11 | false |
| RedundantCast | 7 | false |
| TrivialStringConcatenation | 6 | false |
| DuplicateBranchesInSwitch | 5 | false |
| UnusedAssignment | 5 | false |
| RegExpRedundantClassElement | 4 | false |
| RedundantMethodOverride | 4 | false |
| SlowAbstractSetRemoveAll | 4 | false |
| InnerClassMayBeStatic | 3 | true |
| UnnecessaryLocalVariable | 3 | true |
| NotNullFieldNotInitialized | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| SimplifiableConditionalExpression | 2 | false |
| NullableProblems | 2 | false |
| JavadocLinkAsPlainText | 2 | false |
| IgnoreResultOfCall | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| SwitchStatementWithTooFewBranches | 2 | false |
| IOStreamConstructor | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| DanglingJavadoc | 2 | false |
| TrivialIf | 2 | false |
| NonStrictComparisonCanBeEquality | 2 | true |
| ServletWithoutMappingInspection | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| UnnecessaryStringEscape | 1 | true |
| RegExpRedundantEscape | 1 | false |
| UastIncorrectHttpHeaderInspection | 1 | false |
| RegExpSimplifiable | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| SillyAssignment | 1 | false |
| UnaryPlus | 1 | false |
| RedundantCollectionOperation | 1 | false |
| CdiInjectionPointsInspection | 1 | false |
| SuspiciousMethodCalls | 1 | false |
| CopyConstructorMissesField | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| UseBulkOperation | 1 | false |
## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`else` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TreeExpansionEvent.java`
#### Snippet
```java
      } else if (!oldExpanded && newExpanded) {
        ((TreeExpansionListener) facesListener).treeExpanded(this);
      } else {
        // nothing to do
      }
```

### EmptyStatementBody
`else` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TreeSelectedEvent.java`
#### Snippet
```java
      } else if (!oldSelected && newSelected) {
        ((TreeSelectedListener) facesListener).treeSelected(this);
      } else {
        // nothing to do
      }
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/XmlResponseWriter.java`
#### Snippet
```java
  public void write(final char[] cbuf, final int off, final int len) throws IOException {
    // Related to http://java.net/jira/browse/JAVASERVERFACES_SPEC_PUBLIC-696
    if (Arrays.equals(cbuf, XML_VERSION_1_0_ENCODING_UTF_8_CHARS)) {
      // drop
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/HtmlResponseWriter.java`
#### Snippet
```java
  public void write(final char[] cbuf, final int off, final int len) throws IOException {
    // Related to http://java.net/jira/browse/JAVASERVERFACES_SPEC_PUBLIC-696
    if (Arrays.equals(cbuf, XML_VERSION_1_0_ENCODING_UTF_8_CHARS)) {
      // drop
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectItem.java`
#### Snippet
```java
    if (itemValue instanceof String) {
      itemValueLiteral = true;
    } else if (itemValue == null) {
      // ignore
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPage.java`
#### Snippet
```java
          lastInBuilder = c;
        }
      } else if ('0' <= c && c <= '9') { // number

      } else { // any other
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LabelLayoutRendererBase.java`
#### Snippet
```java
    encodeBeginSurroundingLabel(facesContext, component);

    if (component.isNextToRenderIsLabel()) {
      // skip, because its only the lable to render
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LabelLayoutRendererBase.java`
#### Snippet
```java
    }

    if (nextToRenderIsLabel) {
      // skip, because its only the lable to render
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LabelLayoutRendererBase.java`
#### Snippet
```java
  public void encodeEndInternal(final FacesContext facesContext, final T component) throws IOException {

    if (component.isNextToRenderIsLabel()) {
      // skip, because its only the lable to render
    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
        if (child instanceof AbstractUIColumnBase) {
          result.add((AbstractUIColumnBase) child);
        } else if (child instanceof AbstractUIData) {
          // ignore columns of nested sheets
        } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeRenderer.java`
#### Snippet
```java

      for (final UIComponent child : component.getChildren()) {
        if (child instanceof AbstractUIStyle) {
          // ignore, this is rendered in encodeChildren()
        } else {
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/CheckstyleConfigGenerator.java`
#### Snippet
```java

    final String shortName = taglibAnnotation.shortName();
    if (shortName.length() != 2) {

    }
```

### EmptyStatementBody
`else` statement has empty body
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
            element.addContent(createElementExtension(typeElement, componentTag, namespace));
            components.add(element);
          } else {
            // TODO add facet and attributes
          }
```

### EmptyStatementBody
`if` statement has empty body
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
    if (!tagAttribute.rtexprvalue()) {
      if (componentTagAttribute != null) {
        if (componentTagAttribute.expression().isMethodExpression()) {
          // todo
        } else if (componentTagAttribute.expression().isValueExpression()) {
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/AjaxSpecialCharacterController.java`
#### Snippet
```java

  public String getString() {
    return "SubstituteChar=“\u001A” Five=“5” SigleQuote=“\'” DoubleQuote=“\"” "
        + "Micro=“µ” Euro=“€” Atom=“⚛” Guitar=“\uD83C\uDFB8”";
  }
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (3 lines)
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java
        result.add(searchIndex.get(s));
      }
//      if (result.size() >= 20) {
//        break;
//      }
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugUtils.java`
#### Snippet
```java
  public static String toString(final UIComponent component) {
    final StringBuilder buf = new StringBuilder(component.getClass().getName());
//    buf.append('@');
//    buf.append(Integer.toHexString(component.hashCode()));
    buf.append(" ");
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugUtils.java`
#### Snippet
```java
    buf.append(component.getRendererType());
    buf.append(" ");
//      buf.append(component.getId());
//      buf.append(" ");
    buf.append(component.getClientId(FacesContext.getCurrentInstance()));
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
    while (!list.isEmpty()) {
      field[position] = list.next();
//      LOG.debug(depth);
//      LOG.debug(this);
      if (checkRules()) {
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/Resource.java`
#### Snippet
```java
            final Object ctx = externalContext.getContext();
            // Or maybe fetch the external context afresh ?
            // Object ctx =
            // FacesContext.getCurrentInstance().getExternalContext().getContext();

```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/HtmlWriterHelper.java`
#### Snippet
```java
    // We are not escaping quot " and slash / here, because we not really need that in our case.
    // It makes the HTML code better readable and shorter. There are many occurrences of quot, because of JSON.
    //    CHARS_TO_ESCAPE['\"'] = "&quot;".toCharArray();
    //    CHARS_TO_ESCAPE['/'] = "&#x2F;".toCharArray();

```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
          final String description = uiSelectItem.getItemDescription();
          final boolean disabled = uiSelectItem.isItemDisabled();
//          boolean escape = uiSelectItem.isItemEscaped();
//          boolean noSelectionOption = uiSelectItem.isNoSelectionOption();
          if (label == null && itemValue != null) {
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java
  private DeltaStateHelper<EventBehavior> stateHelper = null;

  //private Map<String, ValueExpression> _valueExpressions
  //        = new HashMap<String, ValueExpression>();

```

### CommentedOutCode
Commented out code (4 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java
  }

  //private Map<String, ValueExpression> getValueExpressionMap()
  //{
  //    return _valueExpressions;
```

### CommentedOutCode
Commented out code (9 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java

  public void setValueExpression(final String name, final ValueExpression expression) {
        /*
        if (item == null)
        {
```

### CommentedOutCode
Commented out code (4 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      }
    } else {
            /*
            if (value instanceof StateHolder)
            {
```

### CommentedOutCode
Commented out code (12 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    }

        /*
        int stateHolderKeyCount = 0;
        if (isInitalStateMarked())
```

### CommentedOutCode
Commented out code (31 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    }

        /*
        if (isInitalStateMarked())
        {
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITabGroup.java`
#### Snippet
```java
        }
      }
//      final AbstractUIPanelBase renderedTab = getRenderedTab();
//      renderedTab.processDecodes(context);
      for (final UIComponent facet : getFacets().values()) {
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SplitLayoutRenderer.java`
#### Snippet
```java
    if (clientId.equals(sourceId)) {
      // only decode and update layout at resize request
//      final Map<String, String> parameterMap = facesContext.getExternalContext().getRequestParameterMap();
//      final String position = parameterMap.get(clientId + SUFFIX_SIZES);
      LOG.warn("todo update layout");
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LinksRenderer.java`
#### Snippet
```java
  public void encodeBeginInternal(final FacesContext facesContext, final T component) throws IOException {

//    final boolean insideBar = ComponentUtils.findAncestor(component, AbstractUIBar.class) != null;
//    final boolean insideBar = facesContext.getAttributes().get("inside-bar") != null;
    final boolean insideBar = isInside(facesContext, HtmlElements.TOBAGO_BAR);
```

### CommentedOutCode
Commented out code (2 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeListboxRenderer.java`
#### Snippet
```java
    }
    // todo: use (TreeListbox ?)Layout
//    final Measure currentWidth = tree.getCurrentWidth();
//    final Measure width = currentWidth.divide(depth);
    for (int level = 0; level < depth; level++) {
```

### CommentedOutCode
Commented out code (9 lines)
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/MessagesRenderer.java`
#### Snippet
```java

    // with id
      /*String focusId = null;
      Iterator clientIds;
      if (ComponentUtils.getBooleanAttribute(messages, Attributes.globalOnly)) {
```

### CommentedOutCode
Commented out code (3 lines)
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
        propertyInfo.setTransient(uiComponentTagAttribute.isTransient());
        propertyInfo.setGenerate(uiComponentTagAttribute.generate());
//        if (properties.containsKey(name)) {
//          warn("Redefinition of attribute '" + name + "'.");
//        }
```

### CommentedOutCode
Commented out code (3 lines)
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
    componentInfo.addImport(componentPropertyInfo.getUnmodifiedType());
    componentInfo.addImport("jakarta.faces.context.FacesContext");
//    if ("markup".equals(info.getName())) {
//      componentInfo.addInterface("org.apache.myfaces.tobago.component.Visual");
//    }
```

### CommentedOutCode
Commented out code (3 lines)
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
      if (componentTag.behaviors().length > 0) {
        for (final Behavior behavior : componentTag.behaviors()) {
//          info("*************** ----------------------" + componentTag.behaviors().length);
//          info("*************** " + behavior.name());
//          info("*************** " + componentInfo.getBehaviors());
```

### CommentedOutCode
Commented out code (4 lines)
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
//          ex = true;
        }
//        info("*** 5 " + infoType + "               " + methodName
//        + "      generate=" + generate + "      info.generate="
//        + info.isGenerate() + " ex=" + (ex ? "NoSuchMethodException" : "" )
```

### CommentedOutCode
Commented out code (13 lines)
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
      resetAttributeDuplicateList();
      // TODO configure replacement
//      final String className;
//      if (typeElement.getAnnotation(SimpleTag.class) != null
// || typeElement.getAnnotation(ValidatorTag.class) != null) {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\!` in RegExp
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ManifestReader.java`
#### Snippet
```java

        String name = url.toString();
        name = name.replaceAll(".+/([^/]+\\.jar)\\!/META-INF/MANIFEST.MF", "$1");
        final ManifestEntry jar = new ManifestEntry(name, null);
        manifestTree.add(jar);
```

## RuleId[id=UastIncorrectHttpHeaderInspection]
### UastIncorrectHttpHeaderInspection
Unknown HTTP header
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/ResponseUtils.java`
#### Snippet
```java
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
    response.setDateHeader("max-age", 0);
  }

```

## RuleId[id=RegExpRedundantClassElement]
### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Icons.java`
#### Snippet
```java
  private static final Pattern PATTERN_BI = Pattern.compile("^bi-[\\w\\d-]+$");
  private static final Pattern PATTERN_FA = Pattern.compile("^fa-[\\w\\d-]+$");
  private static final Pattern PATTERN_FA5 = Pattern.compile("^(fas|far|fal|fad)\\sfa-[\\w\\d-]+$");

  private final String clazz;
```

### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Icons.java`
#### Snippet
```java
  private static final Pattern PATTERN = Pattern.compile("^(bi|fa|(fas|far|fal|fad)\\sfa)-[\\w\\d-]+$");
  private static final Pattern PATTERN_BI = Pattern.compile("^bi-[\\w\\d-]+$");
  private static final Pattern PATTERN_FA = Pattern.compile("^fa-[\\w\\d-]+$");
  private static final Pattern PATTERN_FA5 = Pattern.compile("^(fas|far|fal|fad)\\sfa-[\\w\\d-]+$");

```

### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Icons.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private static final Pattern PATTERN = Pattern.compile("^(bi|fa|(fas|far|fal|fad)\\sfa)-[\\w\\d-]+$");
  private static final Pattern PATTERN_BI = Pattern.compile("^bi-[\\w\\d-]+$");
  private static final Pattern PATTERN_FA = Pattern.compile("^fa-[\\w\\d-]+$");
```

### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Icons.java`
#### Snippet
```java

  private static final Pattern PATTERN = Pattern.compile("^(bi|fa|(fas|far|fal|fad)\\sfa)-[\\w\\d-]+$");
  private static final Pattern PATTERN_BI = Pattern.compile("^bi-[\\w\\d-]+$");
  private static final Pattern PATTERN_FA = Pattern.compile("^fa-[\\w\\d-]+$");
  private static final Pattern PATTERN_FA5 = Pattern.compile("^(fas|far|fal|fad)\\sfa-[\\w\\d-]+$");
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/Jsr303Bean.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @NotNull
  private String required;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ValidationJsr303Controller.java`
#### Snippet
```java
public class ValidationJsr303Controller implements Serializable {

  @NotNull
  private String required;

```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LabelLayoutRendererBase.java`
#### Snippet
```java
      case segmentLeft:
      case segmentRight:
        flex = false;
        break;
      case flowLeft:
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `tobago-tool/tobago-tool-annotation/src/main/java/org/apache/myfaces/tobago/apt/annotation/DynamicExpression.java`
#### Snippet
```java
        return "VB";
      case VALUE_EXPRESSION_REQUIRED:
        return "VB";
      case METHOD_EXPRESSION:
        return "MB";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `tobago-tool/tobago-tool-annotation/src/main/java/org/apache/myfaces/tobago/apt/annotation/DynamicExpression.java`
#### Snippet
```java
        return "MB";
      case METHOD_EXPRESSION_REQUIRED:
        return "MB";
      case PROHIBITED:
        return "NONE";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `tobago-tool/tobago-tool-annotation/src/main/java/org/apache/myfaces/tobago/apt/annotation/DynamicExpression.java`
#### Snippet
```java
        return "ALLOWED";
      case METHOD_EXPRESSION:
        return "ALLOWED";
      case VALUE_EXPRESSION_REQUIRED:
        return "REQUIRED";
```

### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `tobago-tool/tobago-tool-annotation/src/main/java/org/apache/myfaces/tobago/apt/annotation/DynamicExpression.java`
#### Snippet
```java
        return "REQUIRED";
      case METHOD_EXPRESSION_REQUIRED:
        return "REQUIRED";
      case PROHIBITED:
        return "PROHIBITED";
```

## RuleId[id=NonFinalFieldInEnum]
### NonFinalFieldInEnum
Non-final field `volume` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java

  private String displayName;
  private String volume;
  private int port;
  private int sslPort;
```

### NonFinalFieldInEnum
Non-final field `tags` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private int sslPort;
  private String image;
  private String[] tags;
  private boolean ssl;
  private String mavenOptions;
```

### NonFinalFieldInEnum
Non-final field `port` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String displayName;
  private String volume;
  private int port;
  private int sslPort;
  private String image;
```

### NonFinalFieldInEnum
Non-final field `mavenOptions` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String[] tags;
  private boolean ssl;
  private String mavenOptions;

  DockerServer(
```

### NonFinalFieldInEnum
Non-final field `sslPort` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String volume;
  private int port;
  private int sslPort;
  private String image;
  private String[] tags;
```

### NonFinalFieldInEnum
Non-final field `ssl` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String image;
  private String[] tags;
  private boolean ssl;
  private String mavenOptions;

```

### NonFinalFieldInEnum
Non-final field `displayName` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
      " -Djsf=provided");

  private String displayName;
  private String volume;
  private int port;
```

### NonFinalFieldInEnum
Non-final field `image` in enum 'DockerServer'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private int port;
  private int sslPort;
  private String image;
  private String[] tags;
  private boolean ssl;
```

### NonFinalFieldInEnum
Non-final field `mojarra` in enum 'FacesVersion'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/FacesVersion.java`
#### Snippet
```java

  private static FacesVersion currentVersion;
  private static boolean mojarra;
  private static boolean myfaces;

```

### NonFinalFieldInEnum
Non-final field `myfaces` in enum 'FacesVersion'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/FacesVersion.java`
#### Snippet
```java
  private static FacesVersion currentVersion;
  private static boolean mojarra;
  private static boolean myfaces;

  static {
```

### NonFinalFieldInEnum
Non-final field `names` in enum 'CsproHeader'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/UserAgent.java`
#### Snippet
```java
    STANDARD(new String[]{"Content-Security-Policy-Report-Only"});

    private String[] names;

    CsproHeader(final String[] names) {
```

### NonFinalFieldInEnum
Non-final field `names` in enum 'CspHeader'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/UserAgent.java`
#### Snippet
```java
    STANDARD(new String[]{"Content-Security-Policy"});

    private String[] names;

    CspHeader(final String[] names) {
```

### NonFinalFieldInEnum
Non-final field `cssName` in enum 'Styles'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Styles.java`
#### Snippet
```java
  gridRow;

  private String cssName;

  Styles() {
```

### NonFinalFieldInEnum
Non-final field `value` in enum 'HtmlRoleValues'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/html/HtmlRoleValues.java`
#### Snippet
```java
  TABPANEL("tabpanel");

  private String value;

  HtmlRoleValues(final String value) {
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[_]` can be simplified to '_'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationNode.java`
#### Snippet
```java
    name = matcher.group(2);
//    final String extension = matcher.group(3);
    label = StringUtils.firstToUpperCase(name.replaceAll("[_]", " "));
  }

```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerController.java`
#### Snippet
```java

  public String getSslUrl() {
    final StringBuilder builder = new StringBuilder();
    builder.append("https://localhost:");
    builder.append(sslPort);
```

### StringBufferReplaceableByString
`StringBuilder builder` can be replaced with 'String'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerController.java`
#### Snippet
```java

  public String getUrl() {
    final StringBuilder builder = new StringBuilder();
    builder.append("http://localhost:");
    builder.append(port);
```

## RuleId[id=Deprecation]
### Deprecation
'getSortedColumnId()' is deprecated
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetSortingController.java`
#### Snippet
```java

  private void sheetSorter(final SheetState sheetState, final List<SolarObject> list) {
    final String columnId = sheetState.getSortedColumnId();

    LOG.info("Sorting column '{}'", columnId);
```

### Deprecation
'isAscending()' is deprecated
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetSortingController.java`
#### Snippet
```java
    }

    if (!sheetState.isAscending()) {
      Collections.reverse(list);
    }
```

### Deprecation
'SheetState()' is deprecated
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ManifestReader.java`
#### Snippet
```java
  public ManifestReader() {

    state = new SheetState();
    state.setExpandedState(new ExpandedState(1));
    manifestTree = new ManifestEntry("Tobago Example Demo", null);
```

### Deprecation
'column' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/GridLayoutConstraintHandler.java`
#### Snippet
```java
    super(config);

    final TagAttribute oldColumn = getAttribute(Attributes.column.getName()); // deprecated
    final TagAttribute newColumn = getAttribute(Attributes.columnSpan.getName());
    columnSpan = newColumn != null ? newColumn : oldColumn;
```

### Deprecation
'row' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/GridLayoutConstraintHandler.java`
#### Snippet
```java
    columnSpan = newColumn != null ? newColumn : oldColumn;

    final TagAttribute oldRow = getAttribute(Attributes.row.getName()); // deprecated
    final TagAttribute newRow = getAttribute(Attributes.rowSpan.getName());
    rowSpan = newRow != null ? newRow : oldRow;
```

### Deprecation
'TOBAGO_CONFIG_XSD_1_6' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
    } else if ("1.6".equals(version.getVersion())) {
      LOG.warn("Using deprecated schema with version attribute 1.6 in file: '" + url + "'");
      schema = schemaFactory.newSchema(getClass().getResource(TOBAGO_CONFIG_XSD_1_6));
    } else if ("1.5".equals(version.getVersion())) {
      schema = schemaFactory.newSchema(getClass().getResource(TOBAGO_CONFIG_XSD_1_5));
```

### Deprecation
'skip' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectBoolean.java`
#### Snippet
```java

  public boolean isLabelLayoutSkip() {
    return getLabelLayout() == LabelLayout.skip;
  }

```

### Deprecation
'endElement(java.lang.String)' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
          new IllegalArgumentException());
    }
    responseWriter.endElement(name);
  }

```

### Deprecation
'writeURIAttribute(java.lang.String, java.lang.Object, java.lang.String)' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
  @Override
  public void writeURIAttribute(final String name, final Object value, final String property) throws IOException {
    responseWriter.writeURIAttribute(name, value, property);
  }

```

### Deprecation
'startElement(java.lang.String, UIComponent)' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
    }
    stack.push(name);
    responseWriter.startElement(name, currentComponent);

    usedAttributes.clear();
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectBooleanCheckboxRenderer.java`
#### Snippet
```java

  protected CssItem[] getOuterCssItems(final FacesContext facesContext, final AbstractUISelectBoolean select) {
    final boolean insideCommand = isInside(facesContext, HtmlElements.COMMAND);
    final boolean colFromLabel = !select.isLabelLayoutSkip() && !insideCommand;
    return new CssItem[]{
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectBooleanToggleRenderer.java`
#### Snippet
```java

  protected CssItem[] getOuterCssItems(final FacesContext facesContext, final AbstractUISelectBoolean select) {
    final boolean insideCommand = isInside(facesContext, HtmlElements.COMMAND);
    final boolean colFromLabel = !select.isLabelLayoutSkip() && !insideCommand;
    return new CssItem[]{
```

### Deprecation
'writeText(java.lang.Object, java.lang.String)' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/VerbatimRenderer.java`
#### Snippet
```java

    if (ComponentUtils.getBooleanAttribute(component, Attributes.escape)) {
      writer.writeText(value, null);
    } else {
      writer.write(value);
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.Grid' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
  }

  public void setHeaderGrid(final Grid headerGrid) {
    this.headerGrid = headerGrid;
  }
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.Grid' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
  }

  public Grid getHeaderGrid() {
    return headerGrid;
  }
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.Grid' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
    final MeasureList rows = new MeasureList();
    rows.add(Measure.AUTO);
    final Grid grid = new Grid(tokens, rows);

    for (final UIComponent child : header.getChildren()) {
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.Grid' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
    final MeasureList rows = new MeasureList();
    rows.add(Measure.AUTO);
    final Grid grid = new Grid(tokens, rows);

    for (final UIComponent child : header.getChildren()) {
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.OriginCell' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
        final int columnSpan = ComponentUtils.getIntAttribute(child, Attributes.columnSpan, 1);
        final int rowSpan = ComponentUtils.getIntAttribute(child, Attributes.rowSpan, 1);
        grid.add(new OriginCell(child), columnSpan, rowSpan);
      }
    }
```

### Deprecation
'getSortedColumnId()' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
                      ? event
                      : new SortActionEvent(this,
                      (UIColumn) findComponent(getSheetState(facesContext).getSortedColumnId()))});
        } catch (final Exception e) {
          LOG.warn("Sorting not possible!", e);
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.Grid' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
  private transient boolean autoLayout;

  private transient Grid headerGrid;

  @Override
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneRadioRenderer.java`
#### Snippet
```java
    final boolean inline = component.isInline();
    final Markup markup = component.getMarkup();
    final boolean isInsideCommand = isInside(facesContext, HtmlElements.COMMAND);
    final String name = getDecodingId(facesContext, component);

```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneRadioRenderer.java`
#### Snippet
```java

  private HtmlElements getTag(final FacesContext facesContext) {
    if (isInside(facesContext, HtmlElements.COMMAND)) {
      return HtmlElements.TOBAGO_SELECT_ONE_RADIO;
    } else {
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
    final String clientId = command.getClientId(facesContext);
    final boolean parentOfCommands = command.isParentOfCommands();
    final boolean dropdownSubmenu = isInside(facesContext, HtmlElements.COMMAND);
    final TobagoResponseWriter writer = getResponseWriter(facesContext);

```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
              || child instanceof AbstractUISelectOneRadio
              || child instanceof AbstractUISeparator) {
            insideBegin(facesContext, HtmlElements.COMMAND); // XXX may refactor / cleanup
            child.encodeAll(facesContext);
            insideEnd(facesContext, HtmlElements.COMMAND); // XXX may refactor / cleanup
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
            insideBegin(facesContext, HtmlElements.COMMAND); // XXX may refactor / cleanup
            child.encodeAll(facesContext);
            insideEnd(facesContext, HtmlElements.COMMAND); // XXX may refactor / cleanup
          } else {
            writer.startElement(HtmlElements.DIV);
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
    final boolean autoSpacing = component.getAutoSpacing(facesContext);
    final boolean parentOfCommands = component.isParentOfCommands();
    final boolean dropdownSubmenu = isInside(facesContext, HtmlElements.COMMAND);
    final Markup markup = component.getMarkup() != null ? component.getMarkup() : Markup.NULL;

```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectBooleanRendererBase.java`
#### Snippet
```java
    final String itemImage = component.getItemImage();
    final Markup markup = component.getMarkup();
    final boolean insideCommand = isInside(facesContext, HtmlElements.COMMAND);

    writer.startElement(insideCommand ? getComponentTag() : HtmlElements.DIV);
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectBooleanRendererBase.java`
#### Snippet
```java
  protected void encodeEndField(final FacesContext facesContext, final T component) throws IOException {
    final TobagoResponseWriter writer = getResponseWriter(facesContext);
    final boolean insideCommand = isInside(facesContext, HtmlElements.COMMAND);

    writer.endElement(insideCommand ? getComponentTag() : HtmlElements.DIV);
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
  @Override
  public void encodeBeginInternal(FacesContext facesContext, T component) throws IOException {
    if (isInside(facesContext, HtmlElements.COMMAND)) {
      encodeBeginField(facesContext, component);
    } else {
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
  @Override
  public void encodeEndInternal(FacesContext facesContext, T component) throws IOException {
    if (isInside(facesContext, HtmlElements.COMMAND)) {
      encodeEndField(facesContext, component);
    } else {
```

### Deprecation
'isInline()' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/FormRenderer.java`
#### Snippet
```java
      final TobagoResponseWriter writer = getResponseWriter(facesContext);
      final String clientId = component.getClientId(facesContext);
      final boolean inline = component.isInline();

      writer.startElement(HtmlElements.TOBAGO_FORM);
```

### Deprecation
'TREE_PARENT' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java
        // todo writer.writeIdAttribute(parentId + SUB_SEPARATOR + AbstractUITree.SUFFIX_PARENT);
        // todo like in TreeListboxRenderer
        writer.writeAttribute(DataAttributes.TREE_PARENT, parentId, false);
        writer.writeAttribute(CustomAttributes.PARENT, parentId, false);
      }
```

### Deprecation
'SUFFIX_MARKED' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java
      // marked
      final String marked =
          requestParameterMap.get(clientId + ComponentUtils.SUB_SEPARATOR + AbstractUITree.SUFFIX_MARKED);
      if (marked != null) {
        final String searchString = clientId + UINamingContainer.getSeparatorChar(facesContext) + nodeStateId;
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SeparatorRenderer.java`
#### Snippet
```java
    writer.writeIdAttribute(clientId);

    if (isInside(facesContext, HtmlElements.COMMAND)) {
      writer.writeClassAttribute(BootstrapClass.DROPDOWN_DIVIDER, component.getCustomClass());
    } else {
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LinkRenderer.java`
#### Snippet
```java
    final boolean disabled = command.isDisabled();
    final boolean anchor = (command.getLink() != null || command.getOutcome() != null) && !disabled;
    final boolean dropdownSubmenu = isInside(facesContext, HtmlElements.COMMAND);
    final Markup markup = command.getMarkup() != null ? command.getMarkup() : Markup.NULL;

```

### Deprecation
'SELECTABLE' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeRenderer.java`
#### Snippet
```java
    final Selectable selectable = component.getSelectable();
    if (selectable.isSupportedByTree()) {
      writer.writeAttribute(DataAttributes.SELECTABLE, selectable.name(), false);
      writer.writeAttribute(CustomAttributes.SELECTABLE, selectable.name(), false);
    }
```

### Deprecation
'isCompact()' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/OutRenderer.java`
#### Snippet
```java
  @Override
  public void encodeBeginInternal(final FacesContext facesContext, final T component) throws IOException {
    final boolean plain = component.isPlain() || component.isCompact() || !component.isCreateSpan();

    if (isInside(facesContext, HtmlElements.TOBAGO_IN)) {
```

### Deprecation
'isCreateSpan()' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/OutRenderer.java`
#### Snippet
```java
  @Override
  public void encodeBeginInternal(final FacesContext facesContext, final T component) throws IOException {
    final boolean plain = component.isPlain() || component.isCompact() || !component.isCreateSpan();

    if (isInside(facesContext, HtmlElements.TOBAGO_IN)) {
```

### Deprecation
'isCompact()' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/OutRenderer.java`
#### Snippet
```java
  @Override
  public void encodeEndInternal(final FacesContext facesContext, final T component) throws IOException {
    final boolean plain = component.isPlain() || component.isCompact() || !component.isCreateSpan();

    if (isInside(facesContext, HtmlElements.TOBAGO_IN)) {
```

### Deprecation
'isCreateSpan()' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/OutRenderer.java`
#### Snippet
```java
  @Override
  public void encodeEndInternal(final FacesContext facesContext, final T component) throws IOException {
    final boolean plain = component.isPlain() || component.isCompact() || !component.isCreateSpan();

    if (isInside(facesContext, HtmlElements.TOBAGO_IN)) {
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyCheckboxRenderer.java`
#### Snippet
```java

  private HtmlElements getTag(final FacesContext facesContext) {
    if (isInside(facesContext, HtmlElements.COMMAND)) {
      return HtmlElements.TOBAGO_SELECT_MANY_CHECKBOX;
    } else {
```

### Deprecation
'COMMAND' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyCheckboxRenderer.java`
#### Snippet
```java
    final boolean inline = component.isInline();
    final Markup markup = component.getMarkup();
    final boolean isInsideCommand = isInside(facesContext, HtmlElements.COMMAND);

    writer.startElement(getTag(facesContext));
```

### Deprecation
'valueOf(java.lang.String)' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/CustomClassEditor.java`
#### Snippet
```java
  @Override
  public void setAsText(final String text) throws IllegalArgumentException {
    setValue(CustomClass.valueOf(text));
  }

```

### Deprecation
'createCollapsible(FacesContext, UIComponent)' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
          ComponentUtils.getConfirmation(holder),
          null,
          TobagoClientBehaviorRenderer.createCollapsible(facesContext, holder),
          holder.isOmit()));
    }
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.Grid' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java

    final Selectable selectable = sheet.getSelectable();
    final Grid grid = sheet.getHeaderGrid();
    final boolean autoLayout = sheet.isAutoLayout();
    final boolean multiHeader = grid.getRowCount() > 1;
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.Cell' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
          offset++;
        } else {
          final Cell cell = grid.getCell(j - offset, i);
          if (cell instanceof OriginCell) {
            writer.startElement(HtmlElements.TH);
```

### Deprecation
'org.apache.myfaces.tobago.internal.layout.OriginCell' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
        } else {
          final Cell cell = grid.getCell(j - offset, i);
          if (cell instanceof OriginCell) {
            writer.startElement(HtmlElements.TH);
            if (cell.getColumnSpan() > 1) {
```

### Deprecation
'TREE_PARENT' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
        // todo writer.writeIdAttribute(parentId + SUB_SEPARATOR + AbstractUITree.SUFFIX_PARENT);
        // todo like in TreeListboxRenderer
        writer.writeAttribute(DataAttributes.TREE_PARENT, parentId, false);
      }

```

### Deprecation
'skip' is deprecated
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
            out.setRendered(ComponentUtils.getBooleanAttribute(column, Attributes.rendered));
          }
          out.setLabelLayout(LabelLayout.skip);
          header.getChildren().add(out);
        }
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`(retVal == null) ? false : retVal` can be simplified to 'retVal!=null \&\& retVal'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java
  public boolean isImmediate() {
    Boolean retVal = (Boolean) getStateHelper().eval(ATTR_IMMEDIATE);
    retVal = (retVal == null) ? false : retVal;
    return retVal;
  }
```

### SimplifiableConditionalExpression
`(retVal == null) ? false : retVal` can be simplified to 'retVal!=null \&\& retVal'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java
  public boolean isDisabled() {
    Boolean retVal = (Boolean) getStateHelper().eval(ATTR_DISABLED);
    retVal = (retVal == null) ? false : retVal;
    return retVal;
  }
```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PartialReloadController.java`
#### Snippet
```java

  private String logAndNavigate(final String navValue) {
    LOG.info("Return navigate value: " + navValue + "");
    return navValue;
  }
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java

  public static void main(final String[] args) {
    LOG.debug("" + new RandomList((byte) 9).list);
    final Sudoku sudoku = new Sudoku();
    LOG.debug("---------------------------------------------------------------------------------------------");
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
    LOG.debug("---------------------------------------------------------------------------------------------");
    final Result result = sudoku.solve();
    LOG.debug("" + result);
    LOG.debug("---------------------------------------------------------------------------------------------");
    LOG.debug("" + sudoku);
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
    LOG.debug("" + result);
    LOG.debug("---------------------------------------------------------------------------------------------");
    LOG.debug("" + sudoku);
  }

```

### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIProgress.java`
#### Snippet
```java
          rangeValue = ((Number) model).doubleValue();
        } else if (model != null) {
          rangeValue = Double.parseDouble("" + model);
        }
        if (getMax() != null) {
```

### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIStars.java`
#### Snippet
```java
          rangeValue = ((Number) model).intValue();
        } else if (model != null && !model.equals("")) {
          rangeValue = Integer.valueOf("" + model);
        } else {
          rangeValue = 0;
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.max()' call
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetConfig.java`
#### Snippet
```java
  public int getSheetFirstValue() {
    final int value = getSheetFirst();
    return (value - 1) < 0 ? 0 : value - 1;
  }

```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'transientFlag' is assigned to itself
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
    @Override
    public void setTransient(final boolean transientFlagParameter) {
      this.transientFlag = transientFlag;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/Jsr303Bean.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  @NotNull
  private String required;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@jakarta.validation.constraints.NotNull'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ValidationJsr303Controller.java`
#### Snippet
```java
public class ValidationJsr303Controller implements Serializable {

  @NotNull
  private String required;

```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/FlexLayoutTagDeclaration.java`
#### Snippet
```java

/**
 * Renders a &lt;a href=https://www.w3.org/TR/css-flexbox-1/&gt;Flexible Box Layout&lt;/a&gt;.
 *
 * @since 3.0.0
```

### JavadocLinkAsPlainText
Link specified as plain text
in `tobago-core/src/main/java/org/apache/myfaces/tobago/sanitizer/JsoupSanitizer.java`
#### Snippet
```java

/**
 * The JsoupSanitizer uses the jsoup library http://jsoup.org/ to check against malicious code.
 */
public class JsoupSanitizer implements Sanitizer {
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `ZoneId.of()` is ignored
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DateController.java`
#### Snippet
```java
      final FacesContext facesContext, final UIComponent uiComponent, final Object string) throws ValidatorException {
    try {
      ZoneId.of((String) string);
    } catch (Exception e) {
      throw new ValidatorException(new FacesMessage("Invalid Time Zone Identifier!"), e);
```

### IgnoreResultOfCall
Result of `Matcher.find()` is ignored
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationNode.java`
#### Snippet
```java
//      final Pattern pattern = Pattern.compile("([\\d\\d/]*\\d\\d[^/]*)/([^/]*)\\.(xhtml)");
    final Matcher matcher = pattern.matcher(path);
    matcher.find();
    branch = matcher.group(1);
    name = matcher.group(2);
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `fatalError()` is identical to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java

  @Override
  public void fatalError(final SAXParseException e) throws SAXException {
    throw e;
  }
```

### RedundantMethodOverride
Method `startDocument()` is identical to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/XmlResponseWriter.java`
#### Snippet
```java

  @Override
  public void startDocument() throws IOException {
  }

```

### RedundantMethodOverride
Method `endDocument()` is identical to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/XmlResponseWriter.java`
#### Snippet
```java

  @Override
  public void endDocument() throws IOException {
  }
}
```

### RedundantMethodOverride
Method `endDocument()` is identical to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/HtmlResponseWriter.java`
#### Snippet
```java

  @Override
  public void endDocument() throws IOException {
  }
}
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ConverterTagDeclaration.java`
#### Snippet
```java
   * The converterId of a registered converter.
   */
  @TagAttribute(name = "converterId", type = "java.lang.String")
  void setConverterId(ValueExpression converterId);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/TabChangeListenerTagDeclaration.java`
#### Snippet
```java
   * created and registered.
   */
  @TagAttribute(required = true, name = "type", type = "java.lang.String")
  void setType(ValueExpression type);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/AttributeTagDeclaration.java`
#### Snippet
```java
   * The name of the attribute in the parent component.
   */
  @TagAttribute(required = true, name = "name", type = "java.lang.String")
  void setName(ValueExpression name);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/AttributeTagDeclaration.java`
#### Snippet
```java
   * The value of the attribute in the parent component.
   */
  @TagAttribute(required = true, name = "value", type = "java.lang.String")
  void setValue(ValueExpression value);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/SelectItemTagDeclaration.java`
#### Snippet
```java
  @Deprecated
  @TagAttribute
  @UIComponentTagAttribute(type = {"java.lang.String"})
  void setItemDescription(String itemDescription);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/SelectItemsTagDeclaration.java`
#### Snippet
```java
    uiComponent = "org.apache.myfaces.tobago.component.UISelectItems",
    uiComponentFacesClass = "jakarta.faces.component.UISelectItems",
    isComponentAlreadyDefined = false,
    allowedChildComponenents = "NONE")
public interface SelectItemsTagDeclaration extends HasId, HasBinding, HasItemLabel, HasItemImage, HasTip {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/DataAttributeTagDeclaration.java`
#### Snippet
```java
   * The name of the attribute in the parent component.
   */
  @TagAttribute(required = true, name = "name", type = "java.lang.String")
  void setName(ValueExpression name);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/DataAttributeTagDeclaration.java`
#### Snippet
```java
   * The value of the attribute in the parent component.
   */
  @TagAttribute(required = true, name = "value", type = "java.lang.String")
  void setValue(ValueExpression value);
}
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ResetInputActionListenerTagDeclaration.java`
#### Snippet
```java
   * them, all containing EditableValueHolder will be reset.
   */
  @TagAttribute(required = false, name = Attributes.EXECUTE, type = "java.lang.String")
  void setExecute(jakarta.el.ValueExpression execute);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ResetInputActionListenerTagDeclaration.java`
#### Snippet
```java
   * them, all containing EditableValueHolder will be reset.
   */
  @TagAttribute(required = false, name = Attributes.EXECUTE, type = "java.lang.String")
  void setExecute(jakarta.el.ValueExpression execute);

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ValidateFileItemTagDeclaration.java`
#### Snippet
```java
  void setMaxSize(ValueExpression maxSize);

  @TagAttribute(name = "contentType", type = "java.lang.String")
  void setContentType(ValueExpression contentType);

```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/AuthorizationHelper.java`
#### Snippet
```java

      UIComponent compositeComponent = getParentCompositeComponent(component);
      if (compositeComponent != null) {
        final int attrNameStart = expression.indexOf(CC_ATTRS) + CC_ATTRS.length();
        final int attrNameEnd = expression.substring(attrNameStart).contains(".")
```

### IfStatementWithIdenticalBranches
Common part can be extracted removing branch
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/CommandMap.java`
#### Snippet
```java
      return m2;
    } else {
      if (m2 == null) {
        return m1;
      } else {
```

## RuleId[id=SlowAbstractSetRemoveAll]
### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/ExpandedState.java`
#### Snippet
```java
        }
      }
      expandedSet.removeAll(toRemove);
      collapsedSet.clear();
    } else {
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/ExpandedState.java`
#### Snippet
```java
        }
      }
      collapsedSet.removeAll(toRemove);
    }
  }
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/ExpandedState.java`
#### Snippet
```java
        }
      }
      collapsedSet.removeAll(toRemove);
      expandedSet.clear();
    } else {
```

### SlowAbstractSetRemoveAll
Call to 'set.removeAll(list)' may work slowly
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/ExpandedState.java`
#### Snippet
```java
        }
      }
      expandedSet.removeAll(toRemove);
    }
  }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `returnValue` initializer `null` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
  @Override
  public Object remove(final Serializable key) {
    Object returnValue = null;
    if (createDeltas()) {
      if (deltas.containsKey(key)) {
```

### UnusedAssignment
Variable `returnValue` initializer `null` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
  @Override
  public Object put(final Serializable key, final Object value) {
    Object returnValue = null;
    if (createDeltas()) {
      if (deltas.containsKey(key)) {
```

### UnusedAssignment
The value `markup.add(ComponentUtils.markupOfSeverity(maxSeverity))` assigned to `markup` is never used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TabGroupRenderer.java`
#### Snippet
```java
              = ComponentUtils.getMaximumSeverityOfChildrenMessages(facesContext, tab);
          if (maxSeverity != null) {
            markup = markup.add(ComponentUtils.markupOfSeverity(maxSeverity));
          }

```

### UnusedAssignment
The value `Markup.DISABLED.add(markup)` assigned to `markup` is never used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
        if (item.isDisabled()) {
          writer.writeAttribute(HtmlAttributes.DISABLED, true);
          markup = Markup.DISABLED.add(markup);
        }
        writer.writeClassAttribute(optionClass);
```

### UnusedAssignment
The value `Markup.NULL` assigned to `markup` is never used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
            Markup markup = column.getMarkup();
            if (markup == null) {
              markup = Markup.NULL;
            }
            writer.writeClassAttribute(
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `exceptionType == null` is always `true` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/WebXmlUtils.java`
#### Snippet
```java
            } else if ("500".equals(errorCode)) {
              location500 = location;
            } else if (errorCode == null && exceptionType == null) {
              locationDefault = location;
            }
```

### ConstantValue
Result of `back.size()` is always '0'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
    this.back.clear();
    TreeNode current = data;
    for (int counter = back.size(); current != null; counter++) {

      mapping.put(counter, new Data(current));
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
        collect.add((AbstractUIForm) child);
      } else {
        findSubForms(collect, child);
      }
    }
```

### ConstantValue
Condition `facet != null && !(facet instanceof ValueHolder)` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      final ValueHolder valueHolder = (ValueHolder) facet;
      return "" + valueHolder.getValue();
    } else if (facet != null && !(facet instanceof ValueHolder)) {
      LOG.warn("The content of a confirmation facet must be a ValueHolder. Use e. g. <tc:out>.");
    }
```

### ConstantValue
Condition `!(facet instanceof ValueHolder)` is always `false` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      final ValueHolder valueHolder = (ValueHolder) facet;
      return "" + valueHolder.getValue();
    } else if (facet != null && !(facet instanceof ValueHolder)) {
      LOG.warn("The content of a confirmation facet must be a ValueHolder. Use e. g. <tc:out>.");
    }
```

### ConstantValue
Condition `c != null` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      return findPageBreadthFirst(c);
    } else {
      while (c != null) {
        if (c instanceof AbstractUIPage) {
          return (AbstractUIPage) c;
```

### ConstantValue
Value `exception` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
        final Throwable exception = events.next().getContext().getException();
        if (!(exception instanceof AbortProcessingException)) {
          final String errorPageLocation = WebXmlUtils.getErrorPageLocation(exception);

          if (errorPageLocation != null
```

### ConstantValue
Value `exception` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
                  (HttpServletResponse) facesContext.getExternalContext().getResponse();

              request.setAttribute("jakarta.servlet.error.exception", exception);
              request.setAttribute("jakarta.servlet.error.exception_type", exception.getClass());
              request.setAttribute("jakarta.servlet.error.message", exception.getMessage());
```

### ConstantValue
Condition `cause != null` is always `false` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java

        if (cause instanceof ViewExpiredException
            || cause != null && cause.getCause() instanceof ViewExpiredException) {
          final ViewExpiredException viewExpiredException = (ViewExpiredException)
              (cause instanceof ViewExpiredException ? cause : cause.getCause());
```

### ConstantValue
Condition `cause != null && cause.getCause() instanceof ViewExpiredException` is always `false` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java

        if (cause instanceof ViewExpiredException
            || cause != null && cause.getCause() instanceof ViewExpiredException) {
          final ViewExpiredException viewExpiredException = (ViewExpiredException)
              (cause instanceof ViewExpiredException ? cause : cause.getCause());
```

### ConstantValue
Condition `cause instanceof ViewExpiredException` is always `true`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
            || cause != null && cause.getCause() instanceof ViewExpiredException) {
          final ViewExpiredException viewExpiredException = (ViewExpiredException)
              (cause instanceof ViewExpiredException ? cause : cause.getCause());
          try {
            facesContext.addMessage(null,
```

### ConstantValue
Condition `cause instanceof FileNotFoundException` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
        } else {
          try {
            final boolean error404 = cause instanceof FileNotFoundException
                || cause != null && cause.getCause() instanceof FileNotFoundException;
            final FacesMessage message;
```

### ConstantValue
Condition `cause instanceof FileNotFoundException || cause != null && cause.getCause() instance...` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
        } else {
          try {
            final boolean error404 = cause instanceof FileNotFoundException
                || cause != null && cause.getCause() instanceof FileNotFoundException;
            final FacesMessage message;
            if (error404) {
```

### ConstantValue
Value `cause` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
        } else {
          try {
            final boolean error404 = cause instanceof FileNotFoundException
                || cause != null && cause.getCause() instanceof FileNotFoundException;
            final FacesMessage message;
```

### ConstantValue
Condition `cause != null` is always `false` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
          try {
            final boolean error404 = cause instanceof FileNotFoundException
                || cause != null && cause.getCause() instanceof FileNotFoundException;
            final FacesMessage message;
            if (error404) {
```

### ConstantValue
Condition `cause != null && cause.getCause() instanceof FileNotFoundException` is always `false` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
          try {
            final boolean error404 = cause instanceof FileNotFoundException
                || cause != null && cause.getCause() instanceof FileNotFoundException;
            final FacesMessage message;
            if (error404) {
```

### ConstantValue
Condition `error404` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
                || cause != null && cause.getCause() instanceof FileNotFoundException;
            final FacesMessage message;
            if (error404) {
              message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                  "The page was not found!",
```

### ConstantValue
Value `cause` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
                  "An unknown error has occurred!" + " xxx");
              facesContext.getExternalContext().setResponseStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
              LOG.warn("Handling 500 exception.", cause);
            }
            facesContext.addMessage(null, message);
```

### ConstantValue
Value `parent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/ConverterHandler.java`
#### Snippet
```java
      }
    } else {
      throw new TagException(tag, "Parent is not of type ValueHolder, type is: " + parent);
    }
  }
```

### ConstantValue
Value `parent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/TabChangeListenerHandler.java`
#### Snippet
```java
      }
    } else {
      throw new TagException(tag, "Parent is not of type TabChangeSource, type is: " + parent);
    }
  }
```

### ConstantValue
Value `parent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/EventHandler.java`
#### Snippet
```java
      throw new TagException(this.tag,
          "Parent is not composite component or of type ClientBehaviorHolder, type is: "
              + parent);
    }
  }
```

### ConstantValue
Condition `this == markup` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/Markup.java`
#### Snippet
```java
    }
    if (this == NULL) {
      return this == markup;
    }
    if (markup.value != null) {
```

### ConstantValue
Value `parent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/ResetInputActionListenerHandler.java`
#### Snippet
```java
      }
    } else {
      throw new TagException(tag, "Parent is not of type ActionSource, type is: " + parent);
    }
  }
```

### ConstantValue
Value `column` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      } catch (Exception e) {
        LOG.error("Error while extracting sortMethod :" + e.getMessage(), e);
        addNotSortableMessage(facesContext, column);
      }
    } else {
```

### ConstantValue
Condition `!success` is always `true`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
    }

    if (!success) {
      sheetState.resetSortState();
    }
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      result = child;
      if (child instanceof UISelectMany
          || child instanceof UISelectOne
          || child instanceof UISelectBoolean
          || child instanceof AbstractUICommand && child.getChildren().isEmpty()
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      if (child instanceof UISelectMany
          || child instanceof UISelectOne
          || child instanceof UISelectBoolean
          || child instanceof AbstractUICommand && child.getChildren().isEmpty()
          || child instanceof UIInput && RendererTypes.HIDDEN.equals(child.getRendererType())) {
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
          || child instanceof UISelectOne
          || child instanceof UISelectBoolean
          || child instanceof AbstractUICommand && child.getChildren().isEmpty()
          || child instanceof UIInput && RendererTypes.HIDDEN.equals(child.getRendererType())) {
        continue;
```

### ConstantValue
Condition `child instanceof UIInput && RendererTypes.HIDDEN.equals(child.getRendererType())` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
          || child instanceof UISelectBoolean
          || child instanceof AbstractUICommand && child.getChildren().isEmpty()
          || child instanceof UIInput && RendererTypes.HIDDEN.equals(child.getRendererType())) {
        continue;
        // look for a better component if any
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
          || child instanceof UISelectBoolean
          || child instanceof AbstractUICommand && child.getChildren().isEmpty()
          || child instanceof UIInput && RendererTypes.HIDDEN.equals(child.getRendererType())) {
        continue;
        // look for a better component if any
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
        // look for a better component if any
      }
      if (child instanceof UIOutput) {
        break;
      }
```

### ConstantValue
Condition `child instanceof UICommand || child instanceof jakarta.faces.component.UIPanel` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
        break;
      }
      if (child instanceof UICommand
          || child instanceof jakarta.faces.component.UIPanel) {
        child = getFirstSortableChild(child.getChildren());
        if (child instanceof UIOutput) {
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
        break;
      }
      if (child instanceof UICommand
          || child instanceof jakarta.faces.component.UIPanel) {
        child = getFirstSortableChild(child.getChildren());
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      }
      if (child instanceof UICommand
          || child instanceof jakarta.faces.component.UIPanel) {
        child = getFirstSortableChild(child.getChildren());
        if (child instanceof UIOutput) {
```

### ConstantValue
Value `c` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
        // classes are found. If there is no more elements
        // that conform this condition, just return false.
        if (c instanceof UISelectItem || c instanceof UISelectItems) {
          child = c;
          break;
```

### ConstantValue
Value `transition` is always 'false'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java
    final Boolean transition = command.getTransition();
    if (transition != null && !transition) { // true is the default, so encoding is needed.
      encode(builder, "transition", transition);
    }
    final String target = command.getTarget();
```

### ConstantValue
Value `facet` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
      return facet.getChildren();
    } else {
      return Collections.singletonList(facet);
    }
  }
```

### ConstantValue
Value `clientBehavior` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
      }
    } else {
      LOG.warn("Ignoring: '{}'", clientBehavior);
    }
    return null;
```

### ConstantValue
Value `event` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIConfig.java`
#### Snippet
```java
    super.processEvent(event);

    if (event instanceof PreRenderViewEvent || event instanceof PostRestoreStateEvent) {

      final Boolean focusOnError = getFocusOnError();
```

### ConstantValue
Value `event` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIConfig.java`
#### Snippet
```java
      }

    } else if (event instanceof PostAddToViewEvent) {
      // NOTE: PreRenderViewEvent can not be used
      getFacesContext().getViewRoot().subscribeToEvent(PreRenderViewEvent.class, this);
```

### ConstantValue
Value `event` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIStyle.java`
#### Snippet
```java
        root.addComponentResource(facesContext, this);
      }
    } else if (event instanceof PostAddToViewEvent) {
      if (StringUtils.isNotBlank(getFile())) {
        // MyFaces core is removing the component resources in head if the view will be recreated before rendering.
```

### ConstantValue
Value `event` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIScript.java`
#### Snippet
```java
    if (event instanceof PreRenderViewEvent) {
      addComponentResource();
    } else if (event instanceof PostAddToViewEvent) {
      if (FacesVersion.supports21() || !FacesVersion.isMyfaces()) {
        // MyFaces core is removing the component resources in head if the view will be recreated before rendering.
```

### ConstantValue
Condition `child.isRendered() && !(child instanceof AbstractUIEvent) && (child instance...` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICommand.java`
#### Snippet
```java
      parentOfCommands = false;
      for (final UIComponent child : getChildren()) {
        if (child.isRendered()
            && !(child instanceof AbstractUIEvent)
            && (child instanceof UICommand || child instanceof UIInput)) {
          parentOfCommands = true;
          break;
```

### ConstantValue
Condition `!(child instanceof AbstractUIEvent)` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICommand.java`
#### Snippet
```java
      for (final UIComponent child : getChildren()) {
        if (child.isRendered()
            && !(child instanceof AbstractUIEvent)
            && (child instanceof UICommand || child instanceof UIInput)) {
          parentOfCommands = true;
```

### ConstantValue
Condition `!name.isVoid()` is always `true`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/TobagoResponseWriterBase.java`
#### Snippet
```java
      closeEmptyTag();
    } else {
      if (!name.isVoid()) {
        level--;
      }
```

### ConstantValue
Condition `attachedObject instanceof List` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java

      return new AttachedStateWrapper(attachedObject.getClass(), holder.saveState(context));
    } else if (attachedObject instanceof List) {
      final List<Object> lst = new ArrayList<>(((List<?>) attachedObject).size());
      for (final Object item : (List<?>) attachedObject) {
```

### ConstantValue
Condition `value instanceof List` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
        final Object value = get(i);

        if (value instanceof StateHolder || value instanceof List || !(value instanceof Serializable)) {
          values[i] = saveAttachedState(context, value);
        } else {
```

### ConstantValue
Condition `value instanceof List` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
        final Object value = entry.getValue();

        if (value instanceof StateHolder || value instanceof List || !(value instanceof Serializable)) {
          mapArr[cnt + 1] = saveAttachedState(context, value);
        } else {
```

### ConstantValue
Condition `value instanceof List` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      // is to handle List, StateHolder or non Serializable instances.
      // we check it here, to prevent unnecessary calls.
      if (value instanceof StateHolder || value instanceof List || !(value instanceof Serializable)) {
        final Object savedValue = saveAttachedState(context, value);
        retArr[cnt + 1] = savedValue;
```

### ConstantValue
Value `kid` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITabGroup.java`
#### Snippet
```java
        //}
      } else {
        LOG.error("Invalid component in UITabGroup: " + kid);
      }
    }
```

### ConstantValue
Value `component` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITabGroup.java`
#### Snippet
```java
        i++;
      } else {
        LOG.error("Invalid component in UITabGroup: " + component);
      }
    }
```

### ConstantValue
Value `event` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIMetaLink.java`
#### Snippet
```java
    if (event instanceof PreRenderViewEvent) {
      addComponentResource();
    } else if (event instanceof PostAddToViewEvent) {
      if (FacesVersion.supports21() || !FacesVersion.isMyfaces()) {
        // MyFaces core is removing the component resources in head if the view will be recreated before rendering.
```

### ConstantValue
Value `event` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIMeta.java`
#### Snippet
```java
    if (event instanceof PreRenderViewEvent) {
      addComponentResource();
    } else if (event instanceof PostAddToViewEvent) {
      if (FacesVersion.supports21() || !FacesVersion.isMyfaces()) {
        // MyFaces core is removing the component resources in head if the view will be recreated before rendering.
```

### ConstantValue
Value `validator` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/InRenderer.java`
#### Snippet
```java
        maxLength = lengthValidator.getMaximum();
        minLength = lengthValidator.getMinimum();
      } else if (validator instanceof RegexValidator) {
        final RegexValidator regexValidator = (RegexValidator) validator;
        pattern = regexValidator.getPattern();
```

### ConstantValue
Condition `pattern != null` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/InRenderer.java`
#### Snippet
```java
      writer.writeAttribute(HtmlAttributes.MINLENGTH, minLength);
    }
    if (pattern != null) {
      writer.writeAttribute(HtmlAttributes.PATTERN, pattern, true);
    }
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
        if (child instanceof AbstractUIColumnBase) {
          result.add((AbstractUIColumnBase) child);
        } else if (child instanceof AbstractUIData) {
          // ignore columns of nested sheets
        } else {
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
          // ignore columns of nested sheets
        } else {
          findColumns(child, result, all);
        }
      }
```

### ConstantValue
Value `all` is always 'true'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
          // ignore columns of nested sheets
        } else {
          findColumns(child, result, all);
        }
      }
```

### ConstantValue
Value `facesEvent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
      final MethodExpression listener = getStateChangeListenerExpression();
      listener.invoke(getFacesContext().getELContext(), new Object[]{facesEvent});
    } else if (facesEvent instanceof PageActionEvent) {
      if (facesEvent.getComponent() == this) {
        final MethodExpression listener = getStateChangeListenerExpression();
```

### ConstantValue
Value `facesEvent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
        performPaging((PageActionEvent) facesEvent);
      }
    } else if (facesEvent instanceof SortActionEvent) {
      getSheetState(getFacesContext()).updateSortState(((SortActionEvent) facesEvent).getColumn().getId());
      sort(getFacesContext(), (SortActionEvent) facesEvent);
```

### ConstantValue
Condition `facesEvent instanceof SheetStateChangeEvent || facesEvent instanceof PageActionEvent` is always `true` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java

    if (facesEvent.getComponent() == this
        && (facesEvent instanceof SheetStateChangeEvent
        || facesEvent instanceof PageActionEvent)) {
      facesEvent.setPhaseId(PhaseId.INVOKE_APPLICATION);
      parent.queueEvent(facesEvent);
```

### ConstantValue
Condition `child.isRendered() && !(child instanceof UIParameter) && !(child instanceof ...` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java

      for (final UIComponent child : component.getChildren()) {
        if (child.isRendered()
            && !(child instanceof UIParameter)
            && !(child instanceof AbstractUIBadge)) {
          if (child instanceof AbstractUIStyle) {
            if (renderLater == null) {
```

### ConstantValue
Condition `!(child instanceof UIParameter)` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
      for (final UIComponent child : component.getChildren()) {
        if (child.isRendered()
            && !(child instanceof UIParameter)
            && !(child instanceof AbstractUIBadge)) {
          if (child instanceof AbstractUIStyle) {
```

### ConstantValue
Condition `renderLater != null` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
      writer.endElement(HtmlElements.DIV);

      if (renderLater != null) {
        for (UIComponent child : renderLater) {
          child.encodeAll(facesContext);
```

### ConstantValue
Value `clientBehavior` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
        return ajaxBehavior.isImmediate();
      }
    } else if (clientBehavior instanceof EventBehavior) {
      EventBehavior eventBehavior = (EventBehavior) clientBehavior;
      if (eventBehavior.isImmediateSet()) {
```

### ConstantValue
Value `component` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
      return ((EditableValueHolder) component).isImmediate();
    }
    if (component instanceof ActionSource) {
      return ((ActionSource) component).isImmediate();
    }
```

### ConstantValue
Value `clientBehavior` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java

      dispatchBehaviorEvent(component, ajaxBehavior);
    } else if (clientBehavior instanceof EventBehavior) {
      final EventBehavior eventBehavior = (EventBehavior) clientBehavior;
      final AbstractUIEvent abstractUIEvent = RenderUtils.getAbstractUIEvent(component, eventBehavior);
```

### ConstantValue
Value `behavior` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
      }
      renderIds = ComponentUtils.evaluateClientIds(facesContext, uiComponent, render.toArray(new String[0]));
    } else if (behavior instanceof EventBehavior) { // <tc:event>
      final EventBehavior eventBehavior = (EventBehavior) behavior;
      final AbstractUIEvent event = RenderUtils.getAbstractUIEvent(uiComponent, eventBehavior);
```

### ConstantValue
Condition `!(child instanceof UISelectItems)` is always `true` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        // classes are found. If there is no more elements
        // that conform this condition, just return false.
        while (!(child instanceof UISelectItem) && !(child instanceof UISelectItems)) {
          // Try to skip it
          if (children.hasNext()) {
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        // classes are found. If there is no more elements
        // that conform this condition, just return false.
        while (!(child instanceof UISelectItem) && !(child instanceof UISelectItems)) {
          // Try to skip it
          if (children.hasNext()) {
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
        if (child instanceof AbstractUIButton) {
          child.encodeAll(facesContext);
        } else if (child instanceof AbstractUIOut) {
          child.encodeAll(facesContext);
        } else if (child instanceof AbstractUISelectOneChoice) {
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
        } else if (child instanceof AbstractUIOut) {
          child.encodeAll(facesContext);
        } else if (child instanceof AbstractUISelectOneChoice) {
          child.encodeAll(facesContext);
        } else {
```

### ConstantValue
Condition `!(child instanceof AbstractUILink)` is always `true` when reached
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/ColumnRenderer.java`
#### Snippet
```java
  private boolean isPure(final AbstractUIColumn column) {
    for (final UIComponent child : column.getChildren()) {
      if (!(child instanceof AbstractUIOut) && !(child instanceof AbstractUILink)) {
        return true;
      }
```

### ConstantValue
Value `child` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/ColumnRenderer.java`
#### Snippet
```java
  private boolean isPure(final AbstractUIColumn column) {
    for (final UIComponent child : column.getChildren()) {
      if (!(child instanceof AbstractUIOut) && !(child instanceof AbstractUILink)) {
        return true;
      }
```

### ConstantValue
Condition `corresponding != null` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LabelRenderer.java`
#### Snippet
```java
      forId = ((SupportFieldId) corresponding).getFieldId(facesContext);
    } else {
      forId = corresponding != null ? corresponding.getClientId(facesContext) : null;
    }
    final String clientId = component.getClientId(facesContext);
```

### ConstantValue
Value `validator` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TextareaRenderer.java`
#### Snippet
```java
        maxLength = lengthValidator.getMaximum();
        minLength = lengthValidator.getMinimum();
      } else if (validator instanceof RegexValidator) {
        final RegexValidator regexValidator = (RegexValidator) validator;
        pattern = regexValidator.getPattern();
```

### ConstantValue
Condition `pattern != null` is always `false`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TextareaRenderer.java`
#### Snippet
```java
      writer.writeAttribute(HtmlAttributes.MINLENGTH, minLength);
    }
    if (pattern != null) {
      writer.writeAttribute(HtmlAttributes.PATTERN, pattern, true);
    }
```

### ConstantValue
Value `uiComponent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
        final FacesContext facesContext, final Collection<? extends UIComponent> collection, final String charset) {
      for (final UIComponent uiComponent : collection) {
        if (uiComponent instanceof AbstractUIMeta || uiComponent instanceof AbstractUIMetaLink) {
          metas.add(uiComponent);
        } else if (uiComponent instanceof AbstractUIStyle) {
```

### ConstantValue
Value `uiComponent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
        if (uiComponent instanceof AbstractUIMeta || uiComponent instanceof AbstractUIMetaLink) {
          metas.add(uiComponent);
        } else if (uiComponent instanceof AbstractUIStyle) {
          styles.add(uiComponent);
        } else if (uiComponent instanceof AbstractUIScript) {
```

### ConstantValue
Value `uiComponent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
        } else if (uiComponent instanceof AbstractUIStyle) {
          styles.add(uiComponent);
        } else if (uiComponent instanceof AbstractUIScript) {
          scripts.add(uiComponent);
        } else {
```

### ConstantValue
Value `uiComponent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
          scripts.add(uiComponent);
        } else {
          if (uiComponent instanceof UIOutput) {
            final Map<String, Object> attributes = uiComponent.getAttributes();
            if ("jakarta.faces".equals(attributes.get("library"))
```

### ConstantValue
Value `uiComponent` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
            }
          }
          misc.add(uiComponent);
        }
      }
```

### ConstantValue
Value `clientBehavior` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
      }
    } else {
      LOG.warn("Ignoring: '{}'", clientBehavior);
    }
    return null;
```

### ConstantValue
Value `writer` is always 'null'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
      return (TobagoResponseWriter) writer;
    } else {
      return new TobagoResponseWriterWrapper(writer);
    }
  }
```

### ConstantValue
Condition `page > 0` is always `true`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
    for (int i = 0; i < linkCount && page > 1; i++) {
      page--;
      if (page > 0) {
        prevs.add(0, page);
      }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Enumeration' to 'java.util.Enumeration'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CantorInterval.java`
#### Snippet
```java
  public Enumeration<TreeNode> children() {
    init();
    return super.children();
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Set' to 'java.util.Set\>'. Reason: 'facets' has raw type, so result of entrySet is erased
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugUtils.java`
#### Snippet
```java
      final Map facets = component.getFacets();
      if (facets.size() > 0) {
        for (final Map.Entry<String, UIComponent> entry : (Set<Map.Entry<String, UIComponent>>) facets.entrySet()) {
          final UIComponent facet = entry.getValue();
          result.append(spaces(offset + 1));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashSet' to 'java.util.Set'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/AjaxUtils.java`
#### Snippet
```java

  public static Set<String> getRenderIds(final FacesContext facesContext) {
    return new HashSet<>(facesContext.getPartialViewContext().getRenderIds());
  }

```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ValueExpressionComparator.java`
#### Snippet
```java
    try {
      final Map requestMap = facesContext.getExternalContext().getRequestMap();
      requestMap.put(var, param1);
      obj1 = valueExpression.getValue(facesContext.getELContext());
      requestMap.put(var, param2);
```

### UNCHECKED_WARNING
Unchecked call to 'put(K, V)' as a member of raw type 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ValueExpressionComparator.java`
#### Snippet
```java
      requestMap.put(var, param1);
      obj1 = valueExpression.getValue(facesContext.getELContext());
      requestMap.put(var, param2);
      obj2 = valueExpression.getValue(facesContext.getELContext());
      requestMap.remove(var);
```

### UNCHECKED_WARNING
Unchecked call to 'compare(T, T)' as a member of raw type 'java.util.Comparator'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComparatorBase.java`
#### Snippet
```java
        result = collationKey1.compareTo(collationKey2);
      } else if (comparator != null) {
        result = comparator.compare(obj1, obj2);
      } else {
        if (obj1 instanceof String) {
```

### UNCHECKED_WARNING
Unchecked call to 'compareTo(T)' as a member of raw type 'java.lang.Comparable'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComparatorBase.java`
#### Snippet
```java
          result = ((String) obj1).compareToIgnoreCase((String) obj2);
        } else if (obj1 instanceof Comparable) {
          result = ((Comparable) obj1).compareTo(obj2);
        } else {
          result = obj1.toString().compareTo(obj2.toString());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Class\>' to 'java.lang.Class'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/WebXmlUtils.java`
#### Snippet
```java

            if (exceptionType != null) {
              final Class<Throwable> key = (Class<Throwable>) Class.forName(exceptionType);
              final String value = normalizePath(externalContext, location);
              ERROR_PAGE_LOCATIONS.put(key, value);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      // do sorting
      if (data instanceof List) {
        Collections.sort((List) data, actualComparator);
      } else { // value is instanceof Object[]
        Arrays.sort((Object[]) data, actualComparator);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Comparator' to 'java.util.Comparator'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      // do sorting
      if (data instanceof List) {
        Collections.sort((List) data, actualComparator);
      } else { // value is instanceof Object[]
        Arrays.sort((Object[]) data, actualComparator);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Comparator' to 'java.util.Comparator'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
        Collections.sort((List) data, actualComparator);
      } else { // value is instanceof Object[]
        Arrays.sort((Object[]) data, actualComparator);
      }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'model' has raw type, so result of getJunctions is erased
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java
  public List<Boolean> getJunctions() {
    final TreeDataModel model = ComponentUtils.findAncestor(this, AbstractUIData.class).getTreeDataModel();
    return model.getJunctions();
  }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    if (createDeltas()) {
      //Track delta case
      Map<String, Object> mapValues = (Map<String, Object>) deltas
          .get(key);
      if (mapValues == null) {
        mapValues = new DeltaStateHelper.InternalMap<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java

    //Handle change on full map
    Map<String, Object> mapValues = (Map<String, Object>) fullState
        .get(key);
    if (mapValues == null) {
      mapValues = new DeltaStateHelper.InternalMap<>();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java

    Object returnValue = null;
    final Map<String, Object> map = (Map<String, Object>) stateMap.get(key);
    if (map != null) {
      if (delta) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      final Object valueOrKey) {
    Object returnValue = null;
    final Map<Object, Boolean> c = (Map<Object, Boolean>) stateMap.get(key);
    if (c != null) {
      if (c.containsKey(valueOrKey)) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      //we have to do it the hard way
      for (final Object elem : listAsArr) {
        add((T) restoreAttachedState(context, elem));
      }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'K'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      final Object[] listAsMap = (Object[]) state;
      for (int cnt = 0; cnt < listAsMap.length; cnt += 2) {
        this.put((K) listAsMap[cnt], (V) UIComponentBase.restoreAttachedState(context, listAsMap[cnt + 1]));
      }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      if (isInitialStateMarked()) {
        if (savedValue instanceof DeltaStateHelper.InternalDeltaListMap) {
          for (final Map.Entry<Object, Boolean> mapEntry : ((Map<Object, Boolean>) savedValue)
              .entrySet()) {
            final boolean addOrRemove = mapEntry.getValue();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
          }
        } else if (savedValue instanceof DeltaStateHelper.InternalMap) {
          for (final Map.Entry<String, Object> mapEntry : ((Map<String, Object>) savedValue)
              .entrySet()) {
            this.put(key, mapEntry.getKey(), mapEntry.getValue());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Iterator' to 'java.util.Iterator\>'. Reason: 'serializableMap.entrySet()' has raw type, so result of iterator is erased
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    //Object[] retArr = new Object[serializableMap.entrySet().size() * 2 + stateHolderKeyCount];

    final Iterator<Map.Entry<Serializable, Object>> it = serializableMap.entrySet().iterator();
    int cnt = 0;
    while (it.hasNext()) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    if (createDeltas()) {
      //Track delta case
      Map<Object, Boolean> deltaListMapValues = (Map<Object, Boolean>) deltas
          .get(key);
      if (deltaListMapValues == null) {
        deltaListMapValues = new DeltaStateHelper.InternalDeltaListMap<>(
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java

    //Handle change on full map
    List<Object> fullListValues = (List<Object>) fullState.get(key);
    if (fullListValues == null) {
      fullListValues = new DeltaStateHelper.InternalList<>(3);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'. Reason: 'dataModel' has raw type, so result of getRowIndicesOfChildren is erased
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
  public List<Integer> getRowIndicesOfChildren() {
    if (isTreeModel()) {
      return dataModel.getRowIndicesOfChildren();
    } else {
      LOG.warn("Not a tree model");
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
    final SheetState sheetState = getSheetState(context);
    if (sheetState != null) {
      final List<Integer> list = (List<Integer>) ComponentUtils.getAttribute(this, Attributes.selectedListString);
      sheetState.setSelectedRows(list != null ? list : Collections.emptyList());
      ComponentUtils.removeAttribute(this, Attributes.selectedListString);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.Collection'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        Array.set(targetForConvertedValues, i, value);
      } else {
        ((Collection) targetForConvertedValues).add(value);
      }
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java

  private List<Integer> getSelectedRows(final AbstractUISheet data, final SheetState state) {
    List<Integer> selected = (List<Integer>) ComponentUtils.getAttribute(data, Attributes.selectedListString);
    if (selected == null && state != null) {
      selected = state.getSelectedRows();
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `FacesContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java

  /**
   * @deprecated Since 5.0.0. Please use {@link #getMessage(FacesContext, FacesMessage.Severity, String, Object...)}.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `FacesMessage.Severity`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java

  /**
   * @deprecated Since 5.0.0. Please use {@link #getMessage(FacesContext, FacesMessage.Severity, String, Object...)}.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `FacesContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java

  /**
   * @deprecated Since 5.0.0. Please use {@link #getMessage(FacesContext, FacesMessage.Severity, String, Object...)}.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `FacesMessage.Severity`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java

  /**
   * @deprecated Since 5.0.0. Please use {@link #getMessage(FacesContext, FacesMessage.Severity, String, Object...)}.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `FacesMessage`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java

/**
 * Utility to get internationalized error messages and create and add {@link FacesMessage} object to the context. The
 * message will be internationalized with a bundle in the following order: <ol> <li>Application bundle</li> <li>Tobago
 * bundle</li> <li>Default JSF bundle</li>
```

### JavadocReference
Cannot resolve symbol `UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TabChangeEvent.java`
#### Snippet
```java

  /**
   * @deprecated since 2.0.0, please use {@link #TabChangeEvent(UIComponent, Integer, Integer)}
   */
  @Deprecated
```

### JavadocReference
Symbol `name` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/TextAlign.java`
#### Snippet
```java

  /**
   * @deprecated Since Tobago 3.0.0 Please use {@link TextAlign#name}
   */
  @Deprecated
```

### JavadocReference
Symbol `getConverter` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
   * May return null, if no converter can be find.
   *
   * @deprecated since 5.0.0. Please use {@link RendererBase#getConverter}.
   */
  @Deprecated
```

### JavadocReference
Symbol `getFormattedValue` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 5.0.0. Please use {@link RendererBase#getFormattedValue}
   */
  @Deprecated
```

### JavadocReference
Symbol `encodeBehavior` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/webapp/TobagoResponseWriter.java`
#### Snippet
```java
   *
   * @deprecated since 5.0, use {@link
   * org.apache.myfaces.tobago.renderkit.RendererBase#encodeBehavior} instead.
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `jakarta.faces.context.ExternalContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/Resource.java`
#### Snippet
```java

  /**
   * Get an URL of an internal resource. First, {@link jakarta.faces.context.ExternalContext#getResource(String)} is
   * checked for an non-null URL return value. In the case of a null return value (as it is the case for Weblogic 8.1
   * for a packed war), a URL with a special URL handler is constructed, which can be used for <em>opening</em> a
```

### JavadocReference
Cannot resolve symbol `getResource(String)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/Resource.java`
#### Snippet
```java

  /**
   * Get an URL of an internal resource. First, {@link jakarta.faces.context.ExternalContext#getResource(String)} is
   * checked for an non-null URL return value. In the case of a null return value (as it is the case for Weblogic 8.1
   * for a packed war), a URL with a special URL handler is constructed, which can be used for <em>opening</em> a
```

### JavadocReference
Symbol `renderSelectItems` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/HtmlRendererUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 5.0.0. Please use {@link RendererBase#renderSelectItems}
   */
  @Deprecated
```

### JavadocReference
Symbol `renderSelectItems` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/HtmlRendererUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 5.0.0. Please use {@link RendererBase#renderSelectItems}
   */
  @Deprecated
```

### JavadocReference
Symbol `renderSelectItems` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/HtmlRendererUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 5.0.0. Please use {@link RendererBase#renderSelectItems}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `jakarta.faces.context.FacesContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
  /**
   * Creates a list of SelectItems to use for rendering. You should only use this method (which returns a list), when
   * you need a list. Otherwise, please use {@link #getItemIterator(jakarta.faces.context.FacesContext,
   * jakarta.faces.component.UIComponent)}
   */
```

### JavadocReference
Cannot resolve symbol `jakarta.faces.component.UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
   * Creates a list of SelectItems to use for rendering. You should only use this method (which returns a list), when
   * you need a list. Otherwise, please use {@link #getItemIterator(jakarta.faces.context.FacesContext,
   * jakarta.faces.component.UIComponent)}
   */
  public static List<SelectItem> getItemList(final FacesContext facesContext, final UIComponent selector) {
```

### JavadocReference
Symbol `getCurrentValue` is inaccessible from here
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 5.0.0. Please use {@link RendererBase#getCurrentValue}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeAll(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `encodeAll(FacesContext)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeAll(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `FacesContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeAll(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeChildren(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `encodeChildren(FacesContext)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeChildren(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `FacesContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeChildren(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeAll(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `encodeAll(FacesContext)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeAll(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `FacesContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java

  /**
   * @deprecated since 4.0.0. Use {@link UIComponent#encodeAll(FacesContext)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `jakarta.faces.component.UIParameter`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/OutTagDeclaration.java`
#### Snippet
```java
  /**
   * Activates formatting of the value with the method {@link MessageFormat#format(String, Object...)}
   * A parameters the values of the children of type {@link jakarta.faces.component.UIParameter} are used.
   *
   * @since 5.5.0
```

### JavadocReference
Cannot resolve symbol `jakarta.faces.convert.DateTimeConverter`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/DateTagDeclaration.java`
#### Snippet
```java
 * For a time input field set you'll need to set the &lt;f:convertDateTime type="time"&gt; inside the &lt;tc:date&gt;.
 * <p>
 * If there is no converter given, a default instance of {@link jakarta.faces.convert.DateTimeConverter} will be used.
 */
@Tag(name = "date")
```

### JavadocReference
Cannot resolve symbol `jakarta.faces.application.NavigationHandler`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/declaration/HasAction.java`
#### Snippet
```java
   * The {@link jakarta.el.MethodExpression} must evaluate to a public method that takes no parameters,
   * and returns a {@link String} (the logical outcome) which is passed to the
   * {@link jakarta.faces.application.NavigationHandler} for this application.
   * The string is directly passed to the navigation handler.
   */
```

### JavadocReference
Cannot resolve symbol `UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIGridLayout.java`
#### Snippet
```java

  /**
   * @deprecated since 4.3.0, please use {@link #expand(UIComponent[][], int)}
   */
  @Deprecated
```

### JavadocReference
Cannot resolve symbol `jakarta.faces.component.UIData`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
   *
   * @param value    The reference to the data model
   *                 (comes from the value attribute of the {@link jakarta.faces.component.UIData})
   * @param showRoot comes from the showRoot attribute.
   */
```

### JavadocReference
Cannot resolve symbol `getRowCount()`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
   *
   * @return The index of the first row of the last paging page.
   * @throws IllegalArgumentException If the number of rows in the model returned by {@link #getRowCount()} is -1
   *                                  (undefined).
   */
```

### JavadocReference
Cannot resolve symbol `getRowCount()`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
   * The rowIndex of the last row on the current page plus one (because of zero based iterating).
   *
   * @throws IllegalArgumentException If the number of rows in the model returned by {@link #getRowCount()} is -1
   *                                  (undefined).
   */
```

### JavadocReference
Cannot resolve symbol `getRowCount()`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
   * The number of pages to render.
   *
   * @throws IllegalArgumentException If the number of rows in the model returned by {@link #getRowCount()} is -1
   *                                  (undefined).
   */
```

### JavadocReference
Cannot resolve symbol `FacesException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
   * String (that is a fully qualified Java class name) or a Class object.
   *
   * @throws FacesException if the value is a String and the represented
   *                        class cannot be found
   */
```

### JavadocReference
Cannot resolve symbol `FacesContext`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/SupportsAutoSpacing.java`
#### Snippet
```java
public interface SupportsAutoSpacing {
  /**
   * use {@link #getAutoSpacing(FacesContext)} to get the correct default value.
   * return null if autoSpacing is not set manually
   */
```

### JavadocReference
Cannot resolve symbol `Validator`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/validator/FileItemValidator.java`
#### Snippet
```java

/**
 * <p><strong>FileItemValidator</strong> is a {@link Validator} that checks
 * the FileItem in the value of the associated component.
 */
```

## RuleId[id=UnaryPlus]
### UnaryPlus
Unary `+` operator
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/Measure.java`
#### Snippet
```java
  @Override
  public int hashCode() {
    int result = value != +0.0f ? Float.floatToIntBits(value) : 0;
    result = 31 * result + unit.hashCode();
    return result;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `findFirstSelected()` might be null
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
  public String copy() {
    cutNode = null;
    copyNode = cloneNode(findFirstSelected());
    return null;
  }
```

### DataFlowIssue
Argument `Thread.currentThread().getContextClassLoader().getResourceAsStream( "org/apache/myfaces/...` might be null
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyListController.java`
#### Snippet
```java

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(
        Thread.currentThread().getContextClassLoader().getResourceAsStream(
            "org/apache/myfaces/tobago/example/demo/names.txt"), StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
```

### DataFlowIssue
Argument `AstroData.class.getResourceAsStream("category-tree.json")` might be null
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CategoryTree.java`
#### Snippet
```java

    final InputStreamReader reader
        = new InputStreamReader(AstroData.class.getResourceAsStream("category-tree.json"));

    final Gson gson = new GsonBuilder().create();
```

### DataFlowIssue
Dereference of `fileList` may produce `NullPointerException`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java
    final ArrayList<String> result = new ArrayList<String>();
    final File[] fileList = directory.listFiles();
    for (final File file : fileList) {
      if (file.isDirectory()) {
        result.addAll(getResourcesFromDirectory(file, pattern, base));
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TestController.java`
#### Snippet
```java
  private List<String> getXHTMLs(final File dir) {
    final List<String> xhtmls = new ArrayList<>();
    for (final File file : dir.listFiles()) {
      if (file.isDirectory()) {
        xhtmls.addAll(getXHTMLs(file));
```

### DataFlowIssue
Dereference of `dir.listFiles()` may produce `NullPointerException`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TestController.java`
#### Snippet
```java
  private List<String> getTestJs(final File dir) {
    final List<String> testJsFiles = new ArrayList<>();
    for (final File file : dir.listFiles()) {
      if (file.isDirectory()) {
        testJsFiles.addAll(getTestJs(file));
```

### DataFlowIssue
Argument `Thread.currentThread().getContextClassLoader().getResourceAsStream( "org/apache/myfaces/...` might be null
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectOneListController.java`
#### Snippet
```java

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(
        Thread.currentThread().getContextClassLoader().getResourceAsStream(
            "org/apache/myfaces/tobago/example/demo/names.txt"), StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
```

### DataFlowIssue
Argument `AstroData.class.getResourceAsStream("astro-data.json")` might be null
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/AstroData.java`
#### Snippet
```java

    final InputStreamReader reader
        = new InputStreamReader(AstroData.class.getResourceAsStream("astro-data.json"));

    Gson gson = new GsonBuilder().create();
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/CollapsibleActionListener.java`
#### Snippet
```java
      } else {
        LOG.error("Wrong component class for id: '{}'. Type is {} but expected type is {}",
            forClientId, component.getClass().getName(), AbstractUICollapsiblePanel.class.getName());
      }
    }
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
        collect.add((AbstractUIForm) child);
      } else {
        findSubForms(collect, child);
      }
    }
```

### DataFlowIssue
Condition `exception instanceof AbortProcessingException` is redundant and can be replaced with a null check
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
      if (events.hasNext()) {
        final Throwable exception = events.next().getContext().getException();
        if (!(exception instanceof AbortProcessingException)) {
          final String errorPageLocation = WebXmlUtils.getErrorPageLocation(exception);

```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java

              request.setAttribute("jakarta.servlet.error.exception", exception);
              request.setAttribute("jakarta.servlet.error.exception_type", exception.getClass());
              request.setAttribute("jakarta.servlet.error.message", exception.getMessage());
              request.setAttribute("jakarta.servlet.error.request_uri", request.getRequestURI());
```

### DataFlowIssue
Condition `cause instanceof ViewExpiredException` is redundant and can be replaced with a null check
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
        final NavigationHandler nav = facesContext.getApplication().getNavigationHandler();

        if (cause instanceof ViewExpiredException
            || cause != null && cause.getCause() instanceof ViewExpiredException) {
          final ViewExpiredException viewExpiredException = (ViewExpiredException)
```

### DataFlowIssue
Method invocation `error` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TobagoExceptionHandler.java`
#### Snippet
```java
            }
          } catch (Exception e) {
            LOG.error("Exception while exception handling!", e);
          } finally {
            facesContext.responseComplete();
```

### DataFlowIssue
Variable is already assigned to this value
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
    @Override
    public void setTransient(final boolean transientFlagParameter) {
      this.transientFlag = transientFlag;
    }

```

### DataFlowIssue
Variable is already assigned to this value
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
                }
              } else {
                result = false;
                break;
              }
```

### DataFlowIssue
Variable is already assigned to this value
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
                }
              } else {
                result = true;
                break;
              }
```

### DataFlowIssue
Argument `value` might be null
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/XmlResponseWriter.java`
#### Snippet
```java
    closeOpenTag();
    final String value = findValue(text, property);
    helper.writeText(value);
  }

```

### DataFlowIssue
Argument `value` might be null
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/HtmlResponseWriter.java`
#### Snippet
```java
    closeOpenTag();
    final String value = findValue(text, property);
    helper.writeText(value);
  }

```

### DataFlowIssue
Method invocation `getClientId` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java
    final String clientId = getClientId(facesContext);
    final UIData data = ComponentUtils.findAncestor(this, UIData.class);
    final String dataId = data.getClientId(facesContext);
    return clientId.substring(dataId.length() + 1);
  }
```

### DataFlowIssue
Method invocation `getTreeDataModel` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java

  public List<Boolean> getJunctions() {
    final TreeDataModel model = ComponentUtils.findAncestor(this, AbstractUIData.class).getTreeDataModel();
    return model.getJunctions();
  }
```

### DataFlowIssue
Method invocation `getTreeDataModel` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java

  public boolean isFolder() {
    final TreeDataModel model = ComponentUtils.findAncestor(this, AbstractUIData.class).getTreeDataModel();
    return model.isFolder();
  }
```

### DataFlowIssue
Method invocation `getTreeDataModel` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java
  @Override
  public void encodeBegin(final FacesContext facesContext) throws IOException {
    final TreeDataModel model = ComponentUtils.findAncestor(this, AbstractUIData.class).getTreeDataModel();
    model.setRowClientId(getClientId(facesContext));

```

### DataFlowIssue
Method invocation `getTreeDataModel` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java

  public TreePath getPath() {
    final TreeDataModel model = ComponentUtils.findAncestor(this, AbstractUIData.class).getTreeDataModel();
    return model.getPath();
  }
```

### DataFlowIssue
Method invocation `getTreeDataModel` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java
   */
  public int getLevel() {
    final TreeDataModel model = ComponentUtils.findAncestor(this, AbstractUIData.class).getTreeDataModel();
    return model.getLevel();
  }
```

### DataFlowIssue
Variable is already assigned to this value
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
        fullState.put(key, value);
      } else if (value == null && !fullState.containsKey(key)) {
        returnValue = null;
      } else {
        deltas.put(key, value);
```

### DataFlowIssue
Method invocation `getClientId` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPage.java`
#### Snippet
```java
      if (LOG.isTraceEnabled()) {
        LOG.trace("form:{}", form);
        LOG.trace(form.getClientId(facesContext));
      }
    } else {
```

### DataFlowIssue
Passing `null` argument to parameter annotated as @NotNull
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
          // ignore columns of nested sheets
        } else {
          findColumns(child, result, all);
        }
      }
```

### DataFlowIssue
Method invocation `getClientId` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeListboxRenderer.java`
#### Snippet
```java

    final AbstractUITreeNode node = ComponentUtils.findDescendant(tree, AbstractUITreeNode.class);
    final String parentId = node.getClientId(facesContext);

    writer.startElement(HtmlElements.SELECT);
```

### DataFlowIssue
Method invocation `encodeAll` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
      for (final UIComponent child : component.getChildren()) {
        if (!(child instanceof AbstractUIBadge)) {
          child.encodeAll(facesContext);
        }
      }
```

### DataFlowIssue
Method invocation `getClass` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
      }
    } else {
      LOG.warn("Unknown behavior '{}'!", behavior.getClass().getName());
    }

```

### DataFlowIssue
Method invocation `getValue` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        converter = getSelectItemsValueConverter(groupIterator, facesContext);
      } else {
        final Class<?> selectItemsType = item.getValue().getClass();

        // optimization: no conversion for String values
```

### DataFlowIssue
Method invocation `getApplication` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java

        try {
          converter = facesContext.getApplication().createConverter(selectItemsType);
        } catch (final FacesException e) {
          // nothing - try again
```

### DataFlowIssue
Casting `targetForConvertedValues` to `Collection` may produce `ClassCastException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        Array.set(targetForConvertedValues, i, value);
      } else {
        ((Collection) targetForConvertedValues).add(value);
      }
    }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
              itemDisabled,
              itemLabelEscaped,
              itemValue.equals(noSelectionValue));

          // remove the value with the key from var from the request map, if previously written
```

### DataFlowIssue
Method invocation `encodeAll` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
          writer.startElement(HtmlElements.SPAN);
          writer.writeClassAttribute(BootstrapClass.INPUT_GROUP_TEXT);
          child.encodeAll(facesContext);
          writer.endElement(HtmlElements.SPAN);
        }
```

### DataFlowIssue
Method invocation `isFolder` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeIconRenderer.java`
#### Snippet
```java
    final AbstractUIData data = ComponentUtils.findAncestor(component, AbstractUIData.class);
    final AbstractUITreeNode node = ComponentUtils.findAncestor(component, AbstractUITreeNode.class);
    final boolean folder = node.isFolder();
    final boolean expanded = folder && data.getExpandedState().isExpanded(node.getPath());

```

### DataFlowIssue
Method invocation `getExpandedState` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeIconRenderer.java`
#### Snippet
```java
    final AbstractUITreeNode node = ComponentUtils.findAncestor(component, AbstractUITreeNode.class);
    final boolean folder = node.isFolder();
    final boolean expanded = folder && data.getExpandedState().isExpanded(node.getPath());

    final String value = (String) component.getValue();
```

### DataFlowIssue
Method invocation `getExpandedState` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java
    final int level = component.getLevel();
    final boolean folder = component.isFolder();
    final boolean expanded = folder && data.getExpandedState().isExpanded(component.getPath()) || level == 0;

    final TobagoResponseWriter writer = getResponseWriter(facesContext);
```

### DataFlowIssue
Method invocation `isRendersRowContainer` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java

    final AbstractUIData data = ComponentUtils.findAncestor(component, AbstractUIData.class);
    final boolean dataRendersRowContainer = data.isRendersRowContainer();
    final String clientId = component.getClientId(facesContext);
    final String parentId = data.getRowParentClientId();
```

### DataFlowIssue
Method invocation `encodeAll` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeRenderer.java`
#### Snippet
```java
          // ignore, this is rendered in encodeChildren()
        } else {
          child.encodeAll(facesContext);
        }
      }
```

### DataFlowIssue
Method invocation `getSelectable` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeSelectRenderer.java`
#### Snippet
```java
    final String name;

    if (data.getSelectable().isSingle()) {
      name = getClientIdWithoutRowIndex(data, clientId);
    } else {
```

### DataFlowIssue
Method invocation `getSelectedState` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeSelectRenderer.java`
#### Snippet
```java
    final boolean checked;
    if (component.isValueStoredInState()) {
      checked = data.getSelectedState().isSelected(node.getPath());
    } else {
      checked = "true".equals(currentValue);
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeSelectRenderer.java`
#### Snippet
```java
    final boolean checked;
    if (component.isValueStoredInState()) {
      checked = data.getSelectedState().isSelected(node.getPath());
    } else {
      checked = "true".equals(currentValue);
```

### DataFlowIssue
Method invocation `isFolder` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeSelectRenderer.java`
#### Snippet
```java
    }

    final boolean folder = data.isFolder();
    final Selectable selectable = data.getSelectable();
    final boolean showFormCheck = component.isShowCheckbox()
```

### DataFlowIssue
Method invocation `getBaseClientId` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeSelectRenderer.java`
#### Snippet
```java
        if (other != null) {
          Command change = other.get(ClientBehaviors.change);
          change.setExecute(change.getExecute() + " " + tree.getBaseClientId(facesContext));
          change.setRender(change.getRender() + " " + tree.getBaseClientId(facesContext));
        }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
    writer.startElement(HtmlElements.TOBAGO_PAGE);

    writer.writeAttribute(CustomAttributes.LOCALE, locale.toString(), false);
    writer.writeClassAttribute(
        BootstrapClass.CONTAINER_FLUID,
```

### DataFlowIssue
Argument `clearValidatorsFieldIds` might be null
in `tobago-core/src/main/java/org/apache/myfaces/tobago/validator/ClearValidatorsActionListener.java`
#### Snippet
```java
    // FIXME: finding mechanism??? JSF ???

    final StringTokenizer tokenizer = new StringTokenizer(clearValidatorsFieldIds, ",");
    while (tokenizer.hasMoreTokens()) {
      final String clearValidatorsFieldId = tokenizer.nextToken();
```

### DataFlowIssue
Method invocation `getValue` will produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
      } else {

        Object itemValue = item.getValue();
        // when using selectItem tag with a literal value: use the converted value
        if (itemValue instanceof String && values != null && values.length > 0 && !(values[0] instanceof String)) {
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
        if (onlySelected == null && contains) {
          writer.writeAttribute(HtmlAttributes.SELECTED, true);
          markup = Markup.SELECTED.add(markup);
        }
        if (item.isDisabled()) {
```

### DataFlowIssue
Method invocation `add` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
        if (item.isDisabled()) {
          writer.writeAttribute(HtmlAttributes.DISABLED, true);
          markup = Markup.DISABLED.add(markup);
        }
        writer.writeClassAttribute(optionClass);
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java
  public void addInterface(final String qualifiedName) {
    final String name = ClassUtils.getSimpleName(qualifiedName);
    if (!name.equals(className)) {
      imports.addImport(qualifiedName);
      this.interfaces.add(name);
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java
  public void setSuperClass(final String qualifiedName) {
    final String name = ClassUtils.getSimpleName(qualifiedName);
    if (!name.equals(className)) {
      imports.addImport(qualifiedName);
      this.superClassName = name;
```

### DataFlowIssue
Method invocation `isExpanded` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
      if (sheet.isTreeModel()) {
        final TreePath path = sheet.getPath();
        if (sheet.isFolder() && expandedState.isExpanded(path)) {
          expandedValue.add(rowIndex);
        }
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/PropertyInfo.java`
#### Snippet
```java
    final int index = shortType.lastIndexOf('.');
    if (index != -1) {
      return shortType.substring(shortType.lastIndexOf('.') + 1, shortType.length());
    }
    return shortType;
```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/PropertyInfo.java`
#### Snippet
```java

  public String getShortType() {
    final String shortType = type.substring(type.lastIndexOf('.') + 1, type.length());
    return shortType.replace("[]", "Array").replace("$", ".");
  }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'getLocaleList' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/LocaleUtils.java`
#### Snippet
```java
   */
  @Deprecated
  public static List<Locale> getLocaleList(final Locale locale) {

    String string = locale.toString();
```

### DeprecatedIsStillUsed
Deprecated member 'writeURIAttribute' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/webapp/TobagoResponseWriter.java`
#### Snippet
```java
  @Override
  @Deprecated
  public abstract void writeURIAttribute(String name, Object value, String property) throws IOException;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'ThemeResources' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/ThemeResources.java`
#### Snippet
```java
   */
  @Deprecated
  public ThemeResources(final boolean production) {
    this.production = production;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'isProduction' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/ThemeResources.java`
#### Snippet
```java
   */
  @Deprecated
  public boolean isProduction() {
    return production;
  }
```

### DeprecatedIsStillUsed
Deprecated member 'production' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/ThemeResources.java`
#### Snippet
```java
   */
  @Deprecated
  private boolean production;

  private final List<ThemeScript> includeScripts = new ArrayList<>();
```

### DeprecatedIsStillUsed
Deprecated member 'getSortedColumnId' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SheetState.java`
#### Snippet
```java
   */
  @Deprecated
  public String getSortedColumnId() {
    if (sortedColumnList.isEmpty()) {
      return null;
```

### DeprecatedIsStillUsed
Deprecated member 'isAscending' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SheetState.java`
#### Snippet
```java
   */
  @Deprecated
  public boolean isAscending() {
    if (sortedColumnList.isEmpty()) {
      return true;
```

### DeprecatedIsStillUsed
Deprecated member 'version' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/UserAgent.java`
#### Snippet
```java
   */
  @Deprecated
  private final String version;

  private final EnumSet<Capability> capabilities;
```

### DeprecatedIsStillUsed
Deprecated member 'TOBAGO_CONFIG_XSD_1_6' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigEntityResolver.java`
#### Snippet
```java
   */
  @Deprecated
  protected static final String TOBAGO_CONFIG_XSD_1_6 = "/org/apache/myfaces/tobago/config/tobago-config-1.6.xsd";
  protected static final String TOBAGO_CONFIG_XSD_2_0 = "/org/apache/myfaces/tobago/config/tobago-config-2.0.xsd";
  protected static final String TOBAGO_CONFIG_XSD_2_0_6 = "/org/apache/myfaces/tobago/config/tobago-config-2.0.6.xsd";
```

### DeprecatedIsStillUsed
Deprecated member 'Cell' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/Cell.java`
#### Snippet
```java
 */
@Deprecated
public interface Cell {

  UIComponent getComponent();
```

### DeprecatedIsStillUsed
Deprecated member 'VERSIONED' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
   */
  @Deprecated
  private static final int VERSIONED = -1407102089;
  private static final int VERSION = 351608024;
  private static final int RESOURCES = -1983070683;
```

### DeprecatedIsStillUsed
Deprecated member 'SUPPORTED_MARKUP' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
   */
  @Deprecated
  private static final int SUPPORTED_MARKUP = 71904295;
  /**
   * @deprecated since 4.0.0
```

### DeprecatedIsStillUsed
Deprecated member 'RENDERER' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
   */
  @Deprecated
  private static final int RENDERER = -494845757;
  /**
   * @deprecated since 4.0.0
```

### DeprecatedIsStillUsed
Deprecated member 'MARKUP' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
   */
  @Deprecated
  private static final int MARKUP = -1081305560;
  private static final int THEME_DEFINITIONS = -255617156;
  private static final int THEME_DEFINITION = 1515774935;
```

### DeprecatedIsStillUsed
Deprecated member 'RENDERERS' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
   */
  @Deprecated
  private static final int RENDERERS = 1839650832;
  /**
   * @deprecated since 4.0.0
```

### DeprecatedIsStillUsed
Deprecated member 'OriginCell' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/OriginCell.java`
#### Snippet
```java
 */
@Deprecated
public class OriginCell implements Cell {

  private UIComponent component;
```

### DeprecatedIsStillUsed
Deprecated member 'isCompact' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIOut.java`
#### Snippet
```java
   */
  @Deprecated
  public abstract boolean isCompact();

  public abstract boolean isMessageFormat();
```

### DeprecatedIsStillUsed
Deprecated member 'isCreateSpan' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIOut.java`
#### Snippet
```java
   */
  @Deprecated
  public abstract boolean isCreateSpan();

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'isInline' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIForm.java`
#### Snippet
```java
   */
  @Deprecated
  public abstract boolean isInline();
}

```

### DeprecatedIsStillUsed
Deprecated member 'SUFFIX_MARKED' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
   */
  @Deprecated
  public static final String SUFFIX_MARKED = "marked";
  public static final String SUFFIX_SELECTED = "selected";
  public static final String SUFFIX_EXPANDED = "expanded";
```

### DeprecatedIsStillUsed
Deprecated member 'createCollapsible' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
   */
  @Deprecated
  public static Collapse createCollapsible(final FacesContext facesContext, final UIComponent component) {
    //// TBD: is this nice? May be implemented with a JSF behavior?
    //// BEGIN
```

### DeprecatedIsStillUsed
Deprecated member 'TREE_PARENT' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/html/DataAttributes.java`
#### Snippet
```java
   */
  @Deprecated
  TREE_PARENT("data-tobago-tree-parent"),

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'SELECTABLE' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/html/DataAttributes.java`
#### Snippet
```java
   */
  @Deprecated
  SELECTABLE("data-tobago-selectable"),

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'componentType' is still used
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/TagInfo.java`
#### Snippet
```java
   */
  @Deprecated
  private String componentType;
  private String tagName;
  private String componentFamily;
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
      this.min = min;
      this.max = max;
      label = String.valueOf(min) + " < x ≤ " + String.valueOf(max);
    }

```

### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
      this.min = min;
      this.max = max;
      label = String.valueOf(min) + " < x ≤ " + String.valueOf(max);
    }

```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'faces'
in `tobago-tool/tobago-config-mojarra/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>com.sun.faces.config.ConfigureListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class or package 'config'
in `tobago-tool/tobago-config-mojarra/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>com.sun.faces.config.ConfigureListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class 'ConfigureListener'
in `tobago-tool/tobago-config-mojarra/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>com.sun.faces.config.ConfigureListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve Filter 'LoggingMdcFilter'
in `tobago-example/tobago-example-blank/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  </filter>
  <filter-mapping>
    <filter-name>LoggingMdcFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve Filter 'LoggingMdcFilter'
in `tobago-example/tobago-example-demo/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
  </filter>
  <filter-mapping>
    <filter-name>LoggingMdcFilter</filter-name>
    <url-pattern>/*</url-pattern>
  </filter-mapping>
```

### WebProperties
Cannot resolve class or package 'apache'
in `tobago-tool/tobago-config-owb/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>org.apache.webbeans.servlet.WebBeansConfigurationListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class or package 'webbeans'
in `tobago-tool/tobago-config-owb/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>org.apache.webbeans.servlet.WebBeansConfigurationListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class or package 'servlet'
in `tobago-tool/tobago-config-owb/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>org.apache.webbeans.servlet.WebBeansConfigurationListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class 'WebBeansConfigurationListener'
in `tobago-tool/tobago-config-owb/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>org.apache.webbeans.servlet.WebBeansConfigurationListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class or package 'myfaces'
in `tobago-tool/tobago-config-myfaces/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>org.apache.myfaces.webapp.StartupServletContextListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class or package 'webapp'
in `tobago-tool/tobago-config-myfaces/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>org.apache.myfaces.webapp.StartupServletContextListener</listener-class>
  </listener>

```

### WebProperties
Cannot resolve class 'StartupServletContextListener'
in `tobago-tool/tobago-config-myfaces/src/main/resources/META-INF/web-fragment.xml`
#### Snippet
```java

  <listener>
    <listener-class>org.apache.myfaces.webapp.StartupServletContextListener</listener-class>
  </listener>

```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
Unnecessary 'contains()' check
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/Imports.java`
#### Snippet
```java
        final int index = qualifiedName.lastIndexOf('$');
        final String name = index != -1 ? qualifiedName.substring(0, index) : qualifiedName;
        if (!imports.contains(name)) {
          imports.add(name);
        }
```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/Display.java`
#### Snippet
```java

  public String encode() {
    switch (this) {
      case grid:
        return "-ms-grid" + name();
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/StyleRenderer.java`
#### Snippet
```java
    writer.writeText(name.getCssName());
    writer.writeText(":");
    switch (name) {
      case backgroundImage:
        writer.writeText("url(");
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
              final ValueExpression expression
                  = faceletContext.getVariableMapper().resolveVariable(removeElParenthesis(expressionString));
              if (expression == null) {
                // when the action hasn't been set while using a composition.
                if (LOG.isDebugEnabled()) {
                  LOG.debug("Variable can't be resolved: value='" + expressionString + "'");
                }
                expressionString = null;
                break;
              } else {
                expressionString = expression.getExpressionString();
              }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    final Object returnValue = fullState.get(key);
    if (returnValue != null) {
      return returnValue;
    }
    final ValueExpression expression = target.getValueExpression(key
        .toString());
    if (expression != null) {
      return expression.getValue(FacesContext.getCurrentInstance()
          .getELContext());
    }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIMeta.java`
#### Snippet
```java
    super.processEvent(event);

    if (event instanceof PreRenderViewEvent) {
      addComponentResource();
    } else if (event instanceof PostAddToViewEvent) {
      if (FacesVersion.supports21() || !FacesVersion.isMyfaces()) {
        // MyFaces core is removing the component resources in head if the view will be recreated before rendering.
        // The view will be recreated because of expressions. For example  expressins in the ui:include src attribute
        // The PostAddToViewEvent will not be broadcasted in this case again.
        // A subscription to the PreRenderViewEvent avoids this problem
        // NOTE: PreRenderViewEvent can not used in myfaces prior 2.0.3 using PostAddToView for all myfaces 2.0 versions
        getFacesContext().getViewRoot().subscribeToEvent(PreRenderViewEvent.class, this);
      } else {
        addComponentResource();
      }
    }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DateRenderer.java`
#### Snippet
```java
          final Double step = component.getStep();
          if (step == null || step >= 60) {
            dateTimeConverter.setPattern(DateType.PATTERN_DATETIME_LOCAL);
          } else if (step >= 1) {
            dateTimeConverter.setPattern(DateType.PATTERN_DATETIME_LOCAL_SECONDS);
          } else {
            dateTimeConverter.setPattern(DateType.PATTERN_DATETIME_LOCAL_MILLIS);
          }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DateRenderer.java`
#### Snippet
```java
          final Double step = component.getStep();
          if (step == null || step >= 60) {
            dateTimeConverter.setPattern(DateType.PATTERN_TIME);
          } else if (step >= 1) {
            dateTimeConverter.setPattern(DateType.PATTERN_TIME_SECONDS);
          } else {
            dateTimeConverter.setPattern(DateType.PATTERN_TIME_MILLIS);
          }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
    final DecorationPosition messagePosition = supportsDecorationPosition != null
        ? supportsDecorationPosition.getMessagePosition() : DecorationPosition.none;
    final String clientId = component.getClientId();
    final List<FacesMessage> messages = facesContext.getMessageList(clientId);
    final String message = getMessage(messages);
    final FacesMessage.Severity severity = ComponentUtils.getMaximumSeverity(messages);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/InRenderer.java`
#### Snippet
```java
    int maxLength = 0;
    int minLength = 0;
    String pattern = null;
    for (final Validator validator : component.getValidators()) {
      if (validator instanceof LengthValidator) {
        final LengthValidator lengthValidator = (LengthValidator) validator;
        maxLength = lengthValidator.getMaximum();
        minLength = lengthValidator.getMinimum();
      } else if (validator instanceof RegexValidator) {
        final RegexValidator regexValidator = (RegexValidator) validator;
        pattern = regexValidator.getPattern();
      }
    }
    if (maxLength > 0) {
      writer.writeAttribute(HtmlAttributes.MAXLENGTH, maxLength);
    }
    if (minLength > 0) {
      writer.writeAttribute(HtmlAttributes.MINLENGTH, minLength);
    }
    if (pattern != null) {
      writer.writeAttribute(HtmlAttributes.PATTERN, pattern, true);
    }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyCheckboxRenderer.java`
#### Snippet
```java
    final String title = HtmlRendererUtils.getTitleFromTipAndMessages(facesContext, component);
    final boolean disabled = component.isDisabled();
    final boolean readonly = component.isReadonly();
    final boolean required = component.isRequired();
    final boolean inline = component.isInline();
    final Markup markup = component.getMarkup();
    final boolean isInsideCommand = isInside(facesContext, HtmlElements.COMMAND);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneRadioRenderer.java`
#### Snippet
```java
    final boolean disabled = component.isDisabled();
    final boolean readonly = component.isReadonly();
    final boolean required = component.isRequired();
    final boolean inline = component.isInline();
    final Markup markup = component.getMarkup();
    final boolean isInsideCommand = isInside(facesContext, HtmlElements.COMMAND);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyCheckboxRenderer.java`
#### Snippet
```java
        final boolean itemDisabled = item.isDisabled() || disabled;
        final String itemId = id + ComponentUtils.SUB_SEPARATOR + i;
        writer.startElement(HtmlElements.DIV);
        writer.writeClassAttribute(
            BootstrapClass.FORM_CHECK,
            inline ? BootstrapClass.FORM_CHECK_INLINE : null,
            isInsideCommand ? BootstrapClass.DROPDOWN_ITEM : null);
        writer.startElement(HtmlElements.INPUT);
        writer.writeClassAttribute(
            BootstrapClass.FORM_CHECK_INPUT,
            BootstrapClass.validationColor(ComponentUtils.getMaximumSeverity(component)));
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyCheckboxRenderer.java`
#### Snippet
```java
        writer.writeAttribute(HtmlAttributes.CHECKED, checked);
        writer.writeNameAttribute(id);
        writer.writeIdAttribute(itemId);
        writer.writeAttribute(HtmlAttributes.VALUE, formattedValue, true);
        writer.writeAttribute(HtmlAttributes.DISABLED, itemDisabled);
        writer.writeAttribute(HtmlAttributes.READONLY, readonly);
        writer.writeAttribute(HtmlAttributes.REQUIRED, required);
        if (first) {
          renderFocus(id, component.isFocus(), component.isError(), facesContext, writer);
          first = false;
        }
        writer.writeAttribute(HtmlAttributes.TABINDEX, component.getTabIndex());
        writer.endElement(HtmlElements.INPUT);

        writer.startElement(HtmlElements.LABEL);
        writer.writeClassAttribute(BootstrapClass.FORM_CHECK_LABEL);
        writer.writeAttribute(HtmlAttributes.FOR, itemId, false);

        if (item instanceof org.apache.myfaces.tobago.model.SelectItem) {
          final org.apache.myfaces.tobago.model.SelectItem tobagoItem =
              (org.apache.myfaces.tobago.model.SelectItem) item;
          final String image = tobagoItem.getImage();
          if (image != null) {
            writer.startElement(HtmlElements.IMG);
            writer.writeAttribute(HtmlAttributes.SRC, image, true);
            writer.writeAttribute(HtmlAttributes.ALT, "", false);
            writer.endElement(HtmlElements.IMG);
          }
        }

        final String label = item.getLabel();
        if (label != null) {
          writer.writeText(label);
        }

        writer.endElement(HtmlElements.LABEL);
        writer.endElement(HtmlElements.DIV);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
    final List<SelectItem> items = SelectItemUtils.getItemList(facesContext, component);
    final boolean disabled = !items.iterator().hasNext() || component.isDisabled() || component.isReadonly();

    List<CssItem> cssItems = new ArrayList<>();
    if (disabled) {
      cssItems.add(TobagoClass.DISABLED);
    }
    return cssItems.toArray(new CssItem[0]);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
    final TobagoResponseWriter writer = getResponseWriter(facesContext);

    final String clientId = component.getClientId(facesContext);
    final String fieldId = component.getFieldId(facesContext);
    final String filterId = clientId + ComponentUtils.SUB_SEPARATOR + "filter";
    final String selectedId = clientId + ComponentUtils.SUB_SEPARATOR + "selected";
    final List<SelectItem> items = SelectItemUtils.getItemList(facesContext, component);
    final boolean disabled = !items.iterator().hasNext() || component.isDisabled() || component.isReadonly();
    final String filter = component.getFilter();
    final boolean expanded = component.isExpanded();
    final String title = HtmlRendererUtils.getTitleFromTipAndMessages(facesContext, component);
    final Integer tabIndex = component.getTabIndex();

    encodeHiddenSelect(facesContext, component, items, clientId, selectedId, disabled);

    writer.startElement(HtmlElements.DIV);
    writer.writeClassAttribute(
        expanded ? BootstrapClass.LIST_GROUP : BootstrapClass.DROPDOWN,
        expanded ? BootstrapClass.borderColor(ComponentUtils.getMaximumSeverity(component)) : null);

    encodeSelectField(facesContext, component,
        clientId, fieldId, filterId, filter, disabled, expanded, title, tabIndex);
    encodeOptions(facesContext, component, items, clientId, expanded, disabled);

    writer.endElement(HtmlElements.DIV);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
    final TobagoResponseWriter writer = getResponseWriter(facesContext);

    writer.startElement(HtmlElements.SELECT);
    writer.writeIdAttribute(selectedId);
    writer.writeNameAttribute(clientId);
    writer.writeAttribute(HtmlAttributes.DISABLED, disabled);
    writer.writeAttribute(HtmlAttributes.REQUIRED, component.isRequired());
    writer.writeClassAttribute(BootstrapClass.D_NONE);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
    final TobagoResponseWriter writer = getResponseWriter(facesContext);

    writer.startElement(HtmlElements.DIV);
    writer.writeIdAttribute(fieldId);
    writer.writeNameAttribute(clientId);
    HtmlRendererUtils.writeDataAttributes(facesContext, writer, component);
    writer.writeClassAttribute(
        expanded ? BootstrapClass.FORM_CONTROL : BootstrapClass.FORM_SELECT,
        TobagoClass.SELECT__FIELD,
        expanded ? BootstrapClass.LIST_GROUP_ITEM : BootstrapClass.DROPDOWN_TOGGLE,
        expanded ? null : BootstrapClass.borderColor(ComponentUtils.getMaximumSeverity(component)),
        component.getCustomClass());
    writer.writeAttribute(HtmlAttributes.TITLE, title, true);
    writer.writeAttribute(Arias.EXPANDED, Boolean.FALSE.toString(), false);
    writer.writeAttribute(HtmlAttributes.DISABLED, disabled);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
    writer.startElement(HtmlElements.INPUT);
    writer.writeAttribute(HtmlAttributes.TYPE, HtmlInputTypes.SEARCH);
    writer.writeIdAttribute(filterId);
    writer.writeClassAttribute(TobagoClass.FILTER, BootstrapClass.FORM_CONTROL);
    writer.writeAttribute(HtmlAttributes.AUTOCOMPLETE, "off", false);
    writer.writeAttribute(HtmlAttributes.READONLY, filter == null || filter.isEmpty());
    writer.writeAttribute(HtmlAttributes.DISABLED, disabled);
    writer.writeAttribute(HtmlAttributes.TABINDEX, tabIndex);
    renderFocus(clientId, component.isFocus(), component.isError(), facesContext, writer);

    writer.endElement(HtmlElements.INPUT);

    writer.endElement(HtmlElements.DIV);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
    final TobagoResponseWriter writer = getResponseWriter(facesContext);

    writer.startElement(HtmlElements.DIV);
    writer.writeClassAttribute(
        TobagoClass.OPTIONS,
        expanded ? BootstrapClass.LIST_GROUP_ITEM : TobagoClass.DROPDOWN__MENU);
    writer.writeNameAttribute(clientId);

    writer.startElement(HtmlElements.TABLE);
    writer.writeClassAttribute(BootstrapClass.TABLE, BootstrapClass.TABLE_HOVER, BootstrapClass.TABLE_SM);
    writer.startElement(HtmlElements.TBODY);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
      Object itemValue = item.getValue();
      // when using selectItem tag with a literal value: use the converted value
      if (itemValue instanceof String && values != null && values.length > 0 && !(values[0] instanceof String)) {
        itemValue = ComponentUtils.getConvertedValue(facesContext, component, (String) itemValue);
      }
      final String formattedValue = getFormattedValue(facesContext, (T) component, itemValue);
      final boolean contains;
      if (submittedValues == null) {
        contains = ArrayUtils.contains(values, itemValue);
      } else {
        contains = ArrayUtils.contains(submittedValues, formattedValue);
      }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
      writer.startElement(HtmlElements.TR);
      writer.writeAttribute(DataAttributes.VALUE, formattedValue, true);
      writer.writeClassAttribute(
          contains ? BootstrapClass.TABLE_PRIMARY : null,
          disabled || item.isDisabled() ? TobagoClass.DISABLED : null);
      writer.writeAttribute(HtmlAttributes.TABINDEX, -1);

      writer.startElement(HtmlElements.TD);
      writer.writeAttribute(HtmlAttributes.VALUE, formattedValue, true);
      writer.writeText(item.getLabel());
      writer.endElement(HtmlElements.TD);
      writer.endElement(HtmlElements.TR);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
    writer.endElement(HtmlElements.TBODY);
    writer.startElement(HtmlElements.TFOOT);
    writer.startElement(HtmlElements.TR);
    writer.writeClassAttribute(TobagoClass.NO__ENTRIES, BootstrapClass.D_NONE);
    writer.startElement(HtmlElements.TD);
    writer.writeText("---");
    writer.endElement(HtmlElements.TD);
    writer.endElement(HtmlElements.TR);
    writer.endElement(HtmlElements.TFOOT);
    writer.endElement(HtmlElements.TABLE);
    writer.endElement(HtmlElements.DIV);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneListboxRenderer.java`
#### Snippet
```java
    writer.writeAttribute(HtmlAttributes.REQUIRED, component.isRequired());
    renderFocus(clientId, component.isFocus(), component.isError(), facesContext, writer);

    writer.writeAttribute(HtmlAttributes.TABINDEX, component.getTabIndex());

    writer.writeClassAttribute(
        BootstrapClass.FORM_SELECT,
        BootstrapClass.validationColor(ComponentUtils.getMaximumSeverity(component)),
        component.getCustomClass(),
        markup != null && markup.contains(Markup.SPREAD) ? TobagoClass.SPREAD : null);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListboxRenderer.java`
#### Snippet
```java
    renderFocus(clientId, component.isFocus(), component.isError(), facesContext, writer);
    writer.writeAttribute(HtmlAttributes.TABINDEX, component.getTabIndex());

    writer.writeClassAttribute(
        BootstrapClass.FORM_SELECT,
        BootstrapClass.validationColor(ComponentUtils.getMaximumSeverity(component)),
        component.getCustomClass(),
        markup != null && markup.contains(Markup.SPREAD) ? TobagoClass.SPREAD : null);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
    final StringBuilder builder = new StringBuilder();

    if (component == null) {
      builder.append("{Component-Path : ");
      builder.append("[null]}");
      return builder.toString();
    }

    getPathToComponent(component, builder);

    builder.insert(0, "{Component-Path : ");
    builder.append("}");

    return builder.toString();
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
    if (component == null) {
      return;
    }

    final StringBuilder intBuilder = new StringBuilder();

    intBuilder.append("[Class: ");
    intBuilder.append(component.getClass().getName());
    if (component instanceof UIViewRoot) {
      intBuilder.append(",ViewId: ");
      intBuilder.append(((UIViewRoot) component).getViewId());
    } else {
      intBuilder.append(",Id: ");
      intBuilder.append(component.getId());
    }
    intBuilder.append("]");
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
            final int length = Array.getLength(value);
            final Collection<Object> items = new ArrayList<>(length);
            for (int i = 0; i < length; i++) {
              items.add(Array.get(value, i));
            }
            nestedItems = items.iterator();
            return hasNext();
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
            writer.writeText(formatted.substring(0, pos));
            writer.startElement(HtmlElements.SPAN);
            writer.writeText(Integer.toString(first));
            writer.endElement(HtmlElements.SPAN);
            writer.startElement(HtmlElements.INPUT);
            writer.writeIdAttribute(pagerCommandId);
            writer.writeNameAttribute(pagerCommandId);
            writer.writeAttribute(HtmlAttributes.TYPE, HtmlInputTypes.TEXT);
            writer.writeAttribute(HtmlAttributes.VALUE, first);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
      writer.startElement(HtmlElements.INPUT);
      writer.writeAttribute(HtmlAttributes.TYPE, HtmlInputTypes.HIDDEN);
      final String expandedId = sheetId + ComponentUtils.SUB_SEPARATOR + AbstractUIData.SUFFIX_EXPANDED;
      writer.writeNameAttribute(expandedId);
      writer.writeIdAttribute(expandedId);
      writer.writeClassAttribute(TobagoClass.EXPANDED);
      writer.writeAttribute(HtmlAttributes.VALUE, JsonUtils.encode(expandedValue), false);
      writer.endElement(HtmlElements.INPUT);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/StyleRenderer.java`
#### Snippet
```java
      if (width != null
          || height != null
          || minWidth != null
          || minHeight != null
          || maxWidth != null
          || maxHeight != null
          || left != null
          || right != null
          || top != null
          || bottom != null
          || paddingLeft != null
          || paddingRight != null
          || paddingTop != null
          || paddingBottom != null
          || marginLeft != null
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
          if (abstractUIEvent != null && abstractUIEvent.isRendered() && !abstractUIEvent.isDisabled()) {
            for (List<ClientBehavior> children : abstractUIEvent.getClientBehaviors().values()) {
              for (ClientBehavior child : children) {
                final CommandMap childMap = getCommandMap(facesContext, clientBehaviorContext, child);
                commandMap = CommandMap.merge(commandMap, childMap);
              }
            }
          }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
    if ((commandMap == null || commandMap.isEmpty()) && clientBehaviorHolder instanceof AbstractUICommand) {
      if (commandMap == null) {
        commandMap = new CommandMap();
      }
      final AbstractUICommand holder = (AbstractUICommand) clientBehaviorHolder;
      commandMap.addCommand(ClientBehaviors.click, new Command(
          holder.getClientId(facesContext),
          holder.getFieldId(facesContext),
          holder.isTransition(),
          holder.getTarget(),
          null,
          null,
          ComponentUtils.getConfirmation(holder),
          null,
          TobagoClientBehaviorRenderer.createCollapsible(facesContext, holder),
          holder.isOmit()));
    }

    return commandMap;
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
    if (clientBehavior instanceof ClientBehaviorBase) {
      String type = ((ClientBehaviorBase) clientBehavior).getRendererType();

      // this is to use a different renderer for Tobago components and other components.
      if (type.equals(AjaxBehavior.BEHAVIOR_ID)) {
        type = "org.apache.myfaces.tobago.behavior.Ajax";
      }
      final ClientBehaviorRenderer renderer = facesContext.getRenderKit().getClientBehaviorRenderer(type);
      final String dummy = renderer.getScript(clientBehaviorContext, clientBehavior);
      if (dummy != null) {
        return CommandMap.restoreCommandMap(facesContext);
      }
    } else {
      LOG.warn("Ignoring: '{}'", clientBehavior);
    }
    return null;
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
    if (component instanceof ClientBehaviorHolder) {
      final ClientBehaviorHolder clientBehaviorHolder = (ClientBehaviorHolder) component;
      final Map<String, List<ClientBehavior>> clientBehaviors = clientBehaviorHolder.getClientBehaviors();
      if (clientBehaviors != null && !clientBehaviors.isEmpty()) {
        final Map<String, String> paramMap = facesContext.getExternalContext().getRequestParameterMap();
        final String behaviorEventName = paramMap.get("jakarta.faces.behavior.event");
        if (behaviorEventName != null) {
          final List<ClientBehavior> clientBehaviorList = clientBehaviors.get(behaviorEventName);
          if (clientBehaviorList != null && !clientBehaviorList.isEmpty()) {
            final String clientId = paramMap.get("jakarta.faces.source");
            if (component.getClientId(facesContext).equals(clientId)) {
              for (final ClientBehavior clientBehavior : clientBehaviorList) {
                clientBehavior.decode(facesContext, component);
              }
            }
          }
        }
      }
    }
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java
    if (string == null) {
      return null;
    }
    final int len = string.length();
    if (len == 0) {
      return ArrayUtils.EMPTY_STRING_ARRAY;
    }
    final List<String> list = new ArrayList<>();
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/WriterHelper.java`
#### Snippet
```java
      out.write('0' + (i / 1000));
      i = i % 1000;
      out.write('0' + (i / 100));
      i = i % 100;
      out.write('0' + (i / 10));
      i = i % 10;
      out.write('0' + i);
```

### DuplicatedCode
Duplicated code
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
    if (LOG.isDebugEnabled()) {
      LOG.debug("end element: '" + name + "'");
    }
    Object top;
    try {
      top = stack.pop();
    } catch (final EmptyStackException e) {
      LOG.error("Failed to close element \"" + name + "\"!", e);
      top = "*** failure ***";
    }
```

### DuplicatedCode
Duplicated code
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyListController.java`
#### Snippet
```java
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(
        Thread.currentThread().getContextClassLoader().getResourceAsStream(
            "org/apache/myfaces/tobago/example/demo/names.txt"), StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (!line.startsWith("#") && line.length() > 0) {
          names.add(line);
        }
      }
    } catch (Exception e) {
      LOG.error("Can't load names", e);
    }
```

### DuplicatedCode
Duplicated code
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TestController.java`
#### Snippet
```java
    final List<TestPage> pages = new ArrayList<>();

    String realPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
    realPath = realPath.endsWith("/") ? realPath : realPath.concat("/");

    final File rootDir = new File(realPath + "content");
```

### DuplicatedCode
Duplicated code
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
    for (int i = 0; i < 9; i++) {
      final BitSet xxx = new BitSet();
      for (int j = 0; j < 9; j++) {
        final byte value = field[i * 9 + j];
        if (value != -1) {
          if (xxx.get(value)) {
//            LOG.debug("fail h " + i);
            return false;
          }
          xxx.set(value);
        }
      }
    }
    return true;
```

### DuplicatedCode
Duplicated code
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/CheckstyleConfigGenerator.java`
#### Snippet
```java
    final List<? extends javax.lang.model.element.Element> members
        = new ArrayList<javax.lang.model.element.Element>(processingEnv.getElementUtils().getAllMembers(type));
    members.sort(Comparator.comparing(d -> d.getSimpleName().toString()));
    return members;
```

### DuplicatedCode
Duplicated code
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
    if (converterAnn.id().length() > 0) {
      final org.jdom2.Element converterId = new org.jdom2.Element(CONVERTER_ID, namespace);
      converterId.setText(converterAnn.id());
      converter.addContent(converterId);
    } else if (converterAnn.forClass().length() > 0) {
      final org.jdom2.Element converterForClass = new org.jdom2.Element(CONVERTER_FOR_CLASS, namespace);
      converterForClass.setText(converterAnn.forClass());
      converter.addContent(converterForClass);
    }

    final org.jdom2.Element converterClass = new org.jdom2.Element(CONVERTER_CLASS, namespace);
    converterClass.setText(typeElement.getQualifiedName().toString());
    converter.addContent(converterClass);
    newConverters.add(converter);
```

### DuplicatedCode
Duplicated code
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final org.jdom2.Element elementExtension = new org.jdom2.Element(COMPONENT_EXTENSION, namespace);
    final org.jdom2.Element elementAllowedChildComponents = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
    final String[] allowedChildComponents = uiComponentTag.allowedChildComponenents();
    final StringBuilder allowedComponentTypes = new StringBuilder();
    for (final String componentType : allowedChildComponents) {
      allowedComponentTypes.append(componentType).append(" ");
    }
    elementAllowedChildComponents.setText(allowedComponentTypes.toString());
    elementExtension.addContent(elementAllowedChildComponents);
```

### DuplicatedCode
Duplicated code
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final org.jdom2.Element elementAllowedChildComponents
          = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
      final String[] allowedChildComponents = facet.allowedChildComponenents();
      final StringBuilder allowedComponentTypes = new StringBuilder();
      for (final String componentType : allowedChildComponents) {
        allowedComponentTypes.append(componentType).append(" ");
      }
      elementAllowedChildComponents.setText(allowedComponentTypes.toString());
      facetExtension.addContent(elementAllowedChildComponents);
```

### DuplicatedCode
Duplicated code
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          final org.jdom2.Element attribute = new org.jdom2.Element(ATTRIBUTE, namespace);
          final org.jdom2.Element attributeName = new org.jdom2.Element(ATTRIBUTE_NAME, namespace);
          final org.jdom2.Element attributeClass = new org.jdom2.Element(ATTRIBUTE_CLASS, namespace);

          attributeName.setText(name);
          addClass(componentAttribute, attributeClass);

          addDescription(executableElement, attribute, namespace);

          attribute.addContent(attributeName);
          attribute.addContent(attributeClass);
          if (componentAttribute.defaultValue().length() > 0) {
            final org.jdom2.Element defaultValue = new org.jdom2.Element(DEFAULT_VALUE, namespace);
            defaultValue.setText(componentAttribute.defaultValue());
            attribute.addContent(defaultValue);
          }

          attribute.addContent(createPropertyOrAttributeExtension(ATTRIBUTE_EXTENSION, executableElement,
              componentAttribute, namespace));

          attributes.add(attribute);
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java
      LOG.info("Loading config from file '" + file + "'");
      final Properties config = new Properties();
      config.load(new FileInputStream(file));
      enabled = Boolean.parseBoolean(config.getProperty(ENABLED_KEY));
    } catch (final IOException e) {
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  protected void generate() throws Exception {
    final Document document;
    final String content = IOUtils.toString(new FileInputStream(sourceFacesConfigFile), StandardCharsets.UTF_8);
    final SAXBuilder builder = new SAXBuilder();
    document = builder.build(new StringReader(content));
```

## RuleId[id=CdiInjectionPointsInspection]
### CdiInjectionPointsInspection
Unsatisfied dependency: no bean matches the injection point
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/WebSocketController.java`
#### Snippet
```java
  @Inject
  @Push(channel = "clock")
  private PushContext push;

  public String startClock() {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
    intBuilder.append("]");

    builder.insert(0, intBuilder.toString());

    getPathToComponent(component.getParent(), builder);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/AbstractGenerator.java`
#### Snippet
```java
        "<" + getClass().getSimpleName() + "> " + e.getMessage() + "\n"
            + (e.getCause() != null ? e.getCause().getMessage() + "\n" : "")
            + out.toString());
  }

```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
        returnValue = map.put((String) valueOrKey, null);
      } else {
        returnValue = map.remove(valueOrKey);
      }

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `River` may be 'static'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ForEachController.java`
#### Snippet
```java
  }

  public class River implements Serializable {
    private String name;
    private int length;
```

### InnerClassMayBeStatic
Inner class `DistanceRange` may be 'static'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
  }

  private class DistanceRange {

    private int min;
```

### InnerClassMayBeStatic
Inner class `TestPage` may be 'static'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TestController.java`
#### Snippet
```java
  }

  public class TestPage {
    private final String id;
    private final String base;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/package-info.java`
#### Snippet
```java
package org.apache.myfaces.tobago.internal;

/**
 * Package of internal classes.
 * <br/>
```

### DanglingJavadoc
Dangling Javadoc comment
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
  void setResizable(String resizable);

  /**
   * The layout token for this column.
   * Allowd layout tokens ('*', '&lt;x>*', '&lt;x>px' or '&lt;x>%').
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/TobagoRenderKit.java`
#### Snippet
```java
        return false;
      }
      if (!rendererType.equals(key.rendererType)) {
        return false;
      }
```

### TrivialIf
`if` statement can be simplified
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    if (element1.getName().equals(element2.getName()) && element1.getNamespace().equals(element2.getNamespace())) {
      if (element1.getChildText(COMPONENT_CLASS, namespace).equals(element2.getChildText(COMPONENT_CLASS, namespace))) {
        if (element1.getChildText(COMPONENT_TYPE, namespace).equals(element2.getChildText(COMPONENT_TYPE, namespace))) {
          return true;
        }
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/WebXmlUtils.java`
#### Snippet
```java

  public static String getErrorPageLocation(final Throwable exception) {
    if (ERROR_PAGE_LOCATIONS.size() <= 0) {
      init();
    }
```

### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java
  public static String join(final List<String> list, final char separator) {
    final int size = list.size();
    if (size <= 0) {
      return "";
    }
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'obj != null' covered by subsequent condition 'obj instanceof SheetStateChangeListener'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/ValueExpressionSheetStateChangeListener.java`
#### Snippet
```java
    if (valueExpression != null) {
      final Object obj = valueExpression.getValue(FacesContext.getCurrentInstance().getELContext());
      if (obj != null && obj instanceof SheetStateChangeListener) {
        handler = (SheetStateChangeListener) obj;
      }
```

### ConditionCoveredByFurtherCondition
Condition 'obj != null' covered by subsequent condition 'obj instanceof TabChangeListener'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/ValueExpressionTabChangeListener.java`
#### Snippet
```java
    if (valueExpression != null) {
      final Object obj = valueExpression.getValue(FacesContext.getCurrentInstance().getELContext());
      if (obj != null && obj instanceof TabChangeListener) {
        handler = (TabChangeListener) obj;
      }
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof UISelectMany' covered by subsequent condition 'child instanceof UISelectOne'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
    for (UIComponent child : children) {
      result = child;
      if (child instanceof UISelectMany
          || child instanceof UISelectOne
          || child instanceof UISelectBoolean
```

### ConditionCoveredByFurtherCondition
Condition 'c instanceof UISelectItem' covered by subsequent condition 'c instanceof UISelectItems'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
        // classes are found. If there is no more elements
        // that conform this condition, just return false.
        if (c instanceof UISelectItem || c instanceof UISelectItems) {
          child = c;
          break;
```

### ConditionCoveredByFurtherCondition
Condition 'event instanceof PreRenderViewEvent' covered by subsequent condition 'event instanceof PostRestoreStateEvent'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIConfig.java`
#### Snippet
```java
    super.processEvent(event);

    if (event instanceof PreRenderViewEvent || event instanceof PostRestoreStateEvent) {

      final Boolean focusOnError = getFocusOnError();
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof UICommand' covered by subsequent condition 'child instanceof UIInput'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICommand.java`
#### Snippet
```java
        if (child.isRendered()
            && !(child instanceof AbstractUIEvent)
            && (child instanceof UICommand || child instanceof UIInput)) {
          parentOfCommands = true;
          break;
```

### ConditionCoveredByFurtherCondition
Condition 'value instanceof StateHolder' covered by subsequent condition 'value instanceof List'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
        final Object value = get(i);

        if (value instanceof StateHolder || value instanceof List || !(value instanceof Serializable)) {
          values[i] = saveAttachedState(context, value);
        } else {
```

### ConditionCoveredByFurtherCondition
Condition 'value instanceof StateHolder' covered by subsequent condition 'value instanceof List'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
        final Object value = entry.getValue();

        if (value instanceof StateHolder || value instanceof List || !(value instanceof Serializable)) {
          mapArr[cnt + 1] = saveAttachedState(context, value);
        } else {
```

### ConditionCoveredByFurtherCondition
Condition 'value instanceof StateHolder' covered by subsequent condition 'value instanceof List'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      // is to handle List, StateHolder or non Serializable instances.
      // we check it here, to prevent unnecessary calls.
      if (value instanceof StateHolder || value instanceof List || !(value instanceof Serializable)) {
        final Object savedValue = saveAttachedState(context, value);
        retArr[cnt + 1] = savedValue;
```

### ConditionCoveredByFurtherCondition
Condition 'facesEvent instanceof SheetStateChangeEvent' covered by subsequent condition 'facesEvent instanceof PageActionEvent'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java

    if (facesEvent.getComponent() == this
        && (facesEvent instanceof SheetStateChangeEvent
        || facesEvent instanceof PageActionEvent)) {
      facesEvent.setPhaseId(PhaseId.INVOKE_APPLICATION);
```

### ConditionCoveredByFurtherCondition
Condition '!(child instanceof UIParameter)' covered by subsequent condition '!(child instanceof AbstractUIBadge)'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
      for (final UIComponent child : component.getChildren()) {
        if (child.isRendered()
            && !(child instanceof UIParameter)
            && !(child instanceof AbstractUIBadge)) {
          if (child instanceof AbstractUIStyle) {
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof AbstractUILink' covered by subsequent condition 'child instanceof AbstractUISelectBooleanCheckbox'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
            }
            renderLater.add(child);
          } else if (child instanceof AbstractUILink
              || child instanceof AbstractUISelectBooleanCheckbox
              || child instanceof AbstractUISelectBooleanToggle
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof AbstractUISelectBooleanCheckbox' covered by subsequent condition 'child instanceof AbstractUISelectBooleanToggle'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
            renderLater.add(child);
          } else if (child instanceof AbstractUILink
              || child instanceof AbstractUISelectBooleanCheckbox
              || child instanceof AbstractUISelectBooleanToggle
              || child instanceof AbstractUISelectManyCheckbox
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof AbstractUISelectBooleanToggle' covered by subsequent condition 'child instanceof AbstractUISelectManyCheckbox'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
          } else if (child instanceof AbstractUILink
              || child instanceof AbstractUISelectBooleanCheckbox
              || child instanceof AbstractUISelectBooleanToggle
              || child instanceof AbstractUISelectManyCheckbox
              || child instanceof AbstractUISelectOneRadio
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof AbstractUISelectManyCheckbox' covered by subsequent condition 'child instanceof AbstractUISelectOneRadio'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
              || child instanceof AbstractUISelectBooleanCheckbox
              || child instanceof AbstractUISelectBooleanToggle
              || child instanceof AbstractUISelectManyCheckbox
              || child instanceof AbstractUISelectOneRadio
              || child instanceof AbstractUISeparator) {
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof AbstractUISelectOneRadio' covered by subsequent condition 'child instanceof AbstractUISeparator'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java
              || child instanceof AbstractUISelectBooleanToggle
              || child instanceof AbstractUISelectManyCheckbox
              || child instanceof AbstractUISelectOneRadio
              || child instanceof AbstractUISeparator) {
            insideBegin(facesContext, HtmlElements.COMMAND); // XXX may refactor / cleanup
```

### ConditionCoveredByFurtherCondition
Condition '!(child instanceof UISelectItem)' covered by subsequent condition '!(child instanceof UISelectItems)'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        // classes are found. If there is no more elements
        // that conform this condition, just return false.
        while (!(child instanceof UISelectItem) && !(child instanceof UISelectItems)) {
          // Try to skip it
          if (children.hasNext()) {
```

### ConditionCoveredByFurtherCondition
Condition '!(child instanceof AbstractUIOut)' covered by subsequent condition '!(child instanceof AbstractUILink)'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/ColumnRenderer.java`
#### Snippet
```java
  private boolean isPure(final AbstractUIColumn column) {
    for (final UIComponent child : column.getChildren()) {
      if (!(child instanceof AbstractUIOut) && !(child instanceof AbstractUILink)) {
        return true;
      }
```

### ConditionCoveredByFurtherCondition
Condition 'uiComponent instanceof AbstractUIMeta' covered by subsequent condition 'uiComponent instanceof AbstractUIMetaLink'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
        final FacesContext facesContext, final Collection<? extends UIComponent> collection, final String charset) {
      for (final UIComponent uiComponent : collection) {
        if (uiComponent instanceof AbstractUIMeta || uiComponent instanceof AbstractUIMetaLink) {
          metas.add(uiComponent);
        } else if (uiComponent instanceof AbstractUIStyle) {
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `supportedLocales.next()` to `Locale` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LocaleController.java`
#### Snippet
```java
    final List<SelectItem> localeItems = new ArrayList<>();
    while (supportedLocales.hasNext()) {
      final Locale supported = (Locale) supportedLocales.next();
      localeItems.add(createLocaleItem(supported));
      if (supported.equals(defaultLocale)) {
```

### RedundantCast
Casting `ch` to `int` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/WriterHelper.java`
#### Snippet
```java
    // about 40% faster in a microbenchmark (and on systems where GC is
    // going gonzo, it should be even better)
    int i = (int) ch;
    if (i > 10000) {
      out.write('0' + (i / 10000));
```

### RedundantCast
Casting `uiSelectItem` to `org.apache.myfaces.tobago.component.UISelectItem` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
          if (uiSelectItem instanceof org.apache.myfaces.tobago.component.UISelectItem) {
            final org.apache.myfaces.tobago.component.UISelectItem tobagoSelectItem
                = (org.apache.myfaces.tobago.component.UISelectItem) uiSelectItem;
            image = tobagoSelectItem.getItemImage();
            markup = tobagoSelectItem.getMarkup();
```

### RedundantCast
Casting `m.getValue()` to `double` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIProgress.java`
#### Snippet
```java
      if (model instanceof BoundedRangeModel) {
        final BoundedRangeModel m = (BoundedRangeModel) model;
        rangeValue = (double) m.getValue();
        rangeMax = (double) m.getMaximum();
        final int min = m.getMinimum();
```

### RedundantCast
Casting `m.getMaximum()` to `double` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIProgress.java`
#### Snippet
```java
        final BoundedRangeModel m = (BoundedRangeModel) model;
        rangeValue = (double) m.getValue();
        rangeMax = (double) m.getMaximum();
        final int min = m.getMinimum();
        if (min != 0) {
```

### RedundantCast
Casting `component` to `T` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneListRenderer.java`
#### Snippet
```java
        itemValue = ComponentUtils.getConvertedValue(facesContext, component, (String) itemValue);
      }
      final String formattedValue = getFormattedValue(facesContext, (T) component, itemValue);
      final boolean contains;
      if (submittedValue != null) {
```

### RedundantCast
Casting `component` to `T` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
        itemValue = ComponentUtils.getConvertedValue(facesContext, component, (String) itemValue);
      }
      final String formattedValue = getFormattedValue(facesContext, (T) component, itemValue);
      final boolean contains;
      if (submittedValues == null) {
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `sample` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeListboxController.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private DefaultMutableTreeNode sample;

  private TreeState state;
```

### FieldMayBeFinal
Field `sample` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeCommandTypesController.java`
#### Snippet
```java
public class TreeCommandTypesController implements Serializable {

  private CommandNode sample;
  private int actionOneCount = 0;
  private int actionTwoCount = 0;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NamedNode.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private String name;
  private String action;
  private String script;
```

### FieldMayBeFinal
Field `suggestions` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SuggestQuotMarkController.java`
#### Snippet
```java
public class SuggestQuotMarkController implements Serializable {
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
  private List<String> suggestions = new ArrayList<>(8);
  private String query;

```

### FieldMayBeFinal
Field `state` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationState.java`
#### Snippet
```java
  private NavigationNode currentNode;

  private TreeState state = new TreeState(new ExpandedState(1), new SelectedState());

  private boolean viewSource = false;
```

### FieldMayBeFinal
Field `sheetPagingPositionItems` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetConfig.java`
#### Snippet
```java
  private ShowPosition sheetPagePagingPosition;
  private SelectItem[] sheetDirectLinkCountItems;
  private SelectItem[] sheetPagingPositionItems;
  private SelectItem[] sheetSelectableItems;
  private Selectable selectable;
```

### FieldMayBeFinal
Field `sheetDirectLinkCountItems` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetConfig.java`
#### Snippet
```java
  private ShowPosition sheetDirectPagingPosition;
  private ShowPosition sheetPagePagingPosition;
  private SelectItem[] sheetDirectLinkCountItems;
  private SelectItem[] sheetPagingPositionItems;
  private SelectItem[] sheetSelectableItems;
```

### FieldMayBeFinal
Field `stars` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyShuttleController.java`
#### Snippet
```java
  private List<SolarObject> planets;
  private SolarObject[] selectedPlanets = new SolarObject[0];
  private List<String> stars = Arrays.asList("Proxima Centauri", "Alpha Centauri", "Wolf 359", "Sirius");
  private String[] selectedStars = new String[0];
  private int countPageReload = 0;
```

### FieldMayBeFinal
Field `planets` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PlanetExample.java`
#### Snippet
```java
public abstract class PlanetExample {

  private SelectItem[] planets;
  private SelectItem[] earthMoons;
  private SelectItem[] marsMoons;
```

### FieldMayBeFinal
Field `jupiterMoons` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PlanetExample.java`
#### Snippet
```java
  private SelectItem[] earthMoons;
  private SelectItem[] marsMoons;
  private SelectItem[] jupiterMoons;
  private int planet;

```

### FieldMayBeFinal
Field `marsMoons` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PlanetExample.java`
#### Snippet
```java
  private SelectItem[] planets;
  private SelectItem[] earthMoons;
  private SelectItem[] marsMoons;
  private SelectItem[] jupiterMoons;
  private int planet;
```

### FieldMayBeFinal
Field `earthMoons` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PlanetExample.java`
#### Snippet
```java

  private SelectItem[] planets;
  private SelectItem[] earthMoons;
  private SelectItem[] marsMoons;
  private SelectItem[] jupiterMoons;
```

### FieldMayBeFinal
Field `length` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ForEachController.java`
#### Snippet
```java
  public class River implements Serializable {
    private String name;
    private int length;
    private int discharge;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ForEachController.java`
#### Snippet
```java

  public class River implements Serializable {
    private String name;
    private int length;
    private int discharge;
```

### FieldMayBeFinal
Field `discharge` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ForEachController.java`
#### Snippet
```java
    private String name;
    private int length;
    private int discharge;

    public River(final String name, final int length, final int discharge) {
```

### FieldMayBeFinal
Field `mountains` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectOneListboxController.java`
#### Snippet
```java

  private String river;
  private SelectItem[] mountains;
  private String mountain;

```

### FieldMayBeFinal
Field `filteredSolarList` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
  private AstroData astroData;

  private List<SolarObject> filteredSolarList = new ArrayList<>();

  private SelectItem[] distanceItems;
```

### FieldMayBeFinal
Field `min` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
  private class DistanceRange {

    private int min;
    private int max;
    private final String label;
```

### FieldMayBeFinal
Field `max` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java

    private int min;
    private int max;
    private final String label;

```

### FieldMayBeFinal
Field `string` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CurrentValueController.java`
#### Snippet
```java
public class CurrentValueController {

  private String string;
  private LocalDate date;
  private Currency currency;
```

### FieldMayBeFinal
Field `date` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CurrentValueController.java`
#### Snippet
```java

  private String string;
  private LocalDate date;
  private Currency currency;

```

### FieldMayBeFinal
Field `currency` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CurrentValueController.java`
#### Snippet
```java
  private String string;
  private LocalDate date;
  private Currency currency;

  public CurrentValueController() {
```

### FieldMayBeFinal
Field `volume` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java

  private String displayName;
  private String volume;
  private int port;
  private int sslPort;
```

### FieldMayBeFinal
Field `tags` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private int sslPort;
  private String image;
  private String[] tags;
  private boolean ssl;
  private String mavenOptions;
```

### FieldMayBeFinal
Field `port` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String displayName;
  private String volume;
  private int port;
  private int sslPort;
  private String image;
```

### FieldMayBeFinal
Field `mavenOptions` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String[] tags;
  private boolean ssl;
  private String mavenOptions;

  DockerServer(
```

### FieldMayBeFinal
Field `sslPort` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String volume;
  private int port;
  private int sslPort;
  private String image;
  private String[] tags;
```

### FieldMayBeFinal
Field `ssl` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private String image;
  private String[] tags;
  private boolean ssl;
  private String mavenOptions;

```

### FieldMayBeFinal
Field `displayName` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
      " -Djsf=provided");

  private String displayName;
  private String volume;
  private int port;
```

### FieldMayBeFinal
Field `image` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
  private int port;
  private int sslPort;
  private String image;
  private String[] tags;
  private boolean ssl;
```

### FieldMayBeFinal
Field `entries` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectController.java`
#### Snippet
```java
public class SelectController implements Serializable {

  private SelectItem[] entries;

  public SelectController() {
```

### FieldMayBeFinal
Field `sample` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeController.java`
#### Snippet
```java
public class TreeController implements Serializable {

  private DefaultMutableTreeNode sample;
  private boolean treeShowRoot = false;
  private boolean treeShowRootJunction = false;
```

### FieldMayBeFinal
Field `progress` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ProgressController.java`
#### Snippet
```java
public class ProgressController implements Serializable {

  private DefaultBoundedRangeModel progress = new DefaultBoundedRangeModel(3, 0, 0, 5);

  public DefaultBoundedRangeModel getProgress() {
```

### FieldMayBeFinal
Field `version` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java
  private static final String ENABLED_KEY = "server.info.enabled";

  private String version;

  /**
```

### FieldMayBeFinal
Field `open` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TabController.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private String open = "/image/feather-open.png";
  private String close = "/image/feather-closed.png";
  private int index;
```

### FieldMayBeFinal
Field `close` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TabController.java`
#### Snippet
```java

  private String open = "/image/feather-open.png";
  private String close = "/image/feather-closed.png";
  private int index;
  private SimpleTabChangeListener tabChangeListener;
```

### FieldMayBeFinal
Field `sample` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeSelectController.java`
#### Snippet
```java
  };

  private DefaultMutableTreeNode sample;
  private String selectable = "multi";

```

### FieldMayBeFinal
Field `id` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
  public static class LoggingInfo {

    private String id;
    private Object logger;
    private String[] calls;
```

### FieldMayBeFinal
Field `calls` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
    private String id;
    private Object logger;
    private String[] calls;
    private String activeLevels = "n/a";
    private String factoryClassName;
```

### FieldMayBeFinal
Field `factoryMethod` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
    private String activeLevels = "n/a";
    private String factoryClassName;
    private String factoryMethod;
    private boolean usesString; // is false it uses "Object" for logging

```

### FieldMayBeFinal
Field `factoryClassName` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
    private String[] calls;
    private String activeLevels = "n/a";
    private String factoryClassName;
    private String factoryMethod;
    private boolean usesString; // is false it uses "Object" for logging
```

### FieldMayBeFinal
Field `usesString` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
    private String factoryClassName;
    private String factoryMethod;
    private boolean usesString; // is false it uses "Object" for logging

    public LoggingInfo(
```

### FieldMayBeFinal
Field `name` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CommandNode.java`
#### Snippet
```java
public class CommandNode extends DefaultMutableTreeNode {

  private String name;
  private String action;
  private String url;
```

### FieldMayBeFinal
Field `deserts` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyListboxController.java`
#### Snippet
```java

  private List<String> celestials = new ArrayList<>();
  private SelectItem[] deserts;
  private List<String> selectedDeserts = new ArrayList<>();

```

### FieldMayBeFinal
Field `data` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/info/ActivityList.java`
#### Snippet
```java
  // XXX using the session id as key is not good for applications with login, because the container should change
  // XXX the session id while the login process.
  private Map<String, Activity> data = new ConcurrentHashMap<>();

  public void add(final Activity activity) {
```

### FieldMayBeFinal
Field `suggestData` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/InputSuggestController.java`
#### Snippet
```java
  private String region;

  private String[][] suggestData = {
      {"26127 Oldenburg", "26127", "Oldenburg", "Niedersachsen"},
      {"26203 Wardenburg", "26203", "Wardenburg", "Niedersachsen"},
```

### FieldMayBeFinal
Field `label` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/bestpractice/ToolBarCustomizer.java`
#### Snippet
```java
  public static class Item {

    private String label;
    private String name;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/bestpractice/ToolBarCustomizer.java`
#### Snippet
```java

    private String label;
    private String name;

    private boolean visible = true;
```

### FieldMayBeFinal
Field `mojarra` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/FacesVersion.java`
#### Snippet
```java

  private static FacesVersion currentVersion;
  private static boolean mojarra;
  private static boolean myfaces;

```

### FieldMayBeFinal
Field `myfaces` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/FacesVersion.java`
#### Snippet
```java
  private static FacesVersion currentVersion;
  private static boolean mojarra;
  private static boolean myfaces;

  static {
```

### FieldMayBeFinal
Field `list` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java

    private byte n;
    private List<Byte> list;

    private RandomList(final byte n) {
```

### FieldMayBeFinal
Field `n` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
  private static class RandomList {

    private byte n;
    private List<Byte> list;

```

### FieldMayBeFinal
Field `field` may be 'final'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
  private static final Random RANDOM = new Random(System.currentTimeMillis());

  private byte[] field;
  private Stack<Byte> undefined;

```

### FieldMayBeFinal
Field `navigationHandler` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugNavigationHandler.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private NavigationHandler navigationHandler;

  public DebugNavigationHandler(final NavigationHandler navigationHandler) {
```

### FieldMayBeFinal
Field `action` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/PageActionEvent.java`
#### Snippet
```java
  private static final long serialVersionUID = 3364193750247386220L;

  private SheetAction action;
  private int value;

```

### FieldMayBeFinal
Field `column` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/SortActionEvent.java`
#### Snippet
```java
  private static final long serialVersionUID = 4906962574581815720L;

  private transient UIColumn column;

  public SortActionEvent(final UIData sheet, final UIColumn column) {
```

### FieldMayBeFinal
Field `wrappedFacesEvent` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/FacesEventWrapper.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  private FacesEvent wrappedFacesEvent;

  public FacesEventWrapper(final FacesEvent facesEvent, final UIComponent redirectComponent) {
```

### FieldMayBeFinal
Field `newExpanded` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TreeExpansionEvent.java`
#### Snippet
```java

  private boolean oldExpanded;
  private boolean newExpanded;

  public TreeExpansionEvent(final UIComponent node, final boolean oldExpanded, final boolean newExpanded) {
```

### FieldMayBeFinal
Field `oldExpanded` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TreeExpansionEvent.java`
#### Snippet
```java
  private static final long serialVersionUID = 422186716954088729L;

  private boolean oldExpanded;
  private boolean newExpanded;

```

### FieldMayBeFinal
Field `oldSelected` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TreeSelectedEvent.java`
#### Snippet
```java
  private static final long serialVersionUID = 422186716954088729L;

  private boolean oldSelected;
  private boolean newSelected;

```

### FieldMayBeFinal
Field `newSelected` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TreeSelectedEvent.java`
#### Snippet
```java

  private boolean oldSelected;
  private boolean newSelected;

  public TreeSelectedEvent(final UIComponent node, final boolean oldSelected, final boolean newSelected) {
```

### FieldMayBeFinal
Field `scrollPosition` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeState.java`
#### Snippet
```java
  private ExpandedState expandedState;
  private SelectedState selectedState;
  private ScrollPosition scrollPosition;

  public TreeState() {
```

### FieldMayBeFinal
Field `expandedState` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeState.java`
#### Snippet
```java
public class TreeState implements Serializable, ScrollPositionState {

  private ExpandedState expandedState;
  private SelectedState selectedState;
  private ScrollPosition scrollPosition;
```

### FieldMayBeFinal
Field `selectedState` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeState.java`
#### Snippet
```java

  private ExpandedState expandedState;
  private SelectedState selectedState;
  private ScrollPosition scrollPosition;

```

### FieldMayBeFinal
Field `collapsedSet` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/ExpandedState.java`
#### Snippet
```java
  private int defaultExpandedLevels;
  private Set<TreePath> expandedSet;
  private Set<TreePath> collapsedSet;

  /**
```

### FieldMayBeFinal
Field `expandedSet` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/ExpandedState.java`
#### Snippet
```java

  private int defaultExpandedLevels;
  private Set<TreePath> expandedSet;
  private Set<TreePath> collapsedSet;

```

### FieldMayBeFinal
Field `selectedPaths` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SelectedState.java`
#### Snippet
```java
public class SelectedState implements Serializable {

  private Set<TreePath> selectedPaths = new HashSet<>();

  /**
```

### FieldMayBeFinal
Field `list` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/MeasureList.java`
#### Snippet
```java
public class MeasureList implements Iterable<Measure>, Serializable {

  private List<Measure> list = new ArrayList<>();

  public MeasureList() {
```

### FieldMayBeFinal
Field `back` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
  private int rowIndex = -1;
  private Map<Integer, Data> mapping;
  private Map<TreeNode, Integer> back;
  private boolean showRoot;
  private ExpandedState expandedState;
```

### FieldMayBeFinal
Field `showRoot` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
  private Map<Integer, Data> mapping;
  private Map<TreeNode, Integer> back;
  private boolean showRoot;
  private ExpandedState expandedState;

```

### FieldMayBeFinal
Field `mapping` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
  private TreeNode data;
  private int rowIndex = -1;
  private Map<Integer, Data> mapping;
  private Map<TreeNode, Integer> back;
  private boolean showRoot;
```

### FieldMayBeFinal
Field `margins` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/MarginTokens.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private List<Margin> margins = new ArrayList<>();

  public int getSize() {
```

### FieldMayBeFinal
Field `markups` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/MarkupConfig.java`
#### Snippet
```java
  private static final long serialVersionUID = 1L;

  private Set<String> markups = new HashSet<>();

  public boolean contains(final String markup) {
```

### FieldMayBeFinal
Field `names` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/UserAgent.java`
#### Snippet
```java
    STANDARD(new String[]{"Content-Security-Policy-Report-Only"});

    private String[] names;

    CsproHeader(final String[] names) {
```

### FieldMayBeFinal
Field `names` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/UserAgent.java`
#### Snippet
```java
    STANDARD(new String[]{"Content-Security-Policy"});

    private String[] names;

    CspHeader(final String[] names) {
```

### FieldMayBeFinal
Field `horizontalFirst` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/SpanCell.java`
#### Snippet
```java

  private OriginCell origin;
  private boolean horizontalFirst;
  private boolean verticalFirst;

```

### FieldMayBeFinal
Field `verticalFirst` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/SpanCell.java`
#### Snippet
```java
  private OriginCell origin;
  private boolean horizontalFirst;
  private boolean verticalFirst;

  public SpanCell(final OriginCell origin, final boolean horizontalFirst, final boolean verticalFirst) {
```

### FieldMayBeFinal
Field `origin` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/SpanCell.java`
#### Snippet
```java
public class SpanCell implements Cell {

  private OriginCell origin;
  private boolean horizontalFirst;
  private boolean verticalFirst;
```

### FieldMayBeFinal
Field `component` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/OriginCell.java`
#### Snippet
```java
public class OriginCell implements Cell {

  private UIComponent component;
  private int columnSpan;
  private int rowSpan;
```

### FieldMayBeFinal
Field `rows` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/Grid.java`
#### Snippet
```java

  private MeasureList columns;
  private MeasureList rows;

  private int columnCount;
```

### FieldMayBeFinal
Field `columnCount` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/Grid.java`
#### Snippet
```java
  private MeasureList rows;

  private int columnCount;
  private int rowCount;

```

### FieldMayBeFinal
Field `columns` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/Grid.java`
#### Snippet
```java
  private List<Cell> cells;

  private MeasureList columns;
  private MeasureList rows;

```

### FieldMayBeFinal
Field `cells` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/Grid.java`
#### Snippet
```java
   * The rectangular data as a 1-dim list
   */
  private List<Cell> cells;

  private MeasureList columns;
```

### FieldMayBeFinal
Field `clazz` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/AttachedStateWrapper.java`
#### Snippet
```java
  private static final long serialVersionUID = 4948301780259917764L;

  private Class<?> clazz;
  private Object wrappedStateObject;

```

### FieldMayBeFinal
Field `wrappedStateObject` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/AttachedStateWrapper.java`
#### Snippet
```java

  private Class<?> clazz;
  private Object wrappedStateObject;

  /**
```

### FieldMayBeFinal
Field `wrappedStateList` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/AttachedListStateWrapper.java`
#### Snippet
```java
  private static final long serialVersionUID = -3958718149793179776L;

  private List<Object> wrappedStateList;

  AttachedListStateWrapper(final List<Object> wrappedStateList) {
```

### FieldMayBeFinal
Field `responseWriter` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/TobagoResponseWriterWrapper.java`
#### Snippet
```java
public class TobagoResponseWriterWrapper extends TobagoResponseWriter {

  private ResponseWriter responseWriter;

  public TobagoResponseWriterWrapper(final ResponseWriter responseWriter) {
```

### FieldMayBeFinal
Field `stack` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
public class DebugResponseWriterWrapper extends TobagoResponseWriter {

  private Stack<Object> stack = new Stack<>();
  private Set<MarkupLanguageAttributes> usedAttributes = new HashSet<>();

```

### FieldMayBeFinal
Field `usedAttributes` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java

  private Stack<Object> stack = new Stack<>();
  private Set<MarkupLanguageAttributes> usedAttributes = new HashSet<>();

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### FieldMayBeFinal
Field `target` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
   * - eval assume calls to component.ValueExpression
   */
  private A target;

  /**
```

### FieldMayBeFinal
Field `fullState` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
   * This map holds the full current state
   */
  private Map<Serializable, Object> fullState;

  /**
```

### FieldMayBeFinal
Field `facesContext` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
    private UIComponent currentComponent;
    private UISelectItems currentUISelectItems;
    private FacesContext facesContext;

    SelectItemsIterator(final UIComponent selectItemsParent, final FacesContext facesContext) {
```

### FieldMayBeFinal
Field `misc` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
    private List<UIComponent> styles = new ArrayList<>();
    private List<UIComponent> scripts = new ArrayList<>();
    private List<UIComponent> misc = new ArrayList<>();

    HeadResources(
```

### FieldMayBeFinal
Field `metas` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
  private static class HeadResources {

    private List<UIComponent> metas = new ArrayList<>();
    private List<UIComponent> styles = new ArrayList<>();
    private List<UIComponent> scripts = new ArrayList<>();
```

### FieldMayBeFinal
Field `scripts` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
    private List<UIComponent> metas = new ArrayList<>();
    private List<UIComponent> styles = new ArrayList<>();
    private List<UIComponent> scripts = new ArrayList<>();
    private List<UIComponent> misc = new ArrayList<>();

```

### FieldMayBeFinal
Field `styles` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java

    private List<UIComponent> metas = new ArrayList<>();
    private List<UIComponent> styles = new ArrayList<>();
    private List<UIComponent> scripts = new ArrayList<>();
    private List<UIComponent> misc = new ArrayList<>();
```

### FieldMayBeFinal
Field `renderers` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/TobagoRenderKit.java`
#### Snippet
```java
  private final RenderKit htmlBasicRenderKit;

  private Map<Key, Renderer> renderers = new HashMap<>();

  public TobagoRenderKit() {
```

### FieldMayBeFinal
Field `cssName` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Styles.java`
#### Snippet
```java
  gridRow;

  private String cssName;

  Styles() {
```

### FieldMayBeFinal
Field `value` may be 'final'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/html/HtmlRoleValues.java`
#### Snippet
```java
  TABPANEL("tabpanel");

  private String value;

  HtmlRoleValues(final String value) {
```

### FieldMayBeFinal
Field `imports` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/Imports.java`
#### Snippet
```java
public class Imports {

  private Set<String> imports = new TreeSet<>();

  private String packageName;
```

### FieldMayBeFinal
Field `imports` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java
  private String className;
  private String packageName;
  private Imports imports;
  private String superClassName;
  private Set<String> interfaces = new HashSet<>();
```

### FieldMayBeFinal
Field `interfaces` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java
  private Imports imports;
  private String superClassName;
  private Set<String> interfaces = new HashSet<>();
  private String sourceClass;

```

### FieldMayBeFinal
Field `className` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java

public class ClassInfo {
  private String className;
  private String packageName;
  private Imports imports;
```

### FieldMayBeFinal
Field `sourceClass` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java
  private String superClassName;
  private Set<String> interfaces = new HashSet<>();
  private String sourceClass;

  public ClassInfo(final String sourceClass, final String qualifiedName) {
```

### FieldMayBeFinal
Field `packageName` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java
public class ClassInfo {
  private String className;
  private String packageName;
  private Imports imports;
  private String superClassName;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/TagInfo.java`
#### Snippet
```java

public class TagInfo extends RendererInfo {
  private List<PropertyInfo> properties = new ArrayList<>();
  private String componentClassName;
  /**
```

### FieldMayBeFinal
Field `transientProperties` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ComponentInfo.java`
#### Snippet
```java
public class ComponentInfo extends TagInfo {
  private List<PropertyInfo> nonTransientProperties = new ArrayList<>();
  private List<PropertyInfo> transientProperties = new ArrayList<>();
  private boolean messages;
  private String description;
```

### FieldMayBeFinal
Field `nonTransientProperties` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ComponentInfo.java`
#### Snippet
```java

public class ComponentInfo extends TagInfo {
  private List<PropertyInfo> nonTransientProperties = new ArrayList<>();
  private List<PropertyInfo> transientProperties = new ArrayList<>();
  private boolean messages;
```

### FieldMayBeFinal
Field `behaviors` may be 'final'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ComponentInfo.java`
#### Snippet
```java
  private int index = 0;
  private int nonTransientIndex = 0;
  private List<String> behaviors = new ArrayList<>();
  private String defaultBehavior;

```

## RuleId[id=ServletWithoutMappingInspection]
### ServletWithoutMappingInspection
Filter should have a mapping
in `tobago-example/tobago-example-blank/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>LoggingMdcFilter</filter-name>
    <filter-class>org.apache.myfaces.tobago.internal.webapp.LoggingMdcFilter</filter-class>
  </filter>
```

### ServletWithoutMappingInspection
Filter should have a mapping
in `tobago-example/tobago-example-demo/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java

  <filter>
    <filter-name>LoggingMdcFilter</filter-name>
    <filter-class>org.apache.myfaces.tobago.internal.webapp.LoggingMdcFilter</filter-class>
  </filter>
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u20ac` can be replaced with '€'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/WriterHelper.java`
#### Snippet
```java
   */
  protected void writeDecRef(final char ch) throws IOException {
    if (ch == '\u20ac') {
      out.write("&euro;");
      return;
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2192` can be replaced with '→'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java
    if (data instanceof AbstractUITreeListbox) {
      if (folder) {
        writer.writeText(" \u2192"); // this is an right arrow →
      }
      writer.endElement(HtmlElements.OPTION);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `myRenderer` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    final RenderKitFactory rkFactory = (RenderKitFactory) FactoryFinder.getFactory(FactoryFinder.RENDER_KIT_FACTORY);
    final RenderKit renderKit = rkFactory.getRenderKit(facesContext, facesContext.getViewRoot().getRenderKitId());
    final Renderer myRenderer = renderKit.getRenderer(family, rendererType);
    return myRenderer;
  }
```

### UnnecessaryLocalVariable
Local variable `tobagoSelectItem` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
          Markup markup = null;
          if (uiSelectItem instanceof org.apache.myfaces.tobago.component.UISelectItem) {
            final org.apache.myfaces.tobago.component.UISelectItem tobagoSelectItem
                = (org.apache.myfaces.tobago.component.UISelectItem) uiSelectItem;
            image = tobagoSelectItem.getItemImage();
```

### UnnecessaryLocalVariable
Local variable `converted` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectItem.java`
#### Snippet
```java
  public Object getItemValue() {
    if (itemValueLiteral && !(getParent() instanceof UISelectMany)) {
      final Object converted = ComponentUtils.getConvertedValue(
          FacesContext.getCurrentInstance(), getParent(), (String) super.getItemValue());
      return converted;
```

## RuleId[id=CopyConstructorMissesField]
### CopyConstructorMissesField
Copy constructor does not copy field 'type'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SolarObject.java`
#### Snippet
```java
  }

  public SolarObject(final SolarObject solarObject) {
    this.name = solarObject.getName();
    this.number = solarObject.getNumber();
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/LocaleUtils.java`
#### Snippet
```java

    if (locale == null) {
      return Arrays.asList("");
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
        }
        final SelectItem[] selectItems = ((SelectItemGroup) item).getSelectItems();
        renderSelectItems(component, optionClass, Arrays.asList(selectItems), values, submittedValues,
            onlySelected, writer, facesContext);
        writer.endElement(HtmlElements.OPTGROUP);
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/TagMethodExpression.java`
#### Snippet
```java
  }

  public boolean equals(final Object obj) {
    return this.orig.equals(obj);
  }
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Map.putAll()' call
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigMerger.java`
#### Snippet
```java
      final Map<String, String> mimeTypes = tobagoConfig.getMimeTypes();
      for (final Map.Entry<String, String> entry : fragment.getMimeTypes().entrySet()) {
        mimeTypes.put(entry.getKey(), entry.getValue());
      }

```

