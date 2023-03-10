# commons-ognl 
 
# Bad smells
I found 310 bad smells with 16 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| ReturnNull | 49 | false |
| ConstantValue | 38 | false |
| UnnecessaryFullyQualifiedName | 25 | false |
| AssignmentToMethodParameter | 24 | false |
| DynamicRegexReplaceableByCompiledPattern | 18 | false |
| CommentedOutCode | 14 | false |
| RedundantFieldInitialization | 13 | false |
| NonProtectedConstructorInAbstractClass | 10 | true |
| UnusedAssignment | 10 | false |
| SuspiciousSystemArraycopy | 8 | false |
| BoundedWildcard | 8 | false |
| DuplicateCondition | 8 | false |
| NestedAssignment | 8 | false |
| ReplaceAssignmentWithOperatorAssignment | 6 | false |
| StringOperationCanBeSimplified | 5 | false |
| NonSerializableFieldInSerializableClass | 5 | false |
| AssignmentToForLoopParameter | 5 | false |
| RedundantImplements | 5 | false |
| ObsoleteCollection | 4 | false |
| UnnecessaryUnboxing | 4 | false |
| SynchronizationOnLocalVariableOrMethodParameter | 4 | false |
| NonFinalFieldOfException | 4 | false |
| ConditionCoveredByFurtherCondition | 3 | false |
| ThrowablePrintStackTrace | 3 | false |
| UnnecessaryToStringCall | 2 | true |
| TrivialStringConcatenation | 2 | false |
| AbstractClassNeverImplemented | 2 | false |
| ZeroLengthArrayInitialization | 2 | false |
| OverwrittenKey | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| RedundantLengthCheck | 1 | false |
| UtilityClassWithoutPrivateConstructor | 1 | true |
| DataFlowIssue | 1 | false |
| ClassGetClass | 1 | false |
| UnnecessaryStringEscape | 1 | true |
| CStyleArrayDeclaration | 1 | false |
| NonSynchronizedMethodOverridesSynchronizedMethod | 1 | false |
| MismatchedJavadocCode | 1 | false |
| StringBufferReplaceableByString | 1 | false |
| UnnecessaryBoxing | 1 | false |
| NonStrictComparisonCanBeEquality | 1 | true |
| SystemOutErr | 1 | false |
| RedundantMethodOverride | 1 | false |
| IfStatementWithIdenticalBranches | 1 | false |
| UnnecessarySuperQualifier | 1 | false |
| EmptyMethod | 1 | false |
| HtmlWrongAttributeValue | 1 | false |
| EqualsWhichDoesntCheckParameterClass | 1 | false |
## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new PropertyDescriptor\[propertyDescriptors.size()\]'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
    {
        Collection<PropertyDescriptor> propertyDescriptors = getPropertyDescriptors( targetClass ).values();
        return propertyDescriptors.toArray( new PropertyDescriptor[propertyDescriptors.size()] );
    }

```

## RuleId[id=RedundantLengthCheck]
### RedundantLengthCheck
Redundant array length check
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
        try
        {
            if ( ( children != null ) && ( children.length > 0 ) )
            {
                for ( Node child : children )
```

## RuleId[id=UtilityClassWithoutPrivateConstructor]
### UtilityClassWithoutPrivateConstructor
Class `OgnlRuntime` has only 'static' members, and lacks a 'private' constructor
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
 *
 */
public class OgnlRuntime
{
    /**
```

## RuleId[id=SuspiciousSystemArraycopy]
### SuspiciousSystemArraycopy
`target` is not of an array type
in `src/main/java/org/apache/commons/ognl/ArrayPropertyAccessor.java`
#### Snippet
```java
                {
                    case DynamicSubscript.ALL:
                        System.arraycopy( target, 0, convertedValue, 0, len );
                        return;
                    default:
```

### SuspiciousSystemArraycopy
`convertedValue` is not of an array type
in `src/main/java/org/apache/commons/ognl/ArrayPropertyAccessor.java`
#### Snippet
```java
                {
                    case DynamicSubscript.ALL:
                        System.arraycopy( target, 0, convertedValue, 0, len );
                        return;
                    default:
```

### SuspiciousSystemArraycopy
`target` is not of an array type
in `src/main/java/org/apache/commons/ognl/ArrayPropertyAccessor.java`
#### Snippet
```java
                    case DynamicSubscript.ALL:
                        result = Array.newInstance( target.getClass().getComponentType(), len );
                        System.arraycopy( target, 0, result, 0, len );
                        break;
                    case DynamicSubscript.FIRST:
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/ognl/ArrayPropertyAccessor.java`
#### Snippet
```java
                    case DynamicSubscript.ALL:
                        result = Array.newInstance( target.getClass().getComponentType(), len );
                        System.arraycopy( target, 0, result, 0, len );
                        break;
                    case DynamicSubscript.FIRST:
```

### SuspiciousSystemArraycopy
`array` is not of an array type
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                    case DynamicSubscript.ALL:
                                        result = Array.newInstance( array.getClass().getComponentType(), len );
                                        System.arraycopy( array, 0, result, 0, len );
                                        handled = true;
                                        i++;
```

### SuspiciousSystemArraycopy
`result` is not of an array type
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                    case DynamicSubscript.ALL:
                                        result = Array.newInstance( array.getClass().getComponentType(), len );
                                        System.arraycopy( array, 0, result, 0, len );
                                        handled = true;
                                        i++;
```

### SuspiciousSystemArraycopy
`target` is not of an array type
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                {
                                    case DynamicSubscript.ALL:
                                        System.arraycopy( target, 0, value, 0, len );
                                        handled = true;
                                        i++;
```

### SuspiciousSystemArraycopy
`value` is not of an array type
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                {
                                    case DynamicSubscript.ALL:
                                        System.arraycopy( target, 0, value, 0, len );
                                        handled = true;
                                        i++;
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `isPrimitive` may produce `NullPointerException`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
                        && ( (NodeType) children[i] ).getGetterClass() != null
                        && Number.class.isAssignableFrom( ( (NodeType) children[i] ).getGetterClass() ) )
                        || valueClass.isPrimitive() )
                    {

```

## RuleId[id=ClassGetClass]
### ClassGetClass
'getClass()' is called on Class instance
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            // try again on pure class

            Method[] cmethods = target.getClass().getMethods();
            for ( Method cmethod : cmethods )
            {
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Call to `append()` is redundant
in `src/main/java/org/apache/commons/ognl/ComparisonExpression.java`
#### Snippet
```java
            }

            result.append( "" ).append( OgnlRuntime.getChildSource( context, target, children[1], conversion ) );

            if ( conversion )
```

### StringOperationCanBeSimplified
Unnecessary empty string argument
in `src/main/java/org/apache/commons/ognl/NumericExpression.java`
#### Snippet
```java
    {
        Object value;
        StringBuilder result = new StringBuilder( "" );

        try
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
                }

                if ( ( method.getName().equalsIgnoreCase( name ) || method.getName().toLowerCase().equals(
                    name.toLowerCase() ) || method.getName().toLowerCase().equals( "set" + name.toLowerCase() ) )
                    && !method.getName().startsWith( "get" ) )
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
                }

                if ( ( cmethod.getName().equalsIgnoreCase( name ) || cmethod.getName().toLowerCase().equals(
                    name.toLowerCase() ) || cmethod.getName().toLowerCase().equals( "set" + name.toLowerCase() ) )
                    && !cmethod.getName().startsWith( "get" ) )
```

### StringOperationCanBeSimplified
`toLowerCase()` call can be replaced with 'equalsIgnoreCase()'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java

                String propertyDescriptorName = propertyDescriptor.getName();
                if ( propertyDescriptorName.equalsIgnoreCase( name ) || propertyDescriptorName.toLowerCase().equals( name.toLowerCase() )
                    || propertyDescriptorName.toLowerCase().endsWith( name.toLowerCase() ) )
                {
```

## RuleId[id=UnnecessaryStringEscape]
### UnnecessaryStringEscape
`\'` is unnecessarily escaped
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                break;
            case '\'':
                result = "\\\'";
                break;
            case '\\':
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `c`
in `src/main/java/org/apache/commons/ognl/SimpleNode.java`
#### Snippet
```java
        else if ( i >= children.length )
        {
            Node c[] = new Node[i + 1];
            System.arraycopy( children, 0, c, 0, children.length );
            children = c;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ComparisonExpression.java`
#### Snippet
```java
            OgnlRuntime.getChildSource( context, target, children[1] );

            // System.out.println("comparison expression currentType: " + context.getCurrentType() + " previousType: " +
            // context.getPreviousType());

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/OgnlCache.java`
#### Snippet
```java
        constructorCache.setClassInspector( inspector );
        //TODO: methodCache and invokePC should allow to use classCacheInsecptor
//        _methodCache.setClassInspector( inspector );
//        _invokePermissionCache.setClassInspector( inspector );
        _fieldCache.setClassInspector( inspector );
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ArrayPropertyAccessor.java`
#### Snippet
```java
        // need to convert to primitive for list index access

        // System.out.println("index class " + index.getClass() + " current type " + context.getCurrentType() +
        // " current object class " + context.getCurrentObject().getClass());

```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
                PropertyAccessor propertyAccessor = OgnlRuntime.getPropertyAccessor( target.getClass() );

                // System.out.println("child value : " + _children[0].getValue(context, context.getCurrentObject())
                // + " using propaccessor " + p.getClass().getName()
                // + " and srcString " + srcString + " on target: " + target);
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
                String srcString = getSourceString( context, child );

                // System.out.println("astproperty setter using indexed value " + value + " and srcString: " +
                // srcString);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
            String name = ( (ASTConst) child ).getValue().toString();

            // System.out.println(" astprop(setter) : trying to set " + name + " on object target " +
            // context.getCurrentObject().getClass().getName());

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
                    {
                        Object currObj = context.getCurrentObject();
                        // Class currType = context.getCurrentType();
                        // Class prevType = context.getPreviousType();

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java

                        context.setCurrentObject( currObj );
                        // context.setCurrentType(currType);
                        // context.setPreviousType(prevType);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
            srcString = "\"" + srcString + "\"";
        }
        // System.out.println("indexed getting with child srcString: " + srcString + " value class: " +
        // value.getClass() + " and child: " + _children[0].getClass());
        return srcString;
```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ASTAdd.java`
#### Snippet
```java
                    }

                    // System.out.println("astadd child class: " + _children[i].getClass().getName() +
                    // " and return expr: " + expr);

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            String body = format( "{ return %s %s; }", widener, ref.getExpression() ).replaceAll( "\\.\\.", "." );

            // System.out.println("adding method " + ref.getName() + " with body:\n" + body + " and return type: " +
            // ref.getType());

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                    }

                    // System.out.println("Astchain i: " + i + " currentobj : " + context.getCurrentObject() +
                    // " and root: " + context.getRoot());
                    if ( !(child instanceof ASTVarRef) && !constructor && !(
```

### CommentedOutCode
Commented out code (3 lines)
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java

                    String value = children[i].toSetSourceString( context, context.getCurrentObject() );
                    // if (value == null || value.trim().isEmpty())
                    // return "";

```

### CommentedOutCode
Commented out code (2 lines)
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
            return (Boolean) value;
        }
        // if ( c == String.class )
        // return ((String)value).length() > 0;

```

## RuleId[id=ObsoleteCollection]
### ObsoleteCollection
Obsolete collection type `Stack`> used
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    private final Stack<Class<?>> typeStack = new Stack<Class<?>>();

    private final Stack<Class<?>> accessorStack = new Stack<Class<?>>();

    private int localReferenceCounter = 0;
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    private final Stack<Class<?>> typeStack = new Stack<Class<?>>();

    private final Stack<Class<?>> accessorStack = new Stack<Class<?>>();

    private int localReferenceCounter = 0;
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    }

    private final Stack<Class<?>> typeStack = new Stack<Class<?>>();

    private final Stack<Class<?>> accessorStack = new Stack<Class<?>>();
```

### ObsoleteCollection
Obsolete collection type `Stack`> used
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    }

    private final Stack<Class<?>> typeStack = new Stack<Class<?>>();

    private final Stack<Class<?>> accessorStack = new Stack<Class<?>>();
```

## RuleId[id=NonSynchronizedMethodOverridesSynchronizedMethod]
### NonSynchronizedMethodOverridesSynchronizedMethod
Unsynchronized method `getPropertyType()` overrides synchronized method
in `src/main/java/org/apache/commons/ognl/ObjectIndexedPropertyDescriptor.java`
#### Snippet
```java

    @Override
    public Class<?> getPropertyType()
    {
        return propertyType;
```

## RuleId[id=NonSerializableFieldInSerializableClass]
### NonSerializableFieldInSerializableClass
Non-serializable field 'value' in a Serializable class
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
{

    private Object value;

    private Class getterClass;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'evaluation' in a Serializable class
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
     * The root evaluation of the expression when the exception was thrown
     */
    private Evaluation evaluation;

