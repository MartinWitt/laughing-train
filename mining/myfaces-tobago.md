# myfaces-tobago 
 
# Bad smells
I found 932 bad smells with 75 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 220 | false |
| UnnecessaryFullyQualifiedName | 172 | false |
| AbstractClassNeverImplemented | 85 | false |
| SizeReplaceableByIsEmpty | 48 | true |
| BoundedWildcard | 44 | false |
| DataFlowIssue | 40 | false |
| RedundantFieldInitialization | 33 | false |
| DynamicRegexReplaceableByCompiledPattern | 25 | false |
| DeprecatedIsStillUsed | 24 | false |
| CommentedOutCode | 23 | false |
| ZeroLengthArrayInitialization | 20 | false |
| RedundantImplements | 16 | false |
| UtilityClassWithoutPrivateConstructor | 14 | true |
| DefaultAnnotationParam | 11 | false |
| RedundantMethodOverride | 10 | false |
| ObsoleteCollection | 9 | false |
| NonShortCircuitBoolean | 9 | false |
| EmptyMethod | 9 | false |
| ConstantValue | 9 | false |
| UnnecessaryBoxing | 9 | false |
| TrivialStringConcatenation | 8 | false |
| DuplicateBranchesInSwitch | 5 | false |
| NestedAssignment | 5 | false |
| UnusedAssignment | 5 | false |
| KeySetIterationMayUseEntrySet | 4 | false |
| ReplaceAssignmentWithOperatorAssignment | 4 | false |
| CallToStringConcatCanBeReplacedByOperator | 4 | false |
| NonSerializableFieldInSerializableClass | 4 | false |
| StringEqualsEmptyString | 4 | false |
| UnnecessarySuperQualifier | 3 | false |
| HtmlWrongAttributeValue | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| NonProtectedConstructorInAbstractClass | 3 | true |
| WrapperTypeMayBePrimitive | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| IgnoreResultOfCall | 2 | false |
| ClassNameSameAsAncestorName | 2 | false |
| IfStatementWithIdenticalBranches | 2 | false |
| SynchronizeOnThis | 2 | false |
| StringOperationCanBeSimplified | 2 | false |
| UnnecessaryCallToStringValueOf | 2 | false |
| UnnecessaryToStringCall | 2 | true |
| NonStrictComparisonCanBeEquality | 2 | true |
| ConditionCoveredByFurtherCondition | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| EmptyStatementBody | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| RegExpRedundantEscape | 1 | false |
| RegExpSimplifiable | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| SillyAssignment | 1 | false |
| InstanceofIncompatibleInterface | 1 | false |
| UseOfPropertiesAsHashtable | 1 | false |
| CastConflictsWithInstanceof | 1 | false |
| MethodOverridesStaticMethod | 1 | false |
| RedundantCollectionOperation | 1 | false |
| AssignmentToForLoopParameter | 1 | false |
| SetReplaceableByEnumSet | 1 | false |
| RedundantSuppression | 1 | false |
| SystemOutErr | 1 | false |
| ThrowablePrintStackTrace | 1 | false |
| Java8MapApi | 1 | false |
| Convert2Lambda | 1 | false |
| CopyConstructorMissesField | 1 | false |
| WaitNotInLoop | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
| UseBulkOperation | 1 | false |
| CastCanBeRemovedNarrowingVariableType | 1 | false |
## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
            itemDescription = itemDescription.toString();
          }
          final Boolean itemDisabled = getBooleanAttribute(currentUISelectItems, ITEM_DISABLED_ATTR, false);
          final Boolean itemLabelEscaped = getBooleanAttribute(currentUISelectItems, ITEM_LABEL_ESCAPED_ATTR, true);
          final Object noSelectionValue = attributeMap.get(NO_SELECTION_VALUE_ATTR);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
          }
          final Boolean itemDisabled = getBooleanAttribute(currentUISelectItems, ITEM_DISABLED_ATTR, false);
          final Boolean itemLabelEscaped = getBooleanAttribute(currentUISelectItems, ITEM_LABEL_ESCAPED_ATTR, true);
          final Object noSelectionValue = attributeMap.get(NO_SELECTION_VALUE_ATTR);
          item = new SelectItem(itemValue,
```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/CheckstyleConfigGenerator.java`
#### Snippet
```java

    final String shortName = taglibAnnotation.shortName();
    if (shortName.length() != 2) {

    }
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
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
    while (!list.isEmpty()) {
      field[position] = list.next();
//      LOG.debug(depth);
//      LOG.debug(this);
      if (checkRules()) {
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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
  public List<Boolean> getJunctions() {
    TreeNode node = getRowData();
    final List<Boolean> junctions = new Stack<>();
    while (node != null) {
      junctions.add(hasNextSibling(node));
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
  private String tagName;

  private Stack<String> stack;

  public TobagoConfigParser() {
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java

    buffer = new StringBuilder();
    stack = new Stack<>();
  }

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
public class DebugResponseWriterWrapper extends TobagoResponseWriter {

  private Stack<Object> stack = new Stack<>();
  private Set<MarkupLanguageAttributes> usedAttributes = new HashSet<>();

```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
public class DebugResponseWriterWrapper extends TobagoResponseWriter {

  private Stack<Object> stack = new Stack<>();
  private Set<MarkupLanguageAttributes> usedAttributes = new HashSet<>();

```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java
    }

    public Stack<Byte> asStack() {
      final Stack<Byte> stack = new Stack<>();
      stack.addAll(list);
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java

    public Stack<Byte> asStack() {
      final Stack<Byte> stack = new Stack<>();
      stack.addAll(list);
      return stack;
```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java

    public Stack<Byte> asStack() {
      final Stack<Byte> stack = new Stack<>();
      stack.addAll(list);
      return stack;
```

### ObsoleteCollection
Obsolete collection type `Stack` used
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/sudoku/Sudoku.java`
#### Snippet
```java

  private byte[] field;
  private Stack<Byte> undefined;

  private int depth;
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
Iteration over `headerMap.keySet()` may be replaced with 'entrySet()' iteration
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugPhaseListener.java`
#### Snippet
```java
          }
          final Map headerMap = externalContext.getRequestHeaderMap();
          for (final Object key : headerMap.keySet()) {
            LOG.trace("Header : '" + key + "' = '" + headerMap.get(key) + "'");
          }
```

### KeySetIterationMayUseEntrySet
Iteration over `parameterMap.keySet()` may be replaced with 'entrySet()' iteration
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugPhaseListener.java`
#### Snippet
```java
          }
          final Map parameterMap = externalContext.getRequestParameterMap();
          for (final Object key : parameterMap.keySet()) {
            LOG.trace("Param  : '" + key + "' = '" + parameterMap.get(key) + "'");
          }
```

### KeySetIterationMayUseEntrySet
Iteration over `attributes.keySet()` may be replaced with 'entrySet()' iteration
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ManifestReader.java`
#### Snippet
```java
        final Manifest manifest = new Manifest(url.openStream());
        final Attributes attributes = manifest.getMainAttributes();
        for (final Object key : attributes.keySet()) {
          jar.add(new ManifestEntry(key.toString(), attributes.get(key).toString()));
        }
```

### KeySetIterationMayUseEntrySet
Iteration over `searchIndex.keySet()` may be replaced with 'entrySet()' iteration
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java
  public List<NavigationNode> search(final String searchString) {
    List<NavigationNode> result = new ArrayList<>(20);
    for (String s : searchIndex.keySet()) {
      if (s.contains(searchString.toLowerCase())) {
        result.add(searchIndex.get(s));
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

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`superClassName.length() > 0` can be replaced with '!superClassName.isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassInfo.java`
#### Snippet
```java

  public boolean hasSuperClass() {
    return superClassName != null && superClassName.length() > 0;
  }

```

### SizeReplaceableByIsEmpty
`annotations.size() == 0` can be replaced with 'annotations.isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/AbstractGenerator.java`
#### Snippet
```java
    }

    if (annotations.size() == 0) {
      // TDB Why this case happen?
      return false;
```

### SizeReplaceableByIsEmpty
`facets.size() > 0` can be replaced with '!facets.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugUtils.java`
#### Snippet
```java
      }
      final Map facets = component.getFacets();
      if (facets.size() > 0) {
        for (final Map.Entry<String, UIComponent> entry : (Set<Map.Entry<String, UIComponent>>) facets.entrySet()) {
          final UIComponent facet = entry.getValue();
```

### SizeReplaceableByIsEmpty
`tagAttribute.name().length() > 0` can be replaced with '!tagAttribute.name().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/CheckstyleConfigGenerator.java`
#### Snippet
```java

        String attributeStr = simpleName.substring(3, 4).toLowerCase(Locale.ENGLISH) + simpleName.substring(4);
        if (tagAttribute.name().length() > 0) {
          attributeStr = tagAttribute.name();
        }
```

### SizeReplaceableByIsEmpty
`annotationTag.deprecatedName().length() > 0` can be replaced with '!annotationTag.deprecatedName().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/CheckstyleConfigGenerator.java`
#### Snippet
```java
      }
      addAttributes(typeElement, taglib, parent, annotationTag.name(), document);
      if (annotationTag.deprecatedName() != null && annotationTag.deprecatedName().length() > 0) {
        addTag(taglib, parent, annotationTag.deprecatedName(), document);
        addAttributes(typeElement, taglib, parent, annotationTag.name(), document);
```

### SizeReplaceableByIsEmpty
`tagAttribute.name().length() > 0` can be replaced with '!tagAttribute.name().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/CheckstyleConfigGenerator.java`
#### Snippet
```java

            String attributeStr = simpleName.substring(3, 4).toLowerCase(Locale.ENGLISH) + simpleName.substring(4);
            if (tagAttribute.name().length() > 0) {
              attributeStr = tagAttribute.name();
            }
```

### SizeReplaceableByIsEmpty
`tagAttribute.name().length() > 0` can be replaced with '!tagAttribute.name().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
        final Element attribute = document.createElement("attribute");
        String attributeName = simpleName.substring(3, 4).toLowerCase(Locale.ENGLISH) + simpleName.substring(4);
        if (tagAttribute.name().length() > 0) {
          attributeName = tagAttribute.name();
        }
```

### SizeReplaceableByIsEmpty
`preliminary.value().length() > 0` can be replaced with '!preliminary.value().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
    if (preliminary != null) {
      description.append("<p>**** Preliminary. Maybe subject to changed in a future version");
      if (preliminary.value().length() > 0) {
        description.append(": ");
        description.append(preliminary.value());
```

### SizeReplaceableByIsEmpty
`comment.length() > 0` can be replaced with '!comment.isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
      }
      comment = comment.trim();
      if (comment.length() > 0) {
        //description.append("<p>");
        description.append(comment);
```

### SizeReplaceableByIsEmpty
`annotationTag.deprecatedName().length() > 0` can be replaced with '!annotationTag.deprecatedName().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
      addAttributes(typeElement, tag, document);
      parent.appendChild(tag);
      if (annotationTag.deprecatedName() != null && annotationTag.deprecatedName().length() > 0) {
        final Element deprecatedTag = createTag(typeElement, annotationTag, document, true);
        addAttributes(typeElement, deprecatedTag, document);
```

### SizeReplaceableByIsEmpty
`list.size() == 0` can be replaced with 'list.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SortedColumnList.java`
#### Snippet
```java

  public boolean isEmpty() {
    return list.size() == 0;
  }

```

### SizeReplaceableByIsEmpty
`list.size() > 0` can be replaced with '!list.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SortedColumnList.java`
#### Snippet
```java

  public SortedColumn getFirst() {
    return list.size() > 0 ? list.get(0) : null;
  }

```

### SizeReplaceableByIsEmpty
`map.size() > 0` can be replaced with '!map.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/config/TobagoConfig.java`
#### Snippet
```java
        final Application application = facesContext.getApplication();
        final Map<String, String> map = application.getDefaultValidatorInfo();
        if (map.size() > 0) {
          defaultValidatorInfo = Collections.unmodifiableMap(map);
        } else {
```

### SizeReplaceableByIsEmpty
`asString.length() > 0` can be replaced with '!asString.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    } else if (character instanceof String) {
      final String asString = (String) character;
      return asString.length() > 0 ? asString.charAt(0) : null;
    } else {
      LOG.warn("Unknown type '" + character.getClass().getName()
```

### SizeReplaceableByIsEmpty
`comment.length() > 0` can be replaced with '!comment.isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      }
      comment = comment.trim();
      if (comment.length() > 0) {
        final org.jdom2.Element description = new org.jdom2.Element(DESCRIPTION, namespace);
        description.setText(comment);
```

### SizeReplaceableByIsEmpty
`description.length() > 0` can be replaced with '!description.isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final org.jdom2.Element facetElement = new org.jdom2.Element(FACET, namespace);
      final String description = facet.description();
      if (description.length() > 0) {
        final org.jdom2.Element facetDescription = new org.jdom2.Element(DESCRIPTION, namespace);
        facetDescription.setText(description);
```

### SizeReplaceableByIsEmpty
`componentAttribute.defaultValue().length() > 0` can be replaced with '!componentAttribute.defaultValue().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          attribute.addContent(attributeName);
          attribute.addContent(attributeClass);
          if (componentAttribute.defaultValue().length() > 0) {
            final org.jdom2.Element defaultValue = new org.jdom2.Element(DEFAULT_VALUE, namespace);
            defaultValue.setText(componentAttribute.defaultValue());
```

### SizeReplaceableByIsEmpty
`componentAttribute.defaultValue().length() > 0` can be replaced with '!componentAttribute.defaultValue().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          property.addContent(propertyName);
          property.addContent(propertyClass);
          if (componentAttribute.defaultValue().length() > 0) {
            final org.jdom2.Element defaultValue = new org.jdom2.Element(DEFAULT_VALUE, namespace);
            defaultValue.setText(componentAttribute.defaultValue());
```

### SizeReplaceableByIsEmpty
`validatorAnn.id().length() > 0` can be replaced with '!validatorAnn.id().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Validator validatorAnn = typeElement.getAnnotation(Validator.class);
    final org.jdom2.Element validator = new org.jdom2.Element(VALIDATOR, namespace);
    if (validatorAnn.id().length() > 0) {
      final org.jdom2.Element validatorId = new org.jdom2.Element(VALIDATOR_ID, namespace);
      validatorId.setText(validatorAnn.id());
```

### SizeReplaceableByIsEmpty
`validatorAnn.forClass().length() > 0` can be replaced with '!validatorAnn.forClass().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      validatorId.setText(validatorAnn.id());
      validator.addContent(validatorId);
    } else if (validatorAnn.forClass().length() > 0) {
      final org.jdom2.Element validatorForClass = new org.jdom2.Element(VALIDATOR_FOR_CLASS, namespace);
      validatorForClass.setText(validatorAnn.forClass());
```

### SizeReplaceableByIsEmpty
`converterAnn.id().length() > 0` can be replaced with '!converterAnn.id().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Converter converterAnn = typeElement.getAnnotation(Converter.class);
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
    if (converterAnn.id().length() > 0) {
      final org.jdom2.Element converterId = new org.jdom2.Element(CONVERTER_ID, namespace);
      converterId.setText(converterAnn.id());
```

### SizeReplaceableByIsEmpty
`converterAnn.forClass().length() > 0` can be replaced with '!converterAnn.forClass().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      converterId.setText(converterAnn.id());
      converter.addContent(converterId);
    } else if (converterAnn.forClass().length() > 0) {
      final org.jdom2.Element converterForClass = new org.jdom2.Element(CONVERTER_FOR_CLASS, namespace);
      converterForClass.setText(converterAnn.forClass());
```

### SizeReplaceableByIsEmpty
`value.length() == 0` can be replaced with 'value.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java
   */
  public static boolean isEmpty(final String value) {
    return value == null || value.length() == 0;
  }

```

### SizeReplaceableByIsEmpty
`sheetState.getSelectedRows().size() > 0` can be replaced with '!sheetState.getSelectedRows().isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      // memorize selected rows
      List<Object> selectedDataRows = null;
      if (sheetState.getSelectedRows().size() > 0) {
        selectedDataRows = new ArrayList<>(sheetState.getSelectedRows().size());
        Object dataRow;
```

### SizeReplaceableByIsEmpty
`str.length() == 0` can be replaced with 'str.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/NumberUtils.java`
#### Snippet
```java
public class NumberUtils {
  public static boolean isDigits(final String str) {
    if (str == null || str.length() == 0) {
      return false;
    }
```

### SizeReplaceableByIsEmpty
`buffer.toString().trim().length() == 0` can be replaced with 'buffer.toString().trim().isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java

    // No unused content should be collected, specially text mixed with tags.
    assert buffer.toString().trim().length() == 0;

    buffer.setLength(0);
```

### SizeReplaceableByIsEmpty
`columnWidths.size() > 0` can be replaced with '!columnWidths.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SheetState.java`
#### Snippet
```java
      }
    }
    return columnWidths.size() > 0;
  }

```

### SizeReplaceableByIsEmpty
`result.length() > 0` can be replaced with '!result.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/HtmlRendererUtils.java`
#### Snippet
```java
    String result = title;
    if (tip != null) {
      if (result != null && result.length() > 0) {
        result += " :: ";
      } else {
```

### SizeReplaceableByIsEmpty
`file.getName().length() == 0` can be replaced with 'file.getName().isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIFile.java`
#### Snippet
```java
      if (getSubmittedValue() instanceof Part) {
        final Part file = (Part) getSubmittedValue();
        if (file == null || file.getName().length() == 0) {
          addErrorMessage(facesContext);
          setValid(false);
```

### SizeReplaceableByIsEmpty
`comment.length() > 0` can be replaced with '!comment.isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
      }
      comment = comment.trim();
      if (comment.length() > 0) {
        return comment;
      }
```

### SizeReplaceableByIsEmpty
`uiComponentTagAttribute.defaultValue().length() > 0` can be replaced with '!uiComponentTagAttribute.defaultValue().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
        propertyInfo.setType(type);
        propertyInfo.setDefaultValue(
            uiComponentTagAttribute.defaultValue().length() > 0 ? uiComponentTagAttribute.defaultValue() : null);
        propertyInfo.setDefaultCode(
            uiComponentTagAttribute.defaultCode().length() > 0 ? uiComponentTagAttribute.defaultCode() : null);
```

### SizeReplaceableByIsEmpty
`uiComponentTagAttribute.defaultCode().length() > 0` can be replaced with '!uiComponentTagAttribute.defaultCode().isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
            uiComponentTagAttribute.defaultValue().length() > 0 ? uiComponentTagAttribute.defaultValue() : null);
        propertyInfo.setDefaultCode(
            uiComponentTagAttribute.defaultCode().length() > 0 ? uiComponentTagAttribute.defaultCode() : null);
        propertyInfo.setMethodSignature(uiComponentTagAttribute.methodSignature());
        propertyInfo.setDeprecated(declaration.getAnnotation(Deprecated.class) != null);
```

### SizeReplaceableByIsEmpty
`serializableMap.size() == 0` can be replaced with 'serializableMap.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    final Map serializableMap = (isInitialStateMarked()) ? deltas : fullState;

    if (serializableMap == null || serializableMap.size() == 0) {
      return null;
    }
```

### SizeReplaceableByIsEmpty
`searchId.length() > 0` can be replaced with '!searchId.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
  public String stripRowIndex(final String initialSearchId) {
    String searchId = initialSearchId;
    if (searchId.length() > 0 && Character.isDigit(searchId.charAt(0))) {
      for (int i = 1; i < searchId.length(); ++i) {
        final char c = searchId.charAt(i);
```

### SizeReplaceableByIsEmpty
`parts.size() > 0` can be replaced with '!parts.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/FileRenderer.java`
#### Snippet
```java
              parts.add(new HttpPartWrapper(part));
            }
            if (!multiple && parts.size() > 0) { // found one, and one is enough
              break;
            }
```

### SizeReplaceableByIsEmpty
`parts.size() > 0` can be replaced with '!parts.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/FileRenderer.java`
#### Snippet
```java
          component.setSubmittedValue(parts.toArray(new Part[0]));
        } else {
          if (parts.size() > 0) {
            LOG.debug("Adding one part {}.", parts.get(0));
            component.setSubmittedValue(parts.get(0));
```

### SizeReplaceableByIsEmpty
`operations.size() > 0` can be replaced with '!operations.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java

    Collapse collapse = null;
    if (operations.size() > 0) {
      final AbstractUIOperation operation = operations.get(0);
      final ValueExpression valueExpression = operation.getValueExpression("for");
```

### SizeReplaceableByIsEmpty
`summary.length() > 0` can be replaced with '!summary.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/MessagesRenderer.java`
#### Snippet
```java
    final String summary = message.getSummary();
    final String detail = message.getDetail();
    final boolean showSummary = summary != null && messages.isShowSummary() && summary.length() > 0;
    final boolean showDetails = detail != null && messages.isShowDetail() && detail.length() > 0;
    writer.startElement(HtmlElements.LABEL);
```

### SizeReplaceableByIsEmpty
`detail.length() > 0` can be replaced with '!detail.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/MessagesRenderer.java`
#### Snippet
```java
    final String detail = message.getDetail();
    final boolean showSummary = summary != null && messages.isShowSummary() && summary.length() > 0;
    final boolean showDetails = detail != null && messages.isShowDetail() && detail.length() > 0;
    writer.startElement(HtmlElements.LABEL);
    writer.writeAttribute(HtmlAttributes.FOR, forId, false);
```

### SizeReplaceableByIsEmpty
`messageList.size() > 0` can be replaced with '!messageList.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/MessagesRenderer.java`
#### Snippet
```java
      first = false;
    }
    if (messageList.size() > 0) {
      writer.endElement(HtmlElements.DIV); // close open tag from for-loop
    }
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyListController.java`
#### Snippet
```java
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (!line.startsWith("#") && line.length() > 0) {
          names.add(line);
        }
```

### SizeReplaceableByIsEmpty
`specialEventNames.size() > 0` can be replaced with '!specialEventNames.isEmpty()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/EventController.java`
#### Snippet
```java
      }

      return specialEventNames.size() > 0 ? concatStrings(specialEventNames) : "";
    }

```

### SizeReplaceableByIsEmpty
`sortedNodes.size() > 0` can be replaced with '!sortedNodes.isEmpty()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java

    // after sorting the first node is the root node.
    root = sortedNodes.size() > 0 ? sortedNodes.get(0) : null;

    // build the tree from the list
```

### SizeReplaceableByIsEmpty
`messages.size() == 0` can be replaced with 'messages.isEmpty()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/BundleController.java`
#### Snippet
```java

  public List<BundleEntry> getMessages() {
    if (messages.size() == 0) {
      final FacesContext facesContext = FacesContext.getCurrentInstance();
      final Application application = facesContext.getApplication();
```

### SizeReplaceableByIsEmpty
`resources.size() == 0` can be replaced with 'resources.isEmpty()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/BundleController.java`
#### Snippet
```java

  public List<BundleEntry> getResources() {
    if (resources.size() == 0) {
      final FacesContext facesContext = FacesContext.getCurrentInstance();
      final ResourceBundle bundle =
```

### SizeReplaceableByIsEmpty
`line.length() > 0` can be replaced with '!line.isEmpty()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectOneListController.java`
#### Snippet
```java
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (!line.startsWith("#") && line.length() > 0) {
          names.add(line);
        }
```

### SizeReplaceableByIsEmpty
`prevs.size() > 0` can be replaced with '!prevs.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
    }

    int skip = prevs.size() > 0 ? prevs.get(0) : 1;
    if (!sheet.isShowDirectLinksArrows() && skip > 1) {
      skip -= linkCount - (linkCount / 2);
```

### SizeReplaceableByIsEmpty
`nexts.size() > 0` can be replaced with '!nexts.isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
    }

    skip = nexts.size() > 0 ? nexts.get(nexts.size() - 1) : pages;
    if (!sheet.isShowDirectLinksArrows() && skip < pages) {
      skip += linkCount / 2;
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

## RuleId[id=NonShortCircuitBoolean]
### NonShortCircuitBoolean
Non-short-circuit boolean expression `render |= writeCssItem(builder, second)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/webapp/TobagoResponseWriter.java`
#### Snippet
```java
    }
    if (second != null) {
      render |= writeCssItem(builder, second);
    }
    if (third != null) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `render |= writeCssItem(builder, third)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/webapp/TobagoResponseWriter.java`
#### Snippet
```java
    }
    if (third != null) {
      render |= writeCssItem(builder, third);
    }
    if (fourth != null) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `render |= writeCssItem(builder, fourth)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/webapp/TobagoResponseWriter.java`
#### Snippet
```java
    }
    if (fourth != null) {
      render |= writeCssItem(builder, fourth);
    }
    if (fifth != null) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `render |= writeCssItem(builder, fifth)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/webapp/TobagoResponseWriter.java`
#### Snippet
```java
    }
    if (fifth != null) {
      render |= writeCssItem(builder, fifth);
    }
    if (sixth != null) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `render |= writeCssItem(builder, sixth)`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/webapp/TobagoResponseWriter.java`
#### Snippet
```java
    }
    if (sixth != null) {
      render |= writeCssItem(builder, sixth);
    }
    if (render) {
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `disabled | readonly`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyShuttleRenderer.java`
#### Snippet
```java
    writer.startElement(HtmlElements.DIV);
    writer.writeClassAttribute(BootstrapClass.BTN_GROUP_VERTICAL);
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_DOUBLE_RIGHT, "addAll");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_RIGHT, "add");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_LEFT, "remove");
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `disabled | readonly`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyShuttleRenderer.java`
#### Snippet
```java
    writer.writeClassAttribute(BootstrapClass.BTN_GROUP_VERTICAL);
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_DOUBLE_RIGHT, "addAll");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_RIGHT, "add");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_LEFT, "remove");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_DOUBLE_LEFT, "removeAll");
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `disabled | readonly`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyShuttleRenderer.java`
#### Snippet
```java
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_DOUBLE_RIGHT, "addAll");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_RIGHT, "add");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_LEFT, "remove");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_DOUBLE_LEFT, "removeAll");
    writer.endElement(HtmlElements.DIV);
```

### NonShortCircuitBoolean
Non-short-circuit boolean expression `disabled | readonly`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyShuttleRenderer.java`
#### Snippet
```java
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_RIGHT, "add");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_LEFT, "remove");
    createButton(facesContext, component, writer, disabled | readonly, Icons.CHEVRON_DOUBLE_LEFT, "removeAll");
    writer.endElement(HtmlElements.DIV);
    writer.endElement(HtmlElements.DIV);
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

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    if (facet instanceof ValueHolder && ((UIComponent) facet).isRendered()) {
      final ValueHolder valueHolder = (ValueHolder) facet;
      return "" + valueHolder.getValue();
    } else if (facet != null && !(facet instanceof ValueHolder)) {
      LOG.warn("The content of a confirmation facet must be a ValueHolder. Use e. g. <tc:out>.");
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

### TrivialStringConcatenation
Empty string used in concatenation
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeSelectRenderer.java`
#### Snippet
```java
  private String getClientIdWithoutRowIndex(final AbstractUIData data, final String id) {
    final char separatorChar = UINamingContainer.getSeparatorChar(FacesContext.getCurrentInstance());
    return id.substring(0, id.indexOf("" + separatorChar + data.getRowIndex() + separatorChar));
  }

```

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

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `NonFacesRequestServlet` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/servlet/NonFacesRequestServlet.java`
#### Snippet
```java
 */
@Deprecated
public abstract class NonFacesRequestServlet extends HttpServlet {

  private static final long serialVersionUID = -7448621953821447997L;
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISeparator` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISeparator.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SeparatorTagDeclaration}
 */
public abstract class AbstractUISeparator extends UIComponentBase implements Visual {

  public abstract String getLabel();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIRange` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIRange.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.RangeTagDeclaration}
 */
public abstract class AbstractUIRange extends AbstractUIInput {

  public abstract Integer getMin();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIColumnNode` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIColumnNode.java`
#### Snippet
```java
 * @since Tobago 2.0.0
 */
public abstract class AbstractUIColumnNode extends AbstractUITreeNode implements Visual {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIButton` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIButton.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.ButtonTagDeclaration}
 */
public abstract class AbstractUIButton extends AbstractUICommand {

}
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIConfig` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIConfig.java`
#### Snippet
```java
 */
@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUIConfig extends UIOutput {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectBoolean` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectBoolean.java`
#### Snippet
```java
import jakarta.faces.context.FacesContext;

public abstract class AbstractUISelectBoolean extends UISelectBoolean
    implements SupportsAutoSpacing, Visual, ClientBehaviorHolder, SupportFieldId, SupportsAccessKey,
    SupportsLabelLayout, SupportsHelp, SupportsDecorationPosition {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIScript` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIScript.java`
#### Snippet
```java
 */
@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUIScript extends UIComponentBase {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIHeader` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIHeader.java`
#### Snippet
```java
package org.apache.myfaces.tobago.internal.component;

public abstract class AbstractUIHeader extends AbstractUIPanelBase {

  public abstract boolean isFixed();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectBooleanCheckbox` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectBooleanCheckbox.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectBooleanCheckboxTagDeclaration}
 */
public abstract class AbstractUISelectBooleanCheckbox extends AbstractUISelectBoolean {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIStyle` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIStyle.java`
#### Snippet
```java
 */
@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUIStyle extends UIComponentBase {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIFile` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIFile.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.FileTagDeclaration}
 */
public abstract class AbstractUIFile extends UIInput implements SupportsLabelLayout, Visual, ClientBehaviorHolder,
    SupportFieldId, SupportsHelp, SupportsAutoSpacing, SupportsDecorationPosition {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUITreeLabel` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeLabel.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.LabelTagDeclaration}
 */
public abstract class AbstractUITreeLabel extends AbstractUILabelBase {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIReload` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIReload.java`
#### Snippet
```java
import jakarta.faces.component.UIComponentBase;

public abstract class AbstractUIReload extends UIComponentBase {

  public abstract boolean isUpdate();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITextarea` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITextarea.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TextareaTagDeclaration}
 */
public abstract class AbstractUITextarea extends AbstractUIInput implements SupportsAutocomplete {

  public abstract String getPlaceholder();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIColumnPanel` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIColumnPanel.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.ColumnPanelTagDeclaration}
 */
public abstract class AbstractUIColumnPanel extends AbstractUIColumnBase {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIFlowLayout` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIFlowLayout.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.FlowLayoutTagDeclaration}
 */
public abstract class AbstractUIFlowLayout extends AbstractUILayoutBase {

  public static final String COMPONENT_FAMILY = "org.apache.myfaces.tobago.FlowLayout";
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIImage` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIImage.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.ImageTagDeclaration}
 */
public abstract class AbstractUIImage extends UIGraphic implements Visual {

  public abstract boolean isDisabled();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectOneListbox` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectOneListbox.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectOneListboxTagDeclaration}
 */
public abstract class AbstractUISelectOneListbox extends AbstractUISelectOneBase implements SupportFieldId {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITreeSelect` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeSelect.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeSelectTagDeclaration}
 */
public abstract class AbstractUITreeSelect extends UISelectBoolean implements Visual, ClientBehaviorHolder {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIBar` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIBar.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.BarTagDeclaration}
 */
public abstract class AbstractUIBar extends AbstractUIPanelBase {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectBooleanToggle` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectBooleanToggle.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectBooleanToggleTagDeclaration}
 */
public abstract class AbstractUISelectBooleanToggle extends AbstractUISelectBoolean {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUICommand` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICommand.java`
#### Snippet
```java
 * Base class for commands.
 */
public abstract class AbstractUICommand extends AbstractUICommandBase
    implements SupportsAutoSpacing, SupportsAccessKey, Visual, ClientBehaviorHolder, SupportFieldId {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUITreeNodeBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java
 * Base class for tree node.
 */
public abstract class AbstractUITreeNodeBase extends AbstractUIColumnBase implements Visual {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIDate` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIDate.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.DateTagDeclaration}
 */
public abstract class AbstractUIDate extends AbstractUIInput {

  private transient String pattern;
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIColumnBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIColumnBase.java`
#### Snippet
```java
import jakarta.faces.component.UIColumn;

public abstract class AbstractUIColumnBase extends UIColumn implements Visual {

  public boolean isResizable() {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIOut` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIOut.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.OutTagDeclaration}
 */
public abstract class AbstractUIOut extends UIOutput implements SupportsLabelLayout, Visual, SupportsAutoSpacing,
    SupportsDecorationPosition {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectManyBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyBase.java`
#### Snippet
```java
 * Base class for multi select.
 */
public abstract class AbstractUISelectManyBase extends UISelectMany
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp,
    SupportsDecorationPosition {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectOneRadio` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectOneRadio.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectOneRadioTagDeclaration}
 */
public abstract class AbstractUISelectOneRadio extends AbstractUISelectOneBase implements RenderRange {

  private transient AbstractUISelectReference renderRangeReference;
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIFigure` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIFigure.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.FigureTagDeclaration}
 */
public abstract class AbstractUIFigure extends AbstractUIPanelBase {

  public abstract String getLabel();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIForm` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIForm.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.FormTagDeclaration}
 */
public abstract class AbstractUIForm extends AbstractUIFormBase {

  /**
```

### AbstractClassNeverImplemented
Abstract class `AbstractUILinks` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILinks.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.LinksTagDeclaration}
 */
public abstract class AbstractUILinks extends AbstractUIPanelBase implements SupportsAutoSpacing, SupportsDisabled {

  enum PropertyKeys {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectItem` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectItem.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectItemTagDeclaration}
 */
public abstract class AbstractUISelectItem extends UISelectItem implements Visual {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIInput` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIInput.java`
#### Snippet
```java
 * Base class for some inputs.
 */
public abstract class AbstractUIInput extends jakarta.faces.component.UIInput
    implements SupportsAccessKey, SupportsAutoSpacing, SupportsLabelLayout, Visual, ClientBehaviorHolder,
    SupportFieldId, SupportsHelp, SupportsDecorationPosition {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITreeIcon` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeIcon.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeIconTagDeclaration}
 */
public abstract class AbstractUITreeIcon extends AbstractUIImage {

  public abstract String getOpen();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUICollapsiblePanel` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICollapsiblePanel.java`
#### Snippet
```java
 * Base class for collapsible panels.
 */
public abstract class AbstractUICollapsiblePanel extends AbstractUIPanelBase {

  private transient Boolean submittedCollapsed;
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIRow` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIRow.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.RowTagDeclaration}
 */
public abstract class AbstractUIRow extends AbstractUIColumnBase implements ClientBehaviorHolder {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIMessages` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIMessages.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.MessagesTagDeclaration}
 */
public abstract class AbstractUIMessages extends jakarta.faces.component.UIMessages
    implements Visual {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIColumn` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIColumn.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.ColumnTagDeclaration}
 */
public abstract class AbstractUIColumn extends AbstractUIColumnBase {

//  public abstract Measure getWidth();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIBadge` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIBadge.java`
#### Snippet
```java
import jakarta.faces.component.UIOutput;

public abstract class AbstractUIBadge extends UIOutput implements Visual {

  public abstract String getTip();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIPanelBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPanelBase.java`
#### Snippet
```java
 * Base class for panels.
 */
public abstract class AbstractUIPanelBase extends jakarta.faces.component.UIPanel implements Visual {

  public abstract java.lang.String getTip();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUILayoutBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILayoutBase.java`
#### Snippet
```java
 * Base class for the layout manager components.
 */
public abstract class AbstractUILayoutBase extends UIComponentBase implements Visual {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIOperation` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIOperation.java`
#### Snippet
```java
 */
@Preliminary
public abstract class AbstractUIOperation extends UIComponentBase {

  public abstract String getName();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIBox` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIBox.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.BoxTagDeclaration}
 */
public abstract class AbstractUIBox extends AbstractUICollapsiblePanel implements SupportsAutoSpacing {

  public abstract String getLabel();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIButtons` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIButtons.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.ButtonsTagDeclaration}
 */
public abstract class AbstractUIButtons extends AbstractUIPanelBase implements SupportsAutoSpacing, SupportsDisabled {

  enum PropertyKeys {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectReference` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectReference.java`
#### Snippet
```java
import jakarta.faces.component.UIOutput;

public abstract class AbstractUISelectReference extends UIOutput {
  public abstract String getFor();

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIFlexLayout` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIFlexLayout.java`
#### Snippet
```java
 */
@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUIFlexLayout extends AbstractUILayoutBase {

  public static final String COMPONENT_FAMILY = "org.apache.myfaces.tobago.FlexLayout";
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITreeIndent` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeIndent.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeIndentTagDeclaration}
 */
public abstract class AbstractUITreeIndent extends UIGraphic implements Visual {

  public abstract boolean isShowJunctions();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUILink` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILink.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.LinkTagDeclaration}
 */
public abstract class AbstractUILink extends AbstractUICommand implements SupportsAccessKey {

  public abstract Integer getTabIndex();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIObject` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIObject.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.ObjectTagDeclaration}
 */
public abstract class AbstractUIObject extends UIOutput implements Visual {

  public abstract String getName();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUICommandBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICommandBase.java`
#### Snippet
```java
 */
@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUICommandBase extends UICommand
    implements ComponentSystemEventListener {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUISplitLayout` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISplitLayout.java`
#### Snippet
```java
@Preliminary
@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUISplitLayout extends AbstractUIFlexLayout {

  public static final String COMPONENT_FAMILY = "org.apache.myfaces.tobago.SplitLayout";
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIFormBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIFormBase.java`
#### Snippet
```java
 * Base class for form and page.
 */
public abstract class AbstractUIFormBase extends UIForm implements Visual {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIFooter` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIFooter.java`
#### Snippet
```java
package org.apache.myfaces.tobago.internal.component;

public abstract class AbstractUIFooter extends AbstractUIPanelBase {

  public abstract boolean isFixed();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITabGroup` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITabGroup.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TabGroupTagDeclaration}
 */
public abstract class AbstractUITabGroup extends AbstractUIPanelBase
    implements TabChangeSource, TobagoActionSource, ClientBehaviorHolder, SupportsAutoSpacing {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectManyList` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java
 * {@link SelectManyListTagDeclaration}
 */
public abstract class AbstractUISelectManyList extends AbstractUISelectManyBase
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp, SupportFieldId,
    SupportsFilter {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUILabel` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILabel.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.LabelTagDeclaration}
 */
public abstract class AbstractUILabel
    extends AbstractUILabelBase implements SupportsAccessKey {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIMetaLink` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIMetaLink.java`
#### Snippet
```java

@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUIMetaLink extends UIComponentBase {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectOneChoice` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectOneChoice.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectOneChoiceTagDeclaration}
 */
public abstract class AbstractUISelectOneChoice extends AbstractUISelectOneBase implements SupportFieldId {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectOneList` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectOneList.java`
#### Snippet
```java
import org.apache.myfaces.tobago.util.ComponentUtils;

public abstract class AbstractUISelectOneList extends AbstractUISelectOneBase implements SupportFieldId {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIProgress` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIProgress.java`
#### Snippet
```java
 */
@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public abstract class AbstractUIProgress extends UIOutput
    implements Visual, ComponentSystemEventListener, ClientBehaviorHolder {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIColumnSelector` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIColumnSelector.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.ColumnSelectorTagDeclaration}
 */
public abstract class AbstractUIColumnSelector extends AbstractUIColumnBase {

/* TBD
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITree` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITree.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeTagDeclaration}
 */
public abstract class AbstractUITree extends AbstractUIData implements NamingContainer, Visual {

  public static final String SUFFIX_PARENT = "parent";
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITab` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITab.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TabTagDeclaration}
 */
public abstract class AbstractUITab
    extends AbstractUIPanelBase implements ClientBehaviorHolder, SupportsAccessKey, NamingContainer {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIEvent` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIEvent.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.EventTagDeclaration}
 */
public abstract class AbstractUIEvent extends AbstractUICommandBase implements ClientBehaviorHolder {

  public abstract ClientBehaviors getEvent();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectManyShuttle` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyShuttle.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectManyShuttleTagDeclaration}
 */
public abstract class AbstractUISelectManyShuttle extends AbstractUISelectManyBase {

  public abstract String getSelectedLabel();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITreeListbox` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeListbox.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeListboxTagDeclaration}
 */
public abstract class AbstractUITreeListbox extends AbstractUITree {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectOneBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectOneBase.java`
#### Snippet
```java
 * Base class for select one.
 */
public abstract class AbstractUISelectOneBase extends jakarta.faces.component.UISelectOne
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp,
    SupportsDecorationPosition {
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISection` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISection.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SectionTagDeclaration}
 */
public abstract class AbstractUISection extends AbstractUICollapsiblePanel implements SupportsAutoSpacing {

  public abstract String getLabel();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIGridLayout` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIGridLayout.java`
#### Snippet
```java
@Preliminary
@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public abstract class AbstractUIGridLayout extends AbstractUILayoutBase implements ComponentSystemEventListener {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIPopup` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPopup.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.PopupTagDeclaration}
 */
public abstract class AbstractUIPopup extends AbstractUICollapsiblePanel
    implements NamingContainer {
}
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIPage` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPage.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.PageTagDeclaration}
 */
public abstract class AbstractUIPage extends AbstractUIFormBase implements ClientBehaviorHolder {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIStars` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIStars.java`
#### Snippet
```java

@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public abstract class AbstractUIStars extends AbstractUIInput {

  private int rangeValue;
```

### AbstractClassNeverImplemented
Abstract class `AbstractUITreeNode` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNode.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeNodeTagDeclaration}
 */
public abstract class AbstractUITreeNode extends AbstractUITreeNodeBase {

  public abstract boolean isDisabled();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectManyCheckbox` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyCheckbox.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectManyCheckboxTagDeclaration}
 */
public abstract class AbstractUISelectManyCheckbox extends AbstractUISelectManyBase implements RenderRange {

  private transient AbstractUISelectReference renderRangeReference;
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIHidden` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIHidden.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.HiddenTagDeclaration}
 */
public abstract class AbstractUIHidden extends UIInput {

  public abstract boolean isDisabled();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIIn` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIIn.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.InTagDeclaration}
 */
public abstract class AbstractUIIn extends AbstractUIInput implements SupportsAutocomplete {

  public abstract String getPlaceholder();
```

### AbstractClassNeverImplemented
Abstract class `AbstractUIPanel` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPanel.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.PanelTagDeclaration}
 */
public abstract class AbstractUIPanel extends AbstractUICollapsiblePanel implements ClientBehaviorHolder {
}

```

### AbstractClassNeverImplemented
Abstract class `AbstractUISegmentLayout` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISegmentLayout.java`
#### Snippet
```java
 * @since 3.0.0
 */
public abstract class AbstractUISegmentLayout extends AbstractUILayoutBase implements SupportsSegmentLayout {

  public static final String COMPONENT_FAMILY = "org.apache.myfaces.tobago.SegmentLayout";
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISelectManyListbox` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyListbox.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SelectManyListboxTagDeclaration}
 */
public abstract class AbstractUISelectManyListbox extends AbstractUISelectManyBase implements SupportFieldId {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISuggest` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISuggest.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.SuggestTagDeclaration}
 */
public abstract class AbstractUISuggest
    extends UIComponentBase implements ClientBehaviorHolder {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIMeta` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIMeta.java`
#### Snippet
```java

@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUIMeta extends UIComponentBase {

  @Override
```

### AbstractClassNeverImplemented
Abstract class `AbstractUILabelBase` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILabelBase.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.LabelTagDeclaration}
 */
public abstract class AbstractUILabelBase
    extends jakarta.faces.component.UIOutput implements Visual {

```

### AbstractClassNeverImplemented
Abstract class `AbstractUIData` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
 * Base class for sheet and tree.
 */
public abstract class AbstractUIData extends jakarta.faces.component.UIData implements Visual {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### AbstractClassNeverImplemented
Abstract class `AbstractUISheet` has no concrete subclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
 */
@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public abstract class AbstractUISheet extends AbstractUIData
    implements SheetStateChangeSource, SortActionSource, ClientBehaviorHolder, Visual,
    ComponentSystemEventListener {
```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends FacesMessage`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
  }

  public static FacesMessage.Severity getMaximumSeverity(final List<FacesMessage> messages) {
    FacesMessage.Severity max = null;
    for (final FacesMessage message : messages) {
```

### BoundedWildcard
Can generalize to `? super UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
  }

  private static void addLayoutChildren(final UIComponent component, final List<UIComponent> result) {
    for (final UIComponent child : component.getChildren()) {
      if (child instanceof Visual && !((Visual) child).isPlain()
```

### BoundedWildcard
Can generalize to `? super AbstractUIForm`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static void findSubForms(final List<AbstractUIForm> collect, final UIComponent component) {
    final Iterator<UIComponent> kids = component.getFacetsAndChildren();
    while (kids.hasNext()) {
```

### BoundedWildcard
Can generalize to `? extends org.jdom2.Element`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private org.jdom2.Element getEqualElement(
      final List<org.jdom2.Element> components, final org.jdom2.Element newElement) {
    for (final org.jdom2.Element element : components) {
      if (equals(element, newElement)) {
```

### BoundedWildcard
Can generalize to `? super org.jdom2.Element`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addAttribute(
      final ExecutableElement executableElement, final List<org.jdom2.Element> attributes,
      final List<org.jdom2.Element> properties,
      final Namespace namespace) {
```

### BoundedWildcard
Can generalize to `? super org.jdom2.Element`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  protected void addAttribute(
      final ExecutableElement executableElement, final List<org.jdom2.Element> attributes,
      final List<org.jdom2.Element> properties,
      final Namespace namespace) {
    final UIComponentTagAttribute componentAttribute = executableElement.getAnnotation(UIComponentTagAttribute.class);
```

### BoundedWildcard
Can generalize to `? super org.jdom2.Element`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private void addValidator(
      final TypeElement typeElement, final List<org.jdom2.Element> newValidators, final Namespace namespace) {
    final Validator validatorAnn = typeElement.getAnnotation(Validator.class);
    final org.jdom2.Element validator = new org.jdom2.Element(VALIDATOR, namespace);
```

### BoundedWildcard
Can generalize to `? super org.jdom2.Element`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addRendererElement(
      final ComponentInfo componentInfo, final UIComponentTag componentTag, final List<org.jdom2.Element> renderer,
      final Namespace namespace)
      throws IOException, NoSuchFieldException, IllegalAccessException {
```

### BoundedWildcard
Can generalize to `? super org.jdom2.Element`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private void addConverter(
      final TypeElement typeElement, final List<org.jdom2.Element> newConverters, final Namespace namespace) {
    final Converter converterAnn = typeElement.getAnnotation(Converter.class);
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
```

### BoundedWildcard
Can generalize to `? extends UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
  }

  private static UIComponent getFirstSortableChild(final List<UIComponent> children) {
    UIComponent result = null;

```

### BoundedWildcard
Can generalize to `? super TobagoConfigFragment`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigLoader.java`
#### Snippet
```java

  private void loadFromWebInf(
      final List<TobagoConfigFragment> configFragmentList, final ServletContext servletContext)
      throws IOException, SAXException, ParserConfigurationException, URISyntaxException {

```

### BoundedWildcard
Can generalize to `? super TobagoConfigFragment`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigLoader.java`
#### Snippet
```java
  }

  private void loadFromClasspath(final List<TobagoConfigFragment> configFragmentList, final String... alternative)
      throws ServletException {

```

### BoundedWildcard
Can generalize to `? super TobagoConfigFragment`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigSorter.java`
#### Snippet
```java
   * Internal recursive method for the topological sort.
   */
  private void topologicalSort0(Vertex vertex, List<TobagoConfigFragment> result) {
    if (vertex.isVisited()) {
      return;
```

### BoundedWildcard
Can generalize to `? extends TobagoConfigFragment`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigSorter.java`
#### Snippet
```java
  }

  private void logResult(List<TobagoConfigFragment> result) {
    if (LOG.isInfoEnabled()) {
      final boolean debug = LOG.isDebugEnabled();
```

### BoundedWildcard
Can generalize to `? extends TobagoConfigFragment`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigSorter.java`
#### Snippet
```java
  }

  private TobagoConfigSorter(final List<TobagoConfigFragment> fragmentList) {
    for (TobagoConfigFragment tobagoConfigFragment : fragmentList) {
      vertices.add(new Vertex(tobagoConfigFragment));
```

### BoundedWildcard
Can generalize to `? extends ThemeImpl`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigMerger.java`
#### Snippet
```java
  }

  private void resolveThemes(final Map<String, ThemeImpl> map) {
    for (final ThemeImpl theme : map.values()) {
      final String fallbackName = theme.getFallbackName();
```

### BoundedWildcard
Can generalize to `? extends TobagoConfigFragment`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigMerger.java`
#### Snippet
```java
  private final TobagoConfig tobagoConfig;

  private TobagoConfigMerger(final List<TobagoConfigFragment> fragments, final TobagoConfig tobagoConfig) {
    this.fragments = fragments;
    this.tobagoConfig = tobagoConfig;
```

### BoundedWildcard
Can generalize to `? super String`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
  }

  protected void addProperty(final ExecutableElement declaration, final Map<String, PropertyInfo> properties) {
    final TagAttribute tagAttribute = declaration.getAnnotation(TagAttribute.class);
    final UIComponentTagAttribute uiComponentTagAttribute = declaration.getAnnotation(UIComponentTagAttribute.class);
```

### BoundedWildcard
Can generalize to `? super PropertyInfo`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
  }

  protected void addProperty(final ExecutableElement declaration, final Map<String, PropertyInfo> properties) {
    final TagAttribute tagAttribute = declaration.getAnnotation(TagAttribute.class);
    final UIComponentTagAttribute uiComponentTagAttribute = declaration.getAnnotation(UIComponentTagAttribute.class);
```

### BoundedWildcard
Can generalize to `? super Serializable`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java

  private static Object removeValueOrKeyFromMap(
      final Map<Serializable, Object> stateMap, final Serializable key,
      final Object valueOrKey, final boolean delta) {
    if (valueOrKey == null) {
```

### BoundedWildcard
Can generalize to `? extends UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIGridLayout.java`
#### Snippet
```java

  protected UIComponent[][] layout(
      final int columnsCount, final int initialRowsCount, final List<UIComponent> components) {
    assert columnsCount > 0;
    assert initialRowsCount > 0;
```

### BoundedWildcard
Can generalize to `? super AbstractUIColumnBase`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
  }

  private void findColumns(final UIComponent component, final List<AbstractUIColumnBase> result, final boolean all) {
    for (final UIComponent child : component.getChildren()) {
      if (all || child.isRendered()) {
```

### BoundedWildcard
Can generalize to `? super Integer`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeListboxRenderer.java`
#### Snippet
```java
  private void encodeSelectBox(
      final FacesContext facesContext, final AbstractUITreeListbox tree, final TobagoResponseWriter writer,
      final int parentRowIndex, final List<Integer> foldersRowIndices, final int size)
      throws IOException {

```

### BoundedWildcard
Can generalize to `? extends SelectItem`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
   * @return The first suitable Converter for the given SelectItems or null.
   */
  static Converter getSelectItemsValueConverter(final Iterator<SelectItem> iterator, final FacesContext facesContext) {
    // Attention!
    // This code is duplicated in jsfapi component package.
```

### BoundedWildcard
Can generalize to `? extends FacesMessage`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
  }

  private String getMessage(final List<FacesMessage> messages) {
    final StringBuilder stringBuilder = new StringBuilder();
    boolean firstMessage = true;
```

### BoundedWildcard
Can generalize to `? extends FacesMessage`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DecorationPositionRendererBase.java`
#### Snippet
```java
  protected abstract void encodeEndField(FacesContext facesContext, T component) throws IOException;

  private String getTitle(final List<FacesMessage> messages) {
    int fatalCount = 0;
    int errorCount = 0;
```

### BoundedWildcard
Can generalize to `? extends SelectItem`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneListRenderer.java`
#### Snippet
```java

  private void encodeOptions(
      final FacesContext facesContext, final T component, final List<SelectItem> items,
      final String clientId, final boolean expanded, final boolean disabled) throws IOException {
    final TobagoResponseWriter writer = getResponseWriter(facesContext);
```

### BoundedWildcard
Can generalize to `? extends SelectItem`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java

  private void encodeOptions(
      final FacesContext facesContext, final T component, final List<SelectItem> items,
      final String clientId, final boolean expanded, final boolean disabled) throws IOException {
    final TobagoResponseWriter writer = getResponseWriter(facesContext);
```

### BoundedWildcard
Can generalize to `? extends UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
    }

    private boolean containsNameViewport(final List<UIComponent> headComponents) {
      for (final UIComponent headComponent : headComponents) {
        if (headComponent instanceof AbstractUIMeta
```

### BoundedWildcard
Can generalize to `? extends UIComponent`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/PageRenderer.java`
#### Snippet
```java
    }

    private boolean containsCharset(final List<UIComponent> headComponents) {
      for (final UIComponent headComponent : headComponents) {
        if (headComponent instanceof AbstractUIMeta
```

### BoundedWildcard
Can generalize to `? extends SolarObject`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetSortingController.java`
#### Snippet
```java
  }

  private void sheetSorter(final SheetState sheetState, final List<SolarObject> list) {
    final String columnId = sheetState.getSortedColumnId();

```

### BoundedWildcard
Can generalize to `? super BootstrapClass`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java

    private void generate(
        final List<BootstrapClass> result, final MeasureList tokens,
        final Map<String, Object> attributes, final Attributes attribute) {
      final Object overwrite = attributes.get(attribute.name());
```

### BoundedWildcard
Can generalize to `? super BootstrapClass`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
    }

    private void generateOffset(final List<BootstrapClass> result, final Object offset, final BootstrapClass[] values) {
      if (offset != null) {
        int offsetIndex = Integer.parseInt((String) offset);
```

### BoundedWildcard
Can generalize to `? super BootstrapClass`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java

    private void generate(
        final List<BootstrapClass> result, final MarginTokens margins,
        final Map<String, Object> attributes, final Attributes attribute) {
      final Object overwrite = attributes.get(attribute.name());
```

### BoundedWildcard
Can generalize to `? extends SelectItem`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
  protected void renderSelectItems(
      final UIInput component, final TobagoClass optionClass,
      final Iterable<SelectItem> items, final Object[] values, final String[] submittedValues,
      final Boolean onlySelected, final TobagoResponseWriter writer, final FacesContext facesContext)
      throws IOException {
```

### BoundedWildcard
Can generalize to `? super String`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java
  }

  private void addToResult(List<String> listWar, Map<String, NavigationNode> nodes) {
    for (final String path : listWar) {
      if (path.contains("/x-") || !path.contains(".xhtml")) {
```

### BoundedWildcard
Can generalize to `? super NavigationNode`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java
  }

  private void addToResult(List<String> listWar, Map<String, NavigationNode> nodes) {
    for (final String path : listWar) {
      if (path.contains("/x-") || !path.contains(".xhtml")) {
```

### BoundedWildcard
Can generalize to `? extends AbstractUIColumnBase`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
  private void encodeHeaderRows(
      final FacesContext facesContext, final AbstractUISheet sheet, final TobagoResponseWriter writer,
      final List<AbstractUIColumnBase> columns)
      throws IOException {

```

### BoundedWildcard
Can generalize to `? extends AbstractUIColumnBase`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
  }

  private void decodeColumnAction(final FacesContext facesContext, final List<AbstractUIColumnBase> columns) {
    for (final AbstractUIColumnBase column : columns) {
      final boolean sortable = ComponentUtils.getBooleanAttribute(column, Attributes.sortable);
```

### BoundedWildcard
Can generalize to `? extends AbstractUIColumnBase`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
  private void writeColgroup(
      final TobagoResponseWriter writer, final List<Integer> columnWidths,
      final List<AbstractUIColumnBase> columns, final boolean isHeader) throws IOException {
    writer.startElement(HtmlElements.COLGROUP);

```

### BoundedWildcard
Can generalize to `? super Integer`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
      final String sheetId,
      final Selectable selectable, final List<Integer> columnWidths, final List<Integer> selectedRows,
      final List<AbstractUIColumnBase> columns, final boolean autoLayout, final List<Integer> expandedValue)
      throws IOException {

```

### BoundedWildcard
Can generalize to `? super Integer`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java

  private void ensureColumnWidthsSize(
      final List<Integer> columnWidths, final List<AbstractUIColumnBase> columns, final List<Integer> samples) {
    // we have to fill the non rendered positions with some values.
    // on client site, we don't know nothing about the non-rendered columns.
```

### BoundedWildcard
Can generalize to `? extends AbstractUIColumnBase`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java

  private void ensureColumnWidthsSize(
      final List<Integer> columnWidths, final List<AbstractUIColumnBase> columns, final List<Integer> samples) {
    // we have to fill the non rendered positions with some values.
    // on client site, we don't know nothing about the non-rendered columns.
```

### BoundedWildcard
Can generalize to `? extends SolarObject`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/AstroData.java`
#### Snippet
```java
  }

  private List<SelectItem> createSelectItems(final List<SolarObject> objects) {
    final List<SelectItem> list = new ArrayList<>();
    for (SolarObject object : objects) {
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

## RuleId[id=InstanceofIncompatibleInterface]
### InstanceofIncompatibleInterface
'instanceof' incompatible interface `Visual`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
          final String itemImage = ComponentUtils.getStringAttribute(currentUISelectItems, Attributes.itemImage);
          final Markup markup;
          if (currentUISelectItems instanceof Visual) {
            markup = ((Visual) currentUISelectItems).getMarkup();
          } else {
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
   * The value of the attribute in the parent component.
   */
  @TagAttribute(required = true, name = "value", type = "java.lang.String")
  void setValue(ValueExpression value);
}
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

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `ignorableWhitespace()` only delegates to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java

  @Override
  public void ignorableWhitespace(final char[] ch, final int start, final int length) throws SAXException {
    super.ignorableWhitespace(ch, start, length);
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

### RedundantMethodOverride
Method `endElement()` only delegates to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/HtmlResponseWriter.java`
#### Snippet
```java

  @Override
  public void endElement(final String name) throws IOException {
    super.endElement(name);
  }
```

### RedundantMethodOverride
Method `updateModel()` only delegates to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeSelect.java`
#### Snippet
```java

  @Override
  public void updateModel(final FacesContext context) {
    super.updateModel(context);
  }
```

### RedundantMethodOverride
Method `isError()` is identical to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java
  public abstract boolean isExpanded();

  public boolean isError() {
    final FacesContext facesContext = FacesContext.getCurrentInstance();
    return !isValid()
```

### RedundantMethodOverride
Method `getSelectedValues()` is identical to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java

  @Override
  public Object[] getSelectedValues() {
    final Object value = getValue();
    if (value instanceof Collection) {
```

### RedundantMethodOverride
Method `encodeBeginInternal()` only delegates to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneChoiceRenderer.java`
#### Snippet
```java

  @Override
  public void encodeBeginInternal(final FacesContext facesContext, final T component) throws IOException {
    super.encodeBeginInternal(facesContext, component);
  }
```

### RedundantMethodOverride
Method `encodeEndInternal()` only delegates to its super method
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneChoiceRenderer.java`
#### Snippet
```java

  @Override
  public void encodeEndInternal(final FacesContext facesContext, final T component) throws IOException {
    super.encodeEndInternal(facesContext, component);
  }
```

## RuleId[id=ClassNameSameAsAncestorName]
### ClassNameSameAsAncestorName
Class name `SelectItem` is the same as one of its superclass' names
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SelectItem.java`
#### Snippet
```java
import org.apache.myfaces.tobago.renderkit.css.CustomClass;

public class SelectItem extends jakarta.faces.model.SelectItem implements Visual {

  private static final long serialVersionUID = 2582455665060354639L;
```

### ClassNameSameAsAncestorName
Class name `UINamingContainer` is the same as one of its superclass' names
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/UINamingContainer.java`
#### Snippet
```java
package org.apache.myfaces.tobago.component;

public class UINamingContainer
    extends jakarta.faces.component.UINamingContainer {

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

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ValueExpressionComparator.java`
#### Snippet
```java
      return 0;
    }
    return super.internalCompare(obj1, obj2);
  }
}
```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java

  public void addAjaxBehaviorListener(final AjaxBehaviorListener listener) {
    super.addBehaviorListener(listener);
  }

```

### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITree.java`
#### Snippet
```java
  public String getBaseClientId(final FacesContext facesContext) {
    if (baseClientId == null) {
      final String clientId = super.getClientId(facesContext);
      final char separatorChar = UINamingContainer.getSeparatorChar(FacesContext.getCurrentInstance());
      final String separatorRowIndex = separatorChar + String.valueOf(getRowIndex());
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`aDouble = aDouble * factor` could be simplified to 'aDouble \*= factor'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/DurationConverter.java`
#### Snippet
```java
    }
    final double factor = getUnitFactor(component);
    aDouble = aDouble * factor;

    final NumberFormat format = new DecimalFormat("00");
```

### ReplaceAssignmentWithOperatorAssignment
`value = value / 60` could be simplified to 'value /= 60'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/DurationConverter.java`
#### Snippet
```java
    long value = Double.valueOf(aDouble).longValue();
    final int seconds = (int) (value % 60);
    value = value / 60;
    final int minutes = (int) (value % 60);
    value = value / 60;
```

### ReplaceAssignmentWithOperatorAssignment
`value = value / 60` could be simplified to 'value /= 60'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/DurationConverter.java`
#### Snippet
```java
    value = value / 60;
    final int minutes = (int) (value % 60);
    value = value / 60;
    final String string;
    if (value > 0) {
```

### ReplaceAssignmentWithOperatorAssignment
`key = key + "."` could be simplified to 'key += "."'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SearchIndex.java`
#### Snippet
```java
    // XXX little hack to have more than one result with same name
    while (containsKey(key)) {
      key = key + ".";
    }

```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/LocaleUtils.java`
#### Snippet
```java
    locales.add(prefix + string);
    int underscore;
    while ((underscore = string.lastIndexOf('_')) > 0) {
      string = string.substring(0, underscore);
      locales.add(prefix + string);
```

### NestedAssignment
Result of assignment expression used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/LocaleUtils.java`
#### Snippet
```java
    locales.add(locale);
    int underscore;
    while ((underscore = string.lastIndexOf('_')) > 0) {
      string = string.substring(0, underscore);
      locales.add(createLocale(string));
```

### NestedAssignment
Result of assignment expression used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/ResetFormActionListener.java`
#### Snippet
```java
  public void processAction(final ActionEvent actionEvent) throws AbortProcessingException {
    UIComponent component = actionEvent.getComponent();
    while ((component = component.getParent()) != null) {
      if (component instanceof UIForm) {
        resetChildren(component);
```

### NestedAssignment
Result of assignment expression used
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyListController.java`
#### Snippet
```java
            "org/apache/myfaces/tobago/example/demo/names.txt"), StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (!line.startsWith("#") && line.length() > 0) {
```

### NestedAssignment
Result of assignment expression used
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectOneListController.java`
#### Snippet
```java
            "org/apache/myfaces/tobago/example/demo/names.txt"), StandardCharsets.UTF_8))) {
      String line;
      while ((line = reader.readLine()) != null) {
        line = line.trim();
        if (!line.startsWith("#") && line.length() > 0) {
```

## RuleId[id=UseOfPropertiesAsHashtable]
### UseOfPropertiesAsHashtable
Call to `Hashtable.get()` on properties object
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigParser.java`
#### Snippet
```java
        if (properties != null) {
          tobagoConfig.setSanitizerProperties(properties);
          if (properties.get("whitelist") != null) {
            LOG.warn("<sanitizer><properties><entry key=\"whitelist\"> is deprecated:"
                + " use <sanitizer><properties><entry key=\"safelist\"> instead.");
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/RenderRange.java`
#### Snippet
```java
public interface RenderRange {

  String getRenderRange();

  void setRenderRangeReference(AbstractUISelectReference reference);
```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/SupportsAccessKey.java`
#### Snippet
```java
  Character getAccessKey();

  String getLabel();
}

```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/SupportsFilter.java`
#### Snippet
```java
public interface SupportsFilter {

  String getFilter();
}

```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyBase.java`
#### Snippet
```java
  }

  public abstract Integer getTabIndex();

  public abstract boolean isDisabled();
```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyBase.java`
#### Snippet
```java
  public abstract Integer getTabIndex();

  public abstract boolean isDisabled();

  public abstract boolean isReadonly();
```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyBase.java`
#### Snippet
```java
  public abstract boolean isDisabled();

  public abstract boolean isReadonly();

  public boolean isError() {
```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyBase.java`
#### Snippet
```java
  }

  public abstract boolean isFocus();

  @Override
```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/declaration/HasValue.java`
#### Snippet
```java
  @TagAttribute
  @UIComponentTagAttribute(type = "java.lang.Object")
  void setValue(String value);
}

```

### EmptyMethod
All implementations of this method are empty
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/declaration/IsRendered.java`
#### Snippet
```java
      type = "boolean",
      defaultValue = "true")
  void setRendered(String rendered);
}

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ComponentInfo.java`
#### Snippet
```java
  private String description;
  private boolean deprecated;
  private int index = 0;
  private int nonTransientIndex = 0;
  private List<String> behaviors = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ComponentInfo.java`
#### Snippet
```java
  private boolean deprecated;
  private int index = 0;
  private int nonTransientIndex = 0;
  private List<String> behaviors = new ArrayList<>();
  private String defaultBehavior;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/MethodExpressionTreeSelectedListener.java`
#### Snippet
```java
  private MethodExpression methodExpression;

  private boolean isTransient = false;

  public MethodExpressionTreeSelectedListener() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/MethodExpressionTreeExpansionListener.java`
#### Snippet
```java
  private MethodExpression methodExpression;

  private boolean isTransient = false;

  public MethodExpressionTreeExpansionListener() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/MethodExpressionStateChangeListener.java`
#### Snippet
```java
  private MethodExpression methodExpression;

  private boolean isTransient = false;

  public MethodExpressionStateChangeListener() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/MethodExpressionTabChangeListener.java`
#### Snippet
```java
  private MethodExpression methodExpression;

  private boolean isTransient = false;

  public MethodExpressionTabChangeListener() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/config/TobagoConfig.java`
#### Snippet
```java
  private boolean enableTobagoExceptionHandler;

  private boolean locked = false;

  public static TobagoConfig getInstance(final FacesContext facesContext) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/ThemeImpl.java`
#### Snippet
```java
  private final Map<String, String> tagAttributeDefaults;

  private boolean locked = false;

  public ThemeImpl() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/ContentSecurityPolicy.java`
#### Snippet
```java
  private Map<String, String> directiveMap;

  private boolean unmodifiable = false;

  private void checkLocked() throws IllegalStateException {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/TobagoResponseWriterBase.java`
#### Snippet
```java
  private int level = 0;

  private int inlineStack = 0;

  private UIComponent component;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/TobagoResponseWriterBase.java`
#### Snippet
```java
  protected static final char[] XML_VERSION_1_0_ENCODING_UTF_8_CHARS = XML_VERSION_1_0_ENCODING_UTF_8.toCharArray();

  private int level = 0;

  private int inlineStack = 0;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java

  //To enable delta state saving we need this one
  private DeltaStateHelper<EventBehavior> stateHelper = null;

  //private Map<String, ValueExpression> _valueExpressions
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
  //private Set<Serializable> _stateHolderKeys;

  private boolean transientBoolean = false;

  DeltaStateHelper(final A target) {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/validator/FileItemValidator.java`
#### Snippet
```java
  public static final String SIZE_LIMIT_MESSAGE_ID = "org.apache.myfaces.tobago.FileItemValidator.SIZE_LIMIT";
  public static final String CONTENT_TYPE_MESSAGE_ID = "org.apache.myfaces.tobago.FileItemValidator.CONTENT_TYPE";
  private Integer maxSize = null;
  private String[] contentType;
  private boolean transientValue;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/sanitizer/JsoupSanitizer.java`
#### Snippet
```java
  private String safelistName;

  private boolean unmodifiable = false;

  @Override
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CollapsibleSectionController.java`
#### Snippet
```java
public class CollapsibleSectionController implements Serializable {

  private boolean collapsed = false;

  public boolean isCollapsed() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationState.java`
#### Snippet
```java
  private TreeState state = new TreeState(new ExpandedState(1), new SelectedState());

  private boolean viewSource = false;

  private String searchString;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CollapsibleBoxController.java`
#### Snippet
```java
public class CollapsibleBoxController implements Serializable {

  private boolean collapsed = false;

  public boolean isCollapsed() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeCommandTypesController.java`
#### Snippet
```java

  private CommandNode sample;
  private int actionOneCount = 0;
  private int actionTwoCount = 0;

```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeCommandTypesController.java`
#### Snippet
```java
  private CommandNode sample;
  private int actionOneCount = 0;
  private int actionTwoCount = 0;

  public TreeCommandTypesController() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NonceController.java`
#### Snippet
```java
  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

  private boolean ajax = false;

  public void ajax() {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CollapsiblePanelController.java`
#### Snippet
```java
public class CollapsiblePanelController implements Serializable {

  private boolean panelCollapsed = false;

  public boolean isPanelCollapsed() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ConversationController.java`
#### Snippet
```java
  //  @Inject // XXX
  private Conversation conversation;
  private int count = 0;

  public String getConversationStatus() {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyShuttleController.java`
#### Snippet
```java
  private List<String> stars = Arrays.asList("Proxima Centauri", "Alpha Centauri", "Wolf 359", "Sirius");
  private String[] selectedStars = new String[0];
  private int countPageReload = 0;

  @PostConstruct
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
    private final MarginTokens marginExtra2Large;

    private int index = 0;

    public Generator(final SupportsSegmentLayout component) {
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/EventController.java`
#### Snippet
```java
  private String eventName;
  private int action = 0;
  private int actionListener = 0;
  private int ajaxListener = 0;
  private int valueChangeListener = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/EventController.java`
#### Snippet
```java
  private EventsOnComponent selectedComponent;
  private String eventName;
  private int action = 0;
  private int actionListener = 0;
  private int ajaxListener = 0;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/EventController.java`
#### Snippet
```java
  private int action = 0;
  private int actionListener = 0;
  private int ajaxListener = 0;
  private int valueChangeListener = 0;
  private final List<SolarObject> planets = new ArrayList<>();
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/EventController.java`
#### Snippet
```java
  private int actionListener = 0;
  private int ajaxListener = 0;
  private int valueChangeListener = 0;
  private final List<SolarObject> planets = new ArrayList<>();

```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeController.java`
#### Snippet
```java
  private DefaultMutableTreeNode sample;
  private boolean treeShowRoot = false;
  private boolean treeShowRootJunction = false;
  private boolean treeIndentRendered = true;
  private boolean treeIndentShowJunction = true;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeController.java`
#### Snippet
```java

  private DefaultMutableTreeNode sample;
  private boolean treeShowRoot = false;
  private boolean treeShowRootJunction = false;
  private boolean treeIndentRendered = true;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/actionlistener/SimpleTabChangeListener.java`
#### Snippet
```java
public class SimpleTabChangeListener implements TabChangeListener {

  private int count = 0;
  private int newTabIndex = -1;
  private int oldTabIndex = -1;
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/nonfacesrequest/FishPond.java`
#### Snippet
```java
  private final Map<Integer, String> fishes;

  private Integer selectedFishId = null;

  public FishPond() {
```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `Visual`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIColumnNode.java`
#### Snippet
```java
 * @since Tobago 2.0.0
 */
public abstract class AbstractUIColumnNode extends AbstractUITreeNode implements Visual {
}

```

### RedundantImplements
Redundant interface declaration `Visual`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITreeNodeBase.java`
#### Snippet
```java
 * Base class for tree node.
 */
public abstract class AbstractUITreeNodeBase extends AbstractUIColumnBase implements Visual {

  @Override
```

### RedundantImplements
Redundant interface declaration `SupportsAccessKey`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILink.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.LinkTagDeclaration}
 */
public abstract class AbstractUILink extends AbstractUICommand implements SupportsAccessKey {

  public abstract Integer getTabIndex();
```

### RedundantImplements
Redundant interface declaration `ComponentSystemEventListener`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICommandBase.java`
#### Snippet
```java
@ListenerFor(systemEventClass = PostAddToViewEvent.class)
public abstract class AbstractUICommandBase extends UICommand
    implements ComponentSystemEventListener {

  @Override
```

### RedundantImplements
Redundant interface declaration `SupportsAutoSpacing`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java
 */
public abstract class AbstractUISelectManyList extends AbstractUISelectManyBase
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp, SupportFieldId,
    SupportsFilter {

```

### RedundantImplements
Redundant interface declaration `Visual`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java
 */
public abstract class AbstractUISelectManyList extends AbstractUISelectManyBase
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp, SupportFieldId,
    SupportsFilter {

```

### RedundantImplements
Redundant interface declaration `SupportsLabelLayout`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java
 */
public abstract class AbstractUISelectManyList extends AbstractUISelectManyBase
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp, SupportFieldId,
    SupportsFilter {

```

### RedundantImplements
Redundant interface declaration `ClientBehaviorHolder`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java
 */
public abstract class AbstractUISelectManyList extends AbstractUISelectManyBase
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp, SupportFieldId,
    SupportsFilter {

```

### RedundantImplements
Redundant interface declaration `SupportsHelp`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectManyList.java`
#### Snippet
```java
 */
public abstract class AbstractUISelectManyList extends AbstractUISelectManyBase
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp, SupportFieldId,
    SupportsFilter {

```

### RedundantImplements
Redundant interface declaration `ComponentSystemEventListener`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIProgress.java`
#### Snippet
```java
@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public abstract class AbstractUIProgress extends UIOutput
    implements Visual, ComponentSystemEventListener, ClientBehaviorHolder {

  private double rangeValue;
```

### RedundantImplements
Redundant interface declaration `NamingContainer`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITree.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeTagDeclaration}
 */
public abstract class AbstractUITree extends AbstractUIData implements NamingContainer, Visual {

  public static final String SUFFIX_PARENT = "parent";
```

### RedundantImplements
Redundant interface declaration `Visual`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITree.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.TreeTagDeclaration}
 */
public abstract class AbstractUITree extends AbstractUIData implements NamingContainer, Visual {

  public static final String SUFFIX_PARENT = "parent";
```

### RedundantImplements
Redundant interface declaration `ComponentSystemEventListener`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIGridLayout.java`
#### Snippet
```java
@Preliminary
@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public abstract class AbstractUIGridLayout extends AbstractUILayoutBase implements ComponentSystemEventListener {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### RedundantImplements
Redundant interface declaration `Visual`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
@ListenerFor(systemEventClass = PreRenderComponentEvent.class)
public abstract class AbstractUISheet extends AbstractUIData
    implements SheetStateChangeSource, SortActionSource, ClientBehaviorHolder, Visual,
    ComponentSystemEventListener {

```

### RedundantImplements
Redundant interface declaration `ComponentSystemEventListener`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISheet.java`
#### Snippet
```java
public abstract class AbstractUISheet extends AbstractUIData
    implements SheetStateChangeSource, SortActionSource, ClientBehaviorHolder, Visual,
    ComponentSystemEventListener {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### RedundantImplements
Redundant interface declaration `Serializable`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/DockerServer.java`
#### Snippet
```java
import java.io.Serializable;

public enum DockerServer implements Serializable {

  tomcat(
```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `tobago-example/tobago-example-demo/src/main/webapp/index.html`
#### Snippet
```java
<html>
<head>
  <meta http-equiv="Cache-Control" content="no-cache">
  <meta http-equiv="Refresh" content="0; URL=init.xhtml">
</head>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `tobago-example/tobago-example-blank/src/main/webapp/index.html`
#### Snippet
```java
<html>
<head>
  <meta http-equiv="Cache-Control" content="no-cache">
  <meta http-equiv="Refresh" content="3; URL=helloWorld.xhtml">
</head>
```

### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-04-17-20-17-24.198.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=CallToStringConcatCanBeReplacedByOperator]
### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyCheckboxController.java`
#### Snippet
```java
    String retValue = "";
    for (final String s : animals) {
      retValue = retValue.concat(s + " ");
    }
    return retValue;
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TestController.java`
#### Snippet
```java

    String realPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
    realPath = realPath.endsWith("/") ? realPath : realPath.concat("/");

    final File rootDir = new File(realPath + "content");
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TestController.java`
#### Snippet
```java

    String realPath = FacesContext.getCurrentInstance().getExternalContext().getRealPath("/");
    realPath = realPath.endsWith("/") ? realPath : realPath.concat("/");

    final File rootDir = new File(realPath + "content");
```

### CallToStringConcatCanBeReplacedByOperator
Call to `concat()` can be replaced with '+' expression
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyListboxController.java`
#### Snippet
```java
    String retValue = "";
    for (final String s : celestials) {
      retValue = retValue.concat(s);
    }
    return retValue;
```

## RuleId[id=SynchronizeOnThis]
### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PartialReloadController.java`
#### Snippet
```java
  private String waitAndReload(final long delay) {
    LOG.info("I'm waiting now for {} ms.", delay);
    synchronized (this) {
      try {
        wait(delay);
```

### SynchronizeOnThis
Lock operations on 'this' may have unforeseen side-effects
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PartialReloadController.java`
#### Snippet
```java
    synchronized (this) {
      try {
        wait(delay);
      } catch (final InterruptedException e) {
        //
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/ResetInputActionListener.java`
#### Snippet
```java

  public ResetInputActionListener(final Collection<String> clientIds) {
    this.clientIds = clientIds.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/Markup.java`
#### Snippet
```java
        list.add(object.toString());
      }
      return valueOf(list.toArray(new String[0]));
    }
    return valueOf(value.toString());
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/ThemeImpl.java`
#### Snippet
```java
    final List<ThemeStyle> copy = new ArrayList<>(list);
    copy.sort(Comparator.comparingInt(ThemeResource::getPriority));
    return copy.toArray(new ThemeStyle[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/ThemeImpl.java`
#### Snippet
```java
    final List<ThemeScript> copy = new ArrayList<>(list);
    copy.sort(Comparator.comparingInt(ThemeResource::getPriority));
    return copy.toArray(new ThemeScript[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/ResponseUtils.java`
#### Snippet
```java
      switch (contentSecurityPolicy.getMode()) {
        case OFF:
          cspHeaders = new String[0];
          break;
        case ON:
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java
      list.add(string.substring(start, i));
    }
    return list.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java
      list.add(string.substring(start, i));
    }
    return list.toArray(new String[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java
  public static int[] getIndices(final String list) {
    if (list == null) {
      return new int[0];
    }
    final List<String> indexList = new ArrayList<>();
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITabGroup.java`
#### Snippet
```java
      }
    }
    return tabs.toArray(new AbstractUITab[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/FileRenderer.java`
#### Snippet
```java
        if (multiple) {
          LOG.debug("Adding {} parts {}.", parts.size(), parts);
          component.setSubmittedValue(parts.toArray(new Part[0]));
        } else {
          if (parts.size() > 0) {
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
      }

      executeIds = ComponentUtils.evaluateClientIds(facesContext, uiComponent, execute.toArray(new String[0]));
      if (executeIds != null) {
        executeIds = executeIds + " " + clientId;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
        omit = command.isOmit() || StringUtils.isNotBlank(RenderUtils.generateUrl(facesContext, command));
      }
      renderIds = ComponentUtils.evaluateClientIds(facesContext, uiComponent, render.toArray(new String[0]));
    } else if (behavior instanceof EventBehavior) { // <tc:event>
      final EventBehavior eventBehavior = (EventBehavior) behavior;
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneListRenderer.java`
#### Snippet
```java
      cssItems.add(TobagoClass.DISABLED);
    }
    return cssItems.toArray(new CssItem[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyListRenderer.java`
#### Snippet
```java
      cssItems.add(TobagoClass.DISABLED);
    }
    return cssItems.toArray(new CssItem[0]);
  }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyListController.java`
#### Snippet
```java
  private String filterType = "contains";
  private final List<String> names = new ArrayList<>();
  private String[] selectedNames = new String[0];

  @PostConstruct
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyShuttleController.java`
#### Snippet
```java
  private SolarObject[] selectedPlanets = new SolarObject[0];
  private List<String> stars = Arrays.asList("Proxima Centauri", "Alpha Centauri", "Wolf 359", "Sirius");
  private String[] selectedStars = new String[0];
  private int countPageReload = 0;

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyShuttleController.java`
#### Snippet
```java

  private List<SolarObject> planets;
  private SolarObject[] selectedPlanets = new SolarObject[0];
  private List<String> stars = Arrays.asList("Proxima Centauri", "Alpha Centauri", "Wolf 359", "Sirius");
  private String[] selectedStars = new String[0];
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      generateOffset(result, attributes.get(Attributes.offsetExtraLarge.name()), OFFSET_EXTRA_LARGE);
      generateOffset(result, attributes.get(Attributes.offsetExtra2Large.name()), OFFSET_EXTRA_EXTRA_LARGE);
      return result.toArray(new BootstrapClass[0]);
    }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PlanetExample.java`
#### Snippet
```java
        return jupiterMoons;
      default:
        return new SelectItem[0];
    }
  }
```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java

      encodeHiddenInput(writer,
          JsonUtils.encode(encodedRendered.toArray(new Boolean[0])),
          sheetId + SUFFIX_COLUMN_RENDERED);
    }
```

## RuleId[id=CastConflictsWithInstanceof]
### CastConflictsWithInstanceof
Cast to 'ActionSource2' type conflicts with preceding 'instanceof ActionSource' check
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
          final MethodExpression action = getMethodExpression(faceletContext, String.class, ComponentUtils.ACTION_ARGS);
          if (action != null) {
            ((ActionSource2) parent).setActionExpression(action);
          }
        } else if (parent instanceof ActionSource && Attributes.actionListener == nameValue) {
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
Condition `uiSelectItem instanceof org.apache.myfaces.tobago.component.UISelectItem` is always `true`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
          String image = null;
          Markup markup = null;
          if (uiSelectItem instanceof org.apache.myfaces.tobago.component.UISelectItem) {
            final org.apache.myfaces.tobago.component.UISelectItem tobagoSelectItem
                = (org.apache.myfaces.tobago.component.UISelectItem) uiSelectItem;
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
Result of `name.isVoid()` is always 'false'
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
Condition `child instanceof UISelectItems` is always `true`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
          currentComponent = child;
          return true;
        } else if (child instanceof UISelectItems) {
          currentUISelectItems = (UISelectItems) child;
          final Object value = currentUISelectItems.getValue();
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

## RuleId[id=MethodOverridesStaticMethod]
### MethodOverridesStaticMethod
Method `parse()` tries to override a static method of a superclass
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/SegmentMeasureList.java`
#### Snippet
```java
public final class SegmentMeasureList extends MeasureList {

  public static SegmentMeasureList parse(final String string) {
    final SegmentMeasureList measureList = new SegmentMeasureList();
    final StringTokenizer tokenizer = new StringTokenizer(string, "; ");
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `ResourceUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ResourceUtils.java`
#### Snippet
```java
import java.util.ResourceBundle;

public class ResourceUtils {

  public static final String TOBAGO_RESOURCE_BUNDLE = "tobagoResourceBundle";
```

### UtilityClassWithoutPrivateConstructor
Class `MessageFormat` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageFormat.java`
#### Snippet
```java
 * Helper class for the EL functions <code>tc:format1()</code> ... <code>tc:format9()</code>
 */
public class MessageFormat {

  public static String format(final String pattern, final Object param0) {
```

### UtilityClassWithoutPrivateConstructor
Class `AjaxUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/AjaxUtils.java`
#### Snippet
```java
import java.util.Set;

public class AjaxUtils {

  public static boolean isAjaxRequest(final FacesContext facesContext) {
```

### UtilityClassWithoutPrivateConstructor
Class `WebXmlUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/WebXmlUtils.java`
#### Snippet
```java
import java.util.Map;

public class WebXmlUtils {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### UtilityClassWithoutPrivateConstructor
Class `ArrayUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/ArrayUtils.java`
#### Snippet
```java
package org.apache.myfaces.tobago.internal.util;

public class ArrayUtils {

  public static final String[] EMPTY_STRING_ARRAY = new String[0];
```

### UtilityClassWithoutPrivateConstructor
Class `RandomUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RandomUtils.java`
#### Snippet
```java
 * Helps to get a random string.
 */
public class RandomUtils {

  private static final SecureRandom RANDOM = new SecureRandom();
```

### UtilityClassWithoutPrivateConstructor
Class `NumberUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/NumberUtils.java`
#### Snippet
```java
package org.apache.myfaces.tobago.internal.util;

public class NumberUtils {
  public static boolean isDigits(final String str) {
    if (str == null || str.length() == 0) {
```

### UtilityClassWithoutPrivateConstructor
Class `SelectItemUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
 * Based on code from MyFaces core.
 */
public class SelectItemUtils {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### UtilityClassWithoutPrivateConstructor
Class `FileTestUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/FileTestUtils.java`
#### Snippet
```java
 * Helpful for tests. Not for use in production.
 */
public class FileTestUtils {

  public static String fileToString(final String file) throws IOException {
```

### UtilityClassWithoutPrivateConstructor
Class `CssClassUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/CssClassUtils.java`
#### Snippet
```java
 * Helpful for tests. Not for use in production.
 */
class CssClassUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `SmallTree` has only 'static' members, and lacks a 'private' constructor
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SmallTree.java`
#### Snippet
```java
import javax.swing.tree.DefaultMutableTreeNode;

public class SmallTree {

  public static DefaultMutableTreeNode createSample() {
```

### UtilityClassWithoutPrivateConstructor
Class `CommandNodeFactory` has only 'static' members, and lacks a 'private' constructor
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CommandNodeFactory.java`
#### Snippet
```java
package org.apache.myfaces.tobago.example.demo;

public class CommandNodeFactory {

  public static CommandNode createSample() {
```

### UtilityClassWithoutPrivateConstructor
Class `BootstrapUtils` has only 'static' members, and lacks a 'private' constructor
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/BootstrapUtils.java`
#### Snippet
```java
import org.apache.myfaces.tobago.renderkit.css.BootstrapClass;

public class BootstrapUtils {

  /**
```

### UtilityClassWithoutPrivateConstructor
Class `MixedCommandTree` has only 'static' members, and lacks a 'private' constructor
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/MixedCommandTree.java`
#### Snippet
```java
package org.apache.myfaces.tobago.example.demo;

public class MixedCommandTree {

  public static NamedNode createSample() {
```

## RuleId[id=DataFlowIssue]
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
  @Override
  public void encodeBegin(final FacesContext facesContext) throws IOException {
    final TreeDataModel model = ComponentUtils.findAncestor(this, AbstractUIData.class).getTreeDataModel();
    model.setRowClientId(getClientId(facesContext));

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
Method invocation `getClientId` may produce `NullPointerException`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeListboxRenderer.java`
#### Snippet
```java

    final AbstractUITreeNode node = ComponentUtils.findDescendant(tree, AbstractUITreeNode.class);
    final String parentId = node.getClientId(facesContext);

    writer.startElement(HtmlElements.SELECT);
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
  private List<String> getTestJs(final File dir) {
    final List<String> testJsFiles = new ArrayList<>();
    for (final File file : dir.listFiles()) {
      if (file.isDirectory()) {
        testJsFiles.addAll(getTestJs(file));
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

### DataFlowIssue
Argument `AstroData.class.getResourceAsStream("astro-data.json")` might be null
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/AstroData.java`
#### Snippet
```java

    final InputStreamReader reader
        = new InputStreamReader(AstroData.class.getResourceAsStream("astro-data.json"));

    Gson gson = new GsonBuilder().create();
```

## RuleId[id=StringOperationCanBeSimplified]
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

## RuleId[id=DeprecatedIsStillUsed]
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
Deprecated member 'TREE_PARENT' is still used
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/html/DataAttributes.java`
#### Snippet
```java
   */
  @Deprecated
  TREE_PARENT("data-tobago-tree-parent"),

  /**
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

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'wrappedStateObject' in a Serializable class
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/AttachedStateWrapper.java`
#### Snippet
```java

  private Class<?> clazz;
  private Object wrappedStateObject;

  /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'distanceRangeConverter' in a Serializable class
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
  private SelectItem[] maxYearItems;

  private DistanceRangeConverter distanceRangeConverter;

  private String name;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'distance' in a Serializable class
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
  private String name;
  private String orbit;
  private DistanceRange distance;
  private String discoverer;
  private Integer minYear;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'tabChangeListener' in a Serializable class
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TabController.java`
#### Snippet
```java
  private String close = "/image/feather-closed.png";
  private int index;
  private SimpleTabChangeListener tabChangeListener;

  public TabController() {
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

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java
        builder.append(chars[i]);
      } else if (chars[i] == '_') {
        builder.append(chars[++i]);
      } else {
        builder.append(((Character) chars[i]).toString().toLowerCase(Locale.ENGLISH));
```

## RuleId[id=UnnecessaryToStringCall]
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

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
    intBuilder.append("]");

    builder.insert(0, intBuilder.toString());

    getPathToComponent(component.getParent(), builder);
```

## RuleId[id=InnerClassMayBeStatic]
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
Inner class `TestPage` may be 'static'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TestController.java`
#### Snippet
```java
  }

  public class TestPage {
    private final String id;
    private final String base;
```

## RuleId[id=SetReplaceableByEnumSet]
### SetReplaceableByEnumSet
`HashSet<>` can be replaced with 'EnumSet'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetConfig.java`
#### Snippet
```java
    sheetPagePagingPosition = ShowPosition.right;
    sheetPagingPositionItems = createSheetItems(ShowPosition.values());
    final Set<Selectable> selectableSupportedBySheet = new HashSet<>();
    for (final Selectable s : Selectable.values()) {
      if (s.isSupportedBySheet()) {
```

## RuleId[id=StringEqualsEmptyString]
### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final org.jdom2.Element element = new org.jdom2.Element(RENDERER, namespace);
      String displayName = componentTag.displayName();
      if (displayName.equals("")) {
        displayName = componentInfo.getComponentClassName();
      }
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
          Object oldRequestMapVarValue = null;
          final String var = ComponentUtils.getStringAttribute(currentUISelectItems, Attributes.var);
          if (var != null && !"".equals(var)) {
            // save the current value of the key listed in var from the request map
            oldRequestMapVarValue = facesContext.getExternalContext().getRequestMap().put(var, item);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
          Object oldRequestMapVarValue = null;
          final String var = (String) attributeMap.get(VAR_ATTR);
          if (var != null && !"".equals(var)) {
            // save the current value of the key listed in var from the request map
            oldRequestMapVarValue = facesContext.getExternalContext().getRequestMap().put(var, item);
```

### StringEqualsEmptyString
`equals("")` can be replaced with 'isEmpty()'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java
      map.put(branch, node);
      final String parent = branch.substring(0, branch.lastIndexOf('/'));
      if (!parent.equals("")) { // is root
        map.get(parent).add(node);
      }
```

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java

  @SuppressWarnings("unchecked")
  private static void findSubForms(final List<AbstractUIForm> collect, final UIComponent component) {
    final Iterator<UIComponent> kids = component.getFacetsAndChildren();
    while (kids.hasNext()) {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      return (Boolean) bool;
    } else {
      return Boolean.valueOf(bool.toString());
    }
  }
```

### UnnecessaryBoxing
Unnecessary boxing
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/AccessKeyLogger.java`
#### Snippet
```java
      builder.append("\nFree access keys: ");
      for (final char key : KEYS) {
        builder.append(instance.containsKey(Character.valueOf(key)) ? '.' : key);
      }
      LOG.debug(builder.toString());
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectBoolean.java`
#### Snippet
```java
      return (Boolean) value;
    } else {
      return value != null && Boolean.valueOf(value.toString());
    }
  }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIStars.java`
#### Snippet
```java
          rangeValue = ((Number) model).intValue();
        } else if (model != null && !model.equals("")) {
          rangeValue = Integer.valueOf("" + model);
        } else {
          rangeValue = 0;
```

### UnnecessaryBoxing
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        // This makes the following code work: <tag attribute="true" />,
        // otherwise you would have to write <tag attribute="#{true}" />.
        return Boolean.valueOf(value.toString());
      }
    }
```

### UnnecessaryBoxing
Redundant boxing, `Integer.parseInt()` call can be used instead
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SelectManyCheckboxController.java`
#### Snippet
```java
    int result = 0;
    for (final String number : numbers) {
      result += Integer.valueOf(number);
    }
    return result;
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ProgressController.java`
#### Snippet
```java
  public double getCurrentSeconds() {
    final SimpleDateFormat sdf = new SimpleDateFormat("ss");
    return Double.valueOf(sdf.format(getCurrentDate()));
  }
}
```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ProgressController.java`
#### Snippet
```java
  public double getCurrentHours() {
    final SimpleDateFormat sdf = new SimpleDateFormat("HH");
    return Double.valueOf(sdf.format(getCurrentDate()));
  }

```

### UnnecessaryBoxing
Redundant boxing, `Double.parseDouble()` call can be used instead
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ProgressController.java`
#### Snippet
```java
  public double getCurrentMinutes() {
    final SimpleDateFormat sdf = new SimpleDateFormat("mm");
    return Double.valueOf(sdf.format(getCurrentDate()));
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

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
public class LoggingController {

  private static final PrintStream LOG = System.err;

  public static final String JUL = "JUL";
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

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ComponentInfo.java`
#### Snippet
```java
    super(declaration.getQualifiedName().toString(), componentTag.uiComponent(), componentTag.rendererType());

    setComponentType(componentTag.uiComponent().replace(".component.UI", "."));
    setComponentFamily(componentTag.componentFamily());
    setComponentClassName(componentTag.uiComponent());
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/PropertyInfo.java`
#### Snippet
```java
  public String getShortType() {
    final String shortType = type.substring(type.lastIndexOf('.') + 1, type.length());
    return shortType.replace("[]", "Array").replace("$", ".");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/PropertyInfo.java`
#### Snippet
```java
  public String getShortType() {
    final String shortType = type.substring(type.lastIndexOf('.') + 1, type.length());
    return shortType.replace("[]", "Array").replace("$", ".");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/PropertyInfo.java`
#### Snippet
```java

  public String getType() {
    return type.replace("$", ".");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/CheckstyleConfigGenerator.java`
#### Snippet
```java
          || typeElement.getAnnotation(ConverterTag.class) != null) {
        final String s = typeElement.getQualifiedName().toString();
        className = s.replace(".component.", ".");
      } else if (typeElement.getAnnotation(UIComponentTag.class) != null) {
        className = "org.apache.myfaces.tobago.internal.taglib." + StringUtils.capitalize(annotationTag.name()) + "Tag";
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
      tagElement.appendChild(componentElement);
      addLeafTextElement(
          componentTag.uiComponent().replace(".component.UI", "."),
          "component-type",
          componentElement,
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    while (i.hasNext()) {
      final Comment c = (Comment) i.next();
      c.setText(c.getText().replaceAll("\n", SEPARATOR));
    }
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StyleRenderUtils.java`
#### Snippet
```java
   */
  public static String encodeIdSelector(final String clientId) {
    return "#" + clientId.replaceAll(":", "\\\\:");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StyleRenderUtils.java`
#### Snippet
```java
    if (selector.contains("<")) {
      LOG.warn("Found invalid char < inside of style!");
      writer.write(selector.replaceAll("<", "&lt;"));
    } else {
      writer.write(selector);
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/ResponseUtils.java`
#### Snippet
```java
        builder.append(directive.getKey());
        builder.append(" ");
        builder.append(directive.getValue().replace("${nonce}", nonce));
        builder.append(";");
      }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/AuthorizationHelper.java`
#### Snippet
```java
        if (methodExpression != null) {
          return getSecurityAnnotation(facesContext, component,
              methodExpression.getExpressionString().replaceAll(" ", ""));
        }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
        final String encode = URLEncoder.encode(value.toString(), characterEncoding);
        // URLEncoder.encode may return + instead of %20 for a space, but this is not good in some cases, e.g. mailto:
        builder.append(encode.replace("+", "%20"));
      } catch (final UnsupportedEncodingException e) {
        LOG.error("string='" + value + "'", e);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/DebugResponseWriterWrapper.java`
#### Snippet
```java
          new IllegalArgumentException());

      commentStr = commentStr.replaceAll("--", "++");
    }
    responseWriter.writeComment(commentStr);
```

### DynamicRegexReplaceableByCompiledPattern
`matches()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
          LOG.debug("idRemainder = '" + idRemainder + "'");
        }
        if (idRemainder.matches("^:\\d+:.*")) {
          idRemainder = idRemainder.substring(1);
          final int idx = idRemainder.indexOf(":");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java
            clientId + ComponentUtils.SUB_SEPARATOR + AbstractUIData.SUFFIX_SELECTED);
// todo        JsonUtils.decodeIntegerArray()StringArray()
        selected = selected.replaceAll("\\[", ";");
        selected = selected.replaceAll("]", ";");
        selected = selected.replaceAll(",", ";");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java
// todo        JsonUtils.decodeIntegerArray()StringArray()
        selected = selected.replaceAll("\\[", ";");
        selected = selected.replaceAll("]", ";");
        selected = selected.replaceAll(",", ";");
        final String searchString = ";" + component.getClientId(facesContext) + ";";
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TreeNodeRenderer.java`
#### Snippet
```java
        selected = selected.replaceAll("\\[", ";");
        selected = selected.replaceAll("]", ";");
        selected = selected.replaceAll(",", ";");
        final String searchString = ";" + component.getClientId(facesContext) + ";";
        final AbstractUITreeSelect treeSelect = ComponentUtils.findDescendant(component, AbstractUITreeSelect.class);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TabGroupRenderer.java`
#### Snippet
```java
          if (!disabled && switchType == SwitchType.client) {
            writer.writeAttribute(
                DataAttributes.TARGET, '#' + getTabPanelId(facesContext, tab).replaceAll(":", "\\\\:"), false);
          }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TextareaRenderer.java`
#### Snippet
```java
    // tbd: should this be configurable?
    if (TobagoConfig.getInstance(facesContext).isDecodeLineFeed()) {
      value = value.replace("\r\n", "\n");
    }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Icons.java`
#### Snippet
```java

  Icons() {
    this.clazz = "bi-" + name().toLowerCase().replaceAll("_", "-");
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/Release.java`
#### Snippet
```java
    version = name()
        .substring(1)
        .replaceAll("_alpha_", "-alpha-")
        .replaceAll("_beta_", "-beta-")
        .replace('_', '.');
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/Release.java`
#### Snippet
```java
        .substring(1)
        .replaceAll("_alpha_", "-alpha-")
        .replaceAll("_beta_", "-beta-")
        .replace('_', '.');
  }
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ManifestReader.java`
#### Snippet
```java

        String name = url.toString();
        name = name.replaceAll(".+/([^/]+\\.jar)\\!/META-INF/MANIFEST.MF", "$1");
        final ManifestEntry jar = new ManifestEntry(name, null);
        manifestTree.add(jar);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationNode.java`
#### Snippet
```java
    name = matcher.group(2);
//    final String extension = matcher.group(3);
    label = StringUtils.firstToUpperCase(name.replaceAll("[_]", " "));
  }

```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ApiController.java`
#### Snippet
```java

  public String getJiraUrl(final String version) {
    final Release release = Release.valueOf("v" + version.replaceAll("\\.", "_"));
    return "https://issues.apache.org/jira/secure/ReleaseNote.jspa?projectId=12310273&version=" + release.getJira();
  }
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugUtils.java`
#### Snippet
```java
//      buf.append(" ");
    buf.append(component.getClientId(FacesContext.getCurrentInstance()));
    if (component instanceof jakarta.faces.component.UIViewRoot) {
      buf.append(" viewId=");
      buf.append(((jakarta.faces.component.UIViewRoot) component).getViewId());
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/DebugUtils.java`
#### Snippet
```java
    if (component instanceof jakarta.faces.component.UIViewRoot) {
      buf.append(" viewId=");
      buf.append(((jakarta.faces.component.UIViewRoot) component).getViewId());
    }
    buf.append(" rendered=");
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/MeasureEditor.java`
#### Snippet
```java

/**
 * Converter for {@link org.apache.myfaces.tobago.layout.Measure}
 */
public class MeasureEditor extends PropertyEditorSupport {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/GridSpanEditor.java`
#### Snippet
```java

/**
 * Converter for {@link org.apache.myfaces.tobago.layout.GridSpan}
 */
public class GridSpanEditor extends PropertyEditorSupport {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/Measure.java`
#### Snippet
```java

/**
 * In PDLs the class {@link org.apache.myfaces.tobago.layout.MeasureEditor} will convert the string literals.
 */
public final class Measure implements Serializable {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.context` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/MarkupEditor.java`
#### Snippet
```java

/**
 * Converter for {@link org.apache.myfaces.tobago.context.MarkupEditor}
 */
public class MarkupEditor extends PropertyEditorSupport {
```

### UnnecessaryFullyQualifiedName
Qualifier `javax.swing` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/BoundedRangeModelConverter.java`
#### Snippet
```java

/**
 * JSF converter for the {@link javax.swing.BoundedRangeModel} class.
 */
@org.apache.myfaces.tobago.apt.annotation.Converter(forClass = "javax.swing.BoundedRangeModel")
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private int getIndexAfter(final org.jdom2.Element rootElement, final String tagName) {
    final List<org.jdom2.Element> components = rootElement.getChildren(tagName, rootElement.getNamespace());
    if (components.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private int getIndexAfter(final org.jdom2.Element rootElement, final String tagName) {
    final List<org.jdom2.Element> components = rootElement.getChildren(tagName, rootElement.getNamespace());
    if (components.isEmpty()) {
      return 0;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private org.jdom2.Element getEqualElement(
      final List<org.jdom2.Element> components, final org.jdom2.Element newElement) {
    for (final org.jdom2.Element element : components) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private org.jdom2.Element getEqualElement(
      final List<org.jdom2.Element> components, final org.jdom2.Element newElement) {
    for (final org.jdom2.Element element : components) {
      if (equals(element, newElement)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private org.jdom2.Element getEqualElement(
      final List<org.jdom2.Element> components, final org.jdom2.Element newElement) {
    for (final org.jdom2.Element element : components) {
      if (equals(element, newElement)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  private org.jdom2.Element getEqualElement(
      final List<org.jdom2.Element> components, final org.jdom2.Element newElement) {
    for (final org.jdom2.Element element : components) {
      if (equals(element, newElement)) {
        return element;
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/CurrencyConverter.java`
#### Snippet
```java

/**
 * JSF converter for the {@link java.util.Currency} class.
 */
@org.apache.myfaces.tobago.apt.annotation.Converter(forClass = "java.util.Currency")
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private void applyNamespace(final org.jdom2.Element parent, final Namespace namespace) {
    for (final org.jdom2.Element element : parent.getChildren()) {
      element.setNamespace(namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private void applyNamespace(final org.jdom2.Element parent, final Namespace namespace) {
    for (final org.jdom2.Element element : parent.getChildren()) {
      element.setNamespace(namespace);
      applyNamespace(element, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private void addClass(final UIComponentTagAttribute componentAttribute, final org.jdom2.Element attributeClass) {
    if (componentAttribute.type().length > 1) {
      attributeClass.setText(Object.class.getName());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private org.jdom2.Element createElementExtension(
      final TypeElement typeElement, final UIComponentTag uiComponentTag,
      final Namespace namespace) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final TypeElement typeElement, final UIComponentTag uiComponentTag,
      final Namespace namespace) {
    final org.jdom2.Element elementExtension = new org.jdom2.Element(COMPONENT_EXTENSION, namespace);
    final org.jdom2.Element elementAllowedChildComponents = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
    final String[] allowedChildComponents = uiComponentTag.allowedChildComponenents();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final TypeElement typeElement, final UIComponentTag uiComponentTag,
      final Namespace namespace) {
    final org.jdom2.Element elementExtension = new org.jdom2.Element(COMPONENT_EXTENSION, namespace);
    final org.jdom2.Element elementAllowedChildComponents = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
    final String[] allowedChildComponents = uiComponentTag.allowedChildComponenents();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final Namespace namespace) {
    final org.jdom2.Element elementExtension = new org.jdom2.Element(COMPONENT_EXTENSION, namespace);
    final org.jdom2.Element elementAllowedChildComponents = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
    final String[] allowedChildComponents = uiComponentTag.allowedChildComponenents();
    final StringBuilder allowedComponentTypes = new StringBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final Namespace namespace) {
    final org.jdom2.Element elementExtension = new org.jdom2.Element(COMPONENT_EXTENSION, namespace);
    final org.jdom2.Element elementAllowedChildComponents = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
    final String[] allowedChildComponents = uiComponentTag.allowedChildComponenents();
    final StringBuilder allowedComponentTypes = new StringBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    elementAllowedChildComponents.setText(allowedComponentTypes.toString());
    elementExtension.addContent(elementAllowedChildComponents);
    final org.jdom2.Element elementCategory = new org.jdom2.Element(CATEGORY, namespace);
    elementCategory.setText(uiComponentTag.category().toString());
    elementExtension.addContent(elementCategory);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    elementAllowedChildComponents.setText(allowedComponentTypes.toString());
    elementExtension.addContent(elementAllowedChildComponents);
    final org.jdom2.Element elementCategory = new org.jdom2.Element(CATEGORY, namespace);
    elementCategory.setText(uiComponentTag.category().toString());
    elementExtension.addContent(elementCategory);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Deprecated deprecated = typeElement.getAnnotation(Deprecated.class);
    if (deprecated != null) {
      final org.jdom2.Element elementDeprecated = new org.jdom2.Element(DEPRECATED, namespace);
      elementDeprecated.setText("Warning: This component is deprecated!");
      elementExtension.addContent(elementDeprecated);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Deprecated deprecated = typeElement.getAnnotation(Deprecated.class);
    if (deprecated != null) {
      final org.jdom2.Element elementDeprecated = new org.jdom2.Element(DEPRECATED, namespace);
      elementDeprecated.setText("Warning: This component is deprecated!");
      elementExtension.addContent(elementDeprecated);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementExtension.addContent(elementDeprecated);
    }
    final org.jdom2.Element elementHidden = new org.jdom2.Element(HIDDEN, namespace);
    elementHidden.setText(Boolean.toString(uiComponentTag.isHidden()));
    elementExtension.addContent(elementHidden);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementExtension.addContent(elementDeprecated);
    }
    final org.jdom2.Element elementHidden = new org.jdom2.Element(HIDDEN, namespace);
    elementHidden.setText(Boolean.toString(uiComponentTag.isHidden()));
    elementExtension.addContent(elementHidden);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private void addFacets(
      final UIComponentTag componentTag, final Namespace namespace, final org.jdom2.Element element) {
    final Facet[] facets = componentTag.facets();
    for (final Facet facet : facets) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Facet[] facets = componentTag.facets();
    for (final Facet facet : facets) {
      final org.jdom2.Element facetElement = new org.jdom2.Element(FACET, namespace);
      final String description = facet.description();
      if (description.length() > 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Facet[] facets = componentTag.facets();
    for (final Facet facet : facets) {
      final org.jdom2.Element facetElement = new org.jdom2.Element(FACET, namespace);
      final String description = facet.description();
      if (description.length() > 0) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final String description = facet.description();
      if (description.length() > 0) {
        final org.jdom2.Element facetDescription = new org.jdom2.Element(DESCRIPTION, namespace);
        facetDescription.setText(description);
        facetElement.addContent(facetDescription);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final String description = facet.description();
      if (description.length() > 0) {
        final org.jdom2.Element facetDescription = new org.jdom2.Element(DESCRIPTION, namespace);
        facetDescription.setText(description);
        facetElement.addContent(facetDescription);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        facetElement.addContent(facetDescription);
      }
      final org.jdom2.Element facetName = new org.jdom2.Element(FACET_NAME, namespace);
      facetName.setText(facet.name());
      facetElement.addContent(facetName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        facetElement.addContent(facetDescription);
      }
      final org.jdom2.Element facetName = new org.jdom2.Element(FACET_NAME, namespace);
      facetName.setText(facet.name());
      facetElement.addContent(facetName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      facetName.setText(facet.name());
      facetElement.addContent(facetName);
      final org.jdom2.Element facetExtension = new org.jdom2.Element(FACET_EXTENSION, namespace);
      final org.jdom2.Element elementAllowedChildComponents
          = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      facetName.setText(facet.name());
      facetElement.addContent(facetName);
      final org.jdom2.Element facetExtension = new org.jdom2.Element(FACET_EXTENSION, namespace);
      final org.jdom2.Element elementAllowedChildComponents
          = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      facetElement.addContent(facetName);
      final org.jdom2.Element facetExtension = new org.jdom2.Element(FACET_EXTENSION, namespace);
      final org.jdom2.Element elementAllowedChildComponents
          = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
      final String[] allowedChildComponents = facet.allowedChildComponenents();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final org.jdom2.Element facetExtension = new org.jdom2.Element(FACET_EXTENSION, namespace);
      final org.jdom2.Element elementAllowedChildComponents
          = new org.jdom2.Element(ALLOWED_CHILD_COMPONENTS, namespace);
      final String[] allowedChildComponents = facet.allowedChildComponenents();
      final StringBuilder allowedComponentTypes = new StringBuilder();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private void addValidator(
      final TypeElement typeElement, final List<org.jdom2.Element> newValidators, final Namespace namespace) {
    final Validator validatorAnn = typeElement.getAnnotation(Validator.class);
    final org.jdom2.Element validator = new org.jdom2.Element(VALIDATOR, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final TypeElement typeElement, final List<org.jdom2.Element> newValidators, final Namespace namespace) {
    final Validator validatorAnn = typeElement.getAnnotation(Validator.class);
    final org.jdom2.Element validator = new org.jdom2.Element(VALIDATOR, namespace);
    if (validatorAnn.id().length() > 0) {
      final org.jdom2.Element validatorId = new org.jdom2.Element(VALIDATOR_ID, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final TypeElement typeElement, final List<org.jdom2.Element> newValidators, final Namespace namespace) {
    final Validator validatorAnn = typeElement.getAnnotation(Validator.class);
    final org.jdom2.Element validator = new org.jdom2.Element(VALIDATOR, namespace);
    if (validatorAnn.id().length() > 0) {
      final org.jdom2.Element validatorId = new org.jdom2.Element(VALIDATOR_ID, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final org.jdom2.Element validator = new org.jdom2.Element(VALIDATOR, namespace);
    if (validatorAnn.id().length() > 0) {
      final org.jdom2.Element validatorId = new org.jdom2.Element(VALIDATOR_ID, namespace);
      validatorId.setText(validatorAnn.id());
      validator.addContent(validatorId);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final org.jdom2.Element validator = new org.jdom2.Element(VALIDATOR, namespace);
    if (validatorAnn.id().length() > 0) {
      final org.jdom2.Element validatorId = new org.jdom2.Element(VALIDATOR_ID, namespace);
      validatorId.setText(validatorAnn.id());
      validator.addContent(validatorId);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      validator.addContent(validatorId);
    } else if (validatorAnn.forClass().length() > 0) {
      final org.jdom2.Element validatorForClass = new org.jdom2.Element(VALIDATOR_FOR_CLASS, namespace);
      validatorForClass.setText(validatorAnn.forClass());
      validator.addContent(validatorForClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      validator.addContent(validatorId);
    } else if (validatorAnn.forClass().length() > 0) {
      final org.jdom2.Element validatorForClass = new org.jdom2.Element(VALIDATOR_FOR_CLASS, namespace);
      validatorForClass.setText(validatorAnn.forClass());
      validator.addContent(validatorForClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    }

    final org.jdom2.Element validatorClass = new org.jdom2.Element(VALIDATOR_CLASS, namespace);
    validatorClass.setText(typeElement.getQualifiedName().toString());
    validator.addContent(validatorClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    }

    final org.jdom2.Element validatorClass = new org.jdom2.Element(VALIDATOR_CLASS, namespace);
    validatorClass.setText(typeElement.getQualifiedName().toString());
    validator.addContent(validatorClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addRendererElement(
      final ComponentInfo componentInfo, final UIComponentTag componentTag, final List<org.jdom2.Element> renderer,
      final Namespace namespace)
      throws IOException, NoSuchFieldException, IllegalAccessException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      throws IOException, NoSuchFieldException, IllegalAccessException {
    for (final String rendererType : componentTag.rendererType()) {
      final org.jdom2.Element element = new org.jdom2.Element(RENDERER, namespace);
      String displayName = componentTag.displayName();
      if (displayName.equals("")) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      throws IOException, NoSuchFieldException, IllegalAccessException {
    for (final String rendererType : componentTag.rendererType()) {
      final org.jdom2.Element element = new org.jdom2.Element(RENDERER, namespace);
      String displayName = componentTag.displayName();
      if (displayName.equals("")) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        displayName = componentInfo.getComponentClassName();
      }
      final org.jdom2.Element elementDisplayName = new org.jdom2.Element(DISPLAY_NAME, namespace);
      elementDisplayName.setText(displayName);
      element.addContent(elementDisplayName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        displayName = componentInfo.getComponentClassName();
      }
      final org.jdom2.Element elementDisplayName = new org.jdom2.Element(DISPLAY_NAME, namespace);
      elementDisplayName.setText(displayName);
      element.addContent(elementDisplayName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementDisplayName.setText(displayName);
      element.addContent(elementDisplayName);
      final org.jdom2.Element elementComponentFamily = new org.jdom2.Element(COMPONENT_FAMILY, namespace);
      elementComponentFamily.addContent(componentInfo.getComponentFamily());
      element.addContent(elementComponentFamily);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementDisplayName.setText(displayName);
      element.addContent(elementDisplayName);
      final org.jdom2.Element elementComponentFamily = new org.jdom2.Element(COMPONENT_FAMILY, namespace);
      elementComponentFamily.addContent(componentInfo.getComponentFamily());
      element.addContent(elementComponentFamily);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementComponentFamily.addContent(componentInfo.getComponentFamily());
      element.addContent(elementComponentFamily);
      final org.jdom2.Element elementType = new org.jdom2.Element(RENDERER_TYPE, namespace);
      elementType.setText(rendererType);
      element.addContent(elementType);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementComponentFamily.addContent(componentInfo.getComponentFamily());
      element.addContent(elementComponentFamily);
      final org.jdom2.Element elementType = new org.jdom2.Element(RENDERER_TYPE, namespace);
      elementType.setText(rendererType);
      element.addContent(elementType);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementType.setText(rendererType);
      element.addContent(elementType);
      final org.jdom2.Element elementClass = new org.jdom2.Element(RENDERER_CLASS, namespace);
      final String className = "org.apache.myfaces.tobago.internal.renderkit.renderer." + rendererType + "Renderer";
      elementClass.setText(className);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      elementType.setText(rendererType);
      element.addContent(elementType);
      final org.jdom2.Element elementClass = new org.jdom2.Element(RENDERER_CLASS, namespace);
      final String className = "org.apache.myfaces.tobago.internal.renderkit.renderer." + rendererType + "Renderer";
      elementClass.setText(className);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private void addConverter(
      final TypeElement typeElement, final List<org.jdom2.Element> newConverters, final Namespace namespace) {
    final Converter converterAnn = typeElement.getAnnotation(Converter.class);
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final TypeElement typeElement, final List<org.jdom2.Element> newConverters, final Namespace namespace) {
    final Converter converterAnn = typeElement.getAnnotation(Converter.class);
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
    if (converterAnn.id().length() > 0) {
      final org.jdom2.Element converterId = new org.jdom2.Element(CONVERTER_ID, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final TypeElement typeElement, final List<org.jdom2.Element> newConverters, final Namespace namespace) {
    final Converter converterAnn = typeElement.getAnnotation(Converter.class);
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
    if (converterAnn.id().length() > 0) {
      final org.jdom2.Element converterId = new org.jdom2.Element(CONVERTER_ID, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
    if (converterAnn.id().length() > 0) {
      final org.jdom2.Element converterId = new org.jdom2.Element(CONVERTER_ID, namespace);
      converterId.setText(converterAnn.id());
      converter.addContent(converterId);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final org.jdom2.Element converter = new org.jdom2.Element(CONVERTER, namespace);
    if (converterAnn.id().length() > 0) {
      final org.jdom2.Element converterId = new org.jdom2.Element(CONVERTER_ID, namespace);
      converterId.setText(converterAnn.id());
      converter.addContent(converterId);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      converter.addContent(converterId);
    } else if (converterAnn.forClass().length() > 0) {
      final org.jdom2.Element converterForClass = new org.jdom2.Element(CONVERTER_FOR_CLASS, namespace);
      converterForClass.setText(converterAnn.forClass());
      converter.addContent(converterForClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      converter.addContent(converterId);
    } else if (converterAnn.forClass().length() > 0) {
      final org.jdom2.Element converterForClass = new org.jdom2.Element(CONVERTER_FOR_CLASS, namespace);
      converterForClass.setText(converterAnn.forClass());
      converter.addContent(converterForClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    }

    final org.jdom2.Element converterClass = new org.jdom2.Element(CONVERTER_CLASS, namespace);
    converterClass.setText(typeElement.getQualifiedName().toString());
    converter.addContent(converterClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    }

    final org.jdom2.Element converterClass = new org.jdom2.Element(CONVERTER_CLASS, namespace);
    converterClass.setText(typeElement.getQualifiedName().toString());
    converter.addContent(converterClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  protected org.jdom2.Element createComponentElement(
      final ComponentInfo componentInfo, final UIComponentTag componentTag, final Namespace namespace)
      throws IOException, NoSuchFieldException, IllegalAccessException {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final ComponentInfo componentInfo, final UIComponentTag componentTag, final Namespace namespace)
      throws IOException, NoSuchFieldException, IllegalAccessException {
    final org.jdom2.Element element = new org.jdom2.Element(COMPONENT, namespace);
    final org.jdom2.Element elementDisplayName = new org.jdom2.Element(DISPLAY_NAME, namespace);
    elementDisplayName.setText(componentInfo.getComponentClassName());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final ComponentInfo componentInfo, final UIComponentTag componentTag, final Namespace namespace)
      throws IOException, NoSuchFieldException, IllegalAccessException {
    final org.jdom2.Element element = new org.jdom2.Element(COMPONENT, namespace);
    final org.jdom2.Element elementDisplayName = new org.jdom2.Element(DISPLAY_NAME, namespace);
    elementDisplayName.setText(componentInfo.getComponentClassName());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      throws IOException, NoSuchFieldException, IllegalAccessException {
    final org.jdom2.Element element = new org.jdom2.Element(COMPONENT, namespace);
    final org.jdom2.Element elementDisplayName = new org.jdom2.Element(DISPLAY_NAME, namespace);
    elementDisplayName.setText(componentInfo.getComponentClassName());
    element.addContent(elementDisplayName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      throws IOException, NoSuchFieldException, IllegalAccessException {
    final org.jdom2.Element element = new org.jdom2.Element(COMPONENT, namespace);
    final org.jdom2.Element elementDisplayName = new org.jdom2.Element(DISPLAY_NAME, namespace);
    elementDisplayName.setText(componentInfo.getComponentClassName());
    element.addContent(elementDisplayName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    elementDisplayName.setText(componentInfo.getComponentClassName());
    element.addContent(elementDisplayName);
    final org.jdom2.Element elementType = new org.jdom2.Element(COMPONENT_TYPE, namespace);
    elementType.setText(componentInfo.getComponentType());
    element.addContent(elementType);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    elementDisplayName.setText(componentInfo.getComponentClassName());
    element.addContent(elementDisplayName);
    final org.jdom2.Element elementType = new org.jdom2.Element(COMPONENT_TYPE, namespace);
    elementType.setText(componentInfo.getComponentType());
    element.addContent(elementType);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    elementType.setText(componentInfo.getComponentType());
    element.addContent(elementType);
    final org.jdom2.Element elementClass = new org.jdom2.Element(COMPONENT_CLASS, namespace);
    elementClass.setText(componentTag.uiComponent());
    element.addContent(elementClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    elementType.setText(componentInfo.getComponentType());
    element.addContent(elementType);
    final org.jdom2.Element elementClass = new org.jdom2.Element(COMPONENT_CLASS, namespace);
    elementClass.setText(componentTag.uiComponent());
    element.addContent(elementClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    // rewrite DOM as a string to find differences, since text outside the root element is not tracked

    final org.jdom2.Element rootElement = document.getRootElement();

    rootElement.setNamespace(Namespace.getNamespace("https://jakarta.ee/xml/ns/jakartaee"));
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Namespace namespace = rootElement.getNamespace();
    applyNamespace(rootElement, namespace);
    final List<org.jdom2.Element> components = rootElement.getChildren(COMPONENT, namespace);

    final List<org.jdom2.Element> newComponents = new ArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final List<org.jdom2.Element> components = rootElement.getChildren(COMPONENT, namespace);

    final List<org.jdom2.Element> newComponents = new ArrayList<>();
    final List<org.jdom2.Element> newRenderer = new ArrayList<>();
    final List<org.jdom2.Element> newConverters = new ArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

    final List<org.jdom2.Element> newComponents = new ArrayList<>();
    final List<org.jdom2.Element> newRenderer = new ArrayList<>();
    final List<org.jdom2.Element> newConverters = new ArrayList<>();
    final List<org.jdom2.Element> newValidators = new ArrayList<>();
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final List<org.jdom2.Element> newComponents = new ArrayList<>();
    final List<org.jdom2.Element> newRenderer = new ArrayList<>();
    final List<org.jdom2.Element> newConverters = new ArrayList<>();
    final List<org.jdom2.Element> newValidators = new ArrayList<>();

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final List<org.jdom2.Element> newRenderer = new ArrayList<>();
    final List<org.jdom2.Element> newConverters = new ArrayList<>();
    final List<org.jdom2.Element> newValidators = new ArrayList<>();

    for (final TypeElement element : getTypes()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    }

    final List<org.jdom2.Element> elementsToAdd = new ArrayList<>();
    // sort out duplicates
    for (final org.jdom2.Element newElement : newComponents) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final List<org.jdom2.Element> elementsToAdd = new ArrayList<>();
    // sort out duplicates
    for (final org.jdom2.Element newElement : newComponents) {
      final boolean found = containsElement(components, newElement);
      if (!found) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    }
    if (!newRenderer.isEmpty()) {
      org.jdom2.Element renderKit = getFirstElementByName(rootElement, RENDER_KIT);
      if (renderKit == null) {
        renderKit = new org.jdom2.Element(RENDER_KIT, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      org.jdom2.Element renderKit = getFirstElementByName(rootElement, RENDER_KIT);
      if (renderKit == null) {
        renderKit = new org.jdom2.Element(RENDER_KIT, namespace);
        final int last = getIndexAfter(rootElement, CONVERTER, COMPONENT, FACTORY, APPLICATION, BEHAVIOR);
        rootElement.addContent(last, renderKit);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        rootElement.addContent(last, renderKit);
      }
      final org.jdom2.Element renderKitId = new org.jdom2.Element(RENDER_KIT_ID, namespace);
      renderKitId.setText("tobago");
      renderKit.addContent(0, renderKitId);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        rootElement.addContent(last, renderKit);
      }
      final org.jdom2.Element renderKitId = new org.jdom2.Element(RENDER_KIT_ID, namespace);
      renderKitId.setText("tobago");
      renderKit.addContent(0, renderKitId);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      renderKitId.setText("tobago");
      renderKit.addContent(0, renderKitId);
      final org.jdom2.Element renderKitClass = new org.jdom2.Element(RENDER_KIT_CLASS, namespace);
      renderKitClass.setText("org.apache.myfaces.tobago.renderkit.TobagoRenderKit");
      renderKit.addContent(1, renderKitClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      renderKitId.setText("tobago");
      renderKit.addContent(0, renderKitId);
      final org.jdom2.Element renderKitClass = new org.jdom2.Element(RENDER_KIT_CLASS, namespace);
      renderKitClass.setText("org.apache.myfaces.tobago.renderkit.TobagoRenderKit");
      renderKit.addContent(1, renderKitClass);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private int getIndexAfter(final org.jdom2.Element rootElement, final String... tagNames) {
    for (final String tagName : tagNames) {
      final int index = getIndexAfter(rootElement, tagName);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private void addDescription(
      final ExecutableElement element, final org.jdom2.Element attribute, final Namespace namespace) {
    String comment = processingEnv.getElementUtils().getDocComment(element);
    if (comment != null) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      comment = comment.trim();
      if (comment.length() > 0) {
        final org.jdom2.Element description = new org.jdom2.Element(DESCRIPTION, namespace);
        description.setText(comment);
        attribute.addContent(description);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      comment = comment.trim();
      if (comment.length() > 0) {
        final org.jdom2.Element description = new org.jdom2.Element(DESCRIPTION, namespace);
        description.setText(comment);
        attribute.addContent(description);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addElement(
      final TypeElement typeElement, final List<org.jdom2.Element> components, final List<org.jdom2.Element> renderer,
      final Namespace namespace) throws Exception {
    final UIComponentTag componentTag = typeElement.getAnnotation(UIComponentTag.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addElement(
      final TypeElement typeElement, final List<org.jdom2.Element> components, final List<org.jdom2.Element> renderer,
      final Namespace namespace) throws Exception {
    final UIComponentTag componentTag = typeElement.getAnnotation(UIComponentTag.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final ComponentInfo componentInfo = new ComponentInfo(typeElement, componentTag);
      if (!componentTag.isComponentAlreadyDefined()) {
        final org.jdom2.Element element = createComponentElement(componentInfo, componentTag, namespace);
        if (element != null) {
          if (!containsElement(components, element)) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          if (!containsElement(components, element)) {
            addFacets(componentTag, namespace, element);
            final List<org.jdom2.Element> attributes = new ArrayList<>();
            final List<org.jdom2.Element> properties = new ArrayList<>();
            addAttributes(typeElement, attributes, properties, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
            addFacets(componentTag, namespace, element);
            final List<org.jdom2.Element> attributes = new ArrayList<>();
            final List<org.jdom2.Element> properties = new ArrayList<>();
            addAttributes(typeElement, attributes, properties, namespace);
            if (!attributes.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addAttribute(
      final ExecutableElement executableElement, final List<org.jdom2.Element> attributes,
      final List<org.jdom2.Element> properties,
      final Namespace namespace) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  protected void addAttribute(
      final ExecutableElement executableElement, final List<org.jdom2.Element> attributes,
      final List<org.jdom2.Element> properties,
      final Namespace namespace) {
    final UIComponentTagAttribute componentAttribute = executableElement.getAnnotation(UIComponentTagAttribute.class);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        final String name = simpleName.substring(3, 4).toLowerCase(Locale.ENGLISH) + simpleName.substring(4);
        if (IGNORED_PROPERTIES.contains(name)) {
          final org.jdom2.Element attribute = new org.jdom2.Element(ATTRIBUTE, namespace);
          final org.jdom2.Element attributeName = new org.jdom2.Element(ATTRIBUTE_NAME, namespace);
          final org.jdom2.Element attributeClass = new org.jdom2.Element(ATTRIBUTE_CLASS, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        final String name = simpleName.substring(3, 4).toLowerCase(Locale.ENGLISH) + simpleName.substring(4);
        if (IGNORED_PROPERTIES.contains(name)) {
          final org.jdom2.Element attribute = new org.jdom2.Element(ATTRIBUTE, namespace);
          final org.jdom2.Element attributeName = new org.jdom2.Element(ATTRIBUTE_NAME, namespace);
          final org.jdom2.Element attributeClass = new org.jdom2.Element(ATTRIBUTE_CLASS, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        if (IGNORED_PROPERTIES.contains(name)) {
          final org.jdom2.Element attribute = new org.jdom2.Element(ATTRIBUTE, namespace);
          final org.jdom2.Element attributeName = new org.jdom2.Element(ATTRIBUTE_NAME, namespace);
          final org.jdom2.Element attributeClass = new org.jdom2.Element(ATTRIBUTE_CLASS, namespace);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        if (IGNORED_PROPERTIES.contains(name)) {
          final org.jdom2.Element attribute = new org.jdom2.Element(ATTRIBUTE, namespace);
          final org.jdom2.Element attributeName = new org.jdom2.Element(ATTRIBUTE_NAME, namespace);
          final org.jdom2.Element attributeClass = new org.jdom2.Element(ATTRIBUTE_CLASS, namespace);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          final org.jdom2.Element attribute = new org.jdom2.Element(ATTRIBUTE, namespace);
          final org.jdom2.Element attributeName = new org.jdom2.Element(ATTRIBUTE_NAME, namespace);
          final org.jdom2.Element attributeClass = new org.jdom2.Element(ATTRIBUTE_CLASS, namespace);

          attributeName.setText(name);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          final org.jdom2.Element attribute = new org.jdom2.Element(ATTRIBUTE, namespace);
          final org.jdom2.Element attributeName = new org.jdom2.Element(ATTRIBUTE_NAME, namespace);
          final org.jdom2.Element attributeClass = new org.jdom2.Element(ATTRIBUTE_CLASS, namespace);

          attributeName.setText(name);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.context` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/Markup.java`
#### Snippet
```java
 * </p>
 * <p>
 * In JSPs the class {@link org.apache.myfaces.tobago.context.MarkupEditor} will convert the string literals.
 * </p>
 */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          attribute.addContent(attributeClass);
          if (componentAttribute.defaultValue().length() > 0) {
            final org.jdom2.Element defaultValue = new org.jdom2.Element(DEFAULT_VALUE, namespace);
            defaultValue.setText(componentAttribute.defaultValue());
            attribute.addContent(defaultValue);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          attribute.addContent(attributeClass);
          if (componentAttribute.defaultValue().length() > 0) {
            final org.jdom2.Element defaultValue = new org.jdom2.Element(DEFAULT_VALUE, namespace);
            defaultValue.setText(componentAttribute.defaultValue());
            attribute.addContent(defaultValue);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          attributes.add(attribute);
        } else {
          final org.jdom2.Element property = new org.jdom2.Element(PROPERTY, namespace);
          final org.jdom2.Element propertyName = new org.jdom2.Element(PROPERTY_NAME, namespace);
          final org.jdom2.Element propertyClass = new org.jdom2.Element(PROPERTY_CLASS, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          attributes.add(attribute);
        } else {
          final org.jdom2.Element property = new org.jdom2.Element(PROPERTY, namespace);
          final org.jdom2.Element propertyName = new org.jdom2.Element(PROPERTY_NAME, namespace);
          final org.jdom2.Element propertyClass = new org.jdom2.Element(PROPERTY_CLASS, namespace);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        } else {
          final org.jdom2.Element property = new org.jdom2.Element(PROPERTY, namespace);
          final org.jdom2.Element propertyName = new org.jdom2.Element(PROPERTY_NAME, namespace);
          final org.jdom2.Element propertyClass = new org.jdom2.Element(PROPERTY_CLASS, namespace);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
        } else {
          final org.jdom2.Element property = new org.jdom2.Element(PROPERTY, namespace);
          final org.jdom2.Element propertyName = new org.jdom2.Element(PROPERTY_NAME, namespace);
          final org.jdom2.Element propertyClass = new org.jdom2.Element(PROPERTY_CLASS, namespace);

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          final org.jdom2.Element property = new org.jdom2.Element(PROPERTY, namespace);
          final org.jdom2.Element propertyName = new org.jdom2.Element(PROPERTY_NAME, namespace);
          final org.jdom2.Element propertyClass = new org.jdom2.Element(PROPERTY_CLASS, namespace);

          propertyName.setText(name);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          final org.jdom2.Element property = new org.jdom2.Element(PROPERTY, namespace);
          final org.jdom2.Element propertyName = new org.jdom2.Element(PROPERTY_NAME, namespace);
          final org.jdom2.Element propertyClass = new org.jdom2.Element(PROPERTY_CLASS, namespace);

          propertyName.setText(name);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          property.addContent(propertyClass);
          if (componentAttribute.defaultValue().length() > 0) {
            final org.jdom2.Element defaultValue = new org.jdom2.Element(DEFAULT_VALUE, namespace);
            defaultValue.setText(componentAttribute.defaultValue());
            property.addContent(defaultValue);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
          property.addContent(propertyClass);
          if (componentAttribute.defaultValue().length() > 0) {
            final org.jdom2.Element defaultValue = new org.jdom2.Element(DEFAULT_VALUE, namespace);
            defaultValue.setText(componentAttribute.defaultValue());
            property.addContent(defaultValue);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private boolean containsElement(final List<org.jdom2.Element> components, final org.jdom2.Element newElement) {
    return getEqualElement(components, newElement) != null;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private boolean containsElement(final List<org.jdom2.Element> components, final org.jdom2.Element newElement) {
    return getEqualElement(components, newElement) != null;
  }
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private org.jdom2.Element getFirstElementByName(final org.jdom2.Element rootElement, final String tagName) {
    final List<org.jdom2.Element> elements = rootElement.getChildren(tagName, rootElement.getNamespace());
    if (elements.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private org.jdom2.Element getFirstElementByName(final org.jdom2.Element rootElement, final String tagName) {
    final List<org.jdom2.Element> elements = rootElement.getChildren(tagName, rootElement.getNamespace());
    if (elements.isEmpty()) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  private org.jdom2.Element getFirstElementByName(final org.jdom2.Element rootElement, final String tagName) {
    final List<org.jdom2.Element> elements = rootElement.getChildren(tagName, rootElement.getNamespace());
    if (elements.isEmpty()) {
      return null;
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  private org.jdom2.Element createPropertyOrAttributeExtension(
      final String extensionType, final ExecutableElement executableElement,
      final UIComponentTagAttribute uiComponentTagAttribute,
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final Namespace namespace)
      throws IllegalArgumentException {
    final org.jdom2.Element extensionElement = new org.jdom2.Element(extensionType, namespace);
    final org.jdom2.Element valueExpression = new org.jdom2.Element(VALUE_EXPRESSION, namespace);
    valueExpression.setText(uiComponentTagAttribute.expression().toMetaDataString());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final Namespace namespace)
      throws IllegalArgumentException {
    final org.jdom2.Element extensionElement = new org.jdom2.Element(extensionType, namespace);
    final org.jdom2.Element valueExpression = new org.jdom2.Element(VALUE_EXPRESSION, namespace);
    valueExpression.setText(uiComponentTagAttribute.expression().toMetaDataString());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      throws IllegalArgumentException {
    final org.jdom2.Element extensionElement = new org.jdom2.Element(extensionType, namespace);
    final org.jdom2.Element valueExpression = new org.jdom2.Element(VALUE_EXPRESSION, namespace);
    valueExpression.setText(uiComponentTagAttribute.expression().toMetaDataString());
    extensionElement.addContent(valueExpression);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      throws IllegalArgumentException {
    final org.jdom2.Element extensionElement = new org.jdom2.Element(extensionType, namespace);
    final org.jdom2.Element valueExpression = new org.jdom2.Element(VALUE_EXPRESSION, namespace);
    valueExpression.setText(uiComponentTagAttribute.expression().toMetaDataString());
    extensionElement.addContent(valueExpression);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final String[] allowedValues = uiComponentTagAttribute.allowedValues();
    if (allowedValues.length > 0) {
      final org.jdom2.Element propertyValues = new org.jdom2.Element(PROPERTY_VALUES, namespace);
      final StringBuilder values = new StringBuilder();
      for (final String value : allowedValues) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final String[] allowedValues = uiComponentTagAttribute.allowedValues();
    if (allowedValues.length > 0) {
      final org.jdom2.Element propertyValues = new org.jdom2.Element(PROPERTY_VALUES, namespace);
      final StringBuilder values = new StringBuilder();
      for (final String value : allowedValues) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Deprecated deprecated = executableElement.getAnnotation(Deprecated.class);
    if (deprecated != null) {
      final org.jdom2.Element elementDeprecated = new org.jdom2.Element(DEPRECATED, namespace);
      elementDeprecated.setText("Warning: This property is deprecated!");
      extensionElement.addContent(elementDeprecated);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final Deprecated deprecated = executableElement.getAnnotation(Deprecated.class);
    if (deprecated != null) {
      final org.jdom2.Element elementDeprecated = new org.jdom2.Element(DEPRECATED, namespace);
      elementDeprecated.setText("Warning: This property is deprecated!");
      extensionElement.addContent(elementDeprecated);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      extensionElement.addContent(elementDeprecated);
    }
    final org.jdom2.Element hidden = new org.jdom2.Element(HIDDEN, namespace);
    hidden.setText(Boolean.toString(uiComponentTagAttribute.isHidden()));
    extensionElement.addContent(hidden);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      extensionElement.addContent(elementDeprecated);
    }
    final org.jdom2.Element hidden = new org.jdom2.Element(HIDDEN, namespace);
    hidden.setText(Boolean.toString(uiComponentTagAttribute.isHidden()));
    extensionElement.addContent(hidden);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    hidden.setText(Boolean.toString(uiComponentTagAttribute.isHidden()));
    extensionElement.addContent(hidden);
    final org.jdom2.Element readOnly = new org.jdom2.Element(READONLY, namespace);
    readOnly.setText(Boolean.toString(uiComponentTagAttribute.isReadOnly()));
    extensionElement.addContent(readOnly);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    hidden.setText(Boolean.toString(uiComponentTagAttribute.isHidden()));
    extensionElement.addContent(hidden);
    final org.jdom2.Element readOnly = new org.jdom2.Element(READONLY, namespace);
    readOnly.setText(Boolean.toString(uiComponentTagAttribute.isReadOnly()));
    extensionElement.addContent(readOnly);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final TagAttribute tagAttribute = executableElement.getAnnotation(TagAttribute.class);
    if (tagAttribute != null) {
      final org.jdom2.Element required = new org.jdom2.Element(REQUIRED, namespace);
      required.setText(Boolean.toString(tagAttribute.required()));
      extensionElement.addContent(required);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final TagAttribute tagAttribute = executableElement.getAnnotation(TagAttribute.class);
    if (tagAttribute != null) {
      final org.jdom2.Element required = new org.jdom2.Element(REQUIRED, namespace);
      required.setText(Boolean.toString(tagAttribute.required()));
      extensionElement.addContent(required);
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  public boolean equals(final org.jdom2.Element element1, final org.jdom2.Element element2) {
    final Namespace namespace = element1.getNamespace();
    if (element1.getName().equals(element2.getName()) && element1.getNamespace().equals(element2.getNamespace())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
  }

  public boolean equals(final org.jdom2.Element element1, final org.jdom2.Element element2) {
    final Namespace namespace = element1.getNamespace();
    if (element1.getName().equals(element2.getName()) && element1.getNamespace().equals(element2.getNamespace())) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addAttributes(
      final TypeElement typeElement, final List<org.jdom2.Element> attributes, final List<org.jdom2.Element> properties,
      final Namespace namespace) {

```

### UnnecessaryFullyQualifiedName
Qualifier `org.jdom2` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java

  protected void addAttributes(
      final TypeElement typeElement, final List<org.jdom2.Element> attributes, final List<org.jdom2.Element> properties,
      final Namespace namespace) {

```

### UnnecessaryFullyQualifiedName
Qualifier `javax.lang.model.element` is unnecessary, and can be replaced with an import
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      final Namespace namespace) {

    for (final javax.lang.model.element.Element element : processingEnv.getElementUtils().getAllMembers(typeElement)) {
      final ExecutableElement executableElement = (ExecutableElement) element;
      if (executableElement.getAnnotation(TagAttribute.class) == null
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.context` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/Resource.java`
#### Snippet
```java

  /**
   * Get an URL of an internal resource. First, {@link jakarta.faces.context.ExternalContext#getResource(String)} is
   * checked for an non-null URL return value. In the case of a null return value (as it is the case for Weblogic 8.1
   * for a packed war), a URL with a special URL handler is constructed, which can be used for <em>opening</em> a
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.servlet` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/Resource.java`
#### Snippet
```java
   * for a packed war), a URL with a special URL handler is constructed, which can be used for <em>opening</em> a
   * serlvet resource later. Internally, this special URL handler will call
   * {@link jakarta.servlet.ServletContext#getResourceAsStream(String)} when an inputstream is requested.
   * This works even on Weblogic 8.1
   *
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SortingUtils.java`
#### Snippet
```java
      }
      if (child instanceof UICommand
          || child instanceof jakarta.faces.component.UIPanel) {
        child = getFirstSortableChild(child.getChildren());
        if (child instanceof UIOutput) {
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.context` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
  /**
   * Creates a list of SelectItems to use for rendering. You should only use this method (which returns a list), when
   * you need a list. Otherwise, please use {@link #getItemIterator(jakarta.faces.context.FacesContext,
   * jakarta.faces.component.UIComponent)}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/SelectItemUtils.java`
#### Snippet
```java
   * Creates a list of SelectItems to use for rendering. You should only use this method (which returns a list), when
   * you need a list. Otherwise, please use {@link #getItemIterator(jakarta.faces.context.FacesContext,
   * jakarta.faces.component.UIComponent)}
   */
  public static List<SelectItem> getItemList(final FacesContext facesContext, final UIComponent selector) {
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.apt.annotation` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/package-info.java`
#### Snippet
```java
 * (C) Copyright 2005-2023 The Apache Software Foundation</b>
 */
@org.apache.myfaces.tobago.apt.annotation.Taglib(
    shortName = "tc",
    uri = "http://myfaces.apache.org/tobago/component",
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.el` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ResetInputActionListenerTagDeclaration.java`
#### Snippet
```java
   */
  @TagAttribute(required = false, name = Attributes.EXECUTE, type = "java.lang.String")
  void setExecute(jakarta.el.ValueExpression execute);

}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.component` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/EventTagDeclaration.java`
#### Snippet
```java

  /**
   * The name of the event as an instance of {@link org.apache.myfaces.tobago.component.ClientBehaviors}
   * This will be also overwrite events of possible f:ajax children.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
   * Horizontal alignment of this column.
   * Possible values:
   * {@link org.apache.myfaces.tobago.layout.TextAlign#left} (default),
   * {@link org.apache.myfaces.tobago.layout.TextAlign#right},
   * {@link org.apache.myfaces.tobago.layout.TextAlign#center},
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
   * Possible values:
   * {@link org.apache.myfaces.tobago.layout.TextAlign#left} (default),
   * {@link org.apache.myfaces.tobago.layout.TextAlign#right},
   * {@link org.apache.myfaces.tobago.layout.TextAlign#center},
   * {@link org.apache.myfaces.tobago.layout.TextAlign#justify}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
   * {@link org.apache.myfaces.tobago.layout.TextAlign#left} (default),
   * {@link org.apache.myfaces.tobago.layout.TextAlign#right},
   * {@link org.apache.myfaces.tobago.layout.TextAlign#center},
   * {@link org.apache.myfaces.tobago.layout.TextAlign#justify}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
   * {@link org.apache.myfaces.tobago.layout.TextAlign#right},
   * {@link org.apache.myfaces.tobago.layout.TextAlign#center},
   * {@link org.apache.myfaces.tobago.layout.TextAlign#justify}
   */
  @TagAttribute
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
   * Vertical alignment of this column.
   * Possible values:
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#top} (default),
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#bottom},
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#middle}
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
   * Possible values:
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#top} (default),
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#bottom},
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#middle}
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.layout` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/taglib/component/ColumnTagDeclaration.java`
#### Snippet
```java
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#top} (default),
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#bottom},
   * {@link org.apache.myfaces.tobago.layout.VerticalAlign#middle}
   */
  @TagAttribute
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUICommand.java`
#### Snippet
```java
  }

  public abstract java.lang.String getImage();

  @Override
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIInput.java`
#### Snippet
```java
 * Base class for some inputs.
 */
public abstract class AbstractUIInput extends jakarta.faces.component.UIInput
    implements SupportsAccessKey, SupportsAutoSpacing, SupportsLabelLayout, Visual, ClientBehaviorHolder,
    SupportFieldId, SupportsHelp, SupportsDecorationPosition {
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIMessages.java`
#### Snippet
```java
 * {@link org.apache.myfaces.tobago.internal.taglib.component.MessagesTagDeclaration}
 */
public abstract class AbstractUIMessages extends jakarta.faces.component.UIMessages
    implements Visual {

```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPanelBase.java`
#### Snippet
```java
public abstract class AbstractUIPanelBase extends jakarta.faces.component.UIPanel implements Visual {

  public abstract java.lang.String getTip();
}

```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIPanelBase.java`
#### Snippet
```java
 * Base class for panels.
 */
public abstract class AbstractUIPanelBase extends jakarta.faces.component.UIPanel implements Visual {

  public abstract java.lang.String getTip();
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISelectOneBase.java`
#### Snippet
```java
 * Base class for select one.
 */
public abstract class AbstractUISelectOneBase extends jakarta.faces.component.UISelectOne
    implements SupportsAutoSpacing, Visual, SupportsLabelLayout, ClientBehaviorHolder, SupportsHelp,
    SupportsDecorationPosition {
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILabelBase.java`
#### Snippet
```java
 */
public abstract class AbstractUILabelBase
    extends jakarta.faces.component.UIOutput implements Visual {

  public String getLabel() {
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.component` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
 * Base class for sheet and tree.
 */
public abstract class AbstractUIData extends jakarta.faces.component.UIData implements Visual {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.component` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LabelLayoutRendererBase.java`
#### Snippet
```java
/**
 * Manages the rendering of the <b>label</b> and the <b>field</b> together with different possibilities for the position
 * of the label (defined by {@link org.apache.myfaces.tobago.component.Attributes#labelLayout}
 */
public abstract class LabelLayoutRendererBase<T extends UIComponent & SupportsLabelLayout & SupportsAutoSpacing>
```

### UnnecessaryFullyQualifiedName
Qualifier `jakarta.faces.render` is unnecessary, and can be replaced with an import
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
import java.util.List;

public class TobagoClientBehaviorRenderer extends jakarta.faces.render.ClientBehaviorRenderer {

  private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.renderkit.css` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/CustomClassEditor.java`
#### Snippet
```java

/**
 * Converter for {@link org.apache.myfaces.tobago.renderkit.css.CustomClass}
 *
 * @since 3.0.0
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.webapp` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/lifecycle/SecretPhaseListener.java`
#### Snippet
```java

  /**
   * Checks that the request contains a parameter {@link org.apache.myfaces.tobago.webapp.Secret#KEY} which is equals to
   * a secret value in the session.
   */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.myfaces.tobago.renderkit.css` is unnecessary and can be removed
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  TEXT_CENTER("text-center"),
  /**
   * @deprecated since 5.0.0, please use {@link org.apache.myfaces.tobago.renderkit.css.TobagoClass#TEXT__JUSTIFY}
   */
  @Deprecated
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
          } catch (final Exception e) {
            LOG.println(e.getMessage());
            e.printStackTrace();
            builder.append(call);
            builder.append(":? ");
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `WriterHelper()` of an abstract class should not be declared 'public'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/WriterHelper.java`
#### Snippet
```java
   */
  @Deprecated
  public WriterHelper(final Writer out, final String characterEncoding) {
    this.out = out;
    buffer = new ResponseWriterBuffer(out);
```

### NonProtectedConstructorInAbstractClass
Constructor `WriterHelper()` of an abstract class should not be declared 'public'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/WriterHelper.java`
#### Snippet
```java
  }

  public WriterHelper(final Writer out, final Charset charset) {
    this.out = out;
    buffer = new ResponseWriterBuffer(out);
```

### NonProtectedConstructorInAbstractClass
Constructor `PlanetExample()` of an abstract class should not be declared 'public'
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PlanetExample.java`
#### Snippet
```java
  private int planet;

  public PlanetExample() {
    planets = new SelectItem[]{
        new SelectItem(0, "Earth"),
```

## RuleId[id=Java8MapApi]
### Java8MapApi
Can be replaced with single 'Map.merge' method call
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/ContentSecurityPolicy.java`
#### Snippet
```java
  public void addDirective(final String name, final String text) {
    final String old = directiveMap.get(name);
    if (old != null) {
      directiveMap.put(name, old + ' ' + text);
    } else {
```

## RuleId[id=Convert2Lambda]
### Convert2Lambda
Anonymous new Runnable() can be replaced with lambda
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/WebSocketController.java`
#### Snippet
```java
    }

    scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
      @Override
      public void run() {
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassUtils.java`
#### Snippet
```java
      return qualifiedName.substring(pos + 1);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/generate/ClassUtils.java`
#### Snippet
```java
      return qualifiedName.substring(0, pos);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java
      } catch (final MissingResourceException damned) {
        facesContext.getExternalContext().log("resource bundle " + bundleName + " could not be found");
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java
  private static ResourceBundle getApplicationBundle(final FacesContext facesContext, final Locale locale) {
    final String bundleName = facesContext.getApplication().getMessageBundle();
    return bundleName != null ? getBundle(facesContext, locale, bundleName) : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java
  private static String getBundleString(final ResourceBundle bundle, final String key) {
    try {
      return bundle == null ? null : bundle.getString(key);
    } catch (final MissingResourceException e) {
      // ignore
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java
    } catch (final MissingResourceException e) {
      // ignore
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/MessageUtils.java`
#### Snippet
```java
  public static String getLabel(final FacesContext facesContext, final UIComponent component) {
    if (component == null) {
      return null;
    }
    final Object label = component.getAttributes().get("label");
```

### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
  private String deprecationComment(final String string) {
    if (string == null) {
      return null;
    }
    String result = string;
```

### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
      return result.trim();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/TaglibGenerator.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/WebXmlUtils.java`
#### Snippet
```java
      }
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/WebXmlUtils.java`
#### Snippet
```java
  private static String normalizePath(final ExternalContext externalContext, final String path) {
    if (path == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/ValueExpressionSheetStateChangeListener.java`
#### Snippet
```java
      LOG.error("", e);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/ValueExpressionTabChangeListener.java`
#### Snippet
```java
      LOG.error("", e);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SortedColumnList.java`
#### Snippet
```java

  public SortedColumn getFirst() {
    return list.size() > 0 ? list.get(0) : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/DateType.java`
#### Snippet
```java
      default:
        LOG.error("Unknown date type '{}'", text);
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TobagoActionSource.java`
#### Snippet
```java
  default MethodBinding getAction() {
    LOG.debug("JSF 1.1 style is no longer supported!");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/event/TobagoActionSource.java`
#### Snippet
```java
  default MethodBinding getActionListener() {
    LOG.debug("JSF 1.1 style is no longer supported!");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/Selectable.java`
#### Snippet
```java
  public static Selectable parse(final Object name) throws IllegalArgumentException {
    if (name == null) {
      return null;
    }
    if (name instanceof Selectable) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SuggestFilter.java`
#### Snippet
```java
  public static SuggestFilter parse(final String string) {
    if (string == null) {
      return null;
    }
    return valueOf(string.toUpperCase());
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
      p = p.getParent();
      if (p == null) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
      return mapping.get(rowIndex).getClientId();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
        return mapping.get(back.get(parent)).getClientId();
      } else {
        return null;
      }
    } else {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
      }
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
    final TreeNode parent = node.getParent();
    if (parent == null) {
      return null;
    }
    for (int i = 0; i < parent.getChildCount() - 1; i++) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/TreeNodeDataModel.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/MarginTokens.java`
#### Snippet
```java
  public static MarginTokens parse(final String tokens) {
    if (tokens == null) {
      return null;
    }
    final MarginTokens marginTokens = new MarginTokens();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/config/TobagoConfig.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/Measure.java`
#### Snippet
```java
    try {
      if (StringUtils.isEmpty(s)) {
        return null;
      }
      final int length = s.length();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/Measure.java`
#### Snippet
```java
      LOG.warn("Can't parse to any measure: '" + s + "'");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/layout/Measure.java`
#### Snippet
```java
  public static Measure valueOf(final Object object) {
    if (object == null) {
      return null;
    }
    if (object instanceof Measure) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/TransientStateHolder.java`
#### Snippet
```java
  public Object saveState(final FacesContext context) {
    // do nothing
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      final String rendererType) {
    if (rendererType == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
        renderer = (RendererBase) myRenderer;
      } else {
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      return max;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    LOG.error("No component found for id='{}', search base component is '{}'",
        componentId, component != null ? component.getClientId(context) : "<null>");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    }
    if (result.isEmpty()) {
      return null;
    } else {
      return StringUtils.join(result, ' ');
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      c = c.getParent();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      }
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      LOG.warn("The content of a confirmation facet must be a ValueHolder. Use e. g. <tc:out>.");
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      LOG.debug("found no clientId");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
  public static Object getDataAttribute(final UIComponent component, final String name) {
    final Map<Object, Object> map = getDataAttributes(component);
    return map != null ? map.get(name) : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      return Markup.INFO;
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    final UIComponent facet = getFacet(component, Facets.reload);
    if (facet == null) {
      return null;
    } else if (facet instanceof AbstractUIReload) {
      return (AbstractUIReload) facet;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      LOG.warn("Content of a reload facet must be {} but found {} in component with id '{}'",
          AbstractUIReload.class.getName(), facet.getClass().getName(), component.getClientId());
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      c = c.getParent();
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
            return ((Collection) converted).iterator().next();
          } else {
            return null;
          }
        } else {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    final Object character = getAttribute(component, name);
    if (character == null) {
      return null;
    } else if (character instanceof Character) {
      return (Character) character;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
    } else if (character instanceof String) {
      final String asString = (String) character;
      return asString.length() > 0 ? asString.charAt(0) : null;
    } else {
      LOG.warn("Unknown type '" + character.getClass().getName()
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      LOG.warn("Unknown type '" + character.getClass().getName()
          + "' for integer attribute: " + name + " comp: " + component);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
      return stringBuffer.toString();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
        c = c.getParent();
      }
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/FacesConfigGenerator.java`
#### Snippet
```java
    final List<org.jdom2.Element> elements = rootElement.getChildren(tagName, rootElement.getNamespace());
    if (elements.isEmpty()) {
      return null;
    } else {
      return elements.get(0);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/BoundedRangeModelConverter.java`
#### Snippet
```java
      throws ConverterException {
    if (boundedRangeModel == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/BoundedRangeModelConverter.java`
#### Snippet
```java
      throws ConverterException {
    if (StringUtils.isBlank(string)) {
      return null;
    } else {
      try {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/CurrencyConverter.java`
#### Snippet
```java
      throws ConverterException {
    if (currency == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/CurrencyConverter.java`
#### Snippet
```java
      throws ConverterException {
    if (StringUtils.isBlank(string)) {
      return null;
    } else {
      return Currency.getInstance(string);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/Markup.java`
#### Snippet
```java
  public static Markup valueOf(final String value) {
    if (StringUtils.isEmpty(value)) {
      return null;
    }
    if (value.contains(" ") || value.contains(",")) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/Markup.java`
#### Snippet
```java
  public static Markup valueOf(final String[] values) {
    if (values == null || values.length == 0) {
      return null;
    } else if (values.length == 1) {
      return valueOf(values[0]);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/context/Markup.java`
#### Snippet
```java
  public static Markup valueOf(final Object value) {
    if (value == null) {
      return null;
    }
    if (value instanceof Markup) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/MeasureConverter.java`
#### Snippet
```java
      throws ConverterException {
    if (measure == null) {
      return null;
    }
    try {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/convert/MeasureConverter.java`
#### Snippet
```java
      throws ConverterException {
    if (StringUtils.isBlank(string)) {
      return null;
    } else {
      return Measure.valueOf(string);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/EventHandler.java`
#### Snippet
```java
    public Object saveState(final FacesContext context) {
      if (initialStateMarked()) {
        return null;
      }
      return expression;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/EventHandler.java`
#### Snippet
```java
  @Override
  public String getFor() {
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/EventHandler.java`
#### Snippet
```java
  public String getEventName() {
    if (event == null) {
      return null;
    } else {
      return event.getValue();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/SortActionSourceRule.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/SheetStateChangeSourceRule.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/ContentTypeRule.java`
#### Snippet
```java
      return new ContentTypeRuleMapper(attribute);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/SupportsMarkupRule.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/TabChangeSourceRule.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
            expression.getExpressionString(), returnType, args));
      } else {
        return null;
      }
    } else {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/facelets/AttributeHandler.java`
#### Snippet
```java
    public MethodInfo getMethodInfo(final ELContext context)
        throws NullPointerException, ELException {
      return null;
    }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/HttpPartWrapper.java`
#### Snippet
```java
  @Override
  public Object saveState(final FacesContext context) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java

    if (string == null) {
      return null;
    }
    final int len = string.length();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/StringUtils.java`
#### Snippet
```java

    if (string == null) {
      return null;
    }
    final int len = string.length();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/AuthorizationHelper.java`
#### Snippet
```java
  private UIComponent getParentCompositeComponent(final UIComponent component) {
    if (component == null) {
      return null;
    } else if (UIComponent.isCompositeComponent(component)) {
      return component;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/AuthorizationHelper.java`
#### Snippet
```java
    @Override
    public Class<? extends Annotation> annotationType() {
      return null;
    }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
      LOG.warn("Can't parse " + suffix + ": '" + string + "' from parameter '" + key + "'", e);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/RenderUtils.java`
#### Snippet
```java
      LOG.warn("Ignoring: '{}'", clientBehavior);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java
  public static String encode(final Integer[] integers) {
    if (integers == null) {
      return null;
    }
    final StringBuilder builder = new StringBuilder();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java
  public static String encode(final Boolean[] booleans) {
    if (booleans == null) {
      return null;
    }
    final StringBuilder builder = new StringBuilder();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java
  public static String encode(final List<Integer> integers) {
    if (integers == null) {
      return null;
    }
    final StringBuilder builder = new StringBuilder();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java
  public static String encode(final Markup markups) {
    if (markups == null || markups.isEmpty()) {
      return null;
    }
    final StringBuilder builder = new StringBuilder(20);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java
  public static List<Integer> decodeIntegerArray(final String json) {
    if (json == null) {
      return null;
    }
    String string = json.trim();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java
  public static String encode(final String[] strings) {
    if (strings == null) {
      return null;
    }
    final StringBuilder builder = new StringBuilder();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/util/JsonUtils.java`
#### Snippet
```java

    if (commandMap == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/config/TobagoConfigSorter.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/model/SheetState.java`
#### Snippet
```java
  public String getSortedColumnId() {
    if (sortedColumnList.isEmpty()) {
      return null;
    } else {
      return sortedColumnList.getFirst().getId();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/layout/Grid.java`
#### Snippet
```java

    if (row >= rowCount) {
      return null;
    } else {
      return cells.get(column + row * columnCount);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/TobagoResponseWriterBase.java`
#### Snippet
```java
          return object instanceof String ? (String) object : object.toString();
        } else {
          return null;
        }
      } else {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/TobagoResponseWriterBase.java`
#### Snippet
```java
            + "Property defined, but no component to get a value. (value=null, property='" + property + "') "
            + trace.substring(trace.indexOf('(')));
        return null;
      }
    } else {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/webapp/TobagoResponseWriterBase.java`
#### Snippet
```java
          + "No value and no property defined. (value=null, property=null)"
          + trace.substring(trace.indexOf('(')));
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-tool/tobago-tool-apt/src/main/java/org/apache/myfaces/tobago/apt/processor/ClassesGenerator.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java
      if (parentSaved == null && stateHelperSaved == null) {
        //No values
        return null;
      }
      return new Object[]{parentSaved, stateHelperSaved};
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/EventBehavior.java`
#### Snippet
```java
      return (ValueExpression) bindings.get(name);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
          .getELContext());
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
    }
    if (stateObj == null) {
      return null;
    }
    if (stateObj instanceof AttachedListStateWrapper) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java

    if (serializableMap == null || serializableMap.size() == 0) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      final Object valueOrKey, final boolean delta) {
    if (valueOrKey == null) {
      return null;
    }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java

    if (attachedObject == null) {
      return null;
    }
    // StateHolder interface should take precedence over
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/behavior/DeltaStateHelper.java`
#### Snippet
```java
      final StateHolder holder = (StateHolder) attachedObject;
      if (holder.isTransient()) {
        return null;
      }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISplitLayout.java`
#### Snippet
```java

  public JustifyContent getJustifyContent() {
    return null; // TBD
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISplitLayout.java`
#### Snippet
```java

  public AlignItems getAlignItems() {
    return null; // TBD
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUITabGroup.java`
#### Snippet
```java
    }
    LOG.error("Found no component with index: " + index + " childCount: " + getChildCount());
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUISuggest.java`
#### Snippet
```java
      } catch (final Exception e) {
        LOG.error("", e);
        return null;
      }
    } else {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUILabelBase.java`
#### Snippet
```java
      return String.valueOf(value);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
  public String getRowParentClientId() {
    init();
    return dataModel != null ? dataModel.getRowParentClientId() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
    } else {
      LOG.warn("Not a tree model");
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
    } else {
      LOG.warn("Not a tree model");
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
    } else {
      LOG.warn("Not a tree model");
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/component/AbstractUIData.java`
#### Snippet
```java
  public String getRowClientId() {
    init();
    return dataModel != null ? dataModel.getRowClientId() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/CommandMap.java`
#### Snippet
```java
      return Collections.unmodifiableMap(other);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/FileRenderer.java`
#### Snippet
```java
      return builder.substring(1);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/LabelLayoutRendererBase.java`
#### Snippet
```java

  protected CssItem[] getComponentCss(final FacesContext facesContext, final T command) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DateRenderer.java`
#### Snippet
```java
  private String convertToString(Object value) {
    if (value == null) {
      return null;
    } else if (value instanceof String) {
      return (String) value;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DateRenderer.java`
#### Snippet
```java
        // todo: log debug instead of warn
        LOG.warn("Can't estimate type (clientId='{}')!", component.getClientId(facesContext));
        return null;
      } else if (estimatedType.isAssignableFrom(String.class)) {
        // todo: log debug instead of warn
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/DateRenderer.java`
#### Snippet
```java
        // todo: log debug instead of warn
        LOG.warn("No converter for java.lang.String");
        return null;
      } else {
        final DateTimeConverter dateTimeConverter = (DateTimeConverter)
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/BadgeRenderer.java`
#### Snippet
```java
  private BootstrapClass getBadgeColor(final Markup markup) {
    if (markup.contains(Markup.NONE)) {
      return null;
    } else if (markup.contains(Markup.PRIMARY)) {
      return BootstrapClass.TEXT_BG_PRIMARY;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/BadgeRenderer.java`
#### Snippet
```java
      return BootstrapClass.TEXT_BG_DARK;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneChoiceRenderer.java`
#### Snippet
```java
  @Override
  protected CssItem[] getComponentCss(final FacesContext facesContext, final T command) {
    return isInside(facesContext, HtmlElements.TOBAGO_IN) ? new CssItem[]{BootstrapClass.FORM_SELECT} : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneRadioRenderer.java`
#### Snippet
```java
  @Override
  protected String getFieldId(final FacesContext facesContext, final T component) {
    return null; // there is not a single input element in the type=radio case.
  }
}
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectOneRadioRenderer.java`
#### Snippet
```java
    final int[] indices
        = StringUtils.getIndices(reference != null ? reference.getRenderRange() : select.getRenderRange());
    return indices.length > 0 ? indices : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java

  protected CssItem[] getOuterCssItems(final FacesContext facesContext, final T command) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/CommandRendererBase.java`
#### Snippet
```java

  protected CssItem[] getCssItems(final FacesContext facesContext, final T command) {
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/ButtonRenderer.java`
#### Snippet
```java
    if (markup != null) {
      if (markup.contains(Markup.NONE)) {
        return null;
      } else if (markup.contains(Markup.PRIMARY)) {
        return BootstrapClass.BTN_PRIMARY;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java
        // optimization: no conversion for String values
        if (String.class.equals(selectItemsType)) {
          return null;
        }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyRendererBase.java`
#### Snippet
```java

    if (submittedValue == null) {
      return null;
    } else {
      if (!(submittedValue instanceof String[])) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
      final AjaxBehavior ajaxBehavior = (AjaxBehavior) behavior;
      if (ajaxBehavior.isDisabled()) {
        return null;
      }
      final Collection<String> execute = ajaxBehavior.getExecute();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/TobagoClientBehaviorRenderer.java`
#### Snippet
```java
      if (event != null) {
        if (!event.isRendered() || event.isDisabled()) {
          return null;
        } else {
          transition = event.isTransition();
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/BarRenderer.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/SupportsAutocomplete.java`
#### Snippet
```java
    final Object object = getAutocomplete();
    if (object == null) {
      return null;
    } else if (object instanceof Boolean) {
      return ((Boolean) object) ? "on" : "off";
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/LabelLayout.java`
#### Snippet
```java
  public static LabelLayout getSegment(final FacesContext facesContext) {
    Deprecation.LOG.error("not longer supported - see javadoc");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/component/Attributes.java`
#### Snippet
```java
      }
      LOG.warn("Can't find enum for {} with name '{}'", Attributes.class.getName(), name);
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SelectManyCheckboxRenderer.java`
#### Snippet
```java
    final int[] indices
        = StringUtils.getIndices(reference != null ? reference.getRenderRange() : select.getRenderRange());
    return indices.length > 0 ? indices : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/TobagoClass.java`
#### Snippet
```java
  public static CssItem valueOf(final DecorationPosition decorationPosition) {
    if (decorationPosition == null) {
      return null;
    } else {
      switch (decorationPosition) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/TobagoClass.java`
#### Snippet
```java
        default:
          LOG.warn("Undefined decoration position: '{}'.", decorationPosition);
          return null;
      }
    }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Icons.java`
#### Snippet
```java
      public String getName() {
        if (name == null) {
          return null;
        }
        if (PATTERN_BI.matcher(name).matches()) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/Icons.java`
#### Snippet
```java
        }
        LOG.warn("Unknown icon format for name: '" + name + "'");
        return null;
      }
    };
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ResizeController.java`
#### Snippet
```java
  public String resize() {
    LOG.info("Method resize() was called!");
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/Node.java`
#### Snippet
```java
  public String action() {
    LOG.info("action: name='" + name + "'");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationState.java`
#### Snippet
```java
      } else {
        LOG.warn("Strange navigation behavior");
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationState.java`
#### Snippet
```java
      } else {
        LOG.warn("Strange navigation behavior");
        return null;
      }
    }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationState.java`
#### Snippet
```java
  public String toggleViewSource() {
    viewSource = !viewSource;
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
    cutNode = null;
    copyNode = cloneNode(findFirstSelected());
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
      LOG.warn("No node selected.");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
      LOG.warn("No node selected.");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
    cutNode = null;
    copyNode = null;
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
      LOG.warn("No node selected.");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
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
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
    copyNode = null;
    cutNode = findFirstSelected();
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TreeEditorController.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NamedNode.java`
#### Snippet
```java
  public String action() {
    LOG.info(action);
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CollapsibleController.java`
#### Snippet
```java
  public String cancel() {
    LOG.info("cancel(): collapsed={}", collapsed);
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CollapsibleController.java`
#### Snippet
```java
  public String action() {
    LOG.info("action(): collapsed={}", collapsed);
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoginController.java`
#### Snippet
```java
    externalContext.redirect(externalContext.getRequestContextPath() + "/");
    facesContext.responseComplete();
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetConfig.java`
#### Snippet
```java
  public String configSheet() {
    sheetConfigPopup = true;
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/AttributeController.java`
#### Snippet
```java
  public String reload() {
    counter++;
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/WebSocketController.java`
#### Snippet
```java
      scheduledExecutorService.shutdown();
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/WebSocketController.java`
#### Snippet
```java
      }
    }, 0, 17, TimeUnit.MILLISECONDS);
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem valueOf(final JustifyContent justifyContent) {
    if (justifyContent == null) {
      return null;
    } else {
      switch (justifyContent) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
        default:
          LOG.warn("Undefined justifyContent: '{}'.", justifyContent);
          return null;
      }
    }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem borderColor(final FacesMessage.Severity severity) {
    if (severity == null) {
      return null;
    }
    return getSeverityCssItem(severity, BORDER_INFO, BORDER_WARNING, BORDER_DANGER);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
    switch (segmentJustify) {
      case none:
        return null;
      case start:
        return BootstrapClass.JUSTIFY_CONTENT_START;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      default:
        LOG.warn("Not a bootstrap class defined for {}", segmentJustify);
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
        return valueOf("MX" + size + "_AUTO");
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      }
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem tooltipColor(final FacesMessage.Severity severity) {
    if (severity == null) {
      return null;
    }
    return getSeverityCssItem(severity, INFO_TOOLTIP, WARNING_TOOLTIP, ERROR_TOOLTIP);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem fontStyle(final Markup markup) {
    if (markup == null || markup.contains(Markup.NONE)) {
      return null;
    } else if (markup.contains(Markup.BOLD)) {
      return BootstrapClass.FW_BOLD;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      return BootstrapClass.FST_ITALIC;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem validationColor(final FacesMessage.Severity severity) {
    if (severity == null) {
      return null;
    }
    return getSeverityCssItem(severity, IS_INFO, IS_WARNING, IS_ERROR);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem feedbackColor(final FacesMessage.Severity severity) {
    if (severity == null) {
      return null;
    }
    return getSeverityCssItem(severity, INFO_FEEDBACK, WARNING_FEEDBACK, ERROR_FEEDBACK);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      }
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem buttonColor(final FacesMessage.Severity severity) {
    if (severity == null) {
      return null;
    }
    return getSeverityCssItem(severity, BTN_INFO, BTN_WARNING, BTN_DANGER);
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem textColor(final Markup markup) {
    if (markup == null || markup.contains(Markup.NONE)) {
      return null;
    } else if (markup.contains(Markup.PRIMARY)) {
      return BootstrapClass.TEXT_PRIMARY;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      return BootstrapClass.TEXT_DARK;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
  public static CssItem valueOf(final AlignItems alignItems) {
    if (alignItems == null) {
      return null;
    } else {
      switch (alignItems) {
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
        default:
          LOG.warn("Undefined alignItems: '{}'.", alignItems);
          return null;
      }
    }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java

    if (severity == null) {
      return null;
    } else if (severity.getOrdinal() >= SEVERITY_ERROR) {
      return ALERT_DANGER;
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/css/BootstrapClass.java`
#### Snippet
```java
      return ALERT_INFO;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/TextareaController.java`
#### Snippet
```java
  public String submit() {
    LOG.info("Submit Textarea");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetFilterController.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/Salutation.java`
#### Snippet
```java
        return "bi-gender-female";
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ExecuteController.java`
#### Snippet
```java
    LOG.info("action");
    log();
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LocaleController.java`
#### Snippet
```java
      return locale.getDisplayName(locale);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ForEachController.java`
#### Snippet
```java
    rivers.add(new River(name, length, discharge));
    resetInputFields();
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ForEachController.java`
#### Snippet
```java
        new River("Yangtze", 6300, 30166)));
    resetInputFields();
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/RoleController.java`
#### Snippet
```java
  public String refreshTime() {
    time = LocalTime.now().toString();
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
      LOG.warn("Ignoring: '{}'", clientBehavior);
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/renderkit/RendererBase.java`
#### Snippet
```java
      return currentValue;
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SheetActionController.java`
#### Snippet
```java
        "We do not delete in this demo! (object='" + solarObject.getName() + "')", null));

    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CurrentValueController.java`
#### Snippet
```java
  public LocalDate plus50(final LocalDate base) {
    if (date == null) {
      return null;
    } else {
      return date.plusYears(50);
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/CurrentValueController.java`
#### Snippet
```java

  public String toUpperCase(final String text) {
    return text != null ? text.toUpperCase() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/UploadController.java`
#### Snippet
```java
  public String uploadContentType() {
    upload(fileContentType, "uploadContentType");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/UploadController.java`
#### Snippet
```java
  public String uploadBasic() {
    upload(fileBasic, "uploadBasic");
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/UploadController.java`
#### Snippet
```java
      upload(part, "uploadMulti");
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/NavigationTree.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java
      return ((ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext()).getServerInfo();
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java

  public String getJsfVersion() {
    return enabled ? FacesContext.class.getPackage().getImplementationVersion() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java

  public String getJsfTitle() {
    return enabled ? FacesContext.class.getPackage().getImplementationTitle() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java

  public String getCdiVersion() {
    return enabled ? NormalScope.class.getPackage().getImplementationVersion() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java

  public String getCdiTitle() {
    return enabled ? NormalScope.class.getPackage().getImplementationTitle() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java

  public List<Map.Entry<Object, Object>> getSystemPropertiesAsList() {
    return enabled ? new ArrayList<>(getSystemProperties().entrySet()) : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/ServerInfo.java`
#### Snippet
```java

  public Properties getSystemProperties() {
    return enabled ? System.getProperties() : null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/SourceFileReader.java`
#### Snippet
```java
      LOG.error("", e);
    }
    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/LoggingController.java`
#### Snippet
```java
    log4j2.reset(testCategory);
    commonsLogging.reset(testCategory);
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/bestpractice/TransitionController.java`
#### Snippet
```java
    Thread.sleep(sleep);

    return null;
  }
}
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/bestpractice/ToolBarCustomizer.java`
#### Snippet
```java
    ));

    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
        return BootstrapClass.MS_AUTO;
      default:
        return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-core/src/main/java/org/apache/myfaces/tobago/internal/renderkit/renderer/SheetRenderer.java`
#### Snippet
```java
      return (AjaxBehavior) reload.get(0);
    } else {
      return null;
    }
  }
```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/bestpractice/BestPracticeController.java`
#### Snippet
```java
    }
    facesContext.responseComplete();
    return null;
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/nonfacesrequest/FishPond.java`
#### Snippet
```java
    LOG.info("select via random: '" + getSelectedFish() + "'");

    return null; // is AJAX
  }

```

### ReturnNull
Return of `null`
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/AstroData.java`
#### Snippet
```java
  public String namesFromArray(SolarObject[] objects) {
    if (objects == null) {
      return null;
    } else {
      StringBuilder builder = new StringBuilder();
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

## RuleId[id=WaitNotInLoop]
### WaitNotInLoop
Call to `wait()` is not in loop
in `tobago-example/tobago-example-demo/src/main/java/org/apache/myfaces/tobago/example/demo/PartialReloadController.java`
#### Snippet
```java
    synchronized (this) {
      try {
        wait(delay);
      } catch (final InterruptedException e) {
        //
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

## RuleId[id=CastCanBeRemovedNarrowingVariableType]
### CastCanBeRemovedNarrowingVariableType
Cast may be removed by changing the type of 'o' to 'String'
in `tobago-core/src/main/java/org/apache/myfaces/tobago/util/ComponentUtils.java`
#### Snippet
```java
  public static boolean isFacetOf(final UIComponent component, final UIComponent parent) {
    for (final Object o : parent.getFacets().keySet()) {
      final UIComponent facet = parent.getFacet((String) o);
      if (component.equals(facet)) {
        return true;
```

