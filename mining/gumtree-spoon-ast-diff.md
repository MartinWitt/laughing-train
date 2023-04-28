# gumtree-spoon-ast-diff 
 
# Bad smells
I found 53 bad smells with 9 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 10 | false |
| ReturnNull | 5 | false |
| DataFlowIssue | 4 | false |
| SystemOutErr | 3 | false |
| UnnecessarySemicolon | 3 | false |
| RedundantFieldInitialization | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| UnnecessaryModifier | 2 | true |
| ObsoleteCollection | 2 | false |
| EqualsAndHashcode | 2 | false |
| SizeReplaceableByIsEmpty | 2 | true |
| UnusedAssignment | 2 | false |
| UNUSED_IMPORT | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| NonProtectedConstructorInAbstractClass | 1 | true |
| CommentedOutCode | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| KeySetIterationMayUseEntrySet | 1 | false |
| AssignmentToMethodParameter | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| EqualsBetweenInconvertibleTypes | 1 | false |
| RedundantSuppression | 1 | false |
| UnnecessaryBoxing | 1 | false |
## RuleId[id=SystemOutErr]
### SystemOutErr
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

### SystemOutErr
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java

		final Diff result = new AstComparator().compare(new File(args[0]), new File(args[1]));
		System.out.println(result.toString());
	}
}
```

### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	@Override
	public void debugInformation() {
		System.err.println(toDebugString());
	}

```

## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/gumtree/spoon/diff/Diff.java`
#### Snippet
```java
	 * returns the mappings between the compared elements
	 */
	public MappingStore getMappingsComp();
}

```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `src/main/java/gumtree/spoon/builder/jsonsupport/NodePainter.java`
#### Snippet
```java
public interface NodePainter {

	public void paint(Tree tree, JsonObject jsontree);
}

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
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

### DataFlowIssue
Argument `cu` might be null
in `src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java
			if (cu == null) { cu = position.getCompilationUnit(); }
		}
		return new SourcePositionImpl(cu, sourceStart, sourceEnd, cu.getLineSeparatorPositions());
	}

```

### DataFlowIssue
Unboxing of `sourceStart` may produce `NullPointerException`
in `src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java
			if (cu == null) { cu = position.getCompilationUnit(); }
		}
		return new SourcePositionImpl(cu, sourceStart, sourceEnd, cu.getLineSeparatorPositions());
	}

```

### DataFlowIssue
Unboxing of `sourceEnd` may produce `NullPointerException`
in `src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java
			if (cu == null) { cu = position.getCompilationUnit(); }
		}
		return new SourcePositionImpl(cu, sourceStart, sourceEnd, cu.getLineSeparatorPositions());
	}

```

## RuleId[id=UnnecessarySemicolon]
### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/gumtree/spoon/diff/operations/OperationKind.java`
#### Snippet
```java

public enum OperationKind {
	Insert, Update, Move, Delete;
}

```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java
	public enum JSON_PROPERTIES {
		label, type, op, children;
	};

	@SuppressWarnings("rawtypes")