    /**
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'target' in a Serializable class
in `src/main/java/org/apache/commons/ognl/NoSuchPropertyException.java`
#### Snippet
```java
    private static final long serialVersionUID = 2228428181127177178L;

    private Object target;

    private Object name;
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'name' in a Serializable class
in `src/main/java/org/apache/commons/ognl/NoSuchPropertyException.java`
#### Snippet
```java
    private Object target;

    private Object name;

    public NoSuchPropertyException( Object target, Object name )
```

### NonSerializableFieldInSerializableClass
Non-serializable field 'constantValue' in a Serializable class
in `src/main/java/org/apache/commons/ognl/SimpleNode.java`
#### Snippet
```java
    private volatile boolean hasConstantValue;

    private Object constantValue;

    private ExpressionAccessor accessor;
```

## RuleId[id=MismatchedJavadocCode]
### MismatchedJavadocCode
Method is specified to return 'true' but its return type is not boolean
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java

    /**
     * Returns true if this property is described by an IndexedPropertyDescriptor and that if followed by an index
     * specifier it will call the index get/set methods rather than go through property accessors.
     *
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder` can be replaced with 'String'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            HEX_PADDING.put( l, pad );
        }
        return new StringBuilder().append( pad ).append( hex ).toString();
    }

```

## RuleId[id=AssignmentToForLoopParameter]
### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                        System.arraycopy( array, 0, result, 0, len );
                                        handled = true;
                                        i++;
                                        break;
                                    case DynamicSubscript.FIRST:
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                    index );
                            handled = true;
                            i++;
                        }
                    }
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                        System.arraycopy( target, 0, value, 0, len );
                                        handled = true;
                                        i++;
                                        break;
                                    case DynamicSubscript.FIRST:
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                                            index, value );
                            handled = true;
                            i++;
                        }
                        else if ( !handled )
```

### AssignmentToForLoopParameter
Assignment to for-loop parameter `i`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                                    propertyNode.getProperty( context, target ).toString(),
                                    index );
                            i++;
                            continue;
                        }
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/ognl/ASTMethod.java`
#### Snippet
```java
        if ( method.getReturnType() == void.class )
        {
            coreExpression = sourceStringBuilder.toString() + ";";
            lastExpression = "null";
        }
```

### UnnecessaryToStringCall
Unnecessary `toString()` call
in `src/main/java/org/apache/commons/ognl/SimpleNode.java`
#### Snippet
```java
    public String toString( String prefix )
    {
        return prefix + OgnlParserTreeConstants.jjtNodeName[id] + " " + toString();
    }

```

## RuleId[id=TrivialStringConcatenation]
### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * Constant string representation of null string.
     */
    public static final String NULL_STRING = "" + null;

