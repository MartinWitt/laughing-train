# commons-jexl 
 
# Bad smells
I found 190 bad smells with 18 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ConstantValue | 43 | false |
| DataFlowIssue | 33 | false |
| ConditionCoveredByFurtherCondition | 15 | false |
| Deprecation | 12 | false |
| TrivialIf | 12 | false |
| DuplicatedCode | 10 | false |
| UnnecessaryToStringCall | 8 | true |
| ProtectedMemberInFinalClass | 7 | true |
| FieldCanBeLocal | 5 | false |
| StringEquality | 4 | false |
| RedundantMethodOverride | 4 | false |
| DeprecatedIsStillUsed | 3 | false |
| JavadocDeclaration | 3 | false |
| UNCHECKED_WARNING | 2 | false |
| JavaLangInvokeHandleSignature | 2 | false |
| TypeParameterHidesVisibleType | 2 | false |
| CommentedOutCode | 2 | false |
| UnnecessaryLabelOnBreakStatement | 2 | false |
| RegExpSimplifiable | 2 | false |
| IOStreamConstructor | 2 | false |
| SuspiciousMethodCalls | 2 | false |
| UnnecessaryUnicodeEscape | 2 | false |
| UnnecessaryLocalVariable | 2 | true |
| JavadocReference | 1 | false |
| SimplifyStreamApiCallChains | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| MismatchedJavadocCode | 1 | false |
| JavadocLinkAsPlainText | 1 | false |
| AutoCloseableResource | 1 | false |
| MismatchedCollectionQueryUpdate | 1 | false |
| UnnecessaryContinue | 1 | false |
| RedundantFileCreation | 1 | false |
| NullArgumentToVariableArgMethod | 1 | false |
| UnusedAssignment | 1 | false |
## RuleId[id=StringEquality]
### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            } else {
                final String actual = sandbox.write(clazz, null);
                if (actual != JexlSandbox.NULL) {
                    return uberspect.getPropertySet(resolvers, obj, null, arg);
                }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            final Class<?> clazz = (obj instanceof Class) ? (Class<?>) obj : obj.getClass();
            final String actual = sandbox.execute(clazz, method);
            if (actual != null && actual != JexlSandbox.NULL) {
                return uberspect.getMethod(obj, actual, args);
            }
```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            className = null;
        }
        return className != null && className != JexlSandbox.NULL ? uberspect.getConstructor(className, args) : null;
    }

```

