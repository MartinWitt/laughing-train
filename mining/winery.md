# winery 
 
# Bad smells
I found 1976 bad smells with 287 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| FieldMayBeFinal | 349 | false |
| UnnecessaryModifier | 219 | true |
| DataFlowIssue | 157 | false |
| Deprecation | 148 | false |
| UNCHECKED_WARNING | 93 | false |
| NullableProblems | 91 | false |
| FieldCanBeLocal | 91 | false |
| JavadocLinkAsPlainText | 77 | false |
| ConstantValue | 76 | false |
| SimplifyStreamApiCallChains | 64 | false |
| DuplicatedCode | 48 | false |
| AutoCloseableResource | 43 | false |
| UnusedAssignment | 41 | false |
| OptionalGetWithoutIsPresent | 39 | false |
| NotNullFieldNotInitialized | 33 | false |
| DeprecatedIsStillUsed | 26 | false |
| UnnecessaryToStringCall | 25 | true |
| UnnecessaryUnicodeEscape | 20 | false |
| UnnecessaryLocalVariable | 19 | true |
| RedundantMethodOverride | 16 | false |
| SimplifyOptionalCallChains | 16 | false |
| UnstableApiUsage | 16 | false |
| CommentedOutCode | 13 | false |
| WrapperTypeMayBePrimitive | 12 | false |
| IgnoreResultOfCall | 12 | false |
| ArraysAsListWithZeroOrOneArgument | 12 | false |
| JavadocDeclaration | 11 | false |
| RedundantCast | 11 | false |
| RedundantOperationOnEmptyContainer | 10 | false |
| EmptyStatementBody | 9 | false |
| WebProperties | 9 | false |
| CharsetObjectCanBeUsed | 9 | false |
| PointlessBooleanExpression | 9 | true |
| RegExpRedundantEscape | 7 | false |
| MismatchedCollectionQueryUpdate | 7 | false |
| DanglingJavadoc | 7 | false |
| DefaultAnnotationParam | 6 | false |
| JavadocReference | 6 | false |
| UnnecessarySemicolon | 6 | false |
| MissingSerialAnnotation | 6 | false |
| UnnecessaryReturn | 5 | true |
| SlowListContainsAll | 5 | false |
| OptionalIsPresent | 5 | false |
| StringOperationCanBeSimplified | 5 | false |
| SwitchStatementWithTooFewBranches | 5 | false |
| SuspiciousMethodCalls | 5 | false |
| RegExpDuplicateCharacterInClass | 4 | false |
| StringConcatenationInLoops | 4 | false |
| PlaceholderCountMatchesArgumentCount | 4 | false |
| ProtectedMemberInFinalClass | 4 | true |
| StringConcatenationInsideStringBufferAppend | 3 | false |
| InnerClassMayBeStatic | 3 | true |
| ExcessiveRangeCheck | 3 | false |
| MarkedForRemoval | 2 | false |
| DuplicateBranchesInSwitch | 2 | false |
| SimplifiableConditionalExpression | 2 | false |
| EqualsBetweenInconvertibleTypes | 2 | false |
| DuplicateCondition | 2 | false |
| SimplifiableBooleanExpression | 2 | false |
| DuplicateThrows | 2 | false |
| TypeParameterExtendsObject | 2 | false |
| SuspiciousNameCombination | 2 | false |
| ComparatorResultComparison | 2 | false |
| TrivialIf | 2 | false |
| OptionalUsedAsFieldOrParameterType | 2 | false |
| UseBulkOperation | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| CStyleArrayDeclaration | 1 | false |
| UnparsedCustomBeanInspection | 1 | false |
| RegExpRedundantClassElement | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| SuspiciousListRemoveInLoop | 1 | false |
| SillyAssignment | 1 | false |
| ThrowFromFinallyBlock | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| ConfusingMainMethod | 1 | false |
| InfiniteRecursion | 1 | false |
| ReplaceInefficientStreamCount | 1 | false |
| ParameterCanBeLocal | 1 | false |
| SpringXmlModelInspection | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| ObviousNullCheck | 1 | false |
| RedundantCollectionOperation | 1 | false |
| MismatchedJavadocCode | 1 | false |
| CatchMayIgnoreException | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| UnusedLabel | 1 | true |
| SynchronizeOnNonFinalField | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| EqualsHashCodeCalledOnUrl | 1 | false |
| ComparatorMethodParameterNotUsed | 1 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[filePatternsToCommit.size()\]'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
                filePatternsToCommit.add(Util.getPathInsideRepo(componentToCommit));

                gitRepo.addCommit(filePatternsToCommit.toArray(new String[filePatternsToCommit.size()]), commitMessagePrefix + " " + componentToCommit.getQName());
            }
        } else {
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefPackage.java`
#### Snippet
```java
     */
    public boolean addProperty(String propertyName, String propertyValue) {
        Boolean propertyAdded = false;

        switch (propertyName) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        List<String> argumentList;
        List<String> callArguments = null;
        Boolean exprResult = false;

        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        List<String> argumentList;
        List<String> callArguments = null;
        Boolean exprResult = false;

        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String firstArgument;
        String secondArgument;
        Boolean exprResult;
        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        List<String> firstArgList;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String firstArgument;
        String secondArgument;
        Boolean exprResult;
        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        List<String> firstArgList;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String firstArgument;
        String secondArgument;
        Boolean exprResult;
        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        List<String> firstArgList;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String firstArgument;
        String secondArgument;
        Boolean exprResult;
        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        List<String> firstArgList;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String firstArgument;
        String secondArgument;
        Boolean exprResult;
        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        List<String> firstArgList;
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
        List<String> attributeValue = new ArrayList();
        String literal = ctx.getChild(0).getText();
        Integer stringLength = literal.length();
        literal = literal.substring(1, stringLength - 1);
        if (ChefDslHelper.hasChefAttributeInString(literal)) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
        List<String> whenArgs = new ArrayList<>();

        Boolean elseActive = false;

        caseConditionVisitor = new CaseConditionVisitor(extractedCookbookConfigs);
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java
        List<ChefCookbookConfiguration> processedCookbookConfigs = new LinkedList<>();

        Boolean elseActive = false;

        for (int countConfigs = 0; countConfigs < parseResultList.size(); countConfigs++) {
```

### WrapperTypeMayBePrimitive
Type may be primitive
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java
        List<ChefCookbookConfiguration> processedCookbookConfigs = new LinkedList<>();

        Boolean elseActive = false;

        for (int countConfigs = 0; countConfigs < parseResultList.size(); countConfigs++) {
```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `static` is redundant for inner enums
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jaxbsupport/map/BooleanToYesNo.java`
#### Snippet
```java
    @XmlEnum()
    @XmlType(name = "yesNo", namespace = Namespaces.TOSCA_NAMESPACE)
    public static enum YesNo {
        @XmlEnumValue("yes")
        YES,
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/converter/Converter.java`
#### Snippet
```java
    public abstract BoundType unmarshal(ValueType v);

    public abstract ValueType marshal(BoundType v);

}
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/converter/Converter.java`
#### Snippet
```java
    public abstract BoundType unmarshal(ValueType v);

    public abstract ValueType marshal(BoundType v);

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/converter/Converter.java`
#### Snippet
```java
public interface Converter<ValueType, BoundType> {

    public abstract BoundType unmarshal(ValueType v);

    public abstract ValueType marshal(BoundType v);
```

### UnnecessaryModifier
Modifier `abstract` is redundant for interface methods
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/converter/Converter.java`
#### Snippet
```java
public interface Converter<ValueType, BoundType> {

    public abstract BoundType unmarshal(ValueType v);

    public abstract ValueType marshal(BoundType v);
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/SolutionStrategy.java`
#### Snippet
```java
     * @return A boolean whether the solution was successfully applied.
     */
    public boolean applySolution(TTopologyTemplate topology, SolutionInputData inputData);
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_START_EVENT = "StartEvent";

	public static final String NODE_TYPE_END_EVENT = "EndEvent";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_START_EVENT = "StartEvent";

	public static final String NODE_TYPE_END_EVENT = "EndEvent";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_START_EVENT = "StartEvent";

	public static final String NODE_TYPE_END_EVENT = "EndEvent";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_MGMT_TASK = "ToscaNodeManagementTask";

	public static final String NODE_TYPE_START_EVENT = "StartEvent";

	public static final String NODE_TYPE_END_EVENT = "EndEvent";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_MGMT_TASK = "ToscaNodeManagementTask";

	public static final String NODE_TYPE_START_EVENT = "StartEvent";

	public static final String NODE_TYPE_END_EVENT = "EndEvent";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_MGMT_TASK = "ToscaNodeManagementTask";

	public static final String NODE_TYPE_START_EVENT = "StartEvent";

	public static final String NODE_TYPE_END_EVENT = "EndEvent";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONNECTIONS = "connections";

	public static final String CONDITIONS = "conditions";

	public static final String CONDITION = "condition";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONNECTIONS = "connections";

	public static final String CONDITIONS = "conditions";

	public static final String CONDITION = "condition";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONNECTIONS = "connections";

	public static final String CONDITIONS = "conditions";

	public static final String CONDITION = "condition";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String INPUT = "input";

	public static final String OUTPUT = "output";

	public static final String VALUE = "value";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String INPUT = "input";

	public static final String OUTPUT = "output";

	public static final String VALUE = "value";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String INPUT = "input";

	public static final String OUTPUT = "output";

	public static final String VALUE = "value";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String ID = "id";

	public static final String TYPE = "type";

	public static final String INPUT = "input";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String ID = "id";

	public static final String TYPE = "type";

	public static final String INPUT = "input";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String ID = "id";

	public static final String TYPE = "type";

	public static final String INPUT = "input";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String VALUE = "value";

	public static final String NODE_TEMPLATE = "node_template";

	public static final String NODE_OPERATION = "node_operation";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String VALUE = "value";

	public static final String NODE_TEMPLATE = "node_template";

	public static final String NODE_OPERATION = "node_operation";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String VALUE = "value";

	public static final String NODE_TEMPLATE = "node_template";

	public static final String NODE_OPERATION = "node_operation";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_STRING = "string";

	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";

	public static final String PARAM_TYPE_VALUE_PLAN = "plan";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_STRING = "string";

	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";

	public static final String PARAM_TYPE_VALUE_PLAN = "plan";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_STRING = "string";

	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";

	public static final String PARAM_TYPE_VALUE_PLAN = "plan";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 */

	public static final String NAME = "name";

	public static final String ID = "id";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 */

	public static final String NAME = "name";

	public static final String ID = "id";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 */

	public static final String NAME = "name";

	public static final String ID = "id";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TEMPLATE = "node_template";

	public static final String NODE_OPERATION = "node_operation";

	public static final String NODE_INTERFACE_NAME = "interface";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TEMPLATE = "node_template";

	public static final String NODE_OPERATION = "node_operation";

	public static final String NODE_INTERFACE_NAME = "interface";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TEMPLATE = "node_template";

	public static final String NODE_OPERATION = "node_operation";

	public static final String NODE_INTERFACE_NAME = "interface";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 * Parameter Types
	 */
	public static final String PARAM_TYPE_VALUE_STRING = "string";

	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 * Parameter Types
	 */
	public static final String PARAM_TYPE_VALUE_STRING = "string";

	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 * Parameter Types
	 */
	public static final String PARAM_TYPE_VALUE_STRING = "string";

	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_OPERATION = "node_operation";

	public static final String NODE_INTERFACE_NAME = "interface";

	public static final String CONNECTIONS = "connections";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_OPERATION = "node_operation";

	public static final String NODE_INTERFACE_NAME = "interface";

	public static final String CONNECTIONS = "connections";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_OPERATION = "node_operation";

	public static final String NODE_INTERFACE_NAME = "interface";

	public static final String CONNECTIONS = "connections";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";

	public static final String PARAM_TYPE_VALUE_DA = "deployment_artifact";

}
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";

	public static final String PARAM_TYPE_VALUE_DA = "deployment_artifact";

}
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";

	public static final String PARAM_TYPE_VALUE_DA = "deployment_artifact";

}
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_END_EVENT = "EndEvent";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE_END = "ExclusiveGatewayEnd";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_END_EVENT = "EndEvent";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE_END = "ExclusiveGatewayEnd";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_END_EVENT = "EndEvent";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE_END = "ExclusiveGatewayEnd";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONDITION = "condition";

	public static final String DEFAULT = "default";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONDITION = "condition";

	public static final String DEFAULT = "default";


```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONDITION = "condition";

	public static final String DEFAULT = "default";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";

	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";

	public static final String PARAM_TYPE_VALUE_DA = "deployment_artifact";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";

	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";

	public static final String PARAM_TYPE_VALUE_DA = "deployment_artifact";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";

	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";

	public static final String PARAM_TYPE_VALUE_DA = "deployment_artifact";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String TYPE = "type";

	public static final String INPUT = "input";

	public static final String OUTPUT = "output";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String TYPE = "type";

	public static final String INPUT = "input";

	public static final String OUTPUT = "output";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String TYPE = "type";

	public static final String INPUT = "input";

	public static final String OUTPUT = "output";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_PLAN = "plan";

	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";

	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_PLAN = "plan";

	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";

	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_PLAN = "plan";

	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";

	public static final String PARAM_TYPE_VALUE_IA = "implementation_artifact";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_INTERFACE_NAME = "interface";

	public static final String CONNECTIONS = "connections";

	public static final String CONDITIONS = "conditions";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_INTERFACE_NAME = "interface";

	public static final String CONNECTIONS = "connections";

	public static final String CONDITIONS = "conditions";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_INTERFACE_NAME = "interface";

	public static final String CONNECTIONS = "connections";

	public static final String CONDITIONS = "conditions";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";

	public static final String PARAM_TYPE_VALUE_PLAN = "plan";

	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";

	public static final String PARAM_TYPE_VALUE_PLAN = "plan";

	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String PARAM_TYPE_VALUE_TOPOLOGY = "topology";

	public static final String PARAM_TYPE_VALUE_PLAN = "plan";

	public static final String PARAM_TYPE_VALUE_CONCAT = "concat";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 *
	 */
	public static final String NODE_TYPE_MGMT_TASK = "ToscaNodeManagementTask";

	public static final String NODE_TYPE_START_EVENT = "StartEvent";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 *
	 */
	public static final String NODE_TYPE_MGMT_TASK = "ToscaNodeManagementTask";

	public static final String NODE_TYPE_START_EVENT = "StartEvent";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	 *
	 */
	public static final String NODE_TYPE_MGMT_TASK = "ToscaNodeManagementTask";

	public static final String NODE_TYPE_START_EVENT = "StartEvent";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NAME = "name";

	public static final String ID = "id";

	public static final String TYPE = "type";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NAME = "name";

	public static final String ID = "id";

	public static final String TYPE = "type";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NAME = "name";

	public static final String ID = "id";

	public static final String TYPE = "type";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE_END = "ExclusiveGatewayEnd";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE_END = "ExclusiveGatewayEnd";


```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE = "ExclusiveGateway";

	public static final String NODE_TYPE_GATEWAY_EXCLUSIVE_END = "ExclusiveGatewayEnd";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String OUTPUT = "output";

	public static final String VALUE = "value";

	public static final String NODE_TEMPLATE = "node_template";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String OUTPUT = "output";

	public static final String VALUE = "value";

	public static final String NODE_TEMPLATE = "node_template";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String OUTPUT = "output";

	public static final String VALUE = "value";

	public static final String NODE_TEMPLATE = "node_template";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONDITIONS = "conditions";

	public static final String CONDITION = "condition";

	public static final String DEFAULT = "default";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONDITIONS = "conditions";

	public static final String CONDITION = "condition";

	public static final String DEFAULT = "default";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/JsonKeys.java`
#### Snippet
```java
	public static final String CONDITIONS = "conditions";

	public static final String CONDITION = "condition";

	public static final String DEFAULT = "default";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/MngmtActivityTemplatePlaceholders.java`
#### Snippet
```java
	public static final String SCOPE_NAME = "mngmt_scope_name";

	public static final String SEQUENCE_NAME = "mngmt_scope_seq_name";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/MngmtActivityTemplatePlaceholders.java`
#### Snippet
```java
	public static final String SCOPE_NAME = "mngmt_scope_name";

	public static final String SEQUENCE_NAME = "mngmt_scope_seq_name";


```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/MngmtActivityTemplatePlaceholders.java`
#### Snippet
```java
	public static final String SCOPE_NAME = "mngmt_scope_name";

	public static final String SEQUENCE_NAME = "mngmt_scope_seq_name";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/MngmtActivityTemplatePlaceholders.java`
#### Snippet
```java
public interface MngmtActivityTemplatePlaceholders {

	public static final String SCOPE_NAME = "mngmt_scope_name";

	public static final String SEQUENCE_NAME = "mngmt_scope_seq_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/MngmtActivityTemplatePlaceholders.java`
#### Snippet
```java
public interface MngmtActivityTemplatePlaceholders {

	public static final String SCOPE_NAME = "mngmt_scope_name";

	public static final String SEQUENCE_NAME = "mngmt_scope_seq_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/MngmtActivityTemplatePlaceholders.java`
#### Snippet
```java
public interface MngmtActivityTemplatePlaceholders {

	public static final String SCOPE_NAME = "mngmt_scope_name";

	public static final String SEQUENCE_NAME = "mngmt_scope_seq_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/ActivityPlaceholder.java`
#### Snippet
```java
public interface ActivityPlaceholder {

	public static final String NAME = "activity_name";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/ActivityPlaceholder.java`
#### Snippet
```java
public interface ActivityPlaceholder {

	public static final String NAME = "activity_name";


```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/ActivityPlaceholder.java`
#### Snippet
```java
public interface ActivityPlaceholder {

	public static final String NAME = "activity_name";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";

	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";

	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";

	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String VALIDATE = "validate";

	public static final String FROM_SPEC_PART = "fromPart";

	public static final String FROM_SPEC_VARIABLE = "fromVariable";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_NAMESPACE = "plan_namespace";

	public static final String PLAN_NAME = "plan_name";

	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String VALIDATE = "validate";

	public static final String FROM_SPEC_PART = "fromPart";

	public static final String FROM_SPEC_VARIABLE = "fromVariable";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_NAMESPACE = "plan_namespace";

	public static final String PLAN_NAME = "plan_name";

	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String VALIDATE = "validate";

	public static final String FROM_SPEC_PART = "fromPart";

	public static final String FROM_SPEC_VARIABLE = "fromVariable";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_NAMESPACE = "plan_namespace";

	public static final String PLAN_NAME = "plan_name";

	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
public interface AssignFromVarQuery2Var extends ActivityPlaceholder {

	public static final String VALIDATE = "validate";

	public static final String FROM_SPEC_PART = "fromPart";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";

	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";

	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
public interface AssignFromVarQuery2Var extends ActivityPlaceholder {

	public static final String VALIDATE = "validate";

	public static final String FROM_SPEC_PART = "fromPart";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";

	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";

	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
public interface AssignFromVarQuery2Var extends ActivityPlaceholder {

	public static final String VALIDATE = "validate";

	public static final String FROM_SPEC_PART = "fromPart";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";

	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";

	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_QUERY = "fromQuery";

	public static final String TO_SPEC_VARIABLE = "toVariable";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";

	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";

	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_QUERY = "fromQuery";

	public static final String TO_SPEC_VARIABLE = "toVariable";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";

	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";

	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_QUERY = "fromQuery";

	public static final String TO_SPEC_VARIABLE = "toVariable";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";

	public static final String FROM_SPEC_QUERY = "fromQuery";

	public static final String TO_SPEC_VARIABLE = "toVariable";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";

	public static final String FROM_SPEC_QUERY = "fromQuery";

	public static final String TO_SPEC_VARIABLE = "toVariable";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";

	public static final String FROM_SPEC_QUERY = "fromQuery";

	public static final String TO_SPEC_VARIABLE = "toVariable";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_PART = "fromPart";

	public static final String FROM_SPEC_VARIABLE = "fromVariable";

	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";

	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";

	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";

	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";

	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";

	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_NAME = "plan_name";

	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";

	public static final String PLT_CLIENT_NAME = "plt_client_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_NAME = "plan_name";

	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";

	public static final String PLT_CLIENT_NAME = "plt_client_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_NAME = "plan_name";

	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";

	public static final String PLT_CLIENT_NAME = "plt_client_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker_xsd";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker_xsd";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker_xsd";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";

	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";

	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";

	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";

	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";

	public static final String PLAN_END_INV_NAME = "plan_end_inv_name";

	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";

	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";

	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";

	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";

	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";

	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";

	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";

	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";

	public static final String PLAN_INIT_RCV_NAME = "plan_init_rcv_name";

	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLT_CLIENT_NAME = "plt_client_name";

	public static final String PL_CLIENT_NAME = "pl_client_name";

	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLT_CLIENT_NAME = "plt_client_name";

	public static final String PL_CLIENT_NAME = "pl_client_name";

	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_PART = "fromPart";

	public static final String FROM_SPEC_VARIABLE = "fromVariable";

	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLT_CLIENT_NAME = "plt_client_name";

	public static final String PL_CLIENT_NAME = "pl_client_name";

	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";

	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_PART = "fromPart";

	public static final String FROM_SPEC_VARIABLE = "fromVariable";

	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";

	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_VARIABLE = "fromVariable";

	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";

	public static final String FROM_SPEC_QUERY = "fromQuery";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_OPERATION = "plan_init_rcv_operation";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";

	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_VARIABLE = "fromVariable";

	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";

	public static final String FROM_SPEC_QUERY = "fromQuery";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_NAME = "pl_client_name";

	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";

	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_NAME = "pl_client_name";

	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";

	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/AssignFromVarQuery2Var.java`
#### Snippet
```java
	public static final String FROM_SPEC_VARIABLE = "fromVariable";

	public static final String FROM_SPEC_QUERY_LANG = "fromQueryLang";

	public static final String FROM_SPEC_QUERY = "fromQuery";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_NAME = "pl_client_name";

	public static final String PL_CLIENT_MY_ROLE = "pl_client_pl_myrole_name";

	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";

	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";

	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_END_INV_OPERATION = "plan_end_inv_operation";

	public static final String PLAN_END_INV_PORT_TYPE = "plan_end_inv_callback_pt";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";

	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";

	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_PORT_TYPE = "plan_init_rcv_pt";

	public static final String PLAN_OUTPUT_VAR_NAME = "plan_output_var_name";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "plan_output_var_msg_type";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";

	public static final String PLT_CLIENT_NAME = "plt_client_name";

	public static final String PL_CLIENT_NAME = "pl_client_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";

	public static final String PLT_CLIENT_NAME = "plt_client_name";

	public static final String PL_CLIENT_NAME = "pl_client_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PLAN_WSDL_NAME = "plan_wsdl_name";

	public static final String PLT_CLIENT_NAME = "plt_client_name";

	public static final String PL_CLIENT_NAME = "pl_client_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";

	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";

	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String PL_CLIENT_PARTNER_ROLE = "pl_client_partnerrole_name";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "plan_input_var_msg_type";

	public static final String PLAN_INPUT_VAR_NAME = "plan_input_var_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker_xsd";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker_xsd";


```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
	public static final String SERVICE_INVOKER_WSDL = "service_invoker_wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker_xsd";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
public interface PlanTemplatePlaceholders {

	public static final String PLAN_NAMESPACE = "plan_namespace";

	public static final String PLAN_NAME = "plan_name";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
public interface PlanTemplatePlaceholders {

	public static final String PLAN_NAMESPACE = "plan_namespace";

	public static final String PLAN_NAME = "plan_name";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/placeholders/PlanTemplatePlaceholders.java`
#### Snippet
```java
public interface PlanTemplatePlaceholders {

	public static final String PLAN_NAMESPACE = "plan_namespace";

	public static final String PLAN_NAME = "plan_name";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";

	public static final String PLAN_INPUT_VAR_NAME = "input";

	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";

	public static final String PLAN_INPUT_VAR_NAME = "input";

	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";

	public static final String PLAN_INPUT_VAR_NAME = "input";

	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";

	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";

	public static final String PL_CLIENT_NAME = "client";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";

	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";

	public static final String PL_CLIENT_NAME = "client";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";

	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";

	public static final String PL_CLIENT_NAME = "client";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
public interface TemplateDefaultValues {

	public static final String PLAN_NAMESPACE = "http://iaas.uni-stuttgart.de/bpmn4tosca";

	public static final String PLAN_NAME = "ManagementPlan";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
public interface TemplateDefaultValues {

	public static final String PLAN_NAMESPACE = "http://iaas.uni-stuttgart.de/bpmn4tosca";

	public static final String PLAN_NAME = "ManagementPlan";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
public interface TemplateDefaultValues {

	public static final String PLAN_NAMESPACE = "http://iaas.uni-stuttgart.de/bpmn4tosca";

	public static final String PLAN_NAME = "ManagementPlan";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_NAME = "client";

	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";

	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_NAME = "client";

	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";

	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_NAME = "client";

	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";

	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";

	public static final String PL_CLIENT_NAME = "client";

	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";

	public static final String PL_CLIENT_NAME = "client";

	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";

	public static final String PL_CLIENT_NAME = "client";

	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker.xsd";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker.xsd";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker.xsd";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";

	public static final String PLAN_END_INV_NAME = "callbackClient";

	public static final String PLAN_END_INV_OPERATION = "onResult";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";

	public static final String PLAN_END_INV_NAME = "callbackClient";

	public static final String PLAN_END_INV_OPERATION = "onResult";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";

	public static final String PLAN_END_INV_NAME = "callbackClient";

	public static final String PLAN_END_INV_OPERATION = "onResult";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";

	public static final String PLAN_OUTPUT_VAR_NAME = "output";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";

	public static final String PLAN_OUTPUT_VAR_NAME = "output";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";

	public static final String PLAN_OUTPUT_VAR_NAME = "output";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker.xsd";


```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker.xsd";


```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";

	public static final String SERVICE_INVOKER_XSD = "service_invoker.xsd";


```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_OPERATION = "initiate";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";

	public static final String PLAN_OUTPUT_VAR_NAME = "output";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_OPERATION = "initiate";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";

	public static final String PLAN_OUTPUT_VAR_NAME = "output";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_OPERATION = "initiate";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";

	public static final String PLAN_OUTPUT_VAR_NAME = "output";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_NAME = "callbackClient";

	public static final String PLAN_END_INV_OPERATION = "onResult";

	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_NAME = "callbackClient";

	public static final String PLAN_END_INV_OPERATION = "onResult";

	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_NAME = "callbackClient";

	public static final String PLAN_END_INV_OPERATION = "onResult";

	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";

	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";

	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_MY_ROLE = "PlanProvider";

	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_NAME = "output";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";

	public static final String PLAN_END_INV_NAME = "callbackClient";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_NAME = "output";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";

	public static final String PLAN_END_INV_NAME = "callbackClient";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_OUTPUT_VAR_NAME = "output";

	public static final String PLAN_OUTPUT_VAR_MSG_TYPE = "tns:PlanResponseMessage";

	public static final String PLAN_END_INV_NAME = "callbackClient";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_NAME = "ManagementPlan";

	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";

	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_NAME = "ManagementPlan";

	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";

	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_NAME = "ManagementPlan";

	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";

	public static final String PLT_CLIENT_NAME = "tns:PLT_ManagementPlan";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_NAME = "input";

	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";

	public static final String PLAN_INIT_RCV_OPERATION = "initiate";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_NAME = "input";

	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";

	public static final String PLAN_INIT_RCV_OPERATION = "initiate";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INPUT_VAR_NAME = "input";

	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";

	public static final String PLAN_INIT_RCV_OPERATION = "initiate";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_NAMESPACE = "http://iaas.uni-stuttgart.de/bpmn4tosca";

	public static final String PLAN_NAME = "ManagementPlan";

	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_NAMESPACE = "http://iaas.uni-stuttgart.de/bpmn4tosca";

	public static final String PLAN_NAME = "ManagementPlan";

	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_NAMESPACE = "http://iaas.uni-stuttgart.de/bpmn4tosca";

	public static final String PLAN_NAME = "ManagementPlan";

	public static final String PLAN_WSDL_NAME = "managementplan.wsdl";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_OPERATION = "onResult";

	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_OPERATION = "onResult";

	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_END_INV_OPERATION = "onResult";

	public static final String PLAN_END_INV_PORT_TYPE = "tns:ManagementPlanCallbackPT";

	public static final String SERVICE_INVOKER_WSDL = "service_invoker.wsdl";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";

	public static final String PLAN_INPUT_VAR_NAME = "input";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";

	public static final String PLAN_INPUT_VAR_NAME = "input";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PL_CLIENT_PARTNER_ROLE = "PlanRequester";

	public static final String PLAN_INPUT_VAR_MSG_TYPE = "tns:PlanRequestMessage";

	public static final String PLAN_INPUT_VAR_NAME = "input";
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";

	public static final String PLAN_INIT_RCV_OPERATION = "initiate";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";
```

### UnnecessaryModifier
Modifier `static` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";

	public static final String PLAN_INIT_RCV_OPERATION = "initiate";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";
```

### UnnecessaryModifier
Modifier `final` is redundant for interface fields
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/TemplateDefaultValues.java`
#### Snippet
```java
	public static final String PLAN_INIT_RCV_NAME = "initiatePlan";

	public static final String PLAN_INIT_RCV_OPERATION = "initiate";

	public static final String PLAN_INIT_RCV_PORT_TYPE = "tns:ManagementPlanPT";
```

## RuleId[id=MarkedForRemoval]
### MarkedForRemoval
'Double(java.lang.String)' is deprecated and marked for removal
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java
        }
        List<TTopologyTemplate> approxFragments = new ArrayList<>();
        double property = new Double(policyWrapper.getProperty().toString());
        double difference = Double.MAX_VALUE;

```

### MarkedForRemoval
'Double(java.lang.String)' is deprecated and marked for removal
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java
            for (PolicyWrapper policyOfFragment : fragmentWithPolicies.policies) {
                if (policyOfFragment.equals(policyWrapper)) {
                    double otherProperty = new Double(policyOfFragment.getProperty().toString());
                    double newDifference = Math.abs(otherProperty - property);

```

## RuleId[id=EmptyStatementBody]
### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTEntityTemplate.java`
#### Snippet
```java
                            element.setTextContent(value);
                        }
                    } else if (item instanceof Text || item instanceof Comment) {
                        // these kinds of nodes are OK
                    } else {
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/RubyCodeHelper.java`
#### Snippet
```java
        }

        if ((previousLineIsNewLine && lineIsNewLine) || (notFirstOrLastLine && lineIsNewLine && (previousLine.startsWith(" ") || nextLine.startsWith(" ")))) {

        } else if (lineIsNewLine) {
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/CookbookParseResult.java`
#### Snippet
```java
        List<ChefCookbookConfiguration> cookbookConfigurations = new ArrayList<>();
        for (int i = 0; i < this.getAllConfigsAsList().size(); i++) {
            if (this.getAllConfigsAsList().get(i).getDependentRecipes(cookbookName) == null) {
                //this.getAllConfigsAsList().remove(i);
            } else {
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java

        if (callArgs != null && callArgs.size() == 1) {
            if (ChefDslHelper.hasChefAttributeInString(ctx.call_args().getText())) {
                // resolve
            }
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java

                // END: generate TOSCA conforming PropertiesDefinition
            } else {
                // otherwise WPD exists, but is derived from XSD
                // we DO NOT have to remove the winery properties definition from the output to allow "debugging" of the CSAR
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        for (Map.Entry<String, YTInterfaceDefinition> node : nodes.entrySet()) {
            // FIXME Fix interface conversion!?
            if (type == null && node.getValue().getType() == null) {
                //output.add(convert(node.getValue(), node.getKey()));
            } else if (type != null && node.getValue().getType() != null) {
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                //output.add(convert(node.getValue(), node.getKey()));
            } else if (type != null && node.getValue().getType() != null) {
                if (node.getValue().getType().getLocalPart().equalsIgnoreCase(type)) {
                    //output.add(convert(node.getValue(), node.getKey()));
                }
```

### EmptyStatementBody
`if` statement has empty body
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
        clientConfig.register(MultiPartFeature.class);

        if (useProxy) {
            // todo
        }
```

### EmptyStatementBody
`else` statement has empty body
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/Bpmn4JsonParser.java`
#### Snippet
```java
                if (connectionEntry.isTextual()) {
                    linkTargetIds.add(connectionEntry.asText());
                } else {
                    // TODO warn
                }
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `files`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawledCookbooks.java`
#### Snippet
```java
            }

            String files[] = sourceFolder.list();

            for (String file : files) {
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (12 lines)
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInterfaceType.java`
#### Snippet
```java
    }

    /*@NonNull
    public Map<String, TPropertyDefinition> getInputs() {
        if (this.inputs == null) {
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/YamlRepository.java`
#### Snippet
```java
        //ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            //IOUtils.copy(inputStream, outputStream);
            //Definitions definitions = readInputStream(new ByteArrayInputStream(outputStream.toByteArray()));
            TDefinitions definitions = (TDefinitions) JAXBSupport.createUnmarshaller().unmarshal(inputStream);
```

### CommentedOutCode
Commented out code (4 lines)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java

            if (gitRepo.hasChangesInFile(componentToCommit)) {
                /*WineryVersion predecessor = BackendUtils.getPredecessor(componentToCommit);
                ToscaDiff diff = BackendUtils.compare(componentToCommit, predecessor);
                String changeLog = diff.getChangeLog();
```

### CommentedOutCode
Commented out code (3 lines)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        }

//        if (!node.getProperties().isEmpty()) {
//            builder.addAny(convertWineryPropertiesDefinition(node.getProperties(), builder.build().getTargetNamespace(), builder.build().getIdFromIdOrNameField()));
//        }
```

### CommentedOutCode
Commented out code (7 lines)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/consistencycheck/ConsistencyChecker.java`
#### Snippet
```java
    private void checkPlainConformance(DefinitionsChildId id, Path tempCsar) {
        // TODO implement according to https://winery.github.io/test-repository/plain
        /*if (id.getNamespace().getDecoded().startsWith("http://plain.winery.opentosca.org/")) {
            if (id instanceof EntityTypeId) {
                if (id.getXmlId().getDecoded().endsWith("WithoutProperties")) {
```

### CommentedOutCode
Commented out code (8 lines)
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/yaml/YAMLParserResource.java`
#### Snippet
```java
        LOGGER.debug("File {}", fileDetail);
        // TODO
//        Converter converter = new Converter();     
//        try {
//            converter.convertY2X(uploadInputStream);
```

### CommentedOutCode
Commented out code (7 lines)
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
    public static Response getYamlOfSelectedResource(DefinitionsChildId id) {
        // TODO
//        final Converter converter = new Converter();
//        try {
//            // MimeTypes.MIMETYPE_YAML not chosen, because firefox always demands download
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/artifacttypes/ArtifactTypesResource.java`
#### Snippet
```java
    // We could do some checking for the number of ArtifactTypeResources or
    // timestamp,
    //
    // private final HashMap<String, ArtifactTypeResource> fileExtensionMapping
    // = new ArtifactTypesResource().getFileExtensionMapping();
```

### CommentedOutCode
Commented out code (10 lines)
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/artifacttypes/ArtifactTypesResource.java`
#### Snippet
```java
     * @return a mapping from file extension to artifact type resources
     */
    // public HashMap<String, ArtifactTypeResource> getFileExtensionMapping() {
    // HashMap<String, ArtifactTypeResource> res = new HashMap<String,
    // ArtifactTypeResource>();
```

### CommentedOutCode
Commented out code (11 lines)
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/artifacttemplates/ArtifactTemplateResource.java`
#### Snippet
```java

    /* not yet implemented */
	/*
	@GET
	@Produces(MediaType.APPLICATION_JSON)
```

### CommentedOutCode
Commented out code (2 lines)
in `org.eclipse.winery.highlevelrestapi/src/main/java/org/eclipse/winery/highlevelrestapi/HighLevelRestApi.java`
#### Snippet
```java

        PutMethod method = new PutMethod(uri);
        // requestPayload = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
        // requestPayload;

```

### CommentedOutCode
Commented out code (4 lines)
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
            .setArtifactRef(OpenToscaBaseTypes.abstractJava11DriverTemplate).build());

        //TArtifactTemplate subscriberDA = RepositoryFactory.getRepository().getElement(new ArtifactTemplateId(OpenToscaBaseTypes.subscriberProxyDA));
        //targetNodeProxyDAs.add(new TDeploymentArtifact
        //    .Builder(this.getUniqueDAID(targetNodeProxy, "Subscriber_DA"), subscriberDA.getType())
```

### CommentedOutCode
Commented out code (11 lines)
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/ManagementFlow.java`
#### Snippet
```java
    }

//	public void addNode(Node node) {
//		addVertex(node);
//	}
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
    private static final Pattern NCNameChar_RegExp_Pattern = Pattern.compile(Util.NCNameChar_RegExp);
```

### RegExpRedundantEscape
Redundant character escape `\.` in RegExp
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
    // \\- is required
    private static final String RANGE_NCNAME_CHAR = RestUtils.RANGE_NCNAME_START_CHAR + "\\-\\.0-9\\u00b7\\u0300-\\u036f\\u203f-\\u2040";
    private static final String REGEX_INVALID_NCNAMES_CHAR = "[^" + RestUtils.RANGE_NCNAME_CHAR + "]";

    static {
```

### RegExpRedundantEscape
Redundant character escape `\\-` in RegExp
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java

    // \\- is required
    private static final String RANGE_NCNAME_CHAR = RestUtils.RANGE_NCNAME_START_CHAR + "\\-\\.0-9\\u00b7\\u0300-\\u036f\\u203f-\\u2040";
    private static final String REGEX_INVALID_NCNAMES_CHAR = "[^" + RestUtils.RANGE_NCNAME_CHAR + "]";

```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `org.eclipse.winery.model.csar.toscametafile/src/main/java/org/eclipse/winery/model/csar/toscametafile/TOSCAMetaFileParser.java`
#### Snippet
```java
                this.logAttrMissing(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
            } else if (!contentType.trim().matches("^[-\\w\\+\\.]+/[-\\w\\+\\.]+$")) {
                this.logAttrWrongVal(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `org.eclipse.winery.model.csar.toscametafile/src/main/java/org/eclipse/winery/model/csar/toscametafile/TOSCAMetaFileParser.java`
#### Snippet
```java
                this.logAttrMissing(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
            } else if (!contentType.trim().matches("^[-\\w\\+\\.]+/[-\\w\\+\\.]+$")) {
                this.logAttrWrongVal(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
```

### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `org.eclipse.winery.model.csar.toscametafile/src/main/java/org/eclipse/winery/model/csar/toscametafile/TOSCAMetaFileParser.java`
#### Snippet
```java
                this.logAttrMissing(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
            } else if (!contentType.trim().matches("^[-\\w\\+\\.]+/[-\\w\\+\\.]+$")) {
                this.logAttrWrongVal(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
```

### RegExpRedundantEscape
Redundant character escape `\\.` in RegExp
in `org.eclipse.winery.model.csar.toscametafile/src/main/java/org/eclipse/winery/model/csar/toscametafile/TOSCAMetaFileParser.java`
#### Snippet
```java
                this.logAttrMissing(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
            } else if (!contentType.trim().matches("^[-\\w\\+\\.]+/[-\\w\\+\\.]+$")) {
                this.logAttrWrongVal(TOSCAMetaFileAttributes.CONTENT_TYPE, blockNr);
                numErrors++;
```

## RuleId[id=UnparsedCustomBeanInspection]
### UnparsedCustomBeanInspection
Unsupported tag 'endpoint' for namespace 'http://cxf.apache.org/jaxws', please file issue (Help\|Submit a Bug Report...)
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/beans.xml`
#### Snippet
```java
    <import resource="classpath:META-INF/cxf/cxf-extension-soap.xml"/>
    <import resource="classpath:META-INF/cxf/cxf-servlet.xml"/>
    <jaxws:endpoint xmlns:tns="IA_NAMESPACE"
                    id="IA_CLASS_NAME" implementor="IA_PACKAGE.IA_CLASS_NAME"
                    wsdlLocation="wsdl/IA_CLASS_NAME.wsdl" endpointName="tns:IA_CLASS_NAMEPort"
```

## RuleId[id=RegExpRedundantClassElement]
### RegExpRedundantClassElement
Redundant '\\\\d' in RegExp
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
        // However, {namespace}id does NOT work
        String res = namespace + "_" + localName;
        res = res.replaceAll("[^\\w\\d_]", "_");
        return res;
    }
```

## RuleId[id=NotNullFieldNotInitialized]
### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPropertyMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    protected XHasId targetObjectRef;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPropertyMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "serviceTemplatePropertyRef", required = true)
    @NonNull
    protected String serviceTemplatePropertyRef;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPropertyMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "targetPropertyRef", required = true)
    @NonNull
    protected String targetPropertyRef;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedInterface.java`
#### Snippet
```java
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anyURI")
    @NonNull
    protected String name;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "policyType", required = true)
    @NonNull
    protected QName policyType;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "type", required = true)
    @NonNull
    protected String type;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTTag.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTEntityTemplate.java`
#### Snippet
```java

    @XmlAttribute(name = "type", required = true)
    @NonNull
    protected QName type;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPropertyKV.java`
#### Snippet
```java

    @XmlAttribute(name = "key", required = true)
    @NonNull
    private String key;
    @XmlAttribute(name = "value", required = true)
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPropertyKV.java`
#### Snippet
```java
    private String key;
    @XmlAttribute(name = "value", required = true)
    @NonNull
    private String value;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private XTEntityTemplate refinementElement;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private XTEntityTemplate detectorElement;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRelationshipTemplate.java`
#### Snippet
```java
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        @NonNull
        private XRelationshipSourceOrTarget ref;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRelationshipTemplate.java`
#### Snippet
```java
    @XmlElement(name = "SourceElement")
    // AD: We need to combine source or target due to multi-inheritance
    protected XTRelationshipTemplate.@NonNull SourceOrTargetElement sourceElement;
    
    @XmlElement(name = "TargetElement")
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRelationshipTemplate.java`
#### Snippet
```java
    
    @XmlElement(name = "TargetElement")
    protected XTRelationshipTemplate.@NonNull SourceOrTargetElement targetElement;
    
    @XmlElement(name = "RelationshipConstraints")
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "behaviorPattern", required = true)
    @NonNull
    private String behaviorPattern;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlElement(name = "Property", required = true)
    @NonNull
    private XOTPropertyKV property;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TSchema.java`
#### Snippet
```java
public class TSchema {

    @NonNull
    private QName type;
    private String description;
```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "type", required = true)
    @NonNull
    protected String type;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedInterface.java`
#### Snippet
```java
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anyURI")
    @NonNull
    protected String name;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPropertyMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    protected HasId targetObjectRef;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPropertyMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "targetPropertyRef", required = true)
    @NonNull
    protected String targetPropertyRef;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPropertyMapping.java`
#### Snippet
```java
    @JsonIdentityReference(alwaysAsId = true)
    @XmlAttribute(name = "serviceTemplatePropertyRef", required = true)
    @NonNull
    protected String serviceTemplatePropertyRef;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TTag.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "policyType", required = true)
    @NonNull
    protected QName policyType;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlElement(name = "Property", required = true)
    @NonNull
    private OTPropertyKV property;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "behaviorPattern", required = true)
    @NonNull
    private String behaviorPattern;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private TEntityTemplate detectorElement;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private TEntityTemplate refinementElement;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/OTPropertyKV.java`
#### Snippet
```java
    private String key;
    @XmlAttribute(name = "value", required = true)
    @NonNull
    private String value;

```

### NotNullFieldNotInitialized
Not-null fields must be initialized
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/OTPropertyKV.java`
#### Snippet
```java

    @XmlAttribute(name = "key", required = true)
    @NonNull
    private String key;
    @XmlAttribute(name = "value", required = true)
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyWrapper.java`
#### Snippet
```java
                return Double.valueOf((String)property);
            case "xsd:string":
                return property;
            case "xsd:float":
                return Float.parseFloat((String)property);
```

### DuplicateBranchesInSwitch
Branch in 'switch' is a duplicate of the default branch
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/ValidEndingsApiDataSet.java`
#### Snippet
```java
        switch (type) {
            case "everything":
                this.validEndingsSelectionType = ValidEndingsTypeEnum.EVERYTHING;
                break;
            case "nodeType":
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder urlBuilder` can be replaced with 'String'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/crawler/GithubCrawler.java`
#### Snippet
```java

    private List<Dockerfile> searchRepositoryForDockerfiles(Repository repository) throws IOException {
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(baseUrl);
        urlBuilder.append("search/code?q=FROM+filename:Dockerfile+repo:");
```

## RuleId[id=Deprecation]
### Deprecation
'XTDocumentation()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExtensibleElements.java`
#### Snippet
```java
            }

            XTDocumentation tmp = new XTDocumentation();
            tmp.getContent().add(documentation);
            return self().addDocumentation(tmp);
```

### Deprecation
'XTExtensibleElements()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XHasId.java`
#### Snippet
```java

    // required for XML deserialization
    public XHasId(String id) {
        this.setId(id);
    }
```

### Deprecation
'XTExtensibleElements()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XHasId.java`
#### Snippet
```java

    // required for XML deserialization
    public XHasId() { }

    // required for XML deserialization
```

### Deprecation
'XTTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTTestRefinementModel.java`
#### Snippet
```java
    public XTTopologyTemplate getRefinementTopology() {
        if (testFragment == null) {
            testFragment = new XTTopologyTemplate();
        }
        return testFragment;
```

### Deprecation
'XTTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTComplianceRule.java`
#### Snippet
```java
    public XTTopologyTemplate getRequiredStructure() {
        if (requiredStructure == null) {
            requiredStructure = new XTTopologyTemplate();
        }
        return requiredStructure;
```

### Deprecation
'XTTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTRefinementModel.java`
#### Snippet
```java
    public XTTopologyTemplate getDetector() {
        if (detector == null) {
            detector = new XTTopologyTemplate();
        }
        return detector;
```

### Deprecation
'XTTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTTopologyFragmentRefinementModel.java`
#### Snippet
```java
    public XTTopologyTemplate getRefinementTopology() {
        if (refinementStructure == null) {
            refinementStructure = new XTTopologyTemplate();
        }
        return refinementStructure;
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TCapabilityType.java`
#### Snippet
```java

        public Builder(String name) {
            super(name);
        }

```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TRequirementType.java`
#### Snippet
```java

        public Builder(String name) {
            super(name);
        }

```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TGroupType.java`
#### Snippet
```java

        public Builder(String name) {
            super(name);
        }

```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPolicyType.java`
#### Snippet
```java

        public Builder(String name) {
            super(name);
        }

```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDataType.java`
#### Snippet
```java

        public Builder(String name) {
            super(name);
        }
        
```

### Deprecation
'HasId()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/HasIdAndTags.java`
#### Snippet
```java

    // required for serialization
    public HasIdAndTags() {
    }

```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TArtifactType.java`
#### Snippet
```java

        public Builder(String name) {
            super(name);
        }

```

### Deprecation
'HasId()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTParticipant.java`
#### Snippet
```java
    private String url;

    public OTParticipant() {
    }

```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTTestRefinementModel.java`
#### Snippet
```java
    public TTopologyTemplate getRefinementTopology() {
        if (testFragment == null) {
            testFragment = new TTopologyTemplate();
        }
        return testFragment;
```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTComplianceRule.java`
#### Snippet
```java
    public TTopologyTemplate getIdentifier() {
        if (identifier == null) {
            identifier = new TTopologyTemplate();
        }
        return identifier;
```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTComplianceRule.java`
#### Snippet
```java
    public TTopologyTemplate getRequiredStructure() {
        if (requiredStructure == null) {
            requiredStructure = new TTopologyTemplate();
        }
        return requiredStructure;
```

### Deprecation
'HasId()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTPrmMapping.java`
#### Snippet
```java
    }

    public OTPrmMapping(TEntityTemplate detectorElement, TEntityTemplate refinementElement) {
        this.detectorElement = detectorElement;
        this.refinementElement = refinementElement;
```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTRefinementModel.java`
#### Snippet
```java
    public TTopologyTemplate getDetector() {
        if (detector == null) {
            detector = new TTopologyTemplate();
        }
        return detector;
```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTTopologyFragmentRefinementModel.java`
#### Snippet
```java
    public TTopologyTemplate getRefinementTopology() {
        if (refinementStructure == null) {
            refinementStructure = new TTopologyTemplate();
        }
        return refinementStructure;
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInterfaceType.java`
#### Snippet
```java

        public Builder(String name) {
            super(name);
        }

```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/CookbookConfigurationToscaConverter.java`
#### Snippet
```java
    private TNodeType convertPlatformToNodeType(Platform platform, String namespace) {
        namespace = buildNamespaceForPlatforms();
        TNodeType.Builder configurationNodeType = new TNodeType.Builder(platform.getName() + "-" + platform.getVersion() + WineryVersion.WINERY_VERSION_SEPARATOR + WineryVersion.WINERY_VERSION_PREFIX + "1");
        configurationNodeType.setTargetNamespace(namespace);

```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/CookbookConfigurationToscaConverter.java`
#### Snippet
```java
        String namespace = buildNamespaceForCookbookConfigs(cookbookName, version);

        TNodeType.Builder configurationNodeType = new TNodeType.Builder(cookbookName + WineryVersion.WINERY_VERSION_SEPARATOR + WineryVersion.WINERY_VERSION_PREFIX + counter);
        configurationNodeType.setTargetNamespace(namespace);

```

### Deprecation
'org.eclipse.winery.repository.yaml.export.entries.YAMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlExportAdjustmentsBuilder.java`
#### Snippet
```java
    }

    public YAMLDefinitionsBasedCsarEntry build() {
        this.entry.setDefinitions(definitions);
        return entry;
```

### Deprecation
'org.eclipse.winery.repository.yaml.export.entries.YAMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlExportAdjustmentsBuilder.java`
#### Snippet
```java
public class YamlExportAdjustmentsBuilder {

    private YAMLDefinitionsBasedCsarEntry entry;
    private YTServiceTemplate definitions;

```

### Deprecation
'org.eclipse.winery.repository.yaml.export.entries.YAMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlExportAdjustmentsBuilder.java`
#### Snippet
```java
    private YTServiceTemplate definitions;

    public YamlExportAdjustmentsBuilder(YAMLDefinitionsBasedCsarEntry entry) {
        this.entry = entry;
        this.definitions = this.entry.getDefinitions();
```

### Deprecation
'org.eclipse.winery.repository.export.entries.XMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlExporter.java`
#### Snippet
```java
            if (csarEntry instanceof DocumentBasedCsarEntry) {
                mimeType = MimeTypes.MIMETYPE_XSD;
            } else if (csarEntry instanceof XMLDefinitionsBasedCsarEntry ||
                csarEntry instanceof YAMLDefinitionsBasedCsarEntry ||
                csarEntry instanceof DefinitionsBasedCsarEntry) {
```

### Deprecation
'org.eclipse.winery.repository.yaml.export.entries.YAMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlExporter.java`
#### Snippet
```java
                mimeType = MimeTypes.MIMETYPE_XSD;
            } else if (csarEntry instanceof XMLDefinitionsBasedCsarEntry ||
                csarEntry instanceof YAMLDefinitionsBasedCsarEntry ||
                csarEntry instanceof DefinitionsBasedCsarEntry) {
                mimeType = MimeTypes.MIMETYPE_TOSCA_DEFINITIONS;
```

### Deprecation
'org.eclipse.winery.repository.yaml.export.entries.YAMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlToscaExportUtil.java`
#### Snippet
```java
        // END: Definitions modification

        YAMLDefinitionsBasedCsarEntry entry = new YAMLDefinitionsBasedCsarEntry(repository, entryDefinitions);

        // Custom Adjustments for Service Templates
```

### Deprecation
'org.eclipse.winery.repository.yaml.export.entries.YAMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlToscaExportUtil.java`
#### Snippet
```java
        // END: Definitions modification

        YAMLDefinitionsBasedCsarEntry entry = new YAMLDefinitionsBasedCsarEntry(repository, entryDefinitions);

        // Custom Adjustments for Service Templates
```

### Deprecation
'convertNodeTypeImplementation(org.eclipse.winery.model.tosca.yaml.YTServiceTemplate, org.eclipse.winery.model.tosca.TNodeTypeImplementation)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/YamlRepository.java`
#### Snippet
```java
        if (existing.getParent() instanceof NodeTypeImplementationId) {
            serviceTemplate = readServiceTemplate(existing);
            serviceTemplate = converter.convertNodeTypeImplementation(serviceTemplate, definitions.getNodeTypeImplementations().get(0));
        } else if (existing.getParent() instanceof RelationshipTypeImplementationId) {
            serviceTemplate = readServiceTemplate(existing);
```

### Deprecation
'convertRelationshipTypeImplementation(org.eclipse.winery.model.tosca.yaml.YTServiceTemplate, org.eclipse.winery.model.tosca.TRelationshipTypeImplementation)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/YamlRepository.java`
#### Snippet
```java
        } else if (existing.getParent() instanceof RelationshipTypeImplementationId) {
            serviceTemplate = readServiceTemplate(existing);
            serviceTemplate = converter.convertRelationshipTypeImplementation(serviceTemplate, definitions.getRelationshipTypeImplementations().get(0));
        } else if (existing.getParent() instanceof NodeTypeId) {
            serviceTemplate = converter.convert(definitions);
```

### Deprecation
'convertArtifactTemplate(org.eclipse.winery.model.tosca.TArtifactTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/YamlRepository.java`
#### Snippet
```java
            ArtifactTemplateId id = (ArtifactTemplateId) existing.getParent();
            TArtifactTemplate artifactTemplate = definitions.getArtifactTemplates().get(0);
            YTArtifactDefinition artifact = converter.convertArtifactTemplate(artifactTemplate);
            List<YTMapImportDefinition> imports = converter.convertImports();
            Path targetPath = ref2AbsolutePath(existing);
```

### Deprecation
'serialize(org.eclipse.winery.model.tosca.TDefinitions, java.io.OutputStream)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/entries/DefinitionsBasedCsarEntry.java`
#### Snippet
```java
    @Override
    public void writeToOutputStream(OutputStream outputStream) throws IOException {
        repository.serialize(definitions, outputStream);
    }
}
```

### Deprecation
'TImport()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
     */
    protected void addToImports(IRepository repository, DefinitionsChildId id, Collection<TImport> imports) {
        TImport imp = new TImport();
        imp.setImportType(Namespaces.TOSCA_NAMESPACE);
        imp.setNamespace(id.getNamespace().getDecoded());
```

### Deprecation
'org.eclipse.winery.repository.export.entries.XMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
        return this.referencesToPathInCSARMap.values().stream()
            // FIXME ... why is this even restricted that way if all we want to do is "writeTOSCA"?
            .filter(e -> e instanceof XMLDefinitionsBasedCsarEntry || e instanceof DefinitionsBasedCsarEntry)
            .findFirst()
            .orElseThrow(() -> new RepositoryCorruptException("Definition not found!"));
```

### Deprecation
'TImport()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
                // BEGIN: add import and put into CSAR

                TImport imp = new TImport();
                entryDefinitions.getImport().add(imp);

```

### Deprecation
'persist(java.lang.Object, org.eclipse.winery.repository.common.RepositoryFileReference, org.apache.tika.mime.MediaType, org.eclipse.winery.repository.backend.IRepository)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/CsarExporter.java`
#### Snippet
```java
            // make the patches to data.xml permanent
            try {
                BackendUtils.persist(application, SelfServiceMetaDataUtils.getDataXmlRef(selfServiceMetaDataId), MediaTypes.MEDIATYPE_TEXT_XML, repository);
            } catch (IOException e) {
                LOGGER.error("Could not persist patches to data.xml", e);
```

### Deprecation
'org.eclipse.winery.repository.export.entries.XMLDefinitionsBasedCsarEntry' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/CsarExporter.java`
#### Snippet
```java
            if (csarEntry instanceof DocumentBasedCsarEntry) {
                mimeType = MimeTypes.MIMETYPE_XSD;
            } else if (csarEntry instanceof XMLDefinitionsBasedCsarEntry
                || csarEntry instanceof DefinitionsBasedCsarEntry) {
                mimeType = MimeTypes.MIMETYPE_TOSCA_DEFINITIONS;
```

### Deprecation
'persist(java.lang.Object, org.eclipse.winery.repository.common.RepositoryFileReference, org.apache.tika.mime.MediaType, org.eclipse.winery.repository.backend.IRepository)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/SelfServiceMetaDataUtils.java`
#### Snippet
```java
        if (!repository.exists(data_xml_ref)) {
            final Application application = new Application();
            BackendUtils.persist(application, data_xml_ref, MediaTypes.MEDIATYPE_TEXT_XML, repository);
        }
    }
```

### Deprecation
'Builder(java.lang.String, org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/xml/converter/ToCanonical.java`
#### Snippet
```java
    private TServiceTemplate convert(XTServiceTemplate xml) {
        TTopologyTemplate topologyTemplate = convert(xml.getTopologyTemplate());
        TServiceTemplate.Builder builder = new TServiceTemplate.Builder(xml.getId(), topologyTemplate);
        builder.setName(xml.getName());
        builder.setTargetNamespace(xml.getTargetNamespace());
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/xml/converter/ToCanonical.java`
#### Snippet
```java

    private TNodeType convert(XTNodeType xml) {
        TNodeType.Builder builder = new TNodeType.Builder(xml.getName());
        if (xml.getRequirementDefinitions() != null) {
            List<TRequirementDefinition> reqDefs = xml.getRequirementDefinitions()
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/xml/converter/ToCanonical.java`
#### Snippet
```java

    private TRelationshipType convert(XTRelationshipType xml) {
        TRelationshipType.Builder builder = new TRelationshipType.Builder(xml.getIdFromIdOrNameField())
            .addSourceInterfaces(convertInterfaces(xml.getSourceInterfaces()))
            .addTargetInterfaces(convertInterfaces(xml.getTargetInterfaces()))
```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
     */
    public static TServiceTemplate clone(TServiceTemplate serviceTemplate) {
        TServiceTemplate serviceTemplateClone = new TServiceTemplate();
        TTopologyTemplate topologyTemplateClone = clone(serviceTemplate.getTopologyTemplate());
        serviceTemplateClone.setTopologyTemplate(topologyTemplateClone);
```

### Deprecation
'TDefinitions()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
     */
    public static TDefinitions createWrapperDefinitions(DefinitionsChildId tcId, IRepository repo) {
        TDefinitions defs = new TDefinitions();
        return updateWrapperDefinitions(tcId, defs, repo);
    }
```

### Deprecation
'TRelationshipTypeImplementation()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
        HasIdInIdOrNameField element;
        if (id instanceof RelationshipTypeImplementationId) {
            element = new TRelationshipTypeImplementation();
        } else if (id instanceof NodeTypeImplementationId) {
            element = new TNodeTypeImplementation();
```

### Deprecation
'TNodeTypeImplementation()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TRelationshipTypeImplementation();
        } else if (id instanceof NodeTypeImplementationId) {
            element = new TNodeTypeImplementation();
        } else if (id instanceof RequirementTypeId) {
            element = new TRequirementType();
```

### Deprecation
'TRequirementType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TNodeTypeImplementation();
        } else if (id instanceof RequirementTypeId) {
            element = new TRequirementType();
        } else if (id instanceof NodeTypeId) {
            element = new TNodeType();
```

### Deprecation
'TNodeType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TRequirementType();
        } else if (id instanceof NodeTypeId) {
            element = new TNodeType();
        } else if (id instanceof RelationshipTypeId) {
            element = new TRelationshipType();
```

### Deprecation
'TRelationshipType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TNodeType();
        } else if (id instanceof RelationshipTypeId) {
            element = new TRelationshipType();
        } else if (id instanceof CapabilityTypeId) {
            element = new TCapabilityType();
```

### Deprecation
'TCapabilityType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TRelationshipType();
        } else if (id instanceof CapabilityTypeId) {
            element = new TCapabilityType();
        } else if (id instanceof DataTypeId) {
            element = new TDataType();
```

### Deprecation
'TDataType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TCapabilityType();
        } else if (id instanceof DataTypeId) {
            element = new TDataType();
        } else if (id instanceof ArtifactTypeId) {
            element = new TArtifactType();
```

### Deprecation
'TArtifactType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TDataType();
        } else if (id instanceof ArtifactTypeId) {
            element = new TArtifactType();
        } else if (id instanceof PolicyTypeId) {
            element = new TPolicyType();
```

### Deprecation
'TPolicyType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TArtifactType();
        } else if (id instanceof PolicyTypeId) {
            element = new TPolicyType();
        } else if (id instanceof PolicyTemplateId) {
            element = new TPolicyTemplate();
```

### Deprecation
'TPolicyTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TPolicyType();
        } else if (id instanceof PolicyTemplateId) {
            element = new TPolicyTemplate();
        } else if (id instanceof ServiceTemplateId) {
            element = new TServiceTemplate();
```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TPolicyTemplate();
        } else if (id instanceof ServiceTemplateId) {
            element = new TServiceTemplate();
        } else if (id instanceof ArtifactTemplateId) {
            element = new TArtifactTemplate();
```

### Deprecation
'TArtifactTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new TServiceTemplate();
        } else if (id instanceof ArtifactTemplateId) {
            element = new TArtifactTemplate();
        } else if (id instanceof ComplianceRuleId) {
            element = new OTComplianceRule(new OTComplianceRule.Builder(id.getXmlId().getDecoded()));
```

### Deprecation
'TInterfaceType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            element = new OTTestRefinementModel(new OTTestRefinementModel.Builder());
        } else if (id instanceof InterfaceTypeId) {
            element = new TInterfaceType();
        } else if (id instanceof XSDImportId) {
            // TImport has no id; thus directly generating it without setting an id
```

### Deprecation
'TImport()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
        } else if (id instanceof XSDImportId) {
            // TImport has no id; thus directly generating it without setting an id
            TImport tImport = new TImport();
            definitions.setElement(tImport);
            return definitions;
```

### Deprecation
'TRelationshipTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
     */
    public static TRelationshipTemplate clone(TRelationshipTemplate relationshipTemplate) {
        TRelationshipTemplate relationshipTemplateClone = new TRelationshipTemplate();
        relationshipTemplateClone.setSourceElement(relationshipTemplate.getSourceElement());
        relationshipTemplateClone.setType(relationshipTemplate.getType());
```

### Deprecation
'PropertyDefinitionKV()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
                        String typeName = xsSimpleType.getName();
                        if (typeNS.equals(XMLConstants.W3C_XML_SCHEMA_NS_URI)) {
                            PropertyDefinitionKV def = new PropertyDefinitionKV();
                            def.setKey(name);
                            // convention at WPD: use "xsd" as prefix for XML Schema Definition
```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
    public static TTopologyTemplate clone(TTopologyTemplate topologyTemplate) {
        @SuppressWarnings("deprecated")
        TTopologyTemplate topologyTemplateClone = new TTopologyTemplate();
        List<TEntityTemplate> entityTemplate = topologyTemplate.getNodeTemplateOrRelationshipTemplate();
        topologyTemplateClone.getNodeTemplateOrRelationshipTemplate().addAll(entityTemplate);
```

### Deprecation
'TNodeTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
     */
    public static TNodeTemplate clone(TNodeTemplate nodeTemplate) {
        TNodeTemplate nodeTemplateClone = new TNodeTemplate();

        nodeTemplateClone.setType(nodeTemplate.getType());
```

### Deprecation
'TInterfaceDefinition()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
            return null;
        }
        TInterfaceDefinition def = new TInterfaceDefinition();
        def.setId(id);
        def.setName(id);
```

### Deprecation
'TImplementation()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
            return null;
        }
        TImplementation def = new TImplementation();
        def.setPrimary(node.getPrimaryArtifactName());
        def.setDependencies(node.getDependencyArtifactNames());
```

### Deprecation
'AttributeDefinition()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java

    public AttributeDefinition convert(YTAttributeDefinition node, String name) {
        AttributeDefinition attribute = new AttributeDefinition();
        attribute.setKey(name);
        attribute.setType(node.getType());
```

### Deprecation
'org.eclipse.winery.model.tosca.yaml.support.ValueHelper' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        attribute.setType(node.getType());
        attribute.setDescription(node.getDescription());
        attribute.setDefaultValue(ValueHelper.toString(node.getDefault()));
        return attribute;
    }
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        String typeName = fixNamespaceDuplication(id, node.getMetadata().get("targetNamespace"));
        // convertRelationshipTypeImplementation(node.getInterfaces(), id, node.getMetadata().get("targetNamespace"));
        return fillEntityTypeProperties(node, new TRelationshipType.Builder(typeName))
            .addInterfaces(convert(node.getInterfaces(), null))
            .addSourceInterfaces(convert(node.getInterfaces(), "SourceInterfaces"))
```

### Deprecation
'ParameterDefinition()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
            return null;
        }
        ParameterDefinition p = new ParameterDefinition();
        p.setKey(name);
        p.setType(node.getType());
```

### Deprecation
'org.eclipse.winery.model.tosca.yaml.support.ValueHelper' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        p.setDescription(node.getDescription());
        p.setRequired(node.getRequired());
        p.setDefaultValue(ValueHelper.toString(node.getDefault()));
        p.setValue(ValueHelper.toString(node.getValue()));
        return p;
```

### Deprecation
'org.eclipse.winery.model.tosca.yaml.support.ValueHelper' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        p.setRequired(node.getRequired());
        p.setDefaultValue(ValueHelper.toString(node.getDefault()));
        p.setValue(ValueHelper.toString(node.getValue()));
        return p;
    }
```

### Deprecation
'org.eclipse.winery.model.tosca.yaml.support.ValueHelper' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
            builder.setDefaultValue("\"\"");
        } else {
            builder.setDefaultValue(ValueHelper.toString(node.getDefault()));
        }
        return builder.build();
```

### Deprecation
'TOperationDefinition()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
            return null;
        }
        TOperationDefinition def = new TOperationDefinition();
        def.setId(id);
        def.setName(id);
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        }
        String typeName = fixNamespaceDuplication(id, node.getMetadata().get("targetNamespace"));
        TNodeType.Builder builder = fillEntityTypeProperties(node, new TNodeType.Builder(typeName))
            .addRequirementDefinitions(convert(node.getRequirements()))
            .addCapabilityDefinitions(convert(node.getCapabilities()))
```

### Deprecation
'Builder(java.lang.String, org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
        }

        TServiceTemplate result = new TServiceTemplate.Builder(id, convert(node.getTopologyTemplate()))
            .addDocumentation(node.getDescription())
            .setBoundaryDefinitions(
```

### Deprecation
'TDefinitions()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
    public TDefinitions convert(YTServiceTemplate node, String id, String target_namespace, boolean isServiceTemplate) {
        if (node == null) {
            return new TDefinitions();
        }
        this.root = node;
```

### Deprecation
'org.eclipse.winery.repository.backend.filebased.ConfigurationBasedNamespaceManager' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/AbstractFileBasedRepository.java`
#### Snippet
```java

        if (!configuration.isEmpty()) {
            ConfigurationBasedNamespaceManager old = new ConfigurationBasedNamespaceManager(configuration);
            manager.replaceAll(old.getAllNamespaces());
            try {
```

### Deprecation
'org.eclipse.winery.repository.backend.filebased.ConfigurationBasedNamespaceManager' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/AbstractFileBasedRepository.java`
#### Snippet
```java

        if (!configuration.isEmpty()) {
            ConfigurationBasedNamespaceManager old = new ConfigurationBasedNamespaceManager(configuration);
            manager.replaceAll(old.getAllNamespaces());
            try {
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java

        public TNodeType toTNodeType() {
            TNodeType.Builder nodeTypeBuilder = new TNodeType.Builder(this.name);
            nodeTypeBuilder.setTargetNamespace(this.namespace);
            return nodeTypeBuilder.build();
```

### Deprecation
'TDefinitions()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/WriterUtils.java`
#### Snippet
```java
            e.printStackTrace();
        }
        return new TDefinitions();
    }

```

### Deprecation
'serialize(org.eclipse.winery.model.tosca.TDefinitions, java.io.OutputStream)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
    @Override
    public void serialize(TDefinitions definitions, OutputStream target) throws IOException {
        repository.serialize(definitions, target);
    }
}
```

### Deprecation
'serialize(org.eclipse.winery.model.tosca.TDefinitions, java.io.OutputStream)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/TenantRepository.java`
#### Snippet
```java
    @Override
    public void serialize(TDefinitions definitions, OutputStream target) throws IOException {
        getRepository().serialize(definitions, target);
    }

```

### Deprecation
'serialize(org.eclipse.winery.model.tosca.TDefinitions, java.io.OutputStream)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
    public void serialize(TDefinitions definitions, OutputStream target) throws IOException {
        RepositoryUtils.getRepositoryByNamespace(definitions.getTargetNamespace(), this)
            .serialize(definitions, target);
    }

```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/Allocation.java`
#### Snippet
```java

    private TServiceTemplate createServiceTemplate(TopologyWrapper topology) {
        TServiceTemplate serviceTemplate = new TServiceTemplate();
        TTopologyTemplate topologyTemplate = topology.getTopology();

```

### Deprecation
'getAllNodeTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
     */
    private void searchForKeywords(TTopologyTemplate tTopologyTemplate) {
        List<TNodeTemplate> tNodeTemplateList = ModelUtilities.getAllNodeTemplates(tTopologyTemplate);
        List<Server> serverList = new ArrayList<>(EnumSet.allOf(Server.class));
        List<Service> serviceList = new ArrayList<>(EnumSet.allOf(Service.class));
```

### Deprecation
'getAllNodeTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
        abstractTopology = new AbstractTopology(tTopologyTemplate, labeledNodeTemplates);

        List<TNodeTemplate> tNodeTemplateList = ModelUtilities.getAllNodeTemplates(tTopologyTemplate);
        List<TRelationshipTemplate> tRelationshipTemplateList = ModelUtilities.getAllRelationshipTemplates(tTopologyTemplate);
        getLowestNode(tNodeTemplateList.get(0), tRelationshipTemplateList);
```

### Deprecation
'getAllRelationshipTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

        List<TNodeTemplate> tNodeTemplateList = ModelUtilities.getAllNodeTemplates(tTopologyTemplate);
        List<TRelationshipTemplate> tRelationshipTemplateList = ModelUtilities.getAllRelationshipTemplates(tTopologyTemplate);
        getLowestNode(tNodeTemplateList.get(0), tRelationshipTemplateList);

```

### Deprecation
'org.eclipse.winery.repository.backend.filebased.ConfigurationBasedNamespaceManager' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
                try (final BufferedReader propertyReader = Files.newBufferedReader(properties)) {
                    pconf.read(propertyReader);
                    localNamespaceManager = new ConfigurationBasedNamespaceManager(pconf);
                } catch (IOException | ConfigurationException e) {
                    CsarImporter.LOGGER.debug(e.getMessage(), e);
```

### Deprecation
'TImport()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java

                    TDefinitions wrapperDefs = BackendUtils.createWrapperDefinitions(importId, targetRepository);
                    TImport imp = new TImport();
                    String fileName = id + ".xsd";
                    imp.setLocation(fileName);
```

### Deprecation
'TNodeTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
            possibleTargetLabels.put(nodeTemplate, targetLabels);
        }
        addMissingTargetLabelsRecursive(original.getTopLevelHosts(), new TNodeTemplate());
    }

```

### Deprecation
'getAllNodeTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                                                               topologyTemplate, Map<String, TTopologyTemplate> selectedConnectionFragments)
        throws SplittingException {
        List<TNodeTemplate> nodeTemplates = ModelUtilities.getAllNodeTemplates(topologyTemplate);
        for (String openRequirementId : selectedConnectionFragments.keySet()) {
            TNodeTemplate nodeTemplateWithThisOpenReq = nodeTemplates.stream()
```

### Deprecation
'getAllNodeTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            topologyTemplate.getNodeTemplateOrRelationshipTemplate()
                .addAll(selectedConnectionFragments.get(openRequirementId).getNodeTemplateOrRelationshipTemplate());
            nodeTemplates.addAll(ModelUtilities.getAllNodeTemplates(selectedConnectionFragments.get(openRequirementId)));

            TNodeTemplate nodeWithOpenCapability = nodeTemplates.stream()
```

### Deprecation
'TNodeTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
    public TNodeTemplate createPlaceholderNodeTemplate(TTopologyTemplate topologyTemplate, TNodeTemplate
        NodeTemplateGettingPlaceholder, QName placeholderQName) {
        TNodeTemplate placeholderNodeTemplate = new TNodeTemplate();
        StringBuilder id;
        List<String> ids = new ArrayList<>();
```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        repository.forceDelete(splitServiceTemplateId);
        repository.flagAsExisting(splitServiceTemplateId);
        TServiceTemplate splitServiceTemplate = new TServiceTemplate();
        splitServiceTemplate.setName(splitServiceTemplateId.getXmlId().getDecoded());
        splitServiceTemplate.setId(splitServiceTemplate.getName());
```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        repository.forceDelete(matchedServiceTemplateId);
        repository.flagAsExisting(matchedServiceTemplateId);
        TServiceTemplate matchedServiceTemplate = new TServiceTemplate();
        matchedServiceTemplate.setName(matchedServiceTemplateId.getXmlId().getDecoded());
        matchedServiceTemplate.setId(matchedServiceTemplate.getName());
```

### Deprecation
'getAllRelationshipTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            // Delete all replacement candidates and their relationships.
            serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(replacementNodeTemplateCandidates);
            List<TRelationshipTemplate> removingIncomingRelationships = ModelUtilities.getAllRelationshipTemplates(serviceTemplate.getTopologyTemplate())
                .stream()
                .filter(ir -> replacementNodeTemplateCandidates.contains(ir.getTargetElement().getRef()))
```

### Deprecation
'getAllRelationshipTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(removingIncomingRelationships);
            List<TRelationshipTemplate> removingOutgoingRelationships = ModelUtilities.getAllRelationshipTemplates(serviceTemplate.getTopologyTemplate())
                .stream()
                .filter(ir -> replacementNodeTemplateCandidates.contains(ir.getSourceElement().getRef()))
```

### Deprecation
'TNodeType()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

    public TNodeType createPlaceholderNodeType(String nameOfNodeTemplateGettingPlaceholder) {
        TNodeType placeholderNodeType = new TNodeType();
        placeholderNodeType.setName(nameOfNodeTemplateGettingPlaceholder + "_placeholder");
        placeholderNodeType.setId(nameOfNodeTemplateGettingPlaceholder + "_placeholder");
```

### Deprecation
'TRelationshipTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                                                                       topologyTemplate, TRelationshipType relationshipType, TRequirement requirement, TCapability capability) {

        TRelationshipTemplate matchingRelationshipTemplate = new TRelationshipTemplate();

        QName relationshipTypeQName = new QName(relationshipType.getTargetNamespace(), relationshipType.getName());
```

### Deprecation
'getAllRelationshipTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        LOGGER.debug("The QName of the matchingRelationshipType for ReqCap Matching", relationshipTypeQName);
        List<String> ids = new ArrayList<>();
        List<TRelationshipTemplate> tRelationshipTemplates = ModelUtilities.getAllRelationshipTemplates(topologyTemplate);
        tRelationshipTemplates.forEach(rt -> ids.add(rt.getId()));
        //Check if counter is already set in another Id, if yes -> increase newRelationshipCounter +1
```

### Deprecation
'getAllNodeTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                                                                                      serviceTemplate, List<TNodeTemplate> matchingNodeTemplates) {

        return ModelUtilities.getAllNodeTemplates(serviceTemplate.getTopologyTemplate())
            .stream()
            .filter(y -> !matchingNodeTemplates.contains(y))
```

### Deprecation
'getAllNodeTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        ProviderRepository providerRepository = new ProviderRepository();
        Map<String, List<TServiceTemplate>> connectionInjectionOptions = new HashMap<>();
        List<TNodeTemplate> nodeTemplates = ModelUtilities.getAllNodeTemplates(serviceTemplate.getTopologyTemplate());
        List<TNodeTemplate> nodeTemplatesWithConnectionRequirement = nodeTemplates.stream()
            .filter(nt -> nt.getRequirements() != null)
```

### Deprecation
'TRelationshipTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            //In case the predecessor was a lowest node a new hostedOn relationship has to be added
            if (originHostSuccessors.isEmpty()) {
                TRelationshipTemplate newHostedOnRelationship = new TRelationshipTemplate();
                List<String> ids = new ArrayList<>();
                List<TRelationshipTemplate> tRelationshipTemplates = ModelUtilities.getAllRelationshipTemplates(topologyTemplate);
```

### Deprecation
'getAllRelationshipTemplates(org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                TRelationshipTemplate newHostedOnRelationship = new TRelationshipTemplate();
                List<String> ids = new ArrayList<>();
                List<TRelationshipTemplate> tRelationshipTemplates = ModelUtilities.getAllRelationshipTemplates(topologyTemplate);
                tRelationshipTemplates.forEach(rt -> ids.add(rt.getId()));
                //Check if counter is already set in another Id, if yes -> increase newRelationshipCounter +1
```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        repository.forceDelete(composedServiceTemplateId);
        repository.flagAsExisting(composedServiceTemplateId);
        TServiceTemplate composedServiceTemplate = new TServiceTemplate();
        composedServiceTemplate.setName(composedServiceTemplateId.getXmlId().getDecoded());
        composedServiceTemplate.setId(composedServiceTemplate.getName());
```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        composedServiceTemplate.setId(composedServiceTemplate.getName());
        composedServiceTemplate.setTargetNamespace(solutionNamespace);
        TTopologyTemplate composedTopologyTemplate = new TTopologyTemplate();
        composedServiceTemplate.setTopologyTemplate(composedTopologyTemplate);
        repository.setElement(composedServiceTemplateId, composedServiceTemplate);
```

### Deprecation
'TDataType()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/yaml/DataTypeResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TDataType();
    }

```

### Deprecation
'persist(java.lang.Object, org.eclipse.winery.repository.common.RepositoryFileReference, org.apache.tika.mime.MediaType, org.eclipse.winery.repository.backend.IRepository)' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
    public static Response persist(Object object, RepositoryFileReference data_xml_ref, String mimeType) {
        try {
            BackendUtils.persist(object, data_xml_ref, org.apache.tika.mime.MediaType.parse(mimeType), RepositoryFactory.getRepository());
        } catch (IOException e) {
            LOGGER.debug("Could not persist resource", e);
```

### Deprecation
'TImport()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/imports/xsdimports/XSDImportResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        TImport imp = new TImport();
        imp.setImportType(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        return imp;
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/AbstractRefinementModelResource.java`
#### Snippet
```java
        for (String mappingType : mappingTypes) {
            TRelationshipType relType = new TRelationshipType(new
                TRelationshipType.Builder(mappingType));
            relType.setTargetNamespace("http://opentosca.org/prmMappingTypes");
            relationshipTypesForPrmMappingTypes.add(relType);
```

### Deprecation
'TImplementationArtifact()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/ImplementationArtifactResource.java`
#### Snippet
```java
        }
        // IA does not exist in list
        TImplementationArtifact ia = new TImplementationArtifact();
        ia.setName(artifactId);
        implementationArtifacts.add(ia);
```

### Deprecation
'TDeploymentArtifact()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/DeploymentArtifactResource.java`
#### Snippet
```java
        }
        // DA does not exist in list
        TDeploymentArtifact ia = new TDeploymentArtifact();
        ia.setName(artifactId);
        deploymentArtifacts.add(ia);
```

### Deprecation
'TNodeType()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/nodetypes/NodeTypeResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TNodeType();
    }
}
```

### Deprecation
'TPolicyType()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/policytypes/PolicyTypeResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TPolicyType();
    }

```

### Deprecation
'TCapabilityType()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/capabilitytypes/CapabilityTypeResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TCapabilityType();
    }

```

### Deprecation
'TRequirementType()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/requirementtypes/RequirementTypeResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TRequirementType();
    }

```

### Deprecation
'TArtifactType()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/artifacttypes/ArtifactTypeResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TArtifactType();
    }

```

### Deprecation
'TPolicyTemplate()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/policytemplates/PolicyTemplateResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TPolicyTemplate();
    }

```

### Deprecation
'TRelationshipType()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/relationshiptypes/RelationshipTypeResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TRelationshipType();
    }
}
```

### Deprecation
'TArtifactTemplate()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/artifacttemplates/ArtifactTemplateResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TArtifactTemplate();
    }

```

### Deprecation
'TParameter()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/ParametersResource.java`
#### Snippet
```java
        }

        TParameter param = new TParameter();
        param.setName(name);
        param.setType(type);
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/dataflowmodels/DataFlowResource.java`
#### Snippet
```java
            NodeTypeId nodeTypeId = BackendUtils.getDefinitionsChildId(NodeTypeId.class, filter.getType());
            if (!repo.exists(nodeTypeId)) {
                TNodeType newNodeType = new TNodeType.Builder(nodeTypeId.getQName().getLocalPart()).setTargetNamespace(nodeTypeId.getQName().getNamespaceURI()).build();
                try {
                    BackendUtils.persist(repo, nodeTypeId, newNodeType);
```

### Deprecation
'TPropertyConstraint()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/PropertyConstraintsResource.java`
#### Snippet
```java
        }

        TPropertyConstraint propertyConstraint = new TPropertyConstraint();
        propertyConstraint.setProperty(constraintsApiData.getProperty());
        // Patching Any from String to XML
```

### Deprecation
'org.apache.commons.lang3.StringEscapeUtils' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/BoundaryDefinitionsJSPData.java`
#### Snippet
```java
    public String getDefinedPropertiesAsEscapedHTML() {
        String s = this.getDefinedProperties();
        s = StringEscapeUtils.escapeHtml4(s);
        return s;
    }
```

### Deprecation
'org.apache.commons.lang3.StringEscapeUtils' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/BoundaryDefinitionsJSPData.java`
#### Snippet
```java
    public String getDefinedPropertiesAsJSONString() {
        String s = this.getDefinedProperties();
        s = StringEscapeUtils.escapeEcmaScript(s);
        return s;
    }
```

### Deprecation
'TCapabilityRef()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/reqscaps/CapabilitiesResource.java`
#### Snippet
```java
        }

        TCapabilityRef ref = new TCapabilityRef();
        ref.setName(reqOrCap.name); // may also be null

```

### Deprecation
'TCapabilityRef()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/reqscaps/CapabilitiesResource.java`
#### Snippet
```java
        }

        TCapabilityRef ref = new TCapabilityRef();
        ref.setName(name); // may also be null

```

### Deprecation
'TRequirementRef()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/reqscaps/RequirementsResource.java`
#### Snippet
```java
        }

        TRequirementRef ref = new TRequirementRef();
        ref.setName(name); // may also be null

```

### Deprecation
'TRequirementRef()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/reqscaps/RequirementsResource.java`
#### Snippet
```java
        }

        TRequirementRef ref = new TRequirementRef();
        ref.setName(reqOrCap.name); // may also be null

```

### Deprecation
'TRelationshipTypeImplementation()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypeimplementations/relationshiptypeimplementations/RelationshipTypeImplementationResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TRelationshipTypeImplementation();
    }
}
```

### Deprecation
'TNodeTypeImplementation()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypeimplementations/nodetypeimplementations/NodeTypeImplementationResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TNodeTypeImplementation();
    }
}
```

### Deprecation
'TRelationshipTemplate()' is deprecated
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/tests/TestRefinement.java`
#### Snippet
```java
                            relId += counter++;
                        }
                        TRelationshipTemplate relationshipTemplate = new TRelationshipTemplate();
                        relationshipTemplate.setType(relationMapping.getRelationType());
                        relationshipTemplate.setId(relId);
```

### Deprecation
'Builder(java.lang.String, org.eclipse.winery.model.tosca.TTopologyTemplate)' is deprecated
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/placement/PlacementUtils.java`
#### Snippet
```java
                VersionSupport.getNewComponentVersionId(serviceTemplateId, "placement"), false);
            repo.forceDelete(placementId);
            TServiceTemplate placementServiceTemplate = new TServiceTemplate.Builder(placementId.getXmlId().getDecoded(), topology)
                .setName(placementId.getXmlId().getDecoded())
                .setTargetNamespace(serviceTemplateId.getNamespace().getDecoded())
```

### Deprecation
'TNodeTemplate()' is deprecated
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/SecureVmProxyAlgorithm.java`
#### Snippet
```java
    @Override
    protected TNodeTemplate createProxy(TNodeTemplate sourceNode) {
        TNodeTemplate proxy = new TNodeTemplate();
        proxy.setType(OpenToscaBaseTypes.secureProxy);
        proxy.setName(OpenToscaBaseTypes.secureProxy.getLocalPart());
```

### Deprecation
'TNodeTemplate()' is deprecated
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/SecureContainerProxyAlgorithm.java`
#### Snippet
```java
    @Override
    protected TNodeTemplate createProxy(TNodeTemplate sourceNode) {
        TNodeTemplate proxy = new TNodeTemplate();
        proxy.setType(OpenToscaBaseTypes.secureProxyContainer);
        proxy.setName(OpenToscaBaseTypes.secureProxyContainer.getLocalPart());
```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
    @Override
    protected TExtensibleElements createNewElement() {
        return new TServiceTemplate();
    }

```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
            // default topology template: empty template
            // This eases the JSPs etc. and is valid as a non-existant topology template is equal to an empty one
            this.getServiceTemplate().setTopologyTemplate(new TTopologyTemplate());
        }
        return new TopologyTemplateResource(this, this.getServiceTemplate().getTopologyTemplate(), null);
```

### Deprecation
'TTopologyTemplate()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
    public ParameterResource getParameterResource() {
        if (this.getServiceTemplate().getTopologyTemplate() == null) {
            this.getServiceTemplate().setTopologyTemplate(new TTopologyTemplate());
        }
        return new ParameterResource(this, this.getServiceTemplate().getTopologyTemplate());
```

### Deprecation
'TTag()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        String choreoValue = splitting.calculateChoreographyTag(newServiceTemplate.getTopologyTemplate().getNodeTemplates(), participantId);

        TTag choreoTag = new TTag();
        choreoTag.setName("choreography");
        choreoTag.setValue(choreoValue);
```

### Deprecation
'TServiceTemplate()' is deprecated
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        repository.forceDelete(matchedServiceTemplateId);
        repository.flagAsExisting(matchedServiceTemplateId);
        TServiceTemplate matchedServiceTemplate = new TServiceTemplate();
        matchedServiceTemplate.setName(matchedServiceTemplateId.getXmlId().getDecoded());
        matchedServiceTemplate.setId(matchedServiceTemplate.getName());
```

### Deprecation
'TPolicyType()' is deprecated
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModelingUtils.java`
#### Snippet
```java
            throw new Exception("Threat modeling already set up.");
        }
        TPolicyType threat = new TPolicyType();
        threat.setId(ThreatModelingConstants.THREAT_POLICY_NAME);
        threat.setName(ThreatModelingConstants.THREAT_POLICY_NAME);
```

### Deprecation
'TPolicyType()' is deprecated
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModelingUtils.java`
#### Snippet
```java
        threatDefinitions.setElement(threat);

        TPolicyType mitigation = new TPolicyType();

        mitigation.setId(ThreatModelingConstants.MITIGATION_POLICY_NAME);
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModelingUtils.java`
#### Snippet
```java
        mitigationDefinitions.setElement(mitigation);

        TNodeType svnf = new TNodeType.Builder("S-VNF-w1_wip1")
            .setTargetNamespace(ThreatModelingConstants.SECURITY_NAMESPACE)
            .setAbstract(true)
```

### Deprecation
'TPolicyTemplate()' is deprecated
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModelingUtils.java`
#### Snippet
```java
        
        /* Create Threat */
        TPolicyTemplate threat = new TPolicyTemplate();
        QName threatTypeQName = QName.valueOf(ThreatModelingConstants.THREAT_POLICY_ID);

```

### Deprecation
'TPolicyTemplate()' is deprecated
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModelingUtils.java`
#### Snippet
```java
        }

        TPolicyTemplate mitigation = new TPolicyTemplate();
        QName mitigationTypeQName = QName.valueOf(ThreatModelingConstants.MITIGATION_POLICY_ID);
        String mitigationName = "MITIGATE_".concat(threatName);
```

### Deprecation
'Builder(java.lang.String)' is deprecated
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/DeployableComponentsToscaConverter.java`
#### Snippet
```java

    private TNodeType.Builder convertComponentToNode(Component component) {
        TNodeType.Builder baseNodeBuilder = new TNodeType.Builder(component.getName());
        baseNodeBuilder.addTag(
            new TTag.Builder("versionOperator", component.getVersionOperator()).build()
```

### Deprecation
'TDefinitions()' is deprecated
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
            }
        }
        return new TDefinitions();
    }

```

## RuleId[id=UnnecessaryReturn]
### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
                }
            }
            return;
        } else if (label.equals(labelOS)) {
            Iterator iterator = edges.iterator();
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
                }
            }
            return;
        } else if (label.equals(labelService)) {
            Iterator iterator = edges.iterator();
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
                }
            }
            return;
        } else if (label.equals(labelServer)) {
            Iterator iterator = edges.iterator();
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
                }
            }
            return;
        } else if (label.equals(labelApp)) {
            Iterator iterator = edges.iterator();
```

### UnnecessaryReturn
`return` is unnecessary as the last statement in a 'void' method
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
                }
            }
            return;
        }
    }
```

## RuleId[id=SuspiciousListRemoveInLoop]
### SuspiciousListRemoveInLoop
Suspicious 'List.remove()' in loop
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/DeployableComponents.java`
#### Snippet
```java
                    Pair<Component, Integer> newEntry = Pair.of(oldValue.get(i).getKey(), oldValue.get(i).getValue() + 1);
                    // remove and add (update) at the same index to not break the loop!
                    oldValue.remove(i);
                    oldValue.add(i, newEntry);
                    newComponents.getValue().remove(oldComponent);
```

## RuleId[id=SimplifiableConditionalExpression]
### SimplifiableConditionalExpression
`value == null ? true : value` can be simplified to 'value == null \|\| value'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExtension.java`
#### Snippet
```java

    public void setMustUnderstand(@Nullable Boolean value) {
        this.mustUnderstand = value == null ? true : value;
    }

```

### SimplifiableConditionalExpression
`(requiredStructureMapping.getVertexCorrespondence(identifierVertexCorrespondence, true) != null) ? true : false` can be simplified to 'requiredStructureMapping.getVertexCorrespondence(identifierVertexCorrespondence, true) != null'
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java
				//get the corresponding ToscaNode from the searchInGraph 
				ToscaNode identifierVertexCorrespondence = (ToscaNode) identifierMapping.getVertexCorrespondence(identifierGraph.getReferenceNode(), false);
				foundCorrespondence = (requiredStructureMapping.getVertexCorrespondence(identifierVertexCorrespondence, true) != null) ? true : false;
			}
			if (!foundCorrespondence) {
```

## RuleId[id=SillyAssignment]
### SillyAssignment
Variable 'name' is assigned to itself
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPropertyDefinition.java`
#### Snippet
```java
    @Override
    public void setName(String value) {
        this.name = name;
    }

```

## RuleId[id=NullableProblems]
### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPropertyMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    protected XHasId targetObjectRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPropertyMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "serviceTemplatePropertyRef", required = true)
    @NonNull
    protected String serviceTemplatePropertyRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPropertyMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "targetPropertyRef", required = true)
    @NonNull
    protected String targetPropertyRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedInterface.java`
#### Snippet
```java
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anyURI")
    @NonNull
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExtensibleElements.java`
#### Snippet
```java

    @XmlAnyAttribute
    @NonNull
    private Map<QName, String> otherAttributes = new HashMap<>();

```

### NullableProblems
Not annotated method overrides method annotated with @NonNullByDefault
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java

        @Override
        public QName getTypeAsQName() {
            return this.getType();
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "name")
    @Nullable
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "policyRef")
    @Nullable
    protected QName policyRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPolicy.java`
#### Snippet
```java
    //Added to support conversion to/from YAML Policies
    @XmlAttribute(name = "targets")
    @Nullable
    protected List<QName> targets;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "policyType", required = true)
    @NonNull
    protected QName policyType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "type", required = true)
    @NonNull
    protected String type;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTTag.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTDocumentation.java`
#### Snippet
```java
    protected String source;

    @Nullable
    @XmlAttribute(name = "lang", namespace = Namespaces.W3C_NAMESPACE_URI)
    protected String lang;
```

### NullableProblems
Not annotated method overrides method annotated with @NonNullByDefault
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRelationshipTypeImplementation.java`
#### Snippet
```java

        @Override
        public QName getTypeAsQName() {
            return this.getType();
        }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTEntityTemplate.java`
#### Snippet
```java

    @XmlAttribute(name = "type", required = true)
    @NonNull
    protected QName type;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPropertyKV.java`
#### Snippet
```java

    @XmlAttribute(name = "key", required = true)
    @NonNull
    private String key;
    @XmlAttribute(name = "value", required = true)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPropertyKV.java`
#### Snippet
```java
    private String key;
    @XmlAttribute(name = "value", required = true)
    @NonNull
    private String value;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private XTEntityTemplate refinementElement;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private XTEntityTemplate detectorElement;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRelationshipTemplate.java`
#### Snippet
```java
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        @NonNull
        private XRelationshipSourceOrTarget ref;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRelationshipTemplate.java`
#### Snippet
```java
    @XmlElement(name = "SourceElement")
    // AD: We need to combine source or target due to multi-inheritance
    protected XTRelationshipTemplate.@NonNull SourceOrTargetElement sourceElement;
    
    @XmlElement(name = "TargetElement")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRelationshipTemplate.java`
#### Snippet
```java
    
    @XmlElement(name = "TargetElement")
    protected XTRelationshipTemplate.@NonNull SourceOrTargetElement targetElement;
    
    @XmlElement(name = "RelationshipConstraints")
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "behaviorPattern", required = true)
    @NonNull
    private String behaviorPattern;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlElement(name = "Property", required = true)
    @NonNull
    private XOTPropertyKV property;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTAttributeMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "refinementProperty")
    @Nullable
    private String refinementProperty;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTAttributeMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "detectorProperty")
    @Nullable
    private String detectorProperty;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTSchemaDefinition.java`
#### Snippet
```java

    public static class Builder {
        @NonNull
        private final QName type;
        private String description;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTSchemaDefinition.java`
#### Snippet
```java

public class YTSchemaDefinition implements VisitorNode {
    @NonNull
    private QName type;
    private String description;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTPropertyDefinition.java`
#### Snippet
```java

    // TODO while this is required, we can not guarantee it's set while working with the model
    @Nullable
    private QName type;
    private String description;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapRequirementAssignment.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends YTRequirementAssignment> map) {
        this.map.putAll(map);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapObject.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.map.putAll(map);
    }
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTAttributeDefinition.java`
#### Snippet
```java

    private String description;
    @NonNull
    private QName type;
    @Annotations.FieldName("default")
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapActivityDefinition.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends YTActivityDefinition> map) {
        this.map.putAll(map);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapImportDefinition.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends YTImportDefinition> map) {
        this.map.putAll(map);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/Metadata.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends String> map) {
        value.putAll(map);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapPolicyDefinition.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends YTPolicyDefinition> m) {
        map.putAll(m);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTListString.java`
#### Snippet
```java

    @Override
    public boolean addAll(int i, Collection<? extends String> collection) {
        return list.addAll(collection);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTListString.java`
#### Snippet
```java

    @Override
    public boolean removeAll(Collection<?> collection) {
        return list.removeAll(collection);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTListString.java`
#### Snippet
```java

    @Override
    public boolean addAll(Collection<? extends String> collection) {
        return list.addAll(collection);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTListString.java`
#### Snippet
```java

    @Override
    public <T> T[] toArray(T[] ts) {
        return list.toArray(ts);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTListString.java`
#### Snippet
```java

    @Override
    public boolean retainAll(Collection<?> collection) {
        return list.retainAll(collection);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTListString.java`
#### Snippet
```java

    @Override
    public boolean containsAll(Collection<?> collection) {
        return list.containsAll(collection);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapRequirementDefinition.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends YTRequirementDefinition> map) {
        this.map.putAll(map);
    }
```

### NullableProblems
Overridden methods are not annotated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/visitor/IParameter.java`
#### Snippet
```java
    P addContext(List<String> context);

    @NonNull
    P copy();

```

### NullableProblems
Overridden methods are not annotated
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/visitor/IParameter.java`
#### Snippet
```java
    P copy();

    @NonNull
    P self();
}
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapPropertyFilterDefinition.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends YTPropertyFilterDefinition> map) {
        this.map.putAll(map);
    }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/ids/admin/AdminId.java`
#### Snippet
```java

    @Override
    public int compareTo(GenericId o) {
        if (o instanceof AdminId) {
            return this.getXmlId().compareTo(o.getXmlId());
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/ids/elements/ToscaElementId.java`
#### Snippet
```java

    @Override
    public int compareTo(GenericId o1) {
        if (o1 instanceof ToscaElementId) {
            ToscaElementId o = (ToscaElementId) o1;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/ids/definitions/DefinitionsChildId.java`
#### Snippet
```java

    @Override
    public int compareTo(GenericId o1) {
        if (o1 instanceof DefinitionsChildId) {
            int res = this.getClass().getName().compareTo(o1.getClass().getName());
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TSchema.java`
#### Snippet
```java
public class TSchema {

    @NonNull
    private QName type;
    private String description;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TSchema.java`
#### Snippet
```java
    public static class Builder {

        @NonNull
        private final QName type;
        private String description;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TEntityTemplate.java`
#### Snippet
```java
        private String elementName = null;

        @NonNull
        private LinkedHashMap<String, String> KVProperties = new LinkedHashMap<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TEntityTemplate.java`
#### Snippet
```java
    public static class WineryKVProperties extends Properties {

        @Nullable
        private String namespace = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TEntityTemplate.java`
#### Snippet
```java
        private String namespace = null;

        @Nullable
        private String elementName = null;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "type", required = true)
    @NonNull
    protected String type;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TParameter.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDocumentation.java`
#### Snippet
```java
    protected String source;

    @Nullable
    @XmlAttribute(name = "lang", namespace = Namespaces.W3C_NAMESPACE_URI)
    protected String lang;
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedInterface.java`
#### Snippet
```java
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anyURI")
    @NonNull
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExtensibleElements.java`
#### Snippet
```java

    @XmlAnyAttribute
    @NonNull
    private Map<QName, String> otherAttributes = new HashMap<>();

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPropertyMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    protected HasId targetObjectRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPropertyMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "targetPropertyRef", required = true)
    @NonNull
    protected String targetPropertyRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPropertyMapping.java`
#### Snippet
```java
    @JsonIdentityReference(alwaysAsId = true)
    @XmlAttribute(name = "serviceTemplatePropertyRef", required = true)
    @NonNull
    protected String serviceTemplatePropertyRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TTag.java`
#### Snippet
```java

    @XmlAttribute(name = "name", required = true)
    @NonNull
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPolicy.java`
#### Snippet
```java
    //Added to support conversion to/from YAML Policies
    @XmlAttribute(name = "targets")
    @Nullable
    protected List<QName> targets;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "policyType", required = true)
    @NonNull
    protected QName policyType;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "policyRef")
    @Nullable
    protected QName policyRef;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TPolicy.java`
#### Snippet
```java

    @XmlAttribute(name = "name")
    @Nullable
    protected String name;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlElement(name = "Property", required = true)
    @NonNull
    private OTPropertyKV property;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTBehaviorPatternMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "behaviorPattern", required = true)
    @NonNull
    private String behaviorPattern;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTAttributeMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "refinementProperty")
    @Nullable
    private String refinementProperty;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTAttributeMapping.java`
#### Snippet
```java

    @XmlAttribute(name = "detectorProperty")
    @Nullable
    private String detectorProperty;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private TEntityTemplate detectorElement;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTPrmMapping.java`
#### Snippet
```java
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    @NonNull
    private TEntityTemplate refinementElement;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/OTPropertyKV.java`
#### Snippet
```java
    private String key;
    @XmlAttribute(name = "value", required = true)
    @NonNull
    private String value;

```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.NotNull' instead of '@org.eclipse.jdt.annotation.NonNull'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/OTPropertyKV.java`
#### Snippet
```java

    @XmlAttribute(name = "key", required = true)
    @NonNull
    private String key;
    @XmlAttribute(name = "value", required = true)
```

### NullableProblems
The generated code will use '@org.jetbrains.annotations.Nullable' instead of '@org.eclipse.jdt.annotation.Nullable'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jaxbsupport/map/PropertiesAdapter.java`
#### Snippet
```java
    }

    @Nullable
    private final NamespacePrefixMapper prefixMapper;

```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/version/WineryVersion.java`
#### Snippet
```java
    @Override
    @ADR(19)
    public int compareTo(WineryVersion o) {
        if (Objects.isNull(o)) {
            return 1;
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/Version.java`
#### Snippet
```java

    @Override
    public int compareTo(Version that) {
        if (that == null)
            return 1;
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/Parameter.java`
#### Snippet
```java

    @Override
    public Parameter self() {
        return this;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/Parameter.java`
#### Snippet
```java

    @Override
    public Parameter copy() {
        Parameter parameter = new Parameter(this.path, this.namespace);
        parameter.getContext().addAll(this.getContext());
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java

        @Override
        public Parameter copy() {
            Parameter parameter = new Parameter(this.reference, this.entityClass);
            parameter.getContext().addAll(this.getContext());
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java

        @Override
        public Parameter self() {
            return this;
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java

        @Override
        public Parameter self() {
            return this;
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java

        @Override
        public Parameter copy() {
            Parameter parameter = new Parameter(this.reference, this.entityClass);
            parameter.getContext().addAll(this.getContext());
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/support/Parameter.java`
#### Snippet
```java

    @Override
    public Parameter self() {
        return this;
    }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/support/Parameter.java`
#### Snippet
```java

    @Override
    public Parameter copy() {
        Parameter parameter = new Parameter();
        parameter.getContext().addAll(this.getContext());
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlWriter.java`
#### Snippet
```java

        @Override
        public Parameter self() {
            return this;
        }
```

### NullableProblems
Not annotated method overrides method annotated with @NonNull
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlWriter.java`
#### Snippet
```java

        @Override
        public Parameter copy() {
            return new Parameter(this.indent).addContext(this.getContext());
        }
```

### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `org.eclipse.winery.accountability/src/main/java/org/eclipse/winery/accountability/model/BlockchainElement.java`
#### Snippet
```java

    @Override
    public int compareTo(Object o) {
        if (o instanceof BlockchainElement) {
            return Long.compare(this.unixTimestamp, ((BlockchainElement) o).unixTimestamp);
```

### NullableProblems
Primitive type members cannot be annotated
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitutionCandidate.java`
#### Snippet
```java
    }

    @NonNull
    public int getId() {
        return id;
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'QName' and 'YTRequirementDefinition'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTRequirementDefinition.java`
#### Snippet
```java
        if (!(o instanceof YTRequirementDefinition)) return false;
        YTRequirementDefinition that = (YTRequirementDefinition) o;
        return Objects.equals(getCapability(), that) &&
            Objects.equals(getNode(), that.getNode()) &&
            Objects.equals(getRelationship(), that.getRelationship()) &&
```

### EqualsBetweenInconvertibleTypes
`equals` between objects of inconvertible types 'QName' and 'YTRequirementAssignment'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTRequirementAssignment.java`
#### Snippet
```java
        return Objects.equals(getNode(), that.getNode()) &&
            Objects.equals(getRelationship(), that.getRelationship()) &&
            Objects.equals(getCapability(), that) &&
            Objects.equals(getNodeFilter(), that.getNodeFilter()) &&
            Objects.equals(getOccurrences(), that.getOccurrences());
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTInstanceState.java`
#### Snippet
```java
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="state" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTInstanceState.java`
#### Snippet
```java
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="state" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="planRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="planRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExportedOperation.java`
#### Snippet
```java
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTInterface.java`
#### Snippet
```java
 * &lt;complexType name="tInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operation" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tOperation"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTInterface.java`
#### Snippet
```java
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operation" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tOperation"
 * maxOccurs="unbounded"/>
 *       &lt;/sequence>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTInterface.java`
#### Snippet
```java
 * maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTBoolean.java`
#### Snippet
```java
 * <pre>
 * &lt;simpleType name="tBoolean">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="yes"/>
 *     &lt;enumeration value="no"/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 * &lt;complexType name="tNodeTypeImplementation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="Tags" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTags" minOccurs="0"/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="Tags" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTags" minOccurs="0"/>
 *         &lt;element name="DerivedFrom" minOccurs="0">
 *           &lt;complexType>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
 * />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
 * />
 *               &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequiredContainerFeatures" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequiredContainerFeatures"
 * minOccurs="0"/>
 *         &lt;element name="ImplementationArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tImplementationArtifacts"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *         &lt;element name="RequiredContainerFeatures" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequiredContainerFeatures"
 * minOccurs="0"/>
 *         &lt;element name="ImplementationArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tImplementationArtifacts"
 * minOccurs="0"/>
 *         &lt;element name="DeploymentArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tDeploymentArtifacts"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *         &lt;element name="ImplementationArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tImplementationArtifacts"
 * minOccurs="0"/>
 *         &lt;element name="DeploymentArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tDeploymentArtifacts"
 * minOccurs="0"/>
 *       &lt;/sequence>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 * minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;attribute name="final" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;attribute name="final" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;attribute name="final" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
     * />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTNodeTypeImplementation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
     * />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRequiredContainerFeature.java`
#### Snippet
```java
 * &lt;complexType name="tRequiredContainerFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="feature" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTRequiredContainerFeature.java`
#### Snippet
```java
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="feature" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInterface.java`
#### Snippet
```java
 * &lt;complexType name="tInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operation" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tOperation"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInterface.java`
#### Snippet
```java
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Operation" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tOperation"
 * maxOccurs="unbounded"/>
 *       &lt;/sequence>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInterface.java`
#### Snippet
```java
 * maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
     * />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
     * />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 * &lt;complexType name="tNodeTypeImplementation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="Tags" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTags" minOccurs="0"/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *     &lt;extension base="{http://docs.oasis-open.org/tosca/ns/2011/12}tExtensibleElements">
 *       &lt;sequence>
 *         &lt;element name="Tags" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tTags" minOccurs="0"/>
 *         &lt;element name="DerivedFrom" minOccurs="0">
 *           &lt;complexType>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
 * />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="nodeTypeImplementationRef" use="required" type="{http://www.w3.org/2001/XMLSchema}QName"
 * />
 *               &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RequiredContainerFeatures" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequiredContainerFeatures"
 * minOccurs="0"/>
 *         &lt;element name="ImplementationArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tImplementationArtifacts"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *         &lt;element name="RequiredContainerFeatures" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tRequiredContainerFeatures"
 * minOccurs="0"/>
 *         &lt;element name="ImplementationArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tImplementationArtifacts"
 * minOccurs="0"/>
 *         &lt;element name="DeploymentArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tDeploymentArtifacts"
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *         &lt;element name="ImplementationArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tImplementationArtifacts"
 * minOccurs="0"/>
 *         &lt;element name="DeploymentArtifacts" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tDeploymentArtifacts"
 * minOccurs="0"/>
 *       &lt;/sequence>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 * minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;attribute name="final" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;attribute name="targetNamespace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;attribute name="final" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TNodeTypeImplementation.java`
#### Snippet
```java
 *       &lt;attribute name="nodeType" use="required" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *       &lt;attribute name="abstract" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;attribute name="final" type="{http://docs.oasis-open.org/tosca/ns/2011/12}tBoolean" default="no" />
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TRequiredContainerFeature.java`
#### Snippet
```java
 * &lt;complexType name="tRequiredContainerFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="feature" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TRequiredContainerFeature.java`
#### Snippet
```java
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="feature" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInstanceState.java`
#### Snippet
```java
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="state" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInstanceState.java`
#### Snippet
```java
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="state" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     *       &lt;attribute name="relationshipRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     *       &lt;attribute name="nodeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *       &lt;attribute name="interfaceName" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="operationName" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="planRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TExportedOperation.java`
#### Snippet
```java
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="planRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/json/JacksonProvider.java`
#### Snippet
```java
     * Custom Jackson json provider to configure the output by our own.
     * <p>
     * See also https://stackoverflow.com/a/30082203/6592788.
     */
    public JacksonProvider() {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/TestWithGitBackedRepository.java`
#### Snippet
```java

    /**
     * Initializes the git repository from https://github.com/winery/test-repository into %TEMP%/test-repository
     *
     * @throws RuntimeException wraps an Exception
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/xml/export/XmlModelJAXBSupport.java`
#### Snippet
```java
     *
     * IMPORTANT: always create a new instance and do not reuse the marhaller, otherwise the input-stream will throw a
     * NullPointerException! see https://stackoverflow.com/questions/11114665/org-xml-sax-saxparseexception-premature-end-of-file-for-valid-xml
     *
     * @throws IllegalStateException if marshaller could not be instantiated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/JAXBSupport.java`
#### Snippet
```java
     * <p>
     * IMPORTANT: always create a new instance and do not reuse the marhaller, otherwise the input-stream will throw a
     * NullPointerException! see https://stackoverflow.com/questions/11114665/org-xml-sax-saxparseexception-premature-end-of-file-for-valid-xml
     *
     * @throws IllegalStateException if marshaller could not be instantiated
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
     * @param id         the id of the artifact template
     * @return The synchronized artifact template. Used for testing only, because mockito cannot mock static methods
     * (https://github.com/mockito/mockito/issues/1013).
     */
    public static TArtifactTemplate synchronizeReferences(IRepository repository, ArtifactTemplateId id) throws IOException {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/imports/genericimports/GenericImportsResource.java`
#### Snippet
```java

    /**
     * @param id the (decoded) id, e.g., http://schemas.xmlsoap.org/wsdl/
     */
    public GenericImportsResource(String id) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
     * Creates a (valid) XML ID (NCName) based on the passed name
     * <p>
     * Valid NCNames: http://www.w3.org/TR/REC-xml-names/#NT-NCName / http://www.w3.org/TR/xml/#NT-Name
     * http://www.w3.org/TR/xml/#NT-Name
     * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
     * Creates a (valid) XML ID (NCName) based on the passed name
     * <p>
     * Valid NCNames: http://www.w3.org/TR/REC-xml-names/#NT-NCName / http://www.w3.org/TR/xml/#NT-Name
     * http://www.w3.org/TR/xml/#NT-Name
     * <p>
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
     * <p>
     * Valid NCNames: http://www.w3.org/TR/REC-xml-names/#NT-NCName / http://www.w3.org/TR/xml/#NT-Name
     * http://www.w3.org/TR/xml/#NT-Name
     * <p>
     * TODO: this method seems to be equal to {@link Util#makeNCName(java.lang.String)}. The methods should be merged
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
     * Creates a (valid) XML ID (NCName) based on the passed name
     * <p>
     * Valid NCNames: http://www.w3.org/TR/REC-xml-names/#NT-NCName / http://www.w3.org/TR/xml/#NT-Name
     * http://www.w3.org/TR/xml/#NT-Name
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
     * Creates a (valid) XML ID (NCName) based on the passed name
     * <p>
     * Valid NCNames: http://www.w3.org/TR/REC-xml-names/#NT-NCName / http://www.w3.org/TR/xml/#NT-Name
     * http://www.w3.org/TR/xml/#NT-Name
     */
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
     * <p>
     * Valid NCNames: http://www.w3.org/TR/REC-xml-names/#NT-NCName / http://www.w3.org/TR/xml/#NT-Name
     * http://www.w3.org/TR/xml/#NT-Name
     */
    public static XmlId createXMLid(String name) {
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/GenericFileResource.java`
#### Snippet
```java
     * If the file already exists, is it <em>overridden</em>
     *
     * @return JSON with data required by JQuery-File-Upload (see https://github.com/blueimp/jQuery-File-Upload/wiki/Setup)
     */
    @POST
```

### JavadocLinkAsPlainText
Link specified as plain text
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/collections/EntityCollectionResource.java`
#### Snippet
```java
    /**
     * @param entityTClazz the class of EntityT. Required as it is not possible to call new EntityT (see
     *                     http://stackoverflow.com/a/1090488/873282)
     * @param list         the list of entities contained in this resource. Has to be typed <Object> as not all TOSCA
     *                     elements in the specification inherit from TExtensibleElements
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `options.getValues().contains(permutationMap.getDetectorElement().getId())`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java
                                        // to be mutated, add it the component and create the relation.
                                        if (permutationMap.getDetectorElement().getId().equals(option)
                                            || options.getValues().contains(permutationMap.getDetectorElement().getId())) {
                                            String alreadyAddedElement = alreadyAdded.get(relation.getTargetElement().getRef().getId());
                                            TNodeTemplate target = alreadyAddedElement == null
```

### DuplicateCondition
Duplicate condition `options.getValues().contains(permutationMap.getDetectorElement().getId())`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java
                                            ModelUtilities.createRelationshipTemplateAndAddToTopology(
                                                addedDetectorElement, target, relation.getType(), permutation.getDetector());
                                        } else if (!options.getValues().contains(permutationMap.getDetectorElement().getId())) {
                                            // Else if the target is part of the detector, add the relation between the
                                            // added element and the detector element.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/toscalight/ToscaLightChecker.java`
#### Snippet
```java
    private final Map<QName, TNodeType> nodeTypes;
    private final Map<QName, TRelationshipType> relationshipTypes;
    private final Map<QName, EdmmType> oneToOneMappings;
    private QName hostedOn;
    private QName connectsTo;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmExporter.java`
#### Snippet
```java
    private final Map<QName, TRelationshipType> relationshipTypes;
    private final Map<QName, TNodeTypeImplementation> nodeTypeImplementations;
    private final Map<QName, TRelationshipTypeImplementation> relationshipTypeImplementations;
    private final Map<QName, TArtifactTemplate> artifactTemplates;
    private final Map<QName, EdmmType> oneToOneMappings;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmImporter.java`
#### Snippet
```java

    private final Map<QName, TNodeType> nodeTypes;
    private final Map<QName, TNodeTypeImplementation> nodeTypeImplementations;
    private final Map<String, Map.Entry<QName, TNodeType>> normalizedNodeTypes = new HashMap<>();

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmImporter.java`
#### Snippet
```java

    private final Map<String, Map.Entry<QName, TRelationshipType>> normalizedRelationshipTypes = new HashMap<>();
    private final Map<QName, TRelationshipTypeImplementation> relationshipTypeImplementations;

    private final Map<QName, TArtifactTemplate> artifactTemplates;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExtension.java`
#### Snippet
```java

    public static class Builder extends XTExtensibleElements.Builder<Builder> {
        private final String namespace;
        private XTBoolean mustUnderstand;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTAttributeDefinition.java`
#### Snippet
```java
        private Object defaultValue;
        private YTStatusValue status;
        private YTSchemaDefinition keySchema;
        private YTSchemaDefinition entrySchema;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDefinitions.java`
#### Snippet
```java
        private List<TInterfaceType> interfaceTypes;
        private List<TPolicyTemplate> policyTemplate;
        private List<OTPatternRefinementModel> patternRefinementModels;
        private List<OTTestRefinementModel> testRefinementModels;
        private List<TExtensibleElements> nonStandardElements;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDefinitions.java`
#### Snippet
```java
        private List<TPolicyTemplate> policyTemplate;
        private List<OTPatternRefinementModel> patternRefinementModels;
        private List<OTTestRefinementModel> testRefinementModels;
        private List<TExtensibleElements> nonStandardElements;
        private String name;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/ToscaDocumentBuilderFactory.java`
#### Snippet
```java

    private final DocumentBuilderFactory schemaAwareFactory;
    private final DocumentBuilderFactory plainFactory;


```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
    private Map<String, Map.Entry<String, String>> relationshipSTMap;
    private Map<String, TNodeTemplate> nodeTemplateMap;
    private AssignmentBuilder assignmentBuilder;

    public ToCanonical(IRepository context) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
    private List<TImport> imports;
    private Map<String, List<TPolicy>> policies;
    private Map<String, Map.Entry<String, String>> relationshipSTMap;
    private Map<String, TNodeTemplate> nodeTemplateMap;
    private AssignmentBuilder assignmentBuilder;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
    public final static Logger LOGGER = LoggerFactory.getLogger(ToCanonical.class);
    private final IRepository context;
    private YTServiceTemplate root;
    private YTNodeTemplate currentNodeTemplate;
    private String currentNodeTemplateName;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/management/AbstractGitResolver.java`
#### Snippet
```java
public abstract class AbstractGitResolver implements IRepositoryResolver {

    private final String vcsSystem = "git";
    private final String repositoryUrl;
    private final String repositoryBranch;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String service;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
    private String service;

    private String connectsTo;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String service;

    private String connectsTo;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String hostedOn;
    private String deployedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private String application;
    private String hostedOn;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java

    private String os;
    private String server;
    private String application;
    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private String server;
    private String application;
    private String hostedOn;
    private String deployedOn;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String server;
    private String application;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String server;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String server;
    private String application;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String server;
    private String application;
    private String service;
    private String hostedOn;
    private String connectsTo;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String server;
    private String application;
    private String service;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String service;
    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String application;
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java

    private String os;
    private String storage;

    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String storage;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
    private String storage;

    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private List<TNodeTemplateExtended> allNodes;

    private Properties properties;

    public AbstractTopology(TTopologyTemplate tTopologyTemplate, List<TNodeTemplateExtended> labeled) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java

    private SimpleDirectedGraph<TNodeTemplateExtended, RelationshipEdge> abstractTopology;
    private List<TNodeTemplateExtended> allNodes;

    private Properties properties;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelApp;
    private String labelMessaging;
    private String labelStorage;

    private String relationDeployedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelOS;
    private String labelApp;
    private String labelMessaging;
    private String labelStorage;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java

    private String os;
    private String application;
    private String messaging;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java

    private String hostedOn;
    private String connectsTo;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private String messaging;

    private String hostedOn;
    private String connectsTo;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String application;
    private String messaging;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private String os;
    private String application;
    private String messaging;

    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String storage;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
    private String storage;

    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java

    private String os;
    private String storage;

    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private String service;
    private String application;
    private String hostedOn;
    private String dependsOn;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String service;
    private String application;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private String os;
    private String service;
    private String application;
    private String hostedOn;
    private String dependsOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java

    private String os;
    private String service;
    private String application;
    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private String application;
    private String hostedOn;
    private String dependsOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String application;
    private String messaging;
    private String service;
    private String hostedOn;
    private String connectsTo;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String messaging;
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String server;
    private String application;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String server;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String server;
    private String application;
    private String messaging;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String server;
    private String application;
    private String messaging;
    private String service;
    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String messaging;
    private String service;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String hostedOn;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String server;
    private String application;
    private String hostedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String application;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String server;
    private String application;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String hostedOn;
    private String connectsTo;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String server;
    private String application;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String server;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String paas;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String iaas;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
    private final String namespace;
    private MultiException exception;
    private Map<String, String> prefix2Namespace;
    private FieldValidator validator;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
    public static final Logger LOGGER = LoggerFactory.getLogger(YamlBuilder.class);

    private final String namespace;
    private MultiException exception;
    private Map<String, String> prefix2Namespace;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> paasGraph;
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> iaasGraph;
    private AbstractTopology abstractTopology;
    private TNodeTemplate basisNodeTemplate;

```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String labelServer;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private PaaSTaxonomy paas = new PaaSTaxonomy();
    private IaaSTaxonomy iaas = new IaaSTaxonomy();
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> paasGraph;
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> iaasGraph;
    private AbstractTopology abstractTopology;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordApache;
    private String keywordTomcat;
    private String keywordMosquitto;
    private String keywordMongoDB;
    private String keywordMySQL;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private IaaSTaxonomy iaas = new IaaSTaxonomy();
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> paasGraph;
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> iaasGraph;
    private AbstractTopology abstractTopology;
    private TNodeTemplate basisNodeTemplate;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/InstanceModelRefinementPlugin.java`
#### Snippet
```java

        @JsonIgnore
        private final GraphMapping<ToscaNode, ToscaEdge> graphMapping;
        @JsonIgnore
        private final ToscaGraph detectorGraph;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/InstanceModelRefinementPlugin.java`
#### Snippet
```java
        private final GraphMapping<ToscaNode, ToscaEdge> graphMapping;
        @JsonIgnore
        private final ToscaGraph detectorGraph;

        public RefineableSubgraph(GraphMapping<ToscaNode, ToscaEdge> graphMapping, ToscaGraph detectorGraph,
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/InstanceModelRefinement.java`
#### Snippet
```java
    private final InstanceModelPluginChooser pluginChooser;
    private final List<InstanceModelRefinementPlugin> plugins;
    private final Map<QName, TNodeType> nodeTypes;

    public InstanceModelRefinement(InstanceModelPluginChooser chooser) {
```

### FieldCanBeLocal
Field can be converted to a local variable
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/DeployableComponents.java`
#### Snippet
```java
    private final Fileanalyzer analyzer;
    private final Map<Component, List<Pair<Component, Integer>>> foundComponents = new HashMap<>();
    private final int CRAWL_AT_ONCE = 1;
    private boolean crawlStatus = false;

```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `TRelationshipType.getSourceInterfaces()` is ignored
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/toscalight/ToscaLightChecker.java`
#### Snippet
```java
        // todo ?
        if (relType != null) {
            relType.getSourceInterfaces();
            relType.getTargetInterfaces();
        }
```

### IgnoreResultOfCall
Result of `TRelationshipType.getTargetInterfaces()` is ignored
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/toscalight/ToscaLightChecker.java`
#### Snippet
```java
        if (relType != null) {
            relType.getSourceInterfaces();
            relType.getTargetInterfaces();
        }
    }
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
                CommonTokenStream commonTokenStream = new CommonTokenStream(chefDSLLexer);
                chefDSLParser = new ChefDSLParser(commonTokenStream);
                file.delete();
                CodeInStringVisitor cookbookVisitor = new CodeInStringVisitor(parseResult);
                resolvedRubyCode = cookbookVisitor.visit(chefDSLParser.program());
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
                LOGGER.info("Parsing File : " + rbFilePath);
                extractedCookbookConfigs = compile(input, cookbookConfigs);
                file.delete();
            } catch (IOException e) {
                LOGGER.error("Can't read file! Filepath: " + rbFilePath);
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawledCookbooks.java`
#### Snippet
```java
        if (sourceFolder.isDirectory()) {
            if (!destinationFolder.exists()) {
                destinationFolder.mkdir();
            }

```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
            File parent = curfile.getParentFile();
            if (!parent.exists()) {
                parent.mkdirs();
            }
            IOUtils.copy(fin, new FileOutputStream(curfile));
```

### IgnoreResultOfCall
Result of `File.delete()` is ignored
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/FileUtils.java`
#### Snippet
```java
        }
        try {
            file.delete();
        } catch (SecurityException e) {
            logger.debug("Could not delete file", e.getMessage());
```

### IgnoreResultOfCall
Result of `File.mkdir()` is ignored
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/support/Utils.java`
#### Snippet
```java
        // create output directory if not exists
        final File folder = new File(outputFolder);
        folder.mkdir();

        // get the zipped file list entry
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/support/Utils.java`
#### Snippet
```java
                    unpackedFileList.add(entry.getName());
                    // create all non exists folders
                    new File(newFile.getParent()).mkdirs();

                    // fill file
```

### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/support/Utils.java`
#### Snippet
```java
                    }
                } else {
                    newFile.mkdirs();
                }

```

### IgnoreResultOfCall
Result of `Stream.reduce()` is ignored
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlWriter.java`
#### Snippet
```java
                // since indentation is done in printListObject
                .map(entry -> ((VisitorNode) entry).accept(this, new Parameter(0)))
                .reduce(printer, YamlPrinter::printListObject);
            printer.indent(-INDENT_SIZE);
        }
```

### IgnoreResultOfCall
Result of `Stream.collect()` is ignored
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            nodeTemplates.stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getParticipant(nt).get().equalsIgnoreCase(ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate)))
                .collect(Collectors.toList());
        }

```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTStayMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTRelationMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPermutationMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTBehaviorPatternMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTAttributeMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `setArtifactRef()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDeploymentArtifact.java`
#### Snippet
```java
    }

    public void setArtifactRef(@Nullable QName value) {
        this.artifactRef = value;
    }
```

### RedundantMethodOverride
Method `setArtifactRef()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TImplementationArtifact.java`
#### Snippet
```java
    }

    public void setArtifactRef(@Nullable QName value) {
        this.artifactRef = value;
    }
```

### RedundantMethodOverride
Method `getArtifactRef()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TImplementationArtifact.java`
#### Snippet
```java

    @Nullable
    public QName getArtifactRef() {
        return artifactRef;
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTBehaviorPatternMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTRelationMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTAttributeMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `accept()` is identical to its super method
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/OTStayMapping.java`
#### Snippet
```java

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
```

### RedundantMethodOverride
Method `visit()` is identical to its super method
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java

    @Override
    public Result visit(YTArtifactType node, Parameter parameter) {
        return null;
    }
```

### RedundantMethodOverride
Method `visit()` is identical to its super method
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java

    @Override
    public Result visit(YTArtifactType node, Parameter parameter) {
        return null;
    }
```

### RedundantMethodOverride
Method `getLoopCondition()` is identical to its super method
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java

    @Override
    public boolean getLoopCondition(TTopologyTemplate topology) {
        return true;
    }
```

### RedundantMethodOverride
Method `getLoopCondition()` is identical to its super method
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/ComponentPatternDetection.java`
#### Snippet
```java

    @Override
    public boolean getLoopCondition(TTopologyTemplate topology) {
        return true;
    }
```

## RuleId[id=DefaultAnnotationParam]
### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTArtifactType.java`
#### Snippet
```java
    
    // the following two fields are added to support YAML mode
    @XmlAttribute(name = "mimetype", required = false)
    private String mimeType;
    
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTArtifactType.java`
#### Snippet
```java
    private String mimeType;
    
    @XmlAttribute(name = "fileextensions", required = false)
    private List<String> fileExtensions;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TArtifactType.java`
#### Snippet
```java
public class TArtifactType extends TEntityType {
    // the following two fields are added to support YAML mode
    @XmlAttribute(name = "mimetype", required = false)
    private String mimeType;
    @XmlAttribute(name = "fileextensions", required = false)
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TArtifactType.java`
#### Snippet
```java
    @XmlAttribute(name = "mimetype", required = false)
    private String mimeType;
    @XmlAttribute(name = "fileextensions", required = false)
    private List<String> fileExtensions;

```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/NamespacesResource.java`
#### Snippet
```java
    @Produces(MediaType.APPLICATION_JSON)
    public List<NamespaceProperties> getNamespaces(
        @ApiParam(value = "if set all namespaces are returned otherwise the list will be filtered by disallowed namespaces", required = false) @QueryParam("all") String allNamespaces) {
        return this.namespaceManager.getAllNamespaces().entrySet().stream()
            .filter(entry -> {
```

### DefaultAnnotationParam
Redundant default parameter value assignment
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/ValidEndingsApiData.java`
#### Snippet
```java
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.ALWAYS)
public class ValidEndingsApiData {
    public ValidEndingsApiDataSet validSource;
```

## RuleId[id=ThrowFromFinallyBlock]
### ThrowFromFinallyBlock
`throw` inside 'finally' block
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/Bpmn4Tosca2Bpel.java`
#### Snippet
```java
                FileUtil.deleteFiles(planArtefactPaths);
            } catch (IOException e) {
                throw new PlanWriterException(e);
            }
        }
```

## RuleId[id=RegExpDuplicateCharacterInClass]
### RegExpDuplicateCharacterInClass
Duplicate character '0' inside character class
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
    // \\- is required
    private static final String RANGE_NCNAME_CHAR = RestUtils.RANGE_NCNAME_START_CHAR + "\\-\\.0-9\\u00b7\\u0300-\\u036f\\u203f-\\u2040";
    private static final String REGEX_INVALID_NCNAMES_CHAR = "[^" + RestUtils.RANGE_NCNAME_CHAR + "]";

    static {
```

### RegExpDuplicateCharacterInClass
Duplicate character 'F' inside character class
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
    // \\- is required
    private static final String RANGE_NCNAME_CHAR = RestUtils.RANGE_NCNAME_START_CHAR + "\\-\\.0-9\\u00b7\\u0300-\\u036f\\u203f-\\u2040";
    private static final String REGEX_INVALID_NCNAMES_CHAR = "[^" + RestUtils.RANGE_NCNAME_CHAR + "]";

    static {
```

### RegExpDuplicateCharacterInClass
Duplicate character '0' inside character class
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
    // stackoverflow: -dfff, standard: d7fff
    private static final String RANGE_NCNAME_START_CHAR = "A-Z_a-z\\u00C0\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02ff\\u0370-\\u037d" + "\\u037f-\\u1fff\\u200c\\u200d\\u2070-\\u218f\\u2c00-\\u2fef\\u3001-\\ud7ff" + "\\uf900-\\ufdcf\\ufdf0-\\ufffd\\x10000-\\xEFFFF";
    private static final String REGEX_NCNAME_START_CHAR = "[" + RestUtils.RANGE_NCNAME_START_CHAR + "]";

    // \\- is required
```

### RegExpDuplicateCharacterInClass
Duplicate character 'F' inside character class
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
    // stackoverflow: -dfff, standard: d7fff
    private static final String RANGE_NCNAME_START_CHAR = "A-Z_a-z\\u00C0\\u00D6\\u00D8-\\u00F6\\u00F8-\\u02ff\\u0370-\\u037d" + "\\u037f-\\u1fff\\u200c\\u200d\\u2070-\\u218f\\u2c00-\\u2fef\\u3001-\\ud7ff" + "\\uf900-\\ufdcf\\ufdf0-\\ufffd\\x10000-\\xEFFFF";
    private static final String REGEX_NCNAME_START_CHAR = "[" + RestUtils.RANGE_NCNAME_START_CHAR + "]";

    // \\- is required
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
Common part can be extracted from 'if'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/FileUtils.java`
#### Snippet
```java
                    @Override
                    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
                        if (exc == null) {
                            try {
                                Files.delete(dir);
```

## RuleId[id=SimplifyOptionalCallChains]
### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmExporter.java`
#### Snippet
```java

            EntityId relationsCollectionEntityId = sourceComponentEntityId.extend(DefaultKeys.RELATIONS);
            if (!entityGraph.getEntity(relationsCollectionEntityId).isPresent()) {
                entityGraph.addEntity(new SequenceEntity(relationsCollectionEntityId, entityGraph));
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmExporter.java`
#### Snippet
```java

    private EntityId createType(TEntityType toscaType, EntityId typeRoot, EntityGraph entityGraph) {
        if (!entityGraph.getEntity(typeRoot).isPresent()) {
            entityGraph.addEntity(new MappingEntity(typeRoot, entityGraph));
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java

        final Optional<XSModel> xsModelOptional = BackendUtils.getXSModel(ref, repository);
        if (!xsModelOptional.isPresent()) {
            LOGGER.error("no XSModel found");
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/xsd/RepositoryBasedXsdImportManager.java`
#### Snippet
```java

        Optional<RepositoryFileReference> ref = this.getXsdFileReference(id);
        if (!ref.isPresent()) {
            return Collections.emptyList();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/xsd/RepositoryBasedXsdImportManager.java`
#### Snippet
```java
        if (cacheNeedsUpdate) {
            final Optional<XSModel> model = BackendUtils.getXSModel(ref.get(), owner);
            if (!model.isPresent()) {
                return Collections.emptyList();
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/xsd/RepositoryBasedXsdImportManager.java`
#### Snippet
```java
            final List<String> allDefinedLocalNames = this.getAllDefinedLocalNames(namespace, getTypes);
            Optional<RepositoryFileReference> ref = getXsdFileReference(imp);
            if (!ref.isPresent()) {
                LOGGER.error("Ref is not defined");
            } else {
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            for (TNodeTemplate appSpecificComponent : appSpecificComponents) {
                for (TNodeTemplate successor : transitiveAndDirectSuccessors.get(appSpecificComponent)) {
                    if (!ModelUtilities.getTargetLabel(successor).isPresent() && ModelUtilities.getTargetLabel(appSpecificComponent).isPresent()) {
                        ModelUtilities.setTargetLabel(successor, ModelUtilities.getTargetLabel(appSpecificComponent).get());
                    }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            for (TNodeTemplate needHostNode : nodesToCheck) {
                Optional<String> label = ModelUtilities.getTargetLabel(needHostNode);
                if (!label.isPresent()) {
                    LOGGER.error("No target label present");
                    LOGGER.error("id " + needHostNode.getId());
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                List<TNodeTemplate> predecessorsOfReplacementCandidate = getHostedOnPredecessorsOfNodeTemplate(serviceTemplate.getTopologyTemplate(), replacementCandidate);
                Optional<String> label = ModelUtilities.getTargetLabel(replacementCandidate);
                if (!label.isPresent()) {
                    LOGGER.error("No target label present");
                    LOGGER.error("id " + replacementCandidate.getId());
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        //check if the highest level node templates have target labels assigned
        for (TNodeTemplate node : getNodeTemplatesWithoutIncomingHostedOnRelationships(serviceTemplate)) {
            if (!ModelUtilities.getTargetLabel(node).isPresent()) {
                return false;
            }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                for (TNodeTemplate predecessor : predecessors) {
                    Optional<String> targetLabel = ModelUtilities.getTargetLabel(predecessor);
                    if (!targetLabel.isPresent()) {
                        LOGGER.error("No target label present");
                        LOGGER.error("id " + predecessor.getId());
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/AdminTopResource.java`
#### Snippet
```java
        WorkspaceResponse workspace = mapper.readValue(response.getEntity().getContent(), WorkspaceResponse.class);
        Optional<Machine> machine = workspace.runtime.machines.values().stream().filter(x -> "theia-editor".equals(x.attributes.get("component"))).findFirst();
        if (!machine.isPresent()) {
            return Response.status(500, "Eclipse Che is not correctly configured").build();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/AdminTopResource.java`
#### Snippet
```java

        Optional<Server> runningServer = machine.get().servers.values().stream().filter(x -> x.status.equals("RUNNING")).findFirst();
        if (!runningServer.isPresent()) {
            return Response.status(500, "Eclipse Che is not correctly configured").build();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/imports/genericimports/GenericImportResource.java`
#### Snippet
```java
        Objects.requireNonNull(encodedFileName);
        final Optional<TImport> theImport = ImportUtils.getTheImport(RepositoryFactory.getRepository(), (GenericImportId) id);
        if (!theImport.isPresent()) {
            return Response.status(Status.NOT_FOUND).build();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/imports/xsdimports/XSDImportResource.java`
#### Snippet
```java
    public Response getXSD() {
        final Optional<String> location = ImportUtils.getLocation(RepositoryFactory.getRepository(), (GenericImportId) id);
        if (!location.isPresent()) {
            return Response.status(Status.NOT_FOUND).build();
        }
```

### SimplifyOptionalCallChains
Can be replaced with 'isEmpty()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/AbstractProxyAlgorithm.java`
#### Snippet
```java
            .findFirst();

        if (!connectsToRelation.isPresent()) {
            connectsToRelation = ModelUtilities.getOutgoingRelationshipTemplates(topology, secondComponent).stream()
                .filter(relationship -> ModelUtilities.isOfType(ToscaBaseTypes.connectsToRelationshipType, relationship.getType(), relationshipTypes))
```

## RuleId[id=SlowListContainsAll]
### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTListString.java`
#### Snippet
```java
    @Override
    public boolean containsAll(Collection<?> collection) {
        return list.containsAll(collection);
    }

```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/utils/ModelUtilities.java`
#### Snippet
```java
        if (second == null) second = new ArrayList<T>();

        return first.containsAll(second) && first.size() == second.size();
    }
}
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ToscaComplianceRuleMatcher.java`
#### Snippet
```java
        if (left.getTemplate().getPolicies() != null) {
            if (right.getTemplate().getPolicies() != null) {
                return mapToStringList(right.getTemplate().getPolicies())
                    .containsAll(
                        mapToStringList(left.getTemplate().getPolicies())
                    );
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java
                boolean unmappableRelationExists = refinementModel.getComponentSets().stream()
                    .noneMatch(componentSet ->
                        componentSet.getValues().containsAll(Arrays.asList(
                            unmappable.getSourceElement().getRef().getId(),
                            unmappable.getTargetElement().getRef().getId())));
```

### SlowListContainsAll
Call to 'list.containsAll(collection)' may have poor performance
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java

            refinementModel.getPermutationOptions()
                .removeIf(permutationOption -> !(permutationOption.getValues().containsAll(patternSet)
                    || permutationOption.getValues().stream().noneMatch(patternSet::contains))
                );
```

## RuleId[id=SimplifiableBooleanExpression]
### SimplifiableBooleanExpression
`(sourceTemplateProperties != null && !sourceTemplateProperties.keySet().stream().anyMatc...` can be simplified to 'sourceTemplateProperties == null\|\|!sourceTemplateProperties.keySet().stream().anyMatch(p -\> p.equals(inputParameter.getName()))'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                                                             Map<String, String> targetTemplateProperties, TParameter inputParameter) {
        PropertyDefinitionKV inputParamKV = new PropertyDefinitionKV(inputParameter.getName(), inputParameter.getType());
        if (!propertyDefinitionKVList.contains(inputParamKV) && ((sourceTemplateProperties != null &&
            !sourceTemplateProperties.keySet().stream().anyMatch(p -> p.equals(inputParameter.getName()))) ||
            sourceTemplateProperties == null)) {
            if ((targetTemplateProperties != null &&
                !targetTemplateProperties.keySet().stream().anyMatch(p -> p.equals(inputParameter.getName()))) ||
```

### SimplifiableBooleanExpression
`(targetTemplateProperties != null && !targetTemplateProperties.keySet().stream().any...` can be simplified to 'targetTemplateProperties == null\|\|!targetTemplateProperties.keySet().stream().anyMatch(p -\> p.equals(inputParameter.getName()))'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
            !sourceTemplateProperties.keySet().stream().anyMatch(p -> p.equals(inputParameter.getName()))) ||
            sourceTemplateProperties == null)) {
            if ((targetTemplateProperties != null &&
                !targetTemplateProperties.keySet().stream().anyMatch(p -> p.equals(inputParameter.getName()))) ||
                targetTemplateProperties == null) {
                propertyDefinitionKVList.add(inputParamKV);
                placeholderNodeTemplateProperties.put(inputParameter.getName(), "get_input: " + inputParameter.getName());
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `normalizedArtifactTemplates` are updated, but never queried
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmImporter.java`
#### Snippet
```java

    private final Map<QName, TArtifactTemplate> artifactTemplates;
    private final Map<String, Map.Entry<QName, TArtifactTemplate>> normalizedArtifactTemplates = new HashMap<>();

    private final Map<EdmmType, QName> edmmToToscaMap;
```

### MismatchedCollectionQueryUpdate
Contents of collection `nodeTemplateMap` are updated, but never queried
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
    private Map<String, List<TPolicy>> policies;
    private Map<String, Map.Entry<String, String>> relationshipSTMap;
    private Map<String, TNodeTemplate> nodeTemplateMap;
    private AssignmentBuilder assignmentBuilder;

```

### MismatchedCollectionQueryUpdate
Contents of collection `exceptions` are updated, but never queried
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/WriterUtils.java`
#### Snippet
```java

        CsarImporter csarImporter = new CsarImporter(repository);
        List<Exception> exceptions = new ArrayList<>();
        cleanDefinitions.getServiceTemplateOrNodeTypeOrNodeTypeImplementation().forEach(entry -> {
            String namespace = csarImporter.getNamespace(entry, definitions.getTargetNamespace());
```

### MismatchedCollectionQueryUpdate
Contents of collection `prefix2Namespace` are updated, but never queried
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
    private final String namespace;
    private MultiException exception;
    private Map<String, String> prefix2Namespace;
    private FieldValidator validator;

```

### MismatchedCollectionQueryUpdate
Contents of collection `incoming` are updated, but never queried
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private void getLowestNode(TNodeTemplate baseNodeTemplate, List<TRelationshipTemplate> tRelationshipTemplateList) {
        List<TRelationshipTemplate> outgoing = new ArrayList<>();
        List<TRelationshipTemplate> incoming = new ArrayList<>();
        for (TRelationshipTemplate tRelationshipTemplate : tRelationshipTemplateList) {
            if (baseNodeTemplate.equals((tRelationshipTemplate.getSourceElement().getRef()))) {
```

### MismatchedCollectionQueryUpdate
Contents of collection `requirementTypes` are updated, but never queried
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/Substitution.java`
#### Snippet
```java

    private final Map<QName, TServiceTemplate> nodeTypeSubstitutableWithServiceTemplate = new HashMap<>();
    private final Map<QName, TRequirementType> requirementTypes = new HashMap<>();
    private final Map<QName, TCapabilityType> capabilityTypes = new HashMap<>();

```

### MismatchedCollectionQueryUpdate
Contents of collection `capabilityTypes` are updated, but never queried
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/Substitution.java`
#### Snippet
```java
    private final Map<QName, TServiceTemplate> nodeTypeSubstitutableWithServiceTemplate = new HashMap<>();
    private final Map<QName, TRequirementType> requirementTypes = new HashMap<>();
    private final Map<QName, TCapabilityType> capabilityTypes = new HashMap<>();

    public ServiceTemplateId substituteTopologyOfServiceTemplate(final ServiceTemplateId serviceTemplateId) {
```

## RuleId[id=ConfusingMainMethod]
### ConfusingMainMethod
Method `main()` does not have signature 'public static void main(String\[\])'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
     * Main Method to extract deployment architectures from chef cookbooks.
     */
    public void main() {
        String[] availableCookbooks;
        String cookbookName;
```

## RuleId[id=DuplicateThrows]
### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jsonsupport/YesNo.java`
#### Snippet
```java

        @Override
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return jsonParser.getText().equalsIgnoreCase("YES");
        }
```

### DuplicateThrows
There is a more general exception, 'java.io.IOException', in the throws list already.
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jsonsupport/PropertiesDefinitionDeserializer.java`
#### Snippet
```java
    @Override
    public TEntityType.PropertiesDefinition deserialize(JsonParser parser, DeserializationContext context)
            throws IOException, JsonProcessingException {
        // read as ObjectNode to enable removing empty properties
        ObjectNode node = parser.getCodec().readTree(parser);
```

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+` in loop
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java

        while ((output = br.readLine()) != null) {
            responseString = responseString + output;
        }
        return responseString;
```

### StringConcatenationInLoops
String concatenation `+=` in loop
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            Optional<String> nodeOwner = ModelUtilities.getParticipant(tNodeTemplate);
            if (nodeOwner.isPresent() && nodeOwner.get().equalsIgnoreCase(participantName)) {
                choreoValue += tNodeTemplate.getId() + ",";
            }
        }
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        while (!uniqueID) {
            if (!ids.contains(id + counter)) {
                id = id + counter;
                uniqueID = true;
            } else {
```

### StringConcatenationInLoops
String concatenation `+` in loop
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        while (!uniqueID) {
            if (!ids.contains(id + newRequirementCounter)) {
                id = id + newRequirementCounter;
                newRequirementCounter++;
                uniqueID = true;
```

## RuleId[id=InfiniteRecursion]
### InfiniteRecursion
Method `remove()` recurses infinitely, and can only end by throwing an exception
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapPolicyDefinition.java`
#### Snippet
```java

    @Override
    public YTPolicyDefinition remove(Object key) {
        return remove(key);
    }
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `bufferLength` initializer `0` is redundant
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/HashingUtil.java`
#### Snippet
```java
        // buffer with a size of 1MB
        byte[] buffer = new byte[1048576];
        int bufferLength = 0;

        while ((bufferLength = content.read(buffer)) != -1) {
```

### UnusedAssignment
Variable `propertyAdded` initializer `false` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefPackage.java`
#### Snippet
```java
     */
    public boolean addProperty(String propertyName, String propertyValue) {
        Boolean propertyAdded = false;

        switch (propertyName) {
```

### UnusedAssignment
The value `attributeBegin` assigned to `attributeEnd` is never used
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
        while (containsAttribute) {
            attributeBegin = processString.indexOf("#{");
            attributeEnd = attributeBegin;

            result.append(processString.substring(0, attributeBegin));
```

### UnusedAssignment
The value `codeBegin` assigned to `codeEnd` is never used
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
        while (containsRubyCode) {
            codeBegin = processString.indexOf("#{");
            codeEnd = codeBegin;

            resultStringBuilder.append(processString.substring(0, codeBegin));
```

### UnusedAssignment
Variable `chefDSLParser` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
            rubyCode = processString.substring(2, codeEnd);

            ChefDSLParser chefDSLParser = null;
            try {
                File file = File.createTempFile("tempcodeinstringfile", ".tmp");
```

### UnusedAssignment
Variable `callArguments` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String operation;
        List<String> argumentList;
        List<String> callArguments = null;
        Boolean exprResult = false;

```

### UnusedAssignment
Variable `exprResult` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    @Override
    public Boolean visitArgPrimary(ChefDSLParser.ArgPrimaryContext ctx) {
        Boolean exprResult = null;
        String arg = null;
        if (ctx.primary().getClass() == ChefDSLParser.PrimCompstmtInBracketsContext.class) {
```

### UnusedAssignment
Variable `callArguments` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String operation;
        List<String> argumentList;
        List<String> callArguments = null;
        Boolean exprResult = false;

```

### UnusedAssignment
The value `ctx.primary().accept(primaryVisitor)` assigned to `argumentList` is never used
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        CallArgsVisitor callArgsVisitor = new CallArgsVisitor(parseResult);
        argumentList = ctx.primary().accept(primaryVisitor);

        argumentList = new ArrayList<>();
```

### UnusedAssignment
Variable `firstExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    @Override
    public Boolean visitArgOr(ChefDSLParser.ArgOrContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

```

### UnusedAssignment
Variable `secondExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    public Boolean visitArgOr(ChefDSLParser.ArgOrContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

        BooleanExprVisitor booleanExprVisitor = new BooleanExprVisitor(parseResult);
```

### UnusedAssignment
Variable `firstExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    @Override
    public Boolean visitArgAnd(ChefDSLParser.ArgAndContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

```

### UnusedAssignment
Variable `secondExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    public Boolean visitArgAnd(ChefDSLParser.ArgAndContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

        BooleanExprVisitor booleanExprVisitor = new BooleanExprVisitor(parseResult);
```

### UnusedAssignment
Variable `firstExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    @Override
    public Boolean visitExprOr(ChefDSLParser.ExprOrContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

```

### UnusedAssignment
Variable `secondExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    public Boolean visitExprOr(ChefDSLParser.ExprOrContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

        BooleanExprVisitor booleanExprVisitor = new BooleanExprVisitor(parseResult);
```

### UnusedAssignment
Variable `leftArgument` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    public Boolean visitArgIndexOf(ChefDSLParser.ArgIndexOfContext ctx) {
        Boolean exprResult = null;
        String leftArgument = null;
        String rightArgument = null;
        List<String> argList;
```

### UnusedAssignment
Variable `rightArgument` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        Boolean exprResult = null;
        String leftArgument = null;
        String rightArgument = null;
        List<String> argList;
        PrimaryBaseVisitor argPrimaryVisitor = new PrimaryBaseVisitor(parseResult);
```

### UnusedAssignment
Variable `firstExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    @Override
    public Boolean visitExprAnd(ChefDSLParser.ExprAndContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

```

### UnusedAssignment
Variable `secondExpr` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    public Boolean visitExprAnd(ChefDSLParser.ExprAndContext ctx) {
        Boolean firstExpr = null;
        Boolean secondExpr = null;

        BooleanExprVisitor booleanExprVisitor = new BooleanExprVisitor(parseResult);
```

### UnusedAssignment
Variable `inputStream` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java

        Yaml yaml = new Yaml();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(this.cookbookPath + "/kitchen.yml");
```

### UnusedAssignment
Variable `attributeValue` initializer `null` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitArgPrimary(ChefDSLParser.ArgPrimaryContext ctx) {
        List attributeValue = null;
        PrimaryBaseVisitor argPrimaryVisitor = new PrimaryBaseVisitor(extractedCookbookConfigs);
        attributeValue = ctx.primary().accept(argPrimaryVisitor);
```

### UnusedAssignment
Variable `cookbookDeprecated` initializer `false` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
     */
    private boolean processCookbook(JSONObject cookbookJSONObject, String cookbookName, String versionRestriction) throws Exception {
        boolean cookbookDeprecated = false;
        String extractedVersion;

```

### UnusedAssignment
Variable `cookbookDeprecated` initializer `false` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
     */
    private boolean processCookbook(JSONObject cookbookJSONObject) throws Exception {
        boolean cookbookDeprecated = false;

        cookbookDeprecated = cookbookJSONObject.getBoolean("deprecated");
```

### UnusedAssignment
The value `disposition.substring(index + 10,
disposition.length() - 1)` assigned to `fileName` is never used
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
                int index = disposition.indexOf("filename=");
                if (index > 0) {
                    fileName = disposition.substring(index + 10,
                        disposition.length() - 1);
                }
```

### UnusedAssignment
The value `filename.substring(fileName.lastIndexOf("/") + 1,
fileName.length())` assigned to `fileName` is never used
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
                }
            } else {
                fileName = filename.substring(fileName.lastIndexOf("/") + 1,
                    fileName.length());
            }
```

### UnusedAssignment
Variable `toCheckTemplate` initializer `null` is redundant
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java
	private TTopologyTemplate identifierTemplate = null;
	private TTopologyTemplate requiredStructureTemplate = null;
	private TTopologyTemplate toCheckTemplate = null;

	private ToscaGraph identifierGraph = null;
```

### UnusedAssignment
Variable `identifierTemplate` initializer `null` is redundant
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java
public class ComplianceRuleChecker {

	private TTopologyTemplate identifierTemplate = null;
	private TTopologyTemplate requiredStructureTemplate = null;
	private TTopologyTemplate toCheckTemplate = null;
```

### UnusedAssignment
Variable `requiredStructureTemplate` initializer `null` is redundant
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java

	private TTopologyTemplate identifierTemplate = null;
	private TTopologyTemplate requiredStructureTemplate = null;
	private TTopologyTemplate toCheckTemplate = null;

```

### UnusedAssignment
Variable `context` initializer `""` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/support/ExceptionInterpreter.java`
#### Snippet
```java
public class ExceptionInterpreter {
    public Exception interpret(ConstructorException e) {
        String context = "";
        if (e.getCause() instanceof MarkedYAMLException) {
            context = ((MarkedYAMLException) e.getCause()).getContext();
```

### UnusedAssignment
Variable `resolver` initializer `null` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
     */
    private void createRepository(RepositoryProperties repo) {
        IRepositoryResolver resolver = null;
        Optional<IRepositoryResolver> resolverOptional = RepositoryResolverFactory.getResolver(repo.getUrl(), repo.getBranch(), repo.getPatternAtlas(), repo.getUi());
        
```

### UnusedAssignment
Variable `participantNodes` initializer `new ArrayList<>()` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
    protected List<TNodeTemplate> getNodeTemplatesWithoutOutgoingHostedOnRelationships(TServiceTemplate
                                                                                           serviceTemplate) {
        List<TNodeTemplate> participantNodes = new ArrayList<>();
        List<TNodeTemplate> nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates().stream()
            .filter(nt -> getHostedOnSuccessorsOfNodeTemplate(serviceTemplate.getTopologyTemplate(), nt).isEmpty())
```

### UnusedAssignment
Variable `artifactTypes` initializer `new HashSet`() is redundant
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/CreateFromArtifactApiData.java`
#### Snippet
```java

public class CreateFromArtifactApiData {
    private Set<QName> artifactTypes = new HashSet<QName>();
    private Set<QName> infrastructureNodeTypes = new HashSet<QName>();

```

### UnusedAssignment
Variable `infrastructureNodeTypes` initializer `new HashSet`() is redundant
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/CreateFromArtifactApiData.java`
#### Snippet
```java
public class CreateFromArtifactApiData {
    private Set<QName> artifactTypes = new HashSet<QName>();
    private Set<QName> infrastructureNodeTypes = new HashSet<QName>();

    public CreateFromArtifactApiData(Set<QName> artifactTypes, Set<QName> infrastructureNodeTypes) {
```

### UnusedAssignment
Variable `subgraphDetector` initializer `null` is redundant
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/PlaceholderSubstitutionWebSocket.java`
#### Snippet
```java
                        TServiceTemplate serviceTemplate = RepositoryFactory.getRepository().getElement(new ServiceTemplateId(data.serviceTemplate));
                        PlaceholderSubstitutionElementApiData element = new PlaceholderSubstitutionElementApiData();
                        TTopologyTemplate subgraphDetector = null;
                        try {
                            subgraphDetector = this.getSubgraphDetector(serviceTemplate, data.selectedNodeTemplateIds);
```

### UnusedAssignment
Variable `method` initializer `null` is redundant
in `org.eclipse.winery.highlevelrestapi/src/main/java/org/eclipse/winery/highlevelrestapi/HighLevelRestApi.java`
#### Snippet
```java
        System.out.println("Setting URI to: \n");
        System.out.println(uri);
        GetMethod method = null;
        if (uri.contains("?")) {
            System.out.println("Found query trying to split");
```

### UnusedAssignment
Variable `method` initializer `null` is redundant
in `org.eclipse.winery.highlevelrestapi/src/main/java/org/eclipse/winery/highlevelrestapi/HighLevelRestApi.java`
#### Snippet
```java
    public static HttpResponseMessage Post(String uri, String requestPayload, String acceptHeaderValue) {

        PostMethod method = null;
        if (uri.contains("?")) {
            System.out.println("Found query trying to split");
```

### UnusedAssignment
Variable `daSpecifiedTopology` initializer `this.getTopology()` is redundant
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

        //Try Driver Injection
        TTopologyTemplate daSpecifiedTopology = this.getTopology();
        if (!DASpecification.getNodeTemplatesWithAbstractDAs(topologyTemplate).isEmpty() &&
            DASpecification.getNodeTemplatesWithAbstractDAs(topologyTemplate) != null) {
```

### UnusedAssignment
Variable `src` initializer `null` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/SortParser.java`
#### Snippet
```java
		}

		Node src = null;
		Node target = null;
		for (int i = 0; i < nodeList.size() - 1; i++) {
```

### UnusedAssignment
Variable `target` initializer `null` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/SortParser.java`
#### Snippet
```java

		Node src = null;
		Node target = null;
		for (int i = 0; i < nodeList.size() - 1; i++) {
			src = nodeList.get(i);
```

### UnusedAssignment
Variable `node` initializer `null` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/Bpmn4JsonParser.java`
#### Snippet
```java
        }

        Node node = null;
        String nodeType = jsonNode.get(JsonKeys.TYPE).asText();
        String nodeName = jsonNode.get(JsonKeys.NAME).asText();
```

### UnusedAssignment
Variable `param` initializer `null` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/Bpmn4JsonParser.java`
#### Snippet
```java
        LOGGER.debug("Parsing JSON parameter node with name '" + paramName + "', type '" + paramType + "' and value '" + paramValue + "'");

        Parameter param = null;
        switch (paramType) {
            case JsonKeys.PARAM_TYPE_VALUE_CONCAT:
```

## RuleId[id=TypeParameterExtendsObject]
### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/YTMapObject.java`
#### Snippet
```java

    @Override
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.map.putAll(map);
    }
```

### TypeParameterExtendsObject
Wildcard type argument `?` explicitly extends 'java.lang.Object'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlWriter.java`
#### Snippet
```java
    }

    private YamlPrinter printMapObject(String keyValue, Map<String, ? extends Object> map, Parameter parameter) {
        YamlPrinter printer = new YamlPrinter(parameter.getIndent());
        if (!map.isEmpty()) {
```

## RuleId[id=OptionalGetWithoutIsPresent]
### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmExporter.java`
#### Snippet
```java
                : relationshipTypes.get(inheritsFrom);
            parentEntityId = createType(parent, typeRoot, entityGraph);
            MappingEntity parentEntity = (MappingEntity) entityGraph.getEntity(parentEntityId).get();
            parentType = parentEntity.getName();
        } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/utils/ModelUtilities.java`
#### Snippet
```java
        if (serviceTemplate.getTags() != null &&
            serviceTemplate.getTags().stream().anyMatch(t -> t.getName().equals("participant"))) {
            return serviceTemplate.getTags().stream().filter(t -> t.getName().equals("participant")).findFirst().get().getValue();
        }
        return null;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/utils/ModelUtilities.java`
#### Snippet
```java

        return nodeTemplates.stream().filter(nt -> getParticipant(nt).isPresent())
            .filter(nt -> getParticipant(nt).get().equals(participantName)).collect(Collectors.toList());
    }

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
            LOGGER.error("no XSModel found");
        }
        XSModel xsModel = xsModelOptional.get();
        XSElementDeclaration elementDeclaration = xsModel.getElementDeclaration(element.getLocalPart(), element.getNamespaceURI());
        if (elementDeclaration == null) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/MinHosts.java`
#### Snippet
```java
            TNodeTemplate next = topLevelHost;
            // at this point all top level nts have been assigned target labels by TargetLabelAssignment
            String targetLabel = ModelUtilities.getTargetLabel(topology.getHostedOnPredecessors(topLevelHost).get(0)).get();
            List<TTopologyTemplate> possibleReplacementsForNT = null;

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/SplitByIds.java`
#### Snippet
```java

        for (TNodeTemplate nodeTemplate : topology.getTopLevelNTs()) {
            String targetLabel = ModelUtilities.getTargetLabel(nodeTemplate).get();
            originalTargetLabels.put(nodeTemplate.getId(), targetLabel);
            if (topLevelNTsToSplit.contains(nodeTemplate)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/MinExternalConnections.java`
#### Snippet
```java

                // external edge?
                String sourceTargetLabel = ModelUtilities.getTargetLabel(source).get();
                String targetTargetLabel = ModelUtilities.getTargetLabel(target).get();
                if (!sourceTargetLabel.equals(targetTargetLabel)) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/MinExternalConnections.java`
#### Snippet
```java
                // external edge?
                String sourceTargetLabel = ModelUtilities.getTargetLabel(source).get();
                String targetTargetLabel = ModelUtilities.getTargetLabel(target).get();
                if (!sourceTargetLabel.equals(targetTargetLabel)) {
                    externalRTsCount++;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            List<TNodeTemplate> NodesOfOtherParticipants = serviceTemplate.getTopologyTemplate().getNodeTemplates();
            NodesOfOtherParticipants.removeIf(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()));

            transitiveAndDirectSuccessors.remove(NodesOfOtherParticipants);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            if (!nodesWithMatchingCapability.isEmpty() && nodesWithMatchingCapability.size() == 1) {
                TCapability matchingCapability = nodesWithMatchingCapability.get(0).getCapabilities()
                    .stream().filter(c -> c.getType().equals(requiredCapTypeQName)).findFirst().get();
                TRelationshipType matchingRelationshipType =
                    getMatchingRelationshipType(requirement, matchingCapability);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            List<TNodeTemplate> appSpecificComponentsOfOtherParticipants = serviceTemplate.getTopologyTemplate().getNodeTemplates();
            appSpecificComponentsOfOtherParticipants.removeIf(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()));

            transitiveAndDirectSuccessors.remove(appSpecificComponentsOfOtherParticipants);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            participantNodes = nodeTemplates.stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getParticipant(nt).get().equalsIgnoreCase(ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate)))
                .collect(Collectors.toList());
            return participantNodes;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            if (nodeWithOpenCapability != null) {
                TCapability matchingCapability = nodeWithOpenCapability.getCapabilities()
                    .stream().filter(c -> c.getType().equals(requiredCapabilityTypeQName)).findFirst().get();
                TRelationshipType matchingRelationshipType =
                    getMatchingRelationshipType(requirement, matchingCapability);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            nodeTemplates.stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getParticipant(nt).get().equalsIgnoreCase(ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate)))
                .collect(Collectors.toList());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates().stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()))
                .collect(Collectors.toList());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .filter(nt -> nt.getRequirements() != null)
                .filter(nt -> nt.getRequirements().stream().anyMatch(req -> req.getId().equals(openRequirementId)))
                .findFirst().get();

            TRequirement openRequirement = nodeTemplateWithThisOpenReq.getRequirements().stream()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            TRequirement openRequirement = nodeTemplateWithThisOpenReq.getRequirements().stream()
                .filter(req -> req.getId().equals(openRequirementId)).findFirst().get();

            QName requiredCapabilityTypeQName = getRequiredCapabilityTypeQNameOfRequirement(openRequirement);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .filter(nt -> nt.getCapabilities() != null)
                .filter(nt -> nt.getCapabilities().stream()
                    .anyMatch(c -> c.getType().equals(requiredCapabilityTypeQName))).findFirst().get();
            TCapability matchingCapability = nodeWithOpenCapability.getCapabilities()
                .stream().filter(c -> c.getType().equals(requiredCapabilityTypeQName)).findFirst().get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    .anyMatch(c -> c.getType().equals(requiredCapabilityTypeQName))).findFirst().get();
            TCapability matchingCapability = nodeWithOpenCapability.getCapabilities()
                .stream().filter(c -> c.getType().equals(requiredCapabilityTypeQName)).findFirst().get();

            TRelationshipType matchingRelationshipType =
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            //TargetLable is only appended if not done yet
            if (outgoingRelationship.getId().contains(ModelUtilities.getTargetLabel(newSource).get())) {
                newOutgoingRelationship.setId(Util.makeNCName(outgoingRelationship.getId()));
                newOutgoingRelationship.setName(Util.makeNCName(outgoingRelationship.getName()));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                newOutgoingRelationship.setName(Util.makeNCName(outgoingRelationship.getName()));
            } else {
                newOutgoingRelationship.setId(Util.makeNCName(outgoingRelationship.getId() + "-" + ModelUtilities.getTargetLabel(newSource).get()));
                newOutgoingRelationship.setName(Util.makeNCName(outgoingRelationship.getName() + "-" + ModelUtilities.getTargetLabel(newSource).get()));
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            } else {
                newOutgoingRelationship.setId(Util.makeNCName(outgoingRelationship.getId() + "-" + ModelUtilities.getTargetLabel(newSource).get()));
                newOutgoingRelationship.setName(Util.makeNCName(outgoingRelationship.getName() + "-" + ModelUtilities.getTargetLabel(newSource).get()));
            }
            newOutgoingRel.add(newOutgoingRelationship);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            return nodeTemplates.stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getParticipant(nt).get().equalsIgnoreCase(ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate)))
                .collect(Collectors.toList());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            nodeTemplates = nodeTemplates.stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getParticipant(nt).get().equalsIgnoreCase(ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate)))
                .collect(Collectors.toList());
        }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                             */
                            TNodeTemplate sourceNodeTemplate = ModelUtilities.getSourceNodeTemplateOfRelationshipTemplate(serviceTemplateCopy.getTopologyTemplate(), incomingRelationship);
                            if (((ModelUtilities.getTargetLabel(sourceNodeTemplate).get()
                                .equalsIgnoreCase(ModelUtilities.getTargetLabel(duplicatedNode).get())
                                && getBaseRelationshipType(incomingRelationship.getType()).getQName().equals(ToscaBaseTypes.hostedOnRelationshipType))
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                            TNodeTemplate sourceNodeTemplate = ModelUtilities.getSourceNodeTemplateOfRelationshipTemplate(serviceTemplateCopy.getTopologyTemplate(), incomingRelationship);
                            if (((ModelUtilities.getTargetLabel(sourceNodeTemplate).get()
                                .equalsIgnoreCase(ModelUtilities.getTargetLabel(duplicatedNode).get())
                                && getBaseRelationshipType(incomingRelationship.getType()).getQName().equals(ToscaBaseTypes.hostedOnRelationshipType))
                                || !predecessors.contains(sourceNodeTemplate))) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    successorsOfNodeTemplate.add(nodeTemplates.stream()
                        .filter(nt -> nt.getCapabilities() != null)
                        .filter(nt -> nt.getCapabilities().stream().anyMatch(c -> c.getId().equals(targetElement.getId()))).findAny().get());
                }
            }
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            TRequirement openHostedOnRequirement = predecessorOfNewHost.getRequirements().stream()
                .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equals("Container"))
                .findAny().get();
            TNodeTemplate newMatchingNodeTemplate;
            TTopologyTemplate matchingTopologyFragment = injectNodes.get(predecessorOfNewHostId);
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .filter(nt -> nt.getCapabilities() != null)
                .filter(nt -> nt.getCapabilities().stream().anyMatch(cap -> cap.getType().equals(getRequiredCapabilityTypeQNameOfRequirement(openHostedOnRequirement))))
                .findFirst().get();
            LOGGER.debug("New host NodeTemplate: {}", newHostNodeTemplate.getId());

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .anyMatch(nt -> equalsWithDifferentId(nt, newHostNodeTemplate))) {
                newMatchingNodeTemplate = matching.stream()
                    .filter(nt -> equalsWithDifferentId(nt, newHostNodeTemplate)).findAny().get();
            } else {
                newMatchingNodeTemplate = newHostNodeTemplate;
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/InterfacesResource.java`
#### Snippet
```java
                            .filter(node -> node.getId().contentEquals(nodeRef))
                            .findFirst()
                            .get();
                    exportedOperation.getNodeOperation().setNodeRef(nodeTemplate);
                } else if (exportedOperation.getRelationshipOperation() != null) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/InterfacesResource.java`
#### Snippet
```java
                            .filter(relationship -> relationship.getId().contentEquals(relationshipRef))
                            .findFirst()
                            .get();
                    exportedOperation.getRelationshipOperation().setRelationshipRef(relationshipTemplate);
                } else if (exportedOperation.getPlan() != null) {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/InterfacesResource.java`
#### Snippet
```java
                            .filter(relationship -> relationship.getId().contentEquals(planRef))
                            .findFirst()
                            .get();
                    exportedOperation.getPlan().setPlanRef(planTemplate);
                } else {
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java
        TEntityTemplate detectorElement = prm.getStayMappings().stream()
            .filter(stayMapping -> stayMapping.getRefinementElement().getId().equals(refinementElement.getId()))
            .findFirst().get()
            .getDetectorElement();
        ToscaEntity detectorEntity = refinement.getDetectorGraph().getVertexOrEdge(detectorElement.getId()).get();
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java
            .findFirst().get()
            .getDetectorElement();
        ToscaEntity detectorEntity = refinement.getDetectorGraph().getVertexOrEdge(detectorElement.getId()).get();
        TEntityTemplate stayingElement = getEntityCorrespondence(detectorEntity, refinement.getGraphMapping());

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java
            .forEach(bpm -> {
                ToscaEntity detectorElement = refinement.getDetectorGraph()
                    .getVertexOrEdge(bpm.getDetectorElement().getId()).get();
                TEntityTemplate candidateElement = getEntityCorrespondence(detectorElement, refinement.getGraphMapping());

```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java
                        TPolicy behaviorPattern = ((HasPolicies) refinementElement).getPolicies().stream()
                            .filter(policy -> bpm.getBehaviorPattern().equals(policy.getName()))
                            .findFirst().get();
                        addedElementPolicies
                            .removeIf(policy -> policy.getPolicyType().equals(behaviorPattern.getPolicyType()));
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
                        .stream()
                        .filter(r -> Splitting.getBaseRelationshipType(r.getType()).getQName().equals(ToscaBaseTypes.hostedOnRelationshipType))
                        .findFirst().get();

                    TNodeTemplate correspondingNode = substitution.getServiceTemplateCandidate().getTopologyTemplate()
```

### OptionalGetWithoutIsPresent
`Optional.get()` without 'isPresent()' check
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
                        .stream()
                        .filter(r -> Splitting.getBaseRelationshipType(r.getType()).getQName().equals(ToscaBaseTypes.hostedOnRelationshipType))
                        .findFirst().get();
                    TNodeTemplate directHostedOnSuccessor = ModelUtilities.getTargetNodeTemplateOfRelationshipTemplate(substitutionTemplate, outgoingRelationship);
                    //TODO: Fix for use case - participant must be propagated to all following nodes as well 
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `key != null` is always `true`
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPropertyKV.java`
#### Snippet
```java
        XOTPropertyKV that = (XOTPropertyKV) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }
```

### ConstantValue
Condition `value != null` is always `true`
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTPropertyKV.java`
#### Snippet
```java

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

```

### ConstantValue
Condition `getOccurrences() == null` is always `false`
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTCapabilityDefinition.java`
#### Snippet
```java
    @NonNull
    public Integer getLowerBound() {
        if (getOccurrences() == null || getOccurrences().isEmpty()) {
            return 1;
        } else {
```

### ConstantValue
Condition `getOccurrences() == null` is always `false`
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTCapabilityDefinition.java`
#### Snippet
```java
    @NonNull
    public String getUpperBound() {
        if (getOccurrences() == null || getOccurrences().size() <= 1) {
            return "1";
        } else {
```

### ConstantValue
Condition `key != null` is always `true`
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/OTPropertyKV.java`
#### Snippet
```java
        OTPropertyKV that = (OTPropertyKV) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }
```

### ConstantValue
Condition `value != null` is always `true`
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/OTPropertyKV.java`
#### Snippet
```java

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return value != null ? value.equals(that.value) : that.value == null;
    }

```

### ConstantValue
Condition `!platformFound` is always `true`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
                        
                    case -1:
                        if (!platformFound && (countChefCookbookConfigurations == cookbookConfigurationList.size() - 1)) {
                            index = platformNames.get(countPlatformNames).indexOf("-");
                            if (index == -1) {
```

### ConstantValue
Value `condition` is always 'false'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/AssignAttributeVisitor.java`
#### Snippet
```java
            if (condition == true) {
                chefAttribute.addAttribute((ArrayList<String>) ifValue);
            } else if (condition == false) {
                chefAttribute.addAttribute((ArrayList<String>) elseValue);
            }
```

### ConstantValue
Condition `argumentList != null` is always `true`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        argumentList = new ArrayList<>();
        argumentList.add("das müsste false sein");
        if (argumentList != null && argumentList.size() == 1) {
            argument = argumentList.get(0);
            if (ctx.function() != null && ctx.function().call_args() != null) {
```

### ConstantValue
Condition `argumentList != null && argumentList.size() == 1` is always `true`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        argumentList = new ArrayList<>();
        argumentList.add("das müsste false sein");
        if (argumentList != null && argumentList.size() == 1) {
            argument = argumentList.get(0);
            if (ctx.function() != null && ctx.function().call_args() != null) {
```

### ConstantValue
Condition `argumentList.size() == 1` is always `true` when reached
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        argumentList = new ArrayList<>();
        argumentList.add("das müsste false sein");
        if (argumentList != null && argumentList.size() == 1) {
            argument = argumentList.get(0);
            if (ctx.function() != null && ctx.function().call_args() != null) {
```

### ConstantValue
Result of `fileName.lastIndexOf("/") + 1` is always '0'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
                }
            } else {
                fileName = filename.substring(fileName.lastIndexOf("/") + 1,
                    fileName.length());
            }
```

### ConstantValue
Result of `fileName.length()` is always '0'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
            } else {
                fileName = filename.substring(fileName.lastIndexOf("/") + 1,
                    fileName.length());
            }

```

### ConstantValue
Condition `propertyDefinition.getRequired() != null` is always `true`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/SchemaBuilder.java`
#### Snippet
```java
            element.setAttribute("type", "pfx0:" + type.getLocalPart());
        }
        if (propertyDefinition.getRequired() != null && !propertyDefinition.getRequired()) {
            element.setAttribute("minOccurs", "0");
        }
```

### ConstantValue
Condition `node.getNamespaceUri() == null` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java
    @Override
    public Result visit(YTImportDefinition node, Parameter parameter) {
        if (node.getNamespaceUri() == null && !parameter.reference.getNamespaceURI().equals(Namespaces.DEFAULT_YAML_NS)) {
            return null;
        }
```

### ConstantValue
Condition `node.getNamespaceUri() == null && !parameter.reference.getNamespaceURI().equals(Namespaces.DEFAULT_Y...` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java
    @Override
    public Result visit(YTImportDefinition node, Parameter parameter) {
        if (node.getNamespaceUri() == null && !parameter.reference.getNamespaceURI().equals(Namespaces.DEFAULT_YAML_NS)) {
            return null;
        }
```

### ConstantValue
Condition `node.getNamespaceUri() == null` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java
        }

        String namespace = node.getNamespaceUri() == null ? Namespaces.DEFAULT_YAML_NS : node.getNamespaceUri();
        if (!this.visitors.containsKey(node)) {
            try {
```

### ConstantValue
Condition `node.getNamespaceUri() == null` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java
    @Override
    public Result visit(YTImportDefinition node, Parameter parameter) {
        if (node.getNamespaceUri() == null && !parameter.reference.getNamespaceURI().equals(Namespaces.DEFAULT_YAML_NS)) {
            return null;
        }
```

### ConstantValue
Condition `node.getNamespaceUri() == null && !parameter.reference.getNamespaceURI().equals(Namespaces.DEFAULT_Y...` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java
    @Override
    public Result visit(YTImportDefinition node, Parameter parameter) {
        if (node.getNamespaceUri() == null && !parameter.reference.getNamespaceURI().equals(Namespaces.DEFAULT_YAML_NS)) {
            return null;
        }
```

### ConstantValue
Condition `node.getNamespaceUri() == null` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java
        }

        String namespace = node.getNamespaceUri() == null ? Namespaces.DEFAULT_YAML_NS : node.getNamespaceUri();
        if (!this.visitors.containsKey(node)) {
            try {
```

### ConstantValue
Condition `documentation != null` is always `true`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/SelfServiceMetaDataUtils.java`
#### Snippet
```java
        app.setDisplayName(serviceTemplate.getName());
        List<TDocumentation> documentation = serviceTemplate.getDocumentation();
        if ((documentation != null) && (!documentation.isEmpty())) {
            TDocumentation doc = documentation.get(0);
            List<Object> content = doc.getContent();
```

### ConstantValue
Condition `content != null` is always `true`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/SelfServiceMetaDataUtils.java`
#### Snippet
```java
            TDocumentation doc = documentation.get(0);
            List<Object> content = doc.getContent();
            if ((content != null) && (!content.isEmpty())) {
                app.setDescription(content.get(0).toString());
            }
```

### ConstantValue
Method reference result is always 'true'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/ImportUtils.java`
#### Snippet
```java

    public static Optional<String> getLocation(IRepository repository, GenericImportId id) {
        return getTheImport(repository, id).map(TImport::getLocation).filter(Objects::nonNull);
    }
}
```

### ConstantValue
Condition `v instanceof YTRequirementDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                    V v = entry.getValue();
                    assert (v instanceof YTImportDefinition ||
                        v instanceof YTRequirementDefinition ||
                        v instanceof YTRequirementAssignment);
                    return null;
```

### ConstantValue
Condition `v instanceof YTRequirementAssignment` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                    assert (v instanceof YTImportDefinition ||
                        v instanceof YTRequirementDefinition ||
                        v instanceof YTRequirementAssignment);
                    return null;
                }
```

### ConstantValue
Condition `v instanceof YTRelationshipType` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                    V v = entry.getValue();
                    System.err.println(v);
                    assert (v instanceof YTRelationshipType ||
                        v instanceof YTRelationshipTemplate ||
                        v instanceof YTArtifactType ||
```

### ConstantValue
Condition `v instanceof YTRelationshipType || v instanceof YTRelationshipTemplate || ...` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                    V v = entry.getValue();
                    System.err.println(v);
                    assert (v instanceof YTRelationshipType ||
                        v instanceof YTRelationshipTemplate ||
                        v instanceof YTArtifactType ||
                        v instanceof YTArtifactDefinition ||
                        v instanceof YTCapabilityType ||
                        v instanceof YTCapabilityDefinition ||
                        v instanceof YTCapabilityAssignment ||
                        v instanceof YTPolicyType ||
                        v instanceof YTRequirementDefinition ||
                        //v instanceof TInterfaceType ||
                        v instanceof YTInterfaceDefinition ||
                        v instanceof YTOperationDefinition ||
                        v instanceof YTNodeTemplate ||
                        v instanceof YTGroupType ||
                        v instanceof YTNodeType ||
                        v instanceof YTImportDefinition ||
                        v instanceof YTPolicyDefinition
                    );
                    return null;
```

### ConstantValue
Condition `v instanceof YTRelationshipTemplate` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                    System.err.println(v);
                    assert (v instanceof YTRelationshipType ||
                        v instanceof YTRelationshipTemplate ||
                        v instanceof YTArtifactType ||
                        v instanceof YTArtifactDefinition ||
```

### ConstantValue
Condition `v instanceof YTArtifactType` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                    assert (v instanceof YTRelationshipType ||
                        v instanceof YTRelationshipTemplate ||
                        v instanceof YTArtifactType ||
                        v instanceof YTArtifactDefinition ||
                        v instanceof YTCapabilityType ||
```

### ConstantValue
Condition `v instanceof YTArtifactDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTRelationshipTemplate ||
                        v instanceof YTArtifactType ||
                        v instanceof YTArtifactDefinition ||
                        v instanceof YTCapabilityType ||
                        v instanceof YTCapabilityDefinition ||
```

### ConstantValue
Condition `v instanceof YTCapabilityType` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTArtifactType ||
                        v instanceof YTArtifactDefinition ||
                        v instanceof YTCapabilityType ||
                        v instanceof YTCapabilityDefinition ||
                        v instanceof YTCapabilityAssignment ||
```

### ConstantValue
Condition `v instanceof YTCapabilityDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTArtifactDefinition ||
                        v instanceof YTCapabilityType ||
                        v instanceof YTCapabilityDefinition ||
                        v instanceof YTCapabilityAssignment ||
                        v instanceof YTPolicyType ||
```

### ConstantValue
Condition `v instanceof YTCapabilityAssignment` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTCapabilityType ||
                        v instanceof YTCapabilityDefinition ||
                        v instanceof YTCapabilityAssignment ||
                        v instanceof YTPolicyType ||
                        v instanceof YTRequirementDefinition ||
```

### ConstantValue
Condition `v instanceof YTPolicyType` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTCapabilityDefinition ||
                        v instanceof YTCapabilityAssignment ||
                        v instanceof YTPolicyType ||
                        v instanceof YTRequirementDefinition ||
                        //v instanceof TInterfaceType ||
```

### ConstantValue
Condition `v instanceof YTRequirementDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTCapabilityAssignment ||
                        v instanceof YTPolicyType ||
                        v instanceof YTRequirementDefinition ||
                        //v instanceof TInterfaceType ||
                        v instanceof YTInterfaceDefinition ||
```

### ConstantValue
Condition `v instanceof YTInterfaceDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTRequirementDefinition ||
                        //v instanceof TInterfaceType ||
                        v instanceof YTInterfaceDefinition ||
                        v instanceof YTOperationDefinition ||
                        v instanceof YTNodeTemplate ||
```

### ConstantValue
Condition `v instanceof YTOperationDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        //v instanceof TInterfaceType ||
                        v instanceof YTInterfaceDefinition ||
                        v instanceof YTOperationDefinition ||
                        v instanceof YTNodeTemplate ||
                        v instanceof YTGroupType ||
```

### ConstantValue
Condition `v instanceof YTNodeTemplate` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTInterfaceDefinition ||
                        v instanceof YTOperationDefinition ||
                        v instanceof YTNodeTemplate ||
                        v instanceof YTGroupType ||
                        v instanceof YTNodeType ||
```

### ConstantValue
Condition `v instanceof YTGroupType` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTOperationDefinition ||
                        v instanceof YTNodeTemplate ||
                        v instanceof YTGroupType ||
                        v instanceof YTNodeType ||
                        v instanceof YTImportDefinition ||
```

### ConstantValue
Condition `v instanceof YTNodeType` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTNodeTemplate ||
                        v instanceof YTGroupType ||
                        v instanceof YTNodeType ||
                        v instanceof YTImportDefinition ||
                        v instanceof YTPolicyDefinition
```

### ConstantValue
Condition `v instanceof YTImportDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTGroupType ||
                        v instanceof YTNodeType ||
                        v instanceof YTImportDefinition ||
                        v instanceof YTPolicyDefinition
                    );
```

### ConstantValue
Condition `v instanceof YTPolicyDefinition` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        v instanceof YTNodeType ||
                        v instanceof YTImportDefinition ||
                        v instanceof YTPolicyDefinition
                    );
                    return null;
```

### ConstantValue
Condition `Objects.isNull(definition.getFile())` is always `false` when reached
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java

    public YTServiceTemplate readImportDefinition(YTImportDefinition definition, Path path, String namespace) throws MultiException {
        if (Objects.isNull(definition) || Objects.isNull(definition.getFile())) return null;
        String importNamespace = definition.getNamespaceUri() == null ? namespace : definition.getNamespaceUri();
        if (Objects.nonNull(definition.getRepository())) {
```

### ConstantValue
Condition `definition.getNamespaceUri() == null` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java
    public YTServiceTemplate readImportDefinition(YTImportDefinition definition, Path path, String namespace) throws MultiException {
        if (Objects.isNull(definition) || Objects.isNull(definition.getFile())) return null;
        String importNamespace = definition.getNamespaceUri() == null ? namespace : definition.getNamespaceUri();
        if (Objects.nonNull(definition.getRepository())) {
            // TODO Support Repositories
```

### ConstantValue
Condition `node.getNamespaceUri() == null` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/ImportVisitor.java`
#### Snippet
```java
    public Result visit(YTImportDefinition node, Parameter parameter) {
        YamlReader reader = new YamlReader();
        String importNamespace = node.getNamespaceUri() == null ? this.namespace : node.getNamespaceUri();
        try {
            YTServiceTemplate serviceTemplate = reader.parse(node, path, importNamespace);
```

### ConstantValue
Condition `Objects.nonNull(node.getOperations())` is always `true`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/Validator.java`
#### Snippet
```java
    @Override
    public Result visit(YTInterfaceType node, Parameter parameter) {
        if (Objects.nonNull(node.getOperations())) {
            for (Map.Entry<String, YTOperationDefinition> entry : node.getOperations().entrySet()) {
                if (Objects.nonNull(entry.getValue().getImplementation())) {
```

### ConstantValue
Condition `Objects.isNull(node.getToscaDefinitionsVersion())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/Validator.java`
#### Snippet
```java
    @Override
    public Result visit(YTServiceTemplate node, Parameter parameter) {
        if (Objects.isNull(node.getToscaDefinitionsVersion())) {
            setException(new UndefinedToscaVersion(
                    "The field 'tosca_definition_version' is undefined"
```

### ConstantValue
Condition `Objects.isNull(node.getFile())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/Validator.java`
#### Snippet
```java
    @Override
    public Result visit(YTImportDefinition node, Parameter parameter) {
        if (Objects.isNull(node.getFile()) || node.getFile().isEmpty()) {
            setException(new UndefinedFile("Field 'file' is undefined")
                .setContext(parameter.getContext())
```

### ConstantValue
Condition `Objects.isNull(node.getUrl())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/Validator.java`
#### Snippet
```java
        if (Objects.isNull(node)) return null;

        if (Objects.isNull(node.getUrl()) || node.getUrl().isEmpty()) {
            setException(new UndefinedRequiredKeyname("Field 'url' is required")
                .setContext(parameter.getContext())
```

### ConstantValue
Condition `Objects.isNull(node.getType())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeValidator.java`
#### Snippet
```java
    @Override
    public Result visit(YTRelationshipTemplate node, Parameter parameter) {
        if (Objects.isNull(node.getType())) {
            setInvalidDefinition(parameter);
        } else {
```

### ConstantValue
Condition `Objects.isNull(node.getType())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeValidator.java`
#### Snippet
```java
    @Override
    public Result visit(YTGroupDefinition node, Parameter parameter) {
        if (Objects.isNull(node.getType())) {
            setInvalidDefinition(parameter);
        } else {
```

### ConstantValue
Condition `Objects.isNull(entrySchema.getType())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeValidator.java`
#### Snippet
```java
                        type.getLocalPart()
                    ).setContext(parameter.getContext()));
                } else if (Objects.isNull(entrySchema.getType())) {
                    setInvalidDefinition(parameter.copy().addContext("entry_schema"));
                } else {
```

### ConstantValue
Condition `Objects.isNull(node.getType())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeValidator.java`
#### Snippet
```java
    @Override
    public Result visit(YTPolicyDefinition node, Parameter parameter) {
        if (Objects.isNull(node.getType())) {
            setInvalidDefinition(parameter);
        } else {
```

### ConstantValue
Condition `Objects.isNull(node.getType())` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeValidator.java`
#### Snippet
```java
    @Override
    public Result visit(YTNodeTemplate node, Parameter parameter) {
        if (Objects.isNull(node.getType())) {
            setInvalidDefinition(parameter);
        } else {
```

### ConstantValue
Condition `!".git".equals(file.getName()) || !defaultRepositoryFolder.equals(file.getName())` is always `true`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/TenantRepository.java`
#### Snippet
```java
        if (files != null) {
            for (File file : files) {
                if (!".git".equals(file.getName()) || !defaultRepositoryFolder.equals(file.getName())) {
                    initTenantRepository(file.getName());
                }
```

### ConstantValue
Condition `!defaultRepositoryFolder.equals(file.getName())` is always `true` when reached
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/TenantRepository.java`
#### Snippet
```java
        if (files != null) {
            for (File file : files) {
                if (!".git".equals(file.getName()) || !defaultRepositoryFolder.equals(file.getName())) {
                    initTenantRepository(file.getName());
                }
```

### ConstantValue
Condition `"supported".equals(status)` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
                return YTStatusValue.deprecated;
            default:
                assert ("supported".equals(status) ||
                    "unsupported".equals(status) ||
                    "experimental".equals(status) ||
```

### ConstantValue
Condition `"supported".equals(status) || "unsupported".equals(status) || ...` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
                return YTStatusValue.deprecated;
            default:
                assert ("supported".equals(status) ||
                    "unsupported".equals(status) ||
                    "experimental".equals(status) ||
                    "deprecated".equals(status));
                return null;
        }
```

### ConstantValue
Condition `"unsupported".equals(status)` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
            default:
                assert ("supported".equals(status) ||
                    "unsupported".equals(status) ||
                    "experimental".equals(status) ||
                    "deprecated".equals(status));
```

### ConstantValue
Condition `"experimental".equals(status)` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
                assert ("supported".equals(status) ||
                    "unsupported".equals(status) ||
                    "experimental".equals(status) ||
                    "deprecated".equals(status));
                return null;
```

### ConstantValue
Condition `"deprecated".equals(status)` is always `false`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
                    "unsupported".equals(status) ||
                    "experimental".equals(status) ||
                    "deprecated".equals(status));
                return null;
        }
```

### ConstantValue
Condition `imports != null` is always `true`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
                    List<TImport> imports = newDefs.getImport();
                    boolean found = false;
                    if (imports != null) {
                        Iterator<TImport> iterator = imports.iterator();
                        TImport imp;
```

### ConstantValue
Condition `topologyTemplate.getRelationshipTemplates() != null` is always `true`
in `org.eclipse.winery.topologygraph/src/main/java/org/eclipse/winery/topologygraph/transformation/ToscaTransformer.java`
#### Snippet
```java
            graph.addVertex(node);
        }
        if (topologyTemplate.getRelationshipTemplates() != null) {
            List<TRelationshipTemplate> relationshipTemplates = topologyTemplate.getRelationshipTemplates();
            for (TRelationshipTemplate tRelationshipTemplate : relationshipTemplates) {
```

### ConstantValue
Condition `availableMatchingRelationshipTypes.size() > 1` is always `true` when reached
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() == 1) {
                    return availableMatchingRelationshipTypes.get(0);
                } else if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() > 1) {
                    return null;
                } else if (requirementType.getDerivedFrom() != null || capabilityType.getDerivedFrom() != null) {
```

### ConstantValue
Condition `availableMatchingRelationshipTypes.size() > 1` is always `true` when reached
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() == 1) {
                        return availableMatchingRelationshipTypes.get(0);
                    } else if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() > 1) {
                        return null;
                    }
```

### ConstantValue
Value `matchingRelationshipType` is always 'null'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            }
        }
        return matchingRelationshipType;
    }

```

### ConstantValue
Condition `Objects.nonNull(node.getOtherAttributes())` is always `true`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
    private boolean hasTargetLabels(TTopologyTemplate topologyTemplate) {
        return topologyTemplate.getNodeTemplates().stream()
            .allMatch(node -> Objects.nonNull(node.getOtherAttributes())
                && Objects.nonNull(node.getOtherAttributes().get(ModelUtilities.QNAME_LOCATION)));
    }
```

### ConstantValue
Condition `validSource.getTypeRef() == null` is always `false` when reached
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/relationshiptypes/RelationshipTypeResource.java`
#### Snippet
```java
        //ToDo enable validSource as RequirementType (not-yet-implemented)
        ValidSource validSource;
        if (((validSource = this.getRelationshipType().getValidSource()) == null) || (validSource.getTypeRef() == null)) {
            validEndingsData.validSource = null;
        } else {
```

### ConstantValue
Condition `validTarget.getTypeRef() == null` is always `false` when reached
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/relationshiptypes/RelationshipTypeResource.java`
#### Snippet
```java
        // ToDo enable validTarget as CapabilityType (not-yet-implemented)
        ValidTarget validTarget;
        if (((validTarget = this.getRelationshipType().getValidTarget()) == null) || (validTarget.getTypeRef() == null)) {
            validEndingsData.validTarget = null;
        } else {
```

### ConstantValue
Condition `nt == null` is always `false`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/ExportedOperationResource.java`
#### Snippet
```java
        if (this.o.getNodeOperation() != null) {
            TNodeTemplate nt = (TNodeTemplate) this.o.getNodeOperation().getNodeRef();
            if (nt == null) {
                return null;
            }
```

### ConstantValue
Condition `rt == null` is always `false`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/ExportedOperationResource.java`
#### Snippet
```java
        } else if (this.o.getRelationshipOperation() != null) {
            TRelationshipTemplate rt = (TRelationshipTemplate) this.o.getRelationshipOperation().getRelationshipRef();
            if (rt == null) {
                return null;
            }
```

### ConstantValue
Condition `plan == null` is always `false`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/ExportedOperationResource.java`
#### Snippet
```java
        } else if (this.o.getPlan() != null) {
            TPlan plan = (TPlan) this.o.getPlan().getPlanRef();
            if (plan == null) {
                return null;
            }
```

### ConstantValue
Condition `sourceNodeTypeInterfaces != null` is always `true`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                if (allInterfaces != null && allInterfaces.isEmpty()) {
                    List<TInterface> sourceNodeTypeInterfaces = allInterfaces.stream().filter(tInterface -> !tInterface.getIdFromIdOrNameField().contains("connect")).collect(Collectors.toList());
                    if (sourceNodeTypeInterfaces != null) {
                        for (TInterface tInterface : sourceNodeTypeInterfaces) {
                            // TODO: make this more safe
```

### ConstantValue
Condition `hostInjectionSelections != null` is always `true`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        TTopologyTemplate matchedConnectedTopologyTemplate;

        if (hostInjectionSelections != null && !hostInjectionSelections.isEmpty()) {
            matchedHostsTopologyTemplate = splitting.injectNodeTemplates(this.getServiceTemplate().getTopologyTemplate(), hostInjectionSelections, InjectRemoval.REMOVE_REPLACED_AND_SUCCESSORS);

```

### ConstantValue
Condition `connectionInjectionSelections != null` is always `true`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
            matchedHostsTopologyTemplate = splitting.injectNodeTemplates(this.getServiceTemplate().getTopologyTemplate(), hostInjectionSelections, InjectRemoval.REMOVE_REPLACED_AND_SUCCESSORS);

            if (connectionInjectionSelections != null && !connectionInjectionSelections.isEmpty()) {
                matchedConnectedTopologyTemplate = splitting.injectConnectionNodeTemplates(matchedHostsTopologyTemplate, connectionInjectionSelections);
            } else {
```

### ConstantValue
Condition `connectionInjectionSelections != null` is always `true`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                matchedConnectedTopologyTemplate = matchedHostsTopologyTemplate;
            }
        } else if (connectionInjectionSelections != null && !connectionInjectionSelections.isEmpty()) {
            matchedConnectedTopologyTemplate = splitting.injectConnectionNodeTemplates(this.getServiceTemplate().getTopologyTemplate(), connectionInjectionSelections);
        } else {
```

## RuleId[id=StringConcatenationInsideStringBufferAppend]
### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ServiceTemplateComplianceRuleRuleChecker.java`
#### Snippet
```java
                    if (graphMappings.size() > 0) {
                        result.getUnsatisfied().add(ruleId.getQName());
                        checkingResult.append(ruleId.getQName().toString() + " violated:");
                        checkingResult.append(System.lineSeparator());
                        for (GraphMapping mapping : graphMappings) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ServiceTemplateComplianceRuleRuleChecker.java`
#### Snippet
```java
                    } else {
                        result.getSatisfied().add(ruleId.getQName());
                        checkingResult.append(ruleId.getQName().toString() + " satisfied");
                    }
                } catch (ComplianceCheckingException e) {
```

### StringConcatenationInsideStringBufferAppend
String concatenation as argument to `StringBuilder.append()` call
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/Filesplitter.java`
#### Snippet
```java
            while (fileScanner.hasNextLine() && nextLine.length() > 0 && nextLine.charAt(nextLine.length() - 1) == '\\') {
                nextLine.deleteCharAt(nextLine.length() - 1);
                nextLine.append(" " + fileScanner.nextLine());
            }
            logicalLines.add(nextLine.toString());
```

## RuleId[id=SuspiciousNameCombination]
### SuspiciousNameCombination
'topComponents' should probably not be passed as parameter 'right'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/Fileanalyzer.java`
#### Snippet
```java
                        continue;
                    }
                    results.add(Pair.of(baseComponent, topComponents));
                    linesToAnalyze.clear();
                }
```

### SuspiciousNameCombination
'topComponents' should probably not be passed as parameter 'right'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/Fileanalyzer.java`
#### Snippet
```java
            return results;
        }
        results.add(Pair.of(baseComponent, topComponents));

        return results;
```

## RuleId[id=RedundantOperationOnEmptyContainer]
### RedundantOperationOnEmptyContainer
Collection `set` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/ProviderRepository.java`
#### Snippet
```java
        ArrayList<TServiceTemplate> result = new ArrayList<>();
        while (iterator.hasNext()) {
            set.retainAll(iterator.next());
        }
        result.addAll(set);
```

### RedundantOperationOnEmptyContainer
Collection `predecessorsOfpredecessors` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

        List<TNodeTemplate> predecessorsOfpredecessors = new ArrayList<>();
        predecessorsOfpredecessors.clear();
        List<TNodeTemplate> candidates = new ArrayList<>();
        for (TNodeTemplate nodeTemplate : nodeTemplates) {
```

### RedundantOperationOnEmptyContainer
Collection `availableMatchingRelationshipTypes` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            List<TRelationshipType> availableMatchingRelationshipTypes = new ArrayList<>();
            availableMatchingRelationshipTypes.clear();

            while (requirementType != null && capabilityType != null) {
```

### RedundantOperationOnEmptyContainer
Collection `availableMatchingRelationshipTypes` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    TRequirementType derivedFromRequirementType = null;

                    availableMatchingRelationshipTypes.clear();
                    List<TRelationshipType> additionalMatchingRelationshipTypes = new ArrayList<>();

```

### RedundantOperationOnEmptyContainer
Collection `nodesForWhichHostsFound` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        // Contains all nodes for which at least one cloud provider node is found to host them
        List<TNodeTemplate> nodesForWhichHostsFound = new ArrayList<>();
        nodesForWhichHostsFound.clear();

        List<TNodeTemplate> needHostNodeTemplateCandidates = getNodeTemplatesWithoutOutgoingHostedOnRelationships(serviceTemplate);
```

### RedundantOperationOnEmptyContainer
Collection `predecessorNodeTemplates` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                                                                                   topologyTemplate, TNodeTemplate nodeTemplate) {
        List<TNodeTemplate> predecessorNodeTemplates = new ArrayList<>();
        predecessorNodeTemplates.clear();
        List<TRelationshipTemplate> incomingRelationships = ModelUtilities.getIncomingRelationshipTemplates(topologyTemplate, nodeTemplate);
        for (TRelationshipTemplate relationshipTemplate : incomingRelationships) {
```

### RedundantOperationOnEmptyContainer
Collection `matching` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        // Matching contains all cloud provider nodes matched to the topology
        List<TNodeTemplate> matching = new ArrayList<>();
        matching.clear();
        LOGGER.debug("Start Matching Method");

```

### RedundantOperationOnEmptyContainer
Collection `originHostSuccessors` is always empty
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            List<TNodeTemplate> originHostSuccessors = new ArrayList<>();
            originHostSuccessors.clear();
            originHostSuccessors = getHostedOnSuccessorsOfNodeTemplate(topologyTemplate, predecessorOfNewHost);
            TRequirement openHostedOnRequirement = predecessorOfNewHost.getRequirements().stream()
```

### RedundantOperationOnEmptyContainer
Collection `allInterfaces` is always empty
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                List<TInterface> allInterfaces = elementNodeType.getInterfaces();
                if (allInterfaces != null && allInterfaces.isEmpty()) {
                    List<TInterface> sourceNodeTypeInterfaces = allInterfaces.stream().filter(tInterface -> !tInterface.getIdFromIdOrNameField().contains("connect")).collect(Collectors.toList());
                    if (sourceNodeTypeInterfaces != null) {
                        for (TInterface tInterface : sourceNodeTypeInterfaces) {
```

### RedundantOperationOnEmptyContainer
Collection `sourceNodeTypeInterfaces` is always empty
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                    List<TInterface> sourceNodeTypeInterfaces = allInterfaces.stream().filter(tInterface -> !tInterface.getIdFromIdOrNameField().contains("connect")).collect(Collectors.toList());
                    if (sourceNodeTypeInterfaces != null) {
                        for (TInterface tInterface : sourceNodeTypeInterfaces) {
                            // TODO: make this more safe
                            for (TOperation tOperation : tInterface.getOperations()) {
```

## RuleId[id=OptionalIsPresent]
### OptionalIsPresent
Can be replaced with single expression in functional style
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/RepositoryFileReference.java`
#### Snippet
```java

    public RepositoryFileReference setFileName(String fileName) {
        if (this.subDirectory.isPresent()) {
            return new RepositoryFileReference(this.parent, this.subDirectory.get(), fileName);
        } else {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/AbstractFileBasedRepository.java`
#### Snippet
```java
                ZipEntry zipArchiveEntry;
                final Optional<Path> subDirectory = ref.getSubDirectory();
                if (subDirectory.isPresent()) {
                    zipArchiveEntry = new ZipEntry(subDirectory.get().resolve(ref.getFileName()).toString());
                } else {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/ConnectsToGraph.java`
#### Snippet
```java
            Optional<String> targetLabel = ModelUtilities.getTargetLabel(topLevelNT);
            Node node;
            if (targetLabel.isPresent()) {
                node = new Node(topLevelNT.getId(), targetLabel.get());
            } else {
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        Optional<String> participantTarget = ModelUtilities.getParticipant(targetNode);

        if (participantSource.isPresent()) {
            ModelUtilities.setParticipant(sourceNodeProxy, participantSource.get());
        }
```

### OptionalIsPresent
Can be replaced with single expression in functional style
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
            ModelUtilities.setParticipant(sourceNodeProxy, participantSource.get());
        }
        if (participantTarget.isPresent()) {
            ModelUtilities.setParticipant(targetNodeProxy, participantTarget.get());
        }
```

## RuleId[id=ReplaceInefficientStreamCount]
### ReplaceInefficientStreamCount
Can be replaced with 'Stream.mapToLong().sum()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/FragmentsCache.java`
#### Snippet
```java
            next = topology.getHostedOnSuccessor(next);
        }
        if (allFragments.values().stream().flatMap(List::stream).count() == 0) {
            throw new AllocationException("No matching fragments found for NT " + topLevelNT.getId() +
                " with target labels " + targetLabels);
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.lang.Class' to 'java.lang.Class'
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/JsonBasedEdmmManager.java`
#### Snippet
```java
            DependsOn.class,
            ConnectsTo.class,
            HostedOn.class}).forEach(clazz -> defaultTypes.add(EdmmType.fromEntityClass(clazz)));
        this.setEdmmTypes(defaultTypes);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.winery.model.tosca.xml.XTDefinitions.Builder' to 'T'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTDefinitions.java`
#### Snippet
```java
        @Override
        public T self() {
            return (T) this;
        }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTEntityType.java`
#### Snippet
```java
        this.setVersion(builder.version);
        this.setDerivedFrom(builder.derivedFrom);
        this.setProperties(builder.properties);
        this.setAttributes(builder.attributes);
        this.setMetadata(builder.metadata);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Map' to 'java.util.Map'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTEntityType.java`
#### Snippet
```java
        this.setDerivedFrom(builder.derivedFrom);
        this.setProperties(builder.properties);
        this.setAttributes(builder.attributes);
        this.setMetadata(builder.metadata);
    }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jaxbsupport/map/PropertiesAdapter.java`
#### Snippet
```java
            final Object value = data.get(key);
            if (value instanceof Map) {
                container.appendChild(marshallNestedMap(doc, key, (Map<String, Object>)value));
            } else if (value instanceof String) {
                Element entry = doc.createElement(key);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jaxbsupport/map/PropertiesAdapter.java`
#### Snippet
```java
            final Object value = data.get(key);
            if (value instanceof Map) {
                root.appendChild(marshallNestedMap(doc, key, (Map<String, Object>)value));
            } else if (value instanceof String) {
                Element entry = doc.createElement(key);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.ArrayList'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefAttribute.java`
#### Snippet
```java
    public ChefAttribute(String name, ArrayList<String> values) {
        this.name = name;
        this.values = (ArrayList<String>) values.clone();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'addAll(Collection)' as a member of raw type 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/ArgsVisitor.java`
#### Snippet
```java
                List argsNew = ctx.getChild(count).accept(argVisitor);
                if (argsNew != null) {
                    args.addAll(argsNew);
                } else {
                    args.add(ctx.getChild(count).getText());
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/ArgsVisitor.java`
#### Snippet
```java
                    args.addAll(argsNew);
                } else {
                    args.add(ctx.getChild(count).getText());
                }
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/CookbookParseResult.java`
#### Snippet
```java
            this.putCookbookConfig(new ChefCookbookConfiguration(cookbookParseResult.getAllConfigsAsList().get(i)));
        }
        this.attributes = (HashMap<String, String>) cookbookParseResult.attributes.clone();
        this.notatedPackages = (ArrayList<ChefPackage>) cookbookParseResult.notatedPackages.clone();
        this.isInDependentRecipe = cookbookParseResult.isInDependentRecipe;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.ArrayList'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/CookbookParseResult.java`
#### Snippet
```java
        }
        this.attributes = (HashMap<String, String>) cookbookParseResult.attributes.clone();
        this.notatedPackages = (ArrayList<ChefPackage>) cookbookParseResult.notatedPackages.clone();
        this.isInDependentRecipe = cookbookParseResult.isInDependentRecipe;
        this.isInRecursiveTransformation = cookbookParseResult.isInRecursiveTransformation;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
        boolean platformFound;
        
        platformNames = ymlParser.getPlatformNames();

        if (platformNames == null) return cookbookConfigs;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.LinkedHashMap' to 'java.util.LinkedHashMap'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java

    public void setDepends(LinkedHashMap depends) {
        this.depends = depends;
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.LinkedHashMap'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java
        this.version = componentType.version;
        this.supports = new Platform(componentType.supports);
        this.depends = (LinkedHashMap<String, String>) componentType.depends.clone();
        this.description = componentType.description;
        this.installedPackages = (LinkedHashMap<String, ChefPackage>) componentType.installedPackages.clone();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.LinkedHashMap'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java
        this.depends = (LinkedHashMap<String, String>) componentType.depends.clone();
        this.description = componentType.description;
        this.installedPackages = (LinkedHashMap<String, ChefPackage>) componentType.installedPackages.clone();
        this.requiredPackages = (LinkedHashMap<String, ChefPackage>) componentType.requiredPackages.clone();
        this.attributes = (HashMap<String, List>) componentType.attributes.clone();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.LinkedHashMap'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java
        this.description = componentType.description;
        this.installedPackages = (LinkedHashMap<String, ChefPackage>) componentType.installedPackages.clone();
        this.requiredPackages = (LinkedHashMap<String, ChefPackage>) componentType.requiredPackages.clone();
        this.attributes = (HashMap<String, List>) componentType.attributes.clone();
        this.dependentRecipes = (HashMap<String, List<String>>) componentType.dependentRecipes.clone();
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java
        this.installedPackages = (LinkedHashMap<String, ChefPackage>) componentType.installedPackages.clone();
        this.requiredPackages = (LinkedHashMap<String, ChefPackage>) componentType.requiredPackages.clone();
        this.attributes = (HashMap<String, List>) componentType.attributes.clone();
        this.dependentRecipes = (HashMap<String, List<String>>) componentType.dependentRecipes.clone();
        this.runlist = componentType.runlist;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.HashMap\>'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java
        this.requiredPackages = (LinkedHashMap<String, ChefPackage>) componentType.requiredPackages.clone();
        this.attributes = (HashMap<String, List>) componentType.attributes.clone();
        this.dependentRecipes = (HashMap<String, List<String>>) componentType.dependentRecipes.clone();
        this.runlist = componentType.runlist;
    }
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CollectionVisitor.java`
#### Snippet
```java
        List stringArray = new ArrayList<String>();
        for (int count = 0; count < ctx.getChildCount() - 3; count++) {
            stringArray.add(ctx.getChild(2 + count).getText());
        }
        return stringArray;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/AssignAttributeVisitor.java`
#### Snippet
```java

            if (attributeName != null && attributeValue != null) {
                attribute = new ChefAttribute(attributeName, attributeValue);
            }
        } else {
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java
     */
    public List getPlatformNames() {
        List<Map> platformConfig = this.getPlatforms();
        if (platformConfig != null) {
            List platformNames = new ArrayList();
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java
            List platformNames = new ArrayList();
            for (int count = 0; count < platformConfig.size(); count++) {
                platformNames.add(platformConfig.get(count).get("name"));
            }
            return platformNames;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java
    public List getSuites() {
        if (this.kitchenYml != null) {
            List<Map> platformConfig = (List) kitchenYml.get("suites");
            return platformConfig;
        } else return null;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java

        if (this.kitchenYml != null) {
            List<Map> platformConfig = (List) kitchenYml.get("platforms");
            return platformConfig;
        } else return null;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
                        convertedValue = RubyFunctionHelper.stringToInt((String) primaryValue.get(i));
                        if (convertedValue != null) {
                            convertedValueList.add(convertedValue.toString());
                        }
                    }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitLitSymbol(ChefDSLParser.LitSymbolContext ctx) {
        List<String> attributeValue = new ArrayList();
        String literal = ctx.getChild(0).getText();
        attributeValue.add(literal);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitPrimOhaiFunc(ChefDSLParser.PrimOhaiFuncContext ctx) {
        List<String> attributeValue = new ArrayList();
        String literal;
        int stringLength;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitString(ChefDSLParser.StringContext ctx) {
        List<String> attributeValue = new ArrayList();
        String literal = ctx.getChild(0).getText();
        Integer stringLength = literal.length();
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitCaseStatement(ChefDSLParser.CaseStatementContext ctx) {
        List<String> attributeValue = new ArrayList();

        WhenArgsVisitor whenArgsVisitor;
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
        }

        aggregate.add(nextResult);

        return aggregate;
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitPrimBoolean(ChefDSLParser.PrimBooleanContext ctx) {
        List<String> attributeValue = new ArrayList();
        String value = ctx.getText();
        attributeValue.add(value);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitPrimFloat(ChefDSLParser.PrimFloatContext ctx) {
        List<String> attributeValue = new ArrayList();
        String value = ctx.getText();
        attributeValue.add(value);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    @Override
    public List visitPrimInt(ChefDSLParser.PrimIntContext ctx) {
        List<String> attributeValue = new ArrayList();
        String value = ctx.getText();
        attributeValue.add(value);
```

### UNCHECKED_WARNING
Unchecked call to 'add(E)' as a member of raw type 'java.util.List'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
            e.printStackTrace();
        }
        attributeValue.add(varValue);

        return attributeValue;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.Collection\>' to 'java.util.Collection'
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ServiceTemplateComplianceRuleRuleChecker.java`
#### Snippet
```java

        for (Namespace space : relevantNamespaces) {
            complianceRules.addAll((Collection<? extends ComplianceRuleId>) RepositoryFactory.getRepository().getAllIdsInNamespace(ComplianceRuleId.class, space));
        }
        return complianceRules;
```

### UNCHECKED_WARNING
Unchecked call to 'getVertexCorrespondence(V, boolean)' as a member of raw type 'org.jgrapht.GraphMapping'
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java
			for (GraphMapping requiredStructureMapping : requiredStructureMappings) {
				//get the corresponding ToscaNode from the searchInGraph 
				ToscaNode identifierVertexCorrespondence = (ToscaNode) identifierMapping.getVertexCorrespondence(identifierGraph.getReferenceNode(), false);
				foundCorrespondence = (requiredStructureMapping.getVertexCorrespondence(identifierVertexCorrespondence, true) != null) ? true : false;
			}
```

### UNCHECKED_WARNING
Unchecked call to 'getVertexCorrespondence(V, boolean)' as a member of raw type 'org.jgrapht.GraphMapping'
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java
				//get the corresponding ToscaNode from the searchInGraph 
				ToscaNode identifierVertexCorrespondence = (ToscaNode) identifierMapping.getVertexCorrespondence(identifierGraph.getReferenceNode(), false);
				foundCorrespondence = (requiredStructureMapping.getVertexCorrespondence(identifierVertexCorrespondence, true) != null) ? true : false;
			}
			if (!foundCorrespondence) {
```

### UNCHECKED_WARNING
Unchecked call to 'getVertexCorrespondence(V, boolean)' as a member of raw type 'org.jgrapht.GraphMapping'
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java
		Map<ToscaNode, ToscaNode> result = new HashMap<>();
		for (ToscaNode node : subGraph.vertexSet()) {
			Optional.of(mapping.getVertexCorrespondence(node, false)).map(vertex -> (ToscaNode) vertex).ifPresent(vertex -> result.put(node, vertex));
		}
		return result;
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/AssignmentBuilder.java`
#### Snippet
```java
                    // Filter for function else use Object.toString()
                    if (entry.getValue() instanceof Map && ((Map) entry.getValue()).size() == 1) {
                        for (Map.Entry<String, Object> fentry : ((Map<String, Object>) entry.getValue()).entrySet())
                            value = fentry.getKey() + ": " + fentry.getValue().toString();
                    }
```

### UNCHECKED_WARNING
Unchecked cast: 'capture' to 'K'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/FromCanonical.java`
#### Snippet
```java
            .peek(entry -> LOGGER.debug("entry: {}", entry))
            .filter(Objects::nonNull)
            .collect(Collectors.toMap(Map.Entry::getKey, entry -> (K) entry.getValue()));
    }

```

### UNCHECKED_WARNING
Unchecked cast: 'org.eclipse.winery.model.tosca.TExtensibleElements' to 'S'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/IWineryRepositoryCommon.java`
#### Snippet
```java

    default <T extends DefinitionsChildId, S extends TExtensibleElements> S getElement(T id) {
        return (S) this.getDefinitions(id).getElement();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'. Reason: 'map' has raw type, so result of entrySet is erased
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/ObjectValidator.java`
#### Snippet
```java
        if (object instanceof LinkedHashMap) {
            LinkedHashMap map = (LinkedHashMap) object;
            Set<Map.Entry> entries = map.entrySet();
            if (entries.size() == 0 || !entries.iterator().next().getKey().equals("tosca_definitions_version")) {
                for (Map.Entry entry : entries) {
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlPrinter.java`
#### Snippet
```java
                    .indent(2);
            }
            Map<String, Object> map = (Map<String, Object>) object;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                printKeyObject(entry.getKey(), entry.getValue());
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.List'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlPrinter.java`
#### Snippet
```java
            printKey(key)
                .indent(2);
            for (Object entry : (List<Object>) object) {
                printListObject(entry);
            }
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlPrinter.java`
#### Snippet
```java
                .print(' ');
            this.indent += 2;
            Map<String, Object> map = (Map<String, Object>) object;
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                printKeyObject(entry.getKey(), entry.getValue());
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
        pattern.addVertex(serviceComponent);

        pattern.addEdge(serviceComponent, virtualHardwareComponent, new RelationshipEdge(service, virtualHardwareComponent, connectsTo));

    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
        pattern.addVertex(appComponent2);

        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));
        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, serverComponent, deployedOn));
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, serverComponent, deployedOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java

        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));
        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, serverComponent, deployedOn));
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, serverComponent, deployedOn));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));
        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, serverComponent, deployedOn));
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, serverComponent, deployedOn));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
        pattern.addVertex(appComponent2);

        pattern.addEdge(operatingSystem, virtualHardwareComponent, new RelationshipEdge(operatingSystem, virtualHardwareComponent, hostedOn));
        pattern.addEdge(serviceComponent1, virtualHardwareComponent, new RelationshipEdge(serviceComponent1, virtualHardwareComponent, connectsTo));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java

        pattern.addEdge(operatingSystem, virtualHardwareComponent, new RelationshipEdge(operatingSystem, virtualHardwareComponent, hostedOn));
        pattern.addEdge(serviceComponent1, virtualHardwareComponent, new RelationshipEdge(serviceComponent1, virtualHardwareComponent, connectsTo));

        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
        pattern.addEdge(serviceComponent1, virtualHardwareComponent, new RelationshipEdge(serviceComponent1, virtualHardwareComponent, connectsTo));

        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));

        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, operatingSystem, deployedOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));

        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, operatingSystem, deployedOn));
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, operatingSystem, deployedOn));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java

        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, operatingSystem, deployedOn));
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, operatingSystem, deployedOn));

        pattern.addEdge(serviceComponent2, appComponent1, new RelationshipEdge(serviceComponent2, appComponent1, connectsTo));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, operatingSystem, deployedOn));

        pattern.addEdge(serviceComponent2, appComponent1, new RelationshipEdge(serviceComponent2, appComponent1, connectsTo));
        pattern.addEdge(serviceComponent2, appComponent2, new RelationshipEdge(serviceComponent2, appComponent2, connectsTo));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java

        pattern.addEdge(serviceComponent2, appComponent1, new RelationshipEdge(serviceComponent2, appComponent1, connectsTo));
        pattern.addEdge(serviceComponent2, appComponent2, new RelationshipEdge(serviceComponent2, appComponent2, connectsTo));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
        pattern.addVertex(storageComponent2);

        pattern.addEdge(storageComponent1, operatingSystem, new RelationshipEdge(storageComponent1, operatingSystem, hostedOn));
        pattern.addEdge(storageComponent2, storageComponent1, new RelationshipEdge(storageComponent2, storageComponent1, hostedOn));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java

        pattern.addEdge(storageComponent1, operatingSystem, new RelationshipEdge(storageComponent1, operatingSystem, hostedOn));
        pattern.addEdge(storageComponent2, storageComponent1, new RelationshipEdge(storageComponent2, storageComponent1, hostedOn));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
                }
            }
            abstractTopology.addEdge(sourceNode, targetNode, new RelationshipEdge(sourceNode, targetNode, tRelationshipTemplate.getType().getLocalPart()));
        }
    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
        pattern.addVertex(appComponent);

        pattern.addEdge(messagingComponent1, operatingSystem, new RelationshipEdge(messagingComponent1, operatingSystem, hostedOn));
        pattern.addEdge(messagingComponent2, messagingComponent1, new RelationshipEdge(messagingComponent2, messagingComponent1, hostedOn));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java

        pattern.addEdge(messagingComponent1, operatingSystem, new RelationshipEdge(messagingComponent1, operatingSystem, hostedOn));
        pattern.addEdge(messagingComponent2, messagingComponent1, new RelationshipEdge(messagingComponent2, messagingComponent1, hostedOn));

        pattern.addEdge(appComponent, messagingComponent2, new RelationshipEdge(appComponent, messagingComponent2, connectsTo));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
        pattern.addEdge(messagingComponent2, messagingComponent1, new RelationshipEdge(messagingComponent2, messagingComponent1, hostedOn));

        pattern.addEdge(appComponent, messagingComponent2, new RelationshipEdge(appComponent, messagingComponent2, connectsTo));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
        pattern.addVertex(storageComponent2);

        pattern.addEdge(storageComponent1, operatingSystem, new RelationshipEdge(storageComponent1, operatingSystem, hostedOn));
        pattern.addEdge(storageComponent2, storageComponent1, new RelationshipEdge(storageComponent2, storageComponent1, hostedOn));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java

        pattern.addEdge(storageComponent1, operatingSystem, new RelationshipEdge(storageComponent1, operatingSystem, hostedOn));
        pattern.addEdge(storageComponent2, storageComponent1, new RelationshipEdge(storageComponent2, storageComponent1, hostedOn));

    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
        //pattern.addVertex(appComponent2);

        pattern.addEdge(serviceComponent, operatingSystem, new RelationshipEdge(serviceComponent, operatingSystem, hostedOn));
        pattern.addEdge(appComponent1, serviceComponent, new RelationshipEdge(appComponent1, serviceComponent, dependsOn));
        //pattern.addEdge(appComponent2, serviceComponent, new RelationshipEdge(appComponent2, serviceComponent, dependsOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java

        pattern.addEdge(serviceComponent, operatingSystem, new RelationshipEdge(serviceComponent, operatingSystem, hostedOn));
        pattern.addEdge(appComponent1, serviceComponent, new RelationshipEdge(appComponent1, serviceComponent, dependsOn));
        //pattern.addEdge(appComponent2, serviceComponent, new RelationshipEdge(appComponent2, serviceComponent, dependsOn));
    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
        pattern.addVertex(appComponent2);

        pattern.addEdge(operatingSystem, virtualHardwareComponent, new RelationshipEdge(operatingSystem, virtualHardwareComponent, hostedOn));
        pattern.addEdge(serviceComponent, virtualHardwareComponent, new RelationshipEdge(serviceComponent, virtualHardwareComponent, connectsTo));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java

        pattern.addEdge(operatingSystem, virtualHardwareComponent, new RelationshipEdge(operatingSystem, virtualHardwareComponent, hostedOn));
        pattern.addEdge(serviceComponent, virtualHardwareComponent, new RelationshipEdge(serviceComponent, virtualHardwareComponent, connectsTo));

        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
        pattern.addEdge(serviceComponent, virtualHardwareComponent, new RelationshipEdge(serviceComponent, virtualHardwareComponent, connectsTo));

        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));

        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, operatingSystem, deployedOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
        pattern.addEdge(serverComponent, operatingSystem, new RelationshipEdge(serverComponent, operatingSystem, hostedOn));

        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, operatingSystem, deployedOn));
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, operatingSystem, deployedOn));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java

        pattern.addEdge(appComponent1, serverComponent, new RelationshipEdge(appComponent1, operatingSystem, deployedOn));
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, operatingSystem, deployedOn));

        pattern.addEdge(messagingComponent, appComponent1, new RelationshipEdge(messagingComponent, appComponent1, connectsTo));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
        pattern.addEdge(appComponent2, serverComponent, new RelationshipEdge(appComponent2, operatingSystem, deployedOn));

        pattern.addEdge(messagingComponent, appComponent1, new RelationshipEdge(messagingComponent, appComponent1, connectsTo));
        pattern.addEdge(messagingComponent, appComponent2, new RelationshipEdge(messagingComponent, appComponent2, connectsTo));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java

        pattern.addEdge(messagingComponent, appComponent1, new RelationshipEdge(messagingComponent, appComponent1, connectsTo));
        pattern.addEdge(messagingComponent, appComponent2, new RelationshipEdge(messagingComponent, appComponent2, connectsTo));

    }
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
        pattern.addVertex(virtualHardwareComponent);

        pattern.addEdge(operatingSystem, virtualHardwareComponent, new RelationshipEdge(operatingSystem, virtualHardwareComponent, hostedOn));
    }

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
        pattern.addVertex(appComponent2);

        pattern.addEdge(operatingSystem1, virtualHardwareComponent, new RelationshipEdge(operatingSystem1, virtualHardwareComponent, hostedOn));
        pattern.addEdge(operatingSystem2, virtualHardwareComponent, new RelationshipEdge(operatingSystem2, virtualHardwareComponent, hostedOn));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java

        pattern.addEdge(operatingSystem1, virtualHardwareComponent, new RelationshipEdge(operatingSystem1, virtualHardwareComponent, hostedOn));
        pattern.addEdge(operatingSystem2, virtualHardwareComponent, new RelationshipEdge(operatingSystem2, virtualHardwareComponent, hostedOn));

        pattern.addEdge(serverComponent1, operatingSystem1, new RelationshipEdge(serverComponent1, operatingSystem1, hostedOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
        pattern.addEdge(operatingSystem2, virtualHardwareComponent, new RelationshipEdge(operatingSystem2, virtualHardwareComponent, hostedOn));

        pattern.addEdge(serverComponent1, operatingSystem1, new RelationshipEdge(serverComponent1, operatingSystem1, hostedOn));
        pattern.addEdge(serverComponent2, operatingSystem2, new RelationshipEdge(serverComponent2, operatingSystem2, hostedOn));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java

        pattern.addEdge(serverComponent1, operatingSystem1, new RelationshipEdge(serverComponent1, operatingSystem1, hostedOn));
        pattern.addEdge(serverComponent2, operatingSystem2, new RelationshipEdge(serverComponent2, operatingSystem2, hostedOn));

        pattern.addEdge(appComponent1, serverComponent1, new RelationshipEdge(appComponent1, operatingSystem1, deployedOn));
```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
        pattern.addEdge(serverComponent2, operatingSystem2, new RelationshipEdge(serverComponent2, operatingSystem2, hostedOn));

        pattern.addEdge(appComponent1, serverComponent1, new RelationshipEdge(appComponent1, operatingSystem1, deployedOn));
        pattern.addEdge(appComponent2, serverComponent2, new RelationshipEdge(appComponent2, operatingSystem2, deployedOn));

```

### UNCHECKED_WARNING
Unchecked call to 'RelationshipEdge(V, V, String)' as a member of raw type 'org.eclipse.winery.repository.patterndetection.model.RelationshipEdge'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java

        pattern.addEdge(appComponent1, serverComponent1, new RelationshipEdge(appComponent1, operatingSystem1, deployedOn));
        pattern.addEdge(appComponent2, serverComponent2, new RelationshipEdge(appComponent2, operatingSystem2, deployedOn));

        //pattern.addEdge(appComponent1, appComponent2, new RelationshipEdge(appComponent1, appComponent2, connectsTo));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
                return new YTCallOperationActivityDefinition((String) object);
            }
            Map<String, Object> map = (Map<String, Object>) object;
            YTCallOperationActivityDefinition callOperation = new YTCallOperationActivityDefinition(stringValue(map.get(YamlSpecKeywords.OPERATION)));
            Map<String, YTParameterDefinition> inputs = buildParameterDefinitions(map.get(YamlSpecKeywords.INPUTS),
```

### UNCHECKED_WARNING
Unchecked assignment: 'org.jgrapht.alg.isomorphism.VF2SubgraphIsomorphismInspector' to 'org.jgrapht.alg.isomorphism.VF2SubgraphIsomorphismInspector'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
        // abstractTopology represents the base graph, for each pattern graph search for a subgraph isomorphism between base graph & pattern graph
        for (SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern : patternList) {
            VF2SubgraphIsomorphismInspector<TNodeTemplateExtended, RelationshipEdge> inspector = new VF2SubgraphIsomorphismInspector(abstractTopology.getGraph(), pattern);
            if (inspector.isomorphismExists()) {
                Iterator it = inspector.getMappings();
```

### UNCHECKED_WARNING
Unchecked call to 'VF2SubgraphIsomorphismInspector(Graph, Graph)' as a member of raw type 'org.jgrapht.alg.isomorphism.VF2SubgraphIsomorphismInspector'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
        // abstractTopology represents the base graph, for each pattern graph search for a subgraph isomorphism between base graph & pattern graph
        for (SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern : patternList) {
            VF2SubgraphIsomorphismInspector<TNodeTemplateExtended, RelationshipEdge> inspector = new VF2SubgraphIsomorphismInspector(abstractTopology.getGraph(), pattern);
            if (inspector.isomorphismExists()) {
                Iterator it = inspector.getMappings();
```

### UNCHECKED_WARNING
Unchecked call to 'getVertexCorrespondence(V, boolean)' as a member of raw type 'org.jgrapht.alg.isomorphism.IsomorphicGraphMapping'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
                    for (PatternComponent p : pattern.vertexSet()) {
                        //check if matched subgraph and topology have the same components, get the correspondent vertex in the mapping for a node
                        TNodeTemplateExtended v = (TNodeTemplateExtended) mapping.getVertexCorrespondence(p, false);

                        // if the names equal, the node is added to the originGraph and a boolean with value true is added to the matched list
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java
    private <T extends Comparable<T>> boolean compare(Object value, String operator, Object comparisonValue) {
        try {
            T valueComparable = (T) value;
            T comparisonValueComparable = (T) comparisonValue;
            int compareResult = valueComparable.compareTo(comparisonValueComparable);
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'T'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java
        try {
            T valueComparable = (T) value;
            T comparisonValueComparable = (T) comparisonValue;
            int compareResult = valueComparable.compareTo(comparisonValueComparable);

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java
    @Subscribe
    public void setGitDifferences(Map<String, Map<DiffEntry, String>> event) {
        (new Thread(new GitLogRunnable(event, new ArrayList(connections)))).start();
    }

```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java
    @Subscribe
    public void setGitDifferences(Map<String, Map<DiffEntry, String>> event) {
        (new Thread(new GitLogRunnable(event, new ArrayList(connections)))).start();
    }

```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.AbstractMap.SimpleEntry' to 'java.util.Map.Entry'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                    ServiceTemplateId id = new ServiceTemplateId(entry.getInjection());
                    TServiceTemplate serviceTemplate = RepositoryFactory.getRepository().getElement(id);
                    Map.Entry<String, TTopologyTemplate> newEntry = new AbstractMap.SimpleEntry(entry.getNodeID(), serviceTemplate.getTopologyTemplate());
                    return newEntry;
                }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
```

### UNCHECKED_WARNING
Unchecked call to 'SimpleEntry(K, V)' as a member of raw type 'java.util.AbstractMap.SimpleEntry'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                    ServiceTemplateId id = new ServiceTemplateId(entry.getInjection());
                    TServiceTemplate serviceTemplate = RepositoryFactory.getRepository().getElement(id);
                    Map.Entry<String, TTopologyTemplate> newEntry = new AbstractMap.SimpleEntry(entry.getNodeID(), serviceTemplate.getTopologyTemplate());
                    return newEntry;
                }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.AbstractMap.SimpleEntry' to 'java.util.Map.Entry'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                    ServiceTemplateId id = new ServiceTemplateId(entry.getInjection());
                    TServiceTemplate serviceTemplate = RepositoryFactory.getRepository().getElement(id);
                    Map.Entry<String, TTopologyTemplate> newEntry = new AbstractMap.SimpleEntry(entry.getNodeID(), serviceTemplate.getTopologyTemplate());
                    return newEntry;
                }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
```

### UNCHECKED_WARNING
Unchecked call to 'SimpleEntry(K, V)' as a member of raw type 'java.util.AbstractMap.SimpleEntry'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                    ServiceTemplateId id = new ServiceTemplateId(entry.getInjection());
                    TServiceTemplate serviceTemplate = RepositoryFactory.getRepository().getElement(id);
                    Map.Entry<String, TTopologyTemplate> newEntry = new AbstractMap.SimpleEntry(entry.getNodeID(), serviceTemplate.getTopologyTemplate());
                    return newEntry;
                }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
```

### UNCHECKED_WARNING
Unchecked cast: 'java.util.SortedSet\>' to 'java.util.Set'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
    private Map<QName, TServiceTemplate> getServiceTemplateCandidates() {
        Map<QName, TServiceTemplate> serviceTemplates = repository.getQNameToElementMapping(ServiceTemplateId.class);
        Set<ServiceTemplateId> versionsOfConsideredServiceTemplate = (Set<ServiceTemplateId>) WineryVersionUtils.getOtherVersionDefinitionsFromDefinition(serviceTemplateId, repository);
        Set<QName> versionQNames = new HashSet<>();
        versionsOfConsideredServiceTemplate.stream().forEach(st -> versionQNames.add(st.getQName()));
```

## RuleId[id=JavadocReference]
### JavadocReference
Symbol `initContext()` is inaccessible from here
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/MockXMLElement.java`
#### Snippet
```java
 * the jaxbcontext is initialized in src/test and cannot be updated in src/main
 * <p>
 * Included in {@link org.eclipse.winery.repository.JAXBSupport#initContext()}
 */
@XmlRootElement(namespace = "http://test.winery.opentosca.org", name = "MockXmlElement")
```

### JavadocReference
Cannot resolve symbol `org.apache.commons.configuration.builder.AutoSaveListener`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/AutoSaveListener.java`
#### Snippet
```java

/**
 * We do not count loads and saves as in {@link org.apache.commons.configuration.builder.AutoSaveListener}, because
 * ConfigurationListener is not aware of such things
 */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.winery.repository.resources.servicetemplates.topologytemplates.RelationshipTemplateResource`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/package-info.java`
#### Snippet
```java
 * EntityTypes
 * <p>
 * {@link org.eclipse.winery.repository.resources.servicetemplates.topologytemplates.RelationshipTemplateResource}
 * and
 * {@link org.eclipse.winery.repository.resources.servicetemplates.topologytemplates.NodeTemplateResource}
```

### JavadocReference
Cannot resolve symbol `org.eclipse.winery.repository.resources.servicetemplates.topologytemplates.NodeTemplateResource`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/package-info.java`
#### Snippet
```java
 * {@link org.eclipse.winery.repository.resources.servicetemplates.topologytemplates.RelationshipTemplateResource}
 * and
 * {@link org.eclipse.winery.repository.resources.servicetemplates.topologytemplates.NodeTemplateResource}
 * are stored in the topology package
 */
```

### JavadocReference
Cannot resolve symbol `org.eclipse.winery.repository.resources.servicetemplates.boundarydefinitions.reqscaps.RequirementsResource`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/reqscaps/CapabilitiesResource.java`
#### Snippet
```java

/**
 * This class is an adaption from {@link org.eclipse.winery.repository.resources.servicetemplates.boundarydefinitions.reqscaps.RequirementsResource}
 */
public class CapabilitiesResource extends EntityWithoutIdCollectionResource<CapabilityResource, TCapabilityRef> {
```

### JavadocReference
Cannot resolve symbol `org.eclipse.winery.repository.resources.servicetemplates.boundarydefinitions.reqscaps.CapabilitiesResource`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/reqscaps/RequirementsResource.java`
#### Snippet
```java

/**
 * This class is mirrored at {@link org.eclipse.winery.repository.resources.servicetemplates.boundarydefinitions.reqscaps.CapabilitiesResource}
 */
public class RequirementsResource extends EntityWithoutIdCollectionResource<RequirementResource, TRequirementRef> {
```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/ValidEndingsApiDataSet.java`
#### Snippet
```java

enum ValidEndingsTypeEnum {
    EVERYTHING, NODETYPE, REQTYPE, CAPTYPE;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.winery.highlevelrestapi/src/main/java/org/eclipse/winery/highlevelrestapi/HighLevelRestApi.java`
#### Snippet
```java
        } else {
            method = new PostMethod(uri);
            ;
        }
        method.setRequestBody(requestPayload);
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/InstanceModelUtils.java`
#### Snippet
```java
        LogContainerCmd logContainerCmd = dockerClient.logContainerCmd(containerId);
        logContainerCmd.withStdOut(true).withStdErr(true);
        ;

        try {
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/ManagementTask.java`
#### Snippet
```java

    private String interfaceName;
    ;

    private QName nodeTemplateId;
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/TargetBpelEngine.java`
#### Snippet
```java
public enum TargetBpelEngine {

	APACHE_ODE;

}
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/topologyrefinement/TopologyFragmentRefinement.java`
#### Snippet
```java
                    ArtifactTemplateId artifactTemplateId = new ArtifactTemplateId(artifact);
                    ArtifactTemplateFilesDirectoryId filesDirectoryId = new ArtifactTemplateFilesDirectoryId(artifactTemplateId);
                    try (PipedInputStream inputStream = new PipedInputStream(); PipedOutputStream output = new PipedOutputStream(inputStream);) {
                        this.repository.getZippedContents(filesDirectoryId, output);
                        // https://stackoverflow.com/questions/5778658/how-to-convert-outputstream-to-inputstream
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `serviceTemplate.getName()` might be null
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/toscalight/ToscaLightChecker.java`
#### Snippet
```java

    public Map<QName, List<String>> checkToscaLightCompatibility(TServiceTemplate serviceTemplate) {
        QName serviceTemplateQName = new QName(serviceTemplate.getTargetNamespace(), serviceTemplate.getName());
        this.errorList = new HashMap<>();
        this.errorList.put(serviceTemplateQName, new ArrayList<>());
```

### DataFlowIssue
Method invocation `forEach` may produce `NullPointerException`
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmExporter.java`
#### Snippet
```java
        if (toscaTemplate.getProperties() != null && ModelUtilities.getPropertiesKV(toscaTemplate) != null) {
            ModelUtilities.getPropertiesKV(toscaTemplate)
                .forEach((key, value) -> {
                    EntityId propertyEntityId = propertiesEntityId.extend(key);
                    entityGraph.addEntity(new ScalarEntity(value, propertyEntityId, entityGraph));
```

### DataFlowIssue
Method invocation `isEmpty` may produce `NullPointerException`
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/YTServiceTemplate.java`
#### Snippet
```java

        public Builder addImports(YTMapImportDefinition importDefinition) {
            if (importDefinition == null | importDefinition.isEmpty()) {
                return this;
            }
```

### DataFlowIssue
Argument `i.getLocation()` might be null
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/ids/definitions/imports/GenericImportId.java`
#### Snippet
```java

    private static String getId(TImport i) {
        String fileName = IdUtil.getLastURIPart(i.getLocation());
        // this doesn't handle filenames with directory separators inside correctly
        return fileName.substring(0, fileName.lastIndexOf("."));
```

### DataFlowIssue
Argument `node.getInputs()` might be null
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/visitor/AbstractVisitor.java`
#### Snippet
```java
    public R visit(YTTopologyTemplateDefinition node, P parameter) {
        return reduce(Stream.of(
            visitElement(node.getInputs(), parameter, "inputs"),
            visitElement(node.getNodeTemplates(), parameter, "node_templates"),
            visitElement(node.getRelationshipTemplates(), parameter, "relationship_templates"),
```

### DataFlowIssue
Argument `node.getOutputs()` might be null
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/visitor/AbstractVisitor.java`
#### Snippet
```java
            visitElement(node.getGroups(), parameter, "groups"),
            visitElement(node.getPolicies(), parameter, "policies"),
            visitElement(node.getOutputs(), parameter, "outputs"),
            visitElement(node.getSubstitutionMappings(), parameter, "substitution_mappings")
        ));
```

### DataFlowIssue
Argument `type` might be null
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/converter/support/xml/TypeConverter.java`
#### Snippet
```java
                return convert(new QName(Namespaces.XML_NS, "float", "xsd"));
            default:
                return new QName(type);
        }
    }
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/ToscaDocumentBuilderFactory.java`
#### Snippet
```java
            // we have xml.xsd locally, which should enable offline validation
            schema = schemaFactory.newSchema(new Source[]{
                new StreamSource(xmlXsdUrl.toString()),
                new StreamSource(toscaV10XsdUrl.toString())
            });
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/ToscaDocumentBuilderFactory.java`
#### Snippet
```java
            schema = schemaFactory.newSchema(new Source[]{
                new StreamSource(xmlXsdUrl.toString()),
                new StreamSource(toscaV10XsdUrl.toString())
            });
            this.schemaAwareFactory.setSchema(schema);
```

### DataFlowIssue
Condition `newCookbookParseResult instanceof CookbookParseResult` is redundant and can be replaced with a null check
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/ExprVisitor.java`
#### Snippet
```java
            PrimaryStatementVisitor primaryStatementVisitor = new PrimaryStatementVisitor(cookbookConfigs);
            newCookbookParseResult = ctx.arg().accept(primaryStatementVisitor);
            if (newCookbookParseResult instanceof CookbookParseResult) {
                cookbookConfigs = newCookbookParseResult;
            } else {
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
        // Compile kitchen.yml
        if (cookbookParseResult.isInRecursiveTransformation() == false ) {
            cookbookParseResult = addPlatformVersionInformationFromKitchen(cookbookParseResult);
        }

```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/MetadataJsonVisitor.java`
#### Snippet
```java
            // Read and process name attribute
            String name = (String) metadata.get("name");
            parseResult = processCookbookName(parseResult, name);

            String version = (String) metadata.get("version");
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/MetadataJsonVisitor.java`
#### Snippet
```java

            String version = (String) metadata.get("version");
            parseResult = processCookbookVersion(parseResult, version);

            // Read and process description attribute
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/MetadataJsonVisitor.java`
#### Snippet
```java
            // Read and process description attribute
            String description = (String) metadata.get("description");
            parseResult = processCookbookDescription(parseResult, description);

            JSONObject platforms = (JSONObject) metadata.get("platforms");
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/MetadataJsonVisitor.java`
#### Snippet
```java

            JSONObject platforms = (JSONObject) metadata.get("platforms");
            parseResult = processSupportedPlatforms(parseResult, platforms);

            // Read and process cookbook dependencies
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/MetadataJsonVisitor.java`
#### Snippet
```java
            // Read and process cookbook dependencies
            JSONObject dependencies = (JSONObject) metadata.get("dependencies");
            parseResult = processCookbookDependencies(parseResult, dependencies);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
                exprResult = true;
            } else {
                exprResult = null;
                LOGGER.error("Argument is not an expected boolean. If argument is null, " +
                    "Primary Visitor is not implemented. \n" +
```

### DataFlowIssue
Condition `child instanceof ChefDSLParser.When_argsContext` is redundant and can be replaced with a null check
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
            ParseTree child = ctx.getChild(iterChild);

            if (child instanceof ChefDSLParser.When_argsContext) {
                whenArgs = child.accept(whenArgsVisitor);
            } else if ("else".equals(child.getText())) {
```

### DataFlowIssue
Method invocation `getText` will produce `NullPointerException`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
            if (child instanceof ChefDSLParser.When_argsContext) {
                whenArgs = child.accept(whenArgsVisitor);
            } else if ("else".equals(child.getText())) {
                whenArgs.clear();
                elseActive = true;
```

### DataFlowIssue
Condition `child instanceof ChefDSLParser.ExprContext` is redundant and can be replaced with a null check
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java

                ParseTree child = ctx.getChild(iterChild);
                if (child instanceof ChefDSLParser.ExprContext) {
                    expr = ctx.expr(0).accept(booleanExprVisitor);
                } else if ("else".equals(child.getText())) {
```

### DataFlowIssue
Method invocation `getText` will produce `NullPointerException`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java
                if (child instanceof ChefDSLParser.ExprContext) {
                    expr = ctx.expr(0).accept(booleanExprVisitor);
                } else if ("else".equals(child.getText())) {
                    elseActive = true;
                } else if (child instanceof ChefDSLParser.Inner_comptstmtContext) {
```

### DataFlowIssue
Condition `child instanceof ChefDSLParser.When_argsContext` is redundant and can be replaced with a null check
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java
                ParseTree child = ctx.getChild(iterChild);

                if (child instanceof ChefDSLParser.When_argsContext) {
                    whenArgs = child.accept(whenArgsVisitor);
                } else if ("else".equals(child.getText())) {
```

### DataFlowIssue
Method invocation `getText` will produce `NullPointerException`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java
                if (child instanceof ChefDSLParser.When_argsContext) {
                    whenArgs = child.accept(whenArgsVisitor);
                } else if ("else".equals(child.getText())) {
                    whenArgs.clear();
                    elseActive = true;
```

### DataFlowIssue
Dereference of `files` may produce `NullPointerException`
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawledCookbooks.java`
#### Snippet
```java
            String files[] = sourceFolder.list();

            for (String file : files) {
                File srcFile = new File(sourceFolder, file);
                File destFile = new File(destinationFolder, file);
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ToscaComplianceRuleMatcher.java`
#### Snippet
```java

    private List<String> mapToStringList(@NonNull List<TPolicy> policy) {
        return policy.stream().map(p -> p.getPolicyType() + p.getPolicyRef().toString()).collect(Collectors.toList());
    }

```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ToscaComplianceRuleMatcher.java`
#### Snippet
```java
            assert (rightProps instanceof TEntityTemplate.XmlProperties);

            return ((TEntityTemplate.XmlProperties) leftProps).getAny().equals(((TEntityTemplate.XmlProperties) rightProps).getAny());
        } else {
            // There's no ComplianceRules in YAML mode
```

### DataFlowIssue
Function may return null, but it's not allowed here
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/AssignmentBuilder.java`
#### Snippet
```java
            .filter(e -> e.getValue() != null)
            .collect(Collectors.toMap(
                Map.Entry::getKey, e -> e.getValue().getValue())
            );

```

### DataFlowIssue
Method invocation `setPrimaryArtifactName` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/YamlRepository.java`
#### Snippet
```java
            if (operation.getKey().equalsIgnoreCase(target)) {
                YTImplementation implementation = operation.getValue().getImplementation();
                implementation.setPrimaryArtifactName(artifact.getFile());
                YTOperationDefinition operationDefinition = operation.getValue();
                operationDefinition.setImplementation(implementation);
```

### DataFlowIssue
Method invocation `getNamespaceURI` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/SchemaVisitor.java`
#### Snippet
```java

            // Add default YAML types 
            if (type.getNamespaceURI().equals(Namespaces.YAML_NS)) {
                builder.addElements(entry.getKey(), entry.getValue());
            }
```

### DataFlowIssue
Method invocation `getNamespaceURI` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/SchemaVisitor.java`
#### Snippet
```java
            builder.addElements(entry.getKey(), entry.getValue());
            QName type = entry.getValue().getType();
            if (type.getNamespaceURI() != null && !type.getNamespaceURI().equals(Namespaces.YAML_NS)) {
                imports.put(type.getNamespaceURI(), type.getLocalPart());
            }
```

### DataFlowIssue
Method invocation `startsWith` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
            for (TImport i : entryDefinitions.getImport()) {
                String loc = i.getLocation();
                if (!loc.startsWith("../")) {
                    LOGGER.warn("Location is not relative for id " + tcId.toReadableString());
                }
```

### DataFlowIssue
Argument `loc` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
                // locally stored, add to CSAR
                GenericImportId iid = new GenericImportId(i);
                String fileName = IdUtil.getLastURIPart(loc);
                fileName = EncodingUtil.URLdecode(fileName);
                RepositoryFileReference ref = new RepositoryFileReference(iid, fileName);
```

### DataFlowIssue
Argument `newSource` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
                    || stayingElementIds.stream().noneMatch(elementId -> elementId.equals(source.getId())))) {
                    TNodeTemplate newSource = topologyTemplateB.getNodeTemplate(idMapping.get(source.getId()));
                    rel.setSourceNodeTemplate(newSource);
                }

```

### DataFlowIssue
Argument `serviceTemplate.getTopologyTemplate()` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java
    public static TServiceTemplate clone(TServiceTemplate serviceTemplate) {
        TServiceTemplate serviceTemplateClone = new TServiceTemplate();
        TTopologyTemplate topologyTemplateClone = clone(serviceTemplate.getTopologyTemplate());
        serviceTemplateClone.setTopologyTemplate(topologyTemplateClone);
        List<TTag> tags = serviceTemplate.getTags();
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                for (Map.Entry<String, YTRequirementAssignment> data : map.getMap().entrySet()) {
                    final YTRequirementAssignment req = data.getValue();
                    TRelationshipTemplate relationship = topology.getRelationshipTemplate(req.getRelationship().getType().toString());
                    if (relationship == null) {
                        // requirement with a type that is not a RelationshipTemplate in the topology
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                for (Map.Entry<String, YTRequirementAssignment> data : map.getMap().entrySet()) {
                    final YTRequirementAssignment req = data.getValue();
                    TRelationshipTemplate relationship = topology.getRelationshipTemplate(req.getRelationship().getType().toString());
                    if (relationship == null) {
                        // requirement with a type that is not a RelationshipTemplate in the topology
```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                        continue;
                    }
                    relationship.setTargetNodeTemplate(topology.getNodeTemplate(req.getNode().toString()));
                    relationship.setSourceNodeTemplate(topology.getNodeTemplate(id));
                }
```

### DataFlowIssue
Argument `topology.getNodeTemplate(id)` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
                    }
                    relationship.setTargetNodeTemplate(topology.getNodeTemplate(req.getNode().toString()));
                    relationship.setSourceNodeTemplate(topology.getNodeTemplate(id));
                }
            }
```

### DataFlowIssue
Dereference of `file.listFiles()` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/FileUtils.java`
#### Snippet
```java
    public static void forceDeleteFile(File file) {
        if (file.isDirectory()) {
            for (File recFile : file.listFiles()) {
                forceDeleteFile(recFile);
            }
```

### DataFlowIssue
Dereference of `f.listFiles()` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/support/Utils.java`
#### Snippet
```java
        }
        if (f.isDirectory()) {
            for (final File c : f.listFiles()) {
                delete(c);
            }
```

### DataFlowIssue
Argument `inputStream` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/ImportVisitor.java`
#### Snippet
```java
                        "/".concat(typeDefinition)
                    );
                    Files.copy(inputStream, outFilePath, StandardCopyOption.REPLACE_EXISTING);
                    YTServiceTemplate serviceTemplate = reader.parseSkipTest(outFilePath, Namespaces.TOSCA_YAML_NS);
                    if (Objects.nonNull(serviceTemplate)) {
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/ProviderRepository.java`
#### Snippet
```java
        List<TServiceTemplate> fragments = getTopologyFragments(targetLabel, requirements);

        return fragments.stream().filter(tt -> tt.getTopologyTemplate().getNodeTemplates().size() != 1).map(st -> st.getTopologyTemplate())
            .collect(Collectors.toList());
    }
```

### DataFlowIssue
Argument `tf.getTopologyTemplate()` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/ProviderRepository.java`
#### Snippet
```java
        return getAllTopologyFragmentsForLocation(targetLocation).stream()
            .filter(tf ->
                getNodesWithOpenCapabilities(tf.getTopologyTemplate()) != null)
            .filter(tf -> getNodesWithOpenCapabilities(tf.getTopologyTemplate()).stream()
                .anyMatch(nt -> nt.getCapabilities().stream()
```

### DataFlowIssue
Argument `location` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/YamlCsarImporter.java`
#### Snippet
```java
            String location = imp.getLocation();
            if (Namespaces.TOSCA_YAML_NS.equals(importType)) {
                Path defsPath = basePath.resolve(location);
                // fallback for older CSARs, where the location is given from the root
                if (Files.exists(defsPath)) {
```

### DataFlowIssue
Method invocation `getClass` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlWriter.java`
#### Snippet
```java
                } else {
                    // TODO
                    LOGGER.warn("Unexpected value type [{}] in property function definition", rawFunctionArg.getClass().getName());
                    functionArg = "";
                }
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/FragmentsCache.java`
#### Snippet
```java
        }
        if (allFragments.values().stream().flatMap(List::stream).count() == 0) {
            throw new AllocationException("No matching fragments found for NT " + topLevelNT.getId() +
                " with target labels " + targetLabels);
        }
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/TopologyWrapper.java`
#### Snippet
```java
    public boolean isConnectsTo(TRelationshipTemplate relationshipTemplate) {
        TRelationshipType type = Splitting.getBaseRelationshipType(relationshipTemplate.getType());
        if (type.getName().equalsIgnoreCase("connectsTo")) {
            return true;
        }
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/TopologyWrapper.java`
#### Snippet
```java
    public boolean isHostedOn(TRelationshipTemplate relationshipTemplate) {
        TRelationshipType type = Splitting.getBaseRelationshipType(relationshipTemplate.getType());
        if (type.getName().equalsIgnoreCase("hostedOn")) {
            return true;
        }
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
        for (TNodeTemplate tNodeTemplate : tNodeTemplateList) {
            for (Server server : serverList) {
                if (tNodeTemplate.getName().toLowerCase().contains(server.toString().toLowerCase())) {
                    // add the matching keyword
                    matchedKeywords.add(server.toString());
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
            }
            for (Service service : serviceList) {
                if (tNodeTemplate.getName().toLowerCase().contains(service.toString().toLowerCase())) {
                    matchedKeywords.add(service.toString());
                    TNodeTemplateExtended temp = new TNodeTemplateExtended(tNodeTemplate, labelService, service.toString());
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
            }
            for (VirtualHardware virtualHardware : virtualHardwareList) {
                if (tNodeTemplate.getName().toLowerCase().contains(virtualHardware.toString().toLowerCase())) {
                    matchedKeywords.add(virtualHardware.toString());
                    TNodeTemplateExtended temp = new TNodeTemplateExtended(tNodeTemplate, labelVirtualHardware, virtualHardware.toString());
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
            }
            for (OperatingSystem operatingSystem : operatingSystemList) {
                if (tNodeTemplate.getName().toLowerCase().contains(operatingSystem.toString().toLowerCase())) {
                    matchedKeywords.add(operatingSystem.toString());
                    TNodeTemplateExtended temp = new TNodeTemplateExtended(tNodeTemplate, labelOS, operatingSystem.toString());
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
            }
            for (Messaging messaging : messagingList) {
                if (tNodeTemplate.getName().toLowerCase().contains(messaging.toString().toLowerCase())) {
                    matchedKeywords.add(messaging.toString());
                    TNodeTemplateExtended temp = new TNodeTemplateExtended(tNodeTemplate, labelMessaging, messaging.toString());
```

### DataFlowIssue
Method invocation `toLowerCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
            }
            for (Storage storage : storageList) {
                if (tNodeTemplate.getName().toLowerCase().contains(storage.toString().toLowerCase())) {
                    matchedKeywords.add(storage.toString());
                    TNodeTemplateExtended temp = new TNodeTemplateExtended(tNodeTemplate, labelStorage, storage.toString());
```

### DataFlowIssue
Argument `type` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyWrapper.java`
#### Snippet
```java
            if (property.getKey().equals(propertyKey)) {
                String type = getType(policyType, propertyKey);
                return cast(property.getValue(), type);
            }
        }
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
                            imp = iterator.next();
                            // TODO: add check for QNames.QNAME_WINERYS_PROPERTIES_DEFINITION_ATTRIBUTE instead of import location. The current routine, however, works, too.
                            if (imp.getLocation().equals(loc)) {
                                found = true;
                                break;
```

### DataFlowIssue
Argument `storedPrefix` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
                    // QUICK HACK to check whether the prefix is a generated one
                    // We assume we know the internal generation routine
                    Matcher m = CsarImporter.GENERATED_PREFIX_PATTERN.matcher(storedPrefix);
                    if (m.matches()) {
                        // the stored prefix is a generated one
```

### DataFlowIssue
Dereference of `state` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
    private boolean isMatchable(TNodeTemplate nodeTemplate) {
        PredecessorsTargetLabelState state = determinePredecessorsTargetLabelState(nodeTemplate);
        switch (state) {
            case ALL_PREDECESSORS_HAVE_TARGET_LABELS:
                return isMatchableAllPredecessorsHaveTargetLabel(nodeTemplate);
```

### DataFlowIssue
Method invocation `entrySet` may produce `NullPointerException`
in `org.eclipse.winery.topologygraph/src/main/java/org/eclipse/winery/topologygraph/matching/patterndetection/ToscaBehaviorPatternMatcher.java`
#### Snippet
```java
            Map<String, String> candidateProps = ModelUtilities.getPropertiesKV(candidateElement);

            compatible = detectorProps.entrySet().stream()
                .allMatch(detectorProp -> existsBehaviorPatternMapping(detectorElement, detectorProp.getKey())
                    || propertyValuesCompatible(detectorProp.getValue(), candidateProps.get(detectorProp.getKey()))
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `org.eclipse.winery.topologygraph/src/main/java/org/eclipse/winery/topologygraph/matching/patterndetection/ToscaBehaviorPatternMatcher.java`
#### Snippet
```java
            compatible = detectorProps.entrySet().stream()
                .allMatch(detectorProp -> existsBehaviorPatternMapping(detectorElement, detectorProp.getKey())
                    || propertyValuesCompatible(detectorProp.getValue(), candidateProps.get(detectorProp.getKey()))
                );
        }
```

### DataFlowIssue
Method invocation `getPath` may produce `NullPointerException`
in `org.eclipse.winery.generators.ia/src/main/java/org/eclipse/winery/generators/ia/JarAndWarGenerator.java`
#### Snippet
```java

        // Copy template project and template java files
        String s = this.getClass().getResource("").getPath();
        if (s.contains("jar!")) {
            JarAndWarGenerator.LOGGER.trace("we work on a jar file");
```

### DataFlowIssue
Method invocation `getFile` may produce `NullPointerException`
in `org.eclipse.winery.generators.ia/src/main/java/org/eclipse/winery/generators/ia/JarAndWarGenerator.java`
#### Snippet
```java
        } else {
            // we're running in debug mode, we can work on the plain file system
            File templateProjectDir = new File(this.getClass().getResource("/" + JarAndWarGenerator.TEMPLATE_PROJECT_FOLDER).getFile());
            FileUtils.copyDirectory(templateProjectDir, this.workingDirectory.toFile());

```

### DataFlowIssue
Method invocation `getFile` may produce `NullPointerException`
in `org.eclipse.winery.generators.ia/src/main/java/org/eclipse/winery/generators/ia/JarAndWarGenerator.java`
#### Snippet
```java
            FileUtils.copyDirectory(templateProjectDir, this.workingDirectory.toFile());

            File javaTemplatesDir = new File(this.getClass().getResource("/" + JarAndWarGenerator.TEMPLATE_JAVA_FOLDER).getFile());
            FileUtils.copyDirectory(javaTemplatesDir, javaTemplateDir.toFile());
        }
```

### DataFlowIssue
Dereference of `folderOrFile.listFiles()` may produce `NullPointerException`
in `org.eclipse.winery.generators.ia/src/main/java/org/eclipse/winery/generators/ia/JarAndWarGenerator.java`
#### Snippet
```java
        } else {
            JarAndWarGenerator.LOGGER.trace("Updating folder " + folderOrFile);
            for (File childFile : folderOrFile.listFiles()) {
                this.updateFilesRecursively(childFile);
            }
```

### DataFlowIssue
Dereference of `folderOrFile.listFiles()` may produce `NullPointerException`
in `org.eclipse.winery.generators.ia/src/main/java/org/eclipse/winery/generators/ia/JarAndWarGenerator.java`
#### Snippet
```java
        } else {
            JarAndWarGenerator.LOGGER.trace("Adding folder " + folderOrFile);
            for (File childFile : folderOrFile.listFiles()) {
                this.addFilesRecursively(childFile, baseDir, zos);
            }
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                                                                                                serviceTemplate) throws SplittingException {
        if (!checkApplicationSpecificComponentTargetLabeling(serviceTemplate)) {
            serviceTemplate.getTopologyTemplate().getNodeTemplates().forEach(t -> ModelUtilities.setTargetLabel(t, "*"));
        } else if (checkValidTopology(serviceTemplate)) {
            Map<TNodeTemplate, Set<TNodeTemplate>> transitiveAndDirectSuccessors = computeTransitiveClosure(serviceTemplate.getTopologyTemplate());
```

### DataFlowIssue
Argument `serviceTemplate.getTopologyTemplate()` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            serviceTemplate.getTopologyTemplate().getNodeTemplates().forEach(t -> ModelUtilities.setTargetLabel(t, "*"));
        } else if (checkValidTopology(serviceTemplate)) {
            Map<TNodeTemplate, Set<TNodeTemplate>> transitiveAndDirectSuccessors = computeTransitiveClosure(serviceTemplate.getTopologyTemplate());
            List<TNodeTemplate> appSpecificComponents = getNodeTemplatesWithoutIncomingHostedOnRelationships(serviceTemplate);

```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            List<TNodeTemplate> NodesOfOtherParticipants = serviceTemplate.getTopologyTemplate().getNodeTemplates();
            NodesOfOtherParticipants.removeIf(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()));

            transitiveAndDirectSuccessors.remove(NodesOfOtherParticipants);
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            for (TRelationshipType relationshipType : relationshipTypes) {
                if (basisCapabilityType != null && basisCapabilityType.getName().equalsIgnoreCase("container")
                    && relationshipType.getName().equalsIgnoreCase("hostedon") && relationshipType.getValidSource() == null
                    && (relationshipType.getValidTarget() == null || relationshipType.getValidTarget().getTypeRef().getLocalPart().equalsIgnoreCase("container"))) {
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            for (TRelationshipType relationshipType : relationshipTypes) {
                if (basisCapabilityType != null && basisCapabilityType.getName().equalsIgnoreCase("container")
                    && relationshipType.getName().equalsIgnoreCase("hostedon") && relationshipType.getValidSource() == null
                    && (relationshipType.getValidTarget() == null || relationshipType.getValidTarget().getTypeRef().getLocalPart().equalsIgnoreCase("container"))) {
                    return relationshipType;
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                }
                if (basisCapabilityType != null && basisCapabilityType.getName().equalsIgnoreCase("endpoint")
                    && relationshipType.getName().equalsIgnoreCase("connectsto") && relationshipType.getValidSource() == null
                    && (relationshipType.getValidTarget() == null || relationshipType.getValidTarget().getTypeRef().getLocalPart().equalsIgnoreCase("endpoint"))) {
                    return relationshipType;
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        for (TRequirement requirement : openRequirements) {
            QName requiredCapTypeQName = getRequiredCapabilityTypeQNameOfRequirement(requirement);
            List<TNodeTemplate> nodesWithMatchingCapability = topologyTemplate.getNodeTemplates().stream()
                .filter(nt -> nt.getCapabilities() != null)
                .filter(nt -> nt.getCapabilities().stream()
```

### DataFlowIssue
Argument `serviceTemplate.getTopologyTemplate()` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
     */
    public boolean checkValidTopology(TServiceTemplate serviceTemplate) {
        Map<TNodeTemplate, Set<TNodeTemplate>> transitiveAndDirectSuccessors = computeTransitiveClosure(serviceTemplate.getTopologyTemplate());

        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            List<TNodeTemplate> appSpecificComponentsOfOtherParticipants = serviceTemplate.getTopologyTemplate().getNodeTemplates();
            appSpecificComponentsOfOtherParticipants.removeIf(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()));

            transitiveAndDirectSuccessors.remove(appSpecificComponentsOfOtherParticipants);
```

### DataFlowIssue
Argument `relationshipType.getName()` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        TRelationshipTemplate matchingRelationshipTemplate = new TRelationshipTemplate();

        QName relationshipTypeQName = new QName(relationshipType.getTargetNamespace(), relationshipType.getName());
        LOGGER.debug("The QName of the matchingRelationshipType for ReqCap Matching", relationshipTypeQName);
        List<String> ids = new ArrayList<>();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            LinkedHashMap<String, String> properties1 = ModelUtilities.getPropertiesKV(node1);
            LinkedHashMap<String, String> properties2 = ModelUtilities.getPropertiesKV(node2);
            if (!properties1.equals(properties2)) {
                return false;
            }
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                                                                                           serviceTemplate) {
        List<TNodeTemplate> participantNodes = new ArrayList<>();
        List<TNodeTemplate> nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates().stream()
            .filter(nt -> getHostedOnSuccessorsOfNodeTemplate(serviceTemplate.getTopologyTemplate(), nt).isEmpty())
            .collect(Collectors.toList());
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            .filter(nt -> nt.getRequirements() != null)
            .filter(nt -> nt.getRequirements().stream()
                .anyMatch(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Endpoint")))
            .collect(Collectors.toList());

```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            for (TNodeTemplate nodeWithOpenConnectionRequirement : nodeTemplatesWithConnectionRequirement) {
                List<TRequirement> requirements = nodeWithOpenConnectionRequirement.getRequirements().stream()
                    .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Endpoint"))
                    .filter(req -> getOpenRequirementsAndMatchingBasisCapabilityTypeNames(serviceTemplate).keySet().contains(req))
                    .collect(Collectors.toList());
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            QName requiredCapabilityTypeQName = getRequiredCapabilityTypeQNameOfRequirement(requirement);

            TNodeTemplate nodeWithOpenCapability = composedTopologyTemplate.getNodeTemplates().stream()
                .filter(nt -> nt.getCapabilities() != null)
                .filter(nt -> nt.getCapabilities().stream()
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
    public List<TRequirement> getOpenRequirements(TServiceTemplate serviceTemplate) {
        List<TRequirement> openRequirements = new ArrayList<>();
        List<TNodeTemplate> nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates();

        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        List<TNodeTemplate> nodeTemplates = new ArrayList<>();
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates().stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()))
                .collect(Collectors.toList());
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate) != null) {
            nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates().stream().filter(nt -> ModelUtilities.getParticipant(nt).isPresent())
                .filter(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()))
                .collect(Collectors.toList());
        }
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                                                                                           serviceTemplate) {

        List<TNodeTemplate> nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates()
            .stream()
            .filter(nt -> getHostedOnPredecessorsOfNodeTemplate(serviceTemplate.getTopologyTemplate(), nt).isEmpty())
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            if (!checkApplicationSpecificComponentTargetLabeling(serviceTemplate)) {
                LOGGER.debug("Target labels are not set for all NodeTemplates. Using default target labels.");
                topologyTemplate.getNodeTemplates().forEach(t -> ModelUtilities.setTargetLabel(t, "*"));
            }

```

### DataFlowIssue
Argument `daSpecifiedTopology` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

        //Start additional functionality Driver Injection
        if (!DASpecification.getNodeTemplatesWithAbstractDAs(daSpecifiedTopology).isEmpty() &&
            DASpecification.getNodeTemplatesWithAbstractDAs(daSpecifiedTopology) != null) {
            daSpecifiedTopology = DriverInjection.injectDriver(daSpecifiedTopology);
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (!DASpecification.getNodeTemplatesWithAbstractDAs(daSpecifiedTopology).isEmpty() &&
            DASpecification.getNodeTemplatesWithAbstractDAs(daSpecifiedTopology) != null) {
            daSpecifiedTopology = DriverInjection.injectDriver(daSpecifiedTopology);
        }
        //End additional functionality Driver Injection
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            if (hasNodeOpenRequirement(serviceTemplate, nodeTemplateCandidate)) {
                if (nodeTemplateCandidate.getRequirements() != null && nodeTemplateCandidate.getRequirements().stream()
                    .anyMatch(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Container"))) {
                    nodesToCheck.add(nodeTemplateCandidate);
                }
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

                List<TRequirement> openHostedOnRequirements = needHostNode.getRequirements().stream()
                    .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Container")).collect(Collectors.toList());

                List<TServiceTemplate> compatibleTopologyFragments = repository
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    } else {
                        List<TRequirement> openHostedOnRequirements = predecessor.getRequirements().stream()
                            .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Container")).collect(Collectors.toList());

                        List<TServiceTemplate> compatibleTopologyFragments = repository
```

### DataFlowIssue
Method invocation `getNodeTemplateOrRelationshipTemplate` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            }
            // Delete all replacement candidates and their relationships.
            serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(replacementNodeTemplateCandidates);
            List<TRelationshipTemplate> removingIncomingRelationships = ModelUtilities.getAllRelationshipTemplates(serviceTemplate.getTopologyTemplate())
                .stream()
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
         * The application-specific nodes must not be replacement candidates!
         */
        List<TNodeTemplate> checkListAllNodesMatched = serviceTemplate.getTopologyTemplate().getNodeTemplates().stream()
            .filter(z -> getNodeTemplatesWithoutOutgoingHostedOnRelationships(serviceTemplate).contains(z))
            .filter(node -> hasNodeOpenRequirement(serviceTemplate, node))
```

### DataFlowIssue
Method invocation `addNodeTemplate` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                        }

                        serviceTemplate.getTopologyTemplate().addNodeTemplate(duplicatedNode);
                        serviceTemplateCopy.getTopologyTemplate().addNodeTemplate(duplicatedNode);
                        ModelUtilities.setTargetLabel(duplicatedNode, targetLabel);
```

### DataFlowIssue
Method invocation `addNodeTemplate` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

                        serviceTemplate.getTopologyTemplate().addNodeTemplate(duplicatedNode);
                        serviceTemplateCopy.getTopologyTemplate().addNodeTemplate(duplicatedNode);
                        ModelUtilities.setTargetLabel(duplicatedNode, targetLabel);

```

### DataFlowIssue
Method invocation `getNodeTemplateOrRelationshipTemplate` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

                    // Remove the original node and its relations from the origin topology template and the copy
                    serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().remove(currentNode);
                    serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(outgoingRelationships);
                    serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(incomingRelationships);
```

### DataFlowIssue
Method invocation `getNodeTemplateOrRelationshipTemplate` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(outgoingRelationships);
                    serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(incomingRelationships);
                    serviceTemplateCopy.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().remove(currentNode);
                    serviceTemplateCopy.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(outgoingRelationships);
                    serviceTemplateCopy.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(incomingRelationships);
```

### DataFlowIssue
Method invocation `getNodeTemplateOrRelationshipTemplate` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

                // Remove the hostedOn-predecessors of the considered node and their relations in the working copy
                serviceTemplateCopy.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(predecessors);
                List<TRelationshipTemplate> removingRelationships =
                    serviceTemplateCopy.getTopologyTemplate().getRelationshipTemplates().stream()
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .findFirst()
                .orElse(null);
            LOGGER.debug("Predecessor which get a new host " + predecessorOfNewHost.getId());

            List<TNodeTemplate> originHostSuccessors = new ArrayList<>();
```

### DataFlowIssue
Method invocation `equals` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            originHostSuccessors = getHostedOnSuccessorsOfNodeTemplate(topologyTemplate, predecessorOfNewHost);
            TRequirement openHostedOnRequirement = predecessorOfNewHost.getRequirements().stream()
                .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equals("Container"))
                .findAny().get();
            TNodeTemplate newMatchingNodeTemplate;
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    TCapabilityType matchingBasisCapabilityType = getBasisCapabilityType(requiredCapabilityTypeQName);

                    if (matchingBasisCapabilityType.getName().equalsIgnoreCase("Container")) {
                        requiredRequirement = requirement;
                    }
```

### DataFlowIssue
Method invocation `equalsIgnoreCase` may produce `NullPointerException`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                for (TCapability capability : openCapabilities) {
                    TCapabilityType basisCapabilityType = getBasisCapabilityType(capability.getType());
                    if (basisCapabilityType.getName().equalsIgnoreCase("Container")) {
                        requiredCapability = capability;
                    }
```

### DataFlowIssue
Argument `relationshipType.getName()` might be null
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    TRelationshipType relationshipType = getMatchingRelationshipType(requiredRequirement, requiredCapability);
                    if (relationshipType != null) {
                        QName relationshipTypeQName = new QName(relationshipType.getTargetNamespace(), relationshipType.getName());
                        newHostedOnRelationship.setType(relationshipTypeQName);
                    } else {
```

### DataFlowIssue
Method invocation `getKVProperties` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TestRefinementModelResource.java`
#### Snippet
```java
            }
            if (relTemplate.getType().getLocalPart().startsWith("RelationshipMapping")) {
                Map<String, String> propertiesMap = ((TEntityTemplate.WineryKVProperties) relTemplate.getProperties()).getKVProperties();
                this.getRelationMappings().addMapping(new OTRelationMapping(new OTRelationMapping.Builder(mappingId)
                    .setDetectorElement(relTemplate.getSourceElement().getRef())
```

### DataFlowIssue
Method invocation `getKVProperties` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TopologyFragmentRefinementModelResource.java`
#### Snippet
```java
            }
            if (relTemplate.getType().getLocalPart().startsWith("RelationshipMapping")) {
                Map<String, String> propertiesMap = ((TEntityTemplate.WineryKVProperties) relTemplate.getProperties()).getKVProperties();
                this.getRelationMappings().addMapping(new OTRelationMapping(new OTRelationMapping.Builder(mappingId)
                    .setDetectorElement(relTemplate.getSourceElement().getRef())
```

### DataFlowIssue
Method invocation `getKVProperties` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TopologyFragmentRefinementModelResource.java`
#### Snippet
```java
            }
            if (relTemplate.getType().getLocalPart().startsWith("AttributeMapping")) {
                Map<String, String> propertiesMap = ((TEntityTemplate.WineryKVProperties) relTemplate.getProperties()).getKVProperties();
                this.getAttributeMappings().addMapping(new OTAttributeMapping(new OTAttributeMapping.Builder(mappingId)
                    .setDetectorElement(relTemplate.getSourceElement().getRef())
```

### DataFlowIssue
Method invocation `getKVProperties` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TopologyFragmentRefinementModelResource.java`
#### Snippet
```java
            }
            if (relTemplate.getType().getLocalPart().startsWith("DeploymentArtifactMapping")) {
                Map<String, String> propertiesMap = ((TEntityTemplate.WineryKVProperties) relTemplate.getProperties()).getKVProperties();
                this.getDeploymentArtifactMappings().addMapping(new OTDeploymentArtifactMapping(new OTDeploymentArtifactMapping.Builder(mappingId)
                    .setDetectorElement(relTemplate.getSourceElement().getRef())
```

### DataFlowIssue
Method invocation `getKVProperties` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TopologyFragmentRefinementModelResource.java`
#### Snippet
```java
            }
            if (relTemplate.getType().getLocalPart().startsWith("BehaviorPatternMapping")) {
                Map<String, String> propertiesMap = ((TEntityTemplate.WineryKVProperties) relTemplate.getProperties()).getKVProperties();
                ((PatternRefinementModelResource) this).getBehaviorPatternMappings()
                    .addMapping(new OTBehaviorPatternMapping(new OTBehaviorPatternMapping.Builder(mappingId)
```

### DataFlowIssue
Argument `this.res.getServiceTemplate().getTopologyTemplate()` might be null
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/PropertyMappingsResource.java`
#### Snippet
```java
        }

        TEntityTemplate template = ModelUtilities.findNodeTemplateOrRequirementOfNodeTemplateOrCapabilityOfNodeTemplateOrRelationshipTemplate(this.res.getServiceTemplate().getTopologyTemplate(), apiPropertyMapping.targetObjectRef);
        if (template == null) {
            return Response.status(Status.BAD_REQUEST).entity("targetObjectRef " + apiPropertyMapping.targetObjectRef + " could not be resolved.").build();
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/InterfacesResource.java`
#### Snippet
```java
                        ((ServiceTemplateResource) res).getServiceTemplate()
                            .getTopologyTemplate()
                            .getNodeTemplates()
                            .stream()
                            .filter(node -> node.getId().contentEquals(nodeRef))
```

### DataFlowIssue
Method invocation `getRelationshipTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/InterfacesResource.java`
#### Snippet
```java
                        ((ServiceTemplateResource) res).getServiceTemplate()
                            .getTopologyTemplate()
                            .getRelationshipTemplates()
                            .stream()
                            .filter(relationship -> relationship.getId().contentEquals(relationshipRef))
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/InterfacesResource.java`
#### Snippet
```java
                        ((ServiceTemplateResource) res).getServiceTemplate()
                            .getPlans()
                            .stream()
                            .filter(relationship -> relationship.getId().contentEquals(planRef))
                            .findFirst()
```

### DataFlowIssue
Method invocation `setNodeRef` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/ExportedOperationResource.java`
#### Snippet
```java
            case "NodeOperation":
                TNodeTemplate nodeTemplate = ModelUtilities.resolveNodeTemplate(ste, ref);
                this.o.getNodeOperation().setNodeRef(nodeTemplate);
                break;
            case "RelationshipOperation":
```

### DataFlowIssue
Method invocation `setRelationshipRef` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/ExportedOperationResource.java`
#### Snippet
```java
            case "RelationshipOperation":
                TRelationshipTemplate relationshipTemplate = ModelUtilities.resolveRelationshipTemplate(ste, ref);
                this.o.getRelationshipOperation().setRelationshipRef(relationshipTemplate);
                break;
            case "Plan":
```

### DataFlowIssue
Method invocation `setPlanRef` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/interfaces/ExportedOperationResource.java`
#### Snippet
```java
            case "Plan":
                TPlan plan = ModelUtilities.resolvePlan(ste, ref);
                this.o.getPlan().setPlanRef(plan);
                break;
            default:
```

### DataFlowIssue
Method invocation `getNodeTemplate` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/PlaceholderSubstitutionWebSocket.java`
#### Snippet
```java
        ArrayList<TNodeTemplate> listOfSelectedNodeTemplate = new ArrayList<>();
        nodeTemplateIDs.stream()
            .forEach(id -> listOfSelectedNodeTemplate.add(serviceTemplate.getTopologyTemplate().getNodeTemplate(id)));

        //participant-aware placeholder selection - only nodes with the placeholder owning the service template are considered
```

### DataFlowIssue
Method invocation `getRelationshipTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/PlaceholderSubstitutionWebSocket.java`
#### Snippet
```java
        }

        List<TRelationshipTemplate> relationsBetweenNodes = serviceTemplate.getTopologyTemplate().getRelationshipTemplates().stream().filter(rt ->
            listOfSelectedNodeTemplate.contains(ModelUtilities.getNodeTemplateFromRelationshipSourceOrTarget(serviceTemplate.getTopologyTemplate(), rt.getSourceElement().getRef()))
                && listOfSelectedNodeTemplate.contains(ModelUtilities.getNodeTemplateFromRelationshipSourceOrTarget(serviceTemplate.getTopologyTemplate(), rt.getTargetElement().getRef()))).collect(Collectors.toList());
```

### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
                resolvedProperties = newKvs.stream()
                    .map(PropertyDefinitionKV::getKey)
                    .filter(keys -> oldKvs.keySet()
                        .stream()
                        .map(String::toLowerCase)
```

### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
                    .collect(Collectors.toList());

                removedProperties = oldKvs.keySet().stream()
                    .filter(keys -> !newKvs.stream()
                        .map(newProp -> newProp.getKey().toLowerCase())
```

### DataFlowIssue
Argument `dockerContainer.getX()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/dockerimage/WeaveFrontEndHandler.java`
#### Snippet
```java

        topologyTemplate.addNodeTemplate(nodeJs);
        nodeJs.setX(dockerContainer.getX());
        nodeJs.setY(String.valueOf(Integer.parseInt(dockerContainer.getY()) - 160));

```

### DataFlowIssue
Argument `dockerContainer.getY()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/dockerimage/WeaveFrontEndHandler.java`
#### Snippet
```java
        topologyTemplate.addNodeTemplate(nodeJs);
        nodeJs.setX(dockerContainer.getX());
        nodeJs.setY(String.valueOf(Integer.parseInt(dockerContainer.getY()) - 160));

        ModelUtilities.createRelationshipTemplateAndAddToTopology(nodeJs,
```

### DataFlowIssue
Argument `nodeJs.getX()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/dockerimage/WeaveFrontEndHandler.java`
#### Snippet
```java

        topologyTemplate.addNodeTemplate(nodeApp);
        nodeApp.setX(nodeJs.getX());
        nodeApp.setY(String.valueOf(Integer.parseInt(nodeJs.getY()) - 160));

```

### DataFlowIssue
Argument `nodeJs.getY()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/dockerimage/WeaveFrontEndHandler.java`
#### Snippet
```java
        topologyTemplate.addNodeTemplate(nodeApp);
        nodeApp.setX(nodeJs.getX());
        nodeApp.setY(String.valueOf(Integer.parseInt(nodeJs.getY()) - 160));

        ModelUtilities.createRelationshipTemplateAndAddToTopology(nodeApp,
```

### DataFlowIssue
Argument `host.getX()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/InstanceModelUtils.java`
#### Snippet
```java
                host
        );
        node.setX(host.getX());
        node.setY(String.valueOf(Integer.parseInt(host.getY()) - 160));
        topology.addNodeTemplate(node);
```

### DataFlowIssue
Argument `host.getY()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/InstanceModelUtils.java`
#### Snippet
```java
        );
        node.setX(host.getX());
        node.setY(String.valueOf(Integer.parseInt(host.getY()) - 160));
        topology.addNodeTemplate(node);
        topology.addRelationshipTemplate(relationshipTemplate);
```

### DataFlowIssue
Argument `topology.getNodeTemplate(topologyNodeId)` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/tests/TestRefinement.java`
#### Snippet
```java
                        if (relationMapping.getDirection() == OTRelationDirection.INGOING) {
                            String targetId = idMapping.get(relationMapping.getRefinementElement().getId());
                            relationshipTemplate.setSourceNodeTemplate(topology.getNodeTemplate(topologyNodeId));
                            relationshipTemplate.setTargetNodeTemplate(topology.getNodeTemplate(targetId));
                        } else {
```

### DataFlowIssue
Argument `topology.getNodeTemplate(sourceId)` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/tests/TestRefinement.java`
#### Snippet
```java
                        } else {
                            String sourceId = idMapping.get(relationMapping.getRefinementElement().getId());
                            relationshipTemplate.setSourceNodeTemplate(topology.getNodeTemplate(sourceId));
                            relationshipTemplate.setTargetNodeTemplate(topology.getNodeTemplate(topologyNodeId));
                        }
```

### DataFlowIssue
Argument `topology.getNodeTemplate(id)` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/RefinementUtils.java`
#### Snippet
```java
                if (Objects.nonNull(idMapping)) {
                    String id = idMapping.get(relationMapping.getRefinementElement().getId());
                    relationship.setSourceNodeTemplate(topology.getNodeTemplate(id));
                }
                return true;
```

### DataFlowIssue
Method invocation `stream` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java
    private void addCompatibleBehaviorPatterns(TEntityTemplate refinementElement, RefinementCandidate refinement) {
        OTPatternRefinementModel prm = (OTPatternRefinementModel) refinement.getRefinementModel();
        TEntityTemplate detectorElement = prm.getStayMappings().stream()
            .filter(stayMapping -> stayMapping.getRefinementElement().getId().equals(refinementElement.getId()))
            .findFirst().get()
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java
                    && ModelUtilities.hasKvProperties(candidateElement)) {
                    String detectorValue = ModelUtilities.getPropertiesKV(detectorElement.getTemplate())
                        .get(bpm.getProperty().getKey());
                    String candidateValue = ModelUtilities.getPropertiesKV(candidateElement)
                        .get(bpm.getProperty().getKey());
```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/patterndetection/BehaviorPatternDetection.java`
#### Snippet
```java
                        .get(bpm.getProperty().getKey());
                    String candidateValue = ModelUtilities.getPropertiesKV(candidateElement)
                        .get(bpm.getProperty().getKey());
                    boolean propsNotCompatible = (detectorValue != null && !detectorValue.isEmpty())
                        && !detectorValue.equalsIgnoreCase(candidateValue)
```

### DataFlowIssue
Argument `ModelUtilities.getPropertiesKV(relationSourceTemplate)` might be null
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                        Map<String, String> relationSourceProperties = new HashMap<>();
                        if (relationSourceTemplate.getProperties() != null) {
                            relationSourceProperties.putAll(ModelUtilities.getPropertiesKV(relationSourceTemplate));
                        }
                        if (incomingRelation.getProperties() != null) {
```

### DataFlowIssue
Argument `ModelUtilities.getPropertiesKV(incomingRelation)` might be null
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                        }
                        if (incomingRelation.getProperties() != null) {
                            relationSourceProperties.putAll(ModelUtilities.getPropertiesKV(incomingRelation));
                        }
                        TNodeTemplate relationTargetTemplate = ModelUtilities.getTargetNodeTemplateOfRelationshipTemplate(topologyTemplate, incomingRelation);
```

### DataFlowIssue
Argument `placeholderNodeType.getName()` might be null
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                // create new placeholder node type
                TNodeType placeholderNodeType = splitting.createPlaceholderNodeType(nodeTemplateWithOpenReq.getName());
                QName placeholderQName = new QName(placeholderNodeType.getTargetNamespace(), placeholderNodeType.getName());

                WinerysPropertiesDefinition winerysPropertiesDefinition = elementNodeType.getWinerysPropertiesDefinition();
```

### DataFlowIssue
Argument `placeholderNodeTemplate.getY()` might be null
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

                //Set new coordinates
                int y = Integer.parseInt(placeholderNodeTemplate.getY()) + 200;
                placeholderNodeTemplate.setY(Integer.toString(y));
                placeholderNodeTemplate.setX(placeholderNodeTemplate.getX());
```

### DataFlowIssue
Argument `placeholderNodeTemplate.getX()` might be null
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                int y = Integer.parseInt(placeholderNodeTemplate.getY()) + 200;
                placeholderNodeTemplate.setY(Integer.toString(y));
                placeholderNodeTemplate.setX(placeholderNodeTemplate.getX());
                // add placeholder to node template and connect with source node template with open requirements
                topologyTemplate.addNodeTemplate(placeholderNodeTemplate);
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                );

                String choreoValue = splitting.calculateChoreographyTag(this.getServiceTemplate().getTopologyTemplate().getNodeTemplates(), participant.getName());
                tags.add(
                    new TTag.Builder("choreography", choreoValue)
```

### DataFlowIssue
Method invocation `setParticipants` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                TServiceTemplate tempServiceTempl = repo.getElement(newId);
                tempServiceTempl.setTags(tags);
                tempServiceTempl.getTopologyTemplate().setParticipants(newParticipantList);

                listOfResponses.add(response.getResponse());
```

### DataFlowIssue
Method invocation `setParticipants` may produce `NullPointerException`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        TServiceTemplate newServiceTemplate = repo.getElement(newId);
        newServiceTemplate.setTopologyTemplate(BackendUtils.clone(originTopologyTemplate));
        newServiceTemplate.getTopologyTemplate().setParticipants(participants);

        Splitting splitting = new Splitting();
```

### DataFlowIssue
Variable is already assigned to this value
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        if (!DASpecification.getNodeTemplatesWithAbstractDAs(matchedConnectedTopologyTemplate).isEmpty() &&
            DASpecification.getNodeTemplatesWithAbstractDAs(matchedConnectedTopologyTemplate) != null) {
            daSpecifiedTopology = DriverInjection.injectDriver(matchedConnectedTopologyTemplate);
        }
        //End additional functionality Driver Injection
```

### DataFlowIssue
Method invocation `getType` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/IpSecAlgorithm.java`
#### Snippet
```java
            }

            Map<QName, TNodeType> children = ModelUtilities.getChildrenOf(elements[index].getType(), nodeTypes);

            // simply use the first element
```

### DataFlowIssue
Method invocation `setPolicies` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        TRelationshipTemplate newRelationshipTemplate = ModelUtilities.createRelationshipTemplateAndAddToTopology(sourceNode, sourceNodeProxy,
            OpenToscaBaseTypes.httpConnectsTo, "httpconnectsTo", topology);
        topology.getRelationshipTemplate(newRelationshipTemplate.getId()).setPolicies(oldConnectionPolicies);
        newRelationshipTemplate = ModelUtilities.createRelationshipTemplateAndAddToTopology(sourceNodeProxy, topicNode,
            OpenToscaBaseTypes.topicConnectsTo, "topicconnectsTo", topology);
```

### DataFlowIssue
Method invocation `setPolicies` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        newRelationshipTemplate = ModelUtilities.createRelationshipTemplateAndAddToTopology(sourceNodeProxy, topicNode,
            OpenToscaBaseTypes.topicConnectsTo, "topicconnectsTo", topology);
        topology.getRelationshipTemplate(newRelationshipTemplate.getId()).setPolicies(oldConnectionPolicies);
        newRelationshipTemplate = ModelUtilities.createRelationshipTemplateAndAddToTopology(targetNodeProxy, topicNode,
            OpenToscaBaseTypes.topicConnectsTo, "topicconnectsTo", topology);
```

### DataFlowIssue
Method invocation `setPolicies` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        newRelationshipTemplate = ModelUtilities.createRelationshipTemplateAndAddToTopology(targetNodeProxy, topicNode,
            OpenToscaBaseTypes.topicConnectsTo, "topicconnectsTo", topology);
        topology.getRelationshipTemplate(newRelationshipTemplate.getId()).setPolicies(oldConnectionPolicies);
        newRelationshipTemplate = ModelUtilities.createRelationshipTemplateAndAddToTopology(targetNodeProxy, targetNode,
            OpenToscaBaseTypes.httpConnectsTo, "httpconnectsTo", topology);
```

### DataFlowIssue
Method invocation `setPolicies` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        newRelationshipTemplate = ModelUtilities.createRelationshipTemplateAndAddToTopology(targetNodeProxy, targetNode,
            OpenToscaBaseTypes.httpConnectsTo, "httpconnectsTo", topology);
        topology.getRelationshipTemplate(newRelationshipTemplate.getId()).setPolicies(oldConnectionPolicies);

        Optional<String> participantSource = ModelUtilities.getParticipant(sourceNode);
```

### DataFlowIssue
Argument `referenceNode.getX()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java

    protected void setNewCoordinates(TNodeTemplate referenceNode, TNodeTemplate newNode, int newX, int newY) {
        int x = Integer.parseInt(referenceNode.getX()) + newX;
        newNode.setX(Integer.toString(x));

```

### DataFlowIssue
Argument `referenceNode.getY()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
        newNode.setX(Integer.toString(x));

        int y = Integer.parseInt(referenceNode.getY()) + newY;
        newNode.setY(Integer.toString(y));
    }
```

### DataFlowIssue
Method invocation `getNodeTemplate` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java

                    TNodeTemplate correspondingNode = substitution.getServiceTemplateCandidate().getTopologyTemplate()
                        .getNodeTemplate(substitution.getGraphMapping().getVertexCorrespondence(v, false).getTemplate().getId());
                    TRelationshipTemplate outgoingRelationship = ModelUtilities.getOutgoingRelationshipTemplates(substitutionTemplate, correspondingNode)
                        .stream()
```

### DataFlowIssue
Argument `st.getTopologyTemplate()` might be null
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
        List<PlaceholderSubstitutionCandidate> matchingCandidates = new ArrayList<>();
        serviceTemplateCandidates.forEach((qName, st) -> {
            ToscaGraph topologyGraph = ToscaTransformer.createTOSCAGraph(st.getTopologyTemplate());
            IToscaMatcher matcher = new ToscaPropertyMatcher();
            Iterator<GraphMapping<ToscaNode, ToscaEdge>> matches = isomorphismMatcher.findMatches(detectorGraph, topologyGraph, matcher);
```

### DataFlowIssue
Method invocation `keySet` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
                Set<String> placeholderPropertyNames = new HashSet<>();
                if (ModelUtilities.getPropertiesKV(placeholder) != null) {
                    placeholderPropertyNames = ModelUtilities.getPropertiesKV(placeholder).keySet();
                }

```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
                }

                if (candidate.getServiceTemplateCandidate().getTopologyTemplate().getNodeTemplates().stream()
                    .anyMatch(nt -> nt.getType().getNamespaceURI().equals(OpenToscaBaseTypes.placeholderTypeNamespace))) {
                    return false;
```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
        this.utils = new ThreatModelingUtils(repository);
        serviceTemplate = repository.getElement(serviceTemplateId);
        nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates();
    }

```

### DataFlowIssue
Method invocation `getNodeTemplates` may produce `NullPointerException`
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
        this.utils = new ThreatModelingUtils(repository);
        serviceTemplate = repository.getElement(serviceTemplateId);
        nodeTemplates = serviceTemplate.getTopologyTemplate().getNodeTemplates();
    }

```

### DataFlowIssue
Method invocation `get` may produce `NullPointerException`
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
                    LinkedHashMap<String, String> properties = ModelUtilities.getPropertiesKV(mitigationTemplate);
                    // FIXME Assumption that we're dealing with simple KV Properties
                    String threatReferenceString = (String)properties.get("ThreatReference");

                    QName threatReference = QName.valueOf(threatReferenceString);
```

### DataFlowIssue
Method invocation `getLocalPart` may produce `NullPointerException`
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
                            threat.setProperties(ModelUtilities.getPropertiesKV(threatTemplate));
                        }
                        threat.setTemplateName(threatQName.getLocalPart());
                        threat.setNamespace(threatQName.getNamespaceURI());

```

### DataFlowIssue
Method invocation `toString` may produce `NullPointerException`
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModelingUtils.java`
#### Snippet
```java
            .stream()
            .map(repository::getElement)
            .filter((TPolicyTemplate policyTemplate) -> policyTemplate.getTypeAsQName().toString().equals(ThreatModelingConstants.THREAT_POLICY_ID))
            .map((TPolicyTemplate policyTemplate) -> {
                Threat threat = new Threat();
```

### DataFlowIssue
Dereference of `folder.listFiles()` may produce `NullPointerException`
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/crawler/LocalCrawler.java`
#### Snippet
```java

        List<Dockerfile> dockerfiles = new ArrayList<>();
        for (File file : folder.listFiles()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String repoName = reader.readLine();
```

### DataFlowIssue
Method invocation `getId` may produce `NullPointerException`
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/SortParser.java`
#### Snippet
```java

	public ManagementFlow buildManagementFlow() {
		List<Node> nodeList = buildNodeList(getStartEvent().getId());
		ManagementFlow managementFlow = convert2ManagementFlow(nodeList);

```

## RuleId[id=MissingSerialAnnotation]
### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmType.java`
#### Snippet
```java

public class EdmmType implements Serializable {
    private static final long serialVersionUID = -8206466497675515123L;
    private final String value;

```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/exceptions/QNameAlreadyExistsException.java`
#### Snippet
```java
public class QNameAlreadyExistsException extends Exception {

    private static final long serialVersionUID = 1L;

}
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/NamespaceProperties.java`
#### Snippet
```java
public class NamespaceProperties implements Serializable, Comparable<NamespaceProperties> {

    private static final long serialVersionUID = -6867642303902116547L;

    private String namespace;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.winery.topologygraph/src/main/java/org/eclipse/winery/topologygraph/model/ToscaGraph.java`
#### Snippet
```java
public class ToscaGraph extends SimpleDirectedGraph<ToscaNode, ToscaEdge> {

    private static final long serialVersionUID = 1L;

    public ToscaGraph() {
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/apiData/AccountabilityConfigurationData.java`
#### Snippet
```java

public class AccountabilityConfigurationData implements Serializable {
    private static final long serialVersionUID = -2267642315902119999L;
    
    private String blockchainNodeUrl;
```

### MissingSerialAnnotation
`serialVersionUID` can be annotated with '@Serial' annotation
in `org.eclipse.winery.model.csar.toscametafile/src/main/java/org/eclipse/winery/model/csar/toscametafile/TOSCAMetaFile.java`
#### Snippet
```java
public class TOSCAMetaFile implements Serializable {

    private static final long serialVersionUID = 5636441655503533546L;

    private Map<String, String> block0 = new HashMap<>();
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmExporter.java`
#### Snippet
```java
                .filter(artifact -> artifact.getInterfaceName() != null)
                .filter(artifact -> artifact.getInterfaceName().equals(interfaceName))
                .collect(Collectors.toList());

            if (artifacts.size() == 1 && artifacts.get(0).getArtifactRef() != null) {
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/converter/support/exception/MultiException.java`
#### Snippet
```java
            .concat("\nMultiException Context = ")
            .concat(context.stream()
                .collect(Collectors.joining("\n   "))
            );
    }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ServiceTemplateComplianceRuleRuleChecker.java`
#### Snippet
```java
                    ns.getDecoded().split("/compliancerules")[0]
                )
            ).collect(Collectors.toList());

        for (Namespace space : relevantNamespaces) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
                    collect.stream()
                        .filter(id -> !id.isSelfContained())
                        .collect(Collectors.toList())
                );
            } else if (collect.size() > 1 && collect.stream().anyMatch(id -> !id.isSelfContained())) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
                    collect.stream()
                        .filter(DefinitionsChildId::isSelfContained)
                        .collect(Collectors.toList())
                );
            }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/xml/converter/FromCanonical.java`
#### Snippet
```java
            XTRelationshipTemplate.RelationshipConstraints constraints = new XTRelationshipTemplate.RelationshipConstraints();
            constraints.getRelationshipConstraint().addAll(canonical.getRelationshipConstraints().getRelationshipConstraint().stream()
                .map(this::convert).collect(Collectors.toList()));
            builder.setRelationshipConstraints(constraints);
        }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/xml/converter/ToCanonical.java`
#### Snippet
```java
            TRelationshipTemplate.RelationshipConstraints constraints = new TRelationshipTemplate.RelationshipConstraints();
            constraints.getRelationshipConstraint().addAll(xml.getRelationshipConstraints().getRelationshipConstraint().stream()
                .map(this::convert).collect(Collectors.toList()));
            builder.setRelationshipConstraints(constraints);
        }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/BackendUtils.java`
#### Snippet
```java

                return new TArtifactReference.Builder(path).build();
            }).collect(Collectors.toList()));

            // finally, persist only if something changed
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/WineryVersionUtils.java`
#### Snippet
```java
                .filter(version -> version.getComponentVersion().equals(current[0].getComponentVersion()))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
            current[0].setReleasable(collect.get(0).isCurrentVersion());
            // And if there are changes, it's also editable.
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/selfcontainmentpackager/SelfContainmentPackager.java`
#### Snippet
```java
                .filter(Objects::nonNull)
                .filter(SelfContainmentPlugin.GeneratedArtifacts::containsNewElements)
                .collect(Collectors.toList());

            if (!generatedArtifacts.isEmpty()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/selfcontainmentpackager/SelfContainmentPackager.java`
#### Snippet
```java
                            .map(repository::getElement)
                            .filter(element -> element.getImplementationArtifacts() != null)
                            .collect(Collectors.toList());

                        for (TNodeTypeImplementation impl : nodeTypeImplementations) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/WriterUtils.java`
#### Snippet
```java

            List<File> files = Files.list(path).filter(Files::isRegularFile)
                .map(Path::toFile).collect(Collectors.toList());
            for (File file : files) {
                BufferedInputStream stream = new BufferedInputStream(new FileInputStream(file));
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
                    // -> check if any file in the folder is changed
                    .filter(item -> item.getNewPath().startsWith(BackendUtils.getPathInsideRepo(ref.getParent())))
                    .collect(Collectors.toList());
                git.getRepository().close();
                return entries.size() > 0;
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/FieldValidator.java`
#### Snippet
```java
                    final String snakeCaseFieldName = matches.replaceAll("_$0").toLowerCase();
                    return snakeCaseFieldName;
                }).collect(Collectors.toList()));
            setDeclaredFields(base, parent.getSuperclass());
        }
```

### SimplifyStreamApiCallChains
'filter()' and 'map()' can be swapped
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/ProviderRepository.java`
#### Snippet
```java
        List<TServiceTemplate> fragments = getTopologyFragments(targetLabel, requirements);

        return fragments.stream().filter(tt -> tt.getTopologyTemplate().getNodeTemplates().size() != 1).map(st -> st.getTopologyTemplate())
            .collect(Collectors.toList());
    }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/ProviderRepository.java`
#### Snippet
```java
                        .filter(t -> t instanceof TNodeTemplate)
                        .map(TNodeTemplate.class::cast)
                        .collect(Collectors.toList());

                    matchedNodeTemplates.forEach(t ->
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/PermutationHelper.java`
#### Snippet
```java
    @Override
    public String toString() {
        List<String> ids = correspondingNTs.stream().map(HasId::getId).collect(Collectors.toList());
        List<String> replacementIds = replacements.stream()
            .map(tt -> tt.getNodeTemplates().get(0).getId()).collect(Collectors.toList());
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/PermutationHelper.java`
#### Snippet
```java
        List<String> ids = correspondingNTs.stream().map(HasId::getId).collect(Collectors.toList());
        List<String> replacementIds = replacements.stream()
            .map(tt -> tt.getNodeTemplates().get(0).getId()).collect(Collectors.toList());
        return "{NTs: " + ids +
            ", replacement: " + replacementIds +
```

### SimplifyStreamApiCallChains
Can be replaced with 'String.join'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
        @Override
        public String toString() {
            return context.stream().collect(Collectors.joining(":"));
        }
    }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/TopologyWrapper.java`
#### Snippet
```java
    @Override
    public String toString() {
        List<String> nts = topologyTemplate.getNodeTemplates().stream().map(HasId::getId).collect(Collectors.toList());
        List<String> rts = topologyTemplate.getRelationshipTemplates().stream().map(rt ->
            "{" + getSourceNT(rt).getId() + "--" + rt.getType().getLocalPart() + "-->" + getTargetNT(rt).getId())
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/TopologyWrapper.java`
#### Snippet
```java
        List<String> rts = topologyTemplate.getRelationshipTemplates().stream().map(rt ->
            "{" + getSourceNT(rt).getId() + "--" + rt.getType().getLocalPart() + "-->" + getTargetNT(rt).getId())
            .collect(Collectors.toList());
        return "NTs: " + nts + "RTs: " + rts;
    }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/driverspecificationandinjection/DriverInjection.java`
#### Snippet
```java
                List<TDeploymentArtifact> abstractDAsAttachedToNodeTemplate = nodeTemplateWithAbstractDA.getDeploymentArtifacts().stream()
                    .filter(da -> DASpecification.getArtifactTypeOfDA(da).getAbstract())
                    .collect(Collectors.toList());
                for (TDeploymentArtifact abstractDA : abstractDAsAttachedToNodeTemplate) {
                    Set<Pair<TRelationshipTemplate, TNodeTemplate>> nodeTemplatesWithConcreteDA
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
            possibilities.add(possibility);
        }
        List<TNodeTemplate> done = assignedAsGroup.stream().flatMap(List::stream).collect(Collectors.toList());

        // permute rest of node templates
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/driverspecificationandinjection/DASpecification.java`
#### Snippet
```java
                    return relationshipType.getQName().equals(ToscaBaseTypes.hostedOnRelationshipType);
                })
                .collect(Collectors.toList());

            for (TRelationshipTemplate relationshipTemplate : outgoingRelationshipTemplates) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (incomingNodeTypeInterfaces != null && !incomingNodeTypeInterfaces.isEmpty()) {
            TInterface relevantInterface = null;
            List<TInterface> connectionInterfaces = incomingNodeTypeInterfaces.stream().filter(tInterface -> tInterface.getIdFromIdOrNameField().contains("connect")).collect(Collectors.toList());
            if (connectionInterfaces.size() > 1) {
                TNodeTemplate targetNodeTemplate = ModelUtilities.getTargetNodeTemplateOfRelationshipTemplate(topologyTemplate, incomingRelationshipTemplate);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .filter(nt -> nt.getCapabilities().stream()
                    .anyMatch(c -> c.getType().equals(requiredCapTypeQName)))
                .collect(Collectors.toList());

            if (!nodesWithMatchingCapability.isEmpty() && nodesWithMatchingCapability.size() == 1) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

                List<TRequirement> openHostedOnRequirements = needHostNode.getRequirements().stream()
                    .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Container")).collect(Collectors.toList());

                List<TServiceTemplate> compatibleTopologyFragments = repository
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    } else {
                        List<TRequirement> openHostedOnRequirements = predecessor.getRequirements().stream()
                            .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Container")).collect(Collectors.toList());

                        List<TServiceTemplate> compatibleTopologyFragments = repository
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .stream()
                .filter(ir -> replacementNodeTemplateCandidates.contains(ir.getTargetElement().getRef()))
                .collect(Collectors.toList());

            serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(removingIncomingRelationships);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .stream()
                .filter(ir -> replacementNodeTemplateCandidates.contains(ir.getSourceElement().getRef()))
                .collect(Collectors.toList());

            serviceTemplate.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(removingIncomingRelationships);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            .filter(node -> hasNodeOpenRequirement(serviceTemplate, node))
            .filter(y -> !nodesForWhichHostsFound.contains(y))
            .collect(Collectors.toList());

        LOGGER.debug("{} nodes without matching:", checkListAllNodesMatched.size());
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                        .filter(rt -> predecessors.contains(ModelUtilities.getSourceNodeTemplateOfRelationshipTemplate(serviceTemplateCopy.getTopologyTemplate(), rt))
                            || predecessors.contains(ModelUtilities.getTargetNodeTemplateOfRelationshipTemplate(serviceTemplateCopy.getTopologyTemplate(), rt)))
                        .collect(Collectors.toList());

                serviceTemplateCopy.getTopologyTemplate().getNodeTemplateOrRelationshipTemplate().removeAll(removingRelationships);
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            && Objects.nonNull(node2.getCapabilities())) {
            List<String> reqTypeNamesNode1 = new ArrayList<>();
            node1.getRequirements().stream().forEach(req -> reqTypeNamesNode1.add(req.getType().toString()));
            List<String> reqTypeNamesNode2 = new ArrayList<>();
            node2.getRequirements().stream().forEach(req -> reqTypeNamesNode2.add(req.getType().toString()));
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            node1.getRequirements().stream().forEach(req -> reqTypeNamesNode1.add(req.getType().toString()));
            List<String> reqTypeNamesNode2 = new ArrayList<>();
            node2.getRequirements().stream().forEach(req -> reqTypeNamesNode2.add(req.getType().toString()));

            List<String> capTypeNamesNode1 = new ArrayList<>();
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

            List<String> capTypeNamesNode1 = new ArrayList<>();
            node1.getCapabilities().stream().forEach(cap -> capTypeNamesNode1.add(cap.getType().toString()));
            List<String> capTypeNamesNode2 = new ArrayList<>();
            node2.getCapabilities().stream().forEach(cap -> capTypeNamesNode2.add(cap.getType().toString()));
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            node1.getCapabilities().stream().forEach(cap -> capTypeNamesNode1.add(cap.getType().toString()));
            List<String> capTypeNamesNode2 = new ArrayList<>();
            node2.getCapabilities().stream().forEach(cap -> capTypeNamesNode2.add(cap.getType().toString()));
            if (!capTypeNamesNode1.equals(capTypeNamesNode2) || !reqTypeNamesNode1.equals(reqTypeNamesNode2)) {
                return false;
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
        if (Objects.nonNull(node1.getPolicies()) && Objects.nonNull(node2.getPolicies())) {
            List<String> policyTypesNode1 = new ArrayList<>();
            node1.getPolicies().stream().forEach(policy -> policyTypesNode1.add(policy.getPolicyType().toString()));
            List<String> policyTypesNode2 = new ArrayList<>();
            node2.getPolicies().stream().forEach(policy -> policyTypesNode2.add(policy.getPolicyType().toString()));
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            node1.getPolicies().stream().forEach(policy -> policyTypesNode1.add(policy.getPolicyType().toString()));
            List<String> policyTypesNode2 = new ArrayList<>();
            node2.getPolicies().stream().forEach(policy -> policyTypesNode2.add(policy.getPolicyType().toString()));
            if (!policyTypesNode1.equals(policyTypesNode2)) {
                return false;
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            .filter(nt -> nt.getRequirements().stream()
                .anyMatch(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Endpoint")))
            .collect(Collectors.toList());

        if (!nodeTemplatesWithConnectionRequirement.isEmpty()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Endpoint"))
                    .filter(req -> getOpenRequirementsAndMatchingBasisCapabilityTypeNames(serviceTemplate).keySet().contains(req))
                    .collect(Collectors.toList());

                for (TRequirement openRequirement : requirements) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/EdmmMappingsResource.java`
#### Snippet
```java
        // wrapped into hash set to enhance performance
        if (!new HashSet<>(EdmmManager.forRepository(RepositoryFactory.getRepository()).getEdmmTypes())
            .containsAll(list.stream().map(m -> m.edmmType).collect(Collectors.toList()))) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/EdmmMappingsResource.java`
#### Snippet
```java
            .stream()
            .map(i -> i.edmmType)
            .collect(Collectors.toList());
        // dupliacte EDMM types?
        if (new HashSet<>(allEdmmTypesOfNewMappingsList).size() < allEdmmTypesOfNewMappingsList.size()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/EdmmMappingsResource.java`
#### Snippet
```java
            .stream()
            .map(i -> i.toscaType)
            .collect(Collectors.toList());
        // duplicate TOSCA types?
        if (new HashSet<>(allTOSCATypesOfNewMappingsList).size() < allTOSCATypesOfNewMappingsList.size()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/ImplementationArtifactsResource.java`
#### Snippet
```java
                    List<TOperation> notContainedOperations = notContainedInterface.getOperations().stream()
                        .filter(operation -> !apiDateInterface.operations.contains(operation.getName()))
                        .collect(Collectors.toList());

                    if (!notContainedOperations.isEmpty()) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/ImplementationArtifactsResource.java`
#### Snippet
```java
                        apiDateInterface.operations.addAll(notContainedOperations.stream()
                            .map(TOperation::getName)
                            .collect(Collectors.toList()));
                    }
                } else {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/dataflowmodels/DataFlowResource.java`
#### Snippet
```java
        List<ServiceTemplateId> serviceTemplateIds = repo.getAllDefinitionsChildIds().stream()
            .filter(id -> id.getGroup().equals(SERVICE_TEMPLATE_GROUP) && id instanceof ServiceTemplateId)
            .map(id -> (ServiceTemplateId) id).collect(Collectors.toList());

        for (ServiceTemplateId id : serviceTemplateIds) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/dataflowmodels/DataFlowResource.java`
#### Snippet
```java
            List<ArtifactTemplateId> artifactTemplateIds = repo.getAllDefinitionsChildIds().stream()
                .filter(id -> id.getGroup().equals(ARTIFACT_TEMPLATE_GROUP) && id instanceof ArtifactTemplateId)
                .map(id -> (ArtifactTemplateId) id).collect(Collectors.toList());

            for (QName artifactName : artifacts) {
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/PlaceholderSubstitutionWebSocket.java`
#### Snippet
```java
        ArrayList<TNodeTemplate> listOfSelectedNodeTemplate = new ArrayList<>();
        nodeTemplateIDs.stream()
            .forEach(id -> listOfSelectedNodeTemplate.add(serviceTemplate.getTopologyTemplate().getNodeTemplate(id)));

        //participant-aware placeholder selection - only nodes with the placeholder owning the service template are considered
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
                        .stream()
                        .map(String::toLowerCase)
                        .collect(Collectors.toList())
                        .contains(keys.toLowerCase())
                    )
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
                    .filter(keys -> !newKvs.stream()
                        .map(newProp -> newProp.getKey().toLowerCase())
                        .collect(Collectors.toList())
                        .contains(keys.toLowerCase())
                    )
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
                        .stream()
                        .map(String::toLowerCase)
                        .collect(Collectors.toList())
                        .contains(keys.toLowerCase())
                    )
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/Ec2AmiRefinementPlugin.java`
#### Snippet
```java
            .filter(node -> this.matchToBeRefined.nodeIdsToBeReplaced.contains(node.getId()) && Objects.equals(node.getType(),
                COMPUTE_QNAME))
            .collect(Collectors.toList());

        Set<String> discoveredNodeIds = new HashSet<>();
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/enhance/EnhancementUtils.java`
#### Snippet
```java
                    List<TRequirementDefinition> requirements = featureType.getRequirementDefinitions().stream()
                        .filter(req -> req.getRequirementType().equals(OpenToscaBaseTypes.managementFeatureRequirement))
                        .collect(Collectors.toList());

                    requirements.forEach(req -> {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/placement/PlacementUtils.java`
#### Snippet
```java
            .getOutgoingRelationshipTemplates(topology, node).stream()
            .filter(relation -> relation.getType().equals(ToscaBaseTypes.connectsToRelationshipType))
            .collect(Collectors.toList());
        return outgoingConnectsTo.isEmpty();
    }
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/placement/PlacementUtils.java`
#### Snippet
```java
                .filter(node -> getLocation(node).equalsIgnoreCase(location))
                .filter(node -> Objects.nonNull(getProvider(node)))
                .collect(Collectors.toList());
            for (TNodeTemplate dataSource : dataSourcesForLocation) {
                String provider = getProvider(dataSource);
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        PropertyDefinitionKV inputParamKV = new PropertyDefinitionKV(inputParameter.getName(), inputParameter.getType());
        if (sourceNodeType.getWinerysPropertiesDefinition() != null &&
            !sourceNodeType.getWinerysPropertiesDefinition().getPropertyDefinitions().stream().anyMatch(p -> p.getKey().equals(inputParameter.getName()))
            && !propertyDefinitionKVList.contains(inputParamKV)) {
            propertyDefinitionKVList.add(inputParamKV);
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        PropertyDefinitionKV inputParamKV = new PropertyDefinitionKV(inputParameter.getName(), inputParameter.getType());
        if (!propertyDefinitionKVList.contains(inputParamKV) && ((sourceTemplateProperties != null &&
            !sourceTemplateProperties.keySet().stream().anyMatch(p -> p.equals(inputParameter.getName()))) ||
            sourceTemplateProperties == null)) {
            if ((targetTemplateProperties != null &&
```

### SimplifyStreamApiCallChains
'!Stream.anyMatch(...)' can be replaced with 'noneMatch()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
            sourceTemplateProperties == null)) {
            if ((targetTemplateProperties != null &&
                !targetTemplateProperties.keySet().stream().anyMatch(p -> p.equals(inputParameter.getName()))) ||
                targetTemplateProperties == null) {
                propertyDefinitionKVList.add(inputParamKV);
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                List<TInterface> allInterfaces = elementNodeType.getInterfaces();
                if (allInterfaces != null && allInterfaces.isEmpty()) {
                    List<TInterface> sourceNodeTypeInterfaces = allInterfaces.stream().filter(tInterface -> !tInterface.getIdFromIdOrNameField().contains("connect")).collect(Collectors.toList());
                    if (sourceNodeTypeInterfaces != null) {
                        for (TInterface tInterface : sourceNodeTypeInterfaces) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java
                ModelUtilities.getIncomingRelationshipTemplates(refinementModel.getDetector(), detectorNode).stream()
                    .filter(relation -> !permutabilityMappingExistsForDetectorElement(relation, refinementModel))
                    .collect(Collectors.toList());

            for (TRelationshipTemplate unmappable : unMappableRelations) {
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java
                        .map(element -> (TNodeTemplate) element)
                        .distinct()
                        .collect(Collectors.toList());

                    Set<TNodeTemplate> nodesTheRefinementNodesAreDependingOn = new HashSet<>();
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java
                                        pm.getDetectorElement().getId().equals(detectorNode.getId())
                                )
                            ).collect(Collectors.toList())
                    ));
                    // If the current detectorNode refines to multiple refinement nodes and the nodesTheSourceRefinesTo
```

### SimplifyStreamApiCallChains
'collect(toList())' can be replaced with 'toList()'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/PermutationGenerator.java`
#### Snippet
```java
                            .stream()
                            .filter(relation -> !relation.getSourceElement().getRef().getId().equals(refinementNode.getId()))
                            .collect(Collectors.toList());
                        return incomingRelations.isEmpty() || incomingRelations.stream()
                            .map(relationship -> (TNodeTemplate) relationship.getSourceElement().getRef())
```

### SimplifyStreamApiCallChains
''stream().forEach()'' can be replaced with 'forEach()'' (may change semantics)
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
        Set<ServiceTemplateId> versionsOfConsideredServiceTemplate = (Set<ServiceTemplateId>) WineryVersionUtils.getOtherVersionDefinitionsFromDefinition(serviceTemplateId, repository);
        Set<QName> versionQNames = new HashSet<>();
        versionsOfConsideredServiceTemplate.stream().forEach(st -> versionQNames.add(st.getQName()));

        return serviceTemplates.entrySet()
```

## RuleId[id=ParameterCanBeLocal]
### ParameterCanBeLocal
Parameter can be converted to a local variable
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/CookbookConfigurationToscaConverter.java`
#### Snippet
```java
    }

    private TNodeType convertPlatformToNodeType(Platform platform, String namespace) {
        namespace = buildNamespaceForPlatforms();
        TNodeType.Builder configurationNodeType = new TNodeType.Builder(platform.getName() + "-" + platform.getVersion() + WineryVersion.WINERY_VERSION_SEPARATOR + WineryVersion.WINERY_VERSION_PREFIX + "1");
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
            attributeEnd = attributeBegin;

            result.append(processString.substring(0, attributeBegin));
            processString = processString.substring(attributeBegin);

```

### StringOperationCanBeSimplified
Call to `substring()` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
            codeEnd = codeBegin;

            resultStringBuilder.append(processString.substring(0, codeBegin));
            processString = processString.substring(codeBegin);

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/management/PatternAtlasResolver.java`
#### Snippet
```java
    @Override
    public String getRepositoryMaintainerUrl() {
        return patternAtlasApiURL.toString();
    }

```

### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/management/PatternAtlasResolver.java`
#### Snippet
```java
    @Override
    public String getUrl() {
        return patternAtlasApiURL.toString();
    }

```

### StringOperationCanBeSimplified
Unnecessary string length argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
            }
            // TODO infer artifact type and mime type from file URI
            String type = file.substring(file.lastIndexOf("."), file.length());
            return new YTArtifactDefinition.Builder(buildQName(type), file).build();
        }
```

## RuleId[id=PlaceholderCountMatchesArgumentCount]
### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/FileUtils.java`
#### Snippet
```java
            file.delete();
        } catch (SecurityException e) {
            logger.debug("Could not delete file", e.getMessage());
        }
    }
```

### PlaceholderCountMatchesArgumentCount
Fewer arguments provided (1) than placeholders specified (2)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/support/Utils.java`
#### Snippet
```java
            Files.createDirectories(result);
        } catch (IOException e) {
            logger.error("Failed to create tmp dir '{}':\n {}", result, e);
        }
        return result;
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (1) than placeholders specified (0)
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

        QName relationshipTypeQName = new QName(relationshipType.getTargetNamespace(), relationshipType.getName());
        LOGGER.debug("The QName of the matchingRelationshipType for ReqCap Matching", relationshipTypeQName);
        List<String> ids = new ArrayList<>();
        List<TRelationshipTemplate> tRelationshipTemplates = ModelUtilities.getAllRelationshipTemplates(topologyTemplate);
```

### PlaceholderCountMatchesArgumentCount
More arguments provided (2) than placeholders specified (0)
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/imports/genericimports/GenericImportResource.java`
#### Snippet
```java
        @NonNull String fileName = EncodingUtil.URLdecode(encodedFileName);
        if (!fileName.equals(location)) {
            LOGGER.debug("Filename mismatch %s vs %s", fileName, location);
            return Response.status(Status.NOT_FOUND).build();
        }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'XHasIdAndTags' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XHasIdAndTags.java`
#### Snippet
```java

    @Deprecated
    public XHasIdAndTags() {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'XTEntityTypeImplementation' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTEntityTypeImplementation.java`
#### Snippet
```java

    @Deprecated // required for XML deserialization
    public XTEntityTypeImplementation() {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'XTExtensibleElementWithTags' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTExtensibleElementWithTags.java`
#### Snippet
```java

    @Deprecated
    public XTExtensibleElementWithTags() {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'XRelationshipSourceOrTarget' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XRelationshipSourceOrTarget.java`
#### Snippet
```java

    @Deprecated // required for XML deserialization
    public XRelationshipSourceOrTarget() {
        super();
    }
```

### DeprecatedIsStillUsed
Deprecated member 'XTDocumentation' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTDocumentation.java`
#### Snippet
```java

    @Deprecated // required for XML deserialization
    public XTDocumentation() { }

    public XTDocumentation(Builder builder) {
```

### DeprecatedIsStillUsed
Deprecated member 'XTDefinitions' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTDefinitions.java`
#### Snippet
```java

    @Deprecated // required for XML deserialization
    public XTDefinitions() {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'XOTRefinementModel' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTRefinementModel.java`
#### Snippet
```java

    @Deprecated // required for XML deserialization
    public XOTRefinementModel() { }

    public XOTRefinementModel(Builder<? extends Builder<?>> builder) {
```

### DeprecatedIsStillUsed
Deprecated member 'XOTTopologyFragmentRefinementModel' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/extensions/XOTTopologyFragmentRefinementModel.java`
#### Snippet
```java

    @Deprecated // required for XML deserialization
    public XOTTopologyFragmentRefinementModel() { }

    public XOTTopologyFragmentRefinementModel(Builder builder) {
```

### DeprecatedIsStillUsed
Deprecated member 'ValueHelper' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/ValueHelper.java`
#### Snippet
```java
 */
@Deprecated
public abstract class ValueHelper {

    /**
```

### DeprecatedIsStillUsed
Deprecated member 'TDeploymentOrImplementationArtifact' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDeploymentOrImplementationArtifact.java`
#### Snippet
```java

    @Deprecated // used for XML deserialization of API request content
    public TDeploymentOrImplementationArtifact() {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'TImplementation' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TImplementation.java`
#### Snippet
```java

    @Deprecated // used for XML deserialization of API request content
    public TImplementation() { }

    public String getPrimary() {
```

### DeprecatedIsStillUsed
Deprecated member 'TOperationDefinition' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TOperationDefinition.java`
#### Snippet
```java

    @Deprecated // used for XML deserialization of API request content
    public TOperationDefinition() { }

    @Override
```

### DeprecatedIsStillUsed
Deprecated member 'getServiceTemplateOrNodeTypeOrNodeTypeImplementation' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDefinitions.java`
#### Snippet
```java
         */
        @Deprecated
        public List<TExtensibleElements> getServiceTemplateOrNodeTypeOrNodeTypeImplementation() {
            List<TExtensibleElements> tmp = new ArrayList<>();
            Stream.of(
```

### DeprecatedIsStillUsed
Deprecated member 'TInterfaceType' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TInterfaceType.java`
#### Snippet
```java

    @Deprecated // used for XML deserialization of API request content
    public TInterfaceType() {
    }

```

### DeprecatedIsStillUsed
Deprecated member 'ParameterDefinition' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/ParameterDefinition.java`
#### Snippet
```java

    @Deprecated // used for XML deserialization of API request content
    public ParameterDefinition() { }

    public ParameterDefinition(String key, QName type) {
```

### DeprecatedIsStillUsed
Deprecated member 'AttributeDefinition' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/AttributeDefinition.java`
#### Snippet
```java

    @Deprecated // used for XML deserialization of API request content
    public AttributeDefinition() { }

    public AttributeDefinition(String key, QName type) {
```

### DeprecatedIsStillUsed
Deprecated member 'getAllNodeTemplates' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/utils/ModelUtilities.java`
#### Snippet
```java
     */
    @Deprecated
    public static List<TNodeTemplate> getAllNodeTemplates(TTopologyTemplate topologyTemplate) {
        Objects.requireNonNull(topologyTemplate);

```

### DeprecatedIsStillUsed
Deprecated member 'getAllRelationshipTemplates' is still used
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/utils/ModelUtilities.java`
#### Snippet
```java
     */
    @Deprecated
    public static List<TRelationshipTemplate> getAllRelationshipTemplates(TTopologyTemplate topologyTemplate) {
        Objects.requireNonNull(topologyTemplate);

```

### DeprecatedIsStillUsed
Deprecated member 'convertToServiceTemplate' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/YamlRepository.java`
#### Snippet
```java
     **/
    @Deprecated
    private InputStream convertToServiceTemplate(RepositoryFileReference ref, InputStream inputStream, MediaType mediaType) {
        if (!mediaType.equals(MediaTypes.MEDIATYPE_TOSCA_DEFINITIONS)) {
            // do not modify content that's not a TOSCA_DEFINITIONS file
```

### DeprecatedIsStillUsed
Deprecated member 'convertNodeTypeImplementation' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/FromCanonical.java`
#### Snippet
```java

    @Deprecated
    public YTServiceTemplate convertNodeTypeImplementation(YTServiceTemplate type, TNodeTypeImplementation node) {
        if (Objects.isNull(node)) {
            return null;
```

### DeprecatedIsStillUsed
Deprecated member 'convertRelationshipTypeImplementation' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/FromCanonical.java`
#### Snippet
```java

    @Deprecated
    public YTServiceTemplate convertRelationshipTypeImplementation(YTServiceTemplate type, TRelationshipTypeImplementation node) {
        if (Objects.isNull(node)) {
            return null;
```

### DeprecatedIsStillUsed
Deprecated member 'convertArtifactTemplate' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/FromCanonical.java`
#### Snippet
```java

    @Deprecated
    public YTArtifactDefinition convertArtifactTemplate(TArtifactTemplate node) {
        if (Objects.isNull(node) || Objects.isNull(node.getType())) {
            return null;
```

### DeprecatedIsStillUsed
Deprecated member 'convertImplementationArtifact' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/ToCanonical.java`
#### Snippet
```java
     */
    @Deprecated
    private List<TImplementationArtifact> convertImplementationArtifact(@NonNull Map<String, YTArtifactDefinition> artifactDefinitionMap, String targetNamespace) {
        if (artifactDefinitionMap.isEmpty()) {
            return null;
```

### DeprecatedIsStillUsed
Deprecated member 'YAMLDefinitionsBasedCsarEntry' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/entries/YAMLDefinitionsBasedCsarEntry.java`
#### Snippet
```java
 */
@Deprecated
public class YAMLDefinitionsBasedCsarEntry implements CsarEntry {
    private YTServiceTemplate definitions;

```

### DeprecatedIsStillUsed
Deprecated member 'ConfigurationBasedNamespaceManager' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/ConfigurationBasedNamespaceManager.java`
#### Snippet
```java

@Deprecated
public class ConfigurationBasedNamespaceManager extends AbstractNamespaceManager {

    private Configuration configuration;
```

### DeprecatedIsStillUsed
Deprecated member 'XMLDefinitionsBasedCsarEntry' is still used
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/entries/XMLDefinitionsBasedCsarEntry.java`
#### Snippet
```java
//  CSAR Entries are inherently dependent on the Standard to which the CSAR is serialized
@Deprecated
public class XMLDefinitionsBasedCsarEntry implements CsarEntry {
    private static final boolean INCLUDE_PROCESSING = true;
    
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve file 'cxf-servlet.xml'
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/beans.xml`
#### Snippet
```java
    <import resource="classpath:META-INF/cxf/cxf.xml"/>
    <import resource="classpath:META-INF/cxf/cxf-extension-soap.xml"/>
    <import resource="classpath:META-INF/cxf/cxf-servlet.xml"/>
    <jaxws:endpoint xmlns:tns="IA_NAMESPACE"
                    id="IA_CLASS_NAME" implementor="IA_PACKAGE.IA_CLASS_NAME"
```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/converter/support/exception/YAMLParserException.java`
#### Snippet
```java
    public String getInlineContext() {
        if (Objects.isNull(inlineContext)) return "";
        return "\nContext::INLINE = ".concat(String.valueOf(inlineContext));
    }
}
```

## RuleId[id=WebProperties]
### WebProperties
Cannot resolve class or package 'servlet'
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
        <display-name>cxf</display-name>
        <servlet-name>cxf</servlet-name>
        <servlet-class>org.apache.cxf.transport.servlet.CXFServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class 'CXFServlet'
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
        <display-name>cxf</display-name>
        <servlet-name>cxf</servlet-name>
        <servlet-class>org.apache.cxf.transport.servlet.CXFServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
```

### WebProperties
Cannot resolve class or package 'springframework'
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'web'
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'context'
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
</web-app>
```

### WebProperties
Cannot resolve class 'ContextLoaderListener'
in `org.eclipse.winery.generators.ia/src/main/resources/template/project/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    </context-param>
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
</web-app>
```

### WebProperties
Cannot resolve class or package 'catalina'
in `org.eclipse.winery.repository.rest/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>CorsFilter</filter-name>
        <filter-class>org.apache.catalina.filters.CorsFilter</filter-class>
        <init-param>
            <param-name>cors.allowed.origins</param-name>
```

### WebProperties
Cannot resolve class or package 'filters'
in `org.eclipse.winery.repository.rest/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>CorsFilter</filter-name>
        <filter-class>org.apache.catalina.filters.CorsFilter</filter-class>
        <init-param>
            <param-name>cors.allowed.origins</param-name>
```

### WebProperties
Cannot resolve class 'CorsFilter'
in `org.eclipse.winery.repository.rest/src/main/webapp/WEB-INF/web.xml`
#### Snippet
```java
    <filter>
        <filter-name>CorsFilter</filter-name>
        <filter-class>org.apache.catalina.filters.CorsFilter</filter-class>
        <init-param>
            <param-name>cors.allowed.origins</param-name>
```

## RuleId[id=ObviousNullCheck]
### ObviousNullCheck
Redundant null-check: a value of primitive type 'boolean' is never null
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TParameter.java`
#### Snippet
```java

    public void setRequired(boolean value) {
        Objects.requireNonNull(value);
        this.required = value;
    }
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                List<TRequirement> requirements = nodeWithOpenConnectionRequirement.getRequirements().stream()
                    .filter(req -> getBasisCapabilityType(getRequiredCapabilityTypeQNameOfRequirement(req)).getName().equalsIgnoreCase("Endpoint"))
                    .filter(req -> getOpenRequirementsAndMatchingBasisCapabilityTypeNames(serviceTemplate).keySet().contains(req))
                    .collect(Collectors.toList());

```

## RuleId[id=SwitchStatementWithTooFewBranches]
### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
        String operationIdentifier = ctx.operation().getText();

        switch (primaryIdentifier) {
            case "node":
                switch (operationIdentifier) {
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
        switch (primaryIdentifier) {
            case "node":
                switch (operationIdentifier) {
                    case "default":
                        processDefaultAttribute(ctx);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
            if (ctx.operation() != null && ctx.call_args() != null) {
                operation = ctx.operation().getText();
                switch (operation) {
                    case "start_with?":
                        callArguments = ctx.call_args().accept(callArgsVisitor);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
            if (ctx.function() != null && ctx.function().call_args() != null) {
                operation = ctx.function().operation().getText();
                switch (operation) {
                    case "start_with?":
                        callArguments = ctx.function().call_args().accept(callArgsVisitor);
```

### SwitchStatementWithTooFewBranches
'switch' statement has too few case labels (1), and should probably be replaced with an 'if' statement
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
        if (primaryValue != null && ctx.function().getChildCount() == 1) {
            functionName = ctx.function().getText();
            switch (functionName) {
                case "to_i":
                    Integer convertedValue;
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
            defaultAttributesPath = attributePath + ChefDslConstants.DEFAULT_RB_PATH;
            cookbookConfigs = getParseResultFromFile(cookbookConfigs, defaultAttributesPath);

            folder = new File(attributePath);
            files = folder.listFiles();

            if (files != null) {
                for (File attributeFile : files) {
                    if (!attributeFile.getName().equals(ChefDslConstants.DEFAULT_RUBYFILE)) {
                        cookbookConfigs = getParseResultFromFile(cookbookConfigs, attributeFile.getAbsolutePath().replace("\\", "/"));
                    }
                }
            }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java
        String action = installedPackage.getAction();
        if (":nothing".equals(action) || ":install".equals(action) || "upgrade".equals(action)) {
            installedPackages.put(installedPackage.getName(), installedPackage);
        } else if (":remove".equals(action) || ":purge".equals(action)) {
            installedPackages.remove(installedPackage.getName());
        }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
            JSONObject latestVersionJSONObject = getJsonFromUrl(latestVersionUrl);
            //Get URL to latest version and version.
            String file = latestVersionJSONObject.getString("file");
            String cookbookVersion = latestVersionJSONObject.getString("version");
            //Download latest cookbook.
            try {
                downloadChefCookbook(cookbookName, cookbookVersion, file);
            } catch (Exception e) {
                LOGGER.error("Downloading of cookbook \"" + cookbookName + "-" + cookbookVersion + "failed", e);
            }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        Boolean firstExpr = null;
        Boolean secondExpr = null;

        BooleanExprVisitor booleanExprVisitor = new BooleanExprVisitor(parseResult);
        firstExpr = ctx.expr(0).accept(booleanExprVisitor);
        secondExpr = ctx.expr(1).accept(booleanExprVisitor);

        firstExpr = resolveNullArgument(firstExpr);
        secondExpr = resolveNullArgument(secondExpr);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        Boolean firstExpr = null;
        Boolean secondExpr = null;

        BooleanExprVisitor booleanExprVisitor = new BooleanExprVisitor(parseResult);
        firstExpr = ctx.arg(0).accept(booleanExprVisitor);
        secondExpr = ctx.arg(1).accept(booleanExprVisitor);

        firstExpr = resolveNullArgument(firstExpr);
        secondExpr = resolveNullArgument(secondExpr);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String firstArgument;
        String secondArgument;
        Boolean exprResult;
        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        List<String> firstArgList;
        List<String> secondArgList;

        firstArgList = ctx.arg(0).accept(primaryVisitor);
        secondArgList = ctx.arg(1).accept(primaryVisitor);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
        String argument;
        String operation;
        List<String> argumentList;
        List<String> callArguments = null;
        Boolean exprResult = false;

        PrimaryBaseVisitor primaryVisitor = new PrimaryBaseVisitor(parseResult);
        CallArgsVisitor callArgsVisitor = new CallArgsVisitor(parseResult);
        argumentList = ctx.primary().accept(primaryVisitor);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
        CallArgsVisitor callArgsVisitor = new CallArgsVisitor(extractedCookbookConfigs);
        List callArgs = ctx.call_args().accept(callArgsVisitor);

        List<ChefCookbookConfiguration> cookbookConfigs;
        String depends = callArgs.get(0).toString();
        String dependsVersion;
        cookbookConfigs = extractedCookbookConfigs.getAllConfigsAsList();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
        if (cookbookConfigs.get(0).getSupports().getName().equals(Defaults.COOKBOOKCONFIG_SUPPORTS_NO_PLATFORM)) {
            cookbookConfigs.get(0).setSupports(new Platform(supports, version));
            extractedCookbookConfigs.clearConfigurations();
        } else {
            ChefCookbookConfiguration newConfig = new ChefCookbookConfiguration(cookbookConfigs.get(0));
            newConfig.setSupports(new Platform(supports, version));
            cookbookConfigs.add(newConfig);
            extractedCookbookConfigs.clearConfigurations();
        }
        extractedCookbookConfigs.putCookbookConfigsAsList(cookbookConfigs);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
        if (extractedCookbookConfigs.getAllConfigsAsList().size() == 0) {
            ChefCookbookConfiguration componentType = new ChefCookbookConfiguration();
            componentType.setName(name);
            extractedCookbookConfigs.putCookbookConfig(componentType);
        } else {
            List<ChefCookbookConfiguration> cookbookConfigs;
            cookbookConfigs = extractedCookbookConfigs.getAllConfigsAsList();
            for (int count = 0; count < cookbookConfigs.size(); count++) {
                cookbookConfigs.get(count).setVersion(name);
            }
            extractedCookbookConfigs.replaceCookbookConfigs(cookbookConfigs);
        }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
        List<CookbookParseResult> parseResultList = extractedCookbookConfigs.getListOfConfigsInOwnParseresult();

        CookbookParseResult filteredParseResult;

        List<ChefCookbookConfiguration> processedCookbookConfigs = new LinkedList<>();

        for (int countConfigs = 0; countConfigs < parseResultList.size(); countConfigs++) {
            // Process one cookbook configuration per iteration wrapped in a cookbook parse result. 
            filteredParseResult = parseResultList.get(countConfigs);

            AssignAttributeVisitor assignAttributeVisitor = new AssignAttributeVisitor(filteredParseResult);
            ChefAttribute chefAttribute = ctx.call_args().accept(assignAttributeVisitor);

            if (chefAttribute != null && chefAttribute.getName() != null && chefAttribute.getValues() != null) {
                filteredParseResult.addAttributeToAllConfigs(chefAttribute.getName(), chefAttribute.getValues());
            }

            processedCookbookConfigs.add(filteredParseResult.getAllConfigsAsList().get(0));
        }

        extractedCookbookConfigs.replaceCookbookConfigs(processedCookbookConfigs);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CompstmtVisitor.java`
#### Snippet
```java
        CookbookParseResult newParseResult;
        if (ctx.stmt() != null) {
            newParseResult = ctx.stmt().accept(new StmtVisitor(cookbookConfigs));
            if (newParseResult != null) {
                cookbookConfigs = new CookbookParseResult(newParseResult);
            }
            if (ctx.expr() != null) {
                for (ChefDSLParser.ExprContext exprContext : ctx.expr()) {
                    newParseResult = exprContext.accept(new ExprVisitor(cookbookConfigs));
                    if (newParseResult != null) {
                        cookbookConfigs = new CookbookParseResult(newParseResult);
                    }
                }
            }
        }
        return cookbookConfigs;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.frontends/app/topologymodeler/src/app/edmm/assign-deployment-technology.component.css`
#### Snippet
```java
/********************************************************************************
 * Copyright (c) 2021 Contributors to the Eclipse Foundation
 *
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.frontends/app/topologymodeler/src/app/group-view/group-view.component.css`
#### Snippet
```java
/*******************************************************************************
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.frontends/app/topologymodeler/src/app/live-modeling/buildplan-outputs/buildplan-outputs.component.css`
#### Snippet
```java
/*******************************************************************************
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.frontends/app/topologymodeler/src/app/node/capabilities/capabilities.component.css`
#### Snippet
```java
/********************************************************************************
 * Copyright (c) 2017-2018 Contributors to the Eclipse Foundation
 *
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.frontends/app/topologymodeler/src/app/problemDetection/problemDetection.component.css`
#### Snippet
```java
/*******************************************************************************
 * Copyright (c) 2019 Contributors to the Eclipse Foundation
 *
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.frontends/app/workflowmodeler/src/app/components/parameter/parameter.component.css`
#### Snippet
```java
    position: fixed;
    width: 500px;
    height: 100%;
    border-left: 1px solid #00aaff;
    z-index: 2000;
    right: 0;
    top: 0;
    bottom: 0;
    padding-left: 20px;
    margin-bottom: 0;
    padding-right: 20px;
    padding-top: 40px;
    -webkit-box-shadow: 0 0 6px rgba(0, 0, 0, 0.5);
    box-shadow: 0 0 6px rgba(0, 0, 0, 0.5);
    border-radius: 0;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/Ec2AmiRefinementPlugin.java`
#### Snippet
```java
        LinkedHashMap<String, String> computeKvProperties = new LinkedHashMap<>();
        String detectorPropertyRegex = typeByAmi.keySet().stream().collect(Collectors.joining("|", "(", ")"));
        computeKvProperties.put(PROPERTY_EC2_AMI, detectorPropertyRegex);

        TEntityTemplate.WineryKVProperties computeProperties = new TEntityTemplate.WineryKVProperties();
        computeProperties.setKVProperties(computeKvProperties);

        compute.setProperties(computeProperties);

        return Collections.singletonList(new TTopologyTemplate.Builder().addNodeTemplate(compute).build());
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/dockerimage/WeaveCartsHandler.java`
#### Snippet
```java
        TNodeType springType = repository.getElement(new NodeTypeId(QNAME_SPRING_WEB));
        TNodeTemplate spring = ModelUtilities.instantiateNodeTemplate(springType);
        spring.setName(dockerContainer.getName());
        InstanceModelUtils.setStateRunning(spring);

        topologyTemplate.addNodeTemplate(spring);

        ModelUtilities.createRelationshipTemplateAndAddToTopology(spring,
            java,
            ToscaBaseTypes.hostedOnRelationshipType,
            topologyTemplate);

        discoveredNodeIds.add(dockerContainer.getId());
        discoveredNodeIds.add(java.getId());
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model.csar.toscametafile/src/main/java/org/eclipse/winery/model/csar/toscametafile/TOSCAMetaFileParser.java`
#### Snippet
```java
        numErrors += validateCsarVersion(mainAttr.get(TOSCAMetaFileAttributes.CSAR_VERSION));
        numErrors += validateCreatedBy(mainAttr.get(TOSCAMetaFileAttributes.CREATED_BY));
        numErrors += validateEntryDefinitions(mainAttr.get(TOSCAMetaFileAttributes.ENTRY_DEFINITIONS));
        numErrors += validateDescription(mainAttr.get(TOSCAMetaFileAttributes.DESCRIPTION));
        numErrors += validateTopology(mainAttr.get(TOSCAMetaFileAttributes.TOPOLOGY));

        return numErrors;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModelingUtils.java`
#### Snippet
```java
        PolicyTemplateId threatID = BackendUtils.getDefinitionsChildId(PolicyTemplateId.class, ThreatModelingConstants.THREATMODELING_NAMESPACE, threatName, false);
        threat.setId(threatName);
        threat.setName(threatName);
        threat.setType(threatTypeQName);

        TPolicyTemplate.WineryKVProperties threatProps = new TPolicyTemplate.WineryKVProperties();
        LinkedHashMap<String, String> propMap = new LinkedHashMap<>();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jaxbsupport/map/PropertiesAdapter.java`
#### Snippet
```java
        for (String key : data.keySet()) {
            final Object value = data.get(key);
            if (value instanceof Map) {
                root.appendChild(marshallNestedMap(doc, key, (Map<String, Object>)value));
            } else if (value instanceof String) {
                Element entry = doc.createElement(key);
                entry.appendChild(doc.createTextNode((String) value));
            } else {
                LOGGER.warn("Could not serialize value of type {}. Skipping!", value.getClass().getName());
            }
        }
        return root;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/jaxbsupport/map/PropertiesAdapter.java`
#### Snippet
```java
        final NodeList xmlChildren = xmlElement.getChildNodes();
        if (xmlChildren.getLength() == 0) {
            return false;
        }
        // if any of the child nodes has multiple children it's not KVProps
        for (int i = 0; i < xmlChildren.getLength(); i++) {
            Node item = xmlChildren.item(i);
            if (item instanceof Text || item instanceof Comment) {
                continue;
            }
            if (!(item instanceof Element)) {
                // this is definitively not a KVProp schema conform xml tree
                return false;
            }
            if (item.getChildNodes().getLength() > 1) {
                // more than a single child element at a key, so not KVProp
                return false;
            }
        }
        return true;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDefinitions.java`
#### Snippet
```java
            if (types == null || types.getAny().isEmpty()) {
                return self();
            }

            if (this.types == null) {
                this.types = types;
            } else {
                this.types.getAny().addAll(types.getAny());
            }
            return self();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TRelationshipTemplate.java`
#### Snippet
```java
            if (relationshipConstraints == null || relationshipConstraints.getRelationshipConstraint().isEmpty()) {
                return this;
            }

            if (this.relationshipConstraints == null) {
                this.relationshipConstraints = relationshipConstraints;
            } else {
                this.relationshipConstraints.getRelationshipConstraint().addAll(relationshipConstraints.getRelationshipConstraint());
            }
            return this;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
        if (!RepositoryFactory.getRepository().exists(id)) {
            return Response.status(Status.NOT_FOUND).build();
        }
        try {
            RepositoryFactory.getRepository().forceDelete(id);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
            return Response.serverError().entity(e.getMessage()).build();
        }
        return Response.noContent().build();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/API/APIResource.java`
#### Snippet
```java
        if (StringUtils.isEmpty(serviceTemplateQNameString)) {
            return Response.status(Status.BAD_REQUEST).entity("servicetemplate has be given as query parameter").build();
        }

        QName serviceTemplateQName = QName.valueOf(serviceTemplateQNameString);

        ServiceTemplateId serviceTemplateId = new ServiceTemplateId(serviceTemplateQName);
        final IRepository repository = RepositoryFactory.getRepository();
        if (!repository.exists(serviceTemplateId)) {
            return Response.status(Status.BAD_REQUEST).entity("service template does not exist").build();
        }
        ServiceTemplateResource serviceTemplateResource = new ServiceTemplateResource(serviceTemplateId);

        Collection<QName> artifactTemplates = new ArrayList<>();
        List<TNodeTemplate> allNestedNodeTemplates = BackendUtils.getAllNestedNodeTemplates(serviceTemplateResource.getServiceTemplate());
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TestRefinementModelResource.java`
#### Snippet
```java
            if (relTemplate.getType().getLocalPart().startsWith("RelationshipMapping")) {
                Map<String, String> propertiesMap = ((TEntityTemplate.WineryKVProperties) relTemplate.getProperties()).getKVProperties();
                this.getRelationMappings().addMapping(new OTRelationMapping(new OTRelationMapping.Builder(mappingId)
                    .setDetectorElement(relTemplate.getSourceElement().getRef())
                    .setRefinementElement(relTemplate.getTargetElement().getRef())
                    .setDirection(OTRelationDirection.fromValue(propertiesMap.get("direction")))
                    .setRelationType(QName.valueOf(propertiesMap.get("applicableRelationshipType")))
                    .setValidSourceOrTarget(QName.valueOf(propertiesMap.get("validEndpointType")))));
            }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
            List<NodeInjectionOptions> hostInjectionOptions = new ArrayList<>();
            if (hostMatchingOptions != null) {
                hostMatchingOptions.forEach((key, value) -> {
                    NodeInjectionOptions options = new NodeInjectionOptions();
                    options.setNodeID(key);
                    value
                        .forEach(st -> {
                            QName stQName = new QName(st.getTargetNamespace(), st.getId());
                            options.addInjectionOption(stQName);
                        });
                    hostInjectionOptions.add(options);
                });
            }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        IRepository repository = RepositoryFactory.getRepository();
        repository.forceDelete(matchedServiceTemplateId);
        repository.flagAsExisting(matchedServiceTemplateId);
        TServiceTemplate matchedServiceTemplate = new TServiceTemplate();
        matchedServiceTemplate.setName(matchedServiceTemplateId.getXmlId().getDecoded());
        matchedServiceTemplate.setId(matchedServiceTemplate.getName());
        matchedServiceTemplate.setTargetNamespace(id.getNamespace().getDecoded());
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        ResourceResult response = RestUtils.duplicate(id, newId);

        if (response.getStatus() == Status.CREATED) {
            response.setUri(null);
            response.setMessage(new QNameApiData(newId));
        }

        LOGGER.debug("Created Service Template {}", newId.getQName());

        return response.getResponse();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/CsarExporter.java`
#### Snippet
```java
        stringBuilder.append(CREATED_BY).append(": Winery ").append(Environments.getInstance().getVersion()).append("\n");

        // Winery currently is unaware of tDefinitions, therefore, we use the
        // name of the service template
        stringBuilder.append(ENTRY_DEFINITIONS).append(": ").append(entryDefinitionsReference).append("\n");
        stringBuilder.append("\n");

        assert (refMap.keySet()
            .stream()
            .anyMatch(
                fileProperties -> fileProperties
                    .getPathInsideCsar()
                    .equals(entryDefinitionsReference)
            )
        );
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
                        ref = EncodingUtil.URLdecode(ref);
                        URI refURI;
                        try {
                            refURI = new URI(ref);
                        } catch (URISyntaxException e) {
                            errors.add(String.format("Invalid URI %1$s", ref));
                            continue;
                        }
                        if (refURI.isAbsolute()) {
                            // Points to somewhere external
                            // This is a linked plan
                            // We have to do nothing
                            continue;
                        }
                        Path path = rootPath.resolve(ref);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
                Iterator iterator2 = edgeSet.iterator();
                // iterate through the IaaS taxonomy and check the weight of each edge -> add the target nodes to the according pattern list
                while (iterator2.hasNext()) {
                    DefaultWeightedEdge edge = (DefaultWeightedEdge) iterator2.next();
                    double weight = iaasGraph.getEdgeWeight(edge);
                    if (weight == 0.75) {
                        patternProbabilityHigh.add(iaasGraph.getEdgeTarget(edge));
                    } else if (weight == 0.5) {
                        patternProbabilityMedium.add(iaasGraph.getEdgeTarget(edge));
                    } else if (weight == 0.25) {
                        patternProbabilityLow.add(iaasGraph.getEdgeTarget(edge));
                    } else if (weight == 0.99) {
                        detectedPattern.add(iaasGraph.getEdgeTarget(edge));
                    } else if (weight == 0.0) {
                        impossiblePattern.add(iaasGraph.getEdgeTarget(edge));
                    } else if (weight == 1.0) {
                        //for all other patterns add low probability, 1.0 is default edge value
                        patternProbabilityLow.add(iaasGraph.getEdgeTarget(edge));
                    }
                }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
            Iterator iterator = edges.iterator();
            while (iterator.hasNext()) {
                RelationshipEdge edge = (RelationshipEdge) iterator.next();
                TNodeTemplateExtended source = (TNodeTemplateExtended) edge.getV1();
                String edgeLabel = edge.toString();
                if (source.getLabel().isEmpty()) {
                    if (edgeLabel.equals(relationHostedOn)) {
                        source.setLabel(labelOS);
                        map(source);
                    } else if (edgeLabel.equals(relationConnectsTo)) {
                        source.setLabel(labelService);
                        map(source);
                    }
                } else {
                    map(source);
                }
            }
            return;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
            Iterator iterator = edges.iterator();
            while (iterator.hasNext()) {
                RelationshipEdge edge = (RelationshipEdge) iterator.next();
                TNodeTemplateExtended source = (TNodeTemplateExtended) edge.getV1();
                String edgeLabel = edge.toString();
                if (source.getLabel().isEmpty()) {
                    if (edgeLabel.equals(relationDependsOn)) {
                        //probability that the unlabeled node is an application is very high, because server would be detected + labeled during keyword search,
                        // probability that service depends on service is very low
                        source.setLabel(labelApp);
                        map(source);
                    }
                } else {
                    map(source);
                }
            }
            return;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                TCapability matchingCapability = nodeWithOpenCapability.getCapabilities()
                    .stream().filter(c -> c.getType().equals(requiredCapabilityTypeQName)).findFirst().get();
                TRelationshipType matchingRelationshipType =
                    getMatchingRelationshipType(requirement, matchingCapability);
                if (matchingRelationshipType != null) {
                    addMatchingRelationshipTemplateToTopologyTemplate(composedTopologyTemplate, matchingRelationshipType, requirement, matchingCapability);
                } else {
                    throw new SplittingException("No suitable relationship type found for matching");
                }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                Optional<String> label = ModelUtilities.getTargetLabel(needHostNode);
                if (!label.isPresent()) {
                    LOGGER.error("No target label present");
                    LOGGER.error("id " + needHostNode.getId());
                    throw new SplittingException("No target label present for Node Template " + needHostNode.getId());
                }

                //noinspection OptionalGetWithoutIsPresent
                String targetLabel = ModelUtilities.getTargetLabel(needHostNode).get();
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                while (!uniqueID) {
                    if (!ids.contains("con" + newRelationshipIdCounter)) {
                        id = "con_" + newRelationshipIdCounter;
                        newRelationshipIdCounter++;
                        uniqueID = true;
                    } else {
                        newRelationshipIdCounter++;
                    }
                }
                newHostedOnRelationship.setId(id);
                newHostedOnRelationship.setName(id);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/FulfillPolicies.java`
#### Snippet
```java
            List<PermutationHelper> possibility = new ArrayList<>();
            for (Map.Entry<TNodeTemplate, List<TTopologyTemplate>> entry : fragmentsFulfillingPoliciesWithNTs.entrySet()) {
                possibility.add(new PermutationHelper(entry.getKey(), entry.getValue()));
            }
            possibilities.add(possibility);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/xml/XmlRepository.java`
#### Snippet
```java
                        if (omitDevelopmentVersions) {
                            WineryVersion version = VersionUtils.getVersion(xmlId.getDecoded());

                            if (version.toString().length() > 0 && version.getWorkInProgressVersion() > 0) {
                                continue;
                            }
                        }
                        Constructor<T> constructor;
                        try {
                            constructor = idClass.getConstructor(Namespace.class, XmlId.class);
                        } catch (Exception e) {
                            LOGGER.debug("Internal error at determining id constructor", e);
                            // abort everything, return invalid result
                            return res;
                        }
                        T id;
                        try {
                            id = constructor.newInstance(ns, xmlId);
                        } catch (InstantiationException
                                 | IllegalAccessException
                                 | IllegalArgumentException
                                 | InvocationTargetException e) {
                            LOGGER.debug("Internal error at invocation of id constructor", e);
                            // abort everything, return invalid result
                            return res;
                        }
                        res.add(id);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/YamlRepository.java`
#### Snippet
```java
                                if (implementation.getPrimaryArtifactName().equalsIgnoreCase(targetArtifactName)) {
                                    operationDefinition.setImplementation(null);
                                } else {
                                    if (implementation.getDependencyArtifactNames() != null) {
                                        List<String> names = implementation.getDependencyArtifactNames();
                                        for (String name : implementation.getDependencyArtifactNames()) {
                                            if (name.equalsIgnoreCase(targetArtifactName)) {
                                                names.remove(name);
                                            }
                                        }
                                        implementation.setDependencyArtifactNames(names);
                                    }
                                }
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java
        if (node.getNamespaceUri() == null && !parameter.reference.getNamespaceURI().equals(Namespaces.DEFAULT_YAML_NS)) {
            return null;
        }

        String namespace = node.getNamespaceUri() == null ? Namespaces.DEFAULT_YAML_NS : node.getNamespaceUri();
        if (!this.visitors.containsKey(node)) {
            try {
                this.serviceTemplates.put(node, reader.readImportDefinition(node, path, namespace));
            } catch (MultiException e) {
                setException(e);
            }
            this.visitors.put(node, new ReferenceVisitor(this.serviceTemplates.get(node), namespace, path));
        }

        return this.visitors.get(node).visit(this.serviceTemplates.get(node), parameter);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java
        Result result;
        if (parameter.reference.getNamespaceURI().equals(this.namespace)
            && "TArtifactType".equals(parameter.entityClass)
            && node.getArtifactTypes().containsKey(parameter.reference.getLocalPart())) {
            return node.getArtifactTypes().get(parameter.reference.getLocalPart()).accept(this, parameter.copy());
        }

        for (YTMapImportDefinition map : node.getImports()) {
            for (Map.Entry<String, YTImportDefinition> entry : map.entrySet()) {
                result = entry.getValue().accept(this, parameter);
                if (result != null) {
                    return result;
                }
            }
        }

        return null;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/CommandAnalyzer/ApkAnalyzer.java`
#### Snippet
```java
        List<Component> components = new ArrayList<>();
        for (String softwarePackage : packages) {
            String version = "undefined";
            String name = softwarePackage;
            if (softwarePackage.contains("@")) {
                version = softwarePackage.substring(softwarePackage.indexOf('@') + 1);
                name = softwarePackage.substring(0, softwarePackage.indexOf('@'));
            }
            components.add(new Component(name, version, "equals"));
        }
        return components;
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/CommandAnalyzer/AptgetAnalyzer.java`
#### Snippet
```java
        String[] words = command.split("\\s");
        List<String> packages = new ArrayList<>();

        for (String word : words) {
            if (word.length() > 0 && word.charAt(0) != '-') {
                packages.add(word);
            }
            // remove RUN and "install" itself
            if (word.equals("install")) {
                packages.clear();
            }
        }
        return parseComponents(packages);
```

### DuplicatedCode
Duplicated code
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/CommandAnalyzer/Pip3Analyzer.java`
#### Snippet
```java
        List<Component> components = new ArrayList<>();
        for (String softwarePackage : packages) {
            String version = "undefined";
            String name = softwarePackage;
            String versionOperator = "undefined";
            if (softwarePackage.contains("==") || softwarePackage.contains(">=") || softwarePackage.contains("<=") || softwarePackage.contains("!=") || softwarePackage.contains("~=")) {
                version = softwarePackage.substring(softwarePackage.indexOf('=') + 1);
                if (softwarePackage.contains("==")) {
                    name = softwarePackage.substring(0, softwarePackage.indexOf("=="));
                    versionOperator = "==";
                } else {
                    name = softwarePackage.substring(0, softwarePackage.indexOf("=") - 1);
                    versionOperator = softwarePackage.substring(softwarePackage.indexOf("=") - 1, softwarePackage.indexOf("=") + 1);
                }
            }
            components.add(new Component(name, version, versionOperator));
        }
        return components;
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return list but the return type is set
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/placement/PlacementUtils.java`
#### Snippet
```java
     *
     * @param topology the topology containing the NodeTemplates
     * @return a list of locations that are defined at one of the NodeTemplates
     */
    private static Set<String> getAllLocations(TTopologyTemplate topology) {
```

## RuleId[id=CatchMayIgnoreException]
### CatchMayIgnoreException
Empty `catch` block
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/GenericArtifactsResource.java`
#### Snippet
```java
        try {
            response.flushBuffer();
        } catch (Exception e) {
        }
        if (StringUtils.isEmpty(apiData.autoGenerateIA)) {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/configuration/Environment.java`
#### Snippet
```java
     * This method writes the current configuration of the configuration attribute into the winery.yml file.
     */
    protected void save() {
        if (configFile != null) {
            try (FileWriter writer = new FileWriter(configFile)) {
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/configuration/Environment.java`
#### Snippet
```java
     * back to the original state, before the test.
     */
    protected void setConfiguration(YAMLConfiguration configuration) {
        this.config = configuration;
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/configuration/Environment.java`
#### Snippet
```java
    }

    protected static Environment getInstance() {
        if (instance == null) {
            instance = new Environment();
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/configuration/Environment.java`
#### Snippet
```java
     * @return the configuration attribute of Environment
     */
    protected YAMLConfiguration getConfiguration() {
        if (config == null) {
            this.getConfigFromFile();
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/ProviderRepository.java`
#### Snippet
```java
            set.retainAll(iterator.next());
        }
        result.addAll(set);
        return result;
    }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/version/VersionSupport.java`
#### Snippet
```java

        String localPart = childId.getNameWithoutVersion() +
            (otherVersion.toString().length() > 0 ? WineryVersion.WINERY_NAME_FROM_VERSION_SEPARATOR + otherVersion.toString() : "");

        QName qName = new QName(childId.getNamespace().getDecoded(), localPart);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/version/VersionSupport.java`
#### Snippet
```java
        version.setWorkInProgressVersion(1);

        return nameWithoutVersion + WineryVersion.WINERY_NAME_FROM_VERSION_SEPARATOR + version.toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/InheritanceUtils.java`
#### Snippet
```java

            if (currentElement == null) {
                throw new IllegalArgumentException(currentQName.toString()
                    + " does not exist in the repository.");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/InheritanceUtils.java`
#### Snippet
```java

            if (!(currentElement instanceof HasInheritance)) {
                throw new IllegalArgumentException(currentQName.toString()
                    + "does not belong to a type/type implementation element.");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/support/Utils.java`
#### Snippet
```java
                    Files.createDirectories(targetPath.getParent());
                    Files.copy(inputStream, targetPath);
                    logger.debug("Write tmp file: {}", targetPath.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
                        targetRepository.putContentToFile(fileRef, content, MediaTypes.MEDIATYPE_TEXT_XML);
                    } catch (IOException e) {
                        CsarImporter.LOGGER.debug("Could not put XML Schema definition to file " + fileRef.toString(), e);
                        errors.add("Could not put XML Schema definition to file " + fileRef.toString());
                    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
                    } catch (IOException e) {
                        CsarImporter.LOGGER.debug("Could not put XML Schema definition to file " + fileRef.toString(), e);
                        errors.add("Could not put XML Schema definition to file " + fileRef.toString());
                    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.generators.ia/src/main/java/org/eclipse/winery/generators/ia/jaxws/AbstractService.java`
#### Snippet
```java
        // Send SOAP Response Message back to requester
        if (replyTo == null) {
            logger.warn("No 'ReplyTo' header found! Therefore, print reply message:\n{}", builder.toString());
        } else {
            HighLevelRestApi.Post(replyTo, builder.toString(), "");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/AbstractComponentsResource.java`
#### Snippet
```java
        String type = IdUtil.getTypeForComponentId(tcId.getClass());
        if (!RepositoryFactory.getRepository().exists(tcId)) {
            AbstractComponentsResource.LOGGER.debug("Definition child id " + tcId.toString() + " not found");
            throw new NotFoundException("Definition child id " + tcId.toString() + " not found");
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/AbstractComponentsResource.java`
#### Snippet
```java
        if (!RepositoryFactory.getRepository().exists(tcId)) {
            AbstractComponentsResource.LOGGER.debug("Definition child id " + tcId.toString() + " not found");
            throw new NotFoundException("Definition child id " + tcId.toString() + " not found");
        }
        Class<? extends AbstractComponentInstanceResource> newResource = AbstractComponentsResource.getComponentInstanceResourceClassForType(type);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
        location = location + "topologytemplate?edit";
        url = URI.create(location);
        LOGGER.debug("URI of the composed Service Template {}", url.toString());
        return Response.created(url).build();
    }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

        ServiceTemplateId newId = new ServiceTemplateId(id.getNamespace().getDecoded(),
            id.getNameWithoutVersion() + WineryVersion.WINERY_NAME_FROM_VERSION_SEPARATOR + newVersion.toString(),
            false);
        ResourceResult response = RestUtils.duplicate(id, newId);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

                ServiceTemplateId newId = new ServiceTemplateId(id.getNamespace().getDecoded(),
                    VersionUtils.getNameWithoutVersion(id.getXmlId().getDecoded()) + WineryVersion.WINERY_NAME_FROM_VERSION_SEPARATOR + newVersion.toString(),
                    false);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

        WineryVersion newVersion = new WineryVersion(
            "_substituted_" + version.toString(),
            1,
            1
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

        ServiceTemplateId newId = new ServiceTemplateId(id.getNamespace().getDecoded(),
            VersionUtils.getNameWithoutVersion(id.getXmlId().getDecoded()) + WineryVersion.WINERY_NAME_FROM_VERSION_SEPARATOR + newVersion.toString(),
            false);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

        WineryVersion newVersion = new WineryVersion(
            "gdm-" + version.toString(),
            1,
            1
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java

        ServiceTemplateId newId = new ServiceTemplateId(id.getNamespace().getDecoded(),
            VersionUtils.getNameWithoutVersion(id.getXmlId().getDecoded()) + WineryVersion.WINERY_NAME_FROM_VERSION_SEPARATOR + newVersion.toString(),
            false);

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        WineryVersion newVersion = new WineryVersion(
            version.toString() + "-live-" + dateFormat.format(new Date()),
            1,
            0
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.tools.copybaragenerator/src/main/java/org/eclipse/winery/tools/copybaragenerator/CopybaraGenerator.java`
#### Snippet
```java
                    return fileAsString.trim().startsWith(licenceString);
                } catch (IOException e) {
                    LOGGER.error("Could not create input stream for {}", repositoryFileReference.toString(), e);
                    return false;
                }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/Bpmn4Tosca2Bpel.java`
#### Snippet
```java
            LOGGER.debug("Creating BPEL Archive...");
            Path zipFilePath = FileUtil.createApacheOdeProcessArchive(Paths.get(targetBPELArchive), planArtefactPaths);
            LOGGER.debug("Management plan zip file saved to " + zipFilePath.toString());
        } catch (Exception e) {
            throw new PlanWriterException(e);
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
            if (response.getStatusInfo().equals(Response.Status.NO_CONTENT)
                || response.getStatusInfo().equals(Response.Status.NOT_FOUND)) {
                LOGGER.error("Error {} when renaming DefinitionsChildId {} to {} at {}", response.getStatus(), oldId.toString(), newId.toString(), wr.getUri().toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
            if (response.getStatusInfo().equals(Response.Status.NO_CONTENT)
                || response.getStatusInfo().equals(Response.Status.NOT_FOUND)) {
                LOGGER.error("Error {} when renaming DefinitionsChildId {} to {} at {}", response.getStatus(), oldId.toString(), newId.toString(), wr.getUri().toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
            if (response.getStatusInfo().equals(Response.Status.NO_CONTENT)
                || response.getStatusInfo().equals(Response.Status.NOT_FOUND)) {
                LOGGER.error("Error {} when deleting id {} from URI {}", response.getStatus(), id.toString(), wr.getUri().toString());
            }
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
        if (!response.getStatusInfo().getFamily().equals(Response.Status.Family.SUCCESSFUL)) {
            // TODO: more fine grained checking for error message. Not all failures are that the QName already exists
            LOGGER.error("Error {} when creating id {} from URI {}", response.getStatus(), qname.toString(), this.primaryWebTarget.getUri().toString());
            throw new QNameAlreadyExistsException();
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
            // TODO: more fine grained checking for error message. Not all
            // failures are that the QName already exists
            LOGGER.debug("Error {} when creating id {} from URI {}", response.getStatus(), qname.toString(), this.primaryWebTarget.getUri().toString());
            String entity = response.readEntity(String.class);
            if (entity != null) {
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            NodesOfOtherParticipants.removeIf(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()));

            transitiveAndDirectSuccessors.remove(NodesOfOtherParticipants);
            //target label must be set for all hostedOn- Successors of app-specific Components
            for (TNodeTemplate appSpecificComponent : appSpecificComponents) {
```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            List<TRelationshipTemplate> removingIncomingRelationships = ModelUtilities.getAllRelationshipTemplates(serviceTemplate.getTopologyTemplate())
                .stream()
                .filter(ir -> replacementNodeTemplateCandidates.contains(ir.getTargetElement().getRef()))
                .collect(Collectors.toList());

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            List<TRelationshipTemplate> removingOutgoingRelationships = ModelUtilities.getAllRelationshipTemplates(serviceTemplate.getTopologyTemplate())
                .stream()
                .filter(ir -> replacementNodeTemplateCandidates.contains(ir.getSourceElement().getRef()))
                .collect(Collectors.toList());

```

### SuspiciousMethodCalls
Suspicious call to 'Map.remove()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            appSpecificComponentsOfOtherParticipants.removeIf(nt -> ModelUtilities.getOwnerParticipantOfServiceTemplate(serviceTemplate).equalsIgnoreCase(ModelUtilities.getParticipant(nt).get()));

            transitiveAndDirectSuccessors.remove(appSpecificComponentsOfOtherParticipants);
        }

```

### SuspiciousMethodCalls
Suspicious call to 'List.contains()'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    ModelUtilities.getOutgoingRelationshipTemplates(topologyTemplate, originHost)
                        .stream()
                        .filter(r -> !getHostedOnSuccessorsOfNodeTemplate(topologyTemplate, originHost).contains(r.getTargetElement().getRef()))
                        .collect(Collectors.toList());

```

## RuleId[id=InnerClassMayBeStatic]
### InnerClassMayBeStatic
Inner class `AccumulatedMethodInvocationTime` may be 'static'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ExecutionTimeDebugger.java`
#### Snippet
```java
    }

    private class AccumulatedMethodInvocationTime {
        private String name;
        private String parent;
```

### InnerClassMayBeStatic
Inner class `GitLogRunnable` may be 'static'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java
    }

    class GitLogRunnable implements Runnable {
        private Map<String, Map<DiffEntry, String>> repoList;
        private List<GitWebSocket> socketList;
```

### InnerClassMayBeStatic
Inner class `NamespaceAndIdAsString` may be 'static'
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
    }

    private class NamespaceAndIdAsString {
        String namespace;
        String id;
```

## RuleId[id=DanglingJavadoc]
### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/extensions/kvproperties/WinerysPropertiesDefinition.java`
#### Snippet
```java
@XmlRootElement(name = "PropertiesDefinition")
@XmlAccessorType(XmlAccessType.PROPERTY)
/**
 * This is Winery's main extension element for a key/value based properties definition.
 * To be representable in the canonical model it directly implements the marker interface used for storing
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TDefinitions.java`
#### Snippet
```java
})
@XmlRootElement(name = "Definitions")
/**
 * This is the canonical model's TDefinitions type. It's a combination of the tDefinitions type from the XML-1.0 standard
 * and the Definitions type from the YAML standard and acts as a superset to both of them.
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.winery.common/src/main/java/org/eclipse/winery/common/configuration/AccountabilityConfigurationObject.java`
#### Snippet
```java

    @Override
    /**
     * This loads the default keystore file from resources and sets it as the current keystore file in the
     * configuration, when there is no custom keystore file listed.
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
        int codeEnd;

        /**
         * Boolean to check if string contains ruby code.
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
        String resolvedRubyCode;

        /**
         * String builder to build the resolved string.
         */
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
        }

        /**
         * Convert extacted configuations to TOSCA node types.
         * Extracted platforms are also converted to TOSCA node types.
```

### DanglingJavadoc
Dangling Javadoc comment
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/NamespaceManager.java`
#### Snippet
```java
        NamespaceManager owner = this;
        Logger LOGGER = LoggerFactory.getLogger(NamespaceManager.class);
        /**
         * Follows https://jaxb.java.net/2.2.5/docs/release-documentation.html#marshalling -changing-prefixes
         * <p>
```

## RuleId[id=UnusedLabel]
### UnusedLabel
Unused label `label`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
        for (TNodeTemplate tNodeTemplate : tNodeTemplateList) {
            if (!labeled.isEmpty()) {
                label:
                for (TNodeTemplateExtended tNodeTemplateExtended : labeled) {
                    // if this node is already labeled, add the correspondent, already created NodeTemplateExtended to the AbstractTopology
```

## RuleId[id=ComparatorResultComparison]
### ComparatorResultComparison
Comparison of compare method result with specific constant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
        switch (operator) {
            case ">":
                if (cookbookAvailableVersion.compareTo(cookbookDependencie) == 1) {
                    versionOk = true;
                }
```

### ComparatorResultComparison
Comparison of compare method result with specific constant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
                break;
            case "<":
                if (cookbookAvailableVersion.compareTo(cookbookDependencie) == -1) {
                    versionOk = true;
                }
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/ChefDslHelper.java`
#### Snippet
```java
    public static boolean hasChefAttributeInString(String rubyString) {
        boolean hasAttribute = false;
        if (rubyString.contains("#{")) {
            hasAttribute = true;
        }
```

### TrivialIf
`if` statement can be simplified
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/KitchenUtilities.java`
#### Snippet
```java
        if (newPlatform.indexOf("opensuseleap") == 0 && "opensuse".equals(oldPlatform)) {
            return true;
        } else if (newPlatform.indexOf("amazonlinux") == 0 && "amazon".equals(oldPlatform)) {
            return true;
        } else
```

## RuleId[id=SynchronizeOnNonFinalField]
### SynchronizeOnNonFinalField
Synchronization on a non-final field `session`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java

    public void handleGitRepository(GitBasedRepository gitRepo, GitData data, Map<String, Map<DiffEntry, String>> repoEntryList) {
        synchronized (session) {
            String gitUrl;
            if (gitRepo.getRepositoryUrl() != null) {
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplatesResource.java`
#### Snippet
```java
        xaasPackages.removeAll(toRemove);

        if (xaasPackages.size() <= 0) {
            return Response.serverError().entity("No suitable ServiceTemplate found for given artifact and configuration").build();
        }
```

## RuleId[id=EqualsHashCodeCalledOnUrl]
### EqualsHashCodeCalledOnUrl
Call to `hashCode()` on URL object
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + (uri != null ? uri.hashCode() : 0);
            result = 31 * result + (iconURL != null ? iconURL.hashCode() : 0);
            result = 31 * result + (patternLanguageId != null ? patternLanguageId.hashCode() : 0);
            result = 31 * result + (patternLanguageName != null ? patternLanguageName.hashCode() : 0);
```

## RuleId[id=OptionalUsedAsFieldOrParameterType]
### OptionalUsedAsFieldOrParameterType
`Optional` used as type for field 'subDirectory'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/RepositoryFileReference.java`
#### Snippet
```java

    private final GenericId parent;
    private final Optional<Path> subDirectory;
    private final String fileName;

```

### OptionalUsedAsFieldOrParameterType
`Optional` used as type for parameter 'printer'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlPrinter.java`
#### Snippet
```java
    }

    public YamlPrinter print(Optional<YamlPrinter> printer) {
        printer.ifPresent(this::print);
        return this;
```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.edmm/src/main/java/org/eclipse/winery/edmm/model/EdmmExporter.java`
#### Snippet
```java
                        ? Environments.getInstance().getRepositoryConfig().getRepositoryRoot() + "/" + givenPath
                        : givenPath,
                    "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/ids/EncodingUtil.java`
#### Snippet
```java
    public static String URLdecode(String s) {
        try {
            return URLDecoder.decode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException();
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/ids/EncodingUtil.java`
#### Snippet
```java
    public static String URLencode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException();
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
    private static JSONObject getJsonFromUrl(String url) throws IOException, JSONException {
        try (InputStream is = new URL(url).openStream()) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")))) {
                String jsonText = readAll(reader);
                JSONObject json = new JSONObject(jsonText);
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/support/Utils.java`
#### Snippet
```java
        String fileName = artifactTemplate.getArtifactReferences().get(0).getReference();
        String repositoryPath = repository.getRepositoryRoot().toString();
        return repositoryPath + "/" + URLDecoder.decode(fileName, "utf-8");
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/RepositoryUtils.java`
#### Snippet
```java

    public static String getUrlSeparatorEncoded() throws UnsupportedEncodingException {
        return URLEncoder.encode(Constants.URL_SEPARATOR, StandardCharsets.UTF_8.name());
    }

```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
            resolver = resolverOptional.get();
            try {
                String ownerDirectory = URLEncoder.encode(resolver.getRepositoryMaintainerUrl(), "UTF-8");
                Path ownerRoot = this.repositoryRoot.resolve(ownerDirectory);
                if (!ownerRoot.toFile().exists()) {
```

### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/select2/Select2DataWithOptGroups.java`
#### Snippet
```java
        String groupId = group;
        try {
            groupId = URLEncoder.encode(group, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
```

### CharsetObjectCanBeUsed
Charset.defaultCharset() can be used instead
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/API/AccountabilityResource.java`
#### Snippet
```java
    public Response retrieveFileFromImmutableStorage(@QueryParam("address") String address) {
        try (InputStream data = getAccountabilityManager().retrieveState(address).get()) {
            String fileAsString = IOUtils.toString(data, Charset.defaultCharset().toString());

            return Response
```

## RuleId[id=ExcessiveRangeCheck]
### ExcessiveRangeCheck
Can be replaced with 'availableMatchingRelationshipTypes.size() == 1'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                }

                if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() == 1) {
                    return availableMatchingRelationshipTypes.get(0);
                } else if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() > 1) {
```

### ExcessiveRangeCheck
Can be replaced with 'availableMatchingRelationshipTypes.size() == 1'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                    availableMatchingRelationshipTypes.addAll(additionalMatchingRelationshipTypes);

                    if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() == 1) {
                        return availableMatchingRelationshipTypes.get(0);
                    } else if (!availableMatchingRelationshipTypes.isEmpty() && availableMatchingRelationshipTypes.size() > 1) {
```

### ExcessiveRangeCheck
Can be replaced with 'nodesWithMatchingCapability.size() == 1'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
                .collect(Collectors.toList());

            if (!nodesWithMatchingCapability.isEmpty() && nodesWithMatchingCapability.size() == 1) {
                TCapability matchingCapability = nodesWithMatchingCapability.get(0).getCapabilities()
                    .stream().filter(c -> c.getType().equals(requiredCapTypeQName)).findFirst().get();
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'CloseableHttpClient' used without 'try'-with-resources statement
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/entries/RemoteRefBasedCsarEntry.java`
#### Snippet
```java
            throw new IOException("Could not determine URI", e);
        }
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(uri);
        HttpResponse response = client.execute(request);
```

### AutoCloseableResource
'Git' used without 'try'-with-resources statement
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/CsarExporter.java`
#### Snippet
```java
                .setURI(gitInfo.URL)
                .setDirectory(tempDir.toFile())
                .call();
            git.checkout().setName(gitInfo.BRANCH).call();
            String path = "artifacttemplates/"
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/AbstractFileBasedRepository.java`
#### Snippet
```java
        final OnlyNonHiddenFiles onlyNonHiddenFiles = new OnlyNonHiddenFiles();
        try {
            Files.walk(dir).filter(f -> {
                try {
                    return onlyNonHiddenFiles.accept(f);
```

### AutoCloseableResource
'Stream' used without 'try'-with-resources statement
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/WriterUtils.java`
#### Snippet
```java
            RepositoryFileReference ref = BackendUtils.getRefOfDefinitions(rid);

            List<File> files = Files.list(path).filter(Files::isRegularFile)
                .map(Path::toFile).collect(Collectors.toList());
            for (File file : files) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/edmm/EdmmResource.java`
#### Snippet
```java
        // the interfaces will be overridden
        nodeTypeResource.getInterfaces()
            .onPost(buildInterfacesForNodeType(LIFECYCLE_NAME, LIFECYCLE));

        for (String operation : LIFECYCLE) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/edmm/EdmmResource.java`
#### Snippet
```java
                "{" + ARTIFACT_TYPES + "}Script"
            );
            artifactTemplatesResource.onJsonPost(qNameWithTypeApiData);

            // adding the placeholder file
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/edmm/EdmmResource.java`
#### Snippet
```java
                "{" + NODE_TYPES + "}" + componentType
            );
            nodeTypeImplementationsResource.onJsonPost(qNameWithTypeApiData);

            // linking the artifact template to the node type implementation
```

### AutoCloseableResource
'CloseableHttpClient' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/AdminTopResource.java`
#### Snippet
```java
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCheUrl() throws Exception {
        HttpClient httpclient = HttpClients.createDefault();
        String cheApiEndpoint = System.getenv("CHE_API");
        String cheMachineToken = System.getenv("CHE_MACHINE_TOKEN");
```

### AutoCloseableResource
'CloseableHttpClient' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/admin/AdminTopResource.java`
#### Snippet
```java
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGitHubAccessToken(OAuthStateAndCodeApiData codeApiData) throws Exception {
        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("https://github.com/login/oauth/access_token");
        httppost.setHeader("Accept", "application/json");
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
                        // we store the name
                        IHasName resource = (IHasName) AbstractComponentsResource.getComponentInstanceResource(tcId);
                        resource.setName(name);
                    }
                } else {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
        qNameApiData.namespace = "http://opentosca.org/xaaspackager";
        qNameApiData.type = artifactType.toString();
        templateResource.onJsonPost(qNameApiData);

        ArtifactTemplateId artifactTemplateId = new ArtifactTemplateId("http://opentosca.org/xaaspackager", "xaasPackager_" + fileDetail.getFileName(), false);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/RestUtils.java`
#### Snippet
```java
     */
    public static boolean isResourceAvailable(String path) {
        Response response = ClientBuilder.newClient().target(path).request().head();

        return response.getStatusInfo().getFamily().equals(Family.SUCCESSFUL);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/AbstractRefinementModelMappingsResource.java`
#### Snippet
```java
    public List<T> removePatternRefinement(@PathParam("id") String id) {
        this.mappings.removeIf(mapping -> mapping.getId().equals(id));
        RestUtils.persist(this.res);
        return this.mappings;
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/AbstractRefinementModelMappingsResource.java`
#### Snippet
```java
        this.mappings.remove(mapping);
        this.mappings.add(mapping);
        RestUtils.persist(this.res);
        return mappings;
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/ImplementationArtifactResource.java`
#### Snippet
```java
    public void setArtifactTemplate(ArtifactTemplateId artifactTemplateId) {
        this.getImplementationArtifact().setArtifactRef(artifactTemplateId.getQName());
        RestUtils.persist(this.res);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/ImplementationArtifactResource.java`
#### Snippet
```java
    public void setArtifactType(ArtifactTypeId artifactTypeId) {
        this.getImplementationArtifact().setArtifactType(artifactTypeId.getQName());
        RestUtils.persist(this.res);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/DeploymentArtifactResource.java`
#### Snippet
```java
    public void setArtifactType(ArtifactTypeId artifactTypeId) {
        this.getDeploymentArtifact().setArtifactType(artifactTypeId.getQName());
        RestUtils.persist(this.res);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/DeploymentArtifactResource.java`
#### Snippet
```java
    public void setArtifactTemplate(ArtifactTemplateId artifactTemplateId) {
        this.getDeploymentArtifact().setArtifactRef(artifactTemplateId.getQName());
        RestUtils.persist(this.res);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/AbstractComponentInstanceResource.java`
#### Snippet
```java

        // ensure that the definitions is persisted. Ensures that export works.
        RestUtils.persist(this);
    }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/nodetypes/NodeTypeResource.java`
#### Snippet
```java
        List<TArtifact> artifacts = nodeType.getArtifacts();
        artifacts.remove(artifact);
        this.uploadArtifact(name).deleteFile(artifact.getFile(), null);
        return RestUtils.persist(this);
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/GenericArtifactsResource.java`
#### Snippet
```java

        // TODO: Check for error, and in case one found return it
        RestUtils.persist(super.res);

        response.setStatus(Status.CREATED.getStatusCode());
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TestRefinementModelResource.java`
#### Snippet
```java
    public TopologyTemplateResource savePrmMappingTopology(TTopologyTemplate topologyTemplate) {
        this.getTRefinementModel().resetAllMappings();
        RestUtils.persist(this);
        for (TRelationshipTemplate relTemplate : topologyTemplate.getRelationshipTemplates()) {
            String mappingId;
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TopologyFragmentRefinementModelResource.java`
#### Snippet
```java
    public TopologyTemplateResource savePrmMappingTopology(TTopologyTemplate topologyTemplate) {
        this.getTRefinementModel().resetAllMappings();
        RestUtils.persist(this);
        for (TRelationshipTemplate relTemplate : topologyTemplate.getRelationshipTemplates()) {
            String mappingId;
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/PlanFileResource.java`
#### Snippet
```java
        if (oldRef != null && !ref.equals(oldRef)) {
            // new filename sent
            RestUtils.delete(oldRef);
        }
        PlansResource.setPlanModelReference(this.plan, this.planId, fileName);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/PlanFileResource.java`
#### Snippet
```java
        }
        PlansResource.setPlanModelReference(this.plan, this.planId, fileName);
        RestUtils.persist(this.res);

        return RestUtils.putContentToFile(ref, uploadedInputStream, org.apache.tika.mime.MediaType.parse(body.getMediaType().toString()));
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/selfserviceportal/OptionsResource.java`
#### Snippet
```java

        RepositoryFileReference planInputMessageRef = new RepositoryFileReference(this.selfServiceMetaId, planInputMessageFileName);
        RestUtils.putContentToFile(planInputMessageRef, planInputMessage, MediaType.TEXT_XML_TYPE);

        // END: store icon and planInputMessage
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/PlansResource.java`
#### Snippet
```java
                RepositoryFileReference ref = new RepositoryFileReference(planId, fileName);
                // Errors are ignored in the following call
                RestUtils.putContentToFile(ref, "{}", MediaType.APPLICATION_JSON_TYPE);
            } else {
                // We use the filename also as local file name. Alternatively, we could use the xml id
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/selfserviceportal/SelfServicePortalResource.java`
#### Snippet
```java
        if (StringUtils.isEmpty(this.application.getImageUrl())) {
            this.application.setImageUrl("image.jpg");
            persist();
        }
        return response;
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/selfserviceportal/SelfServicePortalResource.java`
#### Snippet
```java
        if (StringUtils.isEmpty(this.application.getIconUrl())) {
            this.application.setIconUrl("icon.jpg");
            persist();
        }
        return response;
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/NodeTemplateResource.java`
#### Snippet
```java

        new ArtifactTemplatesResource()
            .onJsonPost(new QNameWithTypeApiData(
                newArtifactTemplateId.getQName().getLocalPart(),
                newArtifactTemplateId.getQName().getNamespaceURI(),
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
        TTopologyTemplate enrichedTopology = EnhancementUtils.applyFeaturesForTopology(this.topologyTemplate, featureMap);
        this.parent.setTopology(enrichedTopology, this.type);
        RestUtils.persist(this.parent);

        return enrichedTopology;
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
                PlacementUtils.groupAndPlaceComponents((ServiceTemplateId) this.parent.getId(), this.topologyTemplate);
            this.parent.setTopology(topology, this.type);
            RestUtils.persist(this.parent);
            ServiceTemplateId thisServiceTemplateId = (ServiceTemplateId) this.parent.getId();
            URI url = uriInfo.getBaseUri().resolve(RestUtils.getAbsoluteURL(thisServiceTemplateId));
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java
        SolutionStrategy strategy = SolutionFactory.getSolution(data);
        if (strategy.applySolution(this.topologyTemplate, data)) {
            RestUtils.persist(parent);
        } else {
            throw new InternalError("Could not apply the given algorithm to the topology!");
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/topologytemplates/TopologyTemplateResource.java`
#### Snippet
```java

        if (updateInfo.isSaveAfterUpdate()) {
            this.setModel(localTemplate);
        }

```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
    public Response deleteSubstitutableNodeType() {
        this.getServiceTemplate().setSubstitutableNodeType(null);
        RestUtils.persist(this);
        return Response.noContent().build();
    }
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                if (repo.exists(placeholderId)) {
                    // delete and create new
                    RestUtils.delete(placeholderId);
                }
                repo.setElement(placeholderId, placeholderNodeType);
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
            }
            LOGGER.debug("PERSISTING");
            RestUtils.persist(this);
            LOGGER.debug("PERSISTED");
            String responseId = this.getServiceTemplate().getId();
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                this.getServiceTemplate().setTopologyTemplate(daSpecifiedTopology);
                topologyTemplate = this.getTopology();
                RestUtils.persist(this);
            } catch (Exception e) {
                e.printStackTrace();
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
        Response response = WineryRepositoryClient.getTopologyTemplateWebTarget(this.primaryWebTarget, serviceTemplate)
            .request()
            .put(Entity.xml(topologyTemplate));

        LOGGER.debug(response.toString());
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
            Response response = wr.path(pathFragment).path("id")
                .request()
                .post(Entity.json(namespaceAndIdAsString));
            if (response.getStatusInfo().equals(Response.Status.NO_CONTENT)
                || response.getStatusInfo().equals(Response.Status.NOT_FOUND)) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java
        String pathFragment = IdUtil.getURLPathFragment(id);
        for (WebTarget wr : this.repositoryResources) {
            Response response = wr.path(pathFragment).request().delete();
            if (response.getStatusInfo().equals(Response.Status.NO_CONTENT)
                || response.getStatusInfo().equals(Response.Status.NOT_FOUND)) {
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java

        Response response = resource.request(MediaType.TEXT_PLAIN)
            .post(Entity.form(map));
        if (!response.getStatusInfo().getFamily().equals(Response.Status.Family.SUCCESSFUL)) {
            // TODO: more fine grained checking for error message. Not all failures are that the QName already exists
```

### AutoCloseableResource
'Response' used without 'try'-with-resources statement
in `org.eclipse.winery.repository.client/src/main/java/org/eclipse/winery/repository/client/WineryRepositoryClient.java`
#### Snippet
```java

        Response response = artifactTemplates.request(MediaType.TEXT_PLAIN)
            .post(Entity.json(root));

        if (!response.getStatusInfo().getFamily().equals(Response.Status.Family.SUCCESSFUL)) {
```

## RuleId[id=ComparatorMethodParameterNotUsed]
### ComparatorMethodParameterNotUsed
Comparator does not return 0 for equal elements
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/placement/PlacementUtils.java`
#### Snippet
```java
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<>((e1, e2) -> {
            int res = e2.getValue().compareTo(e1.getValue());
            return res != 0 ? res : 1;
        }
        );
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
IOException is not declared to be thrown by method getParseResultFromFile
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
     * @param rbFilePath Path to file that should be parsed.
     * @return New deployment architecture information from the parsed file.
     * @throws IOException if the file can not be read.
     */
    public static CookbookParseResult getParseResultFromFile(CookbookParseResult cookbookConfigs, String rbFilePath) {
```

### JavadocDeclaration
Tag `return` is not allowed here
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ToscaExportUtil.java`
#### Snippet
```java
     * Determines the referenced definition children Ids and also updates the references in the Artifact Template
     *
     * @return a collection of referenced definition child Ids
     */
    protected void prepareForExport(IRepository repository, ArtifactTemplateId id) throws IOException {
```

### JavadocDeclaration
Wrong tag `parem`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/IWineryRepository.java`
#### Snippet
```java
     * @param parentPath      the parent path to use - with leading and trailing /
     * @return null if nothing is found
     * @parem elementPath the element path to use - with leading and traling /
     */
    TTopologyTemplate getTopologyTemplate(QName serviceTemplate, String parentPath, String elementPath);
```

### JavadocDeclaration
UndefinedFile is not declared to be thrown by method readObject
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java
     * @param path name
     * @return Object (Lists, Maps, Strings, Integers, Dates)
     * @throws UndefinedFile if the file could not be found.
     */
    private Object readObject(Path path) throws MultiException {
```

### JavadocDeclaration
UndefinedFile is not declared to be thrown by method readMetadataObject
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java
     *
     * @return Object (Lists, Maps, Strings, Integers, Dates)
     * @throws UndefinedFile if the file could not be found.
     */

```

### JavadocDeclaration
Wrong tag `{@link`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
     *
     * @param eventListener an objects that contains methods annotated with the
     *                      @{@link com.google.common.eventbus.Subscribe}
     */
    public void unregisterForEvents(Object eventListener) {
```

### JavadocDeclaration
Wrong tag `{@link`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
     *
     * @param eventListener an objects that contains methods annotated with the
     *                      @{@link com.google.common.eventbus.Subscribe}
     */
    public void registerForEvents(Object eventListener) {
```

### JavadocDeclaration
Wrong tag `{@link`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
     *
     * @param eventListener an objects that contains methods annotated with the
     * @{@link com.google.common.eventbus.Subscribe}
     */
    public void registerForEvents(Object eventListener) {
```

### JavadocDeclaration
Wrong tag `{@link`
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
     *
     * @param eventListener an objects that contains methods annotated with the
     * @{@link com.google.common.eventbus.Subscribe}
     */
    public void unregisterForEvents(Object eventListener) {
```

### JavadocDeclaration
Illegal character
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/enhance/EnhancementUtils.java`
#### Snippet
```java
     * @param nodeTemplate The NodeTemplate that is updated with the selected features.
     * @param featureTypes The list of selected features as generated by
     *                     {@link #getAvailableFeaturesForTopology(TTopologyTemplate, List}.
     * @return The mapping of the generated merged NodeType and the QName of the NodeType it replaces.
     */
```

### JavadocDeclaration
`@param id` tag description is missing
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/ManagementFlow.java`
#### Snippet
```java

    /**
     * @param id
     * @return The node with the given id or <code>null</code> if a node with this id cannot be found
     */
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `this` to `XHasId` is redundant
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XHasIdInIdOrNameField.java`
#### Snippet
```java
    default void setId(String id) {
        if (this instanceof XHasId) {
            ((XHasId) this).setId(id);
        }
        if (this instanceof XHasName) {
```

### RedundantCast
Casting `this` to `HasId` is redundant
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/HasIdInIdOrNameField.java`
#### Snippet
```java
    default void setId(String id) {
        if (this instanceof HasId) {
            ((HasId) this).setId(id);
        }
        if (this instanceof HasName) {
```

### RedundantCast
Casting `defs` to `TDefinitions` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/YamlCsarImporter.java`
#### Snippet
```java
        if (Objects.nonNull(converter)) {
            YamlWriter writer = new YamlWriter();
            writer.write(converter.convert((TDefinitions) defs), repo.ref2AbsolutePath(ref));
        }
    }
```

### RedundantCast
Casting `requirementProperties.get(...)` to `String` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
            && requirementProperties.get("requiredRelationshipType") != null) {
            // Assumption: We work on basic KV properties here
            QName referencedRelationshipType = QName.valueOf((String) requirementProperties.get("requiredRelationshipType"));
            RelationshipTypeId relTypeId = new RelationshipTypeId(referencedRelationshipType);
            if (relTypeIds.stream().anyMatch(rti -> rti.equals(relTypeId))) {
```

### RedundantCast
Casting `iter.next()` to `Node` is redundant
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/ManagementFlow.java`
#### Snippet
```java
        Iterator<Node> iter = vertexSet().iterator();
        while (iter.hasNext()) {
            Node node = (Node) iter.next();
            if (node.getId().equals(id))
                return node;
```

### RedundantCast
Casting `iter.next()` to `Parameter` is redundant
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/Task.java`
#### Snippet
```java
        Iterator<Parameter> iter = outputParams.iterator();
        while (iter.hasNext()) {
            Parameter param = (Parameter) iter.next();
            this.outputParams.put(param.getName(), param);
        }
```

### RedundantCast
Casting `iter.next()` to `Parameter` is redundant
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/Task.java`
#### Snippet
```java
        Iterator<Parameter> iter = inputParams.iterator();
        while (iter.hasNext()) {
            Parameter param = (Parameter) iter.next();
            this.inputParams.put(param.getName(), param);
        }
```

### RedundantCast
Casting `properties.get(...)` to `String` is redundant
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
                    LinkedHashMap<String, String> properties = ModelUtilities.getPropertiesKV(mitigationTemplate);
                    // FIXME Assumption that we're dealing with simple KV Properties
                    String threatReferenceString = (String)properties.get("ThreatReference");

                    QName threatReference = QName.valueOf(threatReferenceString);
```

### RedundantCast
Casting `iter.next()` to `Parameter` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/ManagementTaskTemplateWrapper.java`
#### Snippet
```java
		Iterator<Parameter> iter = parameters.iterator();
		while (iter.hasNext()) {
			Parameter parameter = (Parameter) iter.next();
			/* Just topology parameter refer to node templates */
			if (parameter instanceof TopologyParameter) {
```

### RedundantCast
Casting `inputParamIter.next()` to `Map.Entry` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/Bpmn4JsonParser.java`
#### Snippet
```java
            Iterator<Map.Entry<String, JsonNode>> inputParamIter = inputParams.fields();
            while (inputParamIter.hasNext()) {
                Map.Entry<String, JsonNode> inputParamEntry = (Map.Entry<String, JsonNode>) inputParamIter.next();
                Parameter inputParam = createParameterFromJson(inputParamEntry.getKey(), inputParamEntry.getValue());
                task.addInputParameter(inputParam);
```

### RedundantCast
Casting `outputParamIter.next()` to `Map.Entry` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/Bpmn4JsonParser.java`
#### Snippet
```java
            Iterator<Map.Entry<String, JsonNode>> outputParamIter = outputParams.fields();
            while (outputParamIter.hasNext()) {
                Map.Entry<String, JsonNode> outputParamEntry = (Map.Entry<String, JsonNode>) outputParamIter.next();
                Parameter outputParam = createParameterFromJson(outputParamEntry.getKey(), outputParamEntry.getValue());
                task.addOutputParameter(outputParam);
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `value` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTTag.java`
#### Snippet
```java
    public static class Builder {
        private String name;
        private String value;

        public Builder(String name, String value) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.xml/src/main/java/org/eclipse/winery/model/tosca/xml/XTTag.java`
#### Snippet
```java

    public static class Builder {
        private String name;
        private String value;

```

### FieldMayBeFinal
Field `value` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/support/Metadata.java`
#### Snippet
```java

public class Metadata implements Map<String, String> {
    private Map<String, String> value;

    public Metadata() {
```

### FieldMayBeFinal
Field `context` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.yaml/src/main/java/org/eclipse/winery/model/tosca/yaml/visitor/AbstractParameter.java`
#### Snippet
```java

public abstract class AbstractParameter<P extends AbstractParameter> implements IParameter<P> {
    private List<String> context;

    public AbstractParameter() {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TTag.java`
#### Snippet
```java
    public static class Builder {

        private String name;
        private String value;

```

### FieldMayBeFinal
Field `value` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/tosca/TTag.java`
#### Snippet
```java

        private String name;
        private String value;

        public Builder(String name, String value) {
```

### FieldMayBeFinal
Field `argArray` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/converter/support/exception/YAMLParserException.java`
#### Snippet
```java

public abstract class YAMLParserException extends Exception {
    private List<Object> argArray;
    private String inlineContext;
    private Path fileContext;
```

### FieldMayBeFinal
Field `exceptions` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/converter/support/exception/MultiException.java`
#### Snippet
```java

public class MultiException extends Exception {
    private List<Exception> exceptions;
    private List<String> context;

```

### FieldMayBeFinal
Field `context` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/converter/support/exception/MultiException.java`
#### Snippet
```java
public class MultiException extends Exception {
    private List<Exception> exceptions;
    private List<String> context;

    public MultiException() {
```

### FieldMayBeFinal
Field `element` may be 'final'
in `org.eclipse.winery.model/org.eclipse.winery.model.tosca.canonical/src/main/java/org/eclipse/winery/model/version/ToscaDiff.java`
#### Snippet
```java
public class ToscaDiff {

    private String element;
    private Object oldValue;
    private Object newValue;
```

### FieldMayBeFinal
Field `version` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/helper/Version.java`
#### Snippet
```java
public class Version implements Comparable<Version> {

    private String version;

    public Version(String version) {
```

### FieldMayBeFinal
Field `values` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefAttribute.java`
#### Snippet
```java
    private String name;

    private ArrayList<String> values;

    public ChefAttribute(String name) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefAttribute.java`
#### Snippet
```java
public class ChefAttribute {

    private String name;

    private ArrayList<String> values;
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/ArgsVisitor.java`
#### Snippet
```java
public class ArgsVisitor extends ChefDSLBaseVisitor<List> {

    private CookbookParseResult extractedCookbookConfigs;

    public ArgsVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/ArgVisitor.java`
#### Snippet
```java
public class ArgVisitor extends ChefDSLBaseVisitor<List> {

    private CookbookParseResult extractedCookbookConfigs;

    public ArgVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CaseConditionVisitor.java`
#### Snippet
```java
    private List result;

    private CookbookParseResult extractedCookbookConfigs;

    public CaseConditionVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CallArgsVisitor.java`
#### Snippet
```java
public class CallArgsVisitor extends ChefDSLBaseVisitor<List> {

    private CookbookParseResult extractedCookbookConfigs;

    public CallArgsVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CodeInStringVisitor.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(CommandVisitor.class.getName());

    private CookbookParseResult extractedCookbookConfigs;
    private String resolvedString;

```

### FieldMayBeFinal
Field `attributes` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefCookbookConfiguration.java`
#### Snippet
```java
    private String description;

    private HashMap<String, List> attributes;

    private LinkedHashMap<String, ChefPackage> installedPackages;
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CollectionVisitor.java`
#### Snippet
```java
public class CollectionVisitor extends ChefDSLBaseVisitor<List> {

    private CookbookParseResult extractedCookbookConfigs;

    public CollectionVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/WhenArgsVisitor.java`
#### Snippet
```java
public class WhenArgsVisitor extends ChefDSLBaseVisitor<List> {

    private CookbookParseResult extractedCookbookConfigs;

    public WhenArgsVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/AssignAttributeVisitor.java`
#### Snippet
```java
public class AssignAttributeVisitor extends ChefDSLBaseVisitor<ChefAttribute> {

    private CookbookParseResult extractedCookbookConfigs;
    private ChefAttribute chefAttribute;

```

### FieldMayBeFinal
Field `parseResult` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/BooleanExprVisitor.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(PrimaryBaseVisitor.class.getName());

    private CookbookParseResult parseResult;

    public BooleanExprVisitor(CookbookParseResult existingParseResult) {
```

### FieldMayBeFinal
Field `kitchenYml` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java
public class ChefKitchenYmlParser {

    private Map<String, Object> kitchenYml;
    private String cookbookName;
    private String cookbookPath;
```

### FieldMayBeFinal
Field `cookbookName` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java

    private Map<String, Object> kitchenYml;
    private String cookbookName;
    private String cookbookPath;

```

### FieldMayBeFinal
Field `cookbookPath` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java
    private Map<String, Object> kitchenYml;
    private String cookbookName;
    private String cookbookPath;

    public ChefKitchenYmlParser(CookbookParseResult cookbookParseResult) {
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryBaseVisitor.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(PrimaryBaseVisitor.class.getName());

    private CookbookParseResult extractedCookbookConfigs;

    public PrimaryBaseVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `tempDirectory` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawlCookbookRunnable.java`
#### Snippet
```java
    private String threadName;
    private String cookbookDirectory;
    private String tempDirectory;
    private String versionRestriction;

```

### FieldMayBeFinal
Field `threadName` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawlCookbookRunnable.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(CrawlCookbookRunnable.class.getName());
    private Thread thread;
    private String threadName;
    private String cookbookDirectory;
    private String tempDirectory;
```

### FieldMayBeFinal
Field `cookbookDirectory` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawlCookbookRunnable.java`
#### Snippet
```java
    private Thread thread;
    private String threadName;
    private String cookbookDirectory;
    private String tempDirectory;
    private String versionRestriction;
```

### FieldMayBeFinal
Field `extractedCookbookConfigs` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java
    private static final Logger LOGGER = Logger.getLogger(PrimaryStatementVisitor.class.getName());

    private CookbookParseResult extractedCookbookConfigs;

    public PrimaryStatementVisitor(CookbookParseResult cookbookConfigurations) {
```

### FieldMayBeFinal
Field `cookbookDirectory` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
    private String tempDirectory;

    private String cookbookDirectory;

    public ChefSupermarketCrawler(String cookbookDirectory, String tempDirectory) {
```

### FieldMayBeFinal
Field `tempDirectory` may be 'final'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ChefSupermarketCrawler.class.getName());

    private String tempDirectory;

    private String cookbookDirectory;
```

### FieldMayBeFinal
Field `serviceTemplate` may be 'final'
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ServiceTemplateComplianceRuleRuleChecker.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceTemplateComplianceRuleRuleChecker.class);

    private TServiceTemplate serviceTemplate;

    public ServiceTemplateComplianceRuleRuleChecker(@NonNull TServiceTemplate serviceTemplate) {
```

### FieldMayBeFinal
Field `entry` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlExportAdjustmentsBuilder.java`
#### Snippet
```java
public class YamlExportAdjustmentsBuilder {

    private YAMLDefinitionsBasedCsarEntry entry;
    private YTServiceTemplate definitions;

```

### FieldMayBeFinal
Field `definitions` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/export/YamlExportAdjustmentsBuilder.java`
#### Snippet
```java

    private YAMLDefinitionsBasedCsarEntry entry;
    private YTServiceTemplate definitions;

    public YamlExportAdjustmentsBuilder(YAMLDefinitionsBasedCsarEntry entry) {
```

### FieldMayBeFinal
Field `objects` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java

    public static class Result extends AbstractResult<Result> {
        private List<Object> objects;
        private List<QName> names;

```

### FieldMayBeFinal
Field `visitors` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java
    private final Path path;

    private Map<YTImportDefinition, ReferenceVisitor> visitors;
    private Map<YTImportDefinition, YTServiceTemplate> serviceTemplates;

```

### FieldMayBeFinal
Field `serviceTemplates` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java

    private Map<YTImportDefinition, ReferenceVisitor> visitors;
    private Map<YTImportDefinition, YTServiceTemplate> serviceTemplates;

    public ReferenceVisitor(YTServiceTemplate serviceTemplate, String namespace, Path path) {
```

### FieldMayBeFinal
Field `names` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/ReferenceVisitor.java`
#### Snippet
```java
    public static class Result extends AbstractResult<Result> {
        private List<Object> objects;
        private List<QName> names;

        public Result(Object object) {
```

### FieldMayBeFinal
Field `propertyAssignmentBuildPlan` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/AssignmentBuilder.java`
#### Snippet
```java
public class AssignmentBuilder {
    private TypeConverter typeConverter;
    private Map<QName, Map<String, QName>> propertyAssignmentBuildPlan;

    public AssignmentBuilder(Map<QName, Map<String, QName>> buildPlan) {
```

### FieldMayBeFinal
Field `names` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java
    public static class Result extends AbstractResult<Result> {
        private List<Object> objects;
        private List<QName> names;

        public Result(Object object) {
```

### FieldMayBeFinal
Field `objects` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java

    public static class Result extends AbstractResult<Result> {
        private List<Object> objects;
        private List<QName> names;

```

### FieldMayBeFinal
Field `visitors` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java
    private final Path path;

    private Map<YTImportDefinition, ReferenceVisitor> visitors;
    private Map<YTImportDefinition, YTServiceTemplate> serviceTemplates;

```

### FieldMayBeFinal
Field `serviceTemplates` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/yaml/converter/support/visitors/ReferenceVisitor.java`
#### Snippet
```java

    private Map<YTImportDefinition, ReferenceVisitor> visitors;
    private Map<YTImportDefinition, YTServiceTemplate> serviceTemplates;

    public ReferenceVisitor(YTServiceTemplate serviceTemplate, String namespace, Path path) {
```

### FieldMayBeFinal
Field `phaseStartTimes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ExecutionTimeDebugger.java`
#### Snippet
```java
public class ExecutionTimeDebugger {
    private Map<String, AccumulatedMethodInvocationTime> durations;
    private Map<String, LocalDateTime> phaseStartTimes;

    /**
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ExecutionTimeDebugger.java`
#### Snippet
```java

    private class AccumulatedMethodInvocationTime {
        private String name;
        private String parent;
        private Duration duration;
```

### FieldMayBeFinal
Field `durations` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/ExecutionTimeDebugger.java`
#### Snippet
```java
 * */
public class ExecutionTimeDebugger {
    private Map<String, AccumulatedMethodInvocationTime> durations;
    private Map<String, LocalDateTime> phaseStartTimes;

```

### FieldMayBeFinal
Field `pathInsideCsar` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/CsarContentProperties.java`
#### Snippet
```java
public class CsarContentProperties {
    
    private String pathInsideCsar;
    private String fileHash;

```

### FieldMayBeFinal
Field `document` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/entries/DocumentBasedCsarEntry.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(DocumentBasedCsarEntry.class);
    private static Transformer transformer;
    private Document document;

    public DocumentBasedCsarEntry(Document document) {
```

### FieldMayBeFinal
Field `configuration` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/ConfigurationBasedNamespaceManager.java`
#### Snippet
```java
public class ConfigurationBasedNamespaceManager extends AbstractNamespaceManager {

    private Configuration configuration;
    private Map<String, String> namespaceToPrefixMap = new HashMap<>();

```

### FieldMayBeFinal
Field `namespaceToPrefixMap` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/ConfigurationBasedNamespaceManager.java`
#### Snippet
```java

    private Configuration configuration;
    private Map<String, String> namespaceToPrefixMap = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `errorList` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/consistencycheck/ConsistencyErrorCollector.java`
#### Snippet
```java
    private static final QName CONFIG_Q_NAME = new QName(Namespaces.TOSCA_WINERY_EXTENSIONS_NAMESPACE, "ConsistencyCheckerConfiguration");

    private Map<QName, ElementErrorList> errorList = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `repository` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/entries/XMLDefinitionsBasedCsarEntry.java`
#### Snippet
```java
    
    private XTDefinitions definitions;
    private IRepository repository;

    public XMLDefinitionsBasedCsarEntry(XTDefinitions definitions, IRepository repository) {
```

### FieldMayBeFinal
Field `definitions` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/export/entries/XMLDefinitionsBasedCsarEntry.java`
#### Snippet
```java
    private static final boolean INCLUDE_PROCESSING = true;
    
    private XTDefinitions definitions;
    private IRepository repository;

```

### FieldMayBeFinal
Field `uri` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java
        private String id;
        private String name;
        private URI uri;
        private URL iconURL;
        private String patternLanguageId;
```

### FieldMayBeFinal
Field `id` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java
    public static class Pattern {
        private String namespace;
        private String id;
        private String name;
        private URI uri;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java
        private String namespace;
        private String id;
        private String name;
        private URI uri;
        private URL iconURL;
```

### FieldMayBeFinal
Field `patternLanguageId` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java
        private URI uri;
        private URL iconURL;
        private String patternLanguageId;
        private String patternLanguageName;
        private boolean deploymentModelingBehaviorPattern;
```

### FieldMayBeFinal
Field `namespace` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java
    // TODO: Maybe we could directly convert it to NodeTypes?
    public static class Pattern {
        private String namespace;
        private String id;
        private String name;
```

### FieldMayBeFinal
Field `patternLanguageName` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/patternAtlas/PatternAtlasConsumer.java`
#### Snippet
```java
        private URL iconURL;
        private String patternLanguageId;
        private String patternLanguageName;
        private boolean deploymentModelingBehaviorPattern;
        private boolean deploymentModelingStructurePattern;
```

### FieldMayBeFinal
Field `serviceTemplateBuffer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java

    private Map<Path, byte[]> hashBuffer = new HashMap<>();
    private Map<Path, YTServiceTemplate> serviceTemplateBuffer = new HashMap<>();
    private Map<Path, MultiException> exceptionBuffer = new HashMap<>();

```

### FieldMayBeFinal
Field `exceptionBuffer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java
    private Map<Path, byte[]> hashBuffer = new HashMap<>();
    private Map<Path, YTServiceTemplate> serviceTemplateBuffer = new HashMap<>();
    private Map<Path, MultiException> exceptionBuffer = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `hashBuffer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java
    private Yaml yaml;

    private Map<Path, byte[]> hashBuffer = new HashMap<>();
    private Map<Path, YTServiceTemplate> serviceTemplateBuffer = new HashMap<>();
    private Map<Path, MultiException> exceptionBuffer = new HashMap<>();
```

### FieldMayBeFinal
Field `yaml` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlReader.java`
#### Snippet
```java

    public static final Logger logger = LoggerFactory.getLogger(YamlBuilder.class);
    private Yaml yaml;

    private Map<Path, byte[]> hashBuffer = new HashMap<>();
```

### FieldMayBeFinal
Field `stringBuilder` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlPrinter.java`
#### Snippet
```java
public class YamlPrinter extends AbstractResult<YamlPrinter> {

    private StringBuilder stringBuilder;
    private int indent;

```

### FieldMayBeFinal
Field `ignoreFile` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(GitBasedRepository.class);

    private static List<String> ignoreFile = new ArrayList<>();
    private final Path workingRepositoryRoot;

```

### FieldMayBeFinal
Field `nodeTemplates` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/DefinitionsVisitor.java`
#### Snippet
```java

public class DefinitionsVisitor extends ImportVisitor {
    private Map<String, List<String>> nodeTemplates;
    private Map<String, List<String>> repositoryDefinitions;

```

### FieldMayBeFinal
Field `repositoryDefinitions` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/DefinitionsVisitor.java`
#### Snippet
```java
public class DefinitionsVisitor extends ImportVisitor {
    private Map<String, List<String>> nodeTemplates;
    private Map<String, List<String>> repositoryDefinitions;

    public DefinitionsVisitor(String namespace, Path path) {
```

### FieldMayBeFinal
Field `declaredFields` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/FieldValidator.java`
#### Snippet
```java
    private static final Pattern UPPERCASE_LETTERS = Pattern.compile("[A-Z]");

    private Map<Class, Set<String>> declaredFields;

    public FieldValidator() {
```

### FieldMayBeFinal
Field `definitionsVisitor` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/DefinitionValidator.java`
#### Snippet
```java
public class DefinitionValidator extends ExceptionVisitor<Result, Parameter> {
    public final Path path;
    private DefinitionsVisitor definitionsVisitor;

    public DefinitionValidator(Path path) {
```

### FieldMayBeFinal
Field `policyTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
    private Map<String, List<String>> nodeTypes;
    private Map<String, List<String>> groupTypes;
    private Map<String, List<String>> policyTypes;

    public TypeVisitor(String namespace, Path path) {
```

### FieldMayBeFinal
Field `nodeTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
    private Map<String, List<String>> interfaceTypes;
    private Map<String, List<String>> relationshipTypes;
    private Map<String, List<String>> nodeTypes;
    private Map<String, List<String>> groupTypes;
    private Map<String, List<String>> policyTypes;
```

### FieldMayBeFinal
Field `groupTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
    private Map<String, List<String>> relationshipTypes;
    private Map<String, List<String>> nodeTypes;
    private Map<String, List<String>> groupTypes;
    private Map<String, List<String>> policyTypes;

```

### FieldMayBeFinal
Field `relationshipTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
    private Map<String, List<String>> capabilityTypes;
    private Map<String, List<String>> interfaceTypes;
    private Map<String, List<String>> relationshipTypes;
    private Map<String, List<String>> nodeTypes;
    private Map<String, List<String>> groupTypes;
```

### FieldMayBeFinal
Field `capabilityTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
    private Map<String, List<String>> artifactTypes;
    private Map<String, List<String>> dataTypes;
    private Map<String, List<String>> capabilityTypes;
    private Map<String, List<String>> interfaceTypes;
    private Map<String, List<String>> relationshipTypes;
```

### FieldMayBeFinal
Field `interfaceTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
    private Map<String, List<String>> dataTypes;
    private Map<String, List<String>> capabilityTypes;
    private Map<String, List<String>> interfaceTypes;
    private Map<String, List<String>> relationshipTypes;
    private Map<String, List<String>> nodeTypes;
```

### FieldMayBeFinal
Field `dataTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
public class TypeVisitor extends ImportVisitor {
    private Map<String, List<String>> artifactTypes;
    private Map<String, List<String>> dataTypes;
    private Map<String, List<String>> capabilityTypes;
    private Map<String, List<String>> interfaceTypes;
```

### FieldMayBeFinal
Field `artifactTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java

public class TypeVisitor extends ImportVisitor {
    private Map<String, List<String>> artifactTypes;
    private Map<String, List<String>> dataTypes;
    private Map<String, List<String>> capabilityTypes;
```

### FieldMayBeFinal
Field `typeVisitor` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeValidator.java`
#### Snippet
```java

public class TypeValidator extends ExceptionVisitor<Result, Parameter> {
    private TypeVisitor typeVisitor;

    public TypeValidator(Path path, String namespace) {
```

### FieldMayBeFinal
Field `patternAtlasUI` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/management/PatternAtlasResolver.java`
#### Snippet
```java

    private String patternAtlasApiURL;
    private String patternAtlasUI;

    public PatternAtlasResolver(String url, String ui) {
```

### FieldMayBeFinal
Field `patternAtlasApiURL` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/management/PatternAtlasResolver.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(PatternAtlasResolver.class);

    private String patternAtlasApiURL;
    private String patternAtlasUI;

```

### FieldMayBeFinal
Field `v2` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/RelationshipEdge.java`
#### Snippet
```java
public class RelationshipEdge<V> extends DefaultEdge {
    private V v1;
    private V v2;
    private String label;

```

### FieldMayBeFinal
Field `label` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/RelationshipEdge.java`
#### Snippet
```java
    private V v1;
    private V v2;
    private String label;

    public RelationshipEdge(V v1, V v2, String label) {
```

### FieldMayBeFinal
Field `v1` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/RelationshipEdge.java`
#### Snippet
```java

public class RelationshipEdge<V> extends DefaultEdge {
    private V v1;
    private V v2;
    private String label;
```

### FieldMayBeFinal
Field `min` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/PatternComponent.java`
#### Snippet
```java
    private String name;

    private int min;
    private int max;

```

### FieldMayBeFinal
Field `max` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/PatternComponent.java`
#### Snippet
```java

    private int min;
    private int max;

    public PatternComponent(String name, int min, int max) {
```

### FieldMayBeFinal
Field `patternName` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/PatternPosition.java`
#### Snippet
```java
public class PatternPosition {

    private String patternName;
    private SimpleDirectedGraph<TNodeTemplateExtended, RelationshipEdge> nodesOfOriginGraph;

```

### FieldMayBeFinal
Field `nodesOfOriginGraph` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/PatternPosition.java`
#### Snippet
```java

    private String patternName;
    private SimpleDirectedGraph<TNodeTemplateExtended, RelationshipEdge> nodesOfOriginGraph;

    public PatternPosition(String patternName, SimpleDirectedGraph<TNodeTemplateExtended, RelationshipEdge> nodesOfOriginGraph) {
```

### FieldMayBeFinal
Field `virtualHardware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String service;

```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
    private String connectsTo;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public ElasticityManagerPattern() {
```

### FieldMayBeFinal
Field `connectsTo` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
    private String service;

    private String connectsTo;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `service` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String service;

    private String connectsTo;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticityManagerPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldMayBeFinal
Field `application` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String hostedOn;
    private String deployedOn;
```

### FieldMayBeFinal
Field `deployedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private String application;
    private String hostedOn;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public ExecutionEnvironmentPattern2() {
```

### FieldMayBeFinal
Field `server` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java

    private String os;
    private String server;
    private String application;
    private String hostedOn;
```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private String server;
    private String application;
    private String hostedOn;
    private String deployedOn;

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern2.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String server;
    private String application;
```

### FieldMayBeFinal
Field `virtualHardware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String server;
```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String server;
    private String application;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldMayBeFinal
Field `connectsTo` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

```

### FieldMayBeFinal
Field `service` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String server;
    private String application;
    private String service;
    private String hostedOn;
    private String connectsTo;
```

### FieldMayBeFinal
Field `deployedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public ElasticLoadBalancerPattern() {
```

### FieldMayBeFinal
Field `server` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String server;
    private String application;
    private String service;
```

### FieldMayBeFinal
Field `application` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String service;
    private String hostedOn;
```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticLoadBalancerPattern.java`
#### Snippet
```java
    private String application;
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;
```

### FieldMayBeFinal
Field `dependantRepositories` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
    private final Map<IRepository, Set<String>> repositoryGlobal = new HashMap<>();
    private final Map<IRepository, Set<Namespace>> repositoryCommonNamespace = new HashMap<>();
    private File dependantRepositories;
    private List<RepositoryProperties> repositoriesList = new ArrayList<>();
    private final GitBasedRepository localRepository;
```

### FieldMayBeFinal
Field `storage` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java

    private String os;
    private String storage;

    private String hostedOn;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public RelationalDatabasePattern() {
```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String storage;

```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
    private String storage;

    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/RelationalDatabasePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldMayBeFinal
Field `allNodes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java

    private SimpleDirectedGraph<TNodeTemplateExtended, RelationshipEdge> abstractTopology;
    private List<TNodeTemplateExtended> allNodes;

    private Properties properties;
```

### FieldMayBeFinal
Field `labelStorage` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelApp;
    private String labelMessaging;
    private String labelStorage;

    private String relationDeployedOn;
```

### FieldMayBeFinal
Field `relationConnectsTo` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String relationHostedOn;
    private String relationDependsOn;
    private String relationConnectsTo;

    private SimpleDirectedGraph<TNodeTemplateExtended, RelationshipEdge> abstractTopology;
```

### FieldMayBeFinal
Field `labelMessaging` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelOS;
    private String labelApp;
    private String labelMessaging;
    private String labelStorage;

```

### FieldMayBeFinal
Field `labelService` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelVirtualHardware;
    private String labelServer;
    private String labelService;
    private String labelOS;
    private String labelApp;
```

### FieldMayBeFinal
Field `relationHostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java

    private String relationDeployedOn;
    private String relationHostedOn;
    private String relationDependsOn;
    private String relationConnectsTo;
```

### FieldMayBeFinal
Field `relationDependsOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String relationDeployedOn;
    private String relationHostedOn;
    private String relationDependsOn;
    private String relationConnectsTo;

```

### FieldMayBeFinal
Field `labelVirtualHardware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private String labelVirtualHardware;
    private String labelServer;
    private String labelService;
```

### FieldMayBeFinal
Field `relationDeployedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelStorage;

    private String relationDeployedOn;
    private String relationHostedOn;
    private String relationDependsOn;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private List<TNodeTemplateExtended> allNodes;

    private Properties properties;

    public AbstractTopology(TTopologyTemplate tTopologyTemplate, List<TNodeTemplateExtended> labeled) {
```

### FieldMayBeFinal
Field `labelApp` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelService;
    private String labelOS;
    private String labelApp;
    private String labelMessaging;
    private String labelStorage;
```

### FieldMayBeFinal
Field `labelOS` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String labelServer;
    private String labelService;
    private String labelOS;
    private String labelApp;
    private String labelMessaging;
```

### FieldMayBeFinal
Field `abstractTopology` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java
    private String relationConnectsTo;

    private SimpleDirectedGraph<TNodeTemplateExtended, RelationshipEdge> abstractTopology;
    private List<TNodeTemplateExtended> allNodes;

```

### FieldMayBeFinal
Field `labelServer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/AbstractTopology.java`
#### Snippet
```java

    private String labelVirtualHardware;
    private String labelServer;
    private String labelService;
    private String labelOS;
```

### FieldMayBeFinal
Field `application` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java

    private String os;
    private String application;
    private String messaging;

```

### FieldMayBeFinal
Field `connectsTo` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java

    private String hostedOn;
    private String connectsTo;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private String messaging;

    private String hostedOn;
    private String connectsTo;

```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String application;
    private String messaging;
```

### FieldMayBeFinal
Field `messaging` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private String os;
    private String application;
    private String messaging;

    private String hostedOn;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/MessageOrientedMiddlewarePattern.java`
#### Snippet
```java
    private String connectsTo;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public MessageOrientedMiddlewarePattern() {
```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String storage;

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
    private String storage;

    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `storage` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java

    private String os;
    private String storage;

    private String hostedOn;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/KeyValueStoragePattern.java`
#### Snippet
```java
    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public KeyValueStoragePattern() {
```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private String service;
    private String application;
    private String hostedOn;
    private String dependsOn;

```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private Properties properties;

    private String os;
    private String service;
    private String application;
```

### FieldMayBeFinal
Field `application` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private String os;
    private String service;
    private String application;
    private String hostedOn;
    private String dependsOn;
```

### FieldMayBeFinal
Field `service` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java

    private String os;
    private String service;
    private String application;
    private String hostedOn;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String os;
```

### FieldMayBeFinal
Field `dependsOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private String application;
    private String hostedOn;
    private String dependsOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ExecutionEnvironmentPattern.java`
#### Snippet
```java
    private String dependsOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public ExecutionEnvironmentPattern() {
```

### FieldMayBeFinal
Field `deployedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `service` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String application;
    private String messaging;
    private String service;
    private String hostedOn;
    private String connectsTo;
```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String messaging;
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;
```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String server;
    private String application;
```

### FieldMayBeFinal
Field `virtualHardware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String server;
```

### FieldMayBeFinal
Field `server` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String server;
    private String application;
    private String messaging;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public ElasticQueuePattern() {
```

### FieldMayBeFinal
Field `connectsTo` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String service;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

```

### FieldMayBeFinal
Field `messaging` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String server;
    private String application;
    private String messaging;
    private String service;
    private String hostedOn;
```

### FieldMayBeFinal
Field `application` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String messaging;
    private String service;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/ElasticQueuePattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldMayBeFinal
Field `virtualHardware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String hostedOn;
```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String hostedOn;

```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/EnvironmentBasedAvailabilityPattern.java`
#### Snippet
```java
    private String hostedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public EnvironmentBasedAvailabilityPattern() {
```

### FieldMayBeFinal
Field `server` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String virtualHardware;
    private String os;
    private String server;
    private String application;
    private String hostedOn;
```

### FieldMayBeFinal
Field `pattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;

    public NodeBasedAvailabilityPattern() {
```

### FieldMayBeFinal
Field `deployedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

    private SimpleDirectedGraph<PatternComponent, RelationshipEdge> pattern;
```

### FieldMayBeFinal
Field `connectsTo` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String application;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;

```

### FieldMayBeFinal
Field `hostedOn` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String server;
    private String application;
    private String hostedOn;
    private String connectsTo;
    private String deployedOn;
```

### FieldMayBeFinal
Field `application` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private String os;
    private String server;
    private String application;
    private String hostedOn;
    private String connectsTo;
```

### FieldMayBeFinal
Field `os` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java

    private String virtualHardware;
    private String os;
    private String server;
    private String application;
```

### FieldMayBeFinal
Field `virtualHardware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private Properties properties;

    private String virtualHardware;
    private String os;
    private String server;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterns/NodeBasedAvailabilityPattern.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String virtualHardware;
```

### FieldMayBeFinal
Field `relationalDatabase` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String elasticLoadBalancer;
    private String elasticQueue;
    private String relationalDatabase;
    private String execEnvironment;
    private String messagingMiddleware;
```

### FieldMayBeFinal
Field `elasticLoadBalancer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String nodeBasedAv;
    private String elasticityManager;
    private String elasticLoadBalancer;
    private String elasticQueue;
    private String relationalDatabase;
```

### FieldMayBeFinal
Field `paasTaxonomie` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java


    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> paasTaxonomie;

    public PaaSTaxonomy() {
```

### FieldMayBeFinal
Field `keyValueStorage` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String execEnvironment;
    private String messagingMiddleware;
    private String keyValueStorage;


```

### FieldMayBeFinal
Field `elasticityManager` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String envBasedAv;
    private String nodeBasedAv;
    private String elasticityManager;
    private String elasticLoadBalancer;
    private String elasticQueue;
```

### FieldMayBeFinal
Field `elasticityManager` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private String envBasedAv;
    private String nodeBasedAv;
    private String elasticityManager;
    private String elasticLoadBalancer;
    private String elasticQueue;
```

### FieldMayBeFinal
Field `elasticQueue` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private String elasticityManager;
    private String elasticLoadBalancer;
    private String elasticQueue;


```

### FieldMayBeFinal
Field `elasticPlatform` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java

    private String paas;
    private String elasticPlatform;

    private String publicCloud;
```

### FieldMayBeFinal
Field `envBasedAv` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private String elasticInfrastructure;
    private String publicCloud;
    private String envBasedAv;
    private String nodeBasedAv;
    private String elasticityManager;
```

### FieldMayBeFinal
Field `messagingMiddleware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String relationalDatabase;
    private String execEnvironment;
    private String messagingMiddleware;
    private String keyValueStorage;

```

### FieldMayBeFinal
Field `paas` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private Properties properties;

    private String paas;
    private String elasticPlatform;

```

### FieldMayBeFinal
Field `elasticInfrastructure` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java

    private String iaas;
    private String elasticInfrastructure;
    private String publicCloud;
    private String envBasedAv;
```

### FieldMayBeFinal
Field `envBasedAv` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java

    private String publicCloud;
    private String envBasedAv;
    private String nodeBasedAv;
    private String elasticityManager;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String iaas;
```

### FieldMayBeFinal
Field `nodeBasedAv` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String publicCloud;
    private String envBasedAv;
    private String nodeBasedAv;
    private String elasticityManager;
    private String elasticLoadBalancer;
```

### FieldMayBeFinal
Field `publicCloud` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private String iaas;
    private String elasticInfrastructure;
    private String publicCloud;
    private String envBasedAv;
    private String nodeBasedAv;
```

### FieldMayBeFinal
Field `publicCloud` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String elasticPlatform;

    private String publicCloud;
    private String envBasedAv;
    private String nodeBasedAv;
```

### FieldMayBeFinal
Field `execEnvironment` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String elasticQueue;
    private String relationalDatabase;
    private String execEnvironment;
    private String messagingMiddleware;
    private String keyValueStorage;
```

### FieldMayBeFinal
Field `iaas` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private Properties properties;

    private String iaas;
    private String elasticInfrastructure;
    private String publicCloud;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String paas;
```

### FieldMayBeFinal
Field `iaasTaxonomie` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java


    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> iaasTaxonomie;

    public IaaSTaxonomy() {
```

### FieldMayBeFinal
Field `elasticQueue` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/PaaSTaxonomy.java`
#### Snippet
```java
    private String elasticityManager;
    private String elasticLoadBalancer;
    private String elasticQueue;
    private String relationalDatabase;
    private String execEnvironment;
```

### FieldMayBeFinal
Field `nodeBasedAv` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private String publicCloud;
    private String envBasedAv;
    private String nodeBasedAv;
    private String elasticityManager;
    private String elasticLoadBalancer;
```

### FieldMayBeFinal
Field `elasticLoadBalancer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/model/patterntaxonomies/IaaSTaxonomy.java`
#### Snippet
```java
    private String nodeBasedAv;
    private String elasticityManager;
    private String elasticLoadBalancer;
    private String elasticQueue;

```

### FieldMayBeFinal
Field `assignOnly` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/Allocation.java`
#### Snippet
```java

    private IRepository repository = RepositoryFactory.getRepository();
    private boolean assignOnly;
    private List<Criteria> criteria = new ArrayList<>();

```

### FieldMayBeFinal
Field `criteria` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/Allocation.java`
#### Snippet
```java
    private IRepository repository = RepositoryFactory.getRepository();
    private boolean assignOnly;
    private List<Criteria> criteria = new ArrayList<>();

    public Allocation(AllocationRequest allocationRequest) throws AllocationException {
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/Allocation.java`
#### Snippet
```java
public class Allocation {

    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Allocation.class);

    private IRepository repository = RepositoryFactory.getRepository();
```

### FieldMayBeFinal
Field `repository` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/Allocation.java`
#### Snippet
```java
    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Allocation.class);

    private IRepository repository = RepositoryFactory.getRepository();
    private boolean assignOnly;
    private List<Criteria> criteria = new ArrayList<>();
```

### FieldMayBeFinal
Field `context` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java

    public static class Parameter<T> {
        private Set<String> context;
        private String value;
        private Class<?> clazz;
```

### FieldMayBeFinal
Field `exception` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java

    private final String namespace;
    private MultiException exception;
    private Map<String, String> prefix2Namespace;
    private FieldValidator validator;
```

### FieldMayBeFinal
Field `validator` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
    private MultiException exception;
    private Map<String, String> prefix2Namespace;
    private FieldValidator validator;

    public YamlBuilder(String namespace) {
```

### FieldMayBeFinal
Field `requirementTypes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/FragmentsCache.java`
#### Snippet
```java
    private static class CachingKey {
        private String targetLabel;
        private Set<QName> requirementTypes;

        private CachingKey(String targetLabel, Set<QName> requirementTypes) {
```

### FieldMayBeFinal
Field `presentTargetLabels` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/FragmentsCache.java`
#### Snippet
```java
public class FragmentsCache {

    private Set<String> presentTargetLabels;
    private Map<CachingKey, List<TTopologyTemplate>> cachedFragments = new HashMap<>();

```

### FieldMayBeFinal
Field `cachedFragments` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/FragmentsCache.java`
#### Snippet
```java

    private Set<String> presentTargetLabels;
    private Map<CachingKey, List<TTopologyTemplate>> cachedFragments = new HashMap<>();

    public FragmentsCache(Set<String> presentTargetLabels) {
```

### FieldMayBeFinal
Field `targetLabel` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/FragmentsCache.java`
#### Snippet
```java

    private static class CachingKey {
        private String targetLabel;
        private Set<QName> requirementTypes;

```

### FieldMayBeFinal
Field `splitting` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/util/TopologyWrapper.java`
#### Snippet
```java

    private TTopologyTemplate topologyTemplate;
    private Splitting splitting = new Splitting();

    public TopologyWrapper(TTopologyTemplate topologyTemplate) {
```

### FieldMayBeFinal
Field `patternProbabilityLow` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private List<String> patternProbabilityHigh = new ArrayList<>();
    private List<String> patternProbabilityMedium = new ArrayList<>();
    private List<String> patternProbabilityLow = new ArrayList<>();

    // this list contains all NodeTemplates, which are identified via keywords
```

### FieldMayBeFinal
Field `keywordApache` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordJava;
    private String keywordPython;
    private String keywordApache;
    private String keywordTomcat;
    private String keywordMosquitto;
```

### FieldMayBeFinal
Field `keywordMySQL` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordMosquitto;
    private String keywordMongoDB;
    private String keywordMySQL;

    private String patternEnvBasedAvail;
```

### FieldMayBeFinal
Field `keywordTomcat` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordPython;
    private String keywordApache;
    private String keywordTomcat;
    private String keywordMosquitto;
    private String keywordMongoDB;
```

### FieldMayBeFinal
Field `labeledNodeTemplates` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    // this list contains all NodeTemplates, which are identified via keywords
    private List<TNodeTemplateExtended> labeledNodeTemplates = new ArrayList<>();

    private PaaSTaxonomy paas = new PaaSTaxonomy();
```

### FieldMayBeFinal
Field `patternElasticityManager` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternElasticLoadBalancer;
    private String patternExecEnv;
    private String patternElasticityManager;
    private String patternElasticQueue;
    private String patternMessageMiddleware;
```

### FieldMayBeFinal
Field `keywordMosquitto` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordApache;
    private String keywordTomcat;
    private String keywordMosquitto;
    private String keywordMongoDB;
    private String keywordMySQL;
```

### FieldMayBeFinal
Field `labelMessaging` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String labelOS;
    private String labelVirtualHardware;
    private String labelMessaging;
    private String labelStorage;

```

### FieldMayBeFinal
Field `serviceTemplateId` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private TNodeTemplate basisNodeTemplate;

    private ServiceTemplateId serviceTemplateId;

    // this list holds the information about the patterns and their correspondent nodes in a topology graph
```

### FieldMayBeFinal
Field `labelServer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private Properties properties;

    private String labelServer;
    private String labelService;
    private String labelOS;
```

### FieldMayBeFinal
Field `detectedPattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    // list with pattern names, which are detected
    private List<String> detectedPattern = new ArrayList<>();
    private List<String> impossiblePattern = new ArrayList<>();

```

### FieldMayBeFinal
Field `labelStorage` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String labelVirtualHardware;
    private String labelMessaging;
    private String labelStorage;

    private String keywordBeanstalk;
```

### FieldMayBeFinal
Field `labelService` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    private String labelServer;
    private String labelService;
    private String labelOS;
    private String labelVirtualHardware;
```

### FieldMayBeFinal
Field `keywordEC2` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordBeanstalk;
    private String keywordOpenstack;
    private String keywordEC2;
    private String keywordJava;
    private String keywordPython;
```

### FieldMayBeFinal
Field `impossiblePattern` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    // list with pattern names, which are detected
    private List<String> detectedPattern = new ArrayList<>();
    private List<String> impossiblePattern = new ArrayList<>();

    // this list contains all keywords detected any name of a node template
```

### FieldMayBeFinal
Field `patternPublicCloud` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternPaaS;
    private String patternIaaS;
    private String patternPublicCloud;
    private String patternKeyValueStorage;

```

### FieldMayBeFinal
Field `paas` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private List<TNodeTemplateExtended> labeledNodeTemplates = new ArrayList<>();

    private PaaSTaxonomy paas = new PaaSTaxonomy();
    private IaaSTaxonomy iaas = new IaaSTaxonomy();
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> paasGraph;
```

### FieldMayBeFinal
Field `keywordMongoDB` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordTomcat;
    private String keywordMosquitto;
    private String keywordMongoDB;
    private String keywordMySQL;

```

### FieldMayBeFinal
Field `keywordPython` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordEC2;
    private String keywordJava;
    private String keywordPython;
    private String keywordApache;
    private String keywordTomcat;
```

### FieldMayBeFinal
Field `iaas` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    private PaaSTaxonomy paas = new PaaSTaxonomy();
    private IaaSTaxonomy iaas = new IaaSTaxonomy();
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> paasGraph;
    private SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> iaasGraph;
```

### FieldMayBeFinal
Field `patternNodeBasedAvail` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternElasticQueue;
    private String patternMessageMiddleware;
    private String patternNodeBasedAvail;
    private String patternRelationalDatabase;
    private String patternElasticInfrastructure;
```

### FieldMayBeFinal
Field `labelVirtualHardware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String labelService;
    private String labelOS;
    private String labelVirtualHardware;
    private String labelMessaging;
    private String labelStorage;
```

### FieldMayBeFinal
Field `patternProbabilityMedium` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    // lists with pattern probablilities
    private List<String> patternProbabilityHigh = new ArrayList<>();
    private List<String> patternProbabilityMedium = new ArrayList<>();
    private List<String> patternProbabilityLow = new ArrayList<>();

```

### FieldMayBeFinal
Field `keywordOpenstack` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    private String keywordBeanstalk;
    private String keywordOpenstack;
    private String keywordEC2;
    private String keywordJava;
```

### FieldMayBeFinal
Field `properties` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private static final String propertiesFilename = "patterndetection.properties";

    private Properties properties;

    private String labelServer;
```

### FieldMayBeFinal
Field `patternElasticQueue` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternExecEnv;
    private String patternElasticityManager;
    private String patternElasticQueue;
    private String patternMessageMiddleware;
    private String patternNodeBasedAvail;
```

### FieldMayBeFinal
Field `patternElasticInfrastructure` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternNodeBasedAvail;
    private String patternRelationalDatabase;
    private String patternElasticInfrastructure;
    private String patternElasticPlatform;
    private String patternPaaS;
```

### FieldMayBeFinal
Field `patternExecEnv` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternEnvBasedAvail;
    private String patternElasticLoadBalancer;
    private String patternExecEnv;
    private String patternElasticityManager;
    private String patternElasticQueue;
```

### FieldMayBeFinal
Field `labelOS` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String labelServer;
    private String labelService;
    private String labelOS;
    private String labelVirtualHardware;
    private String labelMessaging;
```

### FieldMayBeFinal
Field `patternPaaS` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternElasticInfrastructure;
    private String patternElasticPlatform;
    private String patternPaaS;
    private String patternIaaS;
    private String patternPublicCloud;
```

### FieldMayBeFinal
Field `patternMessageMiddleware` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternElasticityManager;
    private String patternElasticQueue;
    private String patternMessageMiddleware;
    private String patternNodeBasedAvail;
    private String patternRelationalDatabase;
```

### FieldMayBeFinal
Field `patternEnvBasedAvail` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordMySQL;

    private String patternEnvBasedAvail;
    private String patternElasticLoadBalancer;
    private String patternExecEnv;
```

### FieldMayBeFinal
Field `patternKeyValueStorage` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternIaaS;
    private String patternPublicCloud;
    private String patternKeyValueStorage;

    // intially both boolean values are set to false, isIaas is set to true if any virtual hardware is detected, isPaaS is set to true if anything on top of the virtual hardware level (such as: server, application, etc.) is detected
```

### FieldMayBeFinal
Field `patternElasticLoadBalancer` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    private String patternEnvBasedAvail;
    private String patternElasticLoadBalancer;
    private String patternExecEnv;
    private String patternElasticityManager;
```

### FieldMayBeFinal
Field `keywordBeanstalk` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String labelStorage;

    private String keywordBeanstalk;
    private String keywordOpenstack;
    private String keywordEC2;
```

### FieldMayBeFinal
Field `patternElasticPlatform` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternRelationalDatabase;
    private String patternElasticInfrastructure;
    private String patternElasticPlatform;
    private String patternPaaS;
    private String patternIaaS;
```

### FieldMayBeFinal
Field `patternIaaS` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternElasticPlatform;
    private String patternPaaS;
    private String patternIaaS;
    private String patternPublicCloud;
    private String patternKeyValueStorage;
```

### FieldMayBeFinal
Field `patternPositions` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    // this list holds the information about the patterns and their correspondent nodes in a topology graph
    private List<PatternPosition> patternPositions;

    public Detection(ServiceTemplateId serviceTemplateId) {
```

### FieldMayBeFinal
Field `keywordJava` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String keywordOpenstack;
    private String keywordEC2;
    private String keywordJava;
    private String keywordPython;
    private String keywordApache;
```

### FieldMayBeFinal
Field `matchedKeywords` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    // this list contains all keywords detected any name of a node template
    private List<String> matchedKeywords = new ArrayList<>();

    // lists with pattern probablilities
```

### FieldMayBeFinal
Field `patternRelationalDatabase` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java
    private String patternMessageMiddleware;
    private String patternNodeBasedAvail;
    private String patternRelationalDatabase;
    private String patternElasticInfrastructure;
    private String patternElasticPlatform;
```

### FieldMayBeFinal
Field `patternProbabilityHigh` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/patterndetection/Detection.java`
#### Snippet
```java

    // lists with pattern probablilities
    private List<String> patternProbabilityHigh = new ArrayList<>();
    private List<String> patternProbabilityMedium = new ArrayList<>();
    private List<String> patternProbabilityLow = new ArrayList<>();
```

### FieldMayBeFinal
Field `propertyKey` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyWrapper.java`
#### Snippet
```java

    private TPolicyTemplate policy;
    private String propertyKey;
    private Object property;
    private String operator;
```

### FieldMayBeFinal
Field `topLevelNTsToSplit` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/SplitByIds.java`
#### Snippet
```java

    private TopologyWrapper topology;
    private List<TNodeTemplate> topLevelNTsToSplit;

    private Splitting splitting;
```

### FieldMayBeFinal
Field `topology` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/SplitByIds.java`
#### Snippet
```java
public class SplitByIds {

    private TopologyWrapper topology;
    private List<TNodeTemplate> topLevelNTsToSplit;

```

### FieldMayBeFinal
Field `originalTargetLabels` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/SplitByIds.java`
#### Snippet
```java

    private Splitting splitting;
    private Map<String, String> originalTargetLabels = new HashMap<>();

    public SplitByIds(TopologyWrapper topology, List<TNodeTemplate> topLevelNTsToSplit) {
```

### FieldMayBeFinal
Field `transitiveClosures` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PoliciesFilter.java`
#### Snippet
```java
    private Map<TNodeTemplate, List<PolicyWrapper>> policiesForNTs;

    private Map<TopologyWrapper, Map<TNodeTemplate, Set<TNodeTemplate>>> transitiveClosures = new HashMap<>();
    private Map<TopologyWrapper, Map<String, TNodeTemplate>> topLevelNTsByIds = new HashMap<>();
    private Map<TNodeTemplate, TopologyWrapper> topologiesByFragments = new HashMap<>();
```

### FieldMayBeFinal
Field `topologies` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PoliciesFilter.java`
#### Snippet
```java
public class PoliciesFilter {

    private List<TopologyWrapper> topologies;
    private Map<TNodeTemplate, List<PolicyWrapper>> policiesForNTs;

```

### FieldMayBeFinal
Field `topLevelNTsByIds` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PoliciesFilter.java`
#### Snippet
```java

    private Map<TopologyWrapper, Map<TNodeTemplate, Set<TNodeTemplate>>> transitiveClosures = new HashMap<>();
    private Map<TopologyWrapper, Map<String, TNodeTemplate>> topLevelNTsByIds = new HashMap<>();
    private Map<TNodeTemplate, TopologyWrapper> topologiesByFragments = new HashMap<>();

```

### FieldMayBeFinal
Field `topologiesByFragments` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PoliciesFilter.java`
#### Snippet
```java
    private Map<TopologyWrapper, Map<TNodeTemplate, Set<TNodeTemplate>>> transitiveClosures = new HashMap<>();
    private Map<TopologyWrapper, Map<String, TNodeTemplate>> topLevelNTsByIds = new HashMap<>();
    private Map<TNodeTemplate, TopologyWrapper> topologiesByFragments = new HashMap<>();

    public PoliciesFilter(List<TopologyWrapper> topologies, Map<TNodeTemplate, List<PolicyWrapper>> policiesForNTs) {
```

### FieldMayBeFinal
Field `policiesForNTs` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PoliciesFilter.java`
#### Snippet
```java

    private List<TopologyWrapper> topologies;
    private Map<TNodeTemplate, List<PolicyWrapper>> policiesForNTs;

    private Map<TopologyWrapper, Map<TNodeTemplate, Set<TNodeTemplate>>> transitiveClosures = new HashMap<>();
```

### FieldMayBeFinal
Field `repetitions` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/KargerMinCutVariation.java`
#### Snippet
```java
    private ConnectsToGraph current;

    private int repetitions;
    private Random random = new Random();

```

### FieldMayBeFinal
Field `original` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/KargerMinCutVariation.java`
#### Snippet
```java
    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(KargerMinCutVariation.class);

    private ConnectsToGraph original;
    private ConnectsToGraph current;

```

### FieldMayBeFinal
Field `random` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/KargerMinCutVariation.java`
#### Snippet
```java

    private int repetitions;
    private Random random = new Random();

    public KargerMinCutVariation(ConnectsToGraph graph) {
```

### FieldMayBeFinal
Field `LOGGER` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/KargerMinCutVariation.java`
#### Snippet
```java
public class KargerMinCutVariation {

    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(KargerMinCutVariation.class);

    private ConnectsToGraph original;
```

### FieldMayBeFinal
Field `fragment` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java

    private static class FragmentWithPolicies {
        private TTopologyTemplate fragment;
        private List<PolicyWrapper> policies;

```

### FieldMayBeFinal
Field `policies` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java
    private static class FragmentWithPolicies {
        private TTopologyTemplate fragment;
        private List<PolicyWrapper> policies;

        private FragmentWithPolicies(TTopologyTemplate fragment, List<PolicyWrapper> policies) {
```

### FieldMayBeFinal
Field `fragments` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java

    private List<PolicyWrapper> policies;
    private List<TTopologyTemplate> fragments;
    private List<FragmentWithPolicies> fragmentsWithPolicies = new ArrayList<>();

```

### FieldMayBeFinal
Field `fragmentsWithPolicies` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java
    private List<PolicyWrapper> policies;
    private List<TTopologyTemplate> fragments;
    private List<FragmentWithPolicies> fragmentsWithPolicies = new ArrayList<>();

    public PolicyComparison(List<PolicyWrapper> policies, List<TTopologyTemplate> fragments) {
```

### FieldMayBeFinal
Field `policies` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/fulfillpolicies/PolicyComparison.java`
#### Snippet
```java
public class PolicyComparison {

    private List<PolicyWrapper> policies;
    private List<TTopologyTemplate> fragments;
    private List<FragmentWithPolicies> fragmentsWithPolicies = new ArrayList<>();
```

### FieldMayBeFinal
Field `nodes` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/ConnectsToGraph.java`
#### Snippet
```java
public class ConnectsToGraph {

    private List<Node> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();
    private List<Edge> edgesForContraction = new ArrayList<>();
```

### FieldMayBeFinal
Field `nodeTemplateIds` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/ConnectsToGraph.java`
#### Snippet
```java

    public static class Node {
        private Set<String> nodeTemplateIds;
        private String targetLabel;

```

### FieldMayBeFinal
Field `edges` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/ConnectsToGraph.java`
#### Snippet
```java

    private List<Node> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();
    private List<Edge> edgesForContraction = new ArrayList<>();

```

### FieldMayBeFinal
Field `edgesForContraction` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minexternalconnections/ConnectsToGraph.java`
#### Snippet
```java
    private List<Node> nodes = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();
    private List<Edge> edgesForContraction = new ArrayList<>();

    public ConnectsToGraph(TopologyWrapper topology) {
```

### FieldMayBeFinal
Field `original` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
    }

    private TopologyWrapper original;
    private Set<String> presentTargetLabels = new HashSet<>();
    private Map<TNodeTemplate, Set<String>> possibleTargetLabels = new HashMap<>();
```

### FieldMayBeFinal
Field `possibleTargetLabels` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
    private TopologyWrapper original;
    private Set<String> presentTargetLabels = new HashSet<>();
    private Map<TNodeTemplate, Set<String>> possibleTargetLabels = new HashMap<>();
    private List<TNodeTemplate> doneTopLevelHosts = new ArrayList<>();
    private List<List<TNodeTemplate>> assignedAsGroup = new ArrayList<>();
```

### FieldMayBeFinal
Field `presentTargetLabels` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java

    private TopologyWrapper original;
    private Set<String> presentTargetLabels = new HashSet<>();
    private Map<TNodeTemplate, Set<String>> possibleTargetLabels = new HashMap<>();
    private List<TNodeTemplate> doneTopLevelHosts = new ArrayList<>();
```

### FieldMayBeFinal
Field `assignedAsGroup` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
    private Map<TNodeTemplate, Set<String>> possibleTargetLabels = new HashMap<>();
    private List<TNodeTemplate> doneTopLevelHosts = new ArrayList<>();
    private List<List<TNodeTemplate>> assignedAsGroup = new ArrayList<>();
    private int outputCap;

```

### FieldMayBeFinal
Field `outputCap` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
    private List<TNodeTemplate> doneTopLevelHosts = new ArrayList<>();
    private List<List<TNodeTemplate>> assignedAsGroup = new ArrayList<>();
    private int outputCap;

    TargetLabelAssignment(TopologyWrapper topology, int outputCap) {
```

### FieldMayBeFinal
Field `doneTopLevelHosts` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/targetallocation/criteria/minhosts/TargetLabelAssignment.java`
#### Snippet
```java
    private Set<String> presentTargetLabels = new HashSet<>();
    private Map<TNodeTemplate, Set<String>> possibleTargetLabels = new HashMap<>();
    private List<TNodeTemplate> doneTopLevelHosts = new ArrayList<>();
    private List<List<TNodeTemplate>> assignedAsGroup = new ArrayList<>();
    private int outputCap;
```

### FieldMayBeFinal
Field `tree` may be 'final'
in `org.eclipse.winery.accountability/src/main/java/org/eclipse/winery/accountability/model/authorization/AuthorizationTree.java`
#### Snippet
```java
    private static final String SERVICE_OWNER_IDENTITY = "Service Owner";
    private static final Logger log = LoggerFactory.getLogger(AuthorizationTree.class);
    private Tree<AuthorizationNode> tree;

    public AuthorizationTree(List<AuthorizationElement> allAuthorizationElements) {
```

### FieldMayBeFinal
Field `blockchain` may be 'final'
in `org.eclipse.winery.accountability/src/main/java/org/eclipse/winery/accountability/AccountabilityManagerImpl.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountabilityManagerImpl.class);
    private static final String NO_AUTHORIZATION_DATA = "No authorization data stored in the blockchain";
    private BlockchainAccess blockchain;
    private ImmutableStorageProvider storageProvider;

```

### FieldMayBeFinal
Field `storageProvider` may be 'final'
in `org.eclipse.winery.accountability/src/main/java/org/eclipse/winery/accountability/AccountabilityManagerImpl.java`
#### Snippet
```java
    private static final String NO_AUTHORIZATION_DATA = "No authorization data stored in the blockchain";
    private BlockchainAccess blockchain;
    private ImmutableStorageProvider storageProvider;

    AccountabilityManagerImpl(BlockchainAccess blockchainAccess, ImmutableStorageProvider storageProvider) {
```

### FieldMayBeFinal
Field `full` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/ComponentId.java`
#### Snippet
```java
    private String namespace;
    private QName qName;
    private TDefinitions full;
    private WineryVersion version;

```

### FieldMayBeFinal
Field `id` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/ComponentId.java`
#### Snippet
```java
public class ComponentId {

    private String id;
    private String name;
    private String namespace;
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/ComponentId.java`
#### Snippet
```java

    private String id;
    private String name;
    private String namespace;
    private QName qName;
```

### FieldMayBeFinal
Field `namespace` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/ComponentId.java`
#### Snippet
```java
    private String id;
    private String name;
    private String namespace;
    private QName qName;
    private TDefinitions full;
```

### FieldMayBeFinal
Field `version` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/ComponentId.java`
#### Snippet
```java
    private QName qName;
    private TDefinitions full;
    private WineryVersion version;

    public ComponentId(String id, String name, String namespace, QName qName, TDefinitions full, WineryVersion version) {
```

### FieldMayBeFinal
Field `qName` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/ComponentId.java`
#### Snippet
```java
    private String name;
    private String namespace;
    private QName qName;
    private TDefinitions full;
    private WineryVersion version;
```

### FieldMayBeFinal
Field `initDirectSuccessors` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java

    // Required variables for the following computation of the transitive closure of a given topology
    private Map<TNodeTemplate, Set<TNodeTemplate>> initDirectSuccessors = new HashMap<>();
    private Map<TNodeTemplate, Boolean> visitedNodeTemplates = new HashMap<>();
    private Map<TNodeTemplate, Set<TNodeTemplate>> transitiveAndDirectSuccessors = new HashMap<>();
```

### FieldMayBeFinal
Field `visitedNodeTemplates` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
    // Required variables for the following computation of the transitive closure of a given topology
    private Map<TNodeTemplate, Set<TNodeTemplate>> initDirectSuccessors = new HashMap<>();
    private Map<TNodeTemplate, Boolean> visitedNodeTemplates = new HashMap<>();
    private Map<TNodeTemplate, Set<TNodeTemplate>> transitiveAndDirectSuccessors = new HashMap<>();

```

### FieldMayBeFinal
Field `transitiveAndDirectSuccessors` may be 'final'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/splitting/Splitting.java`
#### Snippet
```java
    private Map<TNodeTemplate, Set<TNodeTemplate>> initDirectSuccessors = new HashMap<>();
    private Map<TNodeTemplate, Boolean> visitedNodeTemplates = new HashMap<>();
    private Map<TNodeTemplate, Set<TNodeTemplate>> transitiveAndDirectSuccessors = new HashMap<>();

    /**
```

### FieldMayBeFinal
Field `type` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/imports/genericimports/GenericImportsResource.java`
#### Snippet
```java
public class GenericImportsResource extends AbstractComponentsWithoutTypeReferenceResource<GenericImportResource> {

    private String type;

    /**
```

### FieldMayBeFinal
Field `repository` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/threats/ThreatsResource.java`
#### Snippet
```java

    // reuse repository
    private IRepository repository = RepositoryFactory.getRepository();

    /**
```

### FieldMayBeFinal
Field `managedResource` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/_support/InheritanceResource.java`
#### Snippet
```java
public class InheritanceResource {

    private AbstractComponentInstanceResourceWithNameDerivedFromAbstractFinal managedResource;

    public InheritanceResource(AbstractComponentInstanceResourceWithNameDerivedFromAbstractFinal res) {
```

### FieldMayBeFinal
Field `a` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/ImplementationArtifactResource.java`
#### Snippet
```java
public class ImplementationArtifactResource extends GenericArtifactResource<TImplementationArtifact> {

    private TImplementationArtifact a;


```

### FieldMayBeFinal
Field `implementationArtifacts` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/artifacts/ImplementationArtifactsResource.java`
#### Snippet
```java
    private final static Logger logger = LoggerFactory.getLogger(ImplementationArtifactsResource.class);

    private List<TImplementationArtifact> implementationArtifacts;

    public ImplementationArtifactsResource(List<TImplementationArtifact> implementationArtifact, INodeTypeImplementationResourceOrRelationshipTypeImplementationResource res) {
```

### FieldMayBeFinal
Field `typeResource` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/InstanceStatesResource.java`
#### Snippet
```java
public class InstanceStatesResource {

    private TopologyGraphElementEntityTypeResource typeResource;
    private List<TInstanceState> instanceStates;

```

### FieldMayBeFinal
Field `instanceStates` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/InstanceStatesResource.java`
#### Snippet
```java

    private TopologyGraphElementEntityTypeResource typeResource;
    private List<TInstanceState> instanceStates;

    /**
```

### FieldMayBeFinal
Field `interfaces` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/interfaces/InterfacesResource.java`
#### Snippet
```java

    private TopologyGraphElementEntityTypeResource res;
    private List<TInterface> interfaces;
    private String interfaceType;

```

### FieldMayBeFinal
Field `interfaceType` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/interfaces/InterfacesResource.java`
#### Snippet
```java
    private TopologyGraphElementEntityTypeResource res;
    private List<TInterface> interfaces;
    private String interfaceType;

    public InterfacesResource(TopologyGraphElementEntityTypeResource res, List<TInterface> interfaces, String interfaceType) {
```

### FieldMayBeFinal
Field `res` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/interfaces/InterfacesResource.java`
#### Snippet
```java
public class InterfacesResource {

    private TopologyGraphElementEntityTypeResource res;
    private List<TInterface> interfaces;
    private String interfaceType;
```

### FieldMayBeFinal
Field `constraints` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/nodetypes/reqandcapdefs/AbstractReqOrCapDefResource.java`
#### Snippet
```java
    protected Object reqOrCapDef;

    private List<TConstraint> constraints;

    /**
```

### FieldMayBeFinal
Field `policyTypeResource` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/policytypes/LanguageResource.java`
#### Snippet
```java
public class LanguageResource {

    private PolicyTypeResource policyTypeResource;


```

### FieldMayBeFinal
Field `policyTypeId` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/policytypes/TemplatesOfOnePolicyTypeResource.java`
#### Snippet
```java
public class TemplatesOfOnePolicyTypeResource extends TemplatesOfOneType {

    private PolicyTypeId policyTypeId;

    /**
```

### FieldMayBeFinal
Field `artifactTypeId` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/artifacttypes/TemplatesOfOneArtifactTypeResource.java`
#### Snippet
```java
public class TemplatesOfOneArtifactTypeResource extends TemplatesOfOneType {

    private ArtifactTypeId artifactTypeId;

    /**
```

### FieldMayBeFinal
Field `requirementTypeResource` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytypes/requirementtypes/RequiredCapabilityTypeResource.java`
#### Snippet
```java
public class RequiredCapabilityTypeResource {

    private RequirementTypeResource requirementTypeResource;

    public RequiredCapabilityTypeResource(RequirementTypeResource requirementTypeResource) {
```

### FieldMayBeFinal
Field `template` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/PropertiesResource.java`
#### Snippet
```java

    private AbstractComponentInstanceResource res;
    private TEntityTemplate template;
    private IRepository requestRepository;

```

### FieldMayBeFinal
Field `requestRepository` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/PropertiesResource.java`
#### Snippet
```java
    private AbstractComponentInstanceResource res;
    private TEntityTemplate template;
    private IRepository requestRepository;

    /**
```

### FieldMayBeFinal
Field `res` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/entitytemplates/PropertiesResource.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesResource.class);

    private AbstractComponentInstanceResource res;
    private TEntityTemplate template;
    private IRepository requestRepository;
```

### FieldMayBeFinal
Field `embeddedPlansTableData` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/PlansResourceData.java`
#### Snippet
```java

    // data: [ [id, pre, name, type, lang]* ]
    private String embeddedPlansTableData;

    // data: [ [id, pre, name, type, lang, reference]* ]
```

### FieldMayBeFinal
Field `linkedPlansTableData` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/PlansResourceData.java`
#### Snippet
```java

    // data: [ [id, pre, name, type, lang, reference]* ]
    private String linkedPlansTableData;


```

### FieldMayBeFinal
Field `plan` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/PlanFileResource.java`
#### Snippet
```java

    private final PlanId planId;
    private TPlan plan;
    private ServiceTemplateResource res;

```

### FieldMayBeFinal
Field `res` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/plans/PlanFileResource.java`
#### Snippet
```java
    private final PlanId planId;
    private TPlan plan;
    private ServiceTemplateResource res;

    public PlanFileResource(ServiceTemplateResource res, PlanId planId, TPlan plan) {
```

### FieldMayBeFinal
Field `selfServiceMetaId` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/selfserviceportal/OptionsResource.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(OptionsResource.class);

    private SelfServiceMetaDataId selfServiceMetaId;

    /**
```

### FieldMayBeFinal
Field `ssmdId` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/selfserviceportal/OptionResource.java`
#### Snippet
```java
    private static final Logger LOGGER = LoggerFactory.getLogger(OptionResource.class);

    private SelfServiceMetaDataId ssmdId;


```

### FieldMayBeFinal
Field `socketList` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java
    class GitLogRunnable implements Runnable {
        private Map<String, Map<DiffEntry, String>> repoList;
        private List<GitWebSocket> socketList;
        private String jsonString = "[]";

```

### FieldMayBeFinal
Field `repoList` may be 'final'
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java

    class GitLogRunnable implements Runnable {
        private Map<String, Map<DiffEntry, String>> repoList;
        private List<GitWebSocket> socketList;
        private String jsonString = "[]";
```

### FieldMayBeFinal
Field `httpClient` may be 'final'
in `org.eclipse.winery.highlevelrestapi/src/main/java/org/eclipse/winery/highlevelrestapi/LowLevelRestApi.java`
#### Snippet
```java

    // Local HttpClient used for every communication (Singleton implementation)
    private static HttpClient httpClient = new HttpClient();

    /**
```

### FieldMayBeFinal
Field `logsAnalyzers` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/instance/plugins/dockerimage/DockerLogsRefinementPlugin.java`
#### Snippet
```java
public class DockerLogsRefinementPlugin extends InstanceModelRefinementPlugin {

    private List<DockerLogsAnalyzer> logsAnalyzers;

    public DockerLogsRefinementPlugin(Map<QName, TNodeType> nodeTypes) {
```

### FieldMayBeFinal
Field `element` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/Subtypes.java`
#### Snippet
```java
public class Subtypes<T extends HasInheritance> {

    private T element;
    private List<Subtypes<T>> children;

```

### FieldMayBeFinal
Field `requiredNamespace` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/NamespaceSubstitutionStrategy.java`
#### Snippet
```java
public class NamespaceSubstitutionStrategy<R extends HasType, T extends HasInheritance> extends SubstitutionStrategy<R, T> {

    private String requiredNamespace;

    public NamespaceSubstitutionStrategy(String requiredNamespace) {
```

### FieldMayBeFinal
Field `newCapabilityCounter` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
    private static int newRelationshipIdCounter = 100;
    private static int IdCounter = 1;
    private static int newCapabilityCounter = 1;
    private static int newRequirementCounter = 1;

```

### FieldMayBeFinal
Field `newRelationshipIdCounter` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java
public class PubSubProxyAlgorithm extends AbstractProxyAlgorithm {

    private static int newRelationshipIdCounter = 100;
    private static int IdCounter = 1;
    private static int newCapabilityCounter = 1;
```

### FieldMayBeFinal
Field `IdCounter` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/problemsolving/algorithms/PubSubProxyAlgorithm.java`
#### Snippet
```java

    private static int newRelationshipIdCounter = 100;
    private static int IdCounter = 1;
    private static int newCapabilityCounter = 1;
    private static int newRequirementCounter = 1;
```

### FieldMayBeFinal
Field `inputParams` may be 'final'
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/Task.java`
#### Snippet
```java
public abstract class Task extends Node {

    private Map<String, Parameter> inputParams = new HashMap<String, Parameter>();

    private Map<String, Parameter> outputParams = new HashMap<String, Parameter>();
```

### FieldMayBeFinal
Field `outputParams` may be 'final'
in `org.eclipse.winery.model.bpmn4tosca/src/main/java/org/eclipse/winery/bpmn2bpel/model/Task.java`
#### Snippet
```java
    private Map<String, Parameter> inputParams = new HashMap<String, Parameter>();

    private Map<String, Parameter> outputParams = new HashMap<String, Parameter>();

    public void addInputParameter(Parameter param) {
```

### FieldMayBeFinal
Field `mitigations` may be 'final'
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/Threat.java`
#### Snippet
```java
public class Threat {
    private String templateName;
    private List<QName> mitigations = new ArrayList<>();
    private String namespace;
    private LinkedHashMap<String, String> properties = new LinkedHashMap<>();
```

### FieldMayBeFinal
Field `targets` may be 'final'
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/Threat.java`
#### Snippet
```java
    private String namespace;
    private LinkedHashMap<String, String> properties = new LinkedHashMap<>();
    private List<ThreatTarget> targets = new ArrayList<>();

    public String getNamespace() {
```

### FieldMayBeFinal
Field `serviceTemplateId` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
    private static int IdCounter = 1;

    private ServiceTemplateId serviceTemplateId;
    private TTopologyTemplate topologyTemplate;
    private SubstitutionChooser substitutionChooser;
```

### FieldMayBeFinal
Field `substitutionServiceTemplateId` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
    private SubstitutionChooser substitutionChooser;

    private ServiceTemplateId substitutionServiceTemplateId;

    public PlaceholderSubstitution(ServiceTemplateId serviceTemplateId, SubstitutionChooser substitutionChooser) {
```

### FieldMayBeFinal
Field `substitutionChooser` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java
    private ServiceTemplateId serviceTemplateId;
    private TTopologyTemplate topologyTemplate;
    private SubstitutionChooser substitutionChooser;

    private ServiceTemplateId substitutionServiceTemplateId;
```

### FieldMayBeFinal
Field `topologyTemplate` may be 'final'
in `org.eclipse.winery.model.adaptation/src/main/java/org/eclipse/winery/model/adaptation/substitution/refinement/placeholder/PlaceholderSubstitution.java`
#### Snippet
```java

    private ServiceTemplateId serviceTemplateId;
    private TTopologyTemplate topologyTemplate;
    private SubstitutionChooser substitutionChooser;

```

### FieldMayBeFinal
Field `fileBlocks` may be 'final'
in `org.eclipse.winery.model.csar.toscametafile/src/main/java/org/eclipse/winery/model/csar/toscametafile/TOSCAMetaFile.java`
#### Snippet
```java

    private Map<String, String> block0 = new HashMap<>();
    private List<Map<String, String>> fileBlocks = new ArrayList<>();

    /**
```

### FieldMayBeFinal
Field `serviceTemplate` may be 'final'
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
    private final ThreatModelingUtils utils;
    private List<TNodeTemplate> nodeTemplates;
    private TServiceTemplate serviceTemplate;
    private Map<QName, Threat> abstractThreatMitigations = new HashMap<>();

```

### FieldMayBeFinal
Field `abstractThreatMitigations` may be 'final'
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
    private List<TNodeTemplate> nodeTemplates;
    private TServiceTemplate serviceTemplate;
    private Map<QName, Threat> abstractThreatMitigations = new HashMap<>();

    public ThreatModeling(final ServiceTemplateId serviceTemplateId) {
```

### FieldMayBeFinal
Field `nodeTemplates` may be 'final'
in `org.eclipse.winery.model.threatmodeling/src/main/java/org/eclipse/winery/model/threatmodeling/ThreatModeling.java`
#### Snippet
```java
    private final IRepository repository;
    private final ThreatModelingUtils utils;
    private List<TNodeTemplate> nodeTemplates;
    private TServiceTemplate serviceTemplate;
    private Map<QName, Threat> abstractThreatMitigations = new HashMap<>();
```

### FieldMayBeFinal
Field `path` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/commons/Dockerfile.java`
#### Snippet
```java
public class Dockerfile {

    private String path;
    private String content;
    private String repoName;
```

### FieldMayBeFinal
Field `content` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/commons/Dockerfile.java`
#### Snippet
```java

    private String path;
    private String content;
    private String repoName;

```

### FieldMayBeFinal
Field `repoName` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/commons/Dockerfile.java`
#### Snippet
```java
    private String path;
    private String content;
    private String repoName;

    public Dockerfile(String path, String content, String repoName) {
```

### FieldMayBeFinal
Field `versionOperator` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/commons/Component.java`
#### Snippet
```java
    private String name;
    private String version;
    private String versionOperator;

    public Component(String name, String version, String versionOperator) {
```

### FieldMayBeFinal
Field `version` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/commons/Component.java`
#### Snippet
```java
public class Component {
    private String name;
    private String version;
    private String versionOperator;

```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/commons/Component.java`
#### Snippet
```java

public class Component {
    private String name;
    private String version;
    private String versionOperator;
```

### FieldMayBeFinal
Field `folder` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/crawler/LocalCrawler.java`
#### Snippet
```java
public class LocalCrawler implements ICrawlerImplementation {

    private File folder;

    public LocalCrawler(String path) {
```

### FieldMayBeFinal
Field `url` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/crawler/Repository.java`
#### Snippet
```java

    private String name;
    private URL url;

    public Repository(String name, URL url) {
```

### FieldMayBeFinal
Field `name` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/crawler/Repository.java`
#### Snippet
```java
public class Repository {

    private String name;
    private URL url;

```

### FieldMayBeFinal
Field `filesplitter` may be 'final'
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/Fileanalyzer.java`
#### Snippet
```java
public class Fileanalyzer {

    private Filesplitter filesplitter;

    public Fileanalyzer() {
```

### FieldMayBeFinal
Field `mangagementFlow` may be 'final'
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/planwriter/BpelPlanArtefactWriter.java`
#### Snippet
```java
	private static final Logger LOGGER = LoggerFactory.getLogger(BpelPlanArtefactWriter.class);

	private ManagementFlow mangagementFlow;

	public BpelPlanArtefactWriter(ManagementFlow mangagementFlow) {
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u1000` can be replaced with 'က'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     * </ul>
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00c0` can be replaced with 'À'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00d6` can be replaced with 'Ö'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00d8` can be replaced with 'Ø'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00f6` can be replaced with 'ö'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00f8` can be replaced with 'ø'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u02ff` can be replaced with '˿'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0370` can be replaced with 'Ͱ'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u037d` can be replaced with 'ͽ'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u037f` can be replaced with 'Ϳ'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2070` can be replaced with '⁰'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2c00` can be replaced with 'Ⰰ'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u3001` can be replaced with '、'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\uf900` can be replaced with '豈'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\ufdf0` can be replaced with 'ﷰ'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
     */
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u00B7` can be replaced with '·'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
    private static final Pattern NCNameChar_RegExp_Pattern = Pattern.compile(Util.NCNameChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0300` can be replaced with '̀'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
    private static final Pattern NCNameChar_RegExp_Pattern = Pattern.compile(Util.NCNameChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u036F` can be replaced with 'ͯ'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
    private static final Pattern NCNameChar_RegExp_Pattern = Pattern.compile(Util.NCNameChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u203F` can be replaced with '‿'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
    private static final Pattern NCNameChar_RegExp_Pattern = Pattern.compile(Util.NCNameChar_RegExp);
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u2040` can be replaced with '⁀'
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/common/Util.java`
#### Snippet
```java
    // NameCharRange \u10000-\ueffff is not supported by Java
    private static final String NCNameStartChar_RegExp = "[A-Z_a-z\u00c0-\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f-\u1fff\u200c-\u200d\u2070-\u218f\u2c00-\u2fef\u3001-\ud7ff\uf900-\ufdcf\ufdf0-\ufffd]";
    private static final String NCNameChar_RegExp = Util.NCNameStartChar_RegExp + "|[-\\.0-9\u00B7\u0300-\u036F\u203F-\u2040]";
    private static final Pattern NCNameStartChar_Pattern = Pattern.compile(Util.NCNameStartChar_RegExp);
    private static final Pattern NCNameChar_RegExp_Pattern = Pattern.compile(Util.NCNameChar_RegExp);
```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on local variable `client`
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java
            List<GitWebSocket> closedSessions = new ArrayList<>();
            for (GitWebSocket client : this.socketList) {
                synchronized (client) {
                    if (client.session != null && client.session.isOpen()) {
                        writeInSession(client.session, jsonString);
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `tNodeType` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/CookbookConfigurationToscaConverter.java`
#### Snippet
```java
        configurationNodeType.addCapabilityDefinitions(convertPlatformToCapability(platform, namespace));

        TNodeType tNodeType = new TNodeType(configurationNodeType);
        return tNodeType;
    }
```

### UnnecessaryLocalVariable
Local variable `args` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CallArgsVisitor.java`
#### Snippet
```java
    public List visitCallargsArgs(ChefDSLParser.CallargsArgsContext ctx) {
        ArgsVisitor argsVisitor = new ArgsVisitor(extractedCookbookConfigs);
        List args = ctx.args().accept(argsVisitor);
        return args;
    }
```

### UnnecessaryLocalVariable
Local variable `whenargs` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/WhenArgsVisitor.java`
#### Snippet
```java
    public List visitWhen_args(ChefDSLParser.When_argsContext ctx) {
        ArgsVisitor argsVisitor = new ArgsVisitor(extractedCookbookConfigs);
        List whenargs = ctx.args().accept(argsVisitor);
        return whenargs;
    }
```

### UnnecessaryLocalVariable
Local variable `newParseResult` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
            }

            CookbookParseResult newParseResult = ChefCookbookAnalyzer.getParseResultFromFile(extractedCookbookConfigs, recipePath);
            extractedCookbookConfigs = newParseResult;
            extractedCookbookConfigs.setInDependentRecipe(isDependentRecipe);
```

### UnnecessaryLocalVariable
Local variable `platformConfig` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java
    public List getSuites() {
        if (this.kitchenYml != null) {
            List<Map> platformConfig = (List) kitchenYml.get("suites");
            return platformConfig;
        } else return null;
```

### UnnecessaryLocalVariable
Local variable `platformConfig` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/kitchenparser/ChefKitchenYmlParser.java`
#### Snippet
```java

        if (this.kitchenYml != null) {
            List<Map> platformConfig = (List) kitchenYml.get("platforms");
            return platformConfig;
        } else return null;
```

### UnnecessaryLocalVariable
Local variable `exists` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawledCookbooks.java`
#### Snippet
```java
    public static boolean fileExists(String filepath) {
        File tmpDir = new File(filepath);
        boolean exists = tmpDir.exists();
        return exists;
    }
```

### UnnecessaryLocalVariable
Local variable `directories` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/CrawledCookbooks.java`
#### Snippet
```java
    public static String[] getDirectories(String directory) {
        File file = new File(directory);
        String[] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
```

### UnnecessaryLocalVariable
Local variable `json` is redundant
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbookcrawler/ChefSupermarketCrawler.java`
#### Snippet
```java
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")))) {
                String jsonText = readAll(reader);
                JSONObject json = new JSONObject(jsonText);
                return json;
            }
```

### UnnecessaryLocalVariable
Local variable `violatingMappings` is redundant
in `org.eclipse.winery.compliance/src/main/java/org/eclipse/winery/compliance/checking/ComplianceRuleChecker.java`
#### Snippet
```java

		if (identifierMatches.size() > requiredStructureMatches.size()) {
			List<GraphMapping> violatingMappings = extractViolatingMappings(identifierGraph, identifierMatches, requiredStructureMatches);
			return violatingMappings;
		} else {
```

### UnnecessaryLocalVariable
Local variable `snakeCaseFieldName` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/FieldValidator.java`
#### Snippet
```java
                    final String camelCaseFieldName = field.getName();
                    Matcher matches = UPPERCASE_LETTERS.matcher(camelCaseFieldName);
                    final String snakeCaseFieldName = matches.replaceAll("_$0").toLowerCase();
                    return snakeCaseFieldName;
                }).collect(Collectors.toList()));
```

### UnnecessaryLocalVariable
Local variable `p` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/writer/YamlWriter.java`
#### Snippet
```java
        printer.print(map.entrySet().stream()
            .map((entry) -> {
                    YamlPrinter p = new YamlPrinter(parameter.getIndent() + INDENT_SIZE)
                        .print(
                            printVisitorNode(entry.getValue(),
```

### UnnecessaryLocalVariable
Local variable `output` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/reader/YamlBuilder.java`
#### Snippet
```java
        }
        //if (Objects.isNull(parameter.getFilter())) parameter.setFilter(this::nonNull);
        Map<String, T> output = buildStream(object, parameter)
            .map(entry -> {
                return Tuples.pair(entry.getKey(), parameter.getBuilderOO().apply(
```

### UnnecessaryLocalVariable
Local variable `namespace` is redundant
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/importing/CsarImporter.java`
#### Snippet
```java
            for (String s : localNamespaceManager.getAllNamespaces().keySet()) {
                boolean addToStorage = false;
                String namespace = s;
                if (namespaceManager.hasPermanentProperties(namespace)) {
                    String storedPrefix = namespaceManager.getPrefix(namespace);
```

### UnnecessaryLocalVariable
Local variable `res` is redundant
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/BoundaryDefinitionsJSPData.java`
#### Snippet
```java

    public String getBoundaryDefinitionsAsXMLString() {
        String res = BackendUtils.getXMLAsString(this.defs, repository);
        return res;
    }
```

### UnnecessaryLocalVariable
Local variable `newEntry` is redundant
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                    ServiceTemplateId id = new ServiceTemplateId(entry.getInjection());
                    TServiceTemplate serviceTemplate = RepositoryFactory.getRepository().getElement(id);
                    Map.Entry<String, TTopologyTemplate> newEntry = new AbstractMap.SimpleEntry(entry.getNodeID(), serviceTemplate.getTopologyTemplate());
                    return newEntry;
                }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
```

### UnnecessaryLocalVariable
Local variable `newEntry` is redundant
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/ServiceTemplateResource.java`
#### Snippet
```java
                    ServiceTemplateId id = new ServiceTemplateId(entry.getInjection());
                    TServiceTemplate serviceTemplate = RepositoryFactory.getRepository().getElement(id);
                    Map.Entry<String, TTopologyTemplate> newEntry = new AbstractMap.SimpleEntry(entry.getNodeID(), serviceTemplate.getTopologyTemplate());
                    return newEntry;
                }).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
```

### UnnecessaryLocalVariable
Local variable `name` is redundant
in `org.eclipse.winery.tools.deployablecomponents/src/main/java/org/eclipse/winery/tools/deployablecomponents/fileanalyzer/CommandAnalyzer/ChmodAnalyzer.java`
#### Snippet
```java
        for (String softwarePackage : packages) {
            String version = "undefined";
            String name = softwarePackage;
            components.add(new Component(name, version, "undefined"));
        }
```

### UnnecessaryLocalVariable
Local variable `managementFlow` is redundant
in `org.eclipse.winery.bpmn4tosca.converter.tobpel/src/main/java/org/eclipse/winery/bpmn2bpel/parser/SortParser.java`
#### Snippet
```java
	public ManagementFlow buildManagementFlow() {
		List<Node> nodeList = buildNodeList(getStartEvent().getId());
		ManagementFlow managementFlow = convert2ManagementFlow(nodeList);

		return managementFlow;
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefcookbook/ChefAttribute.java`
#### Snippet
```java
    public ChefAttribute(String name, String value) {
        this.name = name;
        this.values = new ArrayList<>(Arrays.asList(value));
    }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
            nodeTypes.get(namespace).add(name);
        } else {
            nodeTypes.put(namespace, new ArrayList<>(Arrays.asList(name)));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
            groupTypes.get(namespace).add(name);
        } else {
            groupTypes.put(namespace, new ArrayList<>(Arrays.asList(name)));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
            artifactTypes.get(namespace).add(name);
        } else {
            artifactTypes.put(namespace, new ArrayList<>(Arrays.asList(name)));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
            relationshipTypes.get(namespace).add(name);
        } else {
            relationshipTypes.put(namespace, new ArrayList<>(Arrays.asList(name)));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
            policyTypes.get(namespace).add(name);
        } else {
            policyTypes.put(namespace, new ArrayList<>(Arrays.asList(name)));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
            interfaceTypes.get(namespace).add(name);
        } else {
            interfaceTypes.put(namespace, new ArrayList<>(Arrays.asList(name)));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
            capabilityTypes.get(namespace).add(name);
        } else {
            capabilityTypes.put(namespace, new ArrayList<>(Arrays.asList(name)));
        }
    }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
                    map.get(namespace).add(shorthandName);
                } else {
                    map.put(namespace, new ArrayList<>(Arrays.asList(shorthandName)));
                }
            } else if (typeUri != null && !typeUri.equals(name)) {
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/converter/validator/TypeVisitor.java`
#### Snippet
```java
                    map.get(namespace).add(typeUri);
                } else {
                    map.put(namespace, new ArrayList<>(Arrays.asList(typeUri)));
                }
            }
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/imports/ImportsResource.java`
#### Snippet
```java
    public List<?> getAllImportTypes() {
        // TODO use backend to determine a complete list
        return Arrays.asList("http://www.w3.org/2001/XMLSchema");
    }
}
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/refinementmodels/TestRefinementModelResource.java`
#### Snippet
```java
        super(id);
        this.mappingTypes = new
            ArrayList<>(Arrays.asList("RelationshipMapping"));
    }

```

## RuleId[id=PointlessBooleanExpression]
### PointlessBooleanExpression
`cookbookConfigs.isInRecursiveTransformation() == false` can be simplified to '!cookbookConfigs.isInRecursiveTransformation()'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
     */
    private CookbookParseResult returnComponentTypesFromRecipes(CookbookParseResult cookbookConfigs) {
        if (cookbookConfigs.isInRecursiveTransformation() == false ) {
            String defaultRecipePath = cookbookConfigs.getCookbookPath() + ChefDslConstants.RECIPES_PATH + ChefDslConstants.DEFAULT_RB_PATH;
            LOGGER.info("Parsing Recipes: default.rb ...");
```

### PointlessBooleanExpression
`cookbookParseResult.isInRecursiveTransformation() == false` can be simplified to '!cookbookParseResult.isInRecursiveTransformation()'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java

        // Compile kitchen.yml
        if (cookbookParseResult.isInRecursiveTransformation() == false ) {
            cookbookParseResult = addPlatformVersionInformationFromKitchen(cookbookParseResult);
        }
```

### PointlessBooleanExpression
`cookbookConfigs.isInRecursiveTransformation() == false` can be simplified to '!cookbookConfigs.isInRecursiveTransformation()'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/ChefCookbookAnalyzer.java`
#### Snippet
```java
        
        //  Compile Attributes from cookbook which is analyzed
        if (cookbookConfigs.isInRecursiveTransformation() == false) {
            attributePath = cookbookConfigs.getCookbookPath() + ChefDslConstants.ATTRIBUTES_PATH;
            defaultAttributesPath = attributePath + ChefDslConstants.DEFAULT_RB_PATH;
```

### PointlessBooleanExpression
`condition == true` can be simplified to 'condition'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/AssignAttributeVisitor.java`
#### Snippet
```java
        if (lhs != null) {
            chefAttribute = new ChefAttribute(lhs.getName());
            if (condition == true) {
                chefAttribute.addAttribute((ArrayList<String>) ifValue);
            } else if (condition == false) {
```

### PointlessBooleanExpression
`condition == false` can be simplified to '!condition'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/AssignAttributeVisitor.java`
#### Snippet
```java
            if (condition == true) {
                chefAttribute.addAttribute((ArrayList<String>) ifValue);
            } else if (condition == false) {
                chefAttribute.addAttribute((ArrayList<String>) elseValue);
            }
```

### PointlessBooleanExpression
`parseResult.isInRecursiveTransformation() == true` can be simplified to 'parseResult.isInRecursiveTransformation()'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/MetadataJsonVisitor.java`
#### Snippet
```java
     */
    private CookbookParseResult processSupportedPlatforms(CookbookParseResult parseResult, JSONObject platforms) {
        if (parseResult.isInRecursiveTransformation() == true) {
            return parseResult;
        }
```

### PointlessBooleanExpression
`isDependentRecipe == false` can be simplified to '!isDependentRecipe'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java
                recipePath = extractedCookbookConfigs.getCookbookPath() + "/recipes/" + resolvedArgument[1];
            } else if (extractedCookbookConfigs.getAllConfigsAsList().get(0).getDepends().containsKey(resolvedArgument[0])) {
                if (isDependentRecipe == false) {
                    extractedCookbookConfigs.getAllConfigsAsList().get(0).addDependentRecipes(resolvedArgument[0], resolvedArgument[1]);
                }
```

### PointlessBooleanExpression
`extractedCookbookConfigs.isInRecursiveTransformation() == false` can be simplified to '!extractedCookbookConfigs.isInRecursiveTransformation()'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/CommandVisitor.java`
#### Snippet
```java

            case ChefDslConstants.COOKBOOK_SUPPORTS:
                if (extractedCookbookConfigs.isInRecursiveTransformation() == false) {
                    processSupportsCommand(ctx);
                }
```

### PointlessBooleanExpression
`expr == true` can be simplified to 'expr'
in `org.eclipse.winery.crawler/src/main/java/org/eclipse/winery/crawler/chefcookbooks/chefdslparser/PrimaryStatementVisitor.java`
#### Snippet
```java
                    elseActive = true;
                } else if (child instanceof ChefDSLParser.Inner_comptstmtContext) {
                    if (expr == true || elseActive) {
                        CompstmtVisitor compstmtVisitor = new CompstmtVisitor(filteredParseResult);
                        filteredParseResult = child.accept(compstmtVisitor);
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/datatypes/select2/Select2DataWithOptGroups.java`
#### Snippet
```java
        SortedSet<Select2OptGroup> res = new TreeSet<>();
        for (Select2OptGroup optGroup : this.idx.values()) {
            res.add(optGroup);
        }

```

### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/resources/servicetemplates/boundarydefinitions/policies/PoliciesResource.java`
#### Snippet
```java
        this.list.clear();
        for (TPolicy policy : newList) {
            this.list.add(policy);
        }
        return RestUtils.persist(this.res);
```

## RuleId[id=UnstableApiUsage]
### UnstableApiUsage
'post(java.lang.Object)' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
            LOGGER.trace("Could not create Diff!", gitException);
        }
        this.eventBus.post(diffMap);
        return diffMap;
    }
```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java

    /**
     * This method unregisters an Object on the repositories {@link EventBus}
     *
     * @param eventListener an objects that contains methods annotated with the
```

### UnstableApiUsage
'register(java.lang.Object)' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
     */
    public void unregisterForEvents(Object eventListener) {
        this.eventBus.register(eventListener);
    }

```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java

    /**
     * This method registers an Object on the repositories {@link EventBus}
     *
     * @param eventListener an objects that contains methods annotated with the
```

### UnstableApiUsage
'register(java.lang.Object)' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
     */
    public void registerForEvents(Object eventListener) {
        this.eventBus.register(eventListener);
    }

```

### UnstableApiUsage
'EventBus()' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
            }

            this.eventBus = new EventBus();

            // explicitly enable long paths to ensure proper handling of long paths
```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
            }

            this.eventBus = new EventBus();

            // explicitly enable long paths to ensure proper handling of long paths
```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/backend/filebased/GitBasedRepository.java`
#### Snippet
```java
    private final Path workingRepositoryRoot;

    private final EventBus eventBus;
    private final GitBasedRepositoryConfiguration configuration;

```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java

    /**
     * This method registers an Object on the repositories {@link EventBus}
     *
     * @param eventListener an objects that contains methods annotated with the
```

### UnstableApiUsage
'register(java.lang.Object)' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
     */
    public void registerForEvents(Object eventListener) {
        this.eventBus.register(eventListener);
    }

```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java

    /**
     * This method unregisters an Object on the repositories {@link EventBus}
     *
     * @param eventListener an objects that contains methods annotated with the
```

### UnstableApiUsage
'register(java.lang.Object)' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
     */
    public void unregisterForEvents(Object eventListener) {
        this.eventBus.register(eventListener);
    }

```

### UnstableApiUsage
'EventBus()' is declared in unstable class 'com.google.common.eventbus.EventBus' marked with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
    public MultiRepository(Path repositoryRoot) throws IOException, GitAPIException {
        this.repositoryRoot = repositoryRoot;
        this.eventBus = new EventBus();
        try {
            LOGGER.debug("Trying to initialize local repository...");
```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
    public MultiRepository(Path repositoryRoot) throws IOException, GitAPIException {
        this.repositoryRoot = repositoryRoot;
        this.eventBus = new EventBus();
        try {
            LOGGER.debug("Trying to initialize local repository...");
```

### UnstableApiUsage
'com.google.common.eventbus.EventBus' is marked unstable with @Beta
in `org.eclipse.winery.repository/src/main/java/org/eclipse/winery/repository/filebased/MultiRepository.java`
#### Snippet
```java
    private final GitBasedRepository localRepository;
    private final Path repositoryRoot;
    private final EventBus eventBus;

    /**
```

### UnstableApiUsage
'com.google.common.eventbus.Subscribe' is marked unstable with @Beta
in `org.eclipse.winery.repository.rest/src/main/java/org/eclipse/winery/repository/rest/websockets/GitWebSocket.java`
#### Snippet
```java
    }

    @Subscribe
    public void setGitDifferences(Map<String, Map<DiffEntry, String>> event) {
        (new Thread(new GitLogRunnable(event, new ArrayList(connections)))).start();
```

