# gumtree-spoon-ast-diff 
 
# Bad smells
I found 51 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=BoundedWildcard] | 9 | false |
| RuleId[ruleID=ReturnNull] | 5 | false |
| RuleId[ruleID=UnnecessarySemicolon] | 3 | false |
| RuleId[ruleID=SystemOutErr] | 3 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 3 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 3 | true |
| RuleId[ruleID=UnnecessaryModifier] | 2 | true |
| RuleId[ruleID=ObsoleteCollection] | 2 | false |
| RuleId[ruleID=SizeReplaceableByIsEmpty] | 2 | true |
| RuleId[ruleID=EqualsAndHashcode] | 2 | false |
| RuleId[ruleID=UnusedAssignment] | 2 | false |
| RuleId[ruleID=DataFlowIssue] | 1 | false |
| RuleId[ruleID=StringOperationCanBeSimplified] | 1 | false |
| RuleId[ruleID=CommentedOutCode] | 1 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 1 | false |
| RuleId[ruleID=KeySetIterationMayUseEntrySet] | 1 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 1 | true |
| RuleId[ruleID=EqualsBetweenInconvertibleTypes] | 1 | false |
| RuleId[ruleID=RedundantSuppression] | 1 | false |
| RuleId[ruleID=UnnecessaryBoxing] | 1 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 1 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 1 | true |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 1 | false |
| RuleId[ruleID=Convert2Lambda] | 1 | false |
| RuleId[ruleID=AssignmentToMethodParameter] | 1 | false |
| RuleId[ruleID=HtmlWrongAttributeValue] | 1 | false |
## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/gumtree/spoon/builder/jsonsupport/NodePainter.java`
#### Snippet
```java
public interface NodePainter {

	public void paint(Tree tree, JsonObject jsontree);
}

```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/gumtree/spoon/diff/Diff.java`
#### Snippet
```java
	 * returns the mappings between the compared elements
	 */
	public MappingStore getMappingsComp();
}

```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
Method invocation `getRoleInParent` may produce `NullPointerException`
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
			nodeTypeName = element.getRoleInParent().toString();
		}
		if (element.getRoleInParent() == CtRole.SUPER_TYPE) {
			nodeTypeName = "SUPER_TYPE";
		}
```

## RuleId[ruleID=UnnecessarySemicolon]
### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/gumtree/spoon/diff/operations/OperationKind.java`
#### Snippet
```java

public enum OperationKind {
	Insert, Update, Move, Delete;
}

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java

	public enum JSON_PROPERTIES {
		label, type, op, children;
	};

```

### RuleId[ruleID=UnnecessarySemicolon]
Unnecessary semicolon `;`
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java
	public enum JSON_PROPERTIES {
		label, type, op, children;
	};

	@SuppressWarnings("rawtypes")
```

## RuleId[ruleID=StringOperationCanBeSimplified]
### RuleId[ruleID=StringOperationCanBeSimplified]
Call to `toString()` is redundant
in `src/main/java/gumtree/spoon/builder/CtVirtualElement.java`
#### Snippet
```java
	@Override
	public String toString() {
		return "VE: " + ((value != null) ? (value.toString()) : null);
	}

```

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (2 lines)
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java
		// 1000 OK
		// see AbstractBottomUpMatcher#SIZE_THRESHOD in Gumtree
		// System.setProperty("gumtree.match.bu.size","10");
		// System.setProperty("gt.bum.szt", "1000");
	}
```

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'getNode' is still used
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
	/** use {@link #getSrcNode()} or {@link #getDstNode()} instead. */
	@Deprecated
	public CtElement getNode() {
		return node;
	}
```

## RuleId[ruleID=ObsoleteCollection]
### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack` used
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	public static final String NOTYPE = "<notype>";
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

```

### RuleId[ruleID=ObsoleteCollection]
Obsolete collection type `Stack<>` used
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	public static final String NOTYPE = "<notype>";
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

```

