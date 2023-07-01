# gumtree-spoon-ast-diff 
 
# Bad smells
I found 53 bad smells with 6 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| JavadocDeclaration | 9 | false |
| FieldMayBeFinal | 9 | false |
| Deprecation | 5 | false |
| TrivialIf | 5 | false |
| DataFlowIssue | 4 | false |
| UnnecessarySemicolon | 3 | false |
| UnnecessaryLocalVariable | 3 | true |
| UnnecessaryModifier | 2 | true |
| UNCHECKED_WARNING | 2 | false |
| UnusedAssignment | 2 | false |
| UNUSED_IMPORT | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| DeprecatedIsStillUsed | 1 | false |
| CommentedOutCode | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| StringConcatenationInLoops | 1 | false |
| EqualsBetweenInconvertibleTypes | 1 | false |
| FieldCanBeLocal | 1 | false |
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'gumtree.spoon.diff.operations.Operation' to 'gumtree.spoon.diff.operations.Operation'
in `src/main/java/gumtree/spoon/builder/jsonsupport/OperationNodePainter.java`
#### Snippet
```java
		if (nodesAffectedByOps.containsKey(tree)) {

			Operation<Action> operationOverTree = nodesAffectedByOps.get(tree);
			jsontree.addProperty(JSON_PROPERTIES.op.toString(), operationOverTree.getAction().getName());
		}
```

### UNCHECKED_WARNING
Unchecked call to 'CtWrapper(L, CtElement, CtRole)' as a member of raw type 'gumtree.spoon.builder.CtWrapper'
in `src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java
			Tree annotationValueNode = builder.createNode("ANNOTATION_VALUE", entry.toString());
			annotationNode.addChild(annotationValueNode);
			CtWrapper wrapper = new CtWrapper(entry, annotation, CtRole.VALUE);
			wrapper.setPosition(entry.getValue().getPosition());
			annotationValueNode.setMetadata(SpoonGumTreeBuilder.SPOON_OBJECT, wrapper);
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

## RuleId[id=DataFlowIssue]
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

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param mapping` tag description is missing
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	 * replaces moves by Insert/Delete operations
	 * 
	 * @param mapping
	 * @param ops
	 * @return
```

### JavadocDeclaration
`@param ops` tag description is missing
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	 * 
	 * @param mapping
	 * @param ops
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	 * @param mapping
	 * @param ops
	 * @return
	 */
	public static List<Operation> replaceMove(MappingStore mapping, List<Operation> ops, boolean all) {
```

### JavadocDeclaration
`@param context` tag description is missing
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java
	 * Decorates a node with the affected operator, if any.
	 * 
	 * @param context
	 * @param tree
	 * @param operations
```

### JavadocDeclaration
`@param tree` tag description is missing
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java
	 * 
	 * @param context
	 * @param tree
	 * @param operations
	 * @return
```