    /**
```

### TrivialStringConcatenation
Empty string used in concatenation
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                else
                {
                    result = ch + "";
                }
                break;
```

## RuleId[id=AbstractClassNeverImplemented]
### AbstractClassNeverImplemented
Abstract class `OgnlOps` has no concrete subclass
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
 * This is an abstract class with static methods that define the operations of OGNL.
 */
public abstract class OgnlOps
    implements NumericTypes
{
```

### AbstractClassNeverImplemented
Abstract class `Ognl` has no concrete subclass
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
 * </pre>
 */
public abstract class Ognl
{

```

## RuleId[id=BoundedWildcard]
### BoundedWildcard
Can generalize to `? extends T`
in `src/main/java/org/apache/commons/ognl/IteratorEnumeration.java`
#### Snippet
```java
    private final Iterator<T> it;

    private IteratorEnumeration( Iterator<T> it )
    {
        this.it = it;
```

### BoundedWildcard
Can generalize to `? extends E`
in `src/main/java/org/apache/commons/ognl/EnumerationIterator.java`
#### Snippet
```java
    private final Enumeration<E> e;

    public EnumerationIterator( Enumeration<E> e )
    {
        this.e = e;
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/ognl/internal/entry/PropertyDescriptorCacheEntryFactory.java`
#### Snippet
```java

    private static void findObjectIndexedPropertyDescriptors( Class<?> targetClass,
                                                             Map<String, PropertyDescriptor> intoMap )
        throws OgnlException
    {
```

### BoundedWildcard
Can generalize to `? super PropertyDescriptor`
in `src/main/java/org/apache/commons/ognl/internal/entry/PropertyDescriptorCacheEntryFactory.java`
#### Snippet
```java

    private static void findObjectIndexedPropertyDescriptors( Class<?> targetClass,
                                                             Map<String, PropertyDescriptor> intoMap )
        throws OgnlException
    {
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
     * @param memberAccess The access resolver to configure the context with.
     */
    public static void setMemberAccess( Map<String, Object> context, MemberAccess memberAccess )
    {
        context.put( OgnlContext.MEMBER_ACCESS_CONTEXT_KEY, memberAccess );
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
     * @param converter The converter to use.
     */
    public static void setTypeConverter( Map<String, Object> context, TypeConverter converter )
    {
        context.put( OgnlContext.TYPE_CONVERTER_CONTEXT_KEY, converter );
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
     * @param root The root object.
     */
    public static void setRoot( Map<String, Object> context, Object root )
    {
        context.put( OgnlContext.ROOT_CONTEXT_KEY, root );
```

### BoundedWildcard
Can generalize to `? super String`
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
     * @param classResolver The resolver to use to resolve classes.
     */
    public static void setClassResolver( Map<String, Object> context, ClassResolver classResolver )
    {
        context.put( OgnlContext.CLASS_RESOLVER_CONTEXT_KEY, classResolver );
```

## RuleId[id=DuplicateCondition]
### DuplicateCondition
Duplicate condition `valueClass != null && valueClass.isPrimitive()`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
        }
        else if ( ( child instanceof NodeType && ( (NodeType) child ).getGetterClass() != null
            && Number.class.isAssignableFrom( ( (NodeType) child ).getGetterClass() ) ) || ( valueClass != null
            && valueClass.isPrimitive() ) )
        {
            parmString = " ($w) " + parmString;
```

### DuplicateCondition
Duplicate condition `valueClass != null && valueClass.isPrimitive()`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
            parmString = " ($w) " + parmString;
        }
        else if ( valueClass != null && valueClass.isPrimitive() )
        {
            parmString = "($w) " + parmString;
```

### DuplicateCondition
Duplicate condition `valueClass.isPrimitive()`
in `src/main/java/org/apache/commons/ognl/ASTStaticMethod.java`
#### Snippet
```java
                        else if ( ( child instanceof NodeType && ( (NodeType) child ).getGetterClass() != null
                            && Number.class.isAssignableFrom( ( (NodeType) child ).getGetterClass() ) )
                            || valueClass.isPrimitive() )
                        {
                            parmString = " ($w) " + parmString;
```

### DuplicateCondition
Duplicate condition `valueClass.isPrimitive()`
in `src/main/java/org/apache/commons/ognl/ASTStaticMethod.java`
#### Snippet
```java
                            parmString = " ($w) " + parmString;
                        }
                        else if ( valueClass.isPrimitive() )
                        {
                            parmString = "($w) " + parmString;
```

### DuplicateCondition
Duplicate condition `valueClass.isPrimitive()`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
                        && ( (NodeType) children[i] ).getGetterClass() != null
                        && Number.class.isAssignableFrom( ( (NodeType) children[i] ).getGetterClass() ) )
                        || valueClass.isPrimitive() )
                    {

```

### DuplicateCondition
Duplicate condition `valueClass.isPrimitive()`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
                        value = " ($w) (" + value + ")";
                    }
                    else if ( valueClass.isPrimitive() )
                    {
                        value = "($w) (" + value + ")";
```

### DuplicateCondition
Duplicate condition `expression instanceof ASTStaticMethod`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

        if ( ( !(expression instanceof ASTList) && !(expression instanceof ASTVarRef)
            && !(expression instanceof ASTStaticMethod) && !(expression instanceof ASTStaticField)
            && !(expression instanceof ASTConst) && !(expression instanceof ExpressionNode)
            && !(expression instanceof ASTCtor) && !(expression instanceof ASTStaticMethod)
```

### DuplicateCondition
Duplicate condition `expression instanceof ASTStaticMethod`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            && !(expression instanceof ASTStaticMethod) && !(expression instanceof ASTStaticField)
            && !(expression instanceof ASTConst) && !(expression instanceof ExpressionNode)
            && !(expression instanceof ASTCtor) && !(expression instanceof ASTStaticMethod)
            && root != null ) || ( root != null && expression instanceof ASTRootVarRef) )
        {
```

## RuleId[id=UnnecessaryBoxing]
### UnnecessaryBoxing
Unnecessary boxing
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                else if ( ( toType == Float.class ) || ( toType == Float.TYPE ) )
                {
                    result = new Float( doubleValue( value ) );
                }
                else if ( toType == BigInteger.class )
```

## RuleId[id=NonStrictComparisonCanBeEquality]
### NonStrictComparisonCanBeEquality
Can be replaced with equality
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
            }

            if ( m == null || m.getParameterTypes() == null || m.getParameterTypes().length <= 0 )
            {
                throw new UnsupportedCompilationException( "Unable to determine setting expression on "
```

## RuleId[id=SystemOutErr]
### SystemOutErr
Uses of `System.err` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
    public void printStackTrace()
    {
        printStackTrace( System.err );
    }

```

## RuleId[id=UnnecessaryUnboxing]
### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
            context.setCurrentType( Character.class );

            if ( Character.isLetterOrDigit( val.charValue() ) )
            {
                retval = "'" + ( (Character) value ).charValue() + "'";
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
            if ( Character.isLetterOrDigit( val.charValue() ) )
            {
                retval = "'" + ( (Character) value ).charValue() + "'";
            }
            else
```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
            else
            {
                retval = "'" + OgnlOps.getEscapedChar( ( (Character) value ).charValue() ) + "'";
            }

```

### UnnecessaryUnboxing
Unnecessary unboxing
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
        if ( c == Character.class )
        {
            return BigDecimal.valueOf( ( (Character) value ).charValue() );
        }
        return new BigDecimal( stringValue( value, true ) );
```

## RuleId[id=RedundantMethodOverride]
### RedundantMethodOverride
Method `isNodeConstant()` is identical to its super method
in `src/main/java/org/apache/commons/ognl/ExpressionNode.java`
#### Snippet
```java
     */
    @Override
    public boolean isNodeConstant( OgnlContext context )
        throws OgnlException
    {
```

## RuleId[id=ConditionCoveredByFurtherCondition]
### ConditionCoveredByFurtherCondition
Condition 'source != null' covered by subsequent condition 'source instanceof Class'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            {
                Class<?> typeClass = target != null ? target.getClass() : null;
                if ( typeClass == null && source != null && source instanceof Class)
                {
                    typeClass = (Class<?>) source;
```

### ConditionCoveredByFurtherCondition
Condition 'propertyDescriptorName.toLowerCase().equals(...)' covered by subsequent condition 'propertyDescriptorName.toLowerCase().endsWith(...)'
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java

                String propertyDescriptorName = propertyDescriptor.getName();
                if ( propertyDescriptorName.equalsIgnoreCase( name ) || propertyDescriptorName.toLowerCase().equals( name.toLowerCase() )
                    || propertyDescriptorName.toLowerCase().endsWith( name.toLowerCase() ) )
                {
```

### ConditionCoveredByFurtherCondition
Condition '!(expression instanceof ASTStaticMethod)' covered by subsequent condition '!(expression instanceof ASTStaticMethod)'
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

        if ( ( !(expression instanceof ASTList) && !(expression instanceof ASTVarRef)
            && !(expression instanceof ASTStaticMethod) && !(expression instanceof ASTStaticField)
            && !(expression instanceof ASTConst) && !(expression instanceof ExpressionNode)
            && !(expression instanceof ASTCtor) && !(expression instanceof ASTStaticMethod)
```

## RuleId[id=IfStatementWithIdenticalBranches]
### IfStatementWithIdenticalBranches
'if' statement can be collapsed with side effect extraction
in `src/main/java/org/apache/commons/ognl/ASTAdd.java`
#### Snippet
```java
        }

        if ( Float.class.isAssignableFrom( type.getGetterClass() )
            && Integer.class.isAssignableFrom( lastType.getGetterClass() ) )
        {
```

## RuleId[id=DynamicRegexReplaceableByCompiledPattern]
### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
    public String getSourceSetter( OgnlContext context, Object target, Object index )
    {
        String indexStr = index.toString().replace( "\"", "" );

        // TODO: This feels really inefficient, must be some better way
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
        if ( index instanceof String )
        {
            String key = ( (String) index ).replace( "\"", "" );
            if ( "size".equals( key ) )
            {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
    public String getSourceAccessor( OgnlContext context, Object target, Object index )
    {
        String indexStr = index.toString().replace( "\"", "" );

        if (index instanceof String)
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        try
        {
            name = name.replace( "\"", "" );

            BeanInfo info = Introspector.getBeanInfo( target );
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        try
        {
            name = name.replace( "\"", "" ).toLowerCase();

            BeanInfo info = Introspector.getBeanInfo( target );
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
                if ( String.class.isAssignableFrom( index.getClass() ) && !target.getClass().isArray() )
                {
                    String key = ( (String) index ).replace( "\"", "" );
                    try
                    {
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
        {

            String methodName = index.toString().replace( "\"", "" );
            Method m = OgnlRuntime.getWriteMethod( target.getClass(), methodName );

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
                m =
                    OgnlRuntime.getWriteMethod( target.getClass(),
                                                context.getCurrentObject().toString().replace( "\"", "" ) );
            }

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
        {

            String methodName = index.toString().replace( "\"", "" );
            Method m = OgnlRuntime.getReadMethod( target.getClass(), methodName );

```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
                m =
                    OgnlRuntime.getReadMethod( target.getClass(),
                                               context.getCurrentObject().toString().replace( "\"", "" ) );
            }
            // System.out.println("tried to get read method from target: " + target.getClass() + " with methodName:" +
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/MapPropertyAccessor.java`
#### Snippet
```java
        if (index instanceof String)
        {
            String key = indexStr.replace( "\"", "" );

            if ( "size".equals( key ) || "keys".equals( key ) || "keySet".equals( key ) || "values".equals( key )
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/MapPropertyAccessor.java`
#### Snippet
```java
        if ( index instanceof String && !indexedAccess )
        {
            String key = indexStr.replace( "\"", "" );

            if ( "size".equals( key ) )
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ASTAdd.java`
#### Snippet
```java
                        && children[i] instanceof ASTConst)
                    {
                        expr = expr.replace( "'", "\"" );
                        context.setCurrentType( String.class );
                    }
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ASTAdd.java`
#### Snippet
```java
                            {
                                // System.out.println("Input expr >>" + expr + "<<");
                                expr = expr.replace( "&quot;", "\"" );
                                expr = expr.replace( "\"", "'" );
                                expr = format( "\"%s\"", expr );
```

### DynamicRegexReplaceableByCompiledPattern
`replace()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/ASTAdd.java`
#### Snippet
```java
                                // System.out.println("Input expr >>" + expr + "<<");
                                expr = expr.replace( "&quot;", "\"" );
                                expr = expr.replace( "\"", "'" );
                                expr = format( "\"%s\"", expr );
                                // System.out.println("Expr now >>" + expr + "<<");
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            String widener = ref.getType().isPrimitive() ? " " : " ($w) ";

            String body = format( "{ return %s %s; }", widener, ref.getExpression() ).replaceAll( "\\.\\.", "." );

            // System.out.println("adding method " + ref.getName() + " with body:\n" + body + " and return type: " +
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
        }

        body = body.replaceAll( "\\.\\.", "." );

        // System.out.println("Getter Body: ===================================\n" + body);
```

### DynamicRegexReplaceableByCompiledPattern
`replaceAll()` could be replaced with compiled 'java.util.regex.Pattern' construct
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
        body = "{" + ( castExpression != null ? castExpression : "" ) + pre + setterCode + ";}";

        body = body.replaceAll( "\\.\\.", "." );

        // System.out.println("Setter Body: ===================================\n" + body);
```

## RuleId[id=UnnecessarySuperQualifier]
### UnnecessarySuperQualifier
Qualifier `super` is unnecessary in this context
in `src/main/java/org/apache/commons/ognl/ASTBitNegate.java`
#### Snippet
```java
        if ( !(children[0] instanceof ASTBitNegate))
        {
            return "~(" + super.coerceToNumeric( source, context, children[0] ) + ")";
        }
        return "~(" + source + ")";
```

## RuleId[id=UnnecessaryFullyQualifiedName]
### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/OgnlExpressionCompiler.java`
#### Snippet
```java
    /**
     * The core method executed to compile a specific expression. It is expected that this expression always return a
     * {@link Node} with a non null {@link org.apache.commons.ognl.Node#getAccessor()} instance - unless an exception is
     * thrown by the method or the statement wasn't compilable in this instance because of missing/null objects in the
     * expression. These instances may in some cases continue to call this compilation method until the expression is
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/OgnlExpressionCompiler.java`
#### Snippet
```java
     * references may need to be cast multiple times in order to properly resolve the members in a compiled statement.
     * <p>
     * This method should be using the various {@link org.apache.commons.ognl.OgnlContext#getCurrentType()} /
     * {@link org.apache.commons.ognl.OgnlContext#getCurrentAccessor()} methods to inspect the type stack and properly
     * cast to the right classes - but only when necessary.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/OgnlExpressionCompiler.java`
#### Snippet
```java
     * <p>
     * This method should be using the various {@link org.apache.commons.ognl.OgnlContext#getCurrentType()} /
     * {@link org.apache.commons.ognl.OgnlContext#getCurrentAccessor()} methods to inspect the type stack and properly
     * cast to the right classes - but only when necessary.
     * </p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/OgnlExpressionCompiler.java`
#### Snippet
```java

    /**
     * Used in places where the preferred {@link #getSuperOrInterfaceClass(java.lang.reflect.Method, Class)} isn't
     * possible because the method isn't known for a class. Attempts to upcast the given class to the next available
     * non-private accessible class so that compiled expressions can reference the interface class of an instance so as
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
     */
    @Override
    public void printStackTrace( java.io.PrintWriter s )
    {
        synchronized ( s )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.io` is unnecessary, and can be replaced with an import
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
     */
    @Override
    public void printStackTrace( java.io.PrintStream s )
    {
        synchronized ( s )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl.internal` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param constructor
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
     */
    public static Class<?>[] getParameterTypes( Constructor<?> constructor )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param name        Name of property
     * @return PropertyDescriptor of the named property or null if the class has no property with the given name
     * @throws java.beans.IntrospectionException
     * @throws OgnlException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl.internal` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param method
     * @return
     * @throws org.apache.commons.ognl.internal.CacheException
     */
    public static Permission getPermission( Method method )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl.internal` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param method    The method to find types for.
     * @return Array of parameter types for the given method.
     * @throws org.apache.commons.ognl.internal.CacheException
     */
    public static Class<?>[] findParameterTypes( Class<?> type, Method method )
```

### UnnecessaryFullyQualifiedName
Qualifier `java.beans` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
     * @param propertyName a property name.
     * @return the PropertyDescriptor for the given targetClass and propertyName.
     * @throws java.beans.IntrospectionException
     * @throws OgnlException
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.lang.reflect` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
    /**
     * Helper utility method used by compiler to help resolve class->method mappings during method calls to
     * {@link OgnlExpressionCompiler#getSuperOrInterfaceClass(java.lang.reflect.Method, Class)}.
     *
     * @param m The method to check for existance of.
```

### UnnecessaryFullyQualifiedName
Qualifier `javassist` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
     * @param searchClass The class to load.
     * @return The javassist class equivalent.
     * @throws javassist.NotFoundException When the class definition can't be found.
     */
    protected CtClass getCtClass( Class<?> searchClass )
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

    /**
     * Used by {@link #getRootExpression(org.apache.commons.ognl.Node, Object, org.apache.commons.ognl.OgnlContext)} to
     * determine if the expression needs to be cast at all.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

    /**
     * Used by {@link #getRootExpression(org.apache.commons.ognl.Node, Object, org.apache.commons.ognl.OgnlContext)} to
     * determine if the expression needs to be cast at all.
     *
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

    /**
     * Used by {@link #castExpression(org.apache.commons.ognl.OgnlContext, org.apache.commons.ognl.Node, String)} to
     * store the cast java source string in to the current {@link org.apache.commons.ognl.OgnlContext}. This will either
     * add to the existing string present if it already exists or create a new instance and store it using the static
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

    /**
     * Used by {@link #castExpression(org.apache.commons.ognl.OgnlContext, org.apache.commons.ognl.Node, String)} to
     * store the cast java source string in to the current {@link org.apache.commons.ognl.OgnlContext}. This will either
     * add to the existing string present if it already exists or create a new instance and store it using the static
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
    /**
     * Used by {@link #castExpression(org.apache.commons.ognl.OgnlContext, org.apache.commons.ognl.Node, String)} to
     * store the cast java source string in to the current {@link org.apache.commons.ognl.OgnlContext}. This will either
     * add to the existing string present if it already exists or create a new instance and store it using the static
     * key of {@link #PRE_CAST}.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
     * @param context The current execution context.
     * @param loader The {@link ClassLoader} instance to use - as returned by
     *            {@link #getClassLoader(org.apache.commons.ognl.OgnlContext)}.
     * @return The existing or new {@link ClassPool} instance.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java

    /**
     * Same as {@link #isConstant(String, java.util.Map)} - only the {@link Map} instance is created for you.
     *
     * @param expression The expression to check.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
 * This will parse the expression given and evaluate it against the root object given, returning the result. If there is
 * an error in the expression, such as the property is not found, the exception is encapsulated into an
 * {@link org.apache.commons.ognl.OgnlException OgnlException}.
 * </p>
 * <p>
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java

    /**
     * Same as {@link #isConstant(Object, java.util.Map)} - only the {@link Map} context is created for you.
     *
     * @param tree The {@link Node} to check.
```

### UnnecessaryFullyQualifiedName
Qualifier `java.util` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
     * @param root The object to retrieve the expression value from.
     * @param resultType The desired object type that the return value should be converted to using the
     *            {@link #getTypeConverter(java.util.Map)} .
     * @return The value.
     */
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
     * Parses and compiles the given expression using the {@link org.apache.commons.ognl.enhance.OgnlExpressionCompiler}
     * returned from
     * {@link org.apache.commons.ognl.OgnlRuntime#getCompiler(OgnlContext)}.
     *
     * @param context The context to use.
```

### UnnecessaryFullyQualifiedName
Qualifier `org.apache.commons.ognl` is unnecessary and can be removed
in `src/main/java/org/apache/commons/ognl/Ognl.java`
#### Snippet
```java
     * @param root The root object for the given expression.
     * @param expression The expression to compile.
     * @return The node with a compiled accessor set on {@link org.apache.commons.ognl.Node#getAccessor()} if
     * compilation was successfull.
     *         In instances where compilation wasn't possible because of a partially null expression the
```

## RuleId[id=ThrowablePrintStackTrace]
### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/ognl/ASTIn.java`
#### Snippet
```java

            // expected to happen in some instances
            e.printStackTrace();

            throw new UnsupportedCompilationException( "evaluation resulted in null expression." );
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/ognl/ASTNotIn.java`
#### Snippet
```java

            // expected to happen in some instances
            e.printStackTrace();

            throw new UnsupportedCompilationException( "evaluation resulted in null expression." );
```

### ThrowablePrintStackTrace
Call to `printStackTrace()` should probably be replaced with more robust logging
in `src/main/java/org/apache/commons/ognl/BooleanExpression.java`
#### Snippet
```java

            // expected to happen in some instances
            e.printStackTrace();

            throw new UnsupportedCompilationException( "evaluation resulted in null expression." );
```

## RuleId[id=ReplaceAssignmentWithOperatorAssignment]
### ReplaceAssignmentWithOperatorAssignment
`pre = pre + " ($w) ("` could be simplified to 'pre += " ($w) ("'
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            || Object.class == context.getCurrentType() )
        {
            pre = pre + " ($w) (";
            post = post + ")";
        }
```

### ReplaceAssignmentWithOperatorAssignment
`post = post + ")"` could be simplified to 'post += ")"'
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
        {
            pre = pre + " ($w) (";
            post = post + ")";
        }

```

### ReplaceAssignmentWithOperatorAssignment
`result = result + "0"` could be simplified to 'result += "0"'
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                        if ( hcl == 3 )
                        {
                            result = result + "0";
                        }
                        else
```

### ReplaceAssignmentWithOperatorAssignment
`result = result + "00"` could be simplified to 'result += "00"'
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                            if ( hcl == 2 )
                            {
                                result = result + "00";
                            }
                            else
```

### ReplaceAssignmentWithOperatorAssignment
`result = result + "000"` could be simplified to 'result += "000"'
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                            else
                            {
                                result = result + "000";
                            }
                        }
```

### ReplaceAssignmentWithOperatorAssignment
`result = result + hc` could be simplified to 'result += hc'
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                    }

                    result = result + hc;
                }
                else
```

## RuleId[id=NestedAssignment]
### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/internal/entry/PropertyDescriptorCacheEntryFactory.java`
#### Snippet
```java
                Method method = methods.get( 0 );

                if ( ( ( isSet = methodName.startsWith( OgnlRuntime.SET_PREFIX ) ) || ( isGet =
                    methodName.startsWith( OgnlRuntime.GET_PREFIX ) ) ) && ( methodName.length() > 3 ) )
                {
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/internal/entry/PropertyDescriptorCacheEntryFactory.java`
#### Snippet
```java
                Method method = methods.get( 0 );

                if ( ( ( isSet = methodName.startsWith( OgnlRuntime.SET_PREFIX ) ) || ( isGet =
                    methodName.startsWith( OgnlRuntime.GET_PREFIX ) ) ) && ( methodName.length() > 3 ) )
                {
                    String propertyName = Introspector.decapitalize( methodName.substring( 3 ) );
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java

        // stringBuilder.append(HEX_PREFIX);
        if ( ( pad = HEX_PADDING.get( l ) ) == null )
        {
            StringBuilder paddingStringBuilder = new StringBuilder();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            {
                actualArgs = new Object[args.length];
                if ( ( ctor = getConvertedConstructorAndArgs( context, target, constructors, args, actualArgs ) ) == null )
                {
                    throw new NoSuchMethodException();
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            throw new OgnlException( "target is null for setProperty(null, \"" + name + "\", " + value + ")" );
        }
        if ( ( accessor = getPropertyAccessor( getTargetClass( target ) ) ) == null )
        {
            throw new OgnlException( "No property accessor for " + getTargetClass( target ).getName() );
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
                {
                    if ( isTypeCompatible( value, field.getType() ) || (
                        ( value = getConvertedType( context, target, field, propertyName, value, field.getType() ) ) != null ) )
                    {
                        field.set( target, value );
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            ClassResolver resolver;

            if ( ( context == null ) || ( ( resolver = context.getClassResolver() ) == null ) )
            {
                resolver = OgnlContext.DEFAULT_CLASS_RESOLVER;
```

### NestedAssignment
Result of assignment expression used
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
            throw new OgnlException( "source is null for getProperty(null, \"" + name + "\")" );
        }
        if ( ( accessor = getPropertyAccessor( getTargetClass( source ) ) ) == null )
        {
            throw new OgnlException( "No property accessor for " + getTargetClass( source ).getName() );
```

## RuleId[id=NonProtectedConstructorInAbstractClass]
### NonProtectedConstructorInAbstractClass
Constructor `ComparisonExpression()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/ComparisonExpression.java`
#### Snippet
```java
    private static final long serialVersionUID = -5945855000509930682L;

    public ComparisonExpression( int id )
    {
        super( id );
```

### NonProtectedConstructorInAbstractClass
Constructor `ComparisonExpression()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/ComparisonExpression.java`
#### Snippet
```java
    }

    public ComparisonExpression( OgnlParser p, int id )
    {
        super( p, id );
```

### NonProtectedConstructorInAbstractClass
Constructor `ExpressionNode()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/ExpressionNode.java`
#### Snippet
```java
    }

    public ExpressionNode( OgnlParser p, int i )
    {
        super( p, i );
```

### NonProtectedConstructorInAbstractClass
Constructor `ExpressionNode()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/ExpressionNode.java`
#### Snippet
```java
    private static final long serialVersionUID = 9076228016268317598L;

    public ExpressionNode( int i )
    {
        super( i );
```

### NonProtectedConstructorInAbstractClass
Constructor `NumericExpression()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/NumericExpression.java`
#### Snippet
```java
    }

    public NumericExpression( OgnlParser p, int id )
    {
        super( p, id );
```

### NonProtectedConstructorInAbstractClass
Constructor `NumericExpression()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/NumericExpression.java`
#### Snippet
```java
    protected Class<?> getterClass;

    public NumericExpression( int id )
    {
        super( id );
```

### NonProtectedConstructorInAbstractClass
Constructor `SimpleNode()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/SimpleNode.java`
#### Snippet
```java
    private ExpressionAccessor accessor;

    public SimpleNode( int i )
    {
        id = i;
```

### NonProtectedConstructorInAbstractClass
Constructor `SimpleNode()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/SimpleNode.java`
#### Snippet
```java
    }

    public SimpleNode( OgnlParser p, int i )
    {
        this( i );
```

### NonProtectedConstructorInAbstractClass
Constructor `BooleanExpression()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/BooleanExpression.java`
#### Snippet
```java
    }

    public BooleanExpression( OgnlParser p, int id )
    {
        super( p, id );
```

### NonProtectedConstructorInAbstractClass
Constructor `BooleanExpression()` of an abstract class should not be declared 'public'
in `src/main/java/org/apache/commons/ognl/BooleanExpression.java`
#### Snippet
```java
    protected Class<?> getterClass;

    public BooleanExpression( int id )
    {
        super( id );
```

## RuleId[id=EmptyMethod]
### EmptyMethod
All implementations of this method are empty
in `src/main/java/org/apache/commons/ognl/Node.java`
#### Snippet
```java
     * added to it.
     */
    void jjtOpen();

    /**
```

## RuleId[id=RedundantFieldInitialization]
### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/ognl/internal/ClassCacheImpl.java`
#### Snippet
```java
    private ClassCacheInspector classInspector;

    private int size = 0;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/ognl/ArrayElementsAccessor.java`
#### Snippet
```java
            private final int count = Array.getLength( target );

            private int index = 0;

            public boolean hasMoreElements()
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/ognl/ObjectElementsAccessor.java`
#### Snippet
```java
        return new Enumeration<Object>()
        {
            private boolean seen = false;

            public boolean hasMoreElements()
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/ognl/NumberElementsAccessor.java`
#### Snippet
```java
            private final int type = OgnlOps.getNumericType( target );

            private long next = 0;

            private final long finish = OgnlOps.longValue( target );
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
    implements MemberAccess
{
    private boolean allowPrivateAccess = false;

    private boolean allowProtectedAccess = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
    private boolean allowPrivateAccess = false;

    private boolean allowProtectedAccess = false;

    private boolean allowPackageProtectedAccess = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
    private boolean allowProtectedAccess = false;

    private boolean allowPackageProtectedAccess = false;

    /*
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
    implements NodeType
{
    private boolean indexedAccess = false;

    private Class getterClass;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    private static final String PROPERTY_KEY_PREFIX = "ognl";

    private static boolean defaultTraceEvaluations = false;

    private static boolean defaultKeepLastEvaluation = false;
```

### RedundantFieldInitialization
Field initialization to `false` is redundant
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    private static boolean defaultTraceEvaluations = false;

    private static boolean defaultKeepLastEvaluation = false;

    public static final DefaultClassResolver DEFAULT_CLASS_RESOLVER = new DefaultClassResolver();
```

### RedundantFieldInitialization
Field initialization to `null` is redundant
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    private int localReferenceCounter = 0;

    private Map<String, LocalReference> localReferenceMap = null;

    /**
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
    private final Stack<Class<?>> accessorStack = new Stack<Class<?>>();

    private int localReferenceCounter = 0;

    private Map<String, LocalReference> localReferenceMap = null;
```

### RedundantFieldInitialization
Field initialization to `0` is redundant
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
    protected ClassPool pool;

    protected int classCounter = 0;

    /**
```

## RuleId[id=AssignmentToMethodParameter]
### AssignmentToMethodParameter
Assignment to method parameter `parmString`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
        if ( parm.isArray() )
        {
            parmString = compiler.createLocalReference( context, "(" + ExpressionCompiler.getCastString( parm )
                + ")org.apache.commons.ognl.OgnlOps#toArray(" + parmString + ", " + parm.getComponentType().getName()
                + endParam, parm );
```

### AssignmentToMethodParameter
Assignment to method parameter `parmString`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
            Class wrapClass = OgnlRuntime.getPrimitiveWrapperClass( parm );

            parmString = compiler.createLocalReference( context, "((" + wrapClass.getName()
                + ")org.apache.commons.ognl.OgnlOps#convertValue(" + parmString + "," + wrapClass.getName()
                + ".class, true))." + OgnlRuntime.getNumericValueGetter( wrapClass ), parm );
```

### AssignmentToMethodParameter
Assignment to method parameter `parmString`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
        else if ( parm != Object.class )
        {
            parmString = compiler.createLocalReference( context, "(" + parm.getName()
                + ")org.apache.commons.ognl.OgnlOps#convertValue(" + parmString + "," + parm.getName() + ".class)",
                                                        parm );
```

### AssignmentToMethodParameter
Assignment to method parameter `parmString`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
            && valueClass.isPrimitive() ) )
        {
            parmString = " ($w) " + parmString;
        }
        else if ( valueClass != null && valueClass.isPrimitive() )
```

### AssignmentToMethodParameter
Assignment to method parameter `parmString`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
        else if ( valueClass != null && valueClass.isPrimitive() )
        {
            parmString = "($w) " + parmString;
        }
        return parmString;
```

### AssignmentToMethodParameter
Assignment to method parameter `indexStr`
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
        if ( !currentType.isPrimitive() && Number.class.isAssignableFrom( currentType ) )
        {
            indexStr += "." + OgnlRuntime.getNumericValueGetter( currentType );
        }
        else if ( currentObject != null && Number.class.isAssignableFrom( currentObject.getClass() )
```

### AssignmentToMethodParameter
Assignment to method parameter `indexStr`
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
            String toString = index instanceof String && currentType != Object.class ? "" : ".toString()";

            indexStr = "org.apache.commons.ognl.OgnlOps#getIntValue(" + indexStr + toString + ")";
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/ognl/ASTEval.java`
#### Snippet
```java
        Node node;

        target = children[1].getValue( context, target );
        node = ( expr instanceof Node ) ? (Node) expr : (Node) Ognl.parseExpression( expr.toString() );
        try
```

### AssignmentToMethodParameter
Assignment to method parameter `source`
in `src/main/java/org/apache/commons/ognl/ASTEval.java`
#### Snippet
```java
        Node node;

        source = children[1].getValue( context, source );
        node = ( expr instanceof Node ) ? (Node) expr : (Node) Ognl.parseExpression( expr.toString() );
        try
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
            String name = ( (ASTConst) child ).getValue().toString();

            target = getTarget( context, target, name );

            PropertyDescriptor pd = OgnlRuntime.getPropertyDescriptor( context.getCurrentObject().getClass(), name );
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
            // context.getCurrentObject().getClass().getName());

            target = getTarget( context, target, name );

            PropertyDescriptor pd = OgnlRuntime.getPropertyDescriptor(
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
            try
            {
                target = getValue( context, context.getCurrentObject() );
            }
            catch ( NoSuchPropertyException e )
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
                try
                {
                    target = getValue( context, context.getRoot() );
                }
                catch ( NoSuchPropertyException ex )
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        try
        {
            name = name.replace( "\"", "" );

            BeanInfo info = Introspector.getBeanInfo( target );
```

### AssignmentToMethodParameter
Assignment to method parameter `value`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
                {
                    if ( isTypeCompatible( value, field.getType() ) || (
                        ( value = getConvertedType( context, target, field, propertyName, value, field.getType() ) ) != null ) )
                    {
                        field.set( target, value );
```

### AssignmentToMethodParameter
Assignment to method parameter `object`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
                String className = getClassName( interfaceClass, fullyQualified );
                stringBuilder.append( className ).append( '^' );
                object = Proxy.getInvocationHandler( object );
            }
            String className = getClassName( object, fullyQualified );
```

### AssignmentToMethodParameter
Assignment to method parameter `name`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        try
        {
            name = name.replace( "\"", "" ).toLowerCase();

            BeanInfo info = Introspector.getBeanInfo( target );
```

### AssignmentToMethodParameter
Assignment to method parameter `object`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        if ( !( object instanceof Class ) )
        {
            object = object.getClass();
        }

```

### AssignmentToMethodParameter
Assignment to method parameter `num`
in `src/main/java/org/apache/commons/ognl/JJTOgnlParserState.java`
#### Snippet
```java
    {
        currentMark = marks.remove( marks.size() - 1 );
        while ( num-- > 0 )
        {
            Node poppedNode = popNode();
```

### AssignmentToMethodParameter
Assignment to method parameter `relativeIndex`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        {
            result = currentEvaluation;
            while ( ( ++relativeIndex < 0 ) && ( result != null ) )
            {
                result = result.getParent();
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
                        else if ( !handled )
                        {
                            target =
                                OgnlRuntime.getIndexedProperty(
                                    context,
```

### AssignmentToMethodParameter
Assignment to method parameter `target`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
            if ( !handled )
            {
                target = children[i].getValue( context, target );
            }
        }
```

### AssignmentToMethodParameter
Assignment to method parameter `t1`
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
        if ( t1 == NONNUMERIC )
        {
            t1 = DOUBLE; // Try to interpret strings as doubles...
        }
        if ( t2 == NONNUMERIC )
```

### AssignmentToMethodParameter
Assignment to method parameter `t2`
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
        if ( t2 == NONNUMERIC )
        {
            t2 = DOUBLE; // Try to interpret strings as doubles...
        }

```

## RuleId[id=SynchronizationOnLocalVariableOrMethodParameter]
### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `handlers`
in `src/main/java/org/apache/commons/ognl/internal/ClassCacheHandler.java`
#### Snippet
```java
        T answer;

        synchronized ( handlers )
        {
            answer = handlers.get( forClass );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `s`
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
    public void printStackTrace( java.io.PrintWriter s )
    {
        synchronized ( s )
        {
            super.printStackTrace( s );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `s`
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
    public void printStackTrace( java.io.PrintStream s )
    {
        synchronized ( s )
        {
            super.printStackTrace( s );
```

### SynchronizationOnLocalVariableOrMethodParameter
Synchronization on method parameter `method`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        {
            // only synchronize method invocation if it actually requires it
            synchronized ( method )
            {

```

## RuleId[id=RedundantImplements]
### RedundantImplements
Redundant interface declaration `PropertyAccessor`
in `src/main/java/org/apache/commons/ognl/SetPropertyAccessor.java`
#### Snippet
```java
public class SetPropertyAccessor
    extends ObjectPropertyAccessor
    implements PropertyAccessor // This is here to make javadoc show this class as an implementor
{

```

### RedundantImplements
Redundant interface declaration `PropertyAccessor`
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
public class ListPropertyAccessor
    extends ObjectPropertyAccessor
    implements PropertyAccessor
{

```

### RedundantImplements
Redundant interface declaration `PropertyAccessor`
in `src/main/java/org/apache/commons/ognl/EnumerationPropertyAccessor.java`
#### Snippet
```java
public class EnumerationPropertyAccessor
    extends ObjectPropertyAccessor
    implements PropertyAccessor // This is here to make javadoc show this class as an implementor
{
    @Override
```

### RedundantImplements
Redundant interface declaration `PropertyAccessor`
in `src/main/java/org/apache/commons/ognl/IteratorPropertyAccessor.java`
#### Snippet
```java
public class IteratorPropertyAccessor
    extends ObjectPropertyAccessor
    implements PropertyAccessor // This is here to make javadoc show this class as an implementor
{
    @Override
```

### RedundantImplements
Redundant interface declaration `PropertyAccessor`
in `src/main/java/org/apache/commons/ognl/ArrayPropertyAccessor.java`
#### Snippet
```java
public class ArrayPropertyAccessor
    extends ObjectPropertyAccessor
    implements PropertyAccessor
{

```

## RuleId[id=ReturnNull]
### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTKeyValue.java`
#### Snippet
```java
        throws OgnlException
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTKeyValue.java`
#### Snippet
```java
    protected Node getValue()
    {
        return ( jjtGetNumChildren() > 1 ) ? children[1] : null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/internal/ClassCacheImpl.java`
#### Snippet
```java
            entry = entry.getNext();
        }
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTOr.java`
#### Snippet
```java
    public Class getGetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTSequence.java`
#### Snippet
```java
    public Class getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/NumericExpression.java`
#### Snippet
```java
    public Class<?> getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTAnd.java`
#### Snippet
```java
    public Class getGetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
            {
                case DynamicSubscript.FIRST:
                    return len > 0 ? list.get( 0 ) : null;
                case DynamicSubscript.MID:
                    return len > 0 ? list.get( len / 2 ) : null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
                    return len > 0 ? list.get( 0 ) : null;
                case DynamicSubscript.MID:
                    return len > 0 ? list.get( len / 2 ) : null;
                case DynamicSubscript.LAST:
                    return len > 0 ? list.get( len - 1 ) : null;
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ListPropertyAccessor.java`
#### Snippet
```java
                    return len > 0 ? list.get( len / 2 ) : null;
                case DynamicSubscript.LAST:
                    return len > 0 ? list.get( len - 1 ) : null;
                case DynamicSubscript.ALL:
                    return new ArrayList<Object>( list );
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTIn.java`
#### Snippet
```java
    public Class getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
    public Class getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTVarRef.java`
#### Snippet
```java
    public Class getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/internal/entry/GenericMethodParameterTypeFactory.java`
#### Snippet
```java
        if ( param.getActualTypeArguments().length < 1 )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/internal/entry/GenericMethodParameterTypeFactory.java`
#### Snippet
```java
        }

        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
    public Class getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
    public Class getGetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        if ( arg == null )
        {
            return null;
        }
        Class<?> clazz = arg.getClass();
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        int index = className.lastIndexOf( '.' );

        return ( index < 0 ) ? null : className.substring( 0, index );
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        if ( methods == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
    public static String getPackageName( Object object )
    {
        return ( object == null ) ? null : getClassPackageName( object.getClass() );
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
    public static String getBaseName( Object o )
    {
        return ( o == null ) ? null : getClassBaseName( o.getClass() );
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        if ( targetClass == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
    public static Class<?> getTargetClass( Object o )
    {
        return ( o == null ) ? null : ( ( o instanceof Class ) ? (Class<?>) o : o.getClass() );
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTInstanceof.java`
#### Snippet
```java
    public Class getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ObjectNullHandler.java`
#### Snippet
```java
    public Object nullMethodResult( Map<String, Object> context, Object target, String methodName, Object[] args )
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ObjectNullHandler.java`
#### Snippet
```java
    public Object nullPropertyValue( Map<String, Object> context, Object target, Object property )
    {
        return null;
    }
}
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
                    catch ( NoSuchFieldException e )
                    {
                        return null;
                    }
                }
```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
                }

                return null;
            }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        if ( accessorStack.isEmpty() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        if ( accessorStack.isEmpty() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        if ( typeStack.isEmpty() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        if ( typeStack.isEmpty() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        if ( accessorStack.isEmpty() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java
        if ( typeStack.isEmpty() )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/ASTNotIn.java`
#### Snippet
```java
    public Class getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/BooleanExpression.java`
#### Snippet
```java
    public Class<?> getSetterClass()
    {
        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
        }

        return null;
    }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
        if ( context.getRoot() == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
        if ( type == null )
        {
            return null;
        }

```

### ReturnNull
Return of `null`
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
        if ( value == null )
        {
            return null;
        }

```

## RuleId[id=HtmlWrongAttributeValue]
### HtmlWrongAttributeValue
Wrong attribute value
in `log/indexing-diagnostic/project.15375f63/diagnostic-2023-03-10-00-01-43.138.html`
#### Snippet
```java
              <td>0</td>
              <td>0</td>
              <td><textarea rows="10" cols="75" readonly="true" placeholder="empty" style="white-space: pre; border: none">Not collected for refresh</textarea></td>
            </tr>
          </tbody>
```

## RuleId[id=ZeroLengthArrayInitialization]
### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
                        else
                        {
                            varArgs = new Object[0];
                        }

```

### ZeroLengthArrayInitialization
Allocation of zero length array
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        else
        {
            parms = new Class[0];
        }

```

## RuleId[id=NonFinalFieldOfException]
### NonFinalFieldOfException
Non-final field `initCause` of exception class
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
    private static final long serialVersionUID = -842845048743721078L;

    static Method initCause;
    static
    {
```

### NonFinalFieldOfException
Non-final field `evaluation` of exception class
in `src/main/java/org/apache/commons/ognl/OgnlException.java`
#### Snippet
```java
     * The root evaluation of the expression when the exception was thrown
     */
    private Evaluation evaluation;

    /**
```

### NonFinalFieldOfException
Non-final field `target` of exception class
in `src/main/java/org/apache/commons/ognl/NoSuchPropertyException.java`
#### Snippet
```java
    private static final long serialVersionUID = 2228428181127177178L;

    private Object target;

    private Object name;
```

### NonFinalFieldOfException
Non-final field `name` of exception class
in `src/main/java/org/apache/commons/ognl/NoSuchPropertyException.java`
#### Snippet
```java
    private Object target;

    private Object name;

    public NoSuchPropertyException( Object target, Object name )
```

## RuleId[id=EqualsWhichDoesntCheckParameterClass]
### EqualsWhichDoesntCheckParameterClass
`equals()` should check the class of its parameter
in `src/main/java/org/apache/commons/ognl/OgnlContext.java`
#### Snippet
```java

    @Override
    public boolean equals( Object o )
    {
        return values.equals( o );
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `clazz` initializer `null` is redundant
in `src/main/java/org/apache/commons/ognl/ASTCtor.java`
#### Snippet
```java
        StringBuilder result = new StringBuilder("new " + className);

        Class clazz = null;
        Object ctorValue = null;
        try
```

### UnusedAssignment
Variable `ctorValue` initializer `null` is redundant
in `src/main/java/org/apache/commons/ognl/ASTCtor.java`
#### Snippet
```java

        Class clazz = null;
        Object ctorValue = null;
        try
        {
```

### UnusedAssignment
Variable `retval` initializer `value` is redundant
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
        getterClass = value.getClass();

        Object retval = value;
        if ( parent != null && parent instanceof ASTProperty)
        {
```

### UnusedAssignment
Variable `allowPrivateAccess` initializer `false` is redundant
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
    implements MemberAccess
{
    private boolean allowPrivateAccess = false;

    private boolean allowProtectedAccess = false;
```

### UnusedAssignment
Variable `allowProtectedAccess` initializer `false` is redundant
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
    private boolean allowPrivateAccess = false;

    private boolean allowProtectedAccess = false;

    private boolean allowPackageProtectedAccess = false;
```

### UnusedAssignment
Variable `allowPackageProtectedAccess` initializer `false` is redundant
in `src/main/java/org/apache/commons/ognl/DefaultMemberAccess.java`
#### Snippet
```java
    private boolean allowProtectedAccess = false;

    private boolean allowPackageProtectedAccess = false;

    /*
```

### UnusedAssignment
Variable `result` initializer `""` is redundant
in `src/main/java/org/apache/commons/ognl/ASTUnsignedShiftRight.java`
#### Snippet
```java
    public String toGetSourceString( OgnlContext context, Object target )
    {
        String result = "";

        try
```

### UnusedAssignment
Variable `cause` initializer `null` is redundant
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        throws MethodFailedException
    {
        Throwable cause = null;
        Object[] actualArgs = new Object[args.length];

```

### UnusedAssignment
Variable `cause` initializer `null` is redundant
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        throws OgnlException
    {
        Throwable cause = null;
        Object[] actualArgs = args;

```

### UnusedAssignment
Variable `ret` initializer `""` is redundant
in `src/main/java/org/apache/commons/ognl/ASTInstanceof.java`
#### Snippet
```java
        {

            String ret = "";

            if (children[0] instanceof ASTConst)
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `table == null` is always `false`
in `src/main/java/org/apache/commons/ognl/internal/ClassCacheImpl.java`
#### Snippet
```java
    public String toString()
    {
        return "ClassCacheImpl[" + "_table=" + ( table == null ? null : Arrays.asList( table ) ) + '\n'
            + ", _classInspector=" + classInspector + '\n' + ", _size=" + size + '\n' + ']';
    }
```

### ConstantValue
Condition `valueClass != null && valueClass.isPrimitive()` is always `false`
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
            parmString = " ($w) " + parmString;
        }
        else if ( valueClass != null && valueClass.isPrimitive() )
        {
            parmString = "($w) " + parmString;
```

### ConstantValue
Condition `valueClass.isPrimitive()` is always `false` when reached
in `src/main/java/org/apache/commons/ognl/ASTMethodUtil.java`
#### Snippet
```java
            parmString = " ($w) " + parmString;
        }
        else if ( valueClass != null && valueClass.isPrimitive() )
        {
            parmString = "($w) " + parmString;
```

### ConstantValue
Condition `valueClass.isPrimitive()` is always `false`
in `src/main/java/org/apache/commons/ognl/ASTStaticMethod.java`
#### Snippet
```java
                            parmString = " ($w) " + parmString;
                        }
                        else if ( valueClass.isPrimitive() )
                        {
                            parmString = "($w) " + parmString;
```

### ConstantValue
Condition `m != null` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTStaticMethod.java`
#### Snippet
```java
            }

            if ( m != null )
            {
                getterClass = m.getReturnType();
```

### ConstantValue
Condition `value != null` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
            return value.toString();
        }
        if ( value != null && Number.class.isAssignableFrom( value.getClass() ) )
        {
            context.setCurrentType( OgnlRuntime.getPrimitiveWrapperClass( value.getClass() ) );
```

### ConstantValue
Condition `value != null` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTConst.java`
#### Snippet
```java
        }
        if ( !( parent != null
                        && value != null
                        && NumericExpression.class.isAssignableFrom( parent.getClass() ) )
            && String.class.isAssignableFrom( value.getClass() ) )
```

### ConstantValue
Condition `value != null` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
                {

                    Class valueClass = value != null ? value.getClass() : null;
                    if ( NodeType.class.isAssignableFrom( children[i].getClass() ) )
                    {
```

### ConstantValue
Condition `ctorClass.isPrimitive()` is always `false`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java

                    }
                    else if ( ctorClass.isPrimitive() )
                    {

```

### ConstantValue
Condition `valueClass.isPrimitive()` is always `false`
in `src/main/java/org/apache/commons/ognl/ASTList.java`
#### Snippet
```java
                        value = " ($w) (" + value + ")";
                    }
                    else if ( valueClass.isPrimitive() )
                    {
                        value = "($w) (" + value + ")";
```

### ConstantValue
Condition `child instanceof ASTConst` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
                        String srcString = child.toGetSourceString( context, context.getRoot() );

                        if ( child instanceof ASTConst && context.getCurrentObject() instanceof String)
                        {
                            srcString = "\"" + srcString + "\"";
```

### ConstantValue
Condition `child instanceof ASTConst` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTProperty.java`
#### Snippet
```java
                        String srcString = child.toGetSourceString( context, context.getRoot() );

                        if ( child instanceof ASTConst && context.getCurrentObject() instanceof String)
                        {
                            srcString = "\"" + srcString + "\"";
```

### ConstantValue
Condition `numParameterTypes != mpc` is always `false`
in `src/main/java/org/apache/commons/ognl/internal/entry/PropertyDescriptorCacheEntryFactory.java`
#### Snippet
```java
                    int mpc = parameterTypes.length;

                    if ( numParameterTypes != mpc )
                    {
                        result = false;
```

### ConstantValue
Condition `methods != null` is always `true`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        List<Method> methods = getDeclaredMethods( targetClass, propertyName, true /* find 'set' methods */ );

        if ( methods != null )
        {
            for ( Method method : methods )
```

### ConstantValue
Condition `method.getDeclaringClass().getTypeParameters() == null` is always `false`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        throws CacheException
    {
        if ( type == null || type.getGenericSuperclass() == null || !(type.getGenericSuperclass() instanceof ParameterizedType) || method.getDeclaringClass().getTypeParameters() == null )
        {
            return getParameterTypes( method );
```

### ConstantValue
Condition `methods != null` is always `true`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        List<Method> methods = getDeclaredMethods( targetClass, propertyName, false /* find 'get' methods */ );

        if ( methods != null )
        {
            for ( Method method : methods )
```

### ConstantValue
Condition `previousType.isPrimitive()` is always `true`
in `src/main/java/org/apache/commons/ognl/OgnlRuntime.java`
#### Snippet
```java
        Class<?> previousType = context.getPreviousType();
        return currentType == null || previousType == null
            || !( currentType == previousType && currentType.isPrimitive() && previousType.isPrimitive() )
            && !currentType.isArray() && !previousType.isArray();
    }
```

### ConstantValue
Condition `!varArgs` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTMethod.java`
#### Snippet
```java
                    Class valueClass = ASTMethodUtil.getValueClass( context, root, child );

                    if ( ( !varArgs || varArgs && ( i + 1 ) < parms.length ) && valueClass != parms[i] )
                    {
                        parmString = ASTMethodUtil.getParmString( context, parms[i], parmString, child, valueClass,
```

### ConstantValue
Condition `!varArgs || varArgs && ( i + 1 ) < parms.length` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTMethod.java`
#### Snippet
```java
                    Class valueClass = ASTMethodUtil.getValueClass( context, root, child );

                    if ( ( !varArgs || varArgs && ( i + 1 ) < parms.length ) && valueClass != parms[i] )
                    {
                        parmString = ASTMethodUtil.getParmString( context, parms[i], parmString, child, valueClass,
```

### ConstantValue
Value `varArgs` is always 'false'
in `src/main/java/org/apache/commons/ognl/ASTMethod.java`
#### Snippet
```java
                    Class valueClass = ASTMethodUtil.getValueClass( context, root, child );

                    if ( ( !varArgs || varArgs && ( i + 1 ) < parms.length ) && valueClass != parms[i] )
                    {
                        parmString = ASTMethodUtil.getParmString( context, parms[i], parmString, child, valueClass,
```

### ConstantValue
Condition `f != null` is always `true`
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
                    {
                        Field f = target.getClass().getField( key );
                        if ( f != null )
                        {

```

### ConstantValue
Condition `m.getParameterTypes() == null` is always `false`
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
            }

            if ( m == null || m.getParameterTypes() == null || m.getParameterTypes().length <= 0 )
            {
                throw new UnsupportedCompilationException( "Unable to determine setting expression on "
```

### ConstantValue
Condition `f != null` is always `true`
in `src/main/java/org/apache/commons/ognl/ObjectPropertyAccessor.java`
#### Snippet
```java
                        Field f = target.getClass().getField( methodName );

                        if ( f != null )
                        {
                            context.setCurrentType( f.getType() );
```

### ConstantValue
Condition `methods == null` is always `false`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
        Method[] methods = clazz.getMethods();

        if ( methods == null )
        {
            return false;
```

### ConstantValue
Condition `parms == null` is always `false`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            {
                Class<?>[] parms = m.getParameterTypes();
                if ( parms == null )
                {
                    continue;
```

### ConstantValue
Condition `mparms == null` is always `false`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

                Class<?>[] mparms = method.getParameterTypes();
                if ( mparms == null || mparms.length != parms.length )
                {
                    continue;
```

### ConstantValue
Condition `exceptions == null` is always `false`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

                Class<?>[] exceptions = m.getExceptionTypes();
                if ( exceptions == null )
                {
                    continue;
```

### ConstantValue
Condition `mexceptions == null` is always `false`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java

                Class<?>[] mexceptions = method.getExceptionTypes();
                if ( mexceptions == null || mexceptions.length != exceptions.length )
                {
                    continue;
```

### ConstantValue
Condition `clazz.getInterfaces() != null` is always `true`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
    public Class<?> getSuperOrInterfaceClass( Method m, Class<?> clazz )
    {
        if ( clazz.getInterfaces() != null && clazz.getInterfaces().length > 0 )
        {
            Class<?>[] intfs = clazz.getInterfaces();
```

### ConstantValue
Condition `!(expression instanceof ASTStaticMethod)` is always `true`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            && !(expression instanceof ASTStaticMethod) && !(expression instanceof ASTStaticField)
            && !(expression instanceof ASTConst) && !(expression instanceof ExpressionNode)
            && !(expression instanceof ASTCtor) && !(expression instanceof ASTStaticMethod)
            && root != null ) || ( root != null && expression instanceof ASTRootVarRef) )
        {
```

### ConstantValue
Condition `expression instanceof ASTStaticMethod` is always `false`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            && !(expression instanceof ASTStaticMethod) && !(expression instanceof ASTStaticField)
            && !(expression instanceof ASTConst) && !(expression instanceof ExpressionNode)
            && !(expression instanceof ASTCtor) && !(expression instanceof ASTStaticMethod)
            && root != null ) || ( root != null && expression instanceof ASTRootVarRef) )
        {
```

### ConstantValue
Condition `expression instanceof ASTThisVarRef` is always `false`
in `src/main/java/org/apache/commons/ognl/enhance/ExpressionCompiler.java`
#### Snippet
```java
            Class<?> castClass = OgnlRuntime.getCompiler( context ).getRootExpressionClass( expression, context );

            if ( castClass.isArray() || expression instanceof ASTRootVarRef || expression instanceof ASTThisVarRef)
            {
                rootExpr = "((" + getCastString( castClass ) + ")$2)";
```

### ConstantValue
Value `prevChain` is always 'null'
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java

        context.put( "_lastChild", prevChild );
        context.put( "_currentChain", prevChain );

        if ( lastType != null )
```

### ConstantValue
Condition `i <= ilast` is always `true`
in `src/main/java/org/apache/commons/ognl/ASTChain.java`
#### Snippet
```java
        for ( int i = 0, ilast = children.length - 2; i <= ilast; ++i )
        {
            if ( (i <= ilast) && (children[i] instanceof ASTProperty) )
            {
                ASTProperty propertyNode = (ASTProperty) children[i];
```

### ConstantValue
Condition `result == null` is always `false`
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
        }

        if ( result == null && preventNulls )
        {
            return value;
```

### ConstantValue
Condition `result == null && preventNulls` is always `false`
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
        }

        if ( result == null && preventNulls )
        {
            return value;
```

### ConstantValue
Condition `!toTypeIsArray` is always `true` when reached
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                }
            }
            else if ( classIsArray && !toTypeIsArray)
            {

```

### ConstantValue
Value `toTypeIsArray` is always 'false'
in `src/main/java/org/apache/commons/ognl/OgnlOps.java`
#### Snippet
```java
                }
            }
            else if ( classIsArray && !toTypeIsArray)
            {

```

## RuleId[id=OverwrittenKey]
### OverwrittenKey
Duplicate Map key
in `src/main/java/org/apache/commons/ognl/NumericLiterals.java`
#### Snippet
```java
        map.put( Long.class, "l" );
        map.put( Long.TYPE, "l" );
        map.put( BigInteger.class, "d" );
        map.put( Float.class, "f" );
        map.put( Float.TYPE, "f" );
```

### OverwrittenKey
Duplicate Map key
in `src/main/java/org/apache/commons/ognl/NumericLiterals.java`
#### Snippet
```java
        map.put( Double.class, "d" );
        map.put( Double.TYPE, "d" );
        map.put( BigInteger.class, "d" );
        map.put( BigDecimal.class, "d" );
    }
```

