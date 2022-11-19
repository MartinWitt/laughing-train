# commons-jexl 
 
# Bad smells
I found 484 bad smells with 26 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| RuleId[ruleID=ReturnNull] | 117 | false |
| RuleId[ruleID=RedundantFieldInitialization] | 67 | false |
| RuleId[ruleID=ConstantValue] | 46 | false |
| RuleId[ruleID=DataFlowIssue] | 33 | false |
| RuleId[ruleID=UnnecessaryFullyQualifiedName] | 25 | false |
| RuleId[ruleID=ExceptionNameDoesntEndWithException] | 17 | false |
| RuleId[ruleID=ZeroLengthArrayInitialization] | 15 | false |
| RuleId[ruleID=PublicFieldAccessedInSynchronizedContext] | 14 | false |
| RuleId[ruleID=ConditionCoveredByFurtherCondition] | 14 | false |
| RuleId[ruleID=NestedAssignment] | 10 | false |
| RuleId[ruleID=NonFinalFieldOfException] | 9 | false |
| RuleId[ruleID=SynchronizeOnThis] | 8 | false |
| RuleId[ruleID=UnnecessaryToStringCall] | 8 | true |
| RuleId[ruleID=ProtectedMemberInFinalClass] | 7 | true |
| RuleId[ruleID=UnnecessaryModifier] | 6 | true |
| RuleId[ruleID=ClassNameSameAsAncestorName] | 6 | false |
| RuleId[ruleID=EmptyMethod] | 6 | false |
| RuleId[ruleID=UnnecessarySuperQualifier] | 5 | false |
| RuleId[ruleID=StringEquality] | 4 | false |
| RuleId[ruleID=NonShortCircuitBoolean] | 4 | false |
| RuleId[ruleID=UNUSED_IMPORT] | 4 | false |
| RuleId[ruleID=UnnecessaryQualifierForThis] | 3 | false |
| RuleId[ruleID=BoundedWildcard] | 3 | false |
| RuleId[ruleID=RedundantMethodOverride] | 3 | false |
| RuleId[ruleID=UnusedAssignment] | 3 | false |
| RuleId[ruleID=IOResource] | 3 | false |
| RuleId[ruleID=DeprecatedIsStillUsed] | 3 | false |
| RuleId[ruleID=AssignmentToForLoopParameter] | 3 | false |
| RuleId[ruleID=StringEqualsEmptyString] | 3 | false |
| RuleId[ruleID=NonProtectedConstructorInAbstractClass] | 3 | true |
| RuleId[ruleID=AssignmentToMethodParameter] | 3 | false |
| RuleId[ruleID=JavaLangInvokeHandleSignature] | 2 | false |
| RuleId[ruleID=RegExpSimplifiable] | 2 | false |
| RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized] | 2 | false |
| RuleId[ruleID=UtilityClassWithoutPrivateConstructor] | 2 | false |
| RuleId[ruleID=TypeParameterHidesVisibleType] | 2 | false |
| RuleId[ruleID=SystemOutErr] | 2 | false |
| RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern] | 2 | false |
| RuleId[ruleID=EnumSwitchStatementWhichMissesCases] | 1 | false |
| RuleId[ruleID=UnnecessaryStringEscape] | 1 | false |
| RuleId[ruleID=CommentedOutCode] | 1 | false |
| RuleId[ruleID=AbstractClassNeverImplemented] | 1 | false |
| RuleId[ruleID=MismatchedCollectionQueryUpdate] | 1 | false |
| RuleId[ruleID=EqualsAndHashcode] | 1 | false |
| RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator] | 1 | false |
| RuleId[ruleID=NullArgumentToVariableArgMethod] | 1 | false |
| RuleId[ruleID=MismatchedJavadocCode] | 1 | false |
| RuleId[ruleID=UnusedLabel] | 1 | true |
| RuleId[ruleID=RedundantSuppression] | 1 | false |
| RuleId[ruleID=MissingDeprecatedAnnotation] | 1 | false |
| RuleId[ruleID=UnnecessaryContinue] | 1 | false |
| RuleId[ruleID=UnnecessaryLocalVariable] | 1 | true |
| RuleId[ruleID=RedundantFileCreation] | 1 | false |
## RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
### RuleId[ruleID=EnumSwitchStatementWhichMissesCases]
`switch (operator) { case EQ: case ARRAY_GET: case AR...` statement on enum type 'org.apache.commons.jexl3.JexlOperator' misses cases: 'ADD', 'SUBTRACT', 'MULTIPLY', 'DIVIDE', ...
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
    public boolean isStrict(JexlOperator operator) {
        if (operator != null) {
            switch (operator) {
                case EQ:
                case ARRAY_GET:
                case ARRAY_SET:
                case PROPERTY_GET:
                case PROPERTY_SET:
                case EMPTY:
                case SIZE:
                case CONTAINS:
                    return false;
            }
        }
        return isStrict();
```

## RuleId[ruleID=StringEquality]
### RuleId[ruleID=StringEquality]
String values are compared using `!=`, not 'equals()'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            className = null;
        }
        return className != null && className != JexlSandbox.NULL ? uberspect.getConstructor(className, args) : null;
    }

```

### RuleId[ruleID=StringEquality]
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

### RuleId[ruleID=StringEquality]
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

### RuleId[ruleID=StringEquality]
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

## RuleId[ruleID=UnnecessaryModifier]
### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * @since 3.3
     */
    public static final JexlPermissions UNRESTRICTED = JexlPermissions.parse(null);
    /**
     * A restricted singleton.
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * @since 3.3
     */
    public static final JexlPermissions UNRESTRICTED = JexlPermissions.parse(null);
    /**
     * A restricted singleton.
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * @since 3.3
     */
    public static final JexlPermissions UNRESTRICTED = JexlPermissions.parse(null);
    /**
     * A restricted singleton.
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `public` is redundant for interface members
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * </ul>
     */
    public static final JexlPermissions RESTRICTED = JexlPermissions.parse(
            "# Restricted Uberspect Permissions",
            "java.nio.*",
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `static` is redundant for interface fields
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * </ul>
     */
    public static final JexlPermissions RESTRICTED = JexlPermissions.parse(
            "# Restricted Uberspect Permissions",
            "java.nio.*",
```

### RuleId[ruleID=UnnecessaryModifier]
Modifier `final` is redundant for interface fields
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * </ul>
     */
    public static final JexlPermissions RESTRICTED = JexlPermissions.parse(
            "# Restricted Uberspect Permissions",
            "java.nio.*",
```

## RuleId[ruleID=UnnecessaryStringEscape]
### RuleId[ruleID=UnnecessaryStringEscape]
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

## RuleId[ruleID=JavaLangInvokeHandleSignature]
### RuleId[ruleID=JavaLangInvokeHandleSignature]
Cannot resolve method 'getModule'
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassTool.java`
#### Snippet
```java
            Class<?> modulec = ClassTool.class.getClassLoader().loadClass("java.lang.Module");
            if (modulec != null) {
                getModule = LOOKUP.findVirtual(Class.class, "getModule", MethodType.methodType(modulec));
                if (getModule != null) {
                    getPackageName = LOOKUP.findVirtual(Class.class, "getPackageName", MethodType.methodType(String.class));
```

### RuleId[ruleID=JavaLangInvokeHandleSignature]
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

## RuleId[ruleID=CommentedOutCode]
### RuleId[ruleID=CommentedOutCode]
Commented out code (3 lines)
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        final boolean cached = src.length() < cacheThreshold && cache != null;
        JexlFeatures features = parsingf != null? parsingf : DEFAULT_FEATURES;
       // if (features.getNameSpaces().isEmpty() && !functions.isEmpty()) {
       //     features = new JexlFeatures(features).nameSpaces(functions.keySet());
       // }
```

## RuleId[ruleID=UnnecessaryQualifierForThis]
### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `Interpreter` on 'this' is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            final JexlArithmetic jexla = arithmetic.options(context);
            if (jexla == arithmetic) {
                return cblock.jjtAccept(Interpreter.this, data);
            }
            if (!arithmetic.getClass().equals(jexla.getClass()) && logger.isWarnEnabled()) {
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `Interpreter` on 'this' is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                );
            }
            final Interpreter ii = new Interpreter(Interpreter.this, jexla);
            final Object r = cblock.jjtAccept(ii, data);
            if (ii.isCancelled()) {
```

### RuleId[ruleID=UnnecessaryQualifierForThis]
Qualifier `Interpreter` on 'this' is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            final Object r = cblock.jjtAccept(ii, data);
            if (ii.isCancelled()) {
                Interpreter.this.cancel();
            }
            return r;
```

## RuleId[ruleID=RegExpSimplifiable]
### RuleId[ruleID=RegExpSimplifiable]
`[\\s]` can be simplified to '\\s'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
     */
    protected static final Pattern QUOTED_IDENTIFIER =
            Pattern.compile("[\\s]|[\\p{Punct}&&[^@#$_]]");

    /**
```

### RuleId[ruleID=RegExpSimplifiable]
`[\\p{Punct}&&[^@#$_]]` can be simplified to '\\p{Punct}\&\&\[\^@#$_\]'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
     */
    protected static final Pattern QUOTED_IDENTIFIER =
            Pattern.compile("[\\s]|[\\p{Punct}&&[^@#$_]]");

    /**
```

## RuleId[ruleID=NonShortCircuitBoolean]
### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `cancelled.get() | Thread.currentThread().isInterrupted()`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
     */
    protected boolean isCancelled() {
        return cancelled.get() | Thread.currentThread().isInterrupted();
    }

```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `invoke &= name == null || ctorClass.getName().equals(name)`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ConstructorMethod.java`
#### Snippet
```java
                    }
                }
                invoke &= name == null || ctorClass.getName().equals(name);
                if (invoke) {
                    return ctor.newInstance(args);
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `cacheable &= !isavar`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                }
                // name is a variable, can't be cached
                cacheable &= !isavar;
            }
        } else if (functor instanceof ASTIdentifierAccess) {
```

### RuleId[ruleID=NonShortCircuitBoolean]
Non-short-circuit boolean expression `eq &= expr == prepared`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                }
                // keep track of TemplateExpression equivalence
                eq &= expr == prepared;
            }
            return eq ? this : builder.build(TemplateEngine.this, this);
```

## RuleId[ruleID=AbstractClassNeverImplemented]
### RuleId[ruleID=AbstractClassNeverImplemented]
Abstract class `JexlParser` has no concrete subclass
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
 * The base class for parsing, manages the parameter/local variable frame.
 */
public abstract class JexlParser extends StringParser {
    /**
     * The associated controller.
```

## RuleId[ruleID=BoundedWildcard]
### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/EnumerationIterator.java`
#### Snippet
```java
     * @param enumer  The Enumeration to wrap.
     */
    public EnumerationIterator(final Enumeration<T> enumer) {
        enumeration = enumer;
    }
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends NoJexlPackage`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Permissions.java`
#### Snippet
```java
     * @param nojexl the NoJexl external map
     */
    protected Permissions(Set<String> perimeter, Map<String, NoJexlPackage> nojexl) {
        this.allowed = perimeter;
        this.packages = nojexl;
```

### RuleId[ruleID=BoundedWildcard]
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodKey.java`
#### Snippet
```java
         * @return an ambiguous exception
         */
        private AmbiguousException ambiguousException (final Class<?>[] classes, final Deque<T> applicables) {
            boolean severe = false;
            int instanceArgCount = 0; // count the number of valid instances, aka not null
```

## RuleId[ruleID=RedundantMethodOverride]
### RuleId[ruleID=RedundantMethodOverride]
Method `jjtClose()` is identical to its super method
in `src/main/java/org/apache/commons/jexl3/parser/JexlLexicalNode.java`
#### Snippet
```java

    @Override
    public void jjtClose() {

    }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `copy()` is identical to its super method
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java

        @Override
        protected Names copy() {
            return this;
        }
```

### RuleId[ruleID=RedundantMethodOverride]
Method `copy()` is identical to its super method
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java

        @Override
        protected Names copy() {
            return this;
        }
```

## RuleId[ruleID=ClassNameSameAsAncestorName]
### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Exception` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/jexl3/JxltEngine.java`
#### Snippet
```java
     * The sole type of (runtime) exception the JxltEngine can throw.
     */
    public static class Exception extends JexlException {

        /** Serial version UID. */
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Funcall` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
     * Cached function call.
     */
    protected static class Funcall implements JexlNode.Funcall {
        /** Whether narrow should be applied to arguments. */
        protected final boolean narrow;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `Callable` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/jexl3/internal/Script.java`
#### Snippet
```java
     * Implements the Future and Callable interfaces to help delegation.
     */
    public class Callable implements java.util.concurrent.Callable<Object> {
        /** The actual interpreter. */
        protected final Interpreter interpreter;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `SetBuilder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/jexl3/internal/SetBuilder.java`
#### Snippet
```java
 * Helper class to create set literals.
 */
public class SetBuilder implements JexlArithmetic.SetBuilder {
    /** The set being created. */
    protected final Set<Object> set;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `MapBuilder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/jexl3/internal/MapBuilder.java`
#### Snippet
```java
 * Helper class to create map literals.
 */
public class MapBuilder implements JexlArithmetic.MapBuilder {
    /** The map being created. */
    protected final Map<Object, Object> map;
```

### RuleId[ruleID=ClassNameSameAsAncestorName]
Class name `ArrayBuilder` is the same as one of its superclass' names
in `src/main/java/org/apache/commons/jexl3/internal/ArrayBuilder.java`
#### Snippet
```java
 * Helper class to create typed arrays.
 */
public class ArrayBuilder implements JexlArithmetic.ArrayBuilder {
    /** The number of primitive types. */
    private static final int PRIMITIVE_SIZE = 8;
```

## RuleId[ruleID=UnnecessarySuperQualifier]
### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/TemplateDebugger.java`
#### Snippet
```java
        builder.append(expr.isImmediate() ? '$' : '#');
        builder.append('{');
        super.accept(expr.node, data);
        builder.append('}');
        return data;
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/TemplateDebugger.java`
#### Snippet
```java
     */
    private Object visit(final NestedExpression expr, final Object data) {
        super.accept(expr.node, data);
        return data;
    }
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/TemplateDebugger.java`
#### Snippet
```java
        builder.append(expr.isImmediate() ? '$' : '#');
        builder.append('{');
        super.accept(expr.node, data);
        builder.append('}');
        return data;
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/SoftCache.java`
#### Snippet
```java
            @Override
            protected boolean removeEldestEntry(final Map.Entry<K, V> eldest) {
                return super.size() > cacheSize;
            }
        };
```

### RuleId[ruleID=UnnecessarySuperQualifier]
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/jexl3/internal/LexicalFrame.java`
#### Snippet
```java
            final int argc = frame.getScope().getArgCount();
            for (int a = 0; a < argc; ++a) {
                super.addSymbol(a);
            }
        }
```

## RuleId[ruleID=UNUSED_IMPORT]
### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.apache.commons.jexl3.JexlException;`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java

import org.apache.commons.jexl3.JexlArithmetic;
import org.apache.commons.jexl3.JexlException;
import org.apache.commons.jexl3.JexlInfo;
import org.apache.commons.jexl3.internal.LexicalScope;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.apache.commons.jexl3.internal.LexicalScope;`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
import org.apache.commons.jexl3.JexlException;
import org.apache.commons.jexl3.JexlInfo;
import org.apache.commons.jexl3.internal.LexicalScope;
import org.apache.commons.jexl3.internal.Scope;
import org.apache.commons.jexl3.internal.ScriptVisitor;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.apache.commons.jexl3.internal.Scope;`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
import org.apache.commons.jexl3.JexlInfo;
import org.apache.commons.jexl3.internal.LexicalScope;
import org.apache.commons.jexl3.internal.Scope;
import org.apache.commons.jexl3.internal.ScriptVisitor;
import org.apache.commons.jexl3.introspection.JexlMethod;
```

### RuleId[ruleID=UNUSED_IMPORT]
Unused import `import org.apache.commons.jexl3.internal.ScriptVisitor;`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
import org.apache.commons.jexl3.internal.LexicalScope;
import org.apache.commons.jexl3.internal.Scope;
import org.apache.commons.jexl3.internal.ScriptVisitor;
import org.apache.commons.jexl3.introspection.JexlMethod;
import org.apache.commons.jexl3.introspection.JexlPropertyGet;
```

## RuleId[ruleID=NestedAssignment]
### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/scripting/Main.java`
#### Snippet
```java
            String line;
            System.out.print("> ");
            while(null != (line=console.readLine())){
                try {
                    final Object value = engine.eval(line);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/internal/FqcnResolver.java`
#### Snippet
```java
    String getQualifiedName(String name) {
        String fqcn;
        if (parent != null && (fqcn = parent.getQualifiedName(name)) != null) {
            return  fqcn;
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append('\n');
            }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
        int cl = 1;
        try {
            while ((line = reader.readLine()) != null) {
                if (cl < froml || cl > tol) {
                    buffer.append(line).append('\n');
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    setContextVariable(propertyNode, name, right);
                } else {
                    final Object self = actual = context.get(ant.toString());
                    final JexlNode pnode = propertyNode;
                    final Consumer<Object> assign = r -> setContextVariable(pnode, name, r);
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
                continue;
             default:
                if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                   final String s = "0000" + Integer.toString(ch, 16);
                   retval.append("//u").append(s.substring(s.length() - 4));
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodKey.java`
#### Snippet
```java
        final int size;
        // CSOFF: InnerAssignment
        if (args != null && (size = args.length) > 0) {
            this.params = new Class<?>[size];
            for (int p = 0; p < size; ++p) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodKey.java`
#### Snippet
```java
        final int size;
        // CSOFF: InnerAssignment
        if (args != null && (size = args.length) > 0) {
            this.params = new Class<?>[size];
            for (int p = 0; p < size; ++p) {
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
        final StringBuilder buffer = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            buffer.append(line).append('\n');
        }
```

### RuleId[ruleID=NestedAssignment]
Result of assignment expression used
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                boolean eol = false;
                try {
                    while ((c = reader.read()) >= 0) {
                        if (eol) {// && (c != '\n' && c != '\r')) {
                            reader.reset();
```

## RuleId[ruleID=MismatchedCollectionQueryUpdate]
### RuleId[ruleID=MismatchedCollectionQueryUpdate]
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

## RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `ENGINE` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
     * <p>A single soft-reference JEXL engine and JexlUberspect is shared by all instances of JexlScriptEngine.</p>
     */
    private static Reference<JexlEngine> ENGINE = null;

    /**
```

### RuleId[ruleID=FieldAccessedSynchronizedAndUnsynchronized]
Field `literal` is accessed in both synchronized and unsynchronized contexts
in `src/main/java/org/apache/commons/jexl3/parser/NumberParser.java`
#### Snippet
```java
public final class NumberParser implements Serializable {
    /** The type literal value. */
    private Number literal = null;
    /** The expected class. */
    private Class<? extends Number> clazz = null;
```

## RuleId[ruleID=EmptyMethod]
### RuleId[ruleID=EmptyMethod]
Empty method overrides empty method
in `src/main/java/org/apache/commons/jexl3/parser/JexlLexicalNode.java`
#### Snippet
```java

    @Override
    public void jjtClose() {

    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
    }

    public void jjtSetLastToken(final Token t) {
        // nothing
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * @throws ParseException subclasses may throw this
     */
    protected void Identifier(final boolean top) throws ParseException {
        // Overridden by generated code
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * @param node the node
     */
    protected void jjtreeOpenNodeScope(final JexlNode node) {
        // nothing
    }
```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/org/apache/commons/jexl3/parser/SimpleNode.java`
#### Snippet
```java

    @Override
    public void jjtOpen() {
    }

```

### RuleId[ruleID=EmptyMethod]
The method is empty
in `src/main/java/org/apache/commons/jexl3/parser/SimpleNode.java`
#### Snippet
```java
     * @param str the string to output
     */
    protected void dumpOut(String str) {
        // override to obtain an output
    }
```

## RuleId[ruleID=RedundantFieldInitialization]
### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlOptions.java`
#### Snippet
```java
    private static int DEFAULT = 1 /*<< CANCELLABLE*/ | 1 << STRICT | 1 << ANTISH | 1 << SAFE;
    /** The arithmetic math context. */
    private MathContext mathContext = null;
    /** The arithmetic math scale. */
    private int mathScale = Integer.MIN_VALUE;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/FeatureController.java`
#### Snippet
```java
public class FeatureController extends ScriptVisitor {
    /** The set of features. */
    private JexlFeatures features = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTStringLiteral.java`
#### Snippet
```java
public final class ASTStringLiteral extends JexlNode implements JexlNode.Constant<String> {
    /** The actual literal value; the inherited 'value' member may host a cached getter. */
    private String literal = null;

    ASTStringLiteral(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
     * <p>A single soft-reference JEXL engine and JexlUberspect is shared by all instances of JexlScriptEngine.</p>
     */
    private static Reference<JexlEngine> ENGINE = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** The features. */
    private JexlFeatures features = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** Whether interrupt throws JexlException.Cancel. */
    private Boolean cancellable = null;

    /** The options. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** The class loader. */
    private ClassLoader loader = null;

    /** The features. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** The sandbox. */
    private JexlSandbox sandbox = null;

    /** The Log to which all JexlEngine messages will be logged. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** Whether error messages will carry debugging information. */
    private Boolean debug = null;

    /** Whether interrupt throws JexlException.Cancel. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** The Log to which all JexlEngine messages will be logged. */
    private Log logger = null;

    /** Whether error messages will carry debugging information. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** The JexlUberspect instance. */
    private JexlUberspect uberspect = null;

    /** The {@link JexlUberspect} resolver strategy. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** The {@link JexlArithmetic} instance. */
    private JexlArithmetic arithmetic = null;

    /** The cache size. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/JexlBuilder.java`
#### Snippet
```java

    /** The {@link JexlUberspect} resolver strategy. */
    private JexlUberspect.ResolverStrategy strategy = null;

    /** The set of permissions. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        final boolean cacheable;
        /** Whether arguments have been narrowed.  */
        boolean narrow = false;
        /** The method to call. */
        JexlMethod vm = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        JexlMethod vm = null;
        /** The method invocation target. */
        Object target = null;
        /** The actual arguments. */
        Object[] argv = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        Object target = null;
        /** The actual arguments. */
        Object[] argv = null;
        /** The cacheable funcall if any. */
        Funcall funcall = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        Object[] argv = null;
        /** The cacheable funcall if any. */
        Funcall funcall = null;

        /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        boolean narrow = false;
        /** The method to call. */
        JexlMethod vm = null;
        /** The method invocation target. */
        Object target = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
     * during evaluation.
     */
    private Map<String, Integer> namedVariables = null;
    /**
     * The map of local captured variables to parent scope variables, ie closure.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
     * The map of local captured variables to parent scope variables, ie closure.
     */
    private Map<Integer, Integer> capturedVariables = null;
    /**
     * Let symbols.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
     * Let symbols.
     */
    private LexicalScope lexicalVariables = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/NumberParser.java`
#### Snippet
```java
    private Number literal = null;
    /** The expected class. */
    private Class<? extends Number> clazz = null;
    /** JEXL locale-neutral big decimal format. */
    static final DecimalFormat BIGDF = new DecimalFormat("0.0b", new DecimalFormatSymbols(Locale.ENGLISH));
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/NumberParser.java`
#### Snippet
```java
public final class NumberParser implements Serializable {
    /** The type literal value. */
    private Number literal = null;
    /** The expected class. */
    private Class<? extends Number> clazz = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
         * The node that started the collect.
         */
        private JexlNode root = null;
        /**
         * Whether constant array-access is considered equivalent to dot-access;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
     * The default jxlt engine.
     */
    protected volatile TemplateEngine jxlt = null;
    /**
     * Collect all or only dot references.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTJxltLiteral.java`
#### Snippet
```java
public final class ASTJxltLiteral extends JexlNode {
    /** The actual literal value; the inherited 'value' member may host a cached template expression. */
    private String literal = null;

    ASTJxltLiteral(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifierAccess.java`
#### Snippet
```java
public class ASTIdentifierAccess extends JexlNode {
    private String name = null;
    private Integer identifier = null;

    ASTIdentifierAccess(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifierAccess.java`
#### Snippet
```java
 */
public class ASTIdentifierAccess extends JexlNode {
    private String name = null;
    private Integer identifier = null;

```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTQualifiedIdentifier.java`
#### Snippet
```java
 */
public class ASTQualifiedIdentifier extends JexlNode {
    protected String name = null;

    ASTQualifiedIdentifier(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/introspection/IndexedType.java`
#### Snippet
```java
    private final Method[] getters;
    /** Last get method used. */
    private volatile Method get = null;
    /** The array of setter methods. */
    private final Method[] setters;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/introspection/IndexedType.java`
#### Snippet
```java
    private final Method[] setters;
    /** Last set method used. */
    private volatile Method set = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/LexicalScope.java`
#### Snippet
```java
     * Number of symbols.
     */
    protected int count = 0;
    /**
     * The mask of symbols in the scope.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/LexicalScope.java`
#### Snippet
```java
     * Symbols after bit 64 (aka symbol 32 when 2 bits per symbol).
     */
    protected BitSet moreSymbols = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0L` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/LexicalScope.java`
#### Snippet
```java
     * The mask of symbols in the scope.
     */
    protected long symbols = 0L;
    /**
     * Symbols after bit 64 (aka symbol 32 when 2 bits per symbol).
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifier.java`
#### Snippet
```java
 */
public class ASTIdentifier extends JexlNode {
    protected String name = null;
    protected int symbol = -1;
    protected int flags = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifier.java`
#### Snippet
```java
    protected String name = null;
    protected int symbol = -1;
    protected int flags = 0;

    /** The redefined variable flag. */
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTAnnotation.java`
#### Snippet
```java
 */
public class ASTAnnotation extends JexlNode {
    private String name = null;

    ASTAnnotation(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTArrayLiteral.java`
#### Snippet
```java
public final class ASTArrayLiteral extends JexlNode {
    /** Whether this array is constant or not. */
    private boolean constant = false;

    ASTArrayLiteral(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTRegexLiteral.java`
#### Snippet
```java
    /** The actual literal value; the inherited 'value' member may host a cached getter. */

    private Pattern literal = null;

    ASTRegexLiteral(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/SoftCache.java`
#### Snippet
```java
     * The soft reference to the cache map.
     */
    private SoftReference<Map<K, V>> ref = null;
    /**
     * The cache r/w lock.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlLexicalNode.java`
#### Snippet
```java
 */
public class JexlLexicalNode extends JexlNode implements JexlParser.LexicalUnit {
    private LexicalScope lexicalScope = null;

    public JexlLexicalNode(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
public class Interpreter extends InterpreterBase {
    /** Frame height. */
    protected int fp = 0;
    /** Symbol values. */
    protected final Frame frame;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
    protected final Frame frame;
    /** Block micro-frames. */
    protected LexicalFrame block = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
        private final Object data;
        /** Tracking whether we processed the annotation. */
        private boolean processed = false;

        /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTMapLiteral.java`
#### Snippet
```java
public final class ASTMapLiteral extends JexlNode {
    /** Whether this array is constant or not. */
    private boolean constant = false;

    ASTMapLiteral(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTSetLiteral.java`
#### Snippet
```java
public final class ASTSetLiteral extends JexlNode {
    /** Whether this set is constant or not. */
    private boolean constant = false;

    ASTSetLiteral(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
     */
    public static class Info extends JexlInfo {
        JexlNode node = null;

        /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
    static class AllowSet extends Names {
        /** The map of controlled names and aliases. */
        private Map<String, String> names = null;

        @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
    static class BlockSet extends Names {
        /** The set of controlled names. */
        private Set<String> names = null;

        @Override
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/LexicalFrame.java`
#### Snippet
```java
     * The stack of values in the lexical frame.
     */
    private Deque<Object> stack = null;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * The current lexical block.
     */
    protected LexicalUnit block = null;
    /**
     * Stack of lexical blocks.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * The known namespaces.
     */
    protected Set<String> namespaces = null;
    /**
     * The number of nested loops.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * The list of pragma declarations.
     */
    protected Map<String, Object> pragmas = null;
    /**
     * The known namespaces.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * The basic source info.
     */
    protected JexlInfo info = null;
    /**
     * The source being processed.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * The source being processed.
     */
    protected String source = null;
    /**
     * The map of named registers aka script parameters.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * The number of nested loops.
     */
    protected int loopCount = 0;
    /**
     * Stack of parsing loop counts.
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
     * as an offset in the registers array used during evaluation.</p>
     */
    protected Scope scope = null;
    /**
     * When parsing inner functions/lambda, need to stack the scope (sic).
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/ArrayBuilder.java`
#### Snippet
```java

    /** The intended class array. */
    protected Class<?> commonClass = null;
    /** Whether the array stores numbers. */
    protected boolean isNumber = true;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/ArrayBuilder.java`
#### Snippet
```java
    protected final Object[] untyped;
    /** Number of added items. */
    protected int added = 0;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
    private static final long serialVersionUID = 202112111533L;
    /** The pragmas. */
    private Map<String, Object> pragmas = null;
    /** Features. */
    private transient JexlFeatures features = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
    private Map<String, Object> pragmas = null;
    /** Features. */
    private transient JexlFeatures features = null;
    /** The script scope. */
    private transient Scope scope = null;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
    private transient JexlFeatures features = null;
    /** The script scope. */
    private transient Scope scope = null;

    public ASTJexlScript(final int id) {
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    protected final StringBuilder builder = new StringBuilder();
    /** The cause of the issue to debug. */
    protected JexlNode cause = null;
    /** The starting character location offset of the cause in the builder. */
    protected int start = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    protected int end = 0;
    /** The indentation level. */
    protected int indentLevel = 0;
    /** Perform indentation?. */
    protected int indent = 2;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    protected String lf = "\n";
    /** Pragmas out. */
    protected boolean outputPragmas = false;

    /**
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    protected int start = 0;
    /** The ending character location offset of the cause in the builder. */
    protected int end = 0;
    /** The indentation level. */
    protected int indentLevel = 0;
```

### RuleId[ruleID=RedundantFieldInitialization]
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    protected JexlNode cause = null;
    /** The starting character location offset of the cause in the builder. */
    protected int start = 0;
    /** The ending character location offset of the cause in the builder. */
    protected int end = 0;
```

## RuleId[ruleID=EqualsAndHashcode]
### RuleId[ruleID=EqualsAndHashcode]
Class has `equals()` defined but does not define `hashCode()`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Permissions.java`
#### Snippet
```java
     * Equivalent of @NoJexl on a class in a package.
     */
    static class NoJexlPackage {
        // the NoJexl class names
        protected Map<String, NoJexlClass> nojexl;
```

## RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
### RuleId[ruleID=CallToStringConcatCanBeReplacedByOperator]
Call to `concat()` can be replaced with '+' expression
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
            }
        }
        return (left == null? "" : toString(left)).concat(right == null ? "" : toString(right));
    }

```

## RuleId[ruleID=ExceptionNameDoesntEndWithException]
### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Cancel` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Cancel extends JexlException {
        /**
         * Creates a new instance of Cancel.
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Method` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Method extends JexlException {
        private static final long serialVersionUID = 20210606123909L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Ambiguous` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Ambiguous extends Parsing {
        private static final long serialVersionUID = 20210606123903L;
        /** The mark at which ambiguity might stop and recover. */
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Operator` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Operator extends JexlException {
        private static final long serialVersionUID = 20210606124100L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Return` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Return extends JexlException {
        private static final long serialVersionUID = 20210606124102L;

```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Property` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Property extends JexlException {
        private static final long serialVersionUID = 20210606123908L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Continue` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Continue extends JexlException {
        private static final long serialVersionUID = 20210606124104L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `StackOverflow` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.2
     */
    public static class StackOverflow extends JexlException {
        private static final long serialVersionUID = 20210606123904L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Tokenization` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Tokenization extends JexlException {
        private static final long serialVersionUID = 20210606123901L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Parsing` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Parsing extends JexlException {
        private static final long serialVersionUID = 20210606123902L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `TryFailed` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.2
     */
    public static class TryFailed extends JexlException {
        private static final long serialVersionUID = 20210606124105L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Variable` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Variable extends JexlException {
        private static final long serialVersionUID = 20210606123907L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Feature` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.2
     */
    public static class Feature extends Parsing {
        private static final long serialVersionUID = 20210606123906L;
        /** The feature code. */
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Assignment` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Assignment extends Parsing {
        private static final long serialVersionUID = 20210606123905L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Break` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.0
     */
    public static class Break extends JexlException {
        private static final long serialVersionUID = 20210606124103L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `Annotation` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     * @since 3.1
     */
    public static class Annotation extends JexlException {
        private static final long serialVersionUID = 20210606124101L;
        /**
```

### RuleId[ruleID=ExceptionNameDoesntEndWithException]
Exception class name `NullOperand` does not end with 'Exception'
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java

    /** Marker class for null operand exceptions. */
    public static class NullOperand extends ArithmeticException {}

    /** Double.MAX_VALUE as BigDecimal. */
```

## RuleId[ruleID=ZeroLengthArrayInitialization]
### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
     */
    public String[] getSymbols() {
        return namedVariables != null ? namedVariables.keySet().toArray(new String[0]) : EMPTY_STRS;
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
            }
            if (!captured.isEmpty()) {
                return captured.toArray(new String[0]);
            }
        }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
            }
        }
        return locals.toArray(new String[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
                }
            }
            xthrow.setStackTrace(stackJexl.toArray(new StackTraceElement[0]));
        }
        return xthrow;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/TemplateDebugger.java`
#### Snippet
```java
        final TemplateScript ts = (TemplateScript) jt;
        // ensure expr is not null for templates
        this.exprs = ts.getExpressions() == null? new TemplateExpression[0] : ts.getExpressions();
        this.script = ts.getScript();
        start = 0;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassMap.java`
#### Snippet
```java
     */
    String[] getFieldNames() {
        return fieldCache.keySet().toArray(new String[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassMap.java`
#### Snippet
```java
                    end += 1;
                }
                final Method[] lmn = lm.subList(start, end).toArray(new Method[0]);
                cache.byName.put(name, lmn);
                start = end;
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassMap.java`
#### Snippet
```java
     */
    String[] getMethodNames() {
        return byName.keySet().toArray(new String[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
    public String[] getMethodNames(final Class<?> c) {
        if (c == null) {
            return new String[0];
        }
        final ClassMap classMap = getMap(c);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
                }
                // try to find one
                ctor = key.getMostSpecificConstructor(l.toArray(new Constructor<?>[0]));
                if (ctor != null) {
                    constructorsMap.put(key, ctor);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
    public String[] getFieldNames(final Class<?> c) {
        if (c == null) {
            return new String[0];
        }
        final ClassMap classMap = getMap(c);
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/ArrayBuilder.java`
#### Snippet
```java
    public Object create(final boolean extended) {
        if (untyped == null) {
            return new Object[0];
        }
        if (extended) {
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/TemplateScript.java`
#### Snippet
```java
            }
        }
        source = blocks.toArray(new Block[0]);
        exprs = uexprs.toArray(new TemplateExpression[0]);
    }
```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/TemplateScript.java`
#### Snippet
```java
        }
        source = blocks.toArray(new Block[0]);
        exprs = uexprs.toArray(new TemplateExpression[0]);
    }

```

### RuleId[ruleID=ZeroLengthArrayInitialization]
Allocation of zero length array
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
        CompositeExpression(final int[] counters, final List<TemplateExpression> list, final TemplateExpression src) {
            super(src);
            this.exprs = list.toArray(new TemplateExpression[0]);
            this.meta = (counters[ExpressionType.DEFERRED.getIndex()] > 0 ? 2 : 0)
                    | (counters[ExpressionType.IMMEDIATE.getIndex()] > 0 ? 1 : 0);
```

## RuleId[ruleID=NonFinalFieldOfException]
### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `after` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/ParseException.java`
#### Snippet
```java
     * Last correct input before error occurs.
     */
    private String after = "";
    /**
     * Error line.
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `line` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/ParseException.java`
#### Snippet
```java
     * Error line.
     */
    private int line = -1;
    /**
     * Error column.
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `column` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/ParseException.java`
#### Snippet
```java
     * Error column.
     */
    private int column = -1;

    /**
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `state` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
     */
    @SuppressWarnings("unused") // not read currently
    private int state;
    /**
     * The current character.
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `column` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
     * Error column.
     */
    private int column;

    /**
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `current` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
     * The current character.
     */
    private char current;
    /**
     * Last correct input before error occurs.
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `line` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
     * Error line.
     */
    private int line;
    /**
     * Error column.
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `after` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
     * Last correct input before error occurs.
     */
    private String after;
    /**
     * Whether eof was reached whilst expecting more input.
```

### RuleId[ruleID=NonFinalFieldOfException]
Non-final field `eof` of exception class
in `src/main/java/org/apache/commons/jexl3/parser/TokenMgrException.java`
#### Snippet
```java
     * Whether eof was reached whilst expecting more input.
     */
    private boolean eof;
    /**
     * Error line.
```

## RuleId[ruleID=SynchronizeOnThis]
### RuleId[ruleID=SynchronizeOnThis]
Lock operations on a class may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
        JexlEngine engine = ENGINE != null? ENGINE.get() : null;
        if (engine == null) {
            synchronized (JexlScriptEngineFactory.class) {
                engine = ENGINE != null? ENGINE.get() : null;
                if (engine == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        Object namespace;
        // check whether this namespace is a functor
        synchronized (this) {
            if (functors != null) {
                namespace = functors.get(prefix);
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        // got a functor, store it and return it
        if (functor != null) {
            synchronized (this) {
                if (functors == null) {
                    functors = new HashMap<>();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        TemplateEngine e = jxlt;
        if (e == null) {
            synchronized(this) {
                e = jxlt;
                if (e == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
        if (intro == null) {
            // double checked locking is ok (fixed by Java 5 memory model).
            synchronized (this) {
                intro = ref.get();
                if (intro == null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
    @Override
    public void setClassLoader(final ClassLoader nloader) {
        synchronized (this) {
            Introspector intro = ref.get();
            if (intro != null) {
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/internal/Script.java`
#### Snippet
```java
        @Override
        public Object call() throws Exception {
            synchronized(this) {
                if (result == interpreter) {
                    checkCacheVersion();
```

### RuleId[ruleID=SynchronizeOnThis]
Lock operations on 'this' may have unforeseen side-effects
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            // clean functors at top level
            if (fp == 0) {
                synchronized (this) {
                    if (functors != null) {
                        for (final Object functor : functors.values()) {
```

## RuleId[ruleID=NullArgumentToVariableArgMethod]
### RuleId[ruleID=NullArgumentToVariableArgMethod]
Confusing argument `null`, unclear if a varargs or non-varargs call is desired
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
     * @since 3.3
     */
    public static final JexlPermissions UNRESTRICTED = JexlPermissions.parse(null);
    /**
     * A restricted singleton.
```

## RuleId[ruleID=UnusedAssignment]
### RuleId[ruleID=UnusedAssignment]
Variable `features` initializer `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/FeatureController.java`
#### Snippet
```java
public class FeatureController extends ScriptVisitor {
    /** The set of features. */
    private JexlFeatures features = null;

    /**
```

### RuleId[ruleID=UnusedAssignment]
The value `context.get(ant.toString())` assigned to `actual` is never used
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    setContextVariable(propertyNode, name, right);
                } else {
                    final Object self = actual = context.get(ant.toString());
                    final JexlNode pnode = propertyNode;
                    final Consumer<Object> assign = r -> setContextVariable(pnode, name, r);
```

### RuleId[ruleID=UnusedAssignment]
Variable `node` initializer `null` is redundant
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
     */
    public static class Info extends JexlInfo {
        JexlNode node = null;

        /**
```

## RuleId[ruleID=ConstantValue]
### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Value `node` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            return stringifyProperty(node.jjtGetChild(0));
        }
        return stringifyPropertyValue(node);
    }

```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Condition `left instanceof ASTReference` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                }
            }
        } else if (!(left instanceof ASTReference)) {
            throw new JexlException(left, "illegal assignment form 0");
        }
```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Condition `child instanceof ASTMapEntry` is always `false`
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
                        return false;
                    }
                } else if (child instanceof ASTMapEntry) {
                    final boolean is = child.isConstant(true);
                    if (!is) {
```

### RuleId[ruleID=ConstantValue]
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
                        return false;
                    }
                } else if (child instanceof ASTMapEntry) {
                    final boolean is = child.isConstant(true);
                    if (!is) {
```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Condition `actuals.length > 0` is always `true` when reached
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodKey.java`
#### Snippet
```java

            // more arguments given than the method accepts; check for varargs
            if (formals.length > 0 && actuals.length > 0) {
                // check that they all match up to the last method arg
                for (int i = 0; i < formals.length - 1; ++i) {
```

### RuleId[ruleID=ConstantValue]
Condition `actual != null` is always `true`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodKey.java`
#### Snippet
```java
        /* Check for vararg conversion. */
        if (possibleVarArg && formal.isArray()) {
            if (actual != null && actual.isArray()) {
                actual = actual.getComponentType();
            }
```

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
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

### RuleId[ruleID=ConstantValue]
Condition `child instanceof ASTAnnotation` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
    }

```

### RuleId[ruleID=ConstantValue]
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                || child instanceof ASTWhileStatement
                || child instanceof ASTDoWhileStatement
                || child instanceof ASTAnnotation;
    }

```

### RuleId[ruleID=ConstantValue]
Condition `child instanceof ASTVar` is always `false`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                        accept(assign.jjtGetChild(1), data);
                    }
                } else if (child instanceof ASTVar) {
                    ASTVar var = (ASTVar) child;
                    builder.append(var.getName());
```

### RuleId[ruleID=ConstantValue]
Value `child` is always 'null'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                        accept(assign.jjtGetChild(1), data);
                    }
                } else if (child instanceof ASTVar) {
                    ASTVar var = (ASTVar) child;
                    builder.append(var.getName());
```

### RuleId[ruleID=ConstantValue]
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

## RuleId[ruleID=IOResource]
### RuleId[ruleID=IOResource]
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
            reader = (BufferedReader) scriptReader;
        } else {
            reader = new BufferedReader(scriptReader);
        }
        try {
```

### RuleId[ruleID=IOResource]
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/jexl3/JexlException.java`
#### Snippet
```java
     */
    public static String sliceSource(final String src, final int froml, final int fromc, final int tol, final int toc) {
        final BufferedReader reader = new BufferedReader(new StringReader(src));
        final StringBuilder buffer = new StringBuilder();
        String line;
```

### RuleId[ruleID=IOResource]
'BufferedReader' should be opened in front of a 'try' block and closed in the corresponding 'finally' block
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
        if (src != null && lineno >= 0) {
            try {
                final BufferedReader reader = new BufferedReader(new StringReader(src));
                for (int l = 0; l < lineno; ++l) {
                    msg = reader.readLine();
```

## RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `Main` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/jexl3/scripting/Main.java`
#### Snippet
```java
 * @since 2.0
 */
public class Main {

    /**
```

### RuleId[ruleID=UtilityClassWithoutPrivateConstructor]
Class `ClassTool` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassTool.java`
#### Snippet
```java
 * Utility for Java9+ backport in Java8 of class and module related methods.
 */
class ClassTool {
    /** The Class.getModule() method. */
    private static final MethodHandle GET_MODULE;
```

## RuleId[ruleID=DataFlowIssue]
### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Condition `identifier.jjtGetParent() instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
            boolean ignore = (ii.isSafe()
                    && (symbol >= 0
                    || identifier.jjtGetParent() instanceof ASTAssignment))
                    || (identifier.jjtGetParent() instanceof ASTReference);
            if (!ignore) {
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Condition `init instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            JexlNode init = node.jjtGetChild(0);
            ASTVar loopVariable = null;
            if (init instanceof ASTAssignment) {
                JexlNode child = init.jjtGetChild(0);
                if (child instanceof ASTVar) {
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Condition `child instanceof ASTReference` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
            for (int n = 0; n < jjtGetNumChildren(); ++n) {
                final JexlNode child = jjtGetChild(n);
                if (child instanceof ASTReference) {
                    final boolean is = child.isConstant(true);
                    if (!is) {
```

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
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

### RuleId[ruleID=DataFlowIssue]
Condition `parent instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
            boolean expr = isLambdaExpr(lambda);
            named = node.jjtGetChild(0) instanceof ASTVar;
            final boolean assigned = parent instanceof ASTAssignment || named;
            if (assigned && !expr) {
                builder.append("function");
```

### RuleId[ruleID=DataFlowIssue]
Condition `child instanceof ASTAssignment` is redundant and can be replaced with a null check
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
                builder.append(", ");
                JexlNode child = node.jjtGetChild(i);
                if (child instanceof ASTAssignment) {
                    ASTAssignment assign = (ASTAssignment) child;
                    int nc = assign.jjtGetNumChildren();
```

## RuleId[ruleID=TypeParameterHidesVisibleType]
### RuleId[ruleID=TypeParameterHidesVisibleType]
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

### RuleId[ruleID=TypeParameterHidesVisibleType]
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

## RuleId[ruleID=DeprecatedIsStillUsed]
### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'processPragma' is still used
in `src/main/java/org/apache/commons/jexl3/JexlContext.java`
#### Snippet
```java
         * @deprecated 3.3
         */
        void processPragma(String key, Object value);

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'Options' is still used
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
     */
    @Deprecated
    public interface Options {

        /**
```

### RuleId[ruleID=DeprecatedIsStillUsed]
Deprecated member 'controlNullNullOperands' is still used
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
     */
    @Deprecated
    protected Object controlNullNullOperands() {
        if (isStrict()) {
            throw new NullOperand();
```

## RuleId[ruleID=MismatchedJavadocCode]
### RuleId[ruleID=MismatchedJavadocCode]
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

## RuleId[ruleID=ProtectedMemberInFinalClass]
### RuleId[ruleID=ProtectedMemberInFinalClass]
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

### RuleId[ruleID=ProtectedMemberInFinalClass]
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

### RuleId[ruleID=ProtectedMemberInFinalClass]
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

### RuleId[ruleID=ProtectedMemberInFinalClass]
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

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
     * @return the list of blocks
     */
    protected List<Block> readTemplate(final String prefix, final Reader source) {
        final ArrayList<Block> blocks = new ArrayList<Block>();
        final BufferedReader reader;
```

### RuleId[ruleID=ProtectedMemberInFinalClass]
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

### RuleId[ruleID=ProtectedMemberInFinalClass]
Class member declared `protected` in 'final' class
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
     * @return the first position after end of pattern if it matches, -1 otherwise
     */
    protected int startsWith(CharSequence sequence, final CharSequence pattern) {
        final int length = sequence.length();
        int s = 0;
```

## RuleId[ruleID=AssignmentToForLoopParameter]
### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `column`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                        }
                        // do buildup expr
                        column = append(strb, expr, column, c);
                    }
                    break;
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `column`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                    if (c == '"' || c == '\'') {
                        strb.append(c);
                        column = StringParser.readString(strb, expr, column + 1, c);
                        continue;
                    }
```

### RuleId[ruleID=AssignmentToForLoopParameter]
Assignment to for-loop parameter `column`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                    } else {
                        // do buildup expr
                        column = append(strb, expr, column, c);
                    }
                    break;
```

## RuleId[ruleID=UnnecessaryToStringCall]
### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/jexl3/parser/SimpleNode.java`
#### Snippet
```java

    public String toString(final String prefix) {
        return prefix + toString();
    }

```

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

### RuleId[ruleID=UnnecessaryToStringCall]
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

## RuleId[ruleID=StringEqualsEmptyString]
### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
    public String execute(final String clazz, final String name) {
        final String m = get(clazz).execute().get(name);
        return "".equals(name) && m != null? clazz : m;
    }

```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
    public String execute(final Class<?> clazz, final String name) {
        final String m = get(clazz).execute().get(name);
        return "".equals(name) && m != null? clazz.getName() : m;
    }

```

### RuleId[ruleID=StringEqualsEmptyString]
`equals("")` can be replaced with 'isEmpty()'
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
        if (val instanceof String) {
            final String string = (String) val;
            if ("".equals(string)) {
                return BigDecimal.ZERO;
            }
```

## RuleId[ruleID=UnusedLabel]
### RuleId[ruleID=UnusedLabel]
Unused label `mloop`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
                        final Method[] methods = getMethods(arithmetic.getClass(), op.getMethodName());
                        if (methods != null) {
                            mloop:
                            for (final Method method : methods) {
                                final Class<?>[] parms = method.getParameterTypes();
```

## RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        // check whether this namespace is a functor
        synchronized (this) {
            if (functors != null) {
                namespace = functors.get(prefix);
                if (namespace != null) {
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        synchronized (this) {
            if (functors != null) {
                namespace = functors.get(prefix);
                if (namespace != null) {
                    return namespace;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        if (functor != null) {
            synchronized (this) {
                if (functors == null) {
                    functors = new HashMap<>();
                }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            synchronized (this) {
                if (functors == null) {
                    functors = new HashMap<>();
                }
                functors.put(prefix, functor);
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
                    functors = new HashMap<>();
                }
                functors.put(prefix, functor);
            }
            return functor;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `jxlt` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
        if (e == null) {
            synchronized(this) {
                e = jxlt;
                if (e == null) {
                    e = new TemplateEngine(this, true, 0, '$', '#');
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `jxlt` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
                if (e == null) {
                    e = new TemplateEngine(this, true, 0, '$', '#');
                    jxlt = e;
                }
            }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `result` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Script.java`
#### Snippet
```java
        public Object call() throws Exception {
            synchronized(this) {
                if (result == interpreter) {
                    checkCacheVersion();
                    result = interpret();
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `result` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Script.java`
#### Snippet
```java
                if (result == interpreter) {
                    checkCacheVersion();
                    result = interpret();
                }
                return result;
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `result` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Script.java`
#### Snippet
```java
                    result = interpret();
                }
                return result;
            }
        }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            if (fp == 0) {
                synchronized (this) {
                    if (functors != null) {
                        for (final Object functor : functors.values()) {
                            closeIfSupported(functor);
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                synchronized (this) {
                    if (functors != null) {
                        for (final Object functor : functors.values()) {
                            closeIfSupported(functor);
                        }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                            closeIfSupported(functor);
                        }
                        functors.clear();
                        functors = null;
                    }
```

### RuleId[ruleID=PublicFieldAccessedInSynchronizedContext]
Non-private field `functors` accessed in synchronized context
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                        }
                        functors.clear();
                        functors = null;
                    }
                }
```

## RuleId[ruleID=RedundantSuppression]
### RuleId[ruleID=RedundantSuppression]
Redundant suppression
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
     */
    @SuppressWarnings("MagicNumber")
    protected static boolean isMultiplyExact(final long x, final long y, final long r) {
        final long ax = Math.abs(x);
        final long ay = Math.abs(y);
```

## RuleId[ruleID=SystemOutErr]
### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/jexl3/scripting/Main.java`
#### Snippet
```java
        final JexlScriptEngineFactory fac = new JexlScriptEngineFactory();
        final ScriptEngine engine = fac.getScriptEngine();
        final PrintStream out = System.out;
        engine.put("args", args);
        if (args.length == 1){
```

### RuleId[ruleID=SystemOutErr]
Uses of `System.out` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/jexl3/scripting/Main.java`
#### Snippet
```java
            final BufferedReader console = read(null, null);
            String line;
            System.out.print("> ");
            while(null != (line=console.readLine())){
                try {
```

## RuleId[ruleID=MissingDeprecatedAnnotation]
### RuleId[ruleID=MissingDeprecatedAnnotation]
Missing '@Deprecated' annotation
in `src/main/java/org/apache/commons/jexl3/JexlContext.java`
#### Snippet
```java
         * @deprecated 3.3
         */
        void processPragma(String key, Object value);

        /**
```

## RuleId[ruleID=ConditionCoveredByFurtherCondition]
### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'child instanceof ASTJexlScript' covered by subsequent condition 'child instanceof ASTIfStatement'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
     */
    private static boolean isStatement(JexlNode child) {
        return child instanceof ASTJexlScript
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
```

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
Condition 'child instanceof ASTBlock' covered by subsequent condition 'child instanceof ASTIfStatement'
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
    private static boolean isStatement(JexlNode child) {
        return child instanceof ASTJexlScript
                || child instanceof ASTBlock
                || child instanceof ASTIfStatement
                || child instanceof ASTForeachStatement
```

### RuleId[ruleID=ConditionCoveredByFurtherCondition]
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

## RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
        if (node.isExpression()) {
            builder.append('`');
            builder.append(image.replace("`", "\\`"));
            builder.append('`');
        } else if (needQuotes(image)) {
```

### RuleId[ruleID=DynamicRegexReplaceableByCompiledPattern]
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
            // quote it
            builder.append('\'');
            builder.append(image.replace("'", "\\'"));
            builder.append('\'');
        } else {
```

## RuleId[ruleID=UnnecessaryFullyQualifiedName]
### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.jexl3.introspection` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
     * </code>
     * <p>Alternatively, setting the default {@link JexlBuilder#setDefaultPermissions(JexlPermissions)} using
     * {@link org.apache.commons.jexl3.introspection.JexlPermissions#UNRESTRICTED} will also restore JEXL 3.2
     * behavior.</p>
     * <code>
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.jexl3.introspection` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/introspection/JexlPermissions.java`
#### Snippet
```java
 * over what can be executed. JEXL introspection mechanism will check whether it is permitted to
 * access a constructor, method or field before exposition to the {@link JexlUberspect}. The restrictions
 * are applied in all cases, for any {@link org.apache.commons.jexl3.introspection.JexlUberspect.ResolverStrategy}.
 * </p>
 * <p>This complements using a dedicated {@link ClassLoader} and/or {@link SecurityManager} - being deprecated -
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/jexl3/internal/TemplateInterpreter.java`
#### Snippet
```java
                }
            }
        } catch (final java.io.IOException xio) {
            throw TemplateEngine.createException(info, "call print", null, xio);
        } catch (final java.lang.Exception xany) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/internal/TemplateInterpreter.java`
#### Snippet
```java
        } catch (final java.io.IOException xio) {
            throw TemplateEngine.createException(info, "call print", null, xio);
        } catch (final java.lang.Exception xany) {
            throw TemplateEngine.createException(info, "invoke print", null, xany);
        }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
     *               the parameters
     *
     * @return a {@link java.lang.reflect.Method}
     *         or null if no unambiguous method could be found through introspection.
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
     * @param key MethodKey of the method being searched for
     *
     * @return a {@link java.lang.reflect.Method}
     *         or null if no unambiguous method could be found through introspection.
     */
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
     * @param c   Class in which the field search is taking place
     * @param key Name of the field being searched for
     * @return a {@link java.lang.reflect.Field} or null if it does not exist or is not accessible
     */
    public final Field getField(final Class<?> c, final String key) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.function` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/jexl3/internal/LexicalScope.java`
#### Snippet
```java
     * @param cleanSymbol a (optional, may be null) functor to call for each cleaned symbol
     */
    public final void clearSymbols(final java.util.function.IntConsumer cleanSymbol) {
        // undefine symbols getting out of scope
        if (cleanSymbol != null) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/jexl3/internal/SoftCache.java`
#### Snippet
```java
     */
    public <K, V> Map<K, V> createCache(final int cacheSize) {
        return new java.util.LinkedHashMap<K, V>(cacheSize, LOAD_FACTOR, true) {
            /**
             * Serial version UID.
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
     * The thread local interpreter.
     */
    protected static final java.lang.ThreadLocal<Interpreter> INTER =
                       new java.lang.ThreadLocal<>();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
     */
    protected static final java.lang.ThreadLocal<Interpreter> INTER =
                       new java.lang.ThreadLocal<>();

    /**
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/introspection/JexlUberspect.java`
#### Snippet
```java
     * <p>
     * Seeks a JexlPropertyGet apropos to an expression like <code>bar.woogie</code>.</p>
     * See {@link ResolverStrategy#apply(JexlOperator, java.lang.Object) }
     *
     * @param resolvers  the list of property resolvers to try
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/introspection/JexlUberspect.java`
#### Snippet
```java
     * <p>
     * Seeks a JelPropertySet apropos to an expression like <code>foo.bar = "geir"</code>.</p>
     * See {@link ResolverStrategy#apply(JexlOperator, java.lang.Object) }
     *
     * @param resolvers  the list of property resolvers to try,
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
     * The thread local engine.
     */
    protected static final java.lang.ThreadLocal<JexlEngine> ENGINE =
                       new java.lang.ThreadLocal<>();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
     */
    protected static final java.lang.ThreadLocal<JexlEngine> ENGINE =
                       new java.lang.ThreadLocal<>();

    /**
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
     * The thread local context.
     */
    protected static final java.lang.ThreadLocal<JexlContext.ThreadLocal> CONTEXT =
                       new java.lang.ThreadLocal<>();

```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.lang` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
     */
    protected static final java.lang.ThreadLocal<JexlContext.ThreadLocal> CONTEXT =
                       new java.lang.ThreadLocal<>();

    /**
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
        }
        // use arithmetic / pattern matching ?
        if (container instanceof java.util.regex.Pattern) {
            return ((java.util.regex.Pattern) container).matcher(value.toString()).matches();
        }
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.util.regex` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
        // use arithmetic / pattern matching ?
        if (container instanceof java.util.regex.Pattern) {
            return ((java.util.regex.Pattern) container).matcher(value.toString()).matches();
        }
        if (container instanceof CharSequence) {
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
    /**
     * Apply options to this arithmetic which eventually may create another instance.
     * @see #createWithOptions(boolean, java.math.MathContext, int)
     *
     * @param options the {@link JexlEngine.Options} to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.jexl3` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
     * Creates a JexlArithmetic instance.
     * Called by options(...) method when another instance of the same class of arithmetic is required.
     * @see #options(org.apache.commons.jexl3.JexlEngine.Options)
     *
     * @param astrict     whether this arithmetic is lenient or strict
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
    /**
     * Apply options to this arithmetic which eventually may create another instance.
     * @see #createWithOptions(boolean, java.math.MathContext, int)
     *
     * @param options the {@link JexlEngine.Options} to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `java.math` is unnecessary and can be removed
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
    /**
     * Apply options to this arithmetic which eventually may create another instance.
     * @see #createWithOptions(boolean, java.math.MathContext, int)
     *
     * @param context the context that may extend {@link JexlContext.OptionsHandle} to use
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.jexl3.internal` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
        if ((lfrom >= Integer.MIN_VALUE && lfrom <= Integer.MAX_VALUE)
                && (lto >= Integer.MIN_VALUE && lto <= Integer.MAX_VALUE)) {
            return org.apache.commons.jexl3.internal.IntegerRange.create((int) lfrom, (int) lto);
        }
        return org.apache.commons.jexl3.internal.LongRange.create(lfrom, lto);
```

### RuleId[ruleID=UnnecessaryFullyQualifiedName]
Qualifier `org.apache.commons.jexl3.internal` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
            return org.apache.commons.jexl3.internal.IntegerRange.create((int) lfrom, (int) lto);
        }
        return org.apache.commons.jexl3.internal.LongRange.create(lfrom, lto);
    }

```

## RuleId[ruleID=NonProtectedConstructorInAbstractClass]
### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `IntegerRange()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/jexl3/internal/IntegerRange.java`
#### Snippet
```java
     * @param to  the higher inclusive boundary
     */
    public IntegerRange(final int from, final int to) {
        min = from;
        max = to;
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `JexlNode()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
    }

    public JexlNode(final int id) {
        super(id);
    }
```

### RuleId[ruleID=NonProtectedConstructorInAbstractClass]
Constructor `JexlNode()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/jexl3/parser/JexlNode.java`
#### Snippet
```java
    }

    public JexlNode(final Parser p, final int id) {
        super(p, id);
    }
```

## RuleId[ruleID=AssignmentToMethodParameter]
### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
                break;
            }
            node = walk;
        }
        return false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `node`
in `src/main/java/org/apache/commons/jexl3/internal/Engine32.java`
#### Snippet
```java
                break;
            }
            node = walk;
        }
        return false;
```

### RuleId[ruleID=AssignmentToMethodParameter]
Assignment to method parameter `args`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodExecutor.java`
#### Snippet
```java
    public Object invoke(final Object o, Object... args) throws IllegalAccessException, InvocationTargetException {
        if (vaClass != null && args != null) {
            args = handleVarArg(args);
        }
        if (method.getDeclaringClass() == ArrayListWrapper.class && o.getClass().isArray()) {
```

## RuleId[ruleID=UnnecessaryContinue]
### RuleId[ruleID=UnnecessaryContinue]
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

## RuleId[ruleID=ReturnNull]
### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlInfo.java`
#### Snippet
```java
     */
    public Detail getDetail() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlInfo.java`
#### Snippet
```java
     */
    public static JexlInfo from(final JexlScript script) {
        return script instanceof Script? ((Script) script).getInfo() :  null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/ScriptVisitor.java`
#### Snippet
```java
            return ((Script) jscript).getScript().jjtAccept(this, data);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/ScriptVisitor.java`
#### Snippet
```java
            return ((Script) jscript).getScript().jjtAccept(this, data);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
                return new PrintWriter(out, true);
            }
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngine.java`
#### Snippet
```java
                return new PrintWriter(error, true);
            }
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/scripting/JexlScriptEngineFactory.java`
#### Snippet
```java
                 */
            default:
                return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            logger.debug(JexlException.annotationError(node, annotation), cause);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            logger.debug(JexlException.propertyError(node, property, undef));
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            logger.debug(JexlException.methodError(node, method, args));
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            logger.debug(JexlException.operatorError(node, operator.getOperatorSymbol()), cause);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
        final boolean safe = (node instanceof ASTIdentifierAccess) && ((ASTIdentifierAccess) node).isSafe();
        if (safe) {
            return null;
        }
        final String attrStr = attribute != null ? attribute.toString() : null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/InterpreterBase.java`
#### Snippet
```java
            logger.debug(JexlException.variableError(node, var, issue));
        }
        return null;
    }
    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Scope.java`
#### Snippet
```java
    public Frame createFrame(final Frame frame, final Object...args) {
        if (namedVariables == null) {
            return null;
        }
        final Object[] arguments = new Object[namedVariables.size()];
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
            return "";
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
                    logger.warn(xjexl.getMessage(), xjexl.getCause());
                }
                return null;
            }
            throw xjexl.clean();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Engine.java`
#### Snippet
```java
                    logger.warn(xjexl.getMessage(), xjexl.getCause());
                }
                return null;
            }
            throw xjexl.clean();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifierAccess.java`
#### Snippet
```java
                    }
                    if (val == 0) {
                        return null;
                    }
                } // any non numeric, NaN
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifierAccess.java`
#### Snippet
```java
                } // any non numeric, NaN
                else if (c < '0' || c > '9') {
                    return null;
                }
                val *= 10;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifierAccess.java`
#### Snippet
```java
            return val;
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateInterpreter.java`
#### Snippet
```java
                    if (argv != null && argv.length > 0 && argv[0] instanceof Number) {
                        print(((Number) argv[0]).intValue());
                        return null;
                    }
                }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateInterpreter.java`
#### Snippet
```java
                            }
                            include(script, argv);
                            return null;
                        }
                    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
            return overloads.contains(operator) && args != null
                   ? getMethod(arithmetic, operator.getMethodName(), args)
                   : null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Uberspect.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/ObjectContext.java`
#### Snippet
```java
            return object;
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/ObjectContext.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PropertySetExecutor.java`
#### Snippet
```java
                        // because the setter method is overloaded for different parameter type,
                        // return null here to report the ambiguity.
                        return null;
                    }
                    candidate = method;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PropertySetExecutor.java`
#### Snippet
```java
                                               final Object value) {
        if (property == null || property.isEmpty()) {
            return null;
        }
        final java.lang.reflect.Method method = discoverSet(is, clazz, property, value);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PropertySetExecutor.java`
#### Snippet
```java
        }
        final java.lang.reflect.Method method = discoverSet(is, clazz, property, value);
        return method != null? new PropertySetExecutor(clazz, method, property, value) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodExecutor.java`
#### Snippet
```java
            m = is.getMethod((Class<?>) obj, key);
        }
        return m == null? null : new MethodExecutor(clazz, m, key);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/DuckSetExecutor.java`
#### Snippet
```java
            method = is.getMethod(clazz, "put", makeArgs(key, value));
        }
        return method == null? null : new DuckSetExecutor(clazz, method, key, value);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/IndexedType.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTIdentifier.java`
#### Snippet
```java

    public String getNamespace() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateDebugger.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/SoftCache.java`
#### Snippet
```java
        try {
            final Map<K, V> map = ref != null ? ref.get() : null;
            return map != null ? map.get(key) : null;
        } finally {
            lock.readLock().unlock();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ListGetExecutor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/FieldGetExecutor.java`
#### Snippet
```java
            }
        }
        return null;
    }
    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassMap.java`
#### Snippet
```java
            return lm.clone();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassMap.java`
#### Snippet
```java
        // We looked this up before and failed.
        if (cacheEntry == CACHE_MISS) {
            return null;
        }
        if (cacheEntry == null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ClassMap.java`
#### Snippet
```java
        } catch (final Exception xio) {
            // this really can't make an error...
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ListSetExecutor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/FieldSetExecutor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ConstructorMethod.java`
#### Snippet
```java
            className = ctorHandle.toString();
        } else {
            return null;
        }
        final Constructor<?> ctor = is.getConstructor(clazz, new MethodKey(className, args));
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/ConstructorMethod.java`
#### Snippet
```java
            return new ConstructorMethod(ctor);
        }
        return null;
    }
    /**
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            return tp.evaluate(context, frame, options);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            // make sure there is a value to iterate upon
            if (iterableValue == null) {
                return null;
            }
            /* last child node is the statement to execute */
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    : uberspect.getIterator(iterableValue);
            if (itemsIterator == null) {
                return null;
            }
            int cnt = 0;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            if (ptyNode != null) {
                if (ptyNode.isSafeLhs(isSafe())) {
                    return null;
                }
                if (ant != null) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            if (antish) {
                if (node.isSafeLhs(isSafe())) {
                    return null;
                }
                final String aname = ant != null ? ant.toString() : "?";
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                // defined but null; arg of a strict operator?
                if (defined && !isStrictOperand(node)) {
                    return null;
                }
                return unsolvableVariable(node, aname, !defined);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                    // no object, we fail
                    return node.isSafeLhs(isSafe())
                        ? null
                        : unsolvableMethod(methodNode, "<null>.<?>(...)");
                }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
                // no method, we fail// variable unknown in context and not a local
                return node.isSafeLhs(isSafe())
                        ? null
                        : unsolvableMethod(methodNode, "<?>.<null>(...)");
            }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
        } else {
            // safe lhs
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
        // we have either evaluated and returned or no method was found
        return node.isSafeLhs(isSafe())
                ? null
                : unsolvableMethod(node, methodName, argv);
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
        }
        frame.set(symbol, null);
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
        final int numChildren = script.jjtGetNumChildren();
        if (numChildren == 0) {
            return null;
        }
        block = new LexicalFrame(frame, block).defineArgs();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
    @Override
    protected Object visit(final ASTNullLiteral node, final Object data) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            cause = xjxlt;
        }
        return node.isSafe() ? null : unsolvableProperty(node, src, true, cause);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
            putThreadInterpreter(tinter);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Interpreter.java`
#### Snippet
```java
    protected Object visit(final ASTIdentifierAccess node, final Object data) {
        if (data == null) {
            return null;
        }
        final Object id = evalIdentifier(node);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
                        + key.debugString(), xambiguous);
            }
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
            if (ctor != null) {
                // miss or not?
                return CTOR_MISS.equals(ctor) ? null : ctor;
            }
        } finally {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
            if (ctor != null) {
                // miss or not?
                return CTOR_MISS.equals(ctor) ? null : ctor;
            }
            final String cname = key.getMethod();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
        try {
            Class<?> clazz = Class.forName(className, false, loader);
            return permissions.allow(clazz)? clazz : null;
        } catch (final ClassNotFoundException xignore) {
            return null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
            return permissions.allow(clazz)? clazz : null;
        } catch (final ClassNotFoundException xignore) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/Introspector.java`
#### Snippet
```java
    public Method[] getMethods(final Class<?> c, final String methodName) {
        if (c == null) {
            return null;
        }
        final ClassMap classMap = getMap(c);
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
        @Override
        public String get(final String name) {
            return name == null? NULL : null;
        }
    };
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
            return Class.forName(cname);
        } catch(final Exception xany) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/introspection/JexlSandbox.java`
#### Snippet
```java
        public String get(final String name) {
            // if name is null and contained in set, explicit null aka NULL
            return names != null && !names.contains(name) ? name : name != null? null : NULL;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            className = null;
        }
        return className != null && className != JexlSandbox.NULL ? uberspect.getConstructor(className, args) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/SandboxUberspect.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MapGetExecutor.java`
#### Snippet
```java
            return new MapGetExecutor(clazz, MAP_GET, identifier);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PropertyGetExecutor.java`
#### Snippet
```java
                                                final String property) {
        if (property == null || property.isEmpty()) {
            return null;
        }
        //  this is gross and linear, but it keeps it straightforward.
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PropertyGetExecutor.java`
#### Snippet
```java
    public static PropertyGetExecutor discover(final Introspector is, final Class<?> clazz, final String property) {
        final java.lang.reflect.Method method = discoverGet(is, "get", clazz, property);
        return method == null? null : new PropertyGetExecutor(clazz, method, property);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/PropertyGetExecutor.java`
#### Snippet
```java
    @Override
    public Object invoke(final Object o) throws IllegalAccessException, InvocationTargetException {
        return method == null ? null : method.invoke(o, (Object[]) null);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/AbstractExecutor.java`
#### Snippet
```java
     */
    static String castString(final Object arg) {
        return arg instanceof CharSequence || arg instanceof Integer ? arg.toString() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/AbstractExecutor.java`
#### Snippet
```java
     */
    static Integer castInteger(final Object arg) {
        return arg instanceof Number? ((Number) arg).intValue() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/AbstractExecutor.java`
#### Snippet
```java
     */
    public Object getTargetProperty() {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/JexlParser.java`
#### Snippet
```java
            }
        }
        return null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/DuckGetExecutor.java`
#### Snippet
```java
    public static DuckGetExecutor discover(final Introspector is, final Class<?> clazz, final Object identifier) {
        final java.lang.reflect.Method method = is.getMethod(clazz, "get", makeArgs(identifier));
        return method == null? null : new DuckGetExecutor(clazz, method, identifier);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/DuckGetExecutor.java`
#### Snippet
```java
    public Object invoke(final Object obj) throws IllegalAccessException, InvocationTargetException {
        final Object[] args = {property};
        return method == null ? null : method.invoke(obj, args);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MapSetExecutor.java`
#### Snippet
```java
            return new MapSetExecutor(clazz, MAP_SET, identifier, value);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/BooleanGetExecutor.java`
#### Snippet
```java
    @Override
    public Object invoke(final Object obj) throws IllegalAccessException, InvocationTargetException {
        return method == null ? null : method.invoke(obj, (Object[]) null);
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/BooleanGetExecutor.java`
#### Snippet
```java
            }
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/StringParser.java`
#### Snippet
```java
    public static String escapeString(final String str, final char delim) {
        if (str == null) {
            return null;
        }
        final int length = str.length();
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/OperatorController.java`
#### Snippet
```java
    @Override
    protected JexlOperator visitNode(final JexlNode node, final Object data) {
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/introspection/JexlUberspect.java`
#### Snippet
```java
            return Class.forName(className, false, getClassLoader());
        } catch (ClassNotFoundException xignore) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/introspection/MethodKey.java`
#### Snippet
```java
            final Deque<T> applicables = getApplicables(methods, args);
            if (applicables.isEmpty()) {
                return null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
        @Override
        public Object resolveNamespace(final String name) {
            return null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlEngine.java`
#### Snippet
```java
        @Override
        public Object get(final String name) {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
     */
    public String[] getCapturedVariables() {
        return scope != null? scope.getCapturedVariables() : null;
    }
}
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
     */
    public String[] getParameters() {
        return scope != null? scope.getParameters() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
     */
    public String[] getLocalVariables() {
        return scope != null? scope.getLocalVariables() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
     */
    public Frame createFrame(final Frame caller, final Object... values) {
        return scope != null? scope.createFrame(caller, values) : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/parser/ASTJexlScript.java`
#### Snippet
```java
     */
    public String[] getSymbols() {
        return scope != null? scope.getSymbols() : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateScript.java`
#### Snippet
```java
            walk = walk.jjtGetParent();
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateScript.java`
#### Snippet
```java
                        jexl.logger.warn(xuel.getMessage(), xuel.getCause());
                    }
                    return null;
                }
                throw xuel;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                        logger.warn(xuel.getMessage(), xuel.getCause());
                    }
                    return null;
                }
                throw xuel;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
            // evaluate immediate as constant
            final Object value = evaluate(interpreter);
            return value != null ? new ConstantExpression(value, source) : null;
        }
    }
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                    }
                } catch (final IOException xio) {
                    return null;
                }
                return strb.length() > 0 ? strb : null;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                    return null;
                }
                return strb.length() > 0 ? strb : null;
            }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
        /** @return the info */
        JexlInfo getInfo() {
            return null;
        }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/TemplateEngine.java`
#### Snippet
```java
                        logger.warn(xuel.getMessage(), xuel.getCause());
                    }
                    return null;
                }
                throw xuel;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
            return ((Collection<?>) container).contains(value);
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
                || value instanceof Byte
                        ? (Number) value
                        : null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
            return (toString(left)).endsWith(toString(right));
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
            return (toString(left)).startsWith(toString(right));
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
    public Object positivize(final Object val) {
        if (val == null) {
            return null;
        }
        if (val instanceof Short) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
    public Number narrowNumber(final Number original, final Class<?> narrow) {
        if (original == null) {
            return null;
        }
        Number result = original;
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/JexlArithmetic.java`
#### Snippet
```java
    public Object negate(final Object val) {
        if (val == null) {
            return null;
        }
        if (val instanceof Integer) {
```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
            accept(node.jjtGetChild(0), data); // zut
        }
        return null;
    }

```

### RuleId[ruleID=ReturnNull]
Return of `null`
in `src/main/java/org/apache/commons/jexl3/internal/Debugger.java`
#### Snippet
```java
            walk = walk.jjtGetParent();
        }
        return null;
    }

```

## RuleId[ruleID=UnnecessaryLocalVariable]
### RuleId[ruleID=UnnecessaryLocalVariable]
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

## RuleId[ruleID=RedundantFileCreation]
### RuleId[ruleID=RedundantFileCreation]
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