### JavadocDeclaration
`@param operations` tag description is missing
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java
	 * @param context
	 * @param tree
	 * @param operations
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/gumtree/spoon/builder/Json4SpoonGenerator.java`
#### Snippet
```java
	 * @param tree
	 * @param operations
	 * @return
	 */
	public JsonObject getJSONwithOperations(TreeContext context, Tree tree, List<Operation> operations) {
```

### JavadocDeclaration
`@param element` tag description is missing
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	 * Ignore some element from the AST
	 * 
	 * @param element
	 * @return
	 */
```

### JavadocDeclaration
`@return` tag description is missing
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	 * 
	 * @param element
	 * @return
	 */
	private boolean isToIgnore(CtElement element) {
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

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `nodesAffectedByOps` may be 'final'
in `src/main/java/gumtree/spoon/builder/jsonsupport/OperationNodePainter.java`
#### Snippet
```java
public class OperationNodePainter implements NodePainter {

	private Map<Tree, Operation> nodesAffectedByOps = new HashMap<>();

	public OperationNodePainter(List<Operation> operations) {
```

### FieldMayBeFinal
Field `srcDelTrees` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private List<Tree> srcMvTrees = new ArrayList<>();
	private List<Tree> dstMvTrees = new ArrayList<>();
	private List<Tree> srcDelTrees = new ArrayList<>();
	private List<Tree> dstAddTrees = new ArrayList<>();
	private Map<Tree, Action> originalActionsSrc = new HashMap<>();
```

### FieldMayBeFinal
Field `srcUpdTrees` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	// ROOT CLASSIFIER
	// /
	private List<Tree> srcUpdTrees = new ArrayList<>();
	private List<Tree> dstUpdTrees = new ArrayList<>();
	private List<Tree> srcMvTrees = new ArrayList<>();
```

### FieldMayBeFinal
Field `originalActionsDst` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private List<Tree> dstAddTrees = new ArrayList<>();
	private Map<Tree, Action> originalActionsSrc = new HashMap<>();
	private Map<Tree, Action> originalActionsDst = new HashMap<>();

	public ActionClassifier(MappingStore mappings, List<Action> actions) {
```

### FieldMayBeFinal
Field `originalActionsSrc` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private List<Tree> srcDelTrees = new ArrayList<>();
	private List<Tree> dstAddTrees = new ArrayList<>();
	private Map<Tree, Action> originalActionsSrc = new HashMap<>();
	private Map<Tree, Action> originalActionsDst = new HashMap<>();

```

### FieldMayBeFinal
Field `dstAddTrees` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private List<Tree> dstMvTrees = new ArrayList<>();
	private List<Tree> srcDelTrees = new ArrayList<>();
	private List<Tree> dstAddTrees = new ArrayList<>();
	private Map<Tree, Action> originalActionsSrc = new HashMap<>();
	private Map<Tree, Action> originalActionsDst = new HashMap<>();
```

### FieldMayBeFinal
Field `srcMvTrees` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private List<Tree> srcUpdTrees = new ArrayList<>();
	private List<Tree> dstUpdTrees = new ArrayList<>();
	private List<Tree> srcMvTrees = new ArrayList<>();
	private List<Tree> dstMvTrees = new ArrayList<>();
	private List<Tree> srcDelTrees = new ArrayList<>();
```

### FieldMayBeFinal
Field `dstUpdTrees` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	// /
	private List<Tree> srcUpdTrees = new ArrayList<>();
	private List<Tree> dstUpdTrees = new ArrayList<>();
	private List<Tree> srcMvTrees = new ArrayList<>();
	private List<Tree> dstMvTrees = new ArrayList<>();
```

### FieldMayBeFinal
Field `dstMvTrees` may be 'final'
in `src/main/java/gumtree/spoon/diff/ActionClassifier.java`
#### Snippet
```java
	private List<Tree> dstUpdTrees = new ArrayList<>();
	private List<Tree> srcMvTrees = new ArrayList<>();
	private List<Tree> dstMvTrees = new ArrayList<>();
	private List<Tree> srcDelTrees = new ArrayList<>();
	private List<Tree> dstAddTrees = new ArrayList<>();
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

## RuleId[id=Deprecation]
### Deprecation
'spoon.reflect.cu.CompilationUnit' is deprecated
in `src/main/java/gumtree/spoon/builder/NodeCreator.java`
#### Snippet
```java

	private static SourcePosition computeSourcePositionOfVirtualElement(List<SourcePosition> modifierPositions) {
		CompilationUnit cu = null;
		Integer sourceStart = null;
		Integer sourceEnd = null;
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	public List<Operation> getOperationChildren(Operation operationParent, List<Operation> rootOperations) {
		return rootOperations.stream() //
				.filter(operation -> operation.getNode().getParent().equals(operationParent)) //
				.collect(Collectors.toList());
	}
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
				.findFirst();
		if (firstNode.isPresent()) {
			return firstNode.get().getNode();
		}
		throw new NoSuchElementException();
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
		for (Operation operation : ops) {
			Tree node = operation.getAction().getNode();
			final CtElement nodeElement = operation.getNode();
			String nodeType = node.getType().name;
			if (nodeElement != null) {
```

### Deprecation
'getNode()' is deprecated
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
		final List<CtElement> copy = new ArrayList<>();
		for (Operation operation : rootOperations) {
			CtElement el = operation.getNode();
			if (operation instanceof InsertOperation) {
				// we take the corresponding node in the source tree
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

## RuleId[id=StringConcatenationInLoops]
### StringConcatenationInLoops
String concatenation `+=` in loop
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
				nodeType += "(" + nodeElement.getClass().getSimpleName() + ")";
			}
			result += "OperationKind." + operation.getAction().getClass().getSimpleName() + ", \"" + nodeType + "\", \""
					+ node.getLabel() + "\"";

```

## RuleId[id=UnusedAssignment]
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

### UnusedAssignment
Variable `label` initializer `null` is redundant
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
		}

		String label = null;
		String nodeTypeName = getNodeType(element);

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

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/gumtree/spoon/diff/DiffImpl.java`
#### Snippet
```java
	 * Actions over the changes roots.
	 */
	private List<Operation> simplifiedOperations;

	/**
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/gumtree/spoon/diff/operations/AdditionOperation.java`
#### Snippet
```java
		} else if (!parent.equals(other.parent))
			return false;
		if (position != other.position)
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/gumtree/spoon/diff/operations/TreeAdditionOperation.java`
#### Snippet
```java
		} else if (!parent.equals(other.parent))
			return false;
		if (position != other.position)
			return false;
		return true;
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/gumtree/spoon/builder/TreeScanner.java`
#### Snippet
```java
	private boolean isToIgnore(CtElement element) {
		if (element instanceof CtStatementList && !(element instanceof CtCase)) {
			if (element.getRoleInParent() == CtRole.ELSE || element.getRoleInParent() == CtRole.THEN) {
				return false;
			}
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
			return false;
		if (node == null) {
			if (other.node != null)
				return false;
		} else if (!node.equals(other.node))
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/gumtree/spoon/diff/operations/Operation.java`
#### Snippet
```java
			if (other.node != null)
				return false;
		} else if (!node.equals(other.node))
			return false;
		return true;
```