## RuleId[ruleID=KeySetIterationMayUseEntrySet]
### RuleId[ruleID=KeySetIterationMayUseEntrySet]
Iteration over `configuration.keySet()` may be replaced with 'entrySet()' iteration
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java
	public AstComparator(Map<String, String> configuration) {
		super();
		for (String k : configuration.keySet()) {
			System.setProperty(k, configuration.get(k));
		}
```

## RuleId[ruleID=SizeReplaceableByIsEmpty]
### RuleId[ruleID=SizeReplaceableByIsEmpty]
`factory.Type().getAll().size() == 0` can be replaced with 'factory.Type().getAll().isEmpty()'
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java
		compiler.build();

		if (factory.Type().getAll().size() == 0) {
			return null;
		}
```

### RuleId[ruleID=SizeReplaceableByIsEmpty]
`rootOperations.size() == 0` can be replaced with 'rootOperations.isEmpty()'
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	@Override
	public String toString() {
		if (rootOperations.size() == 0) {
			return "no AST change";
		}
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
		if (element == null) {
			// some elements are only in the gumtree for having a clean diff but not in the Spoon metamodel
			return stringBuilder.toString() + " fake_node(" + action.getNode().getMetadata("type") + ")";
		}

```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/builder/jsonsupport/OperationNodePainter.java`
#### Snippet
```java
	private Map<Tree, Operation> nodesAffectedByOps = new HashMap<>();

	public OperationNodePainter(List<Operation> operations) {
		// Collect all nodes and get the operator
		for (Operation operation : operations) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NodePainter`
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java

	@SuppressWarnings("unused")
	public JsonObject getJSONwithCustorLabels(TreeContext context, Tree tree, Collection<NodePainter> nodePainters) {

		JsonObject o = new JsonObject();
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Action`
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private Map<Tree, Action> originalActionsDst = new HashMap<>();

	public ActionClassifier(MappingStore mappings, List<Action> actions) {
		clean();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	 * @return
	 */
	public static List<Operation> replaceMove(MappingStore mapping, List<Operation> ops, boolean all) {
		List<Operation> newOps = new ArrayList<>();

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	@Override
	public boolean containsOperations(List<Operation> operations, OperationKind kind, String nodeKind,
			String nodeLabel) {
		return operations.stream()
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	@Override
	public boolean containsOperations(List<Operation> operations, OperationKind kind, String nodeKind) {
		return operations.stream() //
				.anyMatch(operation -> operation.getAction().getClass().getSimpleName().equals(kind.name()) //
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Action`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	}

	private List<Operation> convertToSpoon(List<Action> actions, MappingStore mappings) {
		List<Operation> collect = actions.stream().map(action -> {

```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	}

	private String toDebugString(List<Operation> ops) {
		String result = "";
		for (Operation operation : ops) {
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	@Override
	public List<Operation> getOperationChildren(Operation operationParent, List<Operation> rootOperations) {
		return rootOperations.stream() //
				.filter(operation -> operation.getNode().getParent().equals(operationParent)) //
```

## RuleId[ruleID=EqualsBetweenInconvertibleTypes]
### RuleId[ruleID=EqualsBetweenInconvertibleTypes]
No class found which is a subtype of both 'CtElement' and 'Operation'
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	public List<Operation> getOperationChildren(Operation operationParent, List<Operation> rootOperations) {
		return rootOperations.stream() //
				.filter(operation -> operation.getNode().getParent().equals(operationParent)) //
				.collect(Collectors.toList());
	}
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java

	@SuppressWarnings("rawtypes")
	public JsonObject getJSONasJsonObject(CtElement element) {
		SpoonGumTreeBuilder builder = new SpoonGumTreeBuilder();
		Tree generatedTree = builder.getTree(element);
```

## RuleId[ruleID=UnnecessaryBoxing]
### RuleId[ruleID=UnnecessaryBoxing]
Redundant boxing, `Boolean.parseBoolean()` call can be used instead
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
		String nolabel = System.getProperty("nolabel");
		if (nolabel != null) {
			return Boolean.valueOf(nolabel);
		}
		return false;
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: DiffSpoon <file_1>  <file_2>");
			return;
		}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java

		final Diff result = new AstComparator().compare(new File(args[0]), new File(args[1]));
		System.out.println(result.toString());
	}
}
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	@Override
	public void debugInformation() {
		System.err.println(toDebugString());
	}

```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import com.github.gumtreediff.actions.model.Action;`
in `src/main/java/gumtree/spoon/diff/operations/UpdateOperation.java`
#### Snippet
```java
package gumtree.spoon.diff.operations;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.actions.model.Update;
import gumtree.spoon.builder.SpoonGumTreeBuilder;
```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `Operation()` of an abstract class should not be declared 'public'
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
	private final T action;

	public Operation(T action) {
		this.action = action;
		this.node = (CtElement) action.getNode().getMetadata(SpoonGumTreeBuilder.SPOON_OBJECT);
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
Contents of collection `srcMvTrees` are updated, but never queried
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private List<Tree> srcUpdTrees = new ArrayList<>();
	private List<Tree> dstUpdTrees = new ArrayList<>();
	private List<Tree> srcMvTrees = new ArrayList<>();
	private List<Tree> dstMvTrees = new ArrayList<>();
	private List<Tree> srcDelTrees = new ArrayList<>();
```

## RuleId[ruleID=Convert2Lambda]
### RuleId[ruleID=Convert2Lambda]
Anonymous new Comparator() can be replaced with lambda
in `src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java
		// ensuring an order (instead of hashset)
		// otherwise some flaky tests in CI
		Set<ModifierKind> modifiers1 = new TreeSet<>(new Comparator<ModifierKind>() {
			@Override
			public int compare(ModifierKind o1, ModifierKind o2) {
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

	TreeScanner(TreeContext treeContext, Tree root) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java
	 * By default, comments are ignored
	 */
	private boolean includeComments = false;

	public AstComparator() {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	private TreeContext context;

	private GumtreeProperties properties = null;

	private Matcher matcher = new CompositeMatchers.ClassicGumtree();
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `first`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
				el = el.getParent();
			}
			first = first.getParent();
		}
		return null;
```

## RuleId[ruleID=EqualsAndHashcode]
### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/gumtree/spoon/builder/CtWrapper.java`
#### Snippet
```java
 * 
 */
public class CtWrapper<L> extends CtElementImpl {

	/**
```

### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/gumtree/spoon/builder/CtVirtualElement.java`
#### Snippet
```java
 * 
 */
public class CtVirtualElement extends CtWrapper<String> {

	protected Collection<?> children;
```

## RuleId[ruleID=HtmlWrongAttributeValue]
### RuleId[ruleID=HtmlWrongAttributeValue]
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2022-11-21-09-48-09.131.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/gumtree/spoon/diff/support/SpoonSupport.java`
#### Snippet
```java
		}

		return null;
	}
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/gumtree/spoon/builder/CtWrapper.java`
#### Snippet
```java
	@Override
	public String toString() {
		return (value != null) ? value.toString() : null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java

		if (factory.Type().getAll().size() == 0) {
			return null;
		}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
	/** returns the new version of the node (only for update) */
	public CtElement getDstNode() {
		return null;
	}

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
			first = first.getParent();
		}
		return null;
	}

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `collect` is redundant
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	private List<Operation> convertToSpoon(List<Action> actions, MappingStore mappings) {
		List<Operation> collect = actions.stream().map(action -> {

			action.getNode().setMetadata("type", action.getNode().getType().name);
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `updateOperation` is redundant
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
			} else if (action instanceof Update) {
				setSpoonDestinationInTree(mappings, original);
				UpdateOperation updateOperation = new UpdateOperation((Update) action);
				return updateOperation;
			} else if (action instanceof Move) {
```

### RuleId[ruleID=UnnecessaryLocalVariable]
Local variable `moveOperation` is redundant
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
			} else if (action instanceof Move) {
				setSpoonDestinationInTree(mappings, original);
				MoveOperation moveOperation = new MoveOperation((Move) action);
				return moveOperation;
			} else if (action instanceof TreeInsert) {
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `nolabel` initializer `false` is redundant
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

	TreeScanner(TreeContext treeContext, Tree root) {
```

### RuleId[ruleID=UnusedAssignment]
Variable `label` initializer `null` is redundant
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
		}

		String label = null;
		String nodeTypeName = getNodeType(element);

```