```

### UnnecessarySemicolon
Unnecessary semicolon `;`
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java

	public enum JSON_PROPERTIES {
		label, type, op, children;
	};

```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.github.gumtreediff.actions.model.Action;`
in `src/main/java/gumtree/spoon/diff/operations/UpdateOperation.java`
#### Snippet
```java
package gumtree.spoon.diff.operations;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.actions.model.Update;
import gumtree.spoon.builder.SpoonGumTreeBuilder;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `toString()` is redundant
in `src/main/java/gumtree/spoon/builder/CtVirtualElement.java`
#### Snippet
```java
	@Override
	public String toString() {
		return "VE: " + ((value != null) ? (value.toString()) : null);
	}

```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `Operation()` of an abstract class should not be declared 'public'
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
	private final T action;

	public Operation(T action) {
		this.action = action;
		this.node = (CtElement) action.getNode().getMetadata(SpoonGumTreeBuilder.SPOON_OBJECT);
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
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

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
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

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
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

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack` used
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	public static final String NOTYPE = "<notype>";
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

```

### ObsoleteCollection
Obsolete collection type `Stack<>` used
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	public static final String NOTYPE = "<notype>";
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

	TreeScanner(TreeContext treeContext, Tree root) {
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java
	 * By default, comments are ignored
	 */
	private boolean includeComments = false;

	public AstComparator() {
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	private TreeContext context;

	private GumtreeProperties properties = null;

	private Matcher matcher = new CompositeMatchers.ClassicGumtree();
```

## RuleId[id=KeySetIterationMayUseEntrySet]
### KeySetIterationMayUseEntrySet
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

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
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

## RuleId[id=EqualsAndHashcode]
### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/gumtree/spoon/builder/CtVirtualElement.java`
#### Snippet
```java
 * 
 */
public class CtVirtualElement extends CtWrapper<String> {

	protected Collection<?> children;
```

### EqualsAndHashcode
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/gumtree/spoon/builder/CtWrapper.java`
#### Snippet
```java
 * 
 */
public class CtWrapper<L> extends CtElementImpl {

	/**
```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/gumtree/spoon/diff/support/SpoonSupport.java`
#### Snippet
```java
		}

		return null;
	}
}
```

### ReturnNull
Return of `null`
in `src/main/java/gumtree/spoon/builder/CtWrapper.java`
#### Snippet
```java
	@Override
	public String toString() {
		return (value != null) ? value.toString() : null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java

		if (factory.Type().getAll().size() == 0) {
			return null;
		}

```

### ReturnNull
Return of `null`
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
	/** returns the new version of the node (only for update) */
	public CtElement getDstNode() {
		return null;
	}

```

### ReturnNull
Return of `null`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
			first = first.getParent();
		}
		return null;
	}

```

## RuleId[id=SizeReplaceableByIsEmpty]
### SizeReplaceableByIsEmpty
`factory.Type().getAll().size() == 0` can be replaced with 'factory.Type().getAll().isEmpty()'
in `src/main/java/gumtree/spoon/AstComparator.java`
#### Snippet
```java
		compiler.build();

		if (factory.Type().getAll().size() == 0) {
			return null;
		}
```

### SizeReplaceableByIsEmpty
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

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `collect` is redundant
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	private List<Operation> convertToSpoon(List<Action> actions, MappingStore mappings) {
		List<Operation> collect = actions.stream().map(action -> {

			action.getNode().setMetadata("type", action.getNode().getType().name);
```

### UnnecessaryLocalVariable
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

### UnnecessaryLocalVariable
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

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
		if (element == null) {
			// some elements are only in the gumtree for having a clean diff but not in the Spoon metamodel
			return stringBuilder.toString() + " fake_node(" + action.getNode().getMetadata("type") + ")";
		}

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/builder/jsonsupport/OperationNodePainter.java`
#### Snippet
```java
	private Map<Tree, Operation> nodesAffectedByOps = new HashMap<>();

	public OperationNodePainter(List<Operation> operations) {
		// Collect all nodes and get the operator
		for (Operation operation : operations) {
```

### BoundedWildcard
Can generalize to `? extends NodePainter`
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java

	@SuppressWarnings("unused")
	public JsonObject getJSONwithCustorLabels(TreeContext context, Tree tree, Collection<NodePainter> nodePainters) {

		JsonObject o = new JsonObject();
```

### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	 * @return
	 */
	public static List<Operation> replaceMove(MappingStore mapping, List<Operation> ops, boolean all) {
		List<Operation> newOps = new ArrayList<>();

```

### BoundedWildcard
Can generalize to `? extends Action`
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private Map<Tree, Action> originalActionsDst = new HashMap<>();

	public ActionClassifier(MappingStore mappings, List<Action> actions) {
		clean();

```

### BoundedWildcard
Can generalize to `? extends SourcePosition`
in `src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java
	}

	private static SourcePosition computeSourcePositionOfVirtualElement(List<SourcePosition> modifierPositions) {
		CompilationUnit cu = null;
		Integer sourceStart = null;
```

### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	@Override
	public List<Operation> getOperationChildren(Operation operationParent, List<Operation> rootOperations) {
		return rootOperations.stream() //
				.filter(operation -> operation.getNode().getParent().equals(operationParent)) //
```

### BoundedWildcard
Can generalize to `? extends Action`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	}

	private List<Operation> convertToSpoon(List<Action> actions, MappingStore mappings) {
		List<Operation> collect = actions.stream().map(action -> {

```

### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	@Override
	public boolean containsOperations(List<Operation> operations, OperationKind kind, String nodeKind) {
		return operations.stream() //
				.anyMatch(operation -> operation.getAction().getClass().getSimpleName().equals(kind.name()) //
```

### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java

	@Override
	public boolean containsOperations(List<Operation> operations, OperationKind kind, String nodeKind,
			String nodeLabel) {
		return operations.stream()
```

### BoundedWildcard
Can generalize to `? extends Operation`
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	}

	private String toDebugString(List<Operation> ops) {
		String result = "";
		for (Operation operation : ops) {
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `label` initializer `null` is redundant
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
		}

		String label = null;
		String nodeTypeName = getNodeType(element);

```

### UnusedAssignment
Variable `nolabel` initializer `false` is redundant
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	private final TreeContext treeContext;
	private final Stack<Tree> nodes = new Stack<>();
	boolean nolabel = false;

	TreeScanner(TreeContext treeContext, Tree root) {
```

## RuleId[id=EqualsBetweenInconvertibleTypes]
### EqualsBetweenInconvertibleTypes
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

## RuleId[id=RedundantSuppression]
### RedundantSuppression
Redundant suppression
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java

	@SuppressWarnings("rawtypes")
	public JsonObject getJSONasJsonObject(CtElement element) {
		SpoonGumTreeBuilder builder = new SpoonGumTreeBuilder();
		Tree generatedTree = builder.getTree(element);
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
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

