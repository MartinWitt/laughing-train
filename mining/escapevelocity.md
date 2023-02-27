# escapevelocity 
 
# Bad smells
I found 25 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| BoundedWildcard | 8 | false |
| ReturnNull | 7 | false |
| UnstableApiUsage | 3 | false |
| WhileLoopSpinsOnField | 2 | false |
| AssignmentToMethodParameter | 1 | false |
| MisspelledEquals | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| ConstantValue | 1 | false |
| JavaReflectionMemberAccess | 1 | false |
## RuleId[ruleID=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `lhs`
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
          rhs = parse(rhs, currentOperator.precedence);
        }
        lhs = new BinaryExpressionNode(lhs, operator, rhs);
      }
      return lhs;
```

## RuleId[ruleID=WhileLoopSpinsOnField]
### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
    ImmutableList.Builder<ExpressionNode> builder = ImmutableList.builder();
    builder.add(first);
    while (c == ',') {
      next();
      builder.add(parsePrimary(false));
```

### WhileLoopSpinsOnField
`while` loop spins on field
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
    if (c != ')') {
      args.add(parsePrimary(/* nullAllowed= */ true));
      while (c == ',') {
        nextNonSpace();
        args.add(parsePrimary(/* nullAllowed= */ true));
```

## RuleId[ruleID=MisspelledEquals]
### MisspelledEquals
`equal()` method should probably be 'equals()'
in `src/main/java/com/google/escapevelocity/ExpressionNode.java`
#### Snippet
```java
     * compares equal to each of them.
     */
    private boolean equal(EvaluationContext context) {
      Object lhsValue = lhs.evaluate(context);
      Object rhsValue = rhs.evaluate(context);
```

## RuleId[ruleID=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/com/google/escapevelocity/MethodFinder.java`
#### Snippet
```java
  static Method visibleMethod(Method method, Class<?> in) {
    if (in == null) {
      return null;
    }
    Method methodInClass;
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/escapevelocity/MethodFinder.java`
#### Snippet
```java
      methodInClass = in.getMethod(method.getName(), method.getParameterTypes());
    } catch (NoSuchMethodException e) {
      return null;
    }
    if (classIsPublic(in) || in.getName().startsWith(THIS_PACKAGE)) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/escapevelocity/MethodFinder.java`
#### Snippet
```java
      }
    }
    return null;
  }

```

### ReturnNull
Return of `null`
in `src/main/java/com/google/escapevelocity/ExpressionNode.java`
#### Snippet
```java
          return lhsInt * rhsInt;
        case DIVIDE:
          return (rhsInt == 0) ? null : lhsInt / rhsInt;
        case REMAINDER:
          return (rhsInt == 0) ? null : lhsInt % rhsInt;
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/escapevelocity/ExpressionNode.java`
#### Snippet
```java
          return (rhsInt == 0) ? null : lhsInt / rhsInt;
        case REMAINDER:
          return (rhsInt == 0) ? null : lhsInt % rhsInt;
        default:
          throw new AssertionError(op);
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/escapevelocity/ExpressionNode.java`
#### Snippet
```java
      }
      if (lhsValue == null || rhsValue == null) {
        return null;
      }
      if (!(lhsValue instanceof Integer) || !(rhsValue instanceof Integer)) {
```

### ReturnNull
Return of `null`
in `src/main/java/com/google/escapevelocity/ExpressionNode.java`
#### Snippet
```java
    Object value = evaluate(context);
    if (value == null) {
      return null;
    }
    if (!(value instanceof Integer)) {
```

## RuleId[ruleID=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/com/google/escapevelocity/ExpressionNode.java`
#### Snippet
```java
          rhsValue = rhs.toString();
        }
        return new StringBuilder().append(lhsValue).append(rhsValue).toString();
      }
      if (lhsValue == null || rhsValue == null) {
```

## RuleId[ruleID=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/com/google/escapevelocity/Node.java`
#### Snippet
```java
    private final ImmutableList<Node> nodes;

    Cons(String resourceName, int lineNumber, ImmutableList<Node> nodes) {
      super(resourceName, lineNumber);
      this.nodes = nodes;
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/com/google/escapevelocity/SetSpacing.java`
#### Snippet
```java
   * </pre>
   */
  static boolean shouldRemoveLastNodeBeforeSet(List<Node> nodes) {
    if (nodes.isEmpty()) {
      return false;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/com/google/escapevelocity/Macro.java`
#### Snippet
```java

    MacroEvaluationContext(
        Map<String, ExpressionNode> parameterThunks,
        EvaluationContext originalEvaluationContext,
        Node bodyContent) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionNode`
in `src/main/java/com/google/escapevelocity/Macro.java`
#### Snippet
```java
  void render(
      EvaluationContext context,
      List<ExpressionNode> thunks,
      Node bodyContent,
      StringBuilder output) {
```

### BoundedWildcard
Can generalize to `? extends ExpressionNode`
in `src/main/java/com/google/escapevelocity/ReferenceNode.java`
#### Snippet
```java
    final List<ExpressionNode> args;

    MethodReferenceNode(ReferenceNode lhs, String id, List<ExpressionNode> args, boolean silent) {
      super(lhs.resourceName, lhs.lineNumber, silent);
      this.lhs = lhs;
```

### BoundedWildcard
Can generalize to `? extends Map.Entry`
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
        String resourceName,
        int lineNumber,
        ImmutableList<Map.Entry<ExpressionNode, ExpressionNode>> entries) {
      super(resourceName, lineNumber);
      this.entries = entries;
```

### BoundedWildcard
Can generalize to `? extends Node`
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
    private final ImmutableList<Node> nodes;

    StringLiteralNode(String resourceName, int lineNumber, char quote, ImmutableList<Node> nodes) {
      super(resourceName, lineNumber);
      this.quote = quote;
```

### BoundedWildcard
Can generalize to `? extends ExpressionNode`
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
    private final ImmutableList<ExpressionNode> elements;

    ListLiteralNode(String resourceName, int lineNumber, ImmutableList<ExpressionNode> elements) {
      super(resourceName, lineNumber);
      this.elements = elements;
```

## RuleId[ruleID=ConstantValue]
### ConstantValue
Condition `c == ')'` is always `true`
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
      }
    }
    assert c == ')';
    next();
    return new MethodReferenceNode(lhs, id, args.build(), silent);
```

## RuleId[ruleID=UnstableApiUsage]
### UnstableApiUsage
'tryParse(java.lang.String)' is marked unstable with @Beta
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
      next();
    }
    Integer value = Ints.tryParse(sb.toString());
    if (value == null) {
      throw parseException("Invalid integer: " + sb);
```

### UnstableApiUsage
'closed(int, int)' is marked unstable with @Beta
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
      ImmutableSortedSet<Integer> set =
          (from <= to)
              ? ContiguousSet.closed(from, to)
              : ContiguousSet.closed(to, from).descendingSet();
      return new ForwardingSortedSet<Integer>() {
```

### UnstableApiUsage
'closed(int, int)' is marked unstable with @Beta
in `src/main/java/com/google/escapevelocity/Parser.java`
#### Snippet
```java
          (from <= to)
              ? ContiguousSet.closed(from, to)
              : ContiguousSet.closed(to, from).descendingSet();
      return new ForwardingSortedSet<Integer>() {
        @Override
```

## RuleId[ruleID=JavaReflectionMemberAccess]
### JavaReflectionMemberAccess
Cannot resolve method 'getModule'
in `src/main/java/com/google/escapevelocity/MethodFinder.java`
#### Snippet
```java
    Method moduleIsExportedMethod;
    try {
      classGetModuleMethod = Class.class.getMethod("getModule");
      Class<?> moduleClass = classGetModuleMethod.getReturnType();
      moduleIsExportedMethod = moduleClass.getMethod("isExported", String.class);
```