### StringEquality
String values are compared using `!=`, not 'equals()'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            } else {
                final String actual = sandbox.read(clazz, null);
                if (actual != JexlSandbox.NULL) {
                     return uberspect.getPropertyGet(resolvers, obj, null);
                }
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Set'
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
        pragmas.merge(key, value, (previous, newValue)->{
            if (previous instanceof Set<?>) {
                ((Set<Object>) previous).add(newValue);
                return previous;
            }
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.Set' to 'java.util.Set'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                final String key = pragma.getKey();
                final Object value = pragma.getValue();
                final Set<Object> values = value instanceof Set ? (Set) value : Collections.singleton(value);
                for (final Object pragmaValue : values) {
                    builder.append("#pragma ");
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `Parser`
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
    protected final AtomicBoolean parsing = new AtomicBoolean(false);
    /**
     * The {@link Parser}; when parsing expressions, this engine uses the parser if it
     * is not already in use otherwise it will create a new temporary one.
     */
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Condition `child instanceof ASTReference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/parser/ASTArrayLiteral.java`
#### Snippet
```java
        for (int c = 0; c < jjtGetNumChildren() && constant; ++c) {
            final JexlNode child = jjtGetChild(c);
            if (child instanceof ASTReference) {
                constant = child.isConstant(true);
            } else if (!child.isConstant()) {
```

### DataFlowIssue
Method invocation `isConstant` will produce `NullPointerException`
in `src/main/java/org/apache/commons/jexl3/parser/ASTArrayLiteral.java`
#### Snippet
```java
            if (child instanceof ASTReference) {
                constant = child.isConstant(true);
            } else if (!child.isConstant()) {
                constant = false;
            }
```

### DataFlowIssue
Method invocation `getInfo` may produce `NullPointerException`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateInterpreter.java`
#### Snippet
```java
            printComposite((TemplateEngine.CompositeExpression) expr);
        } else {
            doPrint(expr.getInfo(), expr.evaluate(this));
        }
    }
```

### DataFlowIssue
Condition `identifier.jjtGetParent() instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
            final boolean ignore = (ii.isSafe()
                    && (symbol >= 0
                    || identifier.jjtGetParent() instanceof ASTAssignment))
                    || (identifier.jjtGetParent() instanceof ASTReference);
            if (!ignore) {
```

### DataFlowIssue
Condition `identifier.jjtGetParent() instanceof ASTReference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
                    && (symbol >= 0
                    || identifier.jjtGetParent() instanceof ASTAssignment))
                    || (identifier.jjtGetParent() instanceof ASTReference);
            if (!ignore) {
                return ii.unsolvableVariable(identifier, name, true); // undefined
```

### DataFlowIssue
Condition `node instanceof ASTArrayAccess` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
     */
    protected String stringifyProperty(final JexlNode node) {
        if (node instanceof ASTArrayAccess) {
            return "[" + stringifyPropertyValue(node.jjtGetChild(0)) + "]";
        }
```

### DataFlowIssue
Condition `identifier.jjtGetParent() instanceof ASTReference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            if (!context.has(name)) {
                // not defined, ignore in some cases...
                final boolean ignore = identifier.jjtGetParent() instanceof ASTReference
                        || (isSafe() && (symbol >= 0 || identifier.jjtGetParent() instanceof ASTAssignment));
                if (!ignore) {
```

### DataFlowIssue
Condition `identifier.jjtGetParent() instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
                // not defined, ignore in some cases...
                final boolean ignore = identifier.jjtGetParent() instanceof ASTReference
                        || (isSafe() && (symbol >= 0 || identifier.jjtGetParent() instanceof ASTAssignment));
                if (!ignore) {
                    return undefinedVariable(identifier, name); // undefined
```

### DataFlowIssue
Condition `node.jjtGetParent() instanceof ASTArrayAccess` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        }
        cancelCheck(node);
        final JexlOperator operator = node != null && node.jjtGetParent() instanceof ASTArrayAccess
                ? JexlOperator.ARRAY_GET : JexlOperator.PROPERTY_GET;
        final Object result = operators.tryOverload(node, operator, object, attribute);
```

### DataFlowIssue
Condition `node.jjtGetParent() instanceof ASTArrayAccess` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
    protected void setAttribute(final Object object, final Object attribute, final Object value, final JexlNode node) {
        cancelCheck(node);
        final JexlOperator operator = node != null && node.jjtGetParent() instanceof ASTArrayAccess
                                      ? JexlOperator.ARRAY_SET : JexlOperator.PROPERTY_SET;
        final Object result = operators.tryOverload(node, operator, object, attribute, value);
```

### DataFlowIssue
Condition `child instanceof ASTFunctionNode` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/TemplateDebugger.java`
#### Snippet
```java
     */
    private TemplateExpression getPrintStatement(final JexlNode child) {
        if (exprs != null && child instanceof ASTFunctionNode) {
            final ASTFunctionNode node = (ASTFunctionNode) child;
            final ASTIdentifier ns = (ASTIdentifier) node.jjtGetChild(0);
```

### DataFlowIssue
Condition `jjtGetParent() instanceof ASTReference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            return first.isGlobalVar();
        }
        if (jjtGetParent() instanceof ASTReference) {
            return true;
        }
```

### DataFlowIssue
Condition `child instanceof ASTReference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            for (int n = 0; n < jjtGetNumChildren(); ++n) {
                final JexlNode child = jjtGetChild(n);
                if ((child instanceof ASTReference) || (child instanceof ASTMapEntry)) {
                    final boolean is = child.isConstant(true);
                    if (!is) {
```

### DataFlowIssue
Method invocation `isConstant` will produce `NullPointerException`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
                        return false;
                    }
                } else if (!child.isConstant()) {
                    return false;
                }
```

### DataFlowIssue
Condition `child instanceof ASTMapEntry` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/parser/ASTMapLiteral.java`
#### Snippet
```java
        for (int c = 0; c < jjtGetNumChildren() && constant; ++c) {
            final JexlNode child = jjtGetChild(c);
            if (child instanceof ASTMapEntry) {
                constant = child.isConstant(true);
            } else if (!child.isConstant()) {
```

### DataFlowIssue
Method invocation `isConstant` will produce `NullPointerException`
in `src/main/java/org/apache/commons/jexl3/parser/ASTMapLiteral.java`
#### Snippet
```java
            if (child instanceof ASTMapEntry) {
                constant = child.isConstant(true);
            } else if (!child.isConstant()) {
                constant = false;
            }
```

### DataFlowIssue
Condition `parent instanceof ASTMethodNode` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        if (node instanceof ASTIdentifier) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### DataFlowIssue
Condition `parent instanceof ASTMethodNode` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        } else if (node instanceof ASTIdentifierAccess) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### DataFlowIssue
Condition `node instanceof ASTArrayAccess` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
                collector.add(((ASTIdentifierAccess) node).getName());
            }
        } else if (node instanceof ASTArrayAccess && collector.mode > 0) {
            final int num = node.jjtGetNumChildren();
            // collect only if array access is const and follows an identifier
```

### DataFlowIssue
Condition `child instanceof ASTIfStatement` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
        return child instanceof ASTJexlScript
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
```

### DataFlowIssue
Condition `parent instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
            final boolean expr = isLambdaExpr(lambda);
            named = node.jjtGetChild(0) instanceof ASTVar;
            final boolean assigned = parent instanceof ASTAssignment || named;
            if (assigned && !expr) {
                builder.append("function");
```

### DataFlowIssue
Condition `child instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                builder.append(", ");
                final JexlNode child = node.jjtGetChild(i);
                if (child instanceof ASTAssignment) {
                    final ASTAssignment assign = (ASTAssignment) child;
                    final int nc = assign.jjtGetNumChildren();
```

### DataFlowIssue
Variable is already assigned to this value
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                    builder.append(", ");
                } else {
                    first = true;
                }
                accept(node.jjtGetChild(i), data);
```

### DataFlowIssue
Condition `node.jjtGetParent() instanceof ASTMulNode` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    protected Object additiveNode(final JexlNode node, final String op, final Object data) {
        // need parenthesis if not in operator precedence order
        final boolean paren = node.jjtGetParent() instanceof ASTMulNode
                || node.jjtGetParent() instanceof ASTDivNode
                || node.jjtGetParent() instanceof ASTModNode;
```

### DataFlowIssue
Condition `node.jjtGetParent() instanceof ASTDivNode` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
        // need parenthesis if not in operator precedence order
        final boolean paren = node.jjtGetParent() instanceof ASTMulNode
                || node.jjtGetParent() instanceof ASTDivNode
                || node.jjtGetParent() instanceof ASTModNode;
        final int num = node.jjtGetNumChildren();
```

### DataFlowIssue
Condition `node.jjtGetParent() instanceof ASTModNode` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
        final boolean paren = node.jjtGetParent() instanceof ASTMulNode
                || node.jjtGetParent() instanceof ASTDivNode
                || node.jjtGetParent() instanceof ASTModNode;
        final int num = node.jjtGetNumChildren();
        if (paren) {
```

### DataFlowIssue
Condition `parent instanceof ASTReference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
        JexlNode ptyNode = null;
        StringBuilder ant = null;
        boolean antish = !(parent instanceof ASTReference) && options.isAntish();
        int v = 1;
        main:
```

### DataFlowIssue
Condition `objectNode instanceof ASTMethodNode` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
        for (int c = 0; c < numChildren; c++) {
            objectNode = node.jjtGetChild(c);
            if (objectNode instanceof ASTMethodNode) {
                antish = false;
                if (object == null) {
```

### DataFlowIssue
Method invocation `jjtAccept` may produce `NullPointerException`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            }
            // attempt to evaluate the property within the object (visit(ASTIdentifierAccess node))
            object = objectNode.jjtAccept(this, object);
            cancelCheck(node);
            if (object != null) {
```

### DataFlowIssue
Condition `child instanceof ASTExtendedLiteral` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            cancelCheck(node);
            final JexlNode child = node.jjtGetChild(i);
            if (child instanceof ASTExtendedLiteral) {
                extended = true;
            } else {
```

### DataFlowIssue
Condition `init instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            final JexlNode init = node.jjtGetChild(0);
            ASTVar loopVariable = null;
            if (init instanceof ASTAssignment) {
                final JexlNode child = init.jjtGetChild(0);
                if (child instanceof ASTVar) {
```

### DataFlowIssue
Condition `moreAssignment instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            // other inits
            for (JexlNode moreAssignment = node.jjtGetChild(nc);
                 moreAssignment instanceof ASTAssignment;
                 moreAssignment = node.jjtGetChild(++nc)) {
                moreAssignment.jjtAccept(this, data);
```

### DataFlowIssue
Condition `propertyNode instanceof ASTArrayAccess` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            // property of an object ?
            property = evalIdentifier(propertyId);
        } else if (propertyNode instanceof ASTArrayAccess) {
            // can have multiple nodes - either an expression, integer literal or reference
            final int numChildren = propertyNode.jjtGetNumChildren() - 1;
```

## RuleId[id=SimplifyStreamApiCallChains]
### SimplifyStreamApiCallChains
'Arrays.asList().stream()' can be replaced with 'Arrays.stream()'
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
            this(JexlPermissions.RESTRICTED,
                    Arrays.asList(Objects.requireNonNull(allow))
                            .stream().map(Class::getCanonicalName).collect(Collectors.toList()));
        }

```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
                continue;
             case '\'':
                retval.append("//\'");
                continue;
             case '/':
```

## RuleId[id=JavaLangInvokeHandleSignature]
### JavaLangInvokeHandleSignature
Cannot resolve method 'getModule'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassTool.java`
#### Snippet
```java
            final Class<?> modulec = ClassTool.class.getClassLoader().loadClass("java.lang.Module");
            if (modulec != null) {
                getModule = LOOKUP.findVirtual(Class.class, "getModule", MethodType.methodType(modulec));
                if (getModule != null) {
                    getPackageName = LOOKUP.findVirtual(Class.class, "getPackageName", MethodType.methodType(String.class));
```

### JavaLangInvokeHandleSignature
Cannot resolve method 'getPackageName'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassTool.java`
#### Snippet
```java
                getModule = LOOKUP.findVirtual(Class.class, "getModule", MethodType.methodType(modulec));
                if (getModule != null) {
                    getPackageName = LOOKUP.findVirtual(Class.class, "getPackageName", MethodType.methodType(String.class));
                    if (getPackageName != null) {
                        isExported = LOOKUP.findVirtual(modulec, "isExported", MethodType.methodType(boolean.class, String.class));
```

## RuleId[id=TypeParameterHidesVisibleType]
### TypeParameterHidesVisibleType
Type parameter `K` hides type parameter 'K'
in `src/main/java/org/apache/commons/jexl3/internal/SoftCache.java`
#### Snippet
```java
     * @return a Map usable as a cache bounded to the given size
     */
    public <K, V> Map<K, V> createCache(final int cacheSize) {
        return new java.util.LinkedHashMap<K, V>(cacheSize, LOAD_FACTOR, true) {
            /**
```

### TypeParameterHidesVisibleType
Type parameter `V` hides type parameter 'V'
in `src/main/java/org/apache/commons/jexl3/internal/SoftCache.java`
#### Snippet
```java
     * @return a Map usable as a cache bounded to the given size
     */
    public <K, V> Map<K, V> createCache(final int cacheSize) {
        return new java.util.LinkedHashMap<K, V>(cacheSize, LOAD_FACTOR, true) {
            /**
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     */
    protected void jjtreeOpenNodeScope(final JexlNode node) {
//        if (node instanceof ASTBlock || node instanceof ASTForeachStatement) {
//            final LexicalUnit unit = (LexicalUnit) node;
//            unit.setScope(scope);
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        final boolean cached = src.length() < cacheThreshold && cache != null;
        final JexlFeatures features = parsingf != null? parsingf : DEFAULT_FEATURES;
       // if (features.getNameSpaces().isEmpty() && !functions.isEmpty()) {
       //     features = new JexlFeatures(features).nameSpaces(functions.keySet());
       // }
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'processPragma' is still used
in `src/main/java/org/apache/commons/jexl3/JexlContext.java`
#### Snippet
```java
         */
        @Deprecated
        void processPragma(String key, Object value);

        /**
```

### DeprecatedIsStillUsed
Deprecated member 'compare' is still used
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
     */
    @Deprecated
    protected int compare(final Object left, final Object right, final String symbol) {
        JexlOperator operator;
        try {
```

### DeprecatedIsStillUsed
Deprecated member 'Options' is still used
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
     */
    @Deprecated
    public interface Options {

        /**
```

## RuleId[id=UnnecessaryLabelOnBreakStatement]
### UnnecessaryLabelOnBreakStatement
Unnecessary label `main` on break statement
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                        // not an identifier, not antish
                        ptyNode = objectNode;
                        break main;
                    }
                    final ASTIdentifier afirst = (ASTIdentifier) first;
```

### UnnecessaryLabelOnBreakStatement
Unnecessary label `main` on break statement
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                        // ant remains null, object is null, stop solving
                        antish = false;
                        break main;
                    }
                    ant = new StringBuilder(firstId.getName());
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/IntegerRange.java`
#### Snippet
```java
            if (array.length < length) {
                copy = (T[]) Array.newInstance(ct, length);
            }
            for (int a = 0; a < length; ++a) {
                Array.set(copy, a, min + a);
            }
            if (length < copy.length) {
                copy[length] = null;
            }
            return copy;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            final int numChildren = script.jjtGetNumChildren();
            Object result = null;
            for (int i = 0; i < numChildren; i++) {
                final JexlNode child = script.jjtGetChild(i);
                result = child.jjtAccept(this, data);
                cancelCheck(child);
            }
            return result;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        final Object[] nargv = new Object[args.length + 1];
        if (narrow) {
            nargv[0] = functionArgument(true, target);
            for (int a = 1; a <= args.length; ++a) {
                nargv[a] = functionArgument(true, args[a - 1]);
            }
        } else {
            nargv[0] = target;
            System.arraycopy(args, 0, nargv, 1, args.length);
        }
        return nargv;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ConstructorMethod.java`
#### Snippet
```java
        final Class<?> ctorClass = ctor.getDeclaringClass();
        boolean invoke = true;
        if (obj != null) {
            if (obj instanceof Class<?>) {
                invoke = ctorClass.equals(obj);
            } else {
                invoke = ctorClass.getName().equals(obj.toString());
            }
        }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/introspection/IndexedType.java`
#### Snippet
```java
            final String mname = getters[0].getName();
            final MethodKey km = new MethodKey(mname, args);
            jm = km.getMostSpecificMethod(getters);
            if (jm != null) {
                final Object invoked = jm.invoke(object, args);
                get = jm;
                return invoked;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ListSetExecutor.java`
#### Snippet
```java
        if (method == ARRAY_SET) {
            Array.set(obj, property, value);
        } else {
            @SuppressWarnings("unchecked") // LSE should only be created for array or list types
            final List<Object> list = (List<Object>) obj;
            list.set(property, value);
        }
        return value;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Permissions.java`
#### Snippet
```java
        if (!validate(ctor)) {
            return false;
        }
        // check declared restrictions
        if (deny(ctor)) {
            return false;
        }
        // class must agree
        final Class<?> clazz = ctor.getDeclaringClass();
        if (deny(clazz)) {
            return false;
        }
        // check wildcards
        return wildcardAllow(clazz);
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PermissionsParser.java`
#### Snippet
```java
            final char c = src.charAt(i);
            // if no parsing progress can be made, we are in error
            if (j >= i) {
                throw new IllegalStateException(unexpected(c, i));
            }
            j = i;
            // get rid of space
            if (Character.isWhitespace(c)) {
                i = readSpaces(i + 1);
                continue;
            }
            // eol comment
            if (c == '#') {
                i = readEol(i + 1);
                continue;
            }
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
        final Class<?> claz = obj.getClass();
        final String property = AbstractExecutor.castString(identifier);
        final Introspector is = base();
        final List<PropertyResolver> r = resolvers == null? strategy.apply(null, obj) : resolvers;
```

### DuplicatedCode
Duplicated code
in `src/main/java/org/apache/commons/jexl3/parser/NumberParser.java`
#### Snippet
```java
        String s;
        // determine negative sign if any, ignore +
        final boolean negative;
        switch (str.charAt(0)) {
            case '-':
                negative = true;
                s = str.substring(1);
                break;
            case '+':
                negative = false;
                s = str.substring(1);
                break;
            default:
                negative = false;
                s = str;
        }
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
     */
    protected static final Pattern QUOTED_IDENTIFIER =
            Pattern.compile("[\\s]|[\\p{Punct}&&[^@#$_]]");

    /**
```

### RegExpSimplifiable
`[\\p{Punct}&&[^@#$_]]` can be simplified to '\\p{Punct}\&\&\[\^@#$_\]'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
     */
    protected static final Pattern QUOTED_IDENTIFIER =
            Pattern.compile("[\\s]|[\\p{Punct}&&[^@#$_]]");

    /**
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
     *
     * @param value  argument
     * @return true if argument can be represented by a long
     */
    protected Number asLongNumber(final Object value) {
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
     */
    @Deprecated
    protected JexlSandbox(final boolean ab, final Map<String, Permissions> map) {
        this(ab, false, map);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
     * @since 3.2
     */
    protected JexlSandbox(final boolean ab, final boolean inh, final Map<String, Permissions> map) {
        allow = ab;
        inherit = inh;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
     */
    @Deprecated
    protected JexlSandbox(final Map<String, Permissions> map) {
        this(true, false, map);
    }
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
     * @return the first position after end of pattern if it matches, -1 otherwise
     */
    protected int startsWith(final CharSequence sequence, final CharSequence pattern) {
        final int length = sequence.length();
        int s = 0;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
         * @param prefix the line prefix (immediate or deferred)
         */
        protected void toString(final StringBuilder strb, final String prefix) {
            if (BlockType.VERBATIM.equals(type)) {
                strb.append(body);
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
     * @return the list of blocks
     */
    protected List<Block> readTemplate(final String prefix, final Reader source) {
        final ArrayList<Block> blocks = new ArrayList<>();
        final BufferedReader reader;
```

### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
     * @return the line iterator
     */
    protected static Iterator<CharSequence> readLines(final Reader reader) {
        if (!reader.markSupported()) {
            throw new IllegalArgumentException("mark support in reader required");
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/commons/jexl3/scripting/Main.java`
#### Snippet
```java
                    fileName == null
                        ? System.in
                        : new FileInputStream(new File(fileName)),
                    charset == null
                        ? Charset.defaultCharset()
```

### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
            throw new NullPointerException("source file is null");
        }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),
                getCharset()))) {
            return toString(reader);
```

## RuleId[id=Deprecation]
### Deprecation
'execute(java.lang.String, java.lang.String)' is deprecated
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            className = sandbox.execute((Class<?>) ctorHandle, "");
        } else if (ctorHandle != null) {
            className = sandbox.execute(ctorHandle.toString(), "");
        } else {
            className = null;
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/package-info.java`
#### Snippet
```java
 * Those configuration options can be overridden during evaluation by implementing a
 * {@link org.apache.commons.jexl3.JexlContext}
 * that also implements {@link org.apache.commons.jexl3.JexlEngine.Options} to carry evaluation options.
 * An example of such a class exists in the test package.
 * </p>
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/package-info.java`
#### Snippet
```java
 * </p>
 * <p>
 * {@link org.apache.commons.jexl3.JexlBuilder#strict} or {@link org.apache.commons.jexl3.JexlEngine.Options#isStrict}
 * configures when JEXL considers 'null' as an error or not in various situations;
 * when facing an unreferenceable variable, using null as an argument to an arithmetic operator or failing to call
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/package-info.java`
#### Snippet
```java
 * </p>
 * <p>
 * {@link org.apache.commons.jexl3.JexlBuilder#silent} or {@link org.apache.commons.jexl3.JexlEngine.Options#isSilent}
 * configures how JEXL reacts to errors; if silent, the engine will not throw exceptions
 * but will warn through loggers and return null in case of errors. Note that when non-silent, JEXL throws
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/package-info.java`
#### Snippet
```java
 * <p>
 * The {@link org.apache.commons.jexl3.JexlContext}, {@link org.apache.commons.jexl3.JexlBuilder} and
 * {@link org.apache.commons.jexl3.JexlEngine.Options} are
 * the most likely interfaces you'll want to implement for customization. Since they expose variables and options,
 * they are the primary targets. Before you do so, have a look at JexlEvalContext in the test directory
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
            return options(((JexlContext.OptionsHandle) context).getEngineOptions());
        }
        if (context instanceof JexlEngine.Options) {
            return options((JexlEngine.Options) context);
        }
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
        }
        if (context instanceof JexlEngine.Options) {
            return options((JexlEngine.Options) context);
        }
        return this;
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
     * @see #createWithOptions(boolean, java.math.MathContext, int)
     *
     * @param options the {@link JexlEngine.Options} to use
     * @return an arithmetic with those options set
     */
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
     * Creates a JexlArithmetic instance.
     * Called by options(...) method when another instance of the same class of arithmetic is required.
     * @see #options(org.apache.commons.jexl3.JexlEngine.Options)
     *
     * @param astrict     whether this arithmetic is lenient or strict
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
                return jexlo.isSharedInstance()? jexlo : jexlo.copy();
            }
        } else if (context instanceof JexlEngine.Options) {
            return evalOptions((JexlEngine.Options) context);
        }
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
            }
        } else if (context instanceof JexlEngine.Options) {
            return evalOptions((JexlEngine.Options) context);
        }
        return options;
```

### Deprecation
'org.apache.commons.jexl3.JexlEngine.Options' is deprecated
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
     * @return the newer class of options
     */
    private JexlOptions evalOptions(final JexlEngine.Options opts) {
        // This condition and block for compatibility between 3.1 and 3.2
        final JexlOptions jexlo = options.copy();
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/parser/SimpleNode.java`
#### Snippet
```java

    public String toString(final String prefix) {
        return prefix + toString();
    }

```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/JexlInfo.java`
#### Snippet
```java
            sb.append(dbg.end());
            sb.append("]: '");
            sb.append(dbg.toString());
            sb.append("'");
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
        final StringBuilder msg = new StringBuilder();
        if (info != null) {
            msg.append(info.toString());
        } else {
            msg.append("?:");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
        final StringBuilder msg = new StringBuilder();
        if (info != null) {
            msg.append(info.toString());
        } else {
            msg.append("?:");
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
        public StringBuilder asString(final StringBuilder strb) {
            if (value != null) {
                strb.append(value.toString());
            }
            return strb;
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
            if (source != this) {
                strb.append(" /*= ");
                strb.append(source.toString());
                strb.append(" */");
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                value = expr.evaluate(interpreter);
                if (value != null) {
                    strb.append(value.toString());
                }
            }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
        if (expr != null) {
            strb.append(" '");
            strb.append(expr.toString());
            strb.append("'");
        }
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Set' may not contain objects of type 'capture of ?'
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
        if (container instanceof Map<?, ?>) {
            if (value instanceof Map<?, ?>) {
                return ((Map<?, ?>) container).keySet().containsAll(((Map<?, ?>) value).keySet());
            }
            return ((Map<?, ?>) container).containsKey(value);
```

### SuspiciousMethodCalls
'Collection' may not contain objects of type 'capture of ?'
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
            final Object right = arrayWrap(value);
            if (right instanceof Collection<?>) {
                return ((Collection<?>) left).containsAll((Collection<?>) right);
            }
            return ((Collection<?>) left).contains(value);
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `src/main/java/org/apache/commons/jexl3/parser/SimpleNode.java`
#### Snippet
```java
 * MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=
 *
 * Works around issue https://javacc.dev.java.net/issues/show_bug.cgi?id=227
 * As soon as this issue if fixed and the maven plugin uses the correct version of Javacc, this
 * class can go away.
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/jexl3/internal/LongRange.java`
#### Snippet
```java
class AscLongIterator implements Iterator<Long> {
    /** The lower boundary. */
    private final long min;
    /** The upper boundary. */
    private final long max;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/jexl3/internal/LongRange.java`
#### Snippet
```java
    private final long min;
    /** The upper boundary. */
    private final long max;
    /** The current value. */
    private long cursor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/jexl3/internal/IntegerRange.java`
#### Snippet
```java
    private final int min;
    /** The upper boundary. */
    private final int max;
    /** The current value. */
    private int cursor;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/jexl3/internal/IntegerRange.java`
#### Snippet
```java
class AscIntegerIterator implements Iterator<Integer> {
    /** The lower boundary. */
    private final int min;
    /** The upper boundary. */
    private final int max;
```

### FieldCanBeLocal
Field can be converted to a local variable
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // not read currently
    private int state;
    /**
     * The current character.
```

## RuleId[id=TrivialIf]
### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/internal/LongRange.java`
#### Snippet
```java
            return false;
        }
        if (this.max != other.max) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/internal/Script.java`
#### Snippet
```java
            return false;
        }
        if (!Objects.equals(this.source, other.source)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/internal/Source.java`
#### Snippet
```java
            return false;
        }
        if (!Objects.equals(this.str, other.str)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/JexlFeatures.java`
#### Snippet
```java
            return false;
        }
        if (!Objects.equals(this.reservedNames, other.reservedNames)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/parser/FeatureController.java`
#### Snippet
```java
            return true;
        }
        if (child instanceof ASTNumberLiteral && ((ASTNumberLiteral) child).isInteger()) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
            return false;
        }
        if (features.isReservedName(image)) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
            }
            // declared through engine features ?
            if (getFeatures().namespaceTest().test(name)) {
                return true;
            }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/internal/IntegerRange.java`
#### Snippet
```java
            return false;
        }
        if (this.max != other.max) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            return first.isGlobalVar();
        }
        if (jjtGetParent() instanceof ASTReference) {
            return true;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
        }
        // field must be public
        if (!Modifier.isPublic(constructor.getModifiers())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
        }
        // method must be public
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
```

### TrivialIf
`if` statement can be simplified
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
        }
        // field must be public
        if (!Modifier.isPublic(field.getModifiers())) {
            return false;
        }
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `equals()` is identical to its super method
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Permissions.java`
#### Snippet
```java

        @Override
        public boolean equals(final Object o) {
            return o == this;
        }
```

### RedundantMethodOverride
Method `copy()` is identical to its super method
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java

        @Override
        protected Names copy() {
            return this;
        }
```

### RedundantMethodOverride
Method `copy()` is identical to its super method
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java

        @Override
        protected Names copy() {
            return this;
        }
```

### RedundantMethodOverride
Method `jjtClose()` is identical to its super method
in `src/main/java/org/apache/commons/jexl3/parser/JexlLexicalNode.java`
#### Snippet
```java

    @Override
    public void jjtClose() {

    }
```

## RuleId[id=AutoCloseableResource]
### AutoCloseableResource
'BufferedReader' used without 'try'-with-resources statement
in `src/main/java/org/apache/commons/jexl3/scripting/Main.java`
#### Snippet
```java
            out.println("Return value: "+value);
        } else {
            final BufferedReader console = read(null, null);
            String line;
            System.out.print("> ");
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTTernaryNode' covered by subsequent condition 'walk instanceof ASTNullpNode'
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
        for (JexlNode walk = node.jjtGetParent(); walk != null; walk = walk.jjtGetParent()) {
            // protect only the condition part of the ternary
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode
                    || walk instanceof ASTEQNode
```

### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTNullpNode' covered by subsequent condition 'walk instanceof ASTEQNode'
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
            // protect only the condition part of the ternary
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode
                    || walk instanceof ASTEQNode
                    || walk instanceof ASTNENode) {
```

### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTEQNode' covered by subsequent condition 'walk instanceof ASTNENode'
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode
                    || walk instanceof ASTEQNode
                    || walk instanceof ASTNENode) {
                return node == walk.jjtGetChild(0);
```

### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTReference' covered by subsequent condition 'walk instanceof ASTArrayAccess'
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
                return node == walk.jjtGetChild(0);
            }
            if (!(walk instanceof ASTReference || walk instanceof ASTArrayAccess)) {
                break;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTTernaryNode' covered by subsequent condition 'walk instanceof ASTNullpNode'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        for (JexlNode walk = node.jjtGetParent(); walk != null; walk = walk.jjtGetParent()) {
            // protect only the condition part of the ternary
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode) {
                return node == walk.jjtGetChild(0);
```

### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTReference' covered by subsequent condition 'walk instanceof ASTArrayAccess'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
                return node == walk.jjtGetChild(0);
            }
            if (!(walk instanceof ASTReference || walk instanceof ASTArrayAccess)) {
                break;
            }
```

### ConditionCoveredByFurtherCondition
Condition 'rsibling instanceof ASTMethodNode' covered by subsequent condition 'rsibling instanceof ASTFunctionNode'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
        if (rhs >= 0 && rhs < nsiblings) {
            JexlNode rsibling = parent.jjtGetChild(rhs);
            if (rsibling instanceof ASTMethodNode || rsibling instanceof ASTFunctionNode) {
                rsibling = rsibling.jjtGetChild(0);
            }
```

### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTIdentifier' covered by subsequent condition 'walk instanceof ASTArrayAccess'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
        JexlNode walk = this;
        do {
            if (walk instanceof ASTIdentifier
                || walk instanceof ASTIdentifierAccess
                || walk instanceof ASTArrayAccess) {
```

### ConditionCoveredByFurtherCondition
Condition 'walk instanceof ASTIdentifierAccess' covered by subsequent condition 'walk instanceof ASTArrayAccess'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
        do {
            if (walk instanceof ASTIdentifier
                || walk instanceof ASTIdentifierAccess
                || walk instanceof ASTArrayAccess) {
                return true;
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof ASTReference' covered by subsequent condition 'child instanceof ASTMapEntry'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            for (int n = 0; n < jjtGetNumChildren(); ++n) {
                final JexlNode child = jjtGetChild(n);
                if ((child instanceof ASTReference) || (child instanceof ASTMapEntry)) {
                    final boolean is = child.isConstant(true);
                    if (!is) {
```

### ConditionCoveredByFurtherCondition
Condition 'parent instanceof ASTMethodNode' covered by subsequent condition 'parent instanceof ASTFunctionNode'
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        if (node instanceof ASTIdentifier) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### ConditionCoveredByFurtherCondition
Condition 'parent instanceof ASTMethodNode' covered by subsequent condition 'parent instanceof ASTFunctionNode'
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        } else if (node instanceof ASTIdentifierAccess) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof ASTJexlScript' covered by subsequent condition 'child instanceof ASTIfStatement'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
     */
    private static boolean isStatement(final JexlNode child) {
        return child instanceof ASTJexlScript
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof ASTBlock' covered by subsequent condition 'child instanceof ASTIfStatement'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    private static boolean isStatement(final JexlNode child) {
        return child instanceof ASTJexlScript
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
```

### ConditionCoveredByFurtherCondition
Condition 'child instanceof ASTIfStatement' covered by subsequent condition 'child instanceof ASTWhileStatement'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
        return child instanceof ASTJexlScript
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param value` tag description is missing
in `src/main/java/org/apache/commons/jexl3/parser/SimpleNode.java`
#### Snippet
```java

    /** Sets this node value.
     * @param value
     */
    public void jjtSetValue(final Object value) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
         * @param context the context storing global variables
         * @return the expression value
         * @throws JexlException
         */
        protected final Object evaluate( final JexlContext context, final Frame frame, final JexlOptions options) {
```

### JavadocDeclaration
`@throws` tag description is missing
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
         * @param context the context storing global variables
         * @return the expression value
         * @throws JexlException
         */
        protected final TemplateExpression prepare(final JexlContext context, final Frame frame, final JexlOptions opts) {
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `ASSIGN_NODES` are queried, but never updated
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * The set of assignment operators as classes.
     */
    private static final Set<Class<? extends JexlNode>> ASSIGN_NODES = new HashSet<>(
        Arrays.asList(
            ASTAssignment.class,
```

## RuleId[id=UnnecessaryUnicodeEscape]
### UnnecessaryUnicodeEscape
Unicode escape sequence `\u0009` can be replaced with a tab character
in `src/main/java/org/apache/commons/jexl3/parser/StringParser.java`
#### Snippet
```java
                                case 't':
                                    strb.append('\t');
                                    break; // horizontal tab \u0009
                                case 'n':
                                    strb.append('\n');
```

### UnnecessaryUnicodeEscape
Unicode escape sequence `\u000A` can be replaced with a line feed character
in `src/main/java/org/apache/commons/jexl3/parser/StringParser.java`
#### Snippet
```java
                                case 'n':
                                    strb.append('\n');
                                    break; // line feed \u000A
                                // We don't support vertical tab. If needed, the unicode (\u000B) should be used instead
                                case 'f':
```

## RuleId[id=UnnecessaryContinue]
### UnnecessaryContinue
`continue` is unnecessary as the last statement in a loop
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
                   retval.append(ch);
                }
                continue;
          }
        }
```

## RuleId[id=UnnecessaryLocalVariable]
### UnnecessaryLocalVariable
Local variable `container` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/introspection/IndexedType.java`
#### Snippet
```java
        if (object != null && name != null && !name.isEmpty()) {
            final String base = name.substring(0, 1).toUpperCase() + name.substring(1);
            final String container = name;
            final Class<?> clazz = object.getClass();
            final Method[] getters = is.getMethods(object.getClass(), "get" + base);
```

### UnnecessaryLocalVariable
Local variable `permissions` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PermissionsParser.java`
#### Snippet
```java
                readPackages();
            }
            final Permissions permissions = new Permissions(wildcards, packages);
            return permissions;
        } finally {
```

## RuleId[id=RedundantFileCreation]
### RedundantFileCreation
`new File` is redundant
in `src/main/java/org/apache/commons/jexl3/scripting/Main.java`
#### Snippet
```java
                    fileName == null
                        ? System.in
                        : new FileInputStream(new File(fileName)),
                    charset == null
                        ? Charset.defaultCharset()
```

## RuleId[id=NullArgumentToVariableArgMethod]
### NullArgumentToVariableArgMethod
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * @since 3.3
     */
    JexlPermissions UNRESTRICTED = JexlPermissions.parse(null);
    /**
     * A restricted singleton.
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `node` initializer `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
     */
    public static class Info extends JexlInfo {
        JexlNode node = null;

        /**
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `walk instanceof ASTTernaryNode` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
        for (JexlNode walk = node.jjtGetParent(); walk != null; walk = walk.jjtGetParent()) {
            // protect only the condition part of the ternary
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode
                    || walk instanceof ASTEQNode
```

### ConstantValue
Condition `walk instanceof ASTTernaryNode || walk instanceof ASTNullpNode ...` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
        for (JexlNode walk = node.jjtGetParent(); walk != null; walk = walk.jjtGetParent()) {
            // protect only the condition part of the ternary
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode
                    || walk instanceof ASTEQNode
                    || walk instanceof ASTNENode) {
                return node == walk.jjtGetChild(0);
            }
```

### ConstantValue
Condition `node instanceof ASTMethodNode` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return "[" + stringifyPropertyValue(node.jjtGetChild(0)) + "]";
        }
        if (node instanceof ASTMethodNode) {
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
```

### ConstantValue
Value `node` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return "[" + stringifyPropertyValue(node.jjtGetChild(0)) + "]";
        }
        if (node instanceof ASTMethodNode) {
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
```

### ConstantValue
Condition `node instanceof ASTFunctionNode` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
        if (node instanceof ASTFunctionNode) {
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
```

### ConstantValue
Value `node` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
        if (node instanceof ASTFunctionNode) {
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
```

### ConstantValue
Condition `node instanceof ASTIdentifier` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
        if (node instanceof ASTIdentifier) {
            return ((ASTIdentifier) node).getName();
        }
```

### ConstantValue
Value `node` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return stringifyPropertyValue(node.jjtGetChild(0));
        }
        if (node instanceof ASTIdentifier) {
            return ((ASTIdentifier) node).getName();
        }
```

### ConstantValue
Condition `node instanceof ASTReference` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return ((ASTIdentifier) node).getName();
        }
        if (node instanceof ASTReference) {
            return stringifyProperty(node.jjtGetChild(0));
        }
```

### ConstantValue
Value `node` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return ((ASTIdentifier) node).getName();
        }
        if (node instanceof ASTReference) {
            return stringifyProperty(node.jjtGetChild(0));
        }
```

### ConstantValue
Value `node` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return stringifyProperty(node.jjtGetChild(0));
        }
        return stringifyPropertyValue(node);
    }

```

### ConstantValue
Condition `walk instanceof ASTTernaryNode` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        for (JexlNode walk = node.jjtGetParent(); walk != null; walk = walk.jjtGetParent()) {
            // protect only the condition part of the ternary
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode) {
                return node == walk.jjtGetChild(0);
```

### ConstantValue
Condition `walk instanceof ASTTernaryNode || walk instanceof ASTNullpNode` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        for (JexlNode walk = node.jjtGetParent(); walk != null; walk = walk.jjtGetParent()) {
            // protect only the condition part of the ternary
            if (walk instanceof ASTTernaryNode
                    || walk instanceof ASTNullpNode) {
                return node == walk.jjtGetChild(0);
            }
```

### ConstantValue
Condition `node instanceof ASTFunctionNode` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateScript.java`
#### Snippet
```java
    private static void collectPrintScope(final JexlNode node, final Map<Integer, JexlNode.Info> minfo) {
        final int nc = node.jjtGetNumChildren();
        if (node instanceof ASTFunctionNode && nc == 2) {
            // 0 must be the prefix jexl:
            final ASTIdentifier nameNode = (ASTIdentifier) node.jjtGetChild(0);
```

### ConstantValue
Condition `length < me` is always `false` when reached
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
        final int me = MAX_EXCHARLOC / 2;
        int begin = info.getColumn() - me;
        if (begin < 0 || length < me) {
            begin = 0;
        } else if (begin > length) {
```

### ConstantValue
Condition `untyped == null` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/ArrayBuilder.java`
#### Snippet
```java
    @Override
    public Object create(final boolean extended) {
        if (untyped == null) {
            return new Object[0];
        }
```

### ConstantValue
Condition `this instanceof ASTReference` is always `true`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
     */
    public boolean isSafeLhs(final boolean safe) {
        if (this instanceof ASTReference) {
            return jjtGetChild(0).isSafeLhs(safe);
        }
```

### ConstantValue
Condition `walk instanceof ASTIdentifier || walk instanceof ASTIdentifierAccess ...` is always `true`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
        JexlNode walk = this;
        do {
            if (walk instanceof ASTIdentifier
                || walk instanceof ASTIdentifierAccess
                || walk instanceof ASTArrayAccess) {
                return true;
            }
```

### ConstantValue
Condition `walk instanceof ASTArrayAccess` is always `true`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            if (walk instanceof ASTIdentifier
                || walk instanceof ASTIdentifierAccess
                || walk instanceof ASTArrayAccess) {
                return true;
            }
```

### ConstantValue
Condition `child instanceof ASTMapEntry` is always `false` when reached
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            for (int n = 0; n < jjtGetNumChildren(); ++n) {
                final JexlNode child = jjtGetChild(n);
                if ((child instanceof ASTReference) || (child instanceof ASTMapEntry)) {
                    final boolean is = child.isConstant(true);
                    if (!is) {
```

### ConstantValue
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            for (int n = 0; n < jjtGetNumChildren(); ++n) {
                final JexlNode child = jjtGetChild(n);
                if ((child instanceof ASTReference) || (child instanceof ASTMapEntry)) {
                    final boolean is = child.isConstant(true);
                    if (!is) {
```

### ConstantValue
Condition `type == BlockType.VERBATIM` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                    strb.append(line.subSequence(prefixLen, line.length()));
                }
            } else if (type == BlockType.VERBATIM) {
                // switch to directive if necessary
                prefixLen = startsWith(line, prefix);
```

### ConstantValue
Condition `parent instanceof ASTFunctionNode` is always `false` when reached
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        if (node instanceof ASTIdentifier) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### ConstantValue
Value `parent` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        if (node instanceof ASTIdentifier) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### ConstantValue
Condition `parent instanceof ASTFunctionNode` is always `false` when reached
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        } else if (node instanceof ASTIdentifierAccess) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### ConstantValue
Value `parent` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        } else if (node instanceof ASTIdentifierAccess) {
            final JexlNode parent = node.jjtGetParent();
            if (parent instanceof ASTMethodNode || parent instanceof ASTFunctionNode) {
                // skip identifiers for methods and functions
                collector.collect(null);
```

### ConstantValue
Condition `child instanceof ASTForeachStatement` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
```

### ConstantValue
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
```

### ConstantValue
Condition `child instanceof ASTWhileStatement` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
```

### ConstantValue
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
```

### ConstantValue
Condition `child instanceof ASTDoWhileStatement` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
    }
```

### ConstantValue
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTForeachStatement
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
    }
```

### ConstantValue
Condition `child instanceof ASTAnnotation` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
    }

```

### ConstantValue
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
    }

```

### ConstantValue
Condition `child instanceof ASTVar` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                        accept(assign.jjtGetChild(1), data);
                    }
                } else if (child instanceof ASTVar) {
                    final ASTVar var = (ASTVar) child;
                    builder.append(var.getName());
```

### ConstantValue
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                        accept(assign.jjtGetChild(1), data);
                    }
                } else if (child instanceof ASTVar) {
                    final ASTVar var = (ASTVar) child;
                    builder.append(var.getName());
```

### ConstantValue
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                } else {
                    // that's odd
                    accept(child, data);
                }
            }
```

### ConstantValue
Condition `objectNode instanceof ASTArrayAccess` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    break;
                }
            } else if (objectNode instanceof ASTArrayAccess) {
                antish = false;
                if (object == null) {
```

### ConstantValue
Value `objectNode` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    break;
                }
            } else if (objectNode instanceof ASTArrayAccess) {
                antish = false;
                if (object == null) {
```

### ConstantValue
Condition `numChildren > 1` is always `true` when reached
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            } else if (c != numChildren - 1) {
                // only the last one may be null
                ptyNode = c == 0 && numChildren > 1 ? node.jjtGetChild(1) : objectNode;
                break; //
            }
```

### ConstantValue
Condition `init instanceof ASTVar` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    loopVariable = (ASTVar) child;
                }
            } else if (init instanceof  ASTVar){
                loopVariable = (ASTVar) init;
            }
```

### ConstantValue
Value `init` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    loopVariable = (ASTVar) child;
                }
            } else if (init instanceof  ASTVar){
                loopVariable = (ASTVar) init;
            }
```

### ConstantValue
Condition `!(left instanceof ASTReference)` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                }
            }
        } else if (!(left instanceof ASTReference)) {
            throw new JexlException(left, "illegal assignment form 0");
        }
```

